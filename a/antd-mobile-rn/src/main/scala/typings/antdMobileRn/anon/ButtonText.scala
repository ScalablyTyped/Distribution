package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonText extends StObject {
  
  var buttonText: String
  
  var cancelText: String
  
  var okText: String
}
object ButtonText {
  
  inline def apply(buttonText: String, cancelText: String, okText: String): ButtonText = {
    val __obj = js.Dynamic.literal(buttonText = buttonText.asInstanceOf[js.Any], cancelText = cancelText.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonText]
  }
  
  extension [Self <: ButtonText](x: Self) {
    
    inline def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
    
    inline def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
    
    inline def setOkText(value: String): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
  }
}
