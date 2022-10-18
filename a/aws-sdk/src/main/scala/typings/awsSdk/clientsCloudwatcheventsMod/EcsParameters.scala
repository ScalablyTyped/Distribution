package typings.awsSdk.clientsCloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EcsParameters extends StObject {
  
  /**
    * The capacity provider strategy to use for the task. If a capacityProviderStrategy is specified, the launchType parameter must be omitted. If no capacityProviderStrategy or launchType is specified, the defaultCapacityProviderStrategy for the cluster is used. 
    */
  var CapacityProviderStrategy: js.UndefOr[typings.awsSdk.clientsCloudwatcheventsMod.CapacityProviderStrategy] = js.undefined
  
  /**
    * Specifies whether to enable Amazon ECS managed tags for the task. For more information, see Tagging Your Amazon ECS Resources in the Amazon Elastic Container Service Developer Guide. 
    */
  var EnableECSManagedTags: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether or not to enable the execute command functionality for the containers in this task. If true, this enables execute command functionality on all containers in the task.
    */
  var EnableExecuteCommand: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies an ECS task group for the task. The maximum length is 255 characters.
    */
  var Group: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the launch type on which your task is running. The launch type that you specify here must match one of the launch type (compatibilities) of the target task. The FARGATE value is supported only in the Regions where Fargate witt Amazon ECS is supported. For more information, see Fargate on Amazon ECS in the Amazon Elastic Container Service Developer Guide.
    */
  var LaunchType: js.UndefOr[typings.awsSdk.clientsCloudwatcheventsMod.LaunchType] = js.undefined
  
  /**
    * Use this structure if the Amazon ECS task uses the awsvpc network mode. This structure specifies the VPC subnets and security groups associated with the task, and whether a public IP address is to be used. This structure is required if LaunchType is FARGATE because the awsvpc mode is required for Fargate tasks. If you specify NetworkConfiguration when the target ECS task does not use the awsvpc network mode, the task fails.
    */
  var NetworkConfiguration: js.UndefOr[typings.awsSdk.clientsCloudwatcheventsMod.NetworkConfiguration] = js.undefined
  
  /**
    * An array of placement constraint objects to use for the task. You can specify up to 10 constraints per task (including constraints in the task definition and those specified at runtime).
    */
  var PlacementConstraints: js.UndefOr[typings.awsSdk.clientsCloudwatcheventsMod.PlacementConstraints] = js.undefined
  
  /**
    * The placement strategy objects to use for the task. You can specify a maximum of five strategy rules per task. 
    */
  var PlacementStrategy: js.UndefOr[PlacementStrategies] = js.undefined
  
  /**
    * Specifies the platform version for the task. Specify only the numeric portion of the platform version, such as 1.1.0. This structure is used only if LaunchType is FARGATE. For more information about valid platform versions, see Fargate Platform Versions in the Amazon Elastic Container Service Developer Guide.
    */
  var PlatformVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether to propagate the tags from the task definition to the task. If no value is specified, the tags are not propagated. Tags can only be propagated to the task during task creation. To add tags to a task after task creation, use the TagResource API action. 
    */
  var PropagateTags: js.UndefOr[typings.awsSdk.clientsCloudwatcheventsMod.PropagateTags] = js.undefined
  
  /**
    * The reference ID to use for the task.
    */
  var ReferenceId: js.UndefOr[typings.awsSdk.clientsCloudwatcheventsMod.ReferenceId] = js.undefined
  
  /**
    * The metadata that you apply to the task to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. To learn more, see RunTask in the Amazon ECS API Reference.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The number of tasks to create based on TaskDefinition. The default is 1.
    */
  var TaskCount: js.UndefOr[LimitMin1] = js.undefined
  
  /**
    * The ARN of the task definition to use if the event target is an Amazon ECS task. 
    */
  var TaskDefinitionArn: Arn
}
object EcsParameters {
  
  inline def apply(TaskDefinitionArn: Arn): EcsParameters = {
    val __obj = js.Dynamic.literal(TaskDefinitionArn = TaskDefinitionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EcsParameters]
  }
  
  extension [Self <: EcsParameters](x: Self) {
    
    inline def setCapacityProviderStrategy(value: CapacityProviderStrategy): Self = StObject.set(x, "CapacityProviderStrategy", value.asInstanceOf[js.Any])
    
    inline def setCapacityProviderStrategyUndefined: Self = StObject.set(x, "CapacityProviderStrategy", js.undefined)
    
    inline def setCapacityProviderStrategyVarargs(value: CapacityProviderStrategyItem*): Self = StObject.set(x, "CapacityProviderStrategy", js.Array(value*))
    
    inline def setEnableECSManagedTags(value: Boolean): Self = StObject.set(x, "EnableECSManagedTags", value.asInstanceOf[js.Any])
    
    inline def setEnableECSManagedTagsUndefined: Self = StObject.set(x, "EnableECSManagedTags", js.undefined)
    
    inline def setEnableExecuteCommand(value: Boolean): Self = StObject.set(x, "EnableExecuteCommand", value.asInstanceOf[js.Any])
    
    inline def setEnableExecuteCommandUndefined: Self = StObject.set(x, "EnableExecuteCommand", js.undefined)
    
    inline def setGroup(value: String): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
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
    
    inline def setPlatformVersion(value: String): Self = StObject.set(x, "PlatformVersion", value.asInstanceOf[js.Any])
    
    inline def setPlatformVersionUndefined: Self = StObject.set(x, "PlatformVersion", js.undefined)
    
    inline def setPropagateTags(value: PropagateTags): Self = StObject.set(x, "PropagateTags", value.asInstanceOf[js.Any])
    
    inline def setPropagateTagsUndefined: Self = StObject.set(x, "PropagateTags", js.undefined)
    
    inline def setReferenceId(value: ReferenceId): Self = StObject.set(x, "ReferenceId", value.asInstanceOf[js.Any])
    
    inline def setReferenceIdUndefined: Self = StObject.set(x, "ReferenceId", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTaskCount(value: LimitMin1): Self = StObject.set(x, "TaskCount", value.asInstanceOf[js.Any])
    
    inline def setTaskCountUndefined: Self = StObject.set(x, "TaskCount", js.undefined)
    
    inline def setTaskDefinitionArn(value: Arn): Self = StObject.set(x, "TaskDefinitionArn", value.asInstanceOf[js.Any])
  }
}
