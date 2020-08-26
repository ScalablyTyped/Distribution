package typings.antd.treeTreeMod

import typings.antd.directoryTreeMod.DirectoryTreeProps
import typings.rcTree.treeNodeMod.TreeNodeProps
import typings.react.mod.FC
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompoundedComponent
  extends ForwardRefExoticComponent[TreeProps with RefAttributes[typings.rcTree.mod.default]] {
  var DirectoryTree: FC[DirectoryTreeProps] = js.native
  var TreeNode: FC[TreeNodeProps] = js.native
}

