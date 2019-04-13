package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsSmsMod {
  type AmiId = java.lang.String
  type AppDescription = java.lang.String
  type AppId = java.lang.String
  type AppIds = js.Array[AppId]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.READY_FOR_CONFIGURATION
    - awsDashSdkLib.awsDashSdkLibStrings.CONFIGURATION_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.CONFIGURATION_INVALID
    - awsDashSdkLib.awsDashSdkLibStrings.READY_FOR_LAUNCH
    - awsDashSdkLib.awsDashSdkLibStrings.VALIDATION_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.LAUNCH_PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.LAUNCH_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.LAUNCHED
    - awsDashSdkLib.awsDashSdkLibStrings.DELTA_LAUNCH_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.DELTA_LAUNCH_FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.LAUNCH_FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.TERMINATE_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.TERMINATE_FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.TERMINATED
    - java.lang.String
  */
  type AppLaunchStatus = _AppLaunchStatus | java.lang.String
  type AppLaunchStatusMessage = java.lang.String
  type AppName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.READY_FOR_CONFIGURATION
    - awsDashSdkLib.awsDashSdkLibStrings.CONFIGURATION_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.CONFIGURATION_INVALID
    - awsDashSdkLib.awsDashSdkLibStrings.READY_FOR_REPLICATION
    - awsDashSdkLib.awsDashSdkLibStrings.VALIDATION_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.REPLICATION_PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.REPLICATION_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.REPLICATED
    - awsDashSdkLib.awsDashSdkLibStrings.DELTA_REPLICATION_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.DELTA_REPLICATED
    - awsDashSdkLib.awsDashSdkLibStrings.DELTA_REPLICATION_FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.REPLICATION_FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.REPLICATION_STOPPING
    - awsDashSdkLib.awsDashSdkLibStrings.REPLICATION_STOP_FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.REPLICATION_STOPPED
    - java.lang.String
  */
  type AppReplicationStatus = _AppReplicationStatus | java.lang.String
  type AppReplicationStatusMessage = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATING
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATING
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - awsDashSdkLib.awsDashSdkLibStrings.DELETED
    - awsDashSdkLib.awsDashSdkLibStrings.DELETE_FAILED
    - java.lang.String
  */
  type AppStatus = _AppStatus | java.lang.String
  type AppStatusMessage = java.lang.String
  type Apps = js.Array[AppSummary]
  type AssociatePublicIpAddress = scala.Boolean
  type BucketName = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.VSPHERE
    - awsDashSdkLib.awsDashSdkLibStrings.SCVMM
    - awsDashSdkLib.awsDashSdkLibStrings.`HYPERV-MANAGER`
    - awsDashSdkLib.awsDashSdkLibStrings.SNAPSHOT_BATCHING
    - java.lang.String
  */
  type ConnectorCapability = _ConnectorCapability | java.lang.String
  type ConnectorCapabilityList = js.Array[ConnectorCapability]
  type ConnectorId = java.lang.String
  type ConnectorList = js.Array[Connector]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.HEALTHY
    - awsDashSdkLib.awsDashSdkLibStrings.UNHEALTHY
    - java.lang.String
  */
  type ConnectorStatus = _ConnectorStatus | java.lang.String
  type ConnectorVersion = java.lang.String
  type Description = java.lang.String
  type EC2KeyName = java.lang.String
  type Encrypted = scala.Boolean
  type ForceStopAppReplication = scala.Boolean
  type ForceTerminateApp = scala.Boolean
  type Frequency = scala.Double
  type InstanceType = java.lang.String
  type IpAddress = java.lang.String
  type KeyName = java.lang.String
  type KmsKeyId = java.lang.String
  type LaunchOrder = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AWS
    - awsDashSdkLib.awsDashSdkLibStrings.BYOL
    - java.lang.String
  */
  type LicenseType = _LicenseType | java.lang.String
  type LogicalId = java.lang.String
  type MacAddress = java.lang.String
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  type NumberOfRecentAmisToKeep = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.JSON
    - awsDashSdkLib.awsDashSdkLibStrings.YAML
    - java.lang.String
  */
  type OutputFormat = _OutputFormat | java.lang.String
  type ReplicationJobId = java.lang.String
  type ReplicationJobList = js.Array[ReplicationJob]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - awsDashSdkLib.awsDashSdkLibStrings.DELETED
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETED
    - awsDashSdkLib.awsDashSdkLibStrings.PAUSED_ON_FAILURE
    - awsDashSdkLib.awsDashSdkLibStrings.FAILING
    - java.lang.String
  */
  type ReplicationJobState = _ReplicationJobState | java.lang.String
  type ReplicationJobStatusMessage = java.lang.String
  type ReplicationJobTerminated = scala.Boolean
  type ReplicationRunId = java.lang.String
  type ReplicationRunList = js.Array[ReplicationRun]
  type ReplicationRunStage = java.lang.String
  type ReplicationRunStageProgress = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.MISSED
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETED
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - awsDashSdkLib.awsDashSdkLibStrings.DELETED
    - java.lang.String
  */
  type ReplicationRunState = _ReplicationRunState | java.lang.String
  type ReplicationRunStatusMessage = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ON_DEMAND
    - awsDashSdkLib.awsDashSdkLibStrings.AUTOMATIC
    - java.lang.String
  */
  type ReplicationRunType = _ReplicationRunType | java.lang.String
  type RoleName = java.lang.String
  type RunOnce = scala.Boolean
  type SecurityGroup = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NOT_IMPORTED
    - awsDashSdkLib.awsDashSdkLibStrings.IMPORTING
    - awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE
    - awsDashSdkLib.awsDashSdkLibStrings.DELETED
    - awsDashSdkLib.awsDashSdkLibStrings.EXPIRED
    - java.lang.String
  */
  type ServerCatalogStatus = _ServerCatalogStatus | java.lang.String
  type ServerGroupId = java.lang.String
  type ServerGroupLaunchConfigurations = js.Array[ServerGroupLaunchConfiguration]
  type ServerGroupName = java.lang.String
  type ServerGroupReplicationConfigurations = js.Array[ServerGroupReplicationConfiguration]
  type ServerGroups = js.Array[ServerGroup]
  type ServerId = java.lang.String
  type ServerLaunchConfigurations = js.Array[ServerLaunchConfiguration]
  type ServerList = js.Array[Server]
  type ServerReplicationConfigurations = js.Array[ServerReplicationConfiguration]
  type ServerType = awsDashSdkLib.awsDashSdkLibStrings.VIRTUAL_MACHINE | java.lang.String
  type StackId = java.lang.String
  type StackName = java.lang.String
  type Subnet = java.lang.String
  type TagKey = java.lang.String
  type TagValue = java.lang.String
  type Tags = js.Array[Tag]
  type Timestamp = stdLib.Date
  type TotalServerGroups = scala.Double
  type TotalServers = scala.Double
  type VPC = java.lang.String
  type VmId = java.lang.String
  type VmManagerId = java.lang.String
  type VmManagerName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.VSPHERE
    - awsDashSdkLib.awsDashSdkLibStrings.SCVMM
    - awsDashSdkLib.awsDashSdkLibStrings.`HYPERV-MANAGER`
    - java.lang.String
  */
  type VmManagerType = _VmManagerType | java.lang.String
  type VmName = java.lang.String
  type VmPath = java.lang.String
  type VmServerAddressList = js.Array[VmServerAddress]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2016-10-24`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
