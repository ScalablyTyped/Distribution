package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsEcsMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.ACTIVE
  import typings.awsDashSdk.awsDashSdkStrings.APPMESH
  import typings.awsDashSdk.awsDashSdkStrings.GPU
  import typings.awsDashSdk.awsDashSdkStrings.PERCENT
  import typings.awsDashSdk.awsDashSdkStrings.TAGS
  import typings.awsDashSdk.awsDashSdkStrings.`container-instance`
  import typings.awsDashSdk.awsDashSdkStrings.containerInsights
  import typings.awsDashSdk.awsDashSdkStrings.memberOf
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.STAGING
    - typings.awsDashSdk.awsDashSdkStrings.STAGED
    - typings.awsDashSdk.awsDashSdkStrings.UPDATING
    - typings.awsDashSdk.awsDashSdkStrings.UPDATED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type AgentUpdateStatus = _AgentUpdateStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
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
  type CapacityProviderField = TAGS | java.lang.String
  type CapacityProviderFieldList = js.Array[CapacityProviderField]
  type CapacityProviderStatus = ACTIVE | java.lang.String
  type CapacityProviderStrategy = js.Array[CapacityProviderStrategyItem]
  type CapacityProviderStrategyItemBase = scala.Double
  type CapacityProviderStrategyItemWeight = scala.Double
  type CapacityProviders = js.Array[CapacityProvider]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ATTACHMENTS
    - typings.awsDashSdk.awsDashSdkStrings.SETTINGS
    - typings.awsDashSdk.awsDashSdkStrings.STATISTICS
    - typings.awsDashSdk.awsDashSdkStrings.TAGS
    - java.lang.String
  */
  type ClusterField = _ClusterField | java.lang.String
  type ClusterFieldList = js.Array[ClusterField]
  type ClusterSettingName = containerInsights | java.lang.String
  type ClusterSettings = js.Array[ClusterSetting]
  type Clusters = js.Array[Cluster]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EC2
    - typings.awsDashSdk.awsDashSdkStrings.FARGATE
    - java.lang.String
  */
  type Compatibility = _Compatibility | java.lang.String
  type CompatibilityList = js.Array[Compatibility]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CONNECTED
    - typings.awsDashSdk.awsDashSdkStrings.DISCONNECTED
    - java.lang.String
  */
  type Connectivity = _Connectivity | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.START
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETE
    - typings.awsDashSdk.awsDashSdkStrings.SUCCESS
    - typings.awsDashSdk.awsDashSdkStrings.HEALTHY
    - java.lang.String
  */
  type ContainerCondition = _ContainerCondition | java.lang.String
  type ContainerDefinitions = js.Array[ContainerDefinition]
  type ContainerDependencies = js.Array[ContainerDependency]
  type ContainerInstanceField = TAGS | java.lang.String
  type ContainerInstanceFieldList = js.Array[ContainerInstanceField]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.DRAINING
    - typings.awsDashSdk.awsDashSdkStrings.REGISTERING
    - typings.awsDashSdk.awsDashSdkStrings.DEREGISTERING
    - typings.awsDashSdk.awsDashSdkStrings.REGISTRATION_FAILED
    - java.lang.String
  */
  type ContainerInstanceStatus = _ContainerInstanceStatus | java.lang.String
  type ContainerInstances = js.Array[ContainerInstance]
  type ContainerOverrides = js.Array[ContainerOverride]
  type ContainerStateChanges = js.Array[ContainerStateChange]
  type Containers = js.Array[Container]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ECS
    - typings.awsDashSdk.awsDashSdkStrings.CODE_DEPLOY
    - typings.awsDashSdk.awsDashSdkStrings.EXTERNAL
    - java.lang.String
  */
  type DeploymentControllerType = _DeploymentControllerType | java.lang.String
  type Deployments = js.Array[Deployment]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.RUNNING
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.STOPPED
    - java.lang.String
  */
  type DesiredStatus = _DesiredStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.read_
    - typings.awsDashSdk.awsDashSdkStrings.write_
    - typings.awsDashSdk.awsDashSdkStrings.mknod_
    - java.lang.String
  */
  type DeviceCgroupPermission = _DeviceCgroupPermission | java.lang.String
  type DeviceCgroupPermissions = js.Array[DeviceCgroupPermission]
  type DevicesList = js.Array[Device]
  type DockerLabelsMap = StringDictionary[String]
  type Double = scala.Double
  type EnvironmentVariables = js.Array[KeyValuePair]
  type Failures = js.Array[Failure]
  type FirelensConfigurationOptionsMap = StringDictionary[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.fluentd
    - typings.awsDashSdk.awsDashSdkStrings.fluentbit
    - java.lang.String
  */
  type FirelensConfigurationType = _FirelensConfigurationType | java.lang.String
  type GpuIds = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.HEALTHY
    - typings.awsDashSdk.awsDashSdkStrings.UNHEALTHY
    - typings.awsDashSdk.awsDashSdkStrings.UNKNOWN
    - java.lang.String
  */
  type HealthStatus = _HealthStatus | java.lang.String
  type HostEntryList = js.Array[HostEntry]
  type InferenceAcceleratorOverrides = js.Array[InferenceAcceleratorOverride]
  type InferenceAccelerators = js.Array[InferenceAccelerator]
  type Integer = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.host_
    - typings.awsDashSdk.awsDashSdkStrings.task_
    - typings.awsDashSdk.awsDashSdkStrings.none__
    - java.lang.String
  */
  type IpcMode = _IpcMode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EC2
    - typings.awsDashSdk.awsDashSdkStrings.FARGATE
    - java.lang.String
  */
  type LaunchType = _LaunchType | java.lang.String
  type LoadBalancers = js.Array[LoadBalancer]
  type LogConfigurationOptionsMap = StringDictionary[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`json-file`
    - typings.awsDashSdk.awsDashSdkStrings.syslog
    - typings.awsDashSdk.awsDashSdkStrings.journald
    - typings.awsDashSdk.awsDashSdkStrings.gelf
    - typings.awsDashSdk.awsDashSdkStrings.fluentd
    - typings.awsDashSdk.awsDashSdkStrings.awslogs
    - typings.awsDashSdk.awsDashSdkStrings.splunk
    - typings.awsDashSdk.awsDashSdkStrings.awsfirelens
    - java.lang.String
  */
  type LogDriver = _LogDriver | java.lang.String
  type Long = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - java.lang.String
  */
  type ManagedScalingStatus = _ManagedScalingStatus | java.lang.String
  type ManagedScalingStepSize = scala.Double
  type ManagedScalingTargetCapacity = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - java.lang.String
  */
  type ManagedTerminationProtection = _ManagedTerminationProtection | java.lang.String
  type MountPointList = js.Array[MountPoint]
  type NetworkBindings = js.Array[NetworkBinding]
  type NetworkInterfaces = js.Array[NetworkInterface]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.bridge
    - typings.awsDashSdk.awsDashSdkStrings.host_
    - typings.awsDashSdk.awsDashSdkStrings.awsvpc_
    - typings.awsDashSdk.awsDashSdkStrings.none__
    - java.lang.String
  */
  type NetworkMode = _NetworkMode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.host_
    - typings.awsDashSdk.awsDashSdkStrings.task_
    - java.lang.String
  */
  type PidMode = _PidMode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.distinctInstance
    - typings.awsDashSdk.awsDashSdkStrings.memberOf
    - java.lang.String
  */
  type PlacementConstraintType = _PlacementConstraintType | java.lang.String
  type PlacementConstraints = js.Array[PlacementConstraint]
  type PlacementStrategies = js.Array[PlacementStrategy]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.random_
    - typings.awsDashSdk.awsDashSdkStrings.spread
    - typings.awsDashSdk.awsDashSdkStrings.binpack
    - java.lang.String
  */
  type PlacementStrategyType = _PlacementStrategyType | java.lang.String
  type PlatformDeviceType = GPU | java.lang.String
  type PlatformDevices = js.Array[PlatformDevice]
  type PortMappingList = js.Array[PortMapping]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TASK_DEFINITION
    - typings.awsDashSdk.awsDashSdkStrings.SERVICE
    - java.lang.String
  */
  type PropagateTags = _PropagateTags | java.lang.String
  type ProxyConfigurationProperties = js.Array[KeyValuePair]
  type ProxyConfigurationType = APPMESH | java.lang.String
  type RequiresAttributes = js.Array[Attribute]
  type ResourceRequirements = js.Array[ResourceRequirement]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.GPU
    - typings.awsDashSdk.awsDashSdkStrings.InferenceAccelerator
    - java.lang.String
  */
  type ResourceType = _ResourceType | java.lang.String
  type Resources = js.Array[Resource]
  type ScaleUnit = PERCENT | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.REPLICA
    - typings.awsDashSdk.awsDashSdkStrings.DAEMON
    - java.lang.String
  */
  type SchedulingStrategy = _SchedulingStrategy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.task_
    - typings.awsDashSdk.awsDashSdkStrings.shared__
    - java.lang.String
  */
  type Scope = _Scope | java.lang.String
  type SecretList = js.Array[Secret]
  type ServiceEvents = js.Array[ServiceEvent]
  type ServiceField = TAGS | java.lang.String
  type ServiceFieldList = js.Array[ServiceField]
  type ServiceRegistries = js.Array[ServiceRegistry]
  type Services = js.Array[Service]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.serviceLongArnFormat
    - typings.awsDashSdk.awsDashSdkStrings.taskLongArnFormat
    - typings.awsDashSdk.awsDashSdkStrings.containerInstanceLongArnFormat
    - typings.awsDashSdk.awsDashSdkStrings.awsvpcTrunking
    - typings.awsDashSdk.awsDashSdkStrings.containerInsights
    - java.lang.String
  */
  type SettingName = _SettingName | java.lang.String
  type Settings = js.Array[Setting]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ASC
    - typings.awsDashSdk.awsDashSdkStrings.DESC
    - java.lang.String
  */
  type SortOrder = _SortOrder | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.STEADY_STATE
    - typings.awsDashSdk.awsDashSdkStrings.STABILIZING
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
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.INACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.ALL
    - java.lang.String
  */
  type TaskDefinitionFamilyStatus = _TaskDefinitionFamilyStatus | java.lang.String
  type TaskDefinitionField = TAGS | java.lang.String
  type TaskDefinitionFieldList = js.Array[TaskDefinitionField]
  type TaskDefinitionPlacementConstraintType = memberOf | java.lang.String
  type TaskDefinitionPlacementConstraints = js.Array[TaskDefinitionPlacementConstraint]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.INACTIVE
    - java.lang.String
  */
  type TaskDefinitionStatus = _TaskDefinitionStatus | java.lang.String
  type TaskField = TAGS | java.lang.String
  type TaskFieldList = js.Array[TaskField]
  type TaskSets = js.Array[TaskSet]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TaskFailedToStart
    - typings.awsDashSdk.awsDashSdkStrings.EssentialContainerExited
    - typings.awsDashSdk.awsDashSdkStrings.UserInitiated
    - java.lang.String
  */
  type TaskStopCode = _TaskStopCode | java.lang.String
  type Tasks = js.Array[Task]
  type Timestamp = Date
  type TmpfsList = js.Array[Tmpfs]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.tcp_
    - typings.awsDashSdk.awsDashSdkStrings.udp_
    - java.lang.String
  */
  type TransportProtocol = _TransportProtocol | java.lang.String
  type UlimitList = js.Array[Ulimit]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.core__
    - typings.awsDashSdk.awsDashSdkStrings.cpu__
    - typings.awsDashSdk.awsDashSdkStrings.data_
    - typings.awsDashSdk.awsDashSdkStrings.fsize
    - typings.awsDashSdk.awsDashSdkStrings.locks
    - typings.awsDashSdk.awsDashSdkStrings.memlock
    - typings.awsDashSdk.awsDashSdkStrings.msgqueue
    - typings.awsDashSdk.awsDashSdkStrings.nice
    - typings.awsDashSdk.awsDashSdkStrings.nofile
    - typings.awsDashSdk.awsDashSdkStrings.nproc
    - typings.awsDashSdk.awsDashSdkStrings.rss
    - typings.awsDashSdk.awsDashSdkStrings.rtprio
    - typings.awsDashSdk.awsDashSdkStrings.rttime
    - typings.awsDashSdk.awsDashSdkStrings.sigpending
    - typings.awsDashSdk.awsDashSdkStrings.stack
    - java.lang.String
  */
  type UlimitName = _UlimitName | java.lang.String
  type VolumeFromList = js.Array[VolumeFrom]
  type VolumeList = js.Array[Volume]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2014-11-13`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
