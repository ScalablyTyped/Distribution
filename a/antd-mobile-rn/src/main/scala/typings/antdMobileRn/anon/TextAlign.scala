package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextAlign extends StObject {
  
  var color: String
  
  var textAlign: String
}
object TextAlign {
  
  inline def apply(color: String, textAlign: String): TextAlign = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAlign]
  }
  
  extension [Self <: TextAlign](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
  }
}
