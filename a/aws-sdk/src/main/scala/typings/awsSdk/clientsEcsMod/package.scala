package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.APPMESH
import typings.awsSdk.awsSdkStrings.CONTAINER_RUNTIME
import typings.awsSdk.awsSdkStrings.ExecuteCommandAgent
import typings.awsSdk.awsSdkStrings.GPU
import typings.awsSdk.awsSdkStrings.PERCENT
import typings.awsSdk.awsSdkStrings.TAGS
import typings.awsSdk.awsSdkStrings.`container-instance`
import typings.awsSdk.awsSdkStrings.containerInsights
import typings.awsSdk.awsSdkStrings.memberOf
import typings.awsSdk.awsSdkStrings.s3_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.STAGING
  - typings.awsSdk.awsSdkStrings.STAGED
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.UPDATED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type AgentUpdateStatus = _AgentUpdateStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type AssignPublicIp = _AssignPublicIp | java.lang.String

type AttachmentDetails = js.Array[KeyValuePair]

type AttachmentStateChanges = js.Array[AttachmentStateChange]

type Attachments = js.Array[Attachment]

type Attributes = js.Array[Attribute]

type Boolean = scala.Boolean

type BoxedBoolean = scala.Boolean

type BoxedInteger = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.X86_64
  - typings.awsSdk.awsSdkStrings.ARM64
  - java.lang.String
*/
type CPUArchitecture = _CPUArchitecture | java.lang.String

type CapacityProviderField = TAGS | java.lang.String

type CapacityProviderFieldList = js.Array[CapacityProviderField]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.INACTIVE
  - java.lang.String
*/
type CapacityProviderStatus = _CapacityProviderStatus | java.lang.String

type CapacityProviderStrategy = js.Array[CapacityProviderStrategyItem]

type CapacityProviderStrategyItemBase = scala.Double

type CapacityProviderStrategyItemWeight = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.DELETE_COMPLETE
  - typings.awsSdk.awsSdkStrings.DELETE_FAILED
  - typings.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.UPDATE_COMPLETE
  - typings.awsSdk.awsSdkStrings.UPDATE_FAILED
  - java.lang.String
*/
type CapacityProviderUpdateStatus = _CapacityProviderUpdateStatus | java.lang.String

type CapacityProviders = js.Array[CapacityProvider]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ATTACHMENTS
  - typings.awsSdk.awsSdkStrings.CONFIGURATIONS
  - typings.awsSdk.awsSdkStrings.SETTINGS
  - typings.awsSdk.awsSdkStrings.STATISTICS
  - typings.awsSdk.awsSdkStrings.TAGS
  - java.lang.String
*/
type ClusterField = _ClusterField | java.lang.String

type ClusterFieldList = js.Array[ClusterField]

type ClusterSettingName = containerInsights | java.lang.String

type ClusterSettings = js.Array[ClusterSetting]

type Clusters = js.Array[Cluster]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EC2
  - typings.awsSdk.awsSdkStrings.FARGATE
  - typings.awsSdk.awsSdkStrings.EXTERNAL
  - java.lang.String
*/
type Compatibility = _Compatibility | java.lang.String

type CompatibilityList = js.Array[Compatibility]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CONNECTED
  - typings.awsSdk.awsSdkStrings.DISCONNECTED
  - java.lang.String
*/
type Connectivity = _Connectivity | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.START
  - typings.awsSdk.awsSdkStrings.COMPLETE
  - typings.awsSdk.awsSdkStrings.SUCCESS
  - typings.awsSdk.awsSdkStrings.HEALTHY
  - java.lang.String
*/
type ContainerCondition = _ContainerCondition | java.lang.String

type ContainerDefinitions = js.Array[ContainerDefinition]

type ContainerDependencies = js.Array[ContainerDependency]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TAGS
  - typings.awsSdk.awsSdkStrings.CONTAINER_INSTANCE_HEALTH
  - java.lang.String
