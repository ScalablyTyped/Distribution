package typings.atAntDashDesignReactDashNative

import typings.atAntDashDesignReactDashNative.libModalPropsTypeMod.Action
import typings.atAntDashDesignReactDashNative.libModalPropsTypeMod.CallbackOnBackHandler
import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/modal/alert", JSImport.Namespace)
@js.native
object libModalAlertMod extends js.Object {
  def default(title: ReactNode, content: ReactNode): Unit = js.native
  def default(title: ReactNode, content: ReactNode, actions: js.Array[Action[TextStyle]]): Unit = js.native
  def default(
    title: ReactNode,
    content: ReactNode,
    actions: js.Array[Action[TextStyle]],
    onBackHandler: CallbackOnBackHandler
  ): Unit = js.native
}

