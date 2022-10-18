package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.STRING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ARN = String

type Boolean = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LEGACY_BIOS
  - typings.awsSdk.awsSdkStrings.UEFI
  - java.lang.String
*/
type BootMode = _BootMode | String

type BoundedString = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.READY_FOR_TEST
  - typings.awsSdk.awsSdkStrings.READY_FOR_CUTOVER
  - typings.awsSdk.awsSdkStrings.CUTOVER
  - java.lang.String
*/
type ChangeServerLifeCycleStateSourceServerLifecycleState = _ChangeServerLifeCycleStateSourceServerLifecycleState | String

type CloudWatchLogGroupName = String

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
  - typings.awsSdk.awsSdkStrings.UNSUPPORTED_VM_CONFIGURATION
  - typings.awsSdk.awsSdkStrings.LAST_SNAPSHOT_JOB_FAILED
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
  - typings.awsSdk.awsSdkStrings.PENDING_SNAPSHOT_SHIPPING
  - typings.awsSdk.awsSdkStrings.SHIPPING_SNAPSHOT
  - java.lang.String
*/
type DataReplicationState = _DataReplicationState | String

type DescribeJobsRequestFiltersJobIDs = js.Array[JobID]

type DescribeSourceServersRequestFiltersIDs = js.Array[SourceServerID]

type Disks = js.Array[Disk]

type EC2InstanceID = String

type EC2InstanceType = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.WAITING
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.UNKNOWN
  - typings.awsSdk.awsSdkStrings.STOPPED
  - java.lang.String
*/
type FirstBoot = _FirstBoot | String

type IPsList = js.Array[BoundedString]

type ISO8601DatetimeString = String

type ISO8601DurationString = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.START_TEST
  - typings.awsSdk.awsSdkStrings.START_CUTOVER
  - typings.awsSdk.awsSdkStrings.DIAGNOSTIC
  - typings.awsSdk.awsSdkStrings.TERMINATE
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
  - java.lang.String
*/
type JobType = _JobType | String

type JobsList = js.Array[Job]

type LargeBoundedString = String

type LaunchConfigurationTemplateID = String

type LaunchConfigurationTemplateIDs = js.Array[LaunchConfigurationTemplateID]

type LaunchConfigurationTemplates = js.Array[LaunchConfigurationTemplate]

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

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STOPPED
  - typings.awsSdk.awsSdkStrings.NOT_READY
  - typings.awsSdk.awsSdkStrings.READY_FOR_TEST
  - typings.awsSdk.awsSdkStrings.TESTING
  - typings.awsSdk.awsSdkStrings.READY_FOR_CUTOVER
  - typings.awsSdk.awsSdkStrings.CUTTING_OVER
  - typings.awsSdk.awsSdkStrings.CUTOVER
  - typings.awsSdk.awsSdkStrings.DISCONNECTED
  - typings.awsSdk.awsSdkStrings.DISCOVERED
  - java.lang.String
*/
type LifeCycleState = _LifeCycleState | String

type LifeCycleStates = js.Array[LifeCycleState]

type NetworkInterfaces = js.Array[NetworkInterface]

type PaginationToken = String

type ParticipatingServers = js.Array[ParticipatingServer]

type PositiveInteger = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.SUCCESS
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type PostLaunchActionExecutionStatus = _PostLaunchActionExecutionStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TEST_AND_CUTOVER
  - typings.awsSdk.awsSdkStrings.CUTOVER_ONLY
  - java.lang.String
*/
type PostLaunchActionsDeploymentType = _PostLaunchActionsDeploymentType | String

type PostLaunchActionsLaunchStatusList = js.Array[JobPostLaunchActionsLaunchStatus]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PRIVATE_IP
  - typings.awsSdk.awsSdkStrings.PUBLIC_IP
  - java.lang.String
*/
type ReplicationConfigurationDataPlaneRouting = _ReplicationConfigurationDataPlaneRouting | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GP2
  - typings.awsSdk.awsSdkStrings.ST1
  - typings.awsSdk.awsSdkStrings.GP3
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
  - typings.awsSdk.awsSdkStrings.IO1
  - typings.awsSdk.awsSdkStrings.SC1
  - typings.awsSdk.awsSdkStrings.ST1
  - typings.awsSdk.awsSdkStrings.STANDARD
  - typings.awsSdk.awsSdkStrings.GP3
  - typings.awsSdk.awsSdkStrings.IO2
  - java.lang.String
*/
type ReplicationConfigurationReplicatedDiskStagingDiskType = _ReplicationConfigurationReplicatedDiskStagingDiskType | String

type ReplicationConfigurationReplicatedDisks = js.Array[ReplicationConfigurationReplicatedDisk]

type ReplicationConfigurationTemplateID = String

type ReplicationConfigurationTemplateIDs = js.Array[ReplicationConfigurationTemplateID]

type ReplicationConfigurationTemplates = js.Array[ReplicationConfigurationTemplate]

type ReplicationServersSecurityGroupsIDs = js.Array[SecurityGroupID]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AGENT_BASED
  - typings.awsSdk.awsSdkStrings.SNAPSHOT_SHIPPING
  - java.lang.String
*/
type ReplicationType = _ReplicationType | String

type ReplicationTypes = js.Array[ReplicationType]

type S3LogBucketName = String

type SecurityGroupID = String

type SmallBoundedString = String

type SourceServerID = String

type SourceServersList = js.Array[SourceServer]

type SsmDocumentName = String

type SsmDocumentParameterName = String

type SsmDocumentParameters = StringDictionary[SsmParameterStoreParameters]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AUTOMATION
  - typings.awsSdk.awsSdkStrings.COMMAND
  - java.lang.String
*/
type SsmDocumentType = _SsmDocumentType | String

type SsmDocuments = js.Array[SsmDocument]

type SsmParameterStoreParameterName = String

type SsmParameterStoreParameterType = STRING | String

type SsmParameterStoreParameters = js.Array[SsmParameterStoreParameter]

type StartCutoverRequestSourceServerIDs = js.Array[SourceServerID]

type StartTestRequestSourceServerIDs = js.Array[SourceServerID]

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

type TerminateTargetInstancesRequestSourceServerIDs = js.Array[SourceServerID]

type VcenterClientID = String

type VcenterClientList = js.Array[VcenterClient]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2020-02-26`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
