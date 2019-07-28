package typings.awsDashSdk

import typings.awsDashSdk.awsDashSdkStrings.VIRTUAL_MACHINE
import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsSmsMod {
  type AmiId = String
  type AppDescription = String
  type AppId = String
  type AppIds = js.Array[AppId]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.READY_FOR_CONFIGURATION
    - typings.awsDashSdk.awsDashSdkStrings.CONFIGURATION_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.CONFIGURATION_INVALID
    - typings.awsDashSdk.awsDashSdkStrings.READY_FOR_LAUNCH
    - typings.awsDashSdk.awsDashSdkStrings.VALIDATION_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.LAUNCH_PENDING
    - typings.awsDashSdk.awsDashSdkStrings.LAUNCH_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.LAUNCHED
    - typings.awsDashSdk.awsDashSdkStrings.DELTA_LAUNCH_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.DELTA_LAUNCH_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.LAUNCH_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.TERMINATE_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.TERMINATE_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.TERMINATED
    - java.lang.String
  */
  type AppLaunchStatus = _AppLaunchStatus | String
  type AppLaunchStatusMessage = String
  type AppName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.READY_FOR_CONFIGURATION
    - typings.awsDashSdk.awsDashSdkStrings.CONFIGURATION_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.CONFIGURATION_INVALID
    - typings.awsDashSdk.awsDashSdkStrings.READY_FOR_REPLICATION
    - typings.awsDashSdk.awsDashSdkStrings.VALIDATION_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.REPLICATION_PENDING
    - typings.awsDashSdk.awsDashSdkStrings.REPLICATION_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.REPLICATED
    - typings.awsDashSdk.awsDashSdkStrings.DELTA_REPLICATION_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.DELTA_REPLICATED
    - typings.awsDashSdk.awsDashSdkStrings.DELTA_REPLICATION_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.REPLICATION_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.REPLICATION_STOPPING
    - typings.awsDashSdk.awsDashSdkStrings.REPLICATION_STOP_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.REPLICATION_STOPPED
    - java.lang.String
  */
  type AppReplicationStatus = _AppReplicationStatus | String
  type AppReplicationStatusMessage = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.UPDATING
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.DELETED
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_FAILED
    - java.lang.String
  */
  type AppStatus = _AppStatus | String
  type AppStatusMessage = String
  type Apps = js.Array[AppSummary]
  type AssociatePublicIpAddress = Boolean
  type BucketName = String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClientToken = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.VSPHERE
    - typings.awsDashSdk.awsDashSdkStrings.SCVMM
    - typings.awsDashSdk.awsDashSdkStrings.`HYPERV-MANAGER`
    - typings.awsDashSdk.awsDashSdkStrings.SNAPSHOT_BATCHING
    - java.lang.String
  */
  type ConnectorCapability = _ConnectorCapability | String
  type ConnectorCapabilityList = js.Array[ConnectorCapability]
  type ConnectorId = String
  type ConnectorList = js.Array[Connector]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.HEALTHY
    - typings.awsDashSdk.awsDashSdkStrings.UNHEALTHY
    - java.lang.String
  */
  type ConnectorStatus = _ConnectorStatus | String
  type ConnectorVersion = String
  type Description = String
  type EC2KeyName = String
  type Encrypted = Boolean
  type ForceStopAppReplication = Boolean
  type ForceTerminateApp = Boolean
  type Frequency = Double
  type InstanceType = String
  type IpAddress = String
  type KeyName = String
  type KmsKeyId = String
  type LaunchOrder = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AWS
    - typings.awsDashSdk.awsDashSdkStrings.BYOL
    - java.lang.String
  */
  type LicenseType = _LicenseType | String
  type LogicalId = String
  type MacAddress = String
  type MaxResults = Double
  type NextToken = String
  type NumberOfRecentAmisToKeep = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.JSON
    - typings.awsDashSdk.awsDashSdkStrings.YAML
    - java.lang.String
  */
  type OutputFormat = _OutputFormat | String
  type ReplicationJobId = String
  type ReplicationJobList = js.Array[ReplicationJob]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.DELETED
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED
    - typings.awsDashSdk.awsDashSdkStrings.PAUSED_ON_FAILURE
    - typings.awsDashSdk.awsDashSdkStrings.FAILING
    - java.lang.String
  */
  type ReplicationJobState = _ReplicationJobState | String
  type ReplicationJobStatusMessage = String
  type ReplicationJobTerminated = Boolean
  type ReplicationRunId = String
  type ReplicationRunList = js.Array[ReplicationRun]
  type ReplicationRunStage = String
  type ReplicationRunStageProgress = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.MISSED
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.DELETED
    - java.lang.String
  */
  type ReplicationRunState = _ReplicationRunState | String
  type ReplicationRunStatusMessage = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ON_DEMAND
    - typings.awsDashSdk.awsDashSdkStrings.AUTOMATIC
    - java.lang.String
  */
  type ReplicationRunType = _ReplicationRunType | String
  type RoleName = String
  type RunOnce = Boolean
  type SecurityGroup = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NOT_IMPORTED
    - typings.awsDashSdk.awsDashSdkStrings.IMPORTING
    - typings.awsDashSdk.awsDashSdkStrings.AVAILABLE
    - typings.awsDashSdk.awsDashSdkStrings.DELETED
    - typings.awsDashSdk.awsDashSdkStrings.EXPIRED
    - java.lang.String
  */
  type ServerCatalogStatus = _ServerCatalogStatus | String
  type ServerGroupId = String
  type ServerGroupLaunchConfigurations = js.Array[ServerGroupLaunchConfiguration]
  type ServerGroupName = String
  type ServerGroupReplicationConfigurations = js.Array[ServerGroupReplicationConfiguration]
  type ServerGroups = js.Array[ServerGroup]
  type ServerId = String
  type ServerLaunchConfigurations = js.Array[ServerLaunchConfiguration]
  type ServerList = js.Array[Server]
  type ServerReplicationConfigurations = js.Array[ServerReplicationConfiguration]
  type ServerType = VIRTUAL_MACHINE | String
  type StackId = String
  type StackName = String
  type Subnet = String
  type TagKey = String
  type TagValue = String
  type Tags = js.Array[Tag]
  type Timestamp = Date
  type TotalServerGroups = Double
  type TotalServers = Double
  type VPC = String
  type VmId = String
  type VmManagerId = String
  type VmManagerName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.VSPHERE
    - typings.awsDashSdk.awsDashSdkStrings.SCVMM
    - typings.awsDashSdk.awsDashSdkStrings.`HYPERV-MANAGER`
    - java.lang.String
  */
  type VmManagerType = _VmManagerType | String
  type VmName = String
  type VmPath = String
  type VmServerAddressList = js.Array[VmServerAddress]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2016-10-24`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
