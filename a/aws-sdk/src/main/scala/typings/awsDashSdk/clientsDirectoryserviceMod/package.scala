package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsDirectoryserviceMod {
  import typings.awsDashSdk.awsDashSdkStrings.ACCOUNT
  import typings.awsDashSdk.awsDashSdkStrings.Client
  import typings.awsDashSdk.awsDashSdkStrings.Domain_
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type AccessUrl = String
  type AddedDateTime = Date
  type AliasName = String
  type AttributeName = String
  type AttributeValue = String
  type Attributes = js.Array[Attribute]
  type AvailabilityZone = String
  type AvailabilityZones = js.Array[AvailabilityZone]
  type CertificateCN = String
  type CertificateData = String
  type CertificateExpiryDateTime = Date
  type CertificateId = String
  type CertificateRegisteredDateTime = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Registering_
    - typings.awsDashSdk.awsDashSdkStrings.Registered_
    - typings.awsDashSdk.awsDashSdkStrings.RegisterFailed
    - typings.awsDashSdk.awsDashSdkStrings.Deregistering_
    - typings.awsDashSdk.awsDashSdkStrings.Deregistered_
    - typings.awsDashSdk.awsDashSdkStrings.DeregisterFailed
    - java.lang.String
  */
  type CertificateState = _CertificateState | String
  type CertificateStateReason = String
  type CertificatesInfo = js.Array[CertificateInfo]
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
    - typings.awsDashSdk.awsDashSdkStrings.Standard_
    - java.lang.String
  */
  type DirectoryEdition = _DirectoryEdition | String
  type DirectoryId = String
  type DirectoryIds = js.Array[DirectoryId]
  type DirectoryName = String
  type DirectoryShortName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Small_
    - typings.awsDashSdk.awsDashSdkStrings.Large_
    - java.lang.String
  */
  type DirectorySize = _DirectorySize | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Requested_
    - typings.awsDashSdk.awsDashSdkStrings.Creating_
    - typings.awsDashSdk.awsDashSdkStrings.Created_
    - typings.awsDashSdk.awsDashSdkStrings.Active_
    - typings.awsDashSdk.awsDashSdkStrings.Inoperable_
    - typings.awsDashSdk.awsDashSdkStrings.Impaired_
    - typings.awsDashSdk.awsDashSdkStrings.Restoring_
    - typings.awsDashSdk.awsDashSdkStrings.RestoreFailed
    - typings.awsDashSdk.awsDashSdkStrings.Deleting_
    - typings.awsDashSdk.awsDashSdkStrings.Deleted_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
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
    - typings.awsDashSdk.awsDashSdkStrings.Creating_
    - typings.awsDashSdk.awsDashSdkStrings.Active_
    - typings.awsDashSdk.awsDashSdkStrings.Impaired_
    - typings.awsDashSdk.awsDashSdkStrings.Restoring_
    - typings.awsDashSdk.awsDashSdkStrings.Deleting_
    - typings.awsDashSdk.awsDashSdkStrings.Deleted_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
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
    - typings.awsDashSdk.awsDashSdkStrings.Removed_
    - typings.awsDashSdk.awsDashSdkStrings.AddFailed
    - typings.awsDashSdk.awsDashSdkStrings.RemoveFailed
    - java.lang.String
  */
  type IpRouteStatusMsg = _IpRouteStatusMsg | String
  type IpRouteStatusReason = String
  type IpRoutes = js.Array[IpRoute]
  type IpRoutesInfo = js.Array[IpRouteInfo]
  type LDAPSSettingsInfo = js.Array[LDAPSSettingInfo]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Enabling_
    - typings.awsDashSdk.awsDashSdkStrings.Enabled_
    - typings.awsDashSdk.awsDashSdkStrings.EnableFailed
    - typings.awsDashSdk.awsDashSdkStrings.Disabled_
    - java.lang.String
  */
  type LDAPSStatus = _LDAPSStatus | String
  type LDAPSStatusReason = String
  type LDAPSType = Client | String
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
  type PageLimit = Double
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
    - typings.awsDashSdk.awsDashSdkStrings.Creating_
    - typings.awsDashSdk.awsDashSdkStrings.Completed_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - java.lang.String
  */
  type RadiusStatus = _RadiusStatus | String
  type RadiusTimeout = Double
  type RemoteDomainName = String
  type RemoteDomainNames = js.Array[RemoteDomainName]
  type ReplicationScope = Domain_ | String
  type RequestId = String
  type ResourceId = String
  type SID = String
  type SchemaExtensionId = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Initializing_
    - typings.awsDashSdk.awsDashSdkStrings.CreatingSnapshot
    - typings.awsDashSdk.awsDashSdkStrings.UpdatingSchema
    - typings.awsDashSdk.awsDashSdkStrings.Replicating
    - typings.awsDashSdk.awsDashSdkStrings.CancelInProgress
    - typings.awsDashSdk.awsDashSdkStrings.RollbackInProgress
    - typings.awsDashSdk.awsDashSdkStrings.Cancelled_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - typings.awsDashSdk.awsDashSdkStrings.Completed_
    - java.lang.String
  */
  type SchemaExtensionStatus = _SchemaExtensionStatus | String
  type SchemaExtensionStatusReason = String
  type SchemaExtensionsInfo = js.Array[SchemaExtensionInfo]
  type SecurityGroupId = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Enabled_
    - typings.awsDashSdk.awsDashSdkStrings.Disabled_
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
    - typings.awsDashSdk.awsDashSdkStrings.Shared_
    - typings.awsDashSdk.awsDashSdkStrings.PendingAcceptance
    - typings.awsDashSdk.awsDashSdkStrings.Rejected_
    - typings.awsDashSdk.awsDashSdkStrings.Rejecting
    - typings.awsDashSdk.awsDashSdkStrings.RejectFailed
    - typings.awsDashSdk.awsDashSdkStrings.Sharing
    - typings.awsDashSdk.awsDashSdkStrings.ShareFailed
    - typings.awsDashSdk.awsDashSdkStrings.Deleted_
    - typings.awsDashSdk.awsDashSdkStrings.Deleting_
    - java.lang.String
  */
  type ShareStatus = _ShareStatus | String
  type SharedDirectories = js.Array[SharedDirectory]
  type SnapshotId = String
  type SnapshotIds = js.Array[SnapshotId]
  type SnapshotName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Creating_
    - typings.awsDashSdk.awsDashSdkStrings.Completed_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - java.lang.String
  */
  type SnapshotStatus = _SnapshotStatus | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Auto_
    - typings.awsDashSdk.awsDashSdkStrings.Manual_
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
    - typings.awsDashSdk.awsDashSdkStrings.Registered_
    - typings.awsDashSdk.awsDashSdkStrings.`Topic not found`
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - typings.awsDashSdk.awsDashSdkStrings.Deleted_
    - java.lang.String
  */
  type TopicStatus = _TopicStatus | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`One-WayColon Outgoing`
    - typings.awsDashSdk.awsDashSdkStrings.`One-WayColon Incoming`
    - typings.awsDashSdk.awsDashSdkStrings.`Two-Way`
    - java.lang.String
  */
  type TrustDirection = _TrustDirection | String
  type TrustId = String
  type TrustIds = js.Array[TrustId]
  type TrustPassword = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Creating_
    - typings.awsDashSdk.awsDashSdkStrings.Created_
    - typings.awsDashSdk.awsDashSdkStrings.Verifying_
    - typings.awsDashSdk.awsDashSdkStrings.VerifyFailed
    - typings.awsDashSdk.awsDashSdkStrings.Verified
    - typings.awsDashSdk.awsDashSdkStrings.Updating_
    - typings.awsDashSdk.awsDashSdkStrings.UpdateFailed
    - typings.awsDashSdk.awsDashSdkStrings.Updated_
    - typings.awsDashSdk.awsDashSdkStrings.Deleting_
    - typings.awsDashSdk.awsDashSdkStrings.Deleted_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - java.lang.String
  */
  type TrustState = _TrustState | String
  type TrustStateReason = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Forest
    - typings.awsDashSdk.awsDashSdkStrings.External_
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
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
