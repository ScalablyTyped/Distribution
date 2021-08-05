package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Opacity extends StObject {
  
  var fill: String
  
  var lineWidth: Double
  
  var opacity: Double
}
object Opacity {
  
  inline def apply(fill: String, lineWidth: Double, opacity: Double): Opacity = {
    val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Opacity]
  }
  
  extension [Self <: Opacity](x: Self) {
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
  }
}
