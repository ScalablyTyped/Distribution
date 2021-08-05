package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderColorString extends StObject {
  
  var borderColor: String
}
object BorderColorString {
  
  inline def apply(borderColor: String): BorderColorString = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderColorString]
  }
  
  extension [Self <: BorderColorString](x: Self) {
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
  }
}
