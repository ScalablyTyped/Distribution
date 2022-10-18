package typings.awsSdk.clientsServicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInstancesHealthStatusRequest extends StObject {
  
  /**
    * An array that contains the IDs of all the instances that you want to get the health status for. If you omit Instances, Cloud Map returns the health status for all the instances that are associated with the specified service.  To get the IDs for the instances that you've registered by using a specified service, submit a ListInstances request. 
    */
  var Instances: js.UndefOr[InstanceIdList] = js.undefined
  
  /**
    * The maximum number of instances that you want Cloud Map to return in the response to a GetInstancesHealthStatus request. If you don't specify a value for MaxResults, Cloud Map returns up to 100 instances.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsServicediscoveryMod.MaxResults] = js.undefined
  
  /**
    * For the first GetInstancesHealthStatus request, omit this value. If more than MaxResults instances match the specified criteria, you can submit another GetInstancesHealthStatus request to get the next group of results. Specify the value of NextToken from the previous response in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsServicediscoveryMod.NextToken] = js.undefined
  
  /**
    * The ID of the service that the instance is associated with.
    */
  var ServiceId: ResourceId
}
object GetInstancesHealthStatusRequest {
  
  inline def apply(ServiceId: ResourceId): GetInstancesHealthStatusRequest = {
    val __obj = js.Dynamic.literal(ServiceId = ServiceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstancesHealthStatusRequest]
  }
  
  extension [Self <: GetInstancesHealthStatusRequest](x: Self) {
    
    inline def setInstances(value: InstanceIdList): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "Instances", js.undefined)
    
    inline def setInstancesVarargs(value: ResourceId*): Self = StObject.set(x, "Instances", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setServiceId(value: ResourceId): Self = StObject.set(x, "ServiceId", value.asInstanceOf[js.Any])
  }
}
