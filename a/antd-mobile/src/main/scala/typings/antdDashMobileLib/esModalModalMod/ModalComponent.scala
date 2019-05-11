package typings
package antdDashMobileLib.esModalModalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile/es/modal/Modal", "ModalComponent")
@js.native
abstract class ModalComponent[P, S] ()
  extends reactLib.reactMod.Component[P, S, js.Any]

/* static members */
@JSImport("antd-mobile/es/modal/Modal", "ModalComponent")
@js.native
object ModalComponent extends js.Object {
  def alert(title: reactLib.reactMod.ReactNode, message: reactLib.reactMod.ReactNode): antdDashMobileLib.Anon_Close = js.native
  def alert(
    title: reactLib.reactMod.ReactNode,
    message: reactLib.reactMod.ReactNode,
    actions: js.Array[antdDashMobileLib.esModalPropsTypeMod.Action[reactLib.reactMod.CSSProperties]]
  ): antdDashMobileLib.Anon_Close = js.native
  def alert(
    title: reactLib.reactMod.ReactNode,
    message: reactLib.reactMod.ReactNode,
    actions: js.Array[antdDashMobileLib.esModalPropsTypeMod.Action[reactLib.reactMod.CSSProperties]],
    platform: java.lang.String
  ): antdDashMobileLib.Anon_Close = js.native
  def operation(): antdDashMobileLib.Anon_Close = js.native
  def operation(actions: js.Array[antdDashMobileLib.esModalPropsTypeMod.Action[reactLib.reactMod.CSSProperties]]): antdDashMobileLib.Anon_Close = js.native
  def operation(
    actions: js.Array[antdDashMobileLib.esModalPropsTypeMod.Action[reactLib.reactMod.CSSProperties]],
    platform: java.lang.String
  ): antdDashMobileLib.Anon_Close = js.native
  def prompt(
    title: reactLib.reactMod.ReactNode,
    message: reactLib.reactMod.ReactNode,
    callbackOrActions: antdDashMobileLib.esModalPropsTypeMod.CallbackOrActions[reactLib.reactMod.CSSProperties]
  ): antdDashMobileLib.Anon_Close = js.native
  @JSName("prompt")
  def prompt_default(
    title: reactLib.reactMod.ReactNode,
    message: reactLib.reactMod.ReactNode,
    callbackOrActions: antdDashMobileLib.esModalPropsTypeMod.CallbackOrActions[reactLib.reactMod.CSSProperties],
    `type`: antdDashMobileLib.antdDashMobileLibStrings.default
  ): antdDashMobileLib.Anon_Close = js.native
  @JSName("prompt")
  def prompt_default(
    title: reactLib.reactMod.ReactNode,
    message: reactLib.reactMod.ReactNode,
    callbackOrActions: antdDashMobileLib.esModalPropsTypeMod.CallbackOrActions[reactLib.reactMod.CSSProperties],
    `type`: antdDashMobileLib.antdDashMobileLibStrings.default,
    defaultValue: java.lang.String
  ): antdDashMobileLib.Anon_Close = js.native
  @JSName("prompt")
  def prompt_default(
    title: reactLib.reactMod.ReactNode,
    message: reactLib.reactMod.ReactNode,
    callbackOrActions: antdDashMobileLib.esModalPropsTypeMod.CallbackOrActions[reactLib.reactMod.CSSProperties],
    `type`: antdDashMobileLib.antdDashMobileLibStrings.default,
    defaultValue: java.lang.String,
    placeholders: js.Array[java.lang.String]
  ): antdDashMobileLib.Anon_Close = js.native
  @JSName("prompt")
  def prompt_default(
    title: reactLib.reactMod.ReactNode,
    message: reactLib.reactMod.ReactNode,
    callbackOrActions: antdDashMobileLib.esModalPropsTypeMod.CallbackOrActions[reactLib.reactMod.CSSProperties],
    `type`: antdDashMobileLib.antdDashMobileLibStrings.default,
    defaultValue: java.lang.String,
    placeholders: js.Array[java.lang.String],
    platform: java.lang.String
  ): antdDashMobileLib.Anon_Close = js.native
  @JSName("prompt")
  def `prompt_login-password`(
    title: reactLib.reactMod.ReactNode,
    message: reactLib.reactMod.ReactNode,
    callbackOrActions: antdDashMobileLib.esModalPropsTypeMod.CallbackOrActions[reactLib.reactMod.CSSProperties],
    `type`: antdDashMobileLib.antdDashMobileLibStrings.`login-password`
  ): antdDashMobileLib.Anon_Close = js.native
  @JSName("prompt")
  def `prompt_login-password`(
    title: reactLib.reactMod.ReactNode,
    message: reactLib.reactMod.ReactNode,
    callbackOrActions: antdDashMobileLib.esModalPropsTypeMod.CallbackOrActions[reactLib.reactMod.CSSProperties],
    `type`: antdDashMobileLib.antdDashMobileLibStrings.`login-password`,
    defaultValue: java.lang.String
  ): antdDashMobileLib.Anon_Close = js.native
  @JSName("prompt")
  def `prompt_login-password`(
    title: reactLib.reactMod.ReactNode,
    message: reactLib.reactMod.ReactNode,
    callbackOrActions: antdDashMobileLib.esModalPropsTypeMod.CallbackOrActions[reactLib.reactMod.CSSProperties],
    `type`: antdDashMobileLib.antdDashMobileLibStrings.`login-password`,
    defaultValue: java.lang.String,
    placeholders: js.Array[java.lang.String]
  ): antdDashMobileLib.Anon_Close = js.native
  @JSName("prompt")
  def `prompt_login-password`(
    title: reactLib.reactMod.ReactNode,
    message: reactLib.reactMod.ReactNode,
    callbackOrActions: antdDashMobileLib.esModalPropsTypeMod.CallbackOrActions[reactLib.reactMod.CSSProperties],
    `type`: antdDashMobileLib.antdDashMobileLibStrings.`login-password`,
    defaultValue: java.lang.String,
    placeholders: js.Array[java.lang.String],
    platform: java.lang.String
  ): antdDashMobileLib.Anon_Close = js.native
  @JSName("prompt")
  def `prompt_secure-text`(
    title: reactLib.reactMod.ReactNode,
    message: reactLib.reactMod.ReactNode,
    callbackOrActions: antdDashMobileLib.esModalPropsTypeMod.CallbackOrActions[reactLib.reactMod.CSSProperties],
    `type`: antdDashMobileLib.antdDashMobileLibStrings.`secure-text`
  ): antdDashMobileLib.Anon_Close = js.native
  @JSName("prompt")
  def `prompt_secure-text`(
    title: reactLib.reactMod.ReactNode,
    message: reactLib.reactMod.ReactNode,
    callbackOrActions: antdDashMobileLib.esModalPropsTypeMod.CallbackOrActions[reactLib.reactMod.CSSProperties],
    `type`: antdDashMobileLib.antdDashMobileLibStrings.`secure-text`,
    defaultValue: java.lang.String
  ): antdDashMobileLib.Anon_Close = js.native
  @JSName("prompt")
  def `prompt_secure-text`(
    title: reactLib.reactMod.ReactNode,
    message: reactLib.reactMod.ReactNode,
    callbackOrActions: antdDashMobileLib.esModalPropsTypeMod.CallbackOrActions[reactLib.reactMod.CSSProperties],
    `type`: antdDashMobileLib.antdDashMobileLibStrings.`secure-text`,
    defaultValue: java.lang.String,
    placeholders: js.Array[java.lang.String]
  ): antdDashMobileLib.Anon_Close = js.native
  @JSName("prompt")
  def `prompt_secure-text`(
    title: reactLib.reactMod.ReactNode,
    message: reactLib.reactMod.ReactNode,
    callbackOrActions: antdDashMobileLib.esModalPropsTypeMod.CallbackOrActions[reactLib.reactMod.CSSProperties],
    `type`: antdDashMobileLib.antdDashMobileLibStrings.`secure-text`,
    defaultValue: java.lang.String,
    placeholders: js.Array[java.lang.String],
    platform: java.lang.String
  ): antdDashMobileLib.Anon_Close = js.native
}

