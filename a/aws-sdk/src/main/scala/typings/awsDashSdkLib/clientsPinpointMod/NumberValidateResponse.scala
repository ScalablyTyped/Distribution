package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberValidateResponse extends js.Object {
  /**
    * The carrier or service provider that the phone number is currently registered with. In some countries and regions, this value may be the carrier or service provider that the phone number was originally registered with.
    */
  var Carrier: js.UndefOr[__string] = js.undefined
  /**
    * The name of the city where the phone number was originally registered.
    */
  var City: js.UndefOr[__string] = js.undefined
  /**
    * The cleansed phone number, in E.164 format, for the location where the phone number was originally registered.
    */
  var CleansedPhoneNumberE164: js.UndefOr[__string] = js.undefined
  /**
    * The cleansed phone number, in the format for the location where the phone number was originally registered.
    */
  var CleansedPhoneNumberNational: js.UndefOr[__string] = js.undefined
  /**
    * The name of the country or region where the phone number was originally registered.
    */
  var Country: js.UndefOr[__string] = js.undefined
  /**
    * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region where the phone number was originally registered.
    */
  var CountryCodeIso2: js.UndefOr[__string] = js.undefined
  /**
    * The numeric code for the country or region where the phone number was originally registered.
    */
  var CountryCodeNumeric: js.UndefOr[__string] = js.undefined
  /**
    * The name of the county where the phone number was originally registered.
    */
  var County: js.UndefOr[__string] = js.undefined
  /**
    * The two-character code, in ISO 3166-1 alpha-2 format, that was sent in the request body.
    */
  var OriginalCountryCodeIso2: js.UndefOr[__string] = js.undefined
  /**
    * The phone number that was sent in the request body.
    */
  var OriginalPhoneNumber: js.UndefOr[__string] = js.undefined
  /**
    * The description of the phone type. Valid values are: MOBILE, LANDLINE, VOIP,
    INVALID, PREPAID, and OTHER.
    */
  var PhoneType: js.UndefOr[__string] = js.undefined
  /**
    * The phone type, represented by an integer. Valid values are: 0 (mobile), 1 (landline), 2 (VoIP), 3 (invalid), 4 (other), and 5 (prepaid).
    */
  var PhoneTypeCode: js.UndefOr[__integer] = js.undefined
  /**
    * The time zone for the location where the phone number was originally registered.
    */
  var Timezone: js.UndefOr[__string] = js.undefined
  /**
    * The postal or ZIP code for the location where the phone number was originally registered.
    */
  var ZipCode: js.UndefOr[__string] = js.undefined
}

object NumberValidateResponse {
  @scala.inline
  def apply(
    Carrier: __string = null,
    City: __string = null,
    CleansedPhoneNumberE164: __string = null,
    CleansedPhoneNumberNational: __string = null,
    Country: __string = null,
    CountryCodeIso2: __string = null,
    CountryCodeNumeric: __string = null,
    County: __string = null,
    OriginalCountryCodeIso2: __string = null,
    OriginalPhoneNumber: __string = null,
    PhoneType: __string = null,
    PhoneTypeCode: js.UndefOr[__integer] = js.undefined,
    Timezone: __string = null,
    ZipCode: __string = null
  ): NumberValidateResponse = {
    val __obj = js.Dynamic.literal()
    if (Carrier != null) __obj.updateDynamic("Carrier")(Carrier)
    if (City != null) __obj.updateDynamic("City")(City)
    if (CleansedPhoneNumberE164 != null) __obj.updateDynamic("CleansedPhoneNumberE164")(CleansedPhoneNumberE164)
    if (CleansedPhoneNumberNational != null) __obj.updateDynamic("CleansedPhoneNumberNational")(CleansedPhoneNumberNational)
    if (Country != null) __obj.updateDynamic("Country")(Country)
    if (CountryCodeIso2 != null) __obj.updateDynamic("CountryCodeIso2")(CountryCodeIso2)
    if (CountryCodeNumeric != null) __obj.updateDynamic("CountryCodeNumeric")(CountryCodeNumeric)
    if (County != null) __obj.updateDynamic("County")(County)
    if (OriginalCountryCodeIso2 != null) __obj.updateDynamic("OriginalCountryCodeIso2")(OriginalCountryCodeIso2)
    if (OriginalPhoneNumber != null) __obj.updateDynamic("OriginalPhoneNumber")(OriginalPhoneNumber)
    if (PhoneType != null) __obj.updateDynamic("PhoneType")(PhoneType)
    if (!js.isUndefined(PhoneTypeCode)) __obj.updateDynamic("PhoneTypeCode")(PhoneTypeCode)
    if (Timezone != null) __obj.updateDynamic("Timezone")(Timezone)
    if (ZipCode != null) __obj.updateDynamic("ZipCode")(ZipCode)
    __obj.asInstanceOf[NumberValidateResponse]
  }
}

