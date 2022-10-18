package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldSourceProfileIds extends StObject {
  
  /**
    * A unique identifier for the account number field to be merged. 
    */
  var AccountNumber: js.UndefOr[uuid] = js.undefined
  
  /**
    * A unique identifier for the additional information field to be merged.
    */
  var AdditionalInformation: js.UndefOr[uuid] = js.undefined
  
  /**
    * A unique identifier for the party type field to be merged.
    */
  var Address: js.UndefOr[uuid] = js.undefined
  
  /**
    * A unique identifier for the attributes field to be merged.
    */
  var Attributes: js.UndefOr[AttributeSourceIdMap] = js.undefined
  
  /**
    * A unique identifier for the billing type field to be merged.
    */
  var BillingAddress: js.UndefOr[uuid] = js.undefined
  
  /**
    * A unique identifier for the birthdate field to be merged.
    */
  var BirthDate: js.UndefOr[uuid] = js.undefined
  
  /**
    * A unique identifier for the party type field to be merged.
    */
  var BusinessEmailAddress: js.UndefOr[uuid] = js.undefined
  
  /**
    * A unique identifier for the business name field to be merged.
    */
  var BusinessName: js.UndefOr[uuid] = js.undefined
  
  /**
    * A unique identifier for the business phone number field to be merged.
    */
  var BusinessPhoneNumber: js.UndefOr[uuid] = js.undefined
  
  /**
    * A unique identifier for the email address field to be merged.
    */
  var EmailAddress: js.UndefOr[uuid] = js.undefined
  
  /**
    * A unique identifier for the first name field to be merged.
    */
  var FirstName: js.UndefOr[uuid] = js.undefined
  
  /**
    * A unique identifier for the gender field to be merged.
    */
  var Gender: js.UndefOr[uuid] = js.undefined
  
  /**
    * A unique identifier for the home phone number field to be merged.
    */
  var HomePhoneNumber: js.UndefOr[uuid] = js.undefined
  
  /**
    * A unique identifier for the last name field to be merged.
    */
  var LastName: js.UndefOr[uuid] = js.undefined
  
  /**
    * A unique identifier for the mailing address field to be merged.
    */
  var MailingAddress: js.UndefOr[uuid] = js.undefined
  
  /**
    * A unique identifier for the middle name field to be merged.
    */
  var MiddleName: js.UndefOr[uuid] = js.undefined
  
  /**
    * A unique identifier for the mobile phone number field to be merged.
    */
  var MobilePhoneNumber: js.UndefOr[uuid] = js.undefined
  
  /**
    * A unique identifier for the party type field to be merged.
    */
  var PartyType: js.UndefOr[uuid] = js.undefined
  
  /**
    * A unique identifier for the personal email address field to be merged.
    */
  var PersonalEmailAddress: js.UndefOr[uuid] = js.undefined
  
  /**
    * A unique identifier for the phone number field to be merged.
    */
  var PhoneNumber: js.UndefOr[uuid] = js.undefined
  
  /**
    * A unique identifier for the shipping address field to be merged.
    */
  var ShippingAddress: js.UndefOr[uuid] = js.undefined
}
object FieldSourceProfileIds {
  
  inline def apply(): FieldSourceProfileIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldSourceProfileIds]
  }
  
  extension [Self <: FieldSourceProfileIds](x: Self) {
    
    inline def setAccountNumber(value: uuid): Self = StObject.set(x, "AccountNumber", value.asInstanceOf[js.Any])
    
    inline def setAccountNumberUndefined: Self = StObject.set(x, "AccountNumber", js.undefined)
    
    inline def setAdditionalInformation(value: uuid): Self = StObject.set(x, "AdditionalInformation", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInformationUndefined: Self = StObject.set(x, "AdditionalInformation", js.undefined)
    
    inline def setAddress(value: uuid): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
    
    inline def setAttributes(value: AttributeSourceIdMap): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setBillingAddress(value: uuid): Self = StObject.set(x, "BillingAddress", value.asInstanceOf[js.Any])
    
    inline def setBillingAddressUndefined: Self = StObject.set(x, "BillingAddress", js.undefined)
    
    inline def setBirthDate(value: uuid): Self = StObject.set(x, "BirthDate", value.asInstanceOf[js.Any])
    
    inline def setBirthDateUndefined: Self = StObject.set(x, "BirthDate", js.undefined)
    
    inline def setBusinessEmailAddress(value: uuid): Self = StObject.set(x, "BusinessEmailAddress", value.asInstanceOf[js.Any])
    
    inline def setBusinessEmailAddressUndefined: Self = StObject.set(x, "BusinessEmailAddress", js.undefined)
    
    inline def setBusinessName(value: uuid): Self = StObject.set(x, "BusinessName", value.asInstanceOf[js.Any])
    
    inline def setBusinessNameUndefined: Self = StObject.set(x, "BusinessName", js.undefined)
    
    inline def setBusinessPhoneNumber(value: uuid): Self = StObject.set(x, "BusinessPhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setBusinessPhoneNumberUndefined: Self = StObject.set(x, "BusinessPhoneNumber", js.undefined)
    
    inline def setEmailAddress(value: uuid): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "EmailAddress", js.undefined)
    
    inline def setFirstName(value: uuid): Self = StObject.set(x, "FirstName", value.asInstanceOf[js.Any])
    
    inline def setFirstNameUndefined: Self = StObject.set(x, "FirstName", js.undefined)
    
    inline def setGender(value: uuid): Self = StObject.set(x, "Gender", value.asInstanceOf[js.Any])
    
    inline def setGenderUndefined: Self = StObject.set(x, "Gender", js.undefined)
    
    inline def setHomePhoneNumber(value: uuid): Self = StObject.set(x, "HomePhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setHomePhoneNumberUndefined: Self = StObject.set(x, "HomePhoneNumber", js.undefined)
    
    inline def setLastName(value: uuid): Self = StObject.set(x, "LastName", value.asInstanceOf[js.Any])
    
    inline def setLastNameUndefined: Self = StObject.set(x, "LastName", js.undefined)
    
    inline def setMailingAddress(value: uuid): Self = StObject.set(x, "MailingAddress", value.asInstanceOf[js.Any])
    
    inline def setMailingAddressUndefined: Self = StObject.set(x, "MailingAddress", js.undefined)
    
    inline def setMiddleName(value: uuid): Self = StObject.set(x, "MiddleName", value.asInstanceOf[js.Any])
    
    inline def setMiddleNameUndefined: Self = StObject.set(x, "MiddleName", js.undefined)
    
    inline def setMobilePhoneNumber(value: uuid): Self = StObject.set(x, "MobilePhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setMobilePhoneNumberUndefined: Self = StObject.set(x, "MobilePhoneNumber", js.undefined)
    
    inline def setPartyType(value: uuid): Self = StObject.set(x, "PartyType", value.asInstanceOf[js.Any])
    
    inline def setPartyTypeUndefined: Self = StObject.set(x, "PartyType", js.undefined)
    
    inline def setPersonalEmailAddress(value: uuid): Self = StObject.set(x, "PersonalEmailAddress", value.asInstanceOf[js.Any])
    
    inline def setPersonalEmailAddressUndefined: Self = StObject.set(x, "PersonalEmailAddress", js.undefined)
    
    inline def setPhoneNumber(value: uuid): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "PhoneNumber", js.undefined)
    
    inline def setShippingAddress(value: uuid): Self = StObject.set(x, "ShippingAddress", value.asInstanceOf[js.Any])
    
    inline def setShippingAddressUndefined: Self = StObject.set(x, "ShippingAddress", js.undefined)
  }
}
