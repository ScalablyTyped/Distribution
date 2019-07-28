package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopsByInterval extends Object {
  /**
    * Specifies a granularity of temporal data and allows you to visualize the data at specified intervals. It can be set at regular interval such as every hour or every day.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#StopsByInterval)
    */
  var interval: TimeInterval
  /**
    * A period of time with definitive start and end dates. The time slider widget's [fullTimeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#fullTimeExtent) will be used if this property is not specified.
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
    propertyIsEnumerable: PropertyKey => Boolean,
    timeExtent: TimeExtent = null
  ): StopsByInterval = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), interval = interval, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (timeExtent != null) __obj.updateDynamic("timeExtent")(timeExtent)
    __obj.asInstanceOf[StopsByInterval]
  }
}

