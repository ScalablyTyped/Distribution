package typings.antd.mod

import typings.antd.anon.ChoiceTransitionName
import typings.antd.treeSelectMod.TreeSelectProps
import typings.antd.treeSelectMod.default
import typings.rcTreeSelect.treeNodeMod.TreeNodeProps
import typings.react.mod.FC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "TreeSelect")
@js.native
class TreeSelect[T] protected () extends default[T] {
  def this(props: TreeSelectProps[T]) = this()
}

/* static members */
@JSImport("antd", "TreeSelect")
@js.native
object TreeSelect extends js.Object {
  var SHOW_ALL: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SHOW_ALL */ js.Any = js.native
  var SHOW_CHILD: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SHOW_CHILD */ js.Any = js.native
  var SHOW_PARENT: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SHOW_PARENT */ js.Any = js.native
  var TreeNode: FC[TreeNodeProps] = js.native
  var defaultProps: ChoiceTransitionName = js.native
}

