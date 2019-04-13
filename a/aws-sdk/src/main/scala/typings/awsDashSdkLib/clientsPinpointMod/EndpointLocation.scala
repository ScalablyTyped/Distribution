package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointLocation extends js.Object {
  /**
    * The city where the endpoint is located.
    */
  var City: js.UndefOr[__string] = js.undefined
  /**
    * The two-letter code for the country or region of the endpoint. Specified as an ISO 3166-1 alpha-2 code, such as "US" for the United States.
    */
  var Country: js.UndefOr[__string] = js.undefined
  /**
    * The latitude of the endpoint location, rounded to one decimal place.
    */
  var Latitude: js.UndefOr[__double] = js.undefined
  /**
    * The longitude of the endpoint location, rounded to one decimal place.
    */
  var Longitude: js.UndefOr[__double] = js.undefined
  /**
    * The postal code or zip code of the endpoint.
    */
  var PostalCode: js.UndefOr[__string] = js.undefined
  /**
    * The region of the endpoint location. For example, in the United States, this corresponds to a state.
    */
  var Region: js.UndefOr[__string] = js.undefined
}

object EndpointLocation {
  @scala.inline
  def apply(
    City: __string = null,
    Country: __string = null,
    Latitude: js.UndefOr[__double] = js.undefined,
    Longitude: js.UndefOr[__double] = js.undefined,
    PostalCode: __string = null,
    Region: __string = null
  ): EndpointLocation = {
    val __obj = js.Dynamic.literal()
    if (City != null) __obj.updateDynamic("City")(City)
    if (Country != null) __obj.updateDynamic("Country")(Country)
    if (!js.isUndefined(Latitude)) __obj.updateDynamic("Latitude")(Latitude)
    if (!js.isUndefined(Longitude)) __obj.updateDynamic("Longitude")(Longitude)
    if (PostalCode != null) __obj.updateDynamic("PostalCode")(PostalCode)
    if (Region != null) __obj.updateDynamic("Region")(Region)
    __obj.asInstanceOf[EndpointLocation]
  }
}

