package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateContactFromAddressBookRequest extends js.Object {
  /**
    * The ARN of the address from which to disassociate the contact.
    */
  var AddressBookArn: Arn = js.native
  /**
    * The ARN of the contact to disassociate from an address book.
    */
  var ContactArn: Arn = js.native
}

object DisassociateContactFromAddressBookRequest {
  @scala.inline
  def apply(AddressBookArn: Arn, ContactArn: Arn): DisassociateContactFromAddressBookRequest = {
    val __obj = js.Dynamic.literal(AddressBookArn = AddressBookArn.asInstanceOf[js.Any], ContactArn = ContactArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateContactFromAddressBookRequest]
  }
}

