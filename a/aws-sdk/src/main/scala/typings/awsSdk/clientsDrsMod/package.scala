package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ARN = String

type AccountID = String

type AccountIDs = js.Array[AccountID]

type Accounts = js.Array[Account]

type Boolean = scala.Boolean

type BoundedString = String

type ConversionMap = StringDictionary[ebsSnapshot]

type Cpus = js.Array[CPU]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AGENT_NOT_SEEN
  - typings.awsSdk.awsSdkStrings.SNAPSHOTS_FAILURE
  - typings.awsSdk.awsSdkStrings.NOT_CONVERGING
  - typings.awsSdk.awsSdkStrings.UNSTABLE_NETWORK
  - typings.awsSdk.awsSdkStrings.FAILED_TO_CREATE_SECURITY_GROUP
  - typings.awsSdk.awsSdkStrings.FAILED_TO_LAUNCH_REPLICATION_SERVER
  - typings.awsSdk.awsSdkStrings.FAILED_TO_BOOT_REPLICATION_SERVER
  - typings.awsSdk.awsSdkStrings.FAILED_TO_AUTHENTICATE_WITH_SERVICE
  - typings.awsSdk.awsSdkStrings.FAILED_TO_DOWNLOAD_REPLICATION_SOFTWARE
  - typings.awsSdk.awsSdkStrings.FAILED_TO_CREATE_STAGING_DISKS
  - typings.awsSdk.awsSdkStrings.FAILED_TO_ATTACH_STAGING_DISKS
  - typings.awsSdk.awsSdkStrings.FAILED_TO_PAIR_REPLICATION_SERVER_WITH_AGENT
  - typings.awsSdk.awsSdkStrings.FAILED_TO_CONNECT_AGENT_TO_REPLICATION_SERVER
  - typings.awsSdk.awsSdkStrings.FAILED_TO_START_DATA_TRANSFER
  - java.lang.String
*/
type DataReplicationErrorString = _DataReplicationErrorString | String

type DataReplicationInfoReplicatedDisks = js.Array[DataReplicationInfoReplicatedDisk]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.WAIT
  - typings.awsSdk.awsSdkStrings.CREATE_SECURITY_GROUP
  - typings.awsSdk.awsSdkStrings.LAUNCH_REPLICATION_SERVER
  - typings.awsSdk.awsSdkStrings.BOOT_REPLICATION_SERVER
  - typings.awsSdk.awsSdkStrings.AUTHENTICATE_WITH_SERVICE
  - typings.awsSdk.awsSdkStrings.DOWNLOAD_REPLICATION_SOFTWARE
  - typings.awsSdk.awsSdkStrings.CREATE_STAGING_DISKS
  - typings.awsSdk.awsSdkStrings.ATTACH_STAGING_DISKS
  - typings.awsSdk.awsSdkStrings.PAIR_REPLICATION_SERVER_WITH_AGENT
  - typings.awsSdk.awsSdkStrings.CONNECT_AGENT_TO_REPLICATION_SERVER
  - typings.awsSdk.awsSdkStrings.START_DATA_TRANSFER
  - java.lang.String
*/
type DataReplicationInitiationStepName = _DataReplicationInitiationStepName | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NOT_STARTED
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.SKIPPED
  - java.lang.String
*/
type DataReplicationInitiationStepStatus = _DataReplicationInitiationStepStatus | String

type DataReplicationInitiationSteps = js.Array[DataReplicationInitiationStep]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STOPPED
  - typings.awsSdk.awsSdkStrings.INITIATING
  - typings.awsSdk.awsSdkStrings.INITIAL_SYNC
  - typings.awsSdk.awsSdkStrings.BACKLOG
  - typings.awsSdk.awsSdkStrings.CREATING_SNAPSHOT
  - typings.awsSdk.awsSdkStrings.CONTINUOUS
  - typings.awsSdk.awsSdkStrings.PAUSED
  - typings.awsSdk.awsSdkStrings.RESCAN
  - typings.awsSdk.awsSdkStrings.STALLED
  - typings.awsSdk.awsSdkStrings.DISCONNECTED
  - java.lang.String
