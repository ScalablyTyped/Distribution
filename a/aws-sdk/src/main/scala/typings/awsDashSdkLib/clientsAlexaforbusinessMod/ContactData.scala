package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactData extends js.Object {
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
    * The phone number of the contact.
    */
  var PhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined
}

object ContactData {
  @scala.inline
  def apply(
    ContactArn: Arn = null,
    DisplayName: ContactName = null,
    FirstName: ContactName = null,
    LastName: ContactName = null,
    PhoneNumber: E164PhoneNumber = null
  ): ContactData = {
    val __obj = js.Dynamic.literal()
    if (ContactArn != null) __obj.updateDynamic("ContactArn")(ContactArn)
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName)
    if (FirstName != null) __obj.updateDynamic("FirstName")(FirstName)
    if (LastName != null) __obj.updateDynamic("LastName")(LastName)
    if (PhoneNumber != null) __obj.updateDynamic("PhoneNumber")(PhoneNumber)
    __obj.asInstanceOf[ContactData]
  }
}

