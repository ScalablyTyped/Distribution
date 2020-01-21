package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocatorSuggestLocationsParams extends Object {
  /**
    * A place or address type which can be used to filter suggest results. The parameter supports input of single category values or multiple comma-separated values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#suggestLocations)
    */
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Defines a normalized location point that is used to sort geocoding candidates based upon their proximity to the given location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#suggestLocations)
    */
  var location: Point
  /**
    * The input text entered by a user which is used by the suggest operation to generate a list of possible matches.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#suggestLocations)
    */
  var text: String
}

object LocatorSuggestLocationsParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    location: Point,
    propertyIsEnumerable: PropertyKey => Boolean,
    text: String,
    categories: js.Array[String] = null
  ): LocatorSuggestLocationsParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), location = location.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), text = text.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocatorSuggestLocationsParams]
  }
}

