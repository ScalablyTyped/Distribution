package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
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
  implicit class WebMapTimeSliderOps[Self <: WebMapTimeSlider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCurrentTimeExtent(value: TimeExtent): Self = this.set("currentTimeExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentTimeExtent: Self = this.set("currentTimeExtent", js.undefined)
    
    @scala.inline
    def setFullTimeExtent(value: TimeExtent): Self = this.set("fullTimeExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullTimeExtent: Self = this.set("fullTimeExtent", js.undefined)
    
    @scala.inline
    def setNumStops(value: Double): Self = this.set("numStops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumStops: Self = this.set("numStops", js.undefined)
    
    @scala.inline
    def setNumThumbs(value: Double): Self = this.set("numThumbs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumThumbs: Self = this.set("numThumbs", js.undefined)
    
    @scala.inline
    def setStopDelay(value: Double): Self = this.set("stopDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopDelay: Self = this.set("stopDelay", js.undefined)
    
    @scala.inline
    def setStopInterval(value: TimeInterval): Self = this.set("stopInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopInterval: Self = this.set("stopInterval", js.undefined)
  }
}
