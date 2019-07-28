package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateContactWithAddressBookRequest extends js.Object {
  /**
    * The ARN of the address book with which to associate the contact.
    */
  var AddressBookArn: Arn
  /**
    * The ARN of the contact to associate with an address book.
    */
  var ContactArn: Arn
}

object AssociateContactWithAddressBookRequest {
  @scala.inline
  def apply(AddressBookArn: Arn, ContactArn: Arn): AssociateContactWithAddressBookRequest = {
    val __obj = js.Dynamic.literal(AddressBookArn = AddressBookArn, ContactArn = ContactArn)
  
    __obj.asInstanceOf[AssociateContactWithAddressBookRequest]
  }
}

