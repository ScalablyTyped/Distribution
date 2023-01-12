package typings.awsSdk.clientsDetectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMembersResponse extends StObject {
  
  /**
    * The list of member accounts in the behavior graph. For invited accounts, the results include member accounts that did not pass verification and member accounts that have not yet accepted the invitation to the behavior graph. The results do not include member accounts that were removed from the behavior graph. For the organization behavior graph, the results do not include organization accounts that the Detective administrator account has not enabled as member accounts.
    */
  var MemberDetails: js.UndefOr[MemberDetailList] = js.undefined
  
  /**
    * If there are more member accounts remaining in the results, then use this pagination token to request the next page of member accounts.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListMembersResponse {
  
  inline def apply(): ListMembersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMembersResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListMembersResponse] (val x: Self) extends AnyVal {
    
    inline def setMemberDetails(value: MemberDetailList): Self = StObject.set(x, "MemberDetails", value.asInstanceOf[js.Any])
    
    inline def setMemberDetailsUndefined: Self = StObject.set(x, "MemberDetails", js.undefined)
    
    inline def setMemberDetailsVarargs(value: MemberDetail*): Self = StObject.set(x, "MemberDetails", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
