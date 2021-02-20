package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebMapTimeSlider extends Object {
  
  /**
    * The current time extent of the time slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#TimeSlider)
    */
  var currentTimeExtent: js.UndefOr[TimeExtent] = js.native
  
  /**
    * The temporal extent for the entire slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#TimeSlider)
    */
  var fullTimeExtent: js.UndefOr[TimeExtent] = js.native
  
  /**
    * The number of stops.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#TimeSlider)
    */
  var numStops: js.UndefOr[Double] = js.native
  
  /**
    * The thumb count.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#TimeSlider)
    */
  var numThumbs: js.UndefOr[Double] = js.native
  
  /**
    * The time rate in milliseconds between animation steps.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#TimeSlider)
    */
  var stopDelay: js.UndefOr[Double] = js.native
  
  /**
    * Defines regularly spaced stops on the time slider from a [TimeInterval](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#TimeSlider)
    */
  var stopInterval: js.UndefOr[TimeInterval] = js.native
}
object WebMapTimeSlider {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): WebMapTimeSlider = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[WebMapTimeSlider]
  }
  
  @scala.inline
  implicit class WebMapTimeSliderMutableBuilder[Self <: WebMapTimeSlider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentTimeExtent(value: TimeExtent): Self = StObject.set(x, "currentTimeExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTimeExtentUndefined: Self = StObject.set(x, "currentTimeExtent", js.undefined)
    
    @scala.inline
    def setFullTimeExtent(value: TimeExtent): Self = StObject.set(x, "fullTimeExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullTimeExtentUndefined: Self = StObject.set(x, "fullTimeExtent", js.undefined)
    
    @scala.inline
    def setNumStops(value: Double): Self = StObject.set(x, "numStops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumStopsUndefined: Self = StObject.set(x, "numStops", js.undefined)
    
    @scala.inline
    def setNumThumbs(value: Double): Self = StObject.set(x, "numThumbs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumThumbsUndefined: Self = StObject.set(x, "numThumbs", js.undefined)
    
    @scala.inline
    def setStopDelay(value: Double): Self = StObject.set(x, "stopDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopDelayUndefined: Self = StObject.set(x, "stopDelay", js.undefined)
    
    @scala.inline
    def setStopInterval(value: TimeInterval): Self = StObject.set(x, "stopInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopIntervalUndefined: Self = StObject.set(x, "stopInterval", js.undefined)
  }
}
