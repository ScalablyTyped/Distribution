package typings.antdDashMobileDashRn

import typings.antdDashMobileDashRn.libModalPropsTypeMod.CallbackOrActions
import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile-rn/lib/modal/prompt.native", JSImport.Namespace)
@js.native
object libModalPromptDotNativeMod extends js.Object {
  def default(title: ReactNode, message: ReactNode, callbackOrActions: CallbackOrActions[TextStyle]): Unit = js.native
  def default(
    title: ReactNode,
    message: ReactNode,
    callbackOrActions: CallbackOrActions[TextStyle],
    `type`: String
  ): Unit = js.native
  def default(
    title: ReactNode,
    message: ReactNode,
    callbackOrActions: CallbackOrActions[TextStyle],
    `type`: String,
    defaultValue: String
  ): Unit = js.native
  def default(
    title: ReactNode,
    message: ReactNode,
    callbackOrActions: CallbackOrActions[TextStyle],
    `type`: String,
    defaultValue: String,
    placeholders: js.Array[String]
  ): Unit = js.native
}

