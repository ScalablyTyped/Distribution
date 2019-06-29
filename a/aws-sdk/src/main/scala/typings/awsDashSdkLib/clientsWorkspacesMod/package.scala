package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsWorkspacesMod {
  type ARN = java.lang.String
  type AccountModificationList = js.Array[AccountModification]
  type Alias = java.lang.String
  type BooleanObject = scala.Boolean
  type BundleId = java.lang.String
  type BundleIdList = js.Array[BundleId]
  type BundleList = js.Array[WorkspaceBundle]
  type BundleOwner = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientPropertiesList = js.Array[ClientPropertiesResult]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.VALUE
    - awsDashSdkLib.awsDashSdkLibStrings.STANDARD
    - awsDashSdkLib.awsDashSdkLibStrings.PERFORMANCE
    - awsDashSdkLib.awsDashSdkLibStrings.POWER
    - awsDashSdkLib.awsDashSdkLibStrings.GRAPHICS
    - awsDashSdkLib.awsDashSdkLibStrings.POWERPRO
    - awsDashSdkLib.awsDashSdkLibStrings.GRAPHICSPRO
    - java.lang.String
  */
  type Compute = _Compute | java.lang.String
  type ComputerName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CONNECTED
    - awsDashSdkLib.awsDashSdkLibStrings.DISCONNECTED
    - awsDashSdkLib.awsDashSdkLibStrings.UNKNOWN
    - java.lang.String
  */
  type ConnectionState = _ConnectionState | java.lang.String
  type DedicatedTenancyCidrRangeList = js.Array[DedicatedTenancyManagementCidrRange]
  type DedicatedTenancyManagementCidrRange = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type DedicatedTenancyModificationStateEnum = _DedicatedTenancyModificationStateEnum | java.lang.String
  type DedicatedTenancySupportEnum = awsDashSdkLib.awsDashSdkLibStrings.ENABLED | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ENABLED
    - awsDashSdkLib.awsDashSdkLibStrings.DISABLED
    - java.lang.String
  */
  type DedicatedTenancySupportResultEnum = _DedicatedTenancySupportResultEnum | java.lang.String
  type DefaultOu = java.lang.String
  type Description = java.lang.String
  type DirectoryId = java.lang.String
  type DirectoryIdList = js.Array[DirectoryId]
  type DirectoryList = js.Array[WorkspaceDirectory]
  type DirectoryName = java.lang.String
  type DnsIpAddresses = js.Array[IpAddress]
  type Ec2ImageId = java.lang.String
  type ErrorType = java.lang.String
  type FailedCreateWorkspaceRequests = js.Array[FailedCreateWorkspaceRequest]
  type FailedRebootWorkspaceRequests = js.Array[FailedWorkspaceChangeRequest]
  type FailedRebuildWorkspaceRequests = js.Array[FailedWorkspaceChangeRequest]
  type FailedStartWorkspaceRequests = js.Array[FailedWorkspaceChangeRequest]
  type FailedStopWorkspaceRequests = js.Array[FailedWorkspaceChangeRequest]
  type FailedTerminateWorkspaceRequests = js.Array[FailedWorkspaceChangeRequest]
  type IpAddress = java.lang.String
  type IpGroupDesc = java.lang.String
  type IpGroupId = java.lang.String
  type IpGroupIdList = js.Array[IpGroupId]
  type IpGroupName = java.lang.String
  type IpRevokedRuleList = js.Array[IpRule]
  type IpRule = java.lang.String
  type IpRuleDesc = java.lang.String
  type IpRuleList = js.Array[IpRuleItem]
  type Limit = scala.Double
  type ManagementCidrRangeConstraint = java.lang.String
  type ManagementCidrRangeMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ROOT_VOLUME
    - awsDashSdkLib.awsDashSdkLibStrings.USER_VOLUME
    - awsDashSdkLib.awsDashSdkLibStrings.COMPUTE_TYPE
    - java.lang.String
  */
  type ModificationResourceEnum = _ModificationResourceEnum | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATE_INITIATED
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATE_IN_PROGRESS
    - java.lang.String
  */
  type ModificationStateEnum = _ModificationStateEnum | java.lang.String
  type ModificationStateList = js.Array[ModificationState]
  type NonEmptyString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.WINDOWS
    - awsDashSdkLib.awsDashSdkLibStrings.LINUX
    - java.lang.String
  */
  type OperatingSystemType = _OperatingSystemType | java.lang.String
  type PaginationToken = java.lang.String
  type RebootWorkspaceRequests = js.Array[RebootRequest]
  type RebuildWorkspaceRequests = js.Array[RebuildRequest]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ENABLED
    - awsDashSdkLib.awsDashSdkLibStrings.DISABLED
    - java.lang.String
  */
  type ReconnectEnum = _ReconnectEnum | java.lang.String
  type Region = java.lang.String
  type RegistrationCode = java.lang.String
  type ResourceIdList = js.Array[NonEmptyString]
  type RootVolumeSizeGib = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AUTO_STOP
    - awsDashSdkLib.awsDashSdkLibStrings.ALWAYS_ON
    - java.lang.String
  */
  type RunningMode = _RunningMode | java.lang.String
  type RunningModeAutoStopTimeoutInMinutes = scala.Double
  type SecurityGroupId = java.lang.String
  type StartWorkspaceRequests = js.Array[StartRequest]
  type StopWorkspaceRequests = js.Array[StopRequest]
  type SubnetId = java.lang.String
  type SubnetIds = js.Array[SubnetId]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[NonEmptyString]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE
    - awsDashSdkLib.awsDashSdkLibStrings.ADMIN_MAINTENANCE
    - java.lang.String
  */
  type TargetWorkspaceState = _TargetWorkspaceState | java.lang.String
  type TerminateWorkspaceRequests = js.Array[TerminateRequest]
  type Timestamp = stdLib.Date
  type UserName = java.lang.String
  type UserVolumeSizeGib = scala.Double
  type VolumeEncryptionKey = java.lang.String
  type WorkspaceConnectionStatusList = js.Array[WorkspaceConnectionStatus]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.REGISTERING
    - awsDashSdkLib.awsDashSdkLibStrings.REGISTERED
    - awsDashSdkLib.awsDashSdkLibStrings.DEREGISTERING
    - awsDashSdkLib.awsDashSdkLibStrings.DEREGISTERED
    - awsDashSdkLib.awsDashSdkLibStrings.ERROR
    - java.lang.String
  */
  type WorkspaceDirectoryState = _WorkspaceDirectoryState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SIMPLE_AD
    - awsDashSdkLib.awsDashSdkLibStrings.AD_CONNECTOR
    - java.lang.String
  */
  type WorkspaceDirectoryType = _WorkspaceDirectoryType | java.lang.String
  type WorkspaceErrorCode = java.lang.String
  type WorkspaceId = java.lang.String
  type WorkspaceIdList = js.Array[WorkspaceId]
  type WorkspaceImageDescription = java.lang.String
  type WorkspaceImageErrorCode = java.lang.String
  type WorkspaceImageId = java.lang.String
  type WorkspaceImageIdList = js.Array[WorkspaceImageId]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.BYOL_REGULAR
    - awsDashSdkLib.awsDashSdkLibStrings.BYOL_GRAPHICS
    - awsDashSdkLib.awsDashSdkLibStrings.BYOL_GRAPHICSPRO
    - java.lang.String
  */
  type WorkspaceImageIngestionProcess = _WorkspaceImageIngestionProcess | java.lang.String
  type WorkspaceImageList = js.Array[WorkspaceImage]
  type WorkspaceImageName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DEFAULT
    - awsDashSdkLib.awsDashSdkLibStrings.DEDICATED
    - java.lang.String
  */
  type WorkspaceImageRequiredTenancy = _WorkspaceImageRequiredTenancy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.ERROR
    - java.lang.String
  */
  type WorkspaceImageState = _WorkspaceImageState | java.lang.String
  type WorkspaceList = js.Array[Workspace]
  type WorkspaceRequestList = js.Array[WorkspaceRequest]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE
    - awsDashSdkLib.awsDashSdkLibStrings.IMPAIRED
    - awsDashSdkLib.awsDashSdkLibStrings.UNHEALTHY
    - awsDashSdkLib.awsDashSdkLibStrings.REBOOTING
    - awsDashSdkLib.awsDashSdkLibStrings.STARTING
    - awsDashSdkLib.awsDashSdkLibStrings.REBUILDING
    - awsDashSdkLib.awsDashSdkLibStrings.MAINTENANCE
    - awsDashSdkLib.awsDashSdkLibStrings.ADMIN_MAINTENANCE
    - awsDashSdkLib.awsDashSdkLibStrings.TERMINATING
    - awsDashSdkLib.awsDashSdkLibStrings.TERMINATED
    - awsDashSdkLib.awsDashSdkLibStrings.SUSPENDED
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATING
    - awsDashSdkLib.awsDashSdkLibStrings.STOPPING
    - awsDashSdkLib.awsDashSdkLibStrings.STOPPED
    - awsDashSdkLib.awsDashSdkLibStrings.ERROR
    - java.lang.String
  */
  type WorkspaceState = _WorkspaceState | java.lang.String
  type WorkspacesIpGroupsList = js.Array[WorkspacesIpGroup]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2015-04-08`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
