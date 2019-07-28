package typings.atAntDashDesignReactDashNative

import typings.atAntDashDesignReactDashNative.esModalPropsTypeMod.CallbackOrActions
import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/es/modal/prompt", JSImport.Namespace)
@js.native
object esModalPromptMod extends js.Object {
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

