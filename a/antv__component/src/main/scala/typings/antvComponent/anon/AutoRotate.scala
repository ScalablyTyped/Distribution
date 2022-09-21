package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoRotate extends StObject {
  
  var autoRotate: Boolean
  
  var content: Any
  
  var offsetX: Double
  
  var offsetY: Double
  
  var position: String
  
  var style: LineWidth
}
object AutoRotate {
  
  inline def apply(
    autoRotate: Boolean,
    content: Any,
    offsetX: Double,
    offsetY: Double,
    position: String,
    style: LineWidth
  ): AutoRotate = {
    val __obj = js.Dynamic.literal(autoRotate = autoRotate.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoRotate]
  }
  
  extension [Self <: AutoRotate](x: Self) {
    
    inline def setAutoRotate(value: Boolean): Self = StObject.set(x, "autoRotate", value.asInstanceOf[js.Any])
    
    inline def setContent(value: Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: LineWidth): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
