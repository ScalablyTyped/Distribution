package typings.antdDashMobile.esModalModalMod

import typings.antdDashMobile.Anon_Close
import typings.antdDashMobile.antdDashMobileStrings.`login-password`
import typings.antdDashMobile.antdDashMobileStrings.`secure-text`
import typings.antdDashMobile.esModalPropsTypeMod.Action
import typings.antdDashMobile.esModalPropsTypeMod.CallbackOrActions
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Component
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile/es/modal/Modal", "ModalComponent")
@js.native
abstract class ModalComponent[P, S] ()
  extends Component[P, S, js.Any]

/* static members */
@JSImport("antd-mobile/es/modal/Modal", "ModalComponent")
@js.native
object ModalComponent extends js.Object {
  def alert(title: ReactNode, message: ReactNode): Anon_Close = js.native
  def alert(title: ReactNode, message: ReactNode, actions: js.Array[Action[CSSProperties]]): Anon_Close = js.native
  def alert(title: ReactNode, message: ReactNode, actions: js.Array[Action[CSSProperties]], platform: String): Anon_Close = js.native
  def operation(): Anon_Close = js.native
  def operation(actions: js.Array[Action[CSSProperties]]): Anon_Close = js.native
  def operation(actions: js.Array[Action[CSSProperties]], platform: String): Anon_Close = js.native
  def prompt(title: ReactNode, message: ReactNode, callbackOrActions: CallbackOrActions[CSSProperties]): Anon_Close = js.native
  @JSName("prompt")
  def prompt_default(
    title: ReactNode,
    message: ReactNode,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: typings.antdDashMobile.antdDashMobileStrings.default
  ): Anon_Close = js.native
  @JSName("prompt")
  def prompt_default(
    title: ReactNode,
    message: ReactNode,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: typings.antdDashMobile.antdDashMobileStrings.default,
    defaultValue: String
  ): Anon_Close = js.native
  @JSName("prompt")
  def prompt_default(
    title: ReactNode,
    message: ReactNode,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: typings.antdDashMobile.antdDashMobileStrings.default,
    defaultValue: String,
    placeholders: js.Array[String]
  ): Anon_Close = js.native
  @JSName("prompt")
  def prompt_default(
    title: ReactNode,
    message: ReactNode,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: typings.antdDashMobile.antdDashMobileStrings.default,
    defaultValue: String,
    placeholders: js.Array[String],
    platform: String
  ): Anon_Close = js.native
  @JSName("prompt")
  def prompt_loginpassword(
    title: ReactNode,
    message: ReactNode,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `login-password`
  ): Anon_Close = js.native
  @JSName("prompt")
  def prompt_loginpassword(
    title: ReactNode,
    message: ReactNode,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `login-password`,
    defaultValue: String
  ): Anon_Close = js.native
  @JSName("prompt")
  def prompt_loginpassword(
    title: ReactNode,
    message: ReactNode,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `login-password`,
    defaultValue: String,
    placeholders: js.Array[String]
  ): Anon_Close = js.native
  @JSName("prompt")
  def prompt_loginpassword(
    title: ReactNode,
    message: ReactNode,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `login-password`,
    defaultValue: String,
    placeholders: js.Array[String],
    platform: String
  ): Anon_Close = js.native
  @JSName("prompt")
  def prompt_securetext(
    title: ReactNode,
    message: ReactNode,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `secure-text`
  ): Anon_Close = js.native
  @JSName("prompt")
  def prompt_securetext(
    title: ReactNode,
    message: ReactNode,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `secure-text`,
    defaultValue: String
  ): Anon_Close = js.native
  @JSName("prompt")
  def prompt_securetext(
    title: ReactNode,
    message: ReactNode,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `secure-text`,
    defaultValue: String,
    placeholders: js.Array[String]
  ): Anon_Close = js.native
  @JSName("prompt")
  def prompt_securetext(
    title: ReactNode,
    message: ReactNode,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `secure-text`,
    defaultValue: String,
    placeholders: js.Array[String],
    platform: String
  ): Anon_Close = js.native
}

