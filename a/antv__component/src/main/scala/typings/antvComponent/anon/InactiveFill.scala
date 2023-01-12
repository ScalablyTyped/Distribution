package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InactiveFill extends StObject {
  
  var fill: String
  
  var inactiveFill: String
  
  var inactiveOpacity: Double
  
  var opacity: Double
  
  var size: Double
}
object InactiveFill {
  
  inline def apply(fill: String, inactiveFill: String, inactiveOpacity: Double, opacity: Double, size: Double): InactiveFill = {
    val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], inactiveFill = inactiveFill.asInstanceOf[js.Any], inactiveOpacity = inactiveOpacity.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[InactiveFill]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InactiveFill] (val x: Self) extends AnyVal {
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setInactiveFill(value: String): Self = StObject.set(x, "inactiveFill", value.asInstanceOf[js.Any])
    
    inline def setInactiveOpacity(value: Double): Self = StObject.set(x, "inactiveOpacity", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
