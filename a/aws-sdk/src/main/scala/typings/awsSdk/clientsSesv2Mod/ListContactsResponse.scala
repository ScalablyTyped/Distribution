package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListContactsResponse extends StObject {
  
  /**
    * The contacts present in a specific contact list.
    */
  var Contacts: js.UndefOr[ListOfContacts] = js.undefined
  
  /**
    * A string token indicating that there might be additional contacts available to be listed. Copy this token to a subsequent call to ListContacts with the same parameters to retrieve the next page of contacts.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSesv2Mod.NextToken] = js.undefined
}
object ListContactsResponse {
  
  inline def apply(): ListContactsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListContactsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListContactsResponse] (val x: Self) extends AnyVal {
    
    inline def setContacts(value: ListOfContacts): Self = StObject.set(x, "Contacts", value.asInstanceOf[js.Any])
    
    inline def setContactsUndefined: Self = StObject.set(x, "Contacts", js.undefined)
    
    inline def setContactsVarargs(value: Contact*): Self = StObject.set(x, "Contacts", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
