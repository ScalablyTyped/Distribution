package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTransitGatewayPeeringResponse extends StObject {
  
  /**
    * Returns information about the transit gateway peering connection request.
    */
  var TransitGatewayPeering: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.TransitGatewayPeering] = js.undefined
}
object CreateTransitGatewayPeeringResponse {
  
  inline def apply(): CreateTransitGatewayPeeringResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTransitGatewayPeeringResponse]
  }
  
  extension [Self <: CreateTransitGatewayPeeringResponse](x: Self) {
    
    inline def setTransitGatewayPeering(value: TransitGatewayPeering): Self = StObject.set(x, "TransitGatewayPeering", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayPeeringUndefined: Self = StObject.set(x, "TransitGatewayPeering", js.undefined)
  }
}
