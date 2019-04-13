package typings
package awsDashSdkLib.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Service extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the cluster that hosts the service.
    */
  var clusterArn: js.UndefOr[String] = js.undefined
  /**
    * The Unix timestamp for when the service was created.
    */
  var createdAt: js.UndefOr[Timestamp] = js.undefined
  /**
    * The principal that created the service.
    */
  var createdBy: js.UndefOr[String] = js.undefined
  /**
    * Optional deployment parameters that control how many tasks run during the deployment and the ordering of stopping and starting tasks.
    */
  var deploymentConfiguration: js.UndefOr[DeploymentConfiguration] = js.undefined
  /**
    * The deployment controller type the service is using.
    */
  var deploymentController: js.UndefOr[DeploymentController] = js.undefined
  /**
    * The current state of deployments for the service.
    */
  var deployments: js.UndefOr[Deployments] = js.undefined
  /**
    * The desired number of instantiations of the task definition to keep running on the service. This value is specified when the service is created with CreateService, and it can be modified with UpdateService.
    */
  var desiredCount: js.UndefOr[Integer] = js.undefined
  /**
    * Specifies whether to enable Amazon ECS managed tags for the tasks in the service. For more information, see Tagging Your Amazon ECS Resources in the Amazon Elastic Container Service Developer Guide.
    */
  var enableECSManagedTags: js.UndefOr[Boolean] = js.undefined
  /**
    * The event stream for your service. A maximum of 100 of the latest events are displayed.
    */
  var events: js.UndefOr[ServiceEvents] = js.undefined
  /**
    * The period of time, in seconds, that the Amazon ECS service scheduler ignores unhealthy Elastic Load Balancing target health checks after a task has first started.
    */
  var healthCheckGracePeriodSeconds: js.UndefOr[BoxedInteger] = js.undefined
  /**
    * The launch type on which your service is running. For more information, see Amazon ECS Launch Types in the Amazon Elastic Container Service Developer Guide.
    */
  var launchType: js.UndefOr[LaunchType] = js.undefined
  /**
    * A list of Elastic Load Balancing load balancer objects, containing the load balancer name, the container name (as it appears in a container definition), and the container port to access from the load balancer. Services with tasks that use the awsvpc network mode (for example, those with the Fargate launch type) only support Application Load Balancers and Network Load Balancers. Classic Load Balancers are not supported. Also, when you create any target groups for these services, you must choose ip as the target type, not instance. Tasks that use the awsvpc network mode are associated with an elastic network interface, not an Amazon EC2 instance.
    */
  var loadBalancers: js.UndefOr[LoadBalancers] = js.undefined
  /**
    * The VPC subnet and security group configuration for tasks that receive their own elastic network interface by using the awsvpc networking mode.
    */
  var networkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined
  /**
    * The number of tasks in the cluster that are in the PENDING state.
    */
  var pendingCount: js.UndefOr[Integer] = js.undefined
  /**
    * The placement constraints for the tasks in the service.
    */
  var placementConstraints: js.UndefOr[PlacementConstraints] = js.undefined
  /**
    * The placement strategy that determines how tasks for the service are placed.
    */
  var placementStrategy: js.UndefOr[PlacementStrategies] = js.undefined
  /**
    * The platform version on which your tasks in the service are running. A platform version is only specified for tasks using the Fargate launch type. If one is not specified, the LATEST platform version is used by default. For more information, see AWS Fargate Platform Versions in the Amazon Elastic Container Service Developer Guide.
    */
  var platformVersion: js.UndefOr[String] = js.undefined
  /**
    * Specifies whether to propagate the tags from the task definition or the service to the task. If no value is specified, the tags are not propagated.
    */
  var propagateTags: js.UndefOr[PropagateTags] = js.undefined
  /**
    * The ARN of the IAM role associated with the service that allows the Amazon ECS container agent to register container instances with an Elastic Load Balancing load balancer.
    */
  var roleArn: js.UndefOr[String] = js.undefined
  /**
    * The number of tasks in the cluster that are in the RUNNING state.
    */
  var runningCount: js.UndefOr[Integer] = js.undefined
  /**
    * The scheduling strategy to use for the service. For more information, see Services. There are two service scheduler strategies available:    REPLICA-The replica scheduling strategy places and maintains the desired number of tasks across your cluster. By default, the service scheduler spreads tasks across Availability Zones. You can use task placement strategies and constraints to customize task placement decisions.    DAEMON-The daemon scheduling strategy deploys exactly one task on each container instance in your cluster. When you are using this strategy, do not specify a desired number of tasks or any task placement strategies.  Fargate tasks do not support the DAEMON scheduling strategy.   
    */
  var schedulingStrategy: js.UndefOr[SchedulingStrategy] = js.undefined
  /**
    * The ARN that identifies the service. The ARN contains the arn:aws:ecs namespace, followed by the Region of the service, the AWS account ID of the service owner, the service namespace, and then the service name. For example, arn:aws:ecs:region:012345678910:service/my-service .
    */
  var serviceArn: js.UndefOr[String] = js.undefined
  /**
    * The name of your service. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed. Service names must be unique within a cluster, but you can have similarly named services in multiple clusters within a Region or across multiple Regions.
    */
  var serviceName: js.UndefOr[String] = js.undefined
  /**
    * The details of the service discovery registries to assign to this service. For more information, see Service Discovery.
    */
  var serviceRegistries: js.UndefOr[ServiceRegistries] = js.undefined
  /**
    * The status of the service. The valid values are ACTIVE, DRAINING, or INACTIVE.
    */
  var status: js.UndefOr[String] = js.undefined
  /**
    * The metadata that you apply to the service to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters.
    */
  var tags: js.UndefOr[Tags] = js.undefined
  /**
    * The task definition to use for tasks in the service. This value is specified when the service is created with CreateService, and it can be modified with UpdateService.
    */
  var taskDefinition: js.UndefOr[String] = js.undefined
  /**
    * Information about a set of Amazon ECS tasks in either an AWS CodeDeploy or an EXTERNAL deployment. An Amazon ECS task set includes details such as the desired number of tasks, how many tasks are running, and whether the task set serves production traffic.
    */
  var taskSets: js.UndefOr[TaskSets] = js.undefined
}

