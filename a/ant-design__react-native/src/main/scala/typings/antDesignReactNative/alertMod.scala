package typings.antDesignReactNative

import typings.antDesignReactNative.modalPropsTypeMod.Action
import typings.antDesignReactNative.modalPropsTypeMod.CallbackOnBackHandler
import typings.react.mod.ReactNode
import typings.reactNative.mod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alertMod {
  
  @JSImport("@ant-design/react-native/lib/modal/alert", JSImport.Default)
  @js.native
  def default(title: ReactNode, content: ReactNode): Double = js.native
  @JSImport("@ant-design/react-native/lib/modal/alert", JSImport.Default)
  @js.native
  def default(
    title: ReactNode,
    content: ReactNode,
    actions: js.UndefOr[scala.Nothing],
    onBackHandler: CallbackOnBackHandler
  ): Double = js.native
  @JSImport("@ant-design/react-native/lib/modal/alert", JSImport.Default)
  @js.native
  def default(title: ReactNode, content: ReactNode, actions: js.Array[Action[TextStyle]]): Double = js.native
  @JSImport("@ant-design/react-native/lib/modal/alert", JSImport.Default)
  @js.native
  def default(
    title: ReactNode,
    content: ReactNode,
    actions: js.Array[Action[TextStyle]],
    onBackHandler: CallbackOnBackHandler
  ): Double = js.native
}
