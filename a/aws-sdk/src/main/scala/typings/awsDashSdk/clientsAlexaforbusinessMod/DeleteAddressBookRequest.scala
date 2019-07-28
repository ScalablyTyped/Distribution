package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteAddressBookRequest extends js.Object {
  /**
    * The ARN of the address book to delete.
    */
  var AddressBookArn: Arn
}

object DeleteAddressBookRequest {
  @scala.inline
  def apply(AddressBookArn: Arn): DeleteAddressBookRequest = {
    val __obj = js.Dynamic.literal(AddressBookArn = AddressBookArn)
  
    __obj.asInstanceOf[DeleteAddressBookRequest]
  }
}

