package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGeoLocationsRequest extends js.Object {
  /**
    * (Optional) The maximum number of geolocations to be included in the response body for this request. If more than maxitems geolocations remain to be listed, then the value of the IsTruncated element in the response is true.
    */
  var MaxItems: js.UndefOr[PageMaxItems] = js.undefined
  /**
    * The code for the continent with which you want to start listing locations that Amazon Route 53 supports for geolocation. If Route 53 has already returned a page or more of results, if IsTruncated is true, and if NextContinentCode from the previous response has a value, enter that value in startcontinentcode to return the next page of results. Include startcontinentcode only if you want to list continents. Don't include startcontinentcode when you're listing countries or countries with their subdivisions.
    */
  var StartContinentCode: js.UndefOr[GeoLocationContinentCode] = js.undefined
  /**
    * The code for the country with which you want to start listing locations that Amazon Route 53 supports for geolocation. If Route 53 has already returned a page or more of results, if IsTruncated is true, and if NextCountryCode from the previous response has a value, enter that value in startcountrycode to return the next page of results. Route 53 uses the two-letter country codes that are specified in ISO standard 3166-1 alpha-2.
    */
  var StartCountryCode: js.UndefOr[GeoLocationCountryCode] = js.undefined
  /**
    * The code for the subdivision (for example, state or province) with which you want to start listing locations that Amazon Route 53 supports for geolocation. If Route 53 has already returned a page or more of results, if IsTruncated is true, and if NextSubdivisionCode from the previous response has a value, enter that value in startsubdivisioncode to return the next page of results. To list subdivisions of a country, you must include both startcountrycode and startsubdivisioncode.
    */
  var StartSubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.undefined
}

object ListGeoLocationsRequest {
  @scala.inline
  def apply(
    MaxItems: PageMaxItems = null,
    StartContinentCode: GeoLocationContinentCode = null,
    StartCountryCode: GeoLocationCountryCode = null,
    StartSubdivisionCode: GeoLocationSubdivisionCode = null
  ): ListGeoLocationsRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxItems != null) __obj.updateDynamic("MaxItems")(MaxItems)
    if (StartContinentCode != null) __obj.updateDynamic("StartContinentCode")(StartContinentCode)
    if (StartCountryCode != null) __obj.updateDynamic("StartCountryCode")(StartCountryCode)
    if (StartSubdivisionCode != null) __obj.updateDynamic("StartSubdivisionCode")(StartSubdivisionCode)
    __obj.asInstanceOf[ListGeoLocationsRequest]
  }
}

