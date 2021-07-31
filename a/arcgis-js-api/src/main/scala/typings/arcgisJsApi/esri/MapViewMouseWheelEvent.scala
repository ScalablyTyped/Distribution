package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`mouse-wheel`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapViewMouseWheelEvent extends StObject {
  
  var deltaY: Double
  
  var native: js.Any
  
  var stopPropagation: js.Function
  
  var timestamp: Double
  
  var `type`: `mouse-wheel`
  
  var x: Double
  
  var y: Double
}
object MapViewMouseWheelEvent {
  
  @scala.inline
  def apply(
    deltaY: Double,
    native: js.Any,
    stopPropagation: js.Function,
    timestamp: Double,
    x: Double,
    y: Double
  ): MapViewMouseWheelEvent = {
    val __obj = js.Dynamic.literal(deltaY = deltaY.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], stopPropagation = stopPropagation.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("mouse-wheel")
    __obj.asInstanceOf[MapViewMouseWheelEvent]
  }
  
  @scala.inline
  implicit class MapViewMouseWheelEventMutableBuilder[Self <: MapViewMouseWheelEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNative(value: js.Any): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopPropagation(value: js.Function): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `mouse-wheel`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
