package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiInts.`0`
import typings.arcgisJsApi.arcgisJsApiInts.`1`
import typings.arcgisJsApi.arcgisJsApiInts.`2`
import typings.arcgisJsApi.arcgisJsApiStrings.hold
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewHoldEvent extends StObject {
  
  var button: `0` | `1` | `2`
  
  var buttons: Double
  
  var mapPoint: Point
  
  var native: Any
  
  var stopPropagation: js.Function
  
  var timestamp: Double
  
  var `type`: hold
  
  var x: Double
  
  var y: Double
}
object ViewHoldEvent {
  
  inline def apply(
    button: `0` | `1` | `2`,
    buttons: Double,
    mapPoint: Point,
    native: Any,
    stopPropagation: js.Function,
    timestamp: Double,
    x: Double,
    y: Double
  ): ViewHoldEvent = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], mapPoint = mapPoint.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], stopPropagation = stopPropagation.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("hold")
    __obj.asInstanceOf[ViewHoldEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewHoldEvent] (val x: Self) extends AnyVal {
    
    inline def setButton(value: `0` | `1` | `2`): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtons(value: Double): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setMapPoint(value: Point): Self = StObject.set(x, "mapPoint", value.asInstanceOf[js.Any])
    
    inline def setNative(value: Any): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
    
    inline def setStopPropagation(value: js.Function): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: hold): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
