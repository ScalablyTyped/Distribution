package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`cursor-update`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CursorUpdateEventInfo
  extends StObject
     with CreateToolEventInfo {
  
  /**
  		 * An array of numbers representing the coordinates of the cursor location.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#CursorUpdateEventInfo)
  		 */
  var coordinates: js.Array[Double]
  
  /**
  		 * Type is always `cursor-update`.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#CursorUpdateEventInfo)
  		 */
  var `type`: `cursor-update`
}
object CursorUpdateEventInfo {
  
  inline def apply(coordinates: js.Array[Double]): CursorUpdateEventInfo = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("cursor-update")
    __obj.asInstanceOf[CursorUpdateEventInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CursorUpdateEventInfo] (val x: Self) extends AnyVal {
    
    inline def setCoordinates(value: js.Array[Double]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesVarargs(value: Double*): Self = StObject.set(x, "coordinates", js.Array(value*))
    
    inline def setType(value: `cursor-update`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
