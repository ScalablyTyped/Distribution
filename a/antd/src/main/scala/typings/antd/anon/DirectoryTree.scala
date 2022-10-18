package typings.antd.anon

import typings.antd.libTreeDirectoryTreeMod.DirectoryTreeCompoundedComponent
import typings.rcTree.esInterfaceMod.DataNode
import typings.rcTree.esTreeNodeMod.TreeNodeProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectoryTree extends StObject {
  
  var DirectoryTree: DirectoryTreeCompoundedComponent
  
  var TreeNode: FC[TreeNodeProps[DataNode]]
}
object DirectoryTree {
  
  inline def apply(DirectoryTree: DirectoryTreeCompoundedComponent, TreeNode: FC[TreeNodeProps[DataNode]]): DirectoryTree = {
    val __obj = js.Dynamic.literal(DirectoryTree = DirectoryTree.asInstanceOf[js.Any], TreeNode = TreeNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryTree]
  }
  
  extension [Self <: DirectoryTree](x: Self) {
    
    inline def setDirectoryTree(value: DirectoryTreeCompoundedComponent): Self = StObject.set(x, "DirectoryTree", value.asInstanceOf[js.Any])
    
    inline def setTreeNode(value: FC[TreeNodeProps[DataNode]]): Self = StObject.set(x, "TreeNode", value.asInstanceOf[js.Any])
  }
}
