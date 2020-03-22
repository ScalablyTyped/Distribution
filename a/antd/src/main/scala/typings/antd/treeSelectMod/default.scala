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
  var SHOW_ALL: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SHOW_ALL */ js.Any = js.native
  var SHOW_CHILD: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SHOW_CHILD */ js.Any = js.native
  var SHOW_PARENT: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SHOW_PARENT */ js.Any = js.native
  var TreeNode: FC[TreeNodeProps] = js.native
  var defaultProps: AnonChoiceTransitionName = js.native
}

