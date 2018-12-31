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

