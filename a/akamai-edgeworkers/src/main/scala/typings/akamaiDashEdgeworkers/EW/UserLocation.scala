package typings.akamaiDashEdgeworkers.EW

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Notes:
  * * If the IP address is in the reserved IP space (as designated by the
  *   Internet Assigned Numbers Authority), every property will have the
  *   value of ‘reserved’.
  * * If user location properties can not be supplied for any reason,
  *   undefined is returned for that property
  */
trait UserLocation extends js.Object {
  /**
    * The city value is the city (within a 50-mile radius) that the IP
    * address maps to.
    */
  var city: js.UndefOr[String] = js.undefined
  /**
    * The continent value is a two-letter code for the continent that
    * the IP address maps to.
    */
  var continent: js.UndefOr[String] = js.undefined
  /**
    * The country value is an ISO-3166, two-letter code for the country
    * where the IP address maps to.
    */
  var country: js.UndefOr[String] = js.undefined
  /**
    * The region value is an ISO-3166, two-letter code for the state,
    * province, or region where the IP address maps to.
    */
  var region: js.UndefOr[String] = js.undefined
  /**
    * The zipCode value is the zipcode that the IP address maps to
    * (multiple values possible).
    *
    * Contiguous zip codes will be represented as a range of the form
    * "FirstZipInRange LastZipInRange", and multiple ranges may be
    * present (each range separated by the plus (+) character).
    *
    * For example, the following strings are all valid zipCode values:
    *
    * * 10001
    * * 10001+10003
    * * 10001-10003+10005
    * * 10001-10003+10005-10008
    *
    * For country = US and country = PR, zip refers to the 5 digit
    * zipcode.
    *
    * For country = CA, zip refers to the forward sortation area (FSA).
    * For more information on FSA, go to http://www.canadapost.ca and
    * search for FSA.
    *
    * See the EdgeScape Users Guide for more details.
    */
  var zipCode: js.UndefOr[String] = js.undefined
}

object UserLocation {
  @scala.inline
  def apply(
    city: String = null,
    continent: String = null,
    country: String = null,
    region: String = null,
    zipCode: String = null
  ): UserLocation = {
    val __obj = js.Dynamic.literal()
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (continent != null) __obj.updateDynamic("continent")(continent.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (zipCode != null) __obj.updateDynamic("zipCode")(zipCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserLocation]
  }
}

