package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsDirectconnectMod {
  type ASN = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ipv4
    - awsDashSdkLib.awsDashSdkLibStrings.ipv6
    - java.lang.String
  */
  type AddressFamily = _AddressFamily | java.lang.String
  type AmazonAddress = java.lang.String
  type AssociatedGatewayId = java.lang.String
  type AvailablePortSpeeds = js.Array[PortSpeed]
  type AwsDevice = java.lang.String
  type AwsDeviceV2 = java.lang.String
  type BGPAuthKey = java.lang.String
  type BGPPeerId = java.lang.String
  type BGPPeerList = js.Array[BGPPeer]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.verifying
    - awsDashSdkLib.awsDashSdkLibStrings.pending
    - awsDashSdkLib.awsDashSdkLibStrings.available
    - awsDashSdkLib.awsDashSdkLibStrings.deleting
    - awsDashSdkLib.awsDashSdkLibStrings.deleted
    - java.lang.String
  */
  type BGPPeerState = _BGPPeerState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.up
    - awsDashSdkLib.awsDashSdkLibStrings.down
    - awsDashSdkLib.awsDashSdkLibStrings.unknown
    - java.lang.String
  */
  type BGPStatus = _BGPStatus | java.lang.String
  type Bandwidth = java.lang.String
  type BooleanFlag = scala.Boolean
  type CIDR = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ConnectionId = java.lang.String
  type ConnectionList = js.Array[Connection]
  type ConnectionName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ordering
    - awsDashSdkLib.awsDashSdkLibStrings.requested
    - awsDashSdkLib.awsDashSdkLibStrings.pending
    - awsDashSdkLib.awsDashSdkLibStrings.available
    - awsDashSdkLib.awsDashSdkLibStrings.down
    - awsDashSdkLib.awsDashSdkLibStrings.deleting
    - awsDashSdkLib.awsDashSdkLibStrings.deleted
    - awsDashSdkLib.awsDashSdkLibStrings.rejected
    - awsDashSdkLib.awsDashSdkLibStrings.unknown
    - java.lang.String
  */
  type ConnectionState = _ConnectionState | java.lang.String
  type Count = scala.Double
  type CustomerAddress = java.lang.String
  type DirectConnectGatewayAssociationId = java.lang.String
  type DirectConnectGatewayAssociationList = js.Array[DirectConnectGatewayAssociation]
  type DirectConnectGatewayAssociationProposalId = java.lang.String
  type DirectConnectGatewayAssociationProposalList = js.Array[DirectConnectGatewayAssociationProposal]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.requested
    - awsDashSdkLib.awsDashSdkLibStrings.accepted
    - awsDashSdkLib.awsDashSdkLibStrings.deleted
    - java.lang.String
  */
  type DirectConnectGatewayAssociationProposalState = _DirectConnectGatewayAssociationProposalState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.associating
    - awsDashSdkLib.awsDashSdkLibStrings.associated
    - awsDashSdkLib.awsDashSdkLibStrings.disassociating
    - awsDashSdkLib.awsDashSdkLibStrings.disassociated
    - awsDashSdkLib.awsDashSdkLibStrings.updating
    - java.lang.String
  */
  type DirectConnectGatewayAssociationState = _DirectConnectGatewayAssociationState | java.lang.String
  type DirectConnectGatewayAttachmentList = js.Array[DirectConnectGatewayAttachment]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.attaching
    - awsDashSdkLib.awsDashSdkLibStrings.attached
    - awsDashSdkLib.awsDashSdkLibStrings.detaching
    - awsDashSdkLib.awsDashSdkLibStrings.detached
    - java.lang.String
  */
  type DirectConnectGatewayAttachmentState = _DirectConnectGatewayAttachmentState | java.lang.String
  type DirectConnectGatewayId = java.lang.String
  type DirectConnectGatewayList = js.Array[DirectConnectGateway]
  type DirectConnectGatewayName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.pending
    - awsDashSdkLib.awsDashSdkLibStrings.available
    - awsDashSdkLib.awsDashSdkLibStrings.deleting
    - awsDashSdkLib.awsDashSdkLibStrings.deleted
    - java.lang.String
  */
  type DirectConnectGatewayState = _DirectConnectGatewayState | java.lang.String
  type GatewayIdToAssociate = java.lang.String
  type GatewayIdentifier = java.lang.String
  type GatewayType = awsDashSdkLib.awsDashSdkLibStrings.virtualPrivateGateway | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.unknown
    - awsDashSdkLib.awsDashSdkLibStrings.yes
    - awsDashSdkLib.awsDashSdkLibStrings.no
    - java.lang.String
  */
  type HasLogicalRedundancy = _HasLogicalRedundancy | java.lang.String
  type InterconnectId = java.lang.String
  type InterconnectList = js.Array[Interconnect]
  type InterconnectName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.requested
    - awsDashSdkLib.awsDashSdkLibStrings.pending
    - awsDashSdkLib.awsDashSdkLibStrings.available
    - awsDashSdkLib.awsDashSdkLibStrings.down
    - awsDashSdkLib.awsDashSdkLibStrings.deleting
    - awsDashSdkLib.awsDashSdkLibStrings.deleted
    - awsDashSdkLib.awsDashSdkLibStrings.unknown
    - java.lang.String
  */
  type InterconnectState = _InterconnectState | java.lang.String
  type JumboFrameCapable = scala.Boolean
  type LagId = java.lang.String
  type LagList = js.Array[Lag]
  type LagName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.requested
    - awsDashSdkLib.awsDashSdkLibStrings.pending
    - awsDashSdkLib.awsDashSdkLibStrings.available
    - awsDashSdkLib.awsDashSdkLibStrings.down
    - awsDashSdkLib.awsDashSdkLibStrings.deleting
    - awsDashSdkLib.awsDashSdkLibStrings.deleted
    - awsDashSdkLib.awsDashSdkLibStrings.unknown
    - java.lang.String
  */
  type LagState = _LagState | java.lang.String
  type LoaContent = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
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
  type PortSpeed = java.lang.String
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
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.confirming
    - awsDashSdkLib.awsDashSdkLibStrings.verifying
    - awsDashSdkLib.awsDashSdkLibStrings.pending
    - awsDashSdkLib.awsDashSdkLibStrings.available
    - awsDashSdkLib.awsDashSdkLibStrings.down
    - awsDashSdkLib.awsDashSdkLibStrings.deleting
    - awsDashSdkLib.awsDashSdkLibStrings.deleted
    - awsDashSdkLib.awsDashSdkLibStrings.rejected
    - awsDashSdkLib.awsDashSdkLibStrings.unknown
    - java.lang.String
  */
  type VirtualInterfaceState = _VirtualInterfaceState | java.lang.String
  type VirtualInterfaceType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2012-10-25`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
