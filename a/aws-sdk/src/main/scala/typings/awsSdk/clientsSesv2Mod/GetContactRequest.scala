package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContactRequest extends StObject {
  
  /**
    * The name of the contact list to which the contact belongs.
    */
  var ContactListName: typings.awsSdk.clientsSesv2Mod.ContactListName
  
  /**
    * The contact's email addres.
    */
  var EmailAddress: typings.awsSdk.clientsSesv2Mod.EmailAddress
}
object GetContactRequest {
  
  inline def apply(ContactListName: ContactListName, EmailAddress: EmailAddress): GetContactRequest = {
    val __obj = js.Dynamic.literal(ContactListName = ContactListName.asInstanceOf[js.Any], EmailAddress = EmailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContactRequest]
  }
  
  extension [Self <: GetContactRequest](x: Self) {
    
    inline def setContactListName(value: ContactListName): Self = StObject.set(x, "ContactListName", value.asInstanceOf[js.Any])
    
    inline def setEmailAddress(value: EmailAddress): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
  }
}
