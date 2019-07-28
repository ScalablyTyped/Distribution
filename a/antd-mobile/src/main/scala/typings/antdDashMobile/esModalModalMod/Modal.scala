package typings.antdDashMobile.esModalModalMod

import typings.antdDashMobile.esModalPropsTypeMod.Action
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Global.JSXNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Modal
  extends ModalComponent[ModalProps, js.Any] {
  def renderFooterButton(button: Action[CSSProperties], prefixCls: js.UndefOr[scala.Nothing], i: Double): Element = js.native
  def renderFooterButton(button: Action[CSSProperties], prefixCls: String, i: Double): Element = js.native
}

