package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsDirectoryserviceMod {
  type AccessUrl = java.lang.String
  type AddedDateTime = stdLib.Date
  type AliasName = java.lang.String
  type AttributeName = java.lang.String
  type AttributeValue = java.lang.String
  type Attributes = js.Array[Attribute]
  type AvailabilityZone = java.lang.String
  type AvailabilityZones = js.Array[AvailabilityZone]
  type CidrIp = java.lang.String
  type CidrIps = js.Array[CidrIp]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CloudOnlyDirectoriesLimitReached = scala.Boolean
  type ComputerName = java.lang.String
  type ComputerPassword = java.lang.String
  type ConditionalForwarders = js.Array[ConditionalForwarder]
  type ConnectPassword = java.lang.String
  type ConnectedDirectoriesLimitReached = scala.Boolean
  type CreateSnapshotBeforeSchemaExtension = scala.Boolean
  type CreatedDateTime = stdLib.Date
  type CustomerId = java.lang.String
  type CustomerUserName = java.lang.String
  type DeleteAssociatedConditionalForwarder = scala.Boolean
  type Description = java.lang.String
  type DesiredNumberOfDomainControllers = scala.Double
  type DirectoryDescriptions = js.Array[DirectoryDescription]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Enterprise
    - awsDashSdkLib.awsDashSdkLibStrings.Standard
    - java.lang.String
  */
  type DirectoryEdition = _DirectoryEdition | java.lang.String
  type DirectoryId = java.lang.String
  type DirectoryIds = js.Array[DirectoryId]
  type DirectoryName = java.lang.String
  type DirectoryShortName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Small
    - awsDashSdkLib.awsDashSdkLibStrings.Large
    - java.lang.String
  */
  type DirectorySize = _DirectorySize | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Requested
    - awsDashSdkLib.awsDashSdkLibStrings.Creating
    - awsDashSdkLib.awsDashSdkLibStrings.Created
    - awsDashSdkLib.awsDashSdkLibStrings.Active
    - awsDashSdkLib.awsDashSdkLibStrings.Inoperable
    - awsDashSdkLib.awsDashSdkLibStrings.Impaired
    - awsDashSdkLib.awsDashSdkLibStrings.Restoring
    - awsDashSdkLib.awsDashSdkLibStrings.RestoreFailed
    - awsDashSdkLib.awsDashSdkLibStrings.Deleting
    - awsDashSdkLib.awsDashSdkLibStrings.Deleted
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - java.lang.String
  */
  type DirectoryStage = _DirectoryStage | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SimpleAD
    - awsDashSdkLib.awsDashSdkLibStrings.ADConnector
    - awsDashSdkLib.awsDashSdkLibStrings.MicrosoftAD
    - awsDashSdkLib.awsDashSdkLibStrings.SharedMicrosoftAD
    - java.lang.String
  */
  type DirectoryType = _DirectoryType | java.lang.String
  type DnsIpAddrs = js.Array[IpAddr]
  type DomainControllerId = java.lang.String
  type DomainControllerIds = js.Array[DomainControllerId]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Creating
    - awsDashSdkLib.awsDashSdkLibStrings.Active
    - awsDashSdkLib.awsDashSdkLibStrings.Impaired
    - awsDashSdkLib.awsDashSdkLibStrings.Restoring
    - awsDashSdkLib.awsDashSdkLibStrings.Deleting
    - awsDashSdkLib.awsDashSdkLibStrings.Deleted
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - java.lang.String
  */
  type DomainControllerStatus = _DomainControllerStatus | java.lang.String
  type DomainControllerStatusReason = java.lang.String
  type DomainControllers = js.Array[DomainController]
  type EndDateTime = stdLib.Date
  type EventTopics = js.Array[EventTopic]
  type IpAddr = java.lang.String
  type IpAddrs = js.Array[IpAddr]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Adding
    - awsDashSdkLib.awsDashSdkLibStrings.Added
    - awsDashSdkLib.awsDashSdkLibStrings.Removing
    - awsDashSdkLib.awsDashSdkLibStrings.Removed
    - awsDashSdkLib.awsDashSdkLibStrings.AddFailed
    - awsDashSdkLib.awsDashSdkLibStrings.RemoveFailed
    - java.lang.String
  */
  type IpRouteStatusMsg = _IpRouteStatusMsg | java.lang.String
  type IpRouteStatusReason = java.lang.String
  type IpRoutes = js.Array[IpRoute]
  type IpRoutesInfo = js.Array[IpRouteInfo]
  type LastUpdatedDateTime = stdLib.Date
  type LaunchTime = stdLib.Date
  type LdifContent = java.lang.String
  type Limit = scala.Double
  type LogGroupName = java.lang.String
  type LogSubscriptions = js.Array[LogSubscription]
  type ManualSnapshotsLimitReached = scala.Boolean
  type NextToken = java.lang.String
  type Notes = java.lang.String
  type OrganizationalUnitDN = java.lang.String
  type Password = java.lang.String
  type PortNumber = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PAP
    - awsDashSdkLib.awsDashSdkLibStrings.CHAP
    - awsDashSdkLib.awsDashSdkLibStrings.`MS-CHAPv1`
    - awsDashSdkLib.awsDashSdkLibStrings.`MS-CHAPv2`
    - java.lang.String
  */
  type RadiusAuthenticationProtocol = _RadiusAuthenticationProtocol | java.lang.String
  type RadiusDisplayLabel = java.lang.String
  type RadiusRetries = scala.Double
  type RadiusSharedSecret = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Creating
    - awsDashSdkLib.awsDashSdkLibStrings.Completed
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - java.lang.String
  */
  type RadiusStatus = _RadiusStatus | java.lang.String
  type RadiusTimeout = scala.Double
  type RemoteDomainName = java.lang.String
  type RemoteDomainNames = js.Array[RemoteDomainName]
  type ReplicationScope = awsDashSdkLib.awsDashSdkLibStrings.Domain | java.lang.String
  type RequestId = java.lang.String
  type ResourceId = java.lang.String
  type SID = java.lang.String
  type SchemaExtensionId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Initializing
    - awsDashSdkLib.awsDashSdkLibStrings.CreatingSnapshot
    - awsDashSdkLib.awsDashSdkLibStrings.UpdatingSchema
    - awsDashSdkLib.awsDashSdkLibStrings.Replicating
    - awsDashSdkLib.awsDashSdkLibStrings.CancelInProgress
    - awsDashSdkLib.awsDashSdkLibStrings.RollbackInProgress
    - awsDashSdkLib.awsDashSdkLibStrings.Cancelled
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - awsDashSdkLib.awsDashSdkLibStrings.Completed
    - java.lang.String
  */
  type SchemaExtensionStatus = _SchemaExtensionStatus | java.lang.String
  type SchemaExtensionStatusReason = java.lang.String
  type SchemaExtensionsInfo = js.Array[SchemaExtensionInfo]
  type SecurityGroupId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Enabled
    - awsDashSdkLib.awsDashSdkLibStrings.Disabled
    - java.lang.String
  */
  type SelectiveAuth = _SelectiveAuth | java.lang.String
  type Server = java.lang.String
  type Servers = js.Array[Server]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ORGANIZATIONS
    - awsDashSdkLib.awsDashSdkLibStrings.HANDSHAKE
    - java.lang.String
  */
  type ShareMethod = _ShareMethod | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Shared
    - awsDashSdkLib.awsDashSdkLibStrings.PendingAcceptance
    - awsDashSdkLib.awsDashSdkLibStrings.Rejected
    - awsDashSdkLib.awsDashSdkLibStrings.Rejecting
    - awsDashSdkLib.awsDashSdkLibStrings.RejectFailed
    - awsDashSdkLib.awsDashSdkLibStrings.Sharing
    - awsDashSdkLib.awsDashSdkLibStrings.ShareFailed
    - awsDashSdkLib.awsDashSdkLibStrings.Deleted
    - awsDashSdkLib.awsDashSdkLibStrings.Deleting
    - java.lang.String
  */
  type ShareStatus = _ShareStatus | java.lang.String
  type SharedDirectories = js.Array[SharedDirectory]
  type SnapshotId = java.lang.String
  type SnapshotIds = js.Array[SnapshotId]
  type SnapshotName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Creating
    - awsDashSdkLib.awsDashSdkLibStrings.Completed
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - java.lang.String
  */
  type SnapshotStatus = _SnapshotStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Auto
    - awsDashSdkLib.awsDashSdkLibStrings.Manual
    - java.lang.String
  */
  type SnapshotType = _SnapshotType | java.lang.String
  type Snapshots = js.Array[Snapshot]
  type SsoEnabled = scala.Boolean
  type StageReason = java.lang.String
  type StartDateTime = stdLib.Date
  type StartTime = stdLib.Date
  type StateLastUpdatedDateTime = stdLib.Date
  type SubnetId = java.lang.String
  type SubnetIds = js.Array[SubnetId]
  type SubscriptionCreatedDateTime = stdLib.Date
  type TagKey = java.lang.String
  type TagKeys = js.Array[TagKey]
  type TagValue = java.lang.String
  type Tags = js.Array[Tag]
  type TargetId = java.lang.String
  type TargetType = awsDashSdkLib.awsDashSdkLibStrings.ACCOUNT | java.lang.String
  type TopicArn = java.lang.String
  type TopicName = java.lang.String
  type TopicNames = js.Array[TopicName]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Registered
    - awsDashSdkLib.awsDashSdkLibStrings.`Topic not found`
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - awsDashSdkLib.awsDashSdkLibStrings.Deleted
    - java.lang.String
  */
  type TopicStatus = _TopicStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`One-Way: Outgoing`
    - awsDashSdkLib.awsDashSdkLibStrings.`One-Way: Incoming`
    - awsDashSdkLib.awsDashSdkLibStrings.`Two-Way`
    - java.lang.String
  */
  type TrustDirection = _TrustDirection | java.lang.String
  type TrustId = java.lang.String
  type TrustIds = js.Array[TrustId]
  type TrustPassword = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Creating
    - awsDashSdkLib.awsDashSdkLibStrings.Created
    - awsDashSdkLib.awsDashSdkLibStrings.Verifying
    - awsDashSdkLib.awsDashSdkLibStrings.VerifyFailed
    - awsDashSdkLib.awsDashSdkLibStrings.Verified
    - awsDashSdkLib.awsDashSdkLibStrings.Updating
    - awsDashSdkLib.awsDashSdkLibStrings.UpdateFailed
    - awsDashSdkLib.awsDashSdkLibStrings.Updated
    - awsDashSdkLib.awsDashSdkLibStrings.Deleting
    - awsDashSdkLib.awsDashSdkLibStrings.Deleted
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - java.lang.String
  */
  type TrustState = _TrustState | java.lang.String
  type TrustStateReason = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Forest
    - awsDashSdkLib.awsDashSdkLibStrings.External
    - java.lang.String
  */
  type TrustType = _TrustType | java.lang.String
  type Trusts = js.Array[Trust]
  type UpdateSecurityGroupForDirectoryControllers = scala.Boolean
  type UseSameUsername = scala.Boolean
  type UserName = java.lang.String
  type UserPassword = java.lang.String
  type VpcId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2015-04-16`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
