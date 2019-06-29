package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contact extends js.Object {
  /**
    * The ARN of the contact.
    */
  var ContactArn: js.UndefOr[Arn] = js.undefined
  /**
    * The name of the contact to display on the console.
    */
  var DisplayName: js.UndefOr[ContactName] = js.undefined
  /**
    * The first name of the contact, used to call the contact on the device.
    */
  var FirstName: js.UndefOr[ContactName] = js.undefined
  /**
    * The last name of the contact, used to call the contact on the device.
    */
  var LastName: js.UndefOr[ContactName] = js.undefined
  /**
    * The phone number of the contact. The phone number type defaults to WORK. You can either specify PhoneNumber or PhoneNumbers. We recommend that you use PhoneNumbers, which lets you specify the phone number type and multiple numbers.
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
    if (ContactArn != null) __obj.updateDynamic("ContactArn")(ContactArn)
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName)
    if (FirstName != null) __obj.updateDynamic("FirstName")(FirstName)
    if (LastName != null) __obj.updateDynamic("LastName")(LastName)
    if (PhoneNumber != null) __obj.updateDynamic("PhoneNumber")(PhoneNumber)
    if (PhoneNumbers != null) __obj.updateDynamic("PhoneNumbers")(PhoneNumbers)
    if (SipAddresses != null) __obj.updateDynamic("SipAddresses")(SipAddresses)
    __obj.asInstanceOf[Contact]
  }
}

