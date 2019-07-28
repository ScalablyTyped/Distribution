package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateContactRequest extends js.Object {
  /**
    * A unique, user-specified identifier for this request that ensures idempotency.
    */
  var ClientRequestToken: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.ClientRequestToken] = js.undefined
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
    val __obj = js.Dynamic.literal(FirstName = FirstName)
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken)
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName)
    if (LastName != null) __obj.updateDynamic("LastName")(LastName)
    if (PhoneNumber != null) __obj.updateDynamic("PhoneNumber")(PhoneNumber)
    if (PhoneNumbers != null) __obj.updateDynamic("PhoneNumbers")(PhoneNumbers)
    if (SipAddresses != null) __obj.updateDynamic("SipAddresses")(SipAddresses)
    __obj.asInstanceOf[CreateContactRequest]
  }
}

