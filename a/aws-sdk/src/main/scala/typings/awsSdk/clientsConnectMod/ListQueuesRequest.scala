package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListQueuesRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The maximum number of results to return per page. The default MaxResult size is 100.
    */
  var MaxResults: js.UndefOr[MaxResult1000] = js.undefined
  
  /**
    * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsConnectMod.NextToken] = js.undefined
  
  /**
    * The type of queue.
    */
  var QueueTypes: js.UndefOr[typings.awsSdk.clientsConnectMod.QueueTypes] = js.undefined
}
object ListQueuesRequest {
  
  inline def apply(InstanceId: InstanceId): ListQueuesRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListQueuesRequest]
  }
  
  extension [Self <: ListQueuesRequest](x: Self) {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResult1000): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setQueueTypes(value: QueueTypes): Self = StObject.set(x, "QueueTypes", value.asInstanceOf[js.Any])
    
    inline def setQueueTypesUndefined: Self = StObject.set(x, "QueueTypes", js.undefined)
    
    inline def setQueueTypesVarargs(value: QueueType*): Self = StObject.set(x, "QueueTypes", js.Array(value*))
  }
}
