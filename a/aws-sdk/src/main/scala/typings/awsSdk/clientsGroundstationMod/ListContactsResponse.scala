package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListContactsResponse extends StObject {
  
  /**
    * List of contacts.
    */
  var contactList: js.UndefOr[ContactList] = js.undefined
  
  /**
    * Next token returned in the response of a previous ListContacts call. Used to get the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListContactsResponse {
  
  inline def apply(): ListContactsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListContactsResponse]
  }
  
  extension [Self <: ListContactsResponse](x: Self) {
    
    inline def setContactList(value: ContactList): Self = StObject.set(x, "contactList", value.asInstanceOf[js.Any])
    
    inline def setContactListUndefined: Self = StObject.set(x, "contactList", js.undefined)
    
    inline def setContactListVarargs(value: ContactData*): Self = StObject.set(x, "contactList", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
