package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopsByInterval
  extends StObject
     with Object {
  
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
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    interval: TimeInterval,
    propertyIsEnumerable: PropertyKey => Boolean
  ): StopsByInterval = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), interval = interval.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[StopsByInterval]
  }
  
  @scala.inline
  implicit class StopsByIntervalMutableBuilder[Self <: StopsByInterval] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterval(value: TimeInterval): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeExtent(value: TimeExtent): Self = StObject.set(x, "timeExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeExtentUndefined: Self = StObject.set(x, "timeExtent", js.undefined)
  }
}
