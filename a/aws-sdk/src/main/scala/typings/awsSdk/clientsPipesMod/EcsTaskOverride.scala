package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EcsTaskOverride extends StObject {
  
  /**
    * One or more container overrides that are sent to a task.
    */
  var ContainerOverrides: js.UndefOr[EcsContainerOverrideList] = js.undefined
  
  /**
    * The cpu override for the task.
    */
  var Cpu: js.UndefOr[String] = js.undefined
  
  /**
    * The ephemeral storage setting override for the task.  This parameter is only supported for tasks hosted on Fargate that use the following platform versions:   Linux platform version 1.4.0 or later.   Windows platform version 1.0.0 or later.   
    */
  var EphemeralStorage: js.UndefOr[EcsEphemeralStorage] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the task execution IAM role override for the task. For more information, see Amazon ECS task execution IAM role in the Amazon Elastic Container Service Developer Guide.
    */
  var ExecutionRoleArn: js.UndefOr[ArnOrJsonPath] = js.undefined
  
  /**
    * The Elastic Inference accelerator override for the task.
    */
  var InferenceAcceleratorOverrides: js.UndefOr[EcsInferenceAcceleratorOverrideList] = js.undefined
  
  /**
    * The memory override for the task.
    */
  var Memory: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that containers in this task can assume. All containers in this task are granted the permissions that are specified in this role. For more information, see IAM Role for Tasks in the Amazon Elastic Container Service Developer Guide.
    */
  var TaskRoleArn: js.UndefOr[ArnOrJsonPath] = js.undefined
}
object EcsTaskOverride {
  
  inline def apply(): EcsTaskOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EcsTaskOverride]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EcsTaskOverride] (val x: Self) extends AnyVal {
    
    inline def setContainerOverrides(value: EcsContainerOverrideList): Self = StObject.set(x, "ContainerOverrides", value.asInstanceOf[js.Any])
    
    inline def setContainerOverridesUndefined: Self = StObject.set(x, "ContainerOverrides", js.undefined)
    
    inline def setContainerOverridesVarargs(value: EcsContainerOverride*): Self = StObject.set(x, "ContainerOverrides", js.Array(value*))
    
    inline def setCpu(value: String): Self = StObject.set(x, "Cpu", value.asInstanceOf[js.Any])
    
    inline def setCpuUndefined: Self = StObject.set(x, "Cpu", js.undefined)
    
    inline def setEphemeralStorage(value: EcsEphemeralStorage): Self = StObject.set(x, "EphemeralStorage", value.asInstanceOf[js.Any])
    
    inline def setEphemeralStorageUndefined: Self = StObject.set(x, "EphemeralStorage", js.undefined)
    
    inline def setExecutionRoleArn(value: ArnOrJsonPath): Self = StObject.set(x, "ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleArnUndefined: Self = StObject.set(x, "ExecutionRoleArn", js.undefined)
    
    inline def setInferenceAcceleratorOverrides(value: EcsInferenceAcceleratorOverrideList): Self = StObject.set(x, "InferenceAcceleratorOverrides", value.asInstanceOf[js.Any])
    
    inline def setInferenceAcceleratorOverridesUndefined: Self = StObject.set(x, "InferenceAcceleratorOverrides", js.undefined)
    
    inline def setInferenceAcceleratorOverridesVarargs(value: EcsInferenceAcceleratorOverride*): Self = StObject.set(x, "InferenceAcceleratorOverrides", js.Array(value*))
    
    inline def setMemory(value: String): Self = StObject.set(x, "Memory", value.asInstanceOf[js.Any])
    
    inline def setMemoryUndefined: Self = StObject.set(x, "Memory", js.undefined)
    
    inline def setTaskRoleArn(value: ArnOrJsonPath): Self = StObject.set(x, "TaskRoleArn", value.asInstanceOf[js.Any])
    
    inline def setTaskRoleArnUndefined: Self = StObject.set(x, "TaskRoleArn", js.undefined)
  }
}
