package typings.antd.mod

import typings.antd.AnonChoiceTransitionNameTransitionName
import typings.antd.treeSelectInterfaceMod.TreeNodeValue
import typings.antd.treeSelectInterfaceMod.TreeSelectProps
import typings.antd.treeSelectMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "TreeSelect")
@js.native
class TreeSelect[T /* <: TreeNodeValue */] protected () extends default[T] {
  def this(props: TreeSelectProps[T]) = this()
}

/* static members */
@JSImport("antd", "TreeSelect")
@js.native
object TreeSelect extends js.Object {
  var SHOW_ALL: js.Any = js.native
  var SHOW_CHILD: js.Any = js.native
  var SHOW_PARENT: js.Any = js.native
  var TreeNode: js.Any = js.native
  var defaultProps: AnonChoiceTransitionNameTransitionName = js.native
}

