package typings.antd.anon

import typings.antd.directoryTreeMod.DirectoryTreeCompoundedComponent
import typings.rcTree.interfaceMod.DataNode
import typings.rcTree.treeNodeMod.TreeNodeProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectoryTree extends StObject {
  
  var DirectoryTree: DirectoryTreeCompoundedComponent
  
  var TreeNode: FC[TreeNodeProps[DataNode]]
  
  var defaultProps: PartialPropsWithChildrenT
}
object DirectoryTree {
  
  inline def apply(
    DirectoryTree: DirectoryTreeCompoundedComponent,
    TreeNode: FC[TreeNodeProps[DataNode]],
    defaultProps: PartialPropsWithChildrenT
  ): DirectoryTree = {
    val __obj = js.Dynamic.literal(DirectoryTree = DirectoryTree.asInstanceOf[js.Any], TreeNode = TreeNode.asInstanceOf[js.Any], defaultProps = defaultProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryTree]
  }
  
  extension [Self <: DirectoryTree](x: Self) {
    
    inline def setDefaultProps(value: PartialPropsWithChildrenT): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDirectoryTree(value: DirectoryTreeCompoundedComponent): Self = StObject.set(x, "DirectoryTree", value.asInstanceOf[js.Any])
    
    inline def setTreeNode(value: FC[TreeNodeProps[DataNode]]): Self = StObject.set(x, "TreeNode", value.asInstanceOf[js.Any])
  }
}
