package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeDimensionInterval
  extends StObject
     with Object {
  
  /**
    * End of interval.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#TimeDimensionInterval)
    */
  var max: js.Date
  
  /**
    * Start of interval.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#TimeDimensionInterval)
    */
  var min: js.Date
  
  /**
    * Interval duration defined by the following properties.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#TimeDimensionInterval)
    */
  var resolution: TimeDimensionIntervalResolution
}
object TimeDimensionInterval {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    max: js.Date,
    min: js.Date,
    propertyIsEnumerable: PropertyKey => Boolean,
    resolution: TimeDimensionIntervalResolution
  ): TimeDimensionInterval = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), resolution = resolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeDimensionInterval]
  }
  
  extension [Self <: TimeDimensionInterval](x: Self) {
    
    inline def setMax(value: js.Date): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: js.Date): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setResolution(value: TimeDimensionIntervalResolution): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
  }
}
