package typings.arcgisJsApi.esri

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
  
  var button: js.Any
  
  var buttons: Double
  
  var native: js.Any
  
  var origin: ViewDragEventOrigin
  
  var radius: Double
  
  var stopPropagation: js.Function
  
  var timestamp: Double
  
  var `type`: drag
  
  var x: Double
  
  var y: Double
}
object ViewDragEvent {
  
  @scala.inline
  def apply(
    action: start | added | update | removed | end,
    angle: Double,
    button: js.Any,
    buttons: Double,
    native: js.Any,
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
  
  @scala.inline
  implicit class ViewDragEventMutableBuilder[Self <: ViewDragEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: start | added | update | removed | end): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButton(value: js.Any): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtons(value: Double): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNative(value: js.Any): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: ViewDragEventOrigin): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopPropagation(value: js.Function): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: drag): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