*/
type DataReplicationState = _DataReplicationState | String

type DescribeJobsRequestFiltersJobIDs = js.Array[JobID]

type DescribeRecoveryInstancesItems = js.Array[RecoveryInstance]

type DescribeSourceServersRequestFiltersIDs = js.Array[SourceServerID]

type Disks = js.Array[Disk]

type EC2InstanceID = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.STOPPING
  - typings.awsSdk.awsSdkStrings.STOPPED
  - typings.awsSdk.awsSdkStrings.`SHUTTING-DOWN`
  - typings.awsSdk.awsSdkStrings.TERMINATED
  - typings.awsSdk.awsSdkStrings.NOT_FOUND
  - java.lang.String
*/
type EC2InstanceState = _EC2InstanceState | String

type EC2InstanceType = String

type EbsSnapshotsList = js.Array[ebsSnapshot]

type EbsVolumeID = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EXTENDED
  - typings.awsSdk.awsSdkStrings.EXTENSION_ERROR
  - typings.awsSdk.awsSdkStrings.NOT_EXTENDED
  - java.lang.String
*/
type ExtensionStatus = _ExtensionStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AGENT_NOT_SEEN
  - typings.awsSdk.awsSdkStrings.FAILBACK_CLIENT_NOT_SEEN
  - typings.awsSdk.awsSdkStrings.NOT_CONVERGING
  - typings.awsSdk.awsSdkStrings.UNSTABLE_NETWORK
  - typings.awsSdk.awsSdkStrings.FAILED_TO_ESTABLISH_RECOVERY_INSTANCE_COMMUNICATION
  - typings.awsSdk.awsSdkStrings.FAILED_TO_DOWNLOAD_REPLICATION_SOFTWARE_TO_FAILBACK_CLIENT
  - typings.awsSdk.awsSdkStrings.FAILED_TO_CONFIGURE_REPLICATION_SOFTWARE
  - typings.awsSdk.awsSdkStrings.FAILED_TO_PAIR_AGENT_WITH_REPLICATION_SOFTWARE
  - typings.awsSdk.awsSdkStrings.FAILED_TO_ESTABLISH_AGENT_REPLICATOR_SOFTWARE_COMMUNICATION
  - java.lang.String
*/
type FailbackReplicationError = _FailbackReplicationError | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FAILBACK_NOT_STARTED
  - typings.awsSdk.awsSdkStrings.FAILBACK_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.FAILBACK_READY_FOR_LAUNCH
  - typings.awsSdk.awsSdkStrings.FAILBACK_COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILBACK_ERROR
  - java.lang.String
*/
type FailbackState = _FailbackState | String

type IPsList = js.Array[BoundedString]

type ISO8601DatetimeString = String

type ISO8601DurationString = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.START_RECOVERY
  - typings.awsSdk.awsSdkStrings.START_DRILL
  - typings.awsSdk.awsSdkStrings.FAILBACK
  - typings.awsSdk.awsSdkStrings.DIAGNOSTIC
  - typings.awsSdk.awsSdkStrings.TERMINATE_RECOVERY_INSTANCES
  - typings.awsSdk.awsSdkStrings.TARGET_ACCOUNT
  - java.lang.String
*/
type InitiatedBy = _InitiatedBy | String

