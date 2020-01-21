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
  def apply(
    FirstName: ContactName,
    ClientRequestToken: ClientRequestToken = null,
    DisplayName: ContactName = null,
    LastName: ContactName = null,
    PhoneNumber: RawPhoneNumber = null,
    PhoneNumbers: PhoneNumberList = null,
    SipAddresses: SipAddressList = null
  ): CreateContactRequest = {
    val __obj = js.Dynamic.literal(FirstName = FirstName.asInstanceOf[js.Any])
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken.asInstanceOf[js.Any])
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    if (LastName != null) __obj.updateDynamic("LastName")(LastName.asInstanceOf[js.Any])
    if (PhoneNumber != null) __obj.updateDynamic("PhoneNumber")(PhoneNumber.asInstanceOf[js.Any])
    if (PhoneNumbers != null) __obj.updateDynamic("PhoneNumbers")(PhoneNumbers.asInstanceOf[js.Any])
    if (SipAddresses != null) __obj.updateDynamic("SipAddresses")(SipAddresses.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateContactRequest]
  }
}

