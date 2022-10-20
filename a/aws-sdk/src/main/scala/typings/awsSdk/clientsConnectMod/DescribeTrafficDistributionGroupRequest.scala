package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTrafficDistributionGroupRequest extends StObject {
  
  /**
    * The identifier of the traffic distribution group. This can be the ID or the ARN if the API is being called in the Region where the traffic distribution group was created. The ARN must be provided if the call is from the replicated Region.
    */
  var TrafficDistributionGroupId: TrafficDistributionGroupIdOrArn
}
object DescribeTrafficDistributionGroupRequest {
  
  inline def apply(TrafficDistributionGroupId: TrafficDistributionGroupIdOrArn): DescribeTrafficDistributionGroupRequest = {
    val __obj = js.Dynamic.literal(TrafficDistributionGroupId = TrafficDistributionGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTrafficDistributionGroupRequest]
  }
  
  extension [Self <: DescribeTrafficDistributionGroupRequest](x: Self) {
    
    inline def setTrafficDistributionGroupId(value: TrafficDistributionGroupIdOrArn): Self = StObject.set(x, "TrafficDistributionGroupId", value.asInstanceOf[js.Any])
  }
}
