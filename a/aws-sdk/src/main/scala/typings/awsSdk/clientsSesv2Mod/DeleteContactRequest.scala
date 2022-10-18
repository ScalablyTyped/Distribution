package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteContactRequest extends StObject {
  
  /**
    * The name of the contact list from which the contact should be removed.
    */
  var ContactListName: typings.awsSdk.clientsSesv2Mod.ContactListName
  
  /**
    * The contact's email address.
    */
  var EmailAddress: typings.awsSdk.clientsSesv2Mod.EmailAddress
}
object DeleteContactRequest {
  
  inline def apply(ContactListName: ContactListName, EmailAddress: EmailAddress): DeleteContactRequest = {
    val __obj = js.Dynamic.literal(ContactListName = ContactListName.asInstanceOf[js.Any], EmailAddress = EmailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteContactRequest]
  }
  
  extension [Self <: DeleteContactRequest](x: Self) {
    
    inline def setContactListName(value: ContactListName): Self = StObject.set(x, "ContactListName", value.asInstanceOf[js.Any])
    
    inline def setEmailAddress(value: EmailAddress): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
  }
}
