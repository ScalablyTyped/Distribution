package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteIpDetails extends js.Object {
  /**
    * City information of the remote IP address.
    */
  var City: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.City] = js.undefined
  /**
    * Country code of the remote IP address.
    */
  var Country: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.Country] = js.undefined
  /**
    * Location information of the remote IP address.
    */
  var GeoLocation: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.GeoLocation] = js.undefined
  /**
    * IPV4 remote address of the connection.
    */
  var IpAddressV4: js.UndefOr[String] = js.undefined
  /**
    * ISP Organization information of the remote IP address.
    */
  var Organization: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.Organization] = js.undefined
}

object RemoteIpDetails {
  @scala.inline
  def apply(
    City: City = null,
    Country: Country = null,
    GeoLocation: GeoLocation = null,
    IpAddressV4: String = null,
    Organization: Organization = null
  ): RemoteIpDetails = {
    val __obj = js.Dynamic.literal()
    if (City != null) __obj.updateDynamic("City")(City)
    if (Country != null) __obj.updateDynamic("Country")(Country)
    if (GeoLocation != null) __obj.updateDynamic("GeoLocation")(GeoLocation)
    if (IpAddressV4 != null) __obj.updateDynamic("IpAddressV4")(IpAddressV4)
    if (Organization != null) __obj.updateDynamic("Organization")(Organization)
    __obj.asInstanceOf[RemoteIpDetails]
  }
}

