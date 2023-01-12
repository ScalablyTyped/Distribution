package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchGroupsResponse extends StObject {
  
  /**
    * A list of groups in a specified namespace that match the filters you set in your SearchGroups request.
    */
  var GroupList: js.UndefOr[typings.awsSdk.clientsQuicksightMod.GroupList] = js.undefined
  
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
object SearchGroupsResponse {
  
  inline def apply(): SearchGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchGroupsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchGroupsResponse] (val x: Self) extends AnyVal {
    
    inline def setGroupList(value: GroupList): Self = StObject.set(x, "GroupList", value.asInstanceOf[js.Any])
    
    inline def setGroupListUndefined: Self = StObject.set(x, "GroupList", js.undefined)
    
    inline def setGroupListVarargs(value: Group*): Self = StObject.set(x, "GroupList", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