type JobID = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.JOB_START
  - typings.awsSdk.awsSdkStrings.SERVER_SKIPPED
  - typings.awsSdk.awsSdkStrings.CLEANUP_START
  - typings.awsSdk.awsSdkStrings.CLEANUP_END
  - typings.awsSdk.awsSdkStrings.CLEANUP_FAIL
  - typings.awsSdk.awsSdkStrings.SNAPSHOT_START
  - typings.awsSdk.awsSdkStrings.SNAPSHOT_END
  - typings.awsSdk.awsSdkStrings.SNAPSHOT_FAIL
  - typings.awsSdk.awsSdkStrings.USING_PREVIOUS_SNAPSHOT
  - typings.awsSdk.awsSdkStrings.USING_PREVIOUS_SNAPSHOT_FAILED
  - typings.awsSdk.awsSdkStrings.CONVERSION_START
  - typings.awsSdk.awsSdkStrings.CONVERSION_END
  - typings.awsSdk.awsSdkStrings.CONVERSION_FAIL
  - typings.awsSdk.awsSdkStrings.LAUNCH_START
  - typings.awsSdk.awsSdkStrings.LAUNCH_FAILED
  - typings.awsSdk.awsSdkStrings.JOB_CANCEL
  - typings.awsSdk.awsSdkStrings.JOB_END
  - java.lang.String
*/
type JobLogEvent = _JobLogEvent | String

type JobLogs = js.Array[JobLog]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.STARTED
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - java.lang.String
*/
type JobStatus = _JobStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LAUNCH
  - typings.awsSdk.awsSdkStrings.TERMINATE
  - typings.awsSdk.awsSdkStrings.CREATE_CONVERTED_SNAPSHOT
  - java.lang.String
*/
type JobType = _JobType | String

type JobsList = js.Array[Job]

type LargeBoundedString = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NOT_STARTED
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type LastLaunchResult = _LastLaunchResult | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RECOVERY
  - typings.awsSdk.awsSdkStrings.DRILL
  - java.lang.String
*/
type LastLaunchType = _LastLaunchType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STOPPED
  - typings.awsSdk.awsSdkStrings.STARTED
  - java.lang.String
*/
type LaunchDisposition = _LaunchDisposition | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.LAUNCHED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.TERMINATED
  - java.lang.String
*/
type LaunchStatus = _LaunchStatus | String

type ListStagingAccountsRequestMaxResultsInteger = Double

type MaxResultsReplicatingSourceServers = Double

type NetworkInterfaces = js.Array[NetworkInterface]

type PITPolicy = js.Array[PITPolicyRule]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MINUTE
  - typings.awsSdk.awsSdkStrings.HOUR
  - typings.awsSdk.awsSdkStrings.DAY
  - java.lang.String
*/
type PITPolicyRuleUnits = _PITPolicyRuleUnits | String

type PaginationToken = String

type ParticipatingServers = js.Array[ParticipatingServer]

type PositiveInteger = Double

type RecoveryInstanceDataReplicationInfoReplicatedDisks = js.Array[RecoveryInstanceDataReplicationInfoReplicatedDisk]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LINK_FAILBACK_CLIENT_WITH_RECOVERY_INSTANCE
  - typings.awsSdk.awsSdkStrings.COMPLETE_VOLUME_MAPPING
  - typings.awsSdk.awsSdkStrings.ESTABLISH_RECOVERY_INSTANCE_COMMUNICATION
  - typings.awsSdk.awsSdkStrings.DOWNLOAD_REPLICATION_SOFTWARE_TO_FAILBACK_CLIENT
  - typings.awsSdk.awsSdkStrings.CONFIGURE_REPLICATION_SOFTWARE
  - typings.awsSdk.awsSdkStrings.PAIR_AGENT_WITH_REPLICATION_SOFTWARE
  - typings.awsSdk.awsSdkStrings.ESTABLISH_AGENT_REPLICATOR_SOFTWARE_COMMUNICATION
  - java.lang.String
*/
type RecoveryInstanceDataReplicationInitiationStepName = _RecoveryInstanceDataReplicationInitiationStepName | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NOT_STARTED
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.SKIPPED
  - java.lang.String
*/
type RecoveryInstanceDataReplicationInitiationStepStatus = _RecoveryInstanceDataReplicationInitiationStepStatus | String

