package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAddressBookResponse extends js.Object {
  /**
    * The ARN of the newly created address book.
    */
  var AddressBookArn: js.UndefOr[Arn] = js.undefined
}

object CreateAddressBookResponse {
  @scala.inline
  def apply(AddressBookArn: Arn = null): CreateAddressBookResponse = {
    val __obj = js.Dynamic.literal()
    if (AddressBookArn != null) __obj.updateDynamic("AddressBookArn")(AddressBookArn)
    __obj.asInstanceOf[CreateAddressBookResponse]
  }
}

