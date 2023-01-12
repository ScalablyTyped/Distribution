package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGroupMembershipsResponse extends StObject {
  
  /**
    * The list of the members of the group.
    */
  var GroupMemberList: js.UndefOr[typings.awsSdk.clientsQuicksightMod.GroupMemberList] = js.undefined
  
  /**
    * A pagination token that can be used in a subsequent request.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}
object ListGroupMembershipsResponse {
  
  inline def apply(): ListGroupMembershipsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGroupMembershipsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListGroupMembershipsResponse] (val x: Self) extends AnyVal {
    
    inline def setGroupMemberList(value: GroupMemberList): Self = StObject.set(x, "GroupMemberList", value.asInstanceOf[js.Any])
    
    inline def setGroupMemberListUndefined: Self = StObject.set(x, "GroupMemberList", js.undefined)
    
    inline def setGroupMemberListVarargs(value: GroupMember*): Self = StObject.set(x, "GroupMemberList", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
