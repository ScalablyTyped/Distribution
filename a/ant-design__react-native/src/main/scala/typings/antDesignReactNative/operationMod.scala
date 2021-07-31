package typings.antDesignReactNative

import typings.antDesignReactNative.modalPropsTypeMod.CallbackOnBackHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operationMod {
  
  @JSImport("@ant-design/react-native/lib/modal/operation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(actions: js.Array[js.Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(actions.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def default(actions: js.Array[js.Any], onBackHandler: CallbackOnBackHandler): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(actions.asInstanceOf[js.Any], onBackHandler.asInstanceOf[js.Any])).asInstanceOf[Double]
}
