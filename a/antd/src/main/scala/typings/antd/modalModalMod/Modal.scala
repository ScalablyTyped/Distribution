package typings.antd.modalModalMod

import typings.antd.contextMod.ConfigConsumerProps
import typings.react.mod.Component
import typings.react.mod._Global_.JSX.Element
import typings.std.HTMLButtonElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Modal
  extends Component[ModalProps, js.Object, js.Any] {
  def handleCancel(e: typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent]): Unit = js.native
  def handleOk(e: typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent]): Unit = js.native
  def renderFooter(locale: ModalLocale): Element = js.native
  def renderModal(hasGetPopupContainerGetPrefixClsDirection: ConfigConsumerProps): Element = js.native
}

