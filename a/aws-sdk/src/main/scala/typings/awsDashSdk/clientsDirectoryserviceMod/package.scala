package typings.awsDashSdk

import typings.awsDashSdk.awsDashSdkStrings.ACCOUNT
import typings.awsDashSdk.awsDashSdkStrings.Domain
import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsDirectoryserviceMod {
  type AccessUrl = String
  type AddedDateTime = Date
  type AliasName = String
  type AttributeName = String
  type AttributeValue = String
  type Attributes = js.Array[Attribute]
  type AvailabilityZone = String
  type AvailabilityZones = js.Array[AvailabilityZone]
  type CidrIp = String
  type CidrIps = js.Array[CidrIp]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type CloudOnlyDirectoriesLimitReached = Boolean
  type ComputerName = String
  type ComputerPassword = String
  type ConditionalForwarders = js.Array[ConditionalForwarder]
  type ConnectPassword = String
  type ConnectedDirectoriesLimitReached = Boolean
  type CreateSnapshotBeforeSchemaExtension = Boolean
  type CreatedDateTime = Date
  type CustomerId = String
  type CustomerUserName = String
  type DeleteAssociatedConditionalForwarder = Boolean
  type Description = String
  type DesiredNumberOfDomainControllers = Double
  type DirectoryDescriptions = js.Array[DirectoryDescription]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Enterprise
    - typings.awsDashSdk.awsDashSdkStrings.Standard
    - java.lang.String
  */
  type DirectoryEdition = _DirectoryEdition | String
  type DirectoryId = String
  type DirectoryIds = js.Array[DirectoryId]
  type DirectoryName = String
  type DirectoryShortName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Small
    - typings.awsDashSdk.awsDashSdkStrings.Large
    - java.lang.String
  */
  type DirectorySize = _DirectorySize | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Requested
    - typings.awsDashSdk.awsDashSdkStrings.Creating
    - typings.awsDashSdk.awsDashSdkStrings.Created
    - typings.awsDashSdk.awsDashSdkStrings.Active
    - typings.awsDashSdk.awsDashSdkStrings.Inoperable
    - typings.awsDashSdk.awsDashSdkStrings.Impaired
    - typings.awsDashSdk.awsDashSdkStrings.Restoring
    - typings.awsDashSdk.awsDashSdkStrings.RestoreFailed
    - typings.awsDashSdk.awsDashSdkStrings.Deleting
    - typings.awsDashSdk.awsDashSdkStrings.Deleted
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - java.lang.String
  */
  type DirectoryStage = _DirectoryStage | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SimpleAD
    - typings.awsDashSdk.awsDashSdkStrings.ADConnector
    - typings.awsDashSdk.awsDashSdkStrings.MicrosoftAD
    - typings.awsDashSdk.awsDashSdkStrings.SharedMicrosoftAD
    - java.lang.String
  */
  type DirectoryType = _DirectoryType | String
  type DnsIpAddrs = js.Array[IpAddr]
  type DomainControllerId = String
  type DomainControllerIds = js.Array[DomainControllerId]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Creating
    - typings.awsDashSdk.awsDashSdkStrings.Active
    - typings.awsDashSdk.awsDashSdkStrings.Impaired
    - typings.awsDashSdk.awsDashSdkStrings.Restoring
    - typings.awsDashSdk.awsDashSdkStrings.Deleting
    - typings.awsDashSdk.awsDashSdkStrings.Deleted
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - java.lang.String
  */
  type DomainControllerStatus = _DomainControllerStatus | String
  type DomainControllerStatusReason = String
  type DomainControllers = js.Array[DomainController]
  type EndDateTime = Date
  type EventTopics = js.Array[EventTopic]
  type IpAddr = String
  type IpAddrs = js.Array[IpAddr]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Adding
    - typings.awsDashSdk.awsDashSdkStrings.Added
    - typings.awsDashSdk.awsDashSdkStrings.Removing
    - typings.awsDashSdk.awsDashSdkStrings.Removed
    - typings.awsDashSdk.awsDashSdkStrings.AddFailed
    - typings.awsDashSdk.awsDashSdkStrings.RemoveFailed
    - java.lang.String
  */
  type IpRouteStatusMsg = _IpRouteStatusMsg | String
  type IpRouteStatusReason = String
  type IpRoutes = js.Array[IpRoute]
  type IpRoutesInfo = js.Array[IpRouteInfo]
  type LastUpdatedDateTime = Date
  type LaunchTime = Date
  type LdifContent = String
  type Limit = Double
  type LogGroupName = String
  type LogSubscriptions = js.Array[LogSubscription]
  type ManualSnapshotsLimitReached = Boolean
  type NextToken = String
  type Notes = String
  type OrganizationalUnitDN = String
  type Password = String
  type PortNumber = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PAP
    - typings.awsDashSdk.awsDashSdkStrings.CHAP
    - typings.awsDashSdk.awsDashSdkStrings.`MS-CHAPv1`
    - typings.awsDashSdk.awsDashSdkStrings.`MS-CHAPv2`
    - java.lang.String
  */
  type RadiusAuthenticationProtocol = _RadiusAuthenticationProtocol | String
  type RadiusDisplayLabel = String
  type RadiusRetries = Double
  type RadiusSharedSecret = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Creating
    - typings.awsDashSdk.awsDashSdkStrings.Completed
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - java.lang.String
  */
  type RadiusStatus = _RadiusStatus | String
  type RadiusTimeout = Double
  type RemoteDomainName = String
  type RemoteDomainNames = js.Array[RemoteDomainName]
  type ReplicationScope = Domain | String
  type RequestId = String
  type ResourceId = String
  type SID = String
  type SchemaExtensionId = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Initializing
    - typings.awsDashSdk.awsDashSdkStrings.CreatingSnapshot
    - typings.awsDashSdk.awsDashSdkStrings.UpdatingSchema
    - typings.awsDashSdk.awsDashSdkStrings.Replicating
    - typings.awsDashSdk.awsDashSdkStrings.CancelInProgress
    - typings.awsDashSdk.awsDashSdkStrings.RollbackInProgress
    - typings.awsDashSdk.awsDashSdkStrings.Cancelled
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - typings.awsDashSdk.awsDashSdkStrings.Completed
    - java.lang.String
  */
  type SchemaExtensionStatus = _SchemaExtensionStatus | String
  type SchemaExtensionStatusReason = String
  type SchemaExtensionsInfo = js.Array[SchemaExtensionInfo]
  type SecurityGroupId = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Enabled
    - typings.awsDashSdk.awsDashSdkStrings.Disabled
    - java.lang.String
  */
  type SelectiveAuth = _SelectiveAuth | String
  type Server = String
  type Servers = js.Array[Server]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ORGANIZATIONS
    - typings.awsDashSdk.awsDashSdkStrings.HANDSHAKE
    - java.lang.String
  */
  type ShareMethod = _ShareMethod | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Shared
    - typings.awsDashSdk.awsDashSdkStrings.PendingAcceptance
    - typings.awsDashSdk.awsDashSdkStrings.Rejected
    - typings.awsDashSdk.awsDashSdkStrings.Rejecting
    - typings.awsDashSdk.awsDashSdkStrings.RejectFailed
    - typings.awsDashSdk.awsDashSdkStrings.Sharing
    - typings.awsDashSdk.awsDashSdkStrings.ShareFailed
    - typings.awsDashSdk.awsDashSdkStrings.Deleted
    - typings.awsDashSdk.awsDashSdkStrings.Deleting
    - java.lang.String
  */
  type ShareStatus = _ShareStatus | String
  type SharedDirectories = js.Array[SharedDirectory]
  type SnapshotId = String
  type SnapshotIds = js.Array[SnapshotId]
  type SnapshotName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Creating
    - typings.awsDashSdk.awsDashSdkStrings.Completed
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - java.lang.String
  */
  type SnapshotStatus = _SnapshotStatus | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Auto
    - typings.awsDashSdk.awsDashSdkStrings.Manual
    - java.lang.String
  */
  type SnapshotType = _SnapshotType | String
  type Snapshots = js.Array[Snapshot]
  type SsoEnabled = Boolean
  type StageReason = String
  type StartDateTime = Date
  type StartTime = Date
  type StateLastUpdatedDateTime = Date
  type SubnetId = String
  type SubnetIds = js.Array[SubnetId]
  type SubscriptionCreatedDateTime = Date
  type TagKey = String
  type TagKeys = js.Array[TagKey]
  type TagValue = String
  type Tags = js.Array[Tag]
  type TargetId = String
  type TargetType = ACCOUNT | String
  type TopicArn = String
  type TopicName = String
  type TopicNames = js.Array[TopicName]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Registered
    - typings.awsDashSdk.awsDashSdkStrings.`Topic not found`
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - typings.awsDashSdk.awsDashSdkStrings.Deleted
    - java.lang.String
  */
  type TopicStatus = _TopicStatus | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`One-Way: Outgoing`
    - typings.awsDashSdk.awsDashSdkStrings.`One-Way: Incoming`
    - typings.awsDashSdk.awsDashSdkStrings.`Two-Way`
    - java.lang.String
  */
  type TrustDirection = _TrustDirection | String
  type TrustId = String
  type TrustIds = js.Array[TrustId]
  type TrustPassword = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Creating
    - typings.awsDashSdk.awsDashSdkStrings.Created
    - typings.awsDashSdk.awsDashSdkStrings.Verifying
    - typings.awsDashSdk.awsDashSdkStrings.VerifyFailed
    - typings.awsDashSdk.awsDashSdkStrings.Verified
    - typings.awsDashSdk.awsDashSdkStrings.Updating
    - typings.awsDashSdk.awsDashSdkStrings.UpdateFailed
    - typings.awsDashSdk.awsDashSdkStrings.Updated
    - typings.awsDashSdk.awsDashSdkStrings.Deleting
    - typings.awsDashSdk.awsDashSdkStrings.Deleted
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - java.lang.String
  */
  type TrustState = _TrustState | String
  type TrustStateReason = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Forest
    - typings.awsDashSdk.awsDashSdkStrings.External
    - java.lang.String
  */
  type TrustType = _TrustType | String
  type Trusts = js.Array[Trust]
  type UpdateSecurityGroupForDirectoryControllers = Boolean
  type UseSameUsername = Boolean
  type UserName = String
  type UserPassword = String
  type VpcId = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2015-04-16`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
