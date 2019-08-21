package typings.atAntDashDesignReactDashNative

import typings.atAntDashDesignReactDashNative.libModalPropsTypeMod.CallbackOnBackHandler
import typings.atAntDashDesignReactDashNative.libModalPropsTypeMod.CallbackOrActions
import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/modal/prompt", JSImport.Namespace)
@js.native
object libModalPromptMod extends js.Object {
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
  def default(
    title: ReactNode,
    message: ReactNode,
    callbackOrActions: CallbackOrActions[TextStyle],
    `type`: String,
    defaultValue: String,
    placeholders: js.Array[String],
    onBackHandler: CallbackOnBackHandler
  ): Unit = js.native
}

