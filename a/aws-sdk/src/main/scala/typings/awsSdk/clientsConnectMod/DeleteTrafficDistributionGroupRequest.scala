package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTrafficDistributionGroupRequest extends StObject {
  
  /**
    * The identifier of the traffic distribution group. This can be the ID or the ARN if the API is being called in the Region where the traffic distribution group was created. The ARN must be provided if the call is from the replicated Region.
    */
  var TrafficDistributionGroupId: TrafficDistributionGroupIdOrArn
}
object DeleteTrafficDistributionGroupRequest {
  
  inline def apply(TrafficDistributionGroupId: TrafficDistributionGroupIdOrArn): DeleteTrafficDistributionGroupRequest = {
    val __obj = js.Dynamic.literal(TrafficDistributionGroupId = TrafficDistributionGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTrafficDistributionGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteTrafficDistributionGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setTrafficDistributionGroupId(value: TrafficDistributionGroupIdOrArn): Self = StObject.set(x, "TrafficDistributionGroupId", value.asInstanceOf[js.Any])
  }
}
