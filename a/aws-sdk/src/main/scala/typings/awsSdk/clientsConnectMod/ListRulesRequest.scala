package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRulesRequest extends StObject {
  
  /**
    * The name of the event source.
    */
  var EventSourceName: js.UndefOr[typings.awsSdk.clientsConnectMod.EventSourceName] = js.undefined
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instance ID in the Amazon Resource Name (ARN) of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The maximum number of results to return per page.
    */
  var MaxResults: js.UndefOr[MaxResult200] = js.undefined
  
  /**
    * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsConnectMod.NextToken] = js.undefined
  
  /**
    * The publish status of the rule.
    */
  var PublishStatus: js.UndefOr[RulePublishStatus] = js.undefined
}
object ListRulesRequest {
  
  inline def apply(InstanceId: InstanceId): ListRulesRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRulesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRulesRequest] (val x: Self) extends AnyVal {
    
    inline def setEventSourceName(value: EventSourceName): Self = StObject.set(x, "EventSourceName", value.asInstanceOf[js.Any])
    
    inline def setEventSourceNameUndefined: Self = StObject.set(x, "EventSourceName", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResult200): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPublishStatus(value: RulePublishStatus): Self = StObject.set(x, "PublishStatus", value.asInstanceOf[js.Any])
    
    inline def setPublishStatusUndefined: Self = StObject.set(x, "PublishStatus", js.undefined)
  }
}