object Service {
  @scala.inline
  def apply(
    clusterArn: String = null,
    createdAt: Timestamp = null,
    createdBy: String = null,
    deploymentConfiguration: DeploymentConfiguration = null,
    deploymentController: DeploymentController = null,
    deployments: Deployments = null,
    desiredCount: js.UndefOr[Integer] = js.undefined,
    enableECSManagedTags: js.UndefOr[Boolean] = js.undefined,
    events: ServiceEvents = null,
    healthCheckGracePeriodSeconds: js.UndefOr[BoxedInteger] = js.undefined,
    launchType: LaunchType = null,
    loadBalancers: LoadBalancers = null,
    networkConfiguration: NetworkConfiguration = null,
    pendingCount: js.UndefOr[Integer] = js.undefined,
    placementConstraints: PlacementConstraints = null,
    placementStrategy: PlacementStrategies = null,
    platformVersion: String = null,
    propagateTags: PropagateTags = null,
    roleArn: String = null,
    runningCount: js.UndefOr[Integer] = js.undefined,
    schedulingStrategy: SchedulingStrategy = null,
    serviceArn: String = null,
    serviceName: String = null,
    serviceRegistries: ServiceRegistries = null,
    status: String = null,
    tags: Tags = null,
    taskDefinition: String = null,
    taskSets: TaskSets = null
  ): Service = {
    val __obj = js.Dynamic.literal()
    if (clusterArn != null) __obj.updateDynamic("clusterArn")(clusterArn)
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (createdBy != null) __obj.updateDynamic("createdBy")(createdBy)
    if (deploymentConfiguration != null) __obj.updateDynamic("deploymentConfiguration")(deploymentConfiguration)
    if (deploymentController != null) __obj.updateDynamic("deploymentController")(deploymentController)
    if (deployments != null) __obj.updateDynamic("deployments")(deployments)
    if (!js.isUndefined(desiredCount)) __obj.updateDynamic("desiredCount")(desiredCount)
    if (!js.isUndefined(enableECSManagedTags)) __obj.updateDynamic("enableECSManagedTags")(enableECSManagedTags)
    if (events != null) __obj.updateDynamic("events")(events)
    if (!js.isUndefined(healthCheckGracePeriodSeconds)) __obj.updateDynamic("healthCheckGracePeriodSeconds")(healthCheckGracePeriodSeconds)
    if (launchType != null) __obj.updateDynamic("launchType")(launchType.asInstanceOf[js.Any])
    if (loadBalancers != null) __obj.updateDynamic("loadBalancers")(loadBalancers)
    if (networkConfiguration != null) __obj.updateDynamic("networkConfiguration")(networkConfiguration)
    if (!js.isUndefined(pendingCount)) __obj.updateDynamic("pendingCount")(pendingCount)
    if (placementConstraints != null) __obj.updateDynamic("placementConstraints")(placementConstraints)
    if (placementStrategy != null) __obj.updateDynamic("placementStrategy")(placementStrategy)
    if (platformVersion != null) __obj.updateDynamic("platformVersion")(platformVersion)
    if (propagateTags != null) __obj.updateDynamic("propagateTags")(propagateTags.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn)
    if (!js.isUndefined(runningCount)) __obj.updateDynamic("runningCount")(runningCount)
    if (schedulingStrategy != null) __obj.updateDynamic("schedulingStrategy")(schedulingStrategy.asInstanceOf[js.Any])
    if (serviceArn != null) __obj.updateDynamic("serviceArn")(serviceArn)
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName)
    if (serviceRegistries != null) __obj.updateDynamic("serviceRegistries")(serviceRegistries)
    if (status != null) __obj.updateDynamic("status")(status)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (taskDefinition != null) __obj.updateDynamic("taskDefinition")(taskDefinition)
    if (taskSets != null) __obj.updateDynamic("taskSets")(taskSets)
    __obj.asInstanceOf[Service]
  }
}

