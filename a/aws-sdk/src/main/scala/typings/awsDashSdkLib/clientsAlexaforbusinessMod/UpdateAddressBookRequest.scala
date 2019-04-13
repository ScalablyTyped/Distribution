package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAddressBookRequest extends js.Object {
  /**
    * The ARN of the room to update.
    */
  var AddressBookArn: Arn
  /**
    * The updated description of the room.
    */
  var Description: js.UndefOr[AddressBookDescription] = js.undefined
  /**
    * The updated name of the room.
    */
  var Name: js.UndefOr[AddressBookName] = js.undefined
}

object UpdateAddressBookRequest {
  @scala.inline
  def apply(AddressBookArn: Arn, Description: AddressBookDescription = null, Name: AddressBookName = null): UpdateAddressBookRequest = {
    val __obj = js.Dynamic.literal(AddressBookArn = AddressBookArn)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[UpdateAddressBookRequest]
  }
}

