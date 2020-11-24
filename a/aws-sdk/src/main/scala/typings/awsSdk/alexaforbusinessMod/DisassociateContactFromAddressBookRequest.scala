package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class DisassociateContactFromAddressBookRequestOps[Self <: DisassociateContactFromAddressBookRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddressBookArn(value: Arn): Self = this.set("AddressBookArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactArn(value: Arn): Self = this.set("ContactArn", value.asInstanceOf[js.Any])
  }
}
