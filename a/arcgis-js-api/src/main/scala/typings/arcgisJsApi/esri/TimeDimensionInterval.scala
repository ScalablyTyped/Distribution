package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeDimensionInterval extends StObject {
  
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
  
  inline def apply(max: js.Date, min: js.Date, resolution: TimeDimensionIntervalResolution): TimeDimensionInterval = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeDimensionInterval]
  }
  
  extension [Self <: TimeDimensionInterval](x: Self) {
    
    inline def setMax(value: js.Date): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: js.Date): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setResolution(value: TimeDimensionIntervalResolution): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
  }
}
