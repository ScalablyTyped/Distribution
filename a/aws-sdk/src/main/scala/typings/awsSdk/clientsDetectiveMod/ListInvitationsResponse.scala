package typings.awsSdk.clientsDetectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInvitationsResponse extends StObject {
  
  /**
    * The list of behavior graphs for which the member account has open or accepted invitations.
    */
  var Invitations: js.UndefOr[MemberDetailList] = js.undefined
  
  /**
    * If there are more behavior graphs remaining in the results, then this is the pagination token to use to request the next page of behavior graphs.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListInvitationsResponse {
  
  inline def apply(): ListInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInvitationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListInvitationsResponse] (val x: Self) extends AnyVal {
    
    inline def setInvitations(value: MemberDetailList): Self = StObject.set(x, "Invitations", value.asInstanceOf[js.Any])
    
    inline def setInvitationsUndefined: Self = StObject.set(x, "Invitations", js.undefined)
    
    inline def setInvitationsVarargs(value: MemberDetail*): Self = StObject.set(x, "Invitations", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
