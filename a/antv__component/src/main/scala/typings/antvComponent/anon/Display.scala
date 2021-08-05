package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Display extends StObject {
  
  var display: Boolean
  
  var style: Fill
}
object Display {
  
  inline def apply(display: Boolean, style: Fill): Display = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Display]
  }
  
  extension [Self <: Display](x: Self) {
    
    inline def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Fill): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
