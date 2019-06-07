package typings
package awsDashSdkLib.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterTaskDefinitionRequest extends js.Object {
  /**
    * A list of container definitions in JSON format that describe the different containers that make up your task.
    */
  var containerDefinitions: ContainerDefinitions
  /**
    * The number of CPU units used by the task. It can be expressed as an integer using CPU units, for example 1024, or as a string using vCPUs, for example 1 vCPU or 1 vcpu, in a task definition. String values are converted to an integer indicating the CPU units when the task definition is registered.  Task-level CPU and memory parameters are ignored for Windows containers. We recommend specifying container-level resources for Windows containers.  If you are using the EC2 launch type, this field is optional. Supported values are between 128 CPU units (0.125 vCPUs) and 10240 CPU units (10 vCPUs). If you are using the Fargate launch type, this field is required and you must use one of the following values, which determines your range of supported values for the memory parameter:   256 (.25 vCPU) - Available memory values: 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB)   512 (.5 vCPU) - Available memory values: 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB)   1024 (1 vCPU) - Available memory values: 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB)   2048 (2 vCPU) - Available memory values: Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB)   4096 (4 vCPU) - Available memory values: Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB)  
    */
  var cpu: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the task execution role that the Amazon ECS container agent and the Docker daemon can assume.
    */
  var executionRoleArn: js.UndefOr[String] = js.undefined
  /**
    * You must specify a family for a task definition, which allows you to track multiple versions of the same task definition. The family is used as a name for your task definition. Up to 255 letters (uppercase and lowercase), numbers, and hyphens are allowed.
    */
  var family: String
  /**
    * The IPC resource namespace to use for the containers in the task. The valid values are host, task, or none. If host is specified, then all containers within the tasks that specified the host IPC mode on the same container instance share the same IPC resources with the host Amazon EC2 instance. If task is specified, all containers within the specified task share the same IPC resources. If none is specified, then IPC resources within the containers of a task are private and not shared with other containers in a task or on the container instance. If no value is specified, then the IPC resource namespace sharing depends on the Docker daemon setting on the container instance. For more information, see IPC settings in the Docker run reference. If the host IPC mode is used, be aware that there is a heightened risk of undesired IPC namespace expose. For more information, see Docker security. If you are setting namespaced kernel parameters using systemControls for the containers in the task, the following will apply to your IPC resource namespace. For more information, see System Controls in the Amazon Elastic Container Service Developer Guide.   For tasks that use the host IPC mode, IPC namespace related systemControls are not supported.   For tasks that use the task IPC mode, IPC namespace related systemControls will apply to all containers within a task.    This parameter is not supported for Windows containers or tasks using the Fargate launch type. 
    */
  var ipcMode: js.UndefOr[IpcMode] = js.undefined
  /**
    * The amount of memory (in MiB) used by the task. It can be expressed as an integer using MiB, for example 1024, or as a string using GB, for example 1GB or 1 GB, in a task definition. String values are converted to an integer indicating the MiB when the task definition is registered.  Task-level CPU and memory parameters are ignored for Windows containers. We recommend specifying container-level resources for Windows containers.  If using the EC2 launch type, this field is optional. If using the Fargate launch type, this field is required and you must use one of the following values, which determines your range of supported values for the cpu parameter:   512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available cpu values: 256 (.25 vCPU)   1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available cpu values: 512 (.5 vCPU)   2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB) - Available cpu values: 1024 (1 vCPU)   Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB) - Available cpu values: 2048 (2 vCPU)   Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB) - Available cpu values: 4096 (4 vCPU)  
    */
  var memory: js.UndefOr[String] = js.undefined
  /**
    * The Docker networking mode to use for the containers in the task. The valid values are none, bridge, awsvpc, and host. The default Docker network mode is bridge. If you are using the Fargate launch type, the awsvpc network mode is required. If you are using the EC2 launch type, any network mode can be used. If the network mode is set to none, you cannot specify port mappings in your container definitions, and the tasks containers do not have external connectivity. The host and awsvpc network modes offer the highest networking performance for containers because they use the EC2 network stack instead of the virtualized network stack provided by the bridge mode. With the host and awsvpc network modes, exposed container ports are mapped directly to the corresponding host port (for the host network mode) or the attached elastic network interface port (for the awsvpc network mode), so you cannot take advantage of dynamic host port mappings.  If the network mode is awsvpc, the task is allocated an elastic network interface, and you must specify a NetworkConfiguration value when you create a service or run a task with the task definition. For more information, see Task Networking in the Amazon Elastic Container Service Developer Guide.  Currently, only Amazon ECS-optimized AMIs, other Amazon Linux variants with the ecs-init package, or AWS Fargate infrastructure support the awsvpc network mode.   If the network mode is host, you cannot run multiple instantiations of the same task on a single container instance when port mappings are used. Docker for Windows uses different network modes than Docker for Linux. When you register a task definition with Windows containers, you must not specify a network mode. If you use the console to register a task definition with Windows containers, you must choose the &lt;default&gt; network mode object.  For more information, see Network settings in the Docker run reference.
    */
  var networkMode: js.UndefOr[NetworkMode] = js.undefined
  /**
    * The process namespace to use for the containers in the task. The valid values are host or task. If host is specified, then all containers within the tasks that specified the host PID mode on the same container instance share the same IPC resources with the host Amazon EC2 instance. If task is specified, all containers within the specified task share the same process namespace. If no value is specified, the default is a private namespace. For more information, see PID settings in the Docker run reference. If the host PID mode is used, be aware that there is a heightened risk of undesired process namespace expose. For more information, see Docker security.  This parameter is not supported for Windows containers or tasks using the Fargate launch type. 
    */
  var pidMode: js.UndefOr[PidMode] = js.undefined
  /**
    * An array of placement constraint objects to use for the task. You can specify a maximum of 10 constraints per task (this limit includes constraints in the task definition and those specified at runtime).
    */
  var placementConstraints: js.UndefOr[TaskDefinitionPlacementConstraints] = js.undefined
  var proxyConfiguration: js.UndefOr[ProxyConfiguration] = js.undefined
  /**
    * The launch type required by the task. If no value is specified, it defaults to EC2.
    */
  var requiresCompatibilities: js.UndefOr[CompatibilityList] = js.undefined
  /**
    * The metadata that you apply to the task definition to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters.
    */
  var tags: js.UndefOr[Tags] = js.undefined
  /**
    * The short name or full Amazon Resource Name (ARN) of the IAM role that containers in this task can assume. All containers in this task are granted the permissions that are specified in this role. For more information, see IAM Roles for Tasks in the Amazon Elastic Container Service Developer Guide.
    */
  var taskRoleArn: js.UndefOr[String] = js.undefined
  /**
    * A list of volume definitions in JSON format that containers in your task may use.
    */
  var volumes: js.UndefOr[VolumeList] = js.undefined
}

