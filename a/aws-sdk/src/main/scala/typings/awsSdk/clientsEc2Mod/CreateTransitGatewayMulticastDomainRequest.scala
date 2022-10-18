package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTransitGatewayMulticastDomainRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The options for the transit gateway multicast domain.
    */
  var Options: js.UndefOr[CreateTransitGatewayMulticastDomainRequestOptions] = js.undefined
  
  /**
    * The tags for the transit gateway multicast domain.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
  
  /**
    * The ID of the transit gateway.
    */
  var TransitGatewayId: typings.awsSdk.clientsEc2Mod.TransitGatewayId
}
object CreateTransitGatewayMulticastDomainRequest {
  
  inline def apply(TransitGatewayId: TransitGatewayId): CreateTransitGatewayMulticastDomainRequest = {
    val __obj = js.Dynamic.literal(TransitGatewayId = TransitGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTransitGatewayMulticastDomainRequest]
  }
  
  extension [Self <: CreateTransitGatewayMulticastDomainRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setOptions(value: CreateTransitGatewayMulticastDomainRequestOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    inline def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value*))
    
    inline def setTransitGatewayId(value: TransitGatewayId): Self = StObject.set(x, "TransitGatewayId", value.asInstanceOf[js.Any])
  }
}
