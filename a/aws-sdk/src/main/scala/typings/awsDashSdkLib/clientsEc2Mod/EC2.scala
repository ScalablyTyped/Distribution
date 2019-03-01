package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EC2
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_EC2: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsEc2Mod.EC2Ns.ClientConfiguration = js.native
  /**
    * Accepts the Convertible Reserved Instance exchange quote described in the GetReservedInstancesExchangeQuote call.
    */
  def acceptReservedInstancesExchangeQuote(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AcceptReservedInstancesExchangeQuoteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def acceptReservedInstancesExchangeQuote(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.AcceptReservedInstancesExchangeQuoteResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AcceptReservedInstancesExchangeQuoteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Accepts the Convertible Reserved Instance exchange quote described in the GetReservedInstancesExchangeQuote call.
    */
  def acceptReservedInstancesExchangeQuote(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AcceptReservedInstancesExchangeQuoteRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AcceptReservedInstancesExchangeQuoteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def acceptReservedInstancesExchangeQuote(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AcceptReservedInstancesExchangeQuoteRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.AcceptReservedInstancesExchangeQuoteResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AcceptReservedInstancesExchangeQuoteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Accepts a request to attach a VPC to a transit gateway. The VPC attachment must be in the pendingAcceptance state. Use DescribeTransitGatewayVpcAttachments to view your pending VPC attachment requests. Use RejectTransitGatewayVpcAttachment to reject a VPC attachment request.
    */
  def acceptTransitGatewayVpcAttachment(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AcceptTransitGatewayVpcAttachmentResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def acceptTransitGatewayVpcAttachment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.AcceptTransitGatewayVpcAttachmentResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AcceptTransitGatewayVpcAttachmentResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Accepts a request to attach a VPC to a transit gateway. The VPC attachment must be in the pendingAcceptance state. Use DescribeTransitGatewayVpcAttachments to view your pending VPC attachment requests. Use RejectTransitGatewayVpcAttachment to reject a VPC attachment request.
    */
  def acceptTransitGatewayVpcAttachment(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AcceptTransitGatewayVpcAttachmentRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AcceptTransitGatewayVpcAttachmentResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def acceptTransitGatewayVpcAttachment(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AcceptTransitGatewayVpcAttachmentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.AcceptTransitGatewayVpcAttachmentResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AcceptTransitGatewayVpcAttachmentResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Accepts one or more interface VPC endpoint connection requests to your VPC endpoint service.
    */
  def acceptVpcEndpointConnections(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AcceptVpcEndpointConnectionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def acceptVpcEndpointConnections(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.AcceptVpcEndpointConnectionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AcceptVpcEndpointConnectionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Accepts one or more interface VPC endpoint connection requests to your VPC endpoint service.
    */
  def acceptVpcEndpointConnections(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AcceptVpcEndpointConnectionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AcceptVpcEndpointConnectionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def acceptVpcEndpointConnections(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AcceptVpcEndpointConnectionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.AcceptVpcEndpointConnectionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AcceptVpcEndpointConnectionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Accept a VPC peering connection request. To accept a request, the VPC peering connection must be in the pending-acceptance state, and you must be the owner of the peer VPC. Use DescribeVpcPeeringConnections to view your outstanding VPC peering connection requests. For an inter-region VPC peering connection request, you must accept the VPC peering connection in the region of the accepter VPC.
    */
  def acceptVpcPeeringConnection(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AcceptVpcPeeringConnectionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def acceptVpcPeeringConnection(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.AcceptVpcPeeringConnectionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AcceptVpcPeeringConnectionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Accept a VPC peering connection request. To accept a request, the VPC peering connection must be in the pending-acceptance state, and you must be the owner of the peer VPC. Use DescribeVpcPeeringConnections to view your outstanding VPC peering connection requests. For an inter-region VPC peering connection request, you must accept the VPC peering connection in the region of the accepter VPC.
    */
  def acceptVpcPeeringConnection(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AcceptVpcPeeringConnectionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AcceptVpcPeeringConnectionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def acceptVpcPeeringConnection(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AcceptVpcPeeringConnectionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.AcceptVpcPeeringConnectionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AcceptVpcPeeringConnectionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Advertises an IPv4 address range that is provisioned for use with your AWS resources through bring your own IP addresses (BYOIP). You can perform this operation at most once every 10 seconds, even if you specify different address ranges each time. We recommend that you stop advertising the BYOIP CIDR from other locations when you advertise it from AWS. To minimize down time, you can configure your AWS resources to use an address from a BYOIP CIDR before it is advertised, and then simultaneously stop advertising it from the current location and start advertising it through AWS. It can take a few minutes before traffic to the specified addresses starts routing to AWS because of BGP propagation delays. To stop advertising the BYOIP CIDR, use WithdrawByoipCidr.
    */
  def advertiseByoipCidr(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AdvertiseByoipCidrResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def advertiseByoipCidr(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.AdvertiseByoipCidrResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AdvertiseByoipCidrResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Advertises an IPv4 address range that is provisioned for use with your AWS resources through bring your own IP addresses (BYOIP). You can perform this operation at most once every 10 seconds, even if you specify different address ranges each time. We recommend that you stop advertising the BYOIP CIDR from other locations when you advertise it from AWS. To minimize down time, you can configure your AWS resources to use an address from a BYOIP CIDR before it is advertised, and then simultaneously stop advertising it from the current location and start advertising it through AWS. It can take a few minutes before traffic to the specified addresses starts routing to AWS because of BGP propagation delays. To stop advertising the BYOIP CIDR, use WithdrawByoipCidr.
    */
  def advertiseByoipCidr(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AdvertiseByoipCidrRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AdvertiseByoipCidrResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def advertiseByoipCidr(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AdvertiseByoipCidrRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.AdvertiseByoipCidrResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AdvertiseByoipCidrResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Allocates an Elastic IP address to your AWS account. After you allocate the Elastic IP address you can associate it with an instance or network interface. After you release an Elastic IP address, it is released to the IP address pool and can be allocated to a different AWS account. You can allocate an Elastic IP address from an address pool owned by AWS or from an address pool created from a public IPv4 address range that you have brought to AWS for use with your AWS resources using bring your own IP addresses (BYOIP). For more information, see Bring Your Own IP Addresses (BYOIP) in the Amazon Elastic Compute Cloud User Guide. [EC2-VPC] If you release an Elastic IP address, you might be able to recover it. You cannot recover an Elastic IP address that you released after it is allocated to another AWS account. You cannot recover an Elastic IP address for EC2-Classic. To attempt to recover an Elastic IP address that you released, specify it in this operation. An Elastic IP address is for use either in the EC2-Classic platform or in a VPC. By default, you can allocate 5 Elastic IP addresses for EC2-Classic per region and 5 Elastic IP addresses for EC2-VPC per region. For more information, see Elastic IP Addresses in the Amazon Elastic Compute Cloud User Guide.
    */
  def allocateAddress(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AllocateAddressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def allocateAddress(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.AllocateAddressResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AllocateAddressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Allocates an Elastic IP address to your AWS account. After you allocate the Elastic IP address you can associate it with an instance or network interface. After you release an Elastic IP address, it is released to the IP address pool and can be allocated to a different AWS account. You can allocate an Elastic IP address from an address pool owned by AWS or from an address pool created from a public IPv4 address range that you have brought to AWS for use with your AWS resources using bring your own IP addresses (BYOIP). For more information, see Bring Your Own IP Addresses (BYOIP) in the Amazon Elastic Compute Cloud User Guide. [EC2-VPC] If you release an Elastic IP address, you might be able to recover it. You cannot recover an Elastic IP address that you released after it is allocated to another AWS account. You cannot recover an Elastic IP address for EC2-Classic. To attempt to recover an Elastic IP address that you released, specify it in this operation. An Elastic IP address is for use either in the EC2-Classic platform or in a VPC. By default, you can allocate 5 Elastic IP addresses for EC2-Classic per region and 5 Elastic IP addresses for EC2-VPC per region. For more information, see Elastic IP Addresses in the Amazon Elastic Compute Cloud User Guide.
    */
  def allocateAddress(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AllocateAddressRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AllocateAddressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def allocateAddress(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AllocateAddressRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.AllocateAddressResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AllocateAddressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Allocates a Dedicated Host to your account. At a minimum, specify the instance size type, Availability Zone, and quantity of hosts to allocate.
    */
  def allocateHosts(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AllocateHostsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def allocateHosts(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.AllocateHostsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AllocateHostsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Allocates a Dedicated Host to your account. At a minimum, specify the instance size type, Availability Zone, and quantity of hosts to allocate.
    */
  def allocateHosts(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AllocateHostsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AllocateHostsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def allocateHosts(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AllocateHostsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.AllocateHostsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AllocateHostsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Applies a security group to the association between the target network and the Client VPN endpoint. This action replaces the existing security groups with the specified security groups.
    */
  def applySecurityGroupsToClientVpnTargetNetwork(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ApplySecurityGroupsToClientVpnTargetNetworkResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def applySecurityGroupsToClientVpnTargetNetwork(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ApplySecurityGroupsToClientVpnTargetNetworkResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ApplySecurityGroupsToClientVpnTargetNetworkResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Applies a security group to the association between the target network and the Client VPN endpoint. This action replaces the existing security groups with the specified security groups.
    */
  def applySecurityGroupsToClientVpnTargetNetwork(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ApplySecurityGroupsToClientVpnTargetNetworkRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ApplySecurityGroupsToClientVpnTargetNetworkResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def applySecurityGroupsToClientVpnTargetNetwork(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ApplySecurityGroupsToClientVpnTargetNetworkRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ApplySecurityGroupsToClientVpnTargetNetworkResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ApplySecurityGroupsToClientVpnTargetNetworkResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Assigns one or more IPv6 addresses to the specified network interface. You can specify one or more specific IPv6 addresses, or you can specify the number of IPv6 addresses to be automatically assigned from within the subnet's IPv6 CIDR block range. You can assign as many IPv6 addresses to a network interface as you can assign private IPv4 addresses, and the limit varies per instance type. For information, see IP Addresses Per Network Interface Per Instance Type in the Amazon Elastic Compute Cloud User Guide.
    */
  def assignIpv6Addresses(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AssignIpv6AddressesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def assignIpv6Addresses(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.AssignIpv6AddressesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AssignIpv6AddressesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Assigns one or more IPv6 addresses to the specified network interface. You can specify one or more specific IPv6 addresses, or you can specify the number of IPv6 addresses to be automatically assigned from within the subnet's IPv6 CIDR block range. You can assign as many IPv6 addresses to a network interface as you can assign private IPv4 addresses, and the limit varies per instance type. For information, see IP Addresses Per Network Interface Per Instance Type in the Amazon Elastic Compute Cloud User Guide.
    */
  def assignIpv6Addresses(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AssignIpv6AddressesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AssignIpv6AddressesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def assignIpv6Addresses(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AssignIpv6AddressesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.AssignIpv6AddressesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AssignIpv6AddressesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Assigns one or more secondary private IP addresses to the specified network interface. You can specify one or more specific secondary IP addresses, or you can specify the number of secondary IP addresses to be automatically assigned within the subnet's CIDR block range. The number of secondary IP addresses that you can assign to an instance varies by instance type. For information about instance types, see Instance Types in the Amazon Elastic Compute Cloud User Guide. For more information about Elastic IP addresses, see Elastic IP Addresses in the Amazon Elastic Compute Cloud User Guide. When you move a secondary private IP address to another network interface, any Elastic IP address that is associated with the IP address is also moved. Remapping an IP address is an asynchronous operation. When you move an IP address from one network interface to another, check network/interfaces/macs/mac/local-ipv4s in the instance metadata to confirm that the remapping is complete.
    */
  def assignPrivateIpAddresses(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def assignPrivateIpAddresses(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Assigns one or more secondary private IP addresses to the specified network interface. You can specify one or more specific secondary IP addresses, or you can specify the number of secondary IP addresses to be automatically assigned within the subnet's CIDR block range. The number of secondary IP addresses that you can assign to an instance varies by instance type. For information about instance types, see Instance Types in the Amazon Elastic Compute Cloud User Guide. For more information about Elastic IP addresses, see Elastic IP Addresses in the Amazon Elastic Compute Cloud User Guide. When you move a secondary private IP address to another network interface, any Elastic IP address that is associated with the IP address is also moved. Remapping an IP address is an asynchronous operation. When you move an IP address from one network interface to another, check network/interfaces/macs/mac/local-ipv4s in the instance metadata to confirm that the remapping is complete.
    */
  def assignPrivateIpAddresses(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AssignPrivateIpAddressesRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def assignPrivateIpAddresses(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AssignPrivateIpAddressesRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates an Elastic IP address with an instance or a network interface. Before you can use an Elastic IP address, you must allocate it to your account. An Elastic IP address is for use in either the EC2-Classic platform or in a VPC. For more information, see Elastic IP Addresses in the Amazon Elastic Compute Cloud User Guide. [EC2-Classic, VPC in an EC2-VPC-only account] If the Elastic IP address is already associated with a different instance, it is disassociated from that instance and associated with the specified instance. If you associate an Elastic IP address with an instance that has an existing Elastic IP address, the existing address is disassociated from the instance, but remains allocated to your account. [VPC in an EC2-Classic account] If you don't specify a private IP address, the Elastic IP address is associated with the primary IP address. If the Elastic IP address is already associated with a different instance or a network interface, you get an error unless you allow reassociation. You cannot associate an Elastic IP address with an instance or network interface that has an existing Elastic IP address.  This is an idempotent operation. If you perform the operation more than once, Amazon EC2 doesn't return an error, and you may be charged for each time the Elastic IP address is remapped to the same instance. For more information, see the Elastic IP Addresses section of Amazon EC2 Pricing. 
    */
  def associateAddress(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateAddressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associateAddress(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateAddressResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateAddressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Associates an Elastic IP address with an instance or a network interface. Before you can use an Elastic IP address, you must allocate it to your account. An Elastic IP address is for use in either the EC2-Classic platform or in a VPC. For more information, see Elastic IP Addresses in the Amazon Elastic Compute Cloud User Guide. [EC2-Classic, VPC in an EC2-VPC-only account] If the Elastic IP address is already associated with a different instance, it is disassociated from that instance and associated with the specified instance. If you associate an Elastic IP address with an instance that has an existing Elastic IP address, the existing address is disassociated from the instance, but remains allocated to your account. [VPC in an EC2-Classic account] If you don't specify a private IP address, the Elastic IP address is associated with the primary IP address. If the Elastic IP address is already associated with a different instance or a network interface, you get an error unless you allow reassociation. You cannot associate an Elastic IP address with an instance or network interface that has an existing Elastic IP address.  This is an idempotent operation. If you perform the operation more than once, Amazon EC2 doesn't return an error, and you may be charged for each time the Elastic IP address is remapped to the same instance. For more information, see the Elastic IP Addresses section of Amazon EC2 Pricing. 
    */
  def associateAddress(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateAddressRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateAddressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associateAddress(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateAddressRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateAddressResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateAddressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Associates a target network with a Client VPN endpoint. A target network is a subnet in a VPC. You can associate multiple subnets from the same VPC with a Client VPN endpoint. You can associate only one subnet in each Availability Zone. We recommend that you associate at least two subnets to provide Availability Zone redundancy.
    */
  def associateClientVpnTargetNetwork(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateClientVpnTargetNetworkResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associateClientVpnTargetNetwork(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateClientVpnTargetNetworkResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateClientVpnTargetNetworkResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Associates a target network with a Client VPN endpoint. A target network is a subnet in a VPC. You can associate multiple subnets from the same VPC with a Client VPN endpoint. You can associate only one subnet in each Availability Zone. We recommend that you associate at least two subnets to provide Availability Zone redundancy.
    */
  def associateClientVpnTargetNetwork(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateClientVpnTargetNetworkRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateClientVpnTargetNetworkResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associateClientVpnTargetNetwork(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateClientVpnTargetNetworkRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateClientVpnTargetNetworkResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateClientVpnTargetNetworkResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Associates a set of DHCP options (that you've previously created) with the specified VPC, or associates no DHCP options with the VPC. After you associate the options with the VPC, any existing instances and all new instances that you launch in that VPC use the options. You don't need to restart or relaunch the instances. They automatically pick up the changes within a few hours, depending on how frequently the instance renews its DHCP lease. You can explicitly renew the lease using the operating system on the instance. For more information, see DHCP Options Sets in the Amazon Virtual Private Cloud User Guide.
    */
  def associateDhcpOptions(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateDhcpOptions(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates a set of DHCP options (that you've previously created) with the specified VPC, or associates no DHCP options with the VPC. After you associate the options with the VPC, any existing instances and all new instances that you launch in that VPC use the options. You don't need to restart or relaunch the instances. They automatically pick up the changes within a few hours, depending on how frequently the instance renews its DHCP lease. You can explicitly renew the lease using the operating system on the instance. For more information, see DHCP Options Sets in the Amazon Virtual Private Cloud User Guide.
    */
  def associateDhcpOptions(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateDhcpOptionsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateDhcpOptions(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateDhcpOptionsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates an IAM instance profile with a running or stopped instance. You cannot associate more than one IAM instance profile with an instance.
    */
  def associateIamInstanceProfile(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateIamInstanceProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associateIamInstanceProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateIamInstanceProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateIamInstanceProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Associates an IAM instance profile with a running or stopped instance. You cannot associate more than one IAM instance profile with an instance.
    */
  def associateIamInstanceProfile(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateIamInstanceProfileRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateIamInstanceProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associateIamInstanceProfile(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateIamInstanceProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateIamInstanceProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateIamInstanceProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Associates a subnet with a route table. The subnet and route table must be in the same VPC. This association causes traffic originating from the subnet to be routed according to the routes in the route table. The action returns an association ID, which you need in order to disassociate the route table from the subnet later. A route table can be associated with multiple subnets. For more information, see Route Tables in the Amazon Virtual Private Cloud User Guide.
    */
  def associateRouteTable(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateRouteTableResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associateRouteTable(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateRouteTableResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateRouteTableResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Associates a subnet with a route table. The subnet and route table must be in the same VPC. This association causes traffic originating from the subnet to be routed according to the routes in the route table. The action returns an association ID, which you need in order to disassociate the route table from the subnet later. A route table can be associated with multiple subnets. For more information, see Route Tables in the Amazon Virtual Private Cloud User Guide.
    */
  def associateRouteTable(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateRouteTableRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateRouteTableResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associateRouteTable(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateRouteTableRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateRouteTableResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateRouteTableResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Associates a CIDR block with your subnet. You can only associate a single IPv6 CIDR block with your subnet. An IPv6 CIDR block must have a prefix length of /64.
    */
  def associateSubnetCidrBlock(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateSubnetCidrBlockResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associateSubnetCidrBlock(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateSubnetCidrBlockResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateSubnetCidrBlockResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Associates a CIDR block with your subnet. You can only associate a single IPv6 CIDR block with your subnet. An IPv6 CIDR block must have a prefix length of /64.
    */
  def associateSubnetCidrBlock(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateSubnetCidrBlockRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateSubnetCidrBlockResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associateSubnetCidrBlock(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateSubnetCidrBlockRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateSubnetCidrBlockResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateSubnetCidrBlockResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Associates the specified attachment with the specified transit gateway route table. You can associate only one route table with an attachment.
    */
  def associateTransitGatewayRouteTable(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateTransitGatewayRouteTableResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associateTransitGatewayRouteTable(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateTransitGatewayRouteTableResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateTransitGatewayRouteTableResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Associates the specified attachment with the specified transit gateway route table. You can associate only one route table with an attachment.
    */
  def associateTransitGatewayRouteTable(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateTransitGatewayRouteTableRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateTransitGatewayRouteTableResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associateTransitGatewayRouteTable(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateTransitGatewayRouteTableRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateTransitGatewayRouteTableResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateTransitGatewayRouteTableResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Associates a CIDR block with your VPC. You can associate a secondary IPv4 CIDR block, or you can associate an Amazon-provided IPv6 CIDR block. The IPv6 CIDR block size is fixed at /56. For more information about associating CIDR blocks with your VPC and applicable restrictions, see VPC and Subnet Sizing in the Amazon Virtual Private Cloud User Guide.
    */
  def associateVpcCidrBlock(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateVpcCidrBlockResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associateVpcCidrBlock(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateVpcCidrBlockResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateVpcCidrBlockResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Associates a CIDR block with your VPC. You can associate a secondary IPv4 CIDR block, or you can associate an Amazon-provided IPv6 CIDR block. The IPv6 CIDR block size is fixed at /56. For more information about associating CIDR blocks with your VPC and applicable restrictions, see VPC and Subnet Sizing in the Amazon Virtual Private Cloud User Guide.
    */
  def associateVpcCidrBlock(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateVpcCidrBlockRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateVpcCidrBlockResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associateVpcCidrBlock(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateVpcCidrBlockRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateVpcCidrBlockResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AssociateVpcCidrBlockResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Links an EC2-Classic instance to a ClassicLink-enabled VPC through one or more of the VPC's security groups. You cannot link an EC2-Classic instance to more than one VPC at a time. You can only link an instance that's in the running state. An instance is automatically unlinked from a VPC when it's stopped - you can link it to the VPC again when you restart it. After you've linked an instance, you cannot change the VPC security groups that are associated with it. To change the security groups, you must first unlink the instance, and then link it again. Linking your instance to a VPC is sometimes referred to as attaching your instance.
    */
  def attachClassicLinkVpc(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AttachClassicLinkVpcResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def attachClassicLinkVpc(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.AttachClassicLinkVpcResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AttachClassicLinkVpcResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Links an EC2-Classic instance to a ClassicLink-enabled VPC through one or more of the VPC's security groups. You cannot link an EC2-Classic instance to more than one VPC at a time. You can only link an instance that's in the running state. An instance is automatically unlinked from a VPC when it's stopped - you can link it to the VPC again when you restart it. After you've linked an instance, you cannot change the VPC security groups that are associated with it. To change the security groups, you must first unlink the instance, and then link it again. Linking your instance to a VPC is sometimes referred to as attaching your instance.
    */
  def attachClassicLinkVpc(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AttachClassicLinkVpcRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AttachClassicLinkVpcResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def attachClassicLinkVpc(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AttachClassicLinkVpcRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.AttachClassicLinkVpcResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AttachClassicLinkVpcResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Attaches an internet gateway to a VPC, enabling connectivity between the internet and the VPC. For more information about your VPC and internet gateway, see the Amazon Virtual Private Cloud User Guide.
    */
  def attachInternetGateway(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def attachInternetGateway(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Attaches an internet gateway to a VPC, enabling connectivity between the internet and the VPC. For more information about your VPC and internet gateway, see the Amazon Virtual Private Cloud User Guide.
    */
  def attachInternetGateway(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AttachInternetGatewayRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def attachInternetGateway(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AttachInternetGatewayRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Attaches a network interface to an instance.
    */
  def attachNetworkInterface(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AttachNetworkInterfaceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def attachNetworkInterface(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.AttachNetworkInterfaceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AttachNetworkInterfaceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Attaches a network interface to an instance.
    */
  def attachNetworkInterface(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AttachNetworkInterfaceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AttachNetworkInterfaceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def attachNetworkInterface(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AttachNetworkInterfaceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.AttachNetworkInterfaceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AttachNetworkInterfaceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Attaches an EBS volume to a running or stopped instance and exposes it to the instance with the specified device name. Encrypted EBS volumes may only be attached to instances that support Amazon EBS encryption. For more information, see Amazon EBS Encryption in the Amazon Elastic Compute Cloud User Guide. For a list of supported device names, see Attaching an EBS Volume to an Instance. Any device names that aren't reserved for instance store volumes can be used for EBS volumes. For more information, see Amazon EC2 Instance Store in the Amazon Elastic Compute Cloud User Guide. If a volume has an AWS Marketplace product code:   The volume can be attached only to a stopped instance.   AWS Marketplace product codes are copied from the volume to the instance.   You must be subscribed to the product.   The instance type and operating system of the instance must support the product. For example, you can't detach a volume from a Windows instance and attach it to a Linux instance.   For more information about EBS volumes, see Attaching Amazon EBS Volumes in the Amazon Elastic Compute Cloud User Guide.
    */
  def attachVolume(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.VolumeAttachment, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def attachVolume(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.VolumeAttachment, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.VolumeAttachment, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Attaches an EBS volume to a running or stopped instance and exposes it to the instance with the specified device name. Encrypted EBS volumes may only be attached to instances that support Amazon EBS encryption. For more information, see Amazon EBS Encryption in the Amazon Elastic Compute Cloud User Guide. For a list of supported device names, see Attaching an EBS Volume to an Instance. Any device names that aren't reserved for instance store volumes can be used for EBS volumes. For more information, see Amazon EC2 Instance Store in the Amazon Elastic Compute Cloud User Guide. If a volume has an AWS Marketplace product code:   The volume can be attached only to a stopped instance.   AWS Marketplace product codes are copied from the volume to the instance.   You must be subscribed to the product.   The instance type and operating system of the instance must support the product. For example, you can't detach a volume from a Windows instance and attach it to a Linux instance.   For more information about EBS volumes, see Attaching Amazon EBS Volumes in the Amazon Elastic Compute Cloud User Guide.
    */
  def attachVolume(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AttachVolumeRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.VolumeAttachment, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def attachVolume(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AttachVolumeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.VolumeAttachment, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.VolumeAttachment, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Attaches a virtual private gateway to a VPC. You can attach one virtual private gateway to one VPC at a time. For more information, see AWS Site-to-Site VPN in the AWS Site-to-Site VPN User Guide.
    */
  def attachVpnGateway(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AttachVpnGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def attachVpnGateway(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.AttachVpnGatewayResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AttachVpnGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Attaches a virtual private gateway to a VPC. You can attach one virtual private gateway to one VPC at a time. For more information, see AWS Site-to-Site VPN in the AWS Site-to-Site VPN User Guide.
    */
  def attachVpnGateway(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AttachVpnGatewayRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AttachVpnGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def attachVpnGateway(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AttachVpnGatewayRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.AttachVpnGatewayResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AttachVpnGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds an ingress authorization rule to a Client VPN endpoint. Ingress authorization rules act as firewall rules that grant access to networks. You must configure ingress authorization rules to enable clients to access resources in AWS or on-premises networks.
    */
  def authorizeClientVpnIngress(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AuthorizeClientVpnIngressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def authorizeClientVpnIngress(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.AuthorizeClientVpnIngressResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AuthorizeClientVpnIngressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds an ingress authorization rule to a Client VPN endpoint. Ingress authorization rules act as firewall rules that grant access to networks. You must configure ingress authorization rules to enable clients to access resources in AWS or on-premises networks.
    */
  def authorizeClientVpnIngress(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AuthorizeClientVpnIngressRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AuthorizeClientVpnIngressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def authorizeClientVpnIngress(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AuthorizeClientVpnIngressRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.AuthorizeClientVpnIngressResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.AuthorizeClientVpnIngressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * [EC2-VPC only] Adds one or more egress rules to a security group for use with a VPC. Specifically, this action permits instances to send traffic to one or more destination IPv4 or IPv6 CIDR address ranges, or to one or more destination security groups for the same VPC. This action doesn't apply to security groups for use in EC2-Classic. For more information, see Security Groups for Your VPC in the Amazon Virtual Private Cloud User Guide. For more information about security group limits, see Amazon VPC Limits. Each rule consists of the protocol (for example, TCP), plus either a CIDR range or a source group. For the TCP and UDP protocols, you must also specify the destination port or port range. For the ICMP protocol, you must also specify the ICMP type and code. You can use -1 for the type or code to mean all types or all codes. You can optionally specify a description for the rule. Rule changes are propagated to affected instances as quickly as possible. However, a small delay might occur.
    */
  def authorizeSecurityGroupEgress(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def authorizeSecurityGroupEgress(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * [EC2-VPC only] Adds one or more egress rules to a security group for use with a VPC. Specifically, this action permits instances to send traffic to one or more destination IPv4 or IPv6 CIDR address ranges, or to one or more destination security groups for the same VPC. This action doesn't apply to security groups for use in EC2-Classic. For more information, see Security Groups for Your VPC in the Amazon Virtual Private Cloud User Guide. For more information about security group limits, see Amazon VPC Limits. Each rule consists of the protocol (for example, TCP), plus either a CIDR range or a source group. For the TCP and UDP protocols, you must also specify the destination port or port range. For the ICMP protocol, you must also specify the ICMP type and code. You can use -1 for the type or code to mean all types or all codes. You can optionally specify a description for the rule. Rule changes are propagated to affected instances as quickly as possible. However, a small delay might occur.
    */
  def authorizeSecurityGroupEgress(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AuthorizeSecurityGroupEgressRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def authorizeSecurityGroupEgress(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AuthorizeSecurityGroupEgressRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds one or more ingress rules to a security group. Rule changes are propagated to instances within the security group as quickly as possible. However, a small delay might occur. [EC2-Classic] This action gives one or more IPv4 CIDR address ranges permission to access a security group in your account, or gives one or more security groups (called the source groups) permission to access a security group for your account. A source group can be for your own AWS account, or another. You can have up to 100 rules per group. [EC2-VPC] This action gives one or more IPv4 or IPv6 CIDR address ranges permission to access a security group in your VPC, or gives one or more other security groups (called the source groups) permission to access a security group for your VPC. The security groups must all be for the same VPC or a peer VPC in a VPC peering connection. For more information about VPC security group limits, see Amazon VPC Limits. You can optionally specify a description for the security group rule.
    */
  def authorizeSecurityGroupIngress(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def authorizeSecurityGroupIngress(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds one or more ingress rules to a security group. Rule changes are propagated to instances within the security group as quickly as possible. However, a small delay might occur. [EC2-Classic] This action gives one or more IPv4 CIDR address ranges permission to access a security group in your account, or gives one or more security groups (called the source groups) permission to access a security group for your account. A source group can be for your own AWS account, or another. You can have up to 100 rules per group. [EC2-VPC] This action gives one or more IPv4 or IPv6 CIDR address ranges permission to access a security group in your VPC, or gives one or more other security groups (called the source groups) permission to access a security group for your VPC. The security groups must all be for the same VPC or a peer VPC in a VPC peering connection. For more information about VPC security group limits, see Amazon VPC Limits. You can optionally specify a description for the security group rule.
    */
  def authorizeSecurityGroupIngress(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AuthorizeSecurityGroupIngressRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def authorizeSecurityGroupIngress(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.AuthorizeSecurityGroupIngressRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Bundles an Amazon instance store-backed Windows instance. During bundling, only the root device volume (C:\) is bundled. Data on other instance store volumes is not preserved.  This action is not applicable for Linux/Unix instances or Windows instances that are backed by Amazon EBS. 
    */
  def bundleInstance(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.BundleInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def bundleInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.BundleInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.BundleInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Bundles an Amazon instance store-backed Windows instance. During bundling, only the root device volume (C:\) is bundled. Data on other instance store volumes is not preserved.  This action is not applicable for Linux/Unix instances or Windows instances that are backed by Amazon EBS. 
    */
  def bundleInstance(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.BundleInstanceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.BundleInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def bundleInstance(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.BundleInstanceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.BundleInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.BundleInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Cancels a bundling operation for an instance store-backed Windows instance.
    */
  def cancelBundleTask(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelBundleTaskResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def cancelBundleTask(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelBundleTaskResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelBundleTaskResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Cancels a bundling operation for an instance store-backed Windows instance.
    */
  def cancelBundleTask(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelBundleTaskRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelBundleTaskResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def cancelBundleTask(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelBundleTaskRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelBundleTaskResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelBundleTaskResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Cancels the specified Capacity Reservation, releases the reserved capacity, and changes the Capacity Reservation's state to cancelled. Instances running in the reserved capacity continue running until you stop them. Stopped instances that target the Capacity Reservation can no longer launch. Modify these instances to either target a different Capacity Reservation, launch On-Demand Instance capacity, or run in any open Capacity Reservation that has matching attributes and sufficient capacity.
    */
  def cancelCapacityReservation(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelCapacityReservationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def cancelCapacityReservation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelCapacityReservationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelCapacityReservationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Cancels the specified Capacity Reservation, releases the reserved capacity, and changes the Capacity Reservation's state to cancelled. Instances running in the reserved capacity continue running until you stop them. Stopped instances that target the Capacity Reservation can no longer launch. Modify these instances to either target a different Capacity Reservation, launch On-Demand Instance capacity, or run in any open Capacity Reservation that has matching attributes and sufficient capacity.
    */
  def cancelCapacityReservation(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelCapacityReservationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelCapacityReservationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def cancelCapacityReservation(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelCapacityReservationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelCapacityReservationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelCapacityReservationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Cancels an active conversion task. The task can be the import of an instance or volume. The action removes all artifacts of the conversion, including a partially uploaded volume or instance. If the conversion is complete or is in the process of transferring the final disk image, the command fails and returns an exception. For more information, see Importing a Virtual Machine Using the Amazon EC2 CLI.
    */
  def cancelConversionTask(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def cancelConversionTask(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Cancels an active conversion task. The task can be the import of an instance or volume. The action removes all artifacts of the conversion, including a partially uploaded volume or instance. If the conversion is complete or is in the process of transferring the final disk image, the command fails and returns an exception. For more information, see Importing a Virtual Machine Using the Amazon EC2 CLI.
    */
  def cancelConversionTask(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelConversionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def cancelConversionTask(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelConversionRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Cancels an active export task. The request removes all artifacts of the export, including any partially-created Amazon S3 objects. If the export task is complete or is in the process of transferring the final disk image, the command fails and returns an error.
    */
  def cancelExportTask(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def cancelExportTask(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Cancels an active export task. The request removes all artifacts of the export, including any partially-created Amazon S3 objects. If the export task is complete or is in the process of transferring the final disk image, the command fails and returns an error.
    */
  def cancelExportTask(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelExportTaskRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def cancelExportTask(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelExportTaskRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Cancels an in-process import virtual machine or import snapshot task.
    */
  def cancelImportTask(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelImportTaskResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def cancelImportTask(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelImportTaskResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelImportTaskResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Cancels an in-process import virtual machine or import snapshot task.
    */
  def cancelImportTask(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelImportTaskRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelImportTaskResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def cancelImportTask(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelImportTaskRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelImportTaskResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelImportTaskResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Cancels the specified Reserved Instance listing in the Reserved Instance Marketplace. For more information, see Reserved Instance Marketplace in the Amazon Elastic Compute Cloud User Guide.
    */
  def cancelReservedInstancesListing(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelReservedInstancesListingResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def cancelReservedInstancesListing(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelReservedInstancesListingResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelReservedInstancesListingResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Cancels the specified Reserved Instance listing in the Reserved Instance Marketplace. For more information, see Reserved Instance Marketplace in the Amazon Elastic Compute Cloud User Guide.
    */
  def cancelReservedInstancesListing(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelReservedInstancesListingRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelReservedInstancesListingResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def cancelReservedInstancesListing(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelReservedInstancesListingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelReservedInstancesListingResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelReservedInstancesListingResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Cancels the specified Spot Fleet requests. After you cancel a Spot Fleet request, the Spot Fleet launches no new Spot Instances. You must specify whether the Spot Fleet should also terminate its Spot Instances. If you terminate the instances, the Spot Fleet request enters the cancelled_terminating state. Otherwise, the Spot Fleet request enters the cancelled_running state and the instances continue to run until they are interrupted or you terminate them manually.
    */
  def cancelSpotFleetRequests(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelSpotFleetRequestsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def cancelSpotFleetRequests(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelSpotFleetRequestsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelSpotFleetRequestsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Cancels the specified Spot Fleet requests. After you cancel a Spot Fleet request, the Spot Fleet launches no new Spot Instances. You must specify whether the Spot Fleet should also terminate its Spot Instances. If you terminate the instances, the Spot Fleet request enters the cancelled_terminating state. Otherwise, the Spot Fleet request enters the cancelled_running state and the instances continue to run until they are interrupted or you terminate them manually.
    */
  def cancelSpotFleetRequests(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelSpotFleetRequestsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelSpotFleetRequestsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def cancelSpotFleetRequests(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelSpotFleetRequestsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelSpotFleetRequestsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelSpotFleetRequestsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Cancels one or more Spot Instance requests.  Canceling a Spot Instance request does not terminate running Spot Instances associated with the request. 
    */
  def cancelSpotInstanceRequests(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelSpotInstanceRequestsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def cancelSpotInstanceRequests(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelSpotInstanceRequestsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelSpotInstanceRequestsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Cancels one or more Spot Instance requests.  Canceling a Spot Instance request does not terminate running Spot Instances associated with the request. 
    */
  def cancelSpotInstanceRequests(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelSpotInstanceRequestsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelSpotInstanceRequestsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def cancelSpotInstanceRequests(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelSpotInstanceRequestsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelSpotInstanceRequestsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CancelSpotInstanceRequestsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Determines whether a product code is associated with an instance. This action can only be used by the owner of the product code. It is useful when a product code owner must verify whether another user's instance is eligible for support.
    */
  def confirmProductInstance(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ConfirmProductInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def confirmProductInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ConfirmProductInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ConfirmProductInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Determines whether a product code is associated with an instance. This action can only be used by the owner of the product code. It is useful when a product code owner must verify whether another user's instance is eligible for support.
    */
  def confirmProductInstance(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ConfirmProductInstanceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ConfirmProductInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def confirmProductInstance(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ConfirmProductInstanceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ConfirmProductInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ConfirmProductInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Copies the specified Amazon FPGA Image (AFI) to the current region.
    */
  def copyFpgaImage(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CopyFpgaImageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def copyFpgaImage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CopyFpgaImageResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CopyFpgaImageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Copies the specified Amazon FPGA Image (AFI) to the current region.
    */
  def copyFpgaImage(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CopyFpgaImageRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CopyFpgaImageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def copyFpgaImage(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CopyFpgaImageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CopyFpgaImageResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CopyFpgaImageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Initiates the copy of an AMI from the specified source region to the current region. You specify the destination region by using its endpoint when making the request. Copies of encrypted backing snapshots for the AMI are encrypted. Copies of unencrypted backing snapshots remain unencrypted, unless you set Encrypted during the copy operation. You cannot create an unencrypted copy of an encrypted backing snapshot. For more information about the prerequisites and limits when copying an AMI, see Copying an AMI in the Amazon Elastic Compute Cloud User Guide.
    */
  def copyImage(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CopyImageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def copyImage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CopyImageResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CopyImageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Initiates the copy of an AMI from the specified source region to the current region. You specify the destination region by using its endpoint when making the request. Copies of encrypted backing snapshots for the AMI are encrypted. Copies of unencrypted backing snapshots remain unencrypted, unless you set Encrypted during the copy operation. You cannot create an unencrypted copy of an encrypted backing snapshot. For more information about the prerequisites and limits when copying an AMI, see Copying an AMI in the Amazon Elastic Compute Cloud User Guide.
    */
  def copyImage(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CopyImageRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CopyImageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def copyImage(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CopyImageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CopyImageResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CopyImageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Copies a point-in-time snapshot of an EBS volume and stores it in Amazon S3. You can copy the snapshot within the same Region or from one Region to another. You can use the snapshot to create EBS volumes or Amazon Machine Images (AMIs). The snapshot is copied to the regional endpoint that you send the HTTP request to. Copies of encrypted EBS snapshots remain encrypted. Copies of unencrypted snapshots remain unencrypted, unless the Encrypted flag is specified during the snapshot copy operation. By default, encrypted snapshot copies use the default AWS Key Management Service (AWS KMS) customer master key (CMK); however, you can specify a non-default CMK with the KmsKeyId parameter. To copy an encrypted snapshot that has been shared from another account, you must have permissions for the CMK used to encrypt the snapshot. Snapshots created by copying another snapshot have an arbitrary volume ID that should not be used for any purpose. For more information, see Copying an Amazon EBS Snapshot in the Amazon Elastic Compute Cloud User Guide.
    */
  def copySnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CopySnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def copySnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CopySnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CopySnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Copies a point-in-time snapshot of an EBS volume and stores it in Amazon S3. You can copy the snapshot within the same Region or from one Region to another. You can use the snapshot to create EBS volumes or Amazon Machine Images (AMIs). The snapshot is copied to the regional endpoint that you send the HTTP request to. Copies of encrypted EBS snapshots remain encrypted. Copies of unencrypted snapshots remain unencrypted, unless the Encrypted flag is specified during the snapshot copy operation. By default, encrypted snapshot copies use the default AWS Key Management Service (AWS KMS) customer master key (CMK); however, you can specify a non-default CMK with the KmsKeyId parameter. To copy an encrypted snapshot that has been shared from another account, you must have permissions for the CMK used to encrypt the snapshot. Snapshots created by copying another snapshot have an arbitrary volume ID that should not be used for any purpose. For more information, see Copying an Amazon EBS Snapshot in the Amazon Elastic Compute Cloud User Guide.
    */
  def copySnapshot(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CopySnapshotRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CopySnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def copySnapshot(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CopySnapshotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CopySnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CopySnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new Capacity Reservation with the specified attributes. Capacity Reservations enable you to reserve capacity for your Amazon EC2 instances in a specific Availability Zone for any duration. This gives you the flexibility to selectively add capacity reservations and still get the Regional RI discounts for that usage. By creating Capacity Reservations, you ensure that you always have access to Amazon EC2 capacity when you need it, for as long as you need it. For more information, see Capacity Reservations in the Amazon Elastic Compute Cloud User Guide. Your request to create a Capacity Reservation could fail if Amazon EC2 does not have sufficient capacity to fulfill the request. If your request fails due to Amazon EC2 capacity constraints, either try again at a later time, try in a different Availability Zone, or request a smaller capacity reservation. If your application is flexible across instance types and sizes, try to create a Capacity Reservation with different instance attributes. Your request could also fail if the requested quantity exceeds your On-Demand Instance limit for the selected instance type. If your request fails due to limit constraints, increase your On-Demand Instance limit for the required instance type and try again. For more information about increasing your instance limits, see Amazon EC2 Service Limits in the Amazon Elastic Compute Cloud User Guide.
    */
  def createCapacityReservation(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateCapacityReservationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createCapacityReservation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateCapacityReservationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateCapacityReservationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new Capacity Reservation with the specified attributes. Capacity Reservations enable you to reserve capacity for your Amazon EC2 instances in a specific Availability Zone for any duration. This gives you the flexibility to selectively add capacity reservations and still get the Regional RI discounts for that usage. By creating Capacity Reservations, you ensure that you always have access to Amazon EC2 capacity when you need it, for as long as you need it. For more information, see Capacity Reservations in the Amazon Elastic Compute Cloud User Guide. Your request to create a Capacity Reservation could fail if Amazon EC2 does not have sufficient capacity to fulfill the request. If your request fails due to Amazon EC2 capacity constraints, either try again at a later time, try in a different Availability Zone, or request a smaller capacity reservation. If your application is flexible across instance types and sizes, try to create a Capacity Reservation with different instance attributes. Your request could also fail if the requested quantity exceeds your On-Demand Instance limit for the selected instance type. If your request fails due to limit constraints, increase your On-Demand Instance limit for the required instance type and try again. For more information about increasing your instance limits, see Amazon EC2 Service Limits in the Amazon Elastic Compute Cloud User Guide.
    */
  def createCapacityReservation(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateCapacityReservationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateCapacityReservationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createCapacityReservation(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateCapacityReservationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateCapacityReservationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateCapacityReservationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a Client VPN endpoint. A Client VPN endpoint is the resource you create and configure to enable and manage client VPN sessions. It is the destination endpoint at which all client VPN sessions are terminated.
    */
  def createClientVpnEndpoint(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateClientVpnEndpointResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createClientVpnEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateClientVpnEndpointResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateClientVpnEndpointResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a Client VPN endpoint. A Client VPN endpoint is the resource you create and configure to enable and manage client VPN sessions. It is the destination endpoint at which all client VPN sessions are terminated.
    */
  def createClientVpnEndpoint(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateClientVpnEndpointRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateClientVpnEndpointResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createClientVpnEndpoint(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateClientVpnEndpointRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateClientVpnEndpointResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateClientVpnEndpointResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds a route to a network to a Client VPN endpoint. Each Client VPN endpoint has a route table that describes the available destination network routes. Each route in the route table specifies the path for traﬃc to speciﬁc resources or networks.
    */
  def createClientVpnRoute(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateClientVpnRouteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createClientVpnRoute(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateClientVpnRouteResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateClientVpnRouteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds a route to a network to a Client VPN endpoint. Each Client VPN endpoint has a route table that describes the available destination network routes. Each route in the route table specifies the path for traﬃc to speciﬁc resources or networks.
    */
  def createClientVpnRoute(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateClientVpnRouteRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateClientVpnRouteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createClientVpnRoute(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateClientVpnRouteRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateClientVpnRouteResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateClientVpnRouteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides information to AWS about your VPN customer gateway device. The customer gateway is the appliance at your end of the VPN connection. (The device on the AWS side of the VPN connection is the virtual private gateway.) You must provide the Internet-routable IP address of the customer gateway's external interface. The IP address must be static and may be behind a device performing network address translation (NAT). For devices that use Border Gateway Protocol (BGP), you can also provide the device's BGP Autonomous System Number (ASN). You can use an existing ASN assigned to your network. If you don't have an ASN already, you can use a private ASN (in the 64512 - 65534 range).  Amazon EC2 supports all 2-byte ASN numbers in the range of 1 - 65534, with the exception of 7224, which is reserved in the us-east-1 region, and 9059, which is reserved in the eu-west-1 region.  For more information, see AWS Site-to-Site VPN in the AWS Site-to-Site VPN User Guide.  You cannot create more than one customer gateway with the same VPN type, IP address, and BGP ASN parameter values. If you run an identical request more than one time, the first request creates the customer gateway, and subsequent requests return information about the existing customer gateway. The subsequent requests do not create new customer gateway resources. 
    */
  def createCustomerGateway(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateCustomerGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createCustomerGateway(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateCustomerGatewayResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateCustomerGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides information to AWS about your VPN customer gateway device. The customer gateway is the appliance at your end of the VPN connection. (The device on the AWS side of the VPN connection is the virtual private gateway.) You must provide the Internet-routable IP address of the customer gateway's external interface. The IP address must be static and may be behind a device performing network address translation (NAT). For devices that use Border Gateway Protocol (BGP), you can also provide the device's BGP Autonomous System Number (ASN). You can use an existing ASN assigned to your network. If you don't have an ASN already, you can use a private ASN (in the 64512 - 65534 range).  Amazon EC2 supports all 2-byte ASN numbers in the range of 1 - 65534, with the exception of 7224, which is reserved in the us-east-1 region, and 9059, which is reserved in the eu-west-1 region.  For more information, see AWS Site-to-Site VPN in the AWS Site-to-Site VPN User Guide.  You cannot create more than one customer gateway with the same VPN type, IP address, and BGP ASN parameter values. If you run an identical request more than one time, the first request creates the customer gateway, and subsequent requests return information about the existing customer gateway. The subsequent requests do not create new customer gateway resources. 
    */
  def createCustomerGateway(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateCustomerGatewayRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateCustomerGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createCustomerGateway(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateCustomerGatewayRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateCustomerGatewayResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateCustomerGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a default subnet with a size /20 IPv4 CIDR block in the specified Availability Zone in your default VPC. You can have only one default subnet per Availability Zone. For more information, see Creating a Default Subnet in the Amazon Virtual Private Cloud User Guide.
    */
  def createDefaultSubnet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateDefaultSubnetResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDefaultSubnet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateDefaultSubnetResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateDefaultSubnetResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a default subnet with a size /20 IPv4 CIDR block in the specified Availability Zone in your default VPC. You can have only one default subnet per Availability Zone. For more information, see Creating a Default Subnet in the Amazon Virtual Private Cloud User Guide.
    */
  def createDefaultSubnet(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateDefaultSubnetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateDefaultSubnetResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDefaultSubnet(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateDefaultSubnetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateDefaultSubnetResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateDefaultSubnetResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a default VPC with a size /16 IPv4 CIDR block and a default subnet in each Availability Zone. For more information about the components of a default VPC, see Default VPC and Default Subnets in the Amazon Virtual Private Cloud User Guide. You cannot specify the components of the default VPC yourself. If you deleted your previous default VPC, you can create a default VPC. You cannot have more than one default VPC per Region. If your account supports EC2-Classic, you cannot use this action to create a default VPC in a Region that supports EC2-Classic. If you want a default VPC in a Region that supports EC2-Classic, see "I really want a default VPC for my existing EC2 account. Is that possible?" in the Default VPCs FAQ.
    */
  def createDefaultVpc(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateDefaultVpcResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDefaultVpc(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateDefaultVpcResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateDefaultVpcResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a default VPC with a size /16 IPv4 CIDR block and a default subnet in each Availability Zone. For more information about the components of a default VPC, see Default VPC and Default Subnets in the Amazon Virtual Private Cloud User Guide. You cannot specify the components of the default VPC yourself. If you deleted your previous default VPC, you can create a default VPC. You cannot have more than one default VPC per Region. If your account supports EC2-Classic, you cannot use this action to create a default VPC in a Region that supports EC2-Classic. If you want a default VPC in a Region that supports EC2-Classic, see "I really want a default VPC for my existing EC2 account. Is that possible?" in the Default VPCs FAQ.
    */
  def createDefaultVpc(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateDefaultVpcRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateDefaultVpcResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDefaultVpc(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateDefaultVpcRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateDefaultVpcResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateDefaultVpcResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a set of DHCP options for your VPC. After creating the set, you must associate it with the VPC, causing all existing and new instances that you launch in the VPC to use this set of DHCP options. The following are the individual DHCP options you can specify. For more information about the options, see RFC 2132.    domain-name-servers - The IP addresses of up to four domain name servers, or AmazonProvidedDNS. The default DHCP option set specifies AmazonProvidedDNS. If specifying more than one domain name server, specify the IP addresses in a single parameter, separated by commas. ITo have your instance to receive a custom DNS hostname as specified in domain-name, you must set domain-name-servers to a custom DNS server.    domain-name - If you're using AmazonProvidedDNS in us-east-1, specify ec2.internal. If you're using AmazonProvidedDNS in another region, specify region.compute.internal (for example, ap-northeast-1.compute.internal). Otherwise, specify a domain name (for example, MyCompany.com). This value is used to complete unqualified DNS hostnames. Important: Some Linux operating systems accept multiple domain names separated by spaces. However, Windows and other Linux operating systems treat the value as a single domain, which results in unexpected behavior. If your DHCP options set is associated with a VPC that has instances with multiple operating systems, specify only one domain name.    ntp-servers - The IP addresses of up to four Network Time Protocol (NTP) servers.    netbios-name-servers - The IP addresses of up to four NetBIOS name servers.    netbios-node-type - The NetBIOS node type (1, 2, 4, or 8). We recommend that you specify 2 (broadcast and multicast are not currently supported). For more information about these node types, see RFC 2132.   Your VPC automatically starts out with a set of DHCP options that includes only a DNS server that we provide (AmazonProvidedDNS). If you create a set of options, and if your VPC has an internet gateway, make sure to set the domain-name-servers option either to AmazonProvidedDNS or to a domain name server of your choice. For more information, see DHCP Options Sets in the Amazon Virtual Private Cloud User Guide.
    */
  def createDhcpOptions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateDhcpOptionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDhcpOptions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateDhcpOptionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateDhcpOptionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a set of DHCP options for your VPC. After creating the set, you must associate it with the VPC, causing all existing and new instances that you launch in the VPC to use this set of DHCP options. The following are the individual DHCP options you can specify. For more information about the options, see RFC 2132.    domain-name-servers - The IP addresses of up to four domain name servers, or AmazonProvidedDNS. The default DHCP option set specifies AmazonProvidedDNS. If specifying more than one domain name server, specify the IP addresses in a single parameter, separated by commas. ITo have your instance to receive a custom DNS hostname as specified in domain-name, you must set domain-name-servers to a custom DNS server.    domain-name - If you're using AmazonProvidedDNS in us-east-1, specify ec2.internal. If you're using AmazonProvidedDNS in another region, specify region.compute.internal (for example, ap-northeast-1.compute.internal). Otherwise, specify a domain name (for example, MyCompany.com). This value is used to complete unqualified DNS hostnames. Important: Some Linux operating systems accept multiple domain names separated by spaces. However, Windows and other Linux operating systems treat the value as a single domain, which results in unexpected behavior. If your DHCP options set is associated with a VPC that has instances with multiple operating systems, specify only one domain name.    ntp-servers - The IP addresses of up to four Network Time Protocol (NTP) servers.    netbios-name-servers - The IP addresses of up to four NetBIOS name servers.    netbios-node-type - The NetBIOS node type (1, 2, 4, or 8). We recommend that you specify 2 (broadcast and multicast are not currently supported). For more information about these node types, see RFC 2132.   Your VPC automatically starts out with a set of DHCP options that includes only a DNS server that we provide (AmazonProvidedDNS). If you create a set of options, and if your VPC has an internet gateway, make sure to set the domain-name-servers option either to AmazonProvidedDNS or to a domain name server of your choice. For more information, see DHCP Options Sets in the Amazon Virtual Private Cloud User Guide.
    */
  def createDhcpOptions(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateDhcpOptionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateDhcpOptionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDhcpOptions(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateDhcpOptionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateDhcpOptionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateDhcpOptionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * [IPv6 only] Creates an egress-only internet gateway for your VPC. An egress-only internet gateway is used to enable outbound communication over IPv6 from instances in your VPC to the internet, and prevents hosts outside of your VPC from initiating an IPv6 connection with your instance.
    */
  def createEgressOnlyInternetGateway(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateEgressOnlyInternetGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createEgressOnlyInternetGateway(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateEgressOnlyInternetGatewayResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateEgressOnlyInternetGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * [IPv6 only] Creates an egress-only internet gateway for your VPC. An egress-only internet gateway is used to enable outbound communication over IPv6 from instances in your VPC to the internet, and prevents hosts outside of your VPC from initiating an IPv6 connection with your instance.
    */
  def createEgressOnlyInternetGateway(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateEgressOnlyInternetGatewayRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateEgressOnlyInternetGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createEgressOnlyInternetGateway(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateEgressOnlyInternetGatewayRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateEgressOnlyInternetGatewayResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateEgressOnlyInternetGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Launches an EC2 Fleet. You can create a single EC2 Fleet that includes multiple launch specifications that vary by instance type, AMI, Availability Zone, or subnet. For more information, see Launching an EC2 Fleet in the Amazon Elastic Compute Cloud User Guide.
    */
  def createFleet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateFleetResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createFleet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateFleetResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateFleetResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Launches an EC2 Fleet. You can create a single EC2 Fleet that includes multiple launch specifications that vary by instance type, AMI, Availability Zone, or subnet. For more information, see Launching an EC2 Fleet in the Amazon Elastic Compute Cloud User Guide.
    */
  def createFleet(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateFleetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateFleetResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createFleet(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateFleetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateFleetResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateFleetResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates one or more flow logs to capture information about IP traffic for a specific network interface, subnet, or VPC.  Flow log data for a monitored network interface is recorded as flow log records, which are log events consisting of fields that describe the traffic flow. For more information, see Flow Log Records in the Amazon Virtual Private Cloud User Guide. When publishing to CloudWatch Logs, flow log records are published to a log group, and each network interface has a unique log stream in the log group. When publishing to Amazon S3, flow log records for all of the monitored network interfaces are published to a single log file object that is stored in the specified bucket. For more information, see VPC Flow Logs in the Amazon Virtual Private Cloud User Guide.
    */
  def createFlowLogs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateFlowLogsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createFlowLogs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateFlowLogsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateFlowLogsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates one or more flow logs to capture information about IP traffic for a specific network interface, subnet, or VPC.  Flow log data for a monitored network interface is recorded as flow log records, which are log events consisting of fields that describe the traffic flow. For more information, see Flow Log Records in the Amazon Virtual Private Cloud User Guide. When publishing to CloudWatch Logs, flow log records are published to a log group, and each network interface has a unique log stream in the log group. When publishing to Amazon S3, flow log records for all of the monitored network interfaces are published to a single log file object that is stored in the specified bucket. For more information, see VPC Flow Logs in the Amazon Virtual Private Cloud User Guide.
    */
  def createFlowLogs(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateFlowLogsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateFlowLogsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createFlowLogs(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateFlowLogsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateFlowLogsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateFlowLogsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an Amazon FPGA Image (AFI) from the specified design checkpoint (DCP). The create operation is asynchronous. To verify that the AFI is ready for use, check the output logs. An AFI contains the FPGA bitstream that is ready to download to an FPGA. You can securely deploy an AFI on one or more FPGA-accelerated instances. For more information, see the AWS FPGA Hardware Development Kit.
    */
  def createFpgaImage(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateFpgaImageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createFpgaImage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateFpgaImageResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateFpgaImageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an Amazon FPGA Image (AFI) from the specified design checkpoint (DCP). The create operation is asynchronous. To verify that the AFI is ready for use, check the output logs. An AFI contains the FPGA bitstream that is ready to download to an FPGA. You can securely deploy an AFI on one or more FPGA-accelerated instances. For more information, see the AWS FPGA Hardware Development Kit.
    */
  def createFpgaImage(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateFpgaImageRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateFpgaImageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createFpgaImage(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateFpgaImageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateFpgaImageResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateFpgaImageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an Amazon EBS-backed AMI from an Amazon EBS-backed instance that is either running or stopped. If you customized your instance with instance store volumes or EBS volumes in addition to the root device volume, the new AMI contains block device mapping information for those volumes. When you launch an instance from this new AMI, the instance automatically launches with those additional volumes. For more information, see Creating Amazon EBS-Backed Linux AMIs in the Amazon Elastic Compute Cloud User Guide.
    */
  def createImage(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateImageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createImage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateImageResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateImageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an Amazon EBS-backed AMI from an Amazon EBS-backed instance that is either running or stopped. If you customized your instance with instance store volumes or EBS volumes in addition to the root device volume, the new AMI contains block device mapping information for those volumes. When you launch an instance from this new AMI, the instance automatically launches with those additional volumes. For more information, see Creating Amazon EBS-Backed Linux AMIs in the Amazon Elastic Compute Cloud User Guide.
    */
  def createImage(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateImageRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateImageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createImage(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateImageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateImageResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateImageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Exports a running or stopped instance to an S3 bucket. For information about the supported operating systems, image formats, and known limitations for the types of instances you can export, see Exporting an Instance as a VM Using VM Import/Export in the VM Import/Export User Guide.
    */
  def createInstanceExportTask(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateInstanceExportTaskResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createInstanceExportTask(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateInstanceExportTaskResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateInstanceExportTaskResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Exports a running or stopped instance to an S3 bucket. For information about the supported operating systems, image formats, and known limitations for the types of instances you can export, see Exporting an Instance as a VM Using VM Import/Export in the VM Import/Export User Guide.
    */
  def createInstanceExportTask(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateInstanceExportTaskRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateInstanceExportTaskResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createInstanceExportTask(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateInstanceExportTaskRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateInstanceExportTaskResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateInstanceExportTaskResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an internet gateway for use with a VPC. After creating the internet gateway, you attach it to a VPC using AttachInternetGateway. For more information about your VPC and internet gateway, see the Amazon Virtual Private Cloud User Guide.
    */
  def createInternetGateway(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateInternetGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createInternetGateway(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateInternetGatewayResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateInternetGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an internet gateway for use with a VPC. After creating the internet gateway, you attach it to a VPC using AttachInternetGateway. For more information about your VPC and internet gateway, see the Amazon Virtual Private Cloud User Guide.
    */
  def createInternetGateway(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateInternetGatewayRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateInternetGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createInternetGateway(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateInternetGatewayRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateInternetGatewayResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateInternetGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a 2048-bit RSA key pair with the specified name. Amazon EC2 stores the public key and displays the private key for you to save to a file. The private key is returned as an unencrypted PEM encoded PKCS#1 private key. If a key with the specified name already exists, Amazon EC2 returns an error. You can have up to five thousand key pairs per region. The key pair returned to you is available only in the region in which you create it. If you prefer, you can create your own key pair using a third-party tool and upload it to any region using ImportKeyPair. For more information, see Key Pairs in the Amazon Elastic Compute Cloud User Guide.
    */
  def createKeyPair(): awsDashSdkLib.libRequestMod.Request[awsDashSdkLib.clientsEc2Mod.EC2Ns.KeyPair, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createKeyPair(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.KeyPair, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[awsDashSdkLib.clientsEc2Mod.EC2Ns.KeyPair, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a 2048-bit RSA key pair with the specified name. Amazon EC2 stores the public key and displays the private key for you to save to a file. The private key is returned as an unencrypted PEM encoded PKCS#1 private key. If a key with the specified name already exists, Amazon EC2 returns an error. You can have up to five thousand key pairs per region. The key pair returned to you is available only in the region in which you create it. If you prefer, you can create your own key pair using a third-party tool and upload it to any region using ImportKeyPair. For more information, see Key Pairs in the Amazon Elastic Compute Cloud User Guide.
    */
  def createKeyPair(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateKeyPairRequest): awsDashSdkLib.libRequestMod.Request[awsDashSdkLib.clientsEc2Mod.EC2Ns.KeyPair, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createKeyPair(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateKeyPairRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.KeyPair, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[awsDashSdkLib.clientsEc2Mod.EC2Ns.KeyPair, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a launch template. A launch template contains the parameters to launch an instance. When you launch an instance using RunInstances, you can specify a launch template instead of providing the launch parameters in the request.
    */
  def createLaunchTemplate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateLaunchTemplateResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createLaunchTemplate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateLaunchTemplateResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateLaunchTemplateResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a launch template. A launch template contains the parameters to launch an instance. When you launch an instance using RunInstances, you can specify a launch template instead of providing the launch parameters in the request.
    */
  def createLaunchTemplate(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateLaunchTemplateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateLaunchTemplateResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createLaunchTemplate(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateLaunchTemplateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateLaunchTemplateResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateLaunchTemplateResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new version for a launch template. You can specify an existing version of launch template from which to base the new version. Launch template versions are numbered in the order in which they are created. You cannot specify, change, or replace the numbering of launch template versions.
    */
  def createLaunchTemplateVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateLaunchTemplateVersionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createLaunchTemplateVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateLaunchTemplateVersionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateLaunchTemplateVersionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new version for a launch template. You can specify an existing version of launch template from which to base the new version. Launch template versions are numbered in the order in which they are created. You cannot specify, change, or replace the numbering of launch template versions.
    */
  def createLaunchTemplateVersion(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateLaunchTemplateVersionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateLaunchTemplateVersionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createLaunchTemplateVersion(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateLaunchTemplateVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateLaunchTemplateVersionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateLaunchTemplateVersionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a NAT gateway in the specified public subnet. This action creates a network interface in the specified subnet with a private IP address from the IP address range of the subnet. Internet-bound traffic from a private subnet can be routed to the NAT gateway, therefore enabling instances in the private subnet to connect to the internet. For more information, see NAT Gateways in the Amazon Virtual Private Cloud User Guide.
    */
  def createNatGateway(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateNatGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createNatGateway(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateNatGatewayResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateNatGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a NAT gateway in the specified public subnet. This action creates a network interface in the specified subnet with a private IP address from the IP address range of the subnet. Internet-bound traffic from a private subnet can be routed to the NAT gateway, therefore enabling instances in the private subnet to connect to the internet. For more information, see NAT Gateways in the Amazon Virtual Private Cloud User Guide.
    */
  def createNatGateway(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateNatGatewayRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateNatGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createNatGateway(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateNatGatewayRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateNatGatewayResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateNatGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a network ACL in a VPC. Network ACLs provide an optional layer of security (in addition to security groups) for the instances in your VPC. For more information, see Network ACLs in the Amazon Virtual Private Cloud User Guide.
    */
  def createNetworkAcl(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateNetworkAclResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createNetworkAcl(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateNetworkAclResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateNetworkAclResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a network ACL in a VPC. Network ACLs provide an optional layer of security (in addition to security groups) for the instances in your VPC. For more information, see Network ACLs in the Amazon Virtual Private Cloud User Guide.
    */
  def createNetworkAcl(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateNetworkAclRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateNetworkAclResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createNetworkAcl(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateNetworkAclRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateNetworkAclResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateNetworkAclResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an entry (a rule) in a network ACL with the specified rule number. Each network ACL has a set of numbered ingress rules and a separate set of numbered egress rules. When determining whether a packet should be allowed in or out of a subnet associated with the ACL, we process the entries in the ACL according to the rule numbers, in ascending order. Each network ACL has a set of ingress rules and a separate set of egress rules. We recommend that you leave room between the rule numbers (for example, 100, 110, 120, ...), and not number them one right after the other (for example, 101, 102, 103, ...). This makes it easier to add a rule between existing ones without having to renumber the rules. After you add an entry, you can't modify it; you must either replace it, or create an entry and delete the old one. For more information about network ACLs, see Network ACLs in the Amazon Virtual Private Cloud User Guide.
    */
  def createNetworkAclEntry(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createNetworkAclEntry(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an entry (a rule) in a network ACL with the specified rule number. Each network ACL has a set of numbered ingress rules and a separate set of numbered egress rules. When determining whether a packet should be allowed in or out of a subnet associated with the ACL, we process the entries in the ACL according to the rule numbers, in ascending order. Each network ACL has a set of ingress rules and a separate set of egress rules. We recommend that you leave room between the rule numbers (for example, 100, 110, 120, ...), and not number them one right after the other (for example, 101, 102, 103, ...). This makes it easier to add a rule between existing ones without having to renumber the rules. After you add an entry, you can't modify it; you must either replace it, or create an entry and delete the old one. For more information about network ACLs, see Network ACLs in the Amazon Virtual Private Cloud User Guide.
    */
  def createNetworkAclEntry(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateNetworkAclEntryRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createNetworkAclEntry(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateNetworkAclEntryRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a network interface in the specified subnet. For more information about network interfaces, see Elastic Network Interfaces in the Amazon Virtual Private Cloud User Guide.
    */
  def createNetworkInterface(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateNetworkInterfaceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createNetworkInterface(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateNetworkInterfaceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateNetworkInterfaceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a network interface in the specified subnet. For more information about network interfaces, see Elastic Network Interfaces in the Amazon Virtual Private Cloud User Guide.
    */
  def createNetworkInterface(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateNetworkInterfaceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateNetworkInterfaceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createNetworkInterface(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateNetworkInterfaceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateNetworkInterfaceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateNetworkInterfaceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Grants an AWS-authorized account permission to attach the specified network interface to an instance in their account. You can grant permission to a single AWS account only, and only one account at a time.
    */
  def createNetworkInterfacePermission(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateNetworkInterfacePermissionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createNetworkInterfacePermission(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateNetworkInterfacePermissionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateNetworkInterfacePermissionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Grants an AWS-authorized account permission to attach the specified network interface to an instance in their account. You can grant permission to a single AWS account only, and only one account at a time.
    */
  def createNetworkInterfacePermission(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateNetworkInterfacePermissionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateNetworkInterfacePermissionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createNetworkInterfacePermission(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateNetworkInterfacePermissionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateNetworkInterfacePermissionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateNetworkInterfacePermissionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a placement group in which to launch instances. The strategy of the placement group determines how the instances are organized within the group.  A cluster placement group is a logical grouping of instances within a single Availability Zone that benefit from low network latency, high network throughput. A spread placement group places instances on distinct hardware. A partition placement group places groups of instances in different partitions, where instances in one partition do not share the same hardware with instances in another partition. For more information, see Placement Groups in the Amazon Elastic Compute Cloud User Guide.
    */
  def createPlacementGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createPlacementGroup(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a placement group in which to launch instances. The strategy of the placement group determines how the instances are organized within the group.  A cluster placement group is a logical grouping of instances within a single Availability Zone that benefit from low network latency, high network throughput. A spread placement group places instances on distinct hardware. A partition placement group places groups of instances in different partitions, where instances in one partition do not share the same hardware with instances in another partition. For more information, see Placement Groups in the Amazon Elastic Compute Cloud User Guide.
    */
  def createPlacementGroup(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreatePlacementGroupRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createPlacementGroup(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreatePlacementGroupRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a listing for Amazon EC2 Standard Reserved Instances to be sold in the Reserved Instance Marketplace. You can submit one Standard Reserved Instance listing at a time. To get a list of your Standard Reserved Instances, you can use the DescribeReservedInstances operation.  Only Standard Reserved Instances can be sold in the Reserved Instance Marketplace. Convertible Reserved Instances cannot be sold.  The Reserved Instance Marketplace matches sellers who want to resell Standard Reserved Instance capacity that they no longer need with buyers who want to purchase additional capacity. Reserved Instances bought and sold through the Reserved Instance Marketplace work like any other Reserved Instances. To sell your Standard Reserved Instances, you must first register as a seller in the Reserved Instance Marketplace. After completing the registration process, you can create a Reserved Instance Marketplace listing of some or all of your Standard Reserved Instances, and specify the upfront price to receive for them. Your Standard Reserved Instance listings then become available for purchase. To view the details of your Standard Reserved Instance listing, you can use the DescribeReservedInstancesListings operation. For more information, see Reserved Instance Marketplace in the Amazon Elastic Compute Cloud User Guide.
    */
  def createReservedInstancesListing(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateReservedInstancesListingResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createReservedInstancesListing(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateReservedInstancesListingResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateReservedInstancesListingResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a listing for Amazon EC2 Standard Reserved Instances to be sold in the Reserved Instance Marketplace. You can submit one Standard Reserved Instance listing at a time. To get a list of your Standard Reserved Instances, you can use the DescribeReservedInstances operation.  Only Standard Reserved Instances can be sold in the Reserved Instance Marketplace. Convertible Reserved Instances cannot be sold.  The Reserved Instance Marketplace matches sellers who want to resell Standard Reserved Instance capacity that they no longer need with buyers who want to purchase additional capacity. Reserved Instances bought and sold through the Reserved Instance Marketplace work like any other Reserved Instances. To sell your Standard Reserved Instances, you must first register as a seller in the Reserved Instance Marketplace. After completing the registration process, you can create a Reserved Instance Marketplace listing of some or all of your Standard Reserved Instances, and specify the upfront price to receive for them. Your Standard Reserved Instance listings then become available for purchase. To view the details of your Standard Reserved Instance listing, you can use the DescribeReservedInstancesListings operation. For more information, see Reserved Instance Marketplace in the Amazon Elastic Compute Cloud User Guide.
    */
  def createReservedInstancesListing(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateReservedInstancesListingRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateReservedInstancesListingResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createReservedInstancesListing(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateReservedInstancesListingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateReservedInstancesListingResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateReservedInstancesListingResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a route in a route table within a VPC. You must specify one of the following targets: internet gateway or virtual private gateway, NAT instance, NAT gateway, VPC peering connection, network interface, or egress-only internet gateway. When determining how to route traffic, we use the route with the most specific match. For example, traffic is destined for the IPv4 address 192.0.2.3, and the route table includes the following two IPv4 routes:    192.0.2.0/24 (goes to some target A)    192.0.2.0/28 (goes to some target B)   Both routes apply to the traffic destined for 192.0.2.3. However, the second route in the list covers a smaller number of IP addresses and is therefore more specific, so we use that route to determine where to target the traffic. For more information about route tables, see Route Tables in the Amazon Virtual Private Cloud User Guide.
    */
  def createRoute(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateRouteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createRoute(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateRouteResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateRouteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a route in a route table within a VPC. You must specify one of the following targets: internet gateway or virtual private gateway, NAT instance, NAT gateway, VPC peering connection, network interface, or egress-only internet gateway. When determining how to route traffic, we use the route with the most specific match. For example, traffic is destined for the IPv4 address 192.0.2.3, and the route table includes the following two IPv4 routes:    192.0.2.0/24 (goes to some target A)    192.0.2.0/28 (goes to some target B)   Both routes apply to the traffic destined for 192.0.2.3. However, the second route in the list covers a smaller number of IP addresses and is therefore more specific, so we use that route to determine where to target the traffic. For more information about route tables, see Route Tables in the Amazon Virtual Private Cloud User Guide.
    */
  def createRoute(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateRouteRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateRouteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createRoute(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateRouteRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateRouteResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateRouteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a route table for the specified VPC. After you create a route table, you can add routes and associate the table with a subnet. For more information, see Route Tables in the Amazon Virtual Private Cloud User Guide.
    */
  def createRouteTable(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateRouteTableResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createRouteTable(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateRouteTableResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateRouteTableResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a route table for the specified VPC. After you create a route table, you can add routes and associate the table with a subnet. For more information, see Route Tables in the Amazon Virtual Private Cloud User Guide.
    */
  def createRouteTable(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateRouteTableRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateRouteTableResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createRouteTable(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateRouteTableRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateRouteTableResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateRouteTableResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a security group. A security group is for use with instances either in the EC2-Classic platform or in a specific VPC. For more information, see Amazon EC2 Security Groups in the Amazon Elastic Compute Cloud User Guide and Security Groups for Your VPC in the Amazon Virtual Private Cloud User Guide.  EC2-Classic: You can have up to 500 security groups. EC2-VPC: You can create up to 500 security groups per VPC.  When you create a security group, you specify a friendly name of your choice. You can have a security group for use in EC2-Classic with the same name as a security group for use in a VPC. However, you can't have two security groups for use in EC2-Classic with the same name or two security groups for use in a VPC with the same name. You have a default security group for use in EC2-Classic and a default security group for use in your VPC. If you don't specify a security group when you launch an instance, the instance is launched into the appropriate default security group. A default security group includes a default rule that grants instances unrestricted network access to each other. You can add or remove rules from your security groups using AuthorizeSecurityGroupIngress, AuthorizeSecurityGroupEgress, RevokeSecurityGroupIngress, and RevokeSecurityGroupEgress.
    */
  def createSecurityGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateSecurityGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createSecurityGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateSecurityGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateSecurityGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a security group. A security group is for use with instances either in the EC2-Classic platform or in a specific VPC. For more information, see Amazon EC2 Security Groups in the Amazon Elastic Compute Cloud User Guide and Security Groups for Your VPC in the Amazon Virtual Private Cloud User Guide.  EC2-Classic: You can have up to 500 security groups. EC2-VPC: You can create up to 500 security groups per VPC.  When you create a security group, you specify a friendly name of your choice. You can have a security group for use in EC2-Classic with the same name as a security group for use in a VPC. However, you can't have two security groups for use in EC2-Classic with the same name or two security groups for use in a VPC with the same name. You have a default security group for use in EC2-Classic and a default security group for use in your VPC. If you don't specify a security group when you launch an instance, the instance is launched into the appropriate default security group. A default security group includes a default rule that grants instances unrestricted network access to each other. You can add or remove rules from your security groups using AuthorizeSecurityGroupIngress, AuthorizeSecurityGroupEgress, RevokeSecurityGroupIngress, and RevokeSecurityGroupEgress.
    */
  def createSecurityGroup(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateSecurityGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateSecurityGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createSecurityGroup(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateSecurityGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateSecurityGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateSecurityGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a snapshot of an EBS volume and stores it in Amazon S3. You can use snapshots for backups, to make copies of EBS volumes, and to save data before shutting down an instance. When a snapshot is created, any AWS Marketplace product codes that are associated with the source volume are propagated to the snapshot. You can take a snapshot of an attached volume that is in use. However, snapshots only capture data that has been written to your EBS volume at the time the snapshot command is issued; this may exclude any data that has been cached by any applications or the operating system. If you can pause any file systems on the volume long enough to take a snapshot, your snapshot should be complete. However, if you cannot pause all file writes to the volume, you should unmount the volume from within the instance, issue the snapshot command, and then remount the volume to ensure a consistent and complete snapshot. You may remount and use your volume while the snapshot status is pending. To create a snapshot for EBS volumes that serve as root devices, you should stop the instance before taking the snapshot. Snapshots that are taken from encrypted volumes are automatically encrypted. Volumes that are created from encrypted snapshots are also automatically encrypted. Your encrypted volumes and any associated snapshots always remain protected. You can tag your snapshots during creation. For more information, see Tagging Your Amazon EC2 Resources in the Amazon Elastic Compute Cloud User Guide. For more information, see Amazon Elastic Block Store and Amazon EBS Encryption in the Amazon Elastic Compute Cloud User Guide.
    */
  def createSnapshot(): awsDashSdkLib.libRequestMod.Request[awsDashSdkLib.clientsEc2Mod.EC2Ns.Snapshot, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.Snapshot, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[awsDashSdkLib.clientsEc2Mod.EC2Ns.Snapshot, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a snapshot of an EBS volume and stores it in Amazon S3. You can use snapshots for backups, to make copies of EBS volumes, and to save data before shutting down an instance. When a snapshot is created, any AWS Marketplace product codes that are associated with the source volume are propagated to the snapshot. You can take a snapshot of an attached volume that is in use. However, snapshots only capture data that has been written to your EBS volume at the time the snapshot command is issued; this may exclude any data that has been cached by any applications or the operating system. If you can pause any file systems on the volume long enough to take a snapshot, your snapshot should be complete. However, if you cannot pause all file writes to the volume, you should unmount the volume from within the instance, issue the snapshot command, and then remount the volume to ensure a consistent and complete snapshot. You may remount and use your volume while the snapshot status is pending. To create a snapshot for EBS volumes that serve as root devices, you should stop the instance before taking the snapshot. Snapshots that are taken from encrypted volumes are automatically encrypted. Volumes that are created from encrypted snapshots are also automatically encrypted. Your encrypted volumes and any associated snapshots always remain protected. You can tag your snapshots during creation. For more information, see Tagging Your Amazon EC2 Resources in the Amazon Elastic Compute Cloud User Guide. For more information, see Amazon Elastic Block Store and Amazon EBS Encryption in the Amazon Elastic Compute Cloud User Guide.
    */
  def createSnapshot(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateSnapshotRequest): awsDashSdkLib.libRequestMod.Request[awsDashSdkLib.clientsEc2Mod.EC2Ns.Snapshot, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createSnapshot(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateSnapshotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.Snapshot, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[awsDashSdkLib.clientsEc2Mod.EC2Ns.Snapshot, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a data feed for Spot Instances, enabling you to view Spot Instance usage logs. You can create one data feed per AWS account. For more information, see Spot Instance Data Feed in the Amazon EC2 User Guide for Linux Instances.
    */
  def createSpotDatafeedSubscription(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateSpotDatafeedSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createSpotDatafeedSubscription(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateSpotDatafeedSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateSpotDatafeedSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a data feed for Spot Instances, enabling you to view Spot Instance usage logs. You can create one data feed per AWS account. For more information, see Spot Instance Data Feed in the Amazon EC2 User Guide for Linux Instances.
    */
  def createSpotDatafeedSubscription(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateSpotDatafeedSubscriptionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateSpotDatafeedSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createSpotDatafeedSubscription(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateSpotDatafeedSubscriptionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateSpotDatafeedSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateSpotDatafeedSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a subnet in an existing VPC. When you create each subnet, you provide the VPC ID and IPv4 CIDR block for the subnet. After you create a subnet, you can't change its CIDR block. The size of the subnet's IPv4 CIDR block can be the same as a VPC's IPv4 CIDR block, or a subset of a VPC's IPv4 CIDR block. If you create more than one subnet in a VPC, the subnets' CIDR blocks must not overlap. The smallest IPv4 subnet (and VPC) you can create uses a /28 netmask (16 IPv4 addresses), and the largest uses a /16 netmask (65,536 IPv4 addresses). If you've associated an IPv6 CIDR block with your VPC, you can create a subnet with an IPv6 CIDR block that uses a /64 prefix length.   AWS reserves both the first four and the last IPv4 address in each subnet's CIDR block. They're not available for use.  If you add more than one subnet to a VPC, they're set up in a star topology with a logical router in the middle. If you launch an instance in a VPC using an Amazon EBS-backed AMI, the IP address doesn't change if you stop and restart the instance (unlike a similar instance launched outside a VPC, which gets a new IP address when restarted). It's therefore possible to have a subnet with no running instances (they're all stopped), but no remaining IP addresses available. For more information about subnets, see Your VPC and Subnets in the Amazon Virtual Private Cloud User Guide.
    */
  def createSubnet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateSubnetResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createSubnet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateSubnetResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateSubnetResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a subnet in an existing VPC. When you create each subnet, you provide the VPC ID and IPv4 CIDR block for the subnet. After you create a subnet, you can't change its CIDR block. The size of the subnet's IPv4 CIDR block can be the same as a VPC's IPv4 CIDR block, or a subset of a VPC's IPv4 CIDR block. If you create more than one subnet in a VPC, the subnets' CIDR blocks must not overlap. The smallest IPv4 subnet (and VPC) you can create uses a /28 netmask (16 IPv4 addresses), and the largest uses a /16 netmask (65,536 IPv4 addresses). If you've associated an IPv6 CIDR block with your VPC, you can create a subnet with an IPv6 CIDR block that uses a /64 prefix length.   AWS reserves both the first four and the last IPv4 address in each subnet's CIDR block. They're not available for use.  If you add more than one subnet to a VPC, they're set up in a star topology with a logical router in the middle. If you launch an instance in a VPC using an Amazon EBS-backed AMI, the IP address doesn't change if you stop and restart the instance (unlike a similar instance launched outside a VPC, which gets a new IP address when restarted). It's therefore possible to have a subnet with no running instances (they're all stopped), but no remaining IP addresses available. For more information about subnets, see Your VPC and Subnets in the Amazon Virtual Private Cloud User Guide.
    */
  def createSubnet(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateSubnetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateSubnetResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createSubnet(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateSubnetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateSubnetResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateSubnetResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds or overwrites one or more tags for the specified Amazon EC2 resource or resources. Each resource can have a maximum of 50 tags. Each tag consists of a key and optional value. Tag keys must be unique per resource. For more information about tags, see Tagging Your Resources in the Amazon Elastic Compute Cloud User Guide. For more information about creating IAM policies that control users' access to resources based on tags, see Supported Resource-Level Permissions for Amazon EC2 API Actions in the Amazon Elastic Compute Cloud User Guide.
    */
  def createTags(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createTags(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds or overwrites one or more tags for the specified Amazon EC2 resource or resources. Each resource can have a maximum of 50 tags. Each tag consists of a key and optional value. Tag keys must be unique per resource. For more information about tags, see Tagging Your Resources in the Amazon Elastic Compute Cloud User Guide. For more information about creating IAM policies that control users' access to resources based on tags, see Supported Resource-Level Permissions for Amazon EC2 API Actions in the Amazon Elastic Compute Cloud User Guide.
    */
  def createTags(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateTagsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createTags(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateTagsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a transit gateway. You can use a transit gateway to interconnect your virtual private clouds (VPC) and on-premises networks. After the transit gateway enters the available state, you can attach your VPCs and VPN connections to the transit gateway. To attach your VPCs, use CreateTransitGatewayVpcAttachment. To attach a VPN connection, use CreateCustomerGateway to create a customer gateway and specify the ID of the customer gateway and the ID of the transit gateway in a call to CreateVpnConnection. When you create a transit gateway, we create a default transit gateway route table and use it as the default association route table and the default propagation route table. You can use CreateTransitGatewayRouteTable to create additional transit gateway route tables. If you disable automatic route propagation, we do not create a default transit gateway route table. You can use EnableTransitGatewayRouteTablePropagation to propagate routes from a resource attachment to a transit gateway route table. If you disable automatic associations, you can use AssociateTransitGatewayRouteTable to associate a resource attachment with a transit gateway route table.
    */
  def createTransitGateway(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateTransitGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createTransitGateway(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateTransitGatewayResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateTransitGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a transit gateway. You can use a transit gateway to interconnect your virtual private clouds (VPC) and on-premises networks. After the transit gateway enters the available state, you can attach your VPCs and VPN connections to the transit gateway. To attach your VPCs, use CreateTransitGatewayVpcAttachment. To attach a VPN connection, use CreateCustomerGateway to create a customer gateway and specify the ID of the customer gateway and the ID of the transit gateway in a call to CreateVpnConnection. When you create a transit gateway, we create a default transit gateway route table and use it as the default association route table and the default propagation route table. You can use CreateTransitGatewayRouteTable to create additional transit gateway route tables. If you disable automatic route propagation, we do not create a default transit gateway route table. You can use EnableTransitGatewayRouteTablePropagation to propagate routes from a resource attachment to a transit gateway route table. If you disable automatic associations, you can use AssociateTransitGatewayRouteTable to associate a resource attachment with a transit gateway route table.
    */
  def createTransitGateway(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateTransitGatewayRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateTransitGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createTransitGateway(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateTransitGatewayRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateTransitGatewayResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateTransitGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a static route for the specified transit gateway route table.
    */
  def createTransitGatewayRoute(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateTransitGatewayRouteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createTransitGatewayRoute(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateTransitGatewayRouteResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateTransitGatewayRouteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a static route for the specified transit gateway route table.
    */
  def createTransitGatewayRoute(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateTransitGatewayRouteRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateTransitGatewayRouteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createTransitGatewayRoute(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateTransitGatewayRouteRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateTransitGatewayRouteResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateTransitGatewayRouteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a route table for the specified transit gateway.
    */
  def createTransitGatewayRouteTable(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateTransitGatewayRouteTableResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createTransitGatewayRouteTable(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateTransitGatewayRouteTableResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateTransitGatewayRouteTableResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a route table for the specified transit gateway.
    */
  def createTransitGatewayRouteTable(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateTransitGatewayRouteTableRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateTransitGatewayRouteTableResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createTransitGatewayRouteTable(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateTransitGatewayRouteTableRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateTransitGatewayRouteTableResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateTransitGatewayRouteTableResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Attaches the specified VPC to the specified transit gateway. If you attach a VPC with a CIDR range that overlaps the CIDR range of a VPC that is already attached, the new VPC CIDR range is not propagated to the default propagation route table. To send VPC traffic to an attached transit gateway, add a route to the VPC route table using CreateRoute.
    */
  def createTransitGatewayVpcAttachment(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateTransitGatewayVpcAttachmentResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createTransitGatewayVpcAttachment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateTransitGatewayVpcAttachmentResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateTransitGatewayVpcAttachmentResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Attaches the specified VPC to the specified transit gateway. If you attach a VPC with a CIDR range that overlaps the CIDR range of a VPC that is already attached, the new VPC CIDR range is not propagated to the default propagation route table. To send VPC traffic to an attached transit gateway, add a route to the VPC route table using CreateRoute.
    */
  def createTransitGatewayVpcAttachment(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateTransitGatewayVpcAttachmentRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateTransitGatewayVpcAttachmentResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createTransitGatewayVpcAttachment(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateTransitGatewayVpcAttachmentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateTransitGatewayVpcAttachmentResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateTransitGatewayVpcAttachmentResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an EBS volume that can be attached to an instance in the same Availability Zone. The volume is created in the regional endpoint that you send the HTTP request to. For more information see Regions and Endpoints. You can create a new empty volume or restore a volume from an EBS snapshot. Any AWS Marketplace product codes from the snapshot are propagated to the volume. You can create encrypted volumes with the Encrypted parameter. Encrypted volumes may only be attached to instances that support Amazon EBS encryption. Volumes that are created from encrypted snapshots are also automatically encrypted. For more information, see Amazon EBS Encryption in the Amazon Elastic Compute Cloud User Guide. You can tag your volumes during creation. For more information, see Tagging Your Amazon EC2 Resources in the Amazon Elastic Compute Cloud User Guide. For more information, see Creating an Amazon EBS Volume in the Amazon Elastic Compute Cloud User Guide.
    */
  def createVolume(): awsDashSdkLib.libRequestMod.Request[awsDashSdkLib.clientsEc2Mod.EC2Ns.Volume, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createVolume(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.Volume, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[awsDashSdkLib.clientsEc2Mod.EC2Ns.Volume, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an EBS volume that can be attached to an instance in the same Availability Zone. The volume is created in the regional endpoint that you send the HTTP request to. For more information see Regions and Endpoints. You can create a new empty volume or restore a volume from an EBS snapshot. Any AWS Marketplace product codes from the snapshot are propagated to the volume. You can create encrypted volumes with the Encrypted parameter. Encrypted volumes may only be attached to instances that support Amazon EBS encryption. Volumes that are created from encrypted snapshots are also automatically encrypted. For more information, see Amazon EBS Encryption in the Amazon Elastic Compute Cloud User Guide. You can tag your volumes during creation. For more information, see Tagging Your Amazon EC2 Resources in the Amazon Elastic Compute Cloud User Guide. For more information, see Creating an Amazon EBS Volume in the Amazon Elastic Compute Cloud User Guide.
    */
  def createVolume(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVolumeRequest): awsDashSdkLib.libRequestMod.Request[awsDashSdkLib.clientsEc2Mod.EC2Ns.Volume, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createVolume(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVolumeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.Volume, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[awsDashSdkLib.clientsEc2Mod.EC2Ns.Volume, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a VPC with the specified IPv4 CIDR block. The smallest VPC you can create uses a /28 netmask (16 IPv4 addresses), and the largest uses a /16 netmask (65,536 IPv4 addresses). For more information about how large to make your VPC, see Your VPC and Subnets in the Amazon Virtual Private Cloud User Guide. You can optionally request an Amazon-provided IPv6 CIDR block for the VPC. The IPv6 CIDR block uses a /56 prefix length, and is allocated from Amazon's pool of IPv6 addresses. You cannot choose the IPv6 range for your VPC. By default, each instance you launch in the VPC has the default DHCP options, which include only a default DNS server that we provide (AmazonProvidedDNS). For more information, see DHCP Options Sets in the Amazon Virtual Private Cloud User Guide. You can specify the instance tenancy value for the VPC when you create it. You can't change this value for the VPC after you create it. For more information, see Dedicated Instances in the Amazon Elastic Compute Cloud User Guide.
    */
  def createVpc(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpcResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createVpc(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpcResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpcResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a VPC with the specified IPv4 CIDR block. The smallest VPC you can create uses a /28 netmask (16 IPv4 addresses), and the largest uses a /16 netmask (65,536 IPv4 addresses). For more information about how large to make your VPC, see Your VPC and Subnets in the Amazon Virtual Private Cloud User Guide. You can optionally request an Amazon-provided IPv6 CIDR block for the VPC. The IPv6 CIDR block uses a /56 prefix length, and is allocated from Amazon's pool of IPv6 addresses. You cannot choose the IPv6 range for your VPC. By default, each instance you launch in the VPC has the default DHCP options, which include only a default DNS server that we provide (AmazonProvidedDNS). For more information, see DHCP Options Sets in the Amazon Virtual Private Cloud User Guide. You can specify the instance tenancy value for the VPC when you create it. You can't change this value for the VPC after you create it. For more information, see Dedicated Instances in the Amazon Elastic Compute Cloud User Guide.
    */
  def createVpc(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpcRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpcResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createVpc(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpcRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpcResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpcResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a VPC endpoint for a specified service. An endpoint enables you to create a private connection between your VPC and the service. The service may be provided by AWS, an AWS Marketplace partner, or another AWS account. For more information, see VPC Endpoints in the Amazon Virtual Private Cloud User Guide. A gateway endpoint serves as a target for a route in your route table for traffic destined for the AWS service. You can specify an endpoint policy to attach to the endpoint that will control access to the service from your VPC. You can also specify the VPC route tables that use the endpoint. An interface endpoint is a network interface in your subnet that serves as an endpoint for communicating with the specified service. You can specify the subnets in which to create an endpoint, and the security groups to associate with the endpoint network interface. Use DescribeVpcEndpointServices to get a list of supported services.
    */
  def createVpcEndpoint(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpcEndpointResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createVpcEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpcEndpointResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpcEndpointResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a VPC endpoint for a specified service. An endpoint enables you to create a private connection between your VPC and the service. The service may be provided by AWS, an AWS Marketplace partner, or another AWS account. For more information, see VPC Endpoints in the Amazon Virtual Private Cloud User Guide. A gateway endpoint serves as a target for a route in your route table for traffic destined for the AWS service. You can specify an endpoint policy to attach to the endpoint that will control access to the service from your VPC. You can also specify the VPC route tables that use the endpoint. An interface endpoint is a network interface in your subnet that serves as an endpoint for communicating with the specified service. You can specify the subnets in which to create an endpoint, and the security groups to associate with the endpoint network interface. Use DescribeVpcEndpointServices to get a list of supported services.
    */
  def createVpcEndpoint(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpcEndpointRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpcEndpointResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createVpcEndpoint(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpcEndpointRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpcEndpointResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpcEndpointResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a connection notification for a specified VPC endpoint or VPC endpoint service. A connection notification notifies you of specific endpoint events. You must create an SNS topic to receive notifications. For more information, see Create a Topic in the Amazon Simple Notification Service Developer Guide. You can create a connection notification for interface endpoints only.
    */
  def createVpcEndpointConnectionNotification(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpcEndpointConnectionNotificationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createVpcEndpointConnectionNotification(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpcEndpointConnectionNotificationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpcEndpointConnectionNotificationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a connection notification for a specified VPC endpoint or VPC endpoint service. A connection notification notifies you of specific endpoint events. You must create an SNS topic to receive notifications. For more information, see Create a Topic in the Amazon Simple Notification Service Developer Guide. You can create a connection notification for interface endpoints only.
    */
  def createVpcEndpointConnectionNotification(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpcEndpointConnectionNotificationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpcEndpointConnectionNotificationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createVpcEndpointConnectionNotification(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpcEndpointConnectionNotificationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpcEndpointConnectionNotificationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpcEndpointConnectionNotificationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a VPC endpoint service configuration to which service consumers (AWS accounts, IAM users, and IAM roles) can connect. Service consumers can create an interface VPC endpoint to connect to your service. To create an endpoint service configuration, you must first create a Network Load Balancer for your service. For more information, see VPC Endpoint Services in the Amazon Virtual Private Cloud User Guide. 
    */
  def createVpcEndpointServiceConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpcEndpointServiceConfigurationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createVpcEndpointServiceConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpcEndpointServiceConfigurationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpcEndpointServiceConfigurationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a VPC endpoint service configuration to which service consumers (AWS accounts, IAM users, and IAM roles) can connect. Service consumers can create an interface VPC endpoint to connect to your service. To create an endpoint service configuration, you must first create a Network Load Balancer for your service. For more information, see VPC Endpoint Services in the Amazon Virtual Private Cloud User Guide. 
    */
  def createVpcEndpointServiceConfiguration(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpcEndpointServiceConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpcEndpointServiceConfigurationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createVpcEndpointServiceConfiguration(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpcEndpointServiceConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpcEndpointServiceConfigurationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpcEndpointServiceConfigurationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Requests a VPC peering connection between two VPCs: a requester VPC that you own and an accepter VPC with which to create the connection. The accepter VPC can belong to another AWS account and can be in a different Region to the requester VPC. The requester VPC and accepter VPC cannot have overlapping CIDR blocks.  Limitations and rules apply to a VPC peering connection. For more information, see the limitations section in the VPC Peering Guide.  The owner of the accepter VPC must accept the peering request to activate the peering connection. The VPC peering connection request expires after 7 days, after which it cannot be accepted or rejected. If you create a VPC peering connection request between VPCs with overlapping CIDR blocks, the VPC peering connection has a status of failed.
    */
  def createVpcPeeringConnection(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpcPeeringConnectionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createVpcPeeringConnection(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpcPeeringConnectionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpcPeeringConnectionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Requests a VPC peering connection between two VPCs: a requester VPC that you own and an accepter VPC with which to create the connection. The accepter VPC can belong to another AWS account and can be in a different Region to the requester VPC. The requester VPC and accepter VPC cannot have overlapping CIDR blocks.  Limitations and rules apply to a VPC peering connection. For more information, see the limitations section in the VPC Peering Guide.  The owner of the accepter VPC must accept the peering request to activate the peering connection. The VPC peering connection request expires after 7 days, after which it cannot be accepted or rejected. If you create a VPC peering connection request between VPCs with overlapping CIDR blocks, the VPC peering connection has a status of failed.
    */
  def createVpcPeeringConnection(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpcPeeringConnectionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpcPeeringConnectionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createVpcPeeringConnection(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpcPeeringConnectionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpcPeeringConnectionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpcPeeringConnectionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a VPN connection between an existing virtual private gateway and a VPN customer gateway. The only supported connection type is ipsec.1. The response includes information that you need to give to your network administrator to configure your customer gateway.  We strongly recommend that you use HTTPS when calling this operation because the response contains sensitive cryptographic information for configuring your customer gateway.  If you decide to shut down your VPN connection for any reason and later create a new VPN connection, you must reconfigure your customer gateway with the new information returned from this call. This is an idempotent operation. If you perform the operation more than once, Amazon EC2 doesn't return an error. For more information, see AWS Site-to-Site VPN in the AWS Site-to-Site VPN User Guide.
    */
  def createVpnConnection(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpnConnectionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createVpnConnection(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpnConnectionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpnConnectionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a VPN connection between an existing virtual private gateway and a VPN customer gateway. The only supported connection type is ipsec.1. The response includes information that you need to give to your network administrator to configure your customer gateway.  We strongly recommend that you use HTTPS when calling this operation because the response contains sensitive cryptographic information for configuring your customer gateway.  If you decide to shut down your VPN connection for any reason and later create a new VPN connection, you must reconfigure your customer gateway with the new information returned from this call. This is an idempotent operation. If you perform the operation more than once, Amazon EC2 doesn't return an error. For more information, see AWS Site-to-Site VPN in the AWS Site-to-Site VPN User Guide.
    */
  def createVpnConnection(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpnConnectionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpnConnectionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createVpnConnection(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpnConnectionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpnConnectionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpnConnectionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a static route associated with a VPN connection between an existing virtual private gateway and a VPN customer gateway. The static route allows traffic to be routed from the virtual private gateway to the VPN customer gateway. For more information, see AWS Site-to-Site VPN in the AWS Site-to-Site VPN User Guide.
    */
  def createVpnConnectionRoute(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createVpnConnectionRoute(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a static route associated with a VPN connection between an existing virtual private gateway and a VPN customer gateway. The static route allows traffic to be routed from the virtual private gateway to the VPN customer gateway. For more information, see AWS Site-to-Site VPN in the AWS Site-to-Site VPN User Guide.
    */
  def createVpnConnectionRoute(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpnConnectionRouteRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createVpnConnectionRoute(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpnConnectionRouteRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a virtual private gateway. A virtual private gateway is the endpoint on the VPC side of your VPN connection. You can create a virtual private gateway before creating the VPC itself. For more information, see AWS Site-to-Site VPN in the AWS Site-to-Site VPN User Guide.
    */
  def createVpnGateway(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpnGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createVpnGateway(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpnGatewayResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpnGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a virtual private gateway. A virtual private gateway is the endpoint on the VPC side of your VPN connection. You can create a virtual private gateway before creating the VPC itself. For more information, see AWS Site-to-Site VPN in the AWS Site-to-Site VPN User Guide.
    */
  def createVpnGateway(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpnGatewayRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpnGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createVpnGateway(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpnGatewayRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpnGatewayResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.CreateVpnGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified Client VPN endpoint. You must disassociate all target networks before you can delete a Client VPN endpoint.
    */
  def deleteClientVpnEndpoint(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteClientVpnEndpointResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteClientVpnEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteClientVpnEndpointResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteClientVpnEndpointResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified Client VPN endpoint. You must disassociate all target networks before you can delete a Client VPN endpoint.
    */
  def deleteClientVpnEndpoint(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteClientVpnEndpointRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteClientVpnEndpointResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteClientVpnEndpoint(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteClientVpnEndpointRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteClientVpnEndpointResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteClientVpnEndpointResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a route from a Client VPN endpoint. You can only delete routes that you manually added using the CreateClientVpnRoute action. You cannot delete routes that were automatically added when associating a subnet. To remove routes that have been automatically added, disassociate the target subnet from the Client VPN endpoint.
    */
  def deleteClientVpnRoute(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteClientVpnRouteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteClientVpnRoute(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteClientVpnRouteResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteClientVpnRouteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a route from a Client VPN endpoint. You can only delete routes that you manually added using the CreateClientVpnRoute action. You cannot delete routes that were automatically added when associating a subnet. To remove routes that have been automatically added, disassociate the target subnet from the Client VPN endpoint.
    */
  def deleteClientVpnRoute(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteClientVpnRouteRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteClientVpnRouteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteClientVpnRoute(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteClientVpnRouteRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteClientVpnRouteResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteClientVpnRouteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified customer gateway. You must delete the VPN connection before you can delete the customer gateway.
    */
  def deleteCustomerGateway(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteCustomerGateway(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified customer gateway. You must delete the VPN connection before you can delete the customer gateway.
    */
  def deleteCustomerGateway(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteCustomerGatewayRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteCustomerGateway(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteCustomerGatewayRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified set of DHCP options. You must disassociate the set of DHCP options before you can delete it. You can disassociate the set of DHCP options by associating either a new set of options or the default set of options with the VPC.
    */
  def deleteDhcpOptions(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDhcpOptions(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified set of DHCP options. You must disassociate the set of DHCP options before you can delete it. You can disassociate the set of DHCP options by associating either a new set of options or the default set of options with the VPC.
    */
  def deleteDhcpOptions(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteDhcpOptionsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDhcpOptions(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteDhcpOptionsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an egress-only internet gateway.
    */
  def deleteEgressOnlyInternetGateway(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteEgressOnlyInternetGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteEgressOnlyInternetGateway(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteEgressOnlyInternetGatewayResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteEgressOnlyInternetGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an egress-only internet gateway.
    */
  def deleteEgressOnlyInternetGateway(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteEgressOnlyInternetGatewayRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteEgressOnlyInternetGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteEgressOnlyInternetGateway(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteEgressOnlyInternetGatewayRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteEgressOnlyInternetGatewayResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteEgressOnlyInternetGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified EC2 Fleet. After you delete an EC2 Fleet, it launches no new instances. You must specify whether an EC2 Fleet should also terminate its instances. If you terminate the instances, the EC2 Fleet enters the deleted_terminating state. Otherwise, the EC2 Fleet enters the deleted_running state, and the instances continue to run until they are interrupted or you terminate them manually. 
    */
  def deleteFleets(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteFleetsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteFleets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteFleetsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteFleetsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified EC2 Fleet. After you delete an EC2 Fleet, it launches no new instances. You must specify whether an EC2 Fleet should also terminate its instances. If you terminate the instances, the EC2 Fleet enters the deleted_terminating state. Otherwise, the EC2 Fleet enters the deleted_running state, and the instances continue to run until they are interrupted or you terminate them manually. 
    */
  def deleteFleets(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteFleetsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteFleetsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteFleets(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteFleetsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteFleetsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteFleetsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes one or more flow logs.
    */
  def deleteFlowLogs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteFlowLogsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteFlowLogs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteFlowLogsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteFlowLogsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes one or more flow logs.
    */
  def deleteFlowLogs(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteFlowLogsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteFlowLogsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteFlowLogs(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteFlowLogsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteFlowLogsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteFlowLogsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified Amazon FPGA Image (AFI).
    */
  def deleteFpgaImage(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteFpgaImageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteFpgaImage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteFpgaImageResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteFpgaImageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified Amazon FPGA Image (AFI).
    */
  def deleteFpgaImage(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteFpgaImageRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteFpgaImageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteFpgaImage(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteFpgaImageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteFpgaImageResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteFpgaImageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified internet gateway. You must detach the internet gateway from the VPC before you can delete it.
    */
  def deleteInternetGateway(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteInternetGateway(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified internet gateway. You must detach the internet gateway from the VPC before you can delete it.
    */
  def deleteInternetGateway(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteInternetGatewayRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteInternetGateway(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteInternetGatewayRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified key pair, by removing the public key from Amazon EC2.
    */
  def deleteKeyPair(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteKeyPair(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified key pair, by removing the public key from Amazon EC2.
    */
  def deleteKeyPair(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteKeyPairRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteKeyPair(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteKeyPairRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a launch template. Deleting a launch template deletes all of its versions.
    */
  def deleteLaunchTemplate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteLaunchTemplateResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteLaunchTemplate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteLaunchTemplateResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteLaunchTemplateResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a launch template. Deleting a launch template deletes all of its versions.
    */
  def deleteLaunchTemplate(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteLaunchTemplateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteLaunchTemplateResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteLaunchTemplate(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteLaunchTemplateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteLaunchTemplateResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteLaunchTemplateResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes one or more versions of a launch template. You cannot delete the default version of a launch template; you must first assign a different version as the default. If the default version is the only version for the launch template, you must delete the entire launch template using DeleteLaunchTemplate.
    */
  def deleteLaunchTemplateVersions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteLaunchTemplateVersionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteLaunchTemplateVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteLaunchTemplateVersionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteLaunchTemplateVersionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes one or more versions of a launch template. You cannot delete the default version of a launch template; you must first assign a different version as the default. If the default version is the only version for the launch template, you must delete the entire launch template using DeleteLaunchTemplate.
    */
  def deleteLaunchTemplateVersions(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteLaunchTemplateVersionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteLaunchTemplateVersionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteLaunchTemplateVersions(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteLaunchTemplateVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteLaunchTemplateVersionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteLaunchTemplateVersionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified NAT gateway. Deleting a NAT gateway disassociates its Elastic IP address, but does not release the address from your account. Deleting a NAT gateway does not delete any NAT gateway routes in your route tables.
    */
  def deleteNatGateway(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteNatGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteNatGateway(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteNatGatewayResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteNatGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified NAT gateway. Deleting a NAT gateway disassociates its Elastic IP address, but does not release the address from your account. Deleting a NAT gateway does not delete any NAT gateway routes in your route tables.
    */
  def deleteNatGateway(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteNatGatewayRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteNatGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteNatGateway(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteNatGatewayRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteNatGatewayResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteNatGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified network ACL. You can't delete the ACL if it's associated with any subnets. You can't delete the default network ACL.
    */
  def deleteNetworkAcl(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteNetworkAcl(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified network ACL. You can't delete the ACL if it's associated with any subnets. You can't delete the default network ACL.
    */
  def deleteNetworkAcl(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteNetworkAclRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteNetworkAcl(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteNetworkAclRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified ingress or egress entry (rule) from the specified network ACL.
    */
  def deleteNetworkAclEntry(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteNetworkAclEntry(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified ingress or egress entry (rule) from the specified network ACL.
    */
  def deleteNetworkAclEntry(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteNetworkAclEntryRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteNetworkAclEntry(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteNetworkAclEntryRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified network interface. You must detach the network interface before you can delete it.
    */
  def deleteNetworkInterface(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteNetworkInterface(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified network interface. You must detach the network interface before you can delete it.
    */
  def deleteNetworkInterface(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteNetworkInterfaceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteNetworkInterface(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteNetworkInterfaceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a permission for a network interface. By default, you cannot delete the permission if the account for which you're removing the permission has attached the network interface to an instance. However, you can force delete the permission, regardless of any attachment.
    */
  def deleteNetworkInterfacePermission(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteNetworkInterfacePermissionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteNetworkInterfacePermission(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteNetworkInterfacePermissionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteNetworkInterfacePermissionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a permission for a network interface. By default, you cannot delete the permission if the account for which you're removing the permission has attached the network interface to an instance. However, you can force delete the permission, regardless of any attachment.
    */
  def deleteNetworkInterfacePermission(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteNetworkInterfacePermissionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteNetworkInterfacePermissionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteNetworkInterfacePermission(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteNetworkInterfacePermissionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteNetworkInterfacePermissionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteNetworkInterfacePermissionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified placement group. You must terminate all instances in the placement group before you can delete the placement group. For more information, see Placement Groups in the Amazon Elastic Compute Cloud User Guide.
    */
  def deletePlacementGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePlacementGroup(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified placement group. You must terminate all instances in the placement group before you can delete the placement group. For more information, see Placement Groups in the Amazon Elastic Compute Cloud User Guide.
    */
  def deletePlacementGroup(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeletePlacementGroupRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePlacementGroup(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeletePlacementGroupRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified route from the specified route table.
    */
  def deleteRoute(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteRoute(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified route from the specified route table.
    */
  def deleteRoute(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteRouteRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteRoute(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteRouteRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified route table. You must disassociate the route table from any subnets before you can delete it. You can't delete the main route table.
    */
  def deleteRouteTable(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteRouteTable(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified route table. You must disassociate the route table from any subnets before you can delete it. You can't delete the main route table.
    */
  def deleteRouteTable(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteRouteTableRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteRouteTable(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteRouteTableRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a security group. If you attempt to delete a security group that is associated with an instance, or is referenced by another security group, the operation fails with InvalidGroup.InUse in EC2-Classic or DependencyViolation in EC2-VPC.
    */
  def deleteSecurityGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSecurityGroup(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a security group. If you attempt to delete a security group that is associated with an instance, or is referenced by another security group, the operation fails with InvalidGroup.InUse in EC2-Classic or DependencyViolation in EC2-VPC.
    */
  def deleteSecurityGroup(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteSecurityGroupRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSecurityGroup(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteSecurityGroupRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified snapshot. When you make periodic snapshots of a volume, the snapshots are incremental, and only the blocks on the device that have changed since your last snapshot are saved in the new snapshot. When you delete a snapshot, only the data not needed for any other snapshot is removed. So regardless of which prior snapshots have been deleted, all active snapshots will have access to all the information needed to restore the volume. You cannot delete a snapshot of the root device of an EBS volume used by a registered AMI. You must first de-register the AMI before you can delete the snapshot. For more information, see Deleting an Amazon EBS Snapshot in the Amazon Elastic Compute Cloud User Guide.
    */
  def deleteSnapshot(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSnapshot(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified snapshot. When you make periodic snapshots of a volume, the snapshots are incremental, and only the blocks on the device that have changed since your last snapshot are saved in the new snapshot. When you delete a snapshot, only the data not needed for any other snapshot is removed. So regardless of which prior snapshots have been deleted, all active snapshots will have access to all the information needed to restore the volume. You cannot delete a snapshot of the root device of an EBS volume used by a registered AMI. You must first de-register the AMI before you can delete the snapshot. For more information, see Deleting an Amazon EBS Snapshot in the Amazon Elastic Compute Cloud User Guide.
    */
  def deleteSnapshot(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteSnapshotRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSnapshot(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteSnapshotRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the data feed for Spot Instances.
    */
  def deleteSpotDatafeedSubscription(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSpotDatafeedSubscription(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the data feed for Spot Instances.
    */
  def deleteSpotDatafeedSubscription(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteSpotDatafeedSubscriptionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSpotDatafeedSubscription(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteSpotDatafeedSubscriptionRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified subnet. You must terminate all running instances in the subnet before you can delete the subnet.
    */
  def deleteSubnet(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSubnet(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified subnet. You must terminate all running instances in the subnet before you can delete the subnet.
    */
  def deleteSubnet(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteSubnetRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSubnet(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteSubnetRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified set of tags from the specified set of resources. To list the current tags, use DescribeTags. For more information about tags, see Tagging Your Resources in the Amazon Elastic Compute Cloud User Guide.
    */
  def deleteTags(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteTags(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified set of tags from the specified set of resources. To list the current tags, use DescribeTags. For more information about tags, see Tagging Your Resources in the Amazon Elastic Compute Cloud User Guide.
    */
  def deleteTags(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteTagsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteTags(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteTagsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified transit gateway.
    */
  def deleteTransitGateway(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteTransitGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteTransitGateway(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteTransitGatewayResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteTransitGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified transit gateway.
    */
  def deleteTransitGateway(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteTransitGatewayRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteTransitGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteTransitGateway(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteTransitGatewayRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteTransitGatewayResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteTransitGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified route from the specified transit gateway route table.
    */
  def deleteTransitGatewayRoute(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteTransitGatewayRouteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteTransitGatewayRoute(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteTransitGatewayRouteResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteTransitGatewayRouteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified route from the specified transit gateway route table.
    */
  def deleteTransitGatewayRoute(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteTransitGatewayRouteRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteTransitGatewayRouteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteTransitGatewayRoute(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteTransitGatewayRouteRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteTransitGatewayRouteResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteTransitGatewayRouteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified transit gateway route table. You must disassociate the route table from any transit gateway route tables before you can delete it.
    */
  def deleteTransitGatewayRouteTable(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteTransitGatewayRouteTableResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteTransitGatewayRouteTable(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteTransitGatewayRouteTableResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteTransitGatewayRouteTableResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified transit gateway route table. You must disassociate the route table from any transit gateway route tables before you can delete it.
    */
  def deleteTransitGatewayRouteTable(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteTransitGatewayRouteTableRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteTransitGatewayRouteTableResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteTransitGatewayRouteTable(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteTransitGatewayRouteTableRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteTransitGatewayRouteTableResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteTransitGatewayRouteTableResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified VPC attachment.
    */
  def deleteTransitGatewayVpcAttachment(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteTransitGatewayVpcAttachmentResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteTransitGatewayVpcAttachment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteTransitGatewayVpcAttachmentResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteTransitGatewayVpcAttachmentResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified VPC attachment.
    */
  def deleteTransitGatewayVpcAttachment(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteTransitGatewayVpcAttachmentRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteTransitGatewayVpcAttachmentResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteTransitGatewayVpcAttachment(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteTransitGatewayVpcAttachmentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteTransitGatewayVpcAttachmentResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteTransitGatewayVpcAttachmentResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified EBS volume. The volume must be in the available state (not attached to an instance). The volume can remain in the deleting state for several minutes. For more information, see Deleting an Amazon EBS Volume in the Amazon Elastic Compute Cloud User Guide.
    */
  def deleteVolume(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteVolume(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified EBS volume. The volume must be in the available state (not attached to an instance). The volume can remain in the deleting state for several minutes. For more information, see Deleting an Amazon EBS Volume in the Amazon Elastic Compute Cloud User Guide.
    */
  def deleteVolume(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteVolumeRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteVolume(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteVolumeRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified VPC. You must detach or delete all gateways and resources that are associated with the VPC before you can delete it. For example, you must terminate all instances running in the VPC, delete all security groups associated with the VPC (except the default one), delete all route tables associated with the VPC (except the default one), and so on.
    */
  def deleteVpc(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteVpc(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified VPC. You must detach or delete all gateways and resources that are associated with the VPC before you can delete it. For example, you must terminate all instances running in the VPC, delete all security groups associated with the VPC (except the default one), delete all route tables associated with the VPC (except the default one), and so on.
    */
  def deleteVpc(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteVpcRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteVpc(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteVpcRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes one or more VPC endpoint connection notifications.
    */
  def deleteVpcEndpointConnectionNotifications(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteVpcEndpointConnectionNotificationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteVpcEndpointConnectionNotifications(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteVpcEndpointConnectionNotificationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteVpcEndpointConnectionNotificationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes one or more VPC endpoint connection notifications.
    */
  def deleteVpcEndpointConnectionNotifications(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteVpcEndpointConnectionNotificationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteVpcEndpointConnectionNotificationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteVpcEndpointConnectionNotifications(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteVpcEndpointConnectionNotificationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteVpcEndpointConnectionNotificationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteVpcEndpointConnectionNotificationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes one or more VPC endpoint service configurations in your account. Before you delete the endpoint service configuration, you must reject any Available or PendingAcceptance interface endpoint connections that are attached to the service.
    */
  def deleteVpcEndpointServiceConfigurations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteVpcEndpointServiceConfigurationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteVpcEndpointServiceConfigurations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteVpcEndpointServiceConfigurationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteVpcEndpointServiceConfigurationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes one or more VPC endpoint service configurations in your account. Before you delete the endpoint service configuration, you must reject any Available or PendingAcceptance interface endpoint connections that are attached to the service.
    */
  def deleteVpcEndpointServiceConfigurations(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteVpcEndpointServiceConfigurationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteVpcEndpointServiceConfigurationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteVpcEndpointServiceConfigurations(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteVpcEndpointServiceConfigurationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteVpcEndpointServiceConfigurationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteVpcEndpointServiceConfigurationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes one or more specified VPC endpoints. Deleting a gateway endpoint also deletes the endpoint routes in the route tables that were associated with the endpoint. Deleting an interface endpoint deletes the endpoint network interfaces.
    */
  def deleteVpcEndpoints(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteVpcEndpointsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteVpcEndpoints(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteVpcEndpointsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteVpcEndpointsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes one or more specified VPC endpoints. Deleting a gateway endpoint also deletes the endpoint routes in the route tables that were associated with the endpoint. Deleting an interface endpoint deletes the endpoint network interfaces.
    */
  def deleteVpcEndpoints(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteVpcEndpointsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteVpcEndpointsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteVpcEndpoints(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteVpcEndpointsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteVpcEndpointsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteVpcEndpointsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a VPC peering connection. Either the owner of the requester VPC or the owner of the accepter VPC can delete the VPC peering connection if it's in the active state. The owner of the requester VPC can delete a VPC peering connection in the pending-acceptance state. You cannot delete a VPC peering connection that's in the failed state.
    */
  def deleteVpcPeeringConnection(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteVpcPeeringConnectionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteVpcPeeringConnection(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteVpcPeeringConnectionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteVpcPeeringConnectionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a VPC peering connection. Either the owner of the requester VPC or the owner of the accepter VPC can delete the VPC peering connection if it's in the active state. The owner of the requester VPC can delete a VPC peering connection in the pending-acceptance state. You cannot delete a VPC peering connection that's in the failed state.
    */
  def deleteVpcPeeringConnection(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteVpcPeeringConnectionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteVpcPeeringConnectionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteVpcPeeringConnection(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteVpcPeeringConnectionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteVpcPeeringConnectionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteVpcPeeringConnectionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified VPN connection. If you're deleting the VPC and its associated components, we recommend that you detach the virtual private gateway from the VPC and delete the VPC before deleting the VPN connection. If you believe that the tunnel credentials for your VPN connection have been compromised, you can delete the VPN connection and create a new one that has new keys, without needing to delete the VPC or virtual private gateway. If you create a new VPN connection, you must reconfigure the customer gateway using the new configuration information returned with the new VPN connection ID.
    */
  def deleteVpnConnection(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteVpnConnection(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified VPN connection. If you're deleting the VPC and its associated components, we recommend that you detach the virtual private gateway from the VPC and delete the VPC before deleting the VPN connection. If you believe that the tunnel credentials for your VPN connection have been compromised, you can delete the VPN connection and create a new one that has new keys, without needing to delete the VPC or virtual private gateway. If you create a new VPN connection, you must reconfigure the customer gateway using the new configuration information returned with the new VPN connection ID.
    */
  def deleteVpnConnection(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteVpnConnectionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteVpnConnection(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteVpnConnectionRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified static route associated with a VPN connection between an existing virtual private gateway and a VPN customer gateway. The static route allows traffic to be routed from the virtual private gateway to the VPN customer gateway.
    */
  def deleteVpnConnectionRoute(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteVpnConnectionRoute(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified static route associated with a VPN connection between an existing virtual private gateway and a VPN customer gateway. The static route allows traffic to be routed from the virtual private gateway to the VPN customer gateway.
    */
  def deleteVpnConnectionRoute(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteVpnConnectionRouteRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteVpnConnectionRoute(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteVpnConnectionRouteRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified virtual private gateway. We recommend that before you delete a virtual private gateway, you detach it from the VPC and delete the VPN connection. Note that you don't need to delete the virtual private gateway if you plan to delete and recreate the VPN connection between your VPC and your network.
    */
  def deleteVpnGateway(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteVpnGateway(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified virtual private gateway. We recommend that before you delete a virtual private gateway, you detach it from the VPC and delete the VPN connection. Note that you don't need to delete the virtual private gateway if you plan to delete and recreate the VPN connection between your VPC and your network.
    */
  def deleteVpnGateway(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteVpnGatewayRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteVpnGateway(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeleteVpnGatewayRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Releases the specified address range that you provisioned for use with your AWS resources through bring your own IP addresses (BYOIP) and deletes the corresponding address pool. Before you can release an address range, you must stop advertising it using WithdrawByoipCidr and you must not have any IP addresses allocated from its address range.
    */
  def deprovisionByoipCidr(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeprovisionByoipCidrResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deprovisionByoipCidr(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DeprovisionByoipCidrResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeprovisionByoipCidrResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Releases the specified address range that you provisioned for use with your AWS resources through bring your own IP addresses (BYOIP) and deletes the corresponding address pool. Before you can release an address range, you must stop advertising it using WithdrawByoipCidr and you must not have any IP addresses allocated from its address range.
    */
  def deprovisionByoipCidr(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeprovisionByoipCidrRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeprovisionByoipCidrResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deprovisionByoipCidr(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeprovisionByoipCidrRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DeprovisionByoipCidrResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DeprovisionByoipCidrResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deregisters the specified AMI. After you deregister an AMI, it can't be used to launch new instances; however, it doesn't affect any instances that you've already launched from the AMI. You'll continue to incur usage costs for those instances until you terminate them. When you deregister an Amazon EBS-backed AMI, it doesn't affect the snapshot that was created for the root volume of the instance during the AMI creation process. When you deregister an instance store-backed AMI, it doesn't affect the files that you uploaded to Amazon S3 when you created the AMI.
    */
  def deregisterImage(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deregisterImage(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deregisters the specified AMI. After you deregister an AMI, it can't be used to launch new instances; however, it doesn't affect any instances that you've already launched from the AMI. You'll continue to incur usage costs for those instances until you terminate them. When you deregister an Amazon EBS-backed AMI, it doesn't affect the snapshot that was created for the root volume of the instance during the AMI creation process. When you deregister an instance store-backed AMI, it doesn't affect the files that you uploaded to Amazon S3 when you created the AMI.
    */
  def deregisterImage(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeregisterImageRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deregisterImage(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DeregisterImageRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes attributes of your AWS account. The following are the supported account attributes:    supported-platforms: Indicates whether your account can launch instances into EC2-Classic and EC2-VPC, or only into EC2-VPC.    default-vpc: The ID of the default VPC for your account, or none.    max-instances: The maximum number of On-Demand Instances that you can run.    vpc-max-security-groups-per-interface: The maximum number of security groups that you can assign to a network interface.    max-elastic-ips: The maximum number of Elastic IP addresses that you can allocate for use with EC2-Classic.     vpc-max-elastic-ips: The maximum number of Elastic IP addresses that you can allocate for use with EC2-VPC.  
    */
  def describeAccountAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeAccountAttributesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeAccountAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeAccountAttributesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeAccountAttributesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes attributes of your AWS account. The following are the supported account attributes:    supported-platforms: Indicates whether your account can launch instances into EC2-Classic and EC2-VPC, or only into EC2-VPC.    default-vpc: The ID of the default VPC for your account, or none.    max-instances: The maximum number of On-Demand Instances that you can run.    vpc-max-security-groups-per-interface: The maximum number of security groups that you can assign to a network interface.    max-elastic-ips: The maximum number of Elastic IP addresses that you can allocate for use with EC2-Classic.     vpc-max-elastic-ips: The maximum number of Elastic IP addresses that you can allocate for use with EC2-VPC.  
    */
  def describeAccountAttributes(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeAccountAttributesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeAccountAttributesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeAccountAttributes(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeAccountAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeAccountAttributesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeAccountAttributesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your Elastic IP addresses. An Elastic IP address is for use in either the EC2-Classic platform or in a VPC. For more information, see Elastic IP Addresses in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeAddresses(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeAddressesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeAddresses(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeAddressesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeAddressesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your Elastic IP addresses. An Elastic IP address is for use in either the EC2-Classic platform or in a VPC. For more information, see Elastic IP Addresses in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeAddresses(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeAddressesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeAddressesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeAddresses(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeAddressesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeAddressesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeAddressesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the longer ID format settings for all resource types in a specific region. This request is useful for performing a quick audit to determine whether a specific region is fully opted in for longer IDs (17-character IDs). This request only returns information about resource types that support longer IDs. The following resource types support longer IDs: bundle | conversion-task | customer-gateway | dhcp-options | elastic-ip-allocation | elastic-ip-association | export-task | flow-log | image | import-task | instance | internet-gateway | network-acl | network-acl-association | network-interface | network-interface-attachment | prefix-list | reservation | route-table | route-table-association | security-group | snapshot | subnet | subnet-cidr-block-association | volume | vpc | vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection | vpn-connection | vpn-gateway.
    */
  def describeAggregateIdFormat(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeAggregateIdFormatResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeAggregateIdFormat(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeAggregateIdFormatResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeAggregateIdFormatResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the longer ID format settings for all resource types in a specific region. This request is useful for performing a quick audit to determine whether a specific region is fully opted in for longer IDs (17-character IDs). This request only returns information about resource types that support longer IDs. The following resource types support longer IDs: bundle | conversion-task | customer-gateway | dhcp-options | elastic-ip-allocation | elastic-ip-association | export-task | flow-log | image | import-task | instance | internet-gateway | network-acl | network-acl-association | network-interface | network-interface-attachment | prefix-list | reservation | route-table | route-table-association | security-group | snapshot | subnet | subnet-cidr-block-association | volume | vpc | vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection | vpn-connection | vpn-gateway.
    */
  def describeAggregateIdFormat(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeAggregateIdFormatRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeAggregateIdFormatResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeAggregateIdFormat(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeAggregateIdFormatRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeAggregateIdFormatResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeAggregateIdFormatResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of the Availability Zones that are available to you. The results include zones only for the region you're currently using. If there is an event impacting an Availability Zone, you can use this request to view the state and any provided message for that Availability Zone. For more information, see Regions and Availability Zones in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeAvailabilityZones(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeAvailabilityZonesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeAvailabilityZones(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeAvailabilityZonesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeAvailabilityZonesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of the Availability Zones that are available to you. The results include zones only for the region you're currently using. If there is an event impacting an Availability Zone, you can use this request to view the state and any provided message for that Availability Zone. For more information, see Regions and Availability Zones in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeAvailabilityZones(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeAvailabilityZonesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeAvailabilityZonesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeAvailabilityZones(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeAvailabilityZonesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeAvailabilityZonesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeAvailabilityZonesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your bundling tasks.  Completed bundle tasks are listed for only a limited time. If your bundle task is no longer in the list, you can still register an AMI from it. Just use RegisterImage with the Amazon S3 bucket name and image manifest name you provided to the bundle task. 
    */
  def describeBundleTasks(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeBundleTasksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeBundleTasks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeBundleTasksResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeBundleTasksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your bundling tasks.  Completed bundle tasks are listed for only a limited time. If your bundle task is no longer in the list, you can still register an AMI from it. Just use RegisterImage with the Amazon S3 bucket name and image manifest name you provided to the bundle task. 
    */
  def describeBundleTasks(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeBundleTasksRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeBundleTasksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeBundleTasks(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeBundleTasksRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeBundleTasksResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeBundleTasksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the IP address ranges that were specified in calls to ProvisionByoipCidr. To describe the address pools that were created when you provisioned the address ranges, use DescribePublicIpv4Pools.
    */
  def describeByoipCidrs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeByoipCidrsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeByoipCidrs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeByoipCidrsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeByoipCidrsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the IP address ranges that were specified in calls to ProvisionByoipCidr. To describe the address pools that were created when you provisioned the address ranges, use DescribePublicIpv4Pools.
    */
  def describeByoipCidrs(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeByoipCidrsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeByoipCidrsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeByoipCidrs(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeByoipCidrsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeByoipCidrsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeByoipCidrsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your Capacity Reservations. The results describe only the Capacity Reservations in the AWS Region that you're currently using.
    */
  def describeCapacityReservations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeCapacityReservationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeCapacityReservations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeCapacityReservationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeCapacityReservationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your Capacity Reservations. The results describe only the Capacity Reservations in the AWS Region that you're currently using.
    */
  def describeCapacityReservations(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeCapacityReservationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeCapacityReservationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeCapacityReservations(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeCapacityReservationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeCapacityReservationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeCapacityReservationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your linked EC2-Classic instances. This request only returns information about EC2-Classic instances linked to a VPC through ClassicLink. You cannot use this request to return information about other instances.
    */
  def describeClassicLinkInstances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClassicLinkInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeClassicLinkInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClassicLinkInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClassicLinkInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your linked EC2-Classic instances. This request only returns information about EC2-Classic instances linked to a VPC through ClassicLink. You cannot use this request to return information about other instances.
    */
  def describeClassicLinkInstances(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClassicLinkInstancesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClassicLinkInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeClassicLinkInstances(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClassicLinkInstancesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClassicLinkInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClassicLinkInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the authorization rules for a specified Client VPN endpoint.
    */
  def describeClientVpnAuthorizationRules(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClientVpnAuthorizationRulesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeClientVpnAuthorizationRules(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClientVpnAuthorizationRulesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClientVpnAuthorizationRulesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the authorization rules for a specified Client VPN endpoint.
    */
  def describeClientVpnAuthorizationRules(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClientVpnAuthorizationRulesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClientVpnAuthorizationRulesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeClientVpnAuthorizationRules(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClientVpnAuthorizationRulesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClientVpnAuthorizationRulesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClientVpnAuthorizationRulesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes active client connections and connections that have been terminated within the last 60 minutes for the specified Client VPN endpoint.
    */
  def describeClientVpnConnections(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClientVpnConnectionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeClientVpnConnections(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClientVpnConnectionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClientVpnConnectionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes active client connections and connections that have been terminated within the last 60 minutes for the specified Client VPN endpoint.
    */
  def describeClientVpnConnections(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClientVpnConnectionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClientVpnConnectionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeClientVpnConnections(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClientVpnConnectionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClientVpnConnectionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClientVpnConnectionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more Client VPN endpoints in the account.
    */
  def describeClientVpnEndpoints(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClientVpnEndpointsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeClientVpnEndpoints(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClientVpnEndpointsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClientVpnEndpointsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more Client VPN endpoints in the account.
    */
  def describeClientVpnEndpoints(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClientVpnEndpointsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClientVpnEndpointsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeClientVpnEndpoints(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClientVpnEndpointsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClientVpnEndpointsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClientVpnEndpointsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the routes for the specified Client VPN endpoint.
    */
  def describeClientVpnRoutes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClientVpnRoutesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeClientVpnRoutes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClientVpnRoutesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClientVpnRoutesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the routes for the specified Client VPN endpoint.
    */
  def describeClientVpnRoutes(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClientVpnRoutesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClientVpnRoutesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeClientVpnRoutes(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClientVpnRoutesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClientVpnRoutesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClientVpnRoutesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the target networks associated with the specified Client VPN endpoint.
    */
  def describeClientVpnTargetNetworks(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClientVpnTargetNetworksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeClientVpnTargetNetworks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClientVpnTargetNetworksResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClientVpnTargetNetworksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the target networks associated with the specified Client VPN endpoint.
    */
  def describeClientVpnTargetNetworks(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClientVpnTargetNetworksRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClientVpnTargetNetworksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeClientVpnTargetNetworks(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClientVpnTargetNetworksRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClientVpnTargetNetworksResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeClientVpnTargetNetworksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your conversion tasks. For more information, see the VM Import/Export User Guide. For information about the import manifest referenced by this API action, see VM Import Manifest.
    */
  def describeConversionTasks(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeConversionTasksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeConversionTasks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeConversionTasksResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeConversionTasksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your conversion tasks. For more information, see the VM Import/Export User Guide. For information about the import manifest referenced by this API action, see VM Import Manifest.
    */
  def describeConversionTasks(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeConversionTasksRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeConversionTasksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeConversionTasks(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeConversionTasksRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeConversionTasksResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeConversionTasksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your VPN customer gateways. For more information, see AWS Site-to-Site VPN in the AWS Site-to-Site VPN User Guide.
    */
  def describeCustomerGateways(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeCustomerGatewaysResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeCustomerGateways(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeCustomerGatewaysResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeCustomerGatewaysResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your VPN customer gateways. For more information, see AWS Site-to-Site VPN in the AWS Site-to-Site VPN User Guide.
    */
  def describeCustomerGateways(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeCustomerGatewaysRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeCustomerGatewaysResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeCustomerGateways(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeCustomerGatewaysRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeCustomerGatewaysResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeCustomerGatewaysResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your DHCP options sets. For more information, see DHCP Options Sets in the Amazon Virtual Private Cloud User Guide.
    */
  def describeDhcpOptions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeDhcpOptionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDhcpOptions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeDhcpOptionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeDhcpOptionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your DHCP options sets. For more information, see DHCP Options Sets in the Amazon Virtual Private Cloud User Guide.
    */
  def describeDhcpOptions(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeDhcpOptionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeDhcpOptionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDhcpOptions(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeDhcpOptionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeDhcpOptionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeDhcpOptionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your egress-only internet gateways.
    */
  def describeEgressOnlyInternetGateways(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeEgressOnlyInternetGatewaysResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEgressOnlyInternetGateways(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeEgressOnlyInternetGatewaysResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeEgressOnlyInternetGatewaysResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your egress-only internet gateways.
    */
  def describeEgressOnlyInternetGateways(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeEgressOnlyInternetGatewaysRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeEgressOnlyInternetGatewaysResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEgressOnlyInternetGateways(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeEgressOnlyInternetGatewaysRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeEgressOnlyInternetGatewaysResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeEgressOnlyInternetGatewaysResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the Elastic Graphics accelerator associated with your instances. For more information about Elastic Graphics, see Amazon Elastic Graphics.
    */
  def describeElasticGpus(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeElasticGpusResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeElasticGpus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeElasticGpusResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeElasticGpusResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the Elastic Graphics accelerator associated with your instances. For more information about Elastic Graphics, see Amazon Elastic Graphics.
    */
  def describeElasticGpus(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeElasticGpusRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeElasticGpusResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeElasticGpus(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeElasticGpusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeElasticGpusResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeElasticGpusResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your export tasks.
    */
  def describeExportTasks(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeExportTasksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeExportTasks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeExportTasksResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeExportTasksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your export tasks.
    */
  def describeExportTasks(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeExportTasksRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeExportTasksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeExportTasks(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeExportTasksRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeExportTasksResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeExportTasksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the events for the specified EC2 Fleet during the specified time.
    */
  def describeFleetHistory(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFleetHistoryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeFleetHistory(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFleetHistoryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFleetHistoryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the events for the specified EC2 Fleet during the specified time.
    */
  def describeFleetHistory(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFleetHistoryRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFleetHistoryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeFleetHistory(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFleetHistoryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFleetHistoryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFleetHistoryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the running instances for the specified EC2 Fleet.
    */
  def describeFleetInstances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFleetInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeFleetInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFleetInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFleetInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the running instances for the specified EC2 Fleet.
    */
  def describeFleetInstances(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFleetInstancesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFleetInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeFleetInstances(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFleetInstancesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFleetInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFleetInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your EC2 Fleets.
    */
  def describeFleets(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFleetsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeFleets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFleetsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFleetsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your EC2 Fleets.
    */
  def describeFleets(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFleetsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFleetsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeFleets(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFleetsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFleetsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFleetsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more flow logs. To view the information in your flow logs (the log streams for the network interfaces), you must use the CloudWatch Logs console or the CloudWatch Logs API.
    */
  def describeFlowLogs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFlowLogsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeFlowLogs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFlowLogsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFlowLogsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more flow logs. To view the information in your flow logs (the log streams for the network interfaces), you must use the CloudWatch Logs console or the CloudWatch Logs API.
    */
  def describeFlowLogs(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFlowLogsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFlowLogsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeFlowLogs(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFlowLogsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFlowLogsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFlowLogsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the specified attribute of the specified Amazon FPGA Image (AFI).
    */
  def describeFpgaImageAttribute(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFpgaImageAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeFpgaImageAttribute(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFpgaImageAttributeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFpgaImageAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the specified attribute of the specified Amazon FPGA Image (AFI).
    */
  def describeFpgaImageAttribute(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFpgaImageAttributeRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFpgaImageAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeFpgaImageAttribute(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFpgaImageAttributeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFpgaImageAttributeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFpgaImageAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more available Amazon FPGA Images (AFIs). These include public AFIs, private AFIs that you own, and AFIs owned by other AWS accounts for which you have load permissions.
    */
  def describeFpgaImages(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFpgaImagesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeFpgaImages(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFpgaImagesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFpgaImagesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more available Amazon FPGA Images (AFIs). These include public AFIs, private AFIs that you own, and AFIs owned by other AWS accounts for which you have load permissions.
    */
  def describeFpgaImages(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFpgaImagesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFpgaImagesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeFpgaImages(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFpgaImagesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFpgaImagesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeFpgaImagesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the Dedicated Host reservations that are available to purchase. The results describe all the Dedicated Host reservation offerings, including offerings that may not match the instance family and Region of your Dedicated Hosts. When purchasing an offering, ensure that the instance family and Region of the offering matches that of the Dedicated Hosts with which it is to be associated. For more information about supported instance types, see Dedicated Hosts Overview in the Amazon Elastic Compute Cloud User Guide. 
    */
  def describeHostReservationOfferings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeHostReservationOfferingsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeHostReservationOfferings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeHostReservationOfferingsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeHostReservationOfferingsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the Dedicated Host reservations that are available to purchase. The results describe all the Dedicated Host reservation offerings, including offerings that may not match the instance family and Region of your Dedicated Hosts. When purchasing an offering, ensure that the instance family and Region of the offering matches that of the Dedicated Hosts with which it is to be associated. For more information about supported instance types, see Dedicated Hosts Overview in the Amazon Elastic Compute Cloud User Guide. 
    */
  def describeHostReservationOfferings(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeHostReservationOfferingsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeHostReservationOfferingsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeHostReservationOfferings(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeHostReservationOfferingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeHostReservationOfferingsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeHostReservationOfferingsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes reservations that are associated with Dedicated Hosts in your account.
    */
  def describeHostReservations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeHostReservationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeHostReservations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeHostReservationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeHostReservationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes reservations that are associated with Dedicated Hosts in your account.
    */
  def describeHostReservations(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeHostReservationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeHostReservationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeHostReservations(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeHostReservationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeHostReservationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeHostReservationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your Dedicated Hosts. The results describe only the Dedicated Hosts in the Region you're currently using. All listed instances consume capacity on your Dedicated Host. Dedicated Hosts that have recently been released are listed with the state released.
    */
  def describeHosts(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeHostsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeHosts(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeHostsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeHostsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your Dedicated Hosts. The results describe only the Dedicated Hosts in the Region you're currently using. All listed instances consume capacity on your Dedicated Host. Dedicated Hosts that have recently been released are listed with the state released.
    */
  def describeHosts(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeHostsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeHostsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeHosts(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeHostsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeHostsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeHostsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes your IAM instance profile associations.
    */
  def describeIamInstanceProfileAssociations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeIamInstanceProfileAssociationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeIamInstanceProfileAssociations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeIamInstanceProfileAssociationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeIamInstanceProfileAssociationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes your IAM instance profile associations.
    */
  def describeIamInstanceProfileAssociations(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeIamInstanceProfileAssociationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeIamInstanceProfileAssociationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeIamInstanceProfileAssociations(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeIamInstanceProfileAssociationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeIamInstanceProfileAssociationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeIamInstanceProfileAssociationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the ID format settings for your resources on a per-region basis, for example, to view which resource types are enabled for longer IDs. This request only returns information about resource types whose ID formats can be modified; it does not return information about other resource types. The following resource types support longer IDs: bundle | conversion-task | customer-gateway | dhcp-options | elastic-ip-allocation | elastic-ip-association | export-task | flow-log | image | import-task | instance | internet-gateway | network-acl | network-acl-association | network-interface | network-interface-attachment | prefix-list | reservation | route-table | route-table-association | security-group | snapshot | subnet | subnet-cidr-block-association | volume | vpc | vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection | vpn-connection | vpn-gateway.  These settings apply to the IAM user who makes the request; they do not apply to the entire AWS account. By default, an IAM user defaults to the same settings as the root user, unless they explicitly override the settings by running the ModifyIdFormat command. Resources created with longer IDs are visible to all IAM users, regardless of these settings and provided that they have permission to use the relevant Describe command for the resource type.
    */
  def describeIdFormat(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeIdFormatResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeIdFormat(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeIdFormatResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeIdFormatResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the ID format settings for your resources on a per-region basis, for example, to view which resource types are enabled for longer IDs. This request only returns information about resource types whose ID formats can be modified; it does not return information about other resource types. The following resource types support longer IDs: bundle | conversion-task | customer-gateway | dhcp-options | elastic-ip-allocation | elastic-ip-association | export-task | flow-log | image | import-task | instance | internet-gateway | network-acl | network-acl-association | network-interface | network-interface-attachment | prefix-list | reservation | route-table | route-table-association | security-group | snapshot | subnet | subnet-cidr-block-association | volume | vpc | vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection | vpn-connection | vpn-gateway.  These settings apply to the IAM user who makes the request; they do not apply to the entire AWS account. By default, an IAM user defaults to the same settings as the root user, unless they explicitly override the settings by running the ModifyIdFormat command. Resources created with longer IDs are visible to all IAM users, regardless of these settings and provided that they have permission to use the relevant Describe command for the resource type.
    */
  def describeIdFormat(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeIdFormatRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeIdFormatResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeIdFormat(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeIdFormatRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeIdFormatResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeIdFormatResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the ID format settings for resources for the specified IAM user, IAM role, or root user. For example, you can view the resource types that are enabled for longer IDs. This request only returns information about resource types whose ID formats can be modified; it does not return information about other resource types. For more information, see Resource IDs in the Amazon Elastic Compute Cloud User Guide.  The following resource types support longer IDs: bundle | conversion-task | customer-gateway | dhcp-options | elastic-ip-allocation | elastic-ip-association | export-task | flow-log | image | import-task | instance | internet-gateway | network-acl | network-acl-association | network-interface | network-interface-attachment | prefix-list | reservation | route-table | route-table-association | security-group | snapshot | subnet | subnet-cidr-block-association | volume | vpc | vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection | vpn-connection | vpn-gateway.  These settings apply to the principal specified in the request. They do not apply to the principal that makes the request.
    */
  def describeIdentityIdFormat(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeIdentityIdFormatResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeIdentityIdFormat(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeIdentityIdFormatResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeIdentityIdFormatResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the ID format settings for resources for the specified IAM user, IAM role, or root user. For example, you can view the resource types that are enabled for longer IDs. This request only returns information about resource types whose ID formats can be modified; it does not return information about other resource types. For more information, see Resource IDs in the Amazon Elastic Compute Cloud User Guide.  The following resource types support longer IDs: bundle | conversion-task | customer-gateway | dhcp-options | elastic-ip-allocation | elastic-ip-association | export-task | flow-log | image | import-task | instance | internet-gateway | network-acl | network-acl-association | network-interface | network-interface-attachment | prefix-list | reservation | route-table | route-table-association | security-group | snapshot | subnet | subnet-cidr-block-association | volume | vpc | vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection | vpn-connection | vpn-gateway.  These settings apply to the principal specified in the request. They do not apply to the principal that makes the request.
    */
  def describeIdentityIdFormat(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeIdentityIdFormatRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeIdentityIdFormatResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeIdentityIdFormat(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeIdentityIdFormatRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeIdentityIdFormatResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeIdentityIdFormatResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the specified attribute of the specified AMI. You can specify only one attribute at a time.
    */
  def describeImageAttribute(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ImageAttribute, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeImageAttribute(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ImageAttribute, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ImageAttribute, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the specified attribute of the specified AMI. You can specify only one attribute at a time.
    */
  def describeImageAttribute(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeImageAttributeRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ImageAttribute, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeImageAttribute(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeImageAttributeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ImageAttribute, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ImageAttribute, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of the images (AMIs, AKIs, and ARIs) available to you. Images available to you include public images, private images that you own, and private images owned by other AWS accounts but for which you have explicit launch permissions.  Deregistered images are included in the returned results for an unspecified interval after deregistration. 
    */
  def describeImages(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeImagesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeImages(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeImagesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeImagesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of the images (AMIs, AKIs, and ARIs) available to you. Images available to you include public images, private images that you own, and private images owned by other AWS accounts but for which you have explicit launch permissions.  Deregistered images are included in the returned results for an unspecified interval after deregistration. 
    */
  def describeImages(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeImagesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeImagesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeImages(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeImagesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeImagesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeImagesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Displays details about an import virtual machine or import snapshot tasks that are already created.
    */
  def describeImportImageTasks(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeImportImageTasksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeImportImageTasks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeImportImageTasksResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeImportImageTasksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Displays details about an import virtual machine or import snapshot tasks that are already created.
    */
  def describeImportImageTasks(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeImportImageTasksRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeImportImageTasksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeImportImageTasks(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeImportImageTasksRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeImportImageTasksResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeImportImageTasksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes your import snapshot tasks.
    */
  def describeImportSnapshotTasks(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeImportSnapshotTasksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeImportSnapshotTasks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeImportSnapshotTasksResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeImportSnapshotTasksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes your import snapshot tasks.
    */
  def describeImportSnapshotTasks(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeImportSnapshotTasksRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeImportSnapshotTasksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeImportSnapshotTasks(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeImportSnapshotTasksRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeImportSnapshotTasksResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeImportSnapshotTasksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the specified attribute of the specified instance. You can specify only one attribute at a time. Valid attribute values are: instanceType | kernel | ramdisk | userData | disableApiTermination | instanceInitiatedShutdownBehavior | rootDeviceName | blockDeviceMapping | productCodes | sourceDestCheck | groupSet | ebsOptimized | sriovNetSupport 
    */
  def describeInstanceAttribute(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.InstanceAttribute, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeInstanceAttribute(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.InstanceAttribute, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.InstanceAttribute, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the specified attribute of the specified instance. You can specify only one attribute at a time. Valid attribute values are: instanceType | kernel | ramdisk | userData | disableApiTermination | instanceInitiatedShutdownBehavior | rootDeviceName | blockDeviceMapping | productCodes | sourceDestCheck | groupSet | ebsOptimized | sriovNetSupport 
    */
  def describeInstanceAttribute(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstanceAttributeRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.InstanceAttribute, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeInstanceAttribute(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstanceAttributeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.InstanceAttribute, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.InstanceAttribute, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the credit option for CPU usage of one or more of your T2 or T3 instances. The credit options are standard and unlimited. If you do not specify an instance ID, Amazon EC2 returns T2 and T3 instances with the unlimited credit option, as well as instances that were previously configured as T2 or T3 with the unlimited credit option. For example, if you resize a T2 instance, while it is configured as unlimited, to an M4 instance, Amazon EC2 returns the M4 instance. If you specify one or more instance IDs, Amazon EC2 returns the credit option (standard or unlimited) of those instances. If you specify an instance ID that is not valid, such as an instance that is not a T2 or T3 instance, an error is returned. Recently terminated instances might appear in the returned results. This interval is usually less than one hour. If an Availability Zone is experiencing a service disruption and you specify instance IDs in the affected zone, or do not specify any instance IDs at all, the call fails. If you specify only instance IDs in an unaffected zone, the call works normally. For more information, see Burstable Performance Instances in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeInstanceCreditSpecifications(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstanceCreditSpecificationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeInstanceCreditSpecifications(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstanceCreditSpecificationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstanceCreditSpecificationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the credit option for CPU usage of one or more of your T2 or T3 instances. The credit options are standard and unlimited. If you do not specify an instance ID, Amazon EC2 returns T2 and T3 instances with the unlimited credit option, as well as instances that were previously configured as T2 or T3 with the unlimited credit option. For example, if you resize a T2 instance, while it is configured as unlimited, to an M4 instance, Amazon EC2 returns the M4 instance. If you specify one or more instance IDs, Amazon EC2 returns the credit option (standard or unlimited) of those instances. If you specify an instance ID that is not valid, such as an instance that is not a T2 or T3 instance, an error is returned. Recently terminated instances might appear in the returned results. This interval is usually less than one hour. If an Availability Zone is experiencing a service disruption and you specify instance IDs in the affected zone, or do not specify any instance IDs at all, the call fails. If you specify only instance IDs in an unaffected zone, the call works normally. For more information, see Burstable Performance Instances in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeInstanceCreditSpecifications(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstanceCreditSpecificationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstanceCreditSpecificationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeInstanceCreditSpecifications(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstanceCreditSpecificationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstanceCreditSpecificationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstanceCreditSpecificationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the status of one or more instances. By default, only running instances are described, unless you specifically indicate to return the status of all instances. Instance status includes the following components:    Status checks - Amazon EC2 performs status checks on running EC2 instances to identify hardware and software issues. For more information, see Status Checks for Your Instances and Troubleshooting Instances with Failed Status Checks in the Amazon Elastic Compute Cloud User Guide.    Scheduled events - Amazon EC2 can schedule events (such as reboot, stop, or terminate) for your instances related to hardware issues, software updates, or system maintenance. For more information, see Scheduled Events for Your Instances in the Amazon Elastic Compute Cloud User Guide.    Instance state - You can manage your instances from the moment you launch them through their termination. For more information, see Instance Lifecycle in the Amazon Elastic Compute Cloud User Guide.  
    */
  def describeInstanceStatus(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstanceStatusResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeInstanceStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstanceStatusResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstanceStatusResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the status of one or more instances. By default, only running instances are described, unless you specifically indicate to return the status of all instances. Instance status includes the following components:    Status checks - Amazon EC2 performs status checks on running EC2 instances to identify hardware and software issues. For more information, see Status Checks for Your Instances and Troubleshooting Instances with Failed Status Checks in the Amazon Elastic Compute Cloud User Guide.    Scheduled events - Amazon EC2 can schedule events (such as reboot, stop, or terminate) for your instances related to hardware issues, software updates, or system maintenance. For more information, see Scheduled Events for Your Instances in the Amazon Elastic Compute Cloud User Guide.    Instance state - You can manage your instances from the moment you launch them through their termination. For more information, see Instance Lifecycle in the Amazon Elastic Compute Cloud User Guide.  
    */
  def describeInstanceStatus(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstanceStatusRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstanceStatusResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeInstanceStatus(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstanceStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstanceStatusResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstanceStatusResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your instances. If you specify one or more instance IDs, Amazon EC2 returns information for those instances. If you do not specify instance IDs, Amazon EC2 returns information for all relevant instances. If you specify an instance ID that is not valid, an error is returned. If you specify an instance that you do not own, it is not included in the returned results. Recently terminated instances might appear in the returned results. This interval is usually less than one hour. If you describe instances in the rare case where an Availability Zone is experiencing a service disruption and you specify instance IDs that are in the affected zone, or do not specify any instance IDs at all, the call fails. If you describe instances and specify only instance IDs that are in an unaffected zone, the call works normally.
    */
  def describeInstances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your instances. If you specify one or more instance IDs, Amazon EC2 returns information for those instances. If you do not specify instance IDs, Amazon EC2 returns information for all relevant instances. If you specify an instance ID that is not valid, an error is returned. If you specify an instance that you do not own, it is not included in the returned results. Recently terminated instances might appear in the returned results. This interval is usually less than one hour. If you describe instances in the rare case where an Availability Zone is experiencing a service disruption and you specify instance IDs that are in the affected zone, or do not specify any instance IDs at all, the call fails. If you describe instances and specify only instance IDs that are in an unaffected zone, the call works normally.
    */
  def describeInstances(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstancesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeInstances(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstancesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your internet gateways.
    */
  def describeInternetGateways(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInternetGatewaysResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeInternetGateways(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInternetGatewaysResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInternetGatewaysResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your internet gateways.
    */
  def describeInternetGateways(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInternetGatewaysRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInternetGatewaysResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeInternetGateways(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInternetGatewaysRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInternetGatewaysResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInternetGatewaysResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your key pairs. For more information about key pairs, see Key Pairs in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeKeyPairs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeKeyPairsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeKeyPairs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeKeyPairsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeKeyPairsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your key pairs. For more information about key pairs, see Key Pairs in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeKeyPairs(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeKeyPairsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeKeyPairsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeKeyPairs(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeKeyPairsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeKeyPairsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeKeyPairsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more versions of a specified launch template. You can describe all versions, individual versions, or a range of versions.
    */
  def describeLaunchTemplateVersions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeLaunchTemplateVersionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeLaunchTemplateVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeLaunchTemplateVersionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeLaunchTemplateVersionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more versions of a specified launch template. You can describe all versions, individual versions, or a range of versions.
    */
  def describeLaunchTemplateVersions(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeLaunchTemplateVersionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeLaunchTemplateVersionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeLaunchTemplateVersions(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeLaunchTemplateVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeLaunchTemplateVersionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeLaunchTemplateVersionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more launch templates.
    */
  def describeLaunchTemplates(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeLaunchTemplatesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeLaunchTemplates(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeLaunchTemplatesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeLaunchTemplatesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more launch templates.
    */
  def describeLaunchTemplates(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeLaunchTemplatesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeLaunchTemplatesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeLaunchTemplates(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeLaunchTemplatesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeLaunchTemplatesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeLaunchTemplatesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes your Elastic IP addresses that are being moved to the EC2-VPC platform, or that are being restored to the EC2-Classic platform. This request does not return information about any other Elastic IP addresses in your account.
    */
  def describeMovingAddresses(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeMovingAddressesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeMovingAddresses(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeMovingAddressesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeMovingAddressesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes your Elastic IP addresses that are being moved to the EC2-VPC platform, or that are being restored to the EC2-Classic platform. This request does not return information about any other Elastic IP addresses in your account.
    */
  def describeMovingAddresses(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeMovingAddressesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeMovingAddressesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeMovingAddresses(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeMovingAddressesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeMovingAddressesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeMovingAddressesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your NAT gateways.
    */
  def describeNatGateways(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNatGatewaysResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeNatGateways(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNatGatewaysResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNatGatewaysResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your NAT gateways.
    */
  def describeNatGateways(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNatGatewaysRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNatGatewaysResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeNatGateways(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNatGatewaysRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNatGatewaysResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNatGatewaysResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your network ACLs. For more information, see Network ACLs in the Amazon Virtual Private Cloud User Guide.
    */
  def describeNetworkAcls(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNetworkAclsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeNetworkAcls(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNetworkAclsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNetworkAclsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your network ACLs. For more information, see Network ACLs in the Amazon Virtual Private Cloud User Guide.
    */
  def describeNetworkAcls(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNetworkAclsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNetworkAclsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeNetworkAcls(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNetworkAclsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNetworkAclsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNetworkAclsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes a network interface attribute. You can specify only one attribute at a time.
    */
  def describeNetworkInterfaceAttribute(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNetworkInterfaceAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeNetworkInterfaceAttribute(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNetworkInterfaceAttributeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNetworkInterfaceAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes a network interface attribute. You can specify only one attribute at a time.
    */
  def describeNetworkInterfaceAttribute(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNetworkInterfaceAttributeRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNetworkInterfaceAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeNetworkInterfaceAttribute(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNetworkInterfaceAttributeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNetworkInterfaceAttributeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNetworkInterfaceAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the permissions for your network interfaces. 
    */
  def describeNetworkInterfacePermissions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNetworkInterfacePermissionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeNetworkInterfacePermissions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNetworkInterfacePermissionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNetworkInterfacePermissionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the permissions for your network interfaces. 
    */
  def describeNetworkInterfacePermissions(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNetworkInterfacePermissionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNetworkInterfacePermissionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeNetworkInterfacePermissions(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNetworkInterfacePermissionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNetworkInterfacePermissionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNetworkInterfacePermissionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your network interfaces.
    */
  def describeNetworkInterfaces(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNetworkInterfacesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeNetworkInterfaces(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNetworkInterfacesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNetworkInterfacesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your network interfaces.
    */
  def describeNetworkInterfaces(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNetworkInterfacesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNetworkInterfacesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeNetworkInterfaces(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNetworkInterfacesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNetworkInterfacesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNetworkInterfacesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your placement groups. For more information, see Placement Groups in the Amazon Elastic Compute Cloud User Guide.
    */
  def describePlacementGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribePlacementGroupsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describePlacementGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribePlacementGroupsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribePlacementGroupsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your placement groups. For more information, see Placement Groups in the Amazon Elastic Compute Cloud User Guide.
    */
  def describePlacementGroups(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribePlacementGroupsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribePlacementGroupsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describePlacementGroups(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribePlacementGroupsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribePlacementGroupsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribePlacementGroupsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes available AWS services in a prefix list format, which includes the prefix list name and prefix list ID of the service and the IP address range for the service. A prefix list ID is required for creating an outbound security group rule that allows traffic from a VPC to access an AWS service through a gateway VPC endpoint. Currently, the services that support this action are Amazon S3 and Amazon DynamoDB.
    */
  def describePrefixLists(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribePrefixListsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describePrefixLists(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribePrefixListsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribePrefixListsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes available AWS services in a prefix list format, which includes the prefix list name and prefix list ID of the service and the IP address range for the service. A prefix list ID is required for creating an outbound security group rule that allows traffic from a VPC to access an AWS service through a gateway VPC endpoint. Currently, the services that support this action are Amazon S3 and Amazon DynamoDB.
    */
  def describePrefixLists(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribePrefixListsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribePrefixListsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describePrefixLists(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribePrefixListsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribePrefixListsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribePrefixListsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the ID format settings for the root user and all IAM roles and IAM users that have explicitly specified a longer ID (17-character ID) preference.  By default, all IAM roles and IAM users default to the same ID settings as the root user, unless they explicitly override the settings. This request is useful for identifying those IAM users and IAM roles that have overridden the default ID settings. The following resource types support longer IDs: bundle | conversion-task | customer-gateway | dhcp-options | elastic-ip-allocation | elastic-ip-association | export-task | flow-log | image | import-task | instance | internet-gateway | network-acl | network-acl-association | network-interface | network-interface-attachment | prefix-list | reservation | route-table | route-table-association | security-group | snapshot | subnet | subnet-cidr-block-association | volume | vpc | vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection | vpn-connection | vpn-gateway. 
    */
  def describePrincipalIdFormat(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribePrincipalIdFormatResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describePrincipalIdFormat(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribePrincipalIdFormatResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribePrincipalIdFormatResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the ID format settings for the root user and all IAM roles and IAM users that have explicitly specified a longer ID (17-character ID) preference.  By default, all IAM roles and IAM users default to the same ID settings as the root user, unless they explicitly override the settings. This request is useful for identifying those IAM users and IAM roles that have overridden the default ID settings. The following resource types support longer IDs: bundle | conversion-task | customer-gateway | dhcp-options | elastic-ip-allocation | elastic-ip-association | export-task | flow-log | image | import-task | instance | internet-gateway | network-acl | network-acl-association | network-interface | network-interface-attachment | prefix-list | reservation | route-table | route-table-association | security-group | snapshot | subnet | subnet-cidr-block-association | volume | vpc | vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection | vpn-connection | vpn-gateway. 
    */
  def describePrincipalIdFormat(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribePrincipalIdFormatRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribePrincipalIdFormatResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describePrincipalIdFormat(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribePrincipalIdFormatRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribePrincipalIdFormatResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribePrincipalIdFormatResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the specified IPv4 address pools.
    */
  def describePublicIpv4Pools(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribePublicIpv4PoolsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describePublicIpv4Pools(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribePublicIpv4PoolsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribePublicIpv4PoolsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the specified IPv4 address pools.
    */
  def describePublicIpv4Pools(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribePublicIpv4PoolsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribePublicIpv4PoolsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describePublicIpv4Pools(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribePublicIpv4PoolsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribePublicIpv4PoolsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribePublicIpv4PoolsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more regions that are currently available to you. For a list of the regions supported by Amazon EC2, see Regions and Endpoints.
    */
  def describeRegions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeRegionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeRegions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeRegionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeRegionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more regions that are currently available to you. For a list of the regions supported by Amazon EC2, see Regions and Endpoints.
    */
  def describeRegions(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeRegionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeRegionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeRegions(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeRegionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeRegionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeRegionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of the Reserved Instances that you purchased. For more information about Reserved Instances, see Reserved Instances in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeReservedInstances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeReservedInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeReservedInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeReservedInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeReservedInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of the Reserved Instances that you purchased. For more information about Reserved Instances, see Reserved Instances in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeReservedInstances(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeReservedInstancesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeReservedInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeReservedInstances(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeReservedInstancesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeReservedInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeReservedInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes your account's Reserved Instance listings in the Reserved Instance Marketplace. The Reserved Instance Marketplace matches sellers who want to resell Reserved Instance capacity that they no longer need with buyers who want to purchase additional capacity. Reserved Instances bought and sold through the Reserved Instance Marketplace work like any other Reserved Instances. As a seller, you choose to list some or all of your Reserved Instances, and you specify the upfront price to receive for them. Your Reserved Instances are then listed in the Reserved Instance Marketplace and are available for purchase. As a buyer, you specify the configuration of the Reserved Instance to purchase, and the Marketplace matches what you're searching for with what's available. The Marketplace first sells the lowest priced Reserved Instances to you, and continues to sell available Reserved Instance listings to you until your demand is met. You are charged based on the total price of all of the listings that you purchase. For more information, see Reserved Instance Marketplace in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeReservedInstancesListings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeReservedInstancesListingsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeReservedInstancesListings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeReservedInstancesListingsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeReservedInstancesListingsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes your account's Reserved Instance listings in the Reserved Instance Marketplace. The Reserved Instance Marketplace matches sellers who want to resell Reserved Instance capacity that they no longer need with buyers who want to purchase additional capacity. Reserved Instances bought and sold through the Reserved Instance Marketplace work like any other Reserved Instances. As a seller, you choose to list some or all of your Reserved Instances, and you specify the upfront price to receive for them. Your Reserved Instances are then listed in the Reserved Instance Marketplace and are available for purchase. As a buyer, you specify the configuration of the Reserved Instance to purchase, and the Marketplace matches what you're searching for with what's available. The Marketplace first sells the lowest priced Reserved Instances to you, and continues to sell available Reserved Instance listings to you until your demand is met. You are charged based on the total price of all of the listings that you purchase. For more information, see Reserved Instance Marketplace in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeReservedInstancesListings(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeReservedInstancesListingsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeReservedInstancesListingsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeReservedInstancesListings(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeReservedInstancesListingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeReservedInstancesListingsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeReservedInstancesListingsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the modifications made to your Reserved Instances. If no parameter is specified, information about all your Reserved Instances modification requests is returned. If a modification ID is specified, only information about the specific modification is returned. For more information, see Modifying Reserved Instances in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeReservedInstancesModifications(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeReservedInstancesModificationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeReservedInstancesModifications(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeReservedInstancesModificationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeReservedInstancesModificationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the modifications made to your Reserved Instances. If no parameter is specified, information about all your Reserved Instances modification requests is returned. If a modification ID is specified, only information about the specific modification is returned. For more information, see Modifying Reserved Instances in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeReservedInstancesModifications(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeReservedInstancesModificationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeReservedInstancesModificationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeReservedInstancesModifications(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeReservedInstancesModificationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeReservedInstancesModificationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeReservedInstancesModificationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes Reserved Instance offerings that are available for purchase. With Reserved Instances, you purchase the right to launch instances for a period of time. During that time period, you do not receive insufficient capacity errors, and you pay a lower usage rate than the rate charged for On-Demand instances for the actual time used. If you have listed your own Reserved Instances for sale in the Reserved Instance Marketplace, they will be excluded from these results. This is to ensure that you do not purchase your own Reserved Instances. For more information, see Reserved Instance Marketplace in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeReservedInstancesOfferings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeReservedInstancesOfferingsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeReservedInstancesOfferings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeReservedInstancesOfferingsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeReservedInstancesOfferingsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes Reserved Instance offerings that are available for purchase. With Reserved Instances, you purchase the right to launch instances for a period of time. During that time period, you do not receive insufficient capacity errors, and you pay a lower usage rate than the rate charged for On-Demand instances for the actual time used. If you have listed your own Reserved Instances for sale in the Reserved Instance Marketplace, they will be excluded from these results. This is to ensure that you do not purchase your own Reserved Instances. For more information, see Reserved Instance Marketplace in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeReservedInstancesOfferings(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeReservedInstancesOfferingsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeReservedInstancesOfferingsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeReservedInstancesOfferings(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeReservedInstancesOfferingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeReservedInstancesOfferingsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeReservedInstancesOfferingsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your route tables. Each subnet in your VPC must be associated with a route table. If a subnet is not explicitly associated with any route table, it is implicitly associated with the main route table. This command does not return the subnet ID for implicit associations. For more information, see Route Tables in the Amazon Virtual Private Cloud User Guide.
    */
  def describeRouteTables(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeRouteTablesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeRouteTables(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeRouteTablesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeRouteTablesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your route tables. Each subnet in your VPC must be associated with a route table. If a subnet is not explicitly associated with any route table, it is implicitly associated with the main route table. This command does not return the subnet ID for implicit associations. For more information, see Route Tables in the Amazon Virtual Private Cloud User Guide.
    */
  def describeRouteTables(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeRouteTablesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeRouteTablesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeRouteTables(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeRouteTablesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeRouteTablesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeRouteTablesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Finds available schedules that meet the specified criteria. You can search for an available schedule no more than 3 months in advance. You must meet the minimum required duration of 1,200 hours per year. For example, the minimum daily schedule is 4 hours, the minimum weekly schedule is 24 hours, and the minimum monthly schedule is 100 hours. After you find a schedule that meets your needs, call PurchaseScheduledInstances to purchase Scheduled Instances with that schedule.
    */
  def describeScheduledInstanceAvailability(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeScheduledInstanceAvailabilityResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeScheduledInstanceAvailability(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeScheduledInstanceAvailabilityResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeScheduledInstanceAvailabilityResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Finds available schedules that meet the specified criteria. You can search for an available schedule no more than 3 months in advance. You must meet the minimum required duration of 1,200 hours per year. For example, the minimum daily schedule is 4 hours, the minimum weekly schedule is 24 hours, and the minimum monthly schedule is 100 hours. After you find a schedule that meets your needs, call PurchaseScheduledInstances to purchase Scheduled Instances with that schedule.
    */
  def describeScheduledInstanceAvailability(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeScheduledInstanceAvailabilityRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeScheduledInstanceAvailabilityResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeScheduledInstanceAvailability(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeScheduledInstanceAvailabilityRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeScheduledInstanceAvailabilityResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeScheduledInstanceAvailabilityResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your Scheduled Instances.
    */
  def describeScheduledInstances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeScheduledInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeScheduledInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeScheduledInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeScheduledInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your Scheduled Instances.
    */
  def describeScheduledInstances(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeScheduledInstancesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeScheduledInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeScheduledInstances(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeScheduledInstancesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeScheduledInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeScheduledInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * [EC2-VPC only] Describes the VPCs on the other side of a VPC peering connection that are referencing the security groups you've specified in this request.
    */
  def describeSecurityGroupReferences(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSecurityGroupReferencesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSecurityGroupReferences(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSecurityGroupReferencesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSecurityGroupReferencesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * [EC2-VPC only] Describes the VPCs on the other side of a VPC peering connection that are referencing the security groups you've specified in this request.
    */
  def describeSecurityGroupReferences(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSecurityGroupReferencesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSecurityGroupReferencesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSecurityGroupReferences(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSecurityGroupReferencesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSecurityGroupReferencesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSecurityGroupReferencesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your security groups. A security group is for use with instances either in the EC2-Classic platform or in a specific VPC. For more information, see Amazon EC2 Security Groups in the Amazon Elastic Compute Cloud User Guide and Security Groups for Your VPC in the Amazon Virtual Private Cloud User Guide.
    */
  def describeSecurityGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSecurityGroupsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSecurityGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSecurityGroupsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSecurityGroupsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your security groups. A security group is for use with instances either in the EC2-Classic platform or in a specific VPC. For more information, see Amazon EC2 Security Groups in the Amazon Elastic Compute Cloud User Guide and Security Groups for Your VPC in the Amazon Virtual Private Cloud User Guide.
    */
  def describeSecurityGroups(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSecurityGroupsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSecurityGroupsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSecurityGroups(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSecurityGroupsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSecurityGroupsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSecurityGroupsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the specified attribute of the specified snapshot. You can specify only one attribute at a time. For more information about EBS snapshots, see Amazon EBS Snapshots in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeSnapshotAttribute(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSnapshotAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSnapshotAttribute(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSnapshotAttributeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSnapshotAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the specified attribute of the specified snapshot. You can specify only one attribute at a time. For more information about EBS snapshots, see Amazon EBS Snapshots in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeSnapshotAttribute(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSnapshotAttributeRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSnapshotAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSnapshotAttribute(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSnapshotAttributeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSnapshotAttributeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSnapshotAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of the EBS snapshots available to you. Available snapshots include public snapshots available for use by any AWS account, private snapshots that you own, and private snapshots owned by another AWS account for which you've been given explicit create volume permissions. The create volume permissions fall into the following categories:    public: The owner of the snapshot granted create volume permissions for the snapshot to the all group. All AWS accounts have create volume permissions for these snapshots.    explicit: The owner of the snapshot granted create volume permissions to a specific AWS account.    implicit: An AWS account has implicit create volume permissions for all snapshots it owns.   The list of snapshots returned can be modified by specifying snapshot IDs, snapshot owners, or AWS accounts with create volume permissions. If no options are specified, Amazon EC2 returns all snapshots for which you have create volume permissions. If you specify one or more snapshot IDs, only snapshots that have the specified IDs are returned. If you specify an invalid snapshot ID, an error is returned. If you specify a snapshot ID for which you do not have access, it is not included in the returned results. If you specify one or more snapshot owners using the OwnerIds option, only snapshots from the specified owners and for which you have access are returned. The results can include the AWS account IDs of the specified owners, amazon for snapshots owned by Amazon, or self for snapshots that you own. If you specify a list of restorable users, only snapshots with create snapshot permissions for those users are returned. You can specify AWS account IDs (if you own the snapshots), self for snapshots for which you own or have explicit permissions, or all for public snapshots. If you are describing a long list of snapshots, you can paginate the output to make the list more manageable. The MaxResults parameter sets the maximum number of results returned in a single page. If the list of results exceeds your MaxResults value, then that number of results is returned along with a NextToken value that can be passed to a subsequent DescribeSnapshots request to retrieve the remaining results. For more information about EBS snapshots, see Amazon EBS Snapshots in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeSnapshots(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSnapshotsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSnapshots(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSnapshotsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSnapshotsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of the EBS snapshots available to you. Available snapshots include public snapshots available for use by any AWS account, private snapshots that you own, and private snapshots owned by another AWS account for which you've been given explicit create volume permissions. The create volume permissions fall into the following categories:    public: The owner of the snapshot granted create volume permissions for the snapshot to the all group. All AWS accounts have create volume permissions for these snapshots.    explicit: The owner of the snapshot granted create volume permissions to a specific AWS account.    implicit: An AWS account has implicit create volume permissions for all snapshots it owns.   The list of snapshots returned can be modified by specifying snapshot IDs, snapshot owners, or AWS accounts with create volume permissions. If no options are specified, Amazon EC2 returns all snapshots for which you have create volume permissions. If you specify one or more snapshot IDs, only snapshots that have the specified IDs are returned. If you specify an invalid snapshot ID, an error is returned. If you specify a snapshot ID for which you do not have access, it is not included in the returned results. If you specify one or more snapshot owners using the OwnerIds option, only snapshots from the specified owners and for which you have access are returned. The results can include the AWS account IDs of the specified owners, amazon for snapshots owned by Amazon, or self for snapshots that you own. If you specify a list of restorable users, only snapshots with create snapshot permissions for those users are returned. You can specify AWS account IDs (if you own the snapshots), self for snapshots for which you own or have explicit permissions, or all for public snapshots. If you are describing a long list of snapshots, you can paginate the output to make the list more manageable. The MaxResults parameter sets the maximum number of results returned in a single page. If the list of results exceeds your MaxResults value, then that number of results is returned along with a NextToken value that can be passed to a subsequent DescribeSnapshots request to retrieve the remaining results. For more information about EBS snapshots, see Amazon EBS Snapshots in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeSnapshots(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSnapshotsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSnapshotsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSnapshots(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSnapshotsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSnapshotsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSnapshotsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the data feed for Spot Instances. For more information, see Spot Instance Data Feed in the Amazon EC2 User Guide for Linux Instances.
    */
  def describeSpotDatafeedSubscription(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotDatafeedSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSpotDatafeedSubscription(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotDatafeedSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotDatafeedSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the data feed for Spot Instances. For more information, see Spot Instance Data Feed in the Amazon EC2 User Guide for Linux Instances.
    */
  def describeSpotDatafeedSubscription(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotDatafeedSubscriptionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotDatafeedSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSpotDatafeedSubscription(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotDatafeedSubscriptionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotDatafeedSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotDatafeedSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the running instances for the specified Spot Fleet.
    */
  def describeSpotFleetInstances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotFleetInstancesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSpotFleetInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotFleetInstancesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotFleetInstancesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the running instances for the specified Spot Fleet.
    */
  def describeSpotFleetInstances(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotFleetInstancesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotFleetInstancesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSpotFleetInstances(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotFleetInstancesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotFleetInstancesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotFleetInstancesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the events for the specified Spot Fleet request during the specified time. Spot Fleet events are delayed by up to 30 seconds before they can be described. This ensures that you can query by the last evaluated time and not miss a recorded event. Spot Fleet events are available for 48 hours.
    */
  def describeSpotFleetRequestHistory(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotFleetRequestHistoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSpotFleetRequestHistory(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotFleetRequestHistoryResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotFleetRequestHistoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the events for the specified Spot Fleet request during the specified time. Spot Fleet events are delayed by up to 30 seconds before they can be described. This ensures that you can query by the last evaluated time and not miss a recorded event. Spot Fleet events are available for 48 hours.
    */
  def describeSpotFleetRequestHistory(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotFleetRequestHistoryRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotFleetRequestHistoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSpotFleetRequestHistory(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotFleetRequestHistoryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotFleetRequestHistoryResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotFleetRequestHistoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes your Spot Fleet requests. Spot Fleet requests are deleted 48 hours after they are canceled and their instances are terminated.
    */
  def describeSpotFleetRequests(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotFleetRequestsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSpotFleetRequests(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotFleetRequestsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotFleetRequestsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes your Spot Fleet requests. Spot Fleet requests are deleted 48 hours after they are canceled and their instances are terminated.
    */
  def describeSpotFleetRequests(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotFleetRequestsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotFleetRequestsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSpotFleetRequests(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotFleetRequestsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotFleetRequestsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotFleetRequestsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the specified Spot Instance requests. You can use DescribeSpotInstanceRequests to find a running Spot Instance by examining the response. If the status of the Spot Instance is fulfilled, the instance ID appears in the response and contains the identifier of the instance. Alternatively, you can use DescribeInstances with a filter to look for instances where the instance lifecycle is spot. We recommend that you set MaxResults to a value between 5 and 1000 to limit the number of results returned. This paginates the output, which makes the list more manageable and returns the results faster. If the list of results exceeds your MaxResults value, then that number of results is returned along with a NextToken value that can be passed to a subsequent DescribeSpotInstanceRequests request to retrieve the remaining results. Spot Instance requests are deleted four hours after they are canceled and their instances are terminated.
    */
  def describeSpotInstanceRequests(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotInstanceRequestsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSpotInstanceRequests(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotInstanceRequestsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotInstanceRequestsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the specified Spot Instance requests. You can use DescribeSpotInstanceRequests to find a running Spot Instance by examining the response. If the status of the Spot Instance is fulfilled, the instance ID appears in the response and contains the identifier of the instance. Alternatively, you can use DescribeInstances with a filter to look for instances where the instance lifecycle is spot. We recommend that you set MaxResults to a value between 5 and 1000 to limit the number of results returned. This paginates the output, which makes the list more manageable and returns the results faster. If the list of results exceeds your MaxResults value, then that number of results is returned along with a NextToken value that can be passed to a subsequent DescribeSpotInstanceRequests request to retrieve the remaining results. Spot Instance requests are deleted four hours after they are canceled and their instances are terminated.
    */
  def describeSpotInstanceRequests(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotInstanceRequestsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotInstanceRequestsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSpotInstanceRequests(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotInstanceRequestsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotInstanceRequestsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotInstanceRequestsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the Spot price history. For more information, see Spot Instance Pricing History in the Amazon EC2 User Guide for Linux Instances. When you specify a start and end time, this operation returns the prices of the instance types within the time range that you specified and the time when the price changed. The price is valid within the time period that you specified; the response merely indicates the last time that the price changed.
    */
  def describeSpotPriceHistory(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotPriceHistoryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSpotPriceHistory(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotPriceHistoryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotPriceHistoryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the Spot price history. For more information, see Spot Instance Pricing History in the Amazon EC2 User Guide for Linux Instances. When you specify a start and end time, this operation returns the prices of the instance types within the time range that you specified and the time when the price changed. The price is valid within the time period that you specified; the response merely indicates the last time that the price changed.
    */
  def describeSpotPriceHistory(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotPriceHistoryRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotPriceHistoryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSpotPriceHistory(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotPriceHistoryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotPriceHistoryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotPriceHistoryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * [EC2-VPC only] Describes the stale security group rules for security groups in a specified VPC. Rules are stale when they reference a deleted security group in a peer VPC, or a security group in a peer VPC for which the VPC peering connection has been deleted.
    */
  def describeStaleSecurityGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeStaleSecurityGroupsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeStaleSecurityGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeStaleSecurityGroupsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeStaleSecurityGroupsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * [EC2-VPC only] Describes the stale security group rules for security groups in a specified VPC. Rules are stale when they reference a deleted security group in a peer VPC, or a security group in a peer VPC for which the VPC peering connection has been deleted.
    */
  def describeStaleSecurityGroups(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeStaleSecurityGroupsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeStaleSecurityGroupsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeStaleSecurityGroups(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeStaleSecurityGroupsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeStaleSecurityGroupsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeStaleSecurityGroupsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your subnets. For more information, see Your VPC and Subnets in the Amazon Virtual Private Cloud User Guide.
    */
  def describeSubnets(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSubnetsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSubnets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSubnetsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSubnetsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your subnets. For more information, see Your VPC and Subnets in the Amazon Virtual Private Cloud User Guide.
    */
  def describeSubnets(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSubnetsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSubnetsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSubnets(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSubnetsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSubnetsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSubnetsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of the tags for your EC2 resources. For more information about tags, see Tagging Your Resources in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeTags(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeTagsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeTagsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeTagsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of the tags for your EC2 resources. For more information about tags, see Tagging Your Resources in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeTags(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeTagsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeTagsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeTags(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeTagsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeTagsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeTagsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more attachments between resources and transit gateways. By default, all attachments are described. Alternatively, you can filter the results by attachment ID, attachment state, resource ID, or resource owner.
    */
  def describeTransitGatewayAttachments(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeTransitGatewayAttachmentsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeTransitGatewayAttachments(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeTransitGatewayAttachmentsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeTransitGatewayAttachmentsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more attachments between resources and transit gateways. By default, all attachments are described. Alternatively, you can filter the results by attachment ID, attachment state, resource ID, or resource owner.
    */
  def describeTransitGatewayAttachments(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeTransitGatewayAttachmentsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeTransitGatewayAttachmentsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeTransitGatewayAttachments(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeTransitGatewayAttachmentsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeTransitGatewayAttachmentsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeTransitGatewayAttachmentsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more transit gateway route tables. By default, all transit gateway route tables are described. Alternatively, you can filter the results.
    */
  def describeTransitGatewayRouteTables(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeTransitGatewayRouteTablesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeTransitGatewayRouteTables(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeTransitGatewayRouteTablesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeTransitGatewayRouteTablesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more transit gateway route tables. By default, all transit gateway route tables are described. Alternatively, you can filter the results.
    */
  def describeTransitGatewayRouteTables(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeTransitGatewayRouteTablesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeTransitGatewayRouteTablesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeTransitGatewayRouteTables(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeTransitGatewayRouteTablesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeTransitGatewayRouteTablesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeTransitGatewayRouteTablesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more VPC attachments. By default, all VPC attachments are described. Alternatively, you can filter the results.
    */
  def describeTransitGatewayVpcAttachments(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeTransitGatewayVpcAttachmentsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeTransitGatewayVpcAttachments(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeTransitGatewayVpcAttachmentsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeTransitGatewayVpcAttachmentsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more VPC attachments. By default, all VPC attachments are described. Alternatively, you can filter the results.
    */
  def describeTransitGatewayVpcAttachments(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeTransitGatewayVpcAttachmentsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeTransitGatewayVpcAttachmentsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeTransitGatewayVpcAttachments(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeTransitGatewayVpcAttachmentsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeTransitGatewayVpcAttachmentsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeTransitGatewayVpcAttachmentsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more transit gateways. By default, all transit gateways are described. Alternatively, you can filter the results.
    */
  def describeTransitGateways(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeTransitGatewaysResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeTransitGateways(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeTransitGatewaysResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeTransitGatewaysResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more transit gateways. By default, all transit gateways are described. Alternatively, you can filter the results.
    */
  def describeTransitGateways(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeTransitGatewaysRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeTransitGatewaysResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeTransitGateways(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeTransitGatewaysRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeTransitGatewaysResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeTransitGatewaysResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the specified attribute of the specified volume. You can specify only one attribute at a time. For more information about EBS volumes, see Amazon EBS Volumes in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeVolumeAttribute(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumeAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeVolumeAttribute(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumeAttributeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumeAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the specified attribute of the specified volume. You can specify only one attribute at a time. For more information about EBS volumes, see Amazon EBS Volumes in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeVolumeAttribute(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumeAttributeRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumeAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeVolumeAttribute(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumeAttributeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumeAttributeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumeAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the status of the specified volumes. Volume status provides the result of the checks performed on your volumes to determine events that can impair the performance of your volumes. The performance of a volume can be affected if an issue occurs on the volume's underlying host. If the volume's underlying host experiences a power outage or system issue, after the system is restored, there could be data inconsistencies on the volume. Volume events notify you if this occurs. Volume actions notify you if any action needs to be taken in response to the event. The DescribeVolumeStatus operation provides the following information about the specified volumes:  Status: Reflects the current status of the volume. The possible values are ok, impaired , warning, or insufficient-data. If all checks pass, the overall status of the volume is ok. If the check fails, the overall status is impaired. If the status is insufficient-data, then the checks may still be taking place on your volume at the time. We recommend that you retry the request. For more information about volume status, see Monitoring the Status of Your Volumes in the Amazon Elastic Compute Cloud User Guide.  Events: Reflect the cause of a volume status and may require you to take action. For example, if your volume returns an impaired status, then the volume event might be potential-data-inconsistency. This means that your volume has been affected by an issue with the underlying host, has all I/O operations disabled, and may have inconsistent data.  Actions: Reflect the actions you may have to take in response to an event. For example, if the status of the volume is impaired and the volume event shows potential-data-inconsistency, then the action shows enable-volume-io. This means that you may want to enable the I/O operations for the volume by calling the EnableVolumeIO action and then check the volume for data consistency. Volume status is based on the volume status checks, and does not reflect the volume state. Therefore, volume status does not indicate volumes in the error state (for example, when a volume is incapable of accepting I/O.)
    */
  def describeVolumeStatus(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumeStatusResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeVolumeStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumeStatusResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumeStatusResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the status of the specified volumes. Volume status provides the result of the checks performed on your volumes to determine events that can impair the performance of your volumes. The performance of a volume can be affected if an issue occurs on the volume's underlying host. If the volume's underlying host experiences a power outage or system issue, after the system is restored, there could be data inconsistencies on the volume. Volume events notify you if this occurs. Volume actions notify you if any action needs to be taken in response to the event. The DescribeVolumeStatus operation provides the following information about the specified volumes:  Status: Reflects the current status of the volume. The possible values are ok, impaired , warning, or insufficient-data. If all checks pass, the overall status of the volume is ok. If the check fails, the overall status is impaired. If the status is insufficient-data, then the checks may still be taking place on your volume at the time. We recommend that you retry the request. For more information about volume status, see Monitoring the Status of Your Volumes in the Amazon Elastic Compute Cloud User Guide.  Events: Reflect the cause of a volume status and may require you to take action. For example, if your volume returns an impaired status, then the volume event might be potential-data-inconsistency. This means that your volume has been affected by an issue with the underlying host, has all I/O operations disabled, and may have inconsistent data.  Actions: Reflect the actions you may have to take in response to an event. For example, if the status of the volume is impaired and the volume event shows potential-data-inconsistency, then the action shows enable-volume-io. This means that you may want to enable the I/O operations for the volume by calling the EnableVolumeIO action and then check the volume for data consistency. Volume status is based on the volume status checks, and does not reflect the volume state. Therefore, volume status does not indicate volumes in the error state (for example, when a volume is incapable of accepting I/O.)
    */
  def describeVolumeStatus(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumeStatusRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumeStatusResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeVolumeStatus(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumeStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumeStatusResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumeStatusResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the specified EBS volumes. If you are describing a long list of volumes, you can paginate the output to make the list more manageable. The MaxResults parameter sets the maximum number of results returned in a single page. If the list of results exceeds your MaxResults value, then that number of results is returned along with a NextToken value that can be passed to a subsequent DescribeVolumes request to retrieve the remaining results. For more information about EBS volumes, see Amazon EBS Volumes in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeVolumes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeVolumes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the specified EBS volumes. If you are describing a long list of volumes, you can paginate the output to make the list more manageable. The MaxResults parameter sets the maximum number of results returned in a single page. If the list of results exceeds your MaxResults value, then that number of results is returned along with a NextToken value that can be passed to a subsequent DescribeVolumes request to retrieve the remaining results. For more information about EBS volumes, see Amazon EBS Volumes in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeVolumes(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeVolumes(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Reports the current modification status of EBS volumes. Current-generation EBS volumes support modification of attributes including type, size, and (for io1 volumes) IOPS provisioning while either attached to or detached from an instance. Following an action from the API or the console to modify a volume, the status of the modification may be modifying, optimizing, completed, or failed. If a volume has never been modified, then certain elements of the returned VolumeModification objects are null.   You can also use CloudWatch Events to check the status of a modification to an EBS volume. For information about CloudWatch Events, see the Amazon CloudWatch Events User Guide. For more information, see Monitoring Volume Modifications" in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeVolumesModifications(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumesModificationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeVolumesModifications(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumesModificationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumesModificationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Reports the current modification status of EBS volumes. Current-generation EBS volumes support modification of attributes including type, size, and (for io1 volumes) IOPS provisioning while either attached to or detached from an instance. Following an action from the API or the console to modify a volume, the status of the modification may be modifying, optimizing, completed, or failed. If a volume has never been modified, then certain elements of the returned VolumeModification objects are null.   You can also use CloudWatch Events to check the status of a modification to an EBS volume. For information about CloudWatch Events, see the Amazon CloudWatch Events User Guide. For more information, see Monitoring Volume Modifications" in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeVolumesModifications(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumesModificationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumesModificationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeVolumesModifications(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumesModificationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumesModificationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumesModificationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the specified attribute of the specified VPC. You can specify only one attribute at a time.
    */
  def describeVpcAttribute(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeVpcAttribute(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcAttributeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the specified attribute of the specified VPC. You can specify only one attribute at a time.
    */
  def describeVpcAttribute(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcAttributeRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeVpcAttribute(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcAttributeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcAttributeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the ClassicLink status of one or more VPCs.
    */
  def describeVpcClassicLink(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcClassicLinkResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeVpcClassicLink(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcClassicLinkResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcClassicLinkResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the ClassicLink status of one or more VPCs.
    */
  def describeVpcClassicLink(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcClassicLinkRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcClassicLinkResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeVpcClassicLink(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcClassicLinkRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcClassicLinkResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcClassicLinkResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the ClassicLink DNS support status of one or more VPCs. If enabled, the DNS hostname of a linked EC2-Classic instance resolves to its private IP address when addressed from an instance in the VPC to which it's linked. Similarly, the DNS hostname of an instance in a VPC resolves to its private IP address when addressed from a linked EC2-Classic instance. For more information, see ClassicLink in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeVpcClassicLinkDnsSupport(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcClassicLinkDnsSupportResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeVpcClassicLinkDnsSupport(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcClassicLinkDnsSupportResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcClassicLinkDnsSupportResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the ClassicLink DNS support status of one or more VPCs. If enabled, the DNS hostname of a linked EC2-Classic instance resolves to its private IP address when addressed from an instance in the VPC to which it's linked. Similarly, the DNS hostname of an instance in a VPC resolves to its private IP address when addressed from a linked EC2-Classic instance. For more information, see ClassicLink in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeVpcClassicLinkDnsSupport(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcClassicLinkDnsSupportRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcClassicLinkDnsSupportResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeVpcClassicLinkDnsSupport(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcClassicLinkDnsSupportRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcClassicLinkDnsSupportResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcClassicLinkDnsSupportResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the connection notifications for VPC endpoints and VPC endpoint services.
    */
  def describeVpcEndpointConnectionNotifications(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointConnectionNotificationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeVpcEndpointConnectionNotifications(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointConnectionNotificationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointConnectionNotificationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the connection notifications for VPC endpoints and VPC endpoint services.
    */
  def describeVpcEndpointConnectionNotifications(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointConnectionNotificationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointConnectionNotificationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeVpcEndpointConnectionNotifications(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointConnectionNotificationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointConnectionNotificationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointConnectionNotificationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the VPC endpoint connections to your VPC endpoint services, including any endpoints that are pending your acceptance.
    */
  def describeVpcEndpointConnections(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointConnectionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeVpcEndpointConnections(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointConnectionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointConnectionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the VPC endpoint connections to your VPC endpoint services, including any endpoints that are pending your acceptance.
    */
  def describeVpcEndpointConnections(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointConnectionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointConnectionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeVpcEndpointConnections(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointConnectionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointConnectionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointConnectionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the VPC endpoint service configurations in your account (your services).
    */
  def describeVpcEndpointServiceConfigurations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointServiceConfigurationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeVpcEndpointServiceConfigurations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointServiceConfigurationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointServiceConfigurationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the VPC endpoint service configurations in your account (your services).
    */
  def describeVpcEndpointServiceConfigurations(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointServiceConfigurationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointServiceConfigurationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeVpcEndpointServiceConfigurations(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointServiceConfigurationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointServiceConfigurationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointServiceConfigurationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the principals (service consumers) that are permitted to discover your VPC endpoint service.
    */
  def describeVpcEndpointServicePermissions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointServicePermissionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeVpcEndpointServicePermissions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointServicePermissionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointServicePermissionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the principals (service consumers) that are permitted to discover your VPC endpoint service.
    */
  def describeVpcEndpointServicePermissions(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointServicePermissionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointServicePermissionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeVpcEndpointServicePermissions(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointServicePermissionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointServicePermissionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointServicePermissionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes available services to which you can create a VPC endpoint.
    */
  def describeVpcEndpointServices(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointServicesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeVpcEndpointServices(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointServicesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointServicesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes available services to which you can create a VPC endpoint.
    */
  def describeVpcEndpointServices(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointServicesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointServicesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeVpcEndpointServices(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointServicesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointServicesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointServicesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your VPC endpoints.
    */
  def describeVpcEndpoints(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeVpcEndpoints(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your VPC endpoints.
    */
  def describeVpcEndpoints(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeVpcEndpoints(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcEndpointsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your VPC peering connections.
    */
  def describeVpcPeeringConnections(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcPeeringConnectionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeVpcPeeringConnections(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcPeeringConnectionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcPeeringConnectionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your VPC peering connections.
    */
  def describeVpcPeeringConnections(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcPeeringConnectionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcPeeringConnectionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeVpcPeeringConnections(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcPeeringConnectionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcPeeringConnectionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcPeeringConnectionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your VPCs.
    */
  def describeVpcs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeVpcs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your VPCs.
    */
  def describeVpcs(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeVpcs(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your VPN connections. For more information, see AWS Site-to-Site VPN in the AWS Site-to-Site VPN User Guide.
    */
  def describeVpnConnections(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpnConnectionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeVpnConnections(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpnConnectionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpnConnectionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your VPN connections. For more information, see AWS Site-to-Site VPN in the AWS Site-to-Site VPN User Guide.
    */
  def describeVpnConnections(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpnConnectionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpnConnectionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeVpnConnections(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpnConnectionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpnConnectionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpnConnectionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your virtual private gateways. For more information, see AWS Site-to-Site VPN in the AWS Site-to-Site VPN User Guide.
    */
  def describeVpnGateways(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpnGatewaysResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeVpnGateways(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpnGatewaysResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpnGatewaysResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your virtual private gateways. For more information, see AWS Site-to-Site VPN in the AWS Site-to-Site VPN User Guide.
    */
  def describeVpnGateways(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpnGatewaysRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpnGatewaysResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeVpnGateways(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpnGatewaysRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpnGatewaysResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpnGatewaysResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Unlinks (detaches) a linked EC2-Classic instance from a VPC. After the instance has been unlinked, the VPC security groups are no longer associated with it. An instance is automatically unlinked from a VPC when it's stopped.
    */
  def detachClassicLinkVpc(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DetachClassicLinkVpcResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def detachClassicLinkVpc(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DetachClassicLinkVpcResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DetachClassicLinkVpcResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Unlinks (detaches) a linked EC2-Classic instance from a VPC. After the instance has been unlinked, the VPC security groups are no longer associated with it. An instance is automatically unlinked from a VPC when it's stopped.
    */
  def detachClassicLinkVpc(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DetachClassicLinkVpcRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DetachClassicLinkVpcResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def detachClassicLinkVpc(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DetachClassicLinkVpcRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DetachClassicLinkVpcResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DetachClassicLinkVpcResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Detaches an internet gateway from a VPC, disabling connectivity between the internet and the VPC. The VPC must not contain any running instances with Elastic IP addresses or public IPv4 addresses.
    */
  def detachInternetGateway(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detachInternetGateway(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Detaches an internet gateway from a VPC, disabling connectivity between the internet and the VPC. The VPC must not contain any running instances with Elastic IP addresses or public IPv4 addresses.
    */
  def detachInternetGateway(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DetachInternetGatewayRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detachInternetGateway(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DetachInternetGatewayRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Detaches a network interface from an instance.
    */
  def detachNetworkInterface(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detachNetworkInterface(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Detaches a network interface from an instance.
    */
  def detachNetworkInterface(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DetachNetworkInterfaceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detachNetworkInterface(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DetachNetworkInterfaceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Detaches an EBS volume from an instance. Make sure to unmount any file systems on the device within your operating system before detaching the volume. Failure to do so can result in the volume becoming stuck in the busy state while detaching. If this happens, detachment can be delayed indefinitely until you unmount the volume, force detachment, reboot the instance, or all three. If an EBS volume is the root device of an instance, it can't be detached while the instance is running. To detach the root volume, stop the instance first. When a volume with an AWS Marketplace product code is detached from an instance, the product code is no longer associated with the instance. For more information, see Detaching an Amazon EBS Volume in the Amazon Elastic Compute Cloud User Guide.
    */
  def detachVolume(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.VolumeAttachment, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def detachVolume(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.VolumeAttachment, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.VolumeAttachment, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Detaches an EBS volume from an instance. Make sure to unmount any file systems on the device within your operating system before detaching the volume. Failure to do so can result in the volume becoming stuck in the busy state while detaching. If this happens, detachment can be delayed indefinitely until you unmount the volume, force detachment, reboot the instance, or all three. If an EBS volume is the root device of an instance, it can't be detached while the instance is running. To detach the root volume, stop the instance first. When a volume with an AWS Marketplace product code is detached from an instance, the product code is no longer associated with the instance. For more information, see Detaching an Amazon EBS Volume in the Amazon Elastic Compute Cloud User Guide.
    */
  def detachVolume(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DetachVolumeRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.VolumeAttachment, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def detachVolume(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DetachVolumeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.VolumeAttachment, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.VolumeAttachment, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Detaches a virtual private gateway from a VPC. You do this if you're planning to turn off the VPC and not use it anymore. You can confirm a virtual private gateway has been completely detached from a VPC by describing the virtual private gateway (any attachments to the virtual private gateway are also described). You must wait for the attachment's state to switch to detached before you can delete the VPC or attach a different VPC to the virtual private gateway.
    */
  def detachVpnGateway(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detachVpnGateway(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Detaches a virtual private gateway from a VPC. You do this if you're planning to turn off the VPC and not use it anymore. You can confirm a virtual private gateway has been completely detached from a VPC by describing the virtual private gateway (any attachments to the virtual private gateway are also described). You must wait for the attachment's state to switch to detached before you can delete the VPC or attach a different VPC to the virtual private gateway.
    */
  def detachVpnGateway(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DetachVpnGatewayRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detachVpnGateway(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DetachVpnGatewayRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables the specified resource attachment from propagating routes to the specified propagation route table.
    */
  def disableTransitGatewayRouteTablePropagation(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DisableTransitGatewayRouteTablePropagationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disableTransitGatewayRouteTablePropagation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DisableTransitGatewayRouteTablePropagationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DisableTransitGatewayRouteTablePropagationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disables the specified resource attachment from propagating routes to the specified propagation route table.
    */
  def disableTransitGatewayRouteTablePropagation(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DisableTransitGatewayRouteTablePropagationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DisableTransitGatewayRouteTablePropagationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disableTransitGatewayRouteTablePropagation(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DisableTransitGatewayRouteTablePropagationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DisableTransitGatewayRouteTablePropagationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DisableTransitGatewayRouteTablePropagationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disables a virtual private gateway (VGW) from propagating routes to a specified route table of a VPC.
    */
  def disableVgwRoutePropagation(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disableVgwRoutePropagation(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables a virtual private gateway (VGW) from propagating routes to a specified route table of a VPC.
    */
  def disableVgwRoutePropagation(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DisableVgwRoutePropagationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disableVgwRoutePropagation(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DisableVgwRoutePropagationRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables ClassicLink for a VPC. You cannot disable ClassicLink for a VPC that has EC2-Classic instances linked to it.
    */
  def disableVpcClassicLink(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DisableVpcClassicLinkResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disableVpcClassicLink(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DisableVpcClassicLinkResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DisableVpcClassicLinkResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disables ClassicLink for a VPC. You cannot disable ClassicLink for a VPC that has EC2-Classic instances linked to it.
    */
  def disableVpcClassicLink(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DisableVpcClassicLinkRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DisableVpcClassicLinkResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disableVpcClassicLink(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DisableVpcClassicLinkRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DisableVpcClassicLinkResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DisableVpcClassicLinkResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disables ClassicLink DNS support for a VPC. If disabled, DNS hostnames resolve to public IP addresses when addressed between a linked EC2-Classic instance and instances in the VPC to which it's linked. For more information, see ClassicLink in the Amazon Elastic Compute Cloud User Guide.
    */
  def disableVpcClassicLinkDnsSupport(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DisableVpcClassicLinkDnsSupportResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disableVpcClassicLinkDnsSupport(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DisableVpcClassicLinkDnsSupportResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DisableVpcClassicLinkDnsSupportResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disables ClassicLink DNS support for a VPC. If disabled, DNS hostnames resolve to public IP addresses when addressed between a linked EC2-Classic instance and instances in the VPC to which it's linked. For more information, see ClassicLink in the Amazon Elastic Compute Cloud User Guide.
    */
  def disableVpcClassicLinkDnsSupport(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DisableVpcClassicLinkDnsSupportRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DisableVpcClassicLinkDnsSupportResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disableVpcClassicLinkDnsSupport(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DisableVpcClassicLinkDnsSupportRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DisableVpcClassicLinkDnsSupportResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DisableVpcClassicLinkDnsSupportResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disassociates an Elastic IP address from the instance or network interface it's associated with. An Elastic IP address is for use in either the EC2-Classic platform or in a VPC. For more information, see Elastic IP Addresses in the Amazon Elastic Compute Cloud User Guide. This is an idempotent operation. If you perform the operation more than once, Amazon EC2 doesn't return an error.
    */
  def disassociateAddress(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateAddress(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates an Elastic IP address from the instance or network interface it's associated with. An Elastic IP address is for use in either the EC2-Classic platform or in a VPC. For more information, see Elastic IP Addresses in the Amazon Elastic Compute Cloud User Guide. This is an idempotent operation. If you perform the operation more than once, Amazon EC2 doesn't return an error.
    */
  def disassociateAddress(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DisassociateAddressRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateAddress(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DisassociateAddressRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates a target network from the specified Client VPN endpoint. When you disassociate the last target network from a Client VPN, the following happens:   The route that was automatically added for the VPC is deleted   All active client connections are terminated   New client connections are disallowed   The Client VPN endpoint's status changes to pending-associate   
    */
  def disassociateClientVpnTargetNetwork(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DisassociateClientVpnTargetNetworkResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociateClientVpnTargetNetwork(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DisassociateClientVpnTargetNetworkResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DisassociateClientVpnTargetNetworkResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disassociates a target network from the specified Client VPN endpoint. When you disassociate the last target network from a Client VPN, the following happens:   The route that was automatically added for the VPC is deleted   All active client connections are terminated   New client connections are disallowed   The Client VPN endpoint's status changes to pending-associate   
    */
  def disassociateClientVpnTargetNetwork(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DisassociateClientVpnTargetNetworkRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DisassociateClientVpnTargetNetworkResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociateClientVpnTargetNetwork(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DisassociateClientVpnTargetNetworkRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DisassociateClientVpnTargetNetworkResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DisassociateClientVpnTargetNetworkResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disassociates an IAM instance profile from a running or stopped instance. Use DescribeIamInstanceProfileAssociations to get the association ID.
    */
  def disassociateIamInstanceProfile(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DisassociateIamInstanceProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociateIamInstanceProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DisassociateIamInstanceProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DisassociateIamInstanceProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disassociates an IAM instance profile from a running or stopped instance. Use DescribeIamInstanceProfileAssociations to get the association ID.
    */
  def disassociateIamInstanceProfile(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DisassociateIamInstanceProfileRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DisassociateIamInstanceProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociateIamInstanceProfile(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DisassociateIamInstanceProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DisassociateIamInstanceProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DisassociateIamInstanceProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disassociates a subnet from a route table. After you perform this action, the subnet no longer uses the routes in the route table. Instead, it uses the routes in the VPC's main route table. For more information about route tables, see Route Tables in the Amazon Virtual Private Cloud User Guide.
    */
  def disassociateRouteTable(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateRouteTable(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates a subnet from a route table. After you perform this action, the subnet no longer uses the routes in the route table. Instead, it uses the routes in the VPC's main route table. For more information about route tables, see Route Tables in the Amazon Virtual Private Cloud User Guide.
    */
  def disassociateRouteTable(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DisassociateRouteTableRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateRouteTable(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DisassociateRouteTableRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates a CIDR block from a subnet. Currently, you can disassociate an IPv6 CIDR block only. You must detach or delete all gateways and resources that are associated with the CIDR block before you can disassociate it. 
    */
  def disassociateSubnetCidrBlock(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DisassociateSubnetCidrBlockResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociateSubnetCidrBlock(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DisassociateSubnetCidrBlockResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DisassociateSubnetCidrBlockResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disassociates a CIDR block from a subnet. Currently, you can disassociate an IPv6 CIDR block only. You must detach or delete all gateways and resources that are associated with the CIDR block before you can disassociate it. 
    */
  def disassociateSubnetCidrBlock(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DisassociateSubnetCidrBlockRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DisassociateSubnetCidrBlockResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociateSubnetCidrBlock(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DisassociateSubnetCidrBlockRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DisassociateSubnetCidrBlockResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DisassociateSubnetCidrBlockResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disassociates a resource attachment from a transit gateway route table.
    */
  def disassociateTransitGatewayRouteTable(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DisassociateTransitGatewayRouteTableResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociateTransitGatewayRouteTable(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DisassociateTransitGatewayRouteTableResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DisassociateTransitGatewayRouteTableResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disassociates a resource attachment from a transit gateway route table.
    */
  def disassociateTransitGatewayRouteTable(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DisassociateTransitGatewayRouteTableRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DisassociateTransitGatewayRouteTableResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociateTransitGatewayRouteTable(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DisassociateTransitGatewayRouteTableRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DisassociateTransitGatewayRouteTableResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DisassociateTransitGatewayRouteTableResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disassociates a CIDR block from a VPC. To disassociate the CIDR block, you must specify its association ID. You can get the association ID by using DescribeVpcs. You must detach or delete all gateways and resources that are associated with the CIDR block before you can disassociate it.  You cannot disassociate the CIDR block with which you originally created the VPC (the primary CIDR block).
    */
  def disassociateVpcCidrBlock(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DisassociateVpcCidrBlockResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociateVpcCidrBlock(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DisassociateVpcCidrBlockResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DisassociateVpcCidrBlockResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disassociates a CIDR block from a VPC. To disassociate the CIDR block, you must specify its association ID. You can get the association ID by using DescribeVpcs. You must detach or delete all gateways and resources that are associated with the CIDR block before you can disassociate it.  You cannot disassociate the CIDR block with which you originally created the VPC (the primary CIDR block).
    */
  def disassociateVpcCidrBlock(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DisassociateVpcCidrBlockRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DisassociateVpcCidrBlockResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociateVpcCidrBlock(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DisassociateVpcCidrBlockRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DisassociateVpcCidrBlockResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DisassociateVpcCidrBlockResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Enables the specified attachment to propagate routes to the specified propagation route table.
    */
  def enableTransitGatewayRouteTablePropagation(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.EnableTransitGatewayRouteTablePropagationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def enableTransitGatewayRouteTablePropagation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.EnableTransitGatewayRouteTablePropagationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.EnableTransitGatewayRouteTablePropagationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Enables the specified attachment to propagate routes to the specified propagation route table.
    */
  def enableTransitGatewayRouteTablePropagation(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.EnableTransitGatewayRouteTablePropagationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.EnableTransitGatewayRouteTablePropagationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def enableTransitGatewayRouteTablePropagation(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.EnableTransitGatewayRouteTablePropagationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.EnableTransitGatewayRouteTablePropagationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.EnableTransitGatewayRouteTablePropagationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Enables a virtual private gateway (VGW) to propagate routes to the specified route table of a VPC.
    */
  def enableVgwRoutePropagation(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def enableVgwRoutePropagation(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables a virtual private gateway (VGW) to propagate routes to the specified route table of a VPC.
    */
  def enableVgwRoutePropagation(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.EnableVgwRoutePropagationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def enableVgwRoutePropagation(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.EnableVgwRoutePropagationRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables I/O operations for a volume that had I/O operations disabled because the data on the volume was potentially inconsistent.
    */
  def enableVolumeIO(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def enableVolumeIO(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables I/O operations for a volume that had I/O operations disabled because the data on the volume was potentially inconsistent.
    */
  def enableVolumeIO(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.EnableVolumeIORequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def enableVolumeIO(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.EnableVolumeIORequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables a VPC for ClassicLink. You can then link EC2-Classic instances to your ClassicLink-enabled VPC to allow communication over private IP addresses. You cannot enable your VPC for ClassicLink if any of your VPC route tables have existing routes for address ranges within the 10.0.0.0/8 IP address range, excluding local routes for VPCs in the 10.0.0.0/16 and 10.1.0.0/16 IP address ranges. For more information, see ClassicLink in the Amazon Elastic Compute Cloud User Guide.
    */
  def enableVpcClassicLink(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.EnableVpcClassicLinkResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def enableVpcClassicLink(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.EnableVpcClassicLinkResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.EnableVpcClassicLinkResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Enables a VPC for ClassicLink. You can then link EC2-Classic instances to your ClassicLink-enabled VPC to allow communication over private IP addresses. You cannot enable your VPC for ClassicLink if any of your VPC route tables have existing routes for address ranges within the 10.0.0.0/8 IP address range, excluding local routes for VPCs in the 10.0.0.0/16 and 10.1.0.0/16 IP address ranges. For more information, see ClassicLink in the Amazon Elastic Compute Cloud User Guide.
    */
  def enableVpcClassicLink(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.EnableVpcClassicLinkRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.EnableVpcClassicLinkResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def enableVpcClassicLink(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.EnableVpcClassicLinkRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.EnableVpcClassicLinkResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.EnableVpcClassicLinkResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Enables a VPC to support DNS hostname resolution for ClassicLink. If enabled, the DNS hostname of a linked EC2-Classic instance resolves to its private IP address when addressed from an instance in the VPC to which it's linked. Similarly, the DNS hostname of an instance in a VPC resolves to its private IP address when addressed from a linked EC2-Classic instance. For more information, see ClassicLink in the Amazon Elastic Compute Cloud User Guide.
    */
  def enableVpcClassicLinkDnsSupport(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.EnableVpcClassicLinkDnsSupportResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def enableVpcClassicLinkDnsSupport(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.EnableVpcClassicLinkDnsSupportResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.EnableVpcClassicLinkDnsSupportResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Enables a VPC to support DNS hostname resolution for ClassicLink. If enabled, the DNS hostname of a linked EC2-Classic instance resolves to its private IP address when addressed from an instance in the VPC to which it's linked. Similarly, the DNS hostname of an instance in a VPC resolves to its private IP address when addressed from a linked EC2-Classic instance. For more information, see ClassicLink in the Amazon Elastic Compute Cloud User Guide.
    */
  def enableVpcClassicLinkDnsSupport(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.EnableVpcClassicLinkDnsSupportRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.EnableVpcClassicLinkDnsSupportResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def enableVpcClassicLinkDnsSupport(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.EnableVpcClassicLinkDnsSupportRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.EnableVpcClassicLinkDnsSupportResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.EnableVpcClassicLinkDnsSupportResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Downloads the client certificate revocation list for the specified Client VPN endpoint.
    */
  def exportClientVpnClientCertificateRevocationList(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ExportClientVpnClientCertificateRevocationListResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def exportClientVpnClientCertificateRevocationList(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ExportClientVpnClientCertificateRevocationListResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ExportClientVpnClientCertificateRevocationListResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Downloads the client certificate revocation list for the specified Client VPN endpoint.
    */
  def exportClientVpnClientCertificateRevocationList(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ExportClientVpnClientCertificateRevocationListRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ExportClientVpnClientCertificateRevocationListResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def exportClientVpnClientCertificateRevocationList(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ExportClientVpnClientCertificateRevocationListRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ExportClientVpnClientCertificateRevocationListResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ExportClientVpnClientCertificateRevocationListResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Downloads the contents of the Client VPN endpoint configuration file for the specified Client VPN endpoint. The Client VPN endpoint configuration file includes the Client VPN endpoint and certificate information clients need to establish a connection with the Client VPN endpoint.
    */
  def exportClientVpnClientConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ExportClientVpnClientConfigurationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def exportClientVpnClientConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ExportClientVpnClientConfigurationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ExportClientVpnClientConfigurationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Downloads the contents of the Client VPN endpoint configuration file for the specified Client VPN endpoint. The Client VPN endpoint configuration file includes the Client VPN endpoint and certificate information clients need to establish a connection with the Client VPN endpoint.
    */
  def exportClientVpnClientConfiguration(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ExportClientVpnClientConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ExportClientVpnClientConfigurationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def exportClientVpnClientConfiguration(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ExportClientVpnClientConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ExportClientVpnClientConfigurationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ExportClientVpnClientConfigurationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Exports routes from the specified transit gateway route table to the specified S3 bucket. By default, all routes are exported. Alternatively, you can filter by CIDR range.
    */
  def exportTransitGatewayRoutes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ExportTransitGatewayRoutesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def exportTransitGatewayRoutes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ExportTransitGatewayRoutesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ExportTransitGatewayRoutesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Exports routes from the specified transit gateway route table to the specified S3 bucket. By default, all routes are exported. Alternatively, you can filter by CIDR range.
    */
  def exportTransitGatewayRoutes(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ExportTransitGatewayRoutesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ExportTransitGatewayRoutesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def exportTransitGatewayRoutes(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ExportTransitGatewayRoutesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ExportTransitGatewayRoutesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ExportTransitGatewayRoutesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the console output for the specified instance. For Linux instances, the instance console output displays the exact console output that would normally be displayed on a physical monitor attached to a computer. For Windows instances, the instance console output includes the last three system event log errors. By default, the console output returns buffered information that was posted shortly after an instance transition state (start, stop, reboot, or terminate). This information is available for at least one hour after the most recent post. Only the most recent 64 KB of console output is available. You can optionally retrieve the latest serial console output at any time during the instance lifecycle. This option is supported on instance types that use the Nitro hypervisor. For more information, see Instance Console Output in the Amazon Elastic Compute Cloud User Guide.
    */
  def getConsoleOutput(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.GetConsoleOutputResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getConsoleOutput(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.GetConsoleOutputResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.GetConsoleOutputResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the console output for the specified instance. For Linux instances, the instance console output displays the exact console output that would normally be displayed on a physical monitor attached to a computer. For Windows instances, the instance console output includes the last three system event log errors. By default, the console output returns buffered information that was posted shortly after an instance transition state (start, stop, reboot, or terminate). This information is available for at least one hour after the most recent post. Only the most recent 64 KB of console output is available. You can optionally retrieve the latest serial console output at any time during the instance lifecycle. This option is supported on instance types that use the Nitro hypervisor. For more information, see Instance Console Output in the Amazon Elastic Compute Cloud User Guide.
    */
  def getConsoleOutput(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.GetConsoleOutputRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.GetConsoleOutputResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getConsoleOutput(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.GetConsoleOutputRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.GetConsoleOutputResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.GetConsoleOutputResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieve a JPG-format screenshot of a running instance to help with troubleshooting. The returned content is Base64-encoded.
    */
  def getConsoleScreenshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.GetConsoleScreenshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getConsoleScreenshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.GetConsoleScreenshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.GetConsoleScreenshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieve a JPG-format screenshot of a running instance to help with troubleshooting. The returned content is Base64-encoded.
    */
  def getConsoleScreenshot(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.GetConsoleScreenshotRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.GetConsoleScreenshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getConsoleScreenshot(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.GetConsoleScreenshotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.GetConsoleScreenshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.GetConsoleScreenshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Preview a reservation purchase with configurations that match those of your Dedicated Host. You must have active Dedicated Hosts in your account before you purchase a reservation. This is a preview of the PurchaseHostReservation action and does not result in the offering being purchased.
    */
  def getHostReservationPurchasePreview(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.GetHostReservationPurchasePreviewResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getHostReservationPurchasePreview(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.GetHostReservationPurchasePreviewResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.GetHostReservationPurchasePreviewResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Preview a reservation purchase with configurations that match those of your Dedicated Host. You must have active Dedicated Hosts in your account before you purchase a reservation. This is a preview of the PurchaseHostReservation action and does not result in the offering being purchased.
    */
  def getHostReservationPurchasePreview(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.GetHostReservationPurchasePreviewRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.GetHostReservationPurchasePreviewResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getHostReservationPurchasePreview(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.GetHostReservationPurchasePreviewRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.GetHostReservationPurchasePreviewResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.GetHostReservationPurchasePreviewResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the configuration data of the specified instance. You can use this data to create a launch template.
    */
  def getLaunchTemplateData(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.GetLaunchTemplateDataResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getLaunchTemplateData(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.GetLaunchTemplateDataResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.GetLaunchTemplateDataResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the configuration data of the specified instance. You can use this data to create a launch template.
    */
  def getLaunchTemplateData(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.GetLaunchTemplateDataRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.GetLaunchTemplateDataResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getLaunchTemplateData(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.GetLaunchTemplateDataRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.GetLaunchTemplateDataResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.GetLaunchTemplateDataResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the encrypted administrator password for a running Windows instance. The Windows password is generated at boot by the EC2Config service or EC2Launch scripts (Windows Server 2016 and later). This usually only happens the first time an instance is launched. For more information, see EC2Config and EC2Launch in the Amazon Elastic Compute Cloud User Guide. For the EC2Config service, the password is not generated for rebundled AMIs unless Ec2SetPassword is enabled before bundling. The password is encrypted using the key pair that you specified when you launched the instance. You must provide the corresponding key pair file. When you launch an instance, password generation and encryption may take a few minutes. If you try to retrieve the password before it's available, the output returns an empty string. We recommend that you wait up to 15 minutes after launching an instance before trying to retrieve the generated password.
    */
  def getPasswordData(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.GetPasswordDataResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getPasswordData(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.GetPasswordDataResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.GetPasswordDataResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the encrypted administrator password for a running Windows instance. The Windows password is generated at boot by the EC2Config service or EC2Launch scripts (Windows Server 2016 and later). This usually only happens the first time an instance is launched. For more information, see EC2Config and EC2Launch in the Amazon Elastic Compute Cloud User Guide. For the EC2Config service, the password is not generated for rebundled AMIs unless Ec2SetPassword is enabled before bundling. The password is encrypted using the key pair that you specified when you launched the instance. You must provide the corresponding key pair file. When you launch an instance, password generation and encryption may take a few minutes. If you try to retrieve the password before it's available, the output returns an empty string. We recommend that you wait up to 15 minutes after launching an instance before trying to retrieve the generated password.
    */
  def getPasswordData(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.GetPasswordDataRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.GetPasswordDataResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getPasswordData(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.GetPasswordDataRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.GetPasswordDataResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.GetPasswordDataResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a quote and exchange information for exchanging one or more specified Convertible Reserved Instances for a new Convertible Reserved Instance. If the exchange cannot be performed, the reason is returned in the response. Use AcceptReservedInstancesExchangeQuote to perform the exchange.
    */
  def getReservedInstancesExchangeQuote(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.GetReservedInstancesExchangeQuoteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getReservedInstancesExchangeQuote(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.GetReservedInstancesExchangeQuoteResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.GetReservedInstancesExchangeQuoteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a quote and exchange information for exchanging one or more specified Convertible Reserved Instances for a new Convertible Reserved Instance. If the exchange cannot be performed, the reason is returned in the response. Use AcceptReservedInstancesExchangeQuote to perform the exchange.
    */
  def getReservedInstancesExchangeQuote(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.GetReservedInstancesExchangeQuoteRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.GetReservedInstancesExchangeQuoteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getReservedInstancesExchangeQuote(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.GetReservedInstancesExchangeQuoteRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.GetReservedInstancesExchangeQuoteResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.GetReservedInstancesExchangeQuoteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the route tables to which the specified resource attachment propagates routes.
    */
  def getTransitGatewayAttachmentPropagations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.GetTransitGatewayAttachmentPropagationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getTransitGatewayAttachmentPropagations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.GetTransitGatewayAttachmentPropagationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.GetTransitGatewayAttachmentPropagationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the route tables to which the specified resource attachment propagates routes.
    */
  def getTransitGatewayAttachmentPropagations(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.GetTransitGatewayAttachmentPropagationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.GetTransitGatewayAttachmentPropagationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getTransitGatewayAttachmentPropagations(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.GetTransitGatewayAttachmentPropagationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.GetTransitGatewayAttachmentPropagationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.GetTransitGatewayAttachmentPropagationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets information about the associations for the specified transit gateway route table.
    */
  def getTransitGatewayRouteTableAssociations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.GetTransitGatewayRouteTableAssociationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getTransitGatewayRouteTableAssociations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.GetTransitGatewayRouteTableAssociationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.GetTransitGatewayRouteTableAssociationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets information about the associations for the specified transit gateway route table.
    */
  def getTransitGatewayRouteTableAssociations(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.GetTransitGatewayRouteTableAssociationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.GetTransitGatewayRouteTableAssociationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getTransitGatewayRouteTableAssociations(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.GetTransitGatewayRouteTableAssociationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.GetTransitGatewayRouteTableAssociationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.GetTransitGatewayRouteTableAssociationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets information about the route table propagations for the specified transit gateway route table.
    */
  def getTransitGatewayRouteTablePropagations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.GetTransitGatewayRouteTablePropagationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getTransitGatewayRouteTablePropagations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.GetTransitGatewayRouteTablePropagationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.GetTransitGatewayRouteTablePropagationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets information about the route table propagations for the specified transit gateway route table.
    */
  def getTransitGatewayRouteTablePropagations(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.GetTransitGatewayRouteTablePropagationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.GetTransitGatewayRouteTablePropagationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getTransitGatewayRouteTablePropagations(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.GetTransitGatewayRouteTablePropagationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.GetTransitGatewayRouteTablePropagationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.GetTransitGatewayRouteTablePropagationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Uploads a client certificate revocation list to the specified Client VPN endpoint. Uploading a client certificate revocation list overwrites the existing client certificate revocation list. Uploading a client certificate revocation list resets existing client connections.
    */
  def importClientVpnClientCertificateRevocationList(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportClientVpnClientCertificateRevocationListResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def importClientVpnClientCertificateRevocationList(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportClientVpnClientCertificateRevocationListResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportClientVpnClientCertificateRevocationListResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Uploads a client certificate revocation list to the specified Client VPN endpoint. Uploading a client certificate revocation list overwrites the existing client certificate revocation list. Uploading a client certificate revocation list resets existing client connections.
    */
  def importClientVpnClientCertificateRevocationList(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportClientVpnClientCertificateRevocationListRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportClientVpnClientCertificateRevocationListResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def importClientVpnClientCertificateRevocationList(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportClientVpnClientCertificateRevocationListRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportClientVpnClientCertificateRevocationListResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportClientVpnClientCertificateRevocationListResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Import single or multi-volume disk images or EBS snapshots into an Amazon Machine Image (AMI). For more information, see Importing a VM as an Image Using VM Import/Export in the VM Import/Export User Guide.
    */
  def importImage(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportImageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def importImage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportImageResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportImageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Import single or multi-volume disk images or EBS snapshots into an Amazon Machine Image (AMI). For more information, see Importing a VM as an Image Using VM Import/Export in the VM Import/Export User Guide.
    */
  def importImage(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportImageRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportImageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def importImage(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportImageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportImageResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportImageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an import instance task using metadata from the specified disk image. ImportInstance only supports single-volume VMs. To import multi-volume VMs, use ImportImage. For more information, see Importing a Virtual Machine Using the Amazon EC2 CLI. For information about the import manifest referenced by this API action, see VM Import Manifest.
    */
  def importInstance(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def importInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an import instance task using metadata from the specified disk image. ImportInstance only supports single-volume VMs. To import multi-volume VMs, use ImportImage. For more information, see Importing a Virtual Machine Using the Amazon EC2 CLI. For information about the import manifest referenced by this API action, see VM Import Manifest.
    */
  def importInstance(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportInstanceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def importInstance(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportInstanceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Imports the public key from an RSA key pair that you created with a third-party tool. Compare this with CreateKeyPair, in which AWS creates the key pair and gives the keys to you (AWS keeps a copy of the public key). With ImportKeyPair, you create the key pair and give AWS just the public key. The private key is never transferred between you and AWS. For more information about key pairs, see Key Pairs in the Amazon Elastic Compute Cloud User Guide.
    */
  def importKeyPair(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportKeyPairResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def importKeyPair(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportKeyPairResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportKeyPairResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Imports the public key from an RSA key pair that you created with a third-party tool. Compare this with CreateKeyPair, in which AWS creates the key pair and gives the keys to you (AWS keeps a copy of the public key). With ImportKeyPair, you create the key pair and give AWS just the public key. The private key is never transferred between you and AWS. For more information about key pairs, see Key Pairs in the Amazon Elastic Compute Cloud User Guide.
    */
  def importKeyPair(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportKeyPairRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportKeyPairResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def importKeyPair(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportKeyPairRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportKeyPairResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportKeyPairResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Imports a disk into an EBS snapshot.
    */
  def importSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def importSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Imports a disk into an EBS snapshot.
    */
  def importSnapshot(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportSnapshotRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def importSnapshot(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportSnapshotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an import volume task using metadata from the specified disk image.For more information, see Importing Disks to Amazon EBS. For information about the import manifest referenced by this API action, see VM Import Manifest.
    */
  def importVolume(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportVolumeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def importVolume(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportVolumeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportVolumeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an import volume task using metadata from the specified disk image.For more information, see Importing Disks to Amazon EBS. For information about the import manifest referenced by this API action, see VM Import Manifest.
    */
  def importVolume(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportVolumeRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportVolumeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def importVolume(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportVolumeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportVolumeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ImportVolumeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies a Capacity Reservation's capacity and the conditions under which it is to be released. You cannot change a Capacity Reservation's instance type, EBS optimization, instance store settings, platform, Availability Zone, or instance eligibility. If you need to modify any of these attributes, we recommend that you cancel the Capacity Reservation, and then create a new one with the required attributes.
    */
  def modifyCapacityReservation(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyCapacityReservationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyCapacityReservation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyCapacityReservationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyCapacityReservationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies a Capacity Reservation's capacity and the conditions under which it is to be released. You cannot change a Capacity Reservation's instance type, EBS optimization, instance store settings, platform, Availability Zone, or instance eligibility. If you need to modify any of these attributes, we recommend that you cancel the Capacity Reservation, and then create a new one with the required attributes.
    */
  def modifyCapacityReservation(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyCapacityReservationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyCapacityReservationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyCapacityReservation(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyCapacityReservationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyCapacityReservationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyCapacityReservationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the specified Client VPN endpoint. You can only modify an endpoint's server certificate information, client connection logging information, DNS server, and description. Modifying the DNS server resets existing client connections.
    */
  def modifyClientVpnEndpoint(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyClientVpnEndpointResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyClientVpnEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyClientVpnEndpointResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyClientVpnEndpointResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the specified Client VPN endpoint. You can only modify an endpoint's server certificate information, client connection logging information, DNS server, and description. Modifying the DNS server resets existing client connections.
    */
  def modifyClientVpnEndpoint(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyClientVpnEndpointRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyClientVpnEndpointResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyClientVpnEndpoint(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyClientVpnEndpointRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyClientVpnEndpointResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyClientVpnEndpointResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the specified EC2 Fleet. While the EC2 Fleet is being modified, it is in the modifying state.
    */
  def modifyFleet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyFleetResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyFleet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyFleetResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyFleetResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the specified EC2 Fleet. While the EC2 Fleet is being modified, it is in the modifying state.
    */
  def modifyFleet(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyFleetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyFleetResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyFleet(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyFleetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyFleetResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyFleetResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the specified attribute of the specified Amazon FPGA Image (AFI).
    */
  def modifyFpgaImageAttribute(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyFpgaImageAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyFpgaImageAttribute(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyFpgaImageAttributeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyFpgaImageAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the specified attribute of the specified Amazon FPGA Image (AFI).
    */
  def modifyFpgaImageAttribute(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyFpgaImageAttributeRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyFpgaImageAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyFpgaImageAttribute(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyFpgaImageAttributeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyFpgaImageAttributeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyFpgaImageAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modify the auto-placement setting of a Dedicated Host. When auto-placement is enabled, any instances that you launch with a tenancy of host but without a specific host ID are placed onto any available Dedicated Host in your account that has auto-placement enabled. When auto-placement is disabled, you need to provide a host ID to have the instance launch onto a specific host. If no host ID is provided, the instance is launched onto a suitable host with auto-placement enabled.
    */
  def modifyHosts(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyHostsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyHosts(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyHostsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyHostsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modify the auto-placement setting of a Dedicated Host. When auto-placement is enabled, any instances that you launch with a tenancy of host but without a specific host ID are placed onto any available Dedicated Host in your account that has auto-placement enabled. When auto-placement is disabled, you need to provide a host ID to have the instance launch onto a specific host. If no host ID is provided, the instance is launched onto a suitable host with auto-placement enabled.
    */
  def modifyHosts(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyHostsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyHostsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyHosts(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyHostsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyHostsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyHostsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the ID format for the specified resource on a per-region basis. You can specify that resources should receive longer IDs (17-character IDs) when they are created. This request can only be used to modify longer ID settings for resource types that are within the opt-in period. Resources currently in their opt-in period include: bundle | conversion-task | customer-gateway | dhcp-options | elastic-ip-allocation | elastic-ip-association | export-task | flow-log | image | import-task | internet-gateway | network-acl | network-acl-association | network-interface | network-interface-attachment | prefix-list | route-table | route-table-association | security-group | subnet | subnet-cidr-block-association | vpc | vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection | vpn-connection | vpn-gateway. This setting applies to the IAM user who makes the request; it does not apply to the entire AWS account. By default, an IAM user defaults to the same settings as the root user. If you're using this action as the root user, then these settings apply to the entire account, unless an IAM user explicitly overrides these settings for themselves. For more information, see Resource IDs in the Amazon Elastic Compute Cloud User Guide. Resources created with longer IDs are visible to all IAM roles and users, regardless of these settings and provided that they have permission to use the relevant Describe command for the resource type.
    */
  def modifyIdFormat(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyIdFormat(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the ID format for the specified resource on a per-region basis. You can specify that resources should receive longer IDs (17-character IDs) when they are created. This request can only be used to modify longer ID settings for resource types that are within the opt-in period. Resources currently in their opt-in period include: bundle | conversion-task | customer-gateway | dhcp-options | elastic-ip-allocation | elastic-ip-association | export-task | flow-log | image | import-task | internet-gateway | network-acl | network-acl-association | network-interface | network-interface-attachment | prefix-list | route-table | route-table-association | security-group | subnet | subnet-cidr-block-association | vpc | vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection | vpn-connection | vpn-gateway. This setting applies to the IAM user who makes the request; it does not apply to the entire AWS account. By default, an IAM user defaults to the same settings as the root user. If you're using this action as the root user, then these settings apply to the entire account, unless an IAM user explicitly overrides these settings for themselves. For more information, see Resource IDs in the Amazon Elastic Compute Cloud User Guide. Resources created with longer IDs are visible to all IAM roles and users, regardless of these settings and provided that they have permission to use the relevant Describe command for the resource type.
    */
  def modifyIdFormat(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyIdFormatRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyIdFormat(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyIdFormatRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the ID format of a resource for a specified IAM user, IAM role, or the root user for an account; or all IAM users, IAM roles, and the root user for an account. You can specify that resources should receive longer IDs (17-character IDs) when they are created.  This request can only be used to modify longer ID settings for resource types that are within the opt-in period. Resources currently in their opt-in period include: bundle | conversion-task | customer-gateway | dhcp-options | elastic-ip-allocation | elastic-ip-association | export-task | flow-log | image | import-task | internet-gateway | network-acl | network-acl-association | network-interface | network-interface-attachment | prefix-list | route-table | route-table-association | security-group | subnet | subnet-cidr-block-association | vpc | vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection | vpn-connection | vpn-gateway.  For more information, see Resource IDs in the Amazon Elastic Compute Cloud User Guide.  This setting applies to the principal specified in the request; it does not apply to the principal that makes the request.  Resources created with longer IDs are visible to all IAM roles and users, regardless of these settings and provided that they have permission to use the relevant Describe command for the resource type.
    */
  def modifyIdentityIdFormat(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyIdentityIdFormat(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the ID format of a resource for a specified IAM user, IAM role, or the root user for an account; or all IAM users, IAM roles, and the root user for an account. You can specify that resources should receive longer IDs (17-character IDs) when they are created.  This request can only be used to modify longer ID settings for resource types that are within the opt-in period. Resources currently in their opt-in period include: bundle | conversion-task | customer-gateway | dhcp-options | elastic-ip-allocation | elastic-ip-association | export-task | flow-log | image | import-task | internet-gateway | network-acl | network-acl-association | network-interface | network-interface-attachment | prefix-list | route-table | route-table-association | security-group | subnet | subnet-cidr-block-association | vpc | vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection | vpn-connection | vpn-gateway.  For more information, see Resource IDs in the Amazon Elastic Compute Cloud User Guide.  This setting applies to the principal specified in the request; it does not apply to the principal that makes the request.  Resources created with longer IDs are visible to all IAM roles and users, regardless of these settings and provided that they have permission to use the relevant Describe command for the resource type.
    */
  def modifyIdentityIdFormat(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyIdentityIdFormatRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyIdentityIdFormat(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyIdentityIdFormatRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the specified attribute of the specified AMI. You can specify only one attribute at a time. You can use the Attribute parameter to specify the attribute or one of the following parameters: Description, LaunchPermission, or ProductCode. AWS Marketplace product codes cannot be modified. Images with an AWS Marketplace product code cannot be made public. To enable the SriovNetSupport enhanced networking attribute of an image, enable SriovNetSupport on an instance and create an AMI from the instance.
    */
  def modifyImageAttribute(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyImageAttribute(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the specified attribute of the specified AMI. You can specify only one attribute at a time. You can use the Attribute parameter to specify the attribute or one of the following parameters: Description, LaunchPermission, or ProductCode. AWS Marketplace product codes cannot be modified. Images with an AWS Marketplace product code cannot be made public. To enable the SriovNetSupport enhanced networking attribute of an image, enable SriovNetSupport on an instance and create an AMI from the instance.
    */
  def modifyImageAttribute(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyImageAttributeRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyImageAttribute(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyImageAttributeRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the specified attribute of the specified instance. You can specify only one attribute at a time.  Note: Using this action to change the security groups associated with an elastic network interface (ENI) attached to an instance in a VPC can result in an error if the instance has more than one ENI. To change the security groups associated with an ENI attached to an instance that has multiple ENIs, we recommend that you use the ModifyNetworkInterfaceAttribute action. To modify some attributes, the instance must be stopped. For more information, see Modifying Attributes of a Stopped Instance in the Amazon Elastic Compute Cloud User Guide.
    */
  def modifyInstanceAttribute(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyInstanceAttribute(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the specified attribute of the specified instance. You can specify only one attribute at a time.  Note: Using this action to change the security groups associated with an elastic network interface (ENI) attached to an instance in a VPC can result in an error if the instance has more than one ENI. To change the security groups associated with an ENI attached to an instance that has multiple ENIs, we recommend that you use the ModifyNetworkInterfaceAttribute action. To modify some attributes, the instance must be stopped. For more information, see Modifying Attributes of a Stopped Instance in the Amazon Elastic Compute Cloud User Guide.
    */
  def modifyInstanceAttribute(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyInstanceAttributeRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyInstanceAttribute(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyInstanceAttributeRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the Capacity Reservation settings for a stopped instance. Use this action to configure an instance to target a specific Capacity Reservation, run in any open Capacity Reservation with matching attributes, or run On-Demand Instance capacity.
    */
  def modifyInstanceCapacityReservationAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyInstanceCapacityReservationAttributesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyInstanceCapacityReservationAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyInstanceCapacityReservationAttributesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyInstanceCapacityReservationAttributesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the Capacity Reservation settings for a stopped instance. Use this action to configure an instance to target a specific Capacity Reservation, run in any open Capacity Reservation with matching attributes, or run On-Demand Instance capacity.
    */
  def modifyInstanceCapacityReservationAttributes(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyInstanceCapacityReservationAttributesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyInstanceCapacityReservationAttributesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyInstanceCapacityReservationAttributes(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyInstanceCapacityReservationAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyInstanceCapacityReservationAttributesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyInstanceCapacityReservationAttributesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the credit option for CPU usage on a running or stopped T2 or T3 instance. The credit options are standard and unlimited. For more information, see Burstable Performance Instances in the Amazon Elastic Compute Cloud User Guide.
    */
  def modifyInstanceCreditSpecification(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyInstanceCreditSpecificationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyInstanceCreditSpecification(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyInstanceCreditSpecificationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyInstanceCreditSpecificationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the credit option for CPU usage on a running or stopped T2 or T3 instance. The credit options are standard and unlimited. For more information, see Burstable Performance Instances in the Amazon Elastic Compute Cloud User Guide.
    */
  def modifyInstanceCreditSpecification(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyInstanceCreditSpecificationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyInstanceCreditSpecificationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyInstanceCreditSpecification(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyInstanceCreditSpecificationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyInstanceCreditSpecificationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyInstanceCreditSpecificationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the start time for a scheduled Amazon EC2 instance event.
    */
  def modifyInstanceEventStartTime(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyInstanceEventStartTimeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyInstanceEventStartTime(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyInstanceEventStartTimeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyInstanceEventStartTimeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the start time for a scheduled Amazon EC2 instance event.
    */
  def modifyInstanceEventStartTime(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyInstanceEventStartTimeRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyInstanceEventStartTimeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyInstanceEventStartTime(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyInstanceEventStartTimeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyInstanceEventStartTimeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyInstanceEventStartTimeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the placement attributes for a specified instance. You can do the following:   Modify the affinity between an instance and a Dedicated Host. When affinity is set to host and the instance is not associated with a specific Dedicated Host, the next time the instance is launched, it is automatically associated with the host on which it lands. If the instance is restarted or rebooted, this relationship persists.   Change the Dedicated Host with which an instance is associated.   Change the instance tenancy of an instance from host to dedicated, or from dedicated to host.   Move an instance to or from a placement group.   At least one attribute for affinity, host ID, tenancy, or placement group name must be specified in the request. Affinity and tenancy can be modified in the same request. To modify the host ID, tenancy, placement group, or partition for an instance, the instance must be in the stopped state.
    */
  def modifyInstancePlacement(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyInstancePlacementResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyInstancePlacement(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyInstancePlacementResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyInstancePlacementResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the placement attributes for a specified instance. You can do the following:   Modify the affinity between an instance and a Dedicated Host. When affinity is set to host and the instance is not associated with a specific Dedicated Host, the next time the instance is launched, it is automatically associated with the host on which it lands. If the instance is restarted or rebooted, this relationship persists.   Change the Dedicated Host with which an instance is associated.   Change the instance tenancy of an instance from host to dedicated, or from dedicated to host.   Move an instance to or from a placement group.   At least one attribute for affinity, host ID, tenancy, or placement group name must be specified in the request. Affinity and tenancy can be modified in the same request. To modify the host ID, tenancy, placement group, or partition for an instance, the instance must be in the stopped state.
    */
  def modifyInstancePlacement(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyInstancePlacementRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyInstancePlacementResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyInstancePlacement(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyInstancePlacementRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyInstancePlacementResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyInstancePlacementResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies a launch template. You can specify which version of the launch template to set as the default version. When launching an instance, the default version applies when a launch template version is not specified.
    */
  def modifyLaunchTemplate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyLaunchTemplateResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyLaunchTemplate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyLaunchTemplateResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyLaunchTemplateResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies a launch template. You can specify which version of the launch template to set as the default version. When launching an instance, the default version applies when a launch template version is not specified.
    */
  def modifyLaunchTemplate(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyLaunchTemplateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyLaunchTemplateResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyLaunchTemplate(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyLaunchTemplateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyLaunchTemplateResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyLaunchTemplateResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the specified network interface attribute. You can specify only one attribute at a time.
    */
  def modifyNetworkInterfaceAttribute(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyNetworkInterfaceAttribute(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the specified network interface attribute. You can specify only one attribute at a time.
    */
  def modifyNetworkInterfaceAttribute(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyNetworkInterfaceAttributeRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyNetworkInterfaceAttribute(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyNetworkInterfaceAttributeRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the Availability Zone, instance count, instance type, or network platform (EC2-Classic or EC2-VPC) of your Reserved Instances. The Reserved Instances to be modified must be identical, except for Availability Zone, network platform, and instance type. For more information, see Modifying Reserved Instances in the Amazon Elastic Compute Cloud User Guide.
    */
  def modifyReservedInstances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyReservedInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyReservedInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyReservedInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyReservedInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the Availability Zone, instance count, instance type, or network platform (EC2-Classic or EC2-VPC) of your Reserved Instances. The Reserved Instances to be modified must be identical, except for Availability Zone, network platform, and instance type. For more information, see Modifying Reserved Instances in the Amazon Elastic Compute Cloud User Guide.
    */
  def modifyReservedInstances(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyReservedInstancesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyReservedInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyReservedInstances(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyReservedInstancesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyReservedInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyReservedInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds or removes permission settings for the specified snapshot. You may add or remove specified AWS account IDs from a snapshot's list of create volume permissions, but you cannot do both in a single API call. If you need to both add and remove account IDs for a snapshot, you must use multiple API calls. Encrypted snapshots and snapshots with AWS Marketplace product codes cannot be made public. Snapshots encrypted with your default CMK cannot be shared with other accounts. For more information about modifying snapshot permissions, see Sharing Snapshots in the Amazon Elastic Compute Cloud User Guide.
    */
  def modifySnapshotAttribute(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifySnapshotAttribute(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds or removes permission settings for the specified snapshot. You may add or remove specified AWS account IDs from a snapshot's list of create volume permissions, but you cannot do both in a single API call. If you need to both add and remove account IDs for a snapshot, you must use multiple API calls. Encrypted snapshots and snapshots with AWS Marketplace product codes cannot be made public. Snapshots encrypted with your default CMK cannot be shared with other accounts. For more information about modifying snapshot permissions, see Sharing Snapshots in the Amazon Elastic Compute Cloud User Guide.
    */
  def modifySnapshotAttribute(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifySnapshotAttributeRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifySnapshotAttribute(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifySnapshotAttributeRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the specified Spot Fleet request. While the Spot Fleet request is being modified, it is in the modifying state. To scale up your Spot Fleet, increase its target capacity. The Spot Fleet launches the additional Spot Instances according to the allocation strategy for the Spot Fleet request. If the allocation strategy is lowestPrice, the Spot Fleet launches instances using the Spot pool with the lowest price. If the allocation strategy is diversified, the Spot Fleet distributes the instances across the Spot pools. To scale down your Spot Fleet, decrease its target capacity. First, the Spot Fleet cancels any open requests that exceed the new target capacity. You can request that the Spot Fleet terminate Spot Instances until the size of the fleet no longer exceeds the new target capacity. If the allocation strategy is lowestPrice, the Spot Fleet terminates the instances with the highest price per unit. If the allocation strategy is diversified, the Spot Fleet terminates instances across the Spot pools. Alternatively, you can request that the Spot Fleet keep the fleet at its current size, but not replace any Spot Instances that are interrupted or that you terminate manually. If you are finished with your Spot Fleet for now, but will use it again later, you can set the target capacity to 0.
    */
  def modifySpotFleetRequest(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifySpotFleetRequestResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifySpotFleetRequest(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifySpotFleetRequestResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifySpotFleetRequestResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the specified Spot Fleet request. While the Spot Fleet request is being modified, it is in the modifying state. To scale up your Spot Fleet, increase its target capacity. The Spot Fleet launches the additional Spot Instances according to the allocation strategy for the Spot Fleet request. If the allocation strategy is lowestPrice, the Spot Fleet launches instances using the Spot pool with the lowest price. If the allocation strategy is diversified, the Spot Fleet distributes the instances across the Spot pools. To scale down your Spot Fleet, decrease its target capacity. First, the Spot Fleet cancels any open requests that exceed the new target capacity. You can request that the Spot Fleet terminate Spot Instances until the size of the fleet no longer exceeds the new target capacity. If the allocation strategy is lowestPrice, the Spot Fleet terminates the instances with the highest price per unit. If the allocation strategy is diversified, the Spot Fleet terminates instances across the Spot pools. Alternatively, you can request that the Spot Fleet keep the fleet at its current size, but not replace any Spot Instances that are interrupted or that you terminate manually. If you are finished with your Spot Fleet for now, but will use it again later, you can set the target capacity to 0.
    */
  def modifySpotFleetRequest(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifySpotFleetRequestRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifySpotFleetRequestResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifySpotFleetRequest(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifySpotFleetRequestRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifySpotFleetRequestResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifySpotFleetRequestResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies a subnet attribute. You can only modify one attribute at a time.
    */
  def modifySubnetAttribute(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifySubnetAttribute(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies a subnet attribute. You can only modify one attribute at a time.
    */
  def modifySubnetAttribute(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifySubnetAttributeRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifySubnetAttribute(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifySubnetAttributeRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the specified VPC attachment.
    */
  def modifyTransitGatewayVpcAttachment(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyTransitGatewayVpcAttachmentResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyTransitGatewayVpcAttachment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyTransitGatewayVpcAttachmentResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyTransitGatewayVpcAttachmentResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the specified VPC attachment.
    */
  def modifyTransitGatewayVpcAttachment(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyTransitGatewayVpcAttachmentRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyTransitGatewayVpcAttachmentResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyTransitGatewayVpcAttachment(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyTransitGatewayVpcAttachmentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyTransitGatewayVpcAttachmentResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyTransitGatewayVpcAttachmentResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * You can modify several parameters of an existing EBS volume, including volume size, volume type, and IOPS capacity. If your EBS volume is attached to a current-generation EC2 instance type, you may be able to apply these changes without stopping the instance or detaching the volume from it. For more information about modifying an EBS volume running Linux, see Modifying the Size, IOPS, or Type of an EBS Volume on Linux. For more information about modifying an EBS volume running Windows, see Modifying the Size, IOPS, or Type of an EBS Volume on Windows.   When you complete a resize operation on your volume, you need to extend the volume's file-system size to take advantage of the new storage capacity. For information about extending a Linux file system, see Extending a Linux File System. For information about extending a Windows file system, see Extending a Windows File System.   You can use CloudWatch Events to check the status of a modification to an EBS volume. For information about CloudWatch Events, see the Amazon CloudWatch Events User Guide. You can also track the status of a modification using the DescribeVolumesModifications API. For information about tracking status changes using either method, see Monitoring Volume Modifications.  With previous-generation instance types, resizing an EBS volume may require detaching and reattaching the volume or stopping and restarting the instance. For more information, see Modifying the Size, IOPS, or Type of an EBS Volume on Linux and Modifying the Size, IOPS, or Type of an EBS Volume on Windows. If you reach the maximum volume modification rate per volume limit, you will need to wait at least six hours before applying further modifications to the affected EBS volume.
    */
  def modifyVolume(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVolumeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyVolume(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVolumeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVolumeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * You can modify several parameters of an existing EBS volume, including volume size, volume type, and IOPS capacity. If your EBS volume is attached to a current-generation EC2 instance type, you may be able to apply these changes without stopping the instance or detaching the volume from it. For more information about modifying an EBS volume running Linux, see Modifying the Size, IOPS, or Type of an EBS Volume on Linux. For more information about modifying an EBS volume running Windows, see Modifying the Size, IOPS, or Type of an EBS Volume on Windows.   When you complete a resize operation on your volume, you need to extend the volume's file-system size to take advantage of the new storage capacity. For information about extending a Linux file system, see Extending a Linux File System. For information about extending a Windows file system, see Extending a Windows File System.   You can use CloudWatch Events to check the status of a modification to an EBS volume. For information about CloudWatch Events, see the Amazon CloudWatch Events User Guide. You can also track the status of a modification using the DescribeVolumesModifications API. For information about tracking status changes using either method, see Monitoring Volume Modifications.  With previous-generation instance types, resizing an EBS volume may require detaching and reattaching the volume or stopping and restarting the instance. For more information, see Modifying the Size, IOPS, or Type of an EBS Volume on Linux and Modifying the Size, IOPS, or Type of an EBS Volume on Windows. If you reach the maximum volume modification rate per volume limit, you will need to wait at least six hours before applying further modifications to the affected EBS volume.
    */
  def modifyVolume(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVolumeRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVolumeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyVolume(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVolumeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVolumeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVolumeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies a volume attribute. By default, all I/O operations for the volume are suspended when the data on the volume is determined to be potentially inconsistent, to prevent undetectable, latent data corruption. The I/O access to the volume can be resumed by first enabling I/O access and then checking the data consistency on your volume. You can change the default behavior to resume I/O operations. We recommend that you change this only for boot volumes or for volumes that are stateless or disposable.
    */
  def modifyVolumeAttribute(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyVolumeAttribute(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies a volume attribute. By default, all I/O operations for the volume are suspended when the data on the volume is determined to be potentially inconsistent, to prevent undetectable, latent data corruption. The I/O access to the volume can be resumed by first enabling I/O access and then checking the data consistency on your volume. You can change the default behavior to resume I/O operations. We recommend that you change this only for boot volumes or for volumes that are stateless or disposable.
    */
  def modifyVolumeAttribute(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVolumeAttributeRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyVolumeAttribute(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVolumeAttributeRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the specified attribute of the specified VPC.
    */
  def modifyVpcAttribute(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyVpcAttribute(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the specified attribute of the specified VPC.
    */
  def modifyVpcAttribute(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcAttributeRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyVpcAttribute(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcAttributeRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies attributes of a specified VPC endpoint. The attributes that you can modify depend on the type of VPC endpoint (interface or gateway). For more information, see VPC Endpoints in the Amazon Virtual Private Cloud User Guide.
    */
  def modifyVpcEndpoint(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcEndpointResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyVpcEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcEndpointResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcEndpointResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies attributes of a specified VPC endpoint. The attributes that you can modify depend on the type of VPC endpoint (interface or gateway). For more information, see VPC Endpoints in the Amazon Virtual Private Cloud User Guide.
    */
  def modifyVpcEndpoint(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcEndpointRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcEndpointResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyVpcEndpoint(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcEndpointRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcEndpointResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcEndpointResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies a connection notification for VPC endpoint or VPC endpoint service. You can change the SNS topic for the notification, or the events for which to be notified. 
    */
  def modifyVpcEndpointConnectionNotification(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcEndpointConnectionNotificationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyVpcEndpointConnectionNotification(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcEndpointConnectionNotificationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcEndpointConnectionNotificationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies a connection notification for VPC endpoint or VPC endpoint service. You can change the SNS topic for the notification, or the events for which to be notified. 
    */
  def modifyVpcEndpointConnectionNotification(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcEndpointConnectionNotificationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcEndpointConnectionNotificationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyVpcEndpointConnectionNotification(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcEndpointConnectionNotificationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcEndpointConnectionNotificationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcEndpointConnectionNotificationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the attributes of your VPC endpoint service configuration. You can change the Network Load Balancers for your service, and you can specify whether acceptance is required for requests to connect to your endpoint service through an interface VPC endpoint.
    */
  def modifyVpcEndpointServiceConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcEndpointServiceConfigurationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyVpcEndpointServiceConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcEndpointServiceConfigurationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcEndpointServiceConfigurationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the attributes of your VPC endpoint service configuration. You can change the Network Load Balancers for your service, and you can specify whether acceptance is required for requests to connect to your endpoint service through an interface VPC endpoint.
    */
  def modifyVpcEndpointServiceConfiguration(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcEndpointServiceConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcEndpointServiceConfigurationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyVpcEndpointServiceConfiguration(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcEndpointServiceConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcEndpointServiceConfigurationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcEndpointServiceConfigurationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the permissions for your VPC endpoint service. You can add or remove permissions for service consumers (IAM users, IAM roles, and AWS accounts) to connect to your endpoint service. If you grant permissions to all principals, the service is public. Any users who know the name of a public service can send a request to attach an endpoint. If the service does not require manual approval, attachments are automatically approved.
    */
  def modifyVpcEndpointServicePermissions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcEndpointServicePermissionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyVpcEndpointServicePermissions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcEndpointServicePermissionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcEndpointServicePermissionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the permissions for your VPC endpoint service. You can add or remove permissions for service consumers (IAM users, IAM roles, and AWS accounts) to connect to your endpoint service. If you grant permissions to all principals, the service is public. Any users who know the name of a public service can send a request to attach an endpoint. If the service does not require manual approval, attachments are automatically approved.
    */
  def modifyVpcEndpointServicePermissions(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcEndpointServicePermissionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcEndpointServicePermissionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyVpcEndpointServicePermissions(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcEndpointServicePermissionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcEndpointServicePermissionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcEndpointServicePermissionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the VPC peering connection options on one side of a VPC peering connection. You can do the following:   Enable/disable communication over the peering connection between an EC2-Classic instance that's linked to your VPC (using ClassicLink) and instances in the peer VPC.   Enable/disable communication over the peering connection between instances in your VPC and an EC2-Classic instance that's linked to the peer VPC.   Enable/disable the ability to resolve public DNS hostnames to private IP addresses when queried from instances in the peer VPC.   If the peered VPCs are in the same AWS account, you can enable DNS resolution for queries from the local VPC. This ensures that queries from the local VPC resolve to private IP addresses in the peer VPC. This option is not available if the peered VPCs are in different AWS accounts or different regions. For peered VPCs in different AWS accounts, each AWS account owner must initiate a separate request to modify the peering connection options. For inter-region peering connections, you must use the region for the requester VPC to modify the requester VPC peering options and the region for the accepter VPC to modify the accepter VPC peering options. To verify which VPCs are the accepter and the requester for a VPC peering connection, use the DescribeVpcPeeringConnections command.
    */
  def modifyVpcPeeringConnectionOptions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcPeeringConnectionOptionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyVpcPeeringConnectionOptions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcPeeringConnectionOptionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcPeeringConnectionOptionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the VPC peering connection options on one side of a VPC peering connection. You can do the following:   Enable/disable communication over the peering connection between an EC2-Classic instance that's linked to your VPC (using ClassicLink) and instances in the peer VPC.   Enable/disable communication over the peering connection between instances in your VPC and an EC2-Classic instance that's linked to the peer VPC.   Enable/disable the ability to resolve public DNS hostnames to private IP addresses when queried from instances in the peer VPC.   If the peered VPCs are in the same AWS account, you can enable DNS resolution for queries from the local VPC. This ensures that queries from the local VPC resolve to private IP addresses in the peer VPC. This option is not available if the peered VPCs are in different AWS accounts or different regions. For peered VPCs in different AWS accounts, each AWS account owner must initiate a separate request to modify the peering connection options. For inter-region peering connections, you must use the region for the requester VPC to modify the requester VPC peering options and the region for the accepter VPC to modify the accepter VPC peering options. To verify which VPCs are the accepter and the requester for a VPC peering connection, use the DescribeVpcPeeringConnections command.
    */
  def modifyVpcPeeringConnectionOptions(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcPeeringConnectionOptionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcPeeringConnectionOptionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyVpcPeeringConnectionOptions(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcPeeringConnectionOptionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcPeeringConnectionOptionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcPeeringConnectionOptionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the instance tenancy attribute of the specified VPC. You can change the instance tenancy attribute of a VPC to default only. You cannot change the instance tenancy attribute to dedicated. After you modify the tenancy of the VPC, any new instances that you launch into the VPC have a tenancy of default, unless you specify otherwise during launch. The tenancy of any existing instances in the VPC is not affected. For more information, see Dedicated Instances in the Amazon Elastic Compute Cloud User Guide.
    */
  def modifyVpcTenancy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcTenancyResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyVpcTenancy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcTenancyResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcTenancyResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the instance tenancy attribute of the specified VPC. You can change the instance tenancy attribute of a VPC to default only. You cannot change the instance tenancy attribute to dedicated. After you modify the tenancy of the VPC, any new instances that you launch into the VPC have a tenancy of default, unless you specify otherwise during launch. The tenancy of any existing instances in the VPC is not affected. For more information, see Dedicated Instances in the Amazon Elastic Compute Cloud User Guide.
    */
  def modifyVpcTenancy(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcTenancyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcTenancyResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyVpcTenancy(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcTenancyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcTenancyResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ModifyVpcTenancyResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Enables detailed monitoring for a running instance. Otherwise, basic monitoring is enabled. For more information, see Monitoring Your Instances and Volumes in the Amazon Elastic Compute Cloud User Guide. To disable detailed monitoring, see .
    */
  def monitorInstances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.MonitorInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def monitorInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.MonitorInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.MonitorInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Enables detailed monitoring for a running instance. Otherwise, basic monitoring is enabled. For more information, see Monitoring Your Instances and Volumes in the Amazon Elastic Compute Cloud User Guide. To disable detailed monitoring, see .
    */
  def monitorInstances(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.MonitorInstancesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.MonitorInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def monitorInstances(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.MonitorInstancesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.MonitorInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.MonitorInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Moves an Elastic IP address from the EC2-Classic platform to the EC2-VPC platform. The Elastic IP address must be allocated to your account for more than 24 hours, and it must not be associated with an instance. After the Elastic IP address is moved, it is no longer available for use in the EC2-Classic platform, unless you move it back using the RestoreAddressToClassic request. You cannot move an Elastic IP address that was originally allocated for use in the EC2-VPC platform to the EC2-Classic platform. 
    */
  def moveAddressToVpc(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.MoveAddressToVpcResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def moveAddressToVpc(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.MoveAddressToVpcResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.MoveAddressToVpcResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Moves an Elastic IP address from the EC2-Classic platform to the EC2-VPC platform. The Elastic IP address must be allocated to your account for more than 24 hours, and it must not be associated with an instance. After the Elastic IP address is moved, it is no longer available for use in the EC2-Classic platform, unless you move it back using the RestoreAddressToClassic request. You cannot move an Elastic IP address that was originally allocated for use in the EC2-VPC platform to the EC2-Classic platform. 
    */
  def moveAddressToVpc(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.MoveAddressToVpcRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.MoveAddressToVpcResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def moveAddressToVpc(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.MoveAddressToVpcRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.MoveAddressToVpcResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.MoveAddressToVpcResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provisions an address range for use with your AWS resources through bring your own IP addresses (BYOIP) and creates a corresponding address pool. After the address range is provisioned, it is ready to be advertised using AdvertiseByoipCidr. AWS verifies that you own the address range and are authorized to advertise it. You must ensure that the address range is registered to you and that you created an RPKI ROA to authorize Amazon ASNs 16509 and 14618 to advertise the address range. For more information, see Bring Your Own IP Addresses (BYOIP) in the Amazon Elastic Compute Cloud User Guide. Provisioning an address range is an asynchronous operation, so the call returns immediately, but the address range is not ready to use until its status changes from pending-provision to provisioned. To monitor the status of an address range, use DescribeByoipCidrs. To allocate an Elastic IP address from your address pool, use AllocateAddress with either the specific address from the address pool or the ID of the address pool.
    */
  def provisionByoipCidr(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ProvisionByoipCidrResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def provisionByoipCidr(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ProvisionByoipCidrResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ProvisionByoipCidrResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provisions an address range for use with your AWS resources through bring your own IP addresses (BYOIP) and creates a corresponding address pool. After the address range is provisioned, it is ready to be advertised using AdvertiseByoipCidr. AWS verifies that you own the address range and are authorized to advertise it. You must ensure that the address range is registered to you and that you created an RPKI ROA to authorize Amazon ASNs 16509 and 14618 to advertise the address range. For more information, see Bring Your Own IP Addresses (BYOIP) in the Amazon Elastic Compute Cloud User Guide. Provisioning an address range is an asynchronous operation, so the call returns immediately, but the address range is not ready to use until its status changes from pending-provision to provisioned. To monitor the status of an address range, use DescribeByoipCidrs. To allocate an Elastic IP address from your address pool, use AllocateAddress with either the specific address from the address pool or the ID of the address pool.
    */
  def provisionByoipCidr(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ProvisionByoipCidrRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ProvisionByoipCidrResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def provisionByoipCidr(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ProvisionByoipCidrRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ProvisionByoipCidrResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ProvisionByoipCidrResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Purchase a reservation with configurations that match those of your Dedicated Host. You must have active Dedicated Hosts in your account before you purchase a reservation. This action results in the specified reservation being purchased and charged to your account.
    */
  def purchaseHostReservation(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.PurchaseHostReservationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def purchaseHostReservation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.PurchaseHostReservationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.PurchaseHostReservationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Purchase a reservation with configurations that match those of your Dedicated Host. You must have active Dedicated Hosts in your account before you purchase a reservation. This action results in the specified reservation being purchased and charged to your account.
    */
  def purchaseHostReservation(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.PurchaseHostReservationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.PurchaseHostReservationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def purchaseHostReservation(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.PurchaseHostReservationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.PurchaseHostReservationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.PurchaseHostReservationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Purchases a Reserved Instance for use with your account. With Reserved Instances, you pay a lower hourly rate compared to On-Demand instance pricing. Use DescribeReservedInstancesOfferings to get a list of Reserved Instance offerings that match your specifications. After you've purchased a Reserved Instance, you can check for your new Reserved Instance with DescribeReservedInstances. For more information, see Reserved Instances and Reserved Instance Marketplace in the Amazon Elastic Compute Cloud User Guide.
    */
  def purchaseReservedInstancesOffering(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.PurchaseReservedInstancesOfferingResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def purchaseReservedInstancesOffering(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.PurchaseReservedInstancesOfferingResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.PurchaseReservedInstancesOfferingResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Purchases a Reserved Instance for use with your account. With Reserved Instances, you pay a lower hourly rate compared to On-Demand instance pricing. Use DescribeReservedInstancesOfferings to get a list of Reserved Instance offerings that match your specifications. After you've purchased a Reserved Instance, you can check for your new Reserved Instance with DescribeReservedInstances. For more information, see Reserved Instances and Reserved Instance Marketplace in the Amazon Elastic Compute Cloud User Guide.
    */
  def purchaseReservedInstancesOffering(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.PurchaseReservedInstancesOfferingRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.PurchaseReservedInstancesOfferingResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def purchaseReservedInstancesOffering(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.PurchaseReservedInstancesOfferingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.PurchaseReservedInstancesOfferingResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.PurchaseReservedInstancesOfferingResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Purchases one or more Scheduled Instances with the specified schedule. Scheduled Instances enable you to purchase Amazon EC2 compute capacity by the hour for a one-year term. Before you can purchase a Scheduled Instance, you must call DescribeScheduledInstanceAvailability to check for available schedules and obtain a purchase token. After you purchase a Scheduled Instance, you must call RunScheduledInstances during each scheduled time period. After you purchase a Scheduled Instance, you can't cancel, modify, or resell your purchase.
    */
  def purchaseScheduledInstances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.PurchaseScheduledInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def purchaseScheduledInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.PurchaseScheduledInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.PurchaseScheduledInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Purchases one or more Scheduled Instances with the specified schedule. Scheduled Instances enable you to purchase Amazon EC2 compute capacity by the hour for a one-year term. Before you can purchase a Scheduled Instance, you must call DescribeScheduledInstanceAvailability to check for available schedules and obtain a purchase token. After you purchase a Scheduled Instance, you must call RunScheduledInstances during each scheduled time period. After you purchase a Scheduled Instance, you can't cancel, modify, or resell your purchase.
    */
  def purchaseScheduledInstances(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.PurchaseScheduledInstancesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.PurchaseScheduledInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def purchaseScheduledInstances(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.PurchaseScheduledInstancesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.PurchaseScheduledInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.PurchaseScheduledInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Requests a reboot of one or more instances. This operation is asynchronous; it only queues a request to reboot the specified instances. The operation succeeds if the instances are valid and belong to you. Requests to reboot terminated instances are ignored. If an instance does not cleanly shut down within four minutes, Amazon EC2 performs a hard reboot. For more information about troubleshooting, see Getting Console Output and Rebooting Instances in the Amazon Elastic Compute Cloud User Guide.
    */
  def rebootInstances(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def rebootInstances(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Requests a reboot of one or more instances. This operation is asynchronous; it only queues a request to reboot the specified instances. The operation succeeds if the instances are valid and belong to you. Requests to reboot terminated instances are ignored. If an instance does not cleanly shut down within four minutes, Amazon EC2 performs a hard reboot. For more information about troubleshooting, see Getting Console Output and Rebooting Instances in the Amazon Elastic Compute Cloud User Guide.
    */
  def rebootInstances(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.RebootInstancesRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def rebootInstances(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.RebootInstancesRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Registers an AMI. When you're creating an AMI, this is the final step you must complete before you can launch an instance from the AMI. For more information about creating AMIs, see Creating Your Own AMIs in the Amazon Elastic Compute Cloud User Guide.  For Amazon EBS-backed instances, CreateImage creates and registers the AMI in a single request, so you don't have to register the AMI yourself.  You can also use RegisterImage to create an Amazon EBS-backed Linux AMI from a snapshot of a root device volume. You specify the snapshot using the block device mapping. For more information, see Launching a Linux Instance from a Backup in the Amazon Elastic Compute Cloud User Guide. You can't register an image where a secondary (non-root) snapshot has AWS Marketplace product codes. Some Linux distributions, such as Red Hat Enterprise Linux (RHEL) and SUSE Linux Enterprise Server (SLES), use the EC2 billing product code associated with an AMI to verify the subscription status for package updates. Creating an AMI from an EBS snapshot does not maintain this billing code, and instances launched from such an AMI are not able to connect to package update infrastructure. If you purchase a Reserved Instance offering for one of these Linux distributions and launch instances using an AMI that does not contain the required billing code, your Reserved Instance is not applied to these instances. To create an AMI for operating systems that require a billing code, see CreateImage. If needed, you can deregister an AMI at any time. Any modifications you make to an AMI backed by an instance store volume invalidates its registration. If you make changes to an image, deregister the previous image and register the new image.
    */
  def registerImage(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.RegisterImageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def registerImage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.RegisterImageResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.RegisterImageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Registers an AMI. When you're creating an AMI, this is the final step you must complete before you can launch an instance from the AMI. For more information about creating AMIs, see Creating Your Own AMIs in the Amazon Elastic Compute Cloud User Guide.  For Amazon EBS-backed instances, CreateImage creates and registers the AMI in a single request, so you don't have to register the AMI yourself.  You can also use RegisterImage to create an Amazon EBS-backed Linux AMI from a snapshot of a root device volume. You specify the snapshot using the block device mapping. For more information, see Launching a Linux Instance from a Backup in the Amazon Elastic Compute Cloud User Guide. You can't register an image where a secondary (non-root) snapshot has AWS Marketplace product codes. Some Linux distributions, such as Red Hat Enterprise Linux (RHEL) and SUSE Linux Enterprise Server (SLES), use the EC2 billing product code associated with an AMI to verify the subscription status for package updates. Creating an AMI from an EBS snapshot does not maintain this billing code, and instances launched from such an AMI are not able to connect to package update infrastructure. If you purchase a Reserved Instance offering for one of these Linux distributions and launch instances using an AMI that does not contain the required billing code, your Reserved Instance is not applied to these instances. To create an AMI for operating systems that require a billing code, see CreateImage. If needed, you can deregister an AMI at any time. Any modifications you make to an AMI backed by an instance store volume invalidates its registration. If you make changes to an image, deregister the previous image and register the new image.
    */
  def registerImage(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.RegisterImageRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.RegisterImageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def registerImage(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.RegisterImageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.RegisterImageResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.RegisterImageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Rejects a request to attach a VPC to a transit gateway. The VPC attachment must be in the pendingAcceptance state. Use DescribeTransitGatewayVpcAttachments to view your pending VPC attachment requests. Use AcceptTransitGatewayVpcAttachment to accept a VPC attachment request.
    */
  def rejectTransitGatewayVpcAttachment(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.RejectTransitGatewayVpcAttachmentResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def rejectTransitGatewayVpcAttachment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.RejectTransitGatewayVpcAttachmentResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.RejectTransitGatewayVpcAttachmentResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Rejects a request to attach a VPC to a transit gateway. The VPC attachment must be in the pendingAcceptance state. Use DescribeTransitGatewayVpcAttachments to view your pending VPC attachment requests. Use AcceptTransitGatewayVpcAttachment to accept a VPC attachment request.
    */
  def rejectTransitGatewayVpcAttachment(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.RejectTransitGatewayVpcAttachmentRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.RejectTransitGatewayVpcAttachmentResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def rejectTransitGatewayVpcAttachment(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.RejectTransitGatewayVpcAttachmentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.RejectTransitGatewayVpcAttachmentResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.RejectTransitGatewayVpcAttachmentResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Rejects one or more VPC endpoint connection requests to your VPC endpoint service.
    */
  def rejectVpcEndpointConnections(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.RejectVpcEndpointConnectionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def rejectVpcEndpointConnections(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.RejectVpcEndpointConnectionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.RejectVpcEndpointConnectionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Rejects one or more VPC endpoint connection requests to your VPC endpoint service.
    */
  def rejectVpcEndpointConnections(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.RejectVpcEndpointConnectionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.RejectVpcEndpointConnectionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def rejectVpcEndpointConnections(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.RejectVpcEndpointConnectionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.RejectVpcEndpointConnectionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.RejectVpcEndpointConnectionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Rejects a VPC peering connection request. The VPC peering connection must be in the pending-acceptance state. Use the DescribeVpcPeeringConnections request to view your outstanding VPC peering connection requests. To delete an active VPC peering connection, or to delete a VPC peering connection request that you initiated, use DeleteVpcPeeringConnection.
    */
  def rejectVpcPeeringConnection(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.RejectVpcPeeringConnectionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def rejectVpcPeeringConnection(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.RejectVpcPeeringConnectionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.RejectVpcPeeringConnectionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Rejects a VPC peering connection request. The VPC peering connection must be in the pending-acceptance state. Use the DescribeVpcPeeringConnections request to view your outstanding VPC peering connection requests. To delete an active VPC peering connection, or to delete a VPC peering connection request that you initiated, use DeleteVpcPeeringConnection.
    */
  def rejectVpcPeeringConnection(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.RejectVpcPeeringConnectionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.RejectVpcPeeringConnectionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def rejectVpcPeeringConnection(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.RejectVpcPeeringConnectionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.RejectVpcPeeringConnectionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.RejectVpcPeeringConnectionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Releases the specified Elastic IP address. [EC2-Classic, default VPC] Releasing an Elastic IP address automatically disassociates it from any instance that it's associated with. To disassociate an Elastic IP address without releasing it, use DisassociateAddress. [Nondefault VPC] You must use DisassociateAddress to disassociate the Elastic IP address before you can release it. Otherwise, Amazon EC2 returns an error (InvalidIPAddress.InUse). After releasing an Elastic IP address, it is released to the IP address pool. Be sure to update your DNS records and any servers or devices that communicate with the address. If you attempt to release an Elastic IP address that you already released, you'll get an AuthFailure error if the address is already allocated to another AWS account. [EC2-VPC] After you release an Elastic IP address for use in a VPC, you might be able to recover it. For more information, see AllocateAddress.
    */
  def releaseAddress(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def releaseAddress(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Releases the specified Elastic IP address. [EC2-Classic, default VPC] Releasing an Elastic IP address automatically disassociates it from any instance that it's associated with. To disassociate an Elastic IP address without releasing it, use DisassociateAddress. [Nondefault VPC] You must use DisassociateAddress to disassociate the Elastic IP address before you can release it. Otherwise, Amazon EC2 returns an error (InvalidIPAddress.InUse). After releasing an Elastic IP address, it is released to the IP address pool. Be sure to update your DNS records and any servers or devices that communicate with the address. If you attempt to release an Elastic IP address that you already released, you'll get an AuthFailure error if the address is already allocated to another AWS account. [EC2-VPC] After you release an Elastic IP address for use in a VPC, you might be able to recover it. For more information, see AllocateAddress.
    */
  def releaseAddress(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ReleaseAddressRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def releaseAddress(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ReleaseAddressRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * When you no longer want to use an On-Demand Dedicated Host it can be released. On-Demand billing is stopped and the host goes into released state. The host ID of Dedicated Hosts that have been released can no longer be specified in another request, for example, to modify the host. You must stop or terminate all instances on a host before it can be released. When Dedicated Hosts are released, it may take some time for them to stop counting toward your limit and you may receive capacity errors when trying to allocate new Dedicated Hosts. Wait a few minutes and then try again. Released hosts still appear in a DescribeHosts response.
    */
  def releaseHosts(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ReleaseHostsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def releaseHosts(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ReleaseHostsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ReleaseHostsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * When you no longer want to use an On-Demand Dedicated Host it can be released. On-Demand billing is stopped and the host goes into released state. The host ID of Dedicated Hosts that have been released can no longer be specified in another request, for example, to modify the host. You must stop or terminate all instances on a host before it can be released. When Dedicated Hosts are released, it may take some time for them to stop counting toward your limit and you may receive capacity errors when trying to allocate new Dedicated Hosts. Wait a few minutes and then try again. Released hosts still appear in a DescribeHosts response.
    */
  def releaseHosts(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ReleaseHostsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ReleaseHostsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def releaseHosts(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ReleaseHostsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ReleaseHostsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ReleaseHostsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Replaces an IAM instance profile for the specified running instance. You can use this action to change the IAM instance profile that's associated with an instance without having to disassociate the existing IAM instance profile first. Use DescribeIamInstanceProfileAssociations to get the association ID.
    */
  def replaceIamInstanceProfileAssociation(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ReplaceIamInstanceProfileAssociationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def replaceIamInstanceProfileAssociation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ReplaceIamInstanceProfileAssociationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ReplaceIamInstanceProfileAssociationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Replaces an IAM instance profile for the specified running instance. You can use this action to change the IAM instance profile that's associated with an instance without having to disassociate the existing IAM instance profile first. Use DescribeIamInstanceProfileAssociations to get the association ID.
    */
  def replaceIamInstanceProfileAssociation(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ReplaceIamInstanceProfileAssociationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ReplaceIamInstanceProfileAssociationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def replaceIamInstanceProfileAssociation(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ReplaceIamInstanceProfileAssociationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ReplaceIamInstanceProfileAssociationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ReplaceIamInstanceProfileAssociationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Changes which network ACL a subnet is associated with. By default when you create a subnet, it's automatically associated with the default network ACL. For more information, see Network ACLs in the Amazon Virtual Private Cloud User Guide. This is an idempotent operation.
    */
  def replaceNetworkAclAssociation(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ReplaceNetworkAclAssociationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def replaceNetworkAclAssociation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ReplaceNetworkAclAssociationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ReplaceNetworkAclAssociationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Changes which network ACL a subnet is associated with. By default when you create a subnet, it's automatically associated with the default network ACL. For more information, see Network ACLs in the Amazon Virtual Private Cloud User Guide. This is an idempotent operation.
    */
  def replaceNetworkAclAssociation(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ReplaceNetworkAclAssociationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ReplaceNetworkAclAssociationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def replaceNetworkAclAssociation(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ReplaceNetworkAclAssociationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ReplaceNetworkAclAssociationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ReplaceNetworkAclAssociationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Replaces an entry (rule) in a network ACL. For more information, see Network ACLs in the Amazon Virtual Private Cloud User Guide.
    */
  def replaceNetworkAclEntry(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def replaceNetworkAclEntry(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Replaces an entry (rule) in a network ACL. For more information, see Network ACLs in the Amazon Virtual Private Cloud User Guide.
    */
  def replaceNetworkAclEntry(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ReplaceNetworkAclEntryRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def replaceNetworkAclEntry(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ReplaceNetworkAclEntryRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Replaces an existing route within a route table in a VPC. You must provide only one of the following: internet gateway or virtual private gateway, NAT instance, NAT gateway, VPC peering connection, network interface, or egress-only internet gateway. For more information, see Route Tables in the Amazon Virtual Private Cloud User Guide.
    */
  def replaceRoute(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def replaceRoute(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Replaces an existing route within a route table in a VPC. You must provide only one of the following: internet gateway or virtual private gateway, NAT instance, NAT gateway, VPC peering connection, network interface, or egress-only internet gateway. For more information, see Route Tables in the Amazon Virtual Private Cloud User Guide.
    */
  def replaceRoute(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ReplaceRouteRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def replaceRoute(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ReplaceRouteRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes the route table associated with a given subnet in a VPC. After the operation completes, the subnet uses the routes in the new route table it's associated with. For more information about route tables, see Route Tables in the Amazon Virtual Private Cloud User Guide. You can also use ReplaceRouteTableAssociation to change which table is the main route table in the VPC. You just specify the main route table's association ID and the route table to be the new main route table.
    */
  def replaceRouteTableAssociation(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ReplaceRouteTableAssociationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def replaceRouteTableAssociation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ReplaceRouteTableAssociationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ReplaceRouteTableAssociationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Changes the route table associated with a given subnet in a VPC. After the operation completes, the subnet uses the routes in the new route table it's associated with. For more information about route tables, see Route Tables in the Amazon Virtual Private Cloud User Guide. You can also use ReplaceRouteTableAssociation to change which table is the main route table in the VPC. You just specify the main route table's association ID and the route table to be the new main route table.
    */
  def replaceRouteTableAssociation(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ReplaceRouteTableAssociationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ReplaceRouteTableAssociationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def replaceRouteTableAssociation(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ReplaceRouteTableAssociationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ReplaceRouteTableAssociationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ReplaceRouteTableAssociationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Replaces the specified route in the specified transit gateway route table.
    */
  def replaceTransitGatewayRoute(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ReplaceTransitGatewayRouteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def replaceTransitGatewayRoute(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ReplaceTransitGatewayRouteResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ReplaceTransitGatewayRouteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Replaces the specified route in the specified transit gateway route table.
    */
  def replaceTransitGatewayRoute(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ReplaceTransitGatewayRouteRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ReplaceTransitGatewayRouteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def replaceTransitGatewayRoute(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ReplaceTransitGatewayRouteRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ReplaceTransitGatewayRouteResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ReplaceTransitGatewayRouteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Submits feedback about the status of an instance. The instance must be in the running state. If your experience with the instance differs from the instance status returned by DescribeInstanceStatus, use ReportInstanceStatus to report your experience with the instance. Amazon EC2 collects this information to improve the accuracy of status checks. Use of this action does not change the value returned by DescribeInstanceStatus.
    */
  def reportInstanceStatus(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def reportInstanceStatus(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Submits feedback about the status of an instance. The instance must be in the running state. If your experience with the instance differs from the instance status returned by DescribeInstanceStatus, use ReportInstanceStatus to report your experience with the instance. Amazon EC2 collects this information to improve the accuracy of status checks. Use of this action does not change the value returned by DescribeInstanceStatus.
    */
  def reportInstanceStatus(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ReportInstanceStatusRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def reportInstanceStatus(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ReportInstanceStatusRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a Spot Fleet request. The Spot Fleet request specifies the total target capacity and the On-Demand target capacity. Amazon EC2 calculates the difference between the total capacity and On-Demand capacity, and launches the difference as Spot capacity. You can submit a single request that includes multiple launch specifications that vary by instance type, AMI, Availability Zone, or subnet. By default, the Spot Fleet requests Spot Instances in the Spot pool where the price per unit is the lowest. Each launch specification can include its own instance weighting that reflects the value of the instance type to your application workload. Alternatively, you can specify that the Spot Fleet distribute the target capacity across the Spot pools included in its launch specifications. By ensuring that the Spot Instances in your Spot Fleet are in different Spot pools, you can improve the availability of your fleet. You can specify tags for the Spot Instances. You cannot tag other resource types in a Spot Fleet request because only the instance resource type is supported. For more information, see Spot Fleet Requests in the Amazon EC2 User Guide for Linux Instances.
    */
  def requestSpotFleet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.RequestSpotFleetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def requestSpotFleet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.RequestSpotFleetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.RequestSpotFleetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a Spot Fleet request. The Spot Fleet request specifies the total target capacity and the On-Demand target capacity. Amazon EC2 calculates the difference between the total capacity and On-Demand capacity, and launches the difference as Spot capacity. You can submit a single request that includes multiple launch specifications that vary by instance type, AMI, Availability Zone, or subnet. By default, the Spot Fleet requests Spot Instances in the Spot pool where the price per unit is the lowest. Each launch specification can include its own instance weighting that reflects the value of the instance type to your application workload. Alternatively, you can specify that the Spot Fleet distribute the target capacity across the Spot pools included in its launch specifications. By ensuring that the Spot Instances in your Spot Fleet are in different Spot pools, you can improve the availability of your fleet. You can specify tags for the Spot Instances. You cannot tag other resource types in a Spot Fleet request because only the instance resource type is supported. For more information, see Spot Fleet Requests in the Amazon EC2 User Guide for Linux Instances.
    */
  def requestSpotFleet(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.RequestSpotFleetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.RequestSpotFleetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def requestSpotFleet(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.RequestSpotFleetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.RequestSpotFleetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.RequestSpotFleetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a Spot Instance request. For more information, see Spot Instance Requests in the Amazon EC2 User Guide for Linux Instances.
    */
  def requestSpotInstances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.RequestSpotInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def requestSpotInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.RequestSpotInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.RequestSpotInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a Spot Instance request. For more information, see Spot Instance Requests in the Amazon EC2 User Guide for Linux Instances.
    */
  def requestSpotInstances(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.RequestSpotInstancesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.RequestSpotInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def requestSpotInstances(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.RequestSpotInstancesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.RequestSpotInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.RequestSpotInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Resets the specified attribute of the specified Amazon FPGA Image (AFI) to its default value. You can only reset the load permission attribute.
    */
  def resetFpgaImageAttribute(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ResetFpgaImageAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def resetFpgaImageAttribute(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ResetFpgaImageAttributeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ResetFpgaImageAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Resets the specified attribute of the specified Amazon FPGA Image (AFI) to its default value. You can only reset the load permission attribute.
    */
  def resetFpgaImageAttribute(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ResetFpgaImageAttributeRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ResetFpgaImageAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def resetFpgaImageAttribute(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ResetFpgaImageAttributeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.ResetFpgaImageAttributeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.ResetFpgaImageAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Resets an attribute of an AMI to its default value.  The productCodes attribute can't be reset. 
    */
  def resetImageAttribute(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def resetImageAttribute(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Resets an attribute of an AMI to its default value.  The productCodes attribute can't be reset. 
    */
  def resetImageAttribute(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ResetImageAttributeRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def resetImageAttribute(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ResetImageAttributeRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Resets an attribute of an instance to its default value. To reset the kernel or ramdisk, the instance must be in a stopped state. To reset the sourceDestCheck, the instance can be either running or stopped. The sourceDestCheck attribute controls whether source/destination checking is enabled. The default value is true, which means checking is enabled. This value must be false for a NAT instance to perform NAT. For more information, see NAT Instances in the Amazon Virtual Private Cloud User Guide.
    */
  def resetInstanceAttribute(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def resetInstanceAttribute(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Resets an attribute of an instance to its default value. To reset the kernel or ramdisk, the instance must be in a stopped state. To reset the sourceDestCheck, the instance can be either running or stopped. The sourceDestCheck attribute controls whether source/destination checking is enabled. The default value is true, which means checking is enabled. This value must be false for a NAT instance to perform NAT. For more information, see NAT Instances in the Amazon Virtual Private Cloud User Guide.
    */
  def resetInstanceAttribute(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ResetInstanceAttributeRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def resetInstanceAttribute(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ResetInstanceAttributeRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Resets a network interface attribute. You can specify only one attribute at a time.
    */
  def resetNetworkInterfaceAttribute(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def resetNetworkInterfaceAttribute(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Resets a network interface attribute. You can specify only one attribute at a time.
    */
  def resetNetworkInterfaceAttribute(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ResetNetworkInterfaceAttributeRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def resetNetworkInterfaceAttribute(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ResetNetworkInterfaceAttributeRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Resets permission settings for the specified snapshot. For more information about modifying snapshot permissions, see Sharing Snapshots in the Amazon Elastic Compute Cloud User Guide.
    */
  def resetSnapshotAttribute(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def resetSnapshotAttribute(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Resets permission settings for the specified snapshot. For more information about modifying snapshot permissions, see Sharing Snapshots in the Amazon Elastic Compute Cloud User Guide.
    */
  def resetSnapshotAttribute(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ResetSnapshotAttributeRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def resetSnapshotAttribute(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.ResetSnapshotAttributeRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Restores an Elastic IP address that was previously moved to the EC2-VPC platform back to the EC2-Classic platform. You cannot move an Elastic IP address that was originally allocated for use in EC2-VPC. The Elastic IP address must not be associated with an instance or network interface.
    */
  def restoreAddressToClassic(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.RestoreAddressToClassicResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def restoreAddressToClassic(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.RestoreAddressToClassicResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.RestoreAddressToClassicResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Restores an Elastic IP address that was previously moved to the EC2-VPC platform back to the EC2-Classic platform. You cannot move an Elastic IP address that was originally allocated for use in EC2-VPC. The Elastic IP address must not be associated with an instance or network interface.
    */
  def restoreAddressToClassic(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.RestoreAddressToClassicRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.RestoreAddressToClassicResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def restoreAddressToClassic(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.RestoreAddressToClassicRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.RestoreAddressToClassicResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.RestoreAddressToClassicResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes an ingress authorization rule from a Client VPN endpoint. 
    */
  def revokeClientVpnIngress(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.RevokeClientVpnIngressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def revokeClientVpnIngress(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.RevokeClientVpnIngressResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.RevokeClientVpnIngressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes an ingress authorization rule from a Client VPN endpoint. 
    */
  def revokeClientVpnIngress(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.RevokeClientVpnIngressRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.RevokeClientVpnIngressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def revokeClientVpnIngress(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.RevokeClientVpnIngressRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.RevokeClientVpnIngressResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.RevokeClientVpnIngressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * [EC2-VPC only] Removes one or more egress rules from a security group for EC2-VPC. This action doesn't apply to security groups for use in EC2-Classic. To remove a rule, the values that you specify (for example, ports) must match the existing rule's values exactly. Each rule consists of the protocol and the IPv4 or IPv6 CIDR range or source security group. For the TCP and UDP protocols, you must also specify the destination port or range of ports. For the ICMP protocol, you must also specify the ICMP type and code. If the security group rule has a description, you do not have to specify the description to revoke the rule. Rule changes are propagated to instances within the security group as quickly as possible. However, a small delay might occur.
    */
  def revokeSecurityGroupEgress(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def revokeSecurityGroupEgress(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * [EC2-VPC only] Removes one or more egress rules from a security group for EC2-VPC. This action doesn't apply to security groups for use in EC2-Classic. To remove a rule, the values that you specify (for example, ports) must match the existing rule's values exactly. Each rule consists of the protocol and the IPv4 or IPv6 CIDR range or source security group. For the TCP and UDP protocols, you must also specify the destination port or range of ports. For the ICMP protocol, you must also specify the ICMP type and code. If the security group rule has a description, you do not have to specify the description to revoke the rule. Rule changes are propagated to instances within the security group as quickly as possible. However, a small delay might occur.
    */
  def revokeSecurityGroupEgress(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.RevokeSecurityGroupEgressRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def revokeSecurityGroupEgress(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.RevokeSecurityGroupEgressRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes one or more ingress rules from a security group. To remove a rule, the values that you specify (for example, ports) must match the existing rule's values exactly.  [EC2-Classic security groups only] If the values you specify do not match the existing rule's values, no error is returned. Use DescribeSecurityGroups to verify that the rule has been removed.  Each rule consists of the protocol and the CIDR range or source security group. For the TCP and UDP protocols, you must also specify the destination port or range of ports. For the ICMP protocol, you must also specify the ICMP type and code. If the security group rule has a description, you do not have to specify the description to revoke the rule. Rule changes are propagated to instances within the security group as quickly as possible. However, a small delay might occur.
    */
  def revokeSecurityGroupIngress(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def revokeSecurityGroupIngress(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes one or more ingress rules from a security group. To remove a rule, the values that you specify (for example, ports) must match the existing rule's values exactly.  [EC2-Classic security groups only] If the values you specify do not match the existing rule's values, no error is returned. Use DescribeSecurityGroups to verify that the rule has been removed.  Each rule consists of the protocol and the CIDR range or source security group. For the TCP and UDP protocols, you must also specify the destination port or range of ports. For the ICMP protocol, you must also specify the ICMP type and code. If the security group rule has a description, you do not have to specify the description to revoke the rule. Rule changes are propagated to instances within the security group as quickly as possible. However, a small delay might occur.
    */
  def revokeSecurityGroupIngress(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.RevokeSecurityGroupIngressRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def revokeSecurityGroupIngress(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.RevokeSecurityGroupIngressRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Launches the specified number of instances using an AMI for which you have permissions.  You can specify a number of options, or leave the default options. The following rules apply:   [EC2-VPC] If you don't specify a subnet ID, we choose a default subnet from your default VPC for you. If you don't have a default VPC, you must specify a subnet ID in the request.   [EC2-Classic] If don't specify an Availability Zone, we choose one for you.   Some instance types must be launched into a VPC. If you do not have a default VPC, or if you do not specify a subnet ID, the request fails. For more information, see Instance Types Available Only in a VPC.   [EC2-VPC] All instances have a network interface with a primary private IPv4 address. If you don't specify this address, we choose one from the IPv4 range of your subnet.   Not all instance types support IPv6 addresses. For more information, see Instance Types.   If you don't specify a security group ID, we use the default security group. For more information, see Security Groups.   If any of the AMIs have a product code attached for which the user has not subscribed, the request fails.   You can create a launch template, which is a resource that contains the parameters to launch an instance. When you launch an instance using RunInstances, you can specify the launch template instead of specifying the launch parameters. To ensure faster instance launches, break up large requests into smaller batches. For example, create five separate launch requests for 100 instances each instead of one launch request for 500 instances. An instance is ready for you to use when it's in the running state. You can check the state of your instance using DescribeInstances. You can tag instances and EBS volumes during launch, after launch, or both. For more information, see CreateTags and Tagging Your Amazon EC2 Resources. Linux instances have access to the public key of the key pair at boot. You can use this key to provide secure access to the instance. Amazon EC2 public images use this feature to provide secure access without passwords. For more information, see Key Pairs in the Amazon Elastic Compute Cloud User Guide. For troubleshooting, see What To Do If An Instance Immediately Terminates, and Troubleshooting Connecting to Your Instance in the Amazon Elastic Compute Cloud User Guide.
    */
  def runInstances(): awsDashSdkLib.libRequestMod.Request[awsDashSdkLib.clientsEc2Mod.EC2Ns.Reservation, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def runInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.Reservation, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[awsDashSdkLib.clientsEc2Mod.EC2Ns.Reservation, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Launches the specified number of instances using an AMI for which you have permissions.  You can specify a number of options, or leave the default options. The following rules apply:   [EC2-VPC] If you don't specify a subnet ID, we choose a default subnet from your default VPC for you. If you don't have a default VPC, you must specify a subnet ID in the request.   [EC2-Classic] If don't specify an Availability Zone, we choose one for you.   Some instance types must be launched into a VPC. If you do not have a default VPC, or if you do not specify a subnet ID, the request fails. For more information, see Instance Types Available Only in a VPC.   [EC2-VPC] All instances have a network interface with a primary private IPv4 address. If you don't specify this address, we choose one from the IPv4 range of your subnet.   Not all instance types support IPv6 addresses. For more information, see Instance Types.   If you don't specify a security group ID, we use the default security group. For more information, see Security Groups.   If any of the AMIs have a product code attached for which the user has not subscribed, the request fails.   You can create a launch template, which is a resource that contains the parameters to launch an instance. When you launch an instance using RunInstances, you can specify the launch template instead of specifying the launch parameters. To ensure faster instance launches, break up large requests into smaller batches. For example, create five separate launch requests for 100 instances each instead of one launch request for 500 instances. An instance is ready for you to use when it's in the running state. You can check the state of your instance using DescribeInstances. You can tag instances and EBS volumes during launch, after launch, or both. For more information, see CreateTags and Tagging Your Amazon EC2 Resources. Linux instances have access to the public key of the key pair at boot. You can use this key to provide secure access to the instance. Amazon EC2 public images use this feature to provide secure access without passwords. For more information, see Key Pairs in the Amazon Elastic Compute Cloud User Guide. For troubleshooting, see What To Do If An Instance Immediately Terminates, and Troubleshooting Connecting to Your Instance in the Amazon Elastic Compute Cloud User Guide.
    */
  def runInstances(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.RunInstancesRequest): awsDashSdkLib.libRequestMod.Request[awsDashSdkLib.clientsEc2Mod.EC2Ns.Reservation, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def runInstances(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.RunInstancesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.Reservation, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[awsDashSdkLib.clientsEc2Mod.EC2Ns.Reservation, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Launches the specified Scheduled Instances. Before you can launch a Scheduled Instance, you must purchase it and obtain an identifier using PurchaseScheduledInstances. You must launch a Scheduled Instance during its scheduled time period. You can't stop or reboot a Scheduled Instance, but you can terminate it as needed. If you terminate a Scheduled Instance before the current scheduled time period ends, you can launch it again after a few minutes. For more information, see Scheduled Instances in the Amazon Elastic Compute Cloud User Guide.
    */
  def runScheduledInstances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.RunScheduledInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def runScheduledInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.RunScheduledInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.RunScheduledInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Launches the specified Scheduled Instances. Before you can launch a Scheduled Instance, you must purchase it and obtain an identifier using PurchaseScheduledInstances. You must launch a Scheduled Instance during its scheduled time period. You can't stop or reboot a Scheduled Instance, but you can terminate it as needed. If you terminate a Scheduled Instance before the current scheduled time period ends, you can launch it again after a few minutes. For more information, see Scheduled Instances in the Amazon Elastic Compute Cloud User Guide.
    */
  def runScheduledInstances(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.RunScheduledInstancesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.RunScheduledInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def runScheduledInstances(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.RunScheduledInstancesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.RunScheduledInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.RunScheduledInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Searches for routes in the specified transit gateway route table.
    */
  def searchTransitGatewayRoutes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.SearchTransitGatewayRoutesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def searchTransitGatewayRoutes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.SearchTransitGatewayRoutesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.SearchTransitGatewayRoutesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Searches for routes in the specified transit gateway route table.
    */
  def searchTransitGatewayRoutes(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.SearchTransitGatewayRoutesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.SearchTransitGatewayRoutesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def searchTransitGatewayRoutes(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.SearchTransitGatewayRoutesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.SearchTransitGatewayRoutesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.SearchTransitGatewayRoutesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts an Amazon EBS-backed instance that you've previously stopped. Instances that use Amazon EBS volumes as their root devices can be quickly stopped and started. When an instance is stopped, the compute resources are released and you are not billed for instance usage. However, your root partition Amazon EBS volume remains and continues to persist your data, and you are charged for Amazon EBS volume usage. You can restart your instance at any time. Every time you start your Windows instance, Amazon EC2 charges you for a full instance hour. If you stop and restart your Windows instance, a new instance hour begins and Amazon EC2 charges you for another full instance hour even if you are still within the same 60-minute period when it was stopped. Every time you start your Linux instance, Amazon EC2 charges a one-minute minimum for instance usage, and thereafter charges per second for instance usage. Before stopping an instance, make sure it is in a state from which it can be restarted. Stopping an instance does not preserve data stored in RAM. Performing this operation on an instance that uses an instance store as its root device returns an error. For more information, see Stopping Instances in the Amazon Elastic Compute Cloud User Guide.
    */
  def startInstances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.StartInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.StartInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.StartInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts an Amazon EBS-backed instance that you've previously stopped. Instances that use Amazon EBS volumes as their root devices can be quickly stopped and started. When an instance is stopped, the compute resources are released and you are not billed for instance usage. However, your root partition Amazon EBS volume remains and continues to persist your data, and you are charged for Amazon EBS volume usage. You can restart your instance at any time. Every time you start your Windows instance, Amazon EC2 charges you for a full instance hour. If you stop and restart your Windows instance, a new instance hour begins and Amazon EC2 charges you for another full instance hour even if you are still within the same 60-minute period when it was stopped. Every time you start your Linux instance, Amazon EC2 charges a one-minute minimum for instance usage, and thereafter charges per second for instance usage. Before stopping an instance, make sure it is in a state from which it can be restarted. Stopping an instance does not preserve data stored in RAM. Performing this operation on an instance that uses an instance store as its root device returns an error. For more information, see Stopping Instances in the Amazon Elastic Compute Cloud User Guide.
    */
  def startInstances(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.StartInstancesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.StartInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startInstances(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.StartInstancesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.StartInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.StartInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops an Amazon EBS-backed instance. You can use the Stop action to hibernate an instance if the instance is enabled for hibernation and it meets the hibernation prerequisites. For more information, see Hibernate Your Instance in the Amazon Elastic Compute Cloud User Guide. We don't charge usage for a stopped instance, or data transfer fees; however, your root partition Amazon EBS volume remains and continues to persist your data, and you are charged for Amazon EBS volume usage. Every time you start your Windows instance, Amazon EC2 charges you for a full instance hour. If you stop and restart your Windows instance, a new instance hour begins and Amazon EC2 charges you for another full instance hour even if you are still within the same 60-minute period when it was stopped. Every time you start your Linux instance, Amazon EC2 charges a one-minute minimum for instance usage, and thereafter charges per second for instance usage. You can't start, stop, or hibernate Spot Instances, and you can't stop or hibernate instance store-backed instances. For information about using hibernation for Spot Instances, see Hibernating Interrupted Spot Instances in the Amazon Elastic Compute Cloud User Guide. When you stop or hibernate an instance, we shut it down. You can restart your instance at any time. Before stopping or hibernating an instance, make sure it is in a state from which it can be restarted. Stopping an instance does not preserve data stored in RAM, but hibernating an instance does preserve data stored in RAM. If an instance cannot hibernate successfully, a normal shutdown occurs. Stopping and hibernating an instance is different to rebooting or terminating it. For example, when you stop or hibernate an instance, the root device and any other devices attached to the instance persist. When you terminate an instance, the root device and any other devices attached during the instance launch are automatically deleted. For more information about the differences between rebooting, stopping, hibernating, and terminating instances, see Instance Lifecycle in the Amazon Elastic Compute Cloud User Guide. When you stop an instance, we attempt to shut it down forcibly after a short while. If your instance appears stuck in the stopping state after a period of time, there may be an issue with the underlying host computer. For more information, see Troubleshooting Stopping Your Instance in the Amazon Elastic Compute Cloud User Guide.
    */
  def stopInstances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.StopInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.StopInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.StopInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops an Amazon EBS-backed instance. You can use the Stop action to hibernate an instance if the instance is enabled for hibernation and it meets the hibernation prerequisites. For more information, see Hibernate Your Instance in the Amazon Elastic Compute Cloud User Guide. We don't charge usage for a stopped instance, or data transfer fees; however, your root partition Amazon EBS volume remains and continues to persist your data, and you are charged for Amazon EBS volume usage. Every time you start your Windows instance, Amazon EC2 charges you for a full instance hour. If you stop and restart your Windows instance, a new instance hour begins and Amazon EC2 charges you for another full instance hour even if you are still within the same 60-minute period when it was stopped. Every time you start your Linux instance, Amazon EC2 charges a one-minute minimum for instance usage, and thereafter charges per second for instance usage. You can't start, stop, or hibernate Spot Instances, and you can't stop or hibernate instance store-backed instances. For information about using hibernation for Spot Instances, see Hibernating Interrupted Spot Instances in the Amazon Elastic Compute Cloud User Guide. When you stop or hibernate an instance, we shut it down. You can restart your instance at any time. Before stopping or hibernating an instance, make sure it is in a state from which it can be restarted. Stopping an instance does not preserve data stored in RAM, but hibernating an instance does preserve data stored in RAM. If an instance cannot hibernate successfully, a normal shutdown occurs. Stopping and hibernating an instance is different to rebooting or terminating it. For example, when you stop or hibernate an instance, the root device and any other devices attached to the instance persist. When you terminate an instance, the root device and any other devices attached during the instance launch are automatically deleted. For more information about the differences between rebooting, stopping, hibernating, and terminating instances, see Instance Lifecycle in the Amazon Elastic Compute Cloud User Guide. When you stop an instance, we attempt to shut it down forcibly after a short while. If your instance appears stuck in the stopping state after a period of time, there may be an issue with the underlying host computer. For more information, see Troubleshooting Stopping Your Instance in the Amazon Elastic Compute Cloud User Guide.
    */
  def stopInstances(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.StopInstancesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.StopInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopInstances(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.StopInstancesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.StopInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.StopInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Terminates active Client VPN endpoint connections. This action can be used to terminate a specific client connection, or up to five connections established by a specific user.
    */
  def terminateClientVpnConnections(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.TerminateClientVpnConnectionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def terminateClientVpnConnections(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.TerminateClientVpnConnectionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.TerminateClientVpnConnectionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Terminates active Client VPN endpoint connections. This action can be used to terminate a specific client connection, or up to five connections established by a specific user.
    */
  def terminateClientVpnConnections(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.TerminateClientVpnConnectionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.TerminateClientVpnConnectionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def terminateClientVpnConnections(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.TerminateClientVpnConnectionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.TerminateClientVpnConnectionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.TerminateClientVpnConnectionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Shuts down one or more instances. This operation is idempotent; if you terminate an instance more than once, each call succeeds.  If you specify multiple instances and the request fails (for example, because of a single incorrect instance ID), none of the instances are terminated. Terminated instances remain visible after termination (for approximately one hour). By default, Amazon EC2 deletes all EBS volumes that were attached when the instance launched. Volumes attached after instance launch continue running. You can stop, start, and terminate EBS-backed instances. You can only terminate instance store-backed instances. What happens to an instance differs if you stop it or terminate it. For example, when you stop an instance, the root device and any other devices attached to the instance persist. When you terminate an instance, any attached EBS volumes with the DeleteOnTermination block device mapping parameter set to true are automatically deleted. For more information about the differences between stopping and terminating instances, see Instance Lifecycle in the Amazon Elastic Compute Cloud User Guide. For more information about troubleshooting, see Troubleshooting Terminating Your Instance in the Amazon Elastic Compute Cloud User Guide.
    */
  def terminateInstances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.TerminateInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def terminateInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.TerminateInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.TerminateInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Shuts down one or more instances. This operation is idempotent; if you terminate an instance more than once, each call succeeds.  If you specify multiple instances and the request fails (for example, because of a single incorrect instance ID), none of the instances are terminated. Terminated instances remain visible after termination (for approximately one hour). By default, Amazon EC2 deletes all EBS volumes that were attached when the instance launched. Volumes attached after instance launch continue running. You can stop, start, and terminate EBS-backed instances. You can only terminate instance store-backed instances. What happens to an instance differs if you stop it or terminate it. For example, when you stop an instance, the root device and any other devices attached to the instance persist. When you terminate an instance, any attached EBS volumes with the DeleteOnTermination block device mapping parameter set to true are automatically deleted. For more information about the differences between stopping and terminating instances, see Instance Lifecycle in the Amazon Elastic Compute Cloud User Guide. For more information about troubleshooting, see Troubleshooting Terminating Your Instance in the Amazon Elastic Compute Cloud User Guide.
    */
  def terminateInstances(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.TerminateInstancesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.TerminateInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def terminateInstances(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.TerminateInstancesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.TerminateInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.TerminateInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Unassigns one or more IPv6 addresses from a network interface.
    */
  def unassignIpv6Addresses(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.UnassignIpv6AddressesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def unassignIpv6Addresses(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.UnassignIpv6AddressesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.UnassignIpv6AddressesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Unassigns one or more IPv6 addresses from a network interface.
    */
  def unassignIpv6Addresses(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.UnassignIpv6AddressesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.UnassignIpv6AddressesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def unassignIpv6Addresses(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.UnassignIpv6AddressesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.UnassignIpv6AddressesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.UnassignIpv6AddressesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Unassigns one or more secondary private IP addresses from a network interface.
    */
  def unassignPrivateIpAddresses(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def unassignPrivateIpAddresses(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Unassigns one or more secondary private IP addresses from a network interface.
    */
  def unassignPrivateIpAddresses(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.UnassignPrivateIpAddressesRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def unassignPrivateIpAddresses(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.UnassignPrivateIpAddressesRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables detailed monitoring for a running instance. For more information, see Monitoring Your Instances and Volumes in the Amazon Elastic Compute Cloud User Guide.
    */
  def unmonitorInstances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.UnmonitorInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def unmonitorInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.UnmonitorInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.UnmonitorInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disables detailed monitoring for a running instance. For more information, see Monitoring Your Instances and Volumes in the Amazon Elastic Compute Cloud User Guide.
    */
  def unmonitorInstances(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.UnmonitorInstancesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.UnmonitorInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def unmonitorInstances(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.UnmonitorInstancesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.UnmonitorInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.UnmonitorInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * [EC2-VPC only] Updates the description of an egress (outbound) security group rule. You can replace an existing description, or add a description to a rule that did not have one previously. You specify the description as part of the IP permissions structure. You can remove a description for a security group rule by omitting the description parameter in the request.
    */
  def updateSecurityGroupRuleDescriptionsEgress(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.UpdateSecurityGroupRuleDescriptionsEgressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateSecurityGroupRuleDescriptionsEgress(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.UpdateSecurityGroupRuleDescriptionsEgressResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.UpdateSecurityGroupRuleDescriptionsEgressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * [EC2-VPC only] Updates the description of an egress (outbound) security group rule. You can replace an existing description, or add a description to a rule that did not have one previously. You specify the description as part of the IP permissions structure. You can remove a description for a security group rule by omitting the description parameter in the request.
    */
  def updateSecurityGroupRuleDescriptionsEgress(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.UpdateSecurityGroupRuleDescriptionsEgressRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.UpdateSecurityGroupRuleDescriptionsEgressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateSecurityGroupRuleDescriptionsEgress(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.UpdateSecurityGroupRuleDescriptionsEgressRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.UpdateSecurityGroupRuleDescriptionsEgressResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.UpdateSecurityGroupRuleDescriptionsEgressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the description of an ingress (inbound) security group rule. You can replace an existing description, or add a description to a rule that did not have one previously. You specify the description as part of the IP permissions structure. You can remove a description for a security group rule by omitting the description parameter in the request.
    */
  def updateSecurityGroupRuleDescriptionsIngress(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.UpdateSecurityGroupRuleDescriptionsIngressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateSecurityGroupRuleDescriptionsIngress(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.UpdateSecurityGroupRuleDescriptionsIngressResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.UpdateSecurityGroupRuleDescriptionsIngressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the description of an ingress (inbound) security group rule. You can replace an existing description, or add a description to a rule that did not have one previously. You specify the description as part of the IP permissions structure. You can remove a description for a security group rule by omitting the description parameter in the request.
    */
  def updateSecurityGroupRuleDescriptionsIngress(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.UpdateSecurityGroupRuleDescriptionsIngressRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.UpdateSecurityGroupRuleDescriptionsIngressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateSecurityGroupRuleDescriptionsIngress(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.UpdateSecurityGroupRuleDescriptionsIngressRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.UpdateSecurityGroupRuleDescriptionsIngressResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.UpdateSecurityGroupRuleDescriptionsIngressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the bundleTaskComplete state by periodically calling the underlying EC2.describeBundleTasksoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_bundleTaskComplete(state: awsDashSdkLib.awsDashSdkLibStrings.bundleTaskComplete): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeBundleTasksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_bundleTaskComplete(
    state: awsDashSdkLib.awsDashSdkLibStrings.bundleTaskComplete,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeBundleTasksResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeBundleTasksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the bundleTaskComplete state by periodically calling the underlying EC2.describeBundleTasksoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_bundleTaskComplete(
    state: awsDashSdkLib.awsDashSdkLibStrings.bundleTaskComplete,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeBundleTasksRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeBundleTasksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_bundleTaskComplete(
    state: awsDashSdkLib.awsDashSdkLibStrings.bundleTaskComplete,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeBundleTasksRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeBundleTasksResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeBundleTasksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the conversionTaskCancelled state by periodically calling the underlying EC2.describeConversionTasksoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_conversionTaskCancelled(state: awsDashSdkLib.awsDashSdkLibStrings.conversionTaskCancelled): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeConversionTasksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_conversionTaskCancelled(
    state: awsDashSdkLib.awsDashSdkLibStrings.conversionTaskCancelled,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeConversionTasksResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeConversionTasksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the conversionTaskCancelled state by periodically calling the underlying EC2.describeConversionTasksoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_conversionTaskCancelled(
    state: awsDashSdkLib.awsDashSdkLibStrings.conversionTaskCancelled,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeConversionTasksRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeConversionTasksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_conversionTaskCancelled(
    state: awsDashSdkLib.awsDashSdkLibStrings.conversionTaskCancelled,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeConversionTasksRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeConversionTasksResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeConversionTasksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the conversionTaskCompleted state by periodically calling the underlying EC2.describeConversionTasksoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_conversionTaskCompleted(state: awsDashSdkLib.awsDashSdkLibStrings.conversionTaskCompleted): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeConversionTasksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_conversionTaskCompleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.conversionTaskCompleted,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeConversionTasksResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeConversionTasksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the conversionTaskCompleted state by periodically calling the underlying EC2.describeConversionTasksoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_conversionTaskCompleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.conversionTaskCompleted,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeConversionTasksRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeConversionTasksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_conversionTaskCompleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.conversionTaskCompleted,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeConversionTasksRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeConversionTasksResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeConversionTasksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the conversionTaskDeleted state by periodically calling the underlying EC2.describeConversionTasksoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_conversionTaskDeleted(state: awsDashSdkLib.awsDashSdkLibStrings.conversionTaskDeleted): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeConversionTasksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_conversionTaskDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.conversionTaskDeleted,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeConversionTasksResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeConversionTasksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the conversionTaskDeleted state by periodically calling the underlying EC2.describeConversionTasksoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_conversionTaskDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.conversionTaskDeleted,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeConversionTasksRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeConversionTasksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_conversionTaskDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.conversionTaskDeleted,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeConversionTasksRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeConversionTasksResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeConversionTasksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the customerGatewayAvailable state by periodically calling the underlying EC2.describeCustomerGatewaysoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_customerGatewayAvailable(state: awsDashSdkLib.awsDashSdkLibStrings.customerGatewayAvailable): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeCustomerGatewaysResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_customerGatewayAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.customerGatewayAvailable,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeCustomerGatewaysResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeCustomerGatewaysResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the customerGatewayAvailable state by periodically calling the underlying EC2.describeCustomerGatewaysoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_customerGatewayAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.customerGatewayAvailable,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeCustomerGatewaysRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeCustomerGatewaysResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_customerGatewayAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.customerGatewayAvailable,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeCustomerGatewaysRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeCustomerGatewaysResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeCustomerGatewaysResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the exportTaskCancelled state by periodically calling the underlying EC2.describeExportTasksoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_exportTaskCancelled(state: awsDashSdkLib.awsDashSdkLibStrings.exportTaskCancelled): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeExportTasksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_exportTaskCancelled(
    state: awsDashSdkLib.awsDashSdkLibStrings.exportTaskCancelled,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeExportTasksResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeExportTasksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the exportTaskCancelled state by periodically calling the underlying EC2.describeExportTasksoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_exportTaskCancelled(
    state: awsDashSdkLib.awsDashSdkLibStrings.exportTaskCancelled,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeExportTasksRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeExportTasksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_exportTaskCancelled(
    state: awsDashSdkLib.awsDashSdkLibStrings.exportTaskCancelled,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeExportTasksRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeExportTasksResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeExportTasksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the exportTaskCompleted state by periodically calling the underlying EC2.describeExportTasksoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_exportTaskCompleted(state: awsDashSdkLib.awsDashSdkLibStrings.exportTaskCompleted): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeExportTasksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_exportTaskCompleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.exportTaskCompleted,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeExportTasksResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeExportTasksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the exportTaskCompleted state by periodically calling the underlying EC2.describeExportTasksoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_exportTaskCompleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.exportTaskCompleted,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeExportTasksRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeExportTasksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_exportTaskCompleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.exportTaskCompleted,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeExportTasksRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeExportTasksResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeExportTasksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the imageAvailable state by periodically calling the underlying EC2.describeImagesoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_imageAvailable(state: awsDashSdkLib.awsDashSdkLibStrings.imageAvailable): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeImagesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_imageAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.imageAvailable,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeImagesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeImagesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the imageAvailable state by periodically calling the underlying EC2.describeImagesoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_imageAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.imageAvailable,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeImagesRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeImagesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_imageAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.imageAvailable,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeImagesRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeImagesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeImagesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the imageExists state by periodically calling the underlying EC2.describeImagesoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_imageExists(state: awsDashSdkLib.awsDashSdkLibStrings.imageExists): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeImagesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_imageExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.imageExists,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeImagesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeImagesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the imageExists state by periodically calling the underlying EC2.describeImagesoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_imageExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.imageExists,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeImagesRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeImagesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_imageExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.imageExists,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeImagesRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeImagesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeImagesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the instanceExists state by periodically calling the underlying EC2.describeInstancesoperation every 5 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_instanceExists(state: awsDashSdkLib.awsDashSdkLibStrings.instanceExists): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_instanceExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.instanceExists,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the instanceExists state by periodically calling the underlying EC2.describeInstancesoperation every 5 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_instanceExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.instanceExists,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstancesRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_instanceExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.instanceExists,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstancesRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the instanceRunning state by periodically calling the underlying EC2.describeInstancesoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_instanceRunning(state: awsDashSdkLib.awsDashSdkLibStrings.instanceRunning): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_instanceRunning(
    state: awsDashSdkLib.awsDashSdkLibStrings.instanceRunning,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the instanceRunning state by periodically calling the underlying EC2.describeInstancesoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_instanceRunning(
    state: awsDashSdkLib.awsDashSdkLibStrings.instanceRunning,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstancesRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_instanceRunning(
    state: awsDashSdkLib.awsDashSdkLibStrings.instanceRunning,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstancesRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the instanceStatusOk state by periodically calling the underlying EC2.describeInstanceStatusoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_instanceStatusOk(state: awsDashSdkLib.awsDashSdkLibStrings.instanceStatusOk): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstanceStatusResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_instanceStatusOk(
    state: awsDashSdkLib.awsDashSdkLibStrings.instanceStatusOk,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstanceStatusResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstanceStatusResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the instanceStatusOk state by periodically calling the underlying EC2.describeInstanceStatusoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_instanceStatusOk(
    state: awsDashSdkLib.awsDashSdkLibStrings.instanceStatusOk,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstanceStatusRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstanceStatusResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_instanceStatusOk(
    state: awsDashSdkLib.awsDashSdkLibStrings.instanceStatusOk,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstanceStatusRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstanceStatusResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstanceStatusResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the instanceStopped state by periodically calling the underlying EC2.describeInstancesoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_instanceStopped(state: awsDashSdkLib.awsDashSdkLibStrings.instanceStopped): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_instanceStopped(
    state: awsDashSdkLib.awsDashSdkLibStrings.instanceStopped,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the instanceStopped state by periodically calling the underlying EC2.describeInstancesoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_instanceStopped(
    state: awsDashSdkLib.awsDashSdkLibStrings.instanceStopped,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstancesRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_instanceStopped(
    state: awsDashSdkLib.awsDashSdkLibStrings.instanceStopped,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstancesRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the instanceTerminated state by periodically calling the underlying EC2.describeInstancesoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_instanceTerminated(state: awsDashSdkLib.awsDashSdkLibStrings.instanceTerminated): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_instanceTerminated(
    state: awsDashSdkLib.awsDashSdkLibStrings.instanceTerminated,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the instanceTerminated state by periodically calling the underlying EC2.describeInstancesoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_instanceTerminated(
    state: awsDashSdkLib.awsDashSdkLibStrings.instanceTerminated,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstancesRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_instanceTerminated(
    state: awsDashSdkLib.awsDashSdkLibStrings.instanceTerminated,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstancesRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the keyPairExists state by periodically calling the underlying EC2.describeKeyPairsoperation every 5 seconds (at most 6 times).
    */
  @JSName("waitFor")
  def waitFor_keyPairExists(state: awsDashSdkLib.awsDashSdkLibStrings.keyPairExists): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeKeyPairsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_keyPairExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.keyPairExists,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeKeyPairsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeKeyPairsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the keyPairExists state by periodically calling the underlying EC2.describeKeyPairsoperation every 5 seconds (at most 6 times).
    */
  @JSName("waitFor")
  def waitFor_keyPairExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.keyPairExists,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeKeyPairsRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeKeyPairsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_keyPairExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.keyPairExists,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeKeyPairsRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeKeyPairsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeKeyPairsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the natGatewayAvailable state by periodically calling the underlying EC2.describeNatGatewaysoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_natGatewayAvailable(state: awsDashSdkLib.awsDashSdkLibStrings.natGatewayAvailable): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNatGatewaysResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_natGatewayAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.natGatewayAvailable,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNatGatewaysResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNatGatewaysResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the natGatewayAvailable state by periodically calling the underlying EC2.describeNatGatewaysoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_natGatewayAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.natGatewayAvailable,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNatGatewaysRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNatGatewaysResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_natGatewayAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.natGatewayAvailable,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNatGatewaysRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNatGatewaysResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNatGatewaysResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the networkInterfaceAvailable state by periodically calling the underlying EC2.describeNetworkInterfacesoperation every 20 seconds (at most 10 times).
    */
  @JSName("waitFor")
  def waitFor_networkInterfaceAvailable(state: awsDashSdkLib.awsDashSdkLibStrings.networkInterfaceAvailable): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNetworkInterfacesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_networkInterfaceAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.networkInterfaceAvailable,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNetworkInterfacesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNetworkInterfacesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the networkInterfaceAvailable state by periodically calling the underlying EC2.describeNetworkInterfacesoperation every 20 seconds (at most 10 times).
    */
  @JSName("waitFor")
  def waitFor_networkInterfaceAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.networkInterfaceAvailable,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNetworkInterfacesRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNetworkInterfacesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_networkInterfaceAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.networkInterfaceAvailable,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNetworkInterfacesRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNetworkInterfacesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeNetworkInterfacesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the passwordDataAvailable state by periodically calling the underlying EC2.getPasswordDataoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_passwordDataAvailable(state: awsDashSdkLib.awsDashSdkLibStrings.passwordDataAvailable): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.GetPasswordDataResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_passwordDataAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.passwordDataAvailable,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.GetPasswordDataResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.GetPasswordDataResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the passwordDataAvailable state by periodically calling the underlying EC2.getPasswordDataoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_passwordDataAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.passwordDataAvailable,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.GetPasswordDataRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.GetPasswordDataResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_passwordDataAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.passwordDataAvailable,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.GetPasswordDataRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.GetPasswordDataResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.GetPasswordDataResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the snapshotCompleted state by periodically calling the underlying EC2.describeSnapshotsoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_snapshotCompleted(state: awsDashSdkLib.awsDashSdkLibStrings.snapshotCompleted): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSnapshotsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_snapshotCompleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.snapshotCompleted,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSnapshotsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSnapshotsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the snapshotCompleted state by periodically calling the underlying EC2.describeSnapshotsoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_snapshotCompleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.snapshotCompleted,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSnapshotsRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSnapshotsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_snapshotCompleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.snapshotCompleted,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSnapshotsRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSnapshotsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSnapshotsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the spotInstanceRequestFulfilled state by periodically calling the underlying EC2.describeSpotInstanceRequestsoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_spotInstanceRequestFulfilled(state: awsDashSdkLib.awsDashSdkLibStrings.spotInstanceRequestFulfilled): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotInstanceRequestsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_spotInstanceRequestFulfilled(
    state: awsDashSdkLib.awsDashSdkLibStrings.spotInstanceRequestFulfilled,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotInstanceRequestsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotInstanceRequestsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the spotInstanceRequestFulfilled state by periodically calling the underlying EC2.describeSpotInstanceRequestsoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_spotInstanceRequestFulfilled(
    state: awsDashSdkLib.awsDashSdkLibStrings.spotInstanceRequestFulfilled,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotInstanceRequestsRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotInstanceRequestsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_spotInstanceRequestFulfilled(
    state: awsDashSdkLib.awsDashSdkLibStrings.spotInstanceRequestFulfilled,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotInstanceRequestsRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotInstanceRequestsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSpotInstanceRequestsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the subnetAvailable state by periodically calling the underlying EC2.describeSubnetsoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_subnetAvailable(state: awsDashSdkLib.awsDashSdkLibStrings.subnetAvailable): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSubnetsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_subnetAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.subnetAvailable,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSubnetsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSubnetsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the subnetAvailable state by periodically calling the underlying EC2.describeSubnetsoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_subnetAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.subnetAvailable,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSubnetsRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSubnetsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_subnetAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.subnetAvailable,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSubnetsRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSubnetsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeSubnetsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the systemStatusOk state by periodically calling the underlying EC2.describeInstanceStatusoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_systemStatusOk(state: awsDashSdkLib.awsDashSdkLibStrings.systemStatusOk): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstanceStatusResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_systemStatusOk(
    state: awsDashSdkLib.awsDashSdkLibStrings.systemStatusOk,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstanceStatusResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstanceStatusResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the systemStatusOk state by periodically calling the underlying EC2.describeInstanceStatusoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_systemStatusOk(
    state: awsDashSdkLib.awsDashSdkLibStrings.systemStatusOk,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstanceStatusRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstanceStatusResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_systemStatusOk(
    state: awsDashSdkLib.awsDashSdkLibStrings.systemStatusOk,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstanceStatusRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstanceStatusResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeInstanceStatusResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the volumeAvailable state by periodically calling the underlying EC2.describeVolumesoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_volumeAvailable(state: awsDashSdkLib.awsDashSdkLibStrings.volumeAvailable): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_volumeAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.volumeAvailable,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the volumeAvailable state by periodically calling the underlying EC2.describeVolumesoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_volumeAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.volumeAvailable,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumesRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_volumeAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.volumeAvailable,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumesRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the volumeDeleted state by periodically calling the underlying EC2.describeVolumesoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_volumeDeleted(state: awsDashSdkLib.awsDashSdkLibStrings.volumeDeleted): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_volumeDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.volumeDeleted,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the volumeDeleted state by periodically calling the underlying EC2.describeVolumesoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_volumeDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.volumeDeleted,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumesRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_volumeDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.volumeDeleted,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumesRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the volumeInUse state by periodically calling the underlying EC2.describeVolumesoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_volumeInUse(state: awsDashSdkLib.awsDashSdkLibStrings.volumeInUse): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_volumeInUse(
    state: awsDashSdkLib.awsDashSdkLibStrings.volumeInUse,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the volumeInUse state by periodically calling the underlying EC2.describeVolumesoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_volumeInUse(
    state: awsDashSdkLib.awsDashSdkLibStrings.volumeInUse,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumesRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_volumeInUse(
    state: awsDashSdkLib.awsDashSdkLibStrings.volumeInUse,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumesRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVolumesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the vpcAvailable state by periodically calling the underlying EC2.describeVpcsoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_vpcAvailable(state: awsDashSdkLib.awsDashSdkLibStrings.vpcAvailable): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_vpcAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.vpcAvailable,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the vpcAvailable state by periodically calling the underlying EC2.describeVpcsoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_vpcAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.vpcAvailable,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcsRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_vpcAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.vpcAvailable,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcsRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the vpcExists state by periodically calling the underlying EC2.describeVpcsoperation every 1 seconds (at most 5 times).
    */
  @JSName("waitFor")
  def waitFor_vpcExists(state: awsDashSdkLib.awsDashSdkLibStrings.vpcExists): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_vpcExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.vpcExists,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the vpcExists state by periodically calling the underlying EC2.describeVpcsoperation every 1 seconds (at most 5 times).
    */
  @JSName("waitFor")
  def waitFor_vpcExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.vpcExists,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcsRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_vpcExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.vpcExists,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcsRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the vpcPeeringConnectionDeleted state by periodically calling the underlying EC2.describeVpcPeeringConnectionsoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_vpcPeeringConnectionDeleted(state: awsDashSdkLib.awsDashSdkLibStrings.vpcPeeringConnectionDeleted): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcPeeringConnectionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_vpcPeeringConnectionDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.vpcPeeringConnectionDeleted,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcPeeringConnectionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcPeeringConnectionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the vpcPeeringConnectionDeleted state by periodically calling the underlying EC2.describeVpcPeeringConnectionsoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_vpcPeeringConnectionDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.vpcPeeringConnectionDeleted,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcPeeringConnectionsRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcPeeringConnectionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_vpcPeeringConnectionDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.vpcPeeringConnectionDeleted,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcPeeringConnectionsRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcPeeringConnectionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcPeeringConnectionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the vpcPeeringConnectionExists state by periodically calling the underlying EC2.describeVpcPeeringConnectionsoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_vpcPeeringConnectionExists(state: awsDashSdkLib.awsDashSdkLibStrings.vpcPeeringConnectionExists): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcPeeringConnectionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_vpcPeeringConnectionExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.vpcPeeringConnectionExists,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcPeeringConnectionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcPeeringConnectionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the vpcPeeringConnectionExists state by periodically calling the underlying EC2.describeVpcPeeringConnectionsoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_vpcPeeringConnectionExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.vpcPeeringConnectionExists,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcPeeringConnectionsRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcPeeringConnectionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_vpcPeeringConnectionExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.vpcPeeringConnectionExists,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcPeeringConnectionsRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcPeeringConnectionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpcPeeringConnectionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the vpnConnectionAvailable state by periodically calling the underlying EC2.describeVpnConnectionsoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_vpnConnectionAvailable(state: awsDashSdkLib.awsDashSdkLibStrings.vpnConnectionAvailable): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpnConnectionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_vpnConnectionAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.vpnConnectionAvailable,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpnConnectionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpnConnectionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the vpnConnectionAvailable state by periodically calling the underlying EC2.describeVpnConnectionsoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_vpnConnectionAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.vpnConnectionAvailable,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpnConnectionsRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpnConnectionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_vpnConnectionAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.vpnConnectionAvailable,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpnConnectionsRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpnConnectionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpnConnectionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the vpnConnectionDeleted state by periodically calling the underlying EC2.describeVpnConnectionsoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_vpnConnectionDeleted(state: awsDashSdkLib.awsDashSdkLibStrings.vpnConnectionDeleted): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpnConnectionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_vpnConnectionDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.vpnConnectionDeleted,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpnConnectionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpnConnectionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the vpnConnectionDeleted state by periodically calling the underlying EC2.describeVpnConnectionsoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_vpnConnectionDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.vpnConnectionDeleted,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpnConnectionsRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpnConnectionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_vpnConnectionDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.vpnConnectionDeleted,
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpnConnectionsRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpnConnectionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.DescribeVpnConnectionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops advertising an IPv4 address range that is provisioned as an address pool. You can perform this operation at most once every 10 seconds, even if you specify different address ranges each time. It can take a few minutes before traffic to the specified addresses stops routing to AWS because of BGP propagation delays.
    */
  def withdrawByoipCidr(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.WithdrawByoipCidrResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def withdrawByoipCidr(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.WithdrawByoipCidrResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.WithdrawByoipCidrResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops advertising an IPv4 address range that is provisioned as an address pool. You can perform this operation at most once every 10 seconds, even if you specify different address ranges each time. It can take a few minutes before traffic to the specified addresses stops routing to AWS because of BGP propagation delays.
    */
  def withdrawByoipCidr(params: awsDashSdkLib.clientsEc2Mod.EC2Ns.WithdrawByoipCidrRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.WithdrawByoipCidrResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def withdrawByoipCidr(
    params: awsDashSdkLib.clientsEc2Mod.EC2Ns.WithdrawByoipCidrRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEc2Mod.EC2Ns.WithdrawByoipCidrResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEc2Mod.EC2Ns.WithdrawByoipCidrResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

