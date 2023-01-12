package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsTaskDefinitionDetails extends StObject {
  
  /**
    * The container definitions that describe the containers that make up the task.
    */
  var ContainerDefinitions: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsList] = js.undefined
  
  /**
    * The number of CPU units used by the task.Valid values are as follows:    256 (.25 vCPU)     512 (.5 vCPU)     1024 (1 vCPU)     2048 (2 vCPU)     4096 (4 vCPU)   
    */
  var Cpu: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ARN of the task execution role that grants the container agent permission to make API calls on behalf of the container user.
    */
  var ExecutionRoleArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of a family that this task definition is registered to.
    */
  var Family: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The Elastic Inference accelerators to use for the containers in the task.
    */
  var InferenceAccelerators: js.UndefOr[AwsEcsTaskDefinitionInferenceAcceleratorsList] = js.undefined
  
  /**
    * The inter-process communication (IPC) resource namespace to use for the containers in the task. Valid values are as follows:    host     none     task   
    */
  var IpcMode: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The amount (in MiB) of memory used by the task.  For tasks that are hosted on Amazon EC2, you can provide a task-level memory value or a container-level memory value. For tasks that are hosted on Fargate, you must use one of the specified values in the  Amazon Elastic Container Service Developer Guide , which determines your range of supported values for the Cpu and Memory parameters.
    */
  var Memory: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The Docker networking mode to use for the containers in the task. Valid values are as follows:    awsvpc     bridge     host     none   
    */
  var NetworkMode: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The process namespace to use for the containers in the task. Valid values are host or task.
    */
  var PidMode: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The placement constraint objects to use for tasks.
    */
  var PlacementConstraints: js.UndefOr[AwsEcsTaskDefinitionPlacementConstraintsList] = js.undefined
  
  /**
    * The configuration details for the App Mesh proxy.
    */
  var ProxyConfiguration: js.UndefOr[AwsEcsTaskDefinitionProxyConfigurationDetails] = js.undefined
  
  /**
    * The task launch types that the task definition was validated against.
    */
  var RequiresCompatibilities: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * The short name or ARN of the IAM role that grants containers in the task permission to call Amazon Web Services API operations on your behalf.
    */
  var TaskRoleArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The data volume definitions for the task.
    */
  var Volumes: js.UndefOr[AwsEcsTaskDefinitionVolumesList] = js.undefined
}
object AwsEcsTaskDefinitionDetails {
  
  inline def apply(): AwsEcsTaskDefinitionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsTaskDefinitionDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEcsTaskDefinitionDetails] (val x: Self) extends AnyVal {
    
    inline def setContainerDefinitions(value: AwsEcsTaskDefinitionContainerDefinitionsList): Self = StObject.set(x, "ContainerDefinitions", value.asInstanceOf[js.Any])
    
    inline def setContainerDefinitionsUndefined: Self = StObject.set(x, "ContainerDefinitions", js.undefined)
    
    inline def setContainerDefinitionsVarargs(value: AwsEcsTaskDefinitionContainerDefinitionsDetails*): Self = StObject.set(x, "ContainerDefinitions", js.Array(value*))
    
    inline def setCpu(value: NonEmptyString): Self = StObject.set(x, "Cpu", value.asInstanceOf[js.Any])
    
    inline def setCpuUndefined: Self = StObject.set(x, "Cpu", js.undefined)
    
    inline def setExecutionRoleArn(value: NonEmptyString): Self = StObject.set(x, "ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleArnUndefined: Self = StObject.set(x, "ExecutionRoleArn", js.undefined)
    
    inline def setFamily(value: NonEmptyString): Self = StObject.set(x, "Family", value.asInstanceOf[js.Any])
    
    inline def setFamilyUndefined: Self = StObject.set(x, "Family", js.undefined)
    
    inline def setInferenceAccelerators(value: AwsEcsTaskDefinitionInferenceAcceleratorsList): Self = StObject.set(x, "InferenceAccelerators", value.asInstanceOf[js.Any])
    
    inline def setInferenceAcceleratorsUndefined: Self = StObject.set(x, "InferenceAccelerators", js.undefined)
    
    inline def setInferenceAcceleratorsVarargs(value: AwsEcsTaskDefinitionInferenceAcceleratorsDetails*): Self = StObject.set(x, "InferenceAccelerators", js.Array(value*))
    
    inline def setIpcMode(value: NonEmptyString): Self = StObject.set(x, "IpcMode", value.asInstanceOf[js.Any])
    
    inline def setIpcModeUndefined: Self = StObject.set(x, "IpcMode", js.undefined)
    
    inline def setMemory(value: NonEmptyString): Self = StObject.set(x, "Memory", value.asInstanceOf[js.Any])
    
    inline def setMemoryUndefined: Self = StObject.set(x, "Memory", js.undefined)
    
    inline def setNetworkMode(value: NonEmptyString): Self = StObject.set(x, "NetworkMode", value.asInstanceOf[js.Any])
    
    inline def setNetworkModeUndefined: Self = StObject.set(x, "NetworkMode", js.undefined)
    
    inline def setPidMode(value: NonEmptyString): Self = StObject.set(x, "PidMode", value.asInstanceOf[js.Any])
    
    inline def setPidModeUndefined: Self = StObject.set(x, "PidMode", js.undefined)
    
    inline def setPlacementConstraints(value: AwsEcsTaskDefinitionPlacementConstraintsList): Self = StObject.set(x, "PlacementConstraints", value.asInstanceOf[js.Any])
    
    inline def setPlacementConstraintsUndefined: Self = StObject.set(x, "PlacementConstraints", js.undefined)
    
    inline def setPlacementConstraintsVarargs(value: AwsEcsTaskDefinitionPlacementConstraintsDetails*): Self = StObject.set(x, "PlacementConstraints", js.Array(value*))
    
    inline def setProxyConfiguration(value: AwsEcsTaskDefinitionProxyConfigurationDetails): Self = StObject.set(x, "ProxyConfiguration", value.asInstanceOf[js.Any])
    
    inline def setProxyConfigurationUndefined: Self = StObject.set(x, "ProxyConfiguration", js.undefined)
    
    inline def setRequiresCompatibilities(value: NonEmptyStringList): Self = StObject.set(x, "RequiresCompatibilities", value.asInstanceOf[js.Any])
    
    inline def setRequiresCompatibilitiesUndefined: Self = StObject.set(x, "RequiresCompatibilities", js.undefined)
    
    inline def setRequiresCompatibilitiesVarargs(value: NonEmptyString*): Self = StObject.set(x, "RequiresCompatibilities", js.Array(value*))
    
    inline def setTaskRoleArn(value: NonEmptyString): Self = StObject.set(x, "TaskRoleArn", value.asInstanceOf[js.Any])
    
    inline def setTaskRoleArnUndefined: Self = StObject.set(x, "TaskRoleArn", js.undefined)
    
    inline def setVolumes(value: AwsEcsTaskDefinitionVolumesList): Self = StObject.set(x, "Volumes", value.asInstanceOf[js.Any])
    
    inline def setVolumesUndefined: Self = StObject.set(x, "Volumes", js.undefined)
    
    inline def setVolumesVarargs(value: AwsEcsTaskDefinitionVolumesDetails*): Self = StObject.set(x, "Volumes", js.Array(value*))
  }
}
