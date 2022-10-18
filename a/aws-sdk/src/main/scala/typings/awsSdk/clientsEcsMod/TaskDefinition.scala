package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskDefinition extends StObject {
  
  /**
    * The task launch types the task definition validated against during task definition registration. For more information, see Amazon ECS launch types in the Amazon Elastic Container Service Developer Guide.
    */
  var compatibilities: js.UndefOr[CompatibilityList] = js.undefined
  
  /**
    * A list of container definitions in JSON format that describe the different containers that make up your task. For more information about container definition parameters and defaults, see Amazon ECS Task Definitions in the Amazon Elastic Container Service Developer Guide.
    */
  var containerDefinitions: js.UndefOr[ContainerDefinitions] = js.undefined
  
  /**
    * The number of cpu units used by the task. If you use the EC2 launch type, this field is optional. Any value can be used. If you use the Fargate launch type, this field is required. You must use one of the following values. The value that you choose determines your range of valid values for the memory parameter. The CPU units cannot be less than 1 vCPU when you use Windows containers on Fargate.   256 (.25 vCPU) - Available memory values: 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB)   512 (.5 vCPU) - Available memory values: 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB)   1024 (1 vCPU) - Available memory values: 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB)   2048 (2 vCPU) - Available memory values: 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB)   4096 (4 vCPU) - Available memory values: 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB)   8192 (8 vCPU) - Available memory values: 16 GB and 60 GB in 4 GB increments This option requires Linux platform 1.4.0 or later.   16384 (16vCPU) - Available memory values: 32GB and 120 GB in 8 GB increments This option requires Linux platform 1.4.0 or later.  
    */
  var cpu: js.UndefOr[String] = js.undefined
  
  /**
    * The Unix timestamp for the time when the task definition was deregistered.
    */
  var deregisteredAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ephemeral storage settings to use for tasks run with the task definition.
    */
  var ephemeralStorage: js.UndefOr[EphemeralStorage] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the task execution role that grants the Amazon ECS container agent permission to make Amazon Web Services API calls on your behalf. The task execution IAM role is required depending on the requirements of your task. For more information, see Amazon ECS task execution IAM role in the Amazon Elastic Container Service Developer Guide.
    */
  var executionRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of a family that this task definition is registered to. Up to 255 characters are allowed. Letters (both uppercase and lowercase letters), numbers, hyphens (-), and underscores (_) are allowed. A family groups multiple versions of a task definition. Amazon ECS gives the first task definition that you registered to a family a revision number of 1. Amazon ECS gives sequential revision numbers to each task definition that you add.
    */
  var family: js.UndefOr[String] = js.undefined
  
  /**
    * The Elastic Inference accelerator that's associated with the task.
    */
  var inferenceAccelerators: js.UndefOr[InferenceAccelerators] = js.undefined
  
  /**
    * The IPC resource namespace to use for the containers in the task. The valid values are host, task, or none. If host is specified, then all containers within the tasks that specified the host IPC mode on the same container instance share the same IPC resources with the host Amazon EC2 instance. If task is specified, all containers within the specified task share the same IPC resources. If none is specified, then IPC resources within the containers of a task are private and not shared with other containers in a task or on the container instance. If no value is specified, then the IPC resource namespace sharing depends on the Docker daemon setting on the container instance. For more information, see IPC settings in the Docker run reference. If the host IPC mode is used, be aware that there is a heightened risk of undesired IPC namespace expose. For more information, see Docker security. If you are setting namespaced kernel parameters using systemControls for the containers in the task, the following will apply to your IPC resource namespace. For more information, see System Controls in the Amazon Elastic Container Service Developer Guide.   For tasks that use the host IPC mode, IPC namespace related systemControls are not supported.   For tasks that use the task IPC mode, IPC namespace related systemControls will apply to all containers within a task.    This parameter is not supported for Windows containers or tasks run on Fargate. 
    */
  var ipcMode: js.UndefOr[IpcMode] = js.undefined
  
  /**
    * The amount (in MiB) of memory used by the task. If your tasks runs on Amazon EC2 instances, you must specify either a task-level memory value or a container-level memory value. This field is optional and any value can be used. If a task-level memory value is specified, the container-level memory value is optional. For more information regarding container-level memory and memory reservation, see ContainerDefinition. If your tasks runs on Fargate, this field is required. You must use one of the following values. The value you choose determines your range of valid values for the cpu parameter.   512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available cpu values: 256 (.25 vCPU)   1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available cpu values: 512 (.5 vCPU)   2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB) - Available cpu values: 1024 (1 vCPU)   Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB) - Available cpu values: 2048 (2 vCPU)   Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB) - Available cpu values: 4096 (4 vCPU)   Between 16 GB and 60 GB in 4 GB increments - Available cpu values: 8192 (8 vCPU) This option requires Linux platform 1.4.0 or later.   Between 32GB and 120 GB in 8 GB increments - Available cpu values: 16384 (16 vCPU) This option requires Linux platform 1.4.0 or later.  
    */
  var memory: js.UndefOr[String] = js.undefined
  
  /**
    * The Docker networking mode to use for the containers in the task. The valid values are none, bridge, awsvpc, and host. If no network mode is specified, the default is bridge. For Amazon ECS tasks on Fargate, the awsvpc network mode is required. For Amazon ECS tasks on Amazon EC2 Linux instances, any network mode can be used. For Amazon ECS tasks on Amazon EC2 Windows instances, &lt;default&gt; or awsvpc can be used. If the network mode is set to none, you cannot specify port mappings in your container definitions, and the tasks containers do not have external connectivity. The host and awsvpc network modes offer the highest networking performance for containers because they use the EC2 network stack instead of the virtualized network stack provided by the bridge mode. With the host and awsvpc network modes, exposed container ports are mapped directly to the corresponding host port (for the host network mode) or the attached elastic network interface port (for the awsvpc network mode), so you cannot take advantage of dynamic host port mappings.   When using the host network mode, you should not run containers using the root user (UID 0). It is considered best practice to use a non-root user.  If the network mode is awsvpc, the task is allocated an elastic network interface, and you must specify a NetworkConfiguration value when you create a service or run a task with the task definition. For more information, see Task Networking in the Amazon Elastic Container Service Developer Guide. If the network mode is host, you cannot run multiple instantiations of the same task on a single container instance when port mappings are used. For more information, see Network settings in the Docker run reference.
    */
  var networkMode: js.UndefOr[NetworkMode] = js.undefined
  
  /**
    * The process namespace to use for the containers in the task. The valid values are host or task. If host is specified, then all containers within the tasks that specified the host PID mode on the same container instance share the same process namespace with the host Amazon EC2 instance. If task is specified, all containers within the specified task share the same process namespace. If no value is specified, the default is a private namespace. For more information, see PID settings in the Docker run reference. If the host PID mode is used, be aware that there is a heightened risk of undesired process namespace expose. For more information, see Docker security.  This parameter is not supported for Windows containers or tasks run on Fargate. 
    */
  var pidMode: js.UndefOr[PidMode] = js.undefined
  
  /**
    * An array of placement constraint objects to use for tasks.  This parameter isn't supported for tasks run on Fargate. 
    */
  var placementConstraints: js.UndefOr[TaskDefinitionPlacementConstraints] = js.undefined
  
  /**
    * The configuration details for the App Mesh proxy. Your Amazon ECS container instances require at least version 1.26.0 of the container agent and at least version 1.26.0-1 of the ecs-init package to use a proxy configuration. If your container instances are launched from the Amazon ECS optimized AMI version 20190301 or later, they contain the required versions of the container agent and ecs-init. For more information, see Amazon ECS-optimized Linux AMI in the Amazon Elastic Container Service Developer Guide.
    */
  var proxyConfiguration: js.UndefOr[ProxyConfiguration] = js.undefined
  
  /**
    * The Unix timestamp for the time when the task definition was registered.
    */
  var registeredAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The principal that registered the task definition.
    */
  var registeredBy: js.UndefOr[String] = js.undefined
  
  /**
    * The container instance attributes required by your task. When an Amazon EC2 instance is registered to your cluster, the Amazon ECS container agent assigns some standard attributes to the instance. You can apply custom attributes. These are specified as key-value pairs using the Amazon ECS console or the PutAttributes API. These attributes are used when determining task placement for tasks hosted on Amazon EC2 instances. For more information, see Attributes in the Amazon Elastic Container Service Developer Guide.  This parameter isn't supported for tasks run on Fargate. 
    */
  var requiresAttributes: js.UndefOr[RequiresAttributes] = js.undefined
  
  /**
    * The task launch types the task definition was validated against. To determine which task launch types the task definition is validated for, see the TaskDefinition$compatibilities parameter.
    */
  var requiresCompatibilities: js.UndefOr[CompatibilityList] = js.undefined
  
  /**
    * The revision of the task in a particular family. The revision is a version number of a task definition in a family. When you register a task definition for the first time, the revision is 1. Each time that you register a new revision of a task definition in the same family, the revision value always increases by one. This is even if you deregistered previous revisions in this family.
    */
  var revision: js.UndefOr[Integer] = js.undefined
  
  /**
    * The operating system that your task definitions are running on. A platform family is specified only for tasks using the Fargate launch type.  When you specify a task in a service, this value must match the runtimePlatform value of the service.
    */
  var runtimePlatform: js.UndefOr[RuntimePlatform] = js.undefined
  
  /**
    * The status of the task definition.
    */
  var status: js.UndefOr[TaskDefinitionStatus] = js.undefined
  
  /**
    * The full Amazon Resource Name (ARN) of the task definition.
    */
  var taskDefinitionArn: js.UndefOr[String] = js.undefined
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the Identity and Access Management role that grants containers in the task permission to call Amazon Web Services APIs on your behalf. For more information, see Amazon ECS Task Role in the Amazon Elastic Container Service Developer Guide. IAM roles for tasks on Windows require that the -EnableTaskIAMRole option is set when you launch the Amazon ECS-optimized Windows AMI. Your containers must also run some configuration code to use the feature. For more information, see Windows IAM roles for tasks in the Amazon Elastic Container Service Developer Guide.
    */
  var taskRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * The list of data volume definitions for the task. For more information, see Using data volumes in tasks in the Amazon Elastic Container Service Developer Guide.  The host and sourcePath parameters aren't supported for tasks run on Fargate.  
    */
  var volumes: js.UndefOr[VolumeList] = js.undefined
}
object TaskDefinition {
  
