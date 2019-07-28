package typings.antd.esPopconfirmMod

import typings.antd.esConfigDashProviderMod.ConfigConsumerProps
import typings.react.NativeMouseEvent
import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSXNs.Element
import typings.react.reactMod.MouseEvent
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Popconfirm
  extends Component[PopconfirmProps, PopconfirmState, js.Any] {
  var tooltip: js.Any = js.native
  def getPopupDomNode(): js.Any = js.native
  def onCancel(e: MouseEvent[HTMLButtonElement, typings.std.MouseEvent]): Unit = js.native
  def onConfirm(e: MouseEvent[HTMLButtonElement, typings.std.MouseEvent]): Unit = js.native
  def onVisibleChange(visible: Boolean): Unit = js.native
  def renderConfirm(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def renderOverlay(prefixCls: String, popconfirmLocale: PopconfirmLocale): Element = js.native
  def saveTooltip(node: js.Any): Unit = js.native
  def setVisible(visible: Boolean): Unit = js.native
  def setVisible(visible: Boolean, e: MouseEvent[HTMLButtonElement, NativeMouseEvent]): Unit = js.native
}

