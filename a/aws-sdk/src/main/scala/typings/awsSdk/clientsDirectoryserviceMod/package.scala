package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.ACCOUNT
import typings.awsSdk.awsSdkStrings.Client
import typings.awsSdk.awsSdkStrings.Domain_
import typings.awsSdk.awsSdkStrings.OS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccessUrl = String

type AddedDateTime = js.Date

type AdditionalRegions = js.Array[RegionName]

type AliasName = String

type AttributeName = String

type AttributeValue = String

type Attributes = js.Array[Attribute]

type AvailabilityZone = String

type AvailabilityZones = js.Array[AvailabilityZone]

type CertificateCN = String

type CertificateData = String

type CertificateExpiryDateTime = js.Date

type CertificateId = String

type CertificateRegisteredDateTime = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Registering_
  - typings.awsSdk.awsSdkStrings.Registered_
  - typings.awsSdk.awsSdkStrings.RegisterFailed
  - typings.awsSdk.awsSdkStrings.Deregistering_
  - typings.awsSdk.awsSdkStrings.Deregistered_
  - typings.awsSdk.awsSdkStrings.DeregisterFailed
  - java.lang.String
*/
type CertificateState = _CertificateState | String

type CertificateStateReason = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ClientCertAuth
  - typings.awsSdk.awsSdkStrings.ClientLDAPS
  - java.lang.String
*/
type CertificateType = _CertificateType | String

type CertificatesInfo = js.Array[CertificateInfo]

type CidrIp = String

type CidrIps = js.Array[CidrIp]

type ClientAuthenticationSettingsInfo = js.Array[ClientAuthenticationSettingInfo]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type ClientAuthenticationStatus = _ClientAuthenticationStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SmartCard
  - typings.awsSdk.awsSdkStrings.SmartCardOrPassword
  - java.lang.String
*/
type ClientAuthenticationType = _ClientAuthenticationType | String

type CloudOnlyDirectoriesLimitReached = Boolean

type ComputerName = String

type ComputerPassword = String

type ConditionalForwarders = js.Array[ConditionalForwarder]

type ConnectPassword = String

type ConnectedDirectoriesLimitReached = Boolean

type CreateSnapshotBeforeSchemaExtension = Boolean

type CreateSnapshotBeforeUpdate = Boolean

type CreatedDateTime = js.Date

type CustomerId = String

type CustomerUserName = String

type DeleteAssociatedConditionalForwarder = Boolean

type Description = String

type DesiredNumberOfDomainControllers = Double

type DirectoryConfigurationSettingAllowedValues = String

type DirectoryConfigurationSettingDataType = String

type DirectoryConfigurationSettingLastRequestedDateTime = js.Date

type DirectoryConfigurationSettingLastUpdatedDateTime = js.Date

type DirectoryConfigurationSettingName = String

type DirectoryConfigurationSettingRequestDetailedStatus = StringDictionary[DirectoryConfigurationStatus]

type DirectoryConfigurationSettingRequestStatusMessage = String

type DirectoryConfigurationSettingType = String

type DirectoryConfigurationSettingValue = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Requested_
  - typings.awsSdk.awsSdkStrings.Updating_
  - typings.awsSdk.awsSdkStrings.Updated_
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.Default_
  - java.lang.String
*/
type DirectoryConfigurationStatus = _DirectoryConfigurationStatus | String

type DirectoryDescriptions = js.Array[DirectoryDescription]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enterprise_
  - typings.awsSdk.awsSdkStrings.Standard_
  - java.lang.String
*/
type DirectoryEdition = _DirectoryEdition | String

type DirectoryId = String

type DirectoryIds = js.Array[DirectoryId]

type DirectoryName = String

type DirectoryShortName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Small_
  - typings.awsSdk.awsSdkStrings.Large_
  - java.lang.String
