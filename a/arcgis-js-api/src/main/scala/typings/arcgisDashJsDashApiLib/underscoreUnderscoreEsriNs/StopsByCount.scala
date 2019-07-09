package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopsByCount
  extends stdLib.Object {
  /**
    * Specifies number of stops count.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#StopsByCount)
    */
  var count: scala.Double
  /**
    * A period of time with definitive start and end dates. The time slider widget's [fullTimeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#fullTimeExtent) will be used if this property is not specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#StopsByCount)
    */
  var timeExtent: js.UndefOr[TimeExtent] = js.undefined
}

object StopsByCount {
  @scala.inline
  def apply(
    constructor: js.Function,
    count: scala.Double,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    timeExtent: TimeExtent = null
  ): StopsByCount = {
    val __obj = js.Dynamic.literal(constructor = constructor, count = count, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (timeExtent != null) __obj.updateDynamic("timeExtent")(timeExtent)
    __obj.asInstanceOf[StopsByCount]
  }
}

