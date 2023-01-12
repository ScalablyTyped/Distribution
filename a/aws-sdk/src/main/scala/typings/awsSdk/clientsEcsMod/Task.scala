package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Task extends StObject {
  
  /**
    * The Elastic Network Adapter that's associated with the task if the task uses the awsvpc network mode.
    */
  var attachments: js.UndefOr[Attachments] = js.undefined
  
  /**
    * The attributes of the task
    */
  var attributes: js.UndefOr[Attributes] = js.undefined
  
  /**
    * The Availability Zone for the task.
    */
  var availabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The capacity provider that's associated with the task.
    */
  var capacityProviderName: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the cluster that hosts the task.
    */
  var clusterArn: js.UndefOr[String] = js.undefined
  
  /**
    * The connectivity status of a task.
    */
  var connectivity: js.UndefOr[Connectivity] = js.undefined
  
  /**
    * The Unix timestamp for the time when the task last went into CONNECTED status.
    */
  var connectivityAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARN of the container instances that host the task.
    */
  var containerInstanceArn: js.UndefOr[String] = js.undefined
  
  /**
    * The containers that's associated with the task.
    */
  var containers: js.UndefOr[Containers] = js.undefined
  
  /**
    * The number of CPU units used by the task as expressed in a task definition. It can be expressed as an integer using CPU units (for example, 1024). It can also be expressed as a string using vCPUs (for example, 1 vCPU or 1 vcpu). String values are converted to an integer that indicates the CPU units when the task definition is registered. If you use the EC2 launch type, this field is optional. Supported values are between 128 CPU units (0.125 vCPUs) and 10240 CPU units (10 vCPUs). If you use the Fargate launch type, this field is required. You must use one of the following values. These values determine the range of supported values for the memory parameter: The CPU units cannot be less than 1 vCPU when you use Windows containers on Fargate.   256 (.25 vCPU) - Available memory values: 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB)   512 (.5 vCPU) - Available memory values: 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB)   1024 (1 vCPU) - Available memory values: 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB)   2048 (2 vCPU) - Available memory values: 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB)   4096 (4 vCPU) - Available memory values: 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB)   8192 (8 vCPU) - Available memory values: 16 GB and 60 GB in 4 GB increments This option requires Linux platform 1.4.0 or later.   16384 (16vCPU) - Available memory values: 32GB and 120 GB in 8 GB increments This option requires Linux platform 1.4.0 or later.  
    */
  var cpu: js.UndefOr[String] = js.undefined
  
  /**
    * The Unix timestamp for the time when the task was created. More specifically, it's for the time when the task entered the PENDING state.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The desired status of the task. For more information, see Task Lifecycle.
    */
  var desiredStatus: js.UndefOr[String] = js.undefined
  
  /**
    * Determines whether execute command functionality is enabled for this task. If true, execute command functionality is enabled on all the containers in the task.
    */
  var enableExecuteCommand: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ephemeral storage settings for the task.
    */
  var ephemeralStorage: js.UndefOr[EphemeralStorage] = js.undefined
  
  /**
    * The Unix timestamp for the time when the task execution stopped.
    */
  var executionStoppedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the task group that's associated with the task.
    */
  var group: js.UndefOr[String] = js.undefined
  
  /**
    * The health status for the task. It's determined by the health of the essential containers in the task. If all essential containers in the task are reporting as HEALTHY, the task status also reports as HEALTHY. If any essential containers in the task are reporting as UNHEALTHY or UNKNOWN, the task status also reports as UNHEALTHY or UNKNOWN.  The Amazon ECS container agent doesn't monitor or report on Docker health checks that are embedded in a container image and not specified in the container definition. For example, this includes those specified in a parent image or from the image's Dockerfile. Health check parameters that are specified in a container definition override any Docker health checks that are found in the container image. 
    */
  var healthStatus: js.UndefOr[HealthStatus] = js.undefined
  
  /**
    * The Elastic Inference accelerator that's associated with the task.
    */
  var inferenceAccelerators: js.UndefOr[InferenceAccelerators] = js.undefined
  
  /**
    * The last known status for the task. For more information, see Task Lifecycle.
    */
  var lastStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The infrastructure where your task runs on. For more information, see Amazon ECS launch types in the Amazon Elastic Container Service Developer Guide.
    */
  var launchType: js.UndefOr[LaunchType] = js.undefined
  
  /**
    * The amount of memory (in MiB) that the task uses as expressed in a task definition. It can be expressed as an integer using MiB (for example, 1024). If it's expressed as a string using GB (for example, 1GB or 1 GB), it's converted to an integer indicating the MiB when the task definition is registered. If you use the EC2 launch type, this field is optional. If you use the Fargate launch type, this field is required. You must use one of the following values. The value that you choose determines the range of supported values for the cpu parameter.   512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available cpu values: 256 (.25 vCPU)   1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available cpu values: 512 (.5 vCPU)   2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB) - Available cpu values: 1024 (1 vCPU)   Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB) - Available cpu values: 2048 (2 vCPU)   Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB) - Available cpu values: 4096 (4 vCPU)   Between 16 GB and 60 GB in 4 GB increments - Available cpu values: 8192 (8 vCPU) This option requires Linux platform 1.4.0 or later.   Between 32GB and 120 GB in 8 GB increments - Available cpu values: 16384 (16 vCPU) This option requires Linux platform 1.4.0 or later.  
    */
  var memory: js.UndefOr[String] = js.undefined
  
  /**
    * One or more container overrides.
    */
  var overrides: js.UndefOr[TaskOverride] = js.undefined
  
  /**
    * The operating system that your tasks are running on. A platform family is specified only for tasks that use the Fargate launch type.   All tasks that run as part of this service must use the same platformFamily value as the service (for example, LINUX.).
    */
  var platformFamily: js.UndefOr[String] = js.undefined
  
  /**
    * The platform version where your task runs on. A platform version is only specified for tasks that use the Fargate launch type. If you didn't specify one, the LATEST platform version is used. For more information, see Fargate Platform Versions in the Amazon Elastic Container Service Developer Guide.
    */
  var platformVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The Unix timestamp for the time when the container image pull began.
    */
  var pullStartedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Unix timestamp for the time when the container image pull completed.
    */
  var pullStoppedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Unix timestamp for the time when the task started. More specifically, it's for the time when the task transitioned from the PENDING state to the RUNNING state.
    */
  var startedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The tag specified when a task is started. If an Amazon ECS service started the task, the startedBy parameter contains the deployment ID of that service.
    */
  var startedBy: js.UndefOr[String] = js.undefined
  
  /**
    * The stop code indicating why a task was stopped. The stoppedReason might contain additional details. The following are valid values:    TaskFailedToStart     EssentialContainerExited     UserInitiated     TerminationNotice     ServiceSchedulerInitiated     SpotInterruption   
    */
  var stopCode: js.UndefOr[TaskStopCode] = js.undefined
  
  /**
    * The Unix timestamp for the time when the task was stopped. More specifically, it's for the time when the task transitioned from the RUNNING state to the STOPPED state.
    */
  var stoppedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The reason that the task was stopped.
    */
  var stoppedReason: js.UndefOr[String] = js.undefined
  
  /**
    * The Unix timestamp for the time when the task stops. More specifically, it's for the time when the task transitions from the RUNNING state to STOPPED.
    */
  var stoppingAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The metadata that you apply to the task to help you categorize and organize the task. Each tag consists of a key and an optional value. You define both the key and value. The following basic restrictions apply to tags:   Maximum number of tags per resource - 50   For each resource, each tag key must be unique, and each tag key can have only one value.   Maximum key length - 128 Unicode characters in UTF-8   Maximum value length - 256 Unicode characters in UTF-8   If your tagging schema is used across multiple services and resources, remember that other services may have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : / @.   Tag keys and values are case-sensitive.   Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for either keys or values as it is reserved for Amazon Web Services use. You cannot edit or delete tag keys or values with this prefix. Tags with this prefix do not count against your tags per resource limit.  
    */
  var tags: js.UndefOr[Tags] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the task.
    */
  var taskArn: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the task definition that creates the task.
    */
  var taskDefinitionArn: js.UndefOr[String] = js.undefined
  
  /**
    * The version counter for the task. Every time a task experiences a change that starts a CloudWatch event, the version counter is incremented. If you replicate your Amazon ECS task state with CloudWatch Events, you can compare the version of a task reported by the Amazon ECS API actions with the version reported in CloudWatch Events for the task (inside the detail object) to verify that the version in your event stream is current.
    */
  var version: js.UndefOr[Long] = js.undefined
}
object Task {
  
