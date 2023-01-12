package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskSet extends StObject {
  
  /**
    * The capacity provider strategy that are associated with the task set.
    */
  var capacityProviderStrategy: js.UndefOr[CapacityProviderStrategy] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the cluster that the service that hosts the task set exists in.
    */
  var clusterArn: js.UndefOr[String] = js.undefined
  
  /**
    * The computed desired count for the task set. This is calculated by multiplying the service's desiredCount by the task set's scale percentage. The result is always rounded up. For example, if the computed desired count is 1.2, it rounds up to 2 tasks.
    */
  var computedDesiredCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The Unix timestamp for the time when the task set was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The external ID associated with the task set. If an CodeDeploy deployment created a task set, the externalId parameter contains the CodeDeploy deployment ID. If a task set is created for an external deployment and is associated with a service discovery registry, the externalId parameter contains the ECS_TASK_SET_EXTERNAL_ID Cloud Map attribute.
    */
  var externalId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the task set.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The launch type the tasks in the task set are using. For more information, see Amazon ECS launch types in the Amazon Elastic Container Service Developer Guide.
    */
  var launchType: js.UndefOr[LaunchType] = js.undefined
  
  /**
    * Details on a load balancer that are used with a task set.
    */
  var loadBalancers: js.UndefOr[LoadBalancers] = js.undefined
  
  /**
    * The network configuration for the task set.
    */
  var networkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined
  
  /**
    * The number of tasks in the task set that are in the PENDING status during a deployment. A task in the PENDING state is preparing to enter the RUNNING state. A task set enters the PENDING status when it launches for the first time or when it's restarted after being in the STOPPED state.
    */
  var pendingCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The operating system that your tasks in the set are running on. A platform family is specified only for tasks that use the Fargate launch type.   All tasks in the set must have the same value.
    */
  var platformFamily: js.UndefOr[String] = js.undefined
  
  /**
    * The Fargate platform version where the tasks in the task set are running. A platform version is only specified for tasks run on Fargate. For more information, see Fargate platform versions in the Amazon Elastic Container Service Developer Guide.
    */
  var platformVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The number of tasks in the task set that are in the RUNNING status during a deployment. A task in the RUNNING state is running and ready for use.
    */
  var runningCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * A floating-point percentage of your desired number of tasks to place and keep running in the task set.
    */
  var scale: js.UndefOr[Scale] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the service the task set exists in.
    */
  var serviceArn: js.UndefOr[String] = js.undefined
  
  /**
    * The details for the service discovery registries to assign to this task set. For more information, see Service discovery.
    */
  var serviceRegistries: js.UndefOr[ServiceRegistries] = js.undefined
  
  /**
    * The stability status. This indicates whether the task set has reached a steady state. If the following conditions are met, the task set sre in STEADY_STATE:   The task runningCount is equal to the computedDesiredCount.   The pendingCount is 0.   There are no tasks that are running on container instances in the DRAINING status.   All tasks are reporting a healthy status from the load balancers, service discovery, and container health checks.   If any of those conditions aren't met, the stability status returns STABILIZING.
    */
  var stabilityStatus: js.UndefOr[StabilityStatus] = js.undefined
  
  /**
    * The Unix timestamp for the time when the task set stability status was retrieved.
    */
  var stabilityStatusAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The tag specified when a task set is started. If an CodeDeploy deployment created the task set, the startedBy parameter is CODE_DEPLOY. If an external deployment created the task set, the startedBy field isn't used.
    */
  var startedBy: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the task set. The following describes each state.  PRIMARY  The task set is serving production traffic.  ACTIVE  The task set isn't serving production traffic.  DRAINING  The tasks in the task set are being stopped, and their corresponding targets are being deregistered from their target group.  
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * The metadata that you apply to the task set to help you categorize and organize them. Each tag consists of a key and an optional value. You define both. The following basic restrictions apply to tags:   Maximum number of tags per resource - 50   For each resource, each tag key must be unique, and each tag key can have only one value.   Maximum key length - 128 Unicode characters in UTF-8   Maximum value length - 256 Unicode characters in UTF-8   If your tagging schema is used across multiple services and resources, remember that other services may have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : / @.   Tag keys and values are case-sensitive.   Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for either keys or values as it is reserved for Amazon Web Services use. You cannot edit or delete tag keys or values with this prefix. Tags with this prefix do not count against your tags per resource limit.  
    */
  var tags: js.UndefOr[Tags] = js.undefined
  
  /**
    * The task definition that the task set is using.
    */
  var taskDefinition: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the task set.
    */
  var taskSetArn: js.UndefOr[String] = js.undefined
  
  /**
    * The Unix timestamp for the time when the task set was last updated.
    */
  var updatedAt: js.UndefOr[js.Date] = js.undefined
}
object TaskSet {
  
