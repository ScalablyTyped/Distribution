package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`double-click`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapViewDoubleClickEvent extends StObject {
  
  var button: Double
  
  var buttons: js.Any
  
  var mapPoint: Point
  
  var native: js.Any
  
  var stopPropagation: js.Function
  
  var timestamp: Double
  
  var `type`: `double-click`
  
  var x: Double
  
  var y: Double
}
object MapViewDoubleClickEvent {
  
  @scala.inline
  def apply(
    button: Double,
    buttons: js.Any,
    mapPoint: Point,
    native: js.Any,
    stopPropagation: js.Function,
    timestamp: Double,
    x: Double,
    y: Double
  ): MapViewDoubleClickEvent = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], mapPoint = mapPoint.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], stopPropagation = stopPropagation.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("double-click")
    __obj.asInstanceOf[MapViewDoubleClickEvent]
  }
  
  @scala.inline
  implicit class MapViewDoubleClickEventMutableBuilder[Self <: MapViewDoubleClickEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtons(value: js.Any): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapPoint(value: Point): Self = StObject.set(x, "mapPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNative(value: js.Any): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopPropagation(value: js.Function): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `double-click`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
