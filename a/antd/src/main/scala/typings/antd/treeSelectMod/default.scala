package typings.antd.treeSelectMod

import typings.antd.AnonChoiceTransitionName
import typings.rcTreeSelect.treeNodeMod.TreeNodeProps
import typings.react.mod.FC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/tree-select", JSImport.Default)
@js.native
class default[T] protected () extends TreeSelect[T] {
  def this(props: TreeSelectProps[T]) = this()
}

/* static members */
@JSImport("antd/lib/tree-select", JSImport.Default)
@js.native
object default extends js.Object {
  var SHOW_ALL: String = js.native
  var SHOW_CHILD: String = js.native
  var SHOW_PARENT: String = js.native
  var TreeNode: FC[TreeNodeProps] = js.native
  var defaultProps: AnonChoiceTransitionName = js.native
}

