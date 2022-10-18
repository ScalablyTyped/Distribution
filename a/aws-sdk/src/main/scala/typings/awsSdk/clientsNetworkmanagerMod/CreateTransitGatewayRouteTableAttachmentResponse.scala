package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTransitGatewayRouteTableAttachmentResponse extends StObject {
  
  /**
    * The route table associated with the create transit gateway route table attachment request.
    */
  var TransitGatewayRouteTableAttachment: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.TransitGatewayRouteTableAttachment] = js.undefined
}
object CreateTransitGatewayRouteTableAttachmentResponse {
  
  inline def apply(): CreateTransitGatewayRouteTableAttachmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTransitGatewayRouteTableAttachmentResponse]
  }
  
  extension [Self <: CreateTransitGatewayRouteTableAttachmentResponse](x: Self) {
    
    inline def setTransitGatewayRouteTableAttachment(value: TransitGatewayRouteTableAttachment): Self = StObject.set(x, "TransitGatewayRouteTableAttachment", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayRouteTableAttachmentUndefined: Self = StObject.set(x, "TransitGatewayRouteTableAttachment", js.undefined)
  }
}
