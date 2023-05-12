package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deployment extends StObject {
  
  /**
    * The capacity provider strategy that the deployment is using.
    */
  var capacityProviderStrategy: js.UndefOr[CapacityProviderStrategy] = js.undefined
  
  /**
    * The Unix timestamp for the time when the service deployment was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The most recent desired count of tasks that was specified for the service to deploy or maintain.
    */
  var desiredCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of consecutively failed tasks in the deployment. A task is considered a failure if the service scheduler can't launch the task, the task doesn't transition to a RUNNING state, or if it fails any of its defined health checks and is stopped.  Once a service deployment has one or more successfully running tasks, the failed task count resets to zero and stops being evaluated. 
    */
  var failedTasks: js.UndefOr[Integer] = js.undefined
  
  /**
    * The ID of the deployment.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The launch type the tasks in the service are using. For more information, see Amazon ECS Launch Types in the Amazon Elastic Container Service Developer Guide.
    */
  var launchType: js.UndefOr[LaunchType] = js.undefined
  
  /**
    * The VPC subnet and security group configuration for tasks that receive their own elastic network interface by using the awsvpc networking mode.
    */
  var networkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined
  
  /**
    * The number of tasks in the deployment that are in the PENDING status.
    */
  var pendingCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The operating system that your tasks in the service, or tasks are running on. A platform family is specified only for tasks using the Fargate launch type.   All tasks that run as part of this service must use the same platformFamily value as the service, for example,  LINUX..
    */
  var platformFamily: js.UndefOr[String] = js.undefined
  
  /**
    * The platform version that your tasks in the service run on. A platform version is only specified for tasks using the Fargate launch type. If one isn't specified, the LATEST platform version is used. For more information, see Fargate Platform Versions in the Amazon Elastic Container Service Developer Guide.
    */
  var platformVersion: js.UndefOr[String] = js.undefined
  
  /**
    *  The rolloutState of a service is only returned for services that use the rolling update (ECS) deployment type that aren't behind a Classic Load Balancer.  The rollout state of the deployment. When a service deployment is started, it begins in an IN_PROGRESS state. When the service reaches a steady state, the deployment transitions to a COMPLETED state. If the service fails to reach a steady state and circuit breaker is turned on, the deployment transitions to a FAILED state. A deployment in FAILED state doesn't launch any new tasks. For more information, see DeploymentCircuitBreaker.
    */
  var rolloutState: js.UndefOr[DeploymentRolloutState] = js.undefined
  
  /**
    * A description of the rollout state of a deployment.
    */
  var rolloutStateReason: js.UndefOr[String] = js.undefined
  
  /**
    * The number of tasks in the deployment that are in the RUNNING status.
    */
  var runningCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The details of the Service Connect configuration that's used by this deployment. Compare the configuration between multiple deployments when troubleshooting issues with new deployments. The configuration for this service to discover and connect to services, and be discovered by, and connected from, other services within a namespace. Tasks that run in a namespace can use short names to connect to services in the namespace. Tasks can connect to services across all of the clusters in the namespace. Tasks connect through a managed proxy container that collects logs and metrics for increased visibility. Only the tasks that Amazon ECS services create are supported with Service Connect. For more information, see Service Connect in the Amazon Elastic Container Service Developer Guide.
    */
  var serviceConnectConfiguration: js.UndefOr[ServiceConnectConfiguration] = js.undefined
  
  /**
    * The list of Service Connect resources that are associated with this deployment. Each list entry maps a discovery name to a Cloud Map service name.
    */
  var serviceConnectResources: js.UndefOr[ServiceConnectServiceResourceList] = js.undefined
  
  /**
    * The status of the deployment. The following describes each state.  PRIMARY  The most recent deployment of a service.  ACTIVE  A service deployment that still has running tasks, but are in the process of being replaced with a new PRIMARY deployment.  INACTIVE  A deployment that has been completely replaced.  
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * The most recent task definition that was specified for the tasks in the service to use.
    */
  var taskDefinition: js.UndefOr[String] = js.undefined
  
  /**
    * The Unix timestamp for the time when the service deployment was last updated.
    */
  var updatedAt: js.UndefOr[js.Date] = js.undefined
}
object Deployment {
  