  inline def apply(): Task = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Task]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Task] (val x: Self) extends AnyVal {
    
    inline def setAttachments(value: Attachments): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    inline def setAttachmentsVarargs(value: Attachment*): Self = StObject.set(x, "attachments", js.Array(value*))
    
    inline def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
    
    inline def setCapacityProviderName(value: String): Self = StObject.set(x, "capacityProviderName", value.asInstanceOf[js.Any])
    
    inline def setCapacityProviderNameUndefined: Self = StObject.set(x, "capacityProviderName", js.undefined)
    
    inline def setClusterArn(value: String): Self = StObject.set(x, "clusterArn", value.asInstanceOf[js.Any])
    
    inline def setClusterArnUndefined: Self = StObject.set(x, "clusterArn", js.undefined)
    
    inline def setConnectivity(value: Connectivity): Self = StObject.set(x, "connectivity", value.asInstanceOf[js.Any])
    
    inline def setConnectivityAt(value: js.Date): Self = StObject.set(x, "connectivityAt", value.asInstanceOf[js.Any])
    
    inline def setConnectivityAtUndefined: Self = StObject.set(x, "connectivityAt", js.undefined)
    
    inline def setConnectivityUndefined: Self = StObject.set(x, "connectivity", js.undefined)
    
    inline def setContainerInstanceArn(value: String): Self = StObject.set(x, "containerInstanceArn", value.asInstanceOf[js.Any])
    
    inline def setContainerInstanceArnUndefined: Self = StObject.set(x, "containerInstanceArn", js.undefined)
    
    inline def setContainers(value: Containers): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
    
    inline def setContainersUndefined: Self = StObject.set(x, "containers", js.undefined)
    
    inline def setContainersVarargs(value: Container*): Self = StObject.set(x, "containers", js.Array(value*))
    
    inline def setCpu(value: String): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
    
    inline def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setDesiredStatus(value: String): Self = StObject.set(x, "desiredStatus", value.asInstanceOf[js.Any])
    
    inline def setDesiredStatusUndefined: Self = StObject.set(x, "desiredStatus", js.undefined)
    
    inline def setEnableExecuteCommand(value: Boolean): Self = StObject.set(x, "enableExecuteCommand", value.asInstanceOf[js.Any])
    
    inline def setEnableExecuteCommandUndefined: Self = StObject.set(x, "enableExecuteCommand", js.undefined)
    
    inline def setEphemeralStorage(value: EphemeralStorage): Self = StObject.set(x, "ephemeralStorage", value.asInstanceOf[js.Any])
    
    inline def setEphemeralStorageUndefined: Self = StObject.set(x, "ephemeralStorage", js.undefined)
    
    inline def setExecutionStoppedAt(value: js.Date): Self = StObject.set(x, "executionStoppedAt", value.asInstanceOf[js.Any])
    
    inline def setExecutionStoppedAtUndefined: Self = StObject.set(x, "executionStoppedAt", js.undefined)
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setHealthStatus(value: HealthStatus): Self = StObject.set(x, "healthStatus", value.asInstanceOf[js.Any])
    
    inline def setHealthStatusUndefined: Self = StObject.set(x, "healthStatus", js.undefined)
    
    inline def setInferenceAccelerators(value: InferenceAccelerators): Self = StObject.set(x, "inferenceAccelerators", value.asInstanceOf[js.Any])
    
    inline def setInferenceAcceleratorsUndefined: Self = StObject.set(x, "inferenceAccelerators", js.undefined)
    
    inline def setInferenceAcceleratorsVarargs(value: InferenceAccelerator*): Self = StObject.set(x, "inferenceAccelerators", js.Array(value*))
    
    inline def setLastStatus(value: String): Self = StObject.set(x, "lastStatus", value.asInstanceOf[js.Any])
    
    inline def setLastStatusUndefined: Self = StObject.set(x, "lastStatus", js.undefined)
    
    inline def setLaunchType(value: LaunchType): Self = StObject.set(x, "launchType", value.asInstanceOf[js.Any])
    
    inline def setLaunchTypeUndefined: Self = StObject.set(x, "launchType", js.undefined)
    
    inline def setMemory(value: String): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    inline def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
    
    inline def setOverrides(value: TaskOverride): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setPlatformFamily(value: String): Self = StObject.set(x, "platformFamily", value.asInstanceOf[js.Any])
    
    inline def setPlatformFamilyUndefined: Self = StObject.set(x, "platformFamily", js.undefined)
    
    inline def setPlatformVersion(value: String): Self = StObject.set(x, "platformVersion", value.asInstanceOf[js.Any])
    
    inline def setPlatformVersionUndefined: Self = StObject.set(x, "platformVersion", js.undefined)
    
    inline def setPullStartedAt(value: js.Date): Self = StObject.set(x, "pullStartedAt", value.asInstanceOf[js.Any])
    
    inline def setPullStartedAtUndefined: Self = StObject.set(x, "pullStartedAt", js.undefined)
    
    inline def setPullStoppedAt(value: js.Date): Self = StObject.set(x, "pullStoppedAt", value.asInstanceOf[js.Any])
    
    inline def setPullStoppedAtUndefined: Self = StObject.set(x, "pullStoppedAt", js.undefined)
    
    inline def setStartedAt(value: js.Date): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
    
    inline def setStartedAtUndefined: Self = StObject.set(x, "startedAt", js.undefined)
    
    inline def setStartedBy(value: String): Self = StObject.set(x, "startedBy", value.asInstanceOf[js.Any])
    
    inline def setStartedByUndefined: Self = StObject.set(x, "startedBy", js.undefined)
    
    inline def setStopCode(value: TaskStopCode): Self = StObject.set(x, "stopCode", value.asInstanceOf[js.Any])
    
    inline def setStopCodeUndefined: Self = StObject.set(x, "stopCode", js.undefined)
    
    inline def setStoppedAt(value: js.Date): Self = StObject.set(x, "stoppedAt", value.asInstanceOf[js.Any])
    
    inline def setStoppedAtUndefined: Self = StObject.set(x, "stoppedAt", js.undefined)
    
    inline def setStoppedReason(value: String): Self = StObject.set(x, "stoppedReason", value.asInstanceOf[js.Any])
    
    inline def setStoppedReasonUndefined: Self = StObject.set(x, "stoppedReason", js.undefined)
    
    inline def setStoppingAt(value: js.Date): Self = StObject.set(x, "stoppingAt", value.asInstanceOf[js.Any])
    
    inline def setStoppingAtUndefined: Self = StObject.set(x, "stoppingAt", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTaskArn(value: String): Self = StObject.set(x, "taskArn", value.asInstanceOf[js.Any])
    
    inline def setTaskArnUndefined: Self = StObject.set(x, "taskArn", js.undefined)
    
    inline def setTaskDefinitionArn(value: String): Self = StObject.set(x, "taskDefinitionArn", value.asInstanceOf[js.Any])
    
    inline def setTaskDefinitionArnUndefined: Self = StObject.set(x, "taskDefinitionArn", js.undefined)
    
    inline def setVersion(value: Long): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
