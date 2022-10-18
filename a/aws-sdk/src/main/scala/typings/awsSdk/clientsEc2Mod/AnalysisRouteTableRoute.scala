package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisRouteTableRoute extends StObject {
  
  /**
    * The destination IPv4 address, in CIDR notation.
    */
  var DestinationCidr: js.UndefOr[String] = js.undefined
  
  /**
    * The prefix of the Amazon Web Service.
    */
  var DestinationPrefixListId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of an egress-only internet gateway.
    */
  var EgressOnlyInternetGatewayId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the gateway, such as an internet gateway or virtual private gateway.
    */
  var GatewayId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the instance, such as a NAT instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of a NAT gateway.
    */
  var NatGatewayId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of a network interface.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.undefined
  
  /**
    * Describes how the route was created. The following are the possible values:   CreateRouteTable - The route was automatically created when the route table was created.   CreateRoute - The route was manually added to the route table.   EnableVgwRoutePropagation - The route was propagated by route propagation.  
    */
  var Origin: js.UndefOr[String] = js.undefined
  
  /**
    * The state. The following are the possible values:   active   blackhole  
    */
  var State: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of a transit gateway.
    */
  var TransitGatewayId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of a VPC peering connection.
    */
  var VpcPeeringConnectionId: js.UndefOr[String] = js.undefined
}
object AnalysisRouteTableRoute {
  
  inline def apply(): AnalysisRouteTableRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalysisRouteTableRoute]
  }
  
  extension [Self <: AnalysisRouteTableRoute](x: Self) {
    
    inline def setDestinationCidr(value: String): Self = StObject.set(x, "DestinationCidr", value.asInstanceOf[js.Any])
    
    inline def setDestinationCidrUndefined: Self = StObject.set(x, "DestinationCidr", js.undefined)
    
    inline def setDestinationPrefixListId(value: String): Self = StObject.set(x, "DestinationPrefixListId", value.asInstanceOf[js.Any])
    
    inline def setDestinationPrefixListIdUndefined: Self = StObject.set(x, "DestinationPrefixListId", js.undefined)
    
    inline def setEgressOnlyInternetGatewayId(value: String): Self = StObject.set(x, "EgressOnlyInternetGatewayId", value.asInstanceOf[js.Any])
    
    inline def setEgressOnlyInternetGatewayIdUndefined: Self = StObject.set(x, "EgressOnlyInternetGatewayId", js.undefined)
    
    inline def setGatewayId(value: String): Self = StObject.set(x, "GatewayId", value.asInstanceOf[js.Any])
    
    inline def setGatewayIdUndefined: Self = StObject.set(x, "GatewayId", js.undefined)
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setNatGatewayId(value: String): Self = StObject.set(x, "NatGatewayId", value.asInstanceOf[js.Any])
    
    inline def setNatGatewayIdUndefined: Self = StObject.set(x, "NatGatewayId", js.undefined)
    
    inline def setNetworkInterfaceId(value: String): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
    
    inline def setOrigin(value: String): Self = StObject.set(x, "Origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "Origin", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTransitGatewayId(value: String): Self = StObject.set(x, "TransitGatewayId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayIdUndefined: Self = StObject.set(x, "TransitGatewayId", js.undefined)
    
    inline def setVpcPeeringConnectionId(value: String): Self = StObject.set(x, "VpcPeeringConnectionId", value.asInstanceOf[js.Any])
    
    inline def setVpcPeeringConnectionIdUndefined: Self = StObject.set(x, "VpcPeeringConnectionId", js.undefined)
  }
}
