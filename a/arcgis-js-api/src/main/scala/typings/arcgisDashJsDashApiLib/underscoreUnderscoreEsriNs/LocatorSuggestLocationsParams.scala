package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocatorSuggestLocationsParams
  extends stdLib.Object {
  /**
    * A place or address type which can be used to filter suggest results. The parameter supports input of single category values or multiple comma-separated values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#suggestLocations)
    */
  var categories: js.UndefOr[js.Array[java.lang.String]] = js.undefined
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
  var text: java.lang.String
}

object LocatorSuggestLocationsParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    location: Point,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    text: java.lang.String,
    categories: js.Array[java.lang.String] = null
  ): LocatorSuggestLocationsParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), location = location, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), text = text)
    if (categories != null) __obj.updateDynamic("categories")(categories)
    __obj.asInstanceOf[LocatorSuggestLocationsParams]
  }
}

