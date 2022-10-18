package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProfileRequest extends StObject {
  
  /**
    * A unique account number that you have given to the customer.
    */
  var AccountNumber: js.UndefOr[string0To255] = js.undefined
  
  /**
    * Any additional information relevant to the customer’s profile.
    */
  var AdditionalInformation: js.UndefOr[string0To1000] = js.undefined
  
  /**
    * A generic address associated with the customer that is not mailing, shipping, or billing.
    */
  var Address: js.UndefOr[UpdateAddress] = js.undefined
  
  /**
    * A key value pair of attributes of a customer profile.
    */
  var Attributes: js.UndefOr[UpdateAttributes] = js.undefined
  
  /**
    * The customer’s billing address.
    */
  var BillingAddress: js.UndefOr[UpdateAddress] = js.undefined
  
  /**
    * The customer’s birth date. 
    */
  var BirthDate: js.UndefOr[string0To255] = js.undefined
  
  /**
    * The customer’s business email address.
    */
  var BusinessEmailAddress: js.UndefOr[string0To255] = js.undefined
  
  /**
    * The name of the customer’s business.
    */
  var BusinessName: js.UndefOr[string0To255] = js.undefined
  
  /**
    * The customer’s business phone number.
    */
  var BusinessPhoneNumber: js.UndefOr[string0To255] = js.undefined
  
  /**
    * The unique name of the domain.
    */
  var DomainName: name
  
  /**
    * The customer’s email address, which has not been specified as a personal or business address. 
    */
  var EmailAddress: js.UndefOr[string0To255] = js.undefined
  
  /**
    * The customer’s first name.
    */
  var FirstName: js.UndefOr[string0To255] = js.undefined
  
  /**
    * The gender with which the customer identifies. 
    */
  var Gender: js.UndefOr[typings.awsSdk.clientsCustomerprofilesMod.Gender] = js.undefined
  
  /**
    * The customer’s home phone number.
    */
  var HomePhoneNumber: js.UndefOr[string0To255] = js.undefined
  
  /**
    * The customer’s last name.
    */
  var LastName: js.UndefOr[string0To255] = js.undefined
  
  /**
    * The customer’s mailing address.
    */
  var MailingAddress: js.UndefOr[UpdateAddress] = js.undefined
  
  /**
    * The customer’s middle name.
    */
  var MiddleName: js.UndefOr[string0To255] = js.undefined
  
  /**
    * The customer’s mobile phone number.
    */
  var MobilePhoneNumber: js.UndefOr[string0To255] = js.undefined
  
  /**
    * The type of profile used to describe the customer.
    */
  var PartyType: js.UndefOr[typings.awsSdk.clientsCustomerprofilesMod.PartyType] = js.undefined
  
  /**
    * The customer’s personal email address.
    */
  var PersonalEmailAddress: js.UndefOr[string0To255] = js.undefined
  
  /**
    * The customer’s phone number, which has not been specified as a mobile, home, or business number. 
    */
  var PhoneNumber: js.UndefOr[string0To255] = js.undefined
  
  /**
    * The unique identifier of a customer profile.
    */
  var ProfileId: uuid
  
  /**
    * The customer’s shipping address.
    */
  var ShippingAddress: js.UndefOr[UpdateAddress] = js.undefined
}
object UpdateProfileRequest {
  
