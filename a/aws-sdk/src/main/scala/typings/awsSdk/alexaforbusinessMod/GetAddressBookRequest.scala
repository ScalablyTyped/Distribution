package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAddressBookRequest extends js.Object {
  /**
    * The ARN of the address book for which to request details.
    */
  var AddressBookArn: Arn = js.native
}

object GetAddressBookRequest {
  @scala.inline
  def apply(AddressBookArn: Arn): GetAddressBookRequest = {
    val __obj = js.Dynamic.literal(AddressBookArn = AddressBookArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAddressBookRequest]
  }
}

