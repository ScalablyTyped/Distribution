package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsWorkspacesMod {
  import typings.awsDashSdk.awsDashSdkStrings.ENABLED
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type ARN = String
  type AccountModificationList = js.Array[AccountModification]
  type Alias = String
  type BooleanObject = Boolean
  type BundleId = String
  type BundleIdList = js.Array[BundleId]
  type BundleList = js.Array[WorkspaceBundle]
  type BundleOwner = String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClientPropertiesList = js.Array[ClientPropertiesResult]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.VALUE
    - typings.awsDashSdk.awsDashSdkStrings.STANDARD
    - typings.awsDashSdk.awsDashSdkStrings.PERFORMANCE
    - typings.awsDashSdk.awsDashSdkStrings.POWER
    - typings.awsDashSdk.awsDashSdkStrings.GRAPHICS
    - typings.awsDashSdk.awsDashSdkStrings.POWERPRO
    - typings.awsDashSdk.awsDashSdkStrings.GRAPHICSPRO
    - java.lang.String
  */
  type Compute = _Compute | String
  type ComputerName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CONNECTED
    - typings.awsDashSdk.awsDashSdkStrings.DISCONNECTED
    - typings.awsDashSdk.awsDashSdkStrings.UNKNOWN
    - java.lang.String
  */
  type ConnectionState = _ConnectionState | String
  type DedicatedTenancyCidrRangeList = js.Array[DedicatedTenancyManagementCidrRange]
  type DedicatedTenancyManagementCidrRange = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type DedicatedTenancyModificationStateEnum = _DedicatedTenancyModificationStateEnum | String
  type DedicatedTenancySupportEnum = ENABLED | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - java.lang.String
  */
  type DedicatedTenancySupportResultEnum = _DedicatedTenancySupportResultEnum | String
  type DefaultOu = String
  type Description = String
  type DirectoryId = String
  type DirectoryIdList = js.Array[DirectoryId]
  type DirectoryList = js.Array[WorkspaceDirectory]
  type DirectoryName = String
  type DnsIpAddresses = js.Array[IpAddress]
  type Ec2ImageId = String
  type ErrorType = String
  type FailedCreateWorkspaceRequests = js.Array[FailedCreateWorkspaceRequest]
  type FailedRebootWorkspaceRequests = js.Array[FailedWorkspaceChangeRequest]
  type FailedRebuildWorkspaceRequests = js.Array[FailedWorkspaceChangeRequest]
  type FailedStartWorkspaceRequests = js.Array[FailedWorkspaceChangeRequest]
  type FailedStopWorkspaceRequests = js.Array[FailedWorkspaceChangeRequest]
  type FailedTerminateWorkspaceRequests = js.Array[FailedWorkspaceChangeRequest]
  type IpAddress = String
  type IpGroupDesc = String
  type IpGroupId = String
  type IpGroupIdList = js.Array[IpGroupId]
  type IpGroupName = String
  type IpRevokedRuleList = js.Array[IpRule]
  type IpRule = String
  type IpRuleDesc = String
  type IpRuleList = js.Array[IpRuleItem]
  type Limit = Double
  type ManagementCidrRangeConstraint = String
  type ManagementCidrRangeMaxResults = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ROOT_VOLUME
    - typings.awsDashSdk.awsDashSdkStrings.USER_VOLUME
    - typings.awsDashSdk.awsDashSdkStrings.COMPUTE_TYPE
    - java.lang.String
  */
  type ModificationResourceEnum = _ModificationResourceEnum | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE_INITIATED
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE_IN_PROGRESS
    - java.lang.String
  */
  type ModificationStateEnum = _ModificationStateEnum | String
  type ModificationStateList = js.Array[ModificationState]
  type NonEmptyString = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.WINDOWS
    - typings.awsDashSdk.awsDashSdkStrings.LINUX
    - java.lang.String
  */
  type OperatingSystemType = _OperatingSystemType | String
  type PaginationToken = String
  type RebootWorkspaceRequests = js.Array[RebootRequest]
  type RebuildWorkspaceRequests = js.Array[RebuildRequest]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - java.lang.String
  */
  type ReconnectEnum = _ReconnectEnum | String
  type Region = String
  type RegistrationCode = String
  type ResourceIdList = js.Array[NonEmptyString]
  type RootVolumeSizeGib = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AUTO_STOP
    - typings.awsDashSdk.awsDashSdkStrings.ALWAYS_ON
    - java.lang.String
  */
  type RunningMode = _RunningMode | String
  type RunningModeAutoStopTimeoutInMinutes = Double
  type SecurityGroupId = String
  type StartWorkspaceRequests = js.Array[StartRequest]
  type StopWorkspaceRequests = js.Array[StopRequest]
  type SubnetId = String
  type SubnetIds = js.Array[SubnetId]
  type TagKey = String
  type TagKeyList = js.Array[NonEmptyString]
  type TagList = js.Array[Tag]
  type TagValue = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AVAILABLE
    - typings.awsDashSdk.awsDashSdkStrings.ADMIN_MAINTENANCE
    - java.lang.String
  */
  type TargetWorkspaceState = _TargetWorkspaceState | String
  type TerminateWorkspaceRequests = js.Array[TerminateRequest]
  type Timestamp = Date
  type UserName = String
  type UserVolumeSizeGib = Double
  type VolumeEncryptionKey = String
  type WorkspaceConnectionStatusList = js.Array[WorkspaceConnectionStatus]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.REGISTERING
    - typings.awsDashSdk.awsDashSdkStrings.REGISTERED
    - typings.awsDashSdk.awsDashSdkStrings.DEREGISTERING
    - typings.awsDashSdk.awsDashSdkStrings.DEREGISTERED
    - typings.awsDashSdk.awsDashSdkStrings.ERROR
    - java.lang.String
  */
  type WorkspaceDirectoryState = _WorkspaceDirectoryState | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SIMPLE_AD
    - typings.awsDashSdk.awsDashSdkStrings.AD_CONNECTOR
    - java.lang.String
  */
  type WorkspaceDirectoryType = _WorkspaceDirectoryType | String
  type WorkspaceErrorCode = String
  type WorkspaceId = String
  type WorkspaceIdList = js.Array[WorkspaceId]
  type WorkspaceImageDescription = String
  type WorkspaceImageErrorCode = String
  type WorkspaceImageId = String
  type WorkspaceImageIdList = js.Array[WorkspaceImageId]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.BYOL_REGULAR
    - typings.awsDashSdk.awsDashSdkStrings.BYOL_GRAPHICS
    - typings.awsDashSdk.awsDashSdkStrings.BYOL_GRAPHICSPRO
    - java.lang.String
  */
  type WorkspaceImageIngestionProcess = _WorkspaceImageIngestionProcess | String
  type WorkspaceImageList = js.Array[WorkspaceImage]
  type WorkspaceImageName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DEFAULT
    - typings.awsDashSdk.awsDashSdkStrings.DEDICATED
    - java.lang.String
  */
  type WorkspaceImageRequiredTenancy = _WorkspaceImageRequiredTenancy | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AVAILABLE
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.ERROR
    - java.lang.String
  */
  type WorkspaceImageState = _WorkspaceImageState | String
  type WorkspaceList = js.Array[Workspace]
  type WorkspaceRequestList = js.Array[WorkspaceRequest]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.AVAILABLE
    - typings.awsDashSdk.awsDashSdkStrings.IMPAIRED
    - typings.awsDashSdk.awsDashSdkStrings.UNHEALTHY
    - typings.awsDashSdk.awsDashSdkStrings.REBOOTING
    - typings.awsDashSdk.awsDashSdkStrings.STARTING
    - typings.awsDashSdk.awsDashSdkStrings.REBUILDING
    - typings.awsDashSdk.awsDashSdkStrings.MAINTENANCE
    - typings.awsDashSdk.awsDashSdkStrings.ADMIN_MAINTENANCE
    - typings.awsDashSdk.awsDashSdkStrings.TERMINATING
    - typings.awsDashSdk.awsDashSdkStrings.TERMINATED
    - typings.awsDashSdk.awsDashSdkStrings.SUSPENDED
    - typings.awsDashSdk.awsDashSdkStrings.UPDATING
    - typings.awsDashSdk.awsDashSdkStrings.STOPPING
    - typings.awsDashSdk.awsDashSdkStrings.STOPPED
    - typings.awsDashSdk.awsDashSdkStrings.ERROR
    - java.lang.String
  */
  type WorkspaceState = _WorkspaceState | String
  type WorkspacesIpGroupsList = js.Array[WorkspacesIpGroup]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2015-04-08`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
