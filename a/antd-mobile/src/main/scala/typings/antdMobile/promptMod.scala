package typings.antdMobile

import typings.antdMobile.modalPropsTypeMod.CallbackOrActions
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile/lib/modal/prompt", JSImport.Namespace)
@js.native
object promptMod extends js.Object {
  def default(title: ReactNode, message: ReactNode, callbackOrActions: CallbackOrActions[CSSProperties]): AnonClose = js.native
  def default(
    title: ReactNode,
    message: ReactNode,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: String
  ): AnonClose = js.native
  def default(
    title: ReactNode,
    message: ReactNode,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: String,
    defaultValue: String
  ): AnonClose = js.native
  def default(
    title: ReactNode,
    message: ReactNode,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: String,
    defaultValue: String,
    placeholders: js.Array[String]
  ): AnonClose = js.native
  def default(
    title: ReactNode,
    message: ReactNode,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: String,
    defaultValue: String,
    placeholders: js.Array[String],
    platform: String
  ): AnonClose = js.native
}

