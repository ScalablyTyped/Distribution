package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorStringFontSizeNumber extends StObject {
  
  var color: String
  
  var fontSize: Double
}
object ColorStringFontSizeNumber {
  
  inline def apply(color: String, fontSize: Double): ColorStringFontSizeNumber = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorStringFontSizeNumber]
  }
  
  extension [Self <: ColorStringFontSizeNumber](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
  }
}
