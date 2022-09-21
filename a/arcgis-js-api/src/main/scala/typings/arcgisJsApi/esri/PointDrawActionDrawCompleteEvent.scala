package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`draw-complete`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointDrawActionDrawCompleteEvent extends StObject {
  
  var coordinates: js.Array[Double]
  
  var defaultPrevented: Boolean
  
  var preventDefault: js.Function
  
  var `type`: `draw-complete`
}
object PointDrawActionDrawCompleteEvent {
  
  inline def apply(coordinates: js.Array[Double], defaultPrevented: Boolean, preventDefault: js.Function): PointDrawActionDrawCompleteEvent = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("draw-complete")
    __obj.asInstanceOf[PointDrawActionDrawCompleteEvent]
  }
  
  extension [Self <: PointDrawActionDrawCompleteEvent](x: Self) {
    
    inline def setCoordinates(value: js.Array[Double]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesVarargs(value: Double*): Self = StObject.set(x, "coordinates", js.Array(value*))
    
    inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
    
    inline def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    inline def setType(value: `draw-complete`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
