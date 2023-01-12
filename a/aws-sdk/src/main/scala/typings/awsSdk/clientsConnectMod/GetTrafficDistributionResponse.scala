package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTrafficDistributionResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the traffic distribution group.
    */
  var Arn: js.UndefOr[TrafficDistributionGroupArn] = js.undefined
  
  /**
    * The identifier of the traffic distribution group. This can be the ID or the ARN if the API is being called in the Region where the traffic distribution group was created. The ARN must be provided if the call is from the replicated Region.
    */
  var Id: js.UndefOr[TrafficDistributionGroupId] = js.undefined
  
  /**
    * The distribution of traffic between the instance and its replicas.
    */
  var TelephonyConfig: js.UndefOr[typings.awsSdk.clientsConnectMod.TelephonyConfig] = js.undefined
}
object GetTrafficDistributionResponse {
  
  inline def apply(): GetTrafficDistributionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTrafficDistributionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTrafficDistributionResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: TrafficDistributionGroupArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: TrafficDistributionGroupId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setTelephonyConfig(value: TelephonyConfig): Self = StObject.set(x, "TelephonyConfig", value.asInstanceOf[js.Any])
    
    inline def setTelephonyConfigUndefined: Self = StObject.set(x, "TelephonyConfig", js.undefined)
  }
}
