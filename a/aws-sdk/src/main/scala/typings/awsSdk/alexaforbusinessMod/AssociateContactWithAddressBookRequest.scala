package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateContactWithAddressBookRequest extends StObject {
  
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
    val __obj = js.Dynamic.literal(AddressBookArn = AddressBookArn.asInstanceOf[js.Any], ContactArn = ContactArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateContactWithAddressBookRequest]
  }
  
  @scala.inline
  implicit class AssociateContactWithAddressBookRequestMutableBuilder[Self <: AssociateContactWithAddressBookRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressBookArn(value: Arn): Self = StObject.set(x, "AddressBookArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactArn(value: Arn): Self = StObject.set(x, "ContactArn", value.asInstanceOf[js.Any])
  }
}
