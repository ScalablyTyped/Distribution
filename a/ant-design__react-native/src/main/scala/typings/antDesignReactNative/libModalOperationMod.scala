package typings.antDesignReactNative

import typings.antDesignReactNative.libModalPropsTypeMod.CallbackOnBackHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModalOperationMod {
  
  @JSImport("@ant-design/react-native/lib/modal/operation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(actions: js.Array[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(actions.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def default(actions: js.Array[Any], onBackHandler: CallbackOnBackHandler): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(actions.asInstanceOf[js.Any], onBackHandler.asInstanceOf[js.Any])).asInstanceOf[Double]
}
