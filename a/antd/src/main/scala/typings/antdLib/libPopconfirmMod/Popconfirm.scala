package typings
package antdLib.libPopconfirmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Popconfirm
  extends reactLib.reactMod.Component[PopconfirmProps, PopconfirmState, js.Any] {
  var tooltip: js.Any = js.native
  def getPopupDomNode(): js.Any = js.native
  def onCancel(e: reactLib.reactMod.MouseEvent[stdLib.HTMLButtonElement, stdLib.MouseEvent]): scala.Unit = js.native
  def onConfirm(e: reactLib.reactMod.MouseEvent[stdLib.HTMLButtonElement, stdLib.MouseEvent]): scala.Unit = js.native
  def onVisibleChange(visible: scala.Boolean): scala.Unit = js.native
  def renderConfirm(hasGetPrefixCls: antdLib.libConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element = js.native
  def renderOverlay(prefixCls: java.lang.String, popconfirmLocale: PopconfirmLocale): reactLib.reactMod.Global.JSXNs.Element = js.native
  def saveTooltip(node: js.Any): scala.Unit = js.native
  def setVisible(visible: scala.Boolean): scala.Unit = js.native
  def setVisible(
    visible: scala.Boolean,
    e: reactLib.reactMod.MouseEvent[stdLib.HTMLButtonElement, reactLib.NativeMouseEvent]
  ): scala.Unit = js.native
}

