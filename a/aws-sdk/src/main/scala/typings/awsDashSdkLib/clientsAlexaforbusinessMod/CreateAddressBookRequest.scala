package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAddressBookRequest extends js.Object {
  /**
    * A unique, user-specified identifier for the request that ensures idempotency.
    */
  var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  /**
    * The description of the address book.
    */
  var Description: js.UndefOr[AddressBookDescription] = js.undefined
  /**
    * The name of the address book.
    */
  var Name: AddressBookName
}

object CreateAddressBookRequest {
  @scala.inline
  def apply(
    Name: AddressBookName,
    ClientRequestToken: ClientRequestToken = null,
    Description: AddressBookDescription = null
  ): CreateAddressBookRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    __obj.asInstanceOf[CreateAddressBookRequest]
  }
}

