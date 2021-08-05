package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelText extends StObject {
  
  /** 取消 */
  var cancelText: String
}
object CancelText {
  
  inline def apply(cancelText: String): CancelText = {
    val __obj = js.Dynamic.literal(cancelText = cancelText.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelText]
  }
  
  extension [Self <: CancelText](x: Self) {
    
    inline def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
  }
}
