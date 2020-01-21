package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    ContactArn: Arn,
    DisplayName: ContactName = null,
    FirstName: ContactName = null,
    LastName: ContactName = null,
    PhoneNumber: RawPhoneNumber = null,
    PhoneNumbers: PhoneNumberList = null,
    SipAddresses: SipAddressList = null
  ): UpdateContactRequest = {
    val __obj = js.Dynamic.literal(ContactArn = ContactArn.asInstanceOf[js.Any])
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    if (FirstName != null) __obj.updateDynamic("FirstName")(FirstName.asInstanceOf[js.Any])
    if (LastName != null) __obj.updateDynamic("LastName")(LastName.asInstanceOf[js.Any])
    if (PhoneNumber != null) __obj.updateDynamic("PhoneNumber")(PhoneNumber.asInstanceOf[js.Any])
    if (PhoneNumbers != null) __obj.updateDynamic("PhoneNumbers")(PhoneNumbers.asInstanceOf[js.Any])
    if (SipAddresses != null) __obj.updateDynamic("SipAddresses")(SipAddresses.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateContactRequest]
  }
}

