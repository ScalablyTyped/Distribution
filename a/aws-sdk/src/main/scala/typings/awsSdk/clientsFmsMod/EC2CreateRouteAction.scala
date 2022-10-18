package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EC2CreateRouteAction extends StObject {
  
  /**
    * A description of CreateRoute action in Amazon EC2.
    */
  var Description: js.UndefOr[LengthBoundedString] = js.undefined
  
  /**
    * Information about the IPv4 CIDR address block used for the destination match.
    */
  var DestinationCidrBlock: js.UndefOr[CIDR] = js.undefined
  
  /**
    * Information about the IPv6 CIDR block destination.
    */
  var DestinationIpv6CidrBlock: js.UndefOr[CIDR] = js.undefined
  
  /**
    * Information about the ID of a prefix list used for the destination match.
    */
  var DestinationPrefixListId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * Information about the ID of an internet gateway or virtual private gateway attached to your VPC.
    */
  var GatewayId: js.UndefOr[ActionTarget] = js.undefined
  
  /**
    * Information about the ID of the route table for the route.
    */
  var RouteTableId: ActionTarget
  
  /**
    * Information about the ID of a VPC endpoint. Supported for Gateway Load Balancer endpoints only.
    */
  var VpcEndpointId: js.UndefOr[ActionTarget] = js.undefined
}
object EC2CreateRouteAction {
  
  inline def apply(RouteTableId: ActionTarget): EC2CreateRouteAction = {
    val __obj = js.Dynamic.literal(RouteTableId = RouteTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EC2CreateRouteAction]
  }
  
  extension [Self <: EC2CreateRouteAction](x: Self) {
    
    inline def setDescription(value: LengthBoundedString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDestinationCidrBlock(value: CIDR): Self = StObject.set(x, "DestinationCidrBlock", value.asInstanceOf[js.Any])
    
    inline def setDestinationCidrBlockUndefined: Self = StObject.set(x, "DestinationCidrBlock", js.undefined)
    
    inline def setDestinationIpv6CidrBlock(value: CIDR): Self = StObject.set(x, "DestinationIpv6CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setDestinationIpv6CidrBlockUndefined: Self = StObject.set(x, "DestinationIpv6CidrBlock", js.undefined)
    
    inline def setDestinationPrefixListId(value: ResourceId): Self = StObject.set(x, "DestinationPrefixListId", value.asInstanceOf[js.Any])
    
    inline def setDestinationPrefixListIdUndefined: Self = StObject.set(x, "DestinationPrefixListId", js.undefined)
    
    inline def setGatewayId(value: ActionTarget): Self = StObject.set(x, "GatewayId", value.asInstanceOf[js.Any])
    
    inline def setGatewayIdUndefined: Self = StObject.set(x, "GatewayId", js.undefined)
    
    inline def setRouteTableId(value: ActionTarget): Self = StObject.set(x, "RouteTableId", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointId(value: ActionTarget): Self = StObject.set(x, "VpcEndpointId", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointIdUndefined: Self = StObject.set(x, "VpcEndpointId", js.undefined)
  }
}
