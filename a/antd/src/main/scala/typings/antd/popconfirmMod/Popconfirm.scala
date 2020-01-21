package typings.antd.popconfirmMod

import typings.antd.contextMod.ConfigConsumerProps
import typings.react.mod.Component
import typings.react.mod.NativeMouseEvent
import typings.react.mod._Global_.JSX.Element
import typings.std.HTMLButtonElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Popconfirm
  extends Component[PopconfirmProps, PopconfirmState, js.Any] {
  var tooltip: js.Any = js.native
  def getPopupDomNode(): js.Any = js.native
  def onCancel(e: typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent]): Unit = js.native
  def onConfirm(e: typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent]): Unit = js.native
  def onVisibleChange(visible: Boolean): Unit = js.native
  def renderConfirm(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def renderOverlay(prefixCls: String, popconfirmLocale: PopconfirmLocale): Element = js.native
  def saveTooltip(node: js.Any): Unit = js.native
  def setVisible(visible: Boolean): Unit = js.native
  def setVisible(visible: Boolean, e: typings.react.mod.MouseEvent[HTMLButtonElement, NativeMouseEvent]): Unit = js.native
}

