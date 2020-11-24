package typings.antd.treeTreeMod

import typings.antd.directoryTreeMod.DirectoryTreeProps
import typings.rcTree.treeNodeMod.TreeNodeProps
import typings.react.mod.FC
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompoundedComponent
  extends ForwardRefExoticComponent[TreeProps with RefAttributes[typings.rcTree.mod.default]] {
  
  var DirectoryTree: ForwardRefExoticComponent[DirectoryTreeProps with RefAttributes[typings.rcTree.mod.default]] = js.native
  
  var TreeNode: FC[TreeNodeProps] = js.native
}
