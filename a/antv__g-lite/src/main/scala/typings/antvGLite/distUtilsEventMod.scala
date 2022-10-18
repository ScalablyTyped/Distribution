package typings.antvGLite

import typings.std.EventTarget
import typings.std.PointerEvent
import typings.std.Record
import typings.std.Touch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsEventMod {
  
  @JSImport("@antv/g-lite/dist/utils/event", "MOUSE_POINTER_ID")
  @js.native
  val MOUSE_POINTER_ID: /* 1 */ Double = js.native
  
  @JSImport("@antv/g-lite/dist/utils/event", "TOUCH_TO_POINTER")
  @js.native
  val TOUCH_TO_POINTER: Record[String, String] = js.native
  
  @js.native
  trait FormattedPointerEvent
    extends StObject
       with PointerEvent {
    
    var isNormalized: Boolean = js.native
  }
  
  trait FormattedTouch
    extends StObject
       with Touch {
    
    var button: Double
    
    var buttons: Double
    
    var height: Double
    
    var isNormalized: Boolean
    
    var isPrimary: Boolean
    
    var layerY: Double
    
    var offsetX: Double
    
    var offsetY: Double
    
    var pointerId: Double
    
    var pointerType: String
    
    var pressure: Double
    
    var tangentialPressure: Double
    
    var tiltX: Double
    
    var tiltY: Double
    
    var twist: Double
    
    var `type`: String
    
    var width: Double
  }
  object FormattedTouch {
    
    inline def apply(
      button: Double,
      buttons: Double,
      clientX: Double,
      clientY: Double,
      force: Double,
      height: Double,
      identifier: Double,
      isNormalized: Boolean,
      isPrimary: Boolean,
      layerY: Double,
      offsetX: Double,
      offsetY: Double,
      pageX: Double,
      pageY: Double,
      pointerId: Double,
      pointerType: String,
      pressure: Double,
      radiusX: Double,
      radiusY: Double,
      rotationAngle: Double,
      screenX: Double,
      screenY: Double,
      tangentialPressure: Double,
      target: EventTarget,
      tiltX: Double,
      tiltY: Double,
      twist: Double,
      `type`: String,
      width: Double
    ): FormattedTouch = {
      val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], isNormalized = isNormalized.asInstanceOf[js.Any], isPrimary = isPrimary.asInstanceOf[js.Any], layerY = layerY.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], pointerId = pointerId.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], pressure = pressure.asInstanceOf[js.Any], radiusX = radiusX.asInstanceOf[js.Any], radiusY = radiusY.asInstanceOf[js.Any], rotationAngle = rotationAngle.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], tangentialPressure = tangentialPressure.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], tiltX = tiltX.asInstanceOf[js.Any], tiltY = tiltY.asInstanceOf[js.Any], twist = twist.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormattedTouch]
    }
    
    extension [Self <: FormattedTouch](x: Self) {
      
      inline def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtons(value: Double): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setIsNormalized(value: Boolean): Self = StObject.set(x, "isNormalized", value.asInstanceOf[js.Any])
      
      inline def setIsPrimary(value: Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
      
      inline def setLayerY(value: Double): Self = StObject.set(x, "layerY", value.asInstanceOf[js.Any])
      
      inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      inline def setPointerId(value: Double): Self = StObject.set(x, "pointerId", value.asInstanceOf[js.Any])
      
      inline def setPointerType(value: String): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
      
      inline def setPressure(value: Double): Self = StObject.set(x, "pressure", value.asInstanceOf[js.Any])
      
      inline def setTangentialPressure(value: Double): Self = StObject.set(x, "tangentialPressure", value.asInstanceOf[js.Any])
      
      inline def setTiltX(value: Double): Self = StObject.set(x, "tiltX", value.asInstanceOf[js.Any])
      
      inline def setTiltY(value: Double): Self = StObject.set(x, "tiltY", value.asInstanceOf[js.Any])
      
      inline def setTwist(value: Double): Self = StObject.set(x, "twist", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
