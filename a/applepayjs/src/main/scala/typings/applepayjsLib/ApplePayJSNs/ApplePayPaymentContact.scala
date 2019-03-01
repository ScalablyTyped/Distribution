package typings
package applepayjsLib.ApplePayJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Encapsulates contact information needed for billing and shipping.
  */
trait ApplePayPaymentContact extends js.Object {
  /**
    * The street portion of the address for the contact.
    */
  var addressLines: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The state for the contact.
    */
  var administrativeArea: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the country for the contact.
    */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The contact’s two-letter ISO 3166 country code.
    */
  var countryCode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An email address for the contact.
    */
  var emailAddress: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The contact's family name.
    */
  var familyName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The contact's given name.
    */
  var givenName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The city for the contact.
    */
  var locality: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A phone number for the contact.
    */
  var phoneNumber: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The phonetic spelling of the contact's family name.
    */
  var phoneticFamilyName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The phonetic spelling of the contact's given name.
    */
  var phoneticGivenName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The zip code or postal code, where applicable, for the contact.
    */
  var postalCode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The subadministrative area (such as a county or other region) in a postal address.
    */
  var subAdministrativeArea: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Additional information associated with the location, typically defined at the city or town level (such as district or neighborhood), in a postal address.
    */
  var subLocality: js.UndefOr[java.lang.String] = js.undefined
}

object ApplePayPaymentContact {
  @scala.inline
  def apply(
    addressLines: js.Array[java.lang.String] = null,
    administrativeArea: java.lang.String = null,
    country: java.lang.String = null,
    countryCode: java.lang.String = null,
    emailAddress: java.lang.String = null,
    familyName: java.lang.String = null,
    givenName: java.lang.String = null,
    locality: java.lang.String = null,
    phoneNumber: java.lang.String = null,
    phoneticFamilyName: java.lang.String = null,
    phoneticGivenName: java.lang.String = null,
    postalCode: java.lang.String = null,
    subAdministrativeArea: java.lang.String = null,
    subLocality: java.lang.String = null
  ): ApplePayPaymentContact = {
    val __obj = js.Dynamic.literal()
    if (addressLines != null) __obj.updateDynamic("addressLines")(addressLines)
    if (administrativeArea != null) __obj.updateDynamic("administrativeArea")(administrativeArea)
    if (country != null) __obj.updateDynamic("country")(country)
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode)
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress)
    if (familyName != null) __obj.updateDynamic("familyName")(familyName)
    if (givenName != null) __obj.updateDynamic("givenName")(givenName)
    if (locality != null) __obj.updateDynamic("locality")(locality)
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber)
    if (phoneticFamilyName != null) __obj.updateDynamic("phoneticFamilyName")(phoneticFamilyName)
    if (phoneticGivenName != null) __obj.updateDynamic("phoneticGivenName")(phoneticGivenName)
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode)
    if (subAdministrativeArea != null) __obj.updateDynamic("subAdministrativeArea")(subAdministrativeArea)
    if (subLocality != null) __obj.updateDynamic("subLocality")(subLocality)
    __obj.asInstanceOf[ApplePayPaymentContact]
  }
}

