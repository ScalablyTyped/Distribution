package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAddressBookRequest extends js.Object {
  /**
    * The ARN of the room to update.
    */
  var AddressBookArn: Arn = js.native
  /**
    * The updated description of the room.
    */
  var Description: js.UndefOr[AddressBookDescription] = js.native
  /**
    * The updated name of the room.
    */
  var Name: js.UndefOr[AddressBookName] = js.native
}

object UpdateAddressBookRequest {
  @scala.inline
  def apply(AddressBookArn: Arn, Description: AddressBookDescription = null, Name: AddressBookName = null): UpdateAddressBookRequest = {
    val __obj = js.Dynamic.literal(AddressBookArn = AddressBookArn.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAddressBookRequest]
  }
}

