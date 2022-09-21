package typings.antvGLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OffsetY extends StObject {
  
  var height: Double
  
  var offsetX: Double
  
  var offsetY: Double
  
  var width: Double
  
  var x: Unit
  
  var y: Unit
}
object OffsetY {
  
  inline def apply(height: Double, offsetX: Double, offsetY: Double, width: Double, x: Unit, y: Unit): OffsetY = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetY]
  }
  
  extension [Self <: OffsetY](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Unit): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Unit): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
