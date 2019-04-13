package typings
package awsDashSdkLib.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectConnect
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_DirectConnect: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Accepts a proposal request to attach a virtual private gateway to a Direct Connect gateway.
    */
  def acceptDirectConnectGatewayAssociationProposal(): awsDashSdkLib.libRequestMod.Request[
    AcceptDirectConnectGatewayAssociationProposalResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def acceptDirectConnectGatewayAssociationProposal(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AcceptDirectConnectGatewayAssociationProposalResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    AcceptDirectConnectGatewayAssociationProposalResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Accepts a proposal request to attach a virtual private gateway to a Direct Connect gateway.
    */
  def acceptDirectConnectGatewayAssociationProposal(params: AcceptDirectConnectGatewayAssociationProposalRequest): awsDashSdkLib.libRequestMod.Request[
    AcceptDirectConnectGatewayAssociationProposalResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def acceptDirectConnectGatewayAssociationProposal(
    params: AcceptDirectConnectGatewayAssociationProposalRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AcceptDirectConnectGatewayAssociationProposalResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    AcceptDirectConnectGatewayAssociationProposalResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deprecated. Use AllocateHostedConnection instead. Creates a hosted connection on an interconnect. Allocates a VLAN number and a specified amount of bandwidth for use by a hosted connection on the specified interconnect.  Intended for use by AWS Direct Connect Partners only. 
    */
  def allocateConnectionOnInterconnect(): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def allocateConnectionOnInterconnect(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Connection, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deprecated. Use AllocateHostedConnection instead. Creates a hosted connection on an interconnect. Allocates a VLAN number and a specified amount of bandwidth for use by a hosted connection on the specified interconnect.  Intended for use by AWS Direct Connect Partners only. 
    */
  def allocateConnectionOnInterconnect(params: AllocateConnectionOnInterconnectRequest): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def allocateConnectionOnInterconnect(
    params: AllocateConnectionOnInterconnectRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Connection, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a hosted connection on the specified interconnect or a link aggregation group (LAG) of interconnects. Allocates a VLAN number and a specified amount of capacity (bandwidth) for use by a hosted connection on the specified interconnect or LAG of interconnects. AWS polices the hosted connection for the specified capacity and the AWS Direct Connect Partner must also police the hosted connection for the specified capacity.  Intended for use by AWS Direct Connect Partners only. 
    */
  def allocateHostedConnection(): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def allocateHostedConnection(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Connection, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a hosted connection on the specified interconnect or a link aggregation group (LAG) of interconnects. Allocates a VLAN number and a specified amount of capacity (bandwidth) for use by a hosted connection on the specified interconnect or LAG of interconnects. AWS polices the hosted connection for the specified capacity and the AWS Direct Connect Partner must also police the hosted connection for the specified capacity.  Intended for use by AWS Direct Connect Partners only. 
    */
  def allocateHostedConnection(params: AllocateHostedConnectionRequest): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def allocateHostedConnection(
    params: AllocateHostedConnectionRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Connection, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provisions a private virtual interface to be owned by the specified AWS account. Virtual interfaces created using this action must be confirmed by the owner using ConfirmPrivateVirtualInterface. Until then, the virtual interface is in the Confirming state and is not available to handle traffic.
    */
  def allocatePrivateVirtualInterface(): awsDashSdkLib.libRequestMod.Request[VirtualInterface, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def allocatePrivateVirtualInterface(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ VirtualInterface, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[VirtualInterface, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provisions a private virtual interface to be owned by the specified AWS account. Virtual interfaces created using this action must be confirmed by the owner using ConfirmPrivateVirtualInterface. Until then, the virtual interface is in the Confirming state and is not available to handle traffic.
    */
  def allocatePrivateVirtualInterface(params: AllocatePrivateVirtualInterfaceRequest): awsDashSdkLib.libRequestMod.Request[VirtualInterface, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def allocatePrivateVirtualInterface(
    params: AllocatePrivateVirtualInterfaceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ VirtualInterface, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[VirtualInterface, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provisions a public virtual interface to be owned by the specified AWS account. The owner of a connection calls this function to provision a public virtual interface to be owned by the specified AWS account. Virtual interfaces created using this function must be confirmed by the owner using ConfirmPublicVirtualInterface. Until this step has been completed, the virtual interface is in the confirming state and is not available to handle traffic. When creating an IPv6 public virtual interface, omit the Amazon address and customer address. IPv6 addresses are automatically assigned from the Amazon pool of IPv6 addresses; you cannot specify custom IPv6 addresses.
    */
  def allocatePublicVirtualInterface(): awsDashSdkLib.libRequestMod.Request[VirtualInterface, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def allocatePublicVirtualInterface(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ VirtualInterface, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[VirtualInterface, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provisions a public virtual interface to be owned by the specified AWS account. The owner of a connection calls this function to provision a public virtual interface to be owned by the specified AWS account. Virtual interfaces created using this function must be confirmed by the owner using ConfirmPublicVirtualInterface. Until this step has been completed, the virtual interface is in the confirming state and is not available to handle traffic. When creating an IPv6 public virtual interface, omit the Amazon address and customer address. IPv6 addresses are automatically assigned from the Amazon pool of IPv6 addresses; you cannot specify custom IPv6 addresses.
    */
  def allocatePublicVirtualInterface(params: AllocatePublicVirtualInterfaceRequest): awsDashSdkLib.libRequestMod.Request[VirtualInterface, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def allocatePublicVirtualInterface(
    params: AllocatePublicVirtualInterfaceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ VirtualInterface, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[VirtualInterface, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates an existing connection with a link aggregation group (LAG). The connection is interrupted and re-established as a member of the LAG (connectivity to AWS is interrupted). The connection must be hosted on the same AWS Direct Connect endpoint as the LAG, and its bandwidth must match the bandwidth for the LAG. You can re-associate a connection that's currently associated with a different LAG; however, if removing the connection would cause the original LAG to fall below its setting for minimum number of operational connections, the request fails. Any virtual interfaces that are directly associated with the connection are automatically re-associated with the LAG. If the connection was originally associated with a different LAG, the virtual interfaces remain associated with the original LAG. For interconnects, any hosted connections are automatically re-associated with the LAG. If the interconnect was originally associated with a different LAG, the hosted connections remain associated with the original LAG.
    */
  def associateConnectionWithLag(): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateConnectionWithLag(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Connection, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates an existing connection with a link aggregation group (LAG). The connection is interrupted and re-established as a member of the LAG (connectivity to AWS is interrupted). The connection must be hosted on the same AWS Direct Connect endpoint as the LAG, and its bandwidth must match the bandwidth for the LAG. You can re-associate a connection that's currently associated with a different LAG; however, if removing the connection would cause the original LAG to fall below its setting for minimum number of operational connections, the request fails. Any virtual interfaces that are directly associated with the connection are automatically re-associated with the LAG. If the connection was originally associated with a different LAG, the virtual interfaces remain associated with the original LAG. For interconnects, any hosted connections are automatically re-associated with the LAG. If the interconnect was originally associated with a different LAG, the hosted connections remain associated with the original LAG.
    */
  def associateConnectionWithLag(params: AssociateConnectionWithLagRequest): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateConnectionWithLag(
    params: AssociateConnectionWithLagRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Connection, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates a hosted connection and its virtual interfaces with a link aggregation group (LAG) or interconnect. If the target interconnect or LAG has an existing hosted connection with a conflicting VLAN number or IP address, the operation fails. This action temporarily interrupts the hosted connection's connectivity to AWS as it is being migrated.  Intended for use by AWS Direct Connect Partners only. 
    */
  def associateHostedConnection(): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateHostedConnection(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Connection, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates a hosted connection and its virtual interfaces with a link aggregation group (LAG) or interconnect. If the target interconnect or LAG has an existing hosted connection with a conflicting VLAN number or IP address, the operation fails. This action temporarily interrupts the hosted connection's connectivity to AWS as it is being migrated.  Intended for use by AWS Direct Connect Partners only. 
    */
  def associateHostedConnection(params: AssociateHostedConnectionRequest): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateHostedConnection(
    params: AssociateHostedConnectionRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Connection, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates a virtual interface with a specified link aggregation group (LAG) or connection. Connectivity to AWS is temporarily interrupted as the virtual interface is being migrated. If the target connection or LAG has an associated virtual interface with a conflicting VLAN number or a conflicting IP address, the operation fails. Virtual interfaces associated with a hosted connection cannot be associated with a LAG; hosted connections must be migrated along with their virtual interfaces using AssociateHostedConnection. To reassociate a virtual interface to a new connection or LAG, the requester must own either the virtual interface itself or the connection to which the virtual interface is currently associated. Additionally, the requester must own the connection or LAG for the association.
    */
  def associateVirtualInterface(): awsDashSdkLib.libRequestMod.Request[VirtualInterface, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateVirtualInterface(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ VirtualInterface, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[VirtualInterface, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates a virtual interface with a specified link aggregation group (LAG) or connection. Connectivity to AWS is temporarily interrupted as the virtual interface is being migrated. If the target connection or LAG has an associated virtual interface with a conflicting VLAN number or a conflicting IP address, the operation fails. Virtual interfaces associated with a hosted connection cannot be associated with a LAG; hosted connections must be migrated along with their virtual interfaces using AssociateHostedConnection. To reassociate a virtual interface to a new connection or LAG, the requester must own either the virtual interface itself or the connection to which the virtual interface is currently associated. Additionally, the requester must own the connection or LAG for the association.
    */
  def associateVirtualInterface(params: AssociateVirtualInterfaceRequest): awsDashSdkLib.libRequestMod.Request[VirtualInterface, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateVirtualInterface(
    params: AssociateVirtualInterfaceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ VirtualInterface, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[VirtualInterface, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Confirms the creation of the specified hosted connection on an interconnect. Upon creation, the hosted connection is initially in the Ordering state, and remains in this state until the owner confirms creation of the hosted connection.
    */
  def confirmConnection(): awsDashSdkLib.libRequestMod.Request[ConfirmConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def confirmConnection(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ConfirmConnectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ConfirmConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Confirms the creation of the specified hosted connection on an interconnect. Upon creation, the hosted connection is initially in the Ordering state, and remains in this state until the owner confirms creation of the hosted connection.
    */
  def confirmConnection(params: ConfirmConnectionRequest): awsDashSdkLib.libRequestMod.Request[ConfirmConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def confirmConnection(
    params: ConfirmConnectionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ConfirmConnectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ConfirmConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Accepts ownership of a private virtual interface created by another AWS account. After the virtual interface owner makes this call, the virtual interface is created and attached to the specified virtual private gateway or Direct Connect gateway, and is made available to handle traffic.
    */
  def confirmPrivateVirtualInterface(): awsDashSdkLib.libRequestMod.Request[ConfirmPrivateVirtualInterfaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def confirmPrivateVirtualInterface(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ConfirmPrivateVirtualInterfaceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ConfirmPrivateVirtualInterfaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Accepts ownership of a private virtual interface created by another AWS account. After the virtual interface owner makes this call, the virtual interface is created and attached to the specified virtual private gateway or Direct Connect gateway, and is made available to handle traffic.
    */
  def confirmPrivateVirtualInterface(params: ConfirmPrivateVirtualInterfaceRequest): awsDashSdkLib.libRequestMod.Request[ConfirmPrivateVirtualInterfaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def confirmPrivateVirtualInterface(
    params: ConfirmPrivateVirtualInterfaceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ConfirmPrivateVirtualInterfaceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ConfirmPrivateVirtualInterfaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Accepts ownership of a public virtual interface created by another AWS account. After the virtual interface owner makes this call, the specified virtual interface is created and made available to handle traffic.
    */
  def confirmPublicVirtualInterface(): awsDashSdkLib.libRequestMod.Request[ConfirmPublicVirtualInterfaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def confirmPublicVirtualInterface(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ConfirmPublicVirtualInterfaceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ConfirmPublicVirtualInterfaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Accepts ownership of a public virtual interface created by another AWS account. After the virtual interface owner makes this call, the specified virtual interface is created and made available to handle traffic.
    */
  def confirmPublicVirtualInterface(params: ConfirmPublicVirtualInterfaceRequest): awsDashSdkLib.libRequestMod.Request[ConfirmPublicVirtualInterfaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def confirmPublicVirtualInterface(
    params: ConfirmPublicVirtualInterfaceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ConfirmPublicVirtualInterfaceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ConfirmPublicVirtualInterfaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a BGP peer on the specified virtual interface. You must create a BGP peer for the corresponding address family (IPv4/IPv6) in order to access AWS resources that also use that address family. If logical redundancy is not supported by the connection, interconnect, or LAG, the BGP peer cannot be in the same address family as an existing BGP peer on the virtual interface. When creating a IPv6 BGP peer, omit the Amazon address and customer address. IPv6 addresses are automatically assigned from the Amazon pool of IPv6 addresses; you cannot specify custom IPv6 addresses. For a public virtual interface, the Autonomous System Number (ASN) must be private or already whitelisted for the virtual interface.
    */
  def createBGPPeer(): awsDashSdkLib.libRequestMod.Request[CreateBGPPeerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createBGPPeer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateBGPPeerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateBGPPeerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a BGP peer on the specified virtual interface. You must create a BGP peer for the corresponding address family (IPv4/IPv6) in order to access AWS resources that also use that address family. If logical redundancy is not supported by the connection, interconnect, or LAG, the BGP peer cannot be in the same address family as an existing BGP peer on the virtual interface. When creating a IPv6 BGP peer, omit the Amazon address and customer address. IPv6 addresses are automatically assigned from the Amazon pool of IPv6 addresses; you cannot specify custom IPv6 addresses. For a public virtual interface, the Autonomous System Number (ASN) must be private or already whitelisted for the virtual interface.
    */
  def createBGPPeer(params: CreateBGPPeerRequest): awsDashSdkLib.libRequestMod.Request[CreateBGPPeerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createBGPPeer(
    params: CreateBGPPeerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateBGPPeerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateBGPPeerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a connection between a customer network and a specific AWS Direct Connect location. A connection links your internal network to an AWS Direct Connect location over a standard Ethernet fiber-optic cable. One end of the cable is connected to your router, the other to an AWS Direct Connect router. To find the locations for your Region, use DescribeLocations. You can automatically add the new connection to a link aggregation group (LAG) by specifying a LAG ID in the request. This ensures that the new connection is allocated on the same AWS Direct Connect endpoint that hosts the specified LAG. If there are no available ports on the endpoint, the request fails and no connection is created.
    */
  def createConnection(): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createConnection(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Connection, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a connection between a customer network and a specific AWS Direct Connect location. A connection links your internal network to an AWS Direct Connect location over a standard Ethernet fiber-optic cable. One end of the cable is connected to your router, the other to an AWS Direct Connect router. To find the locations for your Region, use DescribeLocations. You can automatically add the new connection to a link aggregation group (LAG) by specifying a LAG ID in the request. This ensures that the new connection is allocated on the same AWS Direct Connect endpoint that hosts the specified LAG. If there are no available ports on the endpoint, the request fails and no connection is created.
    */
  def createConnection(params: CreateConnectionRequest): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createConnection(
    params: CreateConnectionRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Connection, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a Direct Connect gateway, which is an intermediate object that enables you to connect a set of virtual interfaces and virtual private gateways. A Direct Connect gateway is global and visible in any AWS Region after it is created. The virtual interfaces and virtual private gateways that are connected through a Direct Connect gateway can be in different AWS Regions. This enables you to connect to a VPC in any Region, regardless of the Region in which the virtual interfaces are located, and pass traffic between them.
    */
  def createDirectConnectGateway(): awsDashSdkLib.libRequestMod.Request[CreateDirectConnectGatewayResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDirectConnectGateway(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDirectConnectGatewayResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDirectConnectGatewayResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a Direct Connect gateway, which is an intermediate object that enables you to connect a set of virtual interfaces and virtual private gateways. A Direct Connect gateway is global and visible in any AWS Region after it is created. The virtual interfaces and virtual private gateways that are connected through a Direct Connect gateway can be in different AWS Regions. This enables you to connect to a VPC in any Region, regardless of the Region in which the virtual interfaces are located, and pass traffic between them.
    */
  def createDirectConnectGateway(params: CreateDirectConnectGatewayRequest): awsDashSdkLib.libRequestMod.Request[CreateDirectConnectGatewayResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDirectConnectGateway(
    params: CreateDirectConnectGatewayRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDirectConnectGatewayResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDirectConnectGatewayResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an association between a Direct Connect gateway and a virtual private gateway. The virtual private gateway must be attached to a VPC and must not be associated with another Direct Connect gateway.
    */
  def createDirectConnectGatewayAssociation(): awsDashSdkLib.libRequestMod.Request[CreateDirectConnectGatewayAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDirectConnectGatewayAssociation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDirectConnectGatewayAssociationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDirectConnectGatewayAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an association between a Direct Connect gateway and a virtual private gateway. The virtual private gateway must be attached to a VPC and must not be associated with another Direct Connect gateway.
    */
  def createDirectConnectGatewayAssociation(params: CreateDirectConnectGatewayAssociationRequest): awsDashSdkLib.libRequestMod.Request[CreateDirectConnectGatewayAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDirectConnectGatewayAssociation(
    params: CreateDirectConnectGatewayAssociationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDirectConnectGatewayAssociationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDirectConnectGatewayAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a proposal to associate the specified virtual private gateway with the specified Direct Connect gateway. You can only associate a Direct Connect gateway and virtual private gateway when the account that owns the Direct Connect gateway and the account that owns the virtual private gateway have the same payer ID.
    */
  def createDirectConnectGatewayAssociationProposal(): awsDashSdkLib.libRequestMod.Request[
    CreateDirectConnectGatewayAssociationProposalResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDirectConnectGatewayAssociationProposal(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDirectConnectGatewayAssociationProposalResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    CreateDirectConnectGatewayAssociationProposalResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a proposal to associate the specified virtual private gateway with the specified Direct Connect gateway. You can only associate a Direct Connect gateway and virtual private gateway when the account that owns the Direct Connect gateway and the account that owns the virtual private gateway have the same payer ID.
    */
  def createDirectConnectGatewayAssociationProposal(params: CreateDirectConnectGatewayAssociationProposalRequest): awsDashSdkLib.libRequestMod.Request[
    CreateDirectConnectGatewayAssociationProposalResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDirectConnectGatewayAssociationProposal(
    params: CreateDirectConnectGatewayAssociationProposalRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDirectConnectGatewayAssociationProposalResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    CreateDirectConnectGatewayAssociationProposalResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an interconnect between an AWS Direct Connect Partner's network and a specific AWS Direct Connect location. An interconnect is a connection that is capable of hosting other connections. The AWS Direct Connect partner can use an interconnect to provide AWS Direct Connect hosted connections to customers through their own network services. Like a standard connection, an interconnect links the partner's network to an AWS Direct Connect location over a standard Ethernet fiber-optic cable. One end is connected to the partner's router, the other to an AWS Direct Connect router. You can automatically add the new interconnect to a link aggregation group (LAG) by specifying a LAG ID in the request. This ensures that the new interconnect is allocated on the same AWS Direct Connect endpoint that hosts the specified LAG. If there are no available ports on the endpoint, the request fails and no interconnect is created. For each end customer, the AWS Direct Connect Partner provisions a connection on their interconnect by calling AllocateHostedConnection. The end customer can then connect to AWS resources by creating a virtual interface on their connection, using the VLAN assigned to them by the AWS Direct Connect Partner.  Intended for use by AWS Direct Connect Partners only. 
    */
  def createInterconnect(): awsDashSdkLib.libRequestMod.Request[Interconnect, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createInterconnect(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Interconnect, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Interconnect, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an interconnect between an AWS Direct Connect Partner's network and a specific AWS Direct Connect location. An interconnect is a connection that is capable of hosting other connections. The AWS Direct Connect partner can use an interconnect to provide AWS Direct Connect hosted connections to customers through their own network services. Like a standard connection, an interconnect links the partner's network to an AWS Direct Connect location over a standard Ethernet fiber-optic cable. One end is connected to the partner's router, the other to an AWS Direct Connect router. You can automatically add the new interconnect to a link aggregation group (LAG) by specifying a LAG ID in the request. This ensures that the new interconnect is allocated on the same AWS Direct Connect endpoint that hosts the specified LAG. If there are no available ports on the endpoint, the request fails and no interconnect is created. For each end customer, the AWS Direct Connect Partner provisions a connection on their interconnect by calling AllocateHostedConnection. The end customer can then connect to AWS resources by creating a virtual interface on their connection, using the VLAN assigned to them by the AWS Direct Connect Partner.  Intended for use by AWS Direct Connect Partners only. 
    */
  def createInterconnect(params: CreateInterconnectRequest): awsDashSdkLib.libRequestMod.Request[Interconnect, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createInterconnect(
    params: CreateInterconnectRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Interconnect, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Interconnect, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a link aggregation group (LAG) with the specified number of bundled physical connections between the customer network and a specific AWS Direct Connect location. A LAG is a logical interface that uses the Link Aggregation Control Protocol (LACP) to aggregate multiple interfaces, enabling you to treat them as a single interface. All connections in a LAG must use the same bandwidth and must terminate at the same AWS Direct Connect endpoint. You can have up to 10 connections per LAG. Regardless of this limit, if you request more connections for the LAG than AWS Direct Connect can allocate on a single endpoint, no LAG is created. You can specify an existing physical connection or interconnect to include in the LAG (which counts towards the total number of connections). Doing so interrupts the current physical connection or hosted connections, and re-establishes them as a member of the LAG. The LAG will be created on the same AWS Direct Connect endpoint to which the connection terminates. Any virtual interfaces associated with the connection are automatically disassociated and re-associated with the LAG. The connection ID does not change. If the AWS account used to create a LAG is a registered AWS Direct Connect Partner, the LAG is automatically enabled to host sub-connections. For a LAG owned by a partner, any associated virtual interfaces cannot be directly configured.
    */
  def createLag(): awsDashSdkLib.libRequestMod.Request[Lag, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createLag(callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Lag, scala.Unit]): awsDashSdkLib.libRequestMod.Request[Lag, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a link aggregation group (LAG) with the specified number of bundled physical connections between the customer network and a specific AWS Direct Connect location. A LAG is a logical interface that uses the Link Aggregation Control Protocol (LACP) to aggregate multiple interfaces, enabling you to treat them as a single interface. All connections in a LAG must use the same bandwidth and must terminate at the same AWS Direct Connect endpoint. You can have up to 10 connections per LAG. Regardless of this limit, if you request more connections for the LAG than AWS Direct Connect can allocate on a single endpoint, no LAG is created. You can specify an existing physical connection or interconnect to include in the LAG (which counts towards the total number of connections). Doing so interrupts the current physical connection or hosted connections, and re-establishes them as a member of the LAG. The LAG will be created on the same AWS Direct Connect endpoint to which the connection terminates. Any virtual interfaces associated with the connection are automatically disassociated and re-associated with the LAG. The connection ID does not change. If the AWS account used to create a LAG is a registered AWS Direct Connect Partner, the LAG is automatically enabled to host sub-connections. For a LAG owned by a partner, any associated virtual interfaces cannot be directly configured.
    */
  def createLag(params: CreateLagRequest): awsDashSdkLib.libRequestMod.Request[Lag, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createLag(
    params: CreateLagRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Lag, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Lag, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a private virtual interface. A virtual interface is the VLAN that transports AWS Direct Connect traffic. A private virtual interface can be connected to either a Direct Connect gateway or a Virtual Private Gateway (VGW). Connecting the private virtual interface to a Direct Connect gateway enables the possibility for connecting to multiple VPCs, including VPCs in different AWS Regions. Connecting the private virtual interface to a VGW only provides access to a single VPC within the same Region.
    */
  def createPrivateVirtualInterface(): awsDashSdkLib.libRequestMod.Request[VirtualInterface, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createPrivateVirtualInterface(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ VirtualInterface, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[VirtualInterface, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a private virtual interface. A virtual interface is the VLAN that transports AWS Direct Connect traffic. A private virtual interface can be connected to either a Direct Connect gateway or a Virtual Private Gateway (VGW). Connecting the private virtual interface to a Direct Connect gateway enables the possibility for connecting to multiple VPCs, including VPCs in different AWS Regions. Connecting the private virtual interface to a VGW only provides access to a single VPC within the same Region.
    */
  def createPrivateVirtualInterface(params: CreatePrivateVirtualInterfaceRequest): awsDashSdkLib.libRequestMod.Request[VirtualInterface, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createPrivateVirtualInterface(
    params: CreatePrivateVirtualInterfaceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ VirtualInterface, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[VirtualInterface, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a public virtual interface. A virtual interface is the VLAN that transports AWS Direct Connect traffic. A public virtual interface supports sending traffic to public services of AWS such as Amazon S3. When creating an IPv6 public virtual interface (addressFamily is ipv6), leave the customer and amazon address fields blank to use auto-assigned IPv6 space. Custom IPv6 addresses are not supported.
    */
  def createPublicVirtualInterface(): awsDashSdkLib.libRequestMod.Request[VirtualInterface, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createPublicVirtualInterface(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ VirtualInterface, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[VirtualInterface, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a public virtual interface. A virtual interface is the VLAN that transports AWS Direct Connect traffic. A public virtual interface supports sending traffic to public services of AWS such as Amazon S3. When creating an IPv6 public virtual interface (addressFamily is ipv6), leave the customer and amazon address fields blank to use auto-assigned IPv6 space. Custom IPv6 addresses are not supported.
    */
  def createPublicVirtualInterface(params: CreatePublicVirtualInterfaceRequest): awsDashSdkLib.libRequestMod.Request[VirtualInterface, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createPublicVirtualInterface(
    params: CreatePublicVirtualInterfaceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ VirtualInterface, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[VirtualInterface, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified BGP peer on the specified virtual interface with the specified customer address and ASN. You cannot delete the last BGP peer from a virtual interface.
    */
  def deleteBGPPeer(): awsDashSdkLib.libRequestMod.Request[DeleteBGPPeerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBGPPeer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteBGPPeerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteBGPPeerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified BGP peer on the specified virtual interface with the specified customer address and ASN. You cannot delete the last BGP peer from a virtual interface.
    */
  def deleteBGPPeer(params: DeleteBGPPeerRequest): awsDashSdkLib.libRequestMod.Request[DeleteBGPPeerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBGPPeer(
    params: DeleteBGPPeerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteBGPPeerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteBGPPeerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified connection. Deleting a connection only stops the AWS Direct Connect port hour and data transfer charges. If you are partnering with any third parties to connect with the AWS Direct Connect location, you must cancel your service with them separately.
    */
  def deleteConnection(): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteConnection(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Connection, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified connection. Deleting a connection only stops the AWS Direct Connect port hour and data transfer charges. If you are partnering with any third parties to connect with the AWS Direct Connect location, you must cancel your service with them separately.
    */
  def deleteConnection(params: DeleteConnectionRequest): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteConnection(
    params: DeleteConnectionRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Connection, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified Direct Connect gateway. You must first delete all virtual interfaces that are attached to the Direct Connect gateway and disassociate all virtual private gateways that are associated with the Direct Connect gateway.
    */
  def deleteDirectConnectGateway(): awsDashSdkLib.libRequestMod.Request[DeleteDirectConnectGatewayResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDirectConnectGateway(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDirectConnectGatewayResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDirectConnectGatewayResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified Direct Connect gateway. You must first delete all virtual interfaces that are attached to the Direct Connect gateway and disassociate all virtual private gateways that are associated with the Direct Connect gateway.
    */
  def deleteDirectConnectGateway(params: DeleteDirectConnectGatewayRequest): awsDashSdkLib.libRequestMod.Request[DeleteDirectConnectGatewayResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDirectConnectGateway(
    params: DeleteDirectConnectGatewayRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDirectConnectGatewayResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDirectConnectGatewayResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the association between the specified Direct Connect gateway and virtual private gateway.
    */
  def deleteDirectConnectGatewayAssociation(): awsDashSdkLib.libRequestMod.Request[DeleteDirectConnectGatewayAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDirectConnectGatewayAssociation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDirectConnectGatewayAssociationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDirectConnectGatewayAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the association between the specified Direct Connect gateway and virtual private gateway.
    */
  def deleteDirectConnectGatewayAssociation(params: DeleteDirectConnectGatewayAssociationRequest): awsDashSdkLib.libRequestMod.Request[DeleteDirectConnectGatewayAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDirectConnectGatewayAssociation(
    params: DeleteDirectConnectGatewayAssociationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDirectConnectGatewayAssociationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDirectConnectGatewayAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the association proposal request between the specified Direct Connect gateway and virtual private gateway.
    */
  def deleteDirectConnectGatewayAssociationProposal(): awsDashSdkLib.libRequestMod.Request[
    DeleteDirectConnectGatewayAssociationProposalResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDirectConnectGatewayAssociationProposal(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDirectConnectGatewayAssociationProposalResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    DeleteDirectConnectGatewayAssociationProposalResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the association proposal request between the specified Direct Connect gateway and virtual private gateway.
    */
  def deleteDirectConnectGatewayAssociationProposal(params: DeleteDirectConnectGatewayAssociationProposalRequest): awsDashSdkLib.libRequestMod.Request[
    DeleteDirectConnectGatewayAssociationProposalResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDirectConnectGatewayAssociationProposal(
    params: DeleteDirectConnectGatewayAssociationProposalRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDirectConnectGatewayAssociationProposalResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    DeleteDirectConnectGatewayAssociationProposalResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified interconnect.  Intended for use by AWS Direct Connect Partners only. 
    */
  def deleteInterconnect(): awsDashSdkLib.libRequestMod.Request[DeleteInterconnectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteInterconnect(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteInterconnectResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteInterconnectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified interconnect.  Intended for use by AWS Direct Connect Partners only. 
    */
  def deleteInterconnect(params: DeleteInterconnectRequest): awsDashSdkLib.libRequestMod.Request[DeleteInterconnectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteInterconnect(
    params: DeleteInterconnectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteInterconnectResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteInterconnectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified link aggregation group (LAG). You cannot delete a LAG if it has active virtual interfaces or hosted connections.
    */
  def deleteLag(): awsDashSdkLib.libRequestMod.Request[Lag, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteLag(callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Lag, scala.Unit]): awsDashSdkLib.libRequestMod.Request[Lag, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified link aggregation group (LAG). You cannot delete a LAG if it has active virtual interfaces or hosted connections.
    */
  def deleteLag(params: DeleteLagRequest): awsDashSdkLib.libRequestMod.Request[Lag, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteLag(
    params: DeleteLagRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Lag, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Lag, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a virtual interface.
    */
  def deleteVirtualInterface(): awsDashSdkLib.libRequestMod.Request[DeleteVirtualInterfaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteVirtualInterface(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteVirtualInterfaceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteVirtualInterfaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a virtual interface.
    */
  def deleteVirtualInterface(params: DeleteVirtualInterfaceRequest): awsDashSdkLib.libRequestMod.Request[DeleteVirtualInterfaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteVirtualInterface(
    params: DeleteVirtualInterfaceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteVirtualInterfaceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteVirtualInterfaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deprecated. Use DescribeLoa instead. Gets the LOA-CFA for a connection. The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that your APN partner or service provider uses when establishing your cross connect to AWS at the colocation facility. For more information, see Requesting Cross Connects at AWS Direct Connect Locations in the AWS Direct Connect User Guide.
    */
  def describeConnectionLoa(): awsDashSdkLib.libRequestMod.Request[DescribeConnectionLoaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeConnectionLoa(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeConnectionLoaResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeConnectionLoaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deprecated. Use DescribeLoa instead. Gets the LOA-CFA for a connection. The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that your APN partner or service provider uses when establishing your cross connect to AWS at the colocation facility. For more information, see Requesting Cross Connects at AWS Direct Connect Locations in the AWS Direct Connect User Guide.
    */
  def describeConnectionLoa(params: DescribeConnectionLoaRequest): awsDashSdkLib.libRequestMod.Request[DescribeConnectionLoaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeConnectionLoa(
    params: DescribeConnectionLoaRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeConnectionLoaResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeConnectionLoaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Displays the specified connection or all connections in this Region.
    */
  def describeConnections(): awsDashSdkLib.libRequestMod.Request[Connections, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeConnections(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Connections, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Connections, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Displays the specified connection or all connections in this Region.
    */
  def describeConnections(params: DescribeConnectionsRequest): awsDashSdkLib.libRequestMod.Request[Connections, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeConnections(
    params: DescribeConnectionsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Connections, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Connections, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deprecated. Use DescribeHostedConnections instead. Lists the connections that have been provisioned on the specified interconnect.  Intended for use by AWS Direct Connect Partners only. 
    */
  def describeConnectionsOnInterconnect(): awsDashSdkLib.libRequestMod.Request[Connections, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeConnectionsOnInterconnect(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Connections, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Connections, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deprecated. Use DescribeHostedConnections instead. Lists the connections that have been provisioned on the specified interconnect.  Intended for use by AWS Direct Connect Partners only. 
    */
  def describeConnectionsOnInterconnect(params: DescribeConnectionsOnInterconnectRequest): awsDashSdkLib.libRequestMod.Request[Connections, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeConnectionsOnInterconnect(
    params: DescribeConnectionsOnInterconnectRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Connections, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Connections, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes one or more association proposals for connection between a virtual private gateway and a Direct Connect gateway. 
    */
  def describeDirectConnectGatewayAssociationProposals(): awsDashSdkLib.libRequestMod.Request[
    DescribeDirectConnectGatewayAssociationProposalsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDirectConnectGatewayAssociationProposals(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDirectConnectGatewayAssociationProposalsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    DescribeDirectConnectGatewayAssociationProposalsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more association proposals for connection between a virtual private gateway and a Direct Connect gateway. 
    */
  def describeDirectConnectGatewayAssociationProposals(params: DescribeDirectConnectGatewayAssociationProposalsRequest): awsDashSdkLib.libRequestMod.Request[
    DescribeDirectConnectGatewayAssociationProposalsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDirectConnectGatewayAssociationProposals(
    params: DescribeDirectConnectGatewayAssociationProposalsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDirectConnectGatewayAssociationProposalsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    DescribeDirectConnectGatewayAssociationProposalsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the associations between your Direct Connect gateways and virtual private gateways. You must specify a Direct Connect gateway, a virtual private gateway, or both. If you specify a Direct Connect gateway, the response contains all virtual private gateways associated with the Direct Connect gateway. If you specify a virtual private gateway, the response contains all Direct Connect gateways associated with the virtual private gateway. If you specify both, the response contains the association between the Direct Connect gateway and the virtual private gateway.
    */
  def describeDirectConnectGatewayAssociations(): awsDashSdkLib.libRequestMod.Request[DescribeDirectConnectGatewayAssociationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDirectConnectGatewayAssociations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDirectConnectGatewayAssociationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDirectConnectGatewayAssociationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the associations between your Direct Connect gateways and virtual private gateways. You must specify a Direct Connect gateway, a virtual private gateway, or both. If you specify a Direct Connect gateway, the response contains all virtual private gateways associated with the Direct Connect gateway. If you specify a virtual private gateway, the response contains all Direct Connect gateways associated with the virtual private gateway. If you specify both, the response contains the association between the Direct Connect gateway and the virtual private gateway.
    */
  def describeDirectConnectGatewayAssociations(params: DescribeDirectConnectGatewayAssociationsRequest): awsDashSdkLib.libRequestMod.Request[DescribeDirectConnectGatewayAssociationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDirectConnectGatewayAssociations(
    params: DescribeDirectConnectGatewayAssociationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDirectConnectGatewayAssociationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDirectConnectGatewayAssociationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the attachments between your Direct Connect gateways and virtual interfaces. You must specify a Direct Connect gateway, a virtual interface, or both. If you specify a Direct Connect gateway, the response contains all virtual interfaces attached to the Direct Connect gateway. If you specify a virtual interface, the response contains all Direct Connect gateways attached to the virtual interface. If you specify both, the response contains the attachment between the Direct Connect gateway and the virtual interface.
    */
  def describeDirectConnectGatewayAttachments(): awsDashSdkLib.libRequestMod.Request[DescribeDirectConnectGatewayAttachmentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDirectConnectGatewayAttachments(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDirectConnectGatewayAttachmentsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDirectConnectGatewayAttachmentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the attachments between your Direct Connect gateways and virtual interfaces. You must specify a Direct Connect gateway, a virtual interface, or both. If you specify a Direct Connect gateway, the response contains all virtual interfaces attached to the Direct Connect gateway. If you specify a virtual interface, the response contains all Direct Connect gateways attached to the virtual interface. If you specify both, the response contains the attachment between the Direct Connect gateway and the virtual interface.
    */
  def describeDirectConnectGatewayAttachments(params: DescribeDirectConnectGatewayAttachmentsRequest): awsDashSdkLib.libRequestMod.Request[DescribeDirectConnectGatewayAttachmentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDirectConnectGatewayAttachments(
    params: DescribeDirectConnectGatewayAttachmentsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDirectConnectGatewayAttachmentsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDirectConnectGatewayAttachmentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all your Direct Connect gateways or only the specified Direct Connect gateway. Deleted Direct Connect gateways are not returned.
    */
  def describeDirectConnectGateways(): awsDashSdkLib.libRequestMod.Request[DescribeDirectConnectGatewaysResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDirectConnectGateways(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDirectConnectGatewaysResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDirectConnectGatewaysResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all your Direct Connect gateways or only the specified Direct Connect gateway. Deleted Direct Connect gateways are not returned.
    */
  def describeDirectConnectGateways(params: DescribeDirectConnectGatewaysRequest): awsDashSdkLib.libRequestMod.Request[DescribeDirectConnectGatewaysResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDirectConnectGateways(
    params: DescribeDirectConnectGatewaysRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDirectConnectGatewaysResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDirectConnectGatewaysResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the hosted connections that have been provisioned on the specified interconnect or link aggregation group (LAG).  Intended for use by AWS Direct Connect Partners only. 
    */
  def describeHostedConnections(): awsDashSdkLib.libRequestMod.Request[Connections, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeHostedConnections(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Connections, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Connections, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the hosted connections that have been provisioned on the specified interconnect or link aggregation group (LAG).  Intended for use by AWS Direct Connect Partners only. 
    */
  def describeHostedConnections(params: DescribeHostedConnectionsRequest): awsDashSdkLib.libRequestMod.Request[Connections, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeHostedConnections(
    params: DescribeHostedConnectionsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Connections, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Connections, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deprecated. Use DescribeLoa instead. Gets the LOA-CFA for the specified interconnect. The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that is used when establishing your cross connect to AWS at the colocation facility. For more information, see Requesting Cross Connects at AWS Direct Connect Locations in the AWS Direct Connect User Guide.
    */
  def describeInterconnectLoa(): awsDashSdkLib.libRequestMod.Request[DescribeInterconnectLoaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeInterconnectLoa(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeInterconnectLoaResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeInterconnectLoaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deprecated. Use DescribeLoa instead. Gets the LOA-CFA for the specified interconnect. The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that is used when establishing your cross connect to AWS at the colocation facility. For more information, see Requesting Cross Connects at AWS Direct Connect Locations in the AWS Direct Connect User Guide.
    */
  def describeInterconnectLoa(params: DescribeInterconnectLoaRequest): awsDashSdkLib.libRequestMod.Request[DescribeInterconnectLoaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeInterconnectLoa(
    params: DescribeInterconnectLoaRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeInterconnectLoaResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeInterconnectLoaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the interconnects owned by the AWS account or only the specified interconnect.
    */
  def describeInterconnects(): awsDashSdkLib.libRequestMod.Request[Interconnects, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeInterconnects(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Interconnects, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Interconnects, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the interconnects owned by the AWS account or only the specified interconnect.
    */
  def describeInterconnects(params: DescribeInterconnectsRequest): awsDashSdkLib.libRequestMod.Request[Interconnects, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeInterconnects(
    params: DescribeInterconnectsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Interconnects, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Interconnects, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes all your link aggregation groups (LAG) or the specified LAG.
    */
  def describeLags(): awsDashSdkLib.libRequestMod.Request[Lags, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeLags(callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Lags, scala.Unit]): awsDashSdkLib.libRequestMod.Request[Lags, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes all your link aggregation groups (LAG) or the specified LAG.
    */
  def describeLags(params: DescribeLagsRequest): awsDashSdkLib.libRequestMod.Request[Lags, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeLags(
    params: DescribeLagsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Lags, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Lags, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the LOA-CFA for a connection, interconnect, or link aggregation group (LAG). The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that is used when establishing your cross connect to AWS at the colocation facility. For more information, see Requesting Cross Connects at AWS Direct Connect Locations in the AWS Direct Connect User Guide.
    */
  def describeLoa(): awsDashSdkLib.libRequestMod.Request[Loa, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeLoa(callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Loa, scala.Unit]): awsDashSdkLib.libRequestMod.Request[Loa, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the LOA-CFA for a connection, interconnect, or link aggregation group (LAG). The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that is used when establishing your cross connect to AWS at the colocation facility. For more information, see Requesting Cross Connects at AWS Direct Connect Locations in the AWS Direct Connect User Guide.
    */
  def describeLoa(params: DescribeLoaRequest): awsDashSdkLib.libRequestMod.Request[Loa, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeLoa(
    params: DescribeLoaRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Loa, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Loa, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the AWS Direct Connect locations in the current AWS Region. These are the locations that can be selected when calling CreateConnection or CreateInterconnect.
    */
  def describeLocations(): awsDashSdkLib.libRequestMod.Request[Locations, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeLocations(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Locations, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Locations, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the tags associated with the specified AWS Direct Connect resources.
    */
  def describeTags(): awsDashSdkLib.libRequestMod.Request[DescribeTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeTagsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the tags associated with the specified AWS Direct Connect resources.
    */
  def describeTags(params: DescribeTagsRequest): awsDashSdkLib.libRequestMod.Request[DescribeTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeTags(
    params: DescribeTagsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeTagsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the virtual private gateways owned by the AWS account. You can create one or more AWS Direct Connect private virtual interfaces linked to a virtual private gateway.
    */
  def describeVirtualGateways(): awsDashSdkLib.libRequestMod.Request[VirtualGateways, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeVirtualGateways(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ VirtualGateways, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[VirtualGateways, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Displays all virtual interfaces for an AWS account. Virtual interfaces deleted fewer than 15 minutes before you make the request are also returned. If you specify a connection ID, only the virtual interfaces associated with the connection are returned. If you specify a virtual interface ID, then only a single virtual interface is returned. A virtual interface (VLAN) transmits the traffic between the AWS Direct Connect location and the customer network.
    */
  def describeVirtualInterfaces(): awsDashSdkLib.libRequestMod.Request[VirtualInterfaces, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeVirtualInterfaces(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ VirtualInterfaces, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[VirtualInterfaces, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Displays all virtual interfaces for an AWS account. Virtual interfaces deleted fewer than 15 minutes before you make the request are also returned. If you specify a connection ID, only the virtual interfaces associated with the connection are returned. If you specify a virtual interface ID, then only a single virtual interface is returned. A virtual interface (VLAN) transmits the traffic between the AWS Direct Connect location and the customer network.
    */
  def describeVirtualInterfaces(params: DescribeVirtualInterfacesRequest): awsDashSdkLib.libRequestMod.Request[VirtualInterfaces, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeVirtualInterfaces(
    params: DescribeVirtualInterfacesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ VirtualInterfaces, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[VirtualInterfaces, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates a connection from a link aggregation group (LAG). The connection is interrupted and re-established as a standalone connection (the connection is not deleted; to delete the connection, use the DeleteConnection request). If the LAG has associated virtual interfaces or hosted connections, they remain associated with the LAG. A disassociated connection owned by an AWS Direct Connect Partner is automatically converted to an interconnect. If disassociating the connection would cause the LAG to fall below its setting for minimum number of operational connections, the request fails, except when it's the last member of the LAG. If all connections are disassociated, the LAG continues to exist as an empty LAG with no physical connections. 
    */
  def disassociateConnectionFromLag(): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateConnectionFromLag(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Connection, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates a connection from a link aggregation group (LAG). The connection is interrupted and re-established as a standalone connection (the connection is not deleted; to delete the connection, use the DeleteConnection request). If the LAG has associated virtual interfaces or hosted connections, they remain associated with the LAG. A disassociated connection owned by an AWS Direct Connect Partner is automatically converted to an interconnect. If disassociating the connection would cause the LAG to fall below its setting for minimum number of operational connections, the request fails, except when it's the last member of the LAG. If all connections are disassociated, the LAG continues to exist as an empty LAG with no physical connections. 
    */
  def disassociateConnectionFromLag(params: DisassociateConnectionFromLagRequest): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateConnectionFromLag(
    params: DisassociateConnectionFromLagRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Connection, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds the specified tags to the specified AWS Direct Connect resource. Each resource can have a maximum of 50 tags. Each tag consists of a key and an optional value. If a tag with the same key is already associated with the resource, this action updates its value.
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds the specified tags to the specified AWS Direct Connect resource. Each resource can have a maximum of 50 tags. Each tag consists of a key and an optional value. If a tag with the same key is already associated with the resource, this action updates its value.
    */
  def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes one or more tags from the specified AWS Direct Connect resource.
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes one or more tags from the specified AWS Direct Connect resource.
    */
  def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified attributes of the Direct Connect gateway association. Add or remove prefixes from the association.
    */
  def updateDirectConnectGatewayAssociation(): awsDashSdkLib.libRequestMod.Request[UpdateDirectConnectGatewayAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDirectConnectGatewayAssociation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDirectConnectGatewayAssociationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDirectConnectGatewayAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified attributes of the Direct Connect gateway association. Add or remove prefixes from the association.
    */
  def updateDirectConnectGatewayAssociation(params: UpdateDirectConnectGatewayAssociationRequest): awsDashSdkLib.libRequestMod.Request[UpdateDirectConnectGatewayAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDirectConnectGatewayAssociation(
    params: UpdateDirectConnectGatewayAssociationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDirectConnectGatewayAssociationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDirectConnectGatewayAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the attributes of the specified link aggregation group (LAG). You can update the following attributes:   The name of the LAG.   The value for the minimum number of connections that must be operational for the LAG itself to be operational.    When you create a LAG, the default value for the minimum number of operational connections is zero (0). If you update this value and the number of operational connections falls below the specified value, the LAG automatically goes down to avoid over-utilization of the remaining connections. Adjust this value with care, as it could force the LAG down if it is set higher than the current number of operational connections.
    */
  def updateLag(): awsDashSdkLib.libRequestMod.Request[Lag, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateLag(callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Lag, scala.Unit]): awsDashSdkLib.libRequestMod.Request[Lag, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the attributes of the specified link aggregation group (LAG). You can update the following attributes:   The name of the LAG.   The value for the minimum number of connections that must be operational for the LAG itself to be operational.    When you create a LAG, the default value for the minimum number of operational connections is zero (0). If you update this value and the number of operational connections falls below the specified value, the LAG automatically goes down to avoid over-utilization of the remaining connections. Adjust this value with care, as it could force the LAG down if it is set higher than the current number of operational connections.
    */
  def updateLag(params: UpdateLagRequest): awsDashSdkLib.libRequestMod.Request[Lag, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateLag(
    params: UpdateLagRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Lag, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Lag, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified attributes of the specified virtual private interface. Setting the MTU of a virtual interface to 9001 (jumbo frames) can cause an update to the underlying physical connection if it wasn't updated to support jumbo frames. Updating the connection disrupts network connectivity for all virtual interfaces associated with the connection for up to 30 seconds. To check whether your connection supports jumbo frames, call DescribeConnections. To check whether your virtual interface supports jumbo frames, call DescribeVirtualInterfaces.
    */
  def updateVirtualInterfaceAttributes(): awsDashSdkLib.libRequestMod.Request[VirtualInterface, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateVirtualInterfaceAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ VirtualInterface, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[VirtualInterface, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified attributes of the specified virtual private interface. Setting the MTU of a virtual interface to 9001 (jumbo frames) can cause an update to the underlying physical connection if it wasn't updated to support jumbo frames. Updating the connection disrupts network connectivity for all virtual interfaces associated with the connection for up to 30 seconds. To check whether your connection supports jumbo frames, call DescribeConnections. To check whether your virtual interface supports jumbo frames, call DescribeVirtualInterfaces.
    */
  def updateVirtualInterfaceAttributes(params: UpdateVirtualInterfaceAttributesRequest): awsDashSdkLib.libRequestMod.Request[VirtualInterface, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateVirtualInterfaceAttributes(
    params: UpdateVirtualInterfaceAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ VirtualInterface, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[VirtualInterface, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

