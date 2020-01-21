package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Contact extends js.Object {
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
  def apply(
    ContactArn: Arn = null,
    DisplayName: ContactName = null,
    FirstName: ContactName = null,
    LastName: ContactName = null,
    PhoneNumber: RawPhoneNumber = null,
    PhoneNumbers: PhoneNumberList = null,
    SipAddresses: SipAddressList = null
  ): Contact = {
    val __obj = js.Dynamic.literal()
    if (ContactArn != null) __obj.updateDynamic("ContactArn")(ContactArn.asInstanceOf[js.Any])
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    if (FirstName != null) __obj.updateDynamic("FirstName")(FirstName.asInstanceOf[js.Any])
    if (LastName != null) __obj.updateDynamic("LastName")(LastName.asInstanceOf[js.Any])
    if (PhoneNumber != null) __obj.updateDynamic("PhoneNumber")(PhoneNumber.asInstanceOf[js.Any])
    if (PhoneNumbers != null) __obj.updateDynamic("PhoneNumbers")(PhoneNumbers.asInstanceOf[js.Any])
    if (SipAddresses != null) __obj.updateDynamic("SipAddresses")(SipAddresses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contact]
  }
}

