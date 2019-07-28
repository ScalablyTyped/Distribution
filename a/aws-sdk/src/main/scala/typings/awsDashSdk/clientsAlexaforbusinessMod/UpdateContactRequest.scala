package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateContactRequest extends js.Object {
  /**
    * The ARN of the contact to update.
    */
  var ContactArn: Arn
  /**
    * The updated display name of the contact.
    */
  var DisplayName: js.UndefOr[ContactName] = js.undefined
  /**
    * The updated first name of the contact.
    */
  var FirstName: js.UndefOr[ContactName] = js.undefined
  /**
    * The updated last name of the contact.
    */
  var LastName: js.UndefOr[ContactName] = js.undefined
  /**
    * The updated phone number of the contact. The phone number type defaults to WORK. You can either specify PhoneNumber or PhoneNumbers. We recommend that you use PhoneNumbers, which lets you specify the phone number type and multiple numbers.
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
    val __obj = js.Dynamic.literal(ContactArn = ContactArn)
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName)
    if (FirstName != null) __obj.updateDynamic("FirstName")(FirstName)
    if (LastName != null) __obj.updateDynamic("LastName")(LastName)
    if (PhoneNumber != null) __obj.updateDynamic("PhoneNumber")(PhoneNumber)
    if (PhoneNumbers != null) __obj.updateDynamic("PhoneNumbers")(PhoneNumbers)
    if (SipAddresses != null) __obj.updateDynamic("SipAddresses")(SipAddresses)
    __obj.asInstanceOf[UpdateContactRequest]
  }
}

