package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGeoLocationRequest extends js.Object {
  /**
    * Amazon Route 53 supports the following continent codes:    AF: Africa    AN: Antarctica    AS: Asia    EU: Europe    OC: Oceania    NA: North America    SA: South America  
    */
  var ContinentCode: js.UndefOr[GeoLocationContinentCode] = js.native
  /**
    * Amazon Route 53 uses the two-letter country codes that are specified in ISO standard 3166-1 alpha-2.
    */
  var CountryCode: js.UndefOr[GeoLocationCountryCode] = js.native
  /**
    * Amazon Route 53 uses the one- to three-letter subdivision codes that are specified in ISO standard 3166-1 alpha-2. Route 53 doesn't support subdivision codes for all countries. If you specify subdivisioncode, you must also specify countrycode. 
    */
  var SubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.native
}

object GetGeoLocationRequest {
  @scala.inline
  def apply(
    ContinentCode: GeoLocationContinentCode = null,
    CountryCode: GeoLocationCountryCode = null,
    SubdivisionCode: GeoLocationSubdivisionCode = null
  ): GetGeoLocationRequest = {
    val __obj = js.Dynamic.literal()
    if (ContinentCode != null) __obj.updateDynamic("ContinentCode")(ContinentCode.asInstanceOf[js.Any])
    if (CountryCode != null) __obj.updateDynamic("CountryCode")(CountryCode.asInstanceOf[js.Any])
    if (SubdivisionCode != null) __obj.updateDynamic("SubdivisionCode")(SubdivisionCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGeoLocationRequest]
  }
}

