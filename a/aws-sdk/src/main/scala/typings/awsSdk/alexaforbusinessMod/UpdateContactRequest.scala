package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateContactRequest extends js.Object {
  
  /**
    * The ARN of the contact to update.
    */
  var ContactArn: Arn = js.native
  
  /**
    * The updated display name of the contact.
    */
  var DisplayName: js.UndefOr[ContactName] = js.native
  
  /**
    * The updated first name of the contact.
    */
  var FirstName: js.UndefOr[ContactName] = js.native
  
  /**
    * The updated last name of the contact.
    */
  var LastName: js.UndefOr[ContactName] = js.native
  
  /**
    * The updated phone number of the contact. The phone number type defaults to WORK. You can either specify PhoneNumber or PhoneNumbers. We recommend that you use PhoneNumbers, which lets you specify the phone number type and multiple numbers.
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
object UpdateContactRequest {
  
  @scala.inline
  def apply(ContactArn: Arn): UpdateContactRequest = {
    val __obj = js.Dynamic.literal(ContactArn = ContactArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateContactRequest]
  }
  
  @scala.inline
  implicit class UpdateContactRequestOps[Self <: UpdateContactRequest] (val x: Self) extends AnyVal {
    
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
    def setContactArn(value: Arn): Self = this.set("ContactArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: ContactName): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("DisplayName", js.undefined)
    
    @scala.inline
    def setFirstName(value: ContactName): Self = this.set("FirstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstName: Self = this.set("FirstName", js.undefined)
    
    @scala.inline
    def setLastName(value: ContactName): Self = this.set("LastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastName: Self = this.set("LastName", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: RawPhoneNumber): Self = this.set("PhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneNumber: Self = this.set("PhoneNumber", js.undefined)
    
    @scala.inline
    def setPhoneNumbersVarargs(value: PhoneNumber*): Self = this.set("PhoneNumbers", js.Array(value :_*))
    
    @scala.inline
    def setPhoneNumbers(value: PhoneNumberList): Self = this.set("PhoneNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneNumbers: Self = this.set("PhoneNumbers", js.undefined)
    
    @scala.inline
    def setSipAddressesVarargs(value: SipAddress*): Self = this.set("SipAddresses", js.Array(value :_*))
    
    @scala.inline
    def setSipAddresses(value: SipAddressList): Self = this.set("SipAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSipAddresses: Self = this.set("SipAddresses", js.undefined)
  }
}
