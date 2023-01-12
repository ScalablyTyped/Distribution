package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTransitGatewayRouteTableAnnouncementRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The transit gateway route table ID that's being deleted. 
    */
  var TransitGatewayRouteTableAnnouncementId: typings.awsSdk.clientsEc2Mod.TransitGatewayRouteTableAnnouncementId
}
object DeleteTransitGatewayRouteTableAnnouncementRequest {
  
  inline def apply(TransitGatewayRouteTableAnnouncementId: TransitGatewayRouteTableAnnouncementId): DeleteTransitGatewayRouteTableAnnouncementRequest = {
    val __obj = js.Dynamic.literal(TransitGatewayRouteTableAnnouncementId = TransitGatewayRouteTableAnnouncementId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTransitGatewayRouteTableAnnouncementRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteTransitGatewayRouteTableAnnouncementRequest] (val x: Self) extends AnyVal {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setTransitGatewayRouteTableAnnouncementId(value: TransitGatewayRouteTableAnnouncementId): Self = StObject.set(x, "TransitGatewayRouteTableAnnouncementId", value.asInstanceOf[js.Any])
  }
}
