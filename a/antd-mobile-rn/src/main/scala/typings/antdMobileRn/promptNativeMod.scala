package typings.antdMobileRn

import typings.antdMobileRn.modalPropsTypeMod.CallbackOrActions
import typings.react.mod.ReactNode
import typings.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile-rn/lib/modal/prompt.native", JSImport.Namespace)
@js.native
object promptNativeMod extends js.Object {
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

