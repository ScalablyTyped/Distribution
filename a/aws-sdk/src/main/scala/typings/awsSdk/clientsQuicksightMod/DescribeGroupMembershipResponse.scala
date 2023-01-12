package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGroupMembershipResponse extends StObject {
  
  var GroupMember: js.UndefOr[typings.awsSdk.clientsQuicksightMod.GroupMember] = js.undefined
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}
object DescribeGroupMembershipResponse {
  
  inline def apply(): DescribeGroupMembershipResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGroupMembershipResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeGroupMembershipResponse] (val x: Self) extends AnyVal {
    
    inline def setGroupMember(value: GroupMember): Self = StObject.set(x, "GroupMember", value.asInstanceOf[js.Any])
    
    inline def setGroupMemberUndefined: Self = StObject.set(x, "GroupMember", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