  inline def apply(): Deployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deployment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Deployment] (val x: Self) extends AnyVal {
    
    inline def setCapacityProviderStrategy(value: CapacityProviderStrategy): Self = StObject.set(x, "capacityProviderStrategy", value.asInstanceOf[js.Any])
    
    inline def setCapacityProviderStrategyUndefined: Self = StObject.set(x, "capacityProviderStrategy", js.undefined)
    
    inline def setCapacityProviderStrategyVarargs(value: CapacityProviderStrategyItem*): Self = StObject.set(x, "capacityProviderStrategy", js.Array(value*))
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setDesiredCount(value: Integer): Self = StObject.set(x, "desiredCount", value.asInstanceOf[js.Any])
    
    inline def setDesiredCountUndefined: Self = StObject.set(x, "desiredCount", js.undefined)
    
    inline def setFailedTasks(value: Integer): Self = StObject.set(x, "failedTasks", value.asInstanceOf[js.Any])
    
    inline def setFailedTasksUndefined: Self = StObject.set(x, "failedTasks", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLaunchType(value: LaunchType): Self = StObject.set(x, "launchType", value.asInstanceOf[js.Any])
    
    inline def setLaunchTypeUndefined: Self = StObject.set(x, "launchType", js.undefined)
    
    inline def setNetworkConfiguration(value: NetworkConfiguration): Self = StObject.set(x, "networkConfiguration", value.asInstanceOf[js.Any])
    
    inline def setNetworkConfigurationUndefined: Self = StObject.set(x, "networkConfiguration", js.undefined)
    
    inline def setPendingCount(value: Integer): Self = StObject.set(x, "pendingCount", value.asInstanceOf[js.Any])
    
    inline def setPendingCountUndefined: Self = StObject.set(x, "pendingCount", js.undefined)
    
    inline def setPlatformFamily(value: String): Self = StObject.set(x, "platformFamily", value.asInstanceOf[js.Any])
    
    inline def setPlatformFamilyUndefined: Self = StObject.set(x, "platformFamily", js.undefined)
    
    inline def setPlatformVersion(value: String): Self = StObject.set(x, "platformVersion", value.asInstanceOf[js.Any])
    
    inline def setPlatformVersionUndefined: Self = StObject.set(x, "platformVersion", js.undefined)
    
    inline def setRolloutState(value: DeploymentRolloutState): Self = StObject.set(x, "rolloutState", value.asInstanceOf[js.Any])
    
    inline def setRolloutStateReason(value: String): Self = StObject.set(x, "rolloutStateReason", value.asInstanceOf[js.Any])
    
    inline def setRolloutStateReasonUndefined: Self = StObject.set(x, "rolloutStateReason", js.undefined)
    
    inline def setRolloutStateUndefined: Self = StObject.set(x, "rolloutState", js.undefined)
    
    inline def setRunningCount(value: Integer): Self = StObject.set(x, "runningCount", value.asInstanceOf[js.Any])
    
    inline def setRunningCountUndefined: Self = StObject.set(x, "runningCount", js.undefined)
    
    inline def setServiceConnectConfiguration(value: ServiceConnectConfiguration): Self = StObject.set(x, "serviceConnectConfiguration", value.asInstanceOf[js.Any])
    
    inline def setServiceConnectConfigurationUndefined: Self = StObject.set(x, "serviceConnectConfiguration", js.undefined)
    
    inline def setServiceConnectResources(value: ServiceConnectServiceResourceList): Self = StObject.set(x, "serviceConnectResources", value.asInstanceOf[js.Any])
    
    inline def setServiceConnectResourcesUndefined: Self = StObject.set(x, "serviceConnectResources", js.undefined)
    
    inline def setServiceConnectResourcesVarargs(value: ServiceConnectServiceResource*): Self = StObject.set(x, "serviceConnectResources", js.Array(value*))
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTaskDefinition(value: String): Self = StObject.set(x, "taskDefinition", value.asInstanceOf[js.Any])
    
    inline def setTaskDefinitionUndefined: Self = StObject.set(x, "taskDefinition", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
  }
}