*/
type DirectorySize = _DirectorySize | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Requested_
  - typings.awsSdk.awsSdkStrings.Creating_
  - typings.awsSdk.awsSdkStrings.Created_
  - typings.awsSdk.awsSdkStrings.Active_
  - typings.awsSdk.awsSdkStrings.Inoperable_
  - typings.awsSdk.awsSdkStrings.Impaired_
  - typings.awsSdk.awsSdkStrings.Restoring_
  - typings.awsSdk.awsSdkStrings.RestoreFailed
  - typings.awsSdk.awsSdkStrings.Deleting_
  - typings.awsSdk.awsSdkStrings.Deleted_
  - typings.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type DirectoryStage = _DirectoryStage | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SimpleAD
  - typings.awsSdk.awsSdkStrings.ADConnector
  - typings.awsSdk.awsSdkStrings.MicrosoftAD
  - typings.awsSdk.awsSdkStrings.SharedMicrosoftAD
  - java.lang.String
*/
type DirectoryType = _DirectoryType | String

type DnsIpAddrs = js.Array[IpAddr]

type DomainControllerId = String

type DomainControllerIds = js.Array[DomainControllerId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Creating_
  - typings.awsSdk.awsSdkStrings.Active_
  - typings.awsSdk.awsSdkStrings.Impaired_
  - typings.awsSdk.awsSdkStrings.Restoring_
  - typings.awsSdk.awsSdkStrings.Deleting_
  - typings.awsSdk.awsSdkStrings.Deleted_
  - typings.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type DomainControllerStatus = _DomainControllerStatus | String

type DomainControllerStatusReason = String

type DomainControllers = js.Array[DomainController]

type EndDateTime = js.Date

type EventTopics = js.Array[EventTopic]

type InitiatedBy = String

type IpAddr = String

type IpAddrs = js.Array[IpAddr]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Adding
  - typings.awsSdk.awsSdkStrings.Added
  - typings.awsSdk.awsSdkStrings.Removing
  - typings.awsSdk.awsSdkStrings.Removed_
  - typings.awsSdk.awsSdkStrings.AddFailed
  - typings.awsSdk.awsSdkStrings.RemoveFailed
  - java.lang.String
*/
type IpRouteStatusMsg = _IpRouteStatusMsg | String

type IpRouteStatusReason = String

type IpRoutes = js.Array[IpRoute]

type IpRoutesInfo = js.Array[IpRouteInfo]

type LDAPSSettingsInfo = js.Array[LDAPSSettingInfo]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabling_
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.EnableFailed
  - typings.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type LDAPSStatus = _LDAPSStatus | String

type LDAPSStatusReason = String

type LDAPSType = Client | String

type LastUpdatedDateTime = js.Date

type LaunchTime = js.Date

type LdifContent = String

type Limit = Double

type LogGroupName = String

type LogSubscriptions = js.Array[LogSubscription]

type ManualSnapshotsLimitReached = Boolean

type NextToken = String

type Notes = String

type OCSPUrl = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SERVER_2012
  - typings.awsSdk.awsSdkStrings.SERVER_2019
  - java.lang.String
*/
type OSVersion = _OSVersion | String

type OrganizationalUnitDN = String

type PageLimit = Double

type Password = String

type PortNumber = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PAP
  - typings.awsSdk.awsSdkStrings.CHAP
  - typings.awsSdk.awsSdkStrings.`MS-CHAPv1`
  - typings.awsSdk.awsSdkStrings.`MS-CHAPv2`
  - java.lang.String
*/
type RadiusAuthenticationProtocol = _RadiusAuthenticationProtocol | String

type RadiusDisplayLabel = String

type RadiusRetries = Double

type RadiusSharedSecret = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Creating_
  - typings.awsSdk.awsSdkStrings.Completed_
  - typings.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type RadiusStatus = _RadiusStatus | String

type RadiusTimeout = Double

type RegionName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Primary_
  - typings.awsSdk.awsSdkStrings.Additional
  - java.lang.String
*/
type RegionType = _RegionType | String

type RegionsDescription = js.Array[RegionDescription]

type RemoteDomainName = String

type RemoteDomainNames = js.Array[RemoteDomainName]

type ReplicationScope = Domain_ | String

type RequestId = String

type ResourceId = String

type SID = String

type SchemaExtensionId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Initializing_
  - typings.awsSdk.awsSdkStrings.CreatingSnapshot
  - typings.awsSdk.awsSdkStrings.UpdatingSchema
  - typings.awsSdk.awsSdkStrings.Replicating_
  - typings.awsSdk.awsSdkStrings.CancelInProgress
  - typings.awsSdk.awsSdkStrings.RollbackInProgress
  - typings.awsSdk.awsSdkStrings.Cancelled_
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.Completed_
  - java.lang.String
*/
type SchemaExtensionStatus = _SchemaExtensionStatus | String

type SchemaExtensionStatusReason = String

type SchemaExtensionsInfo = js.Array[SchemaExtensionInfo]

type SecurityGroupId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type SelectiveAuth = _SelectiveAuth | String

type Server = String

type Servers = js.Array[Server]

type SettingEntries = js.Array[SettingEntry]

type Settings = js.Array[Setting]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ORGANIZATIONS
  - typings.awsSdk.awsSdkStrings.HANDSHAKE
  - java.lang.String
*/
type ShareMethod = _ShareMethod | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Shared_
  - typings.awsSdk.awsSdkStrings.PendingAcceptance
  - typings.awsSdk.awsSdkStrings.Rejected_
  - typings.awsSdk.awsSdkStrings.Rejecting_
  - typings.awsSdk.awsSdkStrings.RejectFailed
  - typings.awsSdk.awsSdkStrings.Sharing
  - typings.awsSdk.awsSdkStrings.ShareFailed
  - typings.awsSdk.awsSdkStrings.Deleted_
  - typings.awsSdk.awsSdkStrings.Deleting_
  - java.lang.String
*/
type ShareStatus = _ShareStatus | String

type SharedDirectories = js.Array[SharedDirectory]

type SnapshotId = String

type SnapshotIds = js.Array[SnapshotId]

type SnapshotName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Creating_
  - typings.awsSdk.awsSdkStrings.Completed_
  - typings.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type SnapshotStatus = _SnapshotStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Auto_
  - typings.awsSdk.awsSdkStrings.Manual_
  - java.lang.String
*/
type SnapshotType = _SnapshotType | String

type Snapshots = js.Array[Snapshot]

type SsoEnabled = Boolean

type StageReason = String

type StartDateTime = js.Date

type StartTime = js.Date

type StateLastUpdatedDateTime = js.Date

type SubnetId = String

type SubnetIds = js.Array[SubnetId]

type SubscriptionCreatedDateTime = js.Date

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
  - typings.awsSdk.awsSdkStrings.Registered_
  - typings.awsSdk.awsSdkStrings.`Topic not found`
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.Deleted_
  - java.lang.String
*/
type TopicStatus = _TopicStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`One-WayColon Outgoing`
  - typings.awsSdk.awsSdkStrings.`One-WayColon Incoming`
  - typings.awsSdk.awsSdkStrings.`Two-Way`
  - java.lang.String
*/
type TrustDirection = _TrustDirection | String

type TrustId = String

type TrustIds = js.Array[TrustId]

type TrustPassword = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Creating_
  - typings.awsSdk.awsSdkStrings.Created_
  - typings.awsSdk.awsSdkStrings.Verifying_
  - typings.awsSdk.awsSdkStrings.VerifyFailed
  - typings.awsSdk.awsSdkStrings.Verified_
  - typings.awsSdk.awsSdkStrings.Updating_
  - typings.awsSdk.awsSdkStrings.UpdateFailed
  - typings.awsSdk.awsSdkStrings.Updated_
  - typings.awsSdk.awsSdkStrings.Deleting_
  - typings.awsSdk.awsSdkStrings.Deleted_
  - typings.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type TrustState = _TrustState | String

type TrustStateReason = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Forest
  - typings.awsSdk.awsSdkStrings.External_
  - java.lang.String
*/
type TrustType = _TrustType | String

type Trusts = js.Array[Trust]

type UpdateActivities = js.Array[UpdateInfoEntry]

type UpdateSecurityGroupForDirectoryControllers = Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Updated_
  - typings.awsSdk.awsSdkStrings.Updating_
  - typings.awsSdk.awsSdkStrings.UpdateFailed
  - java.lang.String
*/
type UpdateStatus = _UpdateStatus | String

type UpdateStatusReason = String

type UpdateType = OS | String

type UseSameUsername = Boolean

type UserName = String

type UserPassword = String

type VpcId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2015-04-16`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
