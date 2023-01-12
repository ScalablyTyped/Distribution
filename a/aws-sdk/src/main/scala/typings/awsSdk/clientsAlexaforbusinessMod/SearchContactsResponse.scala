package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchContactsResponse extends StObject {
  
  /**
    * The contacts that meet the specified set of filter criteria, in sort order.
    */
  var Contacts: js.UndefOr[ContactDataList] = js.undefined
  
  /**
    * The token returned to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.NextToken] = js.undefined
  
  /**
    * The total number of contacts returned.
    */
  var TotalCount: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.TotalCount] = js.undefined
}
object SearchContactsResponse {
  
  inline def apply(): SearchContactsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchContactsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchContactsResponse] (val x: Self) extends AnyVal {
    
    inline def setContacts(value: ContactDataList): Self = StObject.set(x, "Contacts", value.asInstanceOf[js.Any])
    
    inline def setContactsUndefined: Self = StObject.set(x, "Contacts", js.undefined)
    
    inline def setContactsVarargs(value: ContactData*): Self = StObject.set(x, "Contacts", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTotalCount(value: TotalCount): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    
    inline def setTotalCountUndefined: Self = StObject.set(x, "TotalCount", js.undefined)
  }
}
