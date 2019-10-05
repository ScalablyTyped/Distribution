package typings.arcgisDashJsDashApi.__esri

import typings.std.Date
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopsByDates extends Object {
  /**
    * Array of dates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#StopsByDates)
    */
  var dates: js.Array[Date]
}

object StopsByDates {
  @scala.inline
  def apply(
    constructor: js.Function,
    dates: js.Array[Date],
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): StopsByDates = {
    val __obj = js.Dynamic.literal(constructor = constructor, dates = dates, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[StopsByDates]
  }
}

