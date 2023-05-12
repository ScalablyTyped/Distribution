package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteSetDetails extends StObject {
  
  /**
    *  The ID of the carrier gateway. 
    */
  var CarrierGatewayId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the core network. 
    */
  var CoreNetworkArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The IPv4 CIDR block used for the destination match. 
    */
  var DestinationCidrBlock: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The IPv6 CIDR block used for the destination match. 
    */
  var DestinationIpv6CidrBlock: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The prefix of the destination Amazon Web Service. 
    */
  var DestinationPrefixListId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The ID of the egress-only internet gateway. 
    */
  var EgressOnlyInternetGatewayId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The ID of a gateway attached to your VPC. 
    */
  var GatewayId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The ID of a NAT instance in your VPC. 
    */
  var InstanceId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The ID of the Amazon Web Services account that owns the instance. 
    */
  var InstanceOwnerId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The ID of the local gateway. 
    */
  var LocalGatewayId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The ID of a NAT gateway. 
    */
  var NatGatewayId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The ID of the network interface. 
    */
  var NetworkInterfaceId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  Describes how the route was created. 
    */
  var Origin: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The state of the route. 
    */
  var State: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The ID of a transit gateway. 
    */
  var TransitGatewayId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The ID of a VPC peering connection. 
    */
  var VpcPeeringConnectionId: js.UndefOr[NonEmptyString] = js.undefined
}
object RouteSetDetails {
  
  inline def apply(): RouteSetDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteSetDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RouteSetDetails] (val x: Self) extends AnyVal {
    
    inline def setCarrierGatewayId(value: NonEmptyString): Self = StObject.set(x, "CarrierGatewayId", value.asInstanceOf[js.Any])
    
    inline def setCarrierGatewayIdUndefined: Self = StObject.set(x, "CarrierGatewayId", js.undefined)
    
    inline def setCoreNetworkArn(value: NonEmptyString): Self = StObject.set(x, "CoreNetworkArn", value.asInstanceOf[js.Any])
    
    inline def setCoreNetworkArnUndefined: Self = StObject.set(x, "CoreNetworkArn", js.undefined)
    
    inline def setDestinationCidrBlock(value: NonEmptyString): Self = StObject.set(x, "DestinationCidrBlock", value.asInstanceOf[js.Any])
    
    inline def setDestinationCidrBlockUndefined: Self = StObject.set(x, "DestinationCidrBlock", js.undefined)
    
    inline def setDestinationIpv6CidrBlock(value: NonEmptyString): Self = StObject.set(x, "DestinationIpv6CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setDestinationIpv6CidrBlockUndefined: Self = StObject.set(x, "DestinationIpv6CidrBlock", js.undefined)
    
    inline def setDestinationPrefixListId(value: NonEmptyString): Self = StObject.set(x, "DestinationPrefixListId", value.asInstanceOf[js.Any])
    
    inline def setDestinationPrefixListIdUndefined: Self = StObject.set(x, "DestinationPrefixListId", js.undefined)
    
    inline def setEgressOnlyInternetGatewayId(value: NonEmptyString): Self = StObject.set(x, "EgressOnlyInternetGatewayId", value.asInstanceOf[js.Any])
    
    inline def setEgressOnlyInternetGatewayIdUndefined: Self = StObject.set(x, "EgressOnlyInternetGatewayId", js.undefined)
    
    inline def setGatewayId(value: NonEmptyString): Self = StObject.set(x, "GatewayId", value.asInstanceOf[js.Any])
    
    inline def setGatewayIdUndefined: Self = StObject.set(x, "GatewayId", js.undefined)
    
    inline def setInstanceId(value: NonEmptyString): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setInstanceOwnerId(value: NonEmptyString): Self = StObject.set(x, "InstanceOwnerId", value.asInstanceOf[js.Any])
    
    inline def setInstanceOwnerIdUndefined: Self = StObject.set(x, "InstanceOwnerId", js.undefined)
    
    inline def setLocalGatewayId(value: NonEmptyString): Self = StObject.set(x, "LocalGatewayId", value.asInstanceOf[js.Any])
    
    inline def setLocalGatewayIdUndefined: Self = StObject.set(x, "LocalGatewayId", js.undefined)
    
    inline def setNatGatewayId(value: NonEmptyString): Self = StObject.set(x, "NatGatewayId", value.asInstanceOf[js.Any])
    
    inline def setNatGatewayIdUndefined: Self = StObject.set(x, "NatGatewayId", js.undefined)
    
    inline def setNetworkInterfaceId(value: NonEmptyString): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
    
    inline def setOrigin(value: NonEmptyString): Self = StObject.set(x, "Origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "Origin", js.undefined)
    
    inline def setState(value: NonEmptyString): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTransitGatewayId(value: NonEmptyString): Self = StObject.set(x, "TransitGatewayId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayIdUndefined: Self = StObject.set(x, "TransitGatewayId", js.undefined)
    
    inline def setVpcPeeringConnectionId(value: NonEmptyString): Self = StObject.set(x, "VpcPeeringConnectionId", value.asInstanceOf[js.Any])
    
    inline def setVpcPeeringConnectionIdUndefined: Self = StObject.set(x, "VpcPeeringConnectionId", js.undefined)
  }
}
