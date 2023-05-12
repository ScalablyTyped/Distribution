package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceConfiguration extends StObject {
  
  /**
    *  Describes the Auto Scaling configuration methods for an Amazon ECS service. This affects the generated recommendations. For example, if Auto Scaling is configured on a service’s CPU, then Compute Optimizer doesn’t generate CPU size recommendations.  The Auto Scaling configuration methods include:    TARGET_TRACKING_SCALING_CPU — If the Amazon ECS service is configured to use target scaling on CPU, Compute Optimizer doesn't generate CPU recommendations.    TARGET_TRACKING_SCALING_MEMORY — If the Amazon ECS service is configured to use target scaling on memory, Compute Optimizer doesn't generate memory recommendations.   For more information about step scaling and target scaling, see  Step scaling policies for Application Auto Scaling and  Target tracking scaling policies for Application Auto Scaling in the Application Auto Scaling User Guide.
    */
  var autoScalingConfiguration: js.UndefOr[AutoScalingConfiguration] = js.undefined
  
  /**
    *  The container configurations within a task of an Amazon ECS service. 
    */
  var containerConfigurations: js.UndefOr[ContainerConfigurations] = js.undefined
  
  /**
    *  The number of CPU units used by the tasks in the Amazon ECS service. 
    */
  var cpu: js.UndefOr[NullableCpu] = js.undefined
  
  /**
    *  The amount of memory used by the tasks in the Amazon ECS service. 
    */
  var memory: js.UndefOr[NullableMemory] = js.undefined
  
  /**
    *  The task definition ARN used by the tasks in the Amazon ECS service. 
    */
  var taskDefinitionArn: js.UndefOr[TaskDefinitionArn] = js.undefined
}
object ServiceConfiguration {
  
  inline def apply(): ServiceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAutoScalingConfiguration(value: AutoScalingConfiguration): Self = StObject.set(x, "autoScalingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingConfigurationUndefined: Self = StObject.set(x, "autoScalingConfiguration", js.undefined)
    
    inline def setContainerConfigurations(value: ContainerConfigurations): Self = StObject.set(x, "containerConfigurations", value.asInstanceOf[js.Any])
    
    inline def setContainerConfigurationsUndefined: Self = StObject.set(x, "containerConfigurations", js.undefined)
    
    inline def setContainerConfigurationsVarargs(value: ContainerConfiguration*): Self = StObject.set(x, "containerConfigurations", js.Array(value*))
    
    inline def setCpu(value: NullableCpu): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
    
    inline def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
    
    inline def setMemory(value: NullableMemory): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    inline def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
    
    inline def setTaskDefinitionArn(value: TaskDefinitionArn): Self = StObject.set(x, "taskDefinitionArn", value.asInstanceOf[js.Any])
    
    inline def setTaskDefinitionArnUndefined: Self = StObject.set(x, "taskDefinitionArn", js.undefined)
  }
}
