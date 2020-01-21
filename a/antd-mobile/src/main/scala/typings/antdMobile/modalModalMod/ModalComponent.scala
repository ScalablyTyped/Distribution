package typings.antdMobile.modalModalMod

import typings.antdMobile.AnonClose
import typings.antdMobile.antdMobileStrings.`login-password`
import typings.antdMobile.antdMobileStrings.`secure-text`
import typings.antdMobile.modalPropsTypeMod.Action
import typings.antdMobile.modalPropsTypeMod.CallbackOrActions
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile/lib/modal/Modal", "ModalComponent")
@js.native
abstract class ModalComponent[P, S] ()
  extends Component[P, S, js.Any]

/* static members */
@JSImport("antd-mobile/lib/modal/Modal", "ModalComponent")
@js.native
object ModalComponent extends js.Object {
  def alert(title: ReactNode, message: ReactNode): AnonClose = js.native
  def alert(title: ReactNode, message: ReactNode, actions: js.Array[Action[CSSProperties]]): AnonClose = js.native
  def alert(title: ReactNode, message: ReactNode, actions: js.Array[Action[CSSProperties]], platform: String): AnonClose = js.native
  def operation(): AnonClose = js.native
  def operation(actions: js.Array[Action[CSSProperties]]): AnonClose = js.native
  def operation(actions: js.Array[Action[CSSProperties]], platform: String): AnonClose = js.native
  def prompt(title: ReactNode, message: ReactNode, callbackOrActions: CallbackOrActions[CSSProperties]): AnonClose = js.native
  @JSName("prompt")
  def prompt_default(
    title: ReactNode,
    message: ReactNode,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: typings.antdMobile.antdMobileStrings.default
  ): AnonClose = js.native
  @JSName("prompt")
  def prompt_default(
    title: ReactNode,
    message: ReactNode,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: typings.antdMobile.antdMobileStrings.default,
    defaultValue: String
  ): AnonClose = js.native
  @JSName("prompt")
  def prompt_default(
    title: ReactNode,
    message: ReactNode,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: typings.antdMobile.antdMobileStrings.default,
    defaultValue: String,
    placeholders: js.Array[String]
  ): AnonClose = js.native
  @JSName("prompt")
  def prompt_default(
    title: ReactNode,
    message: ReactNode,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: typings.antdMobile.antdMobileStrings.default,
    defaultValue: String,
    placeholders: js.Array[String],
    platform: String
  ): AnonClose = js.native
  @JSName("prompt")
  def prompt_loginpassword(
    title: ReactNode,
    message: ReactNode,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `login-password`
  ): AnonClose = js.native
  @JSName("prompt")
  def prompt_loginpassword(
    title: ReactNode,
    message: ReactNode,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `login-password`,
    defaultValue: String
  ): AnonClose = js.native
  @JSName("prompt")
  def prompt_loginpassword(
    title: ReactNode,
    message: ReactNode,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `login-password`,
    defaultValue: String,
    placeholders: js.Array[String]
  ): AnonClose = js.native
  @JSName("prompt")
  def prompt_loginpassword(
    title: ReactNode,
    message: ReactNode,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `login-password`,
    defaultValue: String,
    placeholders: js.Array[String],
    platform: String
  ): AnonClose = js.native
  @JSName("prompt")
  def prompt_securetext(
    title: ReactNode,
    message: ReactNode,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `secure-text`
  ): AnonClose = js.native
  @JSName("prompt")
  def prompt_securetext(
    title: ReactNode,
    message: ReactNode,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `secure-text`,
    defaultValue: String
  ): AnonClose = js.native
  @JSName("prompt")
  def prompt_securetext(
    title: ReactNode,
    message: ReactNode,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `secure-text`,
    defaultValue: String,
    placeholders: js.Array[String]
  ): AnonClose = js.native
  @JSName("prompt")
  def prompt_securetext(
    title: ReactNode,
    message: ReactNode,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `secure-text`,
    defaultValue: String,
    placeholders: js.Array[String],
    platform: String
  ): AnonClose = js.native
}

