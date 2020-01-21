package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAddressBookResponse extends js.Object {
  /**
    * The ARN of the newly created address book.
    */
  var AddressBookArn: js.UndefOr[Arn] = js.native
}

object CreateAddressBookResponse {
  @scala.inline
  def apply(AddressBookArn: Arn = null): CreateAddressBookResponse = {
    val __obj = js.Dynamic.literal()
    if (AddressBookArn != null) __obj.updateDynamic("AddressBookArn")(AddressBookArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAddressBookResponse]
  }
}

