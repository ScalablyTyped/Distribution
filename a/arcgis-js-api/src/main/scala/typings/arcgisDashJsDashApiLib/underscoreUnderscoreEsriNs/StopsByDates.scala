package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopsByDates
  extends stdLib.Object {
  /**
    * Array of dates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#StopsByDates)
    */
  var dates: js.Array[stdLib.Date]
}

object StopsByDates {
  @scala.inline
  def apply(
    constructor: js.Function,
    dates: js.Array[stdLib.Date],
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean
  ): StopsByDates = {
    val __obj = js.Dynamic.literal(constructor = constructor, dates = dates, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[StopsByDates]
  }
}

