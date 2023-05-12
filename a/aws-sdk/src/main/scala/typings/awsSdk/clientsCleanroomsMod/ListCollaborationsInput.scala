package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCollaborationsInput extends StObject {
  
  /**
    * The maximum size of the results that is returned per call. Service chooses a default if it has not been set. Service may return a nextToken even if the maximum results has not been met.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The caller's status in a collaboration.
    */
  var memberStatus: js.UndefOr[FilterableMemberStatus] = js.undefined
  
  /**
    * The token value retrieved from a previous call to access the next page of results.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListCollaborationsInput {
  
  inline def apply(): ListCollaborationsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCollaborationsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListCollaborationsInput] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setMemberStatus(value: FilterableMemberStatus): Self = StObject.set(x, "memberStatus", value.asInstanceOf[js.Any])
    
    inline def setMemberStatusUndefined: Self = StObject.set(x, "memberStatus", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
