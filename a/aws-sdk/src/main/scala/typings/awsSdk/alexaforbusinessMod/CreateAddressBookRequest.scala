package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAddressBookRequest extends js.Object {
  /**
    * A unique, user-specified identifier for the request that ensures idempotency.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.ClientRequestToken] = js.native
  /**
    * The description of the address book.
    */
  var Description: js.UndefOr[AddressBookDescription] = js.native
  /**
    * The name of the address book.
    */
  var Name: AddressBookName = js.native
}

object CreateAddressBookRequest {
  @scala.inline
  def apply(
    Name: AddressBookName,
    ClientRequestToken: ClientRequestToken = null,
    Description: AddressBookDescription = null
  ): CreateAddressBookRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAddressBookRequest]
  }
}

