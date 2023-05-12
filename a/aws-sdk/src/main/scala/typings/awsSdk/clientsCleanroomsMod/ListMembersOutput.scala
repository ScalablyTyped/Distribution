package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMembersOutput extends StObject {
  
  /**
    * The list of members returned by the ListMembers operation.
    */
  var memberSummaries: MemberSummaryList
  
  /**
    * The token value retrieved from a previous call to access the next page of results.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListMembersOutput {
  
  inline def apply(memberSummaries: MemberSummaryList): ListMembersOutput = {
    val __obj = js.Dynamic.literal(memberSummaries = memberSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMembersOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListMembersOutput] (val x: Self) extends AnyVal {
    
    inline def setMemberSummaries(value: MemberSummaryList): Self = StObject.set(x, "memberSummaries", value.asInstanceOf[js.Any])
    
    inline def setMemberSummariesVarargs(value: MemberSummary*): Self = StObject.set(x, "memberSummaries", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
