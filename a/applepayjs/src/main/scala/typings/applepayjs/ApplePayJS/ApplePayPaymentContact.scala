package typings.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Encapsulates contact information needed for billing and shipping.
  */
@js.native
trait ApplePayPaymentContact extends js.Object {
  
  /**
    * The street portion of the address for the contact.
    */
  var addressLines: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The state for the contact.
    */
  var administrativeArea: js.UndefOr[String] = js.native
  
  /**
    * The name of the country for the contact.
    */
  var country: js.UndefOr[String] = js.native
  
  /**
    * The contact’s two-letter ISO 3166 country code.
    */
  var countryCode: js.UndefOr[String] = js.native
  
  /**
    * An email address for the contact.
    */
  var emailAddress: js.UndefOr[String] = js.native
  
  /**
    * The contact's family name.
    */
  var familyName: js.UndefOr[String] = js.native
  
  /**
    * The contact's given name.
    */
  var givenName: js.UndefOr[String] = js.native
  
  /**
    * The city for the contact.
    */
  var locality: js.UndefOr[String] = js.native
  
  /**
    * A phone number for the contact.
    */
  var phoneNumber: js.UndefOr[String] = js.native
  
  /**
    * The phonetic spelling of the contact's family name.
    */
  var phoneticFamilyName: js.UndefOr[String] = js.native
  
  /**
    * The phonetic spelling of the contact's given name.
    */
  var phoneticGivenName: js.UndefOr[String] = js.native
  
  /**
    * The zip code or postal code, where applicable, for the contact.
    */
  var postalCode: js.UndefOr[String] = js.native
  
  /**
    * The subadministrative area (such as a county or other region) in a postal address.
    */
  var subAdministrativeArea: js.UndefOr[String] = js.native
  
  /**
    * Additional information associated with the location, typically defined at the city or town level (such as district or neighborhood), in a postal address.
    */
  var subLocality: js.UndefOr[String] = js.native
}
object ApplePayPaymentContact {
  
  @scala.inline
  def apply(): ApplePayPaymentContact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplePayPaymentContact]
  }
  
  @scala.inline
  implicit class ApplePayPaymentContactOps[Self <: ApplePayPaymentContact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddressLinesVarargs(value: String*): Self = this.set("addressLines", js.Array(value :_*))
    
    @scala.inline
    def setAddressLines(value: js.Array[String]): Self = this.set("addressLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddressLines: Self = this.set("addressLines", js.undefined)
    
    @scala.inline
    def setAdministrativeArea(value: String): Self = this.set("administrativeArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdministrativeArea: Self = this.set("administrativeArea", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    
    @scala.inline
    def setCountryCode(value: String): Self = this.set("countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountryCode: Self = this.set("countryCode", js.undefined)
    
    @scala.inline
    def setEmailAddress(value: String): Self = this.set("emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailAddress: Self = this.set("emailAddress", js.undefined)
    
    @scala.inline
    def setFamilyName(value: String): Self = this.set("familyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFamilyName: Self = this.set("familyName", js.undefined)
    
    @scala.inline
    def setGivenName(value: String): Self = this.set("givenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGivenName: Self = this.set("givenName", js.undefined)
    
    @scala.inline
    def setLocality(value: String): Self = this.set("locality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocality: Self = this.set("locality", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneNumber: Self = this.set("phoneNumber", js.undefined)
    
    @scala.inline
    def setPhoneticFamilyName(value: String): Self = this.set("phoneticFamilyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneticFamilyName: Self = this.set("phoneticFamilyName", js.undefined)
    
    @scala.inline
    def setPhoneticGivenName(value: String): Self = this.set("phoneticGivenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneticGivenName: Self = this.set("phoneticGivenName", js.undefined)
    
    @scala.inline
    def setPostalCode(value: String): Self = this.set("postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostalCode: Self = this.set("postalCode", js.undefined)
    
    @scala.inline
    def setSubAdministrativeArea(value: String): Self = this.set("subAdministrativeArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubAdministrativeArea: Self = this.set("subAdministrativeArea", js.undefined)
    
    @scala.inline
    def setSubLocality(value: String): Self = this.set("subLocality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubLocality: Self = this.set("subLocality", js.undefined)
  }
}
