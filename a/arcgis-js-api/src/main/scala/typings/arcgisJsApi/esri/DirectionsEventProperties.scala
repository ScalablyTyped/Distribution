package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionsEventProperties extends StObject {
  
  /**
  		 * The date and time value indicating the arrival time at the Directions Event.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionsEvent.html#arriveTime)
  		 */
  var arriveTime: js.UndefOr[DateProperties] = js.undefined
  
  /**
  		 * The local time offset (in minutes) for the arrival time.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionsEvent.html#arriveTimeOffset)
  		 */
  var arriveTimeOffset: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The point location of the stop.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionsEvent.html#geometry)
  		 */
  var geometry: js.UndefOr[PointProperties] = js.undefined
  
  /**
  		 * An array of [direction strings](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionsFeatureSet.html#DirectionsString).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionsEvent.html#strings)
  		 */
  var strings: js.UndefOr[js.Array[DirectionsString]] = js.undefined
}
object DirectionsEventProperties {
  
  inline def apply(): DirectionsEventProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectionsEventProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectionsEventProperties] (val x: Self) extends AnyVal {
    
    inline def setArriveTime(value: DateProperties): Self = StObject.set(x, "arriveTime", value.asInstanceOf[js.Any])
    
    inline def setArriveTimeOffset(value: Double): Self = StObject.set(x, "arriveTimeOffset", value.asInstanceOf[js.Any])
    
    inline def setArriveTimeOffsetUndefined: Self = StObject.set(x, "arriveTimeOffset", js.undefined)
    
    inline def setArriveTimeUndefined: Self = StObject.set(x, "arriveTime", js.undefined)
    
    inline def setGeometry(value: PointProperties): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    inline def setStrings(value: js.Array[DirectionsString]): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
    
    inline def setStringsUndefined: Self = StObject.set(x, "strings", js.undefined)
    
    inline def setStringsVarargs(value: DirectionsString*): Self = StObject.set(x, "strings", js.Array(value*))
  }
}
