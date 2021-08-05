package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`pointer-down`
import typings.arcgisJsApi.arcgisJsApiStrings.mouse
import typings.arcgisJsApi.arcgisJsApiStrings.touch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneViewPointerDownEvent extends StObject {
  
  var button: Double
  
  var buttons: Double
  
  var native: js.Any
  
  var pointerId: Double
  
  var pointerType: mouse | touch
  
  var stopPropagation: js.Function
  
  var timestamp: Double
  
  var `type`: `pointer-down`
  
  var x: Double
  
  var y: Double
}
object SceneViewPointerDownEvent {
  
  inline def apply(
    button: Double,
    buttons: Double,
    native: js.Any,
    pointerId: Double,
    pointerType: mouse | touch,
    stopPropagation: js.Function,
    timestamp: Double,
    x: Double,
    y: Double
  ): SceneViewPointerDownEvent = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], pointerId = pointerId.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], stopPropagation = stopPropagation.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pointer-down")
    __obj.asInstanceOf[SceneViewPointerDownEvent]
  }
  
  extension [Self <: SceneViewPointerDownEvent](x: Self) {
    
    inline def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtons(value: Double): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setNative(value: js.Any): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
    
    inline def setPointerId(value: Double): Self = StObject.set(x, "pointerId", value.asInstanceOf[js.Any])
    
    inline def setPointerType(value: mouse | touch): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
    
    inline def setStopPropagation(value: js.Function): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: `pointer-down`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
