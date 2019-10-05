package typings.antd.libModalModalMod

import typings.antd.libConfigDashProviderMod.ConfigConsumerProps
import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSX.Element
import typings.std.HTMLButtonElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Modal
  extends Component[ModalProps, js.Object, js.Any] {
  def handleCancel(e: typings.react.reactMod.MouseEvent[HTMLButtonElement, MouseEvent]): Unit = js.native
  def handleOk(e: typings.react.reactMod.MouseEvent[HTMLButtonElement, MouseEvent]): Unit = js.native
  def renderFooter(locale: ModalLocale): Element = js.native
  def renderModal(hasGetPopupContainerGetPrefixCls: ConfigConsumerProps): Element = js.native
}

