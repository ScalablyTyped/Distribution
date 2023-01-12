package typings.awsSdk.clientsSchedulerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EcsParameters extends StObject {
  
  /**
    * The capacity provider strategy to use for the task.
    */
  var CapacityProviderStrategy: js.UndefOr[typings.awsSdk.clientsSchedulerMod.CapacityProviderStrategy] = js.undefined
  
  /**
    * Specifies whether to enable Amazon ECS managed tags for the task. For more information, see Tagging Your Amazon ECS Resources in the Amazon ECS Developer Guide.
    */
  var EnableECSManagedTags: js.UndefOr[typings.awsSdk.clientsSchedulerMod.EnableECSManagedTags] = js.undefined
  
  /**
    * Whether or not to enable the execute command functionality for the containers in this task. If true, this enables execute command functionality on all containers in the task.
    */
  var EnableExecuteCommand: js.UndefOr[typings.awsSdk.clientsSchedulerMod.EnableExecuteCommand] = js.undefined
  
  /**
    * Specifies an ECS task group for the task. The maximum length is 255 characters.
    */
  var Group: js.UndefOr[typings.awsSdk.clientsSchedulerMod.Group] = js.undefined
  
  /**
    * Specifies the launch type on which your task is running. The launch type that you specify here must match one of the launch type (compatibilities) of the target task. The FARGATE value is supported only in the Regions where Fargate with Amazon ECS is supported. For more information, see AWS Fargate on Amazon ECS in the Amazon ECS Developer Guide.
    */
  var LaunchType: js.UndefOr[typings.awsSdk.clientsSchedulerMod.LaunchType] = js.undefined
  
  /**
    * This structure specifies the network configuration for an ECS task.
    */
  var NetworkConfiguration: js.UndefOr[typings.awsSdk.clientsSchedulerMod.NetworkConfiguration] = js.undefined
  
  /**
    * An array of placement constraint objects to use for the task. You can specify up to 10 constraints per task (including constraints in the task definition and those specified at runtime).
    */
  var PlacementConstraints: js.UndefOr[typings.awsSdk.clientsSchedulerMod.PlacementConstraints] = js.undefined
  
  /**
    * The task placement strategy for a task or service.
    */
  var PlacementStrategy: js.UndefOr[PlacementStrategies] = js.undefined
  
  /**
    * Specifies the platform version for the task. Specify only the numeric portion of the platform version, such as 1.1.0.
    */
  var PlatformVersion: js.UndefOr[typings.awsSdk.clientsSchedulerMod.PlatformVersion] = js.undefined
  
  /**
    * Specifies whether to propagate the tags from the task definition to the task. If no value is specified, the tags are not propagated. Tags can only be propagated to the task during task creation. To add tags to a task after task creation, use Amazon ECS's  TagResource  API action. 
    */
  var PropagateTags: js.UndefOr[typings.awsSdk.clientsSchedulerMod.PropagateTags] = js.undefined
  
  /**
    * The reference ID to use for the task.
    */
  var ReferenceId: js.UndefOr[typings.awsSdk.clientsSchedulerMod.ReferenceId] = js.undefined
  
  /**
    * The metadata that you apply to the task to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. For more information, see  RunTask  in the Amazon ECS API Reference.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsSchedulerMod.Tags] = js.undefined
  
  /**
    * The number of tasks to create based on TaskDefinition. The default is 1.
    */
  var TaskCount: js.UndefOr[typings.awsSdk.clientsSchedulerMod.TaskCount] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the task definition to use if the event target is an Amazon ECS task.
    */
  var TaskDefinitionArn: typings.awsSdk.clientsSchedulerMod.TaskDefinitionArn
}
object EcsParameters {
  
