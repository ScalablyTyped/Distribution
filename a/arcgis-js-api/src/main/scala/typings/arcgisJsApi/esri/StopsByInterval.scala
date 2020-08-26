package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopsByInterval extends Object {
  /**
    * Specifies a granularity of temporal data and allows you to visualize the data at specified intervals. It can be set at regular interval such as every hour or every day.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#StopsByInterval)
    */
  var interval: TimeInterval = js.native
  /**
    * A period of time with definitive start and end dates. The time slider widget's [fullTimeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#fullTimeExtent) will be used if this property is not specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#StopsByInterval)
    */
  var timeExtent: js.UndefOr[TimeExtent] = js.native
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
  implicit class StopsByIntervalOps[Self <: StopsByInterval] (val x: Self) extends AnyVal {
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
    def setInterval(value: TimeInterval): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeExtent(value: TimeExtent): Self = this.set("timeExtent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeExtent: Self = this.set("timeExtent", js.undefined)
  }
  
}

