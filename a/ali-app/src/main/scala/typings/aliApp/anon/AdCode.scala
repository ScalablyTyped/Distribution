package typings.aliApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdCode extends StObject {
  
  var adCode: String
  
  var city: String
}
object AdCode {
  
  inline def apply(adCode: String, city: String): AdCode = {
    val __obj = js.Dynamic.literal(adCode = adCode.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdCode]
  }
  
  extension [Self <: AdCode](x: Self) {
    
    inline def setAdCode(value: String): Self = StObject.set(x, "adCode", value.asInstanceOf[js.Any])
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
  }
}
