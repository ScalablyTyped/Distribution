package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkRouteDestination extends StObject {
  
  /**
    * The ID of a core network attachment.
    */
  var CoreNetworkAttachmentId: js.UndefOr[AttachmentId] = js.undefined
  
  /**
    * The edge location for the network destination.
    */
  var EdgeLocation: js.UndefOr[ExternalRegionCode] = js.undefined
  
  /**
    * The ID of the resource.
    */
  var ResourceId: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The resource type.
    */
  var ResourceType: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The name of the segment.
    */
  var SegmentName: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The ID of the transit gateway attachment.
    */
  var TransitGatewayAttachmentId: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.TransitGatewayAttachmentId] = js.undefined
}
object NetworkRouteDestination {
  
  inline def apply(): NetworkRouteDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkRouteDestination]
  }
  
  extension [Self <: NetworkRouteDestination](x: Self) {
    
    inline def setCoreNetworkAttachmentId(value: AttachmentId): Self = StObject.set(x, "CoreNetworkAttachmentId", value.asInstanceOf[js.Any])
    
    inline def setCoreNetworkAttachmentIdUndefined: Self = StObject.set(x, "CoreNetworkAttachmentId", js.undefined)
    
    inline def setEdgeLocation(value: ExternalRegionCode): Self = StObject.set(x, "EdgeLocation", value.asInstanceOf[js.Any])
    
    inline def setEdgeLocationUndefined: Self = StObject.set(x, "EdgeLocation", js.undefined)
    
    inline def setResourceId(value: ConstrainedString): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setResourceType(value: ConstrainedString): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setSegmentName(value: ConstrainedString): Self = StObject.set(x, "SegmentName", value.asInstanceOf[js.Any])
    
    inline def setSegmentNameUndefined: Self = StObject.set(x, "SegmentName", js.undefined)
    
    inline def setTransitGatewayAttachmentId(value: TransitGatewayAttachmentId): Self = StObject.set(x, "TransitGatewayAttachmentId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayAttachmentIdUndefined: Self = StObject.set(x, "TransitGatewayAttachmentId", js.undefined)
  }
}
