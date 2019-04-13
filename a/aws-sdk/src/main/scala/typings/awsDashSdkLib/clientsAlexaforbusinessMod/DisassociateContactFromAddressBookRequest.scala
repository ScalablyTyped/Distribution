package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateContactFromAddressBookRequest extends js.Object {
  /**
    * The ARN of the address from which to disassociate the contact.
    */
  var AddressBookArn: Arn
  /**
    * The ARN of the contact to disassociate from an address book.
    */
  var ContactArn: Arn
}

object DisassociateContactFromAddressBookRequest {
  @scala.inline
  def apply(AddressBookArn: Arn, ContactArn: Arn): DisassociateContactFromAddressBookRequest = {
    val __obj = js.Dynamic.literal(AddressBookArn = AddressBookArn, ContactArn = ContactArn)
  
    __obj.asInstanceOf[DisassociateContactFromAddressBookRequest]
  }
}

