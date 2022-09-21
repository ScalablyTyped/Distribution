package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OffsetY extends StObject {
  
  var offsetX: Double
  
  var offsetY: Double
  
  var style: FontSize
}
object OffsetY {
  
  inline def apply(offsetX: Double, offsetY: Double, style: FontSize): OffsetY = {
    val __obj = js.Dynamic.literal(offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetY]
  }
  
  extension [Self <: OffsetY](x: Self) {
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: FontSize): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
