package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContactListRequest extends StObject {
  
  /**
    * The name of the contact list.
    */
  var ContactListName: typings.awsSdk.clientsSesv2Mod.ContactListName
}
object GetContactListRequest {
  
  inline def apply(ContactListName: ContactListName): GetContactListRequest = {
    val __obj = js.Dynamic.literal(ContactListName = ContactListName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContactListRequest]
  }
  
  extension [Self <: GetContactListRequest](x: Self) {
    
    inline def setContactListName(value: ContactListName): Self = StObject.set(x, "ContactListName", value.asInstanceOf[js.Any])
  }
}
