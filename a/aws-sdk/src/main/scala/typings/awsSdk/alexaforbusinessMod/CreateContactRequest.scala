package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateContactRequest extends js.Object {
  /**
    * A unique, user-specified identifier for this request that ensures idempotency.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.ClientRequestToken] = js.native
  /**
    * The name of the contact to display on the console.
    */
  var DisplayName: js.UndefOr[ContactName] = js.native
  /**
    * The first name of the contact that is used to call the contact on the device.
    */
  var FirstName: ContactName = js.native
  /**
    * The last name of the contact that is used to call the contact on the device.
    */
  var LastName: js.UndefOr[ContactName] = js.native
  /**
    * The phone number of the contact in E.164 format. The phone number type defaults to WORK. You can specify PhoneNumber or PhoneNumbers. We recommend that you use PhoneNumbers, which lets you specify the phone number type and multiple numbers.
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

object CreateContactRequest {
  @scala.inline
  def apply(FirstName: ContactName): CreateContactRequest = {
    val __obj = js.Dynamic.literal(FirstName = FirstName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateContactRequest]
  }
  @scala.inline
  implicit class CreateContactRequestOps[Self <: CreateContactRequest] (val x: Self) extends AnyVal {
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
    def setFirstName(value: ContactName): Self = this.set("FirstName", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = this.set("ClientRequestToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientRequestToken: Self = this.set("ClientRequestToken", js.undefined)
    @scala.inline
    def setDisplayName(value: ContactName): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("DisplayName", js.undefined)
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

