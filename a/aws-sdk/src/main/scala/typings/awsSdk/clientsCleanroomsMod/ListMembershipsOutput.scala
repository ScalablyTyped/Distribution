package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMembershipsOutput extends StObject {
  
  /**
    * The list of memberships returned from the ListMemberships operation.
    */
  var membershipSummaries: MembershipSummaryList
  
  /**
    * The token value retrieved from a previous call to access the next page of results.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListMembershipsOutput {
  
  inline def apply(membershipSummaries: MembershipSummaryList): ListMembershipsOutput = {
    val __obj = js.Dynamic.literal(membershipSummaries = membershipSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMembershipsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListMembershipsOutput] (val x: Self) extends AnyVal {
    
    inline def setMembershipSummaries(value: MembershipSummaryList): Self = StObject.set(x, "membershipSummaries", value.asInstanceOf[js.Any])
    
    inline def setMembershipSummariesVarargs(value: MembershipSummary*): Self = StObject.set(x, "membershipSummaries", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
