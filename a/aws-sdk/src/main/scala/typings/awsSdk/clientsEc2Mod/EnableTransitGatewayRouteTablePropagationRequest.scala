package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableTransitGatewayRouteTablePropagationRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the attachment.
    */
  var TransitGatewayAttachmentId: js.UndefOr[typings.awsSdk.clientsEc2Mod.TransitGatewayAttachmentId] = js.undefined
  
  /**
    * The ID of the transit gateway route table announcement.
    */
  var TransitGatewayRouteTableAnnouncementId: js.UndefOr[typings.awsSdk.clientsEc2Mod.TransitGatewayRouteTableAnnouncementId] = js.undefined
  
  /**
    * The ID of the propagation route table.
    */
  var TransitGatewayRouteTableId: typings.awsSdk.clientsEc2Mod.TransitGatewayRouteTableId
}
object EnableTransitGatewayRouteTablePropagationRequest {
  
  inline def apply(TransitGatewayRouteTableId: TransitGatewayRouteTableId): EnableTransitGatewayRouteTablePropagationRequest = {
    val __obj = js.Dynamic.literal(TransitGatewayRouteTableId = TransitGatewayRouteTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableTransitGatewayRouteTablePropagationRequest]
  }
  
  extension [Self <: EnableTransitGatewayRouteTablePropagationRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setTransitGatewayAttachmentId(value: TransitGatewayAttachmentId): Self = StObject.set(x, "TransitGatewayAttachmentId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayAttachmentIdUndefined: Self = StObject.set(x, "TransitGatewayAttachmentId", js.undefined)
    
    inline def setTransitGatewayRouteTableAnnouncementId(value: TransitGatewayRouteTableAnnouncementId): Self = StObject.set(x, "TransitGatewayRouteTableAnnouncementId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayRouteTableAnnouncementIdUndefined: Self = StObject.set(x, "TransitGatewayRouteTableAnnouncementId", js.undefined)
    
    inline def setTransitGatewayRouteTableId(value: TransitGatewayRouteTableId): Self = StObject.set(x, "TransitGatewayRouteTableId", value.asInstanceOf[js.Any])
  }
}
