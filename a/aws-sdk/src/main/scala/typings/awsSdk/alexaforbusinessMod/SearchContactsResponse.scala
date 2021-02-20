package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchContactsResponse extends StObject {
  
  /**
    * The contacts that meet the specified set of filter criteria, in sort order.
    */
  var Contacts: js.UndefOr[ContactDataList] = js.native
  
  /**
    * The token returned to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NextToken] = js.native
  
  /**
    * The total number of contacts returned.
    */
  var TotalCount: js.UndefOr[typings.awsSdk.alexaforbusinessMod.TotalCount] = js.native
}
object SearchContactsResponse {
  
  @scala.inline
  def apply(): SearchContactsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchContactsResponse]
  }
  
  @scala.inline
  implicit class SearchContactsResponseMutableBuilder[Self <: SearchContactsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContacts(value: ContactDataList): Self = StObject.set(x, "Contacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactsUndefined: Self = StObject.set(x, "Contacts", js.undefined)
    
    @scala.inline
    def setContactsVarargs(value: ContactData*): Self = StObject.set(x, "Contacts", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTotalCount(value: TotalCount): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCountUndefined: Self = StObject.set(x, "TotalCount", js.undefined)
  }
}
