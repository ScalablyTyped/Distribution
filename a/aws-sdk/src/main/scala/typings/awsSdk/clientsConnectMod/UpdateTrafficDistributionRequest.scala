package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTrafficDistributionRequest extends StObject {
  
  /**
    * The identifier of the traffic distribution group. This can be the ID or the ARN if the API is being called in the Region where the traffic distribution group was created. The ARN must be provided if the call is from the replicated Region.
    */
  var Id: TrafficDistributionGroupIdOrArn
  
  /**
    * The distribution of traffic between the instance and its replica(s).
    */
  var TelephonyConfig: js.UndefOr[typings.awsSdk.clientsConnectMod.TelephonyConfig] = js.undefined
}
object UpdateTrafficDistributionRequest {
  
  inline def apply(Id: TrafficDistributionGroupIdOrArn): UpdateTrafficDistributionRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTrafficDistributionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateTrafficDistributionRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: TrafficDistributionGroupIdOrArn): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setTelephonyConfig(value: TelephonyConfig): Self = StObject.set(x, "TelephonyConfig", value.asInstanceOf[js.Any])
    
    inline def setTelephonyConfigUndefined: Self = StObject.set(x, "TelephonyConfig", js.undefined)
  }
}
