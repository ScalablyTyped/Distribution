package typings.awsDashSdk.clientsEc2Mod

import typings.awsDashSdk.Anon_Waiter
import typings.awsDashSdk.awsDashSdkStrings.bundleTaskComplete
import typings.awsDashSdk.awsDashSdkStrings.conversionTaskCancelled
import typings.awsDashSdk.awsDashSdkStrings.conversionTaskCompleted
import typings.awsDashSdk.awsDashSdkStrings.conversionTaskDeleted
import typings.awsDashSdk.awsDashSdkStrings.customerGatewayAvailable
import typings.awsDashSdk.awsDashSdkStrings.exportTaskCancelled
import typings.awsDashSdk.awsDashSdkStrings.exportTaskCompleted
import typings.awsDashSdk.awsDashSdkStrings.imageAvailable
import typings.awsDashSdk.awsDashSdkStrings.imageExists
import typings.awsDashSdk.awsDashSdkStrings.instanceExists
import typings.awsDashSdk.awsDashSdkStrings.instanceRunning
import typings.awsDashSdk.awsDashSdkStrings.instanceStatusOk
import typings.awsDashSdk.awsDashSdkStrings.instanceStopped
import typings.awsDashSdk.awsDashSdkStrings.instanceTerminated
import typings.awsDashSdk.awsDashSdkStrings.keyPairExists
import typings.awsDashSdk.awsDashSdkStrings.natGatewayAvailable
import typings.awsDashSdk.awsDashSdkStrings.networkInterfaceAvailable
import typings.awsDashSdk.awsDashSdkStrings.passwordDataAvailable
import typings.awsDashSdk.awsDashSdkStrings.securityGroupExists
import typings.awsDashSdk.awsDashSdkStrings.snapshotCompleted
import typings.awsDashSdk.awsDashSdkStrings.spotInstanceRequestFulfilled
import typings.awsDashSdk.awsDashSdkStrings.subnetAvailable
import typings.awsDashSdk.awsDashSdkStrings.systemStatusOk
import typings.awsDashSdk.awsDashSdkStrings.volumeAvailable
import typings.awsDashSdk.awsDashSdkStrings.volumeDeleted
import typings.awsDashSdk.awsDashSdkStrings.volumeInUse
import typings.awsDashSdk.awsDashSdkStrings.vpcAvailable
import typings.awsDashSdk.awsDashSdkStrings.vpcExists
import typings.awsDashSdk.awsDashSdkStrings.vpcPeeringConnectionDeleted
import typings.awsDashSdk.awsDashSdkStrings.vpcPeeringConnectionExists
import typings.awsDashSdk.awsDashSdkStrings.vpnConnectionAvailable
import typings.awsDashSdk.awsDashSdkStrings.vpnConnectionDeleted
import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EC2 extends Service {
  @JSName("config")
  var config_EC2: ConfigBase with ClientConfiguration = js.native
  /**
    * Accepts the Convertible Reserved Instance exchange quote described in the GetReservedInstancesExchangeQuote call.
    */
  def acceptReservedInstancesExchangeQuote(): Request[AcceptReservedInstancesExchangeQuoteResult, AWSError] = js.native
  def acceptReservedInstancesExchangeQuote(
    callback: js.Function2[/* err */ AWSError, /* data */ AcceptReservedInstancesExchangeQuoteResult, Unit]
  ): Request[AcceptReservedInstancesExchangeQuoteResult, AWSError] = js.native
  /**
    * Accepts the Convertible Reserved Instance exchange quote described in the GetReservedInstancesExchangeQuote call.
    */
  def acceptReservedInstancesExchangeQuote(params: AcceptReservedInstancesExchangeQuoteRequest): Request[AcceptReservedInstancesExchangeQuoteResult, AWSError] = js.native
  def acceptReservedInstancesExchangeQuote(
    params: AcceptReservedInstancesExchangeQuoteRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AcceptReservedInstancesExchangeQuoteResult, Unit]
  ): Request[AcceptReservedInstancesExchangeQuoteResult, AWSError] = js.native
  /**
    * Accepts a transit gateway peering attachment request. The peering attachment must be in the pendingAcceptance state.
    */
  def acceptTransitGatewayPeeringAttachment(): Request[AcceptTransitGatewayPeeringAttachmentResult, AWSError] = js.native
  def acceptTransitGatewayPeeringAttachment(
    callback: js.Function2[/* err */ AWSError, /* data */ AcceptTransitGatewayPeeringAttachmentResult, Unit]
  ): Request[AcceptTransitGatewayPeeringAttachmentResult, AWSError] = js.native
  /**
    * Accepts a transit gateway peering attachment request. The peering attachment must be in the pendingAcceptance state.
    */
  def acceptTransitGatewayPeeringAttachment(params: AcceptTransitGatewayPeeringAttachmentRequest): Request[AcceptTransitGatewayPeeringAttachmentResult, AWSError] = js.native
  def acceptTransitGatewayPeeringAttachment(
    params: AcceptTransitGatewayPeeringAttachmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AcceptTransitGatewayPeeringAttachmentResult, Unit]
  ): Request[AcceptTransitGatewayPeeringAttachmentResult, AWSError] = js.native
  /**
    * Accepts a request to attach a VPC to a transit gateway. The VPC attachment must be in the pendingAcceptance state. Use DescribeTransitGatewayVpcAttachments to view your pending VPC attachment requests. Use RejectTransitGatewayVpcAttachment to reject a VPC attachment request.
    */
  def acceptTransitGatewayVpcAttachment(): Request[AcceptTransitGatewayVpcAttachmentResult, AWSError] = js.native
  def acceptTransitGatewayVpcAttachment(
    callback: js.Function2[/* err */ AWSError, /* data */ AcceptTransitGatewayVpcAttachmentResult, Unit]
  ): Request[AcceptTransitGatewayVpcAttachmentResult, AWSError] = js.native
  /**
    * Accepts a request to attach a VPC to a transit gateway. The VPC attachment must be in the pendingAcceptance state. Use DescribeTransitGatewayVpcAttachments to view your pending VPC attachment requests. Use RejectTransitGatewayVpcAttachment to reject a VPC attachment request.
    */
  def acceptTransitGatewayVpcAttachment(params: AcceptTransitGatewayVpcAttachmentRequest): Request[AcceptTransitGatewayVpcAttachmentResult, AWSError] = js.native
  def acceptTransitGatewayVpcAttachment(
    params: AcceptTransitGatewayVpcAttachmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AcceptTransitGatewayVpcAttachmentResult, Unit]
  ): Request[AcceptTransitGatewayVpcAttachmentResult, AWSError] = js.native
  /**
    * Accepts one or more interface VPC endpoint connection requests to your VPC endpoint service.
    */
  def acceptVpcEndpointConnections(): Request[AcceptVpcEndpointConnectionsResult, AWSError] = js.native
  def acceptVpcEndpointConnections(callback: js.Function2[/* err */ AWSError, /* data */ AcceptVpcEndpointConnectionsResult, Unit]): Request[AcceptVpcEndpointConnectionsResult, AWSError] = js.native
  /**
    * Accepts one or more interface VPC endpoint connection requests to your VPC endpoint service.
    */
  def acceptVpcEndpointConnections(params: AcceptVpcEndpointConnectionsRequest): Request[AcceptVpcEndpointConnectionsResult, AWSError] = js.native
  def acceptVpcEndpointConnections(
    params: AcceptVpcEndpointConnectionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AcceptVpcEndpointConnectionsResult, Unit]
  ): Request[AcceptVpcEndpointConnectionsResult, AWSError] = js.native
  /**
    * Accept a VPC peering connection request. To accept a request, the VPC peering connection must be in the pending-acceptance state, and you must be the owner of the peer VPC. Use DescribeVpcPeeringConnections to view your outstanding VPC peering connection requests. For an inter-Region VPC peering connection request, you must accept the VPC peering connection in the Region of the accepter VPC.
    */
  def acceptVpcPeeringConnection(): Request[AcceptVpcPeeringConnectionResult, AWSError] = js.native
  def acceptVpcPeeringConnection(callback: js.Function2[/* err */ AWSError, /* data */ AcceptVpcPeeringConnectionResult, Unit]): Request[AcceptVpcPeeringConnectionResult, AWSError] = js.native
  /**
    * Accept a VPC peering connection request. To accept a request, the VPC peering connection must be in the pending-acceptance state, and you must be the owner of the peer VPC. Use DescribeVpcPeeringConnections to view your outstanding VPC peering connection requests. For an inter-Region VPC peering connection request, you must accept the VPC peering connection in the Region of the accepter VPC.
    */
  def acceptVpcPeeringConnection(params: AcceptVpcPeeringConnectionRequest): Request[AcceptVpcPeeringConnectionResult, AWSError] = js.native
  def acceptVpcPeeringConnection(
    params: AcceptVpcPeeringConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AcceptVpcPeeringConnectionResult, Unit]
  ): Request[AcceptVpcPeeringConnectionResult, AWSError] = js.native
  /**
    * Advertises an IPv4 address range that is provisioned for use with your AWS resources through bring your own IP addresses (BYOIP). You can perform this operation at most once every 10 seconds, even if you specify different address ranges each time. We recommend that you stop advertising the BYOIP CIDR from other locations when you advertise it from AWS. To minimize down time, you can configure your AWS resources to use an address from a BYOIP CIDR before it is advertised, and then simultaneously stop advertising it from the current location and start advertising it through AWS. It can take a few minutes before traffic to the specified addresses starts routing to AWS because of BGP propagation delays. To stop advertising the BYOIP CIDR, use WithdrawByoipCidr.
    */
  def advertiseByoipCidr(): Request[AdvertiseByoipCidrResult, AWSError] = js.native
  def advertiseByoipCidr(callback: js.Function2[/* err */ AWSError, /* data */ AdvertiseByoipCidrResult, Unit]): Request[AdvertiseByoipCidrResult, AWSError] = js.native
  /**
    * Advertises an IPv4 address range that is provisioned for use with your AWS resources through bring your own IP addresses (BYOIP). You can perform this operation at most once every 10 seconds, even if you specify different address ranges each time. We recommend that you stop advertising the BYOIP CIDR from other locations when you advertise it from AWS. To minimize down time, you can configure your AWS resources to use an address from a BYOIP CIDR before it is advertised, and then simultaneously stop advertising it from the current location and start advertising it through AWS. It can take a few minutes before traffic to the specified addresses starts routing to AWS because of BGP propagation delays. To stop advertising the BYOIP CIDR, use WithdrawByoipCidr.
    */
  def advertiseByoipCidr(params: AdvertiseByoipCidrRequest): Request[AdvertiseByoipCidrResult, AWSError] = js.native
  def advertiseByoipCidr(
    params: AdvertiseByoipCidrRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AdvertiseByoipCidrResult, Unit]
  ): Request[AdvertiseByoipCidrResult, AWSError] = js.native
  /**
    * Allocates an Elastic IP address to your AWS account. After you allocate the Elastic IP address you can associate it with an instance or network interface. After you release an Elastic IP address, it is released to the IP address pool and can be allocated to a different AWS account. You can allocate an Elastic IP address from an address pool owned by AWS or from an address pool created from a public IPv4 address range that you have brought to AWS for use with your AWS resources using bring your own IP addresses (BYOIP). For more information, see Bring Your Own IP Addresses (BYOIP) in the Amazon Elastic Compute Cloud User Guide. [EC2-VPC] If you release an Elastic IP address, you might be able to recover it. You cannot recover an Elastic IP address that you released after it is allocated to another AWS account. You cannot recover an Elastic IP address for EC2-Classic. To attempt to recover an Elastic IP address that you released, specify it in this operation. An Elastic IP address is for use either in the EC2-Classic platform or in a VPC. By default, you can allocate 5 Elastic IP addresses for EC2-Classic per Region and 5 Elastic IP addresses for EC2-VPC per Region. For more information, see Elastic IP Addresses in the Amazon Elastic Compute Cloud User Guide.
    */
  def allocateAddress(): Request[AllocateAddressResult, AWSError] = js.native
  def allocateAddress(callback: js.Function2[/* err */ AWSError, /* data */ AllocateAddressResult, Unit]): Request[AllocateAddressResult, AWSError] = js.native
  /**
    * Allocates an Elastic IP address to your AWS account. After you allocate the Elastic IP address you can associate it with an instance or network interface. After you release an Elastic IP address, it is released to the IP address pool and can be allocated to a different AWS account. You can allocate an Elastic IP address from an address pool owned by AWS or from an address pool created from a public IPv4 address range that you have brought to AWS for use with your AWS resources using bring your own IP addresses (BYOIP). For more information, see Bring Your Own IP Addresses (BYOIP) in the Amazon Elastic Compute Cloud User Guide. [EC2-VPC] If you release an Elastic IP address, you might be able to recover it. You cannot recover an Elastic IP address that you released after it is allocated to another AWS account. You cannot recover an Elastic IP address for EC2-Classic. To attempt to recover an Elastic IP address that you released, specify it in this operation. An Elastic IP address is for use either in the EC2-Classic platform or in a VPC. By default, you can allocate 5 Elastic IP addresses for EC2-Classic per Region and 5 Elastic IP addresses for EC2-VPC per Region. For more information, see Elastic IP Addresses in the Amazon Elastic Compute Cloud User Guide.
    */
  def allocateAddress(params: AllocateAddressRequest): Request[AllocateAddressResult, AWSError] = js.native
  def allocateAddress(
    params: AllocateAddressRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AllocateAddressResult, Unit]
  ): Request[AllocateAddressResult, AWSError] = js.native
  /**
    * Allocates a Dedicated Host to your account. At a minimum, specify the supported instance type or instance family, the Availability Zone in which to allocate the host, and the number of hosts to allocate.
    */
  def allocateHosts(): Request[AllocateHostsResult, AWSError] = js.native
  def allocateHosts(callback: js.Function2[/* err */ AWSError, /* data */ AllocateHostsResult, Unit]): Request[AllocateHostsResult, AWSError] = js.native
  /**
    * Allocates a Dedicated Host to your account. At a minimum, specify the supported instance type or instance family, the Availability Zone in which to allocate the host, and the number of hosts to allocate.
    */
  def allocateHosts(params: AllocateHostsRequest): Request[AllocateHostsResult, AWSError] = js.native
  def allocateHosts(
    params: AllocateHostsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AllocateHostsResult, Unit]
  ): Request[AllocateHostsResult, AWSError] = js.native
  /**
    * Applies a security group to the association between the target network and the Client VPN endpoint. This action replaces the existing security groups with the specified security groups.
    */
  def applySecurityGroupsToClientVpnTargetNetwork(): Request[ApplySecurityGroupsToClientVpnTargetNetworkResult, AWSError] = js.native
  def applySecurityGroupsToClientVpnTargetNetwork(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ ApplySecurityGroupsToClientVpnTargetNetworkResult, 
      Unit
    ]
  ): Request[ApplySecurityGroupsToClientVpnTargetNetworkResult, AWSError] = js.native
  /**
    * Applies a security group to the association between the target network and the Client VPN endpoint. This action replaces the existing security groups with the specified security groups.
    */
  def applySecurityGroupsToClientVpnTargetNetwork(params: ApplySecurityGroupsToClientVpnTargetNetworkRequest): Request[ApplySecurityGroupsToClientVpnTargetNetworkResult, AWSError] = js.native
  def applySecurityGroupsToClientVpnTargetNetwork(
    params: ApplySecurityGroupsToClientVpnTargetNetworkRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ ApplySecurityGroupsToClientVpnTargetNetworkResult, 
      Unit
    ]
  ): Request[ApplySecurityGroupsToClientVpnTargetNetworkResult, AWSError] = js.native
  /**
    * Assigns one or more IPv6 addresses to the specified network interface. You can specify one or more specific IPv6 addresses, or you can specify the number of IPv6 addresses to be automatically assigned from within the subnet's IPv6 CIDR block range. You can assign as many IPv6 addresses to a network interface as you can assign private IPv4 addresses, and the limit varies per instance type. For information, see IP Addresses Per Network Interface Per Instance Type in the Amazon Elastic Compute Cloud User Guide.
    */
  def assignIpv6Addresses(): Request[AssignIpv6AddressesResult, AWSError] = js.native
  def assignIpv6Addresses(callback: js.Function2[/* err */ AWSError, /* data */ AssignIpv6AddressesResult, Unit]): Request[AssignIpv6AddressesResult, AWSError] = js.native
  /**
    * Assigns one or more IPv6 addresses to the specified network interface. You can specify one or more specific IPv6 addresses, or you can specify the number of IPv6 addresses to be automatically assigned from within the subnet's IPv6 CIDR block range. You can assign as many IPv6 addresses to a network interface as you can assign private IPv4 addresses, and the limit varies per instance type. For information, see IP Addresses Per Network Interface Per Instance Type in the Amazon Elastic Compute Cloud User Guide.
    */
  def assignIpv6Addresses(params: AssignIpv6AddressesRequest): Request[AssignIpv6AddressesResult, AWSError] = js.native
  def assignIpv6Addresses(
    params: AssignIpv6AddressesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssignIpv6AddressesResult, Unit]
  ): Request[AssignIpv6AddressesResult, AWSError] = js.native
  /**
    * Assigns one or more secondary private IP addresses to the specified network interface. You can specify one or more specific secondary IP addresses, or you can specify the number of secondary IP addresses to be automatically assigned within the subnet's CIDR block range. The number of secondary IP addresses that you can assign to an instance varies by instance type. For information about instance types, see Instance Types in the Amazon Elastic Compute Cloud User Guide. For more information about Elastic IP addresses, see Elastic IP Addresses in the Amazon Elastic Compute Cloud User Guide. When you move a secondary private IP address to another network interface, any Elastic IP address that is associated with the IP address is also moved. Remapping an IP address is an asynchronous operation. When you move an IP address from one network interface to another, check network/interfaces/macs/mac/local-ipv4s in the instance metadata to confirm that the remapping is complete.
    */
  def assignPrivateIpAddresses(): Request[AssignPrivateIpAddressesResult, AWSError] = js.native
  def assignPrivateIpAddresses(callback: js.Function2[/* err */ AWSError, /* data */ AssignPrivateIpAddressesResult, Unit]): Request[AssignPrivateIpAddressesResult, AWSError] = js.native
  /**
    * Assigns one or more secondary private IP addresses to the specified network interface. You can specify one or more specific secondary IP addresses, or you can specify the number of secondary IP addresses to be automatically assigned within the subnet's CIDR block range. The number of secondary IP addresses that you can assign to an instance varies by instance type. For information about instance types, see Instance Types in the Amazon Elastic Compute Cloud User Guide. For more information about Elastic IP addresses, see Elastic IP Addresses in the Amazon Elastic Compute Cloud User Guide. When you move a secondary private IP address to another network interface, any Elastic IP address that is associated with the IP address is also moved. Remapping an IP address is an asynchronous operation. When you move an IP address from one network interface to another, check network/interfaces/macs/mac/local-ipv4s in the instance metadata to confirm that the remapping is complete.
    */
  def assignPrivateIpAddresses(params: AssignPrivateIpAddressesRequest): Request[AssignPrivateIpAddressesResult, AWSError] = js.native
  def assignPrivateIpAddresses(
    params: AssignPrivateIpAddressesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssignPrivateIpAddressesResult, Unit]
  ): Request[AssignPrivateIpAddressesResult, AWSError] = js.native
  /**
    * Associates an Elastic IP address with an instance or a network interface. Before you can use an Elastic IP address, you must allocate it to your account. An Elastic IP address is for use in either the EC2-Classic platform or in a VPC. For more information, see Elastic IP Addresses in the Amazon Elastic Compute Cloud User Guide. [EC2-Classic, VPC in an EC2-VPC-only account] If the Elastic IP address is already associated with a different instance, it is disassociated from that instance and associated with the specified instance. If you associate an Elastic IP address with an instance that has an existing Elastic IP address, the existing address is disassociated from the instance, but remains allocated to your account. [VPC in an EC2-Classic account] If you don't specify a private IP address, the Elastic IP address is associated with the primary IP address. If the Elastic IP address is already associated with a different instance or a network interface, you get an error unless you allow reassociation. You cannot associate an Elastic IP address with an instance or network interface that has an existing Elastic IP address. You cannot associate an Elastic IP address with an interface in a different network border group.  This is an idempotent operation. If you perform the operation more than once, Amazon EC2 doesn't return an error, and you may be charged for each time the Elastic IP address is remapped to the same instance. For more information, see the Elastic IP Addresses section of Amazon EC2 Pricing. 
    */
  def associateAddress(): Request[AssociateAddressResult, AWSError] = js.native
  def associateAddress(callback: js.Function2[/* err */ AWSError, /* data */ AssociateAddressResult, Unit]): Request[AssociateAddressResult, AWSError] = js.native
  /**
    * Associates an Elastic IP address with an instance or a network interface. Before you can use an Elastic IP address, you must allocate it to your account. An Elastic IP address is for use in either the EC2-Classic platform or in a VPC. For more information, see Elastic IP Addresses in the Amazon Elastic Compute Cloud User Guide. [EC2-Classic, VPC in an EC2-VPC-only account] If the Elastic IP address is already associated with a different instance, it is disassociated from that instance and associated with the specified instance. If you associate an Elastic IP address with an instance that has an existing Elastic IP address, the existing address is disassociated from the instance, but remains allocated to your account. [VPC in an EC2-Classic account] If you don't specify a private IP address, the Elastic IP address is associated with the primary IP address. If the Elastic IP address is already associated with a different instance or a network interface, you get an error unless you allow reassociation. You cannot associate an Elastic IP address with an instance or network interface that has an existing Elastic IP address. You cannot associate an Elastic IP address with an interface in a different network border group.  This is an idempotent operation. If you perform the operation more than once, Amazon EC2 doesn't return an error, and you may be charged for each time the Elastic IP address is remapped to the same instance. For more information, see the Elastic IP Addresses section of Amazon EC2 Pricing. 
    */
  def associateAddress(params: AssociateAddressRequest): Request[AssociateAddressResult, AWSError] = js.native
  def associateAddress(
    params: AssociateAddressRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateAddressResult, Unit]
  ): Request[AssociateAddressResult, AWSError] = js.native
  /**
    * Associates a target network with a Client VPN endpoint. A target network is a subnet in a VPC. You can associate multiple subnets from the same VPC with a Client VPN endpoint. You can associate only one subnet in each Availability Zone. We recommend that you associate at least two subnets to provide Availability Zone redundancy.
    */
  def associateClientVpnTargetNetwork(): Request[AssociateClientVpnTargetNetworkResult, AWSError] = js.native
  def associateClientVpnTargetNetwork(callback: js.Function2[/* err */ AWSError, /* data */ AssociateClientVpnTargetNetworkResult, Unit]): Request[AssociateClientVpnTargetNetworkResult, AWSError] = js.native
  /**
    * Associates a target network with a Client VPN endpoint. A target network is a subnet in a VPC. You can associate multiple subnets from the same VPC with a Client VPN endpoint. You can associate only one subnet in each Availability Zone. We recommend that you associate at least two subnets to provide Availability Zone redundancy.
    */
  def associateClientVpnTargetNetwork(params: AssociateClientVpnTargetNetworkRequest): Request[AssociateClientVpnTargetNetworkResult, AWSError] = js.native
  def associateClientVpnTargetNetwork(
    params: AssociateClientVpnTargetNetworkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateClientVpnTargetNetworkResult, Unit]
  ): Request[AssociateClientVpnTargetNetworkResult, AWSError] = js.native
  /**
    * Associates a set of DHCP options (that you've previously created) with the specified VPC, or associates no DHCP options with the VPC. After you associate the options with the VPC, any existing instances and all new instances that you launch in that VPC use the options. You don't need to restart or relaunch the instances. They automatically pick up the changes within a few hours, depending on how frequently the instance renews its DHCP lease. You can explicitly renew the lease using the operating system on the instance. For more information, see DHCP Options Sets in the Amazon Virtual Private Cloud User Guide.
    */
  def associateDhcpOptions(): Request[js.Object, AWSError] = js.native
  def associateDhcpOptions(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Associates a set of DHCP options (that you've previously created) with the specified VPC, or associates no DHCP options with the VPC. After you associate the options with the VPC, any existing instances and all new instances that you launch in that VPC use the options. You don't need to restart or relaunch the instances. They automatically pick up the changes within a few hours, depending on how frequently the instance renews its DHCP lease. You can explicitly renew the lease using the operating system on the instance. For more information, see DHCP Options Sets in the Amazon Virtual Private Cloud User Guide.
    */
  def associateDhcpOptions(params: AssociateDhcpOptionsRequest): Request[js.Object, AWSError] = js.native
  def associateDhcpOptions(
    params: AssociateDhcpOptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Associates an IAM instance profile with a running or stopped instance. You cannot associate more than one IAM instance profile with an instance.
    */
  def associateIamInstanceProfile(): Request[AssociateIamInstanceProfileResult, AWSError] = js.native
  def associateIamInstanceProfile(callback: js.Function2[/* err */ AWSError, /* data */ AssociateIamInstanceProfileResult, Unit]): Request[AssociateIamInstanceProfileResult, AWSError] = js.native
  /**
    * Associates an IAM instance profile with a running or stopped instance. You cannot associate more than one IAM instance profile with an instance.
    */
  def associateIamInstanceProfile(params: AssociateIamInstanceProfileRequest): Request[AssociateIamInstanceProfileResult, AWSError] = js.native
  def associateIamInstanceProfile(
    params: AssociateIamInstanceProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateIamInstanceProfileResult, Unit]
  ): Request[AssociateIamInstanceProfileResult, AWSError] = js.native
  /**
    * Associates a subnet in your VPC or an internet gateway or virtual private gateway attached to your VPC with a route table in your VPC. This association causes traffic from the subnet or gateway to be routed according to the routes in the route table. The action returns an association ID, which you need in order to disassociate the route table later. A route table can be associated with multiple subnets. For more information, see Route Tables in the Amazon Virtual Private Cloud User Guide.
    */
  def associateRouteTable(): Request[AssociateRouteTableResult, AWSError] = js.native
  def associateRouteTable(callback: js.Function2[/* err */ AWSError, /* data */ AssociateRouteTableResult, Unit]): Request[AssociateRouteTableResult, AWSError] = js.native
  /**
    * Associates a subnet in your VPC or an internet gateway or virtual private gateway attached to your VPC with a route table in your VPC. This association causes traffic from the subnet or gateway to be routed according to the routes in the route table. The action returns an association ID, which you need in order to disassociate the route table later. A route table can be associated with multiple subnets. For more information, see Route Tables in the Amazon Virtual Private Cloud User Guide.
    */
  def associateRouteTable(params: AssociateRouteTableRequest): Request[AssociateRouteTableResult, AWSError] = js.native
  def associateRouteTable(
    params: AssociateRouteTableRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateRouteTableResult, Unit]
  ): Request[AssociateRouteTableResult, AWSError] = js.native
  /**
    * Associates a CIDR block with your subnet. You can only associate a single IPv6 CIDR block with your subnet. An IPv6 CIDR block must have a prefix length of /64.
    */
  def associateSubnetCidrBlock(): Request[AssociateSubnetCidrBlockResult, AWSError] = js.native
  def associateSubnetCidrBlock(callback: js.Function2[/* err */ AWSError, /* data */ AssociateSubnetCidrBlockResult, Unit]): Request[AssociateSubnetCidrBlockResult, AWSError] = js.native
  /**
    * Associates a CIDR block with your subnet. You can only associate a single IPv6 CIDR block with your subnet. An IPv6 CIDR block must have a prefix length of /64.
    */
  def associateSubnetCidrBlock(params: AssociateSubnetCidrBlockRequest): Request[AssociateSubnetCidrBlockResult, AWSError] = js.native
  def associateSubnetCidrBlock(
    params: AssociateSubnetCidrBlockRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateSubnetCidrBlockResult, Unit]
  ): Request[AssociateSubnetCidrBlockResult, AWSError] = js.native
  /**
    * Associates the specified subnets and transit gateway attachments with the specified transit gateway multicast domain. The transit gateway attachment must be in the available state before you can add a resource. Use DescribeTransitGatewayAttachments to see the state of the attachment.
    */
  def associateTransitGatewayMulticastDomain(): Request[AssociateTransitGatewayMulticastDomainResult, AWSError] = js.native
  def associateTransitGatewayMulticastDomain(
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateTransitGatewayMulticastDomainResult, Unit]
  ): Request[AssociateTransitGatewayMulticastDomainResult, AWSError] = js.native
  /**
    * Associates the specified subnets and transit gateway attachments with the specified transit gateway multicast domain. The transit gateway attachment must be in the available state before you can add a resource. Use DescribeTransitGatewayAttachments to see the state of the attachment.
    */
  def associateTransitGatewayMulticastDomain(params: AssociateTransitGatewayMulticastDomainRequest): Request[AssociateTransitGatewayMulticastDomainResult, AWSError] = js.native
  def associateTransitGatewayMulticastDomain(
    params: AssociateTransitGatewayMulticastDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateTransitGatewayMulticastDomainResult, Unit]
  ): Request[AssociateTransitGatewayMulticastDomainResult, AWSError] = js.native
  /**
    * Associates the specified attachment with the specified transit gateway route table. You can associate only one route table with an attachment.
    */
  def associateTransitGatewayRouteTable(): Request[AssociateTransitGatewayRouteTableResult, AWSError] = js.native
  def associateTransitGatewayRouteTable(
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateTransitGatewayRouteTableResult, Unit]
  ): Request[AssociateTransitGatewayRouteTableResult, AWSError] = js.native
  /**
    * Associates the specified attachment with the specified transit gateway route table. You can associate only one route table with an attachment.
    */
  def associateTransitGatewayRouteTable(params: AssociateTransitGatewayRouteTableRequest): Request[AssociateTransitGatewayRouteTableResult, AWSError] = js.native
  def associateTransitGatewayRouteTable(
    params: AssociateTransitGatewayRouteTableRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateTransitGatewayRouteTableResult, Unit]
  ): Request[AssociateTransitGatewayRouteTableResult, AWSError] = js.native
  /**
    * Associates a CIDR block with your VPC. You can associate a secondary IPv4 CIDR block, or you can associate an Amazon-provided IPv6 CIDR block. The IPv6 CIDR block size is fixed at /56. For more information about associating CIDR blocks with your VPC and applicable restrictions, see VPC and Subnet Sizing in the Amazon Virtual Private Cloud User Guide.
    */
  def associateVpcCidrBlock(): Request[AssociateVpcCidrBlockResult, AWSError] = js.native
  def associateVpcCidrBlock(callback: js.Function2[/* err */ AWSError, /* data */ AssociateVpcCidrBlockResult, Unit]): Request[AssociateVpcCidrBlockResult, AWSError] = js.native
  /**
    * Associates a CIDR block with your VPC. You can associate a secondary IPv4 CIDR block, or you can associate an Amazon-provided IPv6 CIDR block. The IPv6 CIDR block size is fixed at /56. For more information about associating CIDR blocks with your VPC and applicable restrictions, see VPC and Subnet Sizing in the Amazon Virtual Private Cloud User Guide.
    */
  def associateVpcCidrBlock(params: AssociateVpcCidrBlockRequest): Request[AssociateVpcCidrBlockResult, AWSError] = js.native
  def associateVpcCidrBlock(
    params: AssociateVpcCidrBlockRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateVpcCidrBlockResult, Unit]
  ): Request[AssociateVpcCidrBlockResult, AWSError] = js.native
  /**
    * Links an EC2-Classic instance to a ClassicLink-enabled VPC through one or more of the VPC's security groups. You cannot link an EC2-Classic instance to more than one VPC at a time. You can only link an instance that's in the running state. An instance is automatically unlinked from a VPC when it's stopped - you can link it to the VPC again when you restart it. After you've linked an instance, you cannot change the VPC security groups that are associated with it. To change the security groups, you must first unlink the instance, and then link it again. Linking your instance to a VPC is sometimes referred to as attaching your instance.
    */
  def attachClassicLinkVpc(): Request[AttachClassicLinkVpcResult, AWSError] = js.native
  def attachClassicLinkVpc(callback: js.Function2[/* err */ AWSError, /* data */ AttachClassicLinkVpcResult, Unit]): Request[AttachClassicLinkVpcResult, AWSError] = js.native
  /**
    * Links an EC2-Classic instance to a ClassicLink-enabled VPC through one or more of the VPC's security groups. You cannot link an EC2-Classic instance to more than one VPC at a time. You can only link an instance that's in the running state. An instance is automatically unlinked from a VPC when it's stopped - you can link it to the VPC again when you restart it. After you've linked an instance, you cannot change the VPC security groups that are associated with it. To change the security groups, you must first unlink the instance, and then link it again. Linking your instance to a VPC is sometimes referred to as attaching your instance.
    */
  def attachClassicLinkVpc(params: AttachClassicLinkVpcRequest): Request[AttachClassicLinkVpcResult, AWSError] = js.native
  def attachClassicLinkVpc(
    params: AttachClassicLinkVpcRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AttachClassicLinkVpcResult, Unit]
  ): Request[AttachClassicLinkVpcResult, AWSError] = js.native
  /**
    * Attaches an internet gateway or a virtual private gateway to a VPC, enabling connectivity between the internet and the VPC. For more information about your VPC and internet gateway, see the Amazon Virtual Private Cloud User Guide.
    */
  def attachInternetGateway(): Request[js.Object, AWSError] = js.native
  def attachInternetGateway(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Attaches an internet gateway or a virtual private gateway to a VPC, enabling connectivity between the internet and the VPC. For more information about your VPC and internet gateway, see the Amazon Virtual Private Cloud User Guide.
    */
  def attachInternetGateway(params: AttachInternetGatewayRequest): Request[js.Object, AWSError] = js.native
  def attachInternetGateway(
    params: AttachInternetGatewayRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Attaches a network interface to an instance.
    */
  def attachNetworkInterface(): Request[AttachNetworkInterfaceResult, AWSError] = js.native
  def attachNetworkInterface(callback: js.Function2[/* err */ AWSError, /* data */ AttachNetworkInterfaceResult, Unit]): Request[AttachNetworkInterfaceResult, AWSError] = js.native
  /**
    * Attaches a network interface to an instance.
    */
  def attachNetworkInterface(params: AttachNetworkInterfaceRequest): Request[AttachNetworkInterfaceResult, AWSError] = js.native
  def attachNetworkInterface(
    params: AttachNetworkInterfaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AttachNetworkInterfaceResult, Unit]
  ): Request[AttachNetworkInterfaceResult, AWSError] = js.native
  /**
    * Attaches an EBS volume to a running or stopped instance and exposes it to the instance with the specified device name. Encrypted EBS volumes must be attached to instances that support Amazon EBS encryption. For more information, see Amazon EBS Encryption in the Amazon Elastic Compute Cloud User Guide. After you attach an EBS volume, you must make it available. For more information, see Making an EBS Volume Available For Use. If a volume has an AWS Marketplace product code:   The volume can be attached only to a stopped instance.   AWS Marketplace product codes are copied from the volume to the instance.   You must be subscribed to the product.   The instance type and operating system of the instance must support the product. For example, you can't detach a volume from a Windows instance and attach it to a Linux instance.   For more information, see Attaching Amazon EBS Volumes in the Amazon Elastic Compute Cloud User Guide.
    */
  def attachVolume(): Request[VolumeAttachment, AWSError] = js.native
  def attachVolume(callback: js.Function2[/* err */ AWSError, /* data */ VolumeAttachment, Unit]): Request[VolumeAttachment, AWSError] = js.native
  /**
    * Attaches an EBS volume to a running or stopped instance and exposes it to the instance with the specified device name. Encrypted EBS volumes must be attached to instances that support Amazon EBS encryption. For more information, see Amazon EBS Encryption in the Amazon Elastic Compute Cloud User Guide. After you attach an EBS volume, you must make it available. For more information, see Making an EBS Volume Available For Use. If a volume has an AWS Marketplace product code:   The volume can be attached only to a stopped instance.   AWS Marketplace product codes are copied from the volume to the instance.   You must be subscribed to the product.   The instance type and operating system of the instance must support the product. For example, you can't detach a volume from a Windows instance and attach it to a Linux instance.   For more information, see Attaching Amazon EBS Volumes in the Amazon Elastic Compute Cloud User Guide.
    */
  def attachVolume(params: AttachVolumeRequest): Request[VolumeAttachment, AWSError] = js.native
  def attachVolume(
    params: AttachVolumeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ VolumeAttachment, Unit]
  ): Request[VolumeAttachment, AWSError] = js.native
  /**
    * Attaches a virtual private gateway to a VPC. You can attach one virtual private gateway to one VPC at a time. For more information, see AWS Site-to-Site VPN in the AWS Site-to-Site VPN User Guide.
    */
  def attachVpnGateway(): Request[AttachVpnGatewayResult, AWSError] = js.native
  def attachVpnGateway(callback: js.Function2[/* err */ AWSError, /* data */ AttachVpnGatewayResult, Unit]): Request[AttachVpnGatewayResult, AWSError] = js.native
  /**
    * Attaches a virtual private gateway to a VPC. You can attach one virtual private gateway to one VPC at a time. For more information, see AWS Site-to-Site VPN in the AWS Site-to-Site VPN User Guide.
    */
  def attachVpnGateway(params: AttachVpnGatewayRequest): Request[AttachVpnGatewayResult, AWSError] = js.native
  def attachVpnGateway(
    params: AttachVpnGatewayRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AttachVpnGatewayResult, Unit]
  ): Request[AttachVpnGatewayResult, AWSError] = js.native
  /**
    * Adds an ingress authorization rule to a Client VPN endpoint. Ingress authorization rules act as firewall rules that grant access to networks. You must configure ingress authorization rules to enable clients to access resources in AWS or on-premises networks.
    */
  def authorizeClientVpnIngress(): Request[AuthorizeClientVpnIngressResult, AWSError] = js.native
  def authorizeClientVpnIngress(callback: js.Function2[/* err */ AWSError, /* data */ AuthorizeClientVpnIngressResult, Unit]): Request[AuthorizeClientVpnIngressResult, AWSError] = js.native
  /**
    * Adds an ingress authorization rule to a Client VPN endpoint. Ingress authorization rules act as firewall rules that grant access to networks. You must configure ingress authorization rules to enable clients to access resources in AWS or on-premises networks.
    */
  def authorizeClientVpnIngress(params: AuthorizeClientVpnIngressRequest): Request[AuthorizeClientVpnIngressResult, AWSError] = js.native
  def authorizeClientVpnIngress(
    params: AuthorizeClientVpnIngressRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AuthorizeClientVpnIngressResult, Unit]
  ): Request[AuthorizeClientVpnIngressResult, AWSError] = js.native
  /**
    * [VPC only] Adds the specified egress rules to a security group for use with a VPC. An outbound rule permits instances to send traffic to the specified IPv4 or IPv6 CIDR address ranges, or to the instances associated with the specified destination security groups. You specify a protocol for each rule (for example, TCP). For the TCP and UDP protocols, you must also specify the destination port or port range. For the ICMP protocol, you must also specify the ICMP type and code. You can use -1 for the type or code to mean all types or all codes. Rule changes are propagated to affected instances as quickly as possible. However, a small delay might occur. For more information about VPC security group limits, see Amazon VPC Limits.
    */
  def authorizeSecurityGroupEgress(): Request[js.Object, AWSError] = js.native
  def authorizeSecurityGroupEgress(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * [VPC only] Adds the specified egress rules to a security group for use with a VPC. An outbound rule permits instances to send traffic to the specified IPv4 or IPv6 CIDR address ranges, or to the instances associated with the specified destination security groups. You specify a protocol for each rule (for example, TCP). For the TCP and UDP protocols, you must also specify the destination port or port range. For the ICMP protocol, you must also specify the ICMP type and code. You can use -1 for the type or code to mean all types or all codes. Rule changes are propagated to affected instances as quickly as possible. However, a small delay might occur. For more information about VPC security group limits, see Amazon VPC Limits.
    */
  def authorizeSecurityGroupEgress(params: AuthorizeSecurityGroupEgressRequest): Request[js.Object, AWSError] = js.native
  def authorizeSecurityGroupEgress(
    params: AuthorizeSecurityGroupEgressRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Adds the specified ingress rules to a security group. An inbound rule permits instances to receive traffic from the specified IPv4 or IPv6 CIDR address ranges, or from the instances associated with the specified destination security groups. You specify a protocol for each rule (for example, TCP). For TCP and UDP, you must also specify the destination port or port range. For ICMP/ICMPv6, you must also specify the ICMP/ICMPv6 type and code. You can use -1 to mean all types or all codes. Rule changes are propagated to instances within the security group as quickly as possible. However, a small delay might occur. For more information about VPC security group limits, see Amazon VPC Limits.
    */
  def authorizeSecurityGroupIngress(): Request[js.Object, AWSError] = js.native
  def authorizeSecurityGroupIngress(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds the specified ingress rules to a security group. An inbound rule permits instances to receive traffic from the specified IPv4 or IPv6 CIDR address ranges, or from the instances associated with the specified destination security groups. You specify a protocol for each rule (for example, TCP). For TCP and UDP, you must also specify the destination port or port range. For ICMP/ICMPv6, you must also specify the ICMP/ICMPv6 type and code. You can use -1 to mean all types or all codes. Rule changes are propagated to instances within the security group as quickly as possible. However, a small delay might occur. For more information about VPC security group limits, see Amazon VPC Limits.
    */
  def authorizeSecurityGroupIngress(params: AuthorizeSecurityGroupIngressRequest): Request[js.Object, AWSError] = js.native
  def authorizeSecurityGroupIngress(
    params: AuthorizeSecurityGroupIngressRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Bundles an Amazon instance store-backed Windows instance. During bundling, only the root device volume (C:\) is bundled. Data on other instance store volumes is not preserved.  This action is not applicable for Linux/Unix instances or Windows instances that are backed by Amazon EBS. 
    */
  def bundleInstance(): Request[BundleInstanceResult, AWSError] = js.native
  def bundleInstance(callback: js.Function2[/* err */ AWSError, /* data */ BundleInstanceResult, Unit]): Request[BundleInstanceResult, AWSError] = js.native
  /**
    * Bundles an Amazon instance store-backed Windows instance. During bundling, only the root device volume (C:\) is bundled. Data on other instance store volumes is not preserved.  This action is not applicable for Linux/Unix instances or Windows instances that are backed by Amazon EBS. 
    */
  def bundleInstance(params: BundleInstanceRequest): Request[BundleInstanceResult, AWSError] = js.native
  def bundleInstance(
    params: BundleInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BundleInstanceResult, Unit]
  ): Request[BundleInstanceResult, AWSError] = js.native
  /**
    * Cancels a bundling operation for an instance store-backed Windows instance.
    */
  def cancelBundleTask(): Request[CancelBundleTaskResult, AWSError] = js.native
  def cancelBundleTask(callback: js.Function2[/* err */ AWSError, /* data */ CancelBundleTaskResult, Unit]): Request[CancelBundleTaskResult, AWSError] = js.native
  /**
    * Cancels a bundling operation for an instance store-backed Windows instance.
    */
  def cancelBundleTask(params: CancelBundleTaskRequest): Request[CancelBundleTaskResult, AWSError] = js.native
  def cancelBundleTask(
    params: CancelBundleTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelBundleTaskResult, Unit]
  ): Request[CancelBundleTaskResult, AWSError] = js.native
  /**
    * Cancels the specified Capacity Reservation, releases the reserved capacity, and changes the Capacity Reservation's state to cancelled. Instances running in the reserved capacity continue running until you stop them. Stopped instances that target the Capacity Reservation can no longer launch. Modify these instances to either target a different Capacity Reservation, launch On-Demand Instance capacity, or run in any open Capacity Reservation that has matching attributes and sufficient capacity.
    */
  def cancelCapacityReservation(): Request[CancelCapacityReservationResult, AWSError] = js.native
  def cancelCapacityReservation(callback: js.Function2[/* err */ AWSError, /* data */ CancelCapacityReservationResult, Unit]): Request[CancelCapacityReservationResult, AWSError] = js.native
  /**
    * Cancels the specified Capacity Reservation, releases the reserved capacity, and changes the Capacity Reservation's state to cancelled. Instances running in the reserved capacity continue running until you stop them. Stopped instances that target the Capacity Reservation can no longer launch. Modify these instances to either target a different Capacity Reservation, launch On-Demand Instance capacity, or run in any open Capacity Reservation that has matching attributes and sufficient capacity.
    */
  def cancelCapacityReservation(params: CancelCapacityReservationRequest): Request[CancelCapacityReservationResult, AWSError] = js.native
  def cancelCapacityReservation(
    params: CancelCapacityReservationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelCapacityReservationResult, Unit]
  ): Request[CancelCapacityReservationResult, AWSError] = js.native
  /**
    * Cancels an active conversion task. The task can be the import of an instance or volume. The action removes all artifacts of the conversion, including a partially uploaded volume or instance. If the conversion is complete or is in the process of transferring the final disk image, the command fails and returns an exception. For more information, see Importing a Virtual Machine Using the Amazon EC2 CLI.
    */
  def cancelConversionTask(): Request[js.Object, AWSError] = js.native
  def cancelConversionTask(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Cancels an active conversion task. The task can be the import of an instance or volume. The action removes all artifacts of the conversion, including a partially uploaded volume or instance. If the conversion is complete or is in the process of transferring the final disk image, the command fails and returns an exception. For more information, see Importing a Virtual Machine Using the Amazon EC2 CLI.
    */
  def cancelConversionTask(params: CancelConversionRequest): Request[js.Object, AWSError] = js.native
  def cancelConversionTask(
    params: CancelConversionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Cancels an active export task. The request removes all artifacts of the export, including any partially-created Amazon S3 objects. If the export task is complete or is in the process of transferring the final disk image, the command fails and returns an error.
    */
  def cancelExportTask(): Request[js.Object, AWSError] = js.native
  def cancelExportTask(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Cancels an active export task. The request removes all artifacts of the export, including any partially-created Amazon S3 objects. If the export task is complete or is in the process of transferring the final disk image, the command fails and returns an error.
    */
  def cancelExportTask(params: CancelExportTaskRequest): Request[js.Object, AWSError] = js.native
  def cancelExportTask(
    params: CancelExportTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Cancels an in-process import virtual machine or import snapshot task.
    */
  def cancelImportTask(): Request[CancelImportTaskResult, AWSError] = js.native
  def cancelImportTask(callback: js.Function2[/* err */ AWSError, /* data */ CancelImportTaskResult, Unit]): Request[CancelImportTaskResult, AWSError] = js.native
  /**
    * Cancels an in-process import virtual machine or import snapshot task.
    */
  def cancelImportTask(params: CancelImportTaskRequest): Request[CancelImportTaskResult, AWSError] = js.native
  def cancelImportTask(
    params: CancelImportTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelImportTaskResult, Unit]
  ): Request[CancelImportTaskResult, AWSError] = js.native
  /**
    * Cancels the specified Reserved Instance listing in the Reserved Instance Marketplace. For more information, see Reserved Instance Marketplace in the Amazon Elastic Compute Cloud User Guide.
    */
  def cancelReservedInstancesListing(): Request[CancelReservedInstancesListingResult, AWSError] = js.native
  def cancelReservedInstancesListing(callback: js.Function2[/* err */ AWSError, /* data */ CancelReservedInstancesListingResult, Unit]): Request[CancelReservedInstancesListingResult, AWSError] = js.native
  /**
    * Cancels the specified Reserved Instance listing in the Reserved Instance Marketplace. For more information, see Reserved Instance Marketplace in the Amazon Elastic Compute Cloud User Guide.
    */
  def cancelReservedInstancesListing(params: CancelReservedInstancesListingRequest): Request[CancelReservedInstancesListingResult, AWSError] = js.native
  def cancelReservedInstancesListing(
    params: CancelReservedInstancesListingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelReservedInstancesListingResult, Unit]
  ): Request[CancelReservedInstancesListingResult, AWSError] = js.native
  /**
    * Cancels the specified Spot Fleet requests. After you cancel a Spot Fleet request, the Spot Fleet launches no new Spot Instances. You must specify whether the Spot Fleet should also terminate its Spot Instances. If you terminate the instances, the Spot Fleet request enters the cancelled_terminating state. Otherwise, the Spot Fleet request enters the cancelled_running state and the instances continue to run until they are interrupted or you terminate them manually.
    */
  def cancelSpotFleetRequests(): Request[CancelSpotFleetRequestsResponse, AWSError] = js.native
  def cancelSpotFleetRequests(callback: js.Function2[/* err */ AWSError, /* data */ CancelSpotFleetRequestsResponse, Unit]): Request[CancelSpotFleetRequestsResponse, AWSError] = js.native
  /**
    * Cancels the specified Spot Fleet requests. After you cancel a Spot Fleet request, the Spot Fleet launches no new Spot Instances. You must specify whether the Spot Fleet should also terminate its Spot Instances. If you terminate the instances, the Spot Fleet request enters the cancelled_terminating state. Otherwise, the Spot Fleet request enters the cancelled_running state and the instances continue to run until they are interrupted or you terminate them manually.
    */
  def cancelSpotFleetRequests(params: CancelSpotFleetRequestsRequest): Request[CancelSpotFleetRequestsResponse, AWSError] = js.native
  def cancelSpotFleetRequests(
    params: CancelSpotFleetRequestsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelSpotFleetRequestsResponse, Unit]
  ): Request[CancelSpotFleetRequestsResponse, AWSError] = js.native
  /**
    * Cancels one or more Spot Instance requests.  Canceling a Spot Instance request does not terminate running Spot Instances associated with the request. 
    */
  def cancelSpotInstanceRequests(): Request[CancelSpotInstanceRequestsResult, AWSError] = js.native
  def cancelSpotInstanceRequests(callback: js.Function2[/* err */ AWSError, /* data */ CancelSpotInstanceRequestsResult, Unit]): Request[CancelSpotInstanceRequestsResult, AWSError] = js.native
  /**
    * Cancels one or more Spot Instance requests.  Canceling a Spot Instance request does not terminate running Spot Instances associated with the request. 
    */
  def cancelSpotInstanceRequests(params: CancelSpotInstanceRequestsRequest): Request[CancelSpotInstanceRequestsResult, AWSError] = js.native
  def cancelSpotInstanceRequests(
    params: CancelSpotInstanceRequestsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelSpotInstanceRequestsResult, Unit]
  ): Request[CancelSpotInstanceRequestsResult, AWSError] = js.native
  /**
    * Determines whether a product code is associated with an instance. This action can only be used by the owner of the product code. It is useful when a product code owner must verify whether another user's instance is eligible for support.
    */
  def confirmProductInstance(): Request[ConfirmProductInstanceResult, AWSError] = js.native
  def confirmProductInstance(callback: js.Function2[/* err */ AWSError, /* data */ ConfirmProductInstanceResult, Unit]): Request[ConfirmProductInstanceResult, AWSError] = js.native
  /**
    * Determines whether a product code is associated with an instance. This action can only be used by the owner of the product code. It is useful when a product code owner must verify whether another user's instance is eligible for support.
    */
  def confirmProductInstance(params: ConfirmProductInstanceRequest): Request[ConfirmProductInstanceResult, AWSError] = js.native
  def confirmProductInstance(
    params: ConfirmProductInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ConfirmProductInstanceResult, Unit]
  ): Request[ConfirmProductInstanceResult, AWSError] = js.native
  /**
    * Copies the specified Amazon FPGA Image (AFI) to the current Region.
    */
  def copyFpgaImage(): Request[CopyFpgaImageResult, AWSError] = js.native
  def copyFpgaImage(callback: js.Function2[/* err */ AWSError, /* data */ CopyFpgaImageResult, Unit]): Request[CopyFpgaImageResult, AWSError] = js.native
  /**
    * Copies the specified Amazon FPGA Image (AFI) to the current Region.
    */
  def copyFpgaImage(params: CopyFpgaImageRequest): Request[CopyFpgaImageResult, AWSError] = js.native
  def copyFpgaImage(
    params: CopyFpgaImageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CopyFpgaImageResult, Unit]
  ): Request[CopyFpgaImageResult, AWSError] = js.native
  /**
    * Initiates the copy of an AMI from the specified source Region to the current Region. You specify the destination Region by using its endpoint when making the request. Copies of encrypted backing snapshots for the AMI are encrypted. Copies of unencrypted backing snapshots remain unencrypted, unless you set Encrypted during the copy operation. You cannot create an unencrypted copy of an encrypted backing snapshot. For more information about the prerequisites and limits when copying an AMI, see Copying an AMI in the Amazon Elastic Compute Cloud User Guide.
    */
  def copyImage(): Request[CopyImageResult, AWSError] = js.native
  def copyImage(callback: js.Function2[/* err */ AWSError, /* data */ CopyImageResult, Unit]): Request[CopyImageResult, AWSError] = js.native
  /**
    * Initiates the copy of an AMI from the specified source Region to the current Region. You specify the destination Region by using its endpoint when making the request. Copies of encrypted backing snapshots for the AMI are encrypted. Copies of unencrypted backing snapshots remain unencrypted, unless you set Encrypted during the copy operation. You cannot create an unencrypted copy of an encrypted backing snapshot. For more information about the prerequisites and limits when copying an AMI, see Copying an AMI in the Amazon Elastic Compute Cloud User Guide.
    */
  def copyImage(params: CopyImageRequest): Request[CopyImageResult, AWSError] = js.native
  def copyImage(
    params: CopyImageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CopyImageResult, Unit]
  ): Request[CopyImageResult, AWSError] = js.native
  /**
    * Copies a point-in-time snapshot of an EBS volume and stores it in Amazon S3. You can copy the snapshot within the same Region or from one Region to another. You can use the snapshot to create EBS volumes or Amazon Machine Images (AMIs). Copies of encrypted EBS snapshots remain encrypted. Copies of unencrypted snapshots remain unencrypted, unless you enable encryption for the snapshot copy operation. By default, encrypted snapshot copies use the default AWS Key Management Service (AWS KMS) customer master key (CMK); however, you can specify a different CMK. To copy an encrypted snapshot that has been shared from another account, you must have permissions for the CMK used to encrypt the snapshot. Snapshots created by copying another snapshot have an arbitrary volume ID that should not be used for any purpose. For more information, see Copying an Amazon EBS Snapshot in the Amazon Elastic Compute Cloud User Guide.
    */
  def copySnapshot(): Request[CopySnapshotResult, AWSError] = js.native
  def copySnapshot(callback: js.Function2[/* err */ AWSError, /* data */ CopySnapshotResult, Unit]): Request[CopySnapshotResult, AWSError] = js.native
  /**
    * Copies a point-in-time snapshot of an EBS volume and stores it in Amazon S3. You can copy the snapshot within the same Region or from one Region to another. You can use the snapshot to create EBS volumes or Amazon Machine Images (AMIs). Copies of encrypted EBS snapshots remain encrypted. Copies of unencrypted snapshots remain unencrypted, unless you enable encryption for the snapshot copy operation. By default, encrypted snapshot copies use the default AWS Key Management Service (AWS KMS) customer master key (CMK); however, you can specify a different CMK. To copy an encrypted snapshot that has been shared from another account, you must have permissions for the CMK used to encrypt the snapshot. Snapshots created by copying another snapshot have an arbitrary volume ID that should not be used for any purpose. For more information, see Copying an Amazon EBS Snapshot in the Amazon Elastic Compute Cloud User Guide.
    */
  def copySnapshot(params: CopySnapshotRequest): Request[CopySnapshotResult, AWSError] = js.native
  def copySnapshot(
    params: CopySnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CopySnapshotResult, Unit]
  ): Request[CopySnapshotResult, AWSError] = js.native
  /**
    * Creates a new Capacity Reservation with the specified attributes. Capacity Reservations enable you to reserve capacity for your Amazon EC2 instances in a specific Availability Zone for any duration. This gives you the flexibility to selectively add capacity reservations and still get the Regional RI discounts for that usage. By creating Capacity Reservations, you ensure that you always have access to Amazon EC2 capacity when you need it, for as long as you need it. For more information, see Capacity Reservations in the Amazon Elastic Compute Cloud User Guide. Your request to create a Capacity Reservation could fail if Amazon EC2 does not have sufficient capacity to fulfill the request. If your request fails due to Amazon EC2 capacity constraints, either try again at a later time, try in a different Availability Zone, or request a smaller capacity reservation. If your application is flexible across instance types and sizes, try to create a Capacity Reservation with different instance attributes. Your request could also fail if the requested quantity exceeds your On-Demand Instance limit for the selected instance type. If your request fails due to limit constraints, increase your On-Demand Instance limit for the required instance type and try again. For more information about increasing your instance limits, see Amazon EC2 Service Limits in the Amazon Elastic Compute Cloud User Guide.
    */
  def createCapacityReservation(): Request[CreateCapacityReservationResult, AWSError] = js.native
  def createCapacityReservation(callback: js.Function2[/* err */ AWSError, /* data */ CreateCapacityReservationResult, Unit]): Request[CreateCapacityReservationResult, AWSError] = js.native
  /**
    * Creates a new Capacity Reservation with the specified attributes. Capacity Reservations enable you to reserve capacity for your Amazon EC2 instances in a specific Availability Zone for any duration. This gives you the flexibility to selectively add capacity reservations and still get the Regional RI discounts for that usage. By creating Capacity Reservations, you ensure that you always have access to Amazon EC2 capacity when you need it, for as long as you need it. For more information, see Capacity Reservations in the Amazon Elastic Compute Cloud User Guide. Your request to create a Capacity Reservation could fail if Amazon EC2 does not have sufficient capacity to fulfill the request. If your request fails due to Amazon EC2 capacity constraints, either try again at a later time, try in a different Availability Zone, or request a smaller capacity reservation. If your application is flexible across instance types and sizes, try to create a Capacity Reservation with different instance attributes. Your request could also fail if the requested quantity exceeds your On-Demand Instance limit for the selected instance type. If your request fails due to limit constraints, increase your On-Demand Instance limit for the required instance type and try again. For more information about increasing your instance limits, see Amazon EC2 Service Limits in the Amazon Elastic Compute Cloud User Guide.
    */
  def createCapacityReservation(params: CreateCapacityReservationRequest): Request[CreateCapacityReservationResult, AWSError] = js.native
  def createCapacityReservation(
    params: CreateCapacityReservationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCapacityReservationResult, Unit]
  ): Request[CreateCapacityReservationResult, AWSError] = js.native
  /**
    * Creates a Client VPN endpoint. A Client VPN endpoint is the resource you create and configure to enable and manage client VPN sessions. It is the destination endpoint at which all client VPN sessions are terminated.
    */
  def createClientVpnEndpoint(): Request[CreateClientVpnEndpointResult, AWSError] = js.native
  def createClientVpnEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ CreateClientVpnEndpointResult, Unit]): Request[CreateClientVpnEndpointResult, AWSError] = js.native
  /**
    * Creates a Client VPN endpoint. A Client VPN endpoint is the resource you create and configure to enable and manage client VPN sessions. It is the destination endpoint at which all client VPN sessions are terminated.
    */
  def createClientVpnEndpoint(params: CreateClientVpnEndpointRequest): Request[CreateClientVpnEndpointResult, AWSError] = js.native
  def createClientVpnEndpoint(
    params: CreateClientVpnEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateClientVpnEndpointResult, Unit]
  ): Request[CreateClientVpnEndpointResult, AWSError] = js.native
  /**
    * Adds a route to a network to a Client VPN endpoint. Each Client VPN endpoint has a route table that describes the available destination network routes. Each route in the route table specifies the path for traﬃc to speciﬁc resources or networks.
    */
  def createClientVpnRoute(): Request[CreateClientVpnRouteResult, AWSError] = js.native
  def createClientVpnRoute(callback: js.Function2[/* err */ AWSError, /* data */ CreateClientVpnRouteResult, Unit]): Request[CreateClientVpnRouteResult, AWSError] = js.native
  /**
    * Adds a route to a network to a Client VPN endpoint. Each Client VPN endpoint has a route table that describes the available destination network routes. Each route in the route table specifies the path for traﬃc to speciﬁc resources or networks.
    */
  def createClientVpnRoute(params: CreateClientVpnRouteRequest): Request[CreateClientVpnRouteResult, AWSError] = js.native
  def createClientVpnRoute(
    params: CreateClientVpnRouteRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateClientVpnRouteResult, Unit]
  ): Request[CreateClientVpnRouteResult, AWSError] = js.native
  /**
    * Provides information to AWS about your VPN customer gateway device. The customer gateway is the appliance at your end of the VPN connection. (The device on the AWS side of the VPN connection is the virtual private gateway.) You must provide the Internet-routable IP address of the customer gateway's external interface. The IP address must be static and can be behind a device performing network address translation (NAT). For devices that use Border Gateway Protocol (BGP), you can also provide the device's BGP Autonomous System Number (ASN). You can use an existing ASN assigned to your network. If you don't have an ASN already, you can use a private ASN (in the 64512 - 65534 range).  Amazon EC2 supports all 2-byte ASN numbers in the range of 1 - 65534, with the exception of 7224, which is reserved in the us-east-1 Region, and 9059, which is reserved in the eu-west-1 Region.  For more information, see AWS Site-to-Site VPN in the AWS Site-to-Site VPN User Guide.  To create more than one customer gateway with the same VPN type, IP address, and BGP ASN, specify a unique device name for each customer gateway. Identical requests return information about the existing customer gateway and do not create new customer gateways. 
    */
  def createCustomerGateway(): Request[CreateCustomerGatewayResult, AWSError] = js.native
  def createCustomerGateway(callback: js.Function2[/* err */ AWSError, /* data */ CreateCustomerGatewayResult, Unit]): Request[CreateCustomerGatewayResult, AWSError] = js.native
  /**
    * Provides information to AWS about your VPN customer gateway device. The customer gateway is the appliance at your end of the VPN connection. (The device on the AWS side of the VPN connection is the virtual private gateway.) You must provide the Internet-routable IP address of the customer gateway's external interface. The IP address must be static and can be behind a device performing network address translation (NAT). For devices that use Border Gateway Protocol (BGP), you can also provide the device's BGP Autonomous System Number (ASN). You can use an existing ASN assigned to your network. If you don't have an ASN already, you can use a private ASN (in the 64512 - 65534 range).  Amazon EC2 supports all 2-byte ASN numbers in the range of 1 - 65534, with the exception of 7224, which is reserved in the us-east-1 Region, and 9059, which is reserved in the eu-west-1 Region.  For more information, see AWS Site-to-Site VPN in the AWS Site-to-Site VPN User Guide.  To create more than one customer gateway with the same VPN type, IP address, and BGP ASN, specify a unique device name for each customer gateway. Identical requests return information about the existing customer gateway and do not create new customer gateways. 
    */
  def createCustomerGateway(params: CreateCustomerGatewayRequest): Request[CreateCustomerGatewayResult, AWSError] = js.native
  def createCustomerGateway(
    params: CreateCustomerGatewayRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCustomerGatewayResult, Unit]
  ): Request[CreateCustomerGatewayResult, AWSError] = js.native
  /**
    * Creates a default subnet with a size /20 IPv4 CIDR block in the specified Availability Zone in your default VPC. You can have only one default subnet per Availability Zone. For more information, see Creating a Default Subnet in the Amazon Virtual Private Cloud User Guide.
    */
  def createDefaultSubnet(): Request[CreateDefaultSubnetResult, AWSError] = js.native
  def createDefaultSubnet(callback: js.Function2[/* err */ AWSError, /* data */ CreateDefaultSubnetResult, Unit]): Request[CreateDefaultSubnetResult, AWSError] = js.native
  /**
    * Creates a default subnet with a size /20 IPv4 CIDR block in the specified Availability Zone in your default VPC. You can have only one default subnet per Availability Zone. For more information, see Creating a Default Subnet in the Amazon Virtual Private Cloud User Guide.
    */
  def createDefaultSubnet(params: CreateDefaultSubnetRequest): Request[CreateDefaultSubnetResult, AWSError] = js.native
  def createDefaultSubnet(
    params: CreateDefaultSubnetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDefaultSubnetResult, Unit]
  ): Request[CreateDefaultSubnetResult, AWSError] = js.native
  /**
    * Creates a default VPC with a size /16 IPv4 CIDR block and a default subnet in each Availability Zone. For more information about the components of a default VPC, see Default VPC and Default Subnets in the Amazon Virtual Private Cloud User Guide. You cannot specify the components of the default VPC yourself. If you deleted your previous default VPC, you can create a default VPC. You cannot have more than one default VPC per Region. If your account supports EC2-Classic, you cannot use this action to create a default VPC in a Region that supports EC2-Classic. If you want a default VPC in a Region that supports EC2-Classic, see "I really want a default VPC for my existing EC2 account. Is that possible?" in the Default VPCs FAQ.
    */
  def createDefaultVpc(): Request[CreateDefaultVpcResult, AWSError] = js.native
  def createDefaultVpc(callback: js.Function2[/* err */ AWSError, /* data */ CreateDefaultVpcResult, Unit]): Request[CreateDefaultVpcResult, AWSError] = js.native
  /**
    * Creates a default VPC with a size /16 IPv4 CIDR block and a default subnet in each Availability Zone. For more information about the components of a default VPC, see Default VPC and Default Subnets in the Amazon Virtual Private Cloud User Guide. You cannot specify the components of the default VPC yourself. If you deleted your previous default VPC, you can create a default VPC. You cannot have more than one default VPC per Region. If your account supports EC2-Classic, you cannot use this action to create a default VPC in a Region that supports EC2-Classic. If you want a default VPC in a Region that supports EC2-Classic, see "I really want a default VPC for my existing EC2 account. Is that possible?" in the Default VPCs FAQ.
    */
  def createDefaultVpc(params: CreateDefaultVpcRequest): Request[CreateDefaultVpcResult, AWSError] = js.native
  def createDefaultVpc(
    params: CreateDefaultVpcRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDefaultVpcResult, Unit]
  ): Request[CreateDefaultVpcResult, AWSError] = js.native
  /**
    * Creates a set of DHCP options for your VPC. After creating the set, you must associate it with the VPC, causing all existing and new instances that you launch in the VPC to use this set of DHCP options. The following are the individual DHCP options you can specify. For more information about the options, see RFC 2132.    domain-name-servers - The IP addresses of up to four domain name servers, or AmazonProvidedDNS. The default DHCP option set specifies AmazonProvidedDNS. If specifying more than one domain name server, specify the IP addresses in a single parameter, separated by commas. To have your instance receive a custom DNS hostname as specified in domain-name, you must set domain-name-servers to a custom DNS server.    domain-name - If you're using AmazonProvidedDNS in us-east-1, specify ec2.internal. If you're using AmazonProvidedDNS in another Region, specify region.compute.internal (for example, ap-northeast-1.compute.internal). Otherwise, specify a domain name (for example, MyCompany.com). This value is used to complete unqualified DNS hostnames. Important: Some Linux operating systems accept multiple domain names separated by spaces. However, Windows and other Linux operating systems treat the value as a single domain, which results in unexpected behavior. If your DHCP options set is associated with a VPC that has instances with multiple operating systems, specify only one domain name.    ntp-servers - The IP addresses of up to four Network Time Protocol (NTP) servers.    netbios-name-servers - The IP addresses of up to four NetBIOS name servers.    netbios-node-type - The NetBIOS node type (1, 2, 4, or 8). We recommend that you specify 2 (broadcast and multicast are not currently supported). For more information about these node types, see RFC 2132.   Your VPC automatically starts out with a set of DHCP options that includes only a DNS server that we provide (AmazonProvidedDNS). If you create a set of options, and if your VPC has an internet gateway, make sure to set the domain-name-servers option either to AmazonProvidedDNS or to a domain name server of your choice. For more information, see DHCP Options Sets in the Amazon Virtual Private Cloud User Guide.
    */
  def createDhcpOptions(): Request[CreateDhcpOptionsResult, AWSError] = js.native
  def createDhcpOptions(callback: js.Function2[/* err */ AWSError, /* data */ CreateDhcpOptionsResult, Unit]): Request[CreateDhcpOptionsResult, AWSError] = js.native
  /**
    * Creates a set of DHCP options for your VPC. After creating the set, you must associate it with the VPC, causing all existing and new instances that you launch in the VPC to use this set of DHCP options. The following are the individual DHCP options you can specify. For more information about the options, see RFC 2132.    domain-name-servers - The IP addresses of up to four domain name servers, or AmazonProvidedDNS. The default DHCP option set specifies AmazonProvidedDNS. If specifying more than one domain name server, specify the IP addresses in a single parameter, separated by commas. To have your instance receive a custom DNS hostname as specified in domain-name, you must set domain-name-servers to a custom DNS server.    domain-name - If you're using AmazonProvidedDNS in us-east-1, specify ec2.internal. If you're using AmazonProvidedDNS in another Region, specify region.compute.internal (for example, ap-northeast-1.compute.internal). Otherwise, specify a domain name (for example, MyCompany.com). This value is used to complete unqualified DNS hostnames. Important: Some Linux operating systems accept multiple domain names separated by spaces. However, Windows and other Linux operating systems treat the value as a single domain, which results in unexpected behavior. If your DHCP options set is associated with a VPC that has instances with multiple operating systems, specify only one domain name.    ntp-servers - The IP addresses of up to four Network Time Protocol (NTP) servers.    netbios-name-servers - The IP addresses of up to four NetBIOS name servers.    netbios-node-type - The NetBIOS node type (1, 2, 4, or 8). We recommend that you specify 2 (broadcast and multicast are not currently supported). For more information about these node types, see RFC 2132.   Your VPC automatically starts out with a set of DHCP options that includes only a DNS server that we provide (AmazonProvidedDNS). If you create a set of options, and if your VPC has an internet gateway, make sure to set the domain-name-servers option either to AmazonProvidedDNS or to a domain name server of your choice. For more information, see DHCP Options Sets in the Amazon Virtual Private Cloud User Guide.
    */
  def createDhcpOptions(params: CreateDhcpOptionsRequest): Request[CreateDhcpOptionsResult, AWSError] = js.native
  def createDhcpOptions(
    params: CreateDhcpOptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDhcpOptionsResult, Unit]
  ): Request[CreateDhcpOptionsResult, AWSError] = js.native
  /**
    * [IPv6 only] Creates an egress-only internet gateway for your VPC. An egress-only internet gateway is used to enable outbound communication over IPv6 from instances in your VPC to the internet, and prevents hosts outside of your VPC from initiating an IPv6 connection with your instance.
    */
  def createEgressOnlyInternetGateway(): Request[CreateEgressOnlyInternetGatewayResult, AWSError] = js.native
  def createEgressOnlyInternetGateway(callback: js.Function2[/* err */ AWSError, /* data */ CreateEgressOnlyInternetGatewayResult, Unit]): Request[CreateEgressOnlyInternetGatewayResult, AWSError] = js.native
  /**
    * [IPv6 only] Creates an egress-only internet gateway for your VPC. An egress-only internet gateway is used to enable outbound communication over IPv6 from instances in your VPC to the internet, and prevents hosts outside of your VPC from initiating an IPv6 connection with your instance.
    */
  def createEgressOnlyInternetGateway(params: CreateEgressOnlyInternetGatewayRequest): Request[CreateEgressOnlyInternetGatewayResult, AWSError] = js.native
  def createEgressOnlyInternetGateway(
    params: CreateEgressOnlyInternetGatewayRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEgressOnlyInternetGatewayResult, Unit]
  ): Request[CreateEgressOnlyInternetGatewayResult, AWSError] = js.native
  /**
    * Launches an EC2 Fleet. You can create a single EC2 Fleet that includes multiple launch specifications that vary by instance type, AMI, Availability Zone, or subnet. For more information, see Launching an EC2 Fleet in the Amazon Elastic Compute Cloud User Guide.
    */
  def createFleet(): Request[CreateFleetResult, AWSError] = js.native
  def createFleet(callback: js.Function2[/* err */ AWSError, /* data */ CreateFleetResult, Unit]): Request[CreateFleetResult, AWSError] = js.native
  /**
    * Launches an EC2 Fleet. You can create a single EC2 Fleet that includes multiple launch specifications that vary by instance type, AMI, Availability Zone, or subnet. For more information, see Launching an EC2 Fleet in the Amazon Elastic Compute Cloud User Guide.
    */
  def createFleet(params: CreateFleetRequest): Request[CreateFleetResult, AWSError] = js.native
  def createFleet(
    params: CreateFleetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFleetResult, Unit]
  ): Request[CreateFleetResult, AWSError] = js.native
  /**
    * Creates one or more flow logs to capture information about IP traffic for a specific network interface, subnet, or VPC.  Flow log data for a monitored network interface is recorded as flow log records, which are log events consisting of fields that describe the traffic flow. For more information, see Flow Log Records in the Amazon Virtual Private Cloud User Guide. When publishing to CloudWatch Logs, flow log records are published to a log group, and each network interface has a unique log stream in the log group. When publishing to Amazon S3, flow log records for all of the monitored network interfaces are published to a single log file object that is stored in the specified bucket. For more information, see VPC Flow Logs in the Amazon Virtual Private Cloud User Guide.
    */
  def createFlowLogs(): Request[CreateFlowLogsResult, AWSError] = js.native
  def createFlowLogs(callback: js.Function2[/* err */ AWSError, /* data */ CreateFlowLogsResult, Unit]): Request[CreateFlowLogsResult, AWSError] = js.native
  /**
    * Creates one or more flow logs to capture information about IP traffic for a specific network interface, subnet, or VPC.  Flow log data for a monitored network interface is recorded as flow log records, which are log events consisting of fields that describe the traffic flow. For more information, see Flow Log Records in the Amazon Virtual Private Cloud User Guide. When publishing to CloudWatch Logs, flow log records are published to a log group, and each network interface has a unique log stream in the log group. When publishing to Amazon S3, flow log records for all of the monitored network interfaces are published to a single log file object that is stored in the specified bucket. For more information, see VPC Flow Logs in the Amazon Virtual Private Cloud User Guide.
    */
  def createFlowLogs(params: CreateFlowLogsRequest): Request[CreateFlowLogsResult, AWSError] = js.native
  def createFlowLogs(
    params: CreateFlowLogsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFlowLogsResult, Unit]
  ): Request[CreateFlowLogsResult, AWSError] = js.native
  /**
    * Creates an Amazon FPGA Image (AFI) from the specified design checkpoint (DCP). The create operation is asynchronous. To verify that the AFI is ready for use, check the output logs. An AFI contains the FPGA bitstream that is ready to download to an FPGA. You can securely deploy an AFI on multiple FPGA-accelerated instances. For more information, see the AWS FPGA Hardware Development Kit.
    */
  def createFpgaImage(): Request[CreateFpgaImageResult, AWSError] = js.native
  def createFpgaImage(callback: js.Function2[/* err */ AWSError, /* data */ CreateFpgaImageResult, Unit]): Request[CreateFpgaImageResult, AWSError] = js.native
  /**
    * Creates an Amazon FPGA Image (AFI) from the specified design checkpoint (DCP). The create operation is asynchronous. To verify that the AFI is ready for use, check the output logs. An AFI contains the FPGA bitstream that is ready to download to an FPGA. You can securely deploy an AFI on multiple FPGA-accelerated instances. For more information, see the AWS FPGA Hardware Development Kit.
    */
  def createFpgaImage(params: CreateFpgaImageRequest): Request[CreateFpgaImageResult, AWSError] = js.native
  def createFpgaImage(
    params: CreateFpgaImageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFpgaImageResult, Unit]
  ): Request[CreateFpgaImageResult, AWSError] = js.native
  /**
    * Creates an Amazon EBS-backed AMI from an Amazon EBS-backed instance that is either running or stopped. If you customized your instance with instance store volumes or EBS volumes in addition to the root device volume, the new AMI contains block device mapping information for those volumes. When you launch an instance from this new AMI, the instance automatically launches with those additional volumes. For more information, see Creating Amazon EBS-Backed Linux AMIs in the Amazon Elastic Compute Cloud User Guide.
    */
  def createImage(): Request[CreateImageResult, AWSError] = js.native
  def createImage(callback: js.Function2[/* err */ AWSError, /* data */ CreateImageResult, Unit]): Request[CreateImageResult, AWSError] = js.native
  /**
    * Creates an Amazon EBS-backed AMI from an Amazon EBS-backed instance that is either running or stopped. If you customized your instance with instance store volumes or EBS volumes in addition to the root device volume, the new AMI contains block device mapping information for those volumes. When you launch an instance from this new AMI, the instance automatically launches with those additional volumes. For more information, see Creating Amazon EBS-Backed Linux AMIs in the Amazon Elastic Compute Cloud User Guide.
    */
  def createImage(params: CreateImageRequest): Request[CreateImageResult, AWSError] = js.native
  def createImage(
    params: CreateImageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateImageResult, Unit]
  ): Request[CreateImageResult, AWSError] = js.native
  /**
    * Exports a running or stopped instance to an S3 bucket. For information about the supported operating systems, image formats, and known limitations for the types of instances you can export, see Exporting an Instance as a VM Using VM Import/Export in the VM Import/Export User Guide.
    */
  def createInstanceExportTask(): Request[CreateInstanceExportTaskResult, AWSError] = js.native
  def createInstanceExportTask(callback: js.Function2[/* err */ AWSError, /* data */ CreateInstanceExportTaskResult, Unit]): Request[CreateInstanceExportTaskResult, AWSError] = js.native
  /**
    * Exports a running or stopped instance to an S3 bucket. For information about the supported operating systems, image formats, and known limitations for the types of instances you can export, see Exporting an Instance as a VM Using VM Import/Export in the VM Import/Export User Guide.
    */
  def createInstanceExportTask(params: CreateInstanceExportTaskRequest): Request[CreateInstanceExportTaskResult, AWSError] = js.native
  def createInstanceExportTask(
    params: CreateInstanceExportTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateInstanceExportTaskResult, Unit]
  ): Request[CreateInstanceExportTaskResult, AWSError] = js.native
  /**
    * Creates an internet gateway for use with a VPC. After creating the internet gateway, you attach it to a VPC using AttachInternetGateway. For more information about your VPC and internet gateway, see the Amazon Virtual Private Cloud User Guide.
    */
  def createInternetGateway(): Request[CreateInternetGatewayResult, AWSError] = js.native
  def createInternetGateway(callback: js.Function2[/* err */ AWSError, /* data */ CreateInternetGatewayResult, Unit]): Request[CreateInternetGatewayResult, AWSError] = js.native
  /**
    * Creates an internet gateway for use with a VPC. After creating the internet gateway, you attach it to a VPC using AttachInternetGateway. For more information about your VPC and internet gateway, see the Amazon Virtual Private Cloud User Guide.
    */
  def createInternetGateway(params: CreateInternetGatewayRequest): Request[CreateInternetGatewayResult, AWSError] = js.native
  def createInternetGateway(
    params: CreateInternetGatewayRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateInternetGatewayResult, Unit]
  ): Request[CreateInternetGatewayResult, AWSError] = js.native
  /**
    * Creates a 2048-bit RSA key pair with the specified name. Amazon EC2 stores the public key and displays the private key for you to save to a file. The private key is returned as an unencrypted PEM encoded PKCS#1 private key. If a key with the specified name already exists, Amazon EC2 returns an error. You can have up to five thousand key pairs per Region. The key pair returned to you is available only in the Region in which you create it. If you prefer, you can create your own key pair using a third-party tool and upload it to any Region using ImportKeyPair. For more information, see Key Pairs in the Amazon Elastic Compute Cloud User Guide.
    */
  def createKeyPair(): Request[KeyPair, AWSError] = js.native
  def createKeyPair(callback: js.Function2[/* err */ AWSError, /* data */ KeyPair, Unit]): Request[KeyPair, AWSError] = js.native
  /**
    * Creates a 2048-bit RSA key pair with the specified name. Amazon EC2 stores the public key and displays the private key for you to save to a file. The private key is returned as an unencrypted PEM encoded PKCS#1 private key. If a key with the specified name already exists, Amazon EC2 returns an error. You can have up to five thousand key pairs per Region. The key pair returned to you is available only in the Region in which you create it. If you prefer, you can create your own key pair using a third-party tool and upload it to any Region using ImportKeyPair. For more information, see Key Pairs in the Amazon Elastic Compute Cloud User Guide.
    */
  def createKeyPair(params: CreateKeyPairRequest): Request[KeyPair, AWSError] = js.native
  def createKeyPair(params: CreateKeyPairRequest, callback: js.Function2[/* err */ AWSError, /* data */ KeyPair, Unit]): Request[KeyPair, AWSError] = js.native
  /**
    * Creates a launch template. A launch template contains the parameters to launch an instance. When you launch an instance using RunInstances, you can specify a launch template instead of providing the launch parameters in the request.
    */
  def createLaunchTemplate(): Request[CreateLaunchTemplateResult, AWSError] = js.native
  def createLaunchTemplate(callback: js.Function2[/* err */ AWSError, /* data */ CreateLaunchTemplateResult, Unit]): Request[CreateLaunchTemplateResult, AWSError] = js.native
  /**
    * Creates a launch template. A launch template contains the parameters to launch an instance. When you launch an instance using RunInstances, you can specify a launch template instead of providing the launch parameters in the request.
    */
  def createLaunchTemplate(params: CreateLaunchTemplateRequest): Request[CreateLaunchTemplateResult, AWSError] = js.native
  def createLaunchTemplate(
    params: CreateLaunchTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLaunchTemplateResult, Unit]
  ): Request[CreateLaunchTemplateResult, AWSError] = js.native
  /**
    * Creates a new version for a launch template. You can specify an existing version of launch template from which to base the new version. Launch template versions are numbered in the order in which they are created. You cannot specify, change, or replace the numbering of launch template versions.
    */
  def createLaunchTemplateVersion(): Request[CreateLaunchTemplateVersionResult, AWSError] = js.native
  def createLaunchTemplateVersion(callback: js.Function2[/* err */ AWSError, /* data */ CreateLaunchTemplateVersionResult, Unit]): Request[CreateLaunchTemplateVersionResult, AWSError] = js.native
  /**
    * Creates a new version for a launch template. You can specify an existing version of launch template from which to base the new version. Launch template versions are numbered in the order in which they are created. You cannot specify, change, or replace the numbering of launch template versions.
    */
  def createLaunchTemplateVersion(params: CreateLaunchTemplateVersionRequest): Request[CreateLaunchTemplateVersionResult, AWSError] = js.native
  def createLaunchTemplateVersion(
    params: CreateLaunchTemplateVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLaunchTemplateVersionResult, Unit]
  ): Request[CreateLaunchTemplateVersionResult, AWSError] = js.native
  /**
    * Creates a static route for the specified local gateway route table.
    */
  def createLocalGatewayRoute(): Request[CreateLocalGatewayRouteResult, AWSError] = js.native
  def createLocalGatewayRoute(callback: js.Function2[/* err */ AWSError, /* data */ CreateLocalGatewayRouteResult, Unit]): Request[CreateLocalGatewayRouteResult, AWSError] = js.native
  /**
    * Creates a static route for the specified local gateway route table.
    */
  def createLocalGatewayRoute(params: CreateLocalGatewayRouteRequest): Request[CreateLocalGatewayRouteResult, AWSError] = js.native
  def createLocalGatewayRoute(
    params: CreateLocalGatewayRouteRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLocalGatewayRouteResult, Unit]
  ): Request[CreateLocalGatewayRouteResult, AWSError] = js.native
  /**
    * Associates the specified VPC with the specified local gateway route table.
    */
  def createLocalGatewayRouteTableVpcAssociation(): Request[CreateLocalGatewayRouteTableVpcAssociationResult, AWSError] = js.native
  def createLocalGatewayRouteTableVpcAssociation(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ CreateLocalGatewayRouteTableVpcAssociationResult, 
      Unit
    ]
  ): Request[CreateLocalGatewayRouteTableVpcAssociationResult, AWSError] = js.native
  /**
    * Associates the specified VPC with the specified local gateway route table.
    */
  def createLocalGatewayRouteTableVpcAssociation(params: CreateLocalGatewayRouteTableVpcAssociationRequest): Request[CreateLocalGatewayRouteTableVpcAssociationResult, AWSError] = js.native
  def createLocalGatewayRouteTableVpcAssociation(
    params: CreateLocalGatewayRouteTableVpcAssociationRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ CreateLocalGatewayRouteTableVpcAssociationResult, 
      Unit
    ]
  ): Request[CreateLocalGatewayRouteTableVpcAssociationResult, AWSError] = js.native
  /**
    * Creates a NAT gateway in the specified public subnet. This action creates a network interface in the specified subnet with a private IP address from the IP address range of the subnet. Internet-bound traffic from a private subnet can be routed to the NAT gateway, therefore enabling instances in the private subnet to connect to the internet. For more information, see NAT Gateways in the Amazon Virtual Private Cloud User Guide.
    */
  def createNatGateway(): Request[CreateNatGatewayResult, AWSError] = js.native
  def createNatGateway(callback: js.Function2[/* err */ AWSError, /* data */ CreateNatGatewayResult, Unit]): Request[CreateNatGatewayResult, AWSError] = js.native
  /**
    * Creates a NAT gateway in the specified public subnet. This action creates a network interface in the specified subnet with a private IP address from the IP address range of the subnet. Internet-bound traffic from a private subnet can be routed to the NAT gateway, therefore enabling instances in the private subnet to connect to the internet. For more information, see NAT Gateways in the Amazon Virtual Private Cloud User Guide.
    */
  def createNatGateway(params: CreateNatGatewayRequest): Request[CreateNatGatewayResult, AWSError] = js.native
  def createNatGateway(
    params: CreateNatGatewayRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateNatGatewayResult, Unit]
  ): Request[CreateNatGatewayResult, AWSError] = js.native
  /**
    * Creates a network ACL in a VPC. Network ACLs provide an optional layer of security (in addition to security groups) for the instances in your VPC. For more information, see Network ACLs in the Amazon Virtual Private Cloud User Guide.
    */
  def createNetworkAcl(): Request[CreateNetworkAclResult, AWSError] = js.native
  def createNetworkAcl(callback: js.Function2[/* err */ AWSError, /* data */ CreateNetworkAclResult, Unit]): Request[CreateNetworkAclResult, AWSError] = js.native
  /**
    * Creates a network ACL in a VPC. Network ACLs provide an optional layer of security (in addition to security groups) for the instances in your VPC. For more information, see Network ACLs in the Amazon Virtual Private Cloud User Guide.
    */
  def createNetworkAcl(params: CreateNetworkAclRequest): Request[CreateNetworkAclResult, AWSError] = js.native
  def createNetworkAcl(
    params: CreateNetworkAclRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateNetworkAclResult, Unit]
  ): Request[CreateNetworkAclResult, AWSError] = js.native
  /**
    * Creates an entry (a rule) in a network ACL with the specified rule number. Each network ACL has a set of numbered ingress rules and a separate set of numbered egress rules. When determining whether a packet should be allowed in or out of a subnet associated with the ACL, we process the entries in the ACL according to the rule numbers, in ascending order. Each network ACL has a set of ingress rules and a separate set of egress rules. We recommend that you leave room between the rule numbers (for example, 100, 110, 120, ...), and not number them one right after the other (for example, 101, 102, 103, ...). This makes it easier to add a rule between existing ones without having to renumber the rules. After you add an entry, you can't modify it; you must either replace it, or create an entry and delete the old one. For more information about network ACLs, see Network ACLs in the Amazon Virtual Private Cloud User Guide.
    */
  def createNetworkAclEntry(): Request[js.Object, AWSError] = js.native
  def createNetworkAclEntry(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Creates an entry (a rule) in a network ACL with the specified rule number. Each network ACL has a set of numbered ingress rules and a separate set of numbered egress rules. When determining whether a packet should be allowed in or out of a subnet associated with the ACL, we process the entries in the ACL according to the rule numbers, in ascending order. Each network ACL has a set of ingress rules and a separate set of egress rules. We recommend that you leave room between the rule numbers (for example, 100, 110, 120, ...), and not number them one right after the other (for example, 101, 102, 103, ...). This makes it easier to add a rule between existing ones without having to renumber the rules. After you add an entry, you can't modify it; you must either replace it, or create an entry and delete the old one. For more information about network ACLs, see Network ACLs in the Amazon Virtual Private Cloud User Guide.
    */
  def createNetworkAclEntry(params: CreateNetworkAclEntryRequest): Request[js.Object, AWSError] = js.native
  def createNetworkAclEntry(
    params: CreateNetworkAclEntryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Creates a network interface in the specified subnet. For more information about network interfaces, see Elastic Network Interfaces in the Amazon Virtual Private Cloud User Guide.
    */
  def createNetworkInterface(): Request[CreateNetworkInterfaceResult, AWSError] = js.native
  def createNetworkInterface(callback: js.Function2[/* err */ AWSError, /* data */ CreateNetworkInterfaceResult, Unit]): Request[CreateNetworkInterfaceResult, AWSError] = js.native
  /**
    * Creates a network interface in the specified subnet. For more information about network interfaces, see Elastic Network Interfaces in the Amazon Virtual Private Cloud User Guide.
    */
  def createNetworkInterface(params: CreateNetworkInterfaceRequest): Request[CreateNetworkInterfaceResult, AWSError] = js.native
  def createNetworkInterface(
    params: CreateNetworkInterfaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateNetworkInterfaceResult, Unit]
  ): Request[CreateNetworkInterfaceResult, AWSError] = js.native
  /**
    * Grants an AWS-authorized account permission to attach the specified network interface to an instance in their account. You can grant permission to a single AWS account only, and only one account at a time.
    */
  def createNetworkInterfacePermission(): Request[CreateNetworkInterfacePermissionResult, AWSError] = js.native
  def createNetworkInterfacePermission(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateNetworkInterfacePermissionResult, Unit]
  ): Request[CreateNetworkInterfacePermissionResult, AWSError] = js.native
  /**
    * Grants an AWS-authorized account permission to attach the specified network interface to an instance in their account. You can grant permission to a single AWS account only, and only one account at a time.
    */
  def createNetworkInterfacePermission(params: CreateNetworkInterfacePermissionRequest): Request[CreateNetworkInterfacePermissionResult, AWSError] = js.native
  def createNetworkInterfacePermission(
    params: CreateNetworkInterfacePermissionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateNetworkInterfacePermissionResult, Unit]
  ): Request[CreateNetworkInterfacePermissionResult, AWSError] = js.native
  /**
    * Creates a placement group in which to launch instances. The strategy of the placement group determines how the instances are organized within the group.  A cluster placement group is a logical grouping of instances within a single Availability Zone that benefit from low network latency, high network throughput. A spread placement group places instances on distinct hardware. A partition placement group places groups of instances in different partitions, where instances in one partition do not share the same hardware with instances in another partition. For more information, see Placement Groups in the Amazon Elastic Compute Cloud User Guide.
    */
  def createPlacementGroup(): Request[js.Object, AWSError] = js.native
  def createPlacementGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Creates a placement group in which to launch instances. The strategy of the placement group determines how the instances are organized within the group.  A cluster placement group is a logical grouping of instances within a single Availability Zone that benefit from low network latency, high network throughput. A spread placement group places instances on distinct hardware. A partition placement group places groups of instances in different partitions, where instances in one partition do not share the same hardware with instances in another partition. For more information, see Placement Groups in the Amazon Elastic Compute Cloud User Guide.
    */
  def createPlacementGroup(params: CreatePlacementGroupRequest): Request[js.Object, AWSError] = js.native
  def createPlacementGroup(
    params: CreatePlacementGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Creates a listing for Amazon EC2 Standard Reserved Instances to be sold in the Reserved Instance Marketplace. You can submit one Standard Reserved Instance listing at a time. To get a list of your Standard Reserved Instances, you can use the DescribeReservedInstances operation.  Only Standard Reserved Instances can be sold in the Reserved Instance Marketplace. Convertible Reserved Instances cannot be sold.  The Reserved Instance Marketplace matches sellers who want to resell Standard Reserved Instance capacity that they no longer need with buyers who want to purchase additional capacity. Reserved Instances bought and sold through the Reserved Instance Marketplace work like any other Reserved Instances. To sell your Standard Reserved Instances, you must first register as a seller in the Reserved Instance Marketplace. After completing the registration process, you can create a Reserved Instance Marketplace listing of some or all of your Standard Reserved Instances, and specify the upfront price to receive for them. Your Standard Reserved Instance listings then become available for purchase. To view the details of your Standard Reserved Instance listing, you can use the DescribeReservedInstancesListings operation. For more information, see Reserved Instance Marketplace in the Amazon Elastic Compute Cloud User Guide.
    */
  def createReservedInstancesListing(): Request[CreateReservedInstancesListingResult, AWSError] = js.native
  def createReservedInstancesListing(callback: js.Function2[/* err */ AWSError, /* data */ CreateReservedInstancesListingResult, Unit]): Request[CreateReservedInstancesListingResult, AWSError] = js.native
  /**
    * Creates a listing for Amazon EC2 Standard Reserved Instances to be sold in the Reserved Instance Marketplace. You can submit one Standard Reserved Instance listing at a time. To get a list of your Standard Reserved Instances, you can use the DescribeReservedInstances operation.  Only Standard Reserved Instances can be sold in the Reserved Instance Marketplace. Convertible Reserved Instances cannot be sold.  The Reserved Instance Marketplace matches sellers who want to resell Standard Reserved Instance capacity that they no longer need with buyers who want to purchase additional capacity. Reserved Instances bought and sold through the Reserved Instance Marketplace work like any other Reserved Instances. To sell your Standard Reserved Instances, you must first register as a seller in the Reserved Instance Marketplace. After completing the registration process, you can create a Reserved Instance Marketplace listing of some or all of your Standard Reserved Instances, and specify the upfront price to receive for them. Your Standard Reserved Instance listings then become available for purchase. To view the details of your Standard Reserved Instance listing, you can use the DescribeReservedInstancesListings operation. For more information, see Reserved Instance Marketplace in the Amazon Elastic Compute Cloud User Guide.
    */
  def createReservedInstancesListing(params: CreateReservedInstancesListingRequest): Request[CreateReservedInstancesListingResult, AWSError] = js.native
  def createReservedInstancesListing(
    params: CreateReservedInstancesListingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateReservedInstancesListingResult, Unit]
  ): Request[CreateReservedInstancesListingResult, AWSError] = js.native
  /**
    * Creates a route in a route table within a VPC. You must specify one of the following targets: internet gateway or virtual private gateway, NAT instance, NAT gateway, VPC peering connection, network interface, egress-only internet gateway, or transit gateway. When determining how to route traffic, we use the route with the most specific match. For example, traffic is destined for the IPv4 address 192.0.2.3, and the route table includes the following two IPv4 routes:    192.0.2.0/24 (goes to some target A)    192.0.2.0/28 (goes to some target B)   Both routes apply to the traffic destined for 192.0.2.3. However, the second route in the list covers a smaller number of IP addresses and is therefore more specific, so we use that route to determine where to target the traffic. For more information about route tables, see Route Tables in the Amazon Virtual Private Cloud User Guide.
    */
  def createRoute(): Request[CreateRouteResult, AWSError] = js.native
  def createRoute(callback: js.Function2[/* err */ AWSError, /* data */ CreateRouteResult, Unit]): Request[CreateRouteResult, AWSError] = js.native
  /**
    * Creates a route in a route table within a VPC. You must specify one of the following targets: internet gateway or virtual private gateway, NAT instance, NAT gateway, VPC peering connection, network interface, egress-only internet gateway, or transit gateway. When determining how to route traffic, we use the route with the most specific match. For example, traffic is destined for the IPv4 address 192.0.2.3, and the route table includes the following two IPv4 routes:    192.0.2.0/24 (goes to some target A)    192.0.2.0/28 (goes to some target B)   Both routes apply to the traffic destined for 192.0.2.3. However, the second route in the list covers a smaller number of IP addresses and is therefore more specific, so we use that route to determine where to target the traffic. For more information about route tables, see Route Tables in the Amazon Virtual Private Cloud User Guide.
    */
  def createRoute(params: CreateRouteRequest): Request[CreateRouteResult, AWSError] = js.native
  def createRoute(
    params: CreateRouteRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRouteResult, Unit]
  ): Request[CreateRouteResult, AWSError] = js.native
  /**
    * Creates a route table for the specified VPC. After you create a route table, you can add routes and associate the table with a subnet. For more information, see Route Tables in the Amazon Virtual Private Cloud User Guide.
    */
  def createRouteTable(): Request[CreateRouteTableResult, AWSError] = js.native
  def createRouteTable(callback: js.Function2[/* err */ AWSError, /* data */ CreateRouteTableResult, Unit]): Request[CreateRouteTableResult, AWSError] = js.native
  /**
    * Creates a route table for the specified VPC. After you create a route table, you can add routes and associate the table with a subnet. For more information, see Route Tables in the Amazon Virtual Private Cloud User Guide.
    */
  def createRouteTable(params: CreateRouteTableRequest): Request[CreateRouteTableResult, AWSError] = js.native
  def createRouteTable(
    params: CreateRouteTableRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRouteTableResult, Unit]
  ): Request[CreateRouteTableResult, AWSError] = js.native
  /**
    * Creates a security group. A security group acts as a virtual firewall for your instance to control inbound and outbound traffic. For more information, see Amazon EC2 Security Groups in the Amazon Elastic Compute Cloud User Guide and Security Groups for Your VPC in the Amazon Virtual Private Cloud User Guide. When you create a security group, you specify a friendly name of your choice. You can have a security group for use in EC2-Classic with the same name as a security group for use in a VPC. However, you can't have two security groups for use in EC2-Classic with the same name or two security groups for use in a VPC with the same name. You have a default security group for use in EC2-Classic and a default security group for use in your VPC. If you don't specify a security group when you launch an instance, the instance is launched into the appropriate default security group. A default security group includes a default rule that grants instances unrestricted network access to each other. You can add or remove rules from your security groups using AuthorizeSecurityGroupIngress, AuthorizeSecurityGroupEgress, RevokeSecurityGroupIngress, and RevokeSecurityGroupEgress. For more information about VPC security group limits, see Amazon VPC Limits.
    */
  def createSecurityGroup(): Request[CreateSecurityGroupResult, AWSError] = js.native
  def createSecurityGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateSecurityGroupResult, Unit]): Request[CreateSecurityGroupResult, AWSError] = js.native
  /**
    * Creates a security group. A security group acts as a virtual firewall for your instance to control inbound and outbound traffic. For more information, see Amazon EC2 Security Groups in the Amazon Elastic Compute Cloud User Guide and Security Groups for Your VPC in the Amazon Virtual Private Cloud User Guide. When you create a security group, you specify a friendly name of your choice. You can have a security group for use in EC2-Classic with the same name as a security group for use in a VPC. However, you can't have two security groups for use in EC2-Classic with the same name or two security groups for use in a VPC with the same name. You have a default security group for use in EC2-Classic and a default security group for use in your VPC. If you don't specify a security group when you launch an instance, the instance is launched into the appropriate default security group. A default security group includes a default rule that grants instances unrestricted network access to each other. You can add or remove rules from your security groups using AuthorizeSecurityGroupIngress, AuthorizeSecurityGroupEgress, RevokeSecurityGroupIngress, and RevokeSecurityGroupEgress. For more information about VPC security group limits, see Amazon VPC Limits.
    */
  def createSecurityGroup(params: CreateSecurityGroupRequest): Request[CreateSecurityGroupResult, AWSError] = js.native
  def createSecurityGroup(
    params: CreateSecurityGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSecurityGroupResult, Unit]
  ): Request[CreateSecurityGroupResult, AWSError] = js.native
  /**
    * Creates a snapshot of an EBS volume and stores it in Amazon S3. You can use snapshots for backups, to make copies of EBS volumes, and to save data before shutting down an instance. When a snapshot is created, any AWS Marketplace product codes that are associated with the source volume are propagated to the snapshot. You can take a snapshot of an attached volume that is in use. However, snapshots only capture data that has been written to your EBS volume at the time the snapshot command is issued; this may exclude any data that has been cached by any applications or the operating system. If you can pause any file systems on the volume long enough to take a snapshot, your snapshot should be complete. However, if you cannot pause all file writes to the volume, you should unmount the volume from within the instance, issue the snapshot command, and then remount the volume to ensure a consistent and complete snapshot. You may remount and use your volume while the snapshot status is pending. To create a snapshot for EBS volumes that serve as root devices, you should stop the instance before taking the snapshot. Snapshots that are taken from encrypted volumes are automatically encrypted. Volumes that are created from encrypted snapshots are also automatically encrypted. Your encrypted volumes and any associated snapshots always remain protected. You can tag your snapshots during creation. For more information, see Tagging Your Amazon EC2 Resources in the Amazon Elastic Compute Cloud User Guide. For more information, see Amazon Elastic Block Store and Amazon EBS Encryption in the Amazon Elastic Compute Cloud User Guide.
    */
  def createSnapshot(): Request[Snapshot, AWSError] = js.native
  def createSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ Snapshot, Unit]): Request[Snapshot, AWSError] = js.native
  /**
    * Creates a snapshot of an EBS volume and stores it in Amazon S3. You can use snapshots for backups, to make copies of EBS volumes, and to save data before shutting down an instance. When a snapshot is created, any AWS Marketplace product codes that are associated with the source volume are propagated to the snapshot. You can take a snapshot of an attached volume that is in use. However, snapshots only capture data that has been written to your EBS volume at the time the snapshot command is issued; this may exclude any data that has been cached by any applications or the operating system. If you can pause any file systems on the volume long enough to take a snapshot, your snapshot should be complete. However, if you cannot pause all file writes to the volume, you should unmount the volume from within the instance, issue the snapshot command, and then remount the volume to ensure a consistent and complete snapshot. You may remount and use your volume while the snapshot status is pending. To create a snapshot for EBS volumes that serve as root devices, you should stop the instance before taking the snapshot. Snapshots that are taken from encrypted volumes are automatically encrypted. Volumes that are created from encrypted snapshots are also automatically encrypted. Your encrypted volumes and any associated snapshots always remain protected. You can tag your snapshots during creation. For more information, see Tagging Your Amazon EC2 Resources in the Amazon Elastic Compute Cloud User Guide. For more information, see Amazon Elastic Block Store and Amazon EBS Encryption in the Amazon Elastic Compute Cloud User Guide.
    */
  def createSnapshot(params: CreateSnapshotRequest): Request[Snapshot, AWSError] = js.native
  def createSnapshot(
    params: CreateSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Snapshot, Unit]
  ): Request[Snapshot, AWSError] = js.native
  /**
    * Creates crash-consistent snapshots of multiple EBS volumes and stores the data in S3. Volumes are chosen by specifying an instance. Any attached volumes will produce one snapshot each that is crash-consistent across the instance. Boot volumes can be excluded by changing the parameters. 
    */
  def createSnapshots(): Request[CreateSnapshotsResult, AWSError] = js.native
  def createSnapshots(callback: js.Function2[/* err */ AWSError, /* data */ CreateSnapshotsResult, Unit]): Request[CreateSnapshotsResult, AWSError] = js.native
  /**
    * Creates crash-consistent snapshots of multiple EBS volumes and stores the data in S3. Volumes are chosen by specifying an instance. Any attached volumes will produce one snapshot each that is crash-consistent across the instance. Boot volumes can be excluded by changing the parameters. 
    */
  def createSnapshots(params: CreateSnapshotsRequest): Request[CreateSnapshotsResult, AWSError] = js.native
  def createSnapshots(
    params: CreateSnapshotsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSnapshotsResult, Unit]
  ): Request[CreateSnapshotsResult, AWSError] = js.native
  /**
    * Creates a data feed for Spot Instances, enabling you to view Spot Instance usage logs. You can create one data feed per AWS account. For more information, see Spot Instance Data Feed in the Amazon EC2 User Guide for Linux Instances.
    */
  def createSpotDatafeedSubscription(): Request[CreateSpotDatafeedSubscriptionResult, AWSError] = js.native
  def createSpotDatafeedSubscription(callback: js.Function2[/* err */ AWSError, /* data */ CreateSpotDatafeedSubscriptionResult, Unit]): Request[CreateSpotDatafeedSubscriptionResult, AWSError] = js.native
  /**
    * Creates a data feed for Spot Instances, enabling you to view Spot Instance usage logs. You can create one data feed per AWS account. For more information, see Spot Instance Data Feed in the Amazon EC2 User Guide for Linux Instances.
    */
  def createSpotDatafeedSubscription(params: CreateSpotDatafeedSubscriptionRequest): Request[CreateSpotDatafeedSubscriptionResult, AWSError] = js.native
  def createSpotDatafeedSubscription(
    params: CreateSpotDatafeedSubscriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSpotDatafeedSubscriptionResult, Unit]
  ): Request[CreateSpotDatafeedSubscriptionResult, AWSError] = js.native
  /**
    * Creates a subnet in an existing VPC. When you create each subnet, you provide the VPC ID and IPv4 CIDR block for the subnet. After you create a subnet, you can't change its CIDR block. The size of the subnet's IPv4 CIDR block can be the same as a VPC's IPv4 CIDR block, or a subset of a VPC's IPv4 CIDR block. If you create more than one subnet in a VPC, the subnets' CIDR blocks must not overlap. The smallest IPv4 subnet (and VPC) you can create uses a /28 netmask (16 IPv4 addresses), and the largest uses a /16 netmask (65,536 IPv4 addresses). If you've associated an IPv6 CIDR block with your VPC, you can create a subnet with an IPv6 CIDR block that uses a /64 prefix length.   AWS reserves both the first four and the last IPv4 address in each subnet's CIDR block. They're not available for use.  If you add more than one subnet to a VPC, they're set up in a star topology with a logical router in the middle. If you launch an instance in a VPC using an Amazon EBS-backed AMI, the IP address doesn't change if you stop and restart the instance (unlike a similar instance launched outside a VPC, which gets a new IP address when restarted). It's therefore possible to have a subnet with no running instances (they're all stopped), but no remaining IP addresses available. For more information about subnets, see Your VPC and Subnets in the Amazon Virtual Private Cloud User Guide.
    */
  def createSubnet(): Request[CreateSubnetResult, AWSError] = js.native
  def createSubnet(callback: js.Function2[/* err */ AWSError, /* data */ CreateSubnetResult, Unit]): Request[CreateSubnetResult, AWSError] = js.native
  /**
    * Creates a subnet in an existing VPC. When you create each subnet, you provide the VPC ID and IPv4 CIDR block for the subnet. After you create a subnet, you can't change its CIDR block. The size of the subnet's IPv4 CIDR block can be the same as a VPC's IPv4 CIDR block, or a subset of a VPC's IPv4 CIDR block. If you create more than one subnet in a VPC, the subnets' CIDR blocks must not overlap. The smallest IPv4 subnet (and VPC) you can create uses a /28 netmask (16 IPv4 addresses), and the largest uses a /16 netmask (65,536 IPv4 addresses). If you've associated an IPv6 CIDR block with your VPC, you can create a subnet with an IPv6 CIDR block that uses a /64 prefix length.   AWS reserves both the first four and the last IPv4 address in each subnet's CIDR block. They're not available for use.  If you add more than one subnet to a VPC, they're set up in a star topology with a logical router in the middle. If you launch an instance in a VPC using an Amazon EBS-backed AMI, the IP address doesn't change if you stop and restart the instance (unlike a similar instance launched outside a VPC, which gets a new IP address when restarted). It's therefore possible to have a subnet with no running instances (they're all stopped), but no remaining IP addresses available. For more information about subnets, see Your VPC and Subnets in the Amazon Virtual Private Cloud User Guide.
    */
  def createSubnet(params: CreateSubnetRequest): Request[CreateSubnetResult, AWSError] = js.native
  def createSubnet(
    params: CreateSubnetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSubnetResult, Unit]
  ): Request[CreateSubnetResult, AWSError] = js.native
  /**
    * Adds or overwrites the specified tags for the specified Amazon EC2 resource or resources. Each resource can have a maximum of 50 tags. Each tag consists of a key and optional value. Tag keys must be unique per resource. For more information about tags, see Tagging Your Resources in the Amazon Elastic Compute Cloud User Guide. For more information about creating IAM policies that control users' access to resources based on tags, see Supported Resource-Level Permissions for Amazon EC2 API Actions in the Amazon Elastic Compute Cloud User Guide.
    */
  def createTags(): Request[js.Object, AWSError] = js.native
  def createTags(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds or overwrites the specified tags for the specified Amazon EC2 resource or resources. Each resource can have a maximum of 50 tags. Each tag consists of a key and optional value. Tag keys must be unique per resource. For more information about tags, see Tagging Your Resources in the Amazon Elastic Compute Cloud User Guide. For more information about creating IAM policies that control users' access to resources based on tags, see Supported Resource-Level Permissions for Amazon EC2 API Actions in the Amazon Elastic Compute Cloud User Guide.
    */
  def createTags(params: CreateTagsRequest): Request[js.Object, AWSError] = js.native
  def createTags(params: CreateTagsRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Creates a Traffic Mirror filter. A Traffic Mirror filter is a set of rules that defines the traffic to mirror. By default, no traffic is mirrored. To mirror traffic, use CreateTrafficMirrorFilterRule to add Traffic Mirror rules to the filter. The rules you add define what traffic gets mirrored. You can also use ModifyTrafficMirrorFilterNetworkServices to mirror supported network services.
    */
  def createTrafficMirrorFilter(): Request[CreateTrafficMirrorFilterResult, AWSError] = js.native
  def createTrafficMirrorFilter(callback: js.Function2[/* err */ AWSError, /* data */ CreateTrafficMirrorFilterResult, Unit]): Request[CreateTrafficMirrorFilterResult, AWSError] = js.native
  /**
    * Creates a Traffic Mirror filter. A Traffic Mirror filter is a set of rules that defines the traffic to mirror. By default, no traffic is mirrored. To mirror traffic, use CreateTrafficMirrorFilterRule to add Traffic Mirror rules to the filter. The rules you add define what traffic gets mirrored. You can also use ModifyTrafficMirrorFilterNetworkServices to mirror supported network services.
    */
  def createTrafficMirrorFilter(params: CreateTrafficMirrorFilterRequest): Request[CreateTrafficMirrorFilterResult, AWSError] = js.native
  def createTrafficMirrorFilter(
    params: CreateTrafficMirrorFilterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTrafficMirrorFilterResult, Unit]
  ): Request[CreateTrafficMirrorFilterResult, AWSError] = js.native
  /**
    * Creates a Traffic Mirror filter rule.  A Traffic Mirror rule defines the Traffic Mirror source traffic to mirror. You need the Traffic Mirror filter ID when you create the rule.
    */
  def createTrafficMirrorFilterRule(): Request[CreateTrafficMirrorFilterRuleResult, AWSError] = js.native
  def createTrafficMirrorFilterRule(callback: js.Function2[/* err */ AWSError, /* data */ CreateTrafficMirrorFilterRuleResult, Unit]): Request[CreateTrafficMirrorFilterRuleResult, AWSError] = js.native
  /**
    * Creates a Traffic Mirror filter rule.  A Traffic Mirror rule defines the Traffic Mirror source traffic to mirror. You need the Traffic Mirror filter ID when you create the rule.
    */
  def createTrafficMirrorFilterRule(params: CreateTrafficMirrorFilterRuleRequest): Request[CreateTrafficMirrorFilterRuleResult, AWSError] = js.native
  def createTrafficMirrorFilterRule(
    params: CreateTrafficMirrorFilterRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTrafficMirrorFilterRuleResult, Unit]
  ): Request[CreateTrafficMirrorFilterRuleResult, AWSError] = js.native
  /**
    * Creates a Traffic Mirror session. A Traffic Mirror session actively copies packets from a Traffic Mirror source to a Traffic Mirror target. Create a filter, and then assign it to the session to define a subset of the traffic to mirror, for example all TCP traffic. The Traffic Mirror source and the Traffic Mirror target (monitoring appliances) can be in the same VPC, or in a different VPC connected via VPC peering or a transit gateway.  By default, no traffic is mirrored. Use CreateTrafficMirrorFilter to create filter rules that specify the traffic to mirror.
    */
  def createTrafficMirrorSession(): Request[CreateTrafficMirrorSessionResult, AWSError] = js.native
  def createTrafficMirrorSession(callback: js.Function2[/* err */ AWSError, /* data */ CreateTrafficMirrorSessionResult, Unit]): Request[CreateTrafficMirrorSessionResult, AWSError] = js.native
  /**
    * Creates a Traffic Mirror session. A Traffic Mirror session actively copies packets from a Traffic Mirror source to a Traffic Mirror target. Create a filter, and then assign it to the session to define a subset of the traffic to mirror, for example all TCP traffic. The Traffic Mirror source and the Traffic Mirror target (monitoring appliances) can be in the same VPC, or in a different VPC connected via VPC peering or a transit gateway.  By default, no traffic is mirrored. Use CreateTrafficMirrorFilter to create filter rules that specify the traffic to mirror.
    */
  def createTrafficMirrorSession(params: CreateTrafficMirrorSessionRequest): Request[CreateTrafficMirrorSessionResult, AWSError] = js.native
  def createTrafficMirrorSession(
    params: CreateTrafficMirrorSessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTrafficMirrorSessionResult, Unit]
  ): Request[CreateTrafficMirrorSessionResult, AWSError] = js.native
  /**
    * Creates a target for your Traffic Mirror session. A Traffic Mirror target is the destination for mirrored traffic. The Traffic Mirror source and the Traffic Mirror target (monitoring appliances) can be in the same VPC, or in different VPCs connected via VPC peering or a transit gateway. A Traffic Mirror target can be a network interface, or a Network Load Balancer. To use the target in a Traffic Mirror session, use CreateTrafficMirrorSession.
    */
  def createTrafficMirrorTarget(): Request[CreateTrafficMirrorTargetResult, AWSError] = js.native
  def createTrafficMirrorTarget(callback: js.Function2[/* err */ AWSError, /* data */ CreateTrafficMirrorTargetResult, Unit]): Request[CreateTrafficMirrorTargetResult, AWSError] = js.native
  /**
    * Creates a target for your Traffic Mirror session. A Traffic Mirror target is the destination for mirrored traffic. The Traffic Mirror source and the Traffic Mirror target (monitoring appliances) can be in the same VPC, or in different VPCs connected via VPC peering or a transit gateway. A Traffic Mirror target can be a network interface, or a Network Load Balancer. To use the target in a Traffic Mirror session, use CreateTrafficMirrorSession.
    */
  def createTrafficMirrorTarget(params: CreateTrafficMirrorTargetRequest): Request[CreateTrafficMirrorTargetResult, AWSError] = js.native
  def createTrafficMirrorTarget(
    params: CreateTrafficMirrorTargetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTrafficMirrorTargetResult, Unit]
  ): Request[CreateTrafficMirrorTargetResult, AWSError] = js.native
  /**
    * Creates a transit gateway. You can use a transit gateway to interconnect your virtual private clouds (VPC) and on-premises networks. After the transit gateway enters the available state, you can attach your VPCs and VPN connections to the transit gateway. To attach your VPCs, use CreateTransitGatewayVpcAttachment. To attach a VPN connection, use CreateCustomerGateway to create a customer gateway and specify the ID of the customer gateway and the ID of the transit gateway in a call to CreateVpnConnection. When you create a transit gateway, we create a default transit gateway route table and use it as the default association route table and the default propagation route table. You can use CreateTransitGatewayRouteTable to create additional transit gateway route tables. If you disable automatic route propagation, we do not create a default transit gateway route table. You can use EnableTransitGatewayRouteTablePropagation to propagate routes from a resource attachment to a transit gateway route table. If you disable automatic associations, you can use AssociateTransitGatewayRouteTable to associate a resource attachment with a transit gateway route table.
    */
  def createTransitGateway(): Request[CreateTransitGatewayResult, AWSError] = js.native
  def createTransitGateway(callback: js.Function2[/* err */ AWSError, /* data */ CreateTransitGatewayResult, Unit]): Request[CreateTransitGatewayResult, AWSError] = js.native
  /**
    * Creates a transit gateway. You can use a transit gateway to interconnect your virtual private clouds (VPC) and on-premises networks. After the transit gateway enters the available state, you can attach your VPCs and VPN connections to the transit gateway. To attach your VPCs, use CreateTransitGatewayVpcAttachment. To attach a VPN connection, use CreateCustomerGateway to create a customer gateway and specify the ID of the customer gateway and the ID of the transit gateway in a call to CreateVpnConnection. When you create a transit gateway, we create a default transit gateway route table and use it as the default association route table and the default propagation route table. You can use CreateTransitGatewayRouteTable to create additional transit gateway route tables. If you disable automatic route propagation, we do not create a default transit gateway route table. You can use EnableTransitGatewayRouteTablePropagation to propagate routes from a resource attachment to a transit gateway route table. If you disable automatic associations, you can use AssociateTransitGatewayRouteTable to associate a resource attachment with a transit gateway route table.
    */
  def createTransitGateway(params: CreateTransitGatewayRequest): Request[CreateTransitGatewayResult, AWSError] = js.native
  def createTransitGateway(
    params: CreateTransitGatewayRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTransitGatewayResult, Unit]
  ): Request[CreateTransitGatewayResult, AWSError] = js.native
  /**
    * Creates a multicast domain using the specified transit gateway. The transit gateway must be in the available state before you create a domain. Use DescribeTransitGateways to see the state of transit gateway.
    */
  def createTransitGatewayMulticastDomain(): Request[CreateTransitGatewayMulticastDomainResult, AWSError] = js.native
  def createTransitGatewayMulticastDomain(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTransitGatewayMulticastDomainResult, Unit]
  ): Request[CreateTransitGatewayMulticastDomainResult, AWSError] = js.native
  /**
    * Creates a multicast domain using the specified transit gateway. The transit gateway must be in the available state before you create a domain. Use DescribeTransitGateways to see the state of transit gateway.
    */
  def createTransitGatewayMulticastDomain(params: CreateTransitGatewayMulticastDomainRequest): Request[CreateTransitGatewayMulticastDomainResult, AWSError] = js.native
  def createTransitGatewayMulticastDomain(
    params: CreateTransitGatewayMulticastDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTransitGatewayMulticastDomainResult, Unit]
  ): Request[CreateTransitGatewayMulticastDomainResult, AWSError] = js.native
  /**
    * Requests a transit gateway peering attachment between the specified transit gateway (requester) and a peer transit gateway (accepter). The transit gateways must be in different Regions. The peer transit gateway can be in your account or a different AWS account.  After you create the peering attachment, the owner of the accepter transit gateway must accept the attachment request.
    */
  def createTransitGatewayPeeringAttachment(): Request[CreateTransitGatewayPeeringAttachmentResult, AWSError] = js.native
  def createTransitGatewayPeeringAttachment(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTransitGatewayPeeringAttachmentResult, Unit]
  ): Request[CreateTransitGatewayPeeringAttachmentResult, AWSError] = js.native
  /**
    * Requests a transit gateway peering attachment between the specified transit gateway (requester) and a peer transit gateway (accepter). The transit gateways must be in different Regions. The peer transit gateway can be in your account or a different AWS account.  After you create the peering attachment, the owner of the accepter transit gateway must accept the attachment request.
    */
  def createTransitGatewayPeeringAttachment(params: CreateTransitGatewayPeeringAttachmentRequest): Request[CreateTransitGatewayPeeringAttachmentResult, AWSError] = js.native
  def createTransitGatewayPeeringAttachment(
    params: CreateTransitGatewayPeeringAttachmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTransitGatewayPeeringAttachmentResult, Unit]
  ): Request[CreateTransitGatewayPeeringAttachmentResult, AWSError] = js.native
  /**
    * Creates a static route for the specified transit gateway route table.
    */
  def createTransitGatewayRoute(): Request[CreateTransitGatewayRouteResult, AWSError] = js.native
  def createTransitGatewayRoute(callback: js.Function2[/* err */ AWSError, /* data */ CreateTransitGatewayRouteResult, Unit]): Request[CreateTransitGatewayRouteResult, AWSError] = js.native
  /**
    * Creates a static route for the specified transit gateway route table.
    */
  def createTransitGatewayRoute(params: CreateTransitGatewayRouteRequest): Request[CreateTransitGatewayRouteResult, AWSError] = js.native
  def createTransitGatewayRoute(
    params: CreateTransitGatewayRouteRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTransitGatewayRouteResult, Unit]
  ): Request[CreateTransitGatewayRouteResult, AWSError] = js.native
  /**
    * Creates a route table for the specified transit gateway.
    */
  def createTransitGatewayRouteTable(): Request[CreateTransitGatewayRouteTableResult, AWSError] = js.native
  def createTransitGatewayRouteTable(callback: js.Function2[/* err */ AWSError, /* data */ CreateTransitGatewayRouteTableResult, Unit]): Request[CreateTransitGatewayRouteTableResult, AWSError] = js.native
  /**
    * Creates a route table for the specified transit gateway.
    */
  def createTransitGatewayRouteTable(params: CreateTransitGatewayRouteTableRequest): Request[CreateTransitGatewayRouteTableResult, AWSError] = js.native
  def createTransitGatewayRouteTable(
    params: CreateTransitGatewayRouteTableRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTransitGatewayRouteTableResult, Unit]
  ): Request[CreateTransitGatewayRouteTableResult, AWSError] = js.native
  /**
    * Attaches the specified VPC to the specified transit gateway. If you attach a VPC with a CIDR range that overlaps the CIDR range of a VPC that is already attached, the new VPC CIDR range is not propagated to the default propagation route table. To send VPC traffic to an attached transit gateway, add a route to the VPC route table using CreateRoute.
    */
  def createTransitGatewayVpcAttachment(): Request[CreateTransitGatewayVpcAttachmentResult, AWSError] = js.native
  def createTransitGatewayVpcAttachment(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTransitGatewayVpcAttachmentResult, Unit]
  ): Request[CreateTransitGatewayVpcAttachmentResult, AWSError] = js.native
  /**
    * Attaches the specified VPC to the specified transit gateway. If you attach a VPC with a CIDR range that overlaps the CIDR range of a VPC that is already attached, the new VPC CIDR range is not propagated to the default propagation route table. To send VPC traffic to an attached transit gateway, add a route to the VPC route table using CreateRoute.
    */
  def createTransitGatewayVpcAttachment(params: CreateTransitGatewayVpcAttachmentRequest): Request[CreateTransitGatewayVpcAttachmentResult, AWSError] = js.native
  def createTransitGatewayVpcAttachment(
    params: CreateTransitGatewayVpcAttachmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTransitGatewayVpcAttachmentResult, Unit]
  ): Request[CreateTransitGatewayVpcAttachmentResult, AWSError] = js.native
  /**
    * Creates an EBS volume that can be attached to an instance in the same Availability Zone. The volume is created in the regional endpoint that you send the HTTP request to. For more information see Regions and Endpoints. You can create a new empty volume or restore a volume from an EBS snapshot. Any AWS Marketplace product codes from the snapshot are propagated to the volume. You can create encrypted volumes. Encrypted volumes must be attached to instances that support Amazon EBS encryption. Volumes that are created from encrypted snapshots are also automatically encrypted. For more information, see Amazon EBS Encryption in the Amazon Elastic Compute Cloud User Guide. You can tag your volumes during creation. For more information, see Tagging Your Amazon EC2 Resources in the Amazon Elastic Compute Cloud User Guide. For more information, see Creating an Amazon EBS Volume in the Amazon Elastic Compute Cloud User Guide.
    */
  def createVolume(): Request[Volume, AWSError] = js.native
  def createVolume(callback: js.Function2[/* err */ AWSError, /* data */ Volume, Unit]): Request[Volume, AWSError] = js.native
  /**
    * Creates an EBS volume that can be attached to an instance in the same Availability Zone. The volume is created in the regional endpoint that you send the HTTP request to. For more information see Regions and Endpoints. You can create a new empty volume or restore a volume from an EBS snapshot. Any AWS Marketplace product codes from the snapshot are propagated to the volume. You can create encrypted volumes. Encrypted volumes must be attached to instances that support Amazon EBS encryption. Volumes that are created from encrypted snapshots are also automatically encrypted. For more information, see Amazon EBS Encryption in the Amazon Elastic Compute Cloud User Guide. You can tag your volumes during creation. For more information, see Tagging Your Amazon EC2 Resources in the Amazon Elastic Compute Cloud User Guide. For more information, see Creating an Amazon EBS Volume in the Amazon Elastic Compute Cloud User Guide.
    */
  def createVolume(params: CreateVolumeRequest): Request[Volume, AWSError] = js.native
  def createVolume(params: CreateVolumeRequest, callback: js.Function2[/* err */ AWSError, /* data */ Volume, Unit]): Request[Volume, AWSError] = js.native
  /**
    * Creates a VPC with the specified IPv4 CIDR block. The smallest VPC you can create uses a /28 netmask (16 IPv4 addresses), and the largest uses a /16 netmask (65,536 IPv4 addresses). For more information about how large to make your VPC, see Your VPC and Subnets in the Amazon Virtual Private Cloud User Guide. You can optionally request an Amazon-provided IPv6 CIDR block for the VPC. The IPv6 CIDR block uses a /56 prefix length, and is allocated from Amazon's pool of IPv6 addresses. You cannot choose the IPv6 range for your VPC. By default, each instance you launch in the VPC has the default DHCP options, which include only a default DNS server that we provide (AmazonProvidedDNS). For more information, see DHCP Options Sets in the Amazon Virtual Private Cloud User Guide. You can specify the instance tenancy value for the VPC when you create it. You can't change this value for the VPC after you create it. For more information, see Dedicated Instances in the Amazon Elastic Compute Cloud User Guide.
    */
  def createVpc(): Request[CreateVpcResult, AWSError] = js.native
  def createVpc(callback: js.Function2[/* err */ AWSError, /* data */ CreateVpcResult, Unit]): Request[CreateVpcResult, AWSError] = js.native
  /**
    * Creates a VPC with the specified IPv4 CIDR block. The smallest VPC you can create uses a /28 netmask (16 IPv4 addresses), and the largest uses a /16 netmask (65,536 IPv4 addresses). For more information about how large to make your VPC, see Your VPC and Subnets in the Amazon Virtual Private Cloud User Guide. You can optionally request an Amazon-provided IPv6 CIDR block for the VPC. The IPv6 CIDR block uses a /56 prefix length, and is allocated from Amazon's pool of IPv6 addresses. You cannot choose the IPv6 range for your VPC. By default, each instance you launch in the VPC has the default DHCP options, which include only a default DNS server that we provide (AmazonProvidedDNS). For more information, see DHCP Options Sets in the Amazon Virtual Private Cloud User Guide. You can specify the instance tenancy value for the VPC when you create it. You can't change this value for the VPC after you create it. For more information, see Dedicated Instances in the Amazon Elastic Compute Cloud User Guide.
    */
  def createVpc(params: CreateVpcRequest): Request[CreateVpcResult, AWSError] = js.native
  def createVpc(
    params: CreateVpcRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVpcResult, Unit]
  ): Request[CreateVpcResult, AWSError] = js.native
  /**
    * Creates a VPC endpoint for a specified service. An endpoint enables you to create a private connection between your VPC and the service. The service may be provided by AWS, an AWS Marketplace partner, or another AWS account. For more information, see VPC Endpoints in the Amazon Virtual Private Cloud User Guide. A gateway endpoint serves as a target for a route in your route table for traffic destined for the AWS service. You can specify an endpoint policy to attach to the endpoint that will control access to the service from your VPC. You can also specify the VPC route tables that use the endpoint. An interface endpoint is a network interface in your subnet that serves as an endpoint for communicating with the specified service. You can specify the subnets in which to create an endpoint, and the security groups to associate with the endpoint network interface. Use DescribeVpcEndpointServices to get a list of supported services.
    */
  def createVpcEndpoint(): Request[CreateVpcEndpointResult, AWSError] = js.native
  def createVpcEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ CreateVpcEndpointResult, Unit]): Request[CreateVpcEndpointResult, AWSError] = js.native
  /**
    * Creates a VPC endpoint for a specified service. An endpoint enables you to create a private connection between your VPC and the service. The service may be provided by AWS, an AWS Marketplace partner, or another AWS account. For more information, see VPC Endpoints in the Amazon Virtual Private Cloud User Guide. A gateway endpoint serves as a target for a route in your route table for traffic destined for the AWS service. You can specify an endpoint policy to attach to the endpoint that will control access to the service from your VPC. You can also specify the VPC route tables that use the endpoint. An interface endpoint is a network interface in your subnet that serves as an endpoint for communicating with the specified service. You can specify the subnets in which to create an endpoint, and the security groups to associate with the endpoint network interface. Use DescribeVpcEndpointServices to get a list of supported services.
    */
  def createVpcEndpoint(params: CreateVpcEndpointRequest): Request[CreateVpcEndpointResult, AWSError] = js.native
  def createVpcEndpoint(
    params: CreateVpcEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVpcEndpointResult, Unit]
  ): Request[CreateVpcEndpointResult, AWSError] = js.native
  /**
    * Creates a connection notification for a specified VPC endpoint or VPC endpoint service. A connection notification notifies you of specific endpoint events. You must create an SNS topic to receive notifications. For more information, see Create a Topic in the Amazon Simple Notification Service Developer Guide. You can create a connection notification for interface endpoints only.
    */
  def createVpcEndpointConnectionNotification(): Request[CreateVpcEndpointConnectionNotificationResult, AWSError] = js.native
  def createVpcEndpointConnectionNotification(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVpcEndpointConnectionNotificationResult, Unit]
  ): Request[CreateVpcEndpointConnectionNotificationResult, AWSError] = js.native
  /**
    * Creates a connection notification for a specified VPC endpoint or VPC endpoint service. A connection notification notifies you of specific endpoint events. You must create an SNS topic to receive notifications. For more information, see Create a Topic in the Amazon Simple Notification Service Developer Guide. You can create a connection notification for interface endpoints only.
    */
  def createVpcEndpointConnectionNotification(params: CreateVpcEndpointConnectionNotificationRequest): Request[CreateVpcEndpointConnectionNotificationResult, AWSError] = js.native
  def createVpcEndpointConnectionNotification(
    params: CreateVpcEndpointConnectionNotificationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVpcEndpointConnectionNotificationResult, Unit]
  ): Request[CreateVpcEndpointConnectionNotificationResult, AWSError] = js.native
  /**
    * Creates a VPC endpoint service configuration to which service consumers (AWS accounts, IAM users, and IAM roles) can connect. Service consumers can create an interface VPC endpoint to connect to your service. To create an endpoint service configuration, you must first create a Network Load Balancer for your service. For more information, see VPC Endpoint Services in the Amazon Virtual Private Cloud User Guide. 
    */
  def createVpcEndpointServiceConfiguration(): Request[CreateVpcEndpointServiceConfigurationResult, AWSError] = js.native
  def createVpcEndpointServiceConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVpcEndpointServiceConfigurationResult, Unit]
  ): Request[CreateVpcEndpointServiceConfigurationResult, AWSError] = js.native
  /**
    * Creates a VPC endpoint service configuration to which service consumers (AWS accounts, IAM users, and IAM roles) can connect. Service consumers can create an interface VPC endpoint to connect to your service. To create an endpoint service configuration, you must first create a Network Load Balancer for your service. For more information, see VPC Endpoint Services in the Amazon Virtual Private Cloud User Guide. 
    */
  def createVpcEndpointServiceConfiguration(params: CreateVpcEndpointServiceConfigurationRequest): Request[CreateVpcEndpointServiceConfigurationResult, AWSError] = js.native
  def createVpcEndpointServiceConfiguration(
    params: CreateVpcEndpointServiceConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVpcEndpointServiceConfigurationResult, Unit]
  ): Request[CreateVpcEndpointServiceConfigurationResult, AWSError] = js.native
  /**
    * Requests a VPC peering connection between two VPCs: a requester VPC that you own and an accepter VPC with which to create the connection. The accepter VPC can belong to another AWS account and can be in a different Region to the requester VPC. The requester VPC and accepter VPC cannot have overlapping CIDR blocks.  Limitations and rules apply to a VPC peering connection. For more information, see the limitations section in the VPC Peering Guide.  The owner of the accepter VPC must accept the peering request to activate the peering connection. The VPC peering connection request expires after 7 days, after which it cannot be accepted or rejected. If you create a VPC peering connection request between VPCs with overlapping CIDR blocks, the VPC peering connection has a status of failed.
    */
  def createVpcPeeringConnection(): Request[CreateVpcPeeringConnectionResult, AWSError] = js.native
  def createVpcPeeringConnection(callback: js.Function2[/* err */ AWSError, /* data */ CreateVpcPeeringConnectionResult, Unit]): Request[CreateVpcPeeringConnectionResult, AWSError] = js.native
  /**
    * Requests a VPC peering connection between two VPCs: a requester VPC that you own and an accepter VPC with which to create the connection. The accepter VPC can belong to another AWS account and can be in a different Region to the requester VPC. The requester VPC and accepter VPC cannot have overlapping CIDR blocks.  Limitations and rules apply to a VPC peering connection. For more information, see the limitations section in the VPC Peering Guide.  The owner of the accepter VPC must accept the peering request to activate the peering connection. The VPC peering connection request expires after 7 days, after which it cannot be accepted or rejected. If you create a VPC peering connection request between VPCs with overlapping CIDR blocks, the VPC peering connection has a status of failed.
    */
  def createVpcPeeringConnection(params: CreateVpcPeeringConnectionRequest): Request[CreateVpcPeeringConnectionResult, AWSError] = js.native
  def createVpcPeeringConnection(
    params: CreateVpcPeeringConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVpcPeeringConnectionResult, Unit]
  ): Request[CreateVpcPeeringConnectionResult, AWSError] = js.native
  /**
    * Creates a VPN connection between an existing virtual private gateway and a VPN customer gateway. The supported connection type is ipsec.1. The response includes information that you need to give to your network administrator to configure your customer gateway.  We strongly recommend that you use HTTPS when calling this operation because the response contains sensitive cryptographic information for configuring your customer gateway.  If you decide to shut down your VPN connection for any reason and later create a new VPN connection, you must reconfigure your customer gateway with the new information returned from this call. This is an idempotent operation. If you perform the operation more than once, Amazon EC2 doesn't return an error. For more information, see AWS Site-to-Site VPN in the AWS Site-to-Site VPN User Guide.
    */
  def createVpnConnection(): Request[CreateVpnConnectionResult, AWSError] = js.native
  def createVpnConnection(callback: js.Function2[/* err */ AWSError, /* data */ CreateVpnConnectionResult, Unit]): Request[CreateVpnConnectionResult, AWSError] = js.native
  /**
    * Creates a VPN connection between an existing virtual private gateway and a VPN customer gateway. The supported connection type is ipsec.1. The response includes information that you need to give to your network administrator to configure your customer gateway.  We strongly recommend that you use HTTPS when calling this operation because the response contains sensitive cryptographic information for configuring your customer gateway.  If you decide to shut down your VPN connection for any reason and later create a new VPN connection, you must reconfigure your customer gateway with the new information returned from this call. This is an idempotent operation. If you perform the operation more than once, Amazon EC2 doesn't return an error. For more information, see AWS Site-to-Site VPN in the AWS Site-to-Site VPN User Guide.
    */
  def createVpnConnection(params: CreateVpnConnectionRequest): Request[CreateVpnConnectionResult, AWSError] = js.native
  def createVpnConnection(
    params: CreateVpnConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVpnConnectionResult, Unit]
  ): Request[CreateVpnConnectionResult, AWSError] = js.native
  /**
    * Creates a static route associated with a VPN connection between an existing virtual private gateway and a VPN customer gateway. The static route allows traffic to be routed from the virtual private gateway to the VPN customer gateway. For more information, see AWS Site-to-Site VPN in the AWS Site-to-Site VPN User Guide.
    */
  def createVpnConnectionRoute(): Request[js.Object, AWSError] = js.native
  def createVpnConnectionRoute(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Creates a static route associated with a VPN connection between an existing virtual private gateway and a VPN customer gateway. The static route allows traffic to be routed from the virtual private gateway to the VPN customer gateway. For more information, see AWS Site-to-Site VPN in the AWS Site-to-Site VPN User Guide.
    */
  def createVpnConnectionRoute(params: CreateVpnConnectionRouteRequest): Request[js.Object, AWSError] = js.native
  def createVpnConnectionRoute(
    params: CreateVpnConnectionRouteRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Creates a virtual private gateway. A virtual private gateway is the endpoint on the VPC side of your VPN connection. You can create a virtual private gateway before creating the VPC itself. For more information, see AWS Site-to-Site VPN in the AWS Site-to-Site VPN User Guide.
    */
  def createVpnGateway(): Request[CreateVpnGatewayResult, AWSError] = js.native
  def createVpnGateway(callback: js.Function2[/* err */ AWSError, /* data */ CreateVpnGatewayResult, Unit]): Request[CreateVpnGatewayResult, AWSError] = js.native
  /**
    * Creates a virtual private gateway. A virtual private gateway is the endpoint on the VPC side of your VPN connection. You can create a virtual private gateway before creating the VPC itself. For more information, see AWS Site-to-Site VPN in the AWS Site-to-Site VPN User Guide.
    */
  def createVpnGateway(params: CreateVpnGatewayRequest): Request[CreateVpnGatewayResult, AWSError] = js.native
  def createVpnGateway(
    params: CreateVpnGatewayRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVpnGatewayResult, Unit]
  ): Request[CreateVpnGatewayResult, AWSError] = js.native
  /**
    * Deletes the specified Client VPN endpoint. You must disassociate all target networks before you can delete a Client VPN endpoint.
    */
  def deleteClientVpnEndpoint(): Request[DeleteClientVpnEndpointResult, AWSError] = js.native
  def deleteClientVpnEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ DeleteClientVpnEndpointResult, Unit]): Request[DeleteClientVpnEndpointResult, AWSError] = js.native
  /**
    * Deletes the specified Client VPN endpoint. You must disassociate all target networks before you can delete a Client VPN endpoint.
    */
  def deleteClientVpnEndpoint(params: DeleteClientVpnEndpointRequest): Request[DeleteClientVpnEndpointResult, AWSError] = js.native
  def deleteClientVpnEndpoint(
    params: DeleteClientVpnEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteClientVpnEndpointResult, Unit]
  ): Request[DeleteClientVpnEndpointResult, AWSError] = js.native
  /**
    * Deletes a route from a Client VPN endpoint. You can only delete routes that you manually added using the CreateClientVpnRoute action. You cannot delete routes that were automatically added when associating a subnet. To remove routes that have been automatically added, disassociate the target subnet from the Client VPN endpoint.
    */
  def deleteClientVpnRoute(): Request[DeleteClientVpnRouteResult, AWSError] = js.native
  def deleteClientVpnRoute(callback: js.Function2[/* err */ AWSError, /* data */ DeleteClientVpnRouteResult, Unit]): Request[DeleteClientVpnRouteResult, AWSError] = js.native
  /**
    * Deletes a route from a Client VPN endpoint. You can only delete routes that you manually added using the CreateClientVpnRoute action. You cannot delete routes that were automatically added when associating a subnet. To remove routes that have been automatically added, disassociate the target subnet from the Client VPN endpoint.
    */
  def deleteClientVpnRoute(params: DeleteClientVpnRouteRequest): Request[DeleteClientVpnRouteResult, AWSError] = js.native
  def deleteClientVpnRoute(
    params: DeleteClientVpnRouteRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteClientVpnRouteResult, Unit]
  ): Request[DeleteClientVpnRouteResult, AWSError] = js.native
  /**
    * Deletes the specified customer gateway. You must delete the VPN connection before you can delete the customer gateway.
    */
  def deleteCustomerGateway(): Request[js.Object, AWSError] = js.native
  def deleteCustomerGateway(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified customer gateway. You must delete the VPN connection before you can delete the customer gateway.
    */
  def deleteCustomerGateway(params: DeleteCustomerGatewayRequest): Request[js.Object, AWSError] = js.native
  def deleteCustomerGateway(
    params: DeleteCustomerGatewayRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified set of DHCP options. You must disassociate the set of DHCP options before you can delete it. You can disassociate the set of DHCP options by associating either a new set of options or the default set of options with the VPC.
    */
  def deleteDhcpOptions(): Request[js.Object, AWSError] = js.native
  def deleteDhcpOptions(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified set of DHCP options. You must disassociate the set of DHCP options before you can delete it. You can disassociate the set of DHCP options by associating either a new set of options or the default set of options with the VPC.
    */
  def deleteDhcpOptions(params: DeleteDhcpOptionsRequest): Request[js.Object, AWSError] = js.native
  def deleteDhcpOptions(
    params: DeleteDhcpOptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an egress-only internet gateway.
    */
  def deleteEgressOnlyInternetGateway(): Request[DeleteEgressOnlyInternetGatewayResult, AWSError] = js.native
  def deleteEgressOnlyInternetGateway(callback: js.Function2[/* err */ AWSError, /* data */ DeleteEgressOnlyInternetGatewayResult, Unit]): Request[DeleteEgressOnlyInternetGatewayResult, AWSError] = js.native
  /**
    * Deletes an egress-only internet gateway.
    */
  def deleteEgressOnlyInternetGateway(params: DeleteEgressOnlyInternetGatewayRequest): Request[DeleteEgressOnlyInternetGatewayResult, AWSError] = js.native
  def deleteEgressOnlyInternetGateway(
    params: DeleteEgressOnlyInternetGatewayRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteEgressOnlyInternetGatewayResult, Unit]
  ): Request[DeleteEgressOnlyInternetGatewayResult, AWSError] = js.native
  /**
    * Deletes the specified EC2 Fleet. After you delete an EC2 Fleet, it launches no new instances. You must specify whether an EC2 Fleet should also terminate its instances. If you terminate the instances, the EC2 Fleet enters the deleted_terminating state. Otherwise, the EC2 Fleet enters the deleted_running state, and the instances continue to run until they are interrupted or you terminate them manually. 
    */
  def deleteFleets(): Request[DeleteFleetsResult, AWSError] = js.native
  def deleteFleets(callback: js.Function2[/* err */ AWSError, /* data */ DeleteFleetsResult, Unit]): Request[DeleteFleetsResult, AWSError] = js.native
  /**
    * Deletes the specified EC2 Fleet. After you delete an EC2 Fleet, it launches no new instances. You must specify whether an EC2 Fleet should also terminate its instances. If you terminate the instances, the EC2 Fleet enters the deleted_terminating state. Otherwise, the EC2 Fleet enters the deleted_running state, and the instances continue to run until they are interrupted or you terminate them manually. 
    */
  def deleteFleets(params: DeleteFleetsRequest): Request[DeleteFleetsResult, AWSError] = js.native
  def deleteFleets(
    params: DeleteFleetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteFleetsResult, Unit]
  ): Request[DeleteFleetsResult, AWSError] = js.native
  /**
    * Deletes one or more flow logs.
    */
  def deleteFlowLogs(): Request[DeleteFlowLogsResult, AWSError] = js.native
  def deleteFlowLogs(callback: js.Function2[/* err */ AWSError, /* data */ DeleteFlowLogsResult, Unit]): Request[DeleteFlowLogsResult, AWSError] = js.native
  /**
    * Deletes one or more flow logs.
    */
  def deleteFlowLogs(params: DeleteFlowLogsRequest): Request[DeleteFlowLogsResult, AWSError] = js.native
  def deleteFlowLogs(
    params: DeleteFlowLogsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteFlowLogsResult, Unit]
  ): Request[DeleteFlowLogsResult, AWSError] = js.native
  /**
    * Deletes the specified Amazon FPGA Image (AFI).
    */
  def deleteFpgaImage(): Request[DeleteFpgaImageResult, AWSError] = js.native
  def deleteFpgaImage(callback: js.Function2[/* err */ AWSError, /* data */ DeleteFpgaImageResult, Unit]): Request[DeleteFpgaImageResult, AWSError] = js.native
  /**
    * Deletes the specified Amazon FPGA Image (AFI).
    */
  def deleteFpgaImage(params: DeleteFpgaImageRequest): Request[DeleteFpgaImageResult, AWSError] = js.native
  def deleteFpgaImage(
    params: DeleteFpgaImageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteFpgaImageResult, Unit]
  ): Request[DeleteFpgaImageResult, AWSError] = js.native
  /**
    * Deletes the specified internet gateway. You must detach the internet gateway from the VPC before you can delete it.
    */
  def deleteInternetGateway(): Request[js.Object, AWSError] = js.native
  def deleteInternetGateway(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified internet gateway. You must detach the internet gateway from the VPC before you can delete it.
    */
  def deleteInternetGateway(params: DeleteInternetGatewayRequest): Request[js.Object, AWSError] = js.native
  def deleteInternetGateway(
    params: DeleteInternetGatewayRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified key pair, by removing the public key from Amazon EC2.
    */
  def deleteKeyPair(): Request[js.Object, AWSError] = js.native
  def deleteKeyPair(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified key pair, by removing the public key from Amazon EC2.
    */
  def deleteKeyPair(params: DeleteKeyPairRequest): Request[js.Object, AWSError] = js.native
  def deleteKeyPair(
    params: DeleteKeyPairRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a launch template. Deleting a launch template deletes all of its versions.
    */
  def deleteLaunchTemplate(): Request[DeleteLaunchTemplateResult, AWSError] = js.native
  def deleteLaunchTemplate(callback: js.Function2[/* err */ AWSError, /* data */ DeleteLaunchTemplateResult, Unit]): Request[DeleteLaunchTemplateResult, AWSError] = js.native
  /**
    * Deletes a launch template. Deleting a launch template deletes all of its versions.
    */
  def deleteLaunchTemplate(params: DeleteLaunchTemplateRequest): Request[DeleteLaunchTemplateResult, AWSError] = js.native
  def deleteLaunchTemplate(
    params: DeleteLaunchTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteLaunchTemplateResult, Unit]
  ): Request[DeleteLaunchTemplateResult, AWSError] = js.native
  /**
    * Deletes one or more versions of a launch template. You cannot delete the default version of a launch template; you must first assign a different version as the default. If the default version is the only version for the launch template, you must delete the entire launch template using DeleteLaunchTemplate.
    */
  def deleteLaunchTemplateVersions(): Request[DeleteLaunchTemplateVersionsResult, AWSError] = js.native
  def deleteLaunchTemplateVersions(callback: js.Function2[/* err */ AWSError, /* data */ DeleteLaunchTemplateVersionsResult, Unit]): Request[DeleteLaunchTemplateVersionsResult, AWSError] = js.native
  /**
    * Deletes one or more versions of a launch template. You cannot delete the default version of a launch template; you must first assign a different version as the default. If the default version is the only version for the launch template, you must delete the entire launch template using DeleteLaunchTemplate.
    */
  def deleteLaunchTemplateVersions(params: DeleteLaunchTemplateVersionsRequest): Request[DeleteLaunchTemplateVersionsResult, AWSError] = js.native
  def deleteLaunchTemplateVersions(
    params: DeleteLaunchTemplateVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteLaunchTemplateVersionsResult, Unit]
  ): Request[DeleteLaunchTemplateVersionsResult, AWSError] = js.native
  /**
    * Deletes the specified route from the specified local gateway route table.
    */
  def deleteLocalGatewayRoute(): Request[DeleteLocalGatewayRouteResult, AWSError] = js.native
  def deleteLocalGatewayRoute(callback: js.Function2[/* err */ AWSError, /* data */ DeleteLocalGatewayRouteResult, Unit]): Request[DeleteLocalGatewayRouteResult, AWSError] = js.native
  /**
    * Deletes the specified route from the specified local gateway route table.
    */
  def deleteLocalGatewayRoute(params: DeleteLocalGatewayRouteRequest): Request[DeleteLocalGatewayRouteResult, AWSError] = js.native
  def deleteLocalGatewayRoute(
    params: DeleteLocalGatewayRouteRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteLocalGatewayRouteResult, Unit]
  ): Request[DeleteLocalGatewayRouteResult, AWSError] = js.native
  /**
    * Deletes the specified association between a VPC and local gateway route table.
    */
  def deleteLocalGatewayRouteTableVpcAssociation(): Request[DeleteLocalGatewayRouteTableVpcAssociationResult, AWSError] = js.native
  def deleteLocalGatewayRouteTableVpcAssociation(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DeleteLocalGatewayRouteTableVpcAssociationResult, 
      Unit
    ]
  ): Request[DeleteLocalGatewayRouteTableVpcAssociationResult, AWSError] = js.native
  /**
    * Deletes the specified association between a VPC and local gateway route table.
    */
  def deleteLocalGatewayRouteTableVpcAssociation(params: DeleteLocalGatewayRouteTableVpcAssociationRequest): Request[DeleteLocalGatewayRouteTableVpcAssociationResult, AWSError] = js.native
  def deleteLocalGatewayRouteTableVpcAssociation(
    params: DeleteLocalGatewayRouteTableVpcAssociationRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DeleteLocalGatewayRouteTableVpcAssociationResult, 
      Unit
    ]
  ): Request[DeleteLocalGatewayRouteTableVpcAssociationResult, AWSError] = js.native
  /**
    * Deletes the specified NAT gateway. Deleting a NAT gateway disassociates its Elastic IP address, but does not release the address from your account. Deleting a NAT gateway does not delete any NAT gateway routes in your route tables.
    */
  def deleteNatGateway(): Request[DeleteNatGatewayResult, AWSError] = js.native
  def deleteNatGateway(callback: js.Function2[/* err */ AWSError, /* data */ DeleteNatGatewayResult, Unit]): Request[DeleteNatGatewayResult, AWSError] = js.native
  /**
    * Deletes the specified NAT gateway. Deleting a NAT gateway disassociates its Elastic IP address, but does not release the address from your account. Deleting a NAT gateway does not delete any NAT gateway routes in your route tables.
    */
  def deleteNatGateway(params: DeleteNatGatewayRequest): Request[DeleteNatGatewayResult, AWSError] = js.native
  def deleteNatGateway(
    params: DeleteNatGatewayRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteNatGatewayResult, Unit]
  ): Request[DeleteNatGatewayResult, AWSError] = js.native
  /**
    * Deletes the specified network ACL. You can't delete the ACL if it's associated with any subnets. You can't delete the default network ACL.
    */
  def deleteNetworkAcl(): Request[js.Object, AWSError] = js.native
  def deleteNetworkAcl(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified network ACL. You can't delete the ACL if it's associated with any subnets. You can't delete the default network ACL.
    */
  def deleteNetworkAcl(params: DeleteNetworkAclRequest): Request[js.Object, AWSError] = js.native
  def deleteNetworkAcl(
    params: DeleteNetworkAclRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified ingress or egress entry (rule) from the specified network ACL.
    */
  def deleteNetworkAclEntry(): Request[js.Object, AWSError] = js.native
  def deleteNetworkAclEntry(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified ingress or egress entry (rule) from the specified network ACL.
    */
  def deleteNetworkAclEntry(params: DeleteNetworkAclEntryRequest): Request[js.Object, AWSError] = js.native
  def deleteNetworkAclEntry(
    params: DeleteNetworkAclEntryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified network interface. You must detach the network interface before you can delete it.
    */
  def deleteNetworkInterface(): Request[js.Object, AWSError] = js.native
  def deleteNetworkInterface(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified network interface. You must detach the network interface before you can delete it.
    */
  def deleteNetworkInterface(params: DeleteNetworkInterfaceRequest): Request[js.Object, AWSError] = js.native
  def deleteNetworkInterface(
    params: DeleteNetworkInterfaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a permission for a network interface. By default, you cannot delete the permission if the account for which you're removing the permission has attached the network interface to an instance. However, you can force delete the permission, regardless of any attachment.
    */
  def deleteNetworkInterfacePermission(): Request[DeleteNetworkInterfacePermissionResult, AWSError] = js.native
  def deleteNetworkInterfacePermission(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteNetworkInterfacePermissionResult, Unit]
  ): Request[DeleteNetworkInterfacePermissionResult, AWSError] = js.native
  /**
    * Deletes a permission for a network interface. By default, you cannot delete the permission if the account for which you're removing the permission has attached the network interface to an instance. However, you can force delete the permission, regardless of any attachment.
    */
  def deleteNetworkInterfacePermission(params: DeleteNetworkInterfacePermissionRequest): Request[DeleteNetworkInterfacePermissionResult, AWSError] = js.native
  def deleteNetworkInterfacePermission(
    params: DeleteNetworkInterfacePermissionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteNetworkInterfacePermissionResult, Unit]
  ): Request[DeleteNetworkInterfacePermissionResult, AWSError] = js.native
  /**
    * Deletes the specified placement group. You must terminate all instances in the placement group before you can delete the placement group. For more information, see Placement Groups in the Amazon Elastic Compute Cloud User Guide.
    */
  def deletePlacementGroup(): Request[js.Object, AWSError] = js.native
  def deletePlacementGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified placement group. You must terminate all instances in the placement group before you can delete the placement group. For more information, see Placement Groups in the Amazon Elastic Compute Cloud User Guide.
    */
  def deletePlacementGroup(params: DeletePlacementGroupRequest): Request[js.Object, AWSError] = js.native
  def deletePlacementGroup(
    params: DeletePlacementGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the queued purchases for the specified Reserved Instances.
    */
  def deleteQueuedReservedInstances(): Request[DeleteQueuedReservedInstancesResult, AWSError] = js.native
  def deleteQueuedReservedInstances(callback: js.Function2[/* err */ AWSError, /* data */ DeleteQueuedReservedInstancesResult, Unit]): Request[DeleteQueuedReservedInstancesResult, AWSError] = js.native
  /**
    * Deletes the queued purchases for the specified Reserved Instances.
    */
  def deleteQueuedReservedInstances(params: DeleteQueuedReservedInstancesRequest): Request[DeleteQueuedReservedInstancesResult, AWSError] = js.native
  def deleteQueuedReservedInstances(
    params: DeleteQueuedReservedInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteQueuedReservedInstancesResult, Unit]
  ): Request[DeleteQueuedReservedInstancesResult, AWSError] = js.native
  /**
    * Deletes the specified route from the specified route table.
    */
  def deleteRoute(): Request[js.Object, AWSError] = js.native
  def deleteRoute(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified route from the specified route table.
    */
  def deleteRoute(params: DeleteRouteRequest): Request[js.Object, AWSError] = js.native
  def deleteRoute(params: DeleteRouteRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified route table. You must disassociate the route table from any subnets before you can delete it. You can't delete the main route table.
    */
  def deleteRouteTable(): Request[js.Object, AWSError] = js.native
  def deleteRouteTable(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified route table. You must disassociate the route table from any subnets before you can delete it. You can't delete the main route table.
    */
  def deleteRouteTable(params: DeleteRouteTableRequest): Request[js.Object, AWSError] = js.native
  def deleteRouteTable(
    params: DeleteRouteTableRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a security group. If you attempt to delete a security group that is associated with an instance, or is referenced by another security group, the operation fails with InvalidGroup.InUse in EC2-Classic or DependencyViolation in EC2-VPC.
    */
  def deleteSecurityGroup(): Request[js.Object, AWSError] = js.native
  def deleteSecurityGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a security group. If you attempt to delete a security group that is associated with an instance, or is referenced by another security group, the operation fails with InvalidGroup.InUse in EC2-Classic or DependencyViolation in EC2-VPC.
    */
  def deleteSecurityGroup(params: DeleteSecurityGroupRequest): Request[js.Object, AWSError] = js.native
  def deleteSecurityGroup(
    params: DeleteSecurityGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified snapshot. When you make periodic snapshots of a volume, the snapshots are incremental, and only the blocks on the device that have changed since your last snapshot are saved in the new snapshot. When you delete a snapshot, only the data not needed for any other snapshot is removed. So regardless of which prior snapshots have been deleted, all active snapshots will have access to all the information needed to restore the volume. You cannot delete a snapshot of the root device of an EBS volume used by a registered AMI. You must first de-register the AMI before you can delete the snapshot. For more information, see Deleting an Amazon EBS Snapshot in the Amazon Elastic Compute Cloud User Guide.
    */
  def deleteSnapshot(): Request[js.Object, AWSError] = js.native
  def deleteSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified snapshot. When you make periodic snapshots of a volume, the snapshots are incremental, and only the blocks on the device that have changed since your last snapshot are saved in the new snapshot. When you delete a snapshot, only the data not needed for any other snapshot is removed. So regardless of which prior snapshots have been deleted, all active snapshots will have access to all the information needed to restore the volume. You cannot delete a snapshot of the root device of an EBS volume used by a registered AMI. You must first de-register the AMI before you can delete the snapshot. For more information, see Deleting an Amazon EBS Snapshot in the Amazon Elastic Compute Cloud User Guide.
    */
  def deleteSnapshot(params: DeleteSnapshotRequest): Request[js.Object, AWSError] = js.native
  def deleteSnapshot(
    params: DeleteSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the data feed for Spot Instances.
    */
  def deleteSpotDatafeedSubscription(): Request[js.Object, AWSError] = js.native
  def deleteSpotDatafeedSubscription(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the data feed for Spot Instances.
    */
  def deleteSpotDatafeedSubscription(params: DeleteSpotDatafeedSubscriptionRequest): Request[js.Object, AWSError] = js.native
  def deleteSpotDatafeedSubscription(
    params: DeleteSpotDatafeedSubscriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified subnet. You must terminate all running instances in the subnet before you can delete the subnet.
    */
  def deleteSubnet(): Request[js.Object, AWSError] = js.native
  def deleteSubnet(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified subnet. You must terminate all running instances in the subnet before you can delete the subnet.
    */
  def deleteSubnet(params: DeleteSubnetRequest): Request[js.Object, AWSError] = js.native
  def deleteSubnet(
    params: DeleteSubnetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified set of tags from the specified set of resources. To list the current tags, use DescribeTags. For more information about tags, see Tagging Your Resources in the Amazon Elastic Compute Cloud User Guide.
    */
  def deleteTags(): Request[js.Object, AWSError] = js.native
  def deleteTags(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified set of tags from the specified set of resources. To list the current tags, use DescribeTags. For more information about tags, see Tagging Your Resources in the Amazon Elastic Compute Cloud User Guide.
    */
  def deleteTags(params: DeleteTagsRequest): Request[js.Object, AWSError] = js.native
  def deleteTags(params: DeleteTagsRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified Traffic Mirror filter. You cannot delete a Traffic Mirror filter that is in use by a Traffic Mirror session.
    */
  def deleteTrafficMirrorFilter(): Request[DeleteTrafficMirrorFilterResult, AWSError] = js.native
  def deleteTrafficMirrorFilter(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTrafficMirrorFilterResult, Unit]): Request[DeleteTrafficMirrorFilterResult, AWSError] = js.native
  /**
    * Deletes the specified Traffic Mirror filter. You cannot delete a Traffic Mirror filter that is in use by a Traffic Mirror session.
    */
  def deleteTrafficMirrorFilter(params: DeleteTrafficMirrorFilterRequest): Request[DeleteTrafficMirrorFilterResult, AWSError] = js.native
  def deleteTrafficMirrorFilter(
    params: DeleteTrafficMirrorFilterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTrafficMirrorFilterResult, Unit]
  ): Request[DeleteTrafficMirrorFilterResult, AWSError] = js.native
  /**
    * Deletes the specified Traffic Mirror rule.
    */
  def deleteTrafficMirrorFilterRule(): Request[DeleteTrafficMirrorFilterRuleResult, AWSError] = js.native
  def deleteTrafficMirrorFilterRule(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTrafficMirrorFilterRuleResult, Unit]): Request[DeleteTrafficMirrorFilterRuleResult, AWSError] = js.native
  /**
    * Deletes the specified Traffic Mirror rule.
    */
  def deleteTrafficMirrorFilterRule(params: DeleteTrafficMirrorFilterRuleRequest): Request[DeleteTrafficMirrorFilterRuleResult, AWSError] = js.native
  def deleteTrafficMirrorFilterRule(
    params: DeleteTrafficMirrorFilterRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTrafficMirrorFilterRuleResult, Unit]
  ): Request[DeleteTrafficMirrorFilterRuleResult, AWSError] = js.native
  /**
    * Deletes the specified Traffic Mirror session.
    */
  def deleteTrafficMirrorSession(): Request[DeleteTrafficMirrorSessionResult, AWSError] = js.native
  def deleteTrafficMirrorSession(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTrafficMirrorSessionResult, Unit]): Request[DeleteTrafficMirrorSessionResult, AWSError] = js.native
  /**
    * Deletes the specified Traffic Mirror session.
    */
  def deleteTrafficMirrorSession(params: DeleteTrafficMirrorSessionRequest): Request[DeleteTrafficMirrorSessionResult, AWSError] = js.native
  def deleteTrafficMirrorSession(
    params: DeleteTrafficMirrorSessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTrafficMirrorSessionResult, Unit]
  ): Request[DeleteTrafficMirrorSessionResult, AWSError] = js.native
  /**
    * Deletes the specified Traffic Mirror target. You cannot delete a Traffic Mirror target that is in use by a Traffic Mirror session.
    */
  def deleteTrafficMirrorTarget(): Request[DeleteTrafficMirrorTargetResult, AWSError] = js.native
  def deleteTrafficMirrorTarget(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTrafficMirrorTargetResult, Unit]): Request[DeleteTrafficMirrorTargetResult, AWSError] = js.native
  /**
    * Deletes the specified Traffic Mirror target. You cannot delete a Traffic Mirror target that is in use by a Traffic Mirror session.
    */
  def deleteTrafficMirrorTarget(params: DeleteTrafficMirrorTargetRequest): Request[DeleteTrafficMirrorTargetResult, AWSError] = js.native
  def deleteTrafficMirrorTarget(
    params: DeleteTrafficMirrorTargetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTrafficMirrorTargetResult, Unit]
  ): Request[DeleteTrafficMirrorTargetResult, AWSError] = js.native
  /**
    * Deletes the specified transit gateway.
    */
  def deleteTransitGateway(): Request[DeleteTransitGatewayResult, AWSError] = js.native
  def deleteTransitGateway(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTransitGatewayResult, Unit]): Request[DeleteTransitGatewayResult, AWSError] = js.native
  /**
    * Deletes the specified transit gateway.
    */
  def deleteTransitGateway(params: DeleteTransitGatewayRequest): Request[DeleteTransitGatewayResult, AWSError] = js.native
  def deleteTransitGateway(
    params: DeleteTransitGatewayRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTransitGatewayResult, Unit]
  ): Request[DeleteTransitGatewayResult, AWSError] = js.native
  /**
    * Deletes the specified transit gateway multicast domain.
    */
  def deleteTransitGatewayMulticastDomain(): Request[DeleteTransitGatewayMulticastDomainResult, AWSError] = js.native
  def deleteTransitGatewayMulticastDomain(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTransitGatewayMulticastDomainResult, Unit]
  ): Request[DeleteTransitGatewayMulticastDomainResult, AWSError] = js.native
  /**
    * Deletes the specified transit gateway multicast domain.
    */
  def deleteTransitGatewayMulticastDomain(params: DeleteTransitGatewayMulticastDomainRequest): Request[DeleteTransitGatewayMulticastDomainResult, AWSError] = js.native
  def deleteTransitGatewayMulticastDomain(
    params: DeleteTransitGatewayMulticastDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTransitGatewayMulticastDomainResult, Unit]
  ): Request[DeleteTransitGatewayMulticastDomainResult, AWSError] = js.native
  /**
    * Deletes a transit gateway peering attachment.
    */
  def deleteTransitGatewayPeeringAttachment(): Request[DeleteTransitGatewayPeeringAttachmentResult, AWSError] = js.native
  def deleteTransitGatewayPeeringAttachment(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTransitGatewayPeeringAttachmentResult, Unit]
  ): Request[DeleteTransitGatewayPeeringAttachmentResult, AWSError] = js.native
  /**
    * Deletes a transit gateway peering attachment.
    */
  def deleteTransitGatewayPeeringAttachment(params: DeleteTransitGatewayPeeringAttachmentRequest): Request[DeleteTransitGatewayPeeringAttachmentResult, AWSError] = js.native
  def deleteTransitGatewayPeeringAttachment(
    params: DeleteTransitGatewayPeeringAttachmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTransitGatewayPeeringAttachmentResult, Unit]
  ): Request[DeleteTransitGatewayPeeringAttachmentResult, AWSError] = js.native
  /**
    * Deletes the specified route from the specified transit gateway route table.
    */
  def deleteTransitGatewayRoute(): Request[DeleteTransitGatewayRouteResult, AWSError] = js.native
  def deleteTransitGatewayRoute(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTransitGatewayRouteResult, Unit]): Request[DeleteTransitGatewayRouteResult, AWSError] = js.native
  /**
    * Deletes the specified route from the specified transit gateway route table.
    */
  def deleteTransitGatewayRoute(params: DeleteTransitGatewayRouteRequest): Request[DeleteTransitGatewayRouteResult, AWSError] = js.native
  def deleteTransitGatewayRoute(
    params: DeleteTransitGatewayRouteRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTransitGatewayRouteResult, Unit]
  ): Request[DeleteTransitGatewayRouteResult, AWSError] = js.native
  /**
    * Deletes the specified transit gateway route table. You must disassociate the route table from any transit gateway route tables before you can delete it.
    */
  def deleteTransitGatewayRouteTable(): Request[DeleteTransitGatewayRouteTableResult, AWSError] = js.native
  def deleteTransitGatewayRouteTable(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTransitGatewayRouteTableResult, Unit]): Request[DeleteTransitGatewayRouteTableResult, AWSError] = js.native
  /**
    * Deletes the specified transit gateway route table. You must disassociate the route table from any transit gateway route tables before you can delete it.
    */
  def deleteTransitGatewayRouteTable(params: DeleteTransitGatewayRouteTableRequest): Request[DeleteTransitGatewayRouteTableResult, AWSError] = js.native
  def deleteTransitGatewayRouteTable(
    params: DeleteTransitGatewayRouteTableRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTransitGatewayRouteTableResult, Unit]
  ): Request[DeleteTransitGatewayRouteTableResult, AWSError] = js.native
  /**
    * Deletes the specified VPC attachment.
    */
  def deleteTransitGatewayVpcAttachment(): Request[DeleteTransitGatewayVpcAttachmentResult, AWSError] = js.native
  def deleteTransitGatewayVpcAttachment(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTransitGatewayVpcAttachmentResult, Unit]
  ): Request[DeleteTransitGatewayVpcAttachmentResult, AWSError] = js.native
  /**
    * Deletes the specified VPC attachment.
    */
  def deleteTransitGatewayVpcAttachment(params: DeleteTransitGatewayVpcAttachmentRequest): Request[DeleteTransitGatewayVpcAttachmentResult, AWSError] = js.native
  def deleteTransitGatewayVpcAttachment(
    params: DeleteTransitGatewayVpcAttachmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTransitGatewayVpcAttachmentResult, Unit]
  ): Request[DeleteTransitGatewayVpcAttachmentResult, AWSError] = js.native
  /**
    * Deletes the specified EBS volume. The volume must be in the available state (not attached to an instance). The volume can remain in the deleting state for several minutes. For more information, see Deleting an Amazon EBS Volume in the Amazon Elastic Compute Cloud User Guide.
    */
  def deleteVolume(): Request[js.Object, AWSError] = js.native
  def deleteVolume(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified EBS volume. The volume must be in the available state (not attached to an instance). The volume can remain in the deleting state for several minutes. For more information, see Deleting an Amazon EBS Volume in the Amazon Elastic Compute Cloud User Guide.
    */
  def deleteVolume(params: DeleteVolumeRequest): Request[js.Object, AWSError] = js.native
  def deleteVolume(
    params: DeleteVolumeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified VPC. You must detach or delete all gateways and resources that are associated with the VPC before you can delete it. For example, you must terminate all instances running in the VPC, delete all security groups associated with the VPC (except the default one), delete all route tables associated with the VPC (except the default one), and so on.
    */
  def deleteVpc(): Request[js.Object, AWSError] = js.native
  def deleteVpc(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified VPC. You must detach or delete all gateways and resources that are associated with the VPC before you can delete it. For example, you must terminate all instances running in the VPC, delete all security groups associated with the VPC (except the default one), delete all route tables associated with the VPC (except the default one), and so on.
    */
  def deleteVpc(params: DeleteVpcRequest): Request[js.Object, AWSError] = js.native
  def deleteVpc(params: DeleteVpcRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes one or more VPC endpoint connection notifications.
    */
  def deleteVpcEndpointConnectionNotifications(): Request[DeleteVpcEndpointConnectionNotificationsResult, AWSError] = js.native
  def deleteVpcEndpointConnectionNotifications(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteVpcEndpointConnectionNotificationsResult, Unit]
  ): Request[DeleteVpcEndpointConnectionNotificationsResult, AWSError] = js.native
  /**
    * Deletes one or more VPC endpoint connection notifications.
    */
  def deleteVpcEndpointConnectionNotifications(params: DeleteVpcEndpointConnectionNotificationsRequest): Request[DeleteVpcEndpointConnectionNotificationsResult, AWSError] = js.native
  def deleteVpcEndpointConnectionNotifications(
    params: DeleteVpcEndpointConnectionNotificationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteVpcEndpointConnectionNotificationsResult, Unit]
  ): Request[DeleteVpcEndpointConnectionNotificationsResult, AWSError] = js.native
  /**
    * Deletes one or more VPC endpoint service configurations in your account. Before you delete the endpoint service configuration, you must reject any Available or PendingAcceptance interface endpoint connections that are attached to the service.
    */
  def deleteVpcEndpointServiceConfigurations(): Request[DeleteVpcEndpointServiceConfigurationsResult, AWSError] = js.native
  def deleteVpcEndpointServiceConfigurations(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteVpcEndpointServiceConfigurationsResult, Unit]
  ): Request[DeleteVpcEndpointServiceConfigurationsResult, AWSError] = js.native
  /**
    * Deletes one or more VPC endpoint service configurations in your account. Before you delete the endpoint service configuration, you must reject any Available or PendingAcceptance interface endpoint connections that are attached to the service.
    */
  def deleteVpcEndpointServiceConfigurations(params: DeleteVpcEndpointServiceConfigurationsRequest): Request[DeleteVpcEndpointServiceConfigurationsResult, AWSError] = js.native
  def deleteVpcEndpointServiceConfigurations(
    params: DeleteVpcEndpointServiceConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteVpcEndpointServiceConfigurationsResult, Unit]
  ): Request[DeleteVpcEndpointServiceConfigurationsResult, AWSError] = js.native
  /**
    * Deletes one or more specified VPC endpoints. Deleting a gateway endpoint also deletes the endpoint routes in the route tables that were associated with the endpoint. Deleting an interface endpoint deletes the endpoint network interfaces.
    */
  def deleteVpcEndpoints(): Request[DeleteVpcEndpointsResult, AWSError] = js.native
  def deleteVpcEndpoints(callback: js.Function2[/* err */ AWSError, /* data */ DeleteVpcEndpointsResult, Unit]): Request[DeleteVpcEndpointsResult, AWSError] = js.native
  /**
    * Deletes one or more specified VPC endpoints. Deleting a gateway endpoint also deletes the endpoint routes in the route tables that were associated with the endpoint. Deleting an interface endpoint deletes the endpoint network interfaces.
    */
  def deleteVpcEndpoints(params: DeleteVpcEndpointsRequest): Request[DeleteVpcEndpointsResult, AWSError] = js.native
  def deleteVpcEndpoints(
    params: DeleteVpcEndpointsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteVpcEndpointsResult, Unit]
  ): Request[DeleteVpcEndpointsResult, AWSError] = js.native
  /**
    * Deletes a VPC peering connection. Either the owner of the requester VPC or the owner of the accepter VPC can delete the VPC peering connection if it's in the active state. The owner of the requester VPC can delete a VPC peering connection in the pending-acceptance state. You cannot delete a VPC peering connection that's in the failed state.
    */
  def deleteVpcPeeringConnection(): Request[DeleteVpcPeeringConnectionResult, AWSError] = js.native
  def deleteVpcPeeringConnection(callback: js.Function2[/* err */ AWSError, /* data */ DeleteVpcPeeringConnectionResult, Unit]): Request[DeleteVpcPeeringConnectionResult, AWSError] = js.native
  /**
    * Deletes a VPC peering connection. Either the owner of the requester VPC or the owner of the accepter VPC can delete the VPC peering connection if it's in the active state. The owner of the requester VPC can delete a VPC peering connection in the pending-acceptance state. You cannot delete a VPC peering connection that's in the failed state.
    */
  def deleteVpcPeeringConnection(params: DeleteVpcPeeringConnectionRequest): Request[DeleteVpcPeeringConnectionResult, AWSError] = js.native
  def deleteVpcPeeringConnection(
    params: DeleteVpcPeeringConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteVpcPeeringConnectionResult, Unit]
  ): Request[DeleteVpcPeeringConnectionResult, AWSError] = js.native
  /**
    * Deletes the specified VPN connection. If you're deleting the VPC and its associated components, we recommend that you detach the virtual private gateway from the VPC and delete the VPC before deleting the VPN connection. If you believe that the tunnel credentials for your VPN connection have been compromised, you can delete the VPN connection and create a new one that has new keys, without needing to delete the VPC or virtual private gateway. If you create a new VPN connection, you must reconfigure the customer gateway using the new configuration information returned with the new VPN connection ID.
    */
  def deleteVpnConnection(): Request[js.Object, AWSError] = js.native
  def deleteVpnConnection(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified VPN connection. If you're deleting the VPC and its associated components, we recommend that you detach the virtual private gateway from the VPC and delete the VPC before deleting the VPN connection. If you believe that the tunnel credentials for your VPN connection have been compromised, you can delete the VPN connection and create a new one that has new keys, without needing to delete the VPC or virtual private gateway. If you create a new VPN connection, you must reconfigure the customer gateway using the new configuration information returned with the new VPN connection ID.
    */
  def deleteVpnConnection(params: DeleteVpnConnectionRequest): Request[js.Object, AWSError] = js.native
  def deleteVpnConnection(
    params: DeleteVpnConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified static route associated with a VPN connection between an existing virtual private gateway and a VPN customer gateway. The static route allows traffic to be routed from the virtual private gateway to the VPN customer gateway.
    */
  def deleteVpnConnectionRoute(): Request[js.Object, AWSError] = js.native
  def deleteVpnConnectionRoute(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified static route associated with a VPN connection between an existing virtual private gateway and a VPN customer gateway. The static route allows traffic to be routed from the virtual private gateway to the VPN customer gateway.
    */
  def deleteVpnConnectionRoute(params: DeleteVpnConnectionRouteRequest): Request[js.Object, AWSError] = js.native
  def deleteVpnConnectionRoute(
    params: DeleteVpnConnectionRouteRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified virtual private gateway. We recommend that before you delete a virtual private gateway, you detach it from the VPC and delete the VPN connection. Note that you don't need to delete the virtual private gateway if you plan to delete and recreate the VPN connection between your VPC and your network.
    */
  def deleteVpnGateway(): Request[js.Object, AWSError] = js.native
  def deleteVpnGateway(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified virtual private gateway. We recommend that before you delete a virtual private gateway, you detach it from the VPC and delete the VPN connection. Note that you don't need to delete the virtual private gateway if you plan to delete and recreate the VPN connection between your VPC and your network.
    */
  def deleteVpnGateway(params: DeleteVpnGatewayRequest): Request[js.Object, AWSError] = js.native
  def deleteVpnGateway(
    params: DeleteVpnGatewayRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Releases the specified address range that you provisioned for use with your AWS resources through bring your own IP addresses (BYOIP) and deletes the corresponding address pool. Before you can release an address range, you must stop advertising it using WithdrawByoipCidr and you must not have any IP addresses allocated from its address range.
    */
  def deprovisionByoipCidr(): Request[DeprovisionByoipCidrResult, AWSError] = js.native
  def deprovisionByoipCidr(callback: js.Function2[/* err */ AWSError, /* data */ DeprovisionByoipCidrResult, Unit]): Request[DeprovisionByoipCidrResult, AWSError] = js.native
  /**
    * Releases the specified address range that you provisioned for use with your AWS resources through bring your own IP addresses (BYOIP) and deletes the corresponding address pool. Before you can release an address range, you must stop advertising it using WithdrawByoipCidr and you must not have any IP addresses allocated from its address range.
    */
  def deprovisionByoipCidr(params: DeprovisionByoipCidrRequest): Request[DeprovisionByoipCidrResult, AWSError] = js.native
  def deprovisionByoipCidr(
    params: DeprovisionByoipCidrRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeprovisionByoipCidrResult, Unit]
  ): Request[DeprovisionByoipCidrResult, AWSError] = js.native
  /**
    * Deregisters the specified AMI. After you deregister an AMI, it can't be used to launch new instances; however, it doesn't affect any instances that you've already launched from the AMI. You'll continue to incur usage costs for those instances until you terminate them. When you deregister an Amazon EBS-backed AMI, it doesn't affect the snapshot that was created for the root volume of the instance during the AMI creation process. When you deregister an instance store-backed AMI, it doesn't affect the files that you uploaded to Amazon S3 when you created the AMI.
    */
  def deregisterImage(): Request[js.Object, AWSError] = js.native
  def deregisterImage(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deregisters the specified AMI. After you deregister an AMI, it can't be used to launch new instances; however, it doesn't affect any instances that you've already launched from the AMI. You'll continue to incur usage costs for those instances until you terminate them. When you deregister an Amazon EBS-backed AMI, it doesn't affect the snapshot that was created for the root volume of the instance during the AMI creation process. When you deregister an instance store-backed AMI, it doesn't affect the files that you uploaded to Amazon S3 when you created the AMI.
    */
  def deregisterImage(params: DeregisterImageRequest): Request[js.Object, AWSError] = js.native
  def deregisterImage(
    params: DeregisterImageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deregisters the specified members (network interfaces) from the transit gateway multicast group.
    */
  def deregisterTransitGatewayMulticastGroupMembers(): Request[DeregisterTransitGatewayMulticastGroupMembersResult, AWSError] = js.native
  def deregisterTransitGatewayMulticastGroupMembers(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DeregisterTransitGatewayMulticastGroupMembersResult, 
      Unit
    ]
  ): Request[DeregisterTransitGatewayMulticastGroupMembersResult, AWSError] = js.native
  /**
    * Deregisters the specified members (network interfaces) from the transit gateway multicast group.
    */
  def deregisterTransitGatewayMulticastGroupMembers(params: DeregisterTransitGatewayMulticastGroupMembersRequest): Request[DeregisterTransitGatewayMulticastGroupMembersResult, AWSError] = js.native
  def deregisterTransitGatewayMulticastGroupMembers(
    params: DeregisterTransitGatewayMulticastGroupMembersRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DeregisterTransitGatewayMulticastGroupMembersResult, 
      Unit
    ]
  ): Request[DeregisterTransitGatewayMulticastGroupMembersResult, AWSError] = js.native
  /**
    * Deregisters the specified sources (network interfaces) from the transit gateway multicast group.
    */
  def deregisterTransitGatewayMulticastGroupSources(): Request[DeregisterTransitGatewayMulticastGroupSourcesResult, AWSError] = js.native
  def deregisterTransitGatewayMulticastGroupSources(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DeregisterTransitGatewayMulticastGroupSourcesResult, 
      Unit
    ]
  ): Request[DeregisterTransitGatewayMulticastGroupSourcesResult, AWSError] = js.native
  /**
    * Deregisters the specified sources (network interfaces) from the transit gateway multicast group.
    */
  def deregisterTransitGatewayMulticastGroupSources(params: DeregisterTransitGatewayMulticastGroupSourcesRequest): Request[DeregisterTransitGatewayMulticastGroupSourcesResult, AWSError] = js.native
  def deregisterTransitGatewayMulticastGroupSources(
    params: DeregisterTransitGatewayMulticastGroupSourcesRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DeregisterTransitGatewayMulticastGroupSourcesResult, 
      Unit
    ]
  ): Request[DeregisterTransitGatewayMulticastGroupSourcesResult, AWSError] = js.native
  /**
    * Describes attributes of your AWS account. The following are the supported account attributes:    supported-platforms: Indicates whether your account can launch instances into EC2-Classic and EC2-VPC, or only into EC2-VPC.    default-vpc: The ID of the default VPC for your account, or none.    max-instances: This attribute is no longer supported. The returned value does not reflect your actual vCPU limit for running On-Demand Instances. For more information, see On-Demand Instance Limits in the Amazon Elastic Compute Cloud User Guide.    vpc-max-security-groups-per-interface: The maximum number of security groups that you can assign to a network interface.    max-elastic-ips: The maximum number of Elastic IP addresses that you can allocate for use with EC2-Classic.     vpc-max-elastic-ips: The maximum number of Elastic IP addresses that you can allocate for use with EC2-VPC.  
    */
  def describeAccountAttributes(): Request[DescribeAccountAttributesResult, AWSError] = js.native
  def describeAccountAttributes(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccountAttributesResult, Unit]): Request[DescribeAccountAttributesResult, AWSError] = js.native
  /**
    * Describes attributes of your AWS account. The following are the supported account attributes:    supported-platforms: Indicates whether your account can launch instances into EC2-Classic and EC2-VPC, or only into EC2-VPC.    default-vpc: The ID of the default VPC for your account, or none.    max-instances: This attribute is no longer supported. The returned value does not reflect your actual vCPU limit for running On-Demand Instances. For more information, see On-Demand Instance Limits in the Amazon Elastic Compute Cloud User Guide.    vpc-max-security-groups-per-interface: The maximum number of security groups that you can assign to a network interface.    max-elastic-ips: The maximum number of Elastic IP addresses that you can allocate for use with EC2-Classic.     vpc-max-elastic-ips: The maximum number of Elastic IP addresses that you can allocate for use with EC2-VPC.  
    */
  def describeAccountAttributes(params: DescribeAccountAttributesRequest): Request[DescribeAccountAttributesResult, AWSError] = js.native
  def describeAccountAttributes(
    params: DescribeAccountAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccountAttributesResult, Unit]
  ): Request[DescribeAccountAttributesResult, AWSError] = js.native
  /**
    * Describes the specified Elastic IP addresses or all of your Elastic IP addresses. An Elastic IP address is for use in either the EC2-Classic platform or in a VPC. For more information, see Elastic IP Addresses in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeAddresses(): Request[DescribeAddressesResult, AWSError] = js.native
  def describeAddresses(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAddressesResult, Unit]): Request[DescribeAddressesResult, AWSError] = js.native
  /**
    * Describes the specified Elastic IP addresses or all of your Elastic IP addresses. An Elastic IP address is for use in either the EC2-Classic platform or in a VPC. For more information, see Elastic IP Addresses in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeAddresses(params: DescribeAddressesRequest): Request[DescribeAddressesResult, AWSError] = js.native
  def describeAddresses(
    params: DescribeAddressesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAddressesResult, Unit]
  ): Request[DescribeAddressesResult, AWSError] = js.native
  /**
    * Describes the longer ID format settings for all resource types in a specific Region. This request is useful for performing a quick audit to determine whether a specific Region is fully opted in for longer IDs (17-character IDs). This request only returns information about resource types that support longer IDs. The following resource types support longer IDs: bundle | conversion-task | customer-gateway | dhcp-options | elastic-ip-allocation | elastic-ip-association | export-task | flow-log | image | import-task | instance | internet-gateway | network-acl | network-acl-association | network-interface | network-interface-attachment | prefix-list | reservation | route-table | route-table-association | security-group | snapshot | subnet | subnet-cidr-block-association | volume | vpc | vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection | vpn-connection | vpn-gateway.
    */
  def describeAggregateIdFormat(): Request[DescribeAggregateIdFormatResult, AWSError] = js.native
  def describeAggregateIdFormat(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAggregateIdFormatResult, Unit]): Request[DescribeAggregateIdFormatResult, AWSError] = js.native
  /**
    * Describes the longer ID format settings for all resource types in a specific Region. This request is useful for performing a quick audit to determine whether a specific Region is fully opted in for longer IDs (17-character IDs). This request only returns information about resource types that support longer IDs. The following resource types support longer IDs: bundle | conversion-task | customer-gateway | dhcp-options | elastic-ip-allocation | elastic-ip-association | export-task | flow-log | image | import-task | instance | internet-gateway | network-acl | network-acl-association | network-interface | network-interface-attachment | prefix-list | reservation | route-table | route-table-association | security-group | snapshot | subnet | subnet-cidr-block-association | volume | vpc | vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection | vpn-connection | vpn-gateway.
    */
  def describeAggregateIdFormat(params: DescribeAggregateIdFormatRequest): Request[DescribeAggregateIdFormatResult, AWSError] = js.native
  def describeAggregateIdFormat(
    params: DescribeAggregateIdFormatRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAggregateIdFormatResult, Unit]
  ): Request[DescribeAggregateIdFormatResult, AWSError] = js.native
  /**
    * Describes the Availability Zones and Local Zones that are available to you. If there is an event impacting an Availability Zone or Local Zone, you can use this request to view the state and any provided messages for that Availability Zone or Local Zone. For more information about Availability Zones and Local Zones, see Regions and Availability Zones in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeAvailabilityZones(): Request[DescribeAvailabilityZonesResult, AWSError] = js.native
  def describeAvailabilityZones(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAvailabilityZonesResult, Unit]): Request[DescribeAvailabilityZonesResult, AWSError] = js.native
  /**
    * Describes the Availability Zones and Local Zones that are available to you. If there is an event impacting an Availability Zone or Local Zone, you can use this request to view the state and any provided messages for that Availability Zone or Local Zone. For more information about Availability Zones and Local Zones, see Regions and Availability Zones in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeAvailabilityZones(params: DescribeAvailabilityZonesRequest): Request[DescribeAvailabilityZonesResult, AWSError] = js.native
  def describeAvailabilityZones(
    params: DescribeAvailabilityZonesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAvailabilityZonesResult, Unit]
  ): Request[DescribeAvailabilityZonesResult, AWSError] = js.native
  /**
    * Describes the specified bundle tasks or all of your bundle tasks.  Completed bundle tasks are listed for only a limited time. If your bundle task is no longer in the list, you can still register an AMI from it. Just use RegisterImage with the Amazon S3 bucket name and image manifest name you provided to the bundle task. 
    */
  def describeBundleTasks(): Request[DescribeBundleTasksResult, AWSError] = js.native
  def describeBundleTasks(callback: js.Function2[/* err */ AWSError, /* data */ DescribeBundleTasksResult, Unit]): Request[DescribeBundleTasksResult, AWSError] = js.native
  /**
    * Describes the specified bundle tasks or all of your bundle tasks.  Completed bundle tasks are listed for only a limited time. If your bundle task is no longer in the list, you can still register an AMI from it. Just use RegisterImage with the Amazon S3 bucket name and image manifest name you provided to the bundle task. 
    */
  def describeBundleTasks(params: DescribeBundleTasksRequest): Request[DescribeBundleTasksResult, AWSError] = js.native
  def describeBundleTasks(
    params: DescribeBundleTasksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeBundleTasksResult, Unit]
  ): Request[DescribeBundleTasksResult, AWSError] = js.native
  /**
    * Describes the IP address ranges that were specified in calls to ProvisionByoipCidr. To describe the address pools that were created when you provisioned the address ranges, use DescribePublicIpv4Pools.
    */
  def describeByoipCidrs(): Request[DescribeByoipCidrsResult, AWSError] = js.native
  def describeByoipCidrs(callback: js.Function2[/* err */ AWSError, /* data */ DescribeByoipCidrsResult, Unit]): Request[DescribeByoipCidrsResult, AWSError] = js.native
  /**
    * Describes the IP address ranges that were specified in calls to ProvisionByoipCidr. To describe the address pools that were created when you provisioned the address ranges, use DescribePublicIpv4Pools.
    */
  def describeByoipCidrs(params: DescribeByoipCidrsRequest): Request[DescribeByoipCidrsResult, AWSError] = js.native
  def describeByoipCidrs(
    params: DescribeByoipCidrsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeByoipCidrsResult, Unit]
  ): Request[DescribeByoipCidrsResult, AWSError] = js.native
  /**
    * Describes one or more of your Capacity Reservations. The results describe only the Capacity Reservations in the AWS Region that you're currently using.
    */
  def describeCapacityReservations(): Request[DescribeCapacityReservationsResult, AWSError] = js.native
  def describeCapacityReservations(callback: js.Function2[/* err */ AWSError, /* data */ DescribeCapacityReservationsResult, Unit]): Request[DescribeCapacityReservationsResult, AWSError] = js.native
  /**
    * Describes one or more of your Capacity Reservations. The results describe only the Capacity Reservations in the AWS Region that you're currently using.
    */
  def describeCapacityReservations(params: DescribeCapacityReservationsRequest): Request[DescribeCapacityReservationsResult, AWSError] = js.native
  def describeCapacityReservations(
    params: DescribeCapacityReservationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCapacityReservationsResult, Unit]
  ): Request[DescribeCapacityReservationsResult, AWSError] = js.native
  /**
    * Describes one or more of your linked EC2-Classic instances. This request only returns information about EC2-Classic instances linked to a VPC through ClassicLink. You cannot use this request to return information about other instances.
    */
  def describeClassicLinkInstances(): Request[DescribeClassicLinkInstancesResult, AWSError] = js.native
  def describeClassicLinkInstances(callback: js.Function2[/* err */ AWSError, /* data */ DescribeClassicLinkInstancesResult, Unit]): Request[DescribeClassicLinkInstancesResult, AWSError] = js.native
  /**
    * Describes one or more of your linked EC2-Classic instances. This request only returns information about EC2-Classic instances linked to a VPC through ClassicLink. You cannot use this request to return information about other instances.
    */
  def describeClassicLinkInstances(params: DescribeClassicLinkInstancesRequest): Request[DescribeClassicLinkInstancesResult, AWSError] = js.native
  def describeClassicLinkInstances(
    params: DescribeClassicLinkInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeClassicLinkInstancesResult, Unit]
  ): Request[DescribeClassicLinkInstancesResult, AWSError] = js.native
  /**
    * Describes the authorization rules for a specified Client VPN endpoint.
    */
  def describeClientVpnAuthorizationRules(): Request[DescribeClientVpnAuthorizationRulesResult, AWSError] = js.native
  def describeClientVpnAuthorizationRules(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeClientVpnAuthorizationRulesResult, Unit]
  ): Request[DescribeClientVpnAuthorizationRulesResult, AWSError] = js.native
  /**
    * Describes the authorization rules for a specified Client VPN endpoint.
    */
  def describeClientVpnAuthorizationRules(params: DescribeClientVpnAuthorizationRulesRequest): Request[DescribeClientVpnAuthorizationRulesResult, AWSError] = js.native
  def describeClientVpnAuthorizationRules(
    params: DescribeClientVpnAuthorizationRulesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeClientVpnAuthorizationRulesResult, Unit]
  ): Request[DescribeClientVpnAuthorizationRulesResult, AWSError] = js.native
  /**
    * Describes active client connections and connections that have been terminated within the last 60 minutes for the specified Client VPN endpoint.
    */
  def describeClientVpnConnections(): Request[DescribeClientVpnConnectionsResult, AWSError] = js.native
  def describeClientVpnConnections(callback: js.Function2[/* err */ AWSError, /* data */ DescribeClientVpnConnectionsResult, Unit]): Request[DescribeClientVpnConnectionsResult, AWSError] = js.native
  /**
    * Describes active client connections and connections that have been terminated within the last 60 minutes for the specified Client VPN endpoint.
    */
  def describeClientVpnConnections(params: DescribeClientVpnConnectionsRequest): Request[DescribeClientVpnConnectionsResult, AWSError] = js.native
  def describeClientVpnConnections(
    params: DescribeClientVpnConnectionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeClientVpnConnectionsResult, Unit]
  ): Request[DescribeClientVpnConnectionsResult, AWSError] = js.native
  /**
    * Describes one or more Client VPN endpoints in the account.
    */
  def describeClientVpnEndpoints(): Request[DescribeClientVpnEndpointsResult, AWSError] = js.native
  def describeClientVpnEndpoints(callback: js.Function2[/* err */ AWSError, /* data */ DescribeClientVpnEndpointsResult, Unit]): Request[DescribeClientVpnEndpointsResult, AWSError] = js.native
  /**
    * Describes one or more Client VPN endpoints in the account.
    */
  def describeClientVpnEndpoints(params: DescribeClientVpnEndpointsRequest): Request[DescribeClientVpnEndpointsResult, AWSError] = js.native
  def describeClientVpnEndpoints(
    params: DescribeClientVpnEndpointsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeClientVpnEndpointsResult, Unit]
  ): Request[DescribeClientVpnEndpointsResult, AWSError] = js.native
  /**
    * Describes the routes for the specified Client VPN endpoint.
    */
  def describeClientVpnRoutes(): Request[DescribeClientVpnRoutesResult, AWSError] = js.native
  def describeClientVpnRoutes(callback: js.Function2[/* err */ AWSError, /* data */ DescribeClientVpnRoutesResult, Unit]): Request[DescribeClientVpnRoutesResult, AWSError] = js.native
  /**
    * Describes the routes for the specified Client VPN endpoint.
    */
  def describeClientVpnRoutes(params: DescribeClientVpnRoutesRequest): Request[DescribeClientVpnRoutesResult, AWSError] = js.native
  def describeClientVpnRoutes(
    params: DescribeClientVpnRoutesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeClientVpnRoutesResult, Unit]
  ): Request[DescribeClientVpnRoutesResult, AWSError] = js.native
  /**
    * Describes the target networks associated with the specified Client VPN endpoint.
    */
  def describeClientVpnTargetNetworks(): Request[DescribeClientVpnTargetNetworksResult, AWSError] = js.native
  def describeClientVpnTargetNetworks(callback: js.Function2[/* err */ AWSError, /* data */ DescribeClientVpnTargetNetworksResult, Unit]): Request[DescribeClientVpnTargetNetworksResult, AWSError] = js.native
  /**
    * Describes the target networks associated with the specified Client VPN endpoint.
    */
  def describeClientVpnTargetNetworks(params: DescribeClientVpnTargetNetworksRequest): Request[DescribeClientVpnTargetNetworksResult, AWSError] = js.native
  def describeClientVpnTargetNetworks(
    params: DescribeClientVpnTargetNetworksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeClientVpnTargetNetworksResult, Unit]
  ): Request[DescribeClientVpnTargetNetworksResult, AWSError] = js.native
  /**
    * Describes the specified customer-owned address pools or all of your customer-owned address pools.
    */
  def describeCoipPools(): Request[DescribeCoipPoolsResult, AWSError] = js.native
  def describeCoipPools(callback: js.Function2[/* err */ AWSError, /* data */ DescribeCoipPoolsResult, Unit]): Request[DescribeCoipPoolsResult, AWSError] = js.native
  /**
    * Describes the specified customer-owned address pools or all of your customer-owned address pools.
    */
  def describeCoipPools(params: DescribeCoipPoolsRequest): Request[DescribeCoipPoolsResult, AWSError] = js.native
  def describeCoipPools(
    params: DescribeCoipPoolsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCoipPoolsResult, Unit]
  ): Request[DescribeCoipPoolsResult, AWSError] = js.native
  /**
    * Describes the specified conversion tasks or all your conversion tasks. For more information, see the VM Import/Export User Guide. For information about the import manifest referenced by this API action, see VM Import Manifest.
    */
  def describeConversionTasks(): Request[DescribeConversionTasksResult, AWSError] = js.native
  def describeConversionTasks(callback: js.Function2[/* err */ AWSError, /* data */ DescribeConversionTasksResult, Unit]): Request[DescribeConversionTasksResult, AWSError] = js.native
  /**
    * Describes the specified conversion tasks or all your conversion tasks. For more information, see the VM Import/Export User Guide. For information about the import manifest referenced by this API action, see VM Import Manifest.
    */
  def describeConversionTasks(params: DescribeConversionTasksRequest): Request[DescribeConversionTasksResult, AWSError] = js.native
  def describeConversionTasks(
    params: DescribeConversionTasksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConversionTasksResult, Unit]
  ): Request[DescribeConversionTasksResult, AWSError] = js.native
  /**
    * Describes one or more of your VPN customer gateways. For more information, see AWS Site-to-Site VPN in the AWS Site-to-Site VPN User Guide.
    */
  def describeCustomerGateways(): Request[DescribeCustomerGatewaysResult, AWSError] = js.native
  def describeCustomerGateways(callback: js.Function2[/* err */ AWSError, /* data */ DescribeCustomerGatewaysResult, Unit]): Request[DescribeCustomerGatewaysResult, AWSError] = js.native
  /**
    * Describes one or more of your VPN customer gateways. For more information, see AWS Site-to-Site VPN in the AWS Site-to-Site VPN User Guide.
    */
  def describeCustomerGateways(params: DescribeCustomerGatewaysRequest): Request[DescribeCustomerGatewaysResult, AWSError] = js.native
  def describeCustomerGateways(
    params: DescribeCustomerGatewaysRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCustomerGatewaysResult, Unit]
  ): Request[DescribeCustomerGatewaysResult, AWSError] = js.native
  /**
    * Describes one or more of your DHCP options sets. For more information, see DHCP Options Sets in the Amazon Virtual Private Cloud User Guide.
    */
  def describeDhcpOptions(): Request[DescribeDhcpOptionsResult, AWSError] = js.native
  def describeDhcpOptions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDhcpOptionsResult, Unit]): Request[DescribeDhcpOptionsResult, AWSError] = js.native
  /**
    * Describes one or more of your DHCP options sets. For more information, see DHCP Options Sets in the Amazon Virtual Private Cloud User Guide.
    */
  def describeDhcpOptions(params: DescribeDhcpOptionsRequest): Request[DescribeDhcpOptionsResult, AWSError] = js.native
  def describeDhcpOptions(
    params: DescribeDhcpOptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDhcpOptionsResult, Unit]
  ): Request[DescribeDhcpOptionsResult, AWSError] = js.native
  /**
    * Describes one or more of your egress-only internet gateways.
    */
  def describeEgressOnlyInternetGateways(): Request[DescribeEgressOnlyInternetGatewaysResult, AWSError] = js.native
  def describeEgressOnlyInternetGateways(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEgressOnlyInternetGatewaysResult, Unit]
  ): Request[DescribeEgressOnlyInternetGatewaysResult, AWSError] = js.native
  /**
    * Describes one or more of your egress-only internet gateways.
    */
  def describeEgressOnlyInternetGateways(params: DescribeEgressOnlyInternetGatewaysRequest): Request[DescribeEgressOnlyInternetGatewaysResult, AWSError] = js.native
  def describeEgressOnlyInternetGateways(
    params: DescribeEgressOnlyInternetGatewaysRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEgressOnlyInternetGatewaysResult, Unit]
  ): Request[DescribeEgressOnlyInternetGatewaysResult, AWSError] = js.native
  /**
    * Describes the Elastic Graphics accelerator associated with your instances. For more information about Elastic Graphics, see Amazon Elastic Graphics.
    */
  def describeElasticGpus(): Request[DescribeElasticGpusResult, AWSError] = js.native
  def describeElasticGpus(callback: js.Function2[/* err */ AWSError, /* data */ DescribeElasticGpusResult, Unit]): Request[DescribeElasticGpusResult, AWSError] = js.native
  /**
    * Describes the Elastic Graphics accelerator associated with your instances. For more information about Elastic Graphics, see Amazon Elastic Graphics.
    */
  def describeElasticGpus(params: DescribeElasticGpusRequest): Request[DescribeElasticGpusResult, AWSError] = js.native
  def describeElasticGpus(
    params: DescribeElasticGpusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeElasticGpusResult, Unit]
  ): Request[DescribeElasticGpusResult, AWSError] = js.native
  /**
    * Describes the specified export image tasks or all your export image tasks.
    */
  def describeExportImageTasks(): Request[DescribeExportImageTasksResult, AWSError] = js.native
  def describeExportImageTasks(callback: js.Function2[/* err */ AWSError, /* data */ DescribeExportImageTasksResult, Unit]): Request[DescribeExportImageTasksResult, AWSError] = js.native
  /**
    * Describes the specified export image tasks or all your export image tasks.
    */
  def describeExportImageTasks(params: DescribeExportImageTasksRequest): Request[DescribeExportImageTasksResult, AWSError] = js.native
  def describeExportImageTasks(
    params: DescribeExportImageTasksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeExportImageTasksResult, Unit]
  ): Request[DescribeExportImageTasksResult, AWSError] = js.native
  /**
    * Describes the specified export instance tasks or all your export instance tasks.
    */
  def describeExportTasks(): Request[DescribeExportTasksResult, AWSError] = js.native
  def describeExportTasks(callback: js.Function2[/* err */ AWSError, /* data */ DescribeExportTasksResult, Unit]): Request[DescribeExportTasksResult, AWSError] = js.native
  /**
    * Describes the specified export instance tasks or all your export instance tasks.
    */
  def describeExportTasks(params: DescribeExportTasksRequest): Request[DescribeExportTasksResult, AWSError] = js.native
  def describeExportTasks(
    params: DescribeExportTasksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeExportTasksResult, Unit]
  ): Request[DescribeExportTasksResult, AWSError] = js.native
  /**
    * Describes the state of fast snapshot restores for your snapshots.
    */
  def describeFastSnapshotRestores(): Request[DescribeFastSnapshotRestoresResult, AWSError] = js.native
  def describeFastSnapshotRestores(callback: js.Function2[/* err */ AWSError, /* data */ DescribeFastSnapshotRestoresResult, Unit]): Request[DescribeFastSnapshotRestoresResult, AWSError] = js.native
  /**
    * Describes the state of fast snapshot restores for your snapshots.
    */
  def describeFastSnapshotRestores(params: DescribeFastSnapshotRestoresRequest): Request[DescribeFastSnapshotRestoresResult, AWSError] = js.native
  def describeFastSnapshotRestores(
    params: DescribeFastSnapshotRestoresRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFastSnapshotRestoresResult, Unit]
  ): Request[DescribeFastSnapshotRestoresResult, AWSError] = js.native
  /**
    * Describes the events for the specified EC2 Fleet during the specified time. EC2 Fleet events are delayed by up to 30 seconds before they can be described. This ensures that you can query by the last evaluated time and not miss a recorded event. EC2 Fleet events are available for 48 hours.
    */
  def describeFleetHistory(): Request[DescribeFleetHistoryResult, AWSError] = js.native
  def describeFleetHistory(callback: js.Function2[/* err */ AWSError, /* data */ DescribeFleetHistoryResult, Unit]): Request[DescribeFleetHistoryResult, AWSError] = js.native
  /**
    * Describes the events for the specified EC2 Fleet during the specified time. EC2 Fleet events are delayed by up to 30 seconds before they can be described. This ensures that you can query by the last evaluated time and not miss a recorded event. EC2 Fleet events are available for 48 hours.
    */
  def describeFleetHistory(params: DescribeFleetHistoryRequest): Request[DescribeFleetHistoryResult, AWSError] = js.native
  def describeFleetHistory(
    params: DescribeFleetHistoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFleetHistoryResult, Unit]
  ): Request[DescribeFleetHistoryResult, AWSError] = js.native
  /**
    * Describes the running instances for the specified EC2 Fleet.
    */
  def describeFleetInstances(): Request[DescribeFleetInstancesResult, AWSError] = js.native
  def describeFleetInstances(callback: js.Function2[/* err */ AWSError, /* data */ DescribeFleetInstancesResult, Unit]): Request[DescribeFleetInstancesResult, AWSError] = js.native
  /**
    * Describes the running instances for the specified EC2 Fleet.
    */
  def describeFleetInstances(params: DescribeFleetInstancesRequest): Request[DescribeFleetInstancesResult, AWSError] = js.native
  def describeFleetInstances(
    params: DescribeFleetInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFleetInstancesResult, Unit]
  ): Request[DescribeFleetInstancesResult, AWSError] = js.native
  /**
    * Describes the specified EC2 Fleets or all of your EC2 Fleets.
    */
  def describeFleets(): Request[DescribeFleetsResult, AWSError] = js.native
  def describeFleets(callback: js.Function2[/* err */ AWSError, /* data */ DescribeFleetsResult, Unit]): Request[DescribeFleetsResult, AWSError] = js.native
  /**
    * Describes the specified EC2 Fleets or all of your EC2 Fleets.
    */
  def describeFleets(params: DescribeFleetsRequest): Request[DescribeFleetsResult, AWSError] = js.native
  def describeFleets(
    params: DescribeFleetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFleetsResult, Unit]
  ): Request[DescribeFleetsResult, AWSError] = js.native
  /**
    * Describes one or more flow logs. To view the information in your flow logs (the log streams for the network interfaces), you must use the CloudWatch Logs console or the CloudWatch Logs API.
    */
  def describeFlowLogs(): Request[DescribeFlowLogsResult, AWSError] = js.native
  def describeFlowLogs(callback: js.Function2[/* err */ AWSError, /* data */ DescribeFlowLogsResult, Unit]): Request[DescribeFlowLogsResult, AWSError] = js.native
  /**
    * Describes one or more flow logs. To view the information in your flow logs (the log streams for the network interfaces), you must use the CloudWatch Logs console or the CloudWatch Logs API.
    */
  def describeFlowLogs(params: DescribeFlowLogsRequest): Request[DescribeFlowLogsResult, AWSError] = js.native
  def describeFlowLogs(
    params: DescribeFlowLogsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFlowLogsResult, Unit]
  ): Request[DescribeFlowLogsResult, AWSError] = js.native
  /**
    * Describes the specified attribute of the specified Amazon FPGA Image (AFI).
    */
  def describeFpgaImageAttribute(): Request[DescribeFpgaImageAttributeResult, AWSError] = js.native
  def describeFpgaImageAttribute(callback: js.Function2[/* err */ AWSError, /* data */ DescribeFpgaImageAttributeResult, Unit]): Request[DescribeFpgaImageAttributeResult, AWSError] = js.native
  /**
    * Describes the specified attribute of the specified Amazon FPGA Image (AFI).
    */
  def describeFpgaImageAttribute(params: DescribeFpgaImageAttributeRequest): Request[DescribeFpgaImageAttributeResult, AWSError] = js.native
  def describeFpgaImageAttribute(
    params: DescribeFpgaImageAttributeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFpgaImageAttributeResult, Unit]
  ): Request[DescribeFpgaImageAttributeResult, AWSError] = js.native
  /**
    * Describes the Amazon FPGA Images (AFIs) available to you. These include public AFIs, private AFIs that you own, and AFIs owned by other AWS accounts for which you have load permissions.
    */
  def describeFpgaImages(): Request[DescribeFpgaImagesResult, AWSError] = js.native
  def describeFpgaImages(callback: js.Function2[/* err */ AWSError, /* data */ DescribeFpgaImagesResult, Unit]): Request[DescribeFpgaImagesResult, AWSError] = js.native
  /**
    * Describes the Amazon FPGA Images (AFIs) available to you. These include public AFIs, private AFIs that you own, and AFIs owned by other AWS accounts for which you have load permissions.
    */
  def describeFpgaImages(params: DescribeFpgaImagesRequest): Request[DescribeFpgaImagesResult, AWSError] = js.native
  def describeFpgaImages(
    params: DescribeFpgaImagesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFpgaImagesResult, Unit]
  ): Request[DescribeFpgaImagesResult, AWSError] = js.native
  /**
    * Describes the Dedicated Host reservations that are available to purchase. The results describe all of the Dedicated Host reservation offerings, including offerings that might not match the instance family and Region of your Dedicated Hosts. When purchasing an offering, ensure that the instance family and Region of the offering matches that of the Dedicated Hosts with which it is to be associated. For more information about supported instance types, see Dedicated Hosts Overview in the Amazon Elastic Compute Cloud User Guide. 
    */
  def describeHostReservationOfferings(): Request[DescribeHostReservationOfferingsResult, AWSError] = js.native
  def describeHostReservationOfferings(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeHostReservationOfferingsResult, Unit]
  ): Request[DescribeHostReservationOfferingsResult, AWSError] = js.native
  /**
    * Describes the Dedicated Host reservations that are available to purchase. The results describe all of the Dedicated Host reservation offerings, including offerings that might not match the instance family and Region of your Dedicated Hosts. When purchasing an offering, ensure that the instance family and Region of the offering matches that of the Dedicated Hosts with which it is to be associated. For more information about supported instance types, see Dedicated Hosts Overview in the Amazon Elastic Compute Cloud User Guide. 
    */
  def describeHostReservationOfferings(params: DescribeHostReservationOfferingsRequest): Request[DescribeHostReservationOfferingsResult, AWSError] = js.native
  def describeHostReservationOfferings(
    params: DescribeHostReservationOfferingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeHostReservationOfferingsResult, Unit]
  ): Request[DescribeHostReservationOfferingsResult, AWSError] = js.native
  /**
    * Describes reservations that are associated with Dedicated Hosts in your account.
    */
  def describeHostReservations(): Request[DescribeHostReservationsResult, AWSError] = js.native
  def describeHostReservations(callback: js.Function2[/* err */ AWSError, /* data */ DescribeHostReservationsResult, Unit]): Request[DescribeHostReservationsResult, AWSError] = js.native
  /**
    * Describes reservations that are associated with Dedicated Hosts in your account.
    */
  def describeHostReservations(params: DescribeHostReservationsRequest): Request[DescribeHostReservationsResult, AWSError] = js.native
  def describeHostReservations(
    params: DescribeHostReservationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeHostReservationsResult, Unit]
  ): Request[DescribeHostReservationsResult, AWSError] = js.native
  /**
    * Describes the specified Dedicated Hosts or all your Dedicated Hosts. The results describe only the Dedicated Hosts in the Region you're currently using. All listed instances consume capacity on your Dedicated Host. Dedicated Hosts that have recently been released are listed with the state released.
    */
  def describeHosts(): Request[DescribeHostsResult, AWSError] = js.native
  def describeHosts(callback: js.Function2[/* err */ AWSError, /* data */ DescribeHostsResult, Unit]): Request[DescribeHostsResult, AWSError] = js.native
  /**
    * Describes the specified Dedicated Hosts or all your Dedicated Hosts. The results describe only the Dedicated Hosts in the Region you're currently using. All listed instances consume capacity on your Dedicated Host. Dedicated Hosts that have recently been released are listed with the state released.
    */
  def describeHosts(params: DescribeHostsRequest): Request[DescribeHostsResult, AWSError] = js.native
  def describeHosts(
    params: DescribeHostsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeHostsResult, Unit]
  ): Request[DescribeHostsResult, AWSError] = js.native
  /**
    * Describes your IAM instance profile associations.
    */
  def describeIamInstanceProfileAssociations(): Request[DescribeIamInstanceProfileAssociationsResult, AWSError] = js.native
  def describeIamInstanceProfileAssociations(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeIamInstanceProfileAssociationsResult, Unit]
  ): Request[DescribeIamInstanceProfileAssociationsResult, AWSError] = js.native
  /**
    * Describes your IAM instance profile associations.
    */
  def describeIamInstanceProfileAssociations(params: DescribeIamInstanceProfileAssociationsRequest): Request[DescribeIamInstanceProfileAssociationsResult, AWSError] = js.native
  def describeIamInstanceProfileAssociations(
    params: DescribeIamInstanceProfileAssociationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeIamInstanceProfileAssociationsResult, Unit]
  ): Request[DescribeIamInstanceProfileAssociationsResult, AWSError] = js.native
  /**
    * Describes the ID format settings for your resources on a per-Region basis, for example, to view which resource types are enabled for longer IDs. This request only returns information about resource types whose ID formats can be modified; it does not return information about other resource types. The following resource types support longer IDs: bundle | conversion-task | customer-gateway | dhcp-options | elastic-ip-allocation | elastic-ip-association | export-task | flow-log | image | import-task | instance | internet-gateway | network-acl | network-acl-association | network-interface | network-interface-attachment | prefix-list | reservation | route-table | route-table-association | security-group | snapshot | subnet | subnet-cidr-block-association | volume | vpc | vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection | vpn-connection | vpn-gateway.  These settings apply to the IAM user who makes the request; they do not apply to the entire AWS account. By default, an IAM user defaults to the same settings as the root user, unless they explicitly override the settings by running the ModifyIdFormat command. Resources created with longer IDs are visible to all IAM users, regardless of these settings and provided that they have permission to use the relevant Describe command for the resource type.
    */
  def describeIdFormat(): Request[DescribeIdFormatResult, AWSError] = js.native
  def describeIdFormat(callback: js.Function2[/* err */ AWSError, /* data */ DescribeIdFormatResult, Unit]): Request[DescribeIdFormatResult, AWSError] = js.native
  /**
    * Describes the ID format settings for your resources on a per-Region basis, for example, to view which resource types are enabled for longer IDs. This request only returns information about resource types whose ID formats can be modified; it does not return information about other resource types. The following resource types support longer IDs: bundle | conversion-task | customer-gateway | dhcp-options | elastic-ip-allocation | elastic-ip-association | export-task | flow-log | image | import-task | instance | internet-gateway | network-acl | network-acl-association | network-interface | network-interface-attachment | prefix-list | reservation | route-table | route-table-association | security-group | snapshot | subnet | subnet-cidr-block-association | volume | vpc | vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection | vpn-connection | vpn-gateway.  These settings apply to the IAM user who makes the request; they do not apply to the entire AWS account. By default, an IAM user defaults to the same settings as the root user, unless they explicitly override the settings by running the ModifyIdFormat command. Resources created with longer IDs are visible to all IAM users, regardless of these settings and provided that they have permission to use the relevant Describe command for the resource type.
    */
  def describeIdFormat(params: DescribeIdFormatRequest): Request[DescribeIdFormatResult, AWSError] = js.native
  def describeIdFormat(
    params: DescribeIdFormatRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeIdFormatResult, Unit]
  ): Request[DescribeIdFormatResult, AWSError] = js.native
  /**
    * Describes the ID format settings for resources for the specified IAM user, IAM role, or root user. For example, you can view the resource types that are enabled for longer IDs. This request only returns information about resource types whose ID formats can be modified; it does not return information about other resource types. For more information, see Resource IDs in the Amazon Elastic Compute Cloud User Guide.  The following resource types support longer IDs: bundle | conversion-task | customer-gateway | dhcp-options | elastic-ip-allocation | elastic-ip-association | export-task | flow-log | image | import-task | instance | internet-gateway | network-acl | network-acl-association | network-interface | network-interface-attachment | prefix-list | reservation | route-table | route-table-association | security-group | snapshot | subnet | subnet-cidr-block-association | volume | vpc | vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection | vpn-connection | vpn-gateway.  These settings apply to the principal specified in the request. They do not apply to the principal that makes the request.
    */
  def describeIdentityIdFormat(): Request[DescribeIdentityIdFormatResult, AWSError] = js.native
  def describeIdentityIdFormat(callback: js.Function2[/* err */ AWSError, /* data */ DescribeIdentityIdFormatResult, Unit]): Request[DescribeIdentityIdFormatResult, AWSError] = js.native
  /**
    * Describes the ID format settings for resources for the specified IAM user, IAM role, or root user. For example, you can view the resource types that are enabled for longer IDs. This request only returns information about resource types whose ID formats can be modified; it does not return information about other resource types. For more information, see Resource IDs in the Amazon Elastic Compute Cloud User Guide.  The following resource types support longer IDs: bundle | conversion-task | customer-gateway | dhcp-options | elastic-ip-allocation | elastic-ip-association | export-task | flow-log | image | import-task | instance | internet-gateway | network-acl | network-acl-association | network-interface | network-interface-attachment | prefix-list | reservation | route-table | route-table-association | security-group | snapshot | subnet | subnet-cidr-block-association | volume | vpc | vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection | vpn-connection | vpn-gateway.  These settings apply to the principal specified in the request. They do not apply to the principal that makes the request.
    */
  def describeIdentityIdFormat(params: DescribeIdentityIdFormatRequest): Request[DescribeIdentityIdFormatResult, AWSError] = js.native
  def describeIdentityIdFormat(
    params: DescribeIdentityIdFormatRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeIdentityIdFormatResult, Unit]
  ): Request[DescribeIdentityIdFormatResult, AWSError] = js.native
  /**
    * Describes the specified attribute of the specified AMI. You can specify only one attribute at a time.
    */
  def describeImageAttribute(): Request[ImageAttribute, AWSError] = js.native
  def describeImageAttribute(callback: js.Function2[/* err */ AWSError, /* data */ ImageAttribute, Unit]): Request[ImageAttribute, AWSError] = js.native
  /**
    * Describes the specified attribute of the specified AMI. You can specify only one attribute at a time.
    */
  def describeImageAttribute(params: DescribeImageAttributeRequest): Request[ImageAttribute, AWSError] = js.native
  def describeImageAttribute(
    params: DescribeImageAttributeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ImageAttribute, Unit]
  ): Request[ImageAttribute, AWSError] = js.native
  /**
    * Describes the specified images (AMIs, AKIs, and ARIs) available to you or all of the images available to you. The images available to you include public images, private images that you own, and private images owned by other AWS accounts for which you have explicit launch permissions. Recently deregistered images appear in the returned results for a short interval and then return empty results. After all instances that reference a deregistered AMI are terminated, specifying the ID of the image results in an error indicating that the AMI ID cannot be found.
    */
  def describeImages(): Request[DescribeImagesResult, AWSError] = js.native
  def describeImages(callback: js.Function2[/* err */ AWSError, /* data */ DescribeImagesResult, Unit]): Request[DescribeImagesResult, AWSError] = js.native
  /**
    * Describes the specified images (AMIs, AKIs, and ARIs) available to you or all of the images available to you. The images available to you include public images, private images that you own, and private images owned by other AWS accounts for which you have explicit launch permissions. Recently deregistered images appear in the returned results for a short interval and then return empty results. After all instances that reference a deregistered AMI are terminated, specifying the ID of the image results in an error indicating that the AMI ID cannot be found.
    */
  def describeImages(params: DescribeImagesRequest): Request[DescribeImagesResult, AWSError] = js.native
  def describeImages(
    params: DescribeImagesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeImagesResult, Unit]
  ): Request[DescribeImagesResult, AWSError] = js.native
  /**
    * Displays details about an import virtual machine or import snapshot tasks that are already created.
    */
  def describeImportImageTasks(): Request[DescribeImportImageTasksResult, AWSError] = js.native
  def describeImportImageTasks(callback: js.Function2[/* err */ AWSError, /* data */ DescribeImportImageTasksResult, Unit]): Request[DescribeImportImageTasksResult, AWSError] = js.native
  /**
    * Displays details about an import virtual machine or import snapshot tasks that are already created.
    */
  def describeImportImageTasks(params: DescribeImportImageTasksRequest): Request[DescribeImportImageTasksResult, AWSError] = js.native
  def describeImportImageTasks(
    params: DescribeImportImageTasksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeImportImageTasksResult, Unit]
  ): Request[DescribeImportImageTasksResult, AWSError] = js.native
  /**
    * Describes your import snapshot tasks.
    */
  def describeImportSnapshotTasks(): Request[DescribeImportSnapshotTasksResult, AWSError] = js.native
  def describeImportSnapshotTasks(callback: js.Function2[/* err */ AWSError, /* data */ DescribeImportSnapshotTasksResult, Unit]): Request[DescribeImportSnapshotTasksResult, AWSError] = js.native
  /**
    * Describes your import snapshot tasks.
    */
  def describeImportSnapshotTasks(params: DescribeImportSnapshotTasksRequest): Request[DescribeImportSnapshotTasksResult, AWSError] = js.native
  def describeImportSnapshotTasks(
    params: DescribeImportSnapshotTasksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeImportSnapshotTasksResult, Unit]
  ): Request[DescribeImportSnapshotTasksResult, AWSError] = js.native
  /**
    * Describes the specified attribute of the specified instance. You can specify only one attribute at a time. Valid attribute values are: instanceType | kernel | ramdisk | userData | disableApiTermination | instanceInitiatedShutdownBehavior | rootDeviceName | blockDeviceMapping | productCodes | sourceDestCheck | groupSet | ebsOptimized | sriovNetSupport 
    */
  def describeInstanceAttribute(): Request[InstanceAttribute, AWSError] = js.native
  def describeInstanceAttribute(callback: js.Function2[/* err */ AWSError, /* data */ InstanceAttribute, Unit]): Request[InstanceAttribute, AWSError] = js.native
  /**
    * Describes the specified attribute of the specified instance. You can specify only one attribute at a time. Valid attribute values are: instanceType | kernel | ramdisk | userData | disableApiTermination | instanceInitiatedShutdownBehavior | rootDeviceName | blockDeviceMapping | productCodes | sourceDestCheck | groupSet | ebsOptimized | sriovNetSupport 
    */
  def describeInstanceAttribute(params: DescribeInstanceAttributeRequest): Request[InstanceAttribute, AWSError] = js.native
  def describeInstanceAttribute(
    params: DescribeInstanceAttributeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ InstanceAttribute, Unit]
  ): Request[InstanceAttribute, AWSError] = js.native
  /**
    * Describes the credit option for CPU usage of the specified burstable performance instances. The credit options are standard and unlimited. If you do not specify an instance ID, Amazon EC2 returns burstable performance instances with the unlimited credit option, as well as instances that were previously configured as T2, T3, and T3a with the unlimited credit option. For example, if you resize a T2 instance, while it is configured as unlimited, to an M4 instance, Amazon EC2 returns the M4 instance. If you specify one or more instance IDs, Amazon EC2 returns the credit option (standard or unlimited) of those instances. If you specify an instance ID that is not valid, such as an instance that is not a burstable performance instance, an error is returned. Recently terminated instances might appear in the returned results. This interval is usually less than one hour. If an Availability Zone is experiencing a service disruption and you specify instance IDs in the affected zone, or do not specify any instance IDs at all, the call fails. If you specify only instance IDs in an unaffected zone, the call works normally. For more information, see Burstable Performance Instances in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeInstanceCreditSpecifications(): Request[DescribeInstanceCreditSpecificationsResult, AWSError] = js.native
  def describeInstanceCreditSpecifications(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstanceCreditSpecificationsResult, Unit]
  ): Request[DescribeInstanceCreditSpecificationsResult, AWSError] = js.native
  /**
    * Describes the credit option for CPU usage of the specified burstable performance instances. The credit options are standard and unlimited. If you do not specify an instance ID, Amazon EC2 returns burstable performance instances with the unlimited credit option, as well as instances that were previously configured as T2, T3, and T3a with the unlimited credit option. For example, if you resize a T2 instance, while it is configured as unlimited, to an M4 instance, Amazon EC2 returns the M4 instance. If you specify one or more instance IDs, Amazon EC2 returns the credit option (standard or unlimited) of those instances. If you specify an instance ID that is not valid, such as an instance that is not a burstable performance instance, an error is returned. Recently terminated instances might appear in the returned results. This interval is usually less than one hour. If an Availability Zone is experiencing a service disruption and you specify instance IDs in the affected zone, or do not specify any instance IDs at all, the call fails. If you specify only instance IDs in an unaffected zone, the call works normally. For more information, see Burstable Performance Instances in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeInstanceCreditSpecifications(params: DescribeInstanceCreditSpecificationsRequest): Request[DescribeInstanceCreditSpecificationsResult, AWSError] = js.native
  def describeInstanceCreditSpecifications(
    params: DescribeInstanceCreditSpecificationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstanceCreditSpecificationsResult, Unit]
  ): Request[DescribeInstanceCreditSpecificationsResult, AWSError] = js.native
  /**
    * Describes the status of the specified instances or all of your instances. By default, only running instances are described, unless you specifically indicate to return the status of all instances. Instance status includes the following components:    Status checks - Amazon EC2 performs status checks on running EC2 instances to identify hardware and software issues. For more information, see Status Checks for Your Instances and Troubleshooting Instances with Failed Status Checks in the Amazon Elastic Compute Cloud User Guide.    Scheduled events - Amazon EC2 can schedule events (such as reboot, stop, or terminate) for your instances related to hardware issues, software updates, or system maintenance. For more information, see Scheduled Events for Your Instances in the Amazon Elastic Compute Cloud User Guide.    Instance state - You can manage your instances from the moment you launch them through their termination. For more information, see Instance Lifecycle in the Amazon Elastic Compute Cloud User Guide.  
    */
  def describeInstanceStatus(): Request[DescribeInstanceStatusResult, AWSError] = js.native
  def describeInstanceStatus(callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstanceStatusResult, Unit]): Request[DescribeInstanceStatusResult, AWSError] = js.native
  /**
    * Describes the status of the specified instances or all of your instances. By default, only running instances are described, unless you specifically indicate to return the status of all instances. Instance status includes the following components:    Status checks - Amazon EC2 performs status checks on running EC2 instances to identify hardware and software issues. For more information, see Status Checks for Your Instances and Troubleshooting Instances with Failed Status Checks in the Amazon Elastic Compute Cloud User Guide.    Scheduled events - Amazon EC2 can schedule events (such as reboot, stop, or terminate) for your instances related to hardware issues, software updates, or system maintenance. For more information, see Scheduled Events for Your Instances in the Amazon Elastic Compute Cloud User Guide.    Instance state - You can manage your instances from the moment you launch them through their termination. For more information, see Instance Lifecycle in the Amazon Elastic Compute Cloud User Guide.  
    */
  def describeInstanceStatus(params: DescribeInstanceStatusRequest): Request[DescribeInstanceStatusResult, AWSError] = js.native
  def describeInstanceStatus(
    params: DescribeInstanceStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstanceStatusResult, Unit]
  ): Request[DescribeInstanceStatusResult, AWSError] = js.native
  /**
    * Returns a list of all instance types offered. The results can be filtered by location (Region or Availability Zone). If no location is specified, the instance types offered in the current Region are returned.
    */
  def describeInstanceTypeOfferings(): Request[DescribeInstanceTypeOfferingsResult, AWSError] = js.native
  def describeInstanceTypeOfferings(callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstanceTypeOfferingsResult, Unit]): Request[DescribeInstanceTypeOfferingsResult, AWSError] = js.native
  /**
    * Returns a list of all instance types offered. The results can be filtered by location (Region or Availability Zone). If no location is specified, the instance types offered in the current Region are returned.
    */
  def describeInstanceTypeOfferings(params: DescribeInstanceTypeOfferingsRequest): Request[DescribeInstanceTypeOfferingsResult, AWSError] = js.native
  def describeInstanceTypeOfferings(
    params: DescribeInstanceTypeOfferingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstanceTypeOfferingsResult, Unit]
  ): Request[DescribeInstanceTypeOfferingsResult, AWSError] = js.native
  /**
    * Returns a list of all instance types offered in your current AWS Region. The results can be filtered by the attributes of the instance types.
    */
  def describeInstanceTypes(): Request[DescribeInstanceTypesResult, AWSError] = js.native
  def describeInstanceTypes(callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstanceTypesResult, Unit]): Request[DescribeInstanceTypesResult, AWSError] = js.native
  /**
    * Returns a list of all instance types offered in your current AWS Region. The results can be filtered by the attributes of the instance types.
    */
  def describeInstanceTypes(params: DescribeInstanceTypesRequest): Request[DescribeInstanceTypesResult, AWSError] = js.native
  def describeInstanceTypes(
    params: DescribeInstanceTypesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstanceTypesResult, Unit]
  ): Request[DescribeInstanceTypesResult, AWSError] = js.native
  /**
    * Describes the specified instances or all of AWS account's instances. If you specify one or more instance IDs, Amazon EC2 returns information for those instances. If you do not specify instance IDs, Amazon EC2 returns information for all relevant instances. If you specify an instance ID that is not valid, an error is returned. If you specify an instance that you do not own, it is not included in the returned results. Recently terminated instances might appear in the returned results. This interval is usually less than one hour. If you describe instances in the rare case where an Availability Zone is experiencing a service disruption and you specify instance IDs that are in the affected zone, or do not specify any instance IDs at all, the call fails. If you describe instances and specify only instance IDs that are in an unaffected zone, the call works normally.
    */
  def describeInstances(): Request[DescribeInstancesResult, AWSError] = js.native
  def describeInstances(callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstancesResult, Unit]): Request[DescribeInstancesResult, AWSError] = js.native
  /**
    * Describes the specified instances or all of AWS account's instances. If you specify one or more instance IDs, Amazon EC2 returns information for those instances. If you do not specify instance IDs, Amazon EC2 returns information for all relevant instances. If you specify an instance ID that is not valid, an error is returned. If you specify an instance that you do not own, it is not included in the returned results. Recently terminated instances might appear in the returned results. This interval is usually less than one hour. If you describe instances in the rare case where an Availability Zone is experiencing a service disruption and you specify instance IDs that are in the affected zone, or do not specify any instance IDs at all, the call fails. If you describe instances and specify only instance IDs that are in an unaffected zone, the call works normally.
    */
  def describeInstances(params: DescribeInstancesRequest): Request[DescribeInstancesResult, AWSError] = js.native
  def describeInstances(
    params: DescribeInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstancesResult, Unit]
  ): Request[DescribeInstancesResult, AWSError] = js.native
  /**
    * Describes one or more of your internet gateways.
    */
  def describeInternetGateways(): Request[DescribeInternetGatewaysResult, AWSError] = js.native
  def describeInternetGateways(callback: js.Function2[/* err */ AWSError, /* data */ DescribeInternetGatewaysResult, Unit]): Request[DescribeInternetGatewaysResult, AWSError] = js.native
  /**
    * Describes one or more of your internet gateways.
    */
  def describeInternetGateways(params: DescribeInternetGatewaysRequest): Request[DescribeInternetGatewaysResult, AWSError] = js.native
  def describeInternetGateways(
    params: DescribeInternetGatewaysRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInternetGatewaysResult, Unit]
  ): Request[DescribeInternetGatewaysResult, AWSError] = js.native
  /**
    * Describes the specified key pairs or all of your key pairs. For more information about key pairs, see Key Pairs in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeKeyPairs(): Request[DescribeKeyPairsResult, AWSError] = js.native
  def describeKeyPairs(callback: js.Function2[/* err */ AWSError, /* data */ DescribeKeyPairsResult, Unit]): Request[DescribeKeyPairsResult, AWSError] = js.native
  /**
    * Describes the specified key pairs or all of your key pairs. For more information about key pairs, see Key Pairs in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeKeyPairs(params: DescribeKeyPairsRequest): Request[DescribeKeyPairsResult, AWSError] = js.native
  def describeKeyPairs(
    params: DescribeKeyPairsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeKeyPairsResult, Unit]
  ): Request[DescribeKeyPairsResult, AWSError] = js.native
  /**
    * Describes one or more versions of a specified launch template. You can describe all versions, individual versions, or a range of versions.
    */
  def describeLaunchTemplateVersions(): Request[DescribeLaunchTemplateVersionsResult, AWSError] = js.native
  def describeLaunchTemplateVersions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLaunchTemplateVersionsResult, Unit]): Request[DescribeLaunchTemplateVersionsResult, AWSError] = js.native
  /**
    * Describes one or more versions of a specified launch template. You can describe all versions, individual versions, or a range of versions.
    */
  def describeLaunchTemplateVersions(params: DescribeLaunchTemplateVersionsRequest): Request[DescribeLaunchTemplateVersionsResult, AWSError] = js.native
  def describeLaunchTemplateVersions(
    params: DescribeLaunchTemplateVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLaunchTemplateVersionsResult, Unit]
  ): Request[DescribeLaunchTemplateVersionsResult, AWSError] = js.native
  /**
    * Describes one or more launch templates.
    */
  def describeLaunchTemplates(): Request[DescribeLaunchTemplatesResult, AWSError] = js.native
  def describeLaunchTemplates(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLaunchTemplatesResult, Unit]): Request[DescribeLaunchTemplatesResult, AWSError] = js.native
  /**
    * Describes one or more launch templates.
    */
  def describeLaunchTemplates(params: DescribeLaunchTemplatesRequest): Request[DescribeLaunchTemplatesResult, AWSError] = js.native
  def describeLaunchTemplates(
    params: DescribeLaunchTemplatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLaunchTemplatesResult, Unit]
  ): Request[DescribeLaunchTemplatesResult, AWSError] = js.native
  /**
    * Describes the associations between virtual interface groups and local gateway route tables.
    */
  def describeLocalGatewayRouteTableVirtualInterfaceGroupAssociations(): Request[DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResult, AWSError] = js.native
  def describeLocalGatewayRouteTableVirtualInterfaceGroupAssociations(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResult, 
      Unit
    ]
  ): Request[DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResult, AWSError] = js.native
  /**
    * Describes the associations between virtual interface groups and local gateway route tables.
    */
  def describeLocalGatewayRouteTableVirtualInterfaceGroupAssociations(params: DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest): Request[DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResult, AWSError] = js.native
  def describeLocalGatewayRouteTableVirtualInterfaceGroupAssociations(
    params: DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResult, 
      Unit
    ]
  ): Request[DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResult, AWSError] = js.native
  /**
    * Describes the specified associations between VPCs and local gateway route tables.
    */
  def describeLocalGatewayRouteTableVpcAssociations(): Request[DescribeLocalGatewayRouteTableVpcAssociationsResult, AWSError] = js.native
  def describeLocalGatewayRouteTableVpcAssociations(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeLocalGatewayRouteTableVpcAssociationsResult, 
      Unit
    ]
  ): Request[DescribeLocalGatewayRouteTableVpcAssociationsResult, AWSError] = js.native
  /**
    * Describes the specified associations between VPCs and local gateway route tables.
    */
  def describeLocalGatewayRouteTableVpcAssociations(params: DescribeLocalGatewayRouteTableVpcAssociationsRequest): Request[DescribeLocalGatewayRouteTableVpcAssociationsResult, AWSError] = js.native
  def describeLocalGatewayRouteTableVpcAssociations(
    params: DescribeLocalGatewayRouteTableVpcAssociationsRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeLocalGatewayRouteTableVpcAssociationsResult, 
      Unit
    ]
  ): Request[DescribeLocalGatewayRouteTableVpcAssociationsResult, AWSError] = js.native
  /**
    * Describes one or more local gateway route tables. By default, all local gateway route tables are described. Alternatively, you can filter the results.
    */
  def describeLocalGatewayRouteTables(): Request[DescribeLocalGatewayRouteTablesResult, AWSError] = js.native
  def describeLocalGatewayRouteTables(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLocalGatewayRouteTablesResult, Unit]): Request[DescribeLocalGatewayRouteTablesResult, AWSError] = js.native
  /**
    * Describes one or more local gateway route tables. By default, all local gateway route tables are described. Alternatively, you can filter the results.
    */
  def describeLocalGatewayRouteTables(params: DescribeLocalGatewayRouteTablesRequest): Request[DescribeLocalGatewayRouteTablesResult, AWSError] = js.native
  def describeLocalGatewayRouteTables(
    params: DescribeLocalGatewayRouteTablesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLocalGatewayRouteTablesResult, Unit]
  ): Request[DescribeLocalGatewayRouteTablesResult, AWSError] = js.native
  /**
    * Describes the specified local gateway virtual interface groups.
    */
  def describeLocalGatewayVirtualInterfaceGroups(): Request[DescribeLocalGatewayVirtualInterfaceGroupsResult, AWSError] = js.native
  def describeLocalGatewayVirtualInterfaceGroups(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeLocalGatewayVirtualInterfaceGroupsResult, 
      Unit
    ]
  ): Request[DescribeLocalGatewayVirtualInterfaceGroupsResult, AWSError] = js.native
  /**
    * Describes the specified local gateway virtual interface groups.
    */
  def describeLocalGatewayVirtualInterfaceGroups(params: DescribeLocalGatewayVirtualInterfaceGroupsRequest): Request[DescribeLocalGatewayVirtualInterfaceGroupsResult, AWSError] = js.native
  def describeLocalGatewayVirtualInterfaceGroups(
    params: DescribeLocalGatewayVirtualInterfaceGroupsRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeLocalGatewayVirtualInterfaceGroupsResult, 
      Unit
    ]
  ): Request[DescribeLocalGatewayVirtualInterfaceGroupsResult, AWSError] = js.native
  /**
    * Describes the specified local gateway virtual interfaces.
    */
  def describeLocalGatewayVirtualInterfaces(): Request[DescribeLocalGatewayVirtualInterfacesResult, AWSError] = js.native
  def describeLocalGatewayVirtualInterfaces(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLocalGatewayVirtualInterfacesResult, Unit]
  ): Request[DescribeLocalGatewayVirtualInterfacesResult, AWSError] = js.native
  /**
    * Describes the specified local gateway virtual interfaces.
    */
  def describeLocalGatewayVirtualInterfaces(params: DescribeLocalGatewayVirtualInterfacesRequest): Request[DescribeLocalGatewayVirtualInterfacesResult, AWSError] = js.native
  def describeLocalGatewayVirtualInterfaces(
    params: DescribeLocalGatewayVirtualInterfacesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLocalGatewayVirtualInterfacesResult, Unit]
  ): Request[DescribeLocalGatewayVirtualInterfacesResult, AWSError] = js.native
  /**
    * Describes one or more local gateways. By default, all local gateways are described. Alternatively, you can filter the results.
    */
  def describeLocalGateways(): Request[DescribeLocalGatewaysResult, AWSError] = js.native
  def describeLocalGateways(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLocalGatewaysResult, Unit]): Request[DescribeLocalGatewaysResult, AWSError] = js.native
  /**
    * Describes one or more local gateways. By default, all local gateways are described. Alternatively, you can filter the results.
    */
  def describeLocalGateways(params: DescribeLocalGatewaysRequest): Request[DescribeLocalGatewaysResult, AWSError] = js.native
  def describeLocalGateways(
    params: DescribeLocalGatewaysRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLocalGatewaysResult, Unit]
  ): Request[DescribeLocalGatewaysResult, AWSError] = js.native
  /**
    * Describes your Elastic IP addresses that are being moved to the EC2-VPC platform, or that are being restored to the EC2-Classic platform. This request does not return information about any other Elastic IP addresses in your account.
    */
  def describeMovingAddresses(): Request[DescribeMovingAddressesResult, AWSError] = js.native
  def describeMovingAddresses(callback: js.Function2[/* err */ AWSError, /* data */ DescribeMovingAddressesResult, Unit]): Request[DescribeMovingAddressesResult, AWSError] = js.native
  /**
    * Describes your Elastic IP addresses that are being moved to the EC2-VPC platform, or that are being restored to the EC2-Classic platform. This request does not return information about any other Elastic IP addresses in your account.
    */
  def describeMovingAddresses(params: DescribeMovingAddressesRequest): Request[DescribeMovingAddressesResult, AWSError] = js.native
  def describeMovingAddresses(
    params: DescribeMovingAddressesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMovingAddressesResult, Unit]
  ): Request[DescribeMovingAddressesResult, AWSError] = js.native
  /**
    * Describes one or more of your NAT gateways.
    */
  def describeNatGateways(): Request[DescribeNatGatewaysResult, AWSError] = js.native
  def describeNatGateways(callback: js.Function2[/* err */ AWSError, /* data */ DescribeNatGatewaysResult, Unit]): Request[DescribeNatGatewaysResult, AWSError] = js.native
  /**
    * Describes one or more of your NAT gateways.
    */
  def describeNatGateways(params: DescribeNatGatewaysRequest): Request[DescribeNatGatewaysResult, AWSError] = js.native
  def describeNatGateways(
    params: DescribeNatGatewaysRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNatGatewaysResult, Unit]
  ): Request[DescribeNatGatewaysResult, AWSError] = js.native
  /**
    * Describes one or more of your network ACLs. For more information, see Network ACLs in the Amazon Virtual Private Cloud User Guide.
    */
  def describeNetworkAcls(): Request[DescribeNetworkAclsResult, AWSError] = js.native
  def describeNetworkAcls(callback: js.Function2[/* err */ AWSError, /* data */ DescribeNetworkAclsResult, Unit]): Request[DescribeNetworkAclsResult, AWSError] = js.native
  /**
    * Describes one or more of your network ACLs. For more information, see Network ACLs in the Amazon Virtual Private Cloud User Guide.
    */
  def describeNetworkAcls(params: DescribeNetworkAclsRequest): Request[DescribeNetworkAclsResult, AWSError] = js.native
  def describeNetworkAcls(
    params: DescribeNetworkAclsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNetworkAclsResult, Unit]
  ): Request[DescribeNetworkAclsResult, AWSError] = js.native
  /**
    * Describes a network interface attribute. You can specify only one attribute at a time.
    */
  def describeNetworkInterfaceAttribute(): Request[DescribeNetworkInterfaceAttributeResult, AWSError] = js.native
  def describeNetworkInterfaceAttribute(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNetworkInterfaceAttributeResult, Unit]
  ): Request[DescribeNetworkInterfaceAttributeResult, AWSError] = js.native
  /**
    * Describes a network interface attribute. You can specify only one attribute at a time.
    */
  def describeNetworkInterfaceAttribute(params: DescribeNetworkInterfaceAttributeRequest): Request[DescribeNetworkInterfaceAttributeResult, AWSError] = js.native
  def describeNetworkInterfaceAttribute(
    params: DescribeNetworkInterfaceAttributeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNetworkInterfaceAttributeResult, Unit]
  ): Request[DescribeNetworkInterfaceAttributeResult, AWSError] = js.native
  /**
    * Describes the permissions for your network interfaces. 
    */
  def describeNetworkInterfacePermissions(): Request[DescribeNetworkInterfacePermissionsResult, AWSError] = js.native
  def describeNetworkInterfacePermissions(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNetworkInterfacePermissionsResult, Unit]
  ): Request[DescribeNetworkInterfacePermissionsResult, AWSError] = js.native
  /**
    * Describes the permissions for your network interfaces. 
    */
  def describeNetworkInterfacePermissions(params: DescribeNetworkInterfacePermissionsRequest): Request[DescribeNetworkInterfacePermissionsResult, AWSError] = js.native
  def describeNetworkInterfacePermissions(
    params: DescribeNetworkInterfacePermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNetworkInterfacePermissionsResult, Unit]
  ): Request[DescribeNetworkInterfacePermissionsResult, AWSError] = js.native
  /**
    * Describes one or more of your network interfaces.
    */
  def describeNetworkInterfaces(): Request[DescribeNetworkInterfacesResult, AWSError] = js.native
  def describeNetworkInterfaces(callback: js.Function2[/* err */ AWSError, /* data */ DescribeNetworkInterfacesResult, Unit]): Request[DescribeNetworkInterfacesResult, AWSError] = js.native
  /**
    * Describes one or more of your network interfaces.
    */
  def describeNetworkInterfaces(params: DescribeNetworkInterfacesRequest): Request[DescribeNetworkInterfacesResult, AWSError] = js.native
  def describeNetworkInterfaces(
    params: DescribeNetworkInterfacesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNetworkInterfacesResult, Unit]
  ): Request[DescribeNetworkInterfacesResult, AWSError] = js.native
  /**
    * Describes the specified placement groups or all of your placement groups. For more information, see Placement Groups in the Amazon Elastic Compute Cloud User Guide.
    */
  def describePlacementGroups(): Request[DescribePlacementGroupsResult, AWSError] = js.native
  def describePlacementGroups(callback: js.Function2[/* err */ AWSError, /* data */ DescribePlacementGroupsResult, Unit]): Request[DescribePlacementGroupsResult, AWSError] = js.native
  /**
    * Describes the specified placement groups or all of your placement groups. For more information, see Placement Groups in the Amazon Elastic Compute Cloud User Guide.
    */
  def describePlacementGroups(params: DescribePlacementGroupsRequest): Request[DescribePlacementGroupsResult, AWSError] = js.native
  def describePlacementGroups(
    params: DescribePlacementGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePlacementGroupsResult, Unit]
  ): Request[DescribePlacementGroupsResult, AWSError] = js.native
  /**
    * Describes available AWS services in a prefix list format, which includes the prefix list name and prefix list ID of the service and the IP address range for the service. A prefix list ID is required for creating an outbound security group rule that allows traffic from a VPC to access an AWS service through a gateway VPC endpoint. Currently, the services that support this action are Amazon S3 and Amazon DynamoDB.
    */
  def describePrefixLists(): Request[DescribePrefixListsResult, AWSError] = js.native
  def describePrefixLists(callback: js.Function2[/* err */ AWSError, /* data */ DescribePrefixListsResult, Unit]): Request[DescribePrefixListsResult, AWSError] = js.native
  /**
    * Describes available AWS services in a prefix list format, which includes the prefix list name and prefix list ID of the service and the IP address range for the service. A prefix list ID is required for creating an outbound security group rule that allows traffic from a VPC to access an AWS service through a gateway VPC endpoint. Currently, the services that support this action are Amazon S3 and Amazon DynamoDB.
    */
  def describePrefixLists(params: DescribePrefixListsRequest): Request[DescribePrefixListsResult, AWSError] = js.native
  def describePrefixLists(
    params: DescribePrefixListsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePrefixListsResult, Unit]
  ): Request[DescribePrefixListsResult, AWSError] = js.native
  /**
    * Describes the ID format settings for the root user and all IAM roles and IAM users that have explicitly specified a longer ID (17-character ID) preference.  By default, all IAM roles and IAM users default to the same ID settings as the root user, unless they explicitly override the settings. This request is useful for identifying those IAM users and IAM roles that have overridden the default ID settings. The following resource types support longer IDs: bundle | conversion-task | customer-gateway | dhcp-options | elastic-ip-allocation | elastic-ip-association | export-task | flow-log | image | import-task | instance | internet-gateway | network-acl | network-acl-association | network-interface | network-interface-attachment | prefix-list | reservation | route-table | route-table-association | security-group | snapshot | subnet | subnet-cidr-block-association | volume | vpc | vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection | vpn-connection | vpn-gateway. 
    */
  def describePrincipalIdFormat(): Request[DescribePrincipalIdFormatResult, AWSError] = js.native
  def describePrincipalIdFormat(callback: js.Function2[/* err */ AWSError, /* data */ DescribePrincipalIdFormatResult, Unit]): Request[DescribePrincipalIdFormatResult, AWSError] = js.native
  /**
    * Describes the ID format settings for the root user and all IAM roles and IAM users that have explicitly specified a longer ID (17-character ID) preference.  By default, all IAM roles and IAM users default to the same ID settings as the root user, unless they explicitly override the settings. This request is useful for identifying those IAM users and IAM roles that have overridden the default ID settings. The following resource types support longer IDs: bundle | conversion-task | customer-gateway | dhcp-options | elastic-ip-allocation | elastic-ip-association | export-task | flow-log | image | import-task | instance | internet-gateway | network-acl | network-acl-association | network-interface | network-interface-attachment | prefix-list | reservation | route-table | route-table-association | security-group | snapshot | subnet | subnet-cidr-block-association | volume | vpc | vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection | vpn-connection | vpn-gateway. 
    */
  def describePrincipalIdFormat(params: DescribePrincipalIdFormatRequest): Request[DescribePrincipalIdFormatResult, AWSError] = js.native
  def describePrincipalIdFormat(
    params: DescribePrincipalIdFormatRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePrincipalIdFormatResult, Unit]
  ): Request[DescribePrincipalIdFormatResult, AWSError] = js.native
  /**
    * Describes the specified IPv4 address pools.
    */
  def describePublicIpv4Pools(): Request[DescribePublicIpv4PoolsResult, AWSError] = js.native
  def describePublicIpv4Pools(callback: js.Function2[/* err */ AWSError, /* data */ DescribePublicIpv4PoolsResult, Unit]): Request[DescribePublicIpv4PoolsResult, AWSError] = js.native
  /**
    * Describes the specified IPv4 address pools.
    */
  def describePublicIpv4Pools(params: DescribePublicIpv4PoolsRequest): Request[DescribePublicIpv4PoolsResult, AWSError] = js.native
  def describePublicIpv4Pools(
    params: DescribePublicIpv4PoolsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePublicIpv4PoolsResult, Unit]
  ): Request[DescribePublicIpv4PoolsResult, AWSError] = js.native
  /**
    * Describes the Regions that are enabled for your account, or all Regions. For a list of the Regions supported by Amazon EC2, see  Regions and Endpoints. For information about enabling and disabling Regions for your account, see Managing AWS Regions in the AWS General Reference.
    */
  def describeRegions(): Request[DescribeRegionsResult, AWSError] = js.native
  def describeRegions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRegionsResult, Unit]): Request[DescribeRegionsResult, AWSError] = js.native
  /**
    * Describes the Regions that are enabled for your account, or all Regions. For a list of the Regions supported by Amazon EC2, see  Regions and Endpoints. For information about enabling and disabling Regions for your account, see Managing AWS Regions in the AWS General Reference.
    */
  def describeRegions(params: DescribeRegionsRequest): Request[DescribeRegionsResult, AWSError] = js.native
  def describeRegions(
    params: DescribeRegionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRegionsResult, Unit]
  ): Request[DescribeRegionsResult, AWSError] = js.native
  /**
    * Describes one or more of the Reserved Instances that you purchased. For more information about Reserved Instances, see Reserved Instances in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeReservedInstances(): Request[DescribeReservedInstancesResult, AWSError] = js.native
  def describeReservedInstances(callback: js.Function2[/* err */ AWSError, /* data */ DescribeReservedInstancesResult, Unit]): Request[DescribeReservedInstancesResult, AWSError] = js.native
  /**
    * Describes one or more of the Reserved Instances that you purchased. For more information about Reserved Instances, see Reserved Instances in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeReservedInstances(params: DescribeReservedInstancesRequest): Request[DescribeReservedInstancesResult, AWSError] = js.native
  def describeReservedInstances(
    params: DescribeReservedInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReservedInstancesResult, Unit]
  ): Request[DescribeReservedInstancesResult, AWSError] = js.native
  /**
    * Describes your account's Reserved Instance listings in the Reserved Instance Marketplace. The Reserved Instance Marketplace matches sellers who want to resell Reserved Instance capacity that they no longer need with buyers who want to purchase additional capacity. Reserved Instances bought and sold through the Reserved Instance Marketplace work like any other Reserved Instances. As a seller, you choose to list some or all of your Reserved Instances, and you specify the upfront price to receive for them. Your Reserved Instances are then listed in the Reserved Instance Marketplace and are available for purchase. As a buyer, you specify the configuration of the Reserved Instance to purchase, and the Marketplace matches what you're searching for with what's available. The Marketplace first sells the lowest priced Reserved Instances to you, and continues to sell available Reserved Instance listings to you until your demand is met. You are charged based on the total price of all of the listings that you purchase. For more information, see Reserved Instance Marketplace in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeReservedInstancesListings(): Request[DescribeReservedInstancesListingsResult, AWSError] = js.native
  def describeReservedInstancesListings(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReservedInstancesListingsResult, Unit]
  ): Request[DescribeReservedInstancesListingsResult, AWSError] = js.native
  /**
    * Describes your account's Reserved Instance listings in the Reserved Instance Marketplace. The Reserved Instance Marketplace matches sellers who want to resell Reserved Instance capacity that they no longer need with buyers who want to purchase additional capacity. Reserved Instances bought and sold through the Reserved Instance Marketplace work like any other Reserved Instances. As a seller, you choose to list some or all of your Reserved Instances, and you specify the upfront price to receive for them. Your Reserved Instances are then listed in the Reserved Instance Marketplace and are available for purchase. As a buyer, you specify the configuration of the Reserved Instance to purchase, and the Marketplace matches what you're searching for with what's available. The Marketplace first sells the lowest priced Reserved Instances to you, and continues to sell available Reserved Instance listings to you until your demand is met. You are charged based on the total price of all of the listings that you purchase. For more information, see Reserved Instance Marketplace in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeReservedInstancesListings(params: DescribeReservedInstancesListingsRequest): Request[DescribeReservedInstancesListingsResult, AWSError] = js.native
  def describeReservedInstancesListings(
    params: DescribeReservedInstancesListingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReservedInstancesListingsResult, Unit]
  ): Request[DescribeReservedInstancesListingsResult, AWSError] = js.native
  /**
    * Describes the modifications made to your Reserved Instances. If no parameter is specified, information about all your Reserved Instances modification requests is returned. If a modification ID is specified, only information about the specific modification is returned. For more information, see Modifying Reserved Instances in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeReservedInstancesModifications(): Request[DescribeReservedInstancesModificationsResult, AWSError] = js.native
  def describeReservedInstancesModifications(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReservedInstancesModificationsResult, Unit]
  ): Request[DescribeReservedInstancesModificationsResult, AWSError] = js.native
  /**
    * Describes the modifications made to your Reserved Instances. If no parameter is specified, information about all your Reserved Instances modification requests is returned. If a modification ID is specified, only information about the specific modification is returned. For more information, see Modifying Reserved Instances in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeReservedInstancesModifications(params: DescribeReservedInstancesModificationsRequest): Request[DescribeReservedInstancesModificationsResult, AWSError] = js.native
  def describeReservedInstancesModifications(
    params: DescribeReservedInstancesModificationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReservedInstancesModificationsResult, Unit]
  ): Request[DescribeReservedInstancesModificationsResult, AWSError] = js.native
  /**
    * Describes Reserved Instance offerings that are available for purchase. With Reserved Instances, you purchase the right to launch instances for a period of time. During that time period, you do not receive insufficient capacity errors, and you pay a lower usage rate than the rate charged for On-Demand instances for the actual time used. If you have listed your own Reserved Instances for sale in the Reserved Instance Marketplace, they will be excluded from these results. This is to ensure that you do not purchase your own Reserved Instances. For more information, see Reserved Instance Marketplace in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeReservedInstancesOfferings(): Request[DescribeReservedInstancesOfferingsResult, AWSError] = js.native
  def describeReservedInstancesOfferings(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReservedInstancesOfferingsResult, Unit]
  ): Request[DescribeReservedInstancesOfferingsResult, AWSError] = js.native
  /**
    * Describes Reserved Instance offerings that are available for purchase. With Reserved Instances, you purchase the right to launch instances for a period of time. During that time period, you do not receive insufficient capacity errors, and you pay a lower usage rate than the rate charged for On-Demand instances for the actual time used. If you have listed your own Reserved Instances for sale in the Reserved Instance Marketplace, they will be excluded from these results. This is to ensure that you do not purchase your own Reserved Instances. For more information, see Reserved Instance Marketplace in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeReservedInstancesOfferings(params: DescribeReservedInstancesOfferingsRequest): Request[DescribeReservedInstancesOfferingsResult, AWSError] = js.native
  def describeReservedInstancesOfferings(
    params: DescribeReservedInstancesOfferingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReservedInstancesOfferingsResult, Unit]
  ): Request[DescribeReservedInstancesOfferingsResult, AWSError] = js.native
  /**
    * Describes one or more of your route tables. Each subnet in your VPC must be associated with a route table. If a subnet is not explicitly associated with any route table, it is implicitly associated with the main route table. This command does not return the subnet ID for implicit associations. For more information, see Route Tables in the Amazon Virtual Private Cloud User Guide.
    */
  def describeRouteTables(): Request[DescribeRouteTablesResult, AWSError] = js.native
  def describeRouteTables(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRouteTablesResult, Unit]): Request[DescribeRouteTablesResult, AWSError] = js.native
  /**
    * Describes one or more of your route tables. Each subnet in your VPC must be associated with a route table. If a subnet is not explicitly associated with any route table, it is implicitly associated with the main route table. This command does not return the subnet ID for implicit associations. For more information, see Route Tables in the Amazon Virtual Private Cloud User Guide.
    */
  def describeRouteTables(params: DescribeRouteTablesRequest): Request[DescribeRouteTablesResult, AWSError] = js.native
  def describeRouteTables(
    params: DescribeRouteTablesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRouteTablesResult, Unit]
  ): Request[DescribeRouteTablesResult, AWSError] = js.native
  /**
    * Finds available schedules that meet the specified criteria. You can search for an available schedule no more than 3 months in advance. You must meet the minimum required duration of 1,200 hours per year. For example, the minimum daily schedule is 4 hours, the minimum weekly schedule is 24 hours, and the minimum monthly schedule is 100 hours. After you find a schedule that meets your needs, call PurchaseScheduledInstances to purchase Scheduled Instances with that schedule.
    */
  def describeScheduledInstanceAvailability(): Request[DescribeScheduledInstanceAvailabilityResult, AWSError] = js.native
  def describeScheduledInstanceAvailability(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeScheduledInstanceAvailabilityResult, Unit]
  ): Request[DescribeScheduledInstanceAvailabilityResult, AWSError] = js.native
  /**
    * Finds available schedules that meet the specified criteria. You can search for an available schedule no more than 3 months in advance. You must meet the minimum required duration of 1,200 hours per year. For example, the minimum daily schedule is 4 hours, the minimum weekly schedule is 24 hours, and the minimum monthly schedule is 100 hours. After you find a schedule that meets your needs, call PurchaseScheduledInstances to purchase Scheduled Instances with that schedule.
    */
  def describeScheduledInstanceAvailability(params: DescribeScheduledInstanceAvailabilityRequest): Request[DescribeScheduledInstanceAvailabilityResult, AWSError] = js.native
  def describeScheduledInstanceAvailability(
    params: DescribeScheduledInstanceAvailabilityRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeScheduledInstanceAvailabilityResult, Unit]
  ): Request[DescribeScheduledInstanceAvailabilityResult, AWSError] = js.native
  /**
    * Describes the specified Scheduled Instances or all your Scheduled Instances.
    */
  def describeScheduledInstances(): Request[DescribeScheduledInstancesResult, AWSError] = js.native
  def describeScheduledInstances(callback: js.Function2[/* err */ AWSError, /* data */ DescribeScheduledInstancesResult, Unit]): Request[DescribeScheduledInstancesResult, AWSError] = js.native
  /**
    * Describes the specified Scheduled Instances or all your Scheduled Instances.
    */
  def describeScheduledInstances(params: DescribeScheduledInstancesRequest): Request[DescribeScheduledInstancesResult, AWSError] = js.native
  def describeScheduledInstances(
    params: DescribeScheduledInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeScheduledInstancesResult, Unit]
  ): Request[DescribeScheduledInstancesResult, AWSError] = js.native
  /**
    * [VPC only] Describes the VPCs on the other side of a VPC peering connection that are referencing the security groups you've specified in this request.
    */
  def describeSecurityGroupReferences(): Request[DescribeSecurityGroupReferencesResult, AWSError] = js.native
  def describeSecurityGroupReferences(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSecurityGroupReferencesResult, Unit]): Request[DescribeSecurityGroupReferencesResult, AWSError] = js.native
  /**
    * [VPC only] Describes the VPCs on the other side of a VPC peering connection that are referencing the security groups you've specified in this request.
    */
  def describeSecurityGroupReferences(params: DescribeSecurityGroupReferencesRequest): Request[DescribeSecurityGroupReferencesResult, AWSError] = js.native
  def describeSecurityGroupReferences(
    params: DescribeSecurityGroupReferencesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSecurityGroupReferencesResult, Unit]
  ): Request[DescribeSecurityGroupReferencesResult, AWSError] = js.native
  /**
    * Describes the specified security groups or all of your security groups. A security group is for use with instances either in the EC2-Classic platform or in a specific VPC. For more information, see Amazon EC2 Security Groups in the Amazon Elastic Compute Cloud User Guide and Security Groups for Your VPC in the Amazon Virtual Private Cloud User Guide.
    */
  def describeSecurityGroups(): Request[DescribeSecurityGroupsResult, AWSError] = js.native
  def describeSecurityGroups(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSecurityGroupsResult, Unit]): Request[DescribeSecurityGroupsResult, AWSError] = js.native
  /**
    * Describes the specified security groups or all of your security groups. A security group is for use with instances either in the EC2-Classic platform or in a specific VPC. For more information, see Amazon EC2 Security Groups in the Amazon Elastic Compute Cloud User Guide and Security Groups for Your VPC in the Amazon Virtual Private Cloud User Guide.
    */
  def describeSecurityGroups(params: DescribeSecurityGroupsRequest): Request[DescribeSecurityGroupsResult, AWSError] = js.native
  def describeSecurityGroups(
    params: DescribeSecurityGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSecurityGroupsResult, Unit]
  ): Request[DescribeSecurityGroupsResult, AWSError] = js.native
  /**
    * Describes the specified attribute of the specified snapshot. You can specify only one attribute at a time. For more information about EBS snapshots, see Amazon EBS Snapshots in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeSnapshotAttribute(): Request[DescribeSnapshotAttributeResult, AWSError] = js.native
  def describeSnapshotAttribute(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSnapshotAttributeResult, Unit]): Request[DescribeSnapshotAttributeResult, AWSError] = js.native
  /**
    * Describes the specified attribute of the specified snapshot. You can specify only one attribute at a time. For more information about EBS snapshots, see Amazon EBS Snapshots in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeSnapshotAttribute(params: DescribeSnapshotAttributeRequest): Request[DescribeSnapshotAttributeResult, AWSError] = js.native
  def describeSnapshotAttribute(
    params: DescribeSnapshotAttributeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSnapshotAttributeResult, Unit]
  ): Request[DescribeSnapshotAttributeResult, AWSError] = js.native
  /**
    * Describes the specified EBS snapshots available to you or all of the EBS snapshots available to you. The snapshots available to you include public snapshots, private snapshots that you own, and private snapshots owned by other AWS accounts for which you have explicit create volume permissions. The create volume permissions fall into the following categories:    public: The owner of the snapshot granted create volume permissions for the snapshot to the all group. All AWS accounts have create volume permissions for these snapshots.    explicit: The owner of the snapshot granted create volume permissions to a specific AWS account.    implicit: An AWS account has implicit create volume permissions for all snapshots it owns.   The list of snapshots returned can be modified by specifying snapshot IDs, snapshot owners, or AWS accounts with create volume permissions. If no options are specified, Amazon EC2 returns all snapshots for which you have create volume permissions. If you specify one or more snapshot IDs, only snapshots that have the specified IDs are returned. If you specify an invalid snapshot ID, an error is returned. If you specify a snapshot ID for which you do not have access, it is not included in the returned results. If you specify one or more snapshot owners using the OwnerIds option, only snapshots from the specified owners and for which you have access are returned. The results can include the AWS account IDs of the specified owners, amazon for snapshots owned by Amazon, or self for snapshots that you own. If you specify a list of restorable users, only snapshots with create snapshot permissions for those users are returned. You can specify AWS account IDs (if you own the snapshots), self for snapshots for which you own or have explicit permissions, or all for public snapshots. If you are describing a long list of snapshots, you can paginate the output to make the list more manageable. The MaxResults parameter sets the maximum number of results returned in a single page. If the list of results exceeds your MaxResults value, then that number of results is returned along with a NextToken value that can be passed to a subsequent DescribeSnapshots request to retrieve the remaining results. For more information about EBS snapshots, see Amazon EBS Snapshots in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeSnapshots(): Request[DescribeSnapshotsResult, AWSError] = js.native
  def describeSnapshots(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSnapshotsResult, Unit]): Request[DescribeSnapshotsResult, AWSError] = js.native
  /**
    * Describes the specified EBS snapshots available to you or all of the EBS snapshots available to you. The snapshots available to you include public snapshots, private snapshots that you own, and private snapshots owned by other AWS accounts for which you have explicit create volume permissions. The create volume permissions fall into the following categories:    public: The owner of the snapshot granted create volume permissions for the snapshot to the all group. All AWS accounts have create volume permissions for these snapshots.    explicit: The owner of the snapshot granted create volume permissions to a specific AWS account.    implicit: An AWS account has implicit create volume permissions for all snapshots it owns.   The list of snapshots returned can be modified by specifying snapshot IDs, snapshot owners, or AWS accounts with create volume permissions. If no options are specified, Amazon EC2 returns all snapshots for which you have create volume permissions. If you specify one or more snapshot IDs, only snapshots that have the specified IDs are returned. If you specify an invalid snapshot ID, an error is returned. If you specify a snapshot ID for which you do not have access, it is not included in the returned results. If you specify one or more snapshot owners using the OwnerIds option, only snapshots from the specified owners and for which you have access are returned. The results can include the AWS account IDs of the specified owners, amazon for snapshots owned by Amazon, or self for snapshots that you own. If you specify a list of restorable users, only snapshots with create snapshot permissions for those users are returned. You can specify AWS account IDs (if you own the snapshots), self for snapshots for which you own or have explicit permissions, or all for public snapshots. If you are describing a long list of snapshots, you can paginate the output to make the list more manageable. The MaxResults parameter sets the maximum number of results returned in a single page. If the list of results exceeds your MaxResults value, then that number of results is returned along with a NextToken value that can be passed to a subsequent DescribeSnapshots request to retrieve the remaining results. For more information about EBS snapshots, see Amazon EBS Snapshots in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeSnapshots(params: DescribeSnapshotsRequest): Request[DescribeSnapshotsResult, AWSError] = js.native
  def describeSnapshots(
    params: DescribeSnapshotsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSnapshotsResult, Unit]
  ): Request[DescribeSnapshotsResult, AWSError] = js.native
  /**
    * Describes the data feed for Spot Instances. For more information, see Spot Instance Data Feed in the Amazon EC2 User Guide for Linux Instances.
    */
  def describeSpotDatafeedSubscription(): Request[DescribeSpotDatafeedSubscriptionResult, AWSError] = js.native
  def describeSpotDatafeedSubscription(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSpotDatafeedSubscriptionResult, Unit]
  ): Request[DescribeSpotDatafeedSubscriptionResult, AWSError] = js.native
  /**
    * Describes the data feed for Spot Instances. For more information, see Spot Instance Data Feed in the Amazon EC2 User Guide for Linux Instances.
    */
  def describeSpotDatafeedSubscription(params: DescribeSpotDatafeedSubscriptionRequest): Request[DescribeSpotDatafeedSubscriptionResult, AWSError] = js.native
  def describeSpotDatafeedSubscription(
    params: DescribeSpotDatafeedSubscriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSpotDatafeedSubscriptionResult, Unit]
  ): Request[DescribeSpotDatafeedSubscriptionResult, AWSError] = js.native
  /**
    * Describes the running instances for the specified Spot Fleet.
    */
  def describeSpotFleetInstances(): Request[DescribeSpotFleetInstancesResponse, AWSError] = js.native
  def describeSpotFleetInstances(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSpotFleetInstancesResponse, Unit]): Request[DescribeSpotFleetInstancesResponse, AWSError] = js.native
  /**
    * Describes the running instances for the specified Spot Fleet.
    */
  def describeSpotFleetInstances(params: DescribeSpotFleetInstancesRequest): Request[DescribeSpotFleetInstancesResponse, AWSError] = js.native
  def describeSpotFleetInstances(
    params: DescribeSpotFleetInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSpotFleetInstancesResponse, Unit]
  ): Request[DescribeSpotFleetInstancesResponse, AWSError] = js.native
  /**
    * Describes the events for the specified Spot Fleet request during the specified time. Spot Fleet events are delayed by up to 30 seconds before they can be described. This ensures that you can query by the last evaluated time and not miss a recorded event. Spot Fleet events are available for 48 hours.
    */
  def describeSpotFleetRequestHistory(): Request[DescribeSpotFleetRequestHistoryResponse, AWSError] = js.native
  def describeSpotFleetRequestHistory(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSpotFleetRequestHistoryResponse, Unit]
  ): Request[DescribeSpotFleetRequestHistoryResponse, AWSError] = js.native
  /**
    * Describes the events for the specified Spot Fleet request during the specified time. Spot Fleet events are delayed by up to 30 seconds before they can be described. This ensures that you can query by the last evaluated time and not miss a recorded event. Spot Fleet events are available for 48 hours.
    */
  def describeSpotFleetRequestHistory(params: DescribeSpotFleetRequestHistoryRequest): Request[DescribeSpotFleetRequestHistoryResponse, AWSError] = js.native
  def describeSpotFleetRequestHistory(
    params: DescribeSpotFleetRequestHistoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSpotFleetRequestHistoryResponse, Unit]
  ): Request[DescribeSpotFleetRequestHistoryResponse, AWSError] = js.native
  /**
    * Describes your Spot Fleet requests. Spot Fleet requests are deleted 48 hours after they are canceled and their instances are terminated.
    */
  def describeSpotFleetRequests(): Request[DescribeSpotFleetRequestsResponse, AWSError] = js.native
  def describeSpotFleetRequests(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSpotFleetRequestsResponse, Unit]): Request[DescribeSpotFleetRequestsResponse, AWSError] = js.native
  /**
    * Describes your Spot Fleet requests. Spot Fleet requests are deleted 48 hours after they are canceled and their instances are terminated.
    */
  def describeSpotFleetRequests(params: DescribeSpotFleetRequestsRequest): Request[DescribeSpotFleetRequestsResponse, AWSError] = js.native
  def describeSpotFleetRequests(
    params: DescribeSpotFleetRequestsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSpotFleetRequestsResponse, Unit]
  ): Request[DescribeSpotFleetRequestsResponse, AWSError] = js.native
  /**
    * Describes the specified Spot Instance requests. You can use DescribeSpotInstanceRequests to find a running Spot Instance by examining the response. If the status of the Spot Instance is fulfilled, the instance ID appears in the response and contains the identifier of the instance. Alternatively, you can use DescribeInstances with a filter to look for instances where the instance lifecycle is spot. We recommend that you set MaxResults to a value between 5 and 1000 to limit the number of results returned. This paginates the output, which makes the list more manageable and returns the results faster. If the list of results exceeds your MaxResults value, then that number of results is returned along with a NextToken value that can be passed to a subsequent DescribeSpotInstanceRequests request to retrieve the remaining results. Spot Instance requests are deleted four hours after they are canceled and their instances are terminated.
    */
  def describeSpotInstanceRequests(): Request[DescribeSpotInstanceRequestsResult, AWSError] = js.native
  def describeSpotInstanceRequests(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSpotInstanceRequestsResult, Unit]): Request[DescribeSpotInstanceRequestsResult, AWSError] = js.native
  /**
    * Describes the specified Spot Instance requests. You can use DescribeSpotInstanceRequests to find a running Spot Instance by examining the response. If the status of the Spot Instance is fulfilled, the instance ID appears in the response and contains the identifier of the instance. Alternatively, you can use DescribeInstances with a filter to look for instances where the instance lifecycle is spot. We recommend that you set MaxResults to a value between 5 and 1000 to limit the number of results returned. This paginates the output, which makes the list more manageable and returns the results faster. If the list of results exceeds your MaxResults value, then that number of results is returned along with a NextToken value that can be passed to a subsequent DescribeSpotInstanceRequests request to retrieve the remaining results. Spot Instance requests are deleted four hours after they are canceled and their instances are terminated.
    */
  def describeSpotInstanceRequests(params: DescribeSpotInstanceRequestsRequest): Request[DescribeSpotInstanceRequestsResult, AWSError] = js.native
  def describeSpotInstanceRequests(
    params: DescribeSpotInstanceRequestsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSpotInstanceRequestsResult, Unit]
  ): Request[DescribeSpotInstanceRequestsResult, AWSError] = js.native
  /**
    * Describes the Spot price history. For more information, see Spot Instance Pricing History in the Amazon EC2 User Guide for Linux Instances. When you specify a start and end time, this operation returns the prices of the instance types within the time range that you specified and the time when the price changed. The price is valid within the time period that you specified; the response merely indicates the last time that the price changed.
    */
  def describeSpotPriceHistory(): Request[DescribeSpotPriceHistoryResult, AWSError] = js.native
  def describeSpotPriceHistory(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSpotPriceHistoryResult, Unit]): Request[DescribeSpotPriceHistoryResult, AWSError] = js.native
  /**
    * Describes the Spot price history. For more information, see Spot Instance Pricing History in the Amazon EC2 User Guide for Linux Instances. When you specify a start and end time, this operation returns the prices of the instance types within the time range that you specified and the time when the price changed. The price is valid within the time period that you specified; the response merely indicates the last time that the price changed.
    */
  def describeSpotPriceHistory(params: DescribeSpotPriceHistoryRequest): Request[DescribeSpotPriceHistoryResult, AWSError] = js.native
  def describeSpotPriceHistory(
    params: DescribeSpotPriceHistoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSpotPriceHistoryResult, Unit]
  ): Request[DescribeSpotPriceHistoryResult, AWSError] = js.native
  /**
    * [VPC only] Describes the stale security group rules for security groups in a specified VPC. Rules are stale when they reference a deleted security group in a peer VPC, or a security group in a peer VPC for which the VPC peering connection has been deleted.
    */
  def describeStaleSecurityGroups(): Request[DescribeStaleSecurityGroupsResult, AWSError] = js.native
  def describeStaleSecurityGroups(callback: js.Function2[/* err */ AWSError, /* data */ DescribeStaleSecurityGroupsResult, Unit]): Request[DescribeStaleSecurityGroupsResult, AWSError] = js.native
  /**
    * [VPC only] Describes the stale security group rules for security groups in a specified VPC. Rules are stale when they reference a deleted security group in a peer VPC, or a security group in a peer VPC for which the VPC peering connection has been deleted.
    */
  def describeStaleSecurityGroups(params: DescribeStaleSecurityGroupsRequest): Request[DescribeStaleSecurityGroupsResult, AWSError] = js.native
  def describeStaleSecurityGroups(
    params: DescribeStaleSecurityGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStaleSecurityGroupsResult, Unit]
  ): Request[DescribeStaleSecurityGroupsResult, AWSError] = js.native
  /**
    * Describes one or more of your subnets. For more information, see Your VPC and Subnets in the Amazon Virtual Private Cloud User Guide.
    */
  def describeSubnets(): Request[DescribeSubnetsResult, AWSError] = js.native
  def describeSubnets(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSubnetsResult, Unit]): Request[DescribeSubnetsResult, AWSError] = js.native
  /**
    * Describes one or more of your subnets. For more information, see Your VPC and Subnets in the Amazon Virtual Private Cloud User Guide.
    */
  def describeSubnets(params: DescribeSubnetsRequest): Request[DescribeSubnetsResult, AWSError] = js.native
  def describeSubnets(
    params: DescribeSubnetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSubnetsResult, Unit]
  ): Request[DescribeSubnetsResult, AWSError] = js.native
  /**
    * Describes the specified tags for your EC2 resources. For more information about tags, see Tagging Your Resources in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeTags(): Request[DescribeTagsResult, AWSError] = js.native
  def describeTags(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTagsResult, Unit]): Request[DescribeTagsResult, AWSError] = js.native
  /**
    * Describes the specified tags for your EC2 resources. For more information about tags, see Tagging Your Resources in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeTags(params: DescribeTagsRequest): Request[DescribeTagsResult, AWSError] = js.native
  def describeTags(
    params: DescribeTagsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTagsResult, Unit]
  ): Request[DescribeTagsResult, AWSError] = js.native
  /**
    * Describes one or more Traffic Mirror filters.
    */
  def describeTrafficMirrorFilters(): Request[DescribeTrafficMirrorFiltersResult, AWSError] = js.native
  def describeTrafficMirrorFilters(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTrafficMirrorFiltersResult, Unit]): Request[DescribeTrafficMirrorFiltersResult, AWSError] = js.native
  /**
    * Describes one or more Traffic Mirror filters.
    */
  def describeTrafficMirrorFilters(params: DescribeTrafficMirrorFiltersRequest): Request[DescribeTrafficMirrorFiltersResult, AWSError] = js.native
  def describeTrafficMirrorFilters(
    params: DescribeTrafficMirrorFiltersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTrafficMirrorFiltersResult, Unit]
  ): Request[DescribeTrafficMirrorFiltersResult, AWSError] = js.native
  /**
    * Describes one or more Traffic Mirror sessions. By default, all Traffic Mirror sessions are described. Alternatively, you can filter the results.
    */
  def describeTrafficMirrorSessions(): Request[DescribeTrafficMirrorSessionsResult, AWSError] = js.native
  def describeTrafficMirrorSessions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTrafficMirrorSessionsResult, Unit]): Request[DescribeTrafficMirrorSessionsResult, AWSError] = js.native
  /**
    * Describes one or more Traffic Mirror sessions. By default, all Traffic Mirror sessions are described. Alternatively, you can filter the results.
    */
  def describeTrafficMirrorSessions(params: DescribeTrafficMirrorSessionsRequest): Request[DescribeTrafficMirrorSessionsResult, AWSError] = js.native
  def describeTrafficMirrorSessions(
    params: DescribeTrafficMirrorSessionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTrafficMirrorSessionsResult, Unit]
  ): Request[DescribeTrafficMirrorSessionsResult, AWSError] = js.native
  /**
    * Information about one or more Traffic Mirror targets.
    */
  def describeTrafficMirrorTargets(): Request[DescribeTrafficMirrorTargetsResult, AWSError] = js.native
  def describeTrafficMirrorTargets(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTrafficMirrorTargetsResult, Unit]): Request[DescribeTrafficMirrorTargetsResult, AWSError] = js.native
  /**
    * Information about one or more Traffic Mirror targets.
    */
  def describeTrafficMirrorTargets(params: DescribeTrafficMirrorTargetsRequest): Request[DescribeTrafficMirrorTargetsResult, AWSError] = js.native
  def describeTrafficMirrorTargets(
    params: DescribeTrafficMirrorTargetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTrafficMirrorTargetsResult, Unit]
  ): Request[DescribeTrafficMirrorTargetsResult, AWSError] = js.native
  /**
    * Describes one or more attachments between resources and transit gateways. By default, all attachments are described. Alternatively, you can filter the results by attachment ID, attachment state, resource ID, or resource owner.
    */
  def describeTransitGatewayAttachments(): Request[DescribeTransitGatewayAttachmentsResult, AWSError] = js.native
  def describeTransitGatewayAttachments(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTransitGatewayAttachmentsResult, Unit]
  ): Request[DescribeTransitGatewayAttachmentsResult, AWSError] = js.native
  /**
    * Describes one or more attachments between resources and transit gateways. By default, all attachments are described. Alternatively, you can filter the results by attachment ID, attachment state, resource ID, or resource owner.
    */
  def describeTransitGatewayAttachments(params: DescribeTransitGatewayAttachmentsRequest): Request[DescribeTransitGatewayAttachmentsResult, AWSError] = js.native
  def describeTransitGatewayAttachments(
    params: DescribeTransitGatewayAttachmentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTransitGatewayAttachmentsResult, Unit]
  ): Request[DescribeTransitGatewayAttachmentsResult, AWSError] = js.native
  /**
    * Describes one or more transit gateway multicast domains.
    */
  def describeTransitGatewayMulticastDomains(): Request[DescribeTransitGatewayMulticastDomainsResult, AWSError] = js.native
  def describeTransitGatewayMulticastDomains(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTransitGatewayMulticastDomainsResult, Unit]
  ): Request[DescribeTransitGatewayMulticastDomainsResult, AWSError] = js.native
  /**
    * Describes one or more transit gateway multicast domains.
    */
  def describeTransitGatewayMulticastDomains(params: DescribeTransitGatewayMulticastDomainsRequest): Request[DescribeTransitGatewayMulticastDomainsResult, AWSError] = js.native
  def describeTransitGatewayMulticastDomains(
    params: DescribeTransitGatewayMulticastDomainsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTransitGatewayMulticastDomainsResult, Unit]
  ): Request[DescribeTransitGatewayMulticastDomainsResult, AWSError] = js.native
  /**
    * Describes your transit gateway peering attachments.
    */
  def describeTransitGatewayPeeringAttachments(): Request[DescribeTransitGatewayPeeringAttachmentsResult, AWSError] = js.native
  def describeTransitGatewayPeeringAttachments(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTransitGatewayPeeringAttachmentsResult, Unit]
  ): Request[DescribeTransitGatewayPeeringAttachmentsResult, AWSError] = js.native
  /**
    * Describes your transit gateway peering attachments.
    */
  def describeTransitGatewayPeeringAttachments(params: DescribeTransitGatewayPeeringAttachmentsRequest): Request[DescribeTransitGatewayPeeringAttachmentsResult, AWSError] = js.native
  def describeTransitGatewayPeeringAttachments(
    params: DescribeTransitGatewayPeeringAttachmentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTransitGatewayPeeringAttachmentsResult, Unit]
  ): Request[DescribeTransitGatewayPeeringAttachmentsResult, AWSError] = js.native
  /**
    * Describes one or more transit gateway route tables. By default, all transit gateway route tables are described. Alternatively, you can filter the results.
    */
  def describeTransitGatewayRouteTables(): Request[DescribeTransitGatewayRouteTablesResult, AWSError] = js.native
  def describeTransitGatewayRouteTables(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTransitGatewayRouteTablesResult, Unit]
  ): Request[DescribeTransitGatewayRouteTablesResult, AWSError] = js.native
  /**
    * Describes one or more transit gateway route tables. By default, all transit gateway route tables are described. Alternatively, you can filter the results.
    */
  def describeTransitGatewayRouteTables(params: DescribeTransitGatewayRouteTablesRequest): Request[DescribeTransitGatewayRouteTablesResult, AWSError] = js.native
  def describeTransitGatewayRouteTables(
    params: DescribeTransitGatewayRouteTablesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTransitGatewayRouteTablesResult, Unit]
  ): Request[DescribeTransitGatewayRouteTablesResult, AWSError] = js.native
  /**
    * Describes one or more VPC attachments. By default, all VPC attachments are described. Alternatively, you can filter the results.
    */
  def describeTransitGatewayVpcAttachments(): Request[DescribeTransitGatewayVpcAttachmentsResult, AWSError] = js.native
  def describeTransitGatewayVpcAttachments(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTransitGatewayVpcAttachmentsResult, Unit]
  ): Request[DescribeTransitGatewayVpcAttachmentsResult, AWSError] = js.native
  /**
    * Describes one or more VPC attachments. By default, all VPC attachments are described. Alternatively, you can filter the results.
    */
  def describeTransitGatewayVpcAttachments(params: DescribeTransitGatewayVpcAttachmentsRequest): Request[DescribeTransitGatewayVpcAttachmentsResult, AWSError] = js.native
  def describeTransitGatewayVpcAttachments(
    params: DescribeTransitGatewayVpcAttachmentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTransitGatewayVpcAttachmentsResult, Unit]
  ): Request[DescribeTransitGatewayVpcAttachmentsResult, AWSError] = js.native
  /**
    * Describes one or more transit gateways. By default, all transit gateways are described. Alternatively, you can filter the results.
    */
  def describeTransitGateways(): Request[DescribeTransitGatewaysResult, AWSError] = js.native
  def describeTransitGateways(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTransitGatewaysResult, Unit]): Request[DescribeTransitGatewaysResult, AWSError] = js.native
  /**
    * Describes one or more transit gateways. By default, all transit gateways are described. Alternatively, you can filter the results.
    */
  def describeTransitGateways(params: DescribeTransitGatewaysRequest): Request[DescribeTransitGatewaysResult, AWSError] = js.native
  def describeTransitGateways(
    params: DescribeTransitGatewaysRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTransitGatewaysResult, Unit]
  ): Request[DescribeTransitGatewaysResult, AWSError] = js.native
  /**
    * Describes the specified attribute of the specified volume. You can specify only one attribute at a time. For more information about EBS volumes, see Amazon EBS Volumes in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeVolumeAttribute(): Request[DescribeVolumeAttributeResult, AWSError] = js.native
  def describeVolumeAttribute(callback: js.Function2[/* err */ AWSError, /* data */ DescribeVolumeAttributeResult, Unit]): Request[DescribeVolumeAttributeResult, AWSError] = js.native
  /**
    * Describes the specified attribute of the specified volume. You can specify only one attribute at a time. For more information about EBS volumes, see Amazon EBS Volumes in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeVolumeAttribute(params: DescribeVolumeAttributeRequest): Request[DescribeVolumeAttributeResult, AWSError] = js.native
  def describeVolumeAttribute(
    params: DescribeVolumeAttributeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVolumeAttributeResult, Unit]
  ): Request[DescribeVolumeAttributeResult, AWSError] = js.native
  /**
    * Describes the status of the specified volumes. Volume status provides the result of the checks performed on your volumes to determine events that can impair the performance of your volumes. The performance of a volume can be affected if an issue occurs on the volume's underlying host. If the volume's underlying host experiences a power outage or system issue, after the system is restored, there could be data inconsistencies on the volume. Volume events notify you if this occurs. Volume actions notify you if any action needs to be taken in response to the event. The DescribeVolumeStatus operation provides the following information about the specified volumes:  Status: Reflects the current status of the volume. The possible values are ok, impaired , warning, or insufficient-data. If all checks pass, the overall status of the volume is ok. If the check fails, the overall status is impaired. If the status is insufficient-data, then the checks may still be taking place on your volume at the time. We recommend that you retry the request. For more information about volume status, see Monitoring the Status of Your Volumes in the Amazon Elastic Compute Cloud User Guide.  Events: Reflect the cause of a volume status and may require you to take action. For example, if your volume returns an impaired status, then the volume event might be potential-data-inconsistency. This means that your volume has been affected by an issue with the underlying host, has all I/O operations disabled, and may have inconsistent data.  Actions: Reflect the actions you may have to take in response to an event. For example, if the status of the volume is impaired and the volume event shows potential-data-inconsistency, then the action shows enable-volume-io. This means that you may want to enable the I/O operations for the volume by calling the EnableVolumeIO action and then check the volume for data consistency. Volume status is based on the volume status checks, and does not reflect the volume state. Therefore, volume status does not indicate volumes in the error state (for example, when a volume is incapable of accepting I/O.)
    */
  def describeVolumeStatus(): Request[DescribeVolumeStatusResult, AWSError] = js.native
  def describeVolumeStatus(callback: js.Function2[/* err */ AWSError, /* data */ DescribeVolumeStatusResult, Unit]): Request[DescribeVolumeStatusResult, AWSError] = js.native
  /**
    * Describes the status of the specified volumes. Volume status provides the result of the checks performed on your volumes to determine events that can impair the performance of your volumes. The performance of a volume can be affected if an issue occurs on the volume's underlying host. If the volume's underlying host experiences a power outage or system issue, after the system is restored, there could be data inconsistencies on the volume. Volume events notify you if this occurs. Volume actions notify you if any action needs to be taken in response to the event. The DescribeVolumeStatus operation provides the following information about the specified volumes:  Status: Reflects the current status of the volume. The possible values are ok, impaired , warning, or insufficient-data. If all checks pass, the overall status of the volume is ok. If the check fails, the overall status is impaired. If the status is insufficient-data, then the checks may still be taking place on your volume at the time. We recommend that you retry the request. For more information about volume status, see Monitoring the Status of Your Volumes in the Amazon Elastic Compute Cloud User Guide.  Events: Reflect the cause of a volume status and may require you to take action. For example, if your volume returns an impaired status, then the volume event might be potential-data-inconsistency. This means that your volume has been affected by an issue with the underlying host, has all I/O operations disabled, and may have inconsistent data.  Actions: Reflect the actions you may have to take in response to an event. For example, if the status of the volume is impaired and the volume event shows potential-data-inconsistency, then the action shows enable-volume-io. This means that you may want to enable the I/O operations for the volume by calling the EnableVolumeIO action and then check the volume for data consistency. Volume status is based on the volume status checks, and does not reflect the volume state. Therefore, volume status does not indicate volumes in the error state (for example, when a volume is incapable of accepting I/O.)
    */
  def describeVolumeStatus(params: DescribeVolumeStatusRequest): Request[DescribeVolumeStatusResult, AWSError] = js.native
  def describeVolumeStatus(
    params: DescribeVolumeStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVolumeStatusResult, Unit]
  ): Request[DescribeVolumeStatusResult, AWSError] = js.native
  /**
    * Describes the specified EBS volumes or all of your EBS volumes. If you are describing a long list of volumes, you can paginate the output to make the list more manageable. The MaxResults parameter sets the maximum number of results returned in a single page. If the list of results exceeds your MaxResults value, then that number of results is returned along with a NextToken value that can be passed to a subsequent DescribeVolumes request to retrieve the remaining results. For more information about EBS volumes, see Amazon EBS Volumes in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeVolumes(): Request[DescribeVolumesResult, AWSError] = js.native
  def describeVolumes(callback: js.Function2[/* err */ AWSError, /* data */ DescribeVolumesResult, Unit]): Request[DescribeVolumesResult, AWSError] = js.native
  /**
    * Describes the specified EBS volumes or all of your EBS volumes. If you are describing a long list of volumes, you can paginate the output to make the list more manageable. The MaxResults parameter sets the maximum number of results returned in a single page. If the list of results exceeds your MaxResults value, then that number of results is returned along with a NextToken value that can be passed to a subsequent DescribeVolumes request to retrieve the remaining results. For more information about EBS volumes, see Amazon EBS Volumes in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeVolumes(params: DescribeVolumesRequest): Request[DescribeVolumesResult, AWSError] = js.native
  def describeVolumes(
    params: DescribeVolumesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVolumesResult, Unit]
  ): Request[DescribeVolumesResult, AWSError] = js.native
  /**
    * Reports the current modification status of EBS volumes. Current-generation EBS volumes support modification of attributes including type, size, and (for io1 volumes) IOPS provisioning while either attached to or detached from an instance. Following an action from the API or the console to modify a volume, the status of the modification may be modifying, optimizing, completed, or failed. If a volume has never been modified, then certain elements of the returned VolumeModification objects are null.   You can also use CloudWatch Events to check the status of a modification to an EBS volume. For information about CloudWatch Events, see the Amazon CloudWatch Events User Guide. For more information, see Monitoring Volume Modifications" in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeVolumesModifications(): Request[DescribeVolumesModificationsResult, AWSError] = js.native
  def describeVolumesModifications(callback: js.Function2[/* err */ AWSError, /* data */ DescribeVolumesModificationsResult, Unit]): Request[DescribeVolumesModificationsResult, AWSError] = js.native
  /**
    * Reports the current modification status of EBS volumes. Current-generation EBS volumes support modification of attributes including type, size, and (for io1 volumes) IOPS provisioning while either attached to or detached from an instance. Following an action from the API or the console to modify a volume, the status of the modification may be modifying, optimizing, completed, or failed. If a volume has never been modified, then certain elements of the returned VolumeModification objects are null.   You can also use CloudWatch Events to check the status of a modification to an EBS volume. For information about CloudWatch Events, see the Amazon CloudWatch Events User Guide. For more information, see Monitoring Volume Modifications" in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeVolumesModifications(params: DescribeVolumesModificationsRequest): Request[DescribeVolumesModificationsResult, AWSError] = js.native
  def describeVolumesModifications(
    params: DescribeVolumesModificationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVolumesModificationsResult, Unit]
  ): Request[DescribeVolumesModificationsResult, AWSError] = js.native
  /**
    * Describes the specified attribute of the specified VPC. You can specify only one attribute at a time.
    */
  def describeVpcAttribute(): Request[DescribeVpcAttributeResult, AWSError] = js.native
  def describeVpcAttribute(callback: js.Function2[/* err */ AWSError, /* data */ DescribeVpcAttributeResult, Unit]): Request[DescribeVpcAttributeResult, AWSError] = js.native
  /**
    * Describes the specified attribute of the specified VPC. You can specify only one attribute at a time.
    */
  def describeVpcAttribute(params: DescribeVpcAttributeRequest): Request[DescribeVpcAttributeResult, AWSError] = js.native
  def describeVpcAttribute(
    params: DescribeVpcAttributeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVpcAttributeResult, Unit]
  ): Request[DescribeVpcAttributeResult, AWSError] = js.native
  /**
    * Describes the ClassicLink status of one or more VPCs.
    */
  def describeVpcClassicLink(): Request[DescribeVpcClassicLinkResult, AWSError] = js.native
  def describeVpcClassicLink(callback: js.Function2[/* err */ AWSError, /* data */ DescribeVpcClassicLinkResult, Unit]): Request[DescribeVpcClassicLinkResult, AWSError] = js.native
  /**
    * Describes the ClassicLink status of one or more VPCs.
    */
  def describeVpcClassicLink(params: DescribeVpcClassicLinkRequest): Request[DescribeVpcClassicLinkResult, AWSError] = js.native
  def describeVpcClassicLink(
    params: DescribeVpcClassicLinkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVpcClassicLinkResult, Unit]
  ): Request[DescribeVpcClassicLinkResult, AWSError] = js.native
  /**
    * Describes the ClassicLink DNS support status of one or more VPCs. If enabled, the DNS hostname of a linked EC2-Classic instance resolves to its private IP address when addressed from an instance in the VPC to which it's linked. Similarly, the DNS hostname of an instance in a VPC resolves to its private IP address when addressed from a linked EC2-Classic instance. For more information, see ClassicLink in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeVpcClassicLinkDnsSupport(): Request[DescribeVpcClassicLinkDnsSupportResult, AWSError] = js.native
  def describeVpcClassicLinkDnsSupport(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVpcClassicLinkDnsSupportResult, Unit]
  ): Request[DescribeVpcClassicLinkDnsSupportResult, AWSError] = js.native
  /**
    * Describes the ClassicLink DNS support status of one or more VPCs. If enabled, the DNS hostname of a linked EC2-Classic instance resolves to its private IP address when addressed from an instance in the VPC to which it's linked. Similarly, the DNS hostname of an instance in a VPC resolves to its private IP address when addressed from a linked EC2-Classic instance. For more information, see ClassicLink in the Amazon Elastic Compute Cloud User Guide.
    */
  def describeVpcClassicLinkDnsSupport(params: DescribeVpcClassicLinkDnsSupportRequest): Request[DescribeVpcClassicLinkDnsSupportResult, AWSError] = js.native
  def describeVpcClassicLinkDnsSupport(
    params: DescribeVpcClassicLinkDnsSupportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVpcClassicLinkDnsSupportResult, Unit]
  ): Request[DescribeVpcClassicLinkDnsSupportResult, AWSError] = js.native
  /**
    * Describes the connection notifications for VPC endpoints and VPC endpoint services.
    */
  def describeVpcEndpointConnectionNotifications(): Request[DescribeVpcEndpointConnectionNotificationsResult, AWSError] = js.native
  def describeVpcEndpointConnectionNotifications(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeVpcEndpointConnectionNotificationsResult, 
      Unit
    ]
  ): Request[DescribeVpcEndpointConnectionNotificationsResult, AWSError] = js.native
  /**
    * Describes the connection notifications for VPC endpoints and VPC endpoint services.
    */
  def describeVpcEndpointConnectionNotifications(params: DescribeVpcEndpointConnectionNotificationsRequest): Request[DescribeVpcEndpointConnectionNotificationsResult, AWSError] = js.native
  def describeVpcEndpointConnectionNotifications(
    params: DescribeVpcEndpointConnectionNotificationsRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeVpcEndpointConnectionNotificationsResult, 
      Unit
    ]
  ): Request[DescribeVpcEndpointConnectionNotificationsResult, AWSError] = js.native
  /**
    * Describes the VPC endpoint connections to your VPC endpoint services, including any endpoints that are pending your acceptance.
    */
  def describeVpcEndpointConnections(): Request[DescribeVpcEndpointConnectionsResult, AWSError] = js.native
  def describeVpcEndpointConnections(callback: js.Function2[/* err */ AWSError, /* data */ DescribeVpcEndpointConnectionsResult, Unit]): Request[DescribeVpcEndpointConnectionsResult, AWSError] = js.native
  /**
    * Describes the VPC endpoint connections to your VPC endpoint services, including any endpoints that are pending your acceptance.
    */
  def describeVpcEndpointConnections(params: DescribeVpcEndpointConnectionsRequest): Request[DescribeVpcEndpointConnectionsResult, AWSError] = js.native
  def describeVpcEndpointConnections(
    params: DescribeVpcEndpointConnectionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVpcEndpointConnectionsResult, Unit]
  ): Request[DescribeVpcEndpointConnectionsResult, AWSError] = js.native
  /**
    * Describes the VPC endpoint service configurations in your account (your services).
    */
  def describeVpcEndpointServiceConfigurations(): Request[DescribeVpcEndpointServiceConfigurationsResult, AWSError] = js.native
  def describeVpcEndpointServiceConfigurations(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVpcEndpointServiceConfigurationsResult, Unit]
  ): Request[DescribeVpcEndpointServiceConfigurationsResult, AWSError] = js.native
  /**
    * Describes the VPC endpoint service configurations in your account (your services).
    */
  def describeVpcEndpointServiceConfigurations(params: DescribeVpcEndpointServiceConfigurationsRequest): Request[DescribeVpcEndpointServiceConfigurationsResult, AWSError] = js.native
  def describeVpcEndpointServiceConfigurations(
    params: DescribeVpcEndpointServiceConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVpcEndpointServiceConfigurationsResult, Unit]
  ): Request[DescribeVpcEndpointServiceConfigurationsResult, AWSError] = js.native
  /**
    * Describes the principals (service consumers) that are permitted to discover your VPC endpoint service.
    */
  def describeVpcEndpointServicePermissions(): Request[DescribeVpcEndpointServicePermissionsResult, AWSError] = js.native
  def describeVpcEndpointServicePermissions(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVpcEndpointServicePermissionsResult, Unit]
  ): Request[DescribeVpcEndpointServicePermissionsResult, AWSError] = js.native
  /**
    * Describes the principals (service consumers) that are permitted to discover your VPC endpoint service.
    */
  def describeVpcEndpointServicePermissions(params: DescribeVpcEndpointServicePermissionsRequest): Request[DescribeVpcEndpointServicePermissionsResult, AWSError] = js.native
  def describeVpcEndpointServicePermissions(
    params: DescribeVpcEndpointServicePermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVpcEndpointServicePermissionsResult, Unit]
  ): Request[DescribeVpcEndpointServicePermissionsResult, AWSError] = js.native
  /**
    * Describes available services to which you can create a VPC endpoint.
    */
  def describeVpcEndpointServices(): Request[DescribeVpcEndpointServicesResult, AWSError] = js.native
  def describeVpcEndpointServices(callback: js.Function2[/* err */ AWSError, /* data */ DescribeVpcEndpointServicesResult, Unit]): Request[DescribeVpcEndpointServicesResult, AWSError] = js.native
  /**
    * Describes available services to which you can create a VPC endpoint.
    */
  def describeVpcEndpointServices(params: DescribeVpcEndpointServicesRequest): Request[DescribeVpcEndpointServicesResult, AWSError] = js.native
  def describeVpcEndpointServices(
    params: DescribeVpcEndpointServicesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVpcEndpointServicesResult, Unit]
  ): Request[DescribeVpcEndpointServicesResult, AWSError] = js.native
  /**
    * Describes one or more of your VPC endpoints.
    */
  def describeVpcEndpoints(): Request[DescribeVpcEndpointsResult, AWSError] = js.native
  def describeVpcEndpoints(callback: js.Function2[/* err */ AWSError, /* data */ DescribeVpcEndpointsResult, Unit]): Request[DescribeVpcEndpointsResult, AWSError] = js.native
  /**
    * Describes one or more of your VPC endpoints.
    */
  def describeVpcEndpoints(params: DescribeVpcEndpointsRequest): Request[DescribeVpcEndpointsResult, AWSError] = js.native
  def describeVpcEndpoints(
    params: DescribeVpcEndpointsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVpcEndpointsResult, Unit]
  ): Request[DescribeVpcEndpointsResult, AWSError] = js.native
  /**
    * Describes one or more of your VPC peering connections.
    */
  def describeVpcPeeringConnections(): Request[DescribeVpcPeeringConnectionsResult, AWSError] = js.native
  def describeVpcPeeringConnections(callback: js.Function2[/* err */ AWSError, /* data */ DescribeVpcPeeringConnectionsResult, Unit]): Request[DescribeVpcPeeringConnectionsResult, AWSError] = js.native
  /**
    * Describes one or more of your VPC peering connections.
    */
  def describeVpcPeeringConnections(params: DescribeVpcPeeringConnectionsRequest): Request[DescribeVpcPeeringConnectionsResult, AWSError] = js.native
  def describeVpcPeeringConnections(
    params: DescribeVpcPeeringConnectionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVpcPeeringConnectionsResult, Unit]
  ): Request[DescribeVpcPeeringConnectionsResult, AWSError] = js.native
  /**
    * Describes one or more of your VPCs.
    */
  def describeVpcs(): Request[DescribeVpcsResult, AWSError] = js.native
  def describeVpcs(callback: js.Function2[/* err */ AWSError, /* data */ DescribeVpcsResult, Unit]): Request[DescribeVpcsResult, AWSError] = js.native
  /**
    * Describes one or more of your VPCs.
    */
  def describeVpcs(params: DescribeVpcsRequest): Request[DescribeVpcsResult, AWSError] = js.native
  def describeVpcs(
    params: DescribeVpcsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVpcsResult, Unit]
  ): Request[DescribeVpcsResult, AWSError] = js.native
  /**
    * Describes one or more of your VPN connections. For more information, see AWS Site-to-Site VPN in the AWS Site-to-Site VPN User Guide.
    */
  def describeVpnConnections(): Request[DescribeVpnConnectionsResult, AWSError] = js.native
  def describeVpnConnections(callback: js.Function2[/* err */ AWSError, /* data */ DescribeVpnConnectionsResult, Unit]): Request[DescribeVpnConnectionsResult, AWSError] = js.native
  /**
    * Describes one or more of your VPN connections. For more information, see AWS Site-to-Site VPN in the AWS Site-to-Site VPN User Guide.
    */
  def describeVpnConnections(params: DescribeVpnConnectionsRequest): Request[DescribeVpnConnectionsResult, AWSError] = js.native
  def describeVpnConnections(
    params: DescribeVpnConnectionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVpnConnectionsResult, Unit]
  ): Request[DescribeVpnConnectionsResult, AWSError] = js.native
  /**
    * Describes one or more of your virtual private gateways. For more information, see AWS Site-to-Site VPN in the AWS Site-to-Site VPN User Guide.
    */
  def describeVpnGateways(): Request[DescribeVpnGatewaysResult, AWSError] = js.native
  def describeVpnGateways(callback: js.Function2[/* err */ AWSError, /* data */ DescribeVpnGatewaysResult, Unit]): Request[DescribeVpnGatewaysResult, AWSError] = js.native
  /**
    * Describes one or more of your virtual private gateways. For more information, see AWS Site-to-Site VPN in the AWS Site-to-Site VPN User Guide.
    */
  def describeVpnGateways(params: DescribeVpnGatewaysRequest): Request[DescribeVpnGatewaysResult, AWSError] = js.native
  def describeVpnGateways(
    params: DescribeVpnGatewaysRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVpnGatewaysResult, Unit]
  ): Request[DescribeVpnGatewaysResult, AWSError] = js.native
  /**
    * Unlinks (detaches) a linked EC2-Classic instance from a VPC. After the instance has been unlinked, the VPC security groups are no longer associated with it. An instance is automatically unlinked from a VPC when it's stopped.
    */
  def detachClassicLinkVpc(): Request[DetachClassicLinkVpcResult, AWSError] = js.native
  def detachClassicLinkVpc(callback: js.Function2[/* err */ AWSError, /* data */ DetachClassicLinkVpcResult, Unit]): Request[DetachClassicLinkVpcResult, AWSError] = js.native
  /**
    * Unlinks (detaches) a linked EC2-Classic instance from a VPC. After the instance has been unlinked, the VPC security groups are no longer associated with it. An instance is automatically unlinked from a VPC when it's stopped.
    */
  def detachClassicLinkVpc(params: DetachClassicLinkVpcRequest): Request[DetachClassicLinkVpcResult, AWSError] = js.native
  def detachClassicLinkVpc(
    params: DetachClassicLinkVpcRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DetachClassicLinkVpcResult, Unit]
  ): Request[DetachClassicLinkVpcResult, AWSError] = js.native
  /**
    * Detaches an internet gateway from a VPC, disabling connectivity between the internet and the VPC. The VPC must not contain any running instances with Elastic IP addresses or public IPv4 addresses.
    */
  def detachInternetGateway(): Request[js.Object, AWSError] = js.native
  def detachInternetGateway(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Detaches an internet gateway from a VPC, disabling connectivity between the internet and the VPC. The VPC must not contain any running instances with Elastic IP addresses or public IPv4 addresses.
    */
  def detachInternetGateway(params: DetachInternetGatewayRequest): Request[js.Object, AWSError] = js.native
  def detachInternetGateway(
    params: DetachInternetGatewayRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Detaches a network interface from an instance.
    */
  def detachNetworkInterface(): Request[js.Object, AWSError] = js.native
  def detachNetworkInterface(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Detaches a network interface from an instance.
    */
  def detachNetworkInterface(params: DetachNetworkInterfaceRequest): Request[js.Object, AWSError] = js.native
  def detachNetworkInterface(
    params: DetachNetworkInterfaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Detaches an EBS volume from an instance. Make sure to unmount any file systems on the device within your operating system before detaching the volume. Failure to do so can result in the volume becoming stuck in the busy state while detaching. If this happens, detachment can be delayed indefinitely until you unmount the volume, force detachment, reboot the instance, or all three. If an EBS volume is the root device of an instance, it can't be detached while the instance is running. To detach the root volume, stop the instance first. When a volume with an AWS Marketplace product code is detached from an instance, the product code is no longer associated with the instance. For more information, see Detaching an Amazon EBS Volume in the Amazon Elastic Compute Cloud User Guide.
    */
  def detachVolume(): Request[VolumeAttachment, AWSError] = js.native
  def detachVolume(callback: js.Function2[/* err */ AWSError, /* data */ VolumeAttachment, Unit]): Request[VolumeAttachment, AWSError] = js.native
  /**
    * Detaches an EBS volume from an instance. Make sure to unmount any file systems on the device within your operating system before detaching the volume. Failure to do so can result in the volume becoming stuck in the busy state while detaching. If this happens, detachment can be delayed indefinitely until you unmount the volume, force detachment, reboot the instance, or all three. If an EBS volume is the root device of an instance, it can't be detached while the instance is running. To detach the root volume, stop the instance first. When a volume with an AWS Marketplace product code is detached from an instance, the product code is no longer associated with the instance. For more information, see Detaching an Amazon EBS Volume in the Amazon Elastic Compute Cloud User Guide.
    */
  def detachVolume(params: DetachVolumeRequest): Request[VolumeAttachment, AWSError] = js.native
  def detachVolume(
    params: DetachVolumeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ VolumeAttachment, Unit]
  ): Request[VolumeAttachment, AWSError] = js.native
  /**
    * Detaches a virtual private gateway from a VPC. You do this if you're planning to turn off the VPC and not use it anymore. You can confirm a virtual private gateway has been completely detached from a VPC by describing the virtual private gateway (any attachments to the virtual private gateway are also described). You must wait for the attachment's state to switch to detached before you can delete the VPC or attach a different VPC to the virtual private gateway.
    */
  def detachVpnGateway(): Request[js.Object, AWSError] = js.native
  def detachVpnGateway(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Detaches a virtual private gateway from a VPC. You do this if you're planning to turn off the VPC and not use it anymore. You can confirm a virtual private gateway has been completely detached from a VPC by describing the virtual private gateway (any attachments to the virtual private gateway are also described). You must wait for the attachment's state to switch to detached before you can delete the VPC or attach a different VPC to the virtual private gateway.
    */
  def detachVpnGateway(params: DetachVpnGatewayRequest): Request[js.Object, AWSError] = js.native
  def detachVpnGateway(
    params: DetachVpnGatewayRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Disables EBS encryption by default for your account in the current Region. After you disable encryption by default, you can still create encrypted volumes by enabling encryption when you create each volume. Disabling encryption by default does not change the encryption status of your existing volumes. For more information, see Amazon EBS Encryption in the Amazon Elastic Compute Cloud User Guide.
    */
  def disableEbsEncryptionByDefault(): Request[DisableEbsEncryptionByDefaultResult, AWSError] = js.native
  def disableEbsEncryptionByDefault(callback: js.Function2[/* err */ AWSError, /* data */ DisableEbsEncryptionByDefaultResult, Unit]): Request[DisableEbsEncryptionByDefaultResult, AWSError] = js.native
  /**
    * Disables EBS encryption by default for your account in the current Region. After you disable encryption by default, you can still create encrypted volumes by enabling encryption when you create each volume. Disabling encryption by default does not change the encryption status of your existing volumes. For more information, see Amazon EBS Encryption in the Amazon Elastic Compute Cloud User Guide.
    */
  def disableEbsEncryptionByDefault(params: DisableEbsEncryptionByDefaultRequest): Request[DisableEbsEncryptionByDefaultResult, AWSError] = js.native
  def disableEbsEncryptionByDefault(
    params: DisableEbsEncryptionByDefaultRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisableEbsEncryptionByDefaultResult, Unit]
  ): Request[DisableEbsEncryptionByDefaultResult, AWSError] = js.native
  /**
    * Disables fast snapshot restores for the specified snapshots in the specified Availability Zones.
    */
  def disableFastSnapshotRestores(): Request[DisableFastSnapshotRestoresResult, AWSError] = js.native
  def disableFastSnapshotRestores(callback: js.Function2[/* err */ AWSError, /* data */ DisableFastSnapshotRestoresResult, Unit]): Request[DisableFastSnapshotRestoresResult, AWSError] = js.native
  /**
    * Disables fast snapshot restores for the specified snapshots in the specified Availability Zones.
    */
  def disableFastSnapshotRestores(params: DisableFastSnapshotRestoresRequest): Request[DisableFastSnapshotRestoresResult, AWSError] = js.native
  def disableFastSnapshotRestores(
    params: DisableFastSnapshotRestoresRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisableFastSnapshotRestoresResult, Unit]
  ): Request[DisableFastSnapshotRestoresResult, AWSError] = js.native
  /**
    * Disables the specified resource attachment from propagating routes to the specified propagation route table.
    */
  def disableTransitGatewayRouteTablePropagation(): Request[DisableTransitGatewayRouteTablePropagationResult, AWSError] = js.native
  def disableTransitGatewayRouteTablePropagation(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DisableTransitGatewayRouteTablePropagationResult, 
      Unit
    ]
  ): Request[DisableTransitGatewayRouteTablePropagationResult, AWSError] = js.native
  /**
    * Disables the specified resource attachment from propagating routes to the specified propagation route table.
    */
  def disableTransitGatewayRouteTablePropagation(params: DisableTransitGatewayRouteTablePropagationRequest): Request[DisableTransitGatewayRouteTablePropagationResult, AWSError] = js.native
  def disableTransitGatewayRouteTablePropagation(
    params: DisableTransitGatewayRouteTablePropagationRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DisableTransitGatewayRouteTablePropagationResult, 
      Unit
    ]
  ): Request[DisableTransitGatewayRouteTablePropagationResult, AWSError] = js.native
  /**
    * Disables a virtual private gateway (VGW) from propagating routes to a specified route table of a VPC.
    */
  def disableVgwRoutePropagation(): Request[js.Object, AWSError] = js.native
  def disableVgwRoutePropagation(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Disables a virtual private gateway (VGW) from propagating routes to a specified route table of a VPC.
    */
  def disableVgwRoutePropagation(params: DisableVgwRoutePropagationRequest): Request[js.Object, AWSError] = js.native
  def disableVgwRoutePropagation(
    params: DisableVgwRoutePropagationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Disables ClassicLink for a VPC. You cannot disable ClassicLink for a VPC that has EC2-Classic instances linked to it.
    */
  def disableVpcClassicLink(): Request[DisableVpcClassicLinkResult, AWSError] = js.native
  def disableVpcClassicLink(callback: js.Function2[/* err */ AWSError, /* data */ DisableVpcClassicLinkResult, Unit]): Request[DisableVpcClassicLinkResult, AWSError] = js.native
  /**
    * Disables ClassicLink for a VPC. You cannot disable ClassicLink for a VPC that has EC2-Classic instances linked to it.
    */
  def disableVpcClassicLink(params: DisableVpcClassicLinkRequest): Request[DisableVpcClassicLinkResult, AWSError] = js.native
  def disableVpcClassicLink(
    params: DisableVpcClassicLinkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisableVpcClassicLinkResult, Unit]
  ): Request[DisableVpcClassicLinkResult, AWSError] = js.native
  /**
    * Disables ClassicLink DNS support for a VPC. If disabled, DNS hostnames resolve to public IP addresses when addressed between a linked EC2-Classic instance and instances in the VPC to which it's linked. For more information, see ClassicLink in the Amazon Elastic Compute Cloud User Guide.
    */
  def disableVpcClassicLinkDnsSupport(): Request[DisableVpcClassicLinkDnsSupportResult, AWSError] = js.native
  def disableVpcClassicLinkDnsSupport(callback: js.Function2[/* err */ AWSError, /* data */ DisableVpcClassicLinkDnsSupportResult, Unit]): Request[DisableVpcClassicLinkDnsSupportResult, AWSError] = js.native
  /**
    * Disables ClassicLink DNS support for a VPC. If disabled, DNS hostnames resolve to public IP addresses when addressed between a linked EC2-Classic instance and instances in the VPC to which it's linked. For more information, see ClassicLink in the Amazon Elastic Compute Cloud User Guide.
    */
  def disableVpcClassicLinkDnsSupport(params: DisableVpcClassicLinkDnsSupportRequest): Request[DisableVpcClassicLinkDnsSupportResult, AWSError] = js.native
  def disableVpcClassicLinkDnsSupport(
    params: DisableVpcClassicLinkDnsSupportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisableVpcClassicLinkDnsSupportResult, Unit]
  ): Request[DisableVpcClassicLinkDnsSupportResult, AWSError] = js.native
  /**
    * Disassociates an Elastic IP address from the instance or network interface it's associated with. An Elastic IP address is for use in either the EC2-Classic platform or in a VPC. For more information, see Elastic IP Addresses in the Amazon Elastic Compute Cloud User Guide. This is an idempotent operation. If you perform the operation more than once, Amazon EC2 doesn't return an error.
    */
  def disassociateAddress(): Request[js.Object, AWSError] = js.native
  def disassociateAddress(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Disassociates an Elastic IP address from the instance or network interface it's associated with. An Elastic IP address is for use in either the EC2-Classic platform or in a VPC. For more information, see Elastic IP Addresses in the Amazon Elastic Compute Cloud User Guide. This is an idempotent operation. If you perform the operation more than once, Amazon EC2 doesn't return an error.
    */
  def disassociateAddress(params: DisassociateAddressRequest): Request[js.Object, AWSError] = js.native
  def disassociateAddress(
    params: DisassociateAddressRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Disassociates a target network from the specified Client VPN endpoint. When you disassociate the last target network from a Client VPN, the following happens:   The route that was automatically added for the VPC is deleted   All active client connections are terminated   New client connections are disallowed   The Client VPN endpoint's status changes to pending-associate   
    */
  def disassociateClientVpnTargetNetwork(): Request[DisassociateClientVpnTargetNetworkResult, AWSError] = js.native
  def disassociateClientVpnTargetNetwork(
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateClientVpnTargetNetworkResult, Unit]
  ): Request[DisassociateClientVpnTargetNetworkResult, AWSError] = js.native
  /**
    * Disassociates a target network from the specified Client VPN endpoint. When you disassociate the last target network from a Client VPN, the following happens:   The route that was automatically added for the VPC is deleted   All active client connections are terminated   New client connections are disallowed   The Client VPN endpoint's status changes to pending-associate   
    */
  def disassociateClientVpnTargetNetwork(params: DisassociateClientVpnTargetNetworkRequest): Request[DisassociateClientVpnTargetNetworkResult, AWSError] = js.native
  def disassociateClientVpnTargetNetwork(
    params: DisassociateClientVpnTargetNetworkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateClientVpnTargetNetworkResult, Unit]
  ): Request[DisassociateClientVpnTargetNetworkResult, AWSError] = js.native
  /**
    * Disassociates an IAM instance profile from a running or stopped instance. Use DescribeIamInstanceProfileAssociations to get the association ID.
    */
  def disassociateIamInstanceProfile(): Request[DisassociateIamInstanceProfileResult, AWSError] = js.native
  def disassociateIamInstanceProfile(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateIamInstanceProfileResult, Unit]): Request[DisassociateIamInstanceProfileResult, AWSError] = js.native
  /**
    * Disassociates an IAM instance profile from a running or stopped instance. Use DescribeIamInstanceProfileAssociations to get the association ID.
    */
  def disassociateIamInstanceProfile(params: DisassociateIamInstanceProfileRequest): Request[DisassociateIamInstanceProfileResult, AWSError] = js.native
  def disassociateIamInstanceProfile(
    params: DisassociateIamInstanceProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateIamInstanceProfileResult, Unit]
  ): Request[DisassociateIamInstanceProfileResult, AWSError] = js.native
  /**
    * Disassociates a subnet from a route table. After you perform this action, the subnet no longer uses the routes in the route table. Instead, it uses the routes in the VPC's main route table. For more information about route tables, see Route Tables in the Amazon Virtual Private Cloud User Guide.
    */
  def disassociateRouteTable(): Request[js.Object, AWSError] = js.native
  def disassociateRouteTable(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Disassociates a subnet from a route table. After you perform this action, the subnet no longer uses the routes in the route table. Instead, it uses the routes in the VPC's main route table. For more information about route tables, see Route Tables in the Amazon Virtual Private Cloud User Guide.
    */
  def disassociateRouteTable(params: DisassociateRouteTableRequest): Request[js.Object, AWSError] = js.native
  def disassociateRouteTable(
    params: DisassociateRouteTableRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Disassociates a CIDR block from a subnet. Currently, you can disassociate an IPv6 CIDR block only. You must detach or delete all gateways and resources that are associated with the CIDR block before you can disassociate it. 
    */
  def disassociateSubnetCidrBlock(): Request[DisassociateSubnetCidrBlockResult, AWSError] = js.native
  def disassociateSubnetCidrBlock(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateSubnetCidrBlockResult, Unit]): Request[DisassociateSubnetCidrBlockResult, AWSError] = js.native
  /**
    * Disassociates a CIDR block from a subnet. Currently, you can disassociate an IPv6 CIDR block only. You must detach or delete all gateways and resources that are associated with the CIDR block before you can disassociate it. 
    */
  def disassociateSubnetCidrBlock(params: DisassociateSubnetCidrBlockRequest): Request[DisassociateSubnetCidrBlockResult, AWSError] = js.native
  def disassociateSubnetCidrBlock(
    params: DisassociateSubnetCidrBlockRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateSubnetCidrBlockResult, Unit]
  ): Request[DisassociateSubnetCidrBlockResult, AWSError] = js.native
  /**
    * Disassociates the specified subnets from the transit gateway multicast domain. 
    */
  def disassociateTransitGatewayMulticastDomain(): Request[DisassociateTransitGatewayMulticastDomainResult, AWSError] = js.native
  def disassociateTransitGatewayMulticastDomain(
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateTransitGatewayMulticastDomainResult, Unit]
  ): Request[DisassociateTransitGatewayMulticastDomainResult, AWSError] = js.native
  /**
    * Disassociates the specified subnets from the transit gateway multicast domain. 
    */
  def disassociateTransitGatewayMulticastDomain(params: DisassociateTransitGatewayMulticastDomainRequest): Request[DisassociateTransitGatewayMulticastDomainResult, AWSError] = js.native
  def disassociateTransitGatewayMulticastDomain(
    params: DisassociateTransitGatewayMulticastDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateTransitGatewayMulticastDomainResult, Unit]
  ): Request[DisassociateTransitGatewayMulticastDomainResult, AWSError] = js.native
  /**
    * Disassociates a resource attachment from a transit gateway route table.
    */
  def disassociateTransitGatewayRouteTable(): Request[DisassociateTransitGatewayRouteTableResult, AWSError] = js.native
  def disassociateTransitGatewayRouteTable(
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateTransitGatewayRouteTableResult, Unit]
  ): Request[DisassociateTransitGatewayRouteTableResult, AWSError] = js.native
  /**
    * Disassociates a resource attachment from a transit gateway route table.
    */
  def disassociateTransitGatewayRouteTable(params: DisassociateTransitGatewayRouteTableRequest): Request[DisassociateTransitGatewayRouteTableResult, AWSError] = js.native
  def disassociateTransitGatewayRouteTable(
    params: DisassociateTransitGatewayRouteTableRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateTransitGatewayRouteTableResult, Unit]
  ): Request[DisassociateTransitGatewayRouteTableResult, AWSError] = js.native
  /**
    * Disassociates a CIDR block from a VPC. To disassociate the CIDR block, you must specify its association ID. You can get the association ID by using DescribeVpcs. You must detach or delete all gateways and resources that are associated with the CIDR block before you can disassociate it.  You cannot disassociate the CIDR block with which you originally created the VPC (the primary CIDR block).
    */
  def disassociateVpcCidrBlock(): Request[DisassociateVpcCidrBlockResult, AWSError] = js.native
  def disassociateVpcCidrBlock(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateVpcCidrBlockResult, Unit]): Request[DisassociateVpcCidrBlockResult, AWSError] = js.native
  /**
    * Disassociates a CIDR block from a VPC. To disassociate the CIDR block, you must specify its association ID. You can get the association ID by using DescribeVpcs. You must detach or delete all gateways and resources that are associated with the CIDR block before you can disassociate it.  You cannot disassociate the CIDR block with which you originally created the VPC (the primary CIDR block).
    */
  def disassociateVpcCidrBlock(params: DisassociateVpcCidrBlockRequest): Request[DisassociateVpcCidrBlockResult, AWSError] = js.native
  def disassociateVpcCidrBlock(
    params: DisassociateVpcCidrBlockRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateVpcCidrBlockResult, Unit]
  ): Request[DisassociateVpcCidrBlockResult, AWSError] = js.native
  /**
    * Enables EBS encryption by default for your account in the current Region. After you enable encryption by default, the EBS volumes that you create are are always encrypted, either using the default CMK or the CMK that you specified when you created each volume. For more information, see Amazon EBS Encryption in the Amazon Elastic Compute Cloud User Guide. You can specify the default CMK for encryption by default using ModifyEbsDefaultKmsKeyId or ResetEbsDefaultKmsKeyId. Enabling encryption by default has no effect on the encryption status of your existing volumes. After you enable encryption by default, you can no longer launch instances using instance types that do not support encryption. For more information, see Supported Instance Types.
    */
  def enableEbsEncryptionByDefault(): Request[EnableEbsEncryptionByDefaultResult, AWSError] = js.native
  def enableEbsEncryptionByDefault(callback: js.Function2[/* err */ AWSError, /* data */ EnableEbsEncryptionByDefaultResult, Unit]): Request[EnableEbsEncryptionByDefaultResult, AWSError] = js.native
  /**
    * Enables EBS encryption by default for your account in the current Region. After you enable encryption by default, the EBS volumes that you create are are always encrypted, either using the default CMK or the CMK that you specified when you created each volume. For more information, see Amazon EBS Encryption in the Amazon Elastic Compute Cloud User Guide. You can specify the default CMK for encryption by default using ModifyEbsDefaultKmsKeyId or ResetEbsDefaultKmsKeyId. Enabling encryption by default has no effect on the encryption status of your existing volumes. After you enable encryption by default, you can no longer launch instances using instance types that do not support encryption. For more information, see Supported Instance Types.
    */
  def enableEbsEncryptionByDefault(params: EnableEbsEncryptionByDefaultRequest): Request[EnableEbsEncryptionByDefaultResult, AWSError] = js.native
  def enableEbsEncryptionByDefault(
    params: EnableEbsEncryptionByDefaultRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ EnableEbsEncryptionByDefaultResult, Unit]
  ): Request[EnableEbsEncryptionByDefaultResult, AWSError] = js.native
  /**
    * Enables fast snapshot restores for the specified snapshots in the specified Availability Zones. You get the full benefit of fast snapshot restores after they enter the enabled state. To get the current state of fast snapshot restores, use DescribeFastSnapshotRestores. To disable fast snapshot restores, use DisableFastSnapshotRestores.
    */
  def enableFastSnapshotRestores(): Request[EnableFastSnapshotRestoresResult, AWSError] = js.native
  def enableFastSnapshotRestores(callback: js.Function2[/* err */ AWSError, /* data */ EnableFastSnapshotRestoresResult, Unit]): Request[EnableFastSnapshotRestoresResult, AWSError] = js.native
  /**
    * Enables fast snapshot restores for the specified snapshots in the specified Availability Zones. You get the full benefit of fast snapshot restores after they enter the enabled state. To get the current state of fast snapshot restores, use DescribeFastSnapshotRestores. To disable fast snapshot restores, use DisableFastSnapshotRestores.
    */
  def enableFastSnapshotRestores(params: EnableFastSnapshotRestoresRequest): Request[EnableFastSnapshotRestoresResult, AWSError] = js.native
  def enableFastSnapshotRestores(
    params: EnableFastSnapshotRestoresRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ EnableFastSnapshotRestoresResult, Unit]
  ): Request[EnableFastSnapshotRestoresResult, AWSError] = js.native
  /**
    * Enables the specified attachment to propagate routes to the specified propagation route table.
    */
  def enableTransitGatewayRouteTablePropagation(): Request[EnableTransitGatewayRouteTablePropagationResult, AWSError] = js.native
  def enableTransitGatewayRouteTablePropagation(
    callback: js.Function2[/* err */ AWSError, /* data */ EnableTransitGatewayRouteTablePropagationResult, Unit]
  ): Request[EnableTransitGatewayRouteTablePropagationResult, AWSError] = js.native
  /**
    * Enables the specified attachment to propagate routes to the specified propagation route table.
    */
  def enableTransitGatewayRouteTablePropagation(params: EnableTransitGatewayRouteTablePropagationRequest): Request[EnableTransitGatewayRouteTablePropagationResult, AWSError] = js.native
  def enableTransitGatewayRouteTablePropagation(
    params: EnableTransitGatewayRouteTablePropagationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ EnableTransitGatewayRouteTablePropagationResult, Unit]
  ): Request[EnableTransitGatewayRouteTablePropagationResult, AWSError] = js.native
  /**
    * Enables a virtual private gateway (VGW) to propagate routes to the specified route table of a VPC.
    */
  def enableVgwRoutePropagation(): Request[js.Object, AWSError] = js.native
  def enableVgwRoutePropagation(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Enables a virtual private gateway (VGW) to propagate routes to the specified route table of a VPC.
    */
  def enableVgwRoutePropagation(params: EnableVgwRoutePropagationRequest): Request[js.Object, AWSError] = js.native
  def enableVgwRoutePropagation(
    params: EnableVgwRoutePropagationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Enables I/O operations for a volume that had I/O operations disabled because the data on the volume was potentially inconsistent.
    */
  def enableVolumeIO(): Request[js.Object, AWSError] = js.native
  def enableVolumeIO(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Enables I/O operations for a volume that had I/O operations disabled because the data on the volume was potentially inconsistent.
    */
  def enableVolumeIO(params: EnableVolumeIORequest): Request[js.Object, AWSError] = js.native
  def enableVolumeIO(
    params: EnableVolumeIORequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Enables a VPC for ClassicLink. You can then link EC2-Classic instances to your ClassicLink-enabled VPC to allow communication over private IP addresses. You cannot enable your VPC for ClassicLink if any of your VPC route tables have existing routes for address ranges within the 10.0.0.0/8 IP address range, excluding local routes for VPCs in the 10.0.0.0/16 and 10.1.0.0/16 IP address ranges. For more information, see ClassicLink in the Amazon Elastic Compute Cloud User Guide.
    */
  def enableVpcClassicLink(): Request[EnableVpcClassicLinkResult, AWSError] = js.native
  def enableVpcClassicLink(callback: js.Function2[/* err */ AWSError, /* data */ EnableVpcClassicLinkResult, Unit]): Request[EnableVpcClassicLinkResult, AWSError] = js.native
  /**
    * Enables a VPC for ClassicLink. You can then link EC2-Classic instances to your ClassicLink-enabled VPC to allow communication over private IP addresses. You cannot enable your VPC for ClassicLink if any of your VPC route tables have existing routes for address ranges within the 10.0.0.0/8 IP address range, excluding local routes for VPCs in the 10.0.0.0/16 and 10.1.0.0/16 IP address ranges. For more information, see ClassicLink in the Amazon Elastic Compute Cloud User Guide.
    */
  def enableVpcClassicLink(params: EnableVpcClassicLinkRequest): Request[EnableVpcClassicLinkResult, AWSError] = js.native
  def enableVpcClassicLink(
    params: EnableVpcClassicLinkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ EnableVpcClassicLinkResult, Unit]
  ): Request[EnableVpcClassicLinkResult, AWSError] = js.native
  /**
    * Enables a VPC to support DNS hostname resolution for ClassicLink. If enabled, the DNS hostname of a linked EC2-Classic instance resolves to its private IP address when addressed from an instance in the VPC to which it's linked. Similarly, the DNS hostname of an instance in a VPC resolves to its private IP address when addressed from a linked EC2-Classic instance. For more information, see ClassicLink in the Amazon Elastic Compute Cloud User Guide.
    */
  def enableVpcClassicLinkDnsSupport(): Request[EnableVpcClassicLinkDnsSupportResult, AWSError] = js.native
  def enableVpcClassicLinkDnsSupport(callback: js.Function2[/* err */ AWSError, /* data */ EnableVpcClassicLinkDnsSupportResult, Unit]): Request[EnableVpcClassicLinkDnsSupportResult, AWSError] = js.native
  /**
    * Enables a VPC to support DNS hostname resolution for ClassicLink. If enabled, the DNS hostname of a linked EC2-Classic instance resolves to its private IP address when addressed from an instance in the VPC to which it's linked. Similarly, the DNS hostname of an instance in a VPC resolves to its private IP address when addressed from a linked EC2-Classic instance. For more information, see ClassicLink in the Amazon Elastic Compute Cloud User Guide.
    */
  def enableVpcClassicLinkDnsSupport(params: EnableVpcClassicLinkDnsSupportRequest): Request[EnableVpcClassicLinkDnsSupportResult, AWSError] = js.native
  def enableVpcClassicLinkDnsSupport(
    params: EnableVpcClassicLinkDnsSupportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ EnableVpcClassicLinkDnsSupportResult, Unit]
  ): Request[EnableVpcClassicLinkDnsSupportResult, AWSError] = js.native
  /**
    * Downloads the client certificate revocation list for the specified Client VPN endpoint.
    */
  def exportClientVpnClientCertificateRevocationList(): Request[ExportClientVpnClientCertificateRevocationListResult, AWSError] = js.native
  def exportClientVpnClientCertificateRevocationList(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ ExportClientVpnClientCertificateRevocationListResult, 
      Unit
    ]
  ): Request[ExportClientVpnClientCertificateRevocationListResult, AWSError] = js.native
  /**
    * Downloads the client certificate revocation list for the specified Client VPN endpoint.
    */
  def exportClientVpnClientCertificateRevocationList(params: ExportClientVpnClientCertificateRevocationListRequest): Request[ExportClientVpnClientCertificateRevocationListResult, AWSError] = js.native
  def exportClientVpnClientCertificateRevocationList(
    params: ExportClientVpnClientCertificateRevocationListRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ ExportClientVpnClientCertificateRevocationListResult, 
      Unit
    ]
  ): Request[ExportClientVpnClientCertificateRevocationListResult, AWSError] = js.native
  /**
    * Downloads the contents of the Client VPN endpoint configuration file for the specified Client VPN endpoint. The Client VPN endpoint configuration file includes the Client VPN endpoint and certificate information clients need to establish a connection with the Client VPN endpoint.
    */
  def exportClientVpnClientConfiguration(): Request[ExportClientVpnClientConfigurationResult, AWSError] = js.native
  def exportClientVpnClientConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ ExportClientVpnClientConfigurationResult, Unit]
  ): Request[ExportClientVpnClientConfigurationResult, AWSError] = js.native
  /**
    * Downloads the contents of the Client VPN endpoint configuration file for the specified Client VPN endpoint. The Client VPN endpoint configuration file includes the Client VPN endpoint and certificate information clients need to establish a connection with the Client VPN endpoint.
    */
  def exportClientVpnClientConfiguration(params: ExportClientVpnClientConfigurationRequest): Request[ExportClientVpnClientConfigurationResult, AWSError] = js.native
  def exportClientVpnClientConfiguration(
    params: ExportClientVpnClientConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ExportClientVpnClientConfigurationResult, Unit]
  ): Request[ExportClientVpnClientConfigurationResult, AWSError] = js.native
  /**
    * Exports an Amazon Machine Image (AMI) to a VM file. For more information, see Exporting a VM Directory from an Amazon Machine Image (AMI) in the VM Import/Export User Guide.
    */
  def exportImage(): Request[ExportImageResult, AWSError] = js.native
  def exportImage(callback: js.Function2[/* err */ AWSError, /* data */ ExportImageResult, Unit]): Request[ExportImageResult, AWSError] = js.native
  /**
    * Exports an Amazon Machine Image (AMI) to a VM file. For more information, see Exporting a VM Directory from an Amazon Machine Image (AMI) in the VM Import/Export User Guide.
    */
  def exportImage(params: ExportImageRequest): Request[ExportImageResult, AWSError] = js.native
  def exportImage(
    params: ExportImageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ExportImageResult, Unit]
  ): Request[ExportImageResult, AWSError] = js.native
  /**
    * Exports routes from the specified transit gateway route table to the specified S3 bucket. By default, all routes are exported. Alternatively, you can filter by CIDR range.
    */
  def exportTransitGatewayRoutes(): Request[ExportTransitGatewayRoutesResult, AWSError] = js.native
  def exportTransitGatewayRoutes(callback: js.Function2[/* err */ AWSError, /* data */ ExportTransitGatewayRoutesResult, Unit]): Request[ExportTransitGatewayRoutesResult, AWSError] = js.native
  /**
    * Exports routes from the specified transit gateway route table to the specified S3 bucket. By default, all routes are exported. Alternatively, you can filter by CIDR range.
    */
  def exportTransitGatewayRoutes(params: ExportTransitGatewayRoutesRequest): Request[ExportTransitGatewayRoutesResult, AWSError] = js.native
  def exportTransitGatewayRoutes(
    params: ExportTransitGatewayRoutesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ExportTransitGatewayRoutesResult, Unit]
  ): Request[ExportTransitGatewayRoutesResult, AWSError] = js.native
  /**
    * Gets usage information about a Capacity Reservation. If the Capacity Reservation is shared, it shows usage information for the Capacity Reservation owner and each AWS account that is currently using the shared capacity. If the Capacity Reservation is not shared, it shows only the Capacity Reservation owner's usage.
    */
  def getCapacityReservationUsage(): Request[GetCapacityReservationUsageResult, AWSError] = js.native
  def getCapacityReservationUsage(callback: js.Function2[/* err */ AWSError, /* data */ GetCapacityReservationUsageResult, Unit]): Request[GetCapacityReservationUsageResult, AWSError] = js.native
  /**
    * Gets usage information about a Capacity Reservation. If the Capacity Reservation is shared, it shows usage information for the Capacity Reservation owner and each AWS account that is currently using the shared capacity. If the Capacity Reservation is not shared, it shows only the Capacity Reservation owner's usage.
    */
  def getCapacityReservationUsage(params: GetCapacityReservationUsageRequest): Request[GetCapacityReservationUsageResult, AWSError] = js.native
  def getCapacityReservationUsage(
    params: GetCapacityReservationUsageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCapacityReservationUsageResult, Unit]
  ): Request[GetCapacityReservationUsageResult, AWSError] = js.native
  /**
    * Describes the allocations from the specified customer-owned address pool.
    */
  def getCoipPoolUsage(): Request[GetCoipPoolUsageResult, AWSError] = js.native
  def getCoipPoolUsage(callback: js.Function2[/* err */ AWSError, /* data */ GetCoipPoolUsageResult, Unit]): Request[GetCoipPoolUsageResult, AWSError] = js.native
  /**
    * Describes the allocations from the specified customer-owned address pool.
    */
  def getCoipPoolUsage(params: GetCoipPoolUsageRequest): Request[GetCoipPoolUsageResult, AWSError] = js.native
  def getCoipPoolUsage(
    params: GetCoipPoolUsageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCoipPoolUsageResult, Unit]
  ): Request[GetCoipPoolUsageResult, AWSError] = js.native
  /**
    * Gets the console output for the specified instance. For Linux instances, the instance console output displays the exact console output that would normally be displayed on a physical monitor attached to a computer. For Windows instances, the instance console output includes the last three system event log errors. By default, the console output returns buffered information that was posted shortly after an instance transition state (start, stop, reboot, or terminate). This information is available for at least one hour after the most recent post. Only the most recent 64 KB of console output is available. You can optionally retrieve the latest serial console output at any time during the instance lifecycle. This option is supported on instance types that use the Nitro hypervisor. For more information, see Instance Console Output in the Amazon Elastic Compute Cloud User Guide.
    */
  def getConsoleOutput(): Request[GetConsoleOutputResult, AWSError] = js.native
  def getConsoleOutput(callback: js.Function2[/* err */ AWSError, /* data */ GetConsoleOutputResult, Unit]): Request[GetConsoleOutputResult, AWSError] = js.native
  /**
    * Gets the console output for the specified instance. For Linux instances, the instance console output displays the exact console output that would normally be displayed on a physical monitor attached to a computer. For Windows instances, the instance console output includes the last three system event log errors. By default, the console output returns buffered information that was posted shortly after an instance transition state (start, stop, reboot, or terminate). This information is available for at least one hour after the most recent post. Only the most recent 64 KB of console output is available. You can optionally retrieve the latest serial console output at any time during the instance lifecycle. This option is supported on instance types that use the Nitro hypervisor. For more information, see Instance Console Output in the Amazon Elastic Compute Cloud User Guide.
    */
  def getConsoleOutput(params: GetConsoleOutputRequest): Request[GetConsoleOutputResult, AWSError] = js.native
  def getConsoleOutput(
    params: GetConsoleOutputRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetConsoleOutputResult, Unit]
  ): Request[GetConsoleOutputResult, AWSError] = js.native
  /**
    * Retrieve a JPG-format screenshot of a running instance to help with troubleshooting. The returned content is Base64-encoded.
    */
  def getConsoleScreenshot(): Request[GetConsoleScreenshotResult, AWSError] = js.native
  def getConsoleScreenshot(callback: js.Function2[/* err */ AWSError, /* data */ GetConsoleScreenshotResult, Unit]): Request[GetConsoleScreenshotResult, AWSError] = js.native
  /**
    * Retrieve a JPG-format screenshot of a running instance to help with troubleshooting. The returned content is Base64-encoded.
    */
  def getConsoleScreenshot(params: GetConsoleScreenshotRequest): Request[GetConsoleScreenshotResult, AWSError] = js.native
  def getConsoleScreenshot(
    params: GetConsoleScreenshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetConsoleScreenshotResult, Unit]
  ): Request[GetConsoleScreenshotResult, AWSError] = js.native
  /**
    * Describes the default credit option for CPU usage of a burstable performance instance family. For more information, see Burstable Performance Instances in the Amazon Elastic Compute Cloud User Guide.
    */
  def getDefaultCreditSpecification(): Request[GetDefaultCreditSpecificationResult, AWSError] = js.native
  def getDefaultCreditSpecification(callback: js.Function2[/* err */ AWSError, /* data */ GetDefaultCreditSpecificationResult, Unit]): Request[GetDefaultCreditSpecificationResult, AWSError] = js.native
  /**
    * Describes the default credit option for CPU usage of a burstable performance instance family. For more information, see Burstable Performance Instances in the Amazon Elastic Compute Cloud User Guide.
    */
  def getDefaultCreditSpecification(params: GetDefaultCreditSpecificationRequest): Request[GetDefaultCreditSpecificationResult, AWSError] = js.native
  def getDefaultCreditSpecification(
    params: GetDefaultCreditSpecificationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDefaultCreditSpecificationResult, Unit]
  ): Request[GetDefaultCreditSpecificationResult, AWSError] = js.native
  /**
    * Describes the default customer master key (CMK) for EBS encryption by default for your account in this Region. You can change the default CMK for encryption by default using ModifyEbsDefaultKmsKeyId or ResetEbsDefaultKmsKeyId. For more information, see Amazon EBS Encryption in the Amazon Elastic Compute Cloud User Guide.
    */
  def getEbsDefaultKmsKeyId(): Request[GetEbsDefaultKmsKeyIdResult, AWSError] = js.native
  def getEbsDefaultKmsKeyId(callback: js.Function2[/* err */ AWSError, /* data */ GetEbsDefaultKmsKeyIdResult, Unit]): Request[GetEbsDefaultKmsKeyIdResult, AWSError] = js.native
  /**
    * Describes the default customer master key (CMK) for EBS encryption by default for your account in this Region. You can change the default CMK for encryption by default using ModifyEbsDefaultKmsKeyId or ResetEbsDefaultKmsKeyId. For more information, see Amazon EBS Encryption in the Amazon Elastic Compute Cloud User Guide.
    */
  def getEbsDefaultKmsKeyId(params: GetEbsDefaultKmsKeyIdRequest): Request[GetEbsDefaultKmsKeyIdResult, AWSError] = js.native
  def getEbsDefaultKmsKeyId(
    params: GetEbsDefaultKmsKeyIdRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEbsDefaultKmsKeyIdResult, Unit]
  ): Request[GetEbsDefaultKmsKeyIdResult, AWSError] = js.native
  /**
    * Describes whether EBS encryption by default is enabled for your account in the current Region. For more information, see Amazon EBS Encryption in the Amazon Elastic Compute Cloud User Guide.
    */
  def getEbsEncryptionByDefault(): Request[GetEbsEncryptionByDefaultResult, AWSError] = js.native
  def getEbsEncryptionByDefault(callback: js.Function2[/* err */ AWSError, /* data */ GetEbsEncryptionByDefaultResult, Unit]): Request[GetEbsEncryptionByDefaultResult, AWSError] = js.native
  /**
    * Describes whether EBS encryption by default is enabled for your account in the current Region. For more information, see Amazon EBS Encryption in the Amazon Elastic Compute Cloud User Guide.
    */
  def getEbsEncryptionByDefault(params: GetEbsEncryptionByDefaultRequest): Request[GetEbsEncryptionByDefaultResult, AWSError] = js.native
  def getEbsEncryptionByDefault(
    params: GetEbsEncryptionByDefaultRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEbsEncryptionByDefaultResult, Unit]
  ): Request[GetEbsEncryptionByDefaultResult, AWSError] = js.native
  /**
    * Preview a reservation purchase with configurations that match those of your Dedicated Host. You must have active Dedicated Hosts in your account before you purchase a reservation. This is a preview of the PurchaseHostReservation action and does not result in the offering being purchased.
    */
  def getHostReservationPurchasePreview(): Request[GetHostReservationPurchasePreviewResult, AWSError] = js.native
  def getHostReservationPurchasePreview(
    callback: js.Function2[/* err */ AWSError, /* data */ GetHostReservationPurchasePreviewResult, Unit]
  ): Request[GetHostReservationPurchasePreviewResult, AWSError] = js.native
  /**
    * Preview a reservation purchase with configurations that match those of your Dedicated Host. You must have active Dedicated Hosts in your account before you purchase a reservation. This is a preview of the PurchaseHostReservation action and does not result in the offering being purchased.
    */
  def getHostReservationPurchasePreview(params: GetHostReservationPurchasePreviewRequest): Request[GetHostReservationPurchasePreviewResult, AWSError] = js.native
  def getHostReservationPurchasePreview(
    params: GetHostReservationPurchasePreviewRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetHostReservationPurchasePreviewResult, Unit]
  ): Request[GetHostReservationPurchasePreviewResult, AWSError] = js.native
  /**
    * Retrieves the configuration data of the specified instance. You can use this data to create a launch template.
    */
  def getLaunchTemplateData(): Request[GetLaunchTemplateDataResult, AWSError] = js.native
  def getLaunchTemplateData(callback: js.Function2[/* err */ AWSError, /* data */ GetLaunchTemplateDataResult, Unit]): Request[GetLaunchTemplateDataResult, AWSError] = js.native
  /**
    * Retrieves the configuration data of the specified instance. You can use this data to create a launch template.
    */
  def getLaunchTemplateData(params: GetLaunchTemplateDataRequest): Request[GetLaunchTemplateDataResult, AWSError] = js.native
  def getLaunchTemplateData(
    params: GetLaunchTemplateDataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLaunchTemplateDataResult, Unit]
  ): Request[GetLaunchTemplateDataResult, AWSError] = js.native
  /**
    * Retrieves the encrypted administrator password for a running Windows instance. The Windows password is generated at boot by the EC2Config service or EC2Launch scripts (Windows Server 2016 and later). This usually only happens the first time an instance is launched. For more information, see EC2Config and EC2Launch in the Amazon Elastic Compute Cloud User Guide. For the EC2Config service, the password is not generated for rebundled AMIs unless Ec2SetPassword is enabled before bundling. The password is encrypted using the key pair that you specified when you launched the instance. You must provide the corresponding key pair file. When you launch an instance, password generation and encryption may take a few minutes. If you try to retrieve the password before it's available, the output returns an empty string. We recommend that you wait up to 15 minutes after launching an instance before trying to retrieve the generated password.
    */
  def getPasswordData(): Request[GetPasswordDataResult, AWSError] = js.native
  def getPasswordData(callback: js.Function2[/* err */ AWSError, /* data */ GetPasswordDataResult, Unit]): Request[GetPasswordDataResult, AWSError] = js.native
  /**
    * Retrieves the encrypted administrator password for a running Windows instance. The Windows password is generated at boot by the EC2Config service or EC2Launch scripts (Windows Server 2016 and later). This usually only happens the first time an instance is launched. For more information, see EC2Config and EC2Launch in the Amazon Elastic Compute Cloud User Guide. For the EC2Config service, the password is not generated for rebundled AMIs unless Ec2SetPassword is enabled before bundling. The password is encrypted using the key pair that you specified when you launched the instance. You must provide the corresponding key pair file. When you launch an instance, password generation and encryption may take a few minutes. If you try to retrieve the password before it's available, the output returns an empty string. We recommend that you wait up to 15 minutes after launching an instance before trying to retrieve the generated password.
    */
  def getPasswordData(params: GetPasswordDataRequest): Request[GetPasswordDataResult, AWSError] = js.native
  def getPasswordData(
    params: GetPasswordDataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPasswordDataResult, Unit]
  ): Request[GetPasswordDataResult, AWSError] = js.native
  /**
    * Returns a quote and exchange information for exchanging one or more specified Convertible Reserved Instances for a new Convertible Reserved Instance. If the exchange cannot be performed, the reason is returned in the response. Use AcceptReservedInstancesExchangeQuote to perform the exchange.
    */
  def getReservedInstancesExchangeQuote(): Request[GetReservedInstancesExchangeQuoteResult, AWSError] = js.native
  def getReservedInstancesExchangeQuote(
    callback: js.Function2[/* err */ AWSError, /* data */ GetReservedInstancesExchangeQuoteResult, Unit]
  ): Request[GetReservedInstancesExchangeQuoteResult, AWSError] = js.native
  /**
    * Returns a quote and exchange information for exchanging one or more specified Convertible Reserved Instances for a new Convertible Reserved Instance. If the exchange cannot be performed, the reason is returned in the response. Use AcceptReservedInstancesExchangeQuote to perform the exchange.
    */
  def getReservedInstancesExchangeQuote(params: GetReservedInstancesExchangeQuoteRequest): Request[GetReservedInstancesExchangeQuoteResult, AWSError] = js.native
  def getReservedInstancesExchangeQuote(
    params: GetReservedInstancesExchangeQuoteRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetReservedInstancesExchangeQuoteResult, Unit]
  ): Request[GetReservedInstancesExchangeQuoteResult, AWSError] = js.native
  /**
    * Lists the route tables to which the specified resource attachment propagates routes.
    */
  def getTransitGatewayAttachmentPropagations(): Request[GetTransitGatewayAttachmentPropagationsResult, AWSError] = js.native
  def getTransitGatewayAttachmentPropagations(
    callback: js.Function2[/* err */ AWSError, /* data */ GetTransitGatewayAttachmentPropagationsResult, Unit]
  ): Request[GetTransitGatewayAttachmentPropagationsResult, AWSError] = js.native
  /**
    * Lists the route tables to which the specified resource attachment propagates routes.
    */
  def getTransitGatewayAttachmentPropagations(params: GetTransitGatewayAttachmentPropagationsRequest): Request[GetTransitGatewayAttachmentPropagationsResult, AWSError] = js.native
  def getTransitGatewayAttachmentPropagations(
    params: GetTransitGatewayAttachmentPropagationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTransitGatewayAttachmentPropagationsResult, Unit]
  ): Request[GetTransitGatewayAttachmentPropagationsResult, AWSError] = js.native
  /**
    * Gets information about the associations for the transit gateway multicast domain.
    */
  def getTransitGatewayMulticastDomainAssociations(): Request[GetTransitGatewayMulticastDomainAssociationsResult, AWSError] = js.native
  def getTransitGatewayMulticastDomainAssociations(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ GetTransitGatewayMulticastDomainAssociationsResult, 
      Unit
    ]
  ): Request[GetTransitGatewayMulticastDomainAssociationsResult, AWSError] = js.native
  /**
    * Gets information about the associations for the transit gateway multicast domain.
    */
  def getTransitGatewayMulticastDomainAssociations(params: GetTransitGatewayMulticastDomainAssociationsRequest): Request[GetTransitGatewayMulticastDomainAssociationsResult, AWSError] = js.native
  def getTransitGatewayMulticastDomainAssociations(
    params: GetTransitGatewayMulticastDomainAssociationsRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ GetTransitGatewayMulticastDomainAssociationsResult, 
      Unit
    ]
  ): Request[GetTransitGatewayMulticastDomainAssociationsResult, AWSError] = js.native
  /**
    * Gets information about the associations for the specified transit gateway route table.
    */
  def getTransitGatewayRouteTableAssociations(): Request[GetTransitGatewayRouteTableAssociationsResult, AWSError] = js.native
  def getTransitGatewayRouteTableAssociations(
    callback: js.Function2[/* err */ AWSError, /* data */ GetTransitGatewayRouteTableAssociationsResult, Unit]
  ): Request[GetTransitGatewayRouteTableAssociationsResult, AWSError] = js.native
  /**
    * Gets information about the associations for the specified transit gateway route table.
    */
  def getTransitGatewayRouteTableAssociations(params: GetTransitGatewayRouteTableAssociationsRequest): Request[GetTransitGatewayRouteTableAssociationsResult, AWSError] = js.native
  def getTransitGatewayRouteTableAssociations(
    params: GetTransitGatewayRouteTableAssociationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTransitGatewayRouteTableAssociationsResult, Unit]
  ): Request[GetTransitGatewayRouteTableAssociationsResult, AWSError] = js.native
  /**
    * Gets information about the route table propagations for the specified transit gateway route table.
    */
  def getTransitGatewayRouteTablePropagations(): Request[GetTransitGatewayRouteTablePropagationsResult, AWSError] = js.native
  def getTransitGatewayRouteTablePropagations(
    callback: js.Function2[/* err */ AWSError, /* data */ GetTransitGatewayRouteTablePropagationsResult, Unit]
  ): Request[GetTransitGatewayRouteTablePropagationsResult, AWSError] = js.native
  /**
    * Gets information about the route table propagations for the specified transit gateway route table.
    */
  def getTransitGatewayRouteTablePropagations(params: GetTransitGatewayRouteTablePropagationsRequest): Request[GetTransitGatewayRouteTablePropagationsResult, AWSError] = js.native
  def getTransitGatewayRouteTablePropagations(
    params: GetTransitGatewayRouteTablePropagationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTransitGatewayRouteTablePropagationsResult, Unit]
  ): Request[GetTransitGatewayRouteTablePropagationsResult, AWSError] = js.native
  /**
    * Uploads a client certificate revocation list to the specified Client VPN endpoint. Uploading a client certificate revocation list overwrites the existing client certificate revocation list. Uploading a client certificate revocation list resets existing client connections.
    */
  def importClientVpnClientCertificateRevocationList(): Request[ImportClientVpnClientCertificateRevocationListResult, AWSError] = js.native
  def importClientVpnClientCertificateRevocationList(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ ImportClientVpnClientCertificateRevocationListResult, 
      Unit
    ]
  ): Request[ImportClientVpnClientCertificateRevocationListResult, AWSError] = js.native
  /**
    * Uploads a client certificate revocation list to the specified Client VPN endpoint. Uploading a client certificate revocation list overwrites the existing client certificate revocation list. Uploading a client certificate revocation list resets existing client connections.
    */
  def importClientVpnClientCertificateRevocationList(params: ImportClientVpnClientCertificateRevocationListRequest): Request[ImportClientVpnClientCertificateRevocationListResult, AWSError] = js.native
  def importClientVpnClientCertificateRevocationList(
    params: ImportClientVpnClientCertificateRevocationListRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ ImportClientVpnClientCertificateRevocationListResult, 
      Unit
    ]
  ): Request[ImportClientVpnClientCertificateRevocationListResult, AWSError] = js.native
  /**
    * Import single or multi-volume disk images or EBS snapshots into an Amazon Machine Image (AMI). For more information, see Importing a VM as an Image Using VM Import/Export in the VM Import/Export User Guide.
    */
  def importImage(): Request[ImportImageResult, AWSError] = js.native
  def importImage(callback: js.Function2[/* err */ AWSError, /* data */ ImportImageResult, Unit]): Request[ImportImageResult, AWSError] = js.native
  /**
    * Import single or multi-volume disk images or EBS snapshots into an Amazon Machine Image (AMI). For more information, see Importing a VM as an Image Using VM Import/Export in the VM Import/Export User Guide.
    */
  def importImage(params: ImportImageRequest): Request[ImportImageResult, AWSError] = js.native
  def importImage(
    params: ImportImageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ImportImageResult, Unit]
  ): Request[ImportImageResult, AWSError] = js.native
  /**
    * Creates an import instance task using metadata from the specified disk image. ImportInstance only supports single-volume VMs. To import multi-volume VMs, use ImportImage. For more information, see Importing a Virtual Machine Using the Amazon EC2 CLI. For information about the import manifest referenced by this API action, see VM Import Manifest.
    */
  def importInstance(): Request[ImportInstanceResult, AWSError] = js.native
  def importInstance(callback: js.Function2[/* err */ AWSError, /* data */ ImportInstanceResult, Unit]): Request[ImportInstanceResult, AWSError] = js.native
  /**
    * Creates an import instance task using metadata from the specified disk image. ImportInstance only supports single-volume VMs. To import multi-volume VMs, use ImportImage. For more information, see Importing a Virtual Machine Using the Amazon EC2 CLI. For information about the import manifest referenced by this API action, see VM Import Manifest.
    */
  def importInstance(params: ImportInstanceRequest): Request[ImportInstanceResult, AWSError] = js.native
  def importInstance(
    params: ImportInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ImportInstanceResult, Unit]
  ): Request[ImportInstanceResult, AWSError] = js.native
  /**
    * Imports the public key from an RSA key pair that you created with a third-party tool. Compare this with CreateKeyPair, in which AWS creates the key pair and gives the keys to you (AWS keeps a copy of the public key). With ImportKeyPair, you create the key pair and give AWS just the public key. The private key is never transferred between you and AWS. For more information about key pairs, see Key Pairs in the Amazon Elastic Compute Cloud User Guide.
    */
  def importKeyPair(): Request[ImportKeyPairResult, AWSError] = js.native
  def importKeyPair(callback: js.Function2[/* err */ AWSError, /* data */ ImportKeyPairResult, Unit]): Request[ImportKeyPairResult, AWSError] = js.native
  /**
    * Imports the public key from an RSA key pair that you created with a third-party tool. Compare this with CreateKeyPair, in which AWS creates the key pair and gives the keys to you (AWS keeps a copy of the public key). With ImportKeyPair, you create the key pair and give AWS just the public key. The private key is never transferred between you and AWS. For more information about key pairs, see Key Pairs in the Amazon Elastic Compute Cloud User Guide.
    */
  def importKeyPair(params: ImportKeyPairRequest): Request[ImportKeyPairResult, AWSError] = js.native
  def importKeyPair(
    params: ImportKeyPairRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ImportKeyPairResult, Unit]
  ): Request[ImportKeyPairResult, AWSError] = js.native
  /**
    * Imports a disk into an EBS snapshot.
    */
  def importSnapshot(): Request[ImportSnapshotResult, AWSError] = js.native
  def importSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ ImportSnapshotResult, Unit]): Request[ImportSnapshotResult, AWSError] = js.native
  /**
    * Imports a disk into an EBS snapshot.
    */
  def importSnapshot(params: ImportSnapshotRequest): Request[ImportSnapshotResult, AWSError] = js.native
  def importSnapshot(
    params: ImportSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ImportSnapshotResult, Unit]
  ): Request[ImportSnapshotResult, AWSError] = js.native
  /**
    * Creates an import volume task using metadata from the specified disk image.For more information, see Importing Disks to Amazon EBS. For information about the import manifest referenced by this API action, see VM Import Manifest.
    */
  def importVolume(): Request[ImportVolumeResult, AWSError] = js.native
  def importVolume(callback: js.Function2[/* err */ AWSError, /* data */ ImportVolumeResult, Unit]): Request[ImportVolumeResult, AWSError] = js.native
  /**
    * Creates an import volume task using metadata from the specified disk image.For more information, see Importing Disks to Amazon EBS. For information about the import manifest referenced by this API action, see VM Import Manifest.
    */
  def importVolume(params: ImportVolumeRequest): Request[ImportVolumeResult, AWSError] = js.native
  def importVolume(
    params: ImportVolumeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ImportVolumeResult, Unit]
  ): Request[ImportVolumeResult, AWSError] = js.native
  /**
    * Modifies a Capacity Reservation's capacity and the conditions under which it is to be released. You cannot change a Capacity Reservation's instance type, EBS optimization, instance store settings, platform, Availability Zone, or instance eligibility. If you need to modify any of these attributes, we recommend that you cancel the Capacity Reservation, and then create a new one with the required attributes.
    */
  def modifyCapacityReservation(): Request[ModifyCapacityReservationResult, AWSError] = js.native
  def modifyCapacityReservation(callback: js.Function2[/* err */ AWSError, /* data */ ModifyCapacityReservationResult, Unit]): Request[ModifyCapacityReservationResult, AWSError] = js.native
  /**
    * Modifies a Capacity Reservation's capacity and the conditions under which it is to be released. You cannot change a Capacity Reservation's instance type, EBS optimization, instance store settings, platform, Availability Zone, or instance eligibility. If you need to modify any of these attributes, we recommend that you cancel the Capacity Reservation, and then create a new one with the required attributes.
    */
  def modifyCapacityReservation(params: ModifyCapacityReservationRequest): Request[ModifyCapacityReservationResult, AWSError] = js.native
  def modifyCapacityReservation(
    params: ModifyCapacityReservationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyCapacityReservationResult, Unit]
  ): Request[ModifyCapacityReservationResult, AWSError] = js.native
  /**
    * Modifies the specified Client VPN endpoint. You can only modify an endpoint's server certificate information, client connection logging information, DNS server, and description. Modifying the DNS server resets existing client connections.
    */
  def modifyClientVpnEndpoint(): Request[ModifyClientVpnEndpointResult, AWSError] = js.native
  def modifyClientVpnEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ ModifyClientVpnEndpointResult, Unit]): Request[ModifyClientVpnEndpointResult, AWSError] = js.native
  /**
    * Modifies the specified Client VPN endpoint. You can only modify an endpoint's server certificate information, client connection logging information, DNS server, and description. Modifying the DNS server resets existing client connections.
    */
  def modifyClientVpnEndpoint(params: ModifyClientVpnEndpointRequest): Request[ModifyClientVpnEndpointResult, AWSError] = js.native
  def modifyClientVpnEndpoint(
    params: ModifyClientVpnEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyClientVpnEndpointResult, Unit]
  ): Request[ModifyClientVpnEndpointResult, AWSError] = js.native
  /**
    * Modifies the default credit option for CPU usage of burstable performance instances. The default credit option is set at the account level per AWS Region, and is specified per instance family. All new burstable performance instances in the account launch using the default credit option.  ModifyDefaultCreditSpecification is an asynchronous operation, which works at an AWS Region level and modifies the credit option for each Availability Zone. All zones in a Region are updated within five minutes. But if instances are launched during this operation, they might not get the new credit option until the zone is updated. To verify whether the update has occurred, you can call GetDefaultCreditSpecification and check DefaultCreditSpecification for updates. For more information, see Burstable Performance Instances in the Amazon Elastic Compute Cloud User Guide.
    */
  def modifyDefaultCreditSpecification(): Request[ModifyDefaultCreditSpecificationResult, AWSError] = js.native
  def modifyDefaultCreditSpecification(
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyDefaultCreditSpecificationResult, Unit]
  ): Request[ModifyDefaultCreditSpecificationResult, AWSError] = js.native
  /**
    * Modifies the default credit option for CPU usage of burstable performance instances. The default credit option is set at the account level per AWS Region, and is specified per instance family. All new burstable performance instances in the account launch using the default credit option.  ModifyDefaultCreditSpecification is an asynchronous operation, which works at an AWS Region level and modifies the credit option for each Availability Zone. All zones in a Region are updated within five minutes. But if instances are launched during this operation, they might not get the new credit option until the zone is updated. To verify whether the update has occurred, you can call GetDefaultCreditSpecification and check DefaultCreditSpecification for updates. For more information, see Burstable Performance Instances in the Amazon Elastic Compute Cloud User Guide.
    */
  def modifyDefaultCreditSpecification(params: ModifyDefaultCreditSpecificationRequest): Request[ModifyDefaultCreditSpecificationResult, AWSError] = js.native
  def modifyDefaultCreditSpecification(
    params: ModifyDefaultCreditSpecificationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyDefaultCreditSpecificationResult, Unit]
  ): Request[ModifyDefaultCreditSpecificationResult, AWSError] = js.native
  /**
    * Changes the default customer master key (CMK) for EBS encryption by default for your account in this Region. AWS creates a unique AWS managed CMK in each Region for use with encryption by default. If you change the default CMK to a symmetric customer managed CMK, it is used instead of the AWS managed CMK. To reset the default CMK to the AWS managed CMK for EBS, use ResetEbsDefaultKmsKeyId. Amazon EBS does not support asymmetric CMKs. If you delete or disable the customer managed CMK that you specified for use with encryption by default, your instances will fail to launch. For more information, see Amazon EBS Encryption in the Amazon Elastic Compute Cloud User Guide.
    */
  def modifyEbsDefaultKmsKeyId(): Request[ModifyEbsDefaultKmsKeyIdResult, AWSError] = js.native
  def modifyEbsDefaultKmsKeyId(callback: js.Function2[/* err */ AWSError, /* data */ ModifyEbsDefaultKmsKeyIdResult, Unit]): Request[ModifyEbsDefaultKmsKeyIdResult, AWSError] = js.native
  /**
    * Changes the default customer master key (CMK) for EBS encryption by default for your account in this Region. AWS creates a unique AWS managed CMK in each Region for use with encryption by default. If you change the default CMK to a symmetric customer managed CMK, it is used instead of the AWS managed CMK. To reset the default CMK to the AWS managed CMK for EBS, use ResetEbsDefaultKmsKeyId. Amazon EBS does not support asymmetric CMKs. If you delete or disable the customer managed CMK that you specified for use with encryption by default, your instances will fail to launch. For more information, see Amazon EBS Encryption in the Amazon Elastic Compute Cloud User Guide.
    */
  def modifyEbsDefaultKmsKeyId(params: ModifyEbsDefaultKmsKeyIdRequest): Request[ModifyEbsDefaultKmsKeyIdResult, AWSError] = js.native
  def modifyEbsDefaultKmsKeyId(
    params: ModifyEbsDefaultKmsKeyIdRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyEbsDefaultKmsKeyIdResult, Unit]
  ): Request[ModifyEbsDefaultKmsKeyIdResult, AWSError] = js.native
  /**
    * Modifies the specified EC2 Fleet. You can only modify an EC2 Fleet request of type maintain. While the EC2 Fleet is being modified, it is in the modifying state. To scale up your EC2 Fleet, increase its target capacity. The EC2 Fleet launches the additional Spot Instances according to the allocation strategy for the EC2 Fleet request. If the allocation strategy is lowest-price, the EC2 Fleet launches instances using the Spot Instance pool with the lowest price. If the allocation strategy is diversified, the EC2 Fleet distributes the instances across the Spot Instance pools. If the allocation strategy is capacity-optimized, EC2 Fleet launches instances from Spot Instance pools with optimal capacity for the number of instances that are launching. To scale down your EC2 Fleet, decrease its target capacity. First, the EC2 Fleet cancels any open requests that exceed the new target capacity. You can request that the EC2 Fleet terminate Spot Instances until the size of the fleet no longer exceeds the new target capacity. If the allocation strategy is lowest-price, the EC2 Fleet terminates the instances with the highest price per unit. If the allocation strategy is capacity-optimized, the EC2 Fleet terminates the instances in the Spot Instance pools that have the least available Spot Instance capacity. If the allocation strategy is diversified, the EC2 Fleet terminates instances across the Spot Instance pools. Alternatively, you can request that the EC2 Fleet keep the fleet at its current size, but not replace any Spot Instances that are interrupted or that you terminate manually. If you are finished with your EC2 Fleet for now, but will use it again later, you can set the target capacity to 0.
    */
  def modifyFleet(): Request[ModifyFleetResult, AWSError] = js.native
  def modifyFleet(callback: js.Function2[/* err */ AWSError, /* data */ ModifyFleetResult, Unit]): Request[ModifyFleetResult, AWSError] = js.native
  /**
    * Modifies the specified EC2 Fleet. You can only modify an EC2 Fleet request of type maintain. While the EC2 Fleet is being modified, it is in the modifying state. To scale up your EC2 Fleet, increase its target capacity. The EC2 Fleet launches the additional Spot Instances according to the allocation strategy for the EC2 Fleet request. If the allocation strategy is lowest-price, the EC2 Fleet launches instances using the Spot Instance pool with the lowest price. If the allocation strategy is diversified, the EC2 Fleet distributes the instances across the Spot Instance pools. If the allocation strategy is capacity-optimized, EC2 Fleet launches instances from Spot Instance pools with optimal capacity for the number of instances that are launching. To scale down your EC2 Fleet, decrease its target capacity. First, the EC2 Fleet cancels any open requests that exceed the new target capacity. You can request that the EC2 Fleet terminate Spot Instances until the size of the fleet no longer exceeds the new target capacity. If the allocation strategy is lowest-price, the EC2 Fleet terminates the instances with the highest price per unit. If the allocation strategy is capacity-optimized, the EC2 Fleet terminates the instances in the Spot Instance pools that have the least available Spot Instance capacity. If the allocation strategy is diversified, the EC2 Fleet terminates instances across the Spot Instance pools. Alternatively, you can request that the EC2 Fleet keep the fleet at its current size, but not replace any Spot Instances that are interrupted or that you terminate manually. If you are finished with your EC2 Fleet for now, but will use it again later, you can set the target capacity to 0.
    */
  def modifyFleet(params: ModifyFleetRequest): Request[ModifyFleetResult, AWSError] = js.native
  def modifyFleet(
    params: ModifyFleetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyFleetResult, Unit]
  ): Request[ModifyFleetResult, AWSError] = js.native
  /**
    * Modifies the specified attribute of the specified Amazon FPGA Image (AFI).
    */
  def modifyFpgaImageAttribute(): Request[ModifyFpgaImageAttributeResult, AWSError] = js.native
  def modifyFpgaImageAttribute(callback: js.Function2[/* err */ AWSError, /* data */ ModifyFpgaImageAttributeResult, Unit]): Request[ModifyFpgaImageAttributeResult, AWSError] = js.native
  /**
    * Modifies the specified attribute of the specified Amazon FPGA Image (AFI).
    */
  def modifyFpgaImageAttribute(params: ModifyFpgaImageAttributeRequest): Request[ModifyFpgaImageAttributeResult, AWSError] = js.native
  def modifyFpgaImageAttribute(
    params: ModifyFpgaImageAttributeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyFpgaImageAttributeResult, Unit]
  ): Request[ModifyFpgaImageAttributeResult, AWSError] = js.native
  /**
    * Modify the auto-placement setting of a Dedicated Host. When auto-placement is enabled, any instances that you launch with a tenancy of host but without a specific host ID are placed onto any available Dedicated Host in your account that has auto-placement enabled. When auto-placement is disabled, you need to provide a host ID to have the instance launch onto a specific host. If no host ID is provided, the instance is launched onto a suitable host with auto-placement enabled. You can also use this API action to modify a Dedicated Host to support either multiple instance types in an instance family, or to support a specific instance type only.
    */
  def modifyHosts(): Request[ModifyHostsResult, AWSError] = js.native
  def modifyHosts(callback: js.Function2[/* err */ AWSError, /* data */ ModifyHostsResult, Unit]): Request[ModifyHostsResult, AWSError] = js.native
  /**
    * Modify the auto-placement setting of a Dedicated Host. When auto-placement is enabled, any instances that you launch with a tenancy of host but without a specific host ID are placed onto any available Dedicated Host in your account that has auto-placement enabled. When auto-placement is disabled, you need to provide a host ID to have the instance launch onto a specific host. If no host ID is provided, the instance is launched onto a suitable host with auto-placement enabled. You can also use this API action to modify a Dedicated Host to support either multiple instance types in an instance family, or to support a specific instance type only.
    */
  def modifyHosts(params: ModifyHostsRequest): Request[ModifyHostsResult, AWSError] = js.native
  def modifyHosts(
    params: ModifyHostsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyHostsResult, Unit]
  ): Request[ModifyHostsResult, AWSError] = js.native
  /**
    * Modifies the ID format for the specified resource on a per-Region basis. You can specify that resources should receive longer IDs (17-character IDs) when they are created. This request can only be used to modify longer ID settings for resource types that are within the opt-in period. Resources currently in their opt-in period include: bundle | conversion-task | customer-gateway | dhcp-options | elastic-ip-allocation | elastic-ip-association | export-task | flow-log | image | import-task | internet-gateway | network-acl | network-acl-association | network-interface | network-interface-attachment | prefix-list | route-table | route-table-association | security-group | subnet | subnet-cidr-block-association | vpc | vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection | vpn-connection | vpn-gateway. This setting applies to the IAM user who makes the request; it does not apply to the entire AWS account. By default, an IAM user defaults to the same settings as the root user. If you're using this action as the root user, then these settings apply to the entire account, unless an IAM user explicitly overrides these settings for themselves. For more information, see Resource IDs in the Amazon Elastic Compute Cloud User Guide. Resources created with longer IDs are visible to all IAM roles and users, regardless of these settings and provided that they have permission to use the relevant Describe command for the resource type.
    */
  def modifyIdFormat(): Request[js.Object, AWSError] = js.native
  def modifyIdFormat(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Modifies the ID format for the specified resource on a per-Region basis. You can specify that resources should receive longer IDs (17-character IDs) when they are created. This request can only be used to modify longer ID settings for resource types that are within the opt-in period. Resources currently in their opt-in period include: bundle | conversion-task | customer-gateway | dhcp-options | elastic-ip-allocation | elastic-ip-association | export-task | flow-log | image | import-task | internet-gateway | network-acl | network-acl-association | network-interface | network-interface-attachment | prefix-list | route-table | route-table-association | security-group | subnet | subnet-cidr-block-association | vpc | vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection | vpn-connection | vpn-gateway. This setting applies to the IAM user who makes the request; it does not apply to the entire AWS account. By default, an IAM user defaults to the same settings as the root user. If you're using this action as the root user, then these settings apply to the entire account, unless an IAM user explicitly overrides these settings for themselves. For more information, see Resource IDs in the Amazon Elastic Compute Cloud User Guide. Resources created with longer IDs are visible to all IAM roles and users, regardless of these settings and provided that they have permission to use the relevant Describe command for the resource type.
    */
  def modifyIdFormat(params: ModifyIdFormatRequest): Request[js.Object, AWSError] = js.native
  def modifyIdFormat(
    params: ModifyIdFormatRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Modifies the ID format of a resource for a specified IAM user, IAM role, or the root user for an account; or all IAM users, IAM roles, and the root user for an account. You can specify that resources should receive longer IDs (17-character IDs) when they are created.  This request can only be used to modify longer ID settings for resource types that are within the opt-in period. Resources currently in their opt-in period include: bundle | conversion-task | customer-gateway | dhcp-options | elastic-ip-allocation | elastic-ip-association | export-task | flow-log | image | import-task | internet-gateway | network-acl | network-acl-association | network-interface | network-interface-attachment | prefix-list | route-table | route-table-association | security-group | subnet | subnet-cidr-block-association | vpc | vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection | vpn-connection | vpn-gateway.  For more information, see Resource IDs in the Amazon Elastic Compute Cloud User Guide.  This setting applies to the principal specified in the request; it does not apply to the principal that makes the request.  Resources created with longer IDs are visible to all IAM roles and users, regardless of these settings and provided that they have permission to use the relevant Describe command for the resource type.
    */
  def modifyIdentityIdFormat(): Request[js.Object, AWSError] = js.native
  def modifyIdentityIdFormat(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Modifies the ID format of a resource for a specified IAM user, IAM role, or the root user for an account; or all IAM users, IAM roles, and the root user for an account. You can specify that resources should receive longer IDs (17-character IDs) when they are created.  This request can only be used to modify longer ID settings for resource types that are within the opt-in period. Resources currently in their opt-in period include: bundle | conversion-task | customer-gateway | dhcp-options | elastic-ip-allocation | elastic-ip-association | export-task | flow-log | image | import-task | internet-gateway | network-acl | network-acl-association | network-interface | network-interface-attachment | prefix-list | route-table | route-table-association | security-group | subnet | subnet-cidr-block-association | vpc | vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection | vpn-connection | vpn-gateway.  For more information, see Resource IDs in the Amazon Elastic Compute Cloud User Guide.  This setting applies to the principal specified in the request; it does not apply to the principal that makes the request.  Resources created with longer IDs are visible to all IAM roles and users, regardless of these settings and provided that they have permission to use the relevant Describe command for the resource type.
    */
  def modifyIdentityIdFormat(params: ModifyIdentityIdFormatRequest): Request[js.Object, AWSError] = js.native
  def modifyIdentityIdFormat(
    params: ModifyIdentityIdFormatRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Modifies the specified attribute of the specified AMI. You can specify only one attribute at a time. You can use the Attribute parameter to specify the attribute or one of the following parameters: Description, LaunchPermission, or ProductCode. AWS Marketplace product codes cannot be modified. Images with an AWS Marketplace product code cannot be made public. To enable the SriovNetSupport enhanced networking attribute of an image, enable SriovNetSupport on an instance and create an AMI from the instance.
    */
  def modifyImageAttribute(): Request[js.Object, AWSError] = js.native
  def modifyImageAttribute(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Modifies the specified attribute of the specified AMI. You can specify only one attribute at a time. You can use the Attribute parameter to specify the attribute or one of the following parameters: Description, LaunchPermission, or ProductCode. AWS Marketplace product codes cannot be modified. Images with an AWS Marketplace product code cannot be made public. To enable the SriovNetSupport enhanced networking attribute of an image, enable SriovNetSupport on an instance and create an AMI from the instance.
    */
  def modifyImageAttribute(params: ModifyImageAttributeRequest): Request[js.Object, AWSError] = js.native
  def modifyImageAttribute(
    params: ModifyImageAttributeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Modifies the specified attribute of the specified instance. You can specify only one attribute at a time.  Note: Using this action to change the security groups associated with an elastic network interface (ENI) attached to an instance in a VPC can result in an error if the instance has more than one ENI. To change the security groups associated with an ENI attached to an instance that has multiple ENIs, we recommend that you use the ModifyNetworkInterfaceAttribute action. To modify some attributes, the instance must be stopped. For more information, see Modifying Attributes of a Stopped Instance in the Amazon Elastic Compute Cloud User Guide.
    */
  def modifyInstanceAttribute(): Request[js.Object, AWSError] = js.native
  def modifyInstanceAttribute(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Modifies the specified attribute of the specified instance. You can specify only one attribute at a time.  Note: Using this action to change the security groups associated with an elastic network interface (ENI) attached to an instance in a VPC can result in an error if the instance has more than one ENI. To change the security groups associated with an ENI attached to an instance that has multiple ENIs, we recommend that you use the ModifyNetworkInterfaceAttribute action. To modify some attributes, the instance must be stopped. For more information, see Modifying Attributes of a Stopped Instance in the Amazon Elastic Compute Cloud User Guide.
    */
  def modifyInstanceAttribute(params: ModifyInstanceAttributeRequest): Request[js.Object, AWSError] = js.native
  def modifyInstanceAttribute(
    params: ModifyInstanceAttributeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Modifies the Capacity Reservation settings for a stopped instance. Use this action to configure an instance to target a specific Capacity Reservation, run in any open Capacity Reservation with matching attributes, or run On-Demand Instance capacity.
    */
  def modifyInstanceCapacityReservationAttributes(): Request[ModifyInstanceCapacityReservationAttributesResult, AWSError] = js.native
  def modifyInstanceCapacityReservationAttributes(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ ModifyInstanceCapacityReservationAttributesResult, 
      Unit
    ]
  ): Request[ModifyInstanceCapacityReservationAttributesResult, AWSError] = js.native
  /**
    * Modifies the Capacity Reservation settings for a stopped instance. Use this action to configure an instance to target a specific Capacity Reservation, run in any open Capacity Reservation with matching attributes, or run On-Demand Instance capacity.
    */
  def modifyInstanceCapacityReservationAttributes(params: ModifyInstanceCapacityReservationAttributesRequest): Request[ModifyInstanceCapacityReservationAttributesResult, AWSError] = js.native
  def modifyInstanceCapacityReservationAttributes(
    params: ModifyInstanceCapacityReservationAttributesRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ ModifyInstanceCapacityReservationAttributesResult, 
      Unit
    ]
  ): Request[ModifyInstanceCapacityReservationAttributesResult, AWSError] = js.native
  /**
    * Modifies the credit option for CPU usage on a running or stopped burstable performance instance. The credit options are standard and unlimited. For more information, see Burstable Performance Instances in the Amazon Elastic Compute Cloud User Guide.
    */
  def modifyInstanceCreditSpecification(): Request[ModifyInstanceCreditSpecificationResult, AWSError] = js.native
  def modifyInstanceCreditSpecification(
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyInstanceCreditSpecificationResult, Unit]
  ): Request[ModifyInstanceCreditSpecificationResult, AWSError] = js.native
  /**
    * Modifies the credit option for CPU usage on a running or stopped burstable performance instance. The credit options are standard and unlimited. For more information, see Burstable Performance Instances in the Amazon Elastic Compute Cloud User Guide.
    */
  def modifyInstanceCreditSpecification(params: ModifyInstanceCreditSpecificationRequest): Request[ModifyInstanceCreditSpecificationResult, AWSError] = js.native
  def modifyInstanceCreditSpecification(
    params: ModifyInstanceCreditSpecificationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyInstanceCreditSpecificationResult, Unit]
  ): Request[ModifyInstanceCreditSpecificationResult, AWSError] = js.native
  /**
    * Modifies the start time for a scheduled Amazon EC2 instance event.
    */
  def modifyInstanceEventStartTime(): Request[ModifyInstanceEventStartTimeResult, AWSError] = js.native
  def modifyInstanceEventStartTime(callback: js.Function2[/* err */ AWSError, /* data */ ModifyInstanceEventStartTimeResult, Unit]): Request[ModifyInstanceEventStartTimeResult, AWSError] = js.native
  /**
    * Modifies the start time for a scheduled Amazon EC2 instance event.
    */
  def modifyInstanceEventStartTime(params: ModifyInstanceEventStartTimeRequest): Request[ModifyInstanceEventStartTimeResult, AWSError] = js.native
  def modifyInstanceEventStartTime(
    params: ModifyInstanceEventStartTimeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyInstanceEventStartTimeResult, Unit]
  ): Request[ModifyInstanceEventStartTimeResult, AWSError] = js.native
  /**
    * Modify the instance metadata parameters on a running or stopped instance. When you modify the parameters on a stopped instance, they are applied when the instance is started. When you modify the parameters on a running instance, the API responds with a state of “pending”. After the parameter modifications are successfully applied to the instance, the state of the modifications changes from “pending” to “applied” in subsequent describe-instances API calls. For more information, see Instance Metadata and User Data.
    */
  def modifyInstanceMetadataOptions(): Request[ModifyInstanceMetadataOptionsResult, AWSError] = js.native
  def modifyInstanceMetadataOptions(callback: js.Function2[/* err */ AWSError, /* data */ ModifyInstanceMetadataOptionsResult, Unit]): Request[ModifyInstanceMetadataOptionsResult, AWSError] = js.native
  /**
    * Modify the instance metadata parameters on a running or stopped instance. When you modify the parameters on a stopped instance, they are applied when the instance is started. When you modify the parameters on a running instance, the API responds with a state of “pending”. After the parameter modifications are successfully applied to the instance, the state of the modifications changes from “pending” to “applied” in subsequent describe-instances API calls. For more information, see Instance Metadata and User Data.
    */
  def modifyInstanceMetadataOptions(params: ModifyInstanceMetadataOptionsRequest): Request[ModifyInstanceMetadataOptionsResult, AWSError] = js.native
  def modifyInstanceMetadataOptions(
    params: ModifyInstanceMetadataOptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyInstanceMetadataOptionsResult, Unit]
  ): Request[ModifyInstanceMetadataOptionsResult, AWSError] = js.native
  /**
    * Modifies the placement attributes for a specified instance. You can do the following:   Modify the affinity between an instance and a Dedicated Host. When affinity is set to host and the instance is not associated with a specific Dedicated Host, the next time the instance is launched, it is automatically associated with the host on which it lands. If the instance is restarted or rebooted, this relationship persists.   Change the Dedicated Host with which an instance is associated.   Change the instance tenancy of an instance from host to dedicated, or from dedicated to host.   Move an instance to or from a placement group.   At least one attribute for affinity, host ID, tenancy, or placement group name must be specified in the request. Affinity and tenancy can be modified in the same request. To modify the host ID, tenancy, placement group, or partition for an instance, the instance must be in the stopped state.
    */
  def modifyInstancePlacement(): Request[ModifyInstancePlacementResult, AWSError] = js.native
  def modifyInstancePlacement(callback: js.Function2[/* err */ AWSError, /* data */ ModifyInstancePlacementResult, Unit]): Request[ModifyInstancePlacementResult, AWSError] = js.native
  /**
    * Modifies the placement attributes for a specified instance. You can do the following:   Modify the affinity between an instance and a Dedicated Host. When affinity is set to host and the instance is not associated with a specific Dedicated Host, the next time the instance is launched, it is automatically associated with the host on which it lands. If the instance is restarted or rebooted, this relationship persists.   Change the Dedicated Host with which an instance is associated.   Change the instance tenancy of an instance from host to dedicated, or from dedicated to host.   Move an instance to or from a placement group.   At least one attribute for affinity, host ID, tenancy, or placement group name must be specified in the request. Affinity and tenancy can be modified in the same request. To modify the host ID, tenancy, placement group, or partition for an instance, the instance must be in the stopped state.
    */
  def modifyInstancePlacement(params: ModifyInstancePlacementRequest): Request[ModifyInstancePlacementResult, AWSError] = js.native
  def modifyInstancePlacement(
    params: ModifyInstancePlacementRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyInstancePlacementResult, Unit]
  ): Request[ModifyInstancePlacementResult, AWSError] = js.native
  /**
    * Modifies a launch template. You can specify which version of the launch template to set as the default version. When launching an instance, the default version applies when a launch template version is not specified.
    */
  def modifyLaunchTemplate(): Request[ModifyLaunchTemplateResult, AWSError] = js.native
  def modifyLaunchTemplate(callback: js.Function2[/* err */ AWSError, /* data */ ModifyLaunchTemplateResult, Unit]): Request[ModifyLaunchTemplateResult, AWSError] = js.native
  /**
    * Modifies a launch template. You can specify which version of the launch template to set as the default version. When launching an instance, the default version applies when a launch template version is not specified.
    */
  def modifyLaunchTemplate(params: ModifyLaunchTemplateRequest): Request[ModifyLaunchTemplateResult, AWSError] = js.native
  def modifyLaunchTemplate(
    params: ModifyLaunchTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyLaunchTemplateResult, Unit]
  ): Request[ModifyLaunchTemplateResult, AWSError] = js.native
  /**
    * Modifies the specified network interface attribute. You can specify only one attribute at a time. You can use this action to attach and detach security groups from an existing EC2 instance.
    */
  def modifyNetworkInterfaceAttribute(): Request[js.Object, AWSError] = js.native
  def modifyNetworkInterfaceAttribute(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Modifies the specified network interface attribute. You can specify only one attribute at a time. You can use this action to attach and detach security groups from an existing EC2 instance.
    */
  def modifyNetworkInterfaceAttribute(params: ModifyNetworkInterfaceAttributeRequest): Request[js.Object, AWSError] = js.native
  def modifyNetworkInterfaceAttribute(
    params: ModifyNetworkInterfaceAttributeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Modifies the Availability Zone, instance count, instance type, or network platform (EC2-Classic or EC2-VPC) of your Reserved Instances. The Reserved Instances to be modified must be identical, except for Availability Zone, network platform, and instance type. For more information, see Modifying Reserved Instances in the Amazon Elastic Compute Cloud User Guide.
    */
  def modifyReservedInstances(): Request[ModifyReservedInstancesResult, AWSError] = js.native
  def modifyReservedInstances(callback: js.Function2[/* err */ AWSError, /* data */ ModifyReservedInstancesResult, Unit]): Request[ModifyReservedInstancesResult, AWSError] = js.native
  /**
    * Modifies the Availability Zone, instance count, instance type, or network platform (EC2-Classic or EC2-VPC) of your Reserved Instances. The Reserved Instances to be modified must be identical, except for Availability Zone, network platform, and instance type. For more information, see Modifying Reserved Instances in the Amazon Elastic Compute Cloud User Guide.
    */
  def modifyReservedInstances(params: ModifyReservedInstancesRequest): Request[ModifyReservedInstancesResult, AWSError] = js.native
  def modifyReservedInstances(
    params: ModifyReservedInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyReservedInstancesResult, Unit]
  ): Request[ModifyReservedInstancesResult, AWSError] = js.native
  /**
    * Adds or removes permission settings for the specified snapshot. You may add or remove specified AWS account IDs from a snapshot's list of create volume permissions, but you cannot do both in a single operation. If you need to both add and remove account IDs for a snapshot, you must use multiple operations. You can make up to 500 modifications to a snapshot in a single operation. Encrypted snapshots and snapshots with AWS Marketplace product codes cannot be made public. Snapshots encrypted with your default CMK cannot be shared with other accounts. For more information about modifying snapshot permissions, see Sharing Snapshots in the Amazon Elastic Compute Cloud User Guide.
    */
  def modifySnapshotAttribute(): Request[js.Object, AWSError] = js.native
  def modifySnapshotAttribute(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds or removes permission settings for the specified snapshot. You may add or remove specified AWS account IDs from a snapshot's list of create volume permissions, but you cannot do both in a single operation. If you need to both add and remove account IDs for a snapshot, you must use multiple operations. You can make up to 500 modifications to a snapshot in a single operation. Encrypted snapshots and snapshots with AWS Marketplace product codes cannot be made public. Snapshots encrypted with your default CMK cannot be shared with other accounts. For more information about modifying snapshot permissions, see Sharing Snapshots in the Amazon Elastic Compute Cloud User Guide.
    */
  def modifySnapshotAttribute(params: ModifySnapshotAttributeRequest): Request[js.Object, AWSError] = js.native
  def modifySnapshotAttribute(
    params: ModifySnapshotAttributeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Modifies the specified Spot Fleet request. You can only modify a Spot Fleet request of type maintain. While the Spot Fleet request is being modified, it is in the modifying state. To scale up your Spot Fleet, increase its target capacity. The Spot Fleet launches the additional Spot Instances according to the allocation strategy for the Spot Fleet request. If the allocation strategy is lowestPrice, the Spot Fleet launches instances using the Spot Instance pool with the lowest price. If the allocation strategy is diversified, the Spot Fleet distributes the instances across the Spot Instance pools. If the allocation strategy is capacityOptimized, Spot Fleet launches instances from Spot Instance pools with optimal capacity for the number of instances that are launching. To scale down your Spot Fleet, decrease its target capacity. First, the Spot Fleet cancels any open requests that exceed the new target capacity. You can request that the Spot Fleet terminate Spot Instances until the size of the fleet no longer exceeds the new target capacity. If the allocation strategy is lowestPrice, the Spot Fleet terminates the instances with the highest price per unit. If the allocation strategy is capacityOptimized, the Spot Fleet terminates the instances in the Spot Instance pools that have the least available Spot Instance capacity. If the allocation strategy is diversified, the Spot Fleet terminates instances across the Spot Instance pools. Alternatively, you can request that the Spot Fleet keep the fleet at its current size, but not replace any Spot Instances that are interrupted or that you terminate manually. If you are finished with your Spot Fleet for now, but will use it again later, you can set the target capacity to 0.
    */
  def modifySpotFleetRequest(): Request[ModifySpotFleetRequestResponse, AWSError] = js.native
  def modifySpotFleetRequest(callback: js.Function2[/* err */ AWSError, /* data */ ModifySpotFleetRequestResponse, Unit]): Request[ModifySpotFleetRequestResponse, AWSError] = js.native
  /**
    * Modifies the specified Spot Fleet request. You can only modify a Spot Fleet request of type maintain. While the Spot Fleet request is being modified, it is in the modifying state. To scale up your Spot Fleet, increase its target capacity. The Spot Fleet launches the additional Spot Instances according to the allocation strategy for the Spot Fleet request. If the allocation strategy is lowestPrice, the Spot Fleet launches instances using the Spot Instance pool with the lowest price. If the allocation strategy is diversified, the Spot Fleet distributes the instances across the Spot Instance pools. If the allocation strategy is capacityOptimized, Spot Fleet launches instances from Spot Instance pools with optimal capacity for the number of instances that are launching. To scale down your Spot Fleet, decrease its target capacity. First, the Spot Fleet cancels any open requests that exceed the new target capacity. You can request that the Spot Fleet terminate Spot Instances until the size of the fleet no longer exceeds the new target capacity. If the allocation strategy is lowestPrice, the Spot Fleet terminates the instances with the highest price per unit. If the allocation strategy is capacityOptimized, the Spot Fleet terminates the instances in the Spot Instance pools that have the least available Spot Instance capacity. If the allocation strategy is diversified, the Spot Fleet terminates instances across the Spot Instance pools. Alternatively, you can request that the Spot Fleet keep the fleet at its current size, but not replace any Spot Instances that are interrupted or that you terminate manually. If you are finished with your Spot Fleet for now, but will use it again later, you can set the target capacity to 0.
    */
  def modifySpotFleetRequest(params: ModifySpotFleetRequestRequest): Request[ModifySpotFleetRequestResponse, AWSError] = js.native
  def modifySpotFleetRequest(
    params: ModifySpotFleetRequestRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifySpotFleetRequestResponse, Unit]
  ): Request[ModifySpotFleetRequestResponse, AWSError] = js.native
  /**
    * Modifies a subnet attribute. You can only modify one attribute at a time.
    */
  def modifySubnetAttribute(): Request[js.Object, AWSError] = js.native
  def modifySubnetAttribute(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Modifies a subnet attribute. You can only modify one attribute at a time.
    */
  def modifySubnetAttribute(params: ModifySubnetAttributeRequest): Request[js.Object, AWSError] = js.native
  def modifySubnetAttribute(
    params: ModifySubnetAttributeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Allows or restricts mirroring network services.  By default, Amazon DNS network services are not eligible for Traffic Mirror. Use AddNetworkServices to add network services to a Traffic Mirror filter. When a network service is added to the Traffic Mirror filter, all traffic related to that network service will be mirrored. When you no longer want to mirror network services, use RemoveNetworkServices to remove the network services from the Traffic Mirror filter.  For information about filter rule properties, see Network Services in the Traffic Mirroring User Guide .
    */
  def modifyTrafficMirrorFilterNetworkServices(): Request[ModifyTrafficMirrorFilterNetworkServicesResult, AWSError] = js.native
  def modifyTrafficMirrorFilterNetworkServices(
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyTrafficMirrorFilterNetworkServicesResult, Unit]
  ): Request[ModifyTrafficMirrorFilterNetworkServicesResult, AWSError] = js.native
  /**
    * Allows or restricts mirroring network services.  By default, Amazon DNS network services are not eligible for Traffic Mirror. Use AddNetworkServices to add network services to a Traffic Mirror filter. When a network service is added to the Traffic Mirror filter, all traffic related to that network service will be mirrored. When you no longer want to mirror network services, use RemoveNetworkServices to remove the network services from the Traffic Mirror filter.  For information about filter rule properties, see Network Services in the Traffic Mirroring User Guide .
    */
  def modifyTrafficMirrorFilterNetworkServices(params: ModifyTrafficMirrorFilterNetworkServicesRequest): Request[ModifyTrafficMirrorFilterNetworkServicesResult, AWSError] = js.native
  def modifyTrafficMirrorFilterNetworkServices(
    params: ModifyTrafficMirrorFilterNetworkServicesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyTrafficMirrorFilterNetworkServicesResult, Unit]
  ): Request[ModifyTrafficMirrorFilterNetworkServicesResult, AWSError] = js.native
  /**
    * Modifies the specified Traffic Mirror rule.  DestinationCidrBlock and SourceCidrBlock must both be an IPv4 range or an IPv6 range.
    */
  def modifyTrafficMirrorFilterRule(): Request[ModifyTrafficMirrorFilterRuleResult, AWSError] = js.native
  def modifyTrafficMirrorFilterRule(callback: js.Function2[/* err */ AWSError, /* data */ ModifyTrafficMirrorFilterRuleResult, Unit]): Request[ModifyTrafficMirrorFilterRuleResult, AWSError] = js.native
  /**
    * Modifies the specified Traffic Mirror rule.  DestinationCidrBlock and SourceCidrBlock must both be an IPv4 range or an IPv6 range.
    */
  def modifyTrafficMirrorFilterRule(params: ModifyTrafficMirrorFilterRuleRequest): Request[ModifyTrafficMirrorFilterRuleResult, AWSError] = js.native
  def modifyTrafficMirrorFilterRule(
    params: ModifyTrafficMirrorFilterRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyTrafficMirrorFilterRuleResult, Unit]
  ): Request[ModifyTrafficMirrorFilterRuleResult, AWSError] = js.native
  /**
    * Modifies a Traffic Mirror session.
    */
  def modifyTrafficMirrorSession(): Request[ModifyTrafficMirrorSessionResult, AWSError] = js.native
  def modifyTrafficMirrorSession(callback: js.Function2[/* err */ AWSError, /* data */ ModifyTrafficMirrorSessionResult, Unit]): Request[ModifyTrafficMirrorSessionResult, AWSError] = js.native
  /**
    * Modifies a Traffic Mirror session.
    */
  def modifyTrafficMirrorSession(params: ModifyTrafficMirrorSessionRequest): Request[ModifyTrafficMirrorSessionResult, AWSError] = js.native
  def modifyTrafficMirrorSession(
    params: ModifyTrafficMirrorSessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyTrafficMirrorSessionResult, Unit]
  ): Request[ModifyTrafficMirrorSessionResult, AWSError] = js.native
  /**
    * Modifies the specified VPC attachment.
    */
  def modifyTransitGatewayVpcAttachment(): Request[ModifyTransitGatewayVpcAttachmentResult, AWSError] = js.native
  def modifyTransitGatewayVpcAttachment(
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyTransitGatewayVpcAttachmentResult, Unit]
  ): Request[ModifyTransitGatewayVpcAttachmentResult, AWSError] = js.native
  /**
    * Modifies the specified VPC attachment.
    */
  def modifyTransitGatewayVpcAttachment(params: ModifyTransitGatewayVpcAttachmentRequest): Request[ModifyTransitGatewayVpcAttachmentResult, AWSError] = js.native
  def modifyTransitGatewayVpcAttachment(
    params: ModifyTransitGatewayVpcAttachmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyTransitGatewayVpcAttachmentResult, Unit]
  ): Request[ModifyTransitGatewayVpcAttachmentResult, AWSError] = js.native
  /**
    * You can modify several parameters of an existing EBS volume, including volume size, volume type, and IOPS capacity. If your EBS volume is attached to a current-generation EC2 instance type, you may be able to apply these changes without stopping the instance or detaching the volume from it. For more information about modifying an EBS volume running Linux, see Modifying the Size, IOPS, or Type of an EBS Volume on Linux. For more information about modifying an EBS volume running Windows, see Modifying the Size, IOPS, or Type of an EBS Volume on Windows.   When you complete a resize operation on your volume, you need to extend the volume's file-system size to take advantage of the new storage capacity. For information about extending a Linux file system, see Extending a Linux File System. For information about extending a Windows file system, see Extending a Windows File System.   You can use CloudWatch Events to check the status of a modification to an EBS volume. For information about CloudWatch Events, see the Amazon CloudWatch Events User Guide. You can also track the status of a modification using DescribeVolumesModifications. For information about tracking status changes using either method, see Monitoring Volume Modifications.  With previous-generation instance types, resizing an EBS volume may require detaching and reattaching the volume or stopping and restarting the instance. For more information, see Modifying the Size, IOPS, or Type of an EBS Volume on Linux and Modifying the Size, IOPS, or Type of an EBS Volume on Windows. If you reach the maximum volume modification rate per volume limit, you will need to wait at least six hours before applying further modifications to the affected EBS volume.
    */
  def modifyVolume(): Request[ModifyVolumeResult, AWSError] = js.native
  def modifyVolume(callback: js.Function2[/* err */ AWSError, /* data */ ModifyVolumeResult, Unit]): Request[ModifyVolumeResult, AWSError] = js.native
  /**
    * You can modify several parameters of an existing EBS volume, including volume size, volume type, and IOPS capacity. If your EBS volume is attached to a current-generation EC2 instance type, you may be able to apply these changes without stopping the instance or detaching the volume from it. For more information about modifying an EBS volume running Linux, see Modifying the Size, IOPS, or Type of an EBS Volume on Linux. For more information about modifying an EBS volume running Windows, see Modifying the Size, IOPS, or Type of an EBS Volume on Windows.   When you complete a resize operation on your volume, you need to extend the volume's file-system size to take advantage of the new storage capacity. For information about extending a Linux file system, see Extending a Linux File System. For information about extending a Windows file system, see Extending a Windows File System.   You can use CloudWatch Events to check the status of a modification to an EBS volume. For information about CloudWatch Events, see the Amazon CloudWatch Events User Guide. You can also track the status of a modification using DescribeVolumesModifications. For information about tracking status changes using either method, see Monitoring Volume Modifications.  With previous-generation instance types, resizing an EBS volume may require detaching and reattaching the volume or stopping and restarting the instance. For more information, see Modifying the Size, IOPS, or Type of an EBS Volume on Linux and Modifying the Size, IOPS, or Type of an EBS Volume on Windows. If you reach the maximum volume modification rate per volume limit, you will need to wait at least six hours before applying further modifications to the affected EBS volume.
    */
  def modifyVolume(params: ModifyVolumeRequest): Request[ModifyVolumeResult, AWSError] = js.native
  def modifyVolume(
    params: ModifyVolumeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyVolumeResult, Unit]
  ): Request[ModifyVolumeResult, AWSError] = js.native
  /**
    * Modifies a volume attribute. By default, all I/O operations for the volume are suspended when the data on the volume is determined to be potentially inconsistent, to prevent undetectable, latent data corruption. The I/O access to the volume can be resumed by first enabling I/O access and then checking the data consistency on your volume. You can change the default behavior to resume I/O operations. We recommend that you change this only for boot volumes or for volumes that are stateless or disposable.
    */
  def modifyVolumeAttribute(): Request[js.Object, AWSError] = js.native
  def modifyVolumeAttribute(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Modifies a volume attribute. By default, all I/O operations for the volume are suspended when the data on the volume is determined to be potentially inconsistent, to prevent undetectable, latent data corruption. The I/O access to the volume can be resumed by first enabling I/O access and then checking the data consistency on your volume. You can change the default behavior to resume I/O operations. We recommend that you change this only for boot volumes or for volumes that are stateless or disposable.
    */
  def modifyVolumeAttribute(params: ModifyVolumeAttributeRequest): Request[js.Object, AWSError] = js.native
  def modifyVolumeAttribute(
    params: ModifyVolumeAttributeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Modifies the specified attribute of the specified VPC.
    */
  def modifyVpcAttribute(): Request[js.Object, AWSError] = js.native
  def modifyVpcAttribute(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Modifies the specified attribute of the specified VPC.
    */
  def modifyVpcAttribute(params: ModifyVpcAttributeRequest): Request[js.Object, AWSError] = js.native
  def modifyVpcAttribute(
    params: ModifyVpcAttributeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Modifies attributes of a specified VPC endpoint. The attributes that you can modify depend on the type of VPC endpoint (interface or gateway). For more information, see VPC Endpoints in the Amazon Virtual Private Cloud User Guide.
    */
  def modifyVpcEndpoint(): Request[ModifyVpcEndpointResult, AWSError] = js.native
  def modifyVpcEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ ModifyVpcEndpointResult, Unit]): Request[ModifyVpcEndpointResult, AWSError] = js.native
  /**
    * Modifies attributes of a specified VPC endpoint. The attributes that you can modify depend on the type of VPC endpoint (interface or gateway). For more information, see VPC Endpoints in the Amazon Virtual Private Cloud User Guide.
    */
  def modifyVpcEndpoint(params: ModifyVpcEndpointRequest): Request[ModifyVpcEndpointResult, AWSError] = js.native
  def modifyVpcEndpoint(
    params: ModifyVpcEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyVpcEndpointResult, Unit]
  ): Request[ModifyVpcEndpointResult, AWSError] = js.native
  /**
    * Modifies a connection notification for VPC endpoint or VPC endpoint service. You can change the SNS topic for the notification, or the events for which to be notified. 
    */
  def modifyVpcEndpointConnectionNotification(): Request[ModifyVpcEndpointConnectionNotificationResult, AWSError] = js.native
  def modifyVpcEndpointConnectionNotification(
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyVpcEndpointConnectionNotificationResult, Unit]
  ): Request[ModifyVpcEndpointConnectionNotificationResult, AWSError] = js.native
  /**
    * Modifies a connection notification for VPC endpoint or VPC endpoint service. You can change the SNS topic for the notification, or the events for which to be notified. 
    */
  def modifyVpcEndpointConnectionNotification(params: ModifyVpcEndpointConnectionNotificationRequest): Request[ModifyVpcEndpointConnectionNotificationResult, AWSError] = js.native
  def modifyVpcEndpointConnectionNotification(
    params: ModifyVpcEndpointConnectionNotificationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyVpcEndpointConnectionNotificationResult, Unit]
  ): Request[ModifyVpcEndpointConnectionNotificationResult, AWSError] = js.native
  /**
    * Modifies the attributes of your VPC endpoint service configuration. You can change the Network Load Balancers for your service, and you can specify whether acceptance is required for requests to connect to your endpoint service through an interface VPC endpoint.
    */
  def modifyVpcEndpointServiceConfiguration(): Request[ModifyVpcEndpointServiceConfigurationResult, AWSError] = js.native
  def modifyVpcEndpointServiceConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyVpcEndpointServiceConfigurationResult, Unit]
  ): Request[ModifyVpcEndpointServiceConfigurationResult, AWSError] = js.native
  /**
    * Modifies the attributes of your VPC endpoint service configuration. You can change the Network Load Balancers for your service, and you can specify whether acceptance is required for requests to connect to your endpoint service through an interface VPC endpoint.
    */
  def modifyVpcEndpointServiceConfiguration(params: ModifyVpcEndpointServiceConfigurationRequest): Request[ModifyVpcEndpointServiceConfigurationResult, AWSError] = js.native
  def modifyVpcEndpointServiceConfiguration(
    params: ModifyVpcEndpointServiceConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyVpcEndpointServiceConfigurationResult, Unit]
  ): Request[ModifyVpcEndpointServiceConfigurationResult, AWSError] = js.native
  /**
    * Modifies the permissions for your VPC endpoint service. You can add or remove permissions for service consumers (IAM users, IAM roles, and AWS accounts) to connect to your endpoint service. If you grant permissions to all principals, the service is public. Any users who know the name of a public service can send a request to attach an endpoint. If the service does not require manual approval, attachments are automatically approved.
    */
  def modifyVpcEndpointServicePermissions(): Request[ModifyVpcEndpointServicePermissionsResult, AWSError] = js.native
  def modifyVpcEndpointServicePermissions(
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyVpcEndpointServicePermissionsResult, Unit]
  ): Request[ModifyVpcEndpointServicePermissionsResult, AWSError] = js.native
  /**
    * Modifies the permissions for your VPC endpoint service. You can add or remove permissions for service consumers (IAM users, IAM roles, and AWS accounts) to connect to your endpoint service. If you grant permissions to all principals, the service is public. Any users who know the name of a public service can send a request to attach an endpoint. If the service does not require manual approval, attachments are automatically approved.
    */
  def modifyVpcEndpointServicePermissions(params: ModifyVpcEndpointServicePermissionsRequest): Request[ModifyVpcEndpointServicePermissionsResult, AWSError] = js.native
  def modifyVpcEndpointServicePermissions(
    params: ModifyVpcEndpointServicePermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyVpcEndpointServicePermissionsResult, Unit]
  ): Request[ModifyVpcEndpointServicePermissionsResult, AWSError] = js.native
  /**
    * Modifies the VPC peering connection options on one side of a VPC peering connection. You can do the following:   Enable/disable communication over the peering connection between an EC2-Classic instance that's linked to your VPC (using ClassicLink) and instances in the peer VPC.   Enable/disable communication over the peering connection between instances in your VPC and an EC2-Classic instance that's linked to the peer VPC.   Enable/disable the ability to resolve public DNS hostnames to private IP addresses when queried from instances in the peer VPC.   If the peered VPCs are in the same AWS account, you can enable DNS resolution for queries from the local VPC. This ensures that queries from the local VPC resolve to private IP addresses in the peer VPC. This option is not available if the peered VPCs are in different AWS accounts or different Regions. For peered VPCs in different AWS accounts, each AWS account owner must initiate a separate request to modify the peering connection options. For inter-region peering connections, you must use the Region for the requester VPC to modify the requester VPC peering options and the Region for the accepter VPC to modify the accepter VPC peering options. To verify which VPCs are the accepter and the requester for a VPC peering connection, use the DescribeVpcPeeringConnections command.
    */
  def modifyVpcPeeringConnectionOptions(): Request[ModifyVpcPeeringConnectionOptionsResult, AWSError] = js.native
  def modifyVpcPeeringConnectionOptions(
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyVpcPeeringConnectionOptionsResult, Unit]
  ): Request[ModifyVpcPeeringConnectionOptionsResult, AWSError] = js.native
  /**
    * Modifies the VPC peering connection options on one side of a VPC peering connection. You can do the following:   Enable/disable communication over the peering connection between an EC2-Classic instance that's linked to your VPC (using ClassicLink) and instances in the peer VPC.   Enable/disable communication over the peering connection between instances in your VPC and an EC2-Classic instance that's linked to the peer VPC.   Enable/disable the ability to resolve public DNS hostnames to private IP addresses when queried from instances in the peer VPC.   If the peered VPCs are in the same AWS account, you can enable DNS resolution for queries from the local VPC. This ensures that queries from the local VPC resolve to private IP addresses in the peer VPC. This option is not available if the peered VPCs are in different AWS accounts or different Regions. For peered VPCs in different AWS accounts, each AWS account owner must initiate a separate request to modify the peering connection options. For inter-region peering connections, you must use the Region for the requester VPC to modify the requester VPC peering options and the Region for the accepter VPC to modify the accepter VPC peering options. To verify which VPCs are the accepter and the requester for a VPC peering connection, use the DescribeVpcPeeringConnections command.
    */
  def modifyVpcPeeringConnectionOptions(params: ModifyVpcPeeringConnectionOptionsRequest): Request[ModifyVpcPeeringConnectionOptionsResult, AWSError] = js.native
  def modifyVpcPeeringConnectionOptions(
    params: ModifyVpcPeeringConnectionOptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyVpcPeeringConnectionOptionsResult, Unit]
  ): Request[ModifyVpcPeeringConnectionOptionsResult, AWSError] = js.native
  /**
    * Modifies the instance tenancy attribute of the specified VPC. You can change the instance tenancy attribute of a VPC to default only. You cannot change the instance tenancy attribute to dedicated. After you modify the tenancy of the VPC, any new instances that you launch into the VPC have a tenancy of default, unless you specify otherwise during launch. The tenancy of any existing instances in the VPC is not affected. For more information, see Dedicated Instances in the Amazon Elastic Compute Cloud User Guide.
    */
  def modifyVpcTenancy(): Request[ModifyVpcTenancyResult, AWSError] = js.native
  def modifyVpcTenancy(callback: js.Function2[/* err */ AWSError, /* data */ ModifyVpcTenancyResult, Unit]): Request[ModifyVpcTenancyResult, AWSError] = js.native
  /**
    * Modifies the instance tenancy attribute of the specified VPC. You can change the instance tenancy attribute of a VPC to default only. You cannot change the instance tenancy attribute to dedicated. After you modify the tenancy of the VPC, any new instances that you launch into the VPC have a tenancy of default, unless you specify otherwise during launch. The tenancy of any existing instances in the VPC is not affected. For more information, see Dedicated Instances in the Amazon Elastic Compute Cloud User Guide.
    */
  def modifyVpcTenancy(params: ModifyVpcTenancyRequest): Request[ModifyVpcTenancyResult, AWSError] = js.native
  def modifyVpcTenancy(
    params: ModifyVpcTenancyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyVpcTenancyResult, Unit]
  ): Request[ModifyVpcTenancyResult, AWSError] = js.native
  /**
    * Modifies the target gateway of an AWS Site-to-Site VPN connection. The following migration options are available:   An existing virtual private gateway to a new virtual private gateway   An existing virtual private gateway to a transit gateway   An existing transit gateway to a new transit gateway   An existing transit gateway to a virtual private gateway   Before you perform the migration to the new gateway, you must configure the new gateway. Use CreateVpnGateway to create a virtual private gateway, or CreateTransitGateway to create a transit gateway. This step is required when you migrate from a virtual private gateway with static routes to a transit gateway.  You must delete the static routes before you migrate to the new gateway. Keep a copy of the static route before you delete it. You will need to add back these routes to the transit gateway after the VPN connection migration is complete. After you migrate to the new gateway, you might need to modify your VPC route table. Use CreateRoute and DeleteRoute to make the changes described in VPN Gateway Target Modification Required VPC Route Table Updates in the AWS Site-to-Site VPN User Guide.  When the new gateway is a transit gateway, modify the transit gateway route table to allow traffic between the VPC and the AWS Site-to-Site VPN connection. Use CreateTransitGatewayRoute to add the routes.  If you deleted VPN static routes, you must add the static routes to the transit gateway route table. After you perform this operation, the AWS VPN endpoint's IP addresses on the AWS side and the tunnel options remain intact. Your s2slong; connection will be temporarily unavailable for approximately 10 minutes while we provision the new endpoints 
    */
  def modifyVpnConnection(): Request[ModifyVpnConnectionResult, AWSError] = js.native
  def modifyVpnConnection(callback: js.Function2[/* err */ AWSError, /* data */ ModifyVpnConnectionResult, Unit]): Request[ModifyVpnConnectionResult, AWSError] = js.native
  /**
    * Modifies the target gateway of an AWS Site-to-Site VPN connection. The following migration options are available:   An existing virtual private gateway to a new virtual private gateway   An existing virtual private gateway to a transit gateway   An existing transit gateway to a new transit gateway   An existing transit gateway to a virtual private gateway   Before you perform the migration to the new gateway, you must configure the new gateway. Use CreateVpnGateway to create a virtual private gateway, or CreateTransitGateway to create a transit gateway. This step is required when you migrate from a virtual private gateway with static routes to a transit gateway.  You must delete the static routes before you migrate to the new gateway. Keep a copy of the static route before you delete it. You will need to add back these routes to the transit gateway after the VPN connection migration is complete. After you migrate to the new gateway, you might need to modify your VPC route table. Use CreateRoute and DeleteRoute to make the changes described in VPN Gateway Target Modification Required VPC Route Table Updates in the AWS Site-to-Site VPN User Guide.  When the new gateway is a transit gateway, modify the transit gateway route table to allow traffic between the VPC and the AWS Site-to-Site VPN connection. Use CreateTransitGatewayRoute to add the routes.  If you deleted VPN static routes, you must add the static routes to the transit gateway route table. After you perform this operation, the AWS VPN endpoint's IP addresses on the AWS side and the tunnel options remain intact. Your s2slong; connection will be temporarily unavailable for approximately 10 minutes while we provision the new endpoints 
    */
  def modifyVpnConnection(params: ModifyVpnConnectionRequest): Request[ModifyVpnConnectionResult, AWSError] = js.native
  def modifyVpnConnection(
    params: ModifyVpnConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyVpnConnectionResult, Unit]
  ): Request[ModifyVpnConnectionResult, AWSError] = js.native
  /**
    * Modifies the VPN tunnel endpoint certificate.
    */
  def modifyVpnTunnelCertificate(): Request[ModifyVpnTunnelCertificateResult, AWSError] = js.native
  def modifyVpnTunnelCertificate(callback: js.Function2[/* err */ AWSError, /* data */ ModifyVpnTunnelCertificateResult, Unit]): Request[ModifyVpnTunnelCertificateResult, AWSError] = js.native
  /**
    * Modifies the VPN tunnel endpoint certificate.
    */
  def modifyVpnTunnelCertificate(params: ModifyVpnTunnelCertificateRequest): Request[ModifyVpnTunnelCertificateResult, AWSError] = js.native
  def modifyVpnTunnelCertificate(
    params: ModifyVpnTunnelCertificateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyVpnTunnelCertificateResult, Unit]
  ): Request[ModifyVpnTunnelCertificateResult, AWSError] = js.native
  /**
    * Modifies the options for a VPN tunnel in an AWS Site-to-Site VPN connection. You can modify multiple options for a tunnel in a single request, but you can only modify one tunnel at a time. For more information, see Site-to-Site VPN Tunnel Options for Your Site-to-Site VPN Connection in the AWS Site-to-Site VPN User Guide.
    */
  def modifyVpnTunnelOptions(): Request[ModifyVpnTunnelOptionsResult, AWSError] = js.native
  def modifyVpnTunnelOptions(callback: js.Function2[/* err */ AWSError, /* data */ ModifyVpnTunnelOptionsResult, Unit]): Request[ModifyVpnTunnelOptionsResult, AWSError] = js.native
  /**
    * Modifies the options for a VPN tunnel in an AWS Site-to-Site VPN connection. You can modify multiple options for a tunnel in a single request, but you can only modify one tunnel at a time. For more information, see Site-to-Site VPN Tunnel Options for Your Site-to-Site VPN Connection in the AWS Site-to-Site VPN User Guide.
    */
  def modifyVpnTunnelOptions(params: ModifyVpnTunnelOptionsRequest): Request[ModifyVpnTunnelOptionsResult, AWSError] = js.native
  def modifyVpnTunnelOptions(
    params: ModifyVpnTunnelOptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyVpnTunnelOptionsResult, Unit]
  ): Request[ModifyVpnTunnelOptionsResult, AWSError] = js.native
  /**
    * Enables detailed monitoring for a running instance. Otherwise, basic monitoring is enabled. For more information, see Monitoring Your Instances and Volumes in the Amazon Elastic Compute Cloud User Guide. To disable detailed monitoring, see .
    */
  def monitorInstances(): Request[MonitorInstancesResult, AWSError] = js.native
  def monitorInstances(callback: js.Function2[/* err */ AWSError, /* data */ MonitorInstancesResult, Unit]): Request[MonitorInstancesResult, AWSError] = js.native
  /**
    * Enables detailed monitoring for a running instance. Otherwise, basic monitoring is enabled. For more information, see Monitoring Your Instances and Volumes in the Amazon Elastic Compute Cloud User Guide. To disable detailed monitoring, see .
    */
  def monitorInstances(params: MonitorInstancesRequest): Request[MonitorInstancesResult, AWSError] = js.native
  def monitorInstances(
    params: MonitorInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ MonitorInstancesResult, Unit]
  ): Request[MonitorInstancesResult, AWSError] = js.native
  /**
    * Moves an Elastic IP address from the EC2-Classic platform to the EC2-VPC platform. The Elastic IP address must be allocated to your account for more than 24 hours, and it must not be associated with an instance. After the Elastic IP address is moved, it is no longer available for use in the EC2-Classic platform, unless you move it back using the RestoreAddressToClassic request. You cannot move an Elastic IP address that was originally allocated for use in the EC2-VPC platform to the EC2-Classic platform. 
    */
  def moveAddressToVpc(): Request[MoveAddressToVpcResult, AWSError] = js.native
  def moveAddressToVpc(callback: js.Function2[/* err */ AWSError, /* data */ MoveAddressToVpcResult, Unit]): Request[MoveAddressToVpcResult, AWSError] = js.native
  /**
    * Moves an Elastic IP address from the EC2-Classic platform to the EC2-VPC platform. The Elastic IP address must be allocated to your account for more than 24 hours, and it must not be associated with an instance. After the Elastic IP address is moved, it is no longer available for use in the EC2-Classic platform, unless you move it back using the RestoreAddressToClassic request. You cannot move an Elastic IP address that was originally allocated for use in the EC2-VPC platform to the EC2-Classic platform. 
    */
  def moveAddressToVpc(params: MoveAddressToVpcRequest): Request[MoveAddressToVpcResult, AWSError] = js.native
  def moveAddressToVpc(
    params: MoveAddressToVpcRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ MoveAddressToVpcResult, Unit]
  ): Request[MoveAddressToVpcResult, AWSError] = js.native
  /**
    * Provisions an address range for use with your AWS resources through bring your own IP addresses (BYOIP) and creates a corresponding address pool. After the address range is provisioned, it is ready to be advertised using AdvertiseByoipCidr. AWS verifies that you own the address range and are authorized to advertise it. You must ensure that the address range is registered to you and that you created an RPKI ROA to authorize Amazon ASNs 16509 and 14618 to advertise the address range. For more information, see Bring Your Own IP Addresses (BYOIP) in the Amazon Elastic Compute Cloud User Guide. Provisioning an address range is an asynchronous operation, so the call returns immediately, but the address range is not ready to use until its status changes from pending-provision to provisioned. To monitor the status of an address range, use DescribeByoipCidrs. To allocate an Elastic IP address from your address pool, use AllocateAddress with either the specific address from the address pool or the ID of the address pool.
    */
  def provisionByoipCidr(): Request[ProvisionByoipCidrResult, AWSError] = js.native
  def provisionByoipCidr(callback: js.Function2[/* err */ AWSError, /* data */ ProvisionByoipCidrResult, Unit]): Request[ProvisionByoipCidrResult, AWSError] = js.native
  /**
    * Provisions an address range for use with your AWS resources through bring your own IP addresses (BYOIP) and creates a corresponding address pool. After the address range is provisioned, it is ready to be advertised using AdvertiseByoipCidr. AWS verifies that you own the address range and are authorized to advertise it. You must ensure that the address range is registered to you and that you created an RPKI ROA to authorize Amazon ASNs 16509 and 14618 to advertise the address range. For more information, see Bring Your Own IP Addresses (BYOIP) in the Amazon Elastic Compute Cloud User Guide. Provisioning an address range is an asynchronous operation, so the call returns immediately, but the address range is not ready to use until its status changes from pending-provision to provisioned. To monitor the status of an address range, use DescribeByoipCidrs. To allocate an Elastic IP address from your address pool, use AllocateAddress with either the specific address from the address pool or the ID of the address pool.
    */
  def provisionByoipCidr(params: ProvisionByoipCidrRequest): Request[ProvisionByoipCidrResult, AWSError] = js.native
  def provisionByoipCidr(
    params: ProvisionByoipCidrRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ProvisionByoipCidrResult, Unit]
  ): Request[ProvisionByoipCidrResult, AWSError] = js.native
  /**
    * Purchase a reservation with configurations that match those of your Dedicated Host. You must have active Dedicated Hosts in your account before you purchase a reservation. This action results in the specified reservation being purchased and charged to your account.
    */
  def purchaseHostReservation(): Request[PurchaseHostReservationResult, AWSError] = js.native
  def purchaseHostReservation(callback: js.Function2[/* err */ AWSError, /* data */ PurchaseHostReservationResult, Unit]): Request[PurchaseHostReservationResult, AWSError] = js.native
  /**
    * Purchase a reservation with configurations that match those of your Dedicated Host. You must have active Dedicated Hosts in your account before you purchase a reservation. This action results in the specified reservation being purchased and charged to your account.
    */
  def purchaseHostReservation(params: PurchaseHostReservationRequest): Request[PurchaseHostReservationResult, AWSError] = js.native
  def purchaseHostReservation(
    params: PurchaseHostReservationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PurchaseHostReservationResult, Unit]
  ): Request[PurchaseHostReservationResult, AWSError] = js.native
  /**
    * Purchases a Reserved Instance for use with your account. With Reserved Instances, you pay a lower hourly rate compared to On-Demand instance pricing. Use DescribeReservedInstancesOfferings to get a list of Reserved Instance offerings that match your specifications. After you've purchased a Reserved Instance, you can check for your new Reserved Instance with DescribeReservedInstances. To queue a purchase for a future date and time, specify a purchase time. If you do not specify a purchase time, the default is the current time. For more information, see Reserved Instances and Reserved Instance Marketplace in the Amazon Elastic Compute Cloud User Guide.
    */
  def purchaseReservedInstancesOffering(): Request[PurchaseReservedInstancesOfferingResult, AWSError] = js.native
  def purchaseReservedInstancesOffering(
    callback: js.Function2[/* err */ AWSError, /* data */ PurchaseReservedInstancesOfferingResult, Unit]
  ): Request[PurchaseReservedInstancesOfferingResult, AWSError] = js.native
  /**
    * Purchases a Reserved Instance for use with your account. With Reserved Instances, you pay a lower hourly rate compared to On-Demand instance pricing. Use DescribeReservedInstancesOfferings to get a list of Reserved Instance offerings that match your specifications. After you've purchased a Reserved Instance, you can check for your new Reserved Instance with DescribeReservedInstances. To queue a purchase for a future date and time, specify a purchase time. If you do not specify a purchase time, the default is the current time. For more information, see Reserved Instances and Reserved Instance Marketplace in the Amazon Elastic Compute Cloud User Guide.
    */
  def purchaseReservedInstancesOffering(params: PurchaseReservedInstancesOfferingRequest): Request[PurchaseReservedInstancesOfferingResult, AWSError] = js.native
  def purchaseReservedInstancesOffering(
    params: PurchaseReservedInstancesOfferingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PurchaseReservedInstancesOfferingResult, Unit]
  ): Request[PurchaseReservedInstancesOfferingResult, AWSError] = js.native
  /**
    * Purchases the Scheduled Instances with the specified schedule. Scheduled Instances enable you to purchase Amazon EC2 compute capacity by the hour for a one-year term. Before you can purchase a Scheduled Instance, you must call DescribeScheduledInstanceAvailability to check for available schedules and obtain a purchase token. After you purchase a Scheduled Instance, you must call RunScheduledInstances during each scheduled time period. After you purchase a Scheduled Instance, you can't cancel, modify, or resell your purchase.
    */
  def purchaseScheduledInstances(): Request[PurchaseScheduledInstancesResult, AWSError] = js.native
  def purchaseScheduledInstances(callback: js.Function2[/* err */ AWSError, /* data */ PurchaseScheduledInstancesResult, Unit]): Request[PurchaseScheduledInstancesResult, AWSError] = js.native
  /**
    * Purchases the Scheduled Instances with the specified schedule. Scheduled Instances enable you to purchase Amazon EC2 compute capacity by the hour for a one-year term. Before you can purchase a Scheduled Instance, you must call DescribeScheduledInstanceAvailability to check for available schedules and obtain a purchase token. After you purchase a Scheduled Instance, you must call RunScheduledInstances during each scheduled time period. After you purchase a Scheduled Instance, you can't cancel, modify, or resell your purchase.
    */
  def purchaseScheduledInstances(params: PurchaseScheduledInstancesRequest): Request[PurchaseScheduledInstancesResult, AWSError] = js.native
  def purchaseScheduledInstances(
    params: PurchaseScheduledInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PurchaseScheduledInstancesResult, Unit]
  ): Request[PurchaseScheduledInstancesResult, AWSError] = js.native
  /**
    * Requests a reboot of the specified instances. This operation is asynchronous; it only queues a request to reboot the specified instances. The operation succeeds if the instances are valid and belong to you. Requests to reboot terminated instances are ignored. If an instance does not cleanly shut down within four minutes, Amazon EC2 performs a hard reboot. For more information about troubleshooting, see Getting Console Output and Rebooting Instances in the Amazon Elastic Compute Cloud User Guide.
    */
  def rebootInstances(): Request[js.Object, AWSError] = js.native
  def rebootInstances(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Requests a reboot of the specified instances. This operation is asynchronous; it only queues a request to reboot the specified instances. The operation succeeds if the instances are valid and belong to you. Requests to reboot terminated instances are ignored. If an instance does not cleanly shut down within four minutes, Amazon EC2 performs a hard reboot. For more information about troubleshooting, see Getting Console Output and Rebooting Instances in the Amazon Elastic Compute Cloud User Guide.
    */
  def rebootInstances(params: RebootInstancesRequest): Request[js.Object, AWSError] = js.native
  def rebootInstances(
    params: RebootInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Registers an AMI. When you're creating an AMI, this is the final step you must complete before you can launch an instance from the AMI. For more information about creating AMIs, see Creating Your Own AMIs in the Amazon Elastic Compute Cloud User Guide.  For Amazon EBS-backed instances, CreateImage creates and registers the AMI in a single request, so you don't have to register the AMI yourself.  You can also use RegisterImage to create an Amazon EBS-backed Linux AMI from a snapshot of a root device volume. You specify the snapshot using the block device mapping. For more information, see Launching a Linux Instance from a Backup in the Amazon Elastic Compute Cloud User Guide. You can't register an image where a secondary (non-root) snapshot has AWS Marketplace product codes. Windows and some Linux distributions, such as Red Hat Enterprise Linux (RHEL) and SUSE Linux Enterprise Server (SLES), use the EC2 billing product code associated with an AMI to verify the subscription status for package updates. To create a new AMI for operating systems that require a billing product code, do the following:   Launch an instance from an existing AMI with that billing product code.   Customize the instance.   Create a new AMI from the instance using CreateImage to preserve the billing product code association.   If you purchase a Reserved Instance to apply to an On-Demand Instance that was launched from an AMI with a billing product code, make sure that the Reserved Instance has the matching billing product code. If you purchase a Reserved Instance without the matching billing product code, the Reserved Instance will not be applied to the On-Demand Instance.  If needed, you can deregister an AMI at any time. Any modifications you make to an AMI backed by an instance store volume invalidates its registration. If you make changes to an image, deregister the previous image and register the new image.
    */
  def registerImage(): Request[RegisterImageResult, AWSError] = js.native
  def registerImage(callback: js.Function2[/* err */ AWSError, /* data */ RegisterImageResult, Unit]): Request[RegisterImageResult, AWSError] = js.native
  /**
    * Registers an AMI. When you're creating an AMI, this is the final step you must complete before you can launch an instance from the AMI. For more information about creating AMIs, see Creating Your Own AMIs in the Amazon Elastic Compute Cloud User Guide.  For Amazon EBS-backed instances, CreateImage creates and registers the AMI in a single request, so you don't have to register the AMI yourself.  You can also use RegisterImage to create an Amazon EBS-backed Linux AMI from a snapshot of a root device volume. You specify the snapshot using the block device mapping. For more information, see Launching a Linux Instance from a Backup in the Amazon Elastic Compute Cloud User Guide. You can't register an image where a secondary (non-root) snapshot has AWS Marketplace product codes. Windows and some Linux distributions, such as Red Hat Enterprise Linux (RHEL) and SUSE Linux Enterprise Server (SLES), use the EC2 billing product code associated with an AMI to verify the subscription status for package updates. To create a new AMI for operating systems that require a billing product code, do the following:   Launch an instance from an existing AMI with that billing product code.   Customize the instance.   Create a new AMI from the instance using CreateImage to preserve the billing product code association.   If you purchase a Reserved Instance to apply to an On-Demand Instance that was launched from an AMI with a billing product code, make sure that the Reserved Instance has the matching billing product code. If you purchase a Reserved Instance without the matching billing product code, the Reserved Instance will not be applied to the On-Demand Instance.  If needed, you can deregister an AMI at any time. Any modifications you make to an AMI backed by an instance store volume invalidates its registration. If you make changes to an image, deregister the previous image and register the new image.
    */
  def registerImage(params: RegisterImageRequest): Request[RegisterImageResult, AWSError] = js.native
  def registerImage(
    params: RegisterImageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterImageResult, Unit]
  ): Request[RegisterImageResult, AWSError] = js.native
  /**
    * Registers members (network interfaces) with the transit gateway multicast group. A member is a network interface associated with a supported EC2 instance that receives multicast traffic. For information about supported instances, see Multicast Consideration in Amazon VPC Transit Gateways. After you add the members, use SearchTransitGatewayMulticastGroups to verify that the members were added to the transit gateway multicast group.
    */
  def registerTransitGatewayMulticastGroupMembers(): Request[RegisterTransitGatewayMulticastGroupMembersResult, AWSError] = js.native
  def registerTransitGatewayMulticastGroupMembers(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ RegisterTransitGatewayMulticastGroupMembersResult, 
      Unit
    ]
  ): Request[RegisterTransitGatewayMulticastGroupMembersResult, AWSError] = js.native
  /**
    * Registers members (network interfaces) with the transit gateway multicast group. A member is a network interface associated with a supported EC2 instance that receives multicast traffic. For information about supported instances, see Multicast Consideration in Amazon VPC Transit Gateways. After you add the members, use SearchTransitGatewayMulticastGroups to verify that the members were added to the transit gateway multicast group.
    */
  def registerTransitGatewayMulticastGroupMembers(params: RegisterTransitGatewayMulticastGroupMembersRequest): Request[RegisterTransitGatewayMulticastGroupMembersResult, AWSError] = js.native
  def registerTransitGatewayMulticastGroupMembers(
    params: RegisterTransitGatewayMulticastGroupMembersRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ RegisterTransitGatewayMulticastGroupMembersResult, 
      Unit
    ]
  ): Request[RegisterTransitGatewayMulticastGroupMembersResult, AWSError] = js.native
  /**
    * Registers sources (network interfaces) with the specified transit gateway multicast group. A multicast source is a network interface attached to a supported instance that sends multicast traffic. For information about supported instances, see Multicast Considerations in Amazon VPC Transit Gateways. After you add the source, use SearchTransitGatewayMulticastGroups to verify that the source was added to the multicast group.
    */
  def registerTransitGatewayMulticastGroupSources(): Request[RegisterTransitGatewayMulticastGroupSourcesResult, AWSError] = js.native
  def registerTransitGatewayMulticastGroupSources(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ RegisterTransitGatewayMulticastGroupSourcesResult, 
      Unit
    ]
  ): Request[RegisterTransitGatewayMulticastGroupSourcesResult, AWSError] = js.native
  /**
    * Registers sources (network interfaces) with the specified transit gateway multicast group. A multicast source is a network interface attached to a supported instance that sends multicast traffic. For information about supported instances, see Multicast Considerations in Amazon VPC Transit Gateways. After you add the source, use SearchTransitGatewayMulticastGroups to verify that the source was added to the multicast group.
    */
  def registerTransitGatewayMulticastGroupSources(params: RegisterTransitGatewayMulticastGroupSourcesRequest): Request[RegisterTransitGatewayMulticastGroupSourcesResult, AWSError] = js.native
  def registerTransitGatewayMulticastGroupSources(
    params: RegisterTransitGatewayMulticastGroupSourcesRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ RegisterTransitGatewayMulticastGroupSourcesResult, 
      Unit
    ]
  ): Request[RegisterTransitGatewayMulticastGroupSourcesResult, AWSError] = js.native
  /**
    * Rejects a transit gateway peering attachment request.
    */
  def rejectTransitGatewayPeeringAttachment(): Request[RejectTransitGatewayPeeringAttachmentResult, AWSError] = js.native
  def rejectTransitGatewayPeeringAttachment(
    callback: js.Function2[/* err */ AWSError, /* data */ RejectTransitGatewayPeeringAttachmentResult, Unit]
  ): Request[RejectTransitGatewayPeeringAttachmentResult, AWSError] = js.native
  /**
    * Rejects a transit gateway peering attachment request.
    */
  def rejectTransitGatewayPeeringAttachment(params: RejectTransitGatewayPeeringAttachmentRequest): Request[RejectTransitGatewayPeeringAttachmentResult, AWSError] = js.native
  def rejectTransitGatewayPeeringAttachment(
    params: RejectTransitGatewayPeeringAttachmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RejectTransitGatewayPeeringAttachmentResult, Unit]
  ): Request[RejectTransitGatewayPeeringAttachmentResult, AWSError] = js.native
  /**
    * Rejects a request to attach a VPC to a transit gateway. The VPC attachment must be in the pendingAcceptance state. Use DescribeTransitGatewayVpcAttachments to view your pending VPC attachment requests. Use AcceptTransitGatewayVpcAttachment to accept a VPC attachment request.
    */
  def rejectTransitGatewayVpcAttachment(): Request[RejectTransitGatewayVpcAttachmentResult, AWSError] = js.native
  def rejectTransitGatewayVpcAttachment(
    callback: js.Function2[/* err */ AWSError, /* data */ RejectTransitGatewayVpcAttachmentResult, Unit]
  ): Request[RejectTransitGatewayVpcAttachmentResult, AWSError] = js.native
  /**
    * Rejects a request to attach a VPC to a transit gateway. The VPC attachment must be in the pendingAcceptance state. Use DescribeTransitGatewayVpcAttachments to view your pending VPC attachment requests. Use AcceptTransitGatewayVpcAttachment to accept a VPC attachment request.
    */
  def rejectTransitGatewayVpcAttachment(params: RejectTransitGatewayVpcAttachmentRequest): Request[RejectTransitGatewayVpcAttachmentResult, AWSError] = js.native
  def rejectTransitGatewayVpcAttachment(
    params: RejectTransitGatewayVpcAttachmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RejectTransitGatewayVpcAttachmentResult, Unit]
  ): Request[RejectTransitGatewayVpcAttachmentResult, AWSError] = js.native
  /**
    * Rejects one or more VPC endpoint connection requests to your VPC endpoint service.
    */
  def rejectVpcEndpointConnections(): Request[RejectVpcEndpointConnectionsResult, AWSError] = js.native
  def rejectVpcEndpointConnections(callback: js.Function2[/* err */ AWSError, /* data */ RejectVpcEndpointConnectionsResult, Unit]): Request[RejectVpcEndpointConnectionsResult, AWSError] = js.native
  /**
    * Rejects one or more VPC endpoint connection requests to your VPC endpoint service.
    */
  def rejectVpcEndpointConnections(params: RejectVpcEndpointConnectionsRequest): Request[RejectVpcEndpointConnectionsResult, AWSError] = js.native
  def rejectVpcEndpointConnections(
    params: RejectVpcEndpointConnectionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RejectVpcEndpointConnectionsResult, Unit]
  ): Request[RejectVpcEndpointConnectionsResult, AWSError] = js.native
  /**
    * Rejects a VPC peering connection request. The VPC peering connection must be in the pending-acceptance state. Use the DescribeVpcPeeringConnections request to view your outstanding VPC peering connection requests. To delete an active VPC peering connection, or to delete a VPC peering connection request that you initiated, use DeleteVpcPeeringConnection.
    */
  def rejectVpcPeeringConnection(): Request[RejectVpcPeeringConnectionResult, AWSError] = js.native
  def rejectVpcPeeringConnection(callback: js.Function2[/* err */ AWSError, /* data */ RejectVpcPeeringConnectionResult, Unit]): Request[RejectVpcPeeringConnectionResult, AWSError] = js.native
  /**
    * Rejects a VPC peering connection request. The VPC peering connection must be in the pending-acceptance state. Use the DescribeVpcPeeringConnections request to view your outstanding VPC peering connection requests. To delete an active VPC peering connection, or to delete a VPC peering connection request that you initiated, use DeleteVpcPeeringConnection.
    */
  def rejectVpcPeeringConnection(params: RejectVpcPeeringConnectionRequest): Request[RejectVpcPeeringConnectionResult, AWSError] = js.native
  def rejectVpcPeeringConnection(
    params: RejectVpcPeeringConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RejectVpcPeeringConnectionResult, Unit]
  ): Request[RejectVpcPeeringConnectionResult, AWSError] = js.native
  /**
    * Releases the specified Elastic IP address. [EC2-Classic, default VPC] Releasing an Elastic IP address automatically disassociates it from any instance that it's associated with. To disassociate an Elastic IP address without releasing it, use DisassociateAddress. [Nondefault VPC] You must use DisassociateAddress to disassociate the Elastic IP address before you can release it. Otherwise, Amazon EC2 returns an error (InvalidIPAddress.InUse). After releasing an Elastic IP address, it is released to the IP address pool. Be sure to update your DNS records and any servers or devices that communicate with the address. If you attempt to release an Elastic IP address that you already released, you'll get an AuthFailure error if the address is already allocated to another AWS account. [EC2-VPC] After you release an Elastic IP address for use in a VPC, you might be able to recover it. For more information, see AllocateAddress.
    */
  def releaseAddress(): Request[js.Object, AWSError] = js.native
  def releaseAddress(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Releases the specified Elastic IP address. [EC2-Classic, default VPC] Releasing an Elastic IP address automatically disassociates it from any instance that it's associated with. To disassociate an Elastic IP address without releasing it, use DisassociateAddress. [Nondefault VPC] You must use DisassociateAddress to disassociate the Elastic IP address before you can release it. Otherwise, Amazon EC2 returns an error (InvalidIPAddress.InUse). After releasing an Elastic IP address, it is released to the IP address pool. Be sure to update your DNS records and any servers or devices that communicate with the address. If you attempt to release an Elastic IP address that you already released, you'll get an AuthFailure error if the address is already allocated to another AWS account. [EC2-VPC] After you release an Elastic IP address for use in a VPC, you might be able to recover it. For more information, see AllocateAddress.
    */
  def releaseAddress(params: ReleaseAddressRequest): Request[js.Object, AWSError] = js.native
  def releaseAddress(
    params: ReleaseAddressRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * When you no longer want to use an On-Demand Dedicated Host it can be released. On-Demand billing is stopped and the host goes into released state. The host ID of Dedicated Hosts that have been released can no longer be specified in another request, for example, to modify the host. You must stop or terminate all instances on a host before it can be released. When Dedicated Hosts are released, it may take some time for them to stop counting toward your limit and you may receive capacity errors when trying to allocate new Dedicated Hosts. Wait a few minutes and then try again. Released hosts still appear in a DescribeHosts response.
    */
  def releaseHosts(): Request[ReleaseHostsResult, AWSError] = js.native
  def releaseHosts(callback: js.Function2[/* err */ AWSError, /* data */ ReleaseHostsResult, Unit]): Request[ReleaseHostsResult, AWSError] = js.native
  /**
    * When you no longer want to use an On-Demand Dedicated Host it can be released. On-Demand billing is stopped and the host goes into released state. The host ID of Dedicated Hosts that have been released can no longer be specified in another request, for example, to modify the host. You must stop or terminate all instances on a host before it can be released. When Dedicated Hosts are released, it may take some time for them to stop counting toward your limit and you may receive capacity errors when trying to allocate new Dedicated Hosts. Wait a few minutes and then try again. Released hosts still appear in a DescribeHosts response.
    */
  def releaseHosts(params: ReleaseHostsRequest): Request[ReleaseHostsResult, AWSError] = js.native
  def releaseHosts(
    params: ReleaseHostsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ReleaseHostsResult, Unit]
  ): Request[ReleaseHostsResult, AWSError] = js.native
  /**
    * Replaces an IAM instance profile for the specified running instance. You can use this action to change the IAM instance profile that's associated with an instance without having to disassociate the existing IAM instance profile first. Use DescribeIamInstanceProfileAssociations to get the association ID.
    */
  def replaceIamInstanceProfileAssociation(): Request[ReplaceIamInstanceProfileAssociationResult, AWSError] = js.native
  def replaceIamInstanceProfileAssociation(
    callback: js.Function2[/* err */ AWSError, /* data */ ReplaceIamInstanceProfileAssociationResult, Unit]
  ): Request[ReplaceIamInstanceProfileAssociationResult, AWSError] = js.native
  /**
    * Replaces an IAM instance profile for the specified running instance. You can use this action to change the IAM instance profile that's associated with an instance without having to disassociate the existing IAM instance profile first. Use DescribeIamInstanceProfileAssociations to get the association ID.
    */
  def replaceIamInstanceProfileAssociation(params: ReplaceIamInstanceProfileAssociationRequest): Request[ReplaceIamInstanceProfileAssociationResult, AWSError] = js.native
  def replaceIamInstanceProfileAssociation(
    params: ReplaceIamInstanceProfileAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ReplaceIamInstanceProfileAssociationResult, Unit]
  ): Request[ReplaceIamInstanceProfileAssociationResult, AWSError] = js.native
  /**
    * Changes which network ACL a subnet is associated with. By default when you create a subnet, it's automatically associated with the default network ACL. For more information, see Network ACLs in the Amazon Virtual Private Cloud User Guide. This is an idempotent operation.
    */
  def replaceNetworkAclAssociation(): Request[ReplaceNetworkAclAssociationResult, AWSError] = js.native
  def replaceNetworkAclAssociation(callback: js.Function2[/* err */ AWSError, /* data */ ReplaceNetworkAclAssociationResult, Unit]): Request[ReplaceNetworkAclAssociationResult, AWSError] = js.native
  /**
    * Changes which network ACL a subnet is associated with. By default when you create a subnet, it's automatically associated with the default network ACL. For more information, see Network ACLs in the Amazon Virtual Private Cloud User Guide. This is an idempotent operation.
    */
  def replaceNetworkAclAssociation(params: ReplaceNetworkAclAssociationRequest): Request[ReplaceNetworkAclAssociationResult, AWSError] = js.native
  def replaceNetworkAclAssociation(
    params: ReplaceNetworkAclAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ReplaceNetworkAclAssociationResult, Unit]
  ): Request[ReplaceNetworkAclAssociationResult, AWSError] = js.native
  /**
    * Replaces an entry (rule) in a network ACL. For more information, see Network ACLs in the Amazon Virtual Private Cloud User Guide.
    */
  def replaceNetworkAclEntry(): Request[js.Object, AWSError] = js.native
  def replaceNetworkAclEntry(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Replaces an entry (rule) in a network ACL. For more information, see Network ACLs in the Amazon Virtual Private Cloud User Guide.
    */
  def replaceNetworkAclEntry(params: ReplaceNetworkAclEntryRequest): Request[js.Object, AWSError] = js.native
  def replaceNetworkAclEntry(
    params: ReplaceNetworkAclEntryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Replaces an existing route within a route table in a VPC. You must provide only one of the following: internet gateway, virtual private gateway, NAT instance, NAT gateway, VPC peering connection, network interface, egress-only internet gateway, or transit gateway. For more information, see Route Tables in the Amazon Virtual Private Cloud User Guide.
    */
  def replaceRoute(): Request[js.Object, AWSError] = js.native
  def replaceRoute(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Replaces an existing route within a route table in a VPC. You must provide only one of the following: internet gateway, virtual private gateway, NAT instance, NAT gateway, VPC peering connection, network interface, egress-only internet gateway, or transit gateway. For more information, see Route Tables in the Amazon Virtual Private Cloud User Guide.
    */
  def replaceRoute(params: ReplaceRouteRequest): Request[js.Object, AWSError] = js.native
  def replaceRoute(
    params: ReplaceRouteRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Changes the route table associated with a given subnet, internet gateway, or virtual private gateway in a VPC. After the operation completes, the subnet or gateway uses the routes in the new route table. For more information about route tables, see Route Tables in the Amazon Virtual Private Cloud User Guide. You can also use this operation to change which table is the main route table in the VPC. Specify the main route table's association ID and the route table ID of the new main route table.
    */
  def replaceRouteTableAssociation(): Request[ReplaceRouteTableAssociationResult, AWSError] = js.native
  def replaceRouteTableAssociation(callback: js.Function2[/* err */ AWSError, /* data */ ReplaceRouteTableAssociationResult, Unit]): Request[ReplaceRouteTableAssociationResult, AWSError] = js.native
  /**
    * Changes the route table associated with a given subnet, internet gateway, or virtual private gateway in a VPC. After the operation completes, the subnet or gateway uses the routes in the new route table. For more information about route tables, see Route Tables in the Amazon Virtual Private Cloud User Guide. You can also use this operation to change which table is the main route table in the VPC. Specify the main route table's association ID and the route table ID of the new main route table.
    */
  def replaceRouteTableAssociation(params: ReplaceRouteTableAssociationRequest): Request[ReplaceRouteTableAssociationResult, AWSError] = js.native
  def replaceRouteTableAssociation(
    params: ReplaceRouteTableAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ReplaceRouteTableAssociationResult, Unit]
  ): Request[ReplaceRouteTableAssociationResult, AWSError] = js.native
  /**
    * Replaces the specified route in the specified transit gateway route table.
    */
  def replaceTransitGatewayRoute(): Request[ReplaceTransitGatewayRouteResult, AWSError] = js.native
  def replaceTransitGatewayRoute(callback: js.Function2[/* err */ AWSError, /* data */ ReplaceTransitGatewayRouteResult, Unit]): Request[ReplaceTransitGatewayRouteResult, AWSError] = js.native
  /**
    * Replaces the specified route in the specified transit gateway route table.
    */
  def replaceTransitGatewayRoute(params: ReplaceTransitGatewayRouteRequest): Request[ReplaceTransitGatewayRouteResult, AWSError] = js.native
  def replaceTransitGatewayRoute(
    params: ReplaceTransitGatewayRouteRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ReplaceTransitGatewayRouteResult, Unit]
  ): Request[ReplaceTransitGatewayRouteResult, AWSError] = js.native
  /**
    * Submits feedback about the status of an instance. The instance must be in the running state. If your experience with the instance differs from the instance status returned by DescribeInstanceStatus, use ReportInstanceStatus to report your experience with the instance. Amazon EC2 collects this information to improve the accuracy of status checks. Use of this action does not change the value returned by DescribeInstanceStatus.
    */
  def reportInstanceStatus(): Request[js.Object, AWSError] = js.native
  def reportInstanceStatus(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Submits feedback about the status of an instance. The instance must be in the running state. If your experience with the instance differs from the instance status returned by DescribeInstanceStatus, use ReportInstanceStatus to report your experience with the instance. Amazon EC2 collects this information to improve the accuracy of status checks. Use of this action does not change the value returned by DescribeInstanceStatus.
    */
  def reportInstanceStatus(params: ReportInstanceStatusRequest): Request[js.Object, AWSError] = js.native
  def reportInstanceStatus(
    params: ReportInstanceStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Creates a Spot Fleet request. The Spot Fleet request specifies the total target capacity and the On-Demand target capacity. Amazon EC2 calculates the difference between the total capacity and On-Demand capacity, and launches the difference as Spot capacity. You can submit a single request that includes multiple launch specifications that vary by instance type, AMI, Availability Zone, or subnet. By default, the Spot Fleet requests Spot Instances in the Spot Instance pool where the price per unit is the lowest. Each launch specification can include its own instance weighting that reflects the value of the instance type to your application workload. Alternatively, you can specify that the Spot Fleet distribute the target capacity across the Spot pools included in its launch specifications. By ensuring that the Spot Instances in your Spot Fleet are in different Spot pools, you can improve the availability of your fleet. You can specify tags for the Spot Instances. You cannot tag other resource types in a Spot Fleet request because only the instance resource type is supported. For more information, see Spot Fleet Requests in the Amazon EC2 User Guide for Linux Instances.
    */
  def requestSpotFleet(): Request[RequestSpotFleetResponse, AWSError] = js.native
  def requestSpotFleet(callback: js.Function2[/* err */ AWSError, /* data */ RequestSpotFleetResponse, Unit]): Request[RequestSpotFleetResponse, AWSError] = js.native
  /**
    * Creates a Spot Fleet request. The Spot Fleet request specifies the total target capacity and the On-Demand target capacity. Amazon EC2 calculates the difference between the total capacity and On-Demand capacity, and launches the difference as Spot capacity. You can submit a single request that includes multiple launch specifications that vary by instance type, AMI, Availability Zone, or subnet. By default, the Spot Fleet requests Spot Instances in the Spot Instance pool where the price per unit is the lowest. Each launch specification can include its own instance weighting that reflects the value of the instance type to your application workload. Alternatively, you can specify that the Spot Fleet distribute the target capacity across the Spot pools included in its launch specifications. By ensuring that the Spot Instances in your Spot Fleet are in different Spot pools, you can improve the availability of your fleet. You can specify tags for the Spot Instances. You cannot tag other resource types in a Spot Fleet request because only the instance resource type is supported. For more information, see Spot Fleet Requests in the Amazon EC2 User Guide for Linux Instances.
    */
  def requestSpotFleet(params: RequestSpotFleetRequest): Request[RequestSpotFleetResponse, AWSError] = js.native
  def requestSpotFleet(
    params: RequestSpotFleetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RequestSpotFleetResponse, Unit]
  ): Request[RequestSpotFleetResponse, AWSError] = js.native
  /**
    * Creates a Spot Instance request. For more information, see Spot Instance Requests in the Amazon EC2 User Guide for Linux Instances.
    */
  def requestSpotInstances(): Request[RequestSpotInstancesResult, AWSError] = js.native
  def requestSpotInstances(callback: js.Function2[/* err */ AWSError, /* data */ RequestSpotInstancesResult, Unit]): Request[RequestSpotInstancesResult, AWSError] = js.native
  /**
    * Creates a Spot Instance request. For more information, see Spot Instance Requests in the Amazon EC2 User Guide for Linux Instances.
    */
  def requestSpotInstances(params: RequestSpotInstancesRequest): Request[RequestSpotInstancesResult, AWSError] = js.native
  def requestSpotInstances(
    params: RequestSpotInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RequestSpotInstancesResult, Unit]
  ): Request[RequestSpotInstancesResult, AWSError] = js.native
  /**
    * Resets the default customer master key (CMK) for EBS encryption for your account in this Region to the AWS managed CMK for EBS. After resetting the default CMK to the AWS managed CMK, you can continue to encrypt by a customer managed CMK by specifying it when you create the volume. For more information, see Amazon EBS Encryption in the Amazon Elastic Compute Cloud User Guide.
    */
  def resetEbsDefaultKmsKeyId(): Request[ResetEbsDefaultKmsKeyIdResult, AWSError] = js.native
  def resetEbsDefaultKmsKeyId(callback: js.Function2[/* err */ AWSError, /* data */ ResetEbsDefaultKmsKeyIdResult, Unit]): Request[ResetEbsDefaultKmsKeyIdResult, AWSError] = js.native
  /**
    * Resets the default customer master key (CMK) for EBS encryption for your account in this Region to the AWS managed CMK for EBS. After resetting the default CMK to the AWS managed CMK, you can continue to encrypt by a customer managed CMK by specifying it when you create the volume. For more information, see Amazon EBS Encryption in the Amazon Elastic Compute Cloud User Guide.
    */
  def resetEbsDefaultKmsKeyId(params: ResetEbsDefaultKmsKeyIdRequest): Request[ResetEbsDefaultKmsKeyIdResult, AWSError] = js.native
  def resetEbsDefaultKmsKeyId(
    params: ResetEbsDefaultKmsKeyIdRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ResetEbsDefaultKmsKeyIdResult, Unit]
  ): Request[ResetEbsDefaultKmsKeyIdResult, AWSError] = js.native
  /**
    * Resets the specified attribute of the specified Amazon FPGA Image (AFI) to its default value. You can only reset the load permission attribute.
    */
  def resetFpgaImageAttribute(): Request[ResetFpgaImageAttributeResult, AWSError] = js.native
  def resetFpgaImageAttribute(callback: js.Function2[/* err */ AWSError, /* data */ ResetFpgaImageAttributeResult, Unit]): Request[ResetFpgaImageAttributeResult, AWSError] = js.native
  /**
    * Resets the specified attribute of the specified Amazon FPGA Image (AFI) to its default value. You can only reset the load permission attribute.
    */
  def resetFpgaImageAttribute(params: ResetFpgaImageAttributeRequest): Request[ResetFpgaImageAttributeResult, AWSError] = js.native
  def resetFpgaImageAttribute(
    params: ResetFpgaImageAttributeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ResetFpgaImageAttributeResult, Unit]
  ): Request[ResetFpgaImageAttributeResult, AWSError] = js.native
  /**
    * Resets an attribute of an AMI to its default value.  The productCodes attribute can't be reset. 
    */
  def resetImageAttribute(): Request[js.Object, AWSError] = js.native
  def resetImageAttribute(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Resets an attribute of an AMI to its default value.  The productCodes attribute can't be reset. 
    */
  def resetImageAttribute(params: ResetImageAttributeRequest): Request[js.Object, AWSError] = js.native
  def resetImageAttribute(
    params: ResetImageAttributeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Resets an attribute of an instance to its default value. To reset the kernel or ramdisk, the instance must be in a stopped state. To reset the sourceDestCheck, the instance can be either running or stopped. The sourceDestCheck attribute controls whether source/destination checking is enabled. The default value is true, which means checking is enabled. This value must be false for a NAT instance to perform NAT. For more information, see NAT Instances in the Amazon Virtual Private Cloud User Guide.
    */
  def resetInstanceAttribute(): Request[js.Object, AWSError] = js.native
  def resetInstanceAttribute(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Resets an attribute of an instance to its default value. To reset the kernel or ramdisk, the instance must be in a stopped state. To reset the sourceDestCheck, the instance can be either running or stopped. The sourceDestCheck attribute controls whether source/destination checking is enabled. The default value is true, which means checking is enabled. This value must be false for a NAT instance to perform NAT. For more information, see NAT Instances in the Amazon Virtual Private Cloud User Guide.
    */
  def resetInstanceAttribute(params: ResetInstanceAttributeRequest): Request[js.Object, AWSError] = js.native
  def resetInstanceAttribute(
    params: ResetInstanceAttributeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Resets a network interface attribute. You can specify only one attribute at a time.
    */
  def resetNetworkInterfaceAttribute(): Request[js.Object, AWSError] = js.native
  def resetNetworkInterfaceAttribute(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Resets a network interface attribute. You can specify only one attribute at a time.
    */
  def resetNetworkInterfaceAttribute(params: ResetNetworkInterfaceAttributeRequest): Request[js.Object, AWSError] = js.native
  def resetNetworkInterfaceAttribute(
    params: ResetNetworkInterfaceAttributeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Resets permission settings for the specified snapshot. For more information about modifying snapshot permissions, see Sharing Snapshots in the Amazon Elastic Compute Cloud User Guide.
    */
  def resetSnapshotAttribute(): Request[js.Object, AWSError] = js.native
  def resetSnapshotAttribute(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Resets permission settings for the specified snapshot. For more information about modifying snapshot permissions, see Sharing Snapshots in the Amazon Elastic Compute Cloud User Guide.
    */
  def resetSnapshotAttribute(params: ResetSnapshotAttributeRequest): Request[js.Object, AWSError] = js.native
  def resetSnapshotAttribute(
    params: ResetSnapshotAttributeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Restores an Elastic IP address that was previously moved to the EC2-VPC platform back to the EC2-Classic platform. You cannot move an Elastic IP address that was originally allocated for use in EC2-VPC. The Elastic IP address must not be associated with an instance or network interface.
    */
  def restoreAddressToClassic(): Request[RestoreAddressToClassicResult, AWSError] = js.native
  def restoreAddressToClassic(callback: js.Function2[/* err */ AWSError, /* data */ RestoreAddressToClassicResult, Unit]): Request[RestoreAddressToClassicResult, AWSError] = js.native
  /**
    * Restores an Elastic IP address that was previously moved to the EC2-VPC platform back to the EC2-Classic platform. You cannot move an Elastic IP address that was originally allocated for use in EC2-VPC. The Elastic IP address must not be associated with an instance or network interface.
    */
  def restoreAddressToClassic(params: RestoreAddressToClassicRequest): Request[RestoreAddressToClassicResult, AWSError] = js.native
  def restoreAddressToClassic(
    params: RestoreAddressToClassicRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RestoreAddressToClassicResult, Unit]
  ): Request[RestoreAddressToClassicResult, AWSError] = js.native
  /**
    * Removes an ingress authorization rule from a Client VPN endpoint. 
    */
  def revokeClientVpnIngress(): Request[RevokeClientVpnIngressResult, AWSError] = js.native
  def revokeClientVpnIngress(callback: js.Function2[/* err */ AWSError, /* data */ RevokeClientVpnIngressResult, Unit]): Request[RevokeClientVpnIngressResult, AWSError] = js.native
  /**
    * Removes an ingress authorization rule from a Client VPN endpoint. 
    */
  def revokeClientVpnIngress(params: RevokeClientVpnIngressRequest): Request[RevokeClientVpnIngressResult, AWSError] = js.native
  def revokeClientVpnIngress(
    params: RevokeClientVpnIngressRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RevokeClientVpnIngressResult, Unit]
  ): Request[RevokeClientVpnIngressResult, AWSError] = js.native
  /**
    * [VPC only] Removes the specified egress rules from a security group for EC2-VPC. This action doesn't apply to security groups for use in EC2-Classic. To remove a rule, the values that you specify (for example, ports) must match the existing rule's values exactly. Each rule consists of the protocol and the IPv4 or IPv6 CIDR range or source security group. For the TCP and UDP protocols, you must also specify the destination port or range of ports. For the ICMP protocol, you must also specify the ICMP type and code. If the security group rule has a description, you do not have to specify the description to revoke the rule. Rule changes are propagated to instances within the security group as quickly as possible. However, a small delay might occur.
    */
  def revokeSecurityGroupEgress(): Request[js.Object, AWSError] = js.native
  def revokeSecurityGroupEgress(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * [VPC only] Removes the specified egress rules from a security group for EC2-VPC. This action doesn't apply to security groups for use in EC2-Classic. To remove a rule, the values that you specify (for example, ports) must match the existing rule's values exactly. Each rule consists of the protocol and the IPv4 or IPv6 CIDR range or source security group. For the TCP and UDP protocols, you must also specify the destination port or range of ports. For the ICMP protocol, you must also specify the ICMP type and code. If the security group rule has a description, you do not have to specify the description to revoke the rule. Rule changes are propagated to instances within the security group as quickly as possible. However, a small delay might occur.
    */
  def revokeSecurityGroupEgress(params: RevokeSecurityGroupEgressRequest): Request[js.Object, AWSError] = js.native
  def revokeSecurityGroupEgress(
    params: RevokeSecurityGroupEgressRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Removes the specified ingress rules from a security group. To remove a rule, the values that you specify (for example, ports) must match the existing rule's values exactly.  [EC2-Classic only] If the values you specify do not match the existing rule's values, no error is returned. Use DescribeSecurityGroups to verify that the rule has been removed.  Each rule consists of the protocol and the CIDR range or source security group. For the TCP and UDP protocols, you must also specify the destination port or range of ports. For the ICMP protocol, you must also specify the ICMP type and code. If the security group rule has a description, you do not have to specify the description to revoke the rule. Rule changes are propagated to instances within the security group as quickly as possible. However, a small delay might occur.
    */
  def revokeSecurityGroupIngress(): Request[js.Object, AWSError] = js.native
  def revokeSecurityGroupIngress(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes the specified ingress rules from a security group. To remove a rule, the values that you specify (for example, ports) must match the existing rule's values exactly.  [EC2-Classic only] If the values you specify do not match the existing rule's values, no error is returned. Use DescribeSecurityGroups to verify that the rule has been removed.  Each rule consists of the protocol and the CIDR range or source security group. For the TCP and UDP protocols, you must also specify the destination port or range of ports. For the ICMP protocol, you must also specify the ICMP type and code. If the security group rule has a description, you do not have to specify the description to revoke the rule. Rule changes are propagated to instances within the security group as quickly as possible. However, a small delay might occur.
    */
  def revokeSecurityGroupIngress(params: RevokeSecurityGroupIngressRequest): Request[js.Object, AWSError] = js.native
  def revokeSecurityGroupIngress(
    params: RevokeSecurityGroupIngressRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Launches the specified number of instances using an AMI for which you have permissions.  You can specify a number of options, or leave the default options. The following rules apply:   [EC2-VPC] If you don't specify a subnet ID, we choose a default subnet from your default VPC for you. If you don't have a default VPC, you must specify a subnet ID in the request.   [EC2-Classic] If don't specify an Availability Zone, we choose one for you.   Some instance types must be launched into a VPC. If you do not have a default VPC, or if you do not specify a subnet ID, the request fails. For more information, see Instance Types Available Only in a VPC.   [EC2-VPC] All instances have a network interface with a primary private IPv4 address. If you don't specify this address, we choose one from the IPv4 range of your subnet.   Not all instance types support IPv6 addresses. For more information, see Instance Types.   If you don't specify a security group ID, we use the default security group. For more information, see Security Groups.   If any of the AMIs have a product code attached for which the user has not subscribed, the request fails.   You can create a launch template, which is a resource that contains the parameters to launch an instance. When you launch an instance using RunInstances, you can specify the launch template instead of specifying the launch parameters. To ensure faster instance launches, break up large requests into smaller batches. For example, create five separate launch requests for 100 instances each instead of one launch request for 500 instances. An instance is ready for you to use when it's in the running state. You can check the state of your instance using DescribeInstances. You can tag instances and EBS volumes during launch, after launch, or both. For more information, see CreateTags and Tagging Your Amazon EC2 Resources. Linux instances have access to the public key of the key pair at boot. You can use this key to provide secure access to the instance. Amazon EC2 public images use this feature to provide secure access without passwords. For more information, see Key Pairs in the Amazon Elastic Compute Cloud User Guide. For troubleshooting, see What To Do If An Instance Immediately Terminates, and Troubleshooting Connecting to Your Instance in the Amazon Elastic Compute Cloud User Guide.
    */
  def runInstances(): Request[Reservation, AWSError] = js.native
  def runInstances(callback: js.Function2[/* err */ AWSError, /* data */ Reservation, Unit]): Request[Reservation, AWSError] = js.native
  /**
    * Launches the specified number of instances using an AMI for which you have permissions.  You can specify a number of options, or leave the default options. The following rules apply:   [EC2-VPC] If you don't specify a subnet ID, we choose a default subnet from your default VPC for you. If you don't have a default VPC, you must specify a subnet ID in the request.   [EC2-Classic] If don't specify an Availability Zone, we choose one for you.   Some instance types must be launched into a VPC. If you do not have a default VPC, or if you do not specify a subnet ID, the request fails. For more information, see Instance Types Available Only in a VPC.   [EC2-VPC] All instances have a network interface with a primary private IPv4 address. If you don't specify this address, we choose one from the IPv4 range of your subnet.   Not all instance types support IPv6 addresses. For more information, see Instance Types.   If you don't specify a security group ID, we use the default security group. For more information, see Security Groups.   If any of the AMIs have a product code attached for which the user has not subscribed, the request fails.   You can create a launch template, which is a resource that contains the parameters to launch an instance. When you launch an instance using RunInstances, you can specify the launch template instead of specifying the launch parameters. To ensure faster instance launches, break up large requests into smaller batches. For example, create five separate launch requests for 100 instances each instead of one launch request for 500 instances. An instance is ready for you to use when it's in the running state. You can check the state of your instance using DescribeInstances. You can tag instances and EBS volumes during launch, after launch, or both. For more information, see CreateTags and Tagging Your Amazon EC2 Resources. Linux instances have access to the public key of the key pair at boot. You can use this key to provide secure access to the instance. Amazon EC2 public images use this feature to provide secure access without passwords. For more information, see Key Pairs in the Amazon Elastic Compute Cloud User Guide. For troubleshooting, see What To Do If An Instance Immediately Terminates, and Troubleshooting Connecting to Your Instance in the Amazon Elastic Compute Cloud User Guide.
    */
  def runInstances(params: RunInstancesRequest): Request[Reservation, AWSError] = js.native
  def runInstances(
    params: RunInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Reservation, Unit]
  ): Request[Reservation, AWSError] = js.native
  /**
    * Launches the specified Scheduled Instances. Before you can launch a Scheduled Instance, you must purchase it and obtain an identifier using PurchaseScheduledInstances. You must launch a Scheduled Instance during its scheduled time period. You can't stop or reboot a Scheduled Instance, but you can terminate it as needed. If you terminate a Scheduled Instance before the current scheduled time period ends, you can launch it again after a few minutes. For more information, see Scheduled Instances in the Amazon Elastic Compute Cloud User Guide.
    */
  def runScheduledInstances(): Request[RunScheduledInstancesResult, AWSError] = js.native
  def runScheduledInstances(callback: js.Function2[/* err */ AWSError, /* data */ RunScheduledInstancesResult, Unit]): Request[RunScheduledInstancesResult, AWSError] = js.native
  /**
    * Launches the specified Scheduled Instances. Before you can launch a Scheduled Instance, you must purchase it and obtain an identifier using PurchaseScheduledInstances. You must launch a Scheduled Instance during its scheduled time period. You can't stop or reboot a Scheduled Instance, but you can terminate it as needed. If you terminate a Scheduled Instance before the current scheduled time period ends, you can launch it again after a few minutes. For more information, see Scheduled Instances in the Amazon Elastic Compute Cloud User Guide.
    */
  def runScheduledInstances(params: RunScheduledInstancesRequest): Request[RunScheduledInstancesResult, AWSError] = js.native
  def runScheduledInstances(
    params: RunScheduledInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RunScheduledInstancesResult, Unit]
  ): Request[RunScheduledInstancesResult, AWSError] = js.native
  /**
    * Searches for routes in the specified local gateway route table.
    */
  def searchLocalGatewayRoutes(): Request[SearchLocalGatewayRoutesResult, AWSError] = js.native
  def searchLocalGatewayRoutes(callback: js.Function2[/* err */ AWSError, /* data */ SearchLocalGatewayRoutesResult, Unit]): Request[SearchLocalGatewayRoutesResult, AWSError] = js.native
  /**
    * Searches for routes in the specified local gateway route table.
    */
  def searchLocalGatewayRoutes(params: SearchLocalGatewayRoutesRequest): Request[SearchLocalGatewayRoutesResult, AWSError] = js.native
  def searchLocalGatewayRoutes(
    params: SearchLocalGatewayRoutesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchLocalGatewayRoutesResult, Unit]
  ): Request[SearchLocalGatewayRoutesResult, AWSError] = js.native
  /**
    * Searches one or more transit gateway multicast groups and returns the group membership information.
    */
  def searchTransitGatewayMulticastGroups(): Request[SearchTransitGatewayMulticastGroupsResult, AWSError] = js.native
  def searchTransitGatewayMulticastGroups(
    callback: js.Function2[/* err */ AWSError, /* data */ SearchTransitGatewayMulticastGroupsResult, Unit]
  ): Request[SearchTransitGatewayMulticastGroupsResult, AWSError] = js.native
  /**
    * Searches one or more transit gateway multicast groups and returns the group membership information.
    */
  def searchTransitGatewayMulticastGroups(params: SearchTransitGatewayMulticastGroupsRequest): Request[SearchTransitGatewayMulticastGroupsResult, AWSError] = js.native
  def searchTransitGatewayMulticastGroups(
    params: SearchTransitGatewayMulticastGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchTransitGatewayMulticastGroupsResult, Unit]
  ): Request[SearchTransitGatewayMulticastGroupsResult, AWSError] = js.native
  /**
    * Searches for routes in the specified transit gateway route table.
    */
  def searchTransitGatewayRoutes(): Request[SearchTransitGatewayRoutesResult, AWSError] = js.native
  def searchTransitGatewayRoutes(callback: js.Function2[/* err */ AWSError, /* data */ SearchTransitGatewayRoutesResult, Unit]): Request[SearchTransitGatewayRoutesResult, AWSError] = js.native
  /**
    * Searches for routes in the specified transit gateway route table.
    */
  def searchTransitGatewayRoutes(params: SearchTransitGatewayRoutesRequest): Request[SearchTransitGatewayRoutesResult, AWSError] = js.native
  def searchTransitGatewayRoutes(
    params: SearchTransitGatewayRoutesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchTransitGatewayRoutesResult, Unit]
  ): Request[SearchTransitGatewayRoutesResult, AWSError] = js.native
  /**
    * Sends a diagnostic interrupt to the specified Amazon EC2 instance to trigger a kernel panic (on Linux instances), or a blue screen/stop error (on Windows instances). For instances based on Intel and AMD processors, the interrupt is received as a non-maskable interrupt (NMI). In general, the operating system crashes and reboots when a kernel panic or stop error is triggered. The operating system can also be configured to perform diagnostic tasks, such as generating a memory dump file, loading a secondary kernel, or obtaining a call trace. Before sending a diagnostic interrupt to your instance, ensure that its operating system is configured to perform the required diagnostic tasks. For more information about configuring your operating system to generate a crash dump when a kernel panic or stop error occurs, see Send a Diagnostic Interrupt (Linux instances) or Send a Diagnostic Interrupt (Windows instances).
    */
  def sendDiagnosticInterrupt(): Request[js.Object, AWSError] = js.native
  def sendDiagnosticInterrupt(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Sends a diagnostic interrupt to the specified Amazon EC2 instance to trigger a kernel panic (on Linux instances), or a blue screen/stop error (on Windows instances). For instances based on Intel and AMD processors, the interrupt is received as a non-maskable interrupt (NMI). In general, the operating system crashes and reboots when a kernel panic or stop error is triggered. The operating system can also be configured to perform diagnostic tasks, such as generating a memory dump file, loading a secondary kernel, or obtaining a call trace. Before sending a diagnostic interrupt to your instance, ensure that its operating system is configured to perform the required diagnostic tasks. For more information about configuring your operating system to generate a crash dump when a kernel panic or stop error occurs, see Send a Diagnostic Interrupt (Linux instances) or Send a Diagnostic Interrupt (Windows instances).
    */
  def sendDiagnosticInterrupt(params: SendDiagnosticInterruptRequest): Request[js.Object, AWSError] = js.native
  def sendDiagnosticInterrupt(
    params: SendDiagnosticInterruptRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Starts an Amazon EBS-backed instance that you've previously stopped. Instances that use Amazon EBS volumes as their root devices can be quickly stopped and started. When an instance is stopped, the compute resources are released and you are not billed for instance usage. However, your root partition Amazon EBS volume remains and continues to persist your data, and you are charged for Amazon EBS volume usage. You can restart your instance at any time. Every time you start your Windows instance, Amazon EC2 charges you for a full instance hour. If you stop and restart your Windows instance, a new instance hour begins and Amazon EC2 charges you for another full instance hour even if you are still within the same 60-minute period when it was stopped. Every time you start your Linux instance, Amazon EC2 charges a one-minute minimum for instance usage, and thereafter charges per second for instance usage. Before stopping an instance, make sure it is in a state from which it can be restarted. Stopping an instance does not preserve data stored in RAM. Performing this operation on an instance that uses an instance store as its root device returns an error. For more information, see Stopping Instances in the Amazon Elastic Compute Cloud User Guide.
    */
  def startInstances(): Request[StartInstancesResult, AWSError] = js.native
  def startInstances(callback: js.Function2[/* err */ AWSError, /* data */ StartInstancesResult, Unit]): Request[StartInstancesResult, AWSError] = js.native
  /**
    * Starts an Amazon EBS-backed instance that you've previously stopped. Instances that use Amazon EBS volumes as their root devices can be quickly stopped and started. When an instance is stopped, the compute resources are released and you are not billed for instance usage. However, your root partition Amazon EBS volume remains and continues to persist your data, and you are charged for Amazon EBS volume usage. You can restart your instance at any time. Every time you start your Windows instance, Amazon EC2 charges you for a full instance hour. If you stop and restart your Windows instance, a new instance hour begins and Amazon EC2 charges you for another full instance hour even if you are still within the same 60-minute period when it was stopped. Every time you start your Linux instance, Amazon EC2 charges a one-minute minimum for instance usage, and thereafter charges per second for instance usage. Before stopping an instance, make sure it is in a state from which it can be restarted. Stopping an instance does not preserve data stored in RAM. Performing this operation on an instance that uses an instance store as its root device returns an error. For more information, see Stopping Instances in the Amazon Elastic Compute Cloud User Guide.
    */
  def startInstances(params: StartInstancesRequest): Request[StartInstancesResult, AWSError] = js.native
  def startInstances(
    params: StartInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartInstancesResult, Unit]
  ): Request[StartInstancesResult, AWSError] = js.native
  /**
    * Stops an Amazon EBS-backed instance. You can use the Stop action to hibernate an instance if the instance is enabled for hibernation and it meets the hibernation prerequisites. For more information, see Hibernate Your Instance in the Amazon Elastic Compute Cloud User Guide. We don't charge usage for a stopped instance, or data transfer fees; however, your root partition Amazon EBS volume remains and continues to persist your data, and you are charged for Amazon EBS volume usage. Every time you start your Windows instance, Amazon EC2 charges you for a full instance hour. If you stop and restart your Windows instance, a new instance hour begins and Amazon EC2 charges you for another full instance hour even if you are still within the same 60-minute period when it was stopped. Every time you start your Linux instance, Amazon EC2 charges a one-minute minimum for instance usage, and thereafter charges per second for instance usage. You can't start, stop, or hibernate Spot Instances, and you can't stop or hibernate instance store-backed instances. For information about using hibernation for Spot Instances, see Hibernating Interrupted Spot Instances in the Amazon Elastic Compute Cloud User Guide. When you stop or hibernate an instance, we shut it down. You can restart your instance at any time. Before stopping or hibernating an instance, make sure it is in a state from which it can be restarted. Stopping an instance does not preserve data stored in RAM, but hibernating an instance does preserve data stored in RAM. If an instance cannot hibernate successfully, a normal shutdown occurs. Stopping and hibernating an instance is different to rebooting or terminating it. For example, when you stop or hibernate an instance, the root device and any other devices attached to the instance persist. When you terminate an instance, the root device and any other devices attached during the instance launch are automatically deleted. For more information about the differences between rebooting, stopping, hibernating, and terminating instances, see Instance Lifecycle in the Amazon Elastic Compute Cloud User Guide. When you stop an instance, we attempt to shut it down forcibly after a short while. If your instance appears stuck in the stopping state after a period of time, there may be an issue with the underlying host computer. For more information, see Troubleshooting Stopping Your Instance in the Amazon Elastic Compute Cloud User Guide.
    */
  def stopInstances(): Request[StopInstancesResult, AWSError] = js.native
  def stopInstances(callback: js.Function2[/* err */ AWSError, /* data */ StopInstancesResult, Unit]): Request[StopInstancesResult, AWSError] = js.native
  /**
    * Stops an Amazon EBS-backed instance. You can use the Stop action to hibernate an instance if the instance is enabled for hibernation and it meets the hibernation prerequisites. For more information, see Hibernate Your Instance in the Amazon Elastic Compute Cloud User Guide. We don't charge usage for a stopped instance, or data transfer fees; however, your root partition Amazon EBS volume remains and continues to persist your data, and you are charged for Amazon EBS volume usage. Every time you start your Windows instance, Amazon EC2 charges you for a full instance hour. If you stop and restart your Windows instance, a new instance hour begins and Amazon EC2 charges you for another full instance hour even if you are still within the same 60-minute period when it was stopped. Every time you start your Linux instance, Amazon EC2 charges a one-minute minimum for instance usage, and thereafter charges per second for instance usage. You can't start, stop, or hibernate Spot Instances, and you can't stop or hibernate instance store-backed instances. For information about using hibernation for Spot Instances, see Hibernating Interrupted Spot Instances in the Amazon Elastic Compute Cloud User Guide. When you stop or hibernate an instance, we shut it down. You can restart your instance at any time. Before stopping or hibernating an instance, make sure it is in a state from which it can be restarted. Stopping an instance does not preserve data stored in RAM, but hibernating an instance does preserve data stored in RAM. If an instance cannot hibernate successfully, a normal shutdown occurs. Stopping and hibernating an instance is different to rebooting or terminating it. For example, when you stop or hibernate an instance, the root device and any other devices attached to the instance persist. When you terminate an instance, the root device and any other devices attached during the instance launch are automatically deleted. For more information about the differences between rebooting, stopping, hibernating, and terminating instances, see Instance Lifecycle in the Amazon Elastic Compute Cloud User Guide. When you stop an instance, we attempt to shut it down forcibly after a short while. If your instance appears stuck in the stopping state after a period of time, there may be an issue with the underlying host computer. For more information, see Troubleshooting Stopping Your Instance in the Amazon Elastic Compute Cloud User Guide.
    */
  def stopInstances(params: StopInstancesRequest): Request[StopInstancesResult, AWSError] = js.native
  def stopInstances(
    params: StopInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopInstancesResult, Unit]
  ): Request[StopInstancesResult, AWSError] = js.native
  /**
    * Terminates active Client VPN endpoint connections. This action can be used to terminate a specific client connection, or up to five connections established by a specific user.
    */
  def terminateClientVpnConnections(): Request[TerminateClientVpnConnectionsResult, AWSError] = js.native
  def terminateClientVpnConnections(callback: js.Function2[/* err */ AWSError, /* data */ TerminateClientVpnConnectionsResult, Unit]): Request[TerminateClientVpnConnectionsResult, AWSError] = js.native
  /**
    * Terminates active Client VPN endpoint connections. This action can be used to terminate a specific client connection, or up to five connections established by a specific user.
    */
  def terminateClientVpnConnections(params: TerminateClientVpnConnectionsRequest): Request[TerminateClientVpnConnectionsResult, AWSError] = js.native
  def terminateClientVpnConnections(
    params: TerminateClientVpnConnectionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TerminateClientVpnConnectionsResult, Unit]
  ): Request[TerminateClientVpnConnectionsResult, AWSError] = js.native
  /**
    * Shuts down the specified instances. This operation is idempotent; if you terminate an instance more than once, each call succeeds.  If you specify multiple instances and the request fails (for example, because of a single incorrect instance ID), none of the instances are terminated. Terminated instances remain visible after termination (for approximately one hour). By default, Amazon EC2 deletes all EBS volumes that were attached when the instance launched. Volumes attached after instance launch continue running. You can stop, start, and terminate EBS-backed instances. You can only terminate instance store-backed instances. What happens to an instance differs if you stop it or terminate it. For example, when you stop an instance, the root device and any other devices attached to the instance persist. When you terminate an instance, any attached EBS volumes with the DeleteOnTermination block device mapping parameter set to true are automatically deleted. For more information about the differences between stopping and terminating instances, see Instance Lifecycle in the Amazon Elastic Compute Cloud User Guide. For more information about troubleshooting, see Troubleshooting Terminating Your Instance in the Amazon Elastic Compute Cloud User Guide.
    */
  def terminateInstances(): Request[TerminateInstancesResult, AWSError] = js.native
  def terminateInstances(callback: js.Function2[/* err */ AWSError, /* data */ TerminateInstancesResult, Unit]): Request[TerminateInstancesResult, AWSError] = js.native
  /**
    * Shuts down the specified instances. This operation is idempotent; if you terminate an instance more than once, each call succeeds.  If you specify multiple instances and the request fails (for example, because of a single incorrect instance ID), none of the instances are terminated. Terminated instances remain visible after termination (for approximately one hour). By default, Amazon EC2 deletes all EBS volumes that were attached when the instance launched. Volumes attached after instance launch continue running. You can stop, start, and terminate EBS-backed instances. You can only terminate instance store-backed instances. What happens to an instance differs if you stop it or terminate it. For example, when you stop an instance, the root device and any other devices attached to the instance persist. When you terminate an instance, any attached EBS volumes with the DeleteOnTermination block device mapping parameter set to true are automatically deleted. For more information about the differences between stopping and terminating instances, see Instance Lifecycle in the Amazon Elastic Compute Cloud User Guide. For more information about troubleshooting, see Troubleshooting Terminating Your Instance in the Amazon Elastic Compute Cloud User Guide.
    */
  def terminateInstances(params: TerminateInstancesRequest): Request[TerminateInstancesResult, AWSError] = js.native
  def terminateInstances(
    params: TerminateInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TerminateInstancesResult, Unit]
  ): Request[TerminateInstancesResult, AWSError] = js.native
  /**
    * Unassigns one or more IPv6 addresses from a network interface.
    */
  def unassignIpv6Addresses(): Request[UnassignIpv6AddressesResult, AWSError] = js.native
  def unassignIpv6Addresses(callback: js.Function2[/* err */ AWSError, /* data */ UnassignIpv6AddressesResult, Unit]): Request[UnassignIpv6AddressesResult, AWSError] = js.native
  /**
    * Unassigns one or more IPv6 addresses from a network interface.
    */
  def unassignIpv6Addresses(params: UnassignIpv6AddressesRequest): Request[UnassignIpv6AddressesResult, AWSError] = js.native
  def unassignIpv6Addresses(
    params: UnassignIpv6AddressesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UnassignIpv6AddressesResult, Unit]
  ): Request[UnassignIpv6AddressesResult, AWSError] = js.native
  /**
    * Unassigns one or more secondary private IP addresses from a network interface.
    */
  def unassignPrivateIpAddresses(): Request[js.Object, AWSError] = js.native
  def unassignPrivateIpAddresses(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Unassigns one or more secondary private IP addresses from a network interface.
    */
  def unassignPrivateIpAddresses(params: UnassignPrivateIpAddressesRequest): Request[js.Object, AWSError] = js.native
  def unassignPrivateIpAddresses(
    params: UnassignPrivateIpAddressesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Disables detailed monitoring for a running instance. For more information, see Monitoring Your Instances and Volumes in the Amazon Elastic Compute Cloud User Guide.
    */
  def unmonitorInstances(): Request[UnmonitorInstancesResult, AWSError] = js.native
  def unmonitorInstances(callback: js.Function2[/* err */ AWSError, /* data */ UnmonitorInstancesResult, Unit]): Request[UnmonitorInstancesResult, AWSError] = js.native
  /**
    * Disables detailed monitoring for a running instance. For more information, see Monitoring Your Instances and Volumes in the Amazon Elastic Compute Cloud User Guide.
    */
  def unmonitorInstances(params: UnmonitorInstancesRequest): Request[UnmonitorInstancesResult, AWSError] = js.native
  def unmonitorInstances(
    params: UnmonitorInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UnmonitorInstancesResult, Unit]
  ): Request[UnmonitorInstancesResult, AWSError] = js.native
  /**
    * [VPC only] Updates the description of an egress (outbound) security group rule. You can replace an existing description, or add a description to a rule that did not have one previously. You specify the description as part of the IP permissions structure. You can remove a description for a security group rule by omitting the description parameter in the request.
    */
  def updateSecurityGroupRuleDescriptionsEgress(): Request[UpdateSecurityGroupRuleDescriptionsEgressResult, AWSError] = js.native
  def updateSecurityGroupRuleDescriptionsEgress(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSecurityGroupRuleDescriptionsEgressResult, Unit]
  ): Request[UpdateSecurityGroupRuleDescriptionsEgressResult, AWSError] = js.native
  /**
    * [VPC only] Updates the description of an egress (outbound) security group rule. You can replace an existing description, or add a description to a rule that did not have one previously. You specify the description as part of the IP permissions structure. You can remove a description for a security group rule by omitting the description parameter in the request.
    */
  def updateSecurityGroupRuleDescriptionsEgress(params: UpdateSecurityGroupRuleDescriptionsEgressRequest): Request[UpdateSecurityGroupRuleDescriptionsEgressResult, AWSError] = js.native
  def updateSecurityGroupRuleDescriptionsEgress(
    params: UpdateSecurityGroupRuleDescriptionsEgressRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSecurityGroupRuleDescriptionsEgressResult, Unit]
  ): Request[UpdateSecurityGroupRuleDescriptionsEgressResult, AWSError] = js.native
  /**
    * Updates the description of an ingress (inbound) security group rule. You can replace an existing description, or add a description to a rule that did not have one previously. You specify the description as part of the IP permissions structure. You can remove a description for a security group rule by omitting the description parameter in the request.
    */
  def updateSecurityGroupRuleDescriptionsIngress(): Request[UpdateSecurityGroupRuleDescriptionsIngressResult, AWSError] = js.native
  def updateSecurityGroupRuleDescriptionsIngress(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ UpdateSecurityGroupRuleDescriptionsIngressResult, 
      Unit
    ]
  ): Request[UpdateSecurityGroupRuleDescriptionsIngressResult, AWSError] = js.native
  /**
    * Updates the description of an ingress (inbound) security group rule. You can replace an existing description, or add a description to a rule that did not have one previously. You specify the description as part of the IP permissions structure. You can remove a description for a security group rule by omitting the description parameter in the request.
    */
  def updateSecurityGroupRuleDescriptionsIngress(params: UpdateSecurityGroupRuleDescriptionsIngressRequest): Request[UpdateSecurityGroupRuleDescriptionsIngressResult, AWSError] = js.native
  def updateSecurityGroupRuleDescriptionsIngress(
    params: UpdateSecurityGroupRuleDescriptionsIngressRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ UpdateSecurityGroupRuleDescriptionsIngressResult, 
      Unit
    ]
  ): Request[UpdateSecurityGroupRuleDescriptionsIngressResult, AWSError] = js.native
  /**
    * Waits for the bundleTaskComplete state by periodically calling the underlying EC2.describeBundleTasksoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_bundleTaskComplete(state: bundleTaskComplete): Request[DescribeBundleTasksResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_bundleTaskComplete(
    state: bundleTaskComplete,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeBundleTasksResult, Unit]
  ): Request[DescribeBundleTasksResult, AWSError] = js.native
  /**
    * Waits for the bundleTaskComplete state by periodically calling the underlying EC2.describeBundleTasksoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_bundleTaskComplete(state: bundleTaskComplete, params: DescribeBundleTasksRequest with Anon_Waiter): Request[DescribeBundleTasksResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_bundleTaskComplete(
    state: bundleTaskComplete,
    params: DescribeBundleTasksRequest with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeBundleTasksResult, Unit]
  ): Request[DescribeBundleTasksResult, AWSError] = js.native
  /**
    * Waits for the conversionTaskCancelled state by periodically calling the underlying EC2.describeConversionTasksoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_conversionTaskCancelled(state: conversionTaskCancelled): Request[DescribeConversionTasksResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_conversionTaskCancelled(
    state: conversionTaskCancelled,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConversionTasksResult, Unit]
  ): Request[DescribeConversionTasksResult, AWSError] = js.native
  /**
    * Waits for the conversionTaskCancelled state by periodically calling the underlying EC2.describeConversionTasksoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_conversionTaskCancelled(state: conversionTaskCancelled, params: DescribeConversionTasksRequest with Anon_Waiter): Request[DescribeConversionTasksResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_conversionTaskCancelled(
    state: conversionTaskCancelled,
    params: DescribeConversionTasksRequest with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConversionTasksResult, Unit]
  ): Request[DescribeConversionTasksResult, AWSError] = js.native
  /**
    * Waits for the conversionTaskCompleted state by periodically calling the underlying EC2.describeConversionTasksoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_conversionTaskCompleted(state: conversionTaskCompleted): Request[DescribeConversionTasksResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_conversionTaskCompleted(
    state: conversionTaskCompleted,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConversionTasksResult, Unit]
  ): Request[DescribeConversionTasksResult, AWSError] = js.native
  /**
    * Waits for the conversionTaskCompleted state by periodically calling the underlying EC2.describeConversionTasksoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_conversionTaskCompleted(state: conversionTaskCompleted, params: DescribeConversionTasksRequest with Anon_Waiter): Request[DescribeConversionTasksResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_conversionTaskCompleted(
    state: conversionTaskCompleted,
    params: DescribeConversionTasksRequest with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConversionTasksResult, Unit]
  ): Request[DescribeConversionTasksResult, AWSError] = js.native
  /**
    * Waits for the conversionTaskDeleted state by periodically calling the underlying EC2.describeConversionTasksoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_conversionTaskDeleted(state: conversionTaskDeleted): Request[DescribeConversionTasksResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_conversionTaskDeleted(
    state: conversionTaskDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConversionTasksResult, Unit]
  ): Request[DescribeConversionTasksResult, AWSError] = js.native
  /**
    * Waits for the conversionTaskDeleted state by periodically calling the underlying EC2.describeConversionTasksoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_conversionTaskDeleted(state: conversionTaskDeleted, params: DescribeConversionTasksRequest with Anon_Waiter): Request[DescribeConversionTasksResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_conversionTaskDeleted(
    state: conversionTaskDeleted,
    params: DescribeConversionTasksRequest with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConversionTasksResult, Unit]
  ): Request[DescribeConversionTasksResult, AWSError] = js.native
  /**
    * Waits for the customerGatewayAvailable state by periodically calling the underlying EC2.describeCustomerGatewaysoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_customerGatewayAvailable(state: customerGatewayAvailable): Request[DescribeCustomerGatewaysResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_customerGatewayAvailable(
    state: customerGatewayAvailable,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCustomerGatewaysResult, Unit]
  ): Request[DescribeCustomerGatewaysResult, AWSError] = js.native
  /**
    * Waits for the customerGatewayAvailable state by periodically calling the underlying EC2.describeCustomerGatewaysoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_customerGatewayAvailable(state: customerGatewayAvailable, params: DescribeCustomerGatewaysRequest with Anon_Waiter): Request[DescribeCustomerGatewaysResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_customerGatewayAvailable(
    state: customerGatewayAvailable,
    params: DescribeCustomerGatewaysRequest with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCustomerGatewaysResult, Unit]
  ): Request[DescribeCustomerGatewaysResult, AWSError] = js.native
  /**
    * Waits for the exportTaskCancelled state by periodically calling the underlying EC2.describeExportTasksoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_exportTaskCancelled(state: exportTaskCancelled): Request[DescribeExportTasksResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_exportTaskCancelled(
    state: exportTaskCancelled,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeExportTasksResult, Unit]
  ): Request[DescribeExportTasksResult, AWSError] = js.native
  /**
    * Waits for the exportTaskCancelled state by periodically calling the underlying EC2.describeExportTasksoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_exportTaskCancelled(state: exportTaskCancelled, params: DescribeExportTasksRequest with Anon_Waiter): Request[DescribeExportTasksResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_exportTaskCancelled(
    state: exportTaskCancelled,
    params: DescribeExportTasksRequest with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeExportTasksResult, Unit]
  ): Request[DescribeExportTasksResult, AWSError] = js.native
  /**
    * Waits for the exportTaskCompleted state by periodically calling the underlying EC2.describeExportTasksoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_exportTaskCompleted(state: exportTaskCompleted): Request[DescribeExportTasksResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_exportTaskCompleted(
    state: exportTaskCompleted,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeExportTasksResult, Unit]
  ): Request[DescribeExportTasksResult, AWSError] = js.native
  /**
    * Waits for the exportTaskCompleted state by periodically calling the underlying EC2.describeExportTasksoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_exportTaskCompleted(state: exportTaskCompleted, params: DescribeExportTasksRequest with Anon_Waiter): Request[DescribeExportTasksResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_exportTaskCompleted(
    state: exportTaskCompleted,
    params: DescribeExportTasksRequest with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeExportTasksResult, Unit]
  ): Request[DescribeExportTasksResult, AWSError] = js.native
  /**
    * Waits for the imageAvailable state by periodically calling the underlying EC2.describeImagesoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_imageAvailable(state: imageAvailable): Request[DescribeImagesResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_imageAvailable(
    state: imageAvailable,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeImagesResult, Unit]
  ): Request[DescribeImagesResult, AWSError] = js.native
  /**
    * Waits for the imageAvailable state by periodically calling the underlying EC2.describeImagesoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_imageAvailable(state: imageAvailable, params: DescribeImagesRequest with Anon_Waiter): Request[DescribeImagesResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_imageAvailable(
    state: imageAvailable,
    params: DescribeImagesRequest with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeImagesResult, Unit]
  ): Request[DescribeImagesResult, AWSError] = js.native
  /**
    * Waits for the imageExists state by periodically calling the underlying EC2.describeImagesoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_imageExists(state: imageExists): Request[DescribeImagesResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_imageExists(
    state: imageExists,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeImagesResult, Unit]
  ): Request[DescribeImagesResult, AWSError] = js.native
  /**
    * Waits for the imageExists state by periodically calling the underlying EC2.describeImagesoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_imageExists(state: imageExists, params: DescribeImagesRequest with Anon_Waiter): Request[DescribeImagesResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_imageExists(
    state: imageExists,
    params: DescribeImagesRequest with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeImagesResult, Unit]
  ): Request[DescribeImagesResult, AWSError] = js.native
  /**
    * Waits for the instanceExists state by periodically calling the underlying EC2.describeInstancesoperation every 5 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_instanceExists(state: instanceExists): Request[DescribeInstancesResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_instanceExists(
    state: instanceExists,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstancesResult, Unit]
  ): Request[DescribeInstancesResult, AWSError] = js.native
  /**
    * Waits for the instanceExists state by periodically calling the underlying EC2.describeInstancesoperation every 5 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_instanceExists(state: instanceExists, params: DescribeInstancesRequest with Anon_Waiter): Request[DescribeInstancesResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_instanceExists(
    state: instanceExists,
    params: DescribeInstancesRequest with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstancesResult, Unit]
  ): Request[DescribeInstancesResult, AWSError] = js.native
  /**
    * Waits for the instanceRunning state by periodically calling the underlying EC2.describeInstancesoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_instanceRunning(state: instanceRunning): Request[DescribeInstancesResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_instanceRunning(
    state: instanceRunning,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstancesResult, Unit]
  ): Request[DescribeInstancesResult, AWSError] = js.native
  /**
    * Waits for the instanceRunning state by periodically calling the underlying EC2.describeInstancesoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_instanceRunning(state: instanceRunning, params: DescribeInstancesRequest with Anon_Waiter): Request[DescribeInstancesResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_instanceRunning(
    state: instanceRunning,
    params: DescribeInstancesRequest with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstancesResult, Unit]
  ): Request[DescribeInstancesResult, AWSError] = js.native
  /**
    * Waits for the instanceStatusOk state by periodically calling the underlying EC2.describeInstanceStatusoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_instanceStatusOk(state: instanceStatusOk): Request[DescribeInstanceStatusResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_instanceStatusOk(
    state: instanceStatusOk,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstanceStatusResult, Unit]
  ): Request[DescribeInstanceStatusResult, AWSError] = js.native
  /**
    * Waits for the instanceStatusOk state by periodically calling the underlying EC2.describeInstanceStatusoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_instanceStatusOk(state: instanceStatusOk, params: DescribeInstanceStatusRequest with Anon_Waiter): Request[DescribeInstanceStatusResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_instanceStatusOk(
    state: instanceStatusOk,
    params: DescribeInstanceStatusRequest with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstanceStatusResult, Unit]
  ): Request[DescribeInstanceStatusResult, AWSError] = js.native
  /**
    * Waits for the instanceStopped state by periodically calling the underlying EC2.describeInstancesoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_instanceStopped(state: instanceStopped): Request[DescribeInstancesResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_instanceStopped(
    state: instanceStopped,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstancesResult, Unit]
  ): Request[DescribeInstancesResult, AWSError] = js.native
  /**
    * Waits for the instanceStopped state by periodically calling the underlying EC2.describeInstancesoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_instanceStopped(state: instanceStopped, params: DescribeInstancesRequest with Anon_Waiter): Request[DescribeInstancesResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_instanceStopped(
    state: instanceStopped,
    params: DescribeInstancesRequest with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstancesResult, Unit]
  ): Request[DescribeInstancesResult, AWSError] = js.native
  /**
    * Waits for the instanceTerminated state by periodically calling the underlying EC2.describeInstancesoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_instanceTerminated(state: instanceTerminated): Request[DescribeInstancesResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_instanceTerminated(
    state: instanceTerminated,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstancesResult, Unit]
  ): Request[DescribeInstancesResult, AWSError] = js.native
  /**
    * Waits for the instanceTerminated state by periodically calling the underlying EC2.describeInstancesoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_instanceTerminated(state: instanceTerminated, params: DescribeInstancesRequest with Anon_Waiter): Request[DescribeInstancesResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_instanceTerminated(
    state: instanceTerminated,
    params: DescribeInstancesRequest with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstancesResult, Unit]
  ): Request[DescribeInstancesResult, AWSError] = js.native
  /**
    * Waits for the keyPairExists state by periodically calling the underlying EC2.describeKeyPairsoperation every 5 seconds (at most 6 times).
    */
  @JSName("waitFor")
  def waitFor_keyPairExists(state: keyPairExists): Request[DescribeKeyPairsResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_keyPairExists(
    state: keyPairExists,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeKeyPairsResult, Unit]
  ): Request[DescribeKeyPairsResult, AWSError] = js.native
  /**
    * Waits for the keyPairExists state by periodically calling the underlying EC2.describeKeyPairsoperation every 5 seconds (at most 6 times).
    */
  @JSName("waitFor")
  def waitFor_keyPairExists(state: keyPairExists, params: DescribeKeyPairsRequest with Anon_Waiter): Request[DescribeKeyPairsResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_keyPairExists(
    state: keyPairExists,
    params: DescribeKeyPairsRequest with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeKeyPairsResult, Unit]
  ): Request[DescribeKeyPairsResult, AWSError] = js.native
  /**
    * Waits for the natGatewayAvailable state by periodically calling the underlying EC2.describeNatGatewaysoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_natGatewayAvailable(state: natGatewayAvailable): Request[DescribeNatGatewaysResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_natGatewayAvailable(
    state: natGatewayAvailable,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNatGatewaysResult, Unit]
  ): Request[DescribeNatGatewaysResult, AWSError] = js.native
  /**
    * Waits for the natGatewayAvailable state by periodically calling the underlying EC2.describeNatGatewaysoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_natGatewayAvailable(state: natGatewayAvailable, params: DescribeNatGatewaysRequest with Anon_Waiter): Request[DescribeNatGatewaysResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_natGatewayAvailable(
    state: natGatewayAvailable,
    params: DescribeNatGatewaysRequest with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNatGatewaysResult, Unit]
  ): Request[DescribeNatGatewaysResult, AWSError] = js.native
  /**
    * Waits for the networkInterfaceAvailable state by periodically calling the underlying EC2.describeNetworkInterfacesoperation every 20 seconds (at most 10 times).
    */
  @JSName("waitFor")
  def waitFor_networkInterfaceAvailable(state: networkInterfaceAvailable): Request[DescribeNetworkInterfacesResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_networkInterfaceAvailable(
    state: networkInterfaceAvailable,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNetworkInterfacesResult, Unit]
  ): Request[DescribeNetworkInterfacesResult, AWSError] = js.native
  /**
    * Waits for the networkInterfaceAvailable state by periodically calling the underlying EC2.describeNetworkInterfacesoperation every 20 seconds (at most 10 times).
    */
  @JSName("waitFor")
  def waitFor_networkInterfaceAvailable(state: networkInterfaceAvailable, params: DescribeNetworkInterfacesRequest with Anon_Waiter): Request[DescribeNetworkInterfacesResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_networkInterfaceAvailable(
    state: networkInterfaceAvailable,
    params: DescribeNetworkInterfacesRequest with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNetworkInterfacesResult, Unit]
  ): Request[DescribeNetworkInterfacesResult, AWSError] = js.native
  /**
    * Waits for the passwordDataAvailable state by periodically calling the underlying EC2.getPasswordDataoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_passwordDataAvailable(state: passwordDataAvailable): Request[GetPasswordDataResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_passwordDataAvailable(
    state: passwordDataAvailable,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPasswordDataResult, Unit]
  ): Request[GetPasswordDataResult, AWSError] = js.native
  /**
    * Waits for the passwordDataAvailable state by periodically calling the underlying EC2.getPasswordDataoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_passwordDataAvailable(state: passwordDataAvailable, params: GetPasswordDataRequest with Anon_Waiter): Request[GetPasswordDataResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_passwordDataAvailable(
    state: passwordDataAvailable,
    params: GetPasswordDataRequest with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPasswordDataResult, Unit]
  ): Request[GetPasswordDataResult, AWSError] = js.native
  /**
    * Waits for the securityGroupExists state by periodically calling the underlying EC2.describeSecurityGroupsoperation every 5 seconds (at most 6 times).
    */
  @JSName("waitFor")
  def waitFor_securityGroupExists(state: securityGroupExists): Request[DescribeSecurityGroupsResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_securityGroupExists(
    state: securityGroupExists,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSecurityGroupsResult, Unit]
  ): Request[DescribeSecurityGroupsResult, AWSError] = js.native
  /**
    * Waits for the securityGroupExists state by periodically calling the underlying EC2.describeSecurityGroupsoperation every 5 seconds (at most 6 times).
    */
  @JSName("waitFor")
  def waitFor_securityGroupExists(state: securityGroupExists, params: DescribeSecurityGroupsRequest with Anon_Waiter): Request[DescribeSecurityGroupsResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_securityGroupExists(
    state: securityGroupExists,
    params: DescribeSecurityGroupsRequest with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSecurityGroupsResult, Unit]
  ): Request[DescribeSecurityGroupsResult, AWSError] = js.native
  /**
    * Waits for the snapshotCompleted state by periodically calling the underlying EC2.describeSnapshotsoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_snapshotCompleted(state: snapshotCompleted): Request[DescribeSnapshotsResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_snapshotCompleted(
    state: snapshotCompleted,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSnapshotsResult, Unit]
  ): Request[DescribeSnapshotsResult, AWSError] = js.native
  /**
    * Waits for the snapshotCompleted state by periodically calling the underlying EC2.describeSnapshotsoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_snapshotCompleted(state: snapshotCompleted, params: DescribeSnapshotsRequest with Anon_Waiter): Request[DescribeSnapshotsResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_snapshotCompleted(
    state: snapshotCompleted,
    params: DescribeSnapshotsRequest with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSnapshotsResult, Unit]
  ): Request[DescribeSnapshotsResult, AWSError] = js.native
  /**
    * Waits for the spotInstanceRequestFulfilled state by periodically calling the underlying EC2.describeSpotInstanceRequestsoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_spotInstanceRequestFulfilled(state: spotInstanceRequestFulfilled): Request[DescribeSpotInstanceRequestsResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_spotInstanceRequestFulfilled(
    state: spotInstanceRequestFulfilled,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSpotInstanceRequestsResult, Unit]
  ): Request[DescribeSpotInstanceRequestsResult, AWSError] = js.native
  /**
    * Waits for the spotInstanceRequestFulfilled state by periodically calling the underlying EC2.describeSpotInstanceRequestsoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_spotInstanceRequestFulfilled(state: spotInstanceRequestFulfilled, params: DescribeSpotInstanceRequestsRequest with Anon_Waiter): Request[DescribeSpotInstanceRequestsResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_spotInstanceRequestFulfilled(
    state: spotInstanceRequestFulfilled,
    params: DescribeSpotInstanceRequestsRequest with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSpotInstanceRequestsResult, Unit]
  ): Request[DescribeSpotInstanceRequestsResult, AWSError] = js.native
  /**
    * Waits for the subnetAvailable state by periodically calling the underlying EC2.describeSubnetsoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_subnetAvailable(state: subnetAvailable): Request[DescribeSubnetsResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_subnetAvailable(
    state: subnetAvailable,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSubnetsResult, Unit]
  ): Request[DescribeSubnetsResult, AWSError] = js.native
  /**
    * Waits for the subnetAvailable state by periodically calling the underlying EC2.describeSubnetsoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_subnetAvailable(state: subnetAvailable, params: DescribeSubnetsRequest with Anon_Waiter): Request[DescribeSubnetsResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_subnetAvailable(
    state: subnetAvailable,
    params: DescribeSubnetsRequest with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSubnetsResult, Unit]
  ): Request[DescribeSubnetsResult, AWSError] = js.native
  /**
    * Waits for the systemStatusOk state by periodically calling the underlying EC2.describeInstanceStatusoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_systemStatusOk(state: systemStatusOk): Request[DescribeInstanceStatusResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_systemStatusOk(
    state: systemStatusOk,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstanceStatusResult, Unit]
  ): Request[DescribeInstanceStatusResult, AWSError] = js.native
  /**
    * Waits for the systemStatusOk state by periodically calling the underlying EC2.describeInstanceStatusoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_systemStatusOk(state: systemStatusOk, params: DescribeInstanceStatusRequest with Anon_Waiter): Request[DescribeInstanceStatusResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_systemStatusOk(
    state: systemStatusOk,
    params: DescribeInstanceStatusRequest with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstanceStatusResult, Unit]
  ): Request[DescribeInstanceStatusResult, AWSError] = js.native
  /**
    * Waits for the volumeAvailable state by periodically calling the underlying EC2.describeVolumesoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_volumeAvailable(state: volumeAvailable): Request[DescribeVolumesResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_volumeAvailable(
    state: volumeAvailable,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVolumesResult, Unit]
  ): Request[DescribeVolumesResult, AWSError] = js.native
  /**
    * Waits for the volumeAvailable state by periodically calling the underlying EC2.describeVolumesoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_volumeAvailable(state: volumeAvailable, params: DescribeVolumesRequest with Anon_Waiter): Request[DescribeVolumesResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_volumeAvailable(
    state: volumeAvailable,
    params: DescribeVolumesRequest with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVolumesResult, Unit]
  ): Request[DescribeVolumesResult, AWSError] = js.native
  /**
    * Waits for the volumeDeleted state by periodically calling the underlying EC2.describeVolumesoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_volumeDeleted(state: volumeDeleted): Request[DescribeVolumesResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_volumeDeleted(
    state: volumeDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVolumesResult, Unit]
  ): Request[DescribeVolumesResult, AWSError] = js.native
  /**
    * Waits for the volumeDeleted state by periodically calling the underlying EC2.describeVolumesoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_volumeDeleted(state: volumeDeleted, params: DescribeVolumesRequest with Anon_Waiter): Request[DescribeVolumesResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_volumeDeleted(
    state: volumeDeleted,
    params: DescribeVolumesRequest with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVolumesResult, Unit]
  ): Request[DescribeVolumesResult, AWSError] = js.native
  /**
    * Waits for the volumeInUse state by periodically calling the underlying EC2.describeVolumesoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_volumeInUse(state: volumeInUse): Request[DescribeVolumesResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_volumeInUse(
    state: volumeInUse,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVolumesResult, Unit]
  ): Request[DescribeVolumesResult, AWSError] = js.native
  /**
    * Waits for the volumeInUse state by periodically calling the underlying EC2.describeVolumesoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_volumeInUse(state: volumeInUse, params: DescribeVolumesRequest with Anon_Waiter): Request[DescribeVolumesResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_volumeInUse(
    state: volumeInUse,
    params: DescribeVolumesRequest with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVolumesResult, Unit]
  ): Request[DescribeVolumesResult, AWSError] = js.native
  /**
    * Waits for the vpcAvailable state by periodically calling the underlying EC2.describeVpcsoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_vpcAvailable(state: vpcAvailable): Request[DescribeVpcsResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_vpcAvailable(
    state: vpcAvailable,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVpcsResult, Unit]
  ): Request[DescribeVpcsResult, AWSError] = js.native
  /**
    * Waits for the vpcAvailable state by periodically calling the underlying EC2.describeVpcsoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_vpcAvailable(state: vpcAvailable, params: DescribeVpcsRequest with Anon_Waiter): Request[DescribeVpcsResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_vpcAvailable(
    state: vpcAvailable,
    params: DescribeVpcsRequest with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVpcsResult, Unit]
  ): Request[DescribeVpcsResult, AWSError] = js.native
  /**
    * Waits for the vpcExists state by periodically calling the underlying EC2.describeVpcsoperation every 1 seconds (at most 5 times).
    */
  @JSName("waitFor")
  def waitFor_vpcExists(state: vpcExists): Request[DescribeVpcsResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_vpcExists(state: vpcExists, callback: js.Function2[/* err */ AWSError, /* data */ DescribeVpcsResult, Unit]): Request[DescribeVpcsResult, AWSError] = js.native
  /**
    * Waits for the vpcExists state by periodically calling the underlying EC2.describeVpcsoperation every 1 seconds (at most 5 times).
    */
  @JSName("waitFor")
  def waitFor_vpcExists(state: vpcExists, params: DescribeVpcsRequest with Anon_Waiter): Request[DescribeVpcsResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_vpcExists(
    state: vpcExists,
    params: DescribeVpcsRequest with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVpcsResult, Unit]
  ): Request[DescribeVpcsResult, AWSError] = js.native
  /**
    * Waits for the vpcPeeringConnectionDeleted state by periodically calling the underlying EC2.describeVpcPeeringConnectionsoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_vpcPeeringConnectionDeleted(state: vpcPeeringConnectionDeleted): Request[DescribeVpcPeeringConnectionsResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_vpcPeeringConnectionDeleted(
    state: vpcPeeringConnectionDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVpcPeeringConnectionsResult, Unit]
  ): Request[DescribeVpcPeeringConnectionsResult, AWSError] = js.native
  /**
    * Waits for the vpcPeeringConnectionDeleted state by periodically calling the underlying EC2.describeVpcPeeringConnectionsoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_vpcPeeringConnectionDeleted(state: vpcPeeringConnectionDeleted, params: DescribeVpcPeeringConnectionsRequest with Anon_Waiter): Request[DescribeVpcPeeringConnectionsResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_vpcPeeringConnectionDeleted(
    state: vpcPeeringConnectionDeleted,
    params: DescribeVpcPeeringConnectionsRequest with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVpcPeeringConnectionsResult, Unit]
  ): Request[DescribeVpcPeeringConnectionsResult, AWSError] = js.native
  /**
    * Waits for the vpcPeeringConnectionExists state by periodically calling the underlying EC2.describeVpcPeeringConnectionsoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_vpcPeeringConnectionExists(state: vpcPeeringConnectionExists): Request[DescribeVpcPeeringConnectionsResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_vpcPeeringConnectionExists(
    state: vpcPeeringConnectionExists,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVpcPeeringConnectionsResult, Unit]
  ): Request[DescribeVpcPeeringConnectionsResult, AWSError] = js.native
  /**
    * Waits for the vpcPeeringConnectionExists state by periodically calling the underlying EC2.describeVpcPeeringConnectionsoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_vpcPeeringConnectionExists(state: vpcPeeringConnectionExists, params: DescribeVpcPeeringConnectionsRequest with Anon_Waiter): Request[DescribeVpcPeeringConnectionsResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_vpcPeeringConnectionExists(
    state: vpcPeeringConnectionExists,
    params: DescribeVpcPeeringConnectionsRequest with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVpcPeeringConnectionsResult, Unit]
  ): Request[DescribeVpcPeeringConnectionsResult, AWSError] = js.native
  /**
    * Waits for the vpnConnectionAvailable state by periodically calling the underlying EC2.describeVpnConnectionsoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_vpnConnectionAvailable(state: vpnConnectionAvailable): Request[DescribeVpnConnectionsResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_vpnConnectionAvailable(
    state: vpnConnectionAvailable,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVpnConnectionsResult, Unit]
  ): Request[DescribeVpnConnectionsResult, AWSError] = js.native
  /**
    * Waits for the vpnConnectionAvailable state by periodically calling the underlying EC2.describeVpnConnectionsoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_vpnConnectionAvailable(state: vpnConnectionAvailable, params: DescribeVpnConnectionsRequest with Anon_Waiter): Request[DescribeVpnConnectionsResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_vpnConnectionAvailable(
    state: vpnConnectionAvailable,
    params: DescribeVpnConnectionsRequest with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVpnConnectionsResult, Unit]
  ): Request[DescribeVpnConnectionsResult, AWSError] = js.native
  /**
    * Waits for the vpnConnectionDeleted state by periodically calling the underlying EC2.describeVpnConnectionsoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_vpnConnectionDeleted(state: vpnConnectionDeleted): Request[DescribeVpnConnectionsResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_vpnConnectionDeleted(
    state: vpnConnectionDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVpnConnectionsResult, Unit]
  ): Request[DescribeVpnConnectionsResult, AWSError] = js.native
  /**
    * Waits for the vpnConnectionDeleted state by periodically calling the underlying EC2.describeVpnConnectionsoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_vpnConnectionDeleted(state: vpnConnectionDeleted, params: DescribeVpnConnectionsRequest with Anon_Waiter): Request[DescribeVpnConnectionsResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_vpnConnectionDeleted(
    state: vpnConnectionDeleted,
    params: DescribeVpnConnectionsRequest with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVpnConnectionsResult, Unit]
  ): Request[DescribeVpnConnectionsResult, AWSError] = js.native
  /**
    * Stops advertising an IPv4 address range that is provisioned as an address pool. You can perform this operation at most once every 10 seconds, even if you specify different address ranges each time. It can take a few minutes before traffic to the specified addresses stops routing to AWS because of BGP propagation delays.
    */
  def withdrawByoipCidr(): Request[WithdrawByoipCidrResult, AWSError] = js.native
  def withdrawByoipCidr(callback: js.Function2[/* err */ AWSError, /* data */ WithdrawByoipCidrResult, Unit]): Request[WithdrawByoipCidrResult, AWSError] = js.native
  /**
    * Stops advertising an IPv4 address range that is provisioned as an address pool. You can perform this operation at most once every 10 seconds, even if you specify different address ranges each time. It can take a few minutes before traffic to the specified addresses stops routing to AWS because of BGP propagation delays.
    */
  def withdrawByoipCidr(params: WithdrawByoipCidrRequest): Request[WithdrawByoipCidrResult, AWSError] = js.native
  def withdrawByoipCidr(
    params: WithdrawByoipCidrRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ WithdrawByoipCidrResult, Unit]
  ): Request[WithdrawByoipCidrResult, AWSError] = js.native
}

