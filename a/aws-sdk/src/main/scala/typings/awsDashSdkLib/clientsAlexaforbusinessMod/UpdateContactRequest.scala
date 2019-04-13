package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

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
    * The updated phone number of the contact.
    */
  var PhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined
}

object UpdateContactRequest {
  @scala.inline
  def apply(
    ContactArn: Arn,
    DisplayName: ContactName = null,
    FirstName: ContactName = null,
    LastName: ContactName = null,
    PhoneNumber: E164PhoneNumber = null
  ): UpdateContactRequest = {
    val __obj = js.Dynamic.literal(ContactArn = ContactArn)
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName)
    if (FirstName != null) __obj.updateDynamic("FirstName")(FirstName)
    if (LastName != null) __obj.updateDynamic("LastName")(LastName)
    if (PhoneNumber != null) __obj.updateDynamic("PhoneNumber")(PhoneNumber)
    __obj.asInstanceOf[UpdateContactRequest]
  }
}

