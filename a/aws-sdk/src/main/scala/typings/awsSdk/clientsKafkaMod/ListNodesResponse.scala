package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNodesResponse extends StObject {
  
  /**
    * 
    The paginated results marker. When the result of a ListNodes operation is truncated, the call returns NextToken in the response. 
    To get another batch of nodes, provide this token in your next request.
    
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * 
    List containing a NodeInfo object.
    
    */
  var NodeInfoList: js.UndefOr[listOfNodeInfo] = js.undefined
}
object ListNodesResponse {
  
  inline def apply(): ListNodesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNodesResponse]
  }
  
  extension [Self <: ListNodesResponse](x: Self) {
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setNodeInfoList(value: listOfNodeInfo): Self = StObject.set(x, "NodeInfoList", value.asInstanceOf[js.Any])
    
    inline def setNodeInfoListUndefined: Self = StObject.set(x, "NodeInfoList", js.undefined)
    
    inline def setNodeInfoListVarargs(value: NodeInfo*): Self = StObject.set(x, "NodeInfoList", js.Array(value*))
  }
}
