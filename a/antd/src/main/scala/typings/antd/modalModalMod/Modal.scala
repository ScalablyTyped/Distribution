package typings.antd.modalModalMod

import typings.antd.configProviderContextMod.ConfigConsumerProps
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Modal
  extends Component[ModalProps, js.Object, js.Any] {
  def handleCancel(e: MouseEvent[HTMLButtonElement, NativeMouseEvent]): Unit = js.native
  def handleOk(e: MouseEvent[HTMLButtonElement, NativeMouseEvent]): Unit = js.native
  def renderFooter(locale: ModalLocale): Element = js.native
  def renderModal(hasGetPopupContainerGetPrefixClsDirection: ConfigConsumerProps): Element = js.native
}

