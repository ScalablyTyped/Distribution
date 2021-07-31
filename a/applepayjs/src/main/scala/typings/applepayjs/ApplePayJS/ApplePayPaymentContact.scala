package typings.applepayjs.ApplePayJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Encapsulates contact information needed for billing and shipping.
  */
trait ApplePayPaymentContact extends StObject {
  
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
  def apply(): ApplePayPaymentContact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplePayPaymentContact]
  }
  
  @scala.inline
  implicit class ApplePayPaymentContactMutableBuilder[Self <: ApplePayPaymentContact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressLines(value: js.Array[String]): Self = StObject.set(x, "addressLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressLinesUndefined: Self = StObject.set(x, "addressLines", js.undefined)
    
    @scala.inline
    def setAddressLinesVarargs(value: String*): Self = StObject.set(x, "addressLines", js.Array(value :_*))
    
    @scala.inline
    def setAdministrativeArea(value: String): Self = StObject.set(x, "administrativeArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdministrativeAreaUndefined: Self = StObject.set(x, "administrativeArea", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    @scala.inline
    def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyNameUndefined: Self = StObject.set(x, "familyName", js.undefined)
    
    @scala.inline
    def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGivenNameUndefined: Self = StObject.set(x, "givenName", js.undefined)
    
    @scala.inline
    def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    @scala.inline
    def setPhoneticFamilyName(value: String): Self = StObject.set(x, "phoneticFamilyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneticFamilyNameUndefined: Self = StObject.set(x, "phoneticFamilyName", js.undefined)
    
    @scala.inline
    def setPhoneticGivenName(value: String): Self = StObject.set(x, "phoneticGivenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneticGivenNameUndefined: Self = StObject.set(x, "phoneticGivenName", js.undefined)
    
    @scala.inline
    def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    @scala.inline
    def setSubAdministrativeArea(value: String): Self = StObject.set(x, "subAdministrativeArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubAdministrativeAreaUndefined: Self = StObject.set(x, "subAdministrativeArea", js.undefined)
    
    @scala.inline
    def setSubLocality(value: String): Self = StObject.set(x, "subLocality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubLocalityUndefined: Self = StObject.set(x, "subLocality", js.undefined)
  }
}
