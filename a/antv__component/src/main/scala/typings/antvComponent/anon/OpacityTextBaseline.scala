package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpacityTextBaseline extends StObject {
  
  var fill: String
  
  var opacity: Double
  
  var textBaseline: String
}
object OpacityTextBaseline {
  
  inline def apply(fill: String, opacity: Double, textBaseline: String): OpacityTextBaseline = {
    val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], textBaseline = textBaseline.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpacityTextBaseline]
  }
  
  extension [Self <: OpacityTextBaseline](x: Self) {
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setTextBaseline(value: String): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
  }
}