object RegisterTaskDefinitionRequest {
  @scala.inline
  def apply(
    containerDefinitions: ContainerDefinitions,
    family: String,
    cpu: String = null,
    executionRoleArn: String = null,
    ipcMode: IpcMode = null,
    memory: String = null,
    networkMode: NetworkMode = null,
    pidMode: PidMode = null,
    placementConstraints: TaskDefinitionPlacementConstraints = null,
    proxyConfiguration: ProxyConfiguration = null,
    requiresCompatibilities: CompatibilityList = null,
    tags: Tags = null,
    taskRoleArn: String = null,
    volumes: VolumeList = null
  ): RegisterTaskDefinitionRequest = {
    val __obj = js.Dynamic.literal(containerDefinitions = containerDefinitions, family = family)
    if (cpu != null) __obj.updateDynamic("cpu")(cpu)
    if (executionRoleArn != null) __obj.updateDynamic("executionRoleArn")(executionRoleArn)
    if (ipcMode != null) __obj.updateDynamic("ipcMode")(ipcMode.asInstanceOf[js.Any])
    if (memory != null) __obj.updateDynamic("memory")(memory)
    if (networkMode != null) __obj.updateDynamic("networkMode")(networkMode.asInstanceOf[js.Any])
    if (pidMode != null) __obj.updateDynamic("pidMode")(pidMode.asInstanceOf[js.Any])
    if (placementConstraints != null) __obj.updateDynamic("placementConstraints")(placementConstraints)
    if (proxyConfiguration != null) __obj.updateDynamic("proxyConfiguration")(proxyConfiguration)
    if (requiresCompatibilities != null) __obj.updateDynamic("requiresCompatibilities")(requiresCompatibilities)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (taskRoleArn != null) __obj.updateDynamic("taskRoleArn")(taskRoleArn)
    if (volumes != null) __obj.updateDynamic("volumes")(volumes)
    __obj.asInstanceOf[RegisterTaskDefinitionRequest]
  }
}

