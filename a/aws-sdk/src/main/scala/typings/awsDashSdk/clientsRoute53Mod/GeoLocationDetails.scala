package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoLocationDetails extends js.Object {
  /**
    * The two-letter code for the continent.
    */
  var ContinentCode: js.UndefOr[GeoLocationContinentCode] = js.native
  /**
    * The full name of the continent.
    */
  var ContinentName: js.UndefOr[GeoLocationContinentName] = js.native
  /**
    * The two-letter code for the country.
    */
  var CountryCode: js.UndefOr[GeoLocationCountryCode] = js.native
  /**
    * The name of the country.
    */
  var CountryName: js.UndefOr[GeoLocationCountryName] = js.native
  /**
    * The code for the subdivision. Route 53 currently supports only states in the United States.
    */
  var SubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.native
  /**
    * The full name of the subdivision. Route 53 currently supports only states in the United States.
    */
  var SubdivisionName: js.UndefOr[GeoLocationSubdivisionName] = js.native
}

object GeoLocationDetails {
  @scala.inline
  def apply(
    ContinentCode: GeoLocationContinentCode = null,
    ContinentName: GeoLocationContinentName = null,
    CountryCode: GeoLocationCountryCode = null,
    CountryName: GeoLocationCountryName = null,
    SubdivisionCode: GeoLocationSubdivisionCode = null,
    SubdivisionName: GeoLocationSubdivisionName = null
  ): GeoLocationDetails = {
    val __obj = js.Dynamic.literal()
    if (ContinentCode != null) __obj.updateDynamic("ContinentCode")(ContinentCode.asInstanceOf[js.Any])
    if (ContinentName != null) __obj.updateDynamic("ContinentName")(ContinentName.asInstanceOf[js.Any])
    if (CountryCode != null) __obj.updateDynamic("CountryCode")(CountryCode.asInstanceOf[js.Any])
    if (CountryName != null) __obj.updateDynamic("CountryName")(CountryName.asInstanceOf[js.Any])
    if (SubdivisionCode != null) __obj.updateDynamic("SubdivisionCode")(SubdivisionCode.asInstanceOf[js.Any])
    if (SubdivisionName != null) __obj.updateDynamic("SubdivisionName")(SubdivisionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoLocationDetails]
  }
}

