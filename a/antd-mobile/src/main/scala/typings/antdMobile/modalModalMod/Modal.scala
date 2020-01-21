package typings.antdMobile.modalModalMod

import typings.antdMobile.modalPropsTypeMod.Action
import typings.react.mod.CSSProperties
import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Modal
  extends ModalComponent[ModalProps, js.Any] {
  def renderFooterButton(button: Action[CSSProperties], prefixCls: js.UndefOr[scala.Nothing], i: Double): Element = js.native
  def renderFooterButton(button: Action[CSSProperties], prefixCls: String, i: Double): Element = js.native
}

