package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateContactFromAddressBookRequest extends StObject {
  
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
    val __obj = js.Dynamic.literal(AddressBookArn = AddressBookArn.asInstanceOf[js.Any], ContactArn = ContactArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateContactFromAddressBookRequest]
  }
  
  @scala.inline
  implicit class DisassociateContactFromAddressBookRequestMutableBuilder[Self <: DisassociateContactFromAddressBookRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressBookArn(value: Arn): Self = StObject.set(x, "AddressBookArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactArn(value: Arn): Self = StObject.set(x, "ContactArn", value.asInstanceOf[js.Any])
  }
}
