package typings
package awsDashSdkLib.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/directconnect", "DirectConnect")
@js.native
object DirectConnectNs extends js.Object {
  
  trait AllocateConnectionOnInterconnectRequest extends js.Object {
    /**
         * The bandwidth of the connection, in Mbps. The possible values are 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, and 500Mbps.
         */
    var bandwidth: Bandwidth
    /**
         * The name of the provisioned connection.
         */
    var connectionName: ConnectionName
    /**
         * The ID of the interconnect on which the connection will be provisioned. For example, dxcon-456abc78.
         */
    var interconnectId: InterconnectId
    /**
         * The ID of the AWS account of the customer for whom the connection will be provisioned.
         */
    var ownerAccount: OwnerAccount
    /**
         * The dedicated VLAN provisioned to the connection.
         */
    var vlan: VLAN
  }
  
  
  trait AllocateHostedConnectionRequest extends js.Object {
    /**
         * The bandwidth of the hosted connection, in Mbps. The possible values are 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, and 500Mbps.
         */
    var bandwidth: Bandwidth
    /**
         * The ID of the interconnect or LAG.
         */
    var connectionId: ConnectionId
    /**
         * The name of the hosted connection.
         */
    var connectionName: ConnectionName
    /**
         * The ID of the AWS account ID of the customer for the connection.
         */
    var ownerAccount: OwnerAccount
    /**
         * The dedicated VLAN provisioned to the hosted connection.
         */
    var vlan: VLAN
  }
  
  
  trait AllocatePrivateVirtualInterfaceRequest extends js.Object {
    /**
         * The ID of the connection on which the private virtual interface is provisioned.
         */
    var connectionId: ConnectionId
    /**
         * Information about the private virtual interface.
         */
    var newPrivateVirtualInterfaceAllocation: NewPrivateVirtualInterfaceAllocation
    /**
         * The ID of the AWS account that owns the virtual private interface.
         */
    var ownerAccount: OwnerAccount
  }
  
  
  trait AllocatePublicVirtualInterfaceRequest extends js.Object {
    /**
         * The ID of the connection on which the public virtual interface is provisioned.
         */
    var connectionId: ConnectionId
    /**
         * Information about the public virtual interface.
         */
    var newPublicVirtualInterfaceAllocation: NewPublicVirtualInterfaceAllocation
    /**
         * The ID of the AWS account that owns the public virtual interface.
         */
    var ownerAccount: OwnerAccount
  }
  
  
  trait AssociateConnectionWithLagRequest extends js.Object {
    /**
         * The ID of the connection. For example, dxcon-abc123.
         */
    var connectionId: ConnectionId
    /**
         * The ID of the LAG with which to associate the connection. For example, dxlag-abc123.
         */
    var lagId: LagId
  }
  
  
  trait AssociateHostedConnectionRequest extends js.Object {
    /**
         * The ID of the hosted connection.
         */
    var connectionId: ConnectionId
    /**
         * The ID of the interconnect or the LAG.
         */
    var parentConnectionId: ConnectionId
  }
  
  
  trait AssociateVirtualInterfaceRequest extends js.Object {
    /**
         * The ID of the LAG or connection.
         */
    var connectionId: ConnectionId
    /**
         * The ID of the virtual interface.
         */
    var virtualInterfaceId: VirtualInterfaceId
  }
  
  
  trait BGPPeer extends js.Object {
    /**
         * The address family for the BGP peer.
         */
    var addressFamily: js.UndefOr[AddressFamily] = js.undefined
    /**
         * The IP address assigned to the Amazon interface.
         */
    var amazonAddress: js.UndefOr[AmazonAddress] = js.undefined
    /**
         * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
         */
    var asn: js.UndefOr[ASN] = js.undefined
    /**
         * The authentication key for BGP configuration.
         */
    var authKey: js.UndefOr[BGPAuthKey] = js.undefined
    /**
         * The Direct Connect endpoint on which the BGP peer terminates.
         */
    var awsDeviceV2: js.UndefOr[AwsDeviceV2] = js.undefined
    /**
         * The ID of the BGP peer.
         */
    var bgpPeerId: js.UndefOr[BGPPeerId] = js.undefined
    /**
         * The state of the BGP peer. The following are the possible values:    verifying: The BGP peering addresses or ASN require validation before the BGP peer can be created. This state applies only to public virtual interfaces.    pending: The BGP peer is created, and remains in this state until it is ready to be established.    available: The BGP peer is ready to be established.    deleting: The BGP peer is being deleted.    deleted: The BGP peer is deleted and cannot be established.  
         */
    var bgpPeerState: js.UndefOr[BGPPeerState] = js.undefined
    /**
         * The status of the BGP peer. The following are the possible values:    up: The BGP peer is established. This state does not indicate the state of the routing function. Ensure that you are receiving routes over the BGP session.    down: The BGP peer is down.    unknown: The BGP peer status is unknown.  
         */
    var bgpStatus: js.UndefOr[BGPStatus] = js.undefined
    /**
         * The IP address assigned to the customer interface.
         */
    var customerAddress: js.UndefOr[CustomerAddress] = js.undefined
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait ConfirmConnectionRequest extends js.Object {
    /**
         * The ID of the hosted connection.
         */
    var connectionId: ConnectionId
  }
  
  
  trait ConfirmConnectionResponse extends js.Object {
    /**
         * The state of the connection. The following are the possible values:    ordering: The initial state of a hosted connection provisioned on an interconnect. The connection stays in the ordering state until the owner of the hosted connection confirms or declines the connection order.    requested: The initial state of a standard connection. The connection stays in the requested state until the Letter of Authorization (LOA) is sent to the customer.    pending: The connection has been approved and is being initialized.    available: The network link is up and the connection is ready for use.    down: The network link is down.    deleting: The connection is being deleted.    deleted: The connection has been deleted.    rejected: A hosted connection in the ordering state enters the rejected state if it is deleted by the customer.  
         */
    var connectionState: js.UndefOr[ConnectionState] = js.undefined
  }
  
  
  trait ConfirmPrivateVirtualInterfaceRequest extends js.Object {
    /**
         * The ID of the Direct Connect gateway.
         */
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined
    /**
         * The ID of the virtual private gateway.
         */
    var virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.undefined
    /**
         * The ID of the virtual interface.
         */
    var virtualInterfaceId: VirtualInterfaceId
  }
  
  
  trait ConfirmPrivateVirtualInterfaceResponse extends js.Object {
    /**
         * The state of the virtual interface. The following are the possible values:    confirming: The creation of the virtual interface is pending confirmation from the virtual interface owner. If the owner of the virtual interface is different from the owner of the connection on which it is provisioned, then the virtual interface will remain in this state until it is confirmed by the virtual interface owner.    verifying: This state only applies to public virtual interfaces. Each public virtual interface needs validation before the virtual interface can be created.    pending: A virtual interface is in this state from the time that it is created until the virtual interface is ready to forward traffic.    available: A virtual interface that is able to forward traffic.    down: A virtual interface that is BGP down.    deleting: A virtual interface is in this state immediately after calling DeleteVirtualInterface until it can no longer forward traffic.    deleted: A virtual interface that cannot forward traffic.    rejected: The virtual interface owner has declined creation of the virtual interface. If a virtual interface in the Confirming state is deleted by the virtual interface owner, the virtual interface enters the Rejected state.  
         */
    var virtualInterfaceState: js.UndefOr[VirtualInterfaceState] = js.undefined
  }
  
  
  trait ConfirmPublicVirtualInterfaceRequest extends js.Object {
    /**
         * The ID of the virtual interface.
         */
    var virtualInterfaceId: VirtualInterfaceId
  }
  
  
  trait ConfirmPublicVirtualInterfaceResponse extends js.Object {
    /**
         * The state of the virtual interface. The following are the possible values:    confirming: The creation of the virtual interface is pending confirmation from the virtual interface owner. If the owner of the virtual interface is different from the owner of the connection on which it is provisioned, then the virtual interface will remain in this state until it is confirmed by the virtual interface owner.    verifying: This state only applies to public virtual interfaces. Each public virtual interface needs validation before the virtual interface can be created.    pending: A virtual interface is in this state from the time that it is created until the virtual interface is ready to forward traffic.    available: A virtual interface that is able to forward traffic.    down: A virtual interface that is BGP down.    deleting: A virtual interface is in this state immediately after calling DeleteVirtualInterface until it can no longer forward traffic.    deleted: A virtual interface that cannot forward traffic.    rejected: The virtual interface owner has declined creation of the virtual interface. If a virtual interface in the Confirming state is deleted by the virtual interface owner, the virtual interface enters the Rejected state.  
         */
    var virtualInterfaceState: js.UndefOr[VirtualInterfaceState] = js.undefined
  }
  
  
  trait Connection extends js.Object {
    /**
         * The Direct Connect endpoint on which the physical connection terminates.
         */
    var awsDevice: js.UndefOr[AwsDevice] = js.undefined
    /**
         * The Direct Connect endpoint on which the physical connection terminates.
         */
    var awsDeviceV2: js.UndefOr[AwsDeviceV2] = js.undefined
    /**
         * The bandwidth of the connection.
         */
    var bandwidth: js.UndefOr[Bandwidth] = js.undefined
    /**
         * The ID of the connection.
         */
    var connectionId: js.UndefOr[ConnectionId] = js.undefined
    /**
         * The name of the connection.
         */
    var connectionName: js.UndefOr[ConnectionName] = js.undefined
    /**
         * The state of the connection. The following are the possible values:    ordering: The initial state of a hosted connection provisioned on an interconnect. The connection stays in the ordering state until the owner of the hosted connection confirms or declines the connection order.    requested: The initial state of a standard connection. The connection stays in the requested state until the Letter of Authorization (LOA) is sent to the customer.    pending: The connection has been approved and is being initialized.    available: The network link is up and the connection is ready for use.    down: The network link is down.    deleting: The connection is being deleted.    deleted: The connection has been deleted.    rejected: A hosted connection in the ordering state enters the rejected state if it is deleted by the customer.  
         */
    var connectionState: js.UndefOr[ConnectionState] = js.undefined
    /**
         * Indicates whether the connection supports a secondary BGP peer in the same address family (IPv4/IPv6).
         */
    var hasLogicalRedundancy: js.UndefOr[HasLogicalRedundancy] = js.undefined
    /**
         * Indicates whether jumbo frames (9001 MTU) are supported.
         */
    var jumboFrameCapable: js.UndefOr[JumboFrameCapable] = js.undefined
    /**
         * The ID of the LAG.
         */
    var lagId: js.UndefOr[LagId] = js.undefined
    /**
         * The time of the most recent call to DescribeLoa for this connection.
         */
    var loaIssueTime: js.UndefOr[LoaIssueTime] = js.undefined
    /**
         * The location of the connection.
         */
    var location: js.UndefOr[LocationCode] = js.undefined
    /**
         * The ID of the AWS account that owns the connection.
         */
    var ownerAccount: js.UndefOr[OwnerAccount] = js.undefined
    /**
         * The name of the AWS Direct Connect service provider associated with the connection.
         */
    var partnerName: js.UndefOr[PartnerName] = js.undefined
    /**
         * The AWS Region where the connection is located.
         */
    var region: js.UndefOr[Region] = js.undefined
    /**
         * The ID of the VLAN.
         */
    var vlan: js.UndefOr[VLAN] = js.undefined
  }
  
  
  trait Connections extends js.Object {
    /**
         * The connections.
         */
    var connections: js.UndefOr[ConnectionList] = js.undefined
  }
  
  
  trait CreateBGPPeerRequest extends js.Object {
    /**
         * Information about the BGP peer.
         */
    var newBGPPeer: js.UndefOr[NewBGPPeer] = js.undefined
    /**
         * The ID of the virtual interface.
         */
    var virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined
  }
  
  
  trait CreateBGPPeerResponse extends js.Object {
    /**
         * The virtual interface.
         */
    var virtualInterface: js.UndefOr[VirtualInterface] = js.undefined
  }
  
  
  trait CreateConnectionRequest extends js.Object {
    /**
         * The bandwidth of the connection.
         */
    var bandwidth: Bandwidth
    /**
         * The name of the connection.
         */
    var connectionName: ConnectionName
    /**
         * The ID of the LAG.
         */
    var lagId: js.UndefOr[LagId] = js.undefined
    /**
         * The location of the connection.
         */
    var location: LocationCode
  }
  
  
  trait CreateDirectConnectGatewayAssociationRequest extends js.Object {
    /**
         * The ID of the Direct Connect gateway.
         */
    var directConnectGatewayId: DirectConnectGatewayId
    /**
         * The ID of the virtual private gateway.
         */
    var virtualGatewayId: VirtualGatewayId
  }
  
  
  trait CreateDirectConnectGatewayAssociationResult extends js.Object {
    /**
         * The association to be created.
         */
    var directConnectGatewayAssociation: js.UndefOr[DirectConnectGatewayAssociation] = js.undefined
  }
  
  
  trait CreateDirectConnectGatewayRequest extends js.Object {
    /**
         * The autonomous system number (ASN) for Border Gateway Protocol (BGP) to be configured on the Amazon side of the connection. The ASN must be in the private range of 64,512 to 65,534 or 4,200,000,000 to 4,294,967,294. The default is 64512.
         */
    var amazonSideAsn: js.UndefOr[LongAsn] = js.undefined
    /**
         * The name of the Direct Connect gateway.
         */
    var directConnectGatewayName: DirectConnectGatewayName
  }
  
  
  trait CreateDirectConnectGatewayResult extends js.Object {
    /**
         * The Direct Connect gateway.
         */
    var directConnectGateway: js.UndefOr[DirectConnectGateway] = js.undefined
  }
  
  
  trait CreateInterconnectRequest extends js.Object {
    /**
         * The port bandwidth, in Gbps. The possible values are 1 and 10.
         */
    var bandwidth: Bandwidth
    /**
         * The name of the interconnect.
         */
    var interconnectName: InterconnectName
    /**
         * The ID of the LAG.
         */
    var lagId: js.UndefOr[LagId] = js.undefined
    /**
         * The location of the interconnect.
         */
    var location: LocationCode
  }
  
  
  trait CreateLagRequest extends js.Object {
    /**
         * The ID of an existing connection to migrate to the LAG.
         */
    var connectionId: js.UndefOr[ConnectionId] = js.undefined
    /**
         * The bandwidth of the individual physical connections bundled by the LAG. The possible values are 1Gbps and 10Gbps.
         */
    var connectionsBandwidth: Bandwidth
    /**
         * The name of the LAG.
         */
    var lagName: LagName
    /**
         * The location for the LAG.
         */
    var location: LocationCode
    /**
         * The number of physical connections initially provisioned and bundled by the LAG.
         */
    var numberOfConnections: Count
  }
  
  
  trait CreatePrivateVirtualInterfaceRequest extends js.Object {
    /**
         * The ID of the connection.
         */
    var connectionId: ConnectionId
    /**
         * Information about the private virtual interface.
         */
    var newPrivateVirtualInterface: NewPrivateVirtualInterface
  }
  
  
  trait CreatePublicVirtualInterfaceRequest extends js.Object {
    /**
         * The ID of the connection.
         */
    var connectionId: ConnectionId
    /**
         * Information about the public virtual interface.
         */
    var newPublicVirtualInterface: NewPublicVirtualInterface
  }
  
  
  trait DeleteBGPPeerRequest extends js.Object {
    /**
         * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
         */
    var asn: js.UndefOr[ASN] = js.undefined
    /**
         * The ID of the BGP peer.
         */
    var bgpPeerId: js.UndefOr[BGPPeerId] = js.undefined
    /**
         * The IP address assigned to the customer interface.
         */
    var customerAddress: js.UndefOr[CustomerAddress] = js.undefined
    /**
         * The ID of the virtual interface.
         */
    var virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined
  }
  
  
  trait DeleteBGPPeerResponse extends js.Object {
    /**
         * The virtual interface.
         */
    var virtualInterface: js.UndefOr[VirtualInterface] = js.undefined
  }
  
  
  trait DeleteConnectionRequest extends js.Object {
    /**
         * The ID of the connection.
         */
    var connectionId: ConnectionId
  }
  
  
  trait DeleteDirectConnectGatewayAssociationRequest extends js.Object {
    /**
         * The ID of the Direct Connect gateway.
         */
    var directConnectGatewayId: DirectConnectGatewayId
    /**
         * The ID of the virtual private gateway.
         */
    var virtualGatewayId: VirtualGatewayId
  }
  
  
  trait DeleteDirectConnectGatewayAssociationResult extends js.Object {
    /**
         * The association to be deleted.
         */
    var directConnectGatewayAssociation: js.UndefOr[DirectConnectGatewayAssociation] = js.undefined
  }
  
  
  trait DeleteDirectConnectGatewayRequest extends js.Object {
    /**
         * The ID of the Direct Connect gateway.
         */
    var directConnectGatewayId: DirectConnectGatewayId
  }
  
  
  trait DeleteDirectConnectGatewayResult extends js.Object {
    /**
         * The Direct Connect gateway.
         */
    var directConnectGateway: js.UndefOr[DirectConnectGateway] = js.undefined
  }
  
  
  trait DeleteInterconnectRequest extends js.Object {
    /**
         * The ID of the interconnect.
         */
    var interconnectId: InterconnectId
  }
  
  
  trait DeleteInterconnectResponse extends js.Object {
    /**
         * The state of the interconnect. The following are the possible values:    requested: The initial state of an interconnect. The interconnect stays in the requested state until the Letter of Authorization (LOA) is sent to the customer.    pending: The interconnect is approved, and is being initialized.    available: The network link is up, and the interconnect is ready for use.    down: The network link is down.    deleting: The interconnect is being deleted.    deleted: The interconnect is deleted.  
         */
    var interconnectState: js.UndefOr[InterconnectState] = js.undefined
  }
  
  
  trait DeleteLagRequest extends js.Object {
    /**
         * The ID of the LAG.
         */
    var lagId: LagId
  }
  
  
  trait DeleteVirtualInterfaceRequest extends js.Object {
    /**
         * The ID of the virtual interface.
         */
    var virtualInterfaceId: VirtualInterfaceId
  }
  
  
  trait DeleteVirtualInterfaceResponse extends js.Object {
    /**
         * The state of the virtual interface. The following are the possible values:    confirming: The creation of the virtual interface is pending confirmation from the virtual interface owner. If the owner of the virtual interface is different from the owner of the connection on which it is provisioned, then the virtual interface will remain in this state until it is confirmed by the virtual interface owner.    verifying: This state only applies to public virtual interfaces. Each public virtual interface needs validation before the virtual interface can be created.    pending: A virtual interface is in this state from the time that it is created until the virtual interface is ready to forward traffic.    available: A virtual interface that is able to forward traffic.    down: A virtual interface that is BGP down.    deleting: A virtual interface is in this state immediately after calling DeleteVirtualInterface until it can no longer forward traffic.    deleted: A virtual interface that cannot forward traffic.    rejected: The virtual interface owner has declined creation of the virtual interface. If a virtual interface in the Confirming state is deleted by the virtual interface owner, the virtual interface enters the Rejected state.  
         */
    var virtualInterfaceState: js.UndefOr[VirtualInterfaceState] = js.undefined
  }
  
  
  trait DescribeConnectionLoaRequest extends js.Object {
    /**
         * The ID of the connection.
         */
    var connectionId: ConnectionId
    /**
         * The standard media type for the LOA-CFA document. The only supported value is application/pdf.
         */
    var loaContentType: js.UndefOr[LoaContentType] = js.undefined
    /**
         * The name of the APN partner or service provider who establishes connectivity on your behalf. If you specify this parameter, the LOA-CFA lists the provider name alongside your company name as the requester of the cross connect.
         */
    var providerName: js.UndefOr[ProviderName] = js.undefined
  }
  
  
  trait DescribeConnectionLoaResponse extends js.Object {
    /**
         * The Letter of Authorization - Connecting Facility Assignment (LOA-CFA).
         */
    var loa: js.UndefOr[Loa] = js.undefined
  }
  
  
  trait DescribeConnectionsOnInterconnectRequest extends js.Object {
    /**
         * The ID of the interconnect.
         */
    var interconnectId: InterconnectId
  }
  
  
  trait DescribeConnectionsRequest extends js.Object {
    /**
         * The ID of the connection.
         */
    var connectionId: js.UndefOr[ConnectionId] = js.undefined
  }
  
  
  trait DescribeDirectConnectGatewayAssociationsRequest extends js.Object {
    /**
         * The ID of the Direct Connect gateway.
         */
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined
    /**
         * The maximum number of associations to return per page.
         */
    var maxResults: js.UndefOr[MaxResultSetSize] = js.undefined
    /**
         * The token provided in the previous call to retrieve the next page.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
         * The ID of the virtual private gateway.
         */
    var virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.undefined
  }
  
  
  trait DescribeDirectConnectGatewayAssociationsResult extends js.Object {
    /**
         * The associations.
         */
    var directConnectGatewayAssociations: js.UndefOr[DirectConnectGatewayAssociationList] = js.undefined
    /**
         * The token to retrieve the next page.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  
  trait DescribeDirectConnectGatewayAttachmentsRequest extends js.Object {
    /**
         * The ID of the Direct Connect gateway.
         */
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined
    /**
         * The maximum number of attachments to return per page.
         */
    var maxResults: js.UndefOr[MaxResultSetSize] = js.undefined
    /**
         * The token provided in the previous call to retrieve the next page.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
         * The ID of the virtual interface.
         */
    var virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined
  }
  
  
  trait DescribeDirectConnectGatewayAttachmentsResult extends js.Object {
    /**
         * The attachments.
         */
    var directConnectGatewayAttachments: js.UndefOr[DirectConnectGatewayAttachmentList] = js.undefined
    /**
         * The token to retrieve the next page.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  
  trait DescribeDirectConnectGatewaysRequest extends js.Object {
    /**
         * The ID of the Direct Connect gateway.
         */
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined
    /**
         * The maximum number of Direct Connect gateways to return per page.
         */
    var maxResults: js.UndefOr[MaxResultSetSize] = js.undefined
    /**
         * The token provided in the previous call to retrieve the next page.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  
  trait DescribeDirectConnectGatewaysResult extends js.Object {
    /**
         * The Direct Connect gateways.
         */
    var directConnectGateways: js.UndefOr[DirectConnectGatewayList] = js.undefined
    /**
         * The token to retrieve the next page.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  
  trait DescribeHostedConnectionsRequest extends js.Object {
    /**
         * The ID of the interconnect or LAG.
         */
    var connectionId: ConnectionId
  }
  
  
  trait DescribeInterconnectLoaRequest extends js.Object {
    /**
         * The ID of the interconnect.
         */
    var interconnectId: InterconnectId
    /**
         * The standard media type for the LOA-CFA document. The only supported value is application/pdf.
         */
    var loaContentType: js.UndefOr[LoaContentType] = js.undefined
    /**
         * The name of the service provider who establishes connectivity on your behalf. If you supply this parameter, the LOA-CFA lists the provider name alongside your company name as the requester of the cross connect.
         */
    var providerName: js.UndefOr[ProviderName] = js.undefined
  }
  
  
  trait DescribeInterconnectLoaResponse extends js.Object {
    /**
         * The Letter of Authorization - Connecting Facility Assignment (LOA-CFA).
         */
    var loa: js.UndefOr[Loa] = js.undefined
  }
  
  
  trait DescribeInterconnectsRequest extends js.Object {
    /**
         * The ID of the interconnect.
         */
    var interconnectId: js.UndefOr[InterconnectId] = js.undefined
  }
  
  
  trait DescribeLagsRequest extends js.Object {
    /**
         * The ID of the LAG.
         */
    var lagId: js.UndefOr[LagId] = js.undefined
  }
  
  
  trait DescribeLoaRequest extends js.Object {
    /**
         * The ID of a connection, LAG, or interconnect.
         */
    var connectionId: ConnectionId
    /**
         * The standard media type for the LOA-CFA document. The only supported value is application/pdf.
         */
    var loaContentType: js.UndefOr[LoaContentType] = js.undefined
    /**
         * The name of the service provider who establishes connectivity on your behalf. If you specify this parameter, the LOA-CFA lists the provider name alongside your company name as the requester of the cross connect.
         */
    var providerName: js.UndefOr[ProviderName] = js.undefined
  }
  
  
  trait DescribeTagsRequest extends js.Object {
    /**
         * The Amazon Resource Names (ARNs) of the resources.
         */
    var resourceArns: ResourceArnList
  }
  
  
  trait DescribeTagsResponse extends js.Object {
    /**
         * Information about the tags.
         */
    var resourceTags: js.UndefOr[ResourceTagList] = js.undefined
  }
  
  
  trait DescribeVirtualInterfacesRequest extends js.Object {
    /**
         * The ID of the connection.
         */
    var connectionId: js.UndefOr[ConnectionId] = js.undefined
    /**
         * The ID of the virtual interface.
         */
    var virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined
  }
  
  
  trait DirectConnectGateway extends js.Object {
    /**
         * The autonomous system number (ASN) for the Amazon side of the connection.
         */
    var amazonSideAsn: js.UndefOr[LongAsn] = js.undefined
    /**
         * The ID of the Direct Connect gateway.
         */
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined
    /**
         * The name of the Direct Connect gateway.
         */
    var directConnectGatewayName: js.UndefOr[DirectConnectGatewayName] = js.undefined
    /**
         * The state of the Direct Connect gateway. The following are the possible values:    pending: The initial state after calling CreateDirectConnectGateway.    available: The Direct Connect gateway is ready for use.    deleting: The initial state after calling DeleteDirectConnectGateway.    deleted: The Direct Connect gateway is deleted and cannot pass traffic.  
         */
    var directConnectGatewayState: js.UndefOr[DirectConnectGatewayState] = js.undefined
    /**
         * The ID of the AWS account that owns the Direct Connect gateway.
         */
    var ownerAccount: js.UndefOr[OwnerAccount] = js.undefined
    /**
         * The error message if the state of an object failed to advance.
         */
    var stateChangeError: js.UndefOr[StateChangeError] = js.undefined
  }
  
  
  trait DirectConnectGatewayAssociation extends js.Object {
    /**
         * The state of the association. The following are the possible values:    associating: The initial state after calling CreateDirectConnectGatewayAssociation.    associated: The Direct Connect gateway and virtual private gateway are successfully associated and ready to pass traffic.    disassociating: The initial state after calling DeleteDirectConnectGatewayAssociation.    disassociated: The virtual private gateway is disassociated from the Direct Connect gateway. Traffic flow between the Direct Connect gateway and virtual private gateway is stopped.  
         */
    var associationState: js.UndefOr[DirectConnectGatewayAssociationState] = js.undefined
    /**
         * The ID of the Direct Connect gateway.
         */
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined
    /**
         * The error message if the state of an object failed to advance.
         */
    var stateChangeError: js.UndefOr[StateChangeError] = js.undefined
    /**
         * The ID of the virtual private gateway. Applies only to private virtual interfaces.
         */
    var virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.undefined
    /**
         * The ID of the AWS account that owns the virtual private gateway.
         */
    var virtualGatewayOwnerAccount: js.UndefOr[OwnerAccount] = js.undefined
    /**
         * The AWS Region where the virtual private gateway is located.
         */
    var virtualGatewayRegion: js.UndefOr[VirtualGatewayRegion] = js.undefined
  }
  
  
  trait DirectConnectGatewayAttachment extends js.Object {
    /**
         * The state of the attachment. The following are the possible values:    attaching: The initial state after a virtual interface is created using the Direct Connect gateway.    attached: The Direct Connect gateway and virtual interface are attached and ready to pass traffic.    detaching: The initial state after calling DeleteVirtualInterface.    detached: The virtual interface is detached from the Direct Connect gateway. Traffic flow between the Direct Connect gateway and virtual interface is stopped.  
         */
    var attachmentState: js.UndefOr[DirectConnectGatewayAttachmentState] = js.undefined
    /**
         * The ID of the Direct Connect gateway.
         */
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined
    /**
         * The error message if the state of an object failed to advance.
         */
    var stateChangeError: js.UndefOr[StateChangeError] = js.undefined
    /**
         * The ID of the virtual interface.
         */
    var virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined
    /**
         * The ID of the AWS account that owns the virtual interface.
         */
    var virtualInterfaceOwnerAccount: js.UndefOr[OwnerAccount] = js.undefined
    /**
         * The AWS Region where the virtual interface is located.
         */
    var virtualInterfaceRegion: js.UndefOr[VirtualInterfaceRegion] = js.undefined
  }
  
  
  trait DisassociateConnectionFromLagRequest extends js.Object {
    /**
         * The ID of the connection. For example, dxcon-abc123.
         */
    var connectionId: ConnectionId
    /**
         * The ID of the LAG. For example, dxlag-abc123.
         */
    var lagId: LagId
  }
  
  
  trait Interconnect extends js.Object {
    /**
         * The Direct Connect endpoint on which the physical connection terminates.
         */
    var awsDevice: js.UndefOr[AwsDevice] = js.undefined
    /**
         * The Direct Connect endpoint on which the physical connection terminates.
         */
    var awsDeviceV2: js.UndefOr[AwsDeviceV2] = js.undefined
    /**
         * The bandwidth of the connection.
         */
    var bandwidth: js.UndefOr[Bandwidth] = js.undefined
    /**
         * Indicates whether the interconnect supports a secondary BGP in the same address family (IPv4/IPv6).
         */
    var hasLogicalRedundancy: js.UndefOr[HasLogicalRedundancy] = js.undefined
    /**
         * The ID of the interconnect.
         */
    var interconnectId: js.UndefOr[InterconnectId] = js.undefined
    /**
         * The name of the interconnect.
         */
    var interconnectName: js.UndefOr[InterconnectName] = js.undefined
    /**
         * The state of the interconnect. The following are the possible values:    requested: The initial state of an interconnect. The interconnect stays in the requested state until the Letter of Authorization (LOA) is sent to the customer.    pending: The interconnect is approved, and is being initialized.    available: The network link is up, and the interconnect is ready for use.    down: The network link is down.    deleting: The interconnect is being deleted.    deleted: The interconnect is deleted.  
         */
    var interconnectState: js.UndefOr[InterconnectState] = js.undefined
    /**
         * Indicates whether jumbo frames (9001 MTU) are supported.
         */
    var jumboFrameCapable: js.UndefOr[JumboFrameCapable] = js.undefined
    /**
         * The ID of the LAG.
         */
    var lagId: js.UndefOr[LagId] = js.undefined
    /**
         * The time of the most recent call to DescribeLoa for this connection.
         */
    var loaIssueTime: js.UndefOr[LoaIssueTime] = js.undefined
    /**
         * The location of the connection.
         */
    var location: js.UndefOr[LocationCode] = js.undefined
    /**
         * The AWS Region where the connection is located.
         */
    var region: js.UndefOr[Region] = js.undefined
  }
  
  
  trait Interconnects extends js.Object {
    /**
         * The interconnects.
         */
    var interconnects: js.UndefOr[InterconnectList] = js.undefined
  }
  
  
  trait Lag extends js.Object {
    /**
         * Indicates whether the LAG can host other connections.
         */
    var allowsHostedConnections: js.UndefOr[BooleanFlag] = js.undefined
    /**
         * The Direct Connect endpoint that hosts the LAG.
         */
    var awsDevice: js.UndefOr[AwsDevice] = js.undefined
    /**
         * The Direct Connect endpoint that hosts the LAG.
         */
    var awsDeviceV2: js.UndefOr[AwsDeviceV2] = js.undefined
    /**
         * The connections bundled by the LAG.
         */
    var connections: js.UndefOr[ConnectionList] = js.undefined
    /**
         * The individual bandwidth of the physical connections bundled by the LAG. The possible values are 1Gbps and 10Gbps.
         */
    var connectionsBandwidth: js.UndefOr[Bandwidth] = js.undefined
    /**
         * Indicates whether the LAG supports a secondary BGP peer in the same address family (IPv4/IPv6).
         */
    var hasLogicalRedundancy: js.UndefOr[HasLogicalRedundancy] = js.undefined
    /**
         * Indicates whether jumbo frames (9001 MTU) are supported.
         */
    var jumboFrameCapable: js.UndefOr[JumboFrameCapable] = js.undefined
    /**
         * The ID of the LAG.
         */
    var lagId: js.UndefOr[LagId] = js.undefined
    /**
         * The name of the LAG.
         */
    var lagName: js.UndefOr[LagName] = js.undefined
    /**
         * The state of the LAG. The following are the possible values:    requested: The initial state of a LAG. The LAG stays in the requested state until the Letter of Authorization (LOA) is available.    pending: The LAG has been approved and is being initialized.    available: The network link is established and the LAG is ready for use.    down: The network link is down.    deleting: The LAG is being deleted.    deleted: The LAG is deleted.  
         */
    var lagState: js.UndefOr[LagState] = js.undefined
    /**
         * The location of the LAG.
         */
    var location: js.UndefOr[LocationCode] = js.undefined
    /**
         * The minimum number of physical connections that must be operational for the LAG itself to be operational.
         */
    var minimumLinks: js.UndefOr[Count] = js.undefined
    /**
         * The number of physical connections bundled by the LAG, up to a maximum of 10.
         */
    var numberOfConnections: js.UndefOr[Count] = js.undefined
    /**
         * The ID of the AWS account that owns the LAG.
         */
    var ownerAccount: js.UndefOr[OwnerAccount] = js.undefined
    /**
         * The AWS Region where the connection is located.
         */
    var region: js.UndefOr[Region] = js.undefined
  }
  
  
  trait Lags extends js.Object {
    /**
         * The LAGs.
         */
    var lags: js.UndefOr[LagList] = js.undefined
  }
  
  
  trait Loa extends js.Object {
    /**
         * The binary contents of the LOA-CFA document.
         */
    var loaContent: js.UndefOr[LoaContent] = js.undefined
    /**
         * The standard media type for the LOA-CFA document. The only supported value is application/pdf.
         */
    var loaContentType: js.UndefOr[LoaContentType] = js.undefined
  }
  
  
  trait Location extends js.Object {
    /**
         * The code for the location.
         */
    var locationCode: js.UndefOr[LocationCode] = js.undefined
    /**
         * The name of the location. This includes the name of the colocation partner and the physical site of the building.
         */
    var locationName: js.UndefOr[LocationName] = js.undefined
    /**
         * The AWS Region for the location.
         */
    var region: js.UndefOr[Region] = js.undefined
  }
  
  
  trait Locations extends js.Object {
    /**
         * The locations.
         */
    var locations: js.UndefOr[LocationList] = js.undefined
  }
  
  
  trait NewBGPPeer extends js.Object {
    /**
         * The address family for the BGP peer.
         */
    var addressFamily: js.UndefOr[AddressFamily] = js.undefined
    /**
         * The IP address assigned to the Amazon interface.
         */
    var amazonAddress: js.UndefOr[AmazonAddress] = js.undefined
    /**
         * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
         */
    var asn: js.UndefOr[ASN] = js.undefined
    /**
         * The authentication key for BGP configuration.
         */
    var authKey: js.UndefOr[BGPAuthKey] = js.undefined
    /**
         * The IP address assigned to the customer interface.
         */
    var customerAddress: js.UndefOr[CustomerAddress] = js.undefined
  }
  
  
  trait NewPrivateVirtualInterface extends js.Object {
    /**
         * The address family for the BGP peer.
         */
    var addressFamily: js.UndefOr[AddressFamily] = js.undefined
    /**
         * The IP address assigned to the Amazon interface.
         */
    var amazonAddress: js.UndefOr[AmazonAddress] = js.undefined
    /**
         * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
         */
    var asn: ASN
    /**
         * The authentication key for BGP configuration.
         */
    var authKey: js.UndefOr[BGPAuthKey] = js.undefined
    /**
         * The IP address assigned to the customer interface.
         */
    var customerAddress: js.UndefOr[CustomerAddress] = js.undefined
    /**
         * The ID of the Direct Connect gateway.
         */
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined
    /**
         * The maximum transmission unit (MTU), in bytes. The supported values are 1500 and 9001. The default value is 1500.
         */
    var mtu: js.UndefOr[MTU] = js.undefined
    /**
         * The ID of the virtual private gateway.
         */
    var virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.undefined
    /**
         * The name of the virtual interface assigned by the customer network.
         */
    var virtualInterfaceName: VirtualInterfaceName
    /**
         * The ID of the VLAN.
         */
    var vlan: VLAN
  }
  
  
  trait NewPrivateVirtualInterfaceAllocation extends js.Object {
    /**
         * The address family for the BGP peer.
         */
    var addressFamily: js.UndefOr[AddressFamily] = js.undefined
    /**
         * The IP address assigned to the Amazon interface.
         */
    var amazonAddress: js.UndefOr[AmazonAddress] = js.undefined
    /**
         * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
         */
    var asn: ASN
    /**
         * The authentication key for BGP configuration.
         */
    var authKey: js.UndefOr[BGPAuthKey] = js.undefined
    /**
         * The IP address assigned to the customer interface.
         */
    var customerAddress: js.UndefOr[CustomerAddress] = js.undefined
    /**
         * The maximum transmission unit (MTU), in bytes. The supported values are 1500 and 9001. The default value is 1500.
         */
    var mtu: js.UndefOr[MTU] = js.undefined
    /**
         * The name of the virtual interface assigned by the customer network.
         */
    var virtualInterfaceName: VirtualInterfaceName
    /**
         * The ID of the VLAN.
         */
    var vlan: VLAN
  }
  
  
  trait NewPublicVirtualInterface extends js.Object {
    /**
         * The address family for the BGP peer.
         */
    var addressFamily: js.UndefOr[AddressFamily] = js.undefined
    /**
         * The IP address assigned to the Amazon interface.
         */
    var amazonAddress: js.UndefOr[AmazonAddress] = js.undefined
    /**
         * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
         */
    var asn: ASN
    /**
         * The authentication key for BGP configuration.
         */
    var authKey: js.UndefOr[BGPAuthKey] = js.undefined
    /**
         * The IP address assigned to the customer interface.
         */
    var customerAddress: js.UndefOr[CustomerAddress] = js.undefined
    /**
         * The routes to be advertised to the AWS network in this Region. Applies to public virtual interfaces.
         */
    var routeFilterPrefixes: js.UndefOr[RouteFilterPrefixList] = js.undefined
    /**
         * The name of the virtual interface assigned by the customer network.
         */
    var virtualInterfaceName: VirtualInterfaceName
    /**
         * The ID of the VLAN.
         */
    var vlan: VLAN
  }
  
  
  trait NewPublicVirtualInterfaceAllocation extends js.Object {
    /**
         * The address family for the BGP peer.
         */
    var addressFamily: js.UndefOr[AddressFamily] = js.undefined
    /**
         * The IP address assigned to the Amazon interface.
         */
    var amazonAddress: js.UndefOr[AmazonAddress] = js.undefined
    /**
         * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
         */
    var asn: ASN
    /**
         * The authentication key for BGP configuration.
         */
    var authKey: js.UndefOr[BGPAuthKey] = js.undefined
    /**
         * The IP address assigned to the customer interface.
         */
    var customerAddress: js.UndefOr[CustomerAddress] = js.undefined
    /**
         * The routes to be advertised to the AWS network in this Region. Applies to public virtual interfaces.
         */
    var routeFilterPrefixes: js.UndefOr[RouteFilterPrefixList] = js.undefined
    /**
         * The name of the virtual interface assigned by the customer network.
         */
    var virtualInterfaceName: VirtualInterfaceName
    /**
         * The ID of the VLAN.
         */
    var vlan: VLAN
  }
  
  
  trait ResourceTag extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the resource.
         */
    var resourceArn: js.UndefOr[ResourceArn] = js.undefined
    /**
         * The tags.
         */
    var tags: js.UndefOr[TagList] = js.undefined
  }
  
  
  trait RouteFilterPrefix extends js.Object {
    /**
         * The CIDR block for the advertised route. Separate multiple routes using commas. An IPv6 CIDR must use /64 or shorter.
         */
    var cidr: js.UndefOr[CIDR] = js.undefined
  }
  
  
  trait Tag extends js.Object {
    /**
         * The key.
         */
    var key: TagKey
    /**
         * The value.
         */
    var value: js.UndefOr[TagValue] = js.undefined
  }
  
  
  trait TagResourceRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the resource.
         */
    var resourceArn: ResourceArn
    /**
         * The tags to add.
         */
    var tags: TagList
  }
  
  
  trait TagResourceResponse extends js.Object
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Deprecated. Use AllocateHostedConnection instead. Creates a hosted connection on an interconnect. Allocates a VLAN number and a specified amount of bandwidth for use by a hosted connection on the specified interconnect.  Intended for use by AWS Direct Connect partners only. 
       */
    def allocateConnectionOnInterconnect(): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deprecated. Use AllocateHostedConnection instead. Creates a hosted connection on an interconnect. Allocates a VLAN number and a specified amount of bandwidth for use by a hosted connection on the specified interconnect.  Intended for use by AWS Direct Connect partners only. 
       */
    def allocateConnectionOnInterconnect(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Connection, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deprecated. Use AllocateHostedConnection instead. Creates a hosted connection on an interconnect. Allocates a VLAN number and a specified amount of bandwidth for use by a hosted connection on the specified interconnect.  Intended for use by AWS Direct Connect partners only. 
       */
    def allocateConnectionOnInterconnect(params: AllocateConnectionOnInterconnectRequest): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deprecated. Use AllocateHostedConnection instead. Creates a hosted connection on an interconnect. Allocates a VLAN number and a specified amount of bandwidth for use by a hosted connection on the specified interconnect.  Intended for use by AWS Direct Connect partners only. 
       */
    def allocateConnectionOnInterconnect(
      params: AllocateConnectionOnInterconnectRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Connection, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a hosted connection on the specified interconnect or a link aggregation group (LAG). Allocates a VLAN number and a specified amount of bandwidth for use by a hosted connection on the specified interconnect or LAG.  Intended for use by AWS Direct Connect partners only. 
       */
    def allocateHostedConnection(): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a hosted connection on the specified interconnect or a link aggregation group (LAG). Allocates a VLAN number and a specified amount of bandwidth for use by a hosted connection on the specified interconnect or LAG.  Intended for use by AWS Direct Connect partners only. 
       */
    def allocateHostedConnection(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Connection, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a hosted connection on the specified interconnect or a link aggregation group (LAG). Allocates a VLAN number and a specified amount of bandwidth for use by a hosted connection on the specified interconnect or LAG.  Intended for use by AWS Direct Connect partners only. 
       */
    def allocateHostedConnection(params: AllocateHostedConnectionRequest): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a hosted connection on the specified interconnect or a link aggregation group (LAG). Allocates a VLAN number and a specified amount of bandwidth for use by a hosted connection on the specified interconnect or LAG.  Intended for use by AWS Direct Connect partners only. 
       */
    def allocateHostedConnection(
      params: AllocateHostedConnectionRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Connection, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provisions a private virtual interface to be owned by the specified AWS account. Virtual interfaces created using this action must be confirmed by the owner using ConfirmPrivateVirtualInterface. Until then, the virtual interface is in the Confirming state and is not available to handle traffic.
       */
    def allocatePrivateVirtualInterface(): awsDashSdkLib.libRequestMod.Request[VirtualInterface, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provisions a private virtual interface to be owned by the specified AWS account. Virtual interfaces created using this action must be confirmed by the owner using ConfirmPrivateVirtualInterface. Until then, the virtual interface is in the Confirming state and is not available to handle traffic.
       */
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
    /**
       * Provisions a private virtual interface to be owned by the specified AWS account. Virtual interfaces created using this action must be confirmed by the owner using ConfirmPrivateVirtualInterface. Until then, the virtual interface is in the Confirming state and is not available to handle traffic.
       */
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
    /**
       * Provisions a public virtual interface to be owned by the specified AWS account. The owner of a connection calls this function to provision a public virtual interface to be owned by the specified AWS account. Virtual interfaces created using this function must be confirmed by the owner using ConfirmPublicVirtualInterface. Until this step has been completed, the virtual interface is in the confirming state and is not available to handle traffic. When creating an IPv6 public virtual interface, omit the Amazon address and customer address. IPv6 addresses are automatically assigned from the Amazon pool of IPv6 addresses; you cannot specify custom IPv6 addresses.
       */
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
    /**
       * Provisions a public virtual interface to be owned by the specified AWS account. The owner of a connection calls this function to provision a public virtual interface to be owned by the specified AWS account. Virtual interfaces created using this function must be confirmed by the owner using ConfirmPublicVirtualInterface. Until this step has been completed, the virtual interface is in the confirming state and is not available to handle traffic. When creating an IPv6 public virtual interface, omit the Amazon address and customer address. IPv6 addresses are automatically assigned from the Amazon pool of IPv6 addresses; you cannot specify custom IPv6 addresses.
       */
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
    /**
       * Associates an existing connection with a link aggregation group (LAG). The connection is interrupted and re-established as a member of the LAG (connectivity to AWS is interrupted). The connection must be hosted on the same AWS Direct Connect endpoint as the LAG, and its bandwidth must match the bandwidth for the LAG. You can re-associate a connection that's currently associated with a different LAG; however, if removing the connection would cause the original LAG to fall below its setting for minimum number of operational connections, the request fails. Any virtual interfaces that are directly associated with the connection are automatically re-associated with the LAG. If the connection was originally associated with a different LAG, the virtual interfaces remain associated with the original LAG. For interconnects, any hosted connections are automatically re-associated with the LAG. If the interconnect was originally associated with a different LAG, the hosted connections remain associated with the original LAG.
       */
    def associateConnectionWithLag(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Connection, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Associates an existing connection with a link aggregation group (LAG). The connection is interrupted and re-established as a member of the LAG (connectivity to AWS is interrupted). The connection must be hosted on the same AWS Direct Connect endpoint as the LAG, and its bandwidth must match the bandwidth for the LAG. You can re-associate a connection that's currently associated with a different LAG; however, if removing the connection would cause the original LAG to fall below its setting for minimum number of operational connections, the request fails. Any virtual interfaces that are directly associated with the connection are automatically re-associated with the LAG. If the connection was originally associated with a different LAG, the virtual interfaces remain associated with the original LAG. For interconnects, any hosted connections are automatically re-associated with the LAG. If the interconnect was originally associated with a different LAG, the hosted connections remain associated with the original LAG.
       */
    def associateConnectionWithLag(params: AssociateConnectionWithLagRequest): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Associates an existing connection with a link aggregation group (LAG). The connection is interrupted and re-established as a member of the LAG (connectivity to AWS is interrupted). The connection must be hosted on the same AWS Direct Connect endpoint as the LAG, and its bandwidth must match the bandwidth for the LAG. You can re-associate a connection that's currently associated with a different LAG; however, if removing the connection would cause the original LAG to fall below its setting for minimum number of operational connections, the request fails. Any virtual interfaces that are directly associated with the connection are automatically re-associated with the LAG. If the connection was originally associated with a different LAG, the virtual interfaces remain associated with the original LAG. For interconnects, any hosted connections are automatically re-associated with the LAG. If the interconnect was originally associated with a different LAG, the hosted connections remain associated with the original LAG.
       */
    def associateConnectionWithLag(
      params: AssociateConnectionWithLagRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Connection, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Associates a hosted connection and its virtual interfaces with a link aggregation group (LAG) or interconnect. If the target interconnect or LAG has an existing hosted connection with a conflicting VLAN number or IP address, the operation fails. This action temporarily interrupts the hosted connection's connectivity to AWS as it is being migrated.  Intended for use by AWS Direct Connect partners only. 
       */
    def associateHostedConnection(): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Associates a hosted connection and its virtual interfaces with a link aggregation group (LAG) or interconnect. If the target interconnect or LAG has an existing hosted connection with a conflicting VLAN number or IP address, the operation fails. This action temporarily interrupts the hosted connection's connectivity to AWS as it is being migrated.  Intended for use by AWS Direct Connect partners only. 
       */
    def associateHostedConnection(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Connection, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Associates a hosted connection and its virtual interfaces with a link aggregation group (LAG) or interconnect. If the target interconnect or LAG has an existing hosted connection with a conflicting VLAN number or IP address, the operation fails. This action temporarily interrupts the hosted connection's connectivity to AWS as it is being migrated.  Intended for use by AWS Direct Connect partners only. 
       */
    def associateHostedConnection(params: AssociateHostedConnectionRequest): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Associates a hosted connection and its virtual interfaces with a link aggregation group (LAG) or interconnect. If the target interconnect or LAG has an existing hosted connection with a conflicting VLAN number or IP address, the operation fails. This action temporarily interrupts the hosted connection's connectivity to AWS as it is being migrated.  Intended for use by AWS Direct Connect partners only. 
       */
    def associateHostedConnection(
      params: AssociateHostedConnectionRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Connection, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Associates a virtual interface with a specified link aggregation group (LAG) or connection. Connectivity to AWS is temporarily interrupted as the virtual interface is being migrated. If the target connection or LAG has an associated virtual interface with a conflicting VLAN number or a conflicting IP address, the operation fails. Virtual interfaces associated with a hosted connection cannot be associated with a LAG; hosted connections must be migrated along with their virtual interfaces using AssociateHostedConnection. To reassociate a virtual interface to a new connection or LAG, the requester must own either the virtual interface itself or the connection to which the virtual interface is currently associated. Additionally, the requester must own the connection or LAG for the association.
       */
    def associateVirtualInterface(): awsDashSdkLib.libRequestMod.Request[VirtualInterface, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Associates a virtual interface with a specified link aggregation group (LAG) or connection. Connectivity to AWS is temporarily interrupted as the virtual interface is being migrated. If the target connection or LAG has an associated virtual interface with a conflicting VLAN number or a conflicting IP address, the operation fails. Virtual interfaces associated with a hosted connection cannot be associated with a LAG; hosted connections must be migrated along with their virtual interfaces using AssociateHostedConnection. To reassociate a virtual interface to a new connection or LAG, the requester must own either the virtual interface itself or the connection to which the virtual interface is currently associated. Additionally, the requester must own the connection or LAG for the association.
       */
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
    /**
       * Associates a virtual interface with a specified link aggregation group (LAG) or connection. Connectivity to AWS is temporarily interrupted as the virtual interface is being migrated. If the target connection or LAG has an associated virtual interface with a conflicting VLAN number or a conflicting IP address, the operation fails. Virtual interfaces associated with a hosted connection cannot be associated with a LAG; hosted connections must be migrated along with their virtual interfaces using AssociateHostedConnection. To reassociate a virtual interface to a new connection or LAG, the requester must own either the virtual interface itself or the connection to which the virtual interface is currently associated. Additionally, the requester must own the connection or LAG for the association.
       */
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
    /**
       * Confirms the creation of the specified hosted connection on an interconnect. Upon creation, the hosted connection is initially in the Ordering state, and remains in this state until the owner confirms creation of the hosted connection.
       */
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
    /**
       * Confirms the creation of the specified hosted connection on an interconnect. Upon creation, the hosted connection is initially in the Ordering state, and remains in this state until the owner confirms creation of the hosted connection.
       */
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
    /**
       * Accepts ownership of a private virtual interface created by another AWS account. After the virtual interface owner makes this call, the virtual interface is created and attached to the specified virtual private gateway or Direct Connect gateway, and is made available to handle traffic.
       */
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
    /**
       * Accepts ownership of a private virtual interface created by another AWS account. After the virtual interface owner makes this call, the virtual interface is created and attached to the specified virtual private gateway or Direct Connect gateway, and is made available to handle traffic.
       */
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
    /**
       * Accepts ownership of a public virtual interface created by another AWS account. After the virtual interface owner makes this call, the specified virtual interface is created and made available to handle traffic.
       */
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
    /**
       * Accepts ownership of a public virtual interface created by another AWS account. After the virtual interface owner makes this call, the specified virtual interface is created and made available to handle traffic.
       */
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
    /**
       * Creates a BGP peer on the specified virtual interface. You must create a BGP peer for the corresponding address family (IPv4/IPv6) in order to access AWS resources that also use that address family. If logical redundancy is not supported by the connection, interconnect, or LAG, the BGP peer cannot be in the same address family as an existing BGP peer on the virtual interface. When creating a IPv6 BGP peer, omit the Amazon address and customer address. IPv6 addresses are automatically assigned from the Amazon pool of IPv6 addresses; you cannot specify custom IPv6 addresses. For a public virtual interface, the Autonomous System Number (ASN) must be private or already whitelisted for the virtual interface.
       */
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
    /**
       * Creates a BGP peer on the specified virtual interface. You must create a BGP peer for the corresponding address family (IPv4/IPv6) in order to access AWS resources that also use that address family. If logical redundancy is not supported by the connection, interconnect, or LAG, the BGP peer cannot be in the same address family as an existing BGP peer on the virtual interface. When creating a IPv6 BGP peer, omit the Amazon address and customer address. IPv6 addresses are automatically assigned from the Amazon pool of IPv6 addresses; you cannot specify custom IPv6 addresses. For a public virtual interface, the Autonomous System Number (ASN) must be private or already whitelisted for the virtual interface.
       */
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
    /**
       * Creates a connection between a customer network and a specific AWS Direct Connect location. A connection links your internal network to an AWS Direct Connect location over a standard Ethernet fiber-optic cable. One end of the cable is connected to your router, the other to an AWS Direct Connect router. To find the locations for your Region, use DescribeLocations. You can automatically add the new connection to a link aggregation group (LAG) by specifying a LAG ID in the request. This ensures that the new connection is allocated on the same AWS Direct Connect endpoint that hosts the specified LAG. If there are no available ports on the endpoint, the request fails and no connection is created.
       */
    def createConnection(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Connection, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a connection between a customer network and a specific AWS Direct Connect location. A connection links your internal network to an AWS Direct Connect location over a standard Ethernet fiber-optic cable. One end of the cable is connected to your router, the other to an AWS Direct Connect router. To find the locations for your Region, use DescribeLocations. You can automatically add the new connection to a link aggregation group (LAG) by specifying a LAG ID in the request. This ensures that the new connection is allocated on the same AWS Direct Connect endpoint that hosts the specified LAG. If there are no available ports on the endpoint, the request fails and no connection is created.
       */
    def createConnection(params: CreateConnectionRequest): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a connection between a customer network and a specific AWS Direct Connect location. A connection links your internal network to an AWS Direct Connect location over a standard Ethernet fiber-optic cable. One end of the cable is connected to your router, the other to an AWS Direct Connect router. To find the locations for your Region, use DescribeLocations. You can automatically add the new connection to a link aggregation group (LAG) by specifying a LAG ID in the request. This ensures that the new connection is allocated on the same AWS Direct Connect endpoint that hosts the specified LAG. If there are no available ports on the endpoint, the request fails and no connection is created.
       */
    def createConnection(
      params: CreateConnectionRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Connection, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a Direct Connect gateway, which is an intermediate object that enables you to connect a set of virtual interfaces and virtual private gateways. A Direct Connect gateway is global and visible in any AWS Region after it is created. The virtual interfaces and virtual private gateways that are connected through a Direct Connect gateway can be in different AWS Regions. This enables you to connect to a VPC in any Region, regardless of the Region in which the virtual interfaces are located, and pass traffic between them.
       */
    def createDirectConnectGateway(): awsDashSdkLib.libRequestMod.Request[CreateDirectConnectGatewayResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a Direct Connect gateway, which is an intermediate object that enables you to connect a set of virtual interfaces and virtual private gateways. A Direct Connect gateway is global and visible in any AWS Region after it is created. The virtual interfaces and virtual private gateways that are connected through a Direct Connect gateway can be in different AWS Regions. This enables you to connect to a VPC in any Region, regardless of the Region in which the virtual interfaces are located, and pass traffic between them.
       */
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
    /**
       * Creates a Direct Connect gateway, which is an intermediate object that enables you to connect a set of virtual interfaces and virtual private gateways. A Direct Connect gateway is global and visible in any AWS Region after it is created. The virtual interfaces and virtual private gateways that are connected through a Direct Connect gateway can be in different AWS Regions. This enables you to connect to a VPC in any Region, regardless of the Region in which the virtual interfaces are located, and pass traffic between them.
       */
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
    /**
       * Creates an association between a Direct Connect gateway and a virtual private gateway. The virtual private gateway must be attached to a VPC and must not be associated with another Direct Connect gateway.
       */
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
    /**
       * Creates an association between a Direct Connect gateway and a virtual private gateway. The virtual private gateway must be attached to a VPC and must not be associated with another Direct Connect gateway.
       */
    def createDirectConnectGatewayAssociation(
      params: CreateDirectConnectGatewayAssociationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDirectConnectGatewayAssociationResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDirectConnectGatewayAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an interconnect between an AWS Direct Connect partner's network and a specific AWS Direct Connect location. An interconnect is a connection which is capable of hosting other connections. The partner can use an interconnect to provide sub-1Gbps AWS Direct Connect service to tier 2 customers who do not have their own connections. Like a standard connection, an interconnect links the partner's network to an AWS Direct Connect location over a standard Ethernet fiber-optic cable. One end is connected to the partner's router, the other to an AWS Direct Connect router. You can automatically add the new interconnect to a link aggregation group (LAG) by specifying a LAG ID in the request. This ensures that the new interconnect is allocated on the same AWS Direct Connect endpoint that hosts the specified LAG. If there are no available ports on the endpoint, the request fails and no interconnect is created. For each end customer, the AWS Direct Connect partner provisions a connection on their interconnect by calling AllocateConnectionOnInterconnect. The end customer can then connect to AWS resources by creating a virtual interface on their connection, using the VLAN assigned to them by the partner.  Intended for use by AWS Direct Connect partners only. 
       */
    def createInterconnect(): awsDashSdkLib.libRequestMod.Request[Interconnect, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an interconnect between an AWS Direct Connect partner's network and a specific AWS Direct Connect location. An interconnect is a connection which is capable of hosting other connections. The partner can use an interconnect to provide sub-1Gbps AWS Direct Connect service to tier 2 customers who do not have their own connections. Like a standard connection, an interconnect links the partner's network to an AWS Direct Connect location over a standard Ethernet fiber-optic cable. One end is connected to the partner's router, the other to an AWS Direct Connect router. You can automatically add the new interconnect to a link aggregation group (LAG) by specifying a LAG ID in the request. This ensures that the new interconnect is allocated on the same AWS Direct Connect endpoint that hosts the specified LAG. If there are no available ports on the endpoint, the request fails and no interconnect is created. For each end customer, the AWS Direct Connect partner provisions a connection on their interconnect by calling AllocateConnectionOnInterconnect. The end customer can then connect to AWS resources by creating a virtual interface on their connection, using the VLAN assigned to them by the partner.  Intended for use by AWS Direct Connect partners only. 
       */
    def createInterconnect(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Interconnect, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Interconnect, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an interconnect between an AWS Direct Connect partner's network and a specific AWS Direct Connect location. An interconnect is a connection which is capable of hosting other connections. The partner can use an interconnect to provide sub-1Gbps AWS Direct Connect service to tier 2 customers who do not have their own connections. Like a standard connection, an interconnect links the partner's network to an AWS Direct Connect location over a standard Ethernet fiber-optic cable. One end is connected to the partner's router, the other to an AWS Direct Connect router. You can automatically add the new interconnect to a link aggregation group (LAG) by specifying a LAG ID in the request. This ensures that the new interconnect is allocated on the same AWS Direct Connect endpoint that hosts the specified LAG. If there are no available ports on the endpoint, the request fails and no interconnect is created. For each end customer, the AWS Direct Connect partner provisions a connection on their interconnect by calling AllocateConnectionOnInterconnect. The end customer can then connect to AWS resources by creating a virtual interface on their connection, using the VLAN assigned to them by the partner.  Intended for use by AWS Direct Connect partners only. 
       */
    def createInterconnect(params: CreateInterconnectRequest): awsDashSdkLib.libRequestMod.Request[Interconnect, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an interconnect between an AWS Direct Connect partner's network and a specific AWS Direct Connect location. An interconnect is a connection which is capable of hosting other connections. The partner can use an interconnect to provide sub-1Gbps AWS Direct Connect service to tier 2 customers who do not have their own connections. Like a standard connection, an interconnect links the partner's network to an AWS Direct Connect location over a standard Ethernet fiber-optic cable. One end is connected to the partner's router, the other to an AWS Direct Connect router. You can automatically add the new interconnect to a link aggregation group (LAG) by specifying a LAG ID in the request. This ensures that the new interconnect is allocated on the same AWS Direct Connect endpoint that hosts the specified LAG. If there are no available ports on the endpoint, the request fails and no interconnect is created. For each end customer, the AWS Direct Connect partner provisions a connection on their interconnect by calling AllocateConnectionOnInterconnect. The end customer can then connect to AWS resources by creating a virtual interface on their connection, using the VLAN assigned to them by the partner.  Intended for use by AWS Direct Connect partners only. 
       */
    def createInterconnect(
      params: CreateInterconnectRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Interconnect, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Interconnect, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a link aggregation group (LAG) with the specified number of bundled physical connections between the customer network and a specific AWS Direct Connect location. A LAG is a logical interface that uses the Link Aggregation Control Protocol (LACP) to aggregate multiple interfaces, enabling you to treat them as a single interface. All connections in a LAG must use the same bandwidth and must terminate at the same AWS Direct Connect endpoint. You can have up to 10 connections per LAG. Regardless of this limit, if you request more connections for the LAG than AWS Direct Connect can allocate on a single endpoint, no LAG is created. You can specify an existing physical connection or interconnect to include in the LAG (which counts towards the total number of connections). Doing so interrupts the current physical connection or hosted connections, and re-establishes them as a member of the LAG. The LAG will be created on the same AWS Direct Connect endpoint to which the connection terminates. Any virtual interfaces associated with the connection are automatically disassociated and re-associated with the LAG. The connection ID does not change. If the AWS account used to create a LAG is a registered AWS Direct Connect partner, the LAG is automatically enabled to host sub-connections. For a LAG owned by a partner, any associated virtual interfaces cannot be directly configured.
       */
    def createLag(): awsDashSdkLib.libRequestMod.Request[Lag, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a link aggregation group (LAG) with the specified number of bundled physical connections between the customer network and a specific AWS Direct Connect location. A LAG is a logical interface that uses the Link Aggregation Control Protocol (LACP) to aggregate multiple interfaces, enabling you to treat them as a single interface. All connections in a LAG must use the same bandwidth and must terminate at the same AWS Direct Connect endpoint. You can have up to 10 connections per LAG. Regardless of this limit, if you request more connections for the LAG than AWS Direct Connect can allocate on a single endpoint, no LAG is created. You can specify an existing physical connection or interconnect to include in the LAG (which counts towards the total number of connections). Doing so interrupts the current physical connection or hosted connections, and re-establishes them as a member of the LAG. The LAG will be created on the same AWS Direct Connect endpoint to which the connection terminates. Any virtual interfaces associated with the connection are automatically disassociated and re-associated with the LAG. The connection ID does not change. If the AWS account used to create a LAG is a registered AWS Direct Connect partner, the LAG is automatically enabled to host sub-connections. For a LAG owned by a partner, any associated virtual interfaces cannot be directly configured.
       */
    def createLag(callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Lag, scala.Unit]): awsDashSdkLib.libRequestMod.Request[Lag, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a link aggregation group (LAG) with the specified number of bundled physical connections between the customer network and a specific AWS Direct Connect location. A LAG is a logical interface that uses the Link Aggregation Control Protocol (LACP) to aggregate multiple interfaces, enabling you to treat them as a single interface. All connections in a LAG must use the same bandwidth and must terminate at the same AWS Direct Connect endpoint. You can have up to 10 connections per LAG. Regardless of this limit, if you request more connections for the LAG than AWS Direct Connect can allocate on a single endpoint, no LAG is created. You can specify an existing physical connection or interconnect to include in the LAG (which counts towards the total number of connections). Doing so interrupts the current physical connection or hosted connections, and re-establishes them as a member of the LAG. The LAG will be created on the same AWS Direct Connect endpoint to which the connection terminates. Any virtual interfaces associated with the connection are automatically disassociated and re-associated with the LAG. The connection ID does not change. If the AWS account used to create a LAG is a registered AWS Direct Connect partner, the LAG is automatically enabled to host sub-connections. For a LAG owned by a partner, any associated virtual interfaces cannot be directly configured.
       */
    def createLag(params: CreateLagRequest): awsDashSdkLib.libRequestMod.Request[Lag, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a link aggregation group (LAG) with the specified number of bundled physical connections between the customer network and a specific AWS Direct Connect location. A LAG is a logical interface that uses the Link Aggregation Control Protocol (LACP) to aggregate multiple interfaces, enabling you to treat them as a single interface. All connections in a LAG must use the same bandwidth and must terminate at the same AWS Direct Connect endpoint. You can have up to 10 connections per LAG. Regardless of this limit, if you request more connections for the LAG than AWS Direct Connect can allocate on a single endpoint, no LAG is created. You can specify an existing physical connection or interconnect to include in the LAG (which counts towards the total number of connections). Doing so interrupts the current physical connection or hosted connections, and re-establishes them as a member of the LAG. The LAG will be created on the same AWS Direct Connect endpoint to which the connection terminates. Any virtual interfaces associated with the connection are automatically disassociated and re-associated with the LAG. The connection ID does not change. If the AWS account used to create a LAG is a registered AWS Direct Connect partner, the LAG is automatically enabled to host sub-connections. For a LAG owned by a partner, any associated virtual interfaces cannot be directly configured.
       */
    def createLag(
      params: CreateLagRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Lag, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Lag, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a private virtual interface. A virtual interface is the VLAN that transports AWS Direct Connect traffic. A private virtual interface can be connected to either a Direct Connect gateway or a Virtual Private Gateway (VGW). Connecting the private virtual interface to a Direct Connect gateway enables the possibility for connecting to multiple VPCs, including VPCs in different AWS Regions. Connecting the private virtual interface to a VGW only provides access to a single VPC within the same Region.
       */
    def createPrivateVirtualInterface(): awsDashSdkLib.libRequestMod.Request[VirtualInterface, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a private virtual interface. A virtual interface is the VLAN that transports AWS Direct Connect traffic. A private virtual interface can be connected to either a Direct Connect gateway or a Virtual Private Gateway (VGW). Connecting the private virtual interface to a Direct Connect gateway enables the possibility for connecting to multiple VPCs, including VPCs in different AWS Regions. Connecting the private virtual interface to a VGW only provides access to a single VPC within the same Region.
       */
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
    /**
       * Creates a private virtual interface. A virtual interface is the VLAN that transports AWS Direct Connect traffic. A private virtual interface can be connected to either a Direct Connect gateway or a Virtual Private Gateway (VGW). Connecting the private virtual interface to a Direct Connect gateway enables the possibility for connecting to multiple VPCs, including VPCs in different AWS Regions. Connecting the private virtual interface to a VGW only provides access to a single VPC within the same Region.
       */
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
    /**
       * Creates a public virtual interface. A virtual interface is the VLAN that transports AWS Direct Connect traffic. A public virtual interface supports sending traffic to public services of AWS such as Amazon S3. When creating an IPv6 public virtual interface (addressFamily is ipv6), leave the customer and amazon address fields blank to use auto-assigned IPv6 space. Custom IPv6 addresses are not supported.
       */
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
    /**
       * Creates a public virtual interface. A virtual interface is the VLAN that transports AWS Direct Connect traffic. A public virtual interface supports sending traffic to public services of AWS such as Amazon S3. When creating an IPv6 public virtual interface (addressFamily is ipv6), leave the customer and amazon address fields blank to use auto-assigned IPv6 space. Custom IPv6 addresses are not supported.
       */
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
    /**
       * Deletes the specified BGP peer on the specified virtual interface with the specified customer address and ASN. You cannot delete the last BGP peer from a virtual interface.
       */
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
    /**
       * Deletes the specified BGP peer on the specified virtual interface with the specified customer address and ASN. You cannot delete the last BGP peer from a virtual interface.
       */
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
    /**
       * Deletes the specified connection. Deleting a connection only stops the AWS Direct Connect port hour and data transfer charges. If you are partnering with any third parties to connect with the AWS Direct Connect location, you must cancel your service with them separately.
       */
    def deleteConnection(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Connection, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified connection. Deleting a connection only stops the AWS Direct Connect port hour and data transfer charges. If you are partnering with any third parties to connect with the AWS Direct Connect location, you must cancel your service with them separately.
       */
    def deleteConnection(params: DeleteConnectionRequest): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified connection. Deleting a connection only stops the AWS Direct Connect port hour and data transfer charges. If you are partnering with any third parties to connect with the AWS Direct Connect location, you must cancel your service with them separately.
       */
    def deleteConnection(
      params: DeleteConnectionRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Connection, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified Direct Connect gateway. You must first delete all virtual interfaces that are attached to the Direct Connect gateway and disassociate all virtual private gateways that are associated with the Direct Connect gateway.
       */
    def deleteDirectConnectGateway(): awsDashSdkLib.libRequestMod.Request[DeleteDirectConnectGatewayResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified Direct Connect gateway. You must first delete all virtual interfaces that are attached to the Direct Connect gateway and disassociate all virtual private gateways that are associated with the Direct Connect gateway.
       */
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
    /**
       * Deletes the specified Direct Connect gateway. You must first delete all virtual interfaces that are attached to the Direct Connect gateway and disassociate all virtual private gateways that are associated with the Direct Connect gateway.
       */
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
    /**
       * Deletes the association between the specified Direct Connect gateway and virtual private gateway.
       */
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
    /**
       * Deletes the association between the specified Direct Connect gateway and virtual private gateway.
       */
    def deleteDirectConnectGatewayAssociation(
      params: DeleteDirectConnectGatewayAssociationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDirectConnectGatewayAssociationResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDirectConnectGatewayAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified interconnect.  Intended for use by AWS Direct Connect partners only. 
       */
    def deleteInterconnect(): awsDashSdkLib.libRequestMod.Request[DeleteInterconnectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified interconnect.  Intended for use by AWS Direct Connect partners only. 
       */
    def deleteInterconnect(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteInterconnectResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteInterconnectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified interconnect.  Intended for use by AWS Direct Connect partners only. 
       */
    def deleteInterconnect(params: DeleteInterconnectRequest): awsDashSdkLib.libRequestMod.Request[DeleteInterconnectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified interconnect.  Intended for use by AWS Direct Connect partners only. 
       */
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
    /**
       * Deletes the specified link aggregation group (LAG). You cannot delete a LAG if it has active virtual interfaces or hosted connections.
       */
    def deleteLag(callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Lag, scala.Unit]): awsDashSdkLib.libRequestMod.Request[Lag, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified link aggregation group (LAG). You cannot delete a LAG if it has active virtual interfaces or hosted connections.
       */
    def deleteLag(params: DeleteLagRequest): awsDashSdkLib.libRequestMod.Request[Lag, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified link aggregation group (LAG). You cannot delete a LAG if it has active virtual interfaces or hosted connections.
       */
    def deleteLag(
      params: DeleteLagRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Lag, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Lag, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a virtual interface.
       */
    def deleteVirtualInterface(): awsDashSdkLib.libRequestMod.Request[DeleteVirtualInterfaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a virtual interface.
       */
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
    /**
       * Deletes a virtual interface.
       */
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
    /**
       * Deprecated. Use DescribeLoa instead. Gets the LOA-CFA for a connection. The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that your APN partner or service provider uses when establishing your cross connect to AWS at the colocation facility. For more information, see Requesting Cross Connects at AWS Direct Connect Locations in the AWS Direct Connect User Guide.
       */
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
    /**
       * Deprecated. Use DescribeLoa instead. Gets the LOA-CFA for a connection. The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that your APN partner or service provider uses when establishing your cross connect to AWS at the colocation facility. For more information, see Requesting Cross Connects at AWS Direct Connect Locations in the AWS Direct Connect User Guide.
       */
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
    /**
       * Displays the specified connection or all connections in this Region.
       */
    def describeConnections(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Connections, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Connections, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Displays the specified connection or all connections in this Region.
       */
    def describeConnections(params: DescribeConnectionsRequest): awsDashSdkLib.libRequestMod.Request[Connections, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Displays the specified connection or all connections in this Region.
       */
    def describeConnections(
      params: DescribeConnectionsRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Connections, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Connections, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deprecated. Use DescribeHostedConnections instead. Lists the connections that have been provisioned on the specified interconnect.  Intended for use by AWS Direct Connect partners only. 
       */
    def describeConnectionsOnInterconnect(): awsDashSdkLib.libRequestMod.Request[Connections, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deprecated. Use DescribeHostedConnections instead. Lists the connections that have been provisioned on the specified interconnect.  Intended for use by AWS Direct Connect partners only. 
       */
    def describeConnectionsOnInterconnect(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Connections, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Connections, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deprecated. Use DescribeHostedConnections instead. Lists the connections that have been provisioned on the specified interconnect.  Intended for use by AWS Direct Connect partners only. 
       */
    def describeConnectionsOnInterconnect(params: DescribeConnectionsOnInterconnectRequest): awsDashSdkLib.libRequestMod.Request[Connections, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deprecated. Use DescribeHostedConnections instead. Lists the connections that have been provisioned on the specified interconnect.  Intended for use by AWS Direct Connect partners only. 
       */
    def describeConnectionsOnInterconnect(
      params: DescribeConnectionsOnInterconnectRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Connections, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Connections, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the associations between your Direct Connect gateways and virtual private gateways. You must specify a Direct Connect gateway, a virtual private gateway, or both. If you specify a Direct Connect gateway, the response contains all virtual private gateways associated with the Direct Connect gateway. If you specify a virtual private gateway, the response contains all Direct Connect gateways associated with the virtual private gateway. If you specify both, the response contains the association between the Direct Connect gateway and the virtual private gateway.
       */
    def describeDirectConnectGatewayAssociations(): awsDashSdkLib.libRequestMod.Request[DescribeDirectConnectGatewayAssociationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the associations between your Direct Connect gateways and virtual private gateways. You must specify a Direct Connect gateway, a virtual private gateway, or both. If you specify a Direct Connect gateway, the response contains all virtual private gateways associated with the Direct Connect gateway. If you specify a virtual private gateway, the response contains all Direct Connect gateways associated with the virtual private gateway. If you specify both, the response contains the association between the Direct Connect gateway and the virtual private gateway.
       */
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
    /**
       * Lists the associations between your Direct Connect gateways and virtual private gateways. You must specify a Direct Connect gateway, a virtual private gateway, or both. If you specify a Direct Connect gateway, the response contains all virtual private gateways associated with the Direct Connect gateway. If you specify a virtual private gateway, the response contains all Direct Connect gateways associated with the virtual private gateway. If you specify both, the response contains the association between the Direct Connect gateway and the virtual private gateway.
       */
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
    /**
       * Lists the attachments between your Direct Connect gateways and virtual interfaces. You must specify a Direct Connect gateway, a virtual interface, or both. If you specify a Direct Connect gateway, the response contains all virtual interfaces attached to the Direct Connect gateway. If you specify a virtual interface, the response contains all Direct Connect gateways attached to the virtual interface. If you specify both, the response contains the attachment between the Direct Connect gateway and the virtual interface.
       */
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
    /**
       * Lists the attachments between your Direct Connect gateways and virtual interfaces. You must specify a Direct Connect gateway, a virtual interface, or both. If you specify a Direct Connect gateway, the response contains all virtual interfaces attached to the Direct Connect gateway. If you specify a virtual interface, the response contains all Direct Connect gateways attached to the virtual interface. If you specify both, the response contains the attachment between the Direct Connect gateway and the virtual interface.
       */
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
    /**
       * Lists all your Direct Connect gateways or only the specified Direct Connect gateway. Deleted Direct Connect gateways are not returned.
       */
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
    /**
       * Lists all your Direct Connect gateways or only the specified Direct Connect gateway. Deleted Direct Connect gateways are not returned.
       */
    def describeDirectConnectGateways(
      params: DescribeDirectConnectGatewaysRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDirectConnectGatewaysResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDirectConnectGatewaysResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the hosted connections that have been provisioned on the specified interconnect or link aggregation group (LAG).  Intended for use by AWS Direct Connect partners only. 
       */
    def describeHostedConnections(): awsDashSdkLib.libRequestMod.Request[Connections, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the hosted connections that have been provisioned on the specified interconnect or link aggregation group (LAG).  Intended for use by AWS Direct Connect partners only. 
       */
    def describeHostedConnections(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Connections, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Connections, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the hosted connections that have been provisioned on the specified interconnect or link aggregation group (LAG).  Intended for use by AWS Direct Connect partners only. 
       */
    def describeHostedConnections(params: DescribeHostedConnectionsRequest): awsDashSdkLib.libRequestMod.Request[Connections, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the hosted connections that have been provisioned on the specified interconnect or link aggregation group (LAG).  Intended for use by AWS Direct Connect partners only. 
       */
    def describeHostedConnections(
      params: DescribeHostedConnectionsRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Connections, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Connections, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deprecated. Use DescribeLoa instead. Gets the LOA-CFA for the specified interconnect. The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that is used when establishing your cross connect to AWS at the colocation facility. For more information, see Requesting Cross Connects at AWS Direct Connect Locations in the AWS Direct Connect User Guide.
       */
    def describeInterconnectLoa(): awsDashSdkLib.libRequestMod.Request[DescribeInterconnectLoaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deprecated. Use DescribeLoa instead. Gets the LOA-CFA for the specified interconnect. The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that is used when establishing your cross connect to AWS at the colocation facility. For more information, see Requesting Cross Connects at AWS Direct Connect Locations in the AWS Direct Connect User Guide.
       */
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
    /**
       * Deprecated. Use DescribeLoa instead. Gets the LOA-CFA for the specified interconnect. The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that is used when establishing your cross connect to AWS at the colocation facility. For more information, see Requesting Cross Connects at AWS Direct Connect Locations in the AWS Direct Connect User Guide.
       */
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
    /**
       * Lists the interconnects owned by the AWS account or only the specified interconnect.
       */
    def describeInterconnects(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Interconnects, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Interconnects, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the interconnects owned by the AWS account or only the specified interconnect.
       */
    def describeInterconnects(params: DescribeInterconnectsRequest): awsDashSdkLib.libRequestMod.Request[Interconnects, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the interconnects owned by the AWS account or only the specified interconnect.
       */
    def describeInterconnects(
      params: DescribeInterconnectsRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Interconnects, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Interconnects, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes all your link aggregation groups (LAG) or the specified LAG.
       */
    def describeLags(): awsDashSdkLib.libRequestMod.Request[Lags, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes all your link aggregation groups (LAG) or the specified LAG.
       */
    def describeLags(callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Lags, scala.Unit]): awsDashSdkLib.libRequestMod.Request[Lags, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes all your link aggregation groups (LAG) or the specified LAG.
       */
    def describeLags(params: DescribeLagsRequest): awsDashSdkLib.libRequestMod.Request[Lags, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes all your link aggregation groups (LAG) or the specified LAG.
       */
    def describeLags(
      params: DescribeLagsRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Lags, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Lags, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets the LOA-CFA for a connection, interconnect, or link aggregation group (LAG). The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that is used when establishing your cross connect to AWS at the colocation facility. For more information, see Requesting Cross Connects at AWS Direct Connect Locations in the AWS Direct Connect User Guide.
       */
    def describeLoa(): awsDashSdkLib.libRequestMod.Request[Loa, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets the LOA-CFA for a connection, interconnect, or link aggregation group (LAG). The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that is used when establishing your cross connect to AWS at the colocation facility. For more information, see Requesting Cross Connects at AWS Direct Connect Locations in the AWS Direct Connect User Guide.
       */
    def describeLoa(callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Loa, scala.Unit]): awsDashSdkLib.libRequestMod.Request[Loa, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets the LOA-CFA for a connection, interconnect, or link aggregation group (LAG). The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that is used when establishing your cross connect to AWS at the colocation facility. For more information, see Requesting Cross Connects at AWS Direct Connect Locations in the AWS Direct Connect User Guide.
       */
    def describeLoa(params: DescribeLoaRequest): awsDashSdkLib.libRequestMod.Request[Loa, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets the LOA-CFA for a connection, interconnect, or link aggregation group (LAG). The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that is used when establishing your cross connect to AWS at the colocation facility. For more information, see Requesting Cross Connects at AWS Direct Connect Locations in the AWS Direct Connect User Guide.
       */
    def describeLoa(
      params: DescribeLoaRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Loa, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Loa, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the AWS Direct Connect locations in the current AWS Region. These are the locations that can be selected when calling CreateConnection or CreateInterconnect.
       */
    def describeLocations(): awsDashSdkLib.libRequestMod.Request[Locations, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the AWS Direct Connect locations in the current AWS Region. These are the locations that can be selected when calling CreateConnection or CreateInterconnect.
       */
    def describeLocations(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Locations, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Locations, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the tags associated with the specified AWS Direct Connect resources.
       */
    def describeTags(): awsDashSdkLib.libRequestMod.Request[DescribeTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the tags associated with the specified AWS Direct Connect resources.
       */
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
    /**
       * Describes the tags associated with the specified AWS Direct Connect resources.
       */
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
    /**
       * Lists the virtual private gateways owned by the AWS account. You can create one or more AWS Direct Connect private virtual interfaces linked to a virtual private gateway.
       */
    def describeVirtualGateways(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ VirtualGateways, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[VirtualGateways, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Displays all virtual interfaces for an AWS account. Virtual interfaces deleted fewer than 15 minutes before you make the request are also returned. If you specify a connection ID, only the virtual interfaces associated with the connection are returned. If you specify a virtual interface ID, then only a single virtual interface is returned. A virtual interface (VLAN) transmits the traffic between the AWS Direct Connect location and the customer network.
       */
    def describeVirtualInterfaces(): awsDashSdkLib.libRequestMod.Request[VirtualInterfaces, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Displays all virtual interfaces for an AWS account. Virtual interfaces deleted fewer than 15 minutes before you make the request are also returned. If you specify a connection ID, only the virtual interfaces associated with the connection are returned. If you specify a virtual interface ID, then only a single virtual interface is returned. A virtual interface (VLAN) transmits the traffic between the AWS Direct Connect location and the customer network.
       */
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
    /**
       * Displays all virtual interfaces for an AWS account. Virtual interfaces deleted fewer than 15 minutes before you make the request are also returned. If you specify a connection ID, only the virtual interfaces associated with the connection are returned. If you specify a virtual interface ID, then only a single virtual interface is returned. A virtual interface (VLAN) transmits the traffic between the AWS Direct Connect location and the customer network.
       */
    def describeVirtualInterfaces(
      params: DescribeVirtualInterfacesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ VirtualInterfaces, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[VirtualInterfaces, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disassociates a connection from a link aggregation group (LAG). The connection is interrupted and re-established as a standalone connection (the connection is not deleted; to delete the connection, use the DeleteConnection request). If the LAG has associated virtual interfaces or hosted connections, they remain associated with the LAG. A disassociated connection owned by an AWS Direct Connect partner is automatically converted to an interconnect. If disassociating the connection would cause the LAG to fall below its setting for minimum number of operational connections, the request fails, except when it's the last member of the LAG. If all connections are disassociated, the LAG continues to exist as an empty LAG with no physical connections. 
       */
    def disassociateConnectionFromLag(): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disassociates a connection from a link aggregation group (LAG). The connection is interrupted and re-established as a standalone connection (the connection is not deleted; to delete the connection, use the DeleteConnection request). If the LAG has associated virtual interfaces or hosted connections, they remain associated with the LAG. A disassociated connection owned by an AWS Direct Connect partner is automatically converted to an interconnect. If disassociating the connection would cause the LAG to fall below its setting for minimum number of operational connections, the request fails, except when it's the last member of the LAG. If all connections are disassociated, the LAG continues to exist as an empty LAG with no physical connections. 
       */
    def disassociateConnectionFromLag(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Connection, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disassociates a connection from a link aggregation group (LAG). The connection is interrupted and re-established as a standalone connection (the connection is not deleted; to delete the connection, use the DeleteConnection request). If the LAG has associated virtual interfaces or hosted connections, they remain associated with the LAG. A disassociated connection owned by an AWS Direct Connect partner is automatically converted to an interconnect. If disassociating the connection would cause the LAG to fall below its setting for minimum number of operational connections, the request fails, except when it's the last member of the LAG. If all connections are disassociated, the LAG continues to exist as an empty LAG with no physical connections. 
       */
    def disassociateConnectionFromLag(params: DisassociateConnectionFromLagRequest): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disassociates a connection from a link aggregation group (LAG). The connection is interrupted and re-established as a standalone connection (the connection is not deleted; to delete the connection, use the DeleteConnection request). If the LAG has associated virtual interfaces or hosted connections, they remain associated with the LAG. A disassociated connection owned by an AWS Direct Connect partner is automatically converted to an interconnect. If disassociating the connection would cause the LAG to fall below its setting for minimum number of operational connections, the request fails, except when it's the last member of the LAG. If all connections are disassociated, the LAG continues to exist as an empty LAG with no physical connections. 
       */
    def disassociateConnectionFromLag(
      params: DisassociateConnectionFromLagRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Connection, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Connection, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds the specified tags to the specified AWS Direct Connect resource. Each resource can have a maximum of 50 tags. Each tag consists of a key and an optional value. If a tag with the same key is already associated with the resource, this action updates its value.
       */
    def tagResource(): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds the specified tags to the specified AWS Direct Connect resource. Each resource can have a maximum of 50 tags. Each tag consists of a key and an optional value. If a tag with the same key is already associated with the resource, this action updates its value.
       */
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
    /**
       * Adds the specified tags to the specified AWS Direct Connect resource. Each resource can have a maximum of 50 tags. Each tag consists of a key and an optional value. If a tag with the same key is already associated with the resource, this action updates its value.
       */
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
    /**
       * Removes one or more tags from the specified AWS Direct Connect resource.
       */
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
    /**
       * Removes one or more tags from the specified AWS Direct Connect resource.
       */
    def untagResource(
      params: UntagResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UntagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the attributes of the specified link aggregation group (LAG). You can update the following attributes:   The name of the LAG.   The value for the minimum number of connections that must be operational for the LAG itself to be operational.    When you create a LAG, the default value for the minimum number of operational connections is zero (0). If you update this value and the number of operational connections falls below the specified value, the LAG automatically goes down to avoid over-utilization of the remaining connections. Adjust this value with care, as it could force the LAG down if it is set higher than the current number of operational connections.
       */
    def updateLag(): awsDashSdkLib.libRequestMod.Request[Lag, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the attributes of the specified link aggregation group (LAG). You can update the following attributes:   The name of the LAG.   The value for the minimum number of connections that must be operational for the LAG itself to be operational.    When you create a LAG, the default value for the minimum number of operational connections is zero (0). If you update this value and the number of operational connections falls below the specified value, the LAG automatically goes down to avoid over-utilization of the remaining connections. Adjust this value with care, as it could force the LAG down if it is set higher than the current number of operational connections.
       */
    def updateLag(callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Lag, scala.Unit]): awsDashSdkLib.libRequestMod.Request[Lag, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the attributes of the specified link aggregation group (LAG). You can update the following attributes:   The name of the LAG.   The value for the minimum number of connections that must be operational for the LAG itself to be operational.    When you create a LAG, the default value for the minimum number of operational connections is zero (0). If you update this value and the number of operational connections falls below the specified value, the LAG automatically goes down to avoid over-utilization of the remaining connections. Adjust this value with care, as it could force the LAG down if it is set higher than the current number of operational connections.
       */
    def updateLag(params: UpdateLagRequest): awsDashSdkLib.libRequestMod.Request[Lag, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the attributes of the specified link aggregation group (LAG). You can update the following attributes:   The name of the LAG.   The value for the minimum number of connections that must be operational for the LAG itself to be operational.    When you create a LAG, the default value for the minimum number of operational connections is zero (0). If you update this value and the number of operational connections falls below the specified value, the LAG automatically goes down to avoid over-utilization of the remaining connections. Adjust this value with care, as it could force the LAG down if it is set higher than the current number of operational connections.
       */
    def updateLag(
      params: UpdateLagRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Lag, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Lag, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the specified attributes of the specified virtual private interface. Setting the MTU of a virtual interface to 9001 (jumbo frames) can cause an update to the underlying physical connection if it wasn't updated to support jumbo frames. Updating the connection disrupts network connectivity for all virtual interfaces associated with the connection for up to 30 seconds. To check whether your connection supports jumbo frames, call DescribeConnections. To check whether your virtual interface supports jumbo frames, call DescribeVirtualInterfaces.
       */
    def updateVirtualInterfaceAttributes(): awsDashSdkLib.libRequestMod.Request[VirtualInterface, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the specified attributes of the specified virtual private interface. Setting the MTU of a virtual interface to 9001 (jumbo frames) can cause an update to the underlying physical connection if it wasn't updated to support jumbo frames. Updating the connection disrupts network connectivity for all virtual interfaces associated with the connection for up to 30 seconds. To check whether your connection supports jumbo frames, call DescribeConnections. To check whether your virtual interface supports jumbo frames, call DescribeVirtualInterfaces.
       */
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
    /**
       * Updates the specified attributes of the specified virtual private interface. Setting the MTU of a virtual interface to 9001 (jumbo frames) can cause an update to the underlying physical connection if it wasn't updated to support jumbo frames. Updating the connection disrupts network connectivity for all virtual interfaces associated with the connection for up to 30 seconds. To check whether your connection supports jumbo frames, call DescribeConnections. To check whether your virtual interface supports jumbo frames, call DescribeVirtualInterfaces.
       */
    def updateVirtualInterfaceAttributes(
      params: UpdateVirtualInterfaceAttributesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ VirtualInterface, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[VirtualInterface, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait UntagResourceRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the resource.
         */
    var resourceArn: ResourceArn
    /**
         * The tag keys of the tags to remove.
         */
    var tagKeys: TagKeyList
  }
  
  
  trait UntagResourceResponse extends js.Object
  
  
  trait UpdateLagRequest extends js.Object {
    /**
         * The ID of the LAG.
         */
    var lagId: LagId
    /**
         * The name of the LAG.
         */
    var lagName: js.UndefOr[LagName] = js.undefined
    /**
         * The minimum number of physical connections that must be operational for the LAG itself to be operational.
         */
    var minimumLinks: js.UndefOr[Count] = js.undefined
  }
  
  
  trait UpdateVirtualInterfaceAttributesRequest extends js.Object {
    /**
         * The maximum transmission unit (MTU), in bytes. The supported values are 1500 and 9001. The default value is 1500.
         */
    var mtu: js.UndefOr[MTU] = js.undefined
    /**
         * The ID of the virtual private interface.
         */
    var virtualInterfaceId: VirtualInterfaceId
  }
  
  
  trait VirtualGateway extends js.Object {
    /**
         * The ID of the virtual private gateway.
         */
    var virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.undefined
    /**
         * The state of the virtual private gateway. The following are the possible values:    pending: Initial state after creating the virtual private gateway.    available: Ready for use by a private virtual interface.    deleting: Initial state after deleting the virtual private gateway.    deleted: The virtual private gateway is deleted. The private virtual interface is unable to send traffic over this gateway.  
         */
    var virtualGatewayState: js.UndefOr[VirtualGatewayState] = js.undefined
  }
  
  
  trait VirtualGateways extends js.Object {
    /**
         * The virtual private gateways.
         */
    var virtualGateways: js.UndefOr[VirtualGatewayList] = js.undefined
  }
  
  
  trait VirtualInterface extends js.Object {
    /**
         * The address family for the BGP peer.
         */
    var addressFamily: js.UndefOr[AddressFamily] = js.undefined
    /**
         * The IP address assigned to the Amazon interface.
         */
    var amazonAddress: js.UndefOr[AmazonAddress] = js.undefined
    /**
         * The autonomous system number (ASN) for the Amazon side of the connection.
         */
    var amazonSideAsn: js.UndefOr[LongAsn] = js.undefined
    /**
         * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
         */
    var asn: js.UndefOr[ASN] = js.undefined
    /**
         * The authentication key for BGP configuration.
         */
    var authKey: js.UndefOr[BGPAuthKey] = js.undefined
    /**
         * The Direct Connect endpoint on which the virtual interface terminates.
         */
    var awsDeviceV2: js.UndefOr[AwsDeviceV2] = js.undefined
    /**
         * The BGP peers configured on this virtual interface.
         */
    var bgpPeers: js.UndefOr[BGPPeerList] = js.undefined
    /**
         * The ID of the connection.
         */
    var connectionId: js.UndefOr[ConnectionId] = js.undefined
    /**
         * The IP address assigned to the customer interface.
         */
    var customerAddress: js.UndefOr[CustomerAddress] = js.undefined
    /**
         * The customer router configuration.
         */
    var customerRouterConfig: js.UndefOr[RouterConfig] = js.undefined
    /**
         * The ID of the Direct Connect gateway.
         */
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined
    /**
         * Indicates whether jumbo frames (9001 MTU) are supported.
         */
    var jumboFrameCapable: js.UndefOr[JumboFrameCapable] = js.undefined
    /**
         * The location of the connection.
         */
    var location: js.UndefOr[LocationCode] = js.undefined
    /**
         * The maximum transmission unit (MTU), in bytes. The supported values are 1500 and 9001. The default value is 1500.
         */
    var mtu: js.UndefOr[MTU] = js.undefined
    /**
         * The ID of the AWS account that owns the virtual interface.
         */
    var ownerAccount: js.UndefOr[OwnerAccount] = js.undefined
    /**
         * The AWS Region where the virtual interface is located.
         */
    var region: js.UndefOr[Region] = js.undefined
    /**
         * The routes to be advertised to the AWS network in this Region. Applies to public virtual interfaces.
         */
    var routeFilterPrefixes: js.UndefOr[RouteFilterPrefixList] = js.undefined
    /**
         * The ID of the virtual private gateway. Applies only to private virtual interfaces.
         */
    var virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.undefined
    /**
         * The ID of the virtual interface.
         */
    var virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined
    /**
         * The name of the virtual interface assigned by the customer network.
         */
    var virtualInterfaceName: js.UndefOr[VirtualInterfaceName] = js.undefined
    /**
         * The state of the virtual interface. The following are the possible values:    confirming: The creation of the virtual interface is pending confirmation from the virtual interface owner. If the owner of the virtual interface is different from the owner of the connection on which it is provisioned, then the virtual interface will remain in this state until it is confirmed by the virtual interface owner.    verifying: This state only applies to public virtual interfaces. Each public virtual interface needs validation before the virtual interface can be created.    pending: A virtual interface is in this state from the time that it is created until the virtual interface is ready to forward traffic.    available: A virtual interface that is able to forward traffic.    down: A virtual interface that is BGP down.    deleting: A virtual interface is in this state immediately after calling DeleteVirtualInterface until it can no longer forward traffic.    deleted: A virtual interface that cannot forward traffic.    rejected: The virtual interface owner has declined creation of the virtual interface. If a virtual interface in the Confirming state is deleted by the virtual interface owner, the virtual interface enters the Rejected state.  
         */
    var virtualInterfaceState: js.UndefOr[VirtualInterfaceState] = js.undefined
    /**
         * The type of virtual interface. The possible values are private and public.
         */
    var virtualInterfaceType: js.UndefOr[VirtualInterfaceType] = js.undefined
    /**
         * The ID of the VLAN.
         */
    var vlan: js.UndefOr[VLAN] = js.undefined
  }
  
  
  trait VirtualInterfaces extends js.Object {
    /**
         * The virtual interfaces
         */
    var virtualInterfaces: js.UndefOr[VirtualInterfaceList] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type ASN = scala.Double
  type AddressFamily = awsDashSdkLib.awsDashSdkLibStrings.ipv4 | awsDashSdkLib.awsDashSdkLibStrings.ipv6 | java.lang.String
  type AmazonAddress = java.lang.String
  type AwsDevice = java.lang.String
  type AwsDeviceV2 = java.lang.String
  type BGPAuthKey = java.lang.String
  type BGPPeerId = java.lang.String
  type BGPPeerList = js.Array[BGPPeer]
  type BGPPeerState = awsDashSdkLib.awsDashSdkLibStrings.verifying | awsDashSdkLib.awsDashSdkLibStrings.pending | awsDashSdkLib.awsDashSdkLibStrings.available | awsDashSdkLib.awsDashSdkLibStrings.deleting | awsDashSdkLib.awsDashSdkLibStrings.deleted | java.lang.String
  type BGPStatus = awsDashSdkLib.awsDashSdkLibStrings.up | awsDashSdkLib.awsDashSdkLibStrings.down | java.lang.String
  type Bandwidth = java.lang.String
  type BooleanFlag = scala.Boolean
  type CIDR = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ConnectionId = java.lang.String
  type ConnectionList = js.Array[Connection]
  type ConnectionName = java.lang.String
  type ConnectionState = awsDashSdkLib.awsDashSdkLibStrings.ordering | awsDashSdkLib.awsDashSdkLibStrings.requested | awsDashSdkLib.awsDashSdkLibStrings.pending | awsDashSdkLib.awsDashSdkLibStrings.available | awsDashSdkLib.awsDashSdkLibStrings.down | awsDashSdkLib.awsDashSdkLibStrings.deleting | awsDashSdkLib.awsDashSdkLibStrings.deleted | awsDashSdkLib.awsDashSdkLibStrings.rejected | java.lang.String
  type Count = scala.Double
  type CustomerAddress = java.lang.String
  type DirectConnectGatewayAssociationList = js.Array[DirectConnectGatewayAssociation]
  type DirectConnectGatewayAssociationState = awsDashSdkLib.awsDashSdkLibStrings.associating | awsDashSdkLib.awsDashSdkLibStrings.associated | awsDashSdkLib.awsDashSdkLibStrings.disassociating | awsDashSdkLib.awsDashSdkLibStrings.disassociated | java.lang.String
  type DirectConnectGatewayAttachmentList = js.Array[DirectConnectGatewayAttachment]
  type DirectConnectGatewayAttachmentState = awsDashSdkLib.awsDashSdkLibStrings.attaching | awsDashSdkLib.awsDashSdkLibStrings.attached | awsDashSdkLib.awsDashSdkLibStrings.detaching | awsDashSdkLib.awsDashSdkLibStrings.detached | java.lang.String
  type DirectConnectGatewayId = java.lang.String
  type DirectConnectGatewayList = js.Array[DirectConnectGateway]
  type DirectConnectGatewayName = java.lang.String
  type DirectConnectGatewayState = awsDashSdkLib.awsDashSdkLibStrings.pending | awsDashSdkLib.awsDashSdkLibStrings.available | awsDashSdkLib.awsDashSdkLibStrings.deleting | awsDashSdkLib.awsDashSdkLibStrings.deleted | java.lang.String
  type HasLogicalRedundancy = awsDashSdkLib.awsDashSdkLibStrings.unknown | awsDashSdkLib.awsDashSdkLibStrings.yes | awsDashSdkLib.awsDashSdkLibStrings.no | java.lang.String
  type InterconnectId = java.lang.String
  type InterconnectList = js.Array[Interconnect]
  type InterconnectName = java.lang.String
  type InterconnectState = awsDashSdkLib.awsDashSdkLibStrings.requested | awsDashSdkLib.awsDashSdkLibStrings.pending | awsDashSdkLib.awsDashSdkLibStrings.available | awsDashSdkLib.awsDashSdkLibStrings.down | awsDashSdkLib.awsDashSdkLibStrings.deleting | awsDashSdkLib.awsDashSdkLibStrings.deleted | java.lang.String
  type JumboFrameCapable = scala.Boolean
  type LagId = java.lang.String
  type LagList = js.Array[Lag]
  type LagName = java.lang.String
  type LagState = awsDashSdkLib.awsDashSdkLibStrings.requested | awsDashSdkLib.awsDashSdkLibStrings.pending | awsDashSdkLib.awsDashSdkLibStrings.available | awsDashSdkLib.awsDashSdkLibStrings.down | awsDashSdkLib.awsDashSdkLibStrings.deleting | awsDashSdkLib.awsDashSdkLibStrings.deleted | java.lang.String
  type LoaContent = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsDirectconnectMod.Blob | java.lang.String
  type LoaContentType = awsDashSdkLib.awsDashSdkLibStrings.`application/pdf` | java.lang.String
  type LoaIssueTime = stdLib.Date
  type LocationCode = java.lang.String
  type LocationList = js.Array[Location]
  type LocationName = java.lang.String
  type LongAsn = scala.Double
  type MTU = scala.Double
  type MaxResultSetSize = scala.Double
  type OwnerAccount = java.lang.String
  type PaginationToken = java.lang.String
  type PartnerName = java.lang.String
  type ProviderName = java.lang.String
  type Region = java.lang.String
  type ResourceArn = java.lang.String
  type ResourceArnList = js.Array[ResourceArn]
  type ResourceTagList = js.Array[ResourceTag]
  type RouteFilterPrefixList = js.Array[RouteFilterPrefix]
  type RouterConfig = java.lang.String
  type StateChangeError = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type VLAN = scala.Double
  type VirtualGatewayId = java.lang.String
  type VirtualGatewayList = js.Array[VirtualGateway]
  type VirtualGatewayRegion = java.lang.String
  type VirtualGatewayState = java.lang.String
  type VirtualInterfaceId = java.lang.String
  type VirtualInterfaceList = js.Array[VirtualInterface]
  type VirtualInterfaceName = java.lang.String
  type VirtualInterfaceRegion = java.lang.String
  type VirtualInterfaceState = awsDashSdkLib.awsDashSdkLibStrings.confirming | awsDashSdkLib.awsDashSdkLibStrings.verifying | awsDashSdkLib.awsDashSdkLibStrings.pending | awsDashSdkLib.awsDashSdkLibStrings.available | awsDashSdkLib.awsDashSdkLibStrings.down | awsDashSdkLib.awsDashSdkLibStrings.deleting | awsDashSdkLib.awsDashSdkLibStrings.deleted | awsDashSdkLib.awsDashSdkLibStrings.rejected | java.lang.String
  type VirtualInterfaceType = java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2012-10-25` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

