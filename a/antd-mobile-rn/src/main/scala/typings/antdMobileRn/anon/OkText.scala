package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OkText extends StObject {
  
  var dismissText: String
  
  var extra: String
  
  var okText: String
}
object OkText {
  
  inline def apply(dismissText: String, extra: String, okText: String): OkText = {
    val __obj = js.Dynamic.literal(dismissText = dismissText.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any])
    __obj.asInstanceOf[OkText]
  }
  
  extension [Self <: OkText](x: Self) {
    
    inline def setDismissText(value: String): Self = StObject.set(x, "dismissText", value.asInstanceOf[js.Any])
    
    inline def setExtra(value: String): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setOkText(value: String): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
  }
}
