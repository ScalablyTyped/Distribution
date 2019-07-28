package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoLocation extends js.Object {
  /**
    * The two-letter code for the continent. Valid values: AF | AN | AS | EU | OC | NA | SA  Constraint: Specifying ContinentCode with either CountryCode or SubdivisionCode returns an InvalidInput error.
    */
  var ContinentCode: js.UndefOr[GeoLocationContinentCode] = js.undefined
  /**
    * The two-letter code for the country.
    */
  var CountryCode: js.UndefOr[GeoLocationCountryCode] = js.undefined
  /**
    * The code for the subdivision. Route 53 currently supports only states in the United States.
    */
  var SubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.undefined
}

object GeoLocation {
  @scala.inline
  def apply(
    ContinentCode: GeoLocationContinentCode = null,
    CountryCode: GeoLocationCountryCode = null,
    SubdivisionCode: GeoLocationSubdivisionCode = null
  ): GeoLocation = {
    val __obj = js.Dynamic.literal()
    if (ContinentCode != null) __obj.updateDynamic("ContinentCode")(ContinentCode)
    if (CountryCode != null) __obj.updateDynamic("CountryCode")(CountryCode)
    if (SubdivisionCode != null) __obj.updateDynamic("SubdivisionCode")(SubdivisionCode)
    __obj.asInstanceOf[GeoLocation]
  }
}