  inline def apply(): TaskSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskSet] (val x: Self) extends AnyVal {
    
    inline def setCapacityProviderStrategy(value: CapacityProviderStrategy): Self = StObject.set(x, "capacityProviderStrategy", value.asInstanceOf[js.Any])
    
    inline def setCapacityProviderStrategyUndefined: Self = StObject.set(x, "capacityProviderStrategy", js.undefined)
    
    inline def setCapacityProviderStrategyVarargs(value: CapacityProviderStrategyItem*): Self = StObject.set(x, "capacityProviderStrategy", js.Array(value*))
    
    inline def setClusterArn(value: String): Self = StObject.set(x, "clusterArn", value.asInstanceOf[js.Any])
    
    inline def setClusterArnUndefined: Self = StObject.set(x, "clusterArn", js.undefined)
    
    inline def setComputedDesiredCount(value: Integer): Self = StObject.set(x, "computedDesiredCount", value.asInstanceOf[js.Any])
    
    inline def setComputedDesiredCountUndefined: Self = StObject.set(x, "computedDesiredCount", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setExternalId(value: String): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    inline def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLaunchType(value: LaunchType): Self = StObject.set(x, "launchType", value.asInstanceOf[js.Any])
    
    inline def setLaunchTypeUndefined: Self = StObject.set(x, "launchType", js.undefined)
    
    inline def setLoadBalancers(value: LoadBalancers): Self = StObject.set(x, "loadBalancers", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancersUndefined: Self = StObject.set(x, "loadBalancers", js.undefined)
    
    inline def setLoadBalancersVarargs(value: LoadBalancer*): Self = StObject.set(x, "loadBalancers", js.Array(value*))
    
    inline def setNetworkConfiguration(value: NetworkConfiguration): Self = StObject.set(x, "networkConfiguration", value.asInstanceOf[js.Any])
    
    inline def setNetworkConfigurationUndefined: Self = StObject.set(x, "networkConfiguration", js.undefined)
    
    inline def setPendingCount(value: Integer): Self = StObject.set(x, "pendingCount", value.asInstanceOf[js.Any])
    
    inline def setPendingCountUndefined: Self = StObject.set(x, "pendingCount", js.undefined)
    
    inline def setPlatformFamily(value: String): Self = StObject.set(x, "platformFamily", value.asInstanceOf[js.Any])
    
    inline def setPlatformFamilyUndefined: Self = StObject.set(x, "platformFamily", js.undefined)
    
    inline def setPlatformVersion(value: String): Self = StObject.set(x, "platformVersion", value.asInstanceOf[js.Any])
    
    inline def setPlatformVersionUndefined: Self = StObject.set(x, "platformVersion", js.undefined)
    
    inline def setRunningCount(value: Integer): Self = StObject.set(x, "runningCount", value.asInstanceOf[js.Any])
    
    inline def setRunningCountUndefined: Self = StObject.set(x, "runningCount", js.undefined)
    
    inline def setScale(value: Scale): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setServiceArn(value: String): Self = StObject.set(x, "serviceArn", value.asInstanceOf[js.Any])
    
    inline def setServiceArnUndefined: Self = StObject.set(x, "serviceArn", js.undefined)
    
    inline def setServiceRegistries(value: ServiceRegistries): Self = StObject.set(x, "serviceRegistries", value.asInstanceOf[js.Any])
    
    inline def setServiceRegistriesUndefined: Self = StObject.set(x, "serviceRegistries", js.undefined)
    
    inline def setServiceRegistriesVarargs(value: ServiceRegistry*): Self = StObject.set(x, "serviceRegistries", js.Array(value*))
    
    inline def setStabilityStatus(value: StabilityStatus): Self = StObject.set(x, "stabilityStatus", value.asInstanceOf[js.Any])
    
    inline def setStabilityStatusAt(value: js.Date): Self = StObject.set(x, "stabilityStatusAt", value.asInstanceOf[js.Any])
    
    inline def setStabilityStatusAtUndefined: Self = StObject.set(x, "stabilityStatusAt", js.undefined)
    
    inline def setStabilityStatusUndefined: Self = StObject.set(x, "stabilityStatus", js.undefined)
    
    inline def setStartedBy(value: String): Self = StObject.set(x, "startedBy", value.asInstanceOf[js.Any])
    
    inline def setStartedByUndefined: Self = StObject.set(x, "startedBy", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTaskDefinition(value: String): Self = StObject.set(x, "taskDefinition", value.asInstanceOf[js.Any])
    
    inline def setTaskDefinitionUndefined: Self = StObject.set(x, "taskDefinition", js.undefined)
    
    inline def setTaskSetArn(value: String): Self = StObject.set(x, "taskSetArn", value.asInstanceOf[js.Any])
    
    inline def setTaskSetArnUndefined: Self = StObject.set(x, "taskSetArn", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
  }
}
