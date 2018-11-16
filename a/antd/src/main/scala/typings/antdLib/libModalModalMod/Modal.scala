package typings
package antdLib.libModalModalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Modal
  extends reactLib.reactMod.Component[ModalProps, js.Object, js.Any] {
  @JSName("componentDidMount")
  def componentDidMount_MModal(): scala.Unit = js.native
  def handleCancel(e: reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLButtonElement]): scala.Unit = js.native
  def handleOk(e: reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLButtonElement]): scala.Unit = js.native
  def renderFooter(locale: ModalLocale): reactLib.reactMod.Global.JSXNs.Element = js.native
}

