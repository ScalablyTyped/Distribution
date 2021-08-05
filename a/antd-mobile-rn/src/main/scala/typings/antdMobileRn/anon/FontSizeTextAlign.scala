package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontSizeTextAlign extends StObject {
  
  var color: String
  
  var fontSize: Double
  
  var textAlign: String
  
  var textAlignVertical: String
}
object FontSizeTextAlign {
  
  inline def apply(color: String, fontSize: Double, textAlign: String, textAlignVertical: String): FontSizeTextAlign = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any], textAlignVertical = textAlignVertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontSizeTextAlign]
  }
  
  extension [Self <: FontSizeTextAlign](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setTextAlignVertical(value: String): Self = StObject.set(x, "textAlignVertical", value.asInstanceOf[js.Any])
  }
}
