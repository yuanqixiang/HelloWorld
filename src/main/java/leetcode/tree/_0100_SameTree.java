package leetcode.tree;

import leetcode.dataStructures.TreeNode;

public class _0100_SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q){
        if(p == null && q == null)
            return true;
        if(p != null && q != null){
            return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        return false;
    }
}
