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
  var categories: js.Array[java.lang.String]
  /**
    * Used with the `location` property. The `distance` property specifies the radial distance from the location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#suggestLocations)
    */
  var distance: scala.Double
  /**
    * Defines a normalized location point that is used with the distance parameter to sort geocoding candidates based upon their proximity to the given location.
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
    categories: js.Array[java.lang.String],
    constructor: js.Function,
    distance: scala.Double,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    location: Point,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    text: java.lang.String
  ): LocatorSuggestLocationsParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("categories")(categories)
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("distance")(distance)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("location")(location)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[LocatorSuggestLocationsParams]
  }
}

