package typings.applepayjs.ApplePayJS

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
  var addressLines: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The state for the contact.
    */
  var administrativeArea: js.UndefOr[String] = js.undefined
  /**
    * The name of the country for the contact.
    */
  var country: js.UndefOr[String] = js.undefined
  /**
    * The contact’s two-letter ISO 3166 country code.
    */
  var countryCode: js.UndefOr[String] = js.undefined
  /**
    * An email address for the contact.
    */
  var emailAddress: js.UndefOr[String] = js.undefined
  /**
    * The contact's family name.
    */
  var familyName: js.UndefOr[String] = js.undefined
  /**
    * The contact's given name.
    */
  var givenName: js.UndefOr[String] = js.undefined
  /**
    * The city for the contact.
    */
  var locality: js.UndefOr[String] = js.undefined
  /**
    * A phone number for the contact.
    */
  var phoneNumber: js.UndefOr[String] = js.undefined
  /**
    * The phonetic spelling of the contact's family name.
    */
  var phoneticFamilyName: js.UndefOr[String] = js.undefined
  /**
    * The phonetic spelling of the contact's given name.
    */
  var phoneticGivenName: js.UndefOr[String] = js.undefined
  /**
    * The zip code or postal code, where applicable, for the contact.
    */
  var postalCode: js.UndefOr[String] = js.undefined
  /**
    * The subadministrative area (such as a county or other region) in a postal address.
    */
  var subAdministrativeArea: js.UndefOr[String] = js.undefined
  /**
    * Additional information associated with the location, typically defined at the city or town level (such as district or neighborhood), in a postal address.
    */
  var subLocality: js.UndefOr[String] = js.undefined
}

object ApplePayPaymentContact {
  @scala.inline
  def apply(
    addressLines: js.Array[String] = null,
    administrativeArea: String = null,
    country: String = null,
    countryCode: String = null,
    emailAddress: String = null,
    familyName: String = null,
    givenName: String = null,
    locality: String = null,
    phoneNumber: String = null,
    phoneticFamilyName: String = null,
    phoneticGivenName: String = null,
    postalCode: String = null,
    subAdministrativeArea: String = null,
    subLocality: String = null
  ): ApplePayPaymentContact = {
    val __obj = js.Dynamic.literal()
    if (addressLines != null) __obj.updateDynamic("addressLines")(addressLines.asInstanceOf[js.Any])
    if (administrativeArea != null) __obj.updateDynamic("administrativeArea")(administrativeArea.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode.asInstanceOf[js.Any])
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress.asInstanceOf[js.Any])
    if (familyName != null) __obj.updateDynamic("familyName")(familyName.asInstanceOf[js.Any])
    if (givenName != null) __obj.updateDynamic("givenName")(givenName.asInstanceOf[js.Any])
    if (locality != null) __obj.updateDynamic("locality")(locality.asInstanceOf[js.Any])
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    if (phoneticFamilyName != null) __obj.updateDynamic("phoneticFamilyName")(phoneticFamilyName.asInstanceOf[js.Any])
    if (phoneticGivenName != null) __obj.updateDynamic("phoneticGivenName")(phoneticGivenName.asInstanceOf[js.Any])
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode.asInstanceOf[js.Any])
    if (subAdministrativeArea != null) __obj.updateDynamic("subAdministrativeArea")(subAdministrativeArea.asInstanceOf[js.Any])
    if (subLocality != null) __obj.updateDynamic("subLocality")(subLocality.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayPaymentContact]
  }
}

