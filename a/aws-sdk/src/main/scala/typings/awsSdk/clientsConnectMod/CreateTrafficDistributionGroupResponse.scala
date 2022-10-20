package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTrafficDistributionGroupResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the traffic distribution group.
    */
  var Arn: js.UndefOr[TrafficDistributionGroupArn] = js.undefined
  
  /**
    * The identifier of the traffic distribution group. This can be the ID or the ARN if the API is being called in the Region where the traffic distribution group was created. The ARN must be provided if the call is from the replicated Region.
    */
  var Id: js.UndefOr[TrafficDistributionGroupId] = js.undefined
}
object CreateTrafficDistributionGroupResponse {
  
  inline def apply(): CreateTrafficDistributionGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTrafficDistributionGroupResponse]
  }
  
  extension [Self <: CreateTrafficDistributionGroupResponse](x: Self) {
    
    inline def setArn(value: TrafficDistributionGroupArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: TrafficDistributionGroupId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
