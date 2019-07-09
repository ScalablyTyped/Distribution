package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocatorLocationToAddressParams
  extends stdLib.Object {
  /**
    * The point at which to search for the closest address. The location should be in the same spatial reference as that of the geocode service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#locationToAddress)
    */
  var location: Point
  /**
    * Define the type of location, either `"street"` or `"rooftop"`, of the point returned from the [World Geocoding Service](https://developers.arcgis.com/rest/geocode/api-reference/geocoding-category-filtering.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#locationToAddress)
    */
  var locationType: js.UndefOr[java.lang.String] = js.undefined
}

object LocatorLocationToAddressParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    location: Point,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    locationType: java.lang.String = null
  ): LocatorLocationToAddressParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), location = location, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (locationType != null) __obj.updateDynamic("locationType")(locationType)
    __obj.asInstanceOf[LocatorLocationToAddressParams]
  }
}

