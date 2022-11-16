package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopsByInterval extends StObject {
  
  /**
    * Specifies a granularity of temporal data and allows you to visualize the data at specified intervals.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#StopsByInterval)
    */
  var interval: TimeInterval
  
  /**
    * A period of time with definitive start and end dates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#StopsByInterval)
    */
  var timeExtent: js.UndefOr[TimeExtent] = js.undefined
}
object StopsByInterval {
  
  inline def apply(interval: TimeInterval): StopsByInterval = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopsByInterval]
  }
  
  extension [Self <: StopsByInterval](x: Self) {
    
    inline def setInterval(value: TimeInterval): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setTimeExtent(value: TimeExtent): Self = StObject.set(x, "timeExtent", value.asInstanceOf[js.Any])
    
    inline def setTimeExtentUndefined: Self = StObject.set(x, "timeExtent", js.undefined)
  }
}
