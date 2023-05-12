package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMembershipsInput extends StObject {
  
  /**
    * The maximum size of the results that is returned per call.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The token value retrieved from a previous call to access the next page of results.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * A filter which will return only memberships in the specified status.
    */
  var status: js.UndefOr[MembershipStatus] = js.undefined
}
object ListMembershipsInput {
  
  inline def apply(): ListMembershipsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMembershipsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListMembershipsInput] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setStatus(value: MembershipStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
