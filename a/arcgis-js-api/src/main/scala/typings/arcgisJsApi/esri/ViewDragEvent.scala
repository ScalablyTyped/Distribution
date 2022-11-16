package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiInts.`0`
import typings.arcgisJsApi.arcgisJsApiInts.`1`
import typings.arcgisJsApi.arcgisJsApiInts.`2`
import typings.arcgisJsApi.arcgisJsApiStrings.added
import typings.arcgisJsApi.arcgisJsApiStrings.drag
import typings.arcgisJsApi.arcgisJsApiStrings.end
import typings.arcgisJsApi.arcgisJsApiStrings.removed
import typings.arcgisJsApi.arcgisJsApiStrings.start
import typings.arcgisJsApi.arcgisJsApiStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewDragEvent extends StObject {
  
  var action: start | added | update | removed | end
  
  var angle: Double
  
  var button: `0` | `1` | `2`
  
  var buttons: Double
  
  var native: Any
  
  var origin: ViewDragEventOrigin
  
  var radius: Double
  
  var stopPropagation: js.Function
  
  var timestamp: Double
  
  var `type`: drag
  
  var x: Double
  
  var y: Double
}
object ViewDragEvent {
  
  inline def apply(
    action: start | added | update | removed | end,
    angle: Double,
    button: `0` | `1` | `2`,
    buttons: Double,
    native: Any,
    origin: ViewDragEventOrigin,
    radius: Double,
    stopPropagation: js.Function,
    timestamp: Double,
    x: Double,
    y: Double
  ): ViewDragEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], angle = angle.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], stopPropagation = stopPropagation.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("drag")
    __obj.asInstanceOf[ViewDragEvent]
  }
  
  extension [Self <: ViewDragEvent](x: Self) {
    
    inline def setAction(value: start | added | update | removed | end): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setButton(value: `0` | `1` | `2`): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtons(value: Double): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setNative(value: Any): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: ViewDragEventOrigin): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setStopPropagation(value: js.Function): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: drag): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
