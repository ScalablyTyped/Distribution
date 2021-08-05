package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Length extends StObject {
  
  var display: Boolean
  
  var length: Double
  
  var style: LineWidth
}
object Length {
  
  inline def apply(display: Boolean, length: Double, style: LineWidth): Length = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Length]
  }
  
  extension [Self <: Length](x: Self) {
    
    inline def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: LineWidth): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
