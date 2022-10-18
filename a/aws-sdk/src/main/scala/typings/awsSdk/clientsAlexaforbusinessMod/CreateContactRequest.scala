package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateContactRequest extends StObject {
  
  /**
    * A unique, user-specified identifier for this request that ensures idempotency.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.ClientRequestToken] = js.undefined
  
  /**
    * The name of the contact to display on the console.
    */
  var DisplayName: js.UndefOr[ContactName] = js.undefined
  
  /**
    * The first name of the contact that is used to call the contact on the device.
    */
  var FirstName: ContactName
  
  /**
    * The last name of the contact that is used to call the contact on the device.
    */
  var LastName: js.UndefOr[ContactName] = js.undefined
  
  /**
    * The phone number of the contact in E.164 format. The phone number type defaults to WORK. You can specify PhoneNumber or PhoneNumbers. We recommend that you use PhoneNumbers, which lets you specify the phone number type and multiple numbers.
    */
  var PhoneNumber: js.UndefOr[RawPhoneNumber] = js.undefined
  
  /**
    * The list of phone numbers for the contact.
    */
  var PhoneNumbers: js.UndefOr[PhoneNumberList] = js.undefined
  
  /**
    * The list of SIP addresses for the contact.
    */
  var SipAddresses: js.UndefOr[SipAddressList] = js.undefined
  
  /**
    * The tags to be added to the specified resource. Do not provide system tags.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateContactRequest {
  
  inline def apply(FirstName: ContactName): CreateContactRequest = {
    val __obj = js.Dynamic.literal(FirstName = FirstName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateContactRequest]
  }
  
  extension [Self <: CreateContactRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setDisplayName(value: ContactName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setFirstName(value: ContactName): Self = StObject.set(x, "FirstName", value.asInstanceOf[js.Any])
    
    inline def setLastName(value: ContactName): Self = StObject.set(x, "LastName", value.asInstanceOf[js.Any])
    
    inline def setLastNameUndefined: Self = StObject.set(x, "LastName", js.undefined)
    
    inline def setPhoneNumber(value: RawPhoneNumber): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "PhoneNumber", js.undefined)
    
    inline def setPhoneNumbers(value: PhoneNumberList): Self = StObject.set(x, "PhoneNumbers", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumbersUndefined: Self = StObject.set(x, "PhoneNumbers", js.undefined)
    
    inline def setPhoneNumbersVarargs(value: PhoneNumber*): Self = StObject.set(x, "PhoneNumbers", js.Array(value*))
    
    inline def setSipAddresses(value: SipAddressList): Self = StObject.set(x, "SipAddresses", value.asInstanceOf[js.Any])
    
    inline def setSipAddressesUndefined: Self = StObject.set(x, "SipAddresses", js.undefined)
    
    inline def setSipAddressesVarargs(value: SipAddress*): Self = StObject.set(x, "SipAddresses", js.Array(value*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
