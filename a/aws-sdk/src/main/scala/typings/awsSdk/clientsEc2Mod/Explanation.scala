package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Explanation extends StObject {
  
  /**
    * The network ACL.
    */
  var Acl: js.UndefOr[AnalysisComponent] = js.undefined
  
  /**
    * The network ACL rule.
    */
  var AclRule: js.UndefOr[AnalysisAclRule] = js.undefined
  
  /**
    * The IPv4 address, in CIDR notation.
    */
  var Address: js.UndefOr[IpAddress] = js.undefined
  
  /**
    * The IPv4 addresses, in CIDR notation.
    */
  var Addresses: js.UndefOr[IpAddressList] = js.undefined
  
  /**
    * The resource to which the component is attached.
    */
  var AttachedTo: js.UndefOr[AnalysisComponent] = js.undefined
  
  /**
    * The Availability Zones.
    */
  var AvailabilityZones: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * The CIDR ranges.
    */
  var Cidrs: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * The listener for a Classic Load Balancer.
    */
  var ClassicLoadBalancerListener: js.UndefOr[AnalysisLoadBalancerListener] = js.undefined
  
  /**
    * The component.
    */
  var Component: js.UndefOr[AnalysisComponent] = js.undefined
  
  /**
    * The Amazon Web Services account for the component.
    */
  var ComponentAccount: js.UndefOr[typings.awsSdk.clientsEc2Mod.ComponentAccount] = js.undefined
  
  /**
    * The Region for the component.
    */
  var ComponentRegion: js.UndefOr[typings.awsSdk.clientsEc2Mod.ComponentRegion] = js.undefined
  
  /**
    * The customer gateway.
    */
  var CustomerGateway: js.UndefOr[AnalysisComponent] = js.undefined
  
  /**
    * The destination.
    */
  var Destination: js.UndefOr[AnalysisComponent] = js.undefined
  
  /**
    * The destination VPC.
    */
  var DestinationVpc: js.UndefOr[AnalysisComponent] = js.undefined
  
  /**
    * The direction. The following are the possible values:   egress   ingress  
    */
  var Direction: js.UndefOr[String] = js.undefined
  
  /**
    * The load balancer listener.
    */
  var ElasticLoadBalancerListener: js.UndefOr[AnalysisComponent] = js.undefined
  
  /**
    * The explanation code.
    */
  var ExplanationCode: js.UndefOr[String] = js.undefined
  
  /**
    * The Network Firewall stateful rule.
    */
  var FirewallStatefulRule: js.UndefOr[typings.awsSdk.clientsEc2Mod.FirewallStatefulRule] = js.undefined
  
  /**
    * The Network Firewall stateless rule.
    */
  var FirewallStatelessRule: js.UndefOr[typings.awsSdk.clientsEc2Mod.FirewallStatelessRule] = js.undefined
  
  /**
    * The route table.
    */
  var IngressRouteTable: js.UndefOr[AnalysisComponent] = js.undefined
  
  /**
    * The internet gateway.
    */
  var InternetGateway: js.UndefOr[AnalysisComponent] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var LoadBalancerArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The listener port of the load balancer.
    */
  var LoadBalancerListenerPort: js.UndefOr[Port] = js.undefined
  
  /**
    * The target.
    */
  var LoadBalancerTarget: js.UndefOr[AnalysisLoadBalancerTarget] = js.undefined
  
  /**
    * The target group.
    */
  var LoadBalancerTargetGroup: js.UndefOr[AnalysisComponent] = js.undefined
  
  /**
    * The target groups.
    */
  var LoadBalancerTargetGroups: js.UndefOr[AnalysisComponentList] = js.undefined
  
  /**
    * The target port.
    */
  var LoadBalancerTargetPort: js.UndefOr[Port] = js.undefined
  
  /**
    * The missing component.
    */
  var MissingComponent: js.UndefOr[String] = js.undefined
  
  /**
    * The NAT gateway.
    */
  var NatGateway: js.UndefOr[AnalysisComponent] = js.undefined
  
  /**
    * The network interface.
    */
  var NetworkInterface: js.UndefOr[AnalysisComponent] = js.undefined
  
  /**
    * The packet field.
    */
  var PacketField: js.UndefOr[String] = js.undefined
  
  /**
    * The port.
    */
  var Port: js.UndefOr[typings.awsSdk.clientsEc2Mod.Port] = js.undefined
  
  /**
    * The port ranges.
    */
  var PortRanges: js.UndefOr[PortRangeList] = js.undefined
  
  /**
    * The prefix list.
    */
  var PrefixList: js.UndefOr[AnalysisComponent] = js.undefined
  
  /**
    * The protocols.
    */
  var Protocols: js.UndefOr[StringList] = js.undefined
  
  /**
    * The route table.
    */
  var RouteTable: js.UndefOr[AnalysisComponent] = js.undefined
  
  /**
    * The route table route.
    */
  var RouteTableRoute: js.UndefOr[AnalysisRouteTableRoute] = js.undefined
  
  /**
    * The security group.
    */
  var SecurityGroup: js.UndefOr[AnalysisComponent] = js.undefined
  
  /**
    * The security group rule.
    */
  var SecurityGroupRule: js.UndefOr[AnalysisSecurityGroupRule] = js.undefined
  
  /**
    * The security groups.
    */
  var SecurityGroups: js.UndefOr[AnalysisComponentList] = js.undefined
  
  /**
    * The source VPC.
    */
  var SourceVpc: js.UndefOr[AnalysisComponent] = js.undefined
  
  /**
    * The state.
    */
  var State: js.UndefOr[String] = js.undefined
  
  /**
    * The subnet.
    */
  var Subnet: js.UndefOr[AnalysisComponent] = js.undefined
  
  /**
    * The route table for the subnet.
    */
  var SubnetRouteTable: js.UndefOr[AnalysisComponent] = js.undefined
  
  /**
    * The transit gateway.
    */
  var TransitGateway: js.UndefOr[AnalysisComponent] = js.undefined
  
  /**
    * The transit gateway attachment.
    */
  var TransitGatewayAttachment: js.UndefOr[AnalysisComponent] = js.undefined
  
  /**
    * The transit gateway route table.
    */
  var TransitGatewayRouteTable: js.UndefOr[AnalysisComponent] = js.undefined
  
  /**
    * The transit gateway route table route.
    */
  var TransitGatewayRouteTableRoute: js.UndefOr[typings.awsSdk.clientsEc2Mod.TransitGatewayRouteTableRoute] = js.undefined
  
  /**
    * The component VPC.
    */
  var Vpc: js.UndefOr[AnalysisComponent] = js.undefined
  
  /**
    * The VPC endpoint.
    */
  var VpcEndpoint: js.UndefOr[AnalysisComponent] = js.undefined
  
  /**
    * The VPC peering connection.
    */
  var VpcPeeringConnection: js.UndefOr[AnalysisComponent] = js.undefined
  
  /**
    * The VPN connection.
    */
  var VpnConnection: js.UndefOr[AnalysisComponent] = js.undefined
  
  /**
    * The VPN gateway.
    */
  var VpnGateway: js.UndefOr[AnalysisComponent] = js.undefined
}
object Explanation {
  
