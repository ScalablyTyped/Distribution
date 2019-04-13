package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateContactRequest extends js.Object {
  /**
    * A unique, user-specified identifier for this request that ensures idempotency.
    */
  var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
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
    * The phone number of the contact in E.164 format.
    */
  var PhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined
}

object CreateContactRequest {
  @scala.inline
  def apply(
    FirstName: ContactName,
    ClientRequestToken: ClientRequestToken = null,
    DisplayName: ContactName = null,
    LastName: ContactName = null,
    PhoneNumber: E164PhoneNumber = null
  ): CreateContactRequest = {
    val __obj = js.Dynamic.literal(FirstName = FirstName)
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken)
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName)
    if (LastName != null) __obj.updateDynamic("LastName")(LastName)
    if (PhoneNumber != null) __obj.updateDynamic("PhoneNumber")(PhoneNumber)
    __obj.asInstanceOf[CreateContactRequest]
  }
}

