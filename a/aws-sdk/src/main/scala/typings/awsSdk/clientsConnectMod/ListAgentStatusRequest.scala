package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAgentStatusRequest extends StObject {
  
  /**
    * Available agent status types.
    */
  var AgentStatusTypes: js.UndefOr[typings.awsSdk.clientsConnectMod.AgentStatusTypes] = js.undefined
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instance ID in the Amazon Resource Name (ARN) of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The maximum number of results to return per page.
    */
  var MaxResults: js.UndefOr[MaxResult1000] = js.undefined
  
  /**
    * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsConnectMod.NextToken] = js.undefined
}
object ListAgentStatusRequest {
  
  inline def apply(InstanceId: InstanceId): ListAgentStatusRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAgentStatusRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAgentStatusRequest] (val x: Self) extends AnyVal {
    
    inline def setAgentStatusTypes(value: AgentStatusTypes): Self = StObject.set(x, "AgentStatusTypes", value.asInstanceOf[js.Any])
    
    inline def setAgentStatusTypesUndefined: Self = StObject.set(x, "AgentStatusTypes", js.undefined)
    
    inline def setAgentStatusTypesVarargs(value: AgentStatusType*): Self = StObject.set(x, "AgentStatusTypes", js.Array(value*))
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResult1000): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
