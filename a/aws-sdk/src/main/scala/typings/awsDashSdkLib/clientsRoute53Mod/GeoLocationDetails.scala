package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoLocationDetails extends js.Object {
  /**
    * The two-letter code for the continent.
    */
  var ContinentCode: js.UndefOr[GeoLocationContinentCode] = js.undefined
  /**
    * The full name of the continent.
    */
  var ContinentName: js.UndefOr[GeoLocationContinentName] = js.undefined
  /**
    * The two-letter code for the country.
    */
  var CountryCode: js.UndefOr[GeoLocationCountryCode] = js.undefined
  /**
    * The name of the country.
    */
  var CountryName: js.UndefOr[GeoLocationCountryName] = js.undefined
  /**
    * The code for the subdivision. Route 53 currently supports only states in the United States.
    */
  var SubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.undefined
  /**
    * The full name of the subdivision. Route 53 currently supports only states in the United States.
    */
  var SubdivisionName: js.UndefOr[GeoLocationSubdivisionName] = js.undefined
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
    if (ContinentCode != null) __obj.updateDynamic("ContinentCode")(ContinentCode)
    if (ContinentName != null) __obj.updateDynamic("ContinentName")(ContinentName)
    if (CountryCode != null) __obj.updateDynamic("CountryCode")(CountryCode)
    if (CountryName != null) __obj.updateDynamic("CountryName")(CountryName)
    if (SubdivisionCode != null) __obj.updateDynamic("SubdivisionCode")(SubdivisionCode)
    if (SubdivisionName != null) __obj.updateDynamic("SubdivisionName")(SubdivisionName)
    __obj.asInstanceOf[GeoLocationDetails]
  }
}

