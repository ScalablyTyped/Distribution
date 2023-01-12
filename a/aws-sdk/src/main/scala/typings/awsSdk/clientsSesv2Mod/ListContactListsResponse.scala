package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListContactListsResponse extends StObject {
  
  /**
    * The available contact lists.
    */
  var ContactLists: js.UndefOr[ListOfContactLists] = js.undefined
  
  /**
    * A string token indicating that there might be additional contact lists available to be listed. Copy this token to a subsequent call to ListContactLists with the same parameters to retrieve the next page of contact lists.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSesv2Mod.NextToken] = js.undefined
}
object ListContactListsResponse {
  
  inline def apply(): ListContactListsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListContactListsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListContactListsResponse] (val x: Self) extends AnyVal {
    
    inline def setContactLists(value: ListOfContactLists): Self = StObject.set(x, "ContactLists", value.asInstanceOf[js.Any])
    
    inline def setContactListsUndefined: Self = StObject.set(x, "ContactLists", js.undefined)
    
    inline def setContactListsVarargs(value: ContactList*): Self = StObject.set(x, "ContactLists", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
