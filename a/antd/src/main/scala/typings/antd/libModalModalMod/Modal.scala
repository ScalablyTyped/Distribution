package typings.antd.libModalModalMod

import typings.antd.libConfigDashProviderMod.ConfigConsumerProps
import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSXNs.Element
import typings.react.reactMod.MouseEvent
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Modal
  extends Component[ModalProps, js.Object, js.Any] {
  def handleCancel(e: MouseEvent[HTMLButtonElement, typings.std.MouseEvent]): Unit = js.native
  def handleOk(e: MouseEvent[HTMLButtonElement, typings.std.MouseEvent]): Unit = js.native
  def renderFooter(locale: ModalLocale): Element = js.native
  def renderModal(hasGetPopupContainerGetPrefixCls: ConfigConsumerProps): Element = js.native
}

