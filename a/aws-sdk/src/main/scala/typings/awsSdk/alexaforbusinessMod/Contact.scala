package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Contact extends StObject {
  
  /**
    * The ARN of the contact.
    */
  var ContactArn: js.UndefOr[Arn] = js.native
  
  /**
    * The name of the contact to display on the console.
    */
  var DisplayName: js.UndefOr[ContactName] = js.native
  
  /**
    * The first name of the contact, used to call the contact on the device.
    */
  var FirstName: js.UndefOr[ContactName] = js.native
  
  /**
    * The last name of the contact, used to call the contact on the device.
    */
  var LastName: js.UndefOr[ContactName] = js.native
  
  /**
    * The phone number of the contact. The phone number type defaults to WORK. You can either specify PhoneNumber or PhoneNumbers. We recommend that you use PhoneNumbers, which lets you specify the phone number type and multiple numbers.
    */
  var PhoneNumber: js.UndefOr[RawPhoneNumber] = js.native
  
  /**
    * The list of phone numbers for the contact.
    */
  var PhoneNumbers: js.UndefOr[PhoneNumberList] = js.native
  
  /**
    * The list of SIP addresses for the contact.
    */
  var SipAddresses: js.UndefOr[SipAddressList] = js.native
}
object Contact {
  
  @scala.inline
  def apply(): Contact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Contact]
  }
  
  @scala.inline
  implicit class ContactMutableBuilder[Self <: Contact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactArn(value: Arn): Self = StObject.set(x, "ContactArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactArnUndefined: Self = StObject.set(x, "ContactArn", js.undefined)
    
    @scala.inline
    def setDisplayName(value: ContactName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    @scala.inline
    def setFirstName(value: ContactName): Self = StObject.set(x, "FirstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstNameUndefined: Self = StObject.set(x, "FirstName", js.undefined)
    
    @scala.inline
    def setLastName(value: ContactName): Self = StObject.set(x, "LastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastNameUndefined: Self = StObject.set(x, "LastName", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: RawPhoneNumber): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberUndefined: Self = StObject.set(x, "PhoneNumber", js.undefined)
    
    @scala.inline
    def setPhoneNumbers(value: PhoneNumberList): Self = StObject.set(x, "PhoneNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumbersUndefined: Self = StObject.set(x, "PhoneNumbers", js.undefined)
    
    @scala.inline
    def setPhoneNumbersVarargs(value: PhoneNumber*): Self = StObject.set(x, "PhoneNumbers", js.Array(value :_*))
    
    @scala.inline
    def setSipAddresses(value: SipAddressList): Self = StObject.set(x, "SipAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSipAddressesUndefined: Self = StObject.set(x, "SipAddresses", js.undefined)
    
    @scala.inline
    def setSipAddressesVarargs(value: SipAddress*): Self = StObject.set(x, "SipAddresses", js.Array(value :_*))
  }
}