  inline def apply(): Explanation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Explanation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Explanation] (val x: Self) extends AnyVal {
    
    inline def setAcl(value: AnalysisComponent): Self = StObject.set(x, "Acl", value.asInstanceOf[js.Any])
    
    inline def setAclRule(value: AnalysisAclRule): Self = StObject.set(x, "AclRule", value.asInstanceOf[js.Any])
    
    inline def setAclRuleUndefined: Self = StObject.set(x, "AclRule", js.undefined)
    
    inline def setAclUndefined: Self = StObject.set(x, "Acl", js.undefined)
    
    inline def setAddress(value: IpAddress): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
    
    inline def setAddresses(value: IpAddressList): Self = StObject.set(x, "Addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesUndefined: Self = StObject.set(x, "Addresses", js.undefined)
    
    inline def setAddressesVarargs(value: IpAddress*): Self = StObject.set(x, "Addresses", js.Array(value*))
    
    inline def setAttachedTo(value: AnalysisComponent): Self = StObject.set(x, "AttachedTo", value.asInstanceOf[js.Any])
    
    inline def setAttachedToUndefined: Self = StObject.set(x, "AttachedTo", js.undefined)
    
    inline def setAvailabilityZones(value: ValueStringList): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    inline def setAvailabilityZonesVarargs(value: String*): Self = StObject.set(x, "AvailabilityZones", js.Array(value*))
    
    inline def setCidrs(value: ValueStringList): Self = StObject.set(x, "Cidrs", value.asInstanceOf[js.Any])
    
    inline def setCidrsUndefined: Self = StObject.set(x, "Cidrs", js.undefined)
    
    inline def setCidrsVarargs(value: String*): Self = StObject.set(x, "Cidrs", js.Array(value*))
    
    inline def setClassicLoadBalancerListener(value: AnalysisLoadBalancerListener): Self = StObject.set(x, "ClassicLoadBalancerListener", value.asInstanceOf[js.Any])
    
    inline def setClassicLoadBalancerListenerUndefined: Self = StObject.set(x, "ClassicLoadBalancerListener", js.undefined)
    
    inline def setComponent(value: AnalysisComponent): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    inline def setComponentAccount(value: ComponentAccount): Self = StObject.set(x, "ComponentAccount", value.asInstanceOf[js.Any])
    
    inline def setComponentAccountUndefined: Self = StObject.set(x, "ComponentAccount", js.undefined)
    
    inline def setComponentRegion(value: ComponentRegion): Self = StObject.set(x, "ComponentRegion", value.asInstanceOf[js.Any])
    
    inline def setComponentRegionUndefined: Self = StObject.set(x, "ComponentRegion", js.undefined)
    
    inline def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
    
    inline def setCustomerGateway(value: AnalysisComponent): Self = StObject.set(x, "CustomerGateway", value.asInstanceOf[js.Any])
    
    inline def setCustomerGatewayUndefined: Self = StObject.set(x, "CustomerGateway", js.undefined)
    
    inline def setDestination(value: AnalysisComponent): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
    
    inline def setDestinationVpc(value: AnalysisComponent): Self = StObject.set(x, "DestinationVpc", value.asInstanceOf[js.Any])
    
    inline def setDestinationVpcUndefined: Self = StObject.set(x, "DestinationVpc", js.undefined)
    
    inline def setDirection(value: String): Self = StObject.set(x, "Direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "Direction", js.undefined)
    
    inline def setElasticLoadBalancerListener(value: AnalysisComponent): Self = StObject.set(x, "ElasticLoadBalancerListener", value.asInstanceOf[js.Any])
    
    inline def setElasticLoadBalancerListenerUndefined: Self = StObject.set(x, "ElasticLoadBalancerListener", js.undefined)
    
    inline def setExplanationCode(value: String): Self = StObject.set(x, "ExplanationCode", value.asInstanceOf[js.Any])
    
    inline def setExplanationCodeUndefined: Self = StObject.set(x, "ExplanationCode", js.undefined)
    
    inline def setFirewallStatefulRule(value: FirewallStatefulRule): Self = StObject.set(x, "FirewallStatefulRule", value.asInstanceOf[js.Any])
    
    inline def setFirewallStatefulRuleUndefined: Self = StObject.set(x, "FirewallStatefulRule", js.undefined)
    
    inline def setFirewallStatelessRule(value: FirewallStatelessRule): Self = StObject.set(x, "FirewallStatelessRule", value.asInstanceOf[js.Any])
    
    inline def setFirewallStatelessRuleUndefined: Self = StObject.set(x, "FirewallStatelessRule", js.undefined)
    
    inline def setIngressRouteTable(value: AnalysisComponent): Self = StObject.set(x, "IngressRouteTable", value.asInstanceOf[js.Any])
    
    inline def setIngressRouteTableUndefined: Self = StObject.set(x, "IngressRouteTable", js.undefined)
    
    inline def setInternetGateway(value: AnalysisComponent): Self = StObject.set(x, "InternetGateway", value.asInstanceOf[js.Any])
    
    inline def setInternetGatewayUndefined: Self = StObject.set(x, "InternetGateway", js.undefined)
    
    inline def setLoadBalancerArn(value: ResourceArn): Self = StObject.set(x, "LoadBalancerArn", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerArnUndefined: Self = StObject.set(x, "LoadBalancerArn", js.undefined)
    
    inline def setLoadBalancerListenerPort(value: Port): Self = StObject.set(x, "LoadBalancerListenerPort", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerListenerPortUndefined: Self = StObject.set(x, "LoadBalancerListenerPort", js.undefined)
    
    inline def setLoadBalancerTarget(value: AnalysisLoadBalancerTarget): Self = StObject.set(x, "LoadBalancerTarget", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerTargetGroup(value: AnalysisComponent): Self = StObject.set(x, "LoadBalancerTargetGroup", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerTargetGroupUndefined: Self = StObject.set(x, "LoadBalancerTargetGroup", js.undefined)
    
    inline def setLoadBalancerTargetGroups(value: AnalysisComponentList): Self = StObject.set(x, "LoadBalancerTargetGroups", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerTargetGroupsUndefined: Self = StObject.set(x, "LoadBalancerTargetGroups", js.undefined)
    
    inline def setLoadBalancerTargetGroupsVarargs(value: AnalysisComponent*): Self = StObject.set(x, "LoadBalancerTargetGroups", js.Array(value*))
    
    inline def setLoadBalancerTargetPort(value: Port): Self = StObject.set(x, "LoadBalancerTargetPort", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerTargetPortUndefined: Self = StObject.set(x, "LoadBalancerTargetPort", js.undefined)
    
    inline def setLoadBalancerTargetUndefined: Self = StObject.set(x, "LoadBalancerTarget", js.undefined)
    
    inline def setMissingComponent(value: String): Self = StObject.set(x, "MissingComponent", value.asInstanceOf[js.Any])
    
    inline def setMissingComponentUndefined: Self = StObject.set(x, "MissingComponent", js.undefined)
    
    inline def setNatGateway(value: AnalysisComponent): Self = StObject.set(x, "NatGateway", value.asInstanceOf[js.Any])
    
    inline def setNatGatewayUndefined: Self = StObject.set(x, "NatGateway", js.undefined)
    
    inline def setNetworkInterface(value: AnalysisComponent): Self = StObject.set(x, "NetworkInterface", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceUndefined: Self = StObject.set(x, "NetworkInterface", js.undefined)
    
    inline def setPacketField(value: String): Self = StObject.set(x, "PacketField", value.asInstanceOf[js.Any])
    
    inline def setPacketFieldUndefined: Self = StObject.set(x, "PacketField", js.undefined)
    
    inline def setPort(value: Port): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortRanges(value: PortRangeList): Self = StObject.set(x, "PortRanges", value.asInstanceOf[js.Any])
    
    inline def setPortRangesUndefined: Self = StObject.set(x, "PortRanges", js.undefined)
    
    inline def setPortRangesVarargs(value: PortRange*): Self = StObject.set(x, "PortRanges", js.Array(value*))
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setPrefixList(value: AnalysisComponent): Self = StObject.set(x, "PrefixList", value.asInstanceOf[js.Any])
    
    inline def setPrefixListUndefined: Self = StObject.set(x, "PrefixList", js.undefined)
    
    inline def setProtocols(value: StringList): Self = StObject.set(x, "Protocols", value.asInstanceOf[js.Any])
    
    inline def setProtocolsUndefined: Self = StObject.set(x, "Protocols", js.undefined)
    
    inline def setProtocolsVarargs(value: String*): Self = StObject.set(x, "Protocols", js.Array(value*))
    
    inline def setRouteTable(value: AnalysisComponent): Self = StObject.set(x, "RouteTable", value.asInstanceOf[js.Any])
    
    inline def setRouteTableRoute(value: AnalysisRouteTableRoute): Self = StObject.set(x, "RouteTableRoute", value.asInstanceOf[js.Any])
    
    inline def setRouteTableRouteUndefined: Self = StObject.set(x, "RouteTableRoute", js.undefined)
    
    inline def setRouteTableUndefined: Self = StObject.set(x, "RouteTable", js.undefined)
    
    inline def setSecurityGroup(value: AnalysisComponent): Self = StObject.set(x, "SecurityGroup", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupRule(value: AnalysisSecurityGroupRule): Self = StObject.set(x, "SecurityGroupRule", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupRuleUndefined: Self = StObject.set(x, "SecurityGroupRule", js.undefined)
    
    inline def setSecurityGroupUndefined: Self = StObject.set(x, "SecurityGroup", js.undefined)
    
    inline def setSecurityGroups(value: AnalysisComponentList): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    inline def setSecurityGroupsVarargs(value: AnalysisComponent*): Self = StObject.set(x, "SecurityGroups", js.Array(value*))
    
    inline def setSourceVpc(value: AnalysisComponent): Self = StObject.set(x, "SourceVpc", value.asInstanceOf[js.Any])
    
    inline def setSourceVpcUndefined: Self = StObject.set(x, "SourceVpc", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setSubnet(value: AnalysisComponent): Self = StObject.set(x, "Subnet", value.asInstanceOf[js.Any])
    
    inline def setSubnetRouteTable(value: AnalysisComponent): Self = StObject.set(x, "SubnetRouteTable", value.asInstanceOf[js.Any])
    
    inline def setSubnetRouteTableUndefined: Self = StObject.set(x, "SubnetRouteTable", js.undefined)
    
    inline def setSubnetUndefined: Self = StObject.set(x, "Subnet", js.undefined)
    
    inline def setTransitGateway(value: AnalysisComponent): Self = StObject.set(x, "TransitGateway", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayAttachment(value: AnalysisComponent): Self = StObject.set(x, "TransitGatewayAttachment", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayAttachmentUndefined: Self = StObject.set(x, "TransitGatewayAttachment", js.undefined)
    
    inline def setTransitGatewayRouteTable(value: AnalysisComponent): Self = StObject.set(x, "TransitGatewayRouteTable", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayRouteTableRoute(value: TransitGatewayRouteTableRoute): Self = StObject.set(x, "TransitGatewayRouteTableRoute", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayRouteTableRouteUndefined: Self = StObject.set(x, "TransitGatewayRouteTableRoute", js.undefined)
    
    inline def setTransitGatewayRouteTableUndefined: Self = StObject.set(x, "TransitGatewayRouteTable", js.undefined)
    
    inline def setTransitGatewayUndefined: Self = StObject.set(x, "TransitGateway", js.undefined)
    
    inline def setVpc(value: AnalysisComponent): Self = StObject.set(x, "Vpc", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpoint(value: AnalysisComponent): Self = StObject.set(x, "VpcEndpoint", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointUndefined: Self = StObject.set(x, "VpcEndpoint", js.undefined)
    
    inline def setVpcPeeringConnection(value: AnalysisComponent): Self = StObject.set(x, "VpcPeeringConnection", value.asInstanceOf[js.Any])
    
    inline def setVpcPeeringConnectionUndefined: Self = StObject.set(x, "VpcPeeringConnection", js.undefined)
    
    inline def setVpcUndefined: Self = StObject.set(x, "Vpc", js.undefined)
    
    inline def setVpnConnection(value: AnalysisComponent): Self = StObject.set(x, "VpnConnection", value.asInstanceOf[js.Any])
    
    inline def setVpnConnectionUndefined: Self = StObject.set(x, "VpnConnection", js.undefined)
    
    inline def setVpnGateway(value: AnalysisComponent): Self = StObject.set(x, "VpnGateway", value.asInstanceOf[js.Any])
    
    inline def setVpnGatewayUndefined: Self = StObject.set(x, "VpnGateway", js.undefined)
  }
}
