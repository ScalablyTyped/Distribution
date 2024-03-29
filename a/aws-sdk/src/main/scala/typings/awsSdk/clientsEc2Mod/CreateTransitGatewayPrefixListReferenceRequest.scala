package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTransitGatewayPrefixListReferenceRequest extends StObject {
  
  /**
    * Indicates whether to drop traffic that matches this route.
    */
  var Blackhole: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the prefix list that is used for destination matches.
    */
  var PrefixListId: PrefixListResourceId
  
  /**
    * The ID of the attachment to which traffic is routed.
    */
  var TransitGatewayAttachmentId: js.UndefOr[typings.awsSdk.clientsEc2Mod.TransitGatewayAttachmentId] = js.undefined
  
  /**
    * The ID of the transit gateway route table.
    */
  var TransitGatewayRouteTableId: typings.awsSdk.clientsEc2Mod.TransitGatewayRouteTableId
}
object CreateTransitGatewayPrefixListReferenceRequest {
  
  inline def apply(PrefixListId: PrefixListResourceId, TransitGatewayRouteTableId: TransitGatewayRouteTableId): CreateTransitGatewayPrefixListReferenceRequest = {
    val __obj = js.Dynamic.literal(PrefixListId = PrefixListId.asInstanceOf[js.Any], TransitGatewayRouteTableId = TransitGatewayRouteTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTransitGatewayPrefixListReferenceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateTransitGatewayPrefixListReferenceRequest] (val x: Self) extends AnyVal {
    
    inline def setBlackhole(value: Boolean): Self = StObject.set(x, "Blackhole", value.asInstanceOf[js.Any])
    
    inline def setBlackholeUndefined: Self = StObject.set(x, "Blackhole", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setPrefixListId(value: PrefixListResourceId): Self = StObject.set(x, "PrefixListId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayAttachmentId(value: TransitGatewayAttachmentId): Self = StObject.set(x, "TransitGatewayAttachmentId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayAttachmentIdUndefined: Self = StObject.set(x, "TransitGatewayAttachmentId", js.undefined)
    
    inline def setTransitGatewayRouteTableId(value: TransitGatewayRouteTableId): Self = StObject.set(x, "TransitGatewayRouteTableId", value.asInstanceOf[js.Any])
  }
}
