package typings.antd

import typings.antd.esConfigDashProviderMod.ConfigConsumerProps
import typings.antd.esTreeDashSelectInterfaceMod.TreeNodeValue
import typings.antd.esTreeDashSelectInterfaceMod.TreeSelectProps
import typings.antd.esTreeDashSelectMod.TreeSelect
import typings.antd.esTreeTreeMod.AntTreeNodeProps
import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/es/tree-select", JSImport.Namespace)
@js.native
object esTreeDashSelectMod extends js.Object {
  @js.native
  trait TreeSelect[T /* <: TreeNodeValue */]
    extends Component[TreeSelectProps[T], js.Any, js.Any] {
    var rcTreeSelect: js.Any = js.native
    def blur(): Unit = js.native
    def focus(): Unit = js.native
    def renderSwitcherIcon(prefixCls: String, hasIsLeafLoading: AntTreeNodeProps): Element | Null = js.native
    def renderTreeSelect(hasGetPopupContainerGetPrefixClsRenderEmpty: ConfigConsumerProps): Element = js.native
    def saveTreeSelect(node: js.Any): Unit = js.native
  }
  
  @js.native
  class default[T /* <: TreeNodeValue */] protected () extends TreeSelect[T] {
    def this(props: TreeSelectProps[T]) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var SHOW_ALL: js.Any = js.native
    var SHOW_CHILD: js.Any = js.native
    var SHOW_PARENT: js.Any = js.native
    var TreeNode: js.Any = js.native
    var defaultProps: Anon_ChoiceTransitionNameTransitionName = js.native
  }
  
}

