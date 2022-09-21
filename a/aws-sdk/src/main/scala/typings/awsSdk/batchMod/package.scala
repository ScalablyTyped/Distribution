package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.N_TO_N
  - typings.awsSdk.awsSdkStrings.SEQUENTIAL
  - java.lang.String
*/
type ArrayJobDependency = _ArrayJobDependency | java.lang.String

type ArrayJobStatusSummary = StringDictionary[Integer]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type AssignPublicIp = _AssignPublicIp | java.lang.String

type AttemptDetails = js.Array[AttemptDetail]

type Boolean = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type CEState = _CEState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.DELETED
  - typings.awsSdk.awsSdkStrings.VALID
  - typings.awsSdk.awsSdkStrings.INVALID
  - java.lang.String
*/
type CEStatus = _CEStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MANAGED
  - typings.awsSdk.awsSdkStrings.UNMANAGED
  - java.lang.String
*/
type CEType = _CEType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BEST_FIT
  - typings.awsSdk.awsSdkStrings.BEST_FIT_PROGRESSIVE
  - typings.awsSdk.awsSdkStrings.SPOT_CAPACITY_OPTIMIZED
  - java.lang.String
*/
type CRAllocationStrategy = _CRAllocationStrategy | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EC2
  - typings.awsSdk.awsSdkStrings.SPOT
  - typings.awsSdk.awsSdkStrings.FARGATE
  - typings.awsSdk.awsSdkStrings.FARGATE_SPOT
  - java.lang.String
*/
type CRType = _CRType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BEST_FIT_PROGRESSIVE
  - typings.awsSdk.awsSdkStrings.SPOT_CAPACITY_OPTIMIZED
  - java.lang.String
*/
type CRUpdateAllocationStrategy = _CRUpdateAllocationStrategy | java.lang.String

type ComputeEnvironmentDetailList = js.Array[ComputeEnvironmentDetail]

type ComputeEnvironmentOrders = js.Array[ComputeEnvironmentOrder]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.READ
  - typings.awsSdk.awsSdkStrings.WRITE
  - typings.awsSdk.awsSdkStrings.MKNOD
  - java.lang.String
*/
type DeviceCgroupPermission = _DeviceCgroupPermission | java.lang.String

type DeviceCgroupPermissions = js.Array[DeviceCgroupPermission]

type DevicesList = js.Array[Device]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type EFSAuthorizationConfigIAM = _EFSAuthorizationConfigIAM | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type EFSTransitEncryption = _EFSTransitEncryption | java.lang.String

type Ec2ConfigurationList = js.Array[Ec2Configuration]

type EnvironmentVariables = js.Array[KeyValuePair]

type EvaluateOnExitList = js.Array[EvaluateOnExit]

type Float = Double

type ImageIdOverride = java.lang.String

type ImageType = java.lang.String

type Integer = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type JQState = _JQState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.DELETED
  - typings.awsSdk.awsSdkStrings.VALID
  - typings.awsSdk.awsSdkStrings.INVALID
  - java.lang.String
*/
type JQStatus = _JQStatus | java.lang.String

type JobDefinitionList = js.Array[JobDefinition]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.container_
  - typings.awsSdk.awsSdkStrings.multinode
  - java.lang.String
*/
type JobDefinitionType = _JobDefinitionType | java.lang.String

type JobDependencyList = js.Array[JobDependency]

type JobDetailList = js.Array[JobDetail]

type JobExecutionTimeoutMinutes = Double

type JobQueueDetailList = js.Array[JobQueueDetail]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUBMITTED
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.RUNNABLE
  - typings.awsSdk.awsSdkStrings.STARTING
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type JobStatus = _JobStatus | java.lang.String

type JobSummaryList = js.Array[JobSummary]

type ListJobsFilterList = js.Array[KeyValuesPair]

type LogConfigurationOptionsMap = StringDictionary[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`json-file`
  - typings.awsSdk.awsSdkStrings.syslog
  - typings.awsSdk.awsSdkStrings.journald
  - typings.awsSdk.awsSdkStrings.gelf
  - typings.awsSdk.awsSdkStrings.fluentd
  - typings.awsSdk.awsSdkStrings.awslogs
  - typings.awsSdk.awsSdkStrings.splunk
  - java.lang.String
*/
type LogDriver = _LogDriver | java.lang.String

type Long = Double

type MountPoints = js.Array[MountPoint]

type NetworkInterfaceList = js.Array[NetworkInterface]

type NodePropertyOverrides = js.Array[NodePropertyOverride]

type NodeRangeProperties = js.Array[NodeRangeProperty]

type ParametersMap = StringDictionary[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EC2
  - typings.awsSdk.awsSdkStrings.FARGATE
  - java.lang.String
*/
type PlatformCapability = _PlatformCapability | java.lang.String

type PlatformCapabilityList = js.Array[PlatformCapability]

type ResourceRequirements = js.Array[ResourceRequirement]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GPU
  - typings.awsSdk.awsSdkStrings.VCPU
  - typings.awsSdk.awsSdkStrings.MEMORY
  - java.lang.String
*/
type ResourceType = _ResourceType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RETRY
  - typings.awsSdk.awsSdkStrings.EXIT
  - java.lang.String
*/
type RetryAction = _RetryAction | java.lang.String

type SchedulingPolicyDetailList = js.Array[SchedulingPolicyDetail]

type SchedulingPolicyListingDetailList = js.Array[SchedulingPolicyListingDetail]

type SecretList = js.Array[Secret]

type ShareAttributesList = js.Array[ShareAttributes]

type String = java.lang.String

type StringList = js.Array[String]

type TagKey = java.lang.String

type TagKeysList = js.Array[TagKey]

type TagValue = java.lang.String

type TagrisTagsMap = StringDictionary[TagValue]

type TagsMap = StringDictionary[String]

type TmpfsList = js.Array[Tmpfs]

type Ulimits = js.Array[Ulimit]

type Volumes = js.Array[Volume]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2016-08-10`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
