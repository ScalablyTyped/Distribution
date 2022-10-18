package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTransitGatewayRouteTableAttachmentResponse extends StObject {
  
  /**
    * Returns information about the transit gateway route table attachment.
    */
  var TransitGatewayRouteTableAttachment: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.TransitGatewayRouteTableAttachment] = js.undefined
}
object GetTransitGatewayRouteTableAttachmentResponse {
  
  inline def apply(): GetTransitGatewayRouteTableAttachmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTransitGatewayRouteTableAttachmentResponse]
  }
  
  extension [Self <: GetTransitGatewayRouteTableAttachmentResponse](x: Self) {
    
    inline def setTransitGatewayRouteTableAttachment(value: TransitGatewayRouteTableAttachment): Self = StObject.set(x, "TransitGatewayRouteTableAttachment", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayRouteTableAttachmentUndefined: Self = StObject.set(x, "TransitGatewayRouteTableAttachment", js.undefined)
  }
}
