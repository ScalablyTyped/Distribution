package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsDirectconnectMod {
  import typings.awsDashSdk.awsDashSdkStrings.`application/pdf`
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.std.Date
  import typings.std.Uint8Array

  type ASN = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ipv4
    - typings.awsDashSdk.awsDashSdkStrings.ipv6
    - java.lang.String
  */
  type AddressFamily = _AddressFamily | String
  type AmazonAddress = String
  type AssociatedGatewayId = String
  type AvailablePortSpeeds = js.Array[PortSpeed]
  type AwsDevice = String
  type AwsDeviceV2 = String
  type BGPAuthKey = String
  type BGPPeerId = String
  type BGPPeerList = js.Array[BGPPeer]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.verifying
    - typings.awsDashSdk.awsDashSdkStrings.pending
    - typings.awsDashSdk.awsDashSdkStrings.available
    - typings.awsDashSdk.awsDashSdkStrings.deleting
    - typings.awsDashSdk.awsDashSdkStrings.deleted
    - java.lang.String
  */
  type BGPPeerState = _BGPPeerState | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.up
    - typings.awsDashSdk.awsDashSdkStrings.down
    - typings.awsDashSdk.awsDashSdkStrings.unknown
    - java.lang.String
  */
  type BGPStatus = _BGPStatus | String
  type Bandwidth = String
  type BooleanFlag = Boolean
  type CIDR = String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ConnectionId = String
  type ConnectionList = js.Array[Connection]
  type ConnectionName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ordering
    - typings.awsDashSdk.awsDashSdkStrings.requested
    - typings.awsDashSdk.awsDashSdkStrings.pending
    - typings.awsDashSdk.awsDashSdkStrings.available
    - typings.awsDashSdk.awsDashSdkStrings.down
    - typings.awsDashSdk.awsDashSdkStrings.deleting
    - typings.awsDashSdk.awsDashSdkStrings.deleted
    - typings.awsDashSdk.awsDashSdkStrings.rejected
    - typings.awsDashSdk.awsDashSdkStrings.unknown
    - java.lang.String
  */
  type ConnectionState = _ConnectionState | String
  type Count = Double
  type CustomerAddress = String
  type DirectConnectGatewayAssociationId = String
  type DirectConnectGatewayAssociationList = js.Array[DirectConnectGatewayAssociation]
  type DirectConnectGatewayAssociationProposalId = String
  type DirectConnectGatewayAssociationProposalList = js.Array[DirectConnectGatewayAssociationProposal]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.requested
    - typings.awsDashSdk.awsDashSdkStrings.accepted
    - typings.awsDashSdk.awsDashSdkStrings.deleted
    - java.lang.String
  */
  type DirectConnectGatewayAssociationProposalState = _DirectConnectGatewayAssociationProposalState | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.associating
    - typings.awsDashSdk.awsDashSdkStrings.associated
    - typings.awsDashSdk.awsDashSdkStrings.disassociating
    - typings.awsDashSdk.awsDashSdkStrings.disassociated
    - typings.awsDashSdk.awsDashSdkStrings.updating
    - java.lang.String
  */
  type DirectConnectGatewayAssociationState = _DirectConnectGatewayAssociationState | String
  type DirectConnectGatewayAttachmentList = js.Array[DirectConnectGatewayAttachment]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.attaching
    - typings.awsDashSdk.awsDashSdkStrings.attached
    - typings.awsDashSdk.awsDashSdkStrings.detaching
    - typings.awsDashSdk.awsDashSdkStrings.detached
    - java.lang.String
  */
  type DirectConnectGatewayAttachmentState = _DirectConnectGatewayAttachmentState | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TransitVirtualInterface
    - typings.awsDashSdk.awsDashSdkStrings.PrivateVirtualInterface
    - java.lang.String
  */
  type DirectConnectGatewayAttachmentType = _DirectConnectGatewayAttachmentType | String
  type DirectConnectGatewayId = String
  type DirectConnectGatewayList = js.Array[DirectConnectGateway]
  type DirectConnectGatewayName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.pending
    - typings.awsDashSdk.awsDashSdkStrings.available
    - typings.awsDashSdk.awsDashSdkStrings.deleting
    - typings.awsDashSdk.awsDashSdkStrings.deleted
    - java.lang.String
  */
  type DirectConnectGatewayState = _DirectConnectGatewayState | String
  type GatewayIdToAssociate = String
  type GatewayIdentifier = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.virtualPrivateGateway
    - typings.awsDashSdk.awsDashSdkStrings.transitGateway
    - java.lang.String
  */
  type GatewayType = _GatewayType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.unknown
    - typings.awsDashSdk.awsDashSdkStrings.yes
    - typings.awsDashSdk.awsDashSdkStrings.no
    - java.lang.String
  */
  type HasLogicalRedundancy = _HasLogicalRedundancy | String
  type InterconnectId = String
  type InterconnectList = js.Array[Interconnect]
  type InterconnectName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.requested
    - typings.awsDashSdk.awsDashSdkStrings.pending
    - typings.awsDashSdk.awsDashSdkStrings.available
    - typings.awsDashSdk.awsDashSdkStrings.down
    - typings.awsDashSdk.awsDashSdkStrings.deleting
    - typings.awsDashSdk.awsDashSdkStrings.deleted
    - typings.awsDashSdk.awsDashSdkStrings.unknown
    - java.lang.String
  */
  type InterconnectState = _InterconnectState | String
  type JumboFrameCapable = Boolean
  type LagId = String
  type LagList = js.Array[Lag]
  type LagName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.requested
    - typings.awsDashSdk.awsDashSdkStrings.pending
    - typings.awsDashSdk.awsDashSdkStrings.available
    - typings.awsDashSdk.awsDashSdkStrings.down
    - typings.awsDashSdk.awsDashSdkStrings.deleting
    - typings.awsDashSdk.awsDashSdkStrings.deleted
    - typings.awsDashSdk.awsDashSdkStrings.unknown
    - java.lang.String
  */
  type LagState = _LagState | String
  type LoaContent = Buffer | Uint8Array | Blob | String
  type LoaContentType = `application/pdf` | String
  type LoaIssueTime = Date
  type LocationCode = String
  type LocationList = js.Array[Location]
  type LocationName = String
  type LongAsn = Double
  type MTU = Double
  type MaxResultSetSize = Double
  type OwnerAccount = String
  type PaginationToken = String
  type PartnerName = String
  type PortSpeed = String
  type ProviderName = String
  type Region = String
  type ResourceArn = String
  type ResourceArnList = js.Array[ResourceArn]
  type ResourceTagList = js.Array[ResourceTag]
  type RouteFilterPrefixList = js.Array[RouteFilterPrefix]
  type RouterConfig = String
  type StateChangeError = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type VLAN = Double
  type VirtualGatewayId = String
  type VirtualGatewayList = js.Array[VirtualGateway]
  type VirtualGatewayRegion = String
  type VirtualGatewayState = String
  type VirtualInterfaceId = String
  type VirtualInterfaceList = js.Array[VirtualInterface]
  type VirtualInterfaceName = String
  type VirtualInterfaceRegion = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.confirming
    - typings.awsDashSdk.awsDashSdkStrings.verifying
    - typings.awsDashSdk.awsDashSdkStrings.pending
    - typings.awsDashSdk.awsDashSdkStrings.available
    - typings.awsDashSdk.awsDashSdkStrings.down
    - typings.awsDashSdk.awsDashSdkStrings.deleting
    - typings.awsDashSdk.awsDashSdkStrings.deleted
    - typings.awsDashSdk.awsDashSdkStrings.rejected
    - typings.awsDashSdk.awsDashSdkStrings.unknown
    - java.lang.String
  */
  type VirtualInterfaceState = _VirtualInterfaceState | String
  type VirtualInterfaceType = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2012-10-25`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
