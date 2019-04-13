package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsEcsMod {
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.STAGING
    - awsDashSdkLib.awsDashSdkLibStrings.STAGED
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATING
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type AgentUpdateStatus = _AgentUpdateStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ENABLED
    - awsDashSdkLib.awsDashSdkLibStrings.DISABLED
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
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.STATISTICS
    - awsDashSdkLib.awsDashSdkLibStrings.TAGS
    - java.lang.String
  */
  type ClusterField = _ClusterField | java.lang.String
  type ClusterFieldList = js.Array[ClusterField]
  type Clusters = js.Array[Cluster]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.EC2
    - awsDashSdkLib.awsDashSdkLibStrings.FARGATE
    - java.lang.String
  */
  type Compatibility = _Compatibility | java.lang.String
  type CompatibilityList = js.Array[Compatibility]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CONNECTED
    - awsDashSdkLib.awsDashSdkLibStrings.DISCONNECTED
    - java.lang.String
  */
  type Connectivity = _Connectivity | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.START
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETE
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCESS
    - awsDashSdkLib.awsDashSdkLibStrings.HEALTHY
    - java.lang.String
  */
  type ContainerCondition = _ContainerCondition | java.lang.String
  type ContainerDefinitions = js.Array[ContainerDefinition]
  type ContainerDependencies = js.Array[ContainerDependency]
  type ContainerInstanceField = awsDashSdkLib.awsDashSdkLibStrings.TAGS | java.lang.String
  type ContainerInstanceFieldList = js.Array[ContainerInstanceField]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.DRAINING
    - java.lang.String
  */
  type ContainerInstanceStatus = _ContainerInstanceStatus | java.lang.String
  type ContainerInstances = js.Array[ContainerInstance]
  type ContainerOverrides = js.Array[ContainerOverride]
  type ContainerStateChanges = js.Array[ContainerStateChange]
  type Containers = js.Array[Container]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ECS
    - awsDashSdkLib.awsDashSdkLibStrings.CODE_DEPLOY
    - awsDashSdkLib.awsDashSdkLibStrings.EXTERNAL
    - java.lang.String
  */
  type DeploymentControllerType = _DeploymentControllerType | java.lang.String
  type Deployments = js.Array[Deployment]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.RUNNING
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.STOPPED
    - java.lang.String
  */
  type DesiredStatus = _DesiredStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.read
    - awsDashSdkLib.awsDashSdkLibStrings.write
    - awsDashSdkLib.awsDashSdkLibStrings.mknod
    - java.lang.String
  */
  type DeviceCgroupPermission = _DeviceCgroupPermission | java.lang.String
  type DeviceCgroupPermissions = js.Array[DeviceCgroupPermission]
  type DevicesList = js.Array[Device]
  type DockerLabelsMap = org.scalablytyped.runtime.StringDictionary[String]
  type Double = scala.Double
  type EnvironmentVariables = js.Array[KeyValuePair]
  type Failures = js.Array[Failure]
  type GpuIds = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.HEALTHY
    - awsDashSdkLib.awsDashSdkLibStrings.UNHEALTHY
    - awsDashSdkLib.awsDashSdkLibStrings.UNKNOWN
    - java.lang.String
  */
  type HealthStatus = _HealthStatus | java.lang.String
  type HostEntryList = js.Array[HostEntry]
  type Integer = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.host
    - awsDashSdkLib.awsDashSdkLibStrings.task
    - awsDashSdkLib.awsDashSdkLibStrings.none
    - java.lang.String
  */
  type IpcMode = _IpcMode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.EC2
    - awsDashSdkLib.awsDashSdkLibStrings.FARGATE
    - java.lang.String
  */
  type LaunchType = _LaunchType | java.lang.String
  type LoadBalancers = js.Array[LoadBalancer]
  type LogConfigurationOptionsMap = org.scalablytyped.runtime.StringDictionary[String]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`json-file`
    - awsDashSdkLib.awsDashSdkLibStrings.syslog
    - awsDashSdkLib.awsDashSdkLibStrings.journald
    - awsDashSdkLib.awsDashSdkLibStrings.gelf
    - awsDashSdkLib.awsDashSdkLibStrings.fluentd
    - awsDashSdkLib.awsDashSdkLibStrings.awslogs
    - awsDashSdkLib.awsDashSdkLibStrings.splunk
    - java.lang.String
  */
  type LogDriver = _LogDriver | java.lang.String
  type Long = scala.Double
  type MountPointList = js.Array[MountPoint]
  type NetworkBindings = js.Array[NetworkBinding]
  type NetworkInterfaces = js.Array[NetworkInterface]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.bridge
    - awsDashSdkLib.awsDashSdkLibStrings.host
    - awsDashSdkLib.awsDashSdkLibStrings.awsvpc
    - awsDashSdkLib.awsDashSdkLibStrings.none
    - java.lang.String
  */
  type NetworkMode = _NetworkMode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.host
    - awsDashSdkLib.awsDashSdkLibStrings.task
    - java.lang.String
  */
  type PidMode = _PidMode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.distinctInstance
    - awsDashSdkLib.awsDashSdkLibStrings.memberOf
    - java.lang.String
  */
  type PlacementConstraintType = _PlacementConstraintType | java.lang.String
  type PlacementConstraints = js.Array[PlacementConstraint]
  type PlacementStrategies = js.Array[PlacementStrategy]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.random
    - awsDashSdkLib.awsDashSdkLibStrings.spread
    - awsDashSdkLib.awsDashSdkLibStrings.binpack
    - java.lang.String
  */
  type PlacementStrategyType = _PlacementStrategyType | java.lang.String
  type PlatformDeviceType = awsDashSdkLib.awsDashSdkLibStrings.GPU | java.lang.String
  type PlatformDevices = js.Array[PlatformDevice]
  type PortMappingList = js.Array[PortMapping]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.TASK_DEFINITION
    - awsDashSdkLib.awsDashSdkLibStrings.SERVICE
    - java.lang.String
  */
  type PropagateTags = _PropagateTags | java.lang.String
  type ProxyConfigurationProperties = js.Array[KeyValuePair]
  type ProxyConfigurationType = awsDashSdkLib.awsDashSdkLibStrings.APPMESH | java.lang.String
  type RequiresAttributes = js.Array[Attribute]
  type ResourceRequirements = js.Array[ResourceRequirement]
  type ResourceType = awsDashSdkLib.awsDashSdkLibStrings.GPU | java.lang.String
  type Resources = js.Array[Resource]
  type ScaleUnit = awsDashSdkLib.awsDashSdkLibStrings.PERCENT | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.REPLICA
    - awsDashSdkLib.awsDashSdkLibStrings.DAEMON
    - java.lang.String
  */
  type SchedulingStrategy = _SchedulingStrategy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.task
    - awsDashSdkLib.awsDashSdkLibStrings.shared
    - java.lang.String
  */
  type Scope = _Scope | java.lang.String
  type SecretList = js.Array[Secret]
  type ServiceEvents = js.Array[ServiceEvent]
  type ServiceField = awsDashSdkLib.awsDashSdkLibStrings.TAGS | java.lang.String
  type ServiceFieldList = js.Array[ServiceField]
  type ServiceRegistries = js.Array[ServiceRegistry]
  type Services = js.Array[Service]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.serviceLongArnFormat
    - awsDashSdkLib.awsDashSdkLibStrings.taskLongArnFormat
    - awsDashSdkLib.awsDashSdkLibStrings.containerInstanceLongArnFormat
    - java.lang.String
  */
  type SettingName = _SettingName | java.lang.String
  type Settings = js.Array[Setting]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ASC
    - awsDashSdkLib.awsDashSdkLibStrings.DESC
    - java.lang.String
  */
  type SortOrder = _SortOrder | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.STEADY_STATE
    - awsDashSdkLib.awsDashSdkLibStrings.STABILIZING
    - java.lang.String
  */
  type StabilityStatus = _StabilityStatus | java.lang.String
  type Statistics = js.Array[KeyValuePair]
  type String = java.lang.String
  type StringList = js.Array[String]
  type StringMap = org.scalablytyped.runtime.StringDictionary[String]
  type SystemControls = js.Array[SystemControl]
  type TagKey = java.lang.String
  type TagKeys = js.Array[TagKey]
  type TagValue = java.lang.String
  type Tags = js.Array[Tag]
  type TargetType = awsDashSdkLib.awsDashSdkLibStrings.`container-instance` | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.INACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.ALL
    - java.lang.String
  */
  type TaskDefinitionFamilyStatus = _TaskDefinitionFamilyStatus | java.lang.String
  type TaskDefinitionField = awsDashSdkLib.awsDashSdkLibStrings.TAGS | java.lang.String
  type TaskDefinitionFieldList = js.Array[TaskDefinitionField]
  type TaskDefinitionPlacementConstraintType = awsDashSdkLib.awsDashSdkLibStrings.memberOf | java.lang.String
  type TaskDefinitionPlacementConstraints = js.Array[TaskDefinitionPlacementConstraint]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.INACTIVE
    - java.lang.String
  */
  type TaskDefinitionStatus = _TaskDefinitionStatus | java.lang.String
  type TaskField = awsDashSdkLib.awsDashSdkLibStrings.TAGS | java.lang.String
  type TaskFieldList = js.Array[TaskField]
  type TaskSets = js.Array[TaskSet]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.TaskFailedToStart
    - awsDashSdkLib.awsDashSdkLibStrings.EssentialContainerExited
    - awsDashSdkLib.awsDashSdkLibStrings.UserInitiated
    - java.lang.String
  */
  type TaskStopCode = _TaskStopCode | java.lang.String
  type Tasks = js.Array[Task]
  type Timestamp = stdLib.Date
  type TmpfsList = js.Array[Tmpfs]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.tcp
    - awsDashSdkLib.awsDashSdkLibStrings.udp
    - java.lang.String
  */
  type TransportProtocol = _TransportProtocol | java.lang.String
  type UlimitList = js.Array[Ulimit]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.core
    - awsDashSdkLib.awsDashSdkLibStrings.cpu
    - awsDashSdkLib.awsDashSdkLibStrings.data
    - awsDashSdkLib.awsDashSdkLibStrings.fsize
    - awsDashSdkLib.awsDashSdkLibStrings.locks
    - awsDashSdkLib.awsDashSdkLibStrings.memlock
    - awsDashSdkLib.awsDashSdkLibStrings.msgqueue
    - awsDashSdkLib.awsDashSdkLibStrings.nice
    - awsDashSdkLib.awsDashSdkLibStrings.nofile
    - awsDashSdkLib.awsDashSdkLibStrings.nproc
    - awsDashSdkLib.awsDashSdkLibStrings.rss
    - awsDashSdkLib.awsDashSdkLibStrings.rtprio
    - awsDashSdkLib.awsDashSdkLibStrings.rttime
    - awsDashSdkLib.awsDashSdkLibStrings.sigpending
    - awsDashSdkLib.awsDashSdkLibStrings.stack
    - java.lang.String
  */
  type UlimitName = _UlimitName | java.lang.String
  type VolumeFromList = js.Array[VolumeFrom]
  type VolumeList = js.Array[Volume]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2014-11-13`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
