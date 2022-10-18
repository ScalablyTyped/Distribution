package typings.awsSdk.clientsServicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInstancesRequest extends StObject {
  
  /**
    * The maximum number of instances that you want Cloud Map to return in the response to a ListInstances request. If you don't specify a value for MaxResults, Cloud Map returns up to 100 instances.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsServicediscoveryMod.MaxResults] = js.undefined
  
  /**
    * For the first ListInstances request, omit this value. If more than MaxResults instances match the specified criteria, you can submit another ListInstances request to get the next group of results. Specify the value of NextToken from the previous response in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsServicediscoveryMod.NextToken] = js.undefined
  
  /**
    * The ID of the service that you want to list instances for.
    */
  var ServiceId: ResourceId
}
object ListInstancesRequest {
  
  inline def apply(ServiceId: ResourceId): ListInstancesRequest = {
    val __obj = js.Dynamic.literal(ServiceId = ServiceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInstancesRequest]
  }
  
  extension [Self <: ListInstancesRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setServiceId(value: ResourceId): Self = StObject.set(x, "ServiceId", value.asInstanceOf[js.Any])
  }
}
