package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocatorLocationToAddressParams extends Object {
  /**
    * The point at which to search for the closest address. The location should be in the same spatial reference as that of the geocode service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#locationToAddress)
    */
  var location: Point = js.native
  /**
    * Define the type of location, either `"street"` or `"rooftop"`, of the point returned from the [World Geocoding Service](https://developers.arcgis.com/rest/geocode/api-reference/geocoding-category-filtering.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#locationToAddress)
    */
  var locationType: js.UndefOr[String] = js.native
}

object LocatorLocationToAddressParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    location: Point,
    propertyIsEnumerable: PropertyKey => Boolean
  ): LocatorLocationToAddressParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), location = location.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[LocatorLocationToAddressParams]
  }
  @scala.inline
  implicit class LocatorLocationToAddressParamsOps[Self <: LocatorLocationToAddressParams] (val x: Self) extends AnyVal {
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
    def setLocation(value: Point): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocationType(value: String): Self = this.set("locationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationType: Self = this.set("locationType", js.undefined)
  }
  
}

