package typings.antDesignReactNative

import typings.antDesignReactNative.modalPropsTypeMod.Action
import typings.antDesignReactNative.modalPropsTypeMod.CallbackOnBackHandler
import typings.react.mod.ReactNode
import typings.reactNative.mod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alertMod {
  
  @JSImport("@ant-design/react-native/lib/modal/alert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(title: ReactNode, content: ReactNode): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(title.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def default(title: ReactNode, content: ReactNode, actions: js.Array[Action[TextStyle]]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(title.asInstanceOf[js.Any], content.asInstanceOf[js.Any], actions.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def default(
    title: ReactNode,
    content: ReactNode,
    actions: js.Array[Action[TextStyle]],
    onBackHandler: CallbackOnBackHandler
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(title.asInstanceOf[js.Any], content.asInstanceOf[js.Any], actions.asInstanceOf[js.Any], onBackHandler.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def default(title: ReactNode, content: ReactNode, actions: Unit, onBackHandler: CallbackOnBackHandler): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(title.asInstanceOf[js.Any], content.asInstanceOf[js.Any], actions.asInstanceOf[js.Any], onBackHandler.asInstanceOf[js.Any])).asInstanceOf[Double]
}
