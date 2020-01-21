package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAddressBookRequest extends js.Object {
  /**
    * The ARN of the address book to delete.
    */
  var AddressBookArn: Arn = js.native
}

object DeleteAddressBookRequest {
  @scala.inline
  def apply(AddressBookArn: Arn): DeleteAddressBookRequest = {
    val __obj = js.Dynamic.literal(AddressBookArn = AddressBookArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteAddressBookRequest]
  }
}

