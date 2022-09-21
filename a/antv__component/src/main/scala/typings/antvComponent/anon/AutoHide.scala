package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoHide extends StObject {
  
  var autoEllipsis: Boolean
  
  var autoHide: Boolean
  
  var autoRotate: Boolean
  
  var offset: Double
  
  var offsetX: Double
  
  var offsetY: Double
  
  var style: FontWeight
}
object AutoHide {
  
  inline def apply(
    autoEllipsis: Boolean,
    autoHide: Boolean,
    autoRotate: Boolean,
    offset: Double,
    offsetX: Double,
    offsetY: Double,
    style: FontWeight
  ): AutoHide = {
    val __obj = js.Dynamic.literal(autoEllipsis = autoEllipsis.asInstanceOf[js.Any], autoHide = autoHide.asInstanceOf[js.Any], autoRotate = autoRotate.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoHide]
  }
  
  extension [Self <: AutoHide](x: Self) {
    
    inline def setAutoEllipsis(value: Boolean): Self = StObject.set(x, "autoEllipsis", value.asInstanceOf[js.Any])
    
    inline def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
    
    inline def setAutoRotate(value: Boolean): Self = StObject.set(x, "autoRotate", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: FontWeight): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
