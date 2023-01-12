package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTransitGatewayPeeringRequest extends StObject {
  
  /**
    * The ID of the peering request.
    */
  var PeeringId: typings.awsSdk.clientsNetworkmanagerMod.PeeringId
}
object GetTransitGatewayPeeringRequest {
  
  inline def apply(PeeringId: PeeringId): GetTransitGatewayPeeringRequest = {
    val __obj = js.Dynamic.literal(PeeringId = PeeringId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTransitGatewayPeeringRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTransitGatewayPeeringRequest] (val x: Self) extends AnyVal {
    
    inline def setPeeringId(value: PeeringId): Self = StObject.set(x, "PeeringId", value.asInstanceOf[js.Any])
  }
}
