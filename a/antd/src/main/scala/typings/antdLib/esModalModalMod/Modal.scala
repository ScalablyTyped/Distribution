package typings
package antdLib.esModalModalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Modal
  extends reactLib.reactMod.Component[ModalProps, js.Object, js.Any] {
  def handleCancel(e: reactLib.reactMod.MouseEvent[stdLib.HTMLButtonElement, stdLib.MouseEvent]): scala.Unit = js.native
  def handleOk(e: reactLib.reactMod.MouseEvent[stdLib.HTMLButtonElement, stdLib.MouseEvent]): scala.Unit = js.native
  def renderFooter(locale: ModalLocale): reactLib.reactMod.Global.JSXNs.Element = js.native
  def renderModal(hasGetPopupContainerGetPrefixCls: antdLib.esConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element = js.native
}

