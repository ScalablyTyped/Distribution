package typings.antd.esTreeDashSelectMod

import typings.antd.esConfigDashProviderMod.ConfigConsumerProps
import typings.antd.esTreeDashSelectInterfaceMod.TreeNodeValue
import typings.antd.esTreeDashSelectInterfaceMod.TreeSelectProps
import typings.antd.esTreeTreeMod.AntTreeNodeProps
import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSXNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

