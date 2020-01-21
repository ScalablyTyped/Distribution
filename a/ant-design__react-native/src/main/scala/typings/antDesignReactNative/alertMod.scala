package typings.antDesignReactNative

import typings.antDesignReactNative.modalPropsTypeMod.Action
import typings.antDesignReactNative.modalPropsTypeMod.CallbackOnBackHandler
import typings.react.mod.ReactNode
import typings.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/modal/alert", JSImport.Namespace)
@js.native
object alertMod extends js.Object {
  def default(title: ReactNode, content: ReactNode): Double = js.native
  def default(title: ReactNode, content: ReactNode, actions: js.Array[Action[TextStyle]]): Double = js.native
  def default(
    title: ReactNode,
    content: ReactNode,
    actions: js.Array[Action[TextStyle]],
    onBackHandler: CallbackOnBackHandler
  ): Double = js.native
}

