package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsDirectconnectMod {
  import typings.awsDashSdk.awsDashSdkStrings.applicationSlashpdf
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.std.Date
  import typings.std.Uint8Array

  type ASN = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ipv4_
    - typings.awsDashSdk.awsDashSdkStrings.ipv6_
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
    - typings.awsDashSdk.awsDashSdkStrings.verifying__
    - typings.awsDashSdk.awsDashSdkStrings.pending__
    - typings.awsDashSdk.awsDashSdkStrings.available__
    - typings.awsDashSdk.awsDashSdkStrings.deleting__
    - typings.awsDashSdk.awsDashSdkStrings.deleted__
    - java.lang.String
  */
  type BGPPeerState = _BGPPeerState | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.up_
    - typings.awsDashSdk.awsDashSdkStrings.down_
    - typings.awsDashSdk.awsDashSdkStrings.unknown__
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
    - typings.awsDashSdk.awsDashSdkStrings.requested__
    - typings.awsDashSdk.awsDashSdkStrings.pending__
    - typings.awsDashSdk.awsDashSdkStrings.available__
    - typings.awsDashSdk.awsDashSdkStrings.down_
    - typings.awsDashSdk.awsDashSdkStrings.deleting__
    - typings.awsDashSdk.awsDashSdkStrings.deleted__
    - typings.awsDashSdk.awsDashSdkStrings.rejected__
    - typings.awsDashSdk.awsDashSdkStrings.unknown__
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
    - typings.awsDashSdk.awsDashSdkStrings.requested__
    - typings.awsDashSdk.awsDashSdkStrings.accepted__
    - typings.awsDashSdk.awsDashSdkStrings.deleted__
    - java.lang.String
  */
  type DirectConnectGatewayAssociationProposalState = _DirectConnectGatewayAssociationProposalState | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.associating__
    - typings.awsDashSdk.awsDashSdkStrings.associated__
    - typings.awsDashSdk.awsDashSdkStrings.disassociating__
    - typings.awsDashSdk.awsDashSdkStrings.disassociated_
    - typings.awsDashSdk.awsDashSdkStrings.updating__
    - java.lang.String
  */
  type DirectConnectGatewayAssociationState = _DirectConnectGatewayAssociationState | String
  type DirectConnectGatewayAttachmentList = js.Array[DirectConnectGatewayAttachment]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.attaching_
    - typings.awsDashSdk.awsDashSdkStrings.attached_
    - typings.awsDashSdk.awsDashSdkStrings.detaching__
    - typings.awsDashSdk.awsDashSdkStrings.detached__
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
    - typings.awsDashSdk.awsDashSdkStrings.pending__
    - typings.awsDashSdk.awsDashSdkStrings.available__
    - typings.awsDashSdk.awsDashSdkStrings.deleting__
    - typings.awsDashSdk.awsDashSdkStrings.deleted__
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
    - typings.awsDashSdk.awsDashSdkStrings.unknown__
    - typings.awsDashSdk.awsDashSdkStrings.yes_
    - typings.awsDashSdk.awsDashSdkStrings.no_
    - java.lang.String
  */
  type HasLogicalRedundancy = _HasLogicalRedundancy | String
  type InterconnectId = String
  type InterconnectList = js.Array[Interconnect]
  type InterconnectName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.requested__
    - typings.awsDashSdk.awsDashSdkStrings.pending__
    - typings.awsDashSdk.awsDashSdkStrings.available__
    - typings.awsDashSdk.awsDashSdkStrings.down_
    - typings.awsDashSdk.awsDashSdkStrings.deleting__
    - typings.awsDashSdk.awsDashSdkStrings.deleted__
    - typings.awsDashSdk.awsDashSdkStrings.unknown__
    - java.lang.String
  */
  type InterconnectState = _InterconnectState | String
  type JumboFrameCapable = Boolean
  type LagId = String
  type LagList = js.Array[Lag]
  type LagName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.requested__
    - typings.awsDashSdk.awsDashSdkStrings.pending__
    - typings.awsDashSdk.awsDashSdkStrings.available__
    - typings.awsDashSdk.awsDashSdkStrings.down_
    - typings.awsDashSdk.awsDashSdkStrings.deleting__
    - typings.awsDashSdk.awsDashSdkStrings.deleted__
    - typings.awsDashSdk.awsDashSdkStrings.unknown__
    - java.lang.String
  */
  type LagState = _LagState | String
  type LoaContent = Buffer | Uint8Array | Blob | String
  type LoaContentType = applicationSlashpdf | String
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
  type ProviderList = js.Array[ProviderName]
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
    - typings.awsDashSdk.awsDashSdkStrings.verifying__
    - typings.awsDashSdk.awsDashSdkStrings.pending__
    - typings.awsDashSdk.awsDashSdkStrings.available__
    - typings.awsDashSdk.awsDashSdkStrings.down_
    - typings.awsDashSdk.awsDashSdkStrings.deleting__
    - typings.awsDashSdk.awsDashSdkStrings.deleted__
    - typings.awsDashSdk.awsDashSdkStrings.rejected__
    - typings.awsDashSdk.awsDashSdkStrings.unknown__
    - java.lang.String
  */
  type VirtualInterfaceState = _VirtualInterfaceState | String
  type VirtualInterfaceType = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2012-10-25`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
