package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListQuickConnectsRequest extends StObject {
  
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
    * The type of quick connect. In the Amazon Connect console, when you create a quick connect, you are prompted to assign one of the following types: Agent (USER), External (PHONE_NUMBER), or Queue (QUEUE).
    */
  var QuickConnectTypes: js.UndefOr[typings.awsSdk.clientsConnectMod.QuickConnectTypes] = js.undefined
}
object ListQuickConnectsRequest {
  
  inline def apply(InstanceId: InstanceId): ListQuickConnectsRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListQuickConnectsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListQuickConnectsRequest] (val x: Self) extends AnyVal {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResult1000): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setQuickConnectTypes(value: QuickConnectTypes): Self = StObject.set(x, "QuickConnectTypes", value.asInstanceOf[js.Any])
    
    inline def setQuickConnectTypesUndefined: Self = StObject.set(x, "QuickConnectTypes", js.undefined)
    
    inline def setQuickConnectTypesVarargs(value: QuickConnectType*): Self = StObject.set(x, "QuickConnectTypes", js.Array(value*))
  }
}
