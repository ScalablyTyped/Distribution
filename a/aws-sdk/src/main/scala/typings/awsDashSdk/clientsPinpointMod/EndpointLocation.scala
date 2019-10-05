package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointLocation extends js.Object {
  /**
    * The name of the city where the endpoint is located.
    */
  var City: js.UndefOr[__string] = js.undefined
  /**
    * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region where the endpoint is located. For example, US for the United States.
    */
  var Country: js.UndefOr[__string] = js.undefined
  /**
    * The latitude coordinate of the endpoint location, rounded to one decimal place.
    */
  var Latitude: js.UndefOr[__double] = js.undefined
  /**
    * The longitude coordinate of the endpoint location, rounded to one decimal place.
    */
  var Longitude: js.UndefOr[__double] = js.undefined
  /**
    * The postal or ZIP code for the area where the endpoint is located.
    */
  var PostalCode: js.UndefOr[__string] = js.undefined
  /**
    * The name of the region where the endpoint is located. For locations in the United States, this value is the name of a state.
    */
  var Region: js.UndefOr[__string] = js.undefined
}

object EndpointLocation {
  @scala.inline
  def apply(
    City: __string = null,
    Country: __string = null,
    Latitude: Int | Double = null,
    Longitude: Int | Double = null,
    PostalCode: __string = null,
    Region: __string = null
  ): EndpointLocation = {
    val __obj = js.Dynamic.literal()
    if (City != null) __obj.updateDynamic("City")(City)
    if (Country != null) __obj.updateDynamic("Country")(Country)
    if (Latitude != null) __obj.updateDynamic("Latitude")(Latitude.asInstanceOf[js.Any])
    if (Longitude != null) __obj.updateDynamic("Longitude")(Longitude.asInstanceOf[js.Any])
    if (PostalCode != null) __obj.updateDynamic("PostalCode")(PostalCode)
    if (Region != null) __obj.updateDynamic("Region")(Region)
    __obj.asInstanceOf[EndpointLocation]
  }
}

