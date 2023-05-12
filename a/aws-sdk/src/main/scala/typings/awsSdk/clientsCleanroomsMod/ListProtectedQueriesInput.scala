package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProtectedQueriesInput extends StObject {
  
  /**
    * The maximum size of the results that is returned per call. Service chooses a default if it has not been set. Service can return a nextToken even if the maximum results has not been met. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The identifier for the membership in the collaboration.
    */
  var membershipIdentifier: MembershipIdentifier
  
  /**
    * The token value retrieved from a previous call to access the next page of results.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * A filter on the status of the protected query.
    */
  var status: js.UndefOr[ProtectedQueryStatus] = js.undefined
}
object ListProtectedQueriesInput {
  
  inline def apply(membershipIdentifier: MembershipIdentifier): ListProtectedQueriesInput = {
    val __obj = js.Dynamic.literal(membershipIdentifier = membershipIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProtectedQueriesInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListProtectedQueriesInput] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setMembershipIdentifier(value: MembershipIdentifier): Self = StObject.set(x, "membershipIdentifier", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setStatus(value: ProtectedQueryStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