*/
type ContainerInstanceField = _ContainerInstanceField | java.lang.String

type ContainerInstanceFieldList = js.Array[ContainerInstanceField]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DRAINING
  - typings.awsSdk.awsSdkStrings.REGISTERING
  - typings.awsSdk.awsSdkStrings.DEREGISTERING
  - typings.awsSdk.awsSdkStrings.REGISTRATION_FAILED
  - java.lang.String
*/
type ContainerInstanceStatus = _ContainerInstanceStatus | java.lang.String

type ContainerInstances = js.Array[ContainerInstance]

type ContainerOverrides = js.Array[ContainerOverride]

type ContainerStateChanges = js.Array[ContainerStateChange]

type Containers = js.Array[Container]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ECS
  - typings.awsSdk.awsSdkStrings.CODE_DEPLOY
  - typings.awsSdk.awsSdkStrings.EXTERNAL
  - java.lang.String
*/
type DeploymentControllerType = _DeploymentControllerType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - java.lang.String
*/
type DeploymentRolloutState = _DeploymentRolloutState | java.lang.String

type Deployments = js.Array[Deployment]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.STOPPED
  - java.lang.String
*/
type DesiredStatus = _DesiredStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.read_
  - typings.awsSdk.awsSdkStrings.write_
  - typings.awsSdk.awsSdkStrings.mknod_
  - java.lang.String
*/
type DeviceCgroupPermission = _DeviceCgroupPermission | java.lang.String

type DeviceCgroupPermissions = js.Array[DeviceCgroupPermission]

type DevicesList = js.Array[Device]

type DockerLabelsMap = StringDictionary[String]

type Double = scala.Double

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

type EnvironmentFileType = s3_ | java.lang.String

type EnvironmentFiles = js.Array[EnvironmentFile]

type EnvironmentVariables = js.Array[KeyValuePair]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.DEFAULT
  - typings.awsSdk.awsSdkStrings.OVERRIDE
  - java.lang.String
*/
type ExecuteCommandLogging = _ExecuteCommandLogging | java.lang.String

type Failures = js.Array[Failure]

