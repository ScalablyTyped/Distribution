package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color extends StObject {
  
  var color: String
  
  var colorGradientEnd: String
}
object Color {
  
  inline def apply(color: String, colorGradientEnd: String): Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], colorGradientEnd = colorGradientEnd.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  
  extension [Self <: Color](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorGradientEnd(value: String): Self = StObject.set(x, "colorGradientEnd", value.asInstanceOf[js.Any])
  }
}
