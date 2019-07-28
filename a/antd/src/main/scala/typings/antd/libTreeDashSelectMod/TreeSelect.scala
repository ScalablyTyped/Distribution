package typings.antd.libTreeDashSelectMod

import typings.antd.libConfigDashProviderMod.ConfigConsumerProps
import typings.antd.libTreeDashSelectInterfaceMod.TreeNodeValue
import typings.antd.libTreeDashSelectInterfaceMod.TreeSelectProps
import typings.antd.libTreeTreeMod.AntTreeNodeProps
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