type FirelensConfigurationOptionsMap = StringDictionary[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.fluentd
  - typings.awsSdk.awsSdkStrings.fluentbit
  - java.lang.String
*/
type FirelensConfigurationType = _FirelensConfigurationType | java.lang.String

type GpuIds = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HEALTHY
  - typings.awsSdk.awsSdkStrings.UNHEALTHY
  - typings.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
type HealthStatus = _HealthStatus | java.lang.String

type HostEntryList = js.Array[HostEntry]

type InferenceAcceleratorOverrides = js.Array[InferenceAcceleratorOverride]

type InferenceAccelerators = js.Array[InferenceAccelerator]

type InstanceHealthCheckResultList = js.Array[InstanceHealthCheckResult]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OK
  - typings.awsSdk.awsSdkStrings.IMPAIRED
  - typings.awsSdk.awsSdkStrings.INSUFFICIENT_DATA
  - typings.awsSdk.awsSdkStrings.INITIALIZING
  - java.lang.String
*/
type InstanceHealthCheckState = _InstanceHealthCheckState | java.lang.String

type InstanceHealthCheckType = CONTAINER_RUNTIME | java.lang.String

type Integer = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.host__
  - typings.awsSdk.awsSdkStrings.task__
  - typings.awsSdk.awsSdkStrings.none__
  - java.lang.String
*/
type IpcMode = _IpcMode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EC2
  - typings.awsSdk.awsSdkStrings.FARGATE
  - typings.awsSdk.awsSdkStrings.EXTERNAL
  - java.lang.String
*/
type LaunchType = _LaunchType | java.lang.String

type LoadBalancers = js.Array[LoadBalancer]

type LogConfigurationOptionsMap = StringDictionary[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`json-file`
  - typings.awsSdk.awsSdkStrings.syslog
  - typings.awsSdk.awsSdkStrings.journald
  - typings.awsSdk.awsSdkStrings.gelf
  - typings.awsSdk.awsSdkStrings.fluentd
  - typings.awsSdk.awsSdkStrings.awslogs
  - typings.awsSdk.awsSdkStrings.splunk
  - typings.awsSdk.awsSdkStrings.awsfirelens
  - java.lang.String
*/
type LogDriver = _LogDriver | java.lang.String

type Long = scala.Double

type ManagedAgentName = ExecuteCommandAgent | java.lang.String

type ManagedAgentStateChanges = js.Array[ManagedAgentStateChange]

type ManagedAgents = js.Array[ManagedAgent]

type ManagedScalingInstanceWarmupPeriod = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type ManagedScalingStatus = _ManagedScalingStatus | java.lang.String

type ManagedScalingStepSize = scala.Double

type ManagedScalingTargetCapacity = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type ManagedTerminationProtection = _ManagedTerminationProtection | java.lang.String

type MountPointList = js.Array[MountPoint]

type NetworkBindings = js.Array[NetworkBinding]

type NetworkInterfaces = js.Array[NetworkInterface]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.bridge
  - typings.awsSdk.awsSdkStrings.host__
  - typings.awsSdk.awsSdkStrings.awsvpc_
  - typings.awsSdk.awsSdkStrings.none__
  - java.lang.String
*/
type NetworkMode = _NetworkMode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.WINDOWS_SERVER_2019_FULL
  - typings.awsSdk.awsSdkStrings.WINDOWS_SERVER_2019_CORE
  - typings.awsSdk.awsSdkStrings.WINDOWS_SERVER_2016_FULL
  - typings.awsSdk.awsSdkStrings.WINDOWS_SERVER_2004_CORE
  - typings.awsSdk.awsSdkStrings.WINDOWS_SERVER_2022_CORE
  - typings.awsSdk.awsSdkStrings.WINDOWS_SERVER_2022_FULL
  - typings.awsSdk.awsSdkStrings.WINDOWS_SERVER_20H2_CORE
  - typings.awsSdk.awsSdkStrings.LINUX
  - java.lang.String
*/
type OSFamily = _OSFamily | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.host__
  - typings.awsSdk.awsSdkStrings.task__
  - java.lang.String
*/
type PidMode = _PidMode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.distinctInstance
  - typings.awsSdk.awsSdkStrings.memberOf
  - java.lang.String
*/
type PlacementConstraintType = _PlacementConstraintType | java.lang.String

type PlacementConstraints = js.Array[PlacementConstraint]

type PlacementStrategies = js.Array[PlacementStrategy]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.random__
  - typings.awsSdk.awsSdkStrings.spread_
  - typings.awsSdk.awsSdkStrings.binpack
  - java.lang.String
*/
type PlacementStrategyType = _PlacementStrategyType | java.lang.String

type PlatformDeviceType = GPU | java.lang.String

type PlatformDevices = js.Array[PlatformDevice]

type PortMappingList = js.Array[PortMapping]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TASK_DEFINITION
  - typings.awsSdk.awsSdkStrings.SERVICE
  - typings.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type PropagateTags = _PropagateTags | java.lang.String

type ProxyConfigurationProperties = js.Array[KeyValuePair]

type ProxyConfigurationType = APPMESH | java.lang.String

type RequiresAttributes = js.Array[Attribute]

type ResourceRequirements = js.Array[ResourceRequirement]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GPU
  - typings.awsSdk.awsSdkStrings.InferenceAccelerator
  - java.lang.String
*/
type ResourceType = _ResourceType | java.lang.String

type Resources = js.Array[Resource]

type ScaleUnit = PERCENT | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.REPLICA
  - typings.awsSdk.awsSdkStrings.DAEMON
  - java.lang.String
*/
type SchedulingStrategy = _SchedulingStrategy | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.task__
  - typings.awsSdk.awsSdkStrings.shared__
  - java.lang.String
*/
type Scope = _Scope | java.lang.String

type SecretList = js.Array[Secret]

type SensitiveString = java.lang.String

type ServiceEvents = js.Array[ServiceEvent]

type ServiceField = TAGS | java.lang.String

type ServiceFieldList = js.Array[ServiceField]

type ServiceRegistries = js.Array[ServiceRegistry]

type Services = js.Array[Service]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.serviceLongArnFormat
  - typings.awsSdk.awsSdkStrings.taskLongArnFormat
  - typings.awsSdk.awsSdkStrings.containerInstanceLongArnFormat
  - typings.awsSdk.awsSdkStrings.awsvpcTrunking
  - typings.awsSdk.awsSdkStrings.containerInsights
  - java.lang.String
*/
type SettingName = _SettingName | java.lang.String

type Settings = js.Array[Setting]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ASC
  - typings.awsSdk.awsSdkStrings.DESC
  - java.lang.String
*/
type SortOrder = _SortOrder | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STEADY_STATE
  - typings.awsSdk.awsSdkStrings.STABILIZING
  - java.lang.String
*/
type StabilityStatus = _StabilityStatus | java.lang.String

type Statistics = js.Array[KeyValuePair]

type String = java.lang.String

type StringList = js.Array[String]

type StringMap = StringDictionary[String]

type SystemControls = js.Array[SystemControl]

type TagKey = java.lang.String

type TagKeys = js.Array[TagKey]

type TagValue = java.lang.String

type Tags = js.Array[Tag]

type TargetType = `container-instance` | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.INACTIVE
  - typings.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type TaskDefinitionFamilyStatus = _TaskDefinitionFamilyStatus | java.lang.String

type TaskDefinitionField = TAGS | java.lang.String

type TaskDefinitionFieldList = js.Array[TaskDefinitionField]

type TaskDefinitionPlacementConstraintType = memberOf | java.lang.String

type TaskDefinitionPlacementConstraints = js.Array[TaskDefinitionPlacementConstraint]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.INACTIVE
  - java.lang.String
*/
type TaskDefinitionStatus = _TaskDefinitionStatus | java.lang.String

type TaskField = TAGS | java.lang.String

type TaskFieldList = js.Array[TaskField]

type TaskSetField = TAGS | java.lang.String

type TaskSetFieldList = js.Array[TaskSetField]

type TaskSets = js.Array[TaskSet]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TaskFailedToStart
  - typings.awsSdk.awsSdkStrings.EssentialContainerExited
  - typings.awsSdk.awsSdkStrings.UserInitiated
  - java.lang.String
*/
type TaskStopCode = _TaskStopCode | java.lang.String

type Tasks = js.Array[Task]

type Timestamp = js.Date

type TmpfsList = js.Array[Tmpfs]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.tcp_
  - typings.awsSdk.awsSdkStrings.udp_
  - java.lang.String
*/
type TransportProtocol = _TransportProtocol | java.lang.String

type UlimitList = js.Array[Ulimit]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.core__
  - typings.awsSdk.awsSdkStrings.cpu__
  - typings.awsSdk.awsSdkStrings.data_
  - typings.awsSdk.awsSdkStrings.fsize
  - typings.awsSdk.awsSdkStrings.locks
  - typings.awsSdk.awsSdkStrings.memlock
  - typings.awsSdk.awsSdkStrings.msgqueue
  - typings.awsSdk.awsSdkStrings.nice
  - typings.awsSdk.awsSdkStrings.nofile
  - typings.awsSdk.awsSdkStrings.nproc
  - typings.awsSdk.awsSdkStrings.rss
  - typings.awsSdk.awsSdkStrings.rtprio
  - typings.awsSdk.awsSdkStrings.rttime
  - typings.awsSdk.awsSdkStrings.sigpending
  - typings.awsSdk.awsSdkStrings.stack
  - java.lang.String
*/
type UlimitName = _UlimitName | java.lang.String

type VolumeFromList = js.Array[VolumeFrom]

type VolumeList = js.Array[Volume]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2014-11-13`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
