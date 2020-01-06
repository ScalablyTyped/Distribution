package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGeoLocationsResponse extends js.Object {
  /**
    * A complex type that contains one GeoLocationDetails element for each location that Amazon Route 53 supports for geolocation.
    */
  var GeoLocationDetailsList: typings.awsDashSdk.clientsRoute53Mod.GeoLocationDetailsList = js.native
  /**
    * A value that indicates whether more locations remain to be listed after the last location in this response. If so, the value of IsTruncated is true. To get more values, submit another request and include the values of NextContinentCode, NextCountryCode, and NextSubdivisionCode in the startcontinentcode, startcountrycode, and startsubdivisioncode, as applicable.
    */
  var IsTruncated: PageTruncated = js.native
  /**
    * The value that you specified for MaxItems in the request.
    */
  var MaxItems: PageMaxItems = js.native
  /**
    * If IsTruncated is true, you can make a follow-up request to display more locations. Enter the value of NextContinentCode in the startcontinentcode parameter in another ListGeoLocations request.
    */
  var NextContinentCode: js.UndefOr[GeoLocationContinentCode] = js.native
  /**
    * If IsTruncated is true, you can make a follow-up request to display more locations. Enter the value of NextCountryCode in the startcountrycode parameter in another ListGeoLocations request.
    */
  var NextCountryCode: js.UndefOr[GeoLocationCountryCode] = js.native
  /**
    * If IsTruncated is true, you can make a follow-up request to display more locations. Enter the value of NextSubdivisionCode in the startsubdivisioncode parameter in another ListGeoLocations request.
    */
  var NextSubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.native
}

object ListGeoLocationsResponse {
  @scala.inline
  def apply(
    GeoLocationDetailsList: GeoLocationDetailsList,
    IsTruncated: PageTruncated,
    MaxItems: PageMaxItems,
    NextContinentCode: GeoLocationContinentCode = null,
    NextCountryCode: GeoLocationCountryCode = null,
    NextSubdivisionCode: GeoLocationSubdivisionCode = null
  ): ListGeoLocationsResponse = {
    val __obj = js.Dynamic.literal(GeoLocationDetailsList = GeoLocationDetailsList.asInstanceOf[js.Any], IsTruncated = IsTruncated.asInstanceOf[js.Any], MaxItems = MaxItems.asInstanceOf[js.Any])
    if (NextContinentCode != null) __obj.updateDynamic("NextContinentCode")(NextContinentCode.asInstanceOf[js.Any])
    if (NextCountryCode != null) __obj.updateDynamic("NextCountryCode")(NextCountryCode.asInstanceOf[js.Any])
    if (NextSubdivisionCode != null) __obj.updateDynamic("NextSubdivisionCode")(NextSubdivisionCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGeoLocationsResponse]
  }
}

