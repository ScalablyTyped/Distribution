package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`cursor-update`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointDrawActionCursorUpdateEvent extends StObject {
  
  var coordinates: js.Array[Double]
  
  var defaultPrevented: Boolean
  
  var preventDefault: js.Function
  
  var `type`: `cursor-update`
}
object PointDrawActionCursorUpdateEvent {
  
  inline def apply(coordinates: js.Array[Double], defaultPrevented: Boolean, preventDefault: js.Function): PointDrawActionCursorUpdateEvent = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("cursor-update")
    __obj.asInstanceOf[PointDrawActionCursorUpdateEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PointDrawActionCursorUpdateEvent] (val x: Self) extends AnyVal {
    
    inline def setCoordinates(value: js.Array[Double]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesVarargs(value: Double*): Self = StObject.set(x, "coordinates", js.Array(value*))
    
    inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
    
    inline def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    inline def setType(value: `cursor-update`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