type RecoveryInstanceDataReplicationInitiationSteps = js.Array[RecoveryInstanceDataReplicationInitiationStep]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STOPPED
  - typings.awsSdk.awsSdkStrings.INITIATING
  - typings.awsSdk.awsSdkStrings.INITIAL_SYNC
  - typings.awsSdk.awsSdkStrings.BACKLOG
  - typings.awsSdk.awsSdkStrings.CREATING_SNAPSHOT
  - typings.awsSdk.awsSdkStrings.CONTINUOUS
  - typings.awsSdk.awsSdkStrings.PAUSED
  - typings.awsSdk.awsSdkStrings.RESCAN
  - typings.awsSdk.awsSdkStrings.STALLED
  - typings.awsSdk.awsSdkStrings.DISCONNECTED
  - java.lang.String
*/
type RecoveryInstanceDataReplicationState = _RecoveryInstanceDataReplicationState | String

type RecoveryInstanceDisks = js.Array[RecoveryInstanceDisk]

type RecoveryInstanceID = String

type RecoveryInstanceIDs = js.Array[RecoveryInstanceID]

type RecoveryInstancesForTerminationRequest = js.Array[RecoveryInstanceID]

type RecoverySnapshotID = String

type RecoverySnapshotsList = js.Array[RecoverySnapshot]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ASC
  - typings.awsSdk.awsSdkStrings.DESC
  - java.lang.String
*/
type RecoverySnapshotsOrder = _RecoverySnapshotsOrder | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PRIVATE_IP
  - typings.awsSdk.awsSdkStrings.PUBLIC_IP
  - java.lang.String
*/
type ReplicationConfigurationDataPlaneRouting = _ReplicationConfigurationDataPlaneRouting | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GP2
  - typings.awsSdk.awsSdkStrings.GP3
  - typings.awsSdk.awsSdkStrings.ST1
  - typings.awsSdk.awsSdkStrings.AUTO
  - java.lang.String
*/
type ReplicationConfigurationDefaultLargeStagingDiskType = _ReplicationConfigurationDefaultLargeStagingDiskType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DEFAULT
  - typings.awsSdk.awsSdkStrings.CUSTOM
  - java.lang.String
*/
type ReplicationConfigurationEbsEncryption = _ReplicationConfigurationEbsEncryption | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AUTO
  - typings.awsSdk.awsSdkStrings.GP2
  - typings.awsSdk.awsSdkStrings.GP3
  - typings.awsSdk.awsSdkStrings.IO1
  - typings.awsSdk.awsSdkStrings.SC1
  - typings.awsSdk.awsSdkStrings.ST1
  - typings.awsSdk.awsSdkStrings.STANDARD
  - java.lang.String
*/
type ReplicationConfigurationReplicatedDiskStagingDiskType = _ReplicationConfigurationReplicatedDiskStagingDiskType | String

type ReplicationConfigurationReplicatedDisks = js.Array[ReplicationConfigurationReplicatedDisk]

type ReplicationConfigurationTemplateID = String

type ReplicationConfigurationTemplateIDs = js.Array[ReplicationConfigurationTemplateID]

type ReplicationConfigurationTemplates = js.Array[ReplicationConfigurationTemplate]

type ReplicationServersSecurityGroupsIDs = js.Array[SecurityGroupID]

type SecurityGroupID = String

type SmallBoundedString = String

type SourceServerARN = String

type SourceServerID = String

type SourceServerIDs = js.Array[SourceServerID]

type SourceServersList = js.Array[SourceServer]

type StagingSourceServersList = js.Array[StagingSourceServer]

type StartFailbackRequestRecoveryInstanceIDs = js.Array[RecoveryInstanceID]

type StartRecoveryRequestSourceServers = js.Array[StartRecoveryRequestSourceServer]

type StrictlyPositiveInteger = Double

type SubnetID = String

type TagKey = String

type TagKeys = js.Array[TagKey]

type TagValue = String

type TagsMap = StringDictionary[TagValue]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.BASIC
  - java.lang.String
*/
type TargetInstanceTypeRightSizingMethod = _TargetInstanceTypeRightSizingMethod | String

type VolumeToConversionMap = StringDictionary[ConversionMap]

type VolumeToSizeMap = StringDictionary[PositiveInteger]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2020-02-26`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

type ebsSnapshot = String