  inline def apply(TaskDefinitionArn: TaskDefinitionArn): EcsParameters = {
    val __obj = js.Dynamic.literal(TaskDefinitionArn = TaskDefinitionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EcsParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EcsParameters] (val x: Self) extends AnyVal {
    
    inline def setCapacityProviderStrategy(value: CapacityProviderStrategy): Self = StObject.set(x, "CapacityProviderStrategy", value.asInstanceOf[js.Any])
    
    inline def setCapacityProviderStrategyUndefined: Self = StObject.set(x, "CapacityProviderStrategy", js.undefined)
    
    inline def setCapacityProviderStrategyVarargs(value: CapacityProviderStrategyItem*): Self = StObject.set(x, "CapacityProviderStrategy", js.Array(value*))
    
    inline def setEnableECSManagedTags(value: EnableECSManagedTags): Self = StObject.set(x, "EnableECSManagedTags", value.asInstanceOf[js.Any])
    
    inline def setEnableECSManagedTagsUndefined: Self = StObject.set(x, "EnableECSManagedTags", js.undefined)
    
    inline def setEnableExecuteCommand(value: EnableExecuteCommand): Self = StObject.set(x, "EnableExecuteCommand", value.asInstanceOf[js.Any])
    
    inline def setEnableExecuteCommandUndefined: Self = StObject.set(x, "EnableExecuteCommand", js.undefined)
    
    inline def setGroup(value: Group): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "Group", js.undefined)
    
    inline def setLaunchType(value: LaunchType): Self = StObject.set(x, "LaunchType", value.asInstanceOf[js.Any])
    
    inline def setLaunchTypeUndefined: Self = StObject.set(x, "LaunchType", js.undefined)
    
    inline def setNetworkConfiguration(value: NetworkConfiguration): Self = StObject.set(x, "NetworkConfiguration", value.asInstanceOf[js.Any])
    
    inline def setNetworkConfigurationUndefined: Self = StObject.set(x, "NetworkConfiguration", js.undefined)
    
    inline def setPlacementConstraints(value: PlacementConstraints): Self = StObject.set(x, "PlacementConstraints", value.asInstanceOf[js.Any])
    
    inline def setPlacementConstraintsUndefined: Self = StObject.set(x, "PlacementConstraints", js.undefined)
    
    inline def setPlacementConstraintsVarargs(value: PlacementConstraint*): Self = StObject.set(x, "PlacementConstraints", js.Array(value*))
    
    inline def setPlacementStrategy(value: PlacementStrategies): Self = StObject.set(x, "PlacementStrategy", value.asInstanceOf[js.Any])
    
    inline def setPlacementStrategyUndefined: Self = StObject.set(x, "PlacementStrategy", js.undefined)
    
    inline def setPlacementStrategyVarargs(value: PlacementStrategy*): Self = StObject.set(x, "PlacementStrategy", js.Array(value*))
    
    inline def setPlatformVersion(value: PlatformVersion): Self = StObject.set(x, "PlatformVersion", value.asInstanceOf[js.Any])
    
    inline def setPlatformVersionUndefined: Self = StObject.set(x, "PlatformVersion", js.undefined)
    
    inline def setPropagateTags(value: PropagateTags): Self = StObject.set(x, "PropagateTags", value.asInstanceOf[js.Any])
    
    inline def setPropagateTagsUndefined: Self = StObject.set(x, "PropagateTags", js.undefined)
    
    inline def setReferenceId(value: ReferenceId): Self = StObject.set(x, "ReferenceId", value.asInstanceOf[js.Any])
    
    inline def setReferenceIdUndefined: Self = StObject.set(x, "ReferenceId", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: TagMap*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTaskCount(value: TaskCount): Self = StObject.set(x, "TaskCount", value.asInstanceOf[js.Any])
    
    inline def setTaskCountUndefined: Self = StObject.set(x, "TaskCount", js.undefined)
    
    inline def setTaskDefinitionArn(value: TaskDefinitionArn): Self = StObject.set(x, "TaskDefinitionArn", value.asInstanceOf[js.Any])
  }
}
