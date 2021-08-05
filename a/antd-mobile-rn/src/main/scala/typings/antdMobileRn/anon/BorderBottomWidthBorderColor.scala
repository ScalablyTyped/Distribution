package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderBottomWidthBorderColor extends StObject {
  
  var borderBottomWidth: Double
  
  var borderColor: String
  
  var borderStyle: String
}
object BorderBottomWidthBorderColor {
  
  inline def apply(borderBottomWidth: Double, borderColor: String, borderStyle: String): BorderBottomWidthBorderColor = {
    val __obj = js.Dynamic.literal(borderBottomWidth = borderBottomWidth.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderStyle = borderStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderBottomWidthBorderColor]
  }
  
  extension [Self <: BorderBottomWidthBorderColor](x: Self) {
    
    inline def setBorderBottomWidth(value: Double): Self = StObject.set(x, "borderBottomWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderStyle(value: String): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
  }
}
