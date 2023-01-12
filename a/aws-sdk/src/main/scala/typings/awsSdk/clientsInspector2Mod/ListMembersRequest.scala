package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMembersRequest extends StObject {
  
  /**
    * The maximum number of results to return in the response.
    */
  var maxResults: js.UndefOr[ListMembersMaxResults] = js.undefined
  
  /**
    * A token to use for paginating results that are returned in the response. Set the value of this parameter to null for the first request to a list action. For subsequent calls, use the NextToken value returned from the previous request to continue listing results after the first page.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * Specifies whether to list only currently associated members if True or to list all members within the organization if False.
    */
  var onlyAssociated: js.UndefOr[Boolean] = js.undefined
}
object ListMembersRequest {
  
  inline def apply(): ListMembersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMembersRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListMembersRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: ListMembersMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setOnlyAssociated(value: Boolean): Self = StObject.set(x, "onlyAssociated", value.asInstanceOf[js.Any])
    
    inline def setOnlyAssociatedUndefined: Self = StObject.set(x, "onlyAssociated", js.undefined)
  }
}