  inline def apply(): TaskDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskDefinition]
  }
  
  extension [Self <: TaskDefinition](x: Self) {
    
    inline def setCompatibilities(value: CompatibilityList): Self = StObject.set(x, "compatibilities", value.asInstanceOf[js.Any])
    
    inline def setCompatibilitiesUndefined: Self = StObject.set(x, "compatibilities", js.undefined)
    
    inline def setCompatibilitiesVarargs(value: Compatibility*): Self = StObject.set(x, "compatibilities", js.Array(value*))
    
    inline def setContainerDefinitions(value: ContainerDefinitions): Self = StObject.set(x, "containerDefinitions", value.asInstanceOf[js.Any])
    
    inline def setContainerDefinitionsUndefined: Self = StObject.set(x, "containerDefinitions", js.undefined)
    
    inline def setContainerDefinitionsVarargs(value: ContainerDefinition*): Self = StObject.set(x, "containerDefinitions", js.Array(value*))
    
    inline def setCpu(value: String): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
    
    inline def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
    
    inline def setDeregisteredAt(value: js.Date): Self = StObject.set(x, "deregisteredAt", value.asInstanceOf[js.Any])
    
    inline def setDeregisteredAtUndefined: Self = StObject.set(x, "deregisteredAt", js.undefined)
    
    inline def setEphemeralStorage(value: EphemeralStorage): Self = StObject.set(x, "ephemeralStorage", value.asInstanceOf[js.Any])
    
    inline def setEphemeralStorageUndefined: Self = StObject.set(x, "ephemeralStorage", js.undefined)
    
    inline def setExecutionRoleArn(value: String): Self = StObject.set(x, "executionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleArnUndefined: Self = StObject.set(x, "executionRoleArn", js.undefined)
    
    inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
    
    inline def setInferenceAccelerators(value: InferenceAccelerators): Self = StObject.set(x, "inferenceAccelerators", value.asInstanceOf[js.Any])
    
    inline def setInferenceAcceleratorsUndefined: Self = StObject.set(x, "inferenceAccelerators", js.undefined)
    
    inline def setInferenceAcceleratorsVarargs(value: InferenceAccelerator*): Self = StObject.set(x, "inferenceAccelerators", js.Array(value*))
    
    inline def setIpcMode(value: IpcMode): Self = StObject.set(x, "ipcMode", value.asInstanceOf[js.Any])
    
    inline def setIpcModeUndefined: Self = StObject.set(x, "ipcMode", js.undefined)
    
    inline def setMemory(value: String): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    inline def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
    
    inline def setNetworkMode(value: NetworkMode): Self = StObject.set(x, "networkMode", value.asInstanceOf[js.Any])
    
    inline def setNetworkModeUndefined: Self = StObject.set(x, "networkMode", js.undefined)
    
    inline def setPidMode(value: PidMode): Self = StObject.set(x, "pidMode", value.asInstanceOf[js.Any])
    
    inline def setPidModeUndefined: Self = StObject.set(x, "pidMode", js.undefined)
    
    inline def setPlacementConstraints(value: TaskDefinitionPlacementConstraints): Self = StObject.set(x, "placementConstraints", value.asInstanceOf[js.Any])
    
    inline def setPlacementConstraintsUndefined: Self = StObject.set(x, "placementConstraints", js.undefined)
    
    inline def setPlacementConstraintsVarargs(value: TaskDefinitionPlacementConstraint*): Self = StObject.set(x, "placementConstraints", js.Array(value*))
    
    inline def setProxyConfiguration(value: ProxyConfiguration): Self = StObject.set(x, "proxyConfiguration", value.asInstanceOf[js.Any])
    
    inline def setProxyConfigurationUndefined: Self = StObject.set(x, "proxyConfiguration", js.undefined)
    
    inline def setRegisteredAt(value: js.Date): Self = StObject.set(x, "registeredAt", value.asInstanceOf[js.Any])
    
    inline def setRegisteredAtUndefined: Self = StObject.set(x, "registeredAt", js.undefined)
    
    inline def setRegisteredBy(value: String): Self = StObject.set(x, "registeredBy", value.asInstanceOf[js.Any])
    
    inline def setRegisteredByUndefined: Self = StObject.set(x, "registeredBy", js.undefined)
    
    inline def setRequiresAttributes(value: RequiresAttributes): Self = StObject.set(x, "requiresAttributes", value.asInstanceOf[js.Any])
    
    inline def setRequiresAttributesUndefined: Self = StObject.set(x, "requiresAttributes", js.undefined)
    
    inline def setRequiresAttributesVarargs(value: Attribute*): Self = StObject.set(x, "requiresAttributes", js.Array(value*))
    
    inline def setRequiresCompatibilities(value: CompatibilityList): Self = StObject.set(x, "requiresCompatibilities", value.asInstanceOf[js.Any])
    
    inline def setRequiresCompatibilitiesUndefined: Self = StObject.set(x, "requiresCompatibilities", js.undefined)
    
    inline def setRequiresCompatibilitiesVarargs(value: Compatibility*): Self = StObject.set(x, "requiresCompatibilities", js.Array(value*))
    
    inline def setRevision(value: Integer): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
    
    inline def setRuntimePlatform(value: RuntimePlatform): Self = StObject.set(x, "runtimePlatform", value.asInstanceOf[js.Any])
    
    inline def setRuntimePlatformUndefined: Self = StObject.set(x, "runtimePlatform", js.undefined)
    
    inline def setStatus(value: TaskDefinitionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTaskDefinitionArn(value: String): Self = StObject.set(x, "taskDefinitionArn", value.asInstanceOf[js.Any])
    
    inline def setTaskDefinitionArnUndefined: Self = StObject.set(x, "taskDefinitionArn", js.undefined)
    
    inline def setTaskRoleArn(value: String): Self = StObject.set(x, "taskRoleArn", value.asInstanceOf[js.Any])
    
    inline def setTaskRoleArnUndefined: Self = StObject.set(x, "taskRoleArn", js.undefined)
    
    inline def setVolumes(value: VolumeList): Self = StObject.set(x, "volumes", value.asInstanceOf[js.Any])
    
    inline def setVolumesUndefined: Self = StObject.set(x, "volumes", js.undefined)
    
    inline def setVolumesVarargs(value: Volume*): Self = StObject.set(x, "volumes", js.Array(value*))
  }
}