  inline def apply(DomainName: name, ProfileId: uuid): UpdateProfileRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], ProfileId = ProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProfileRequest]
  }
  
  extension [Self <: UpdateProfileRequest](x: Self) {
    
    inline def setAccountNumber(value: string0To255): Self = StObject.set(x, "AccountNumber", value.asInstanceOf[js.Any])
    
    inline def setAccountNumberUndefined: Self = StObject.set(x, "AccountNumber", js.undefined)
    
    inline def setAdditionalInformation(value: string0To1000): Self = StObject.set(x, "AdditionalInformation", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInformationUndefined: Self = StObject.set(x, "AdditionalInformation", js.undefined)
    
    inline def setAddress(value: UpdateAddress): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
    
    inline def setAttributes(value: UpdateAttributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setBillingAddress(value: UpdateAddress): Self = StObject.set(x, "BillingAddress", value.asInstanceOf[js.Any])
    
    inline def setBillingAddressUndefined: Self = StObject.set(x, "BillingAddress", js.undefined)
    
    inline def setBirthDate(value: string0To255): Self = StObject.set(x, "BirthDate", value.asInstanceOf[js.Any])
    
    inline def setBirthDateUndefined: Self = StObject.set(x, "BirthDate", js.undefined)
    
    inline def setBusinessEmailAddress(value: string0To255): Self = StObject.set(x, "BusinessEmailAddress", value.asInstanceOf[js.Any])
    
    inline def setBusinessEmailAddressUndefined: Self = StObject.set(x, "BusinessEmailAddress", js.undefined)
    
    inline def setBusinessName(value: string0To255): Self = StObject.set(x, "BusinessName", value.asInstanceOf[js.Any])
    
    inline def setBusinessNameUndefined: Self = StObject.set(x, "BusinessName", js.undefined)
    
    inline def setBusinessPhoneNumber(value: string0To255): Self = StObject.set(x, "BusinessPhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setBusinessPhoneNumberUndefined: Self = StObject.set(x, "BusinessPhoneNumber", js.undefined)
    
    inline def setDomainName(value: name): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setEmailAddress(value: string0To255): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "EmailAddress", js.undefined)
    
    inline def setFirstName(value: string0To255): Self = StObject.set(x, "FirstName", value.asInstanceOf[js.Any])
    
    inline def setFirstNameUndefined: Self = StObject.set(x, "FirstName", js.undefined)
    
    inline def setGender(value: Gender): Self = StObject.set(x, "Gender", value.asInstanceOf[js.Any])
    
    inline def setGenderUndefined: Self = StObject.set(x, "Gender", js.undefined)
    
    inline def setHomePhoneNumber(value: string0To255): Self = StObject.set(x, "HomePhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setHomePhoneNumberUndefined: Self = StObject.set(x, "HomePhoneNumber", js.undefined)
    
    inline def setLastName(value: string0To255): Self = StObject.set(x, "LastName", value.asInstanceOf[js.Any])
    
    inline def setLastNameUndefined: Self = StObject.set(x, "LastName", js.undefined)
    
    inline def setMailingAddress(value: UpdateAddress): Self = StObject.set(x, "MailingAddress", value.asInstanceOf[js.Any])
    
    inline def setMailingAddressUndefined: Self = StObject.set(x, "MailingAddress", js.undefined)
    
    inline def setMiddleName(value: string0To255): Self = StObject.set(x, "MiddleName", value.asInstanceOf[js.Any])
    
    inline def setMiddleNameUndefined: Self = StObject.set(x, "MiddleName", js.undefined)
    
    inline def setMobilePhoneNumber(value: string0To255): Self = StObject.set(x, "MobilePhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setMobilePhoneNumberUndefined: Self = StObject.set(x, "MobilePhoneNumber", js.undefined)
    
    inline def setPartyType(value: PartyType): Self = StObject.set(x, "PartyType", value.asInstanceOf[js.Any])
    
    inline def setPartyTypeUndefined: Self = StObject.set(x, "PartyType", js.undefined)
    
    inline def setPersonalEmailAddress(value: string0To255): Self = StObject.set(x, "PersonalEmailAddress", value.asInstanceOf[js.Any])
    
    inline def setPersonalEmailAddressUndefined: Self = StObject.set(x, "PersonalEmailAddress", js.undefined)
    
    inline def setPhoneNumber(value: string0To255): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "PhoneNumber", js.undefined)
    
    inline def setProfileId(value: uuid): Self = StObject.set(x, "ProfileId", value.asInstanceOf[js.Any])
    
    inline def setShippingAddress(value: UpdateAddress): Self = StObject.set(x, "ShippingAddress", value.asInstanceOf[js.Any])
    
    inline def setShippingAddressUndefined: Self = StObject.set(x, "ShippingAddress", js.undefined)
  }
}
