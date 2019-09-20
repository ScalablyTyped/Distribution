package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateServiceRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. Up to 32 ASCII characters are allowed.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster on which to run your service. If you do not specify a cluster, the default cluster is assumed.
    */
  var cluster: js.UndefOr[String] = js.undefined
  /**
    * Optional deployment parameters that control how many tasks run during the deployment and the ordering of stopping and starting tasks.
    */
  var deploymentConfiguration: js.UndefOr[DeploymentConfiguration] = js.undefined
  /**
    * The deployment controller to use for the service.
    */
  var deploymentController: js.UndefOr[DeploymentController] = js.undefined
  /**
    * The number of instantiations of the specified task definition to place and keep running on your cluster. This is required if schedulingStrategy is REPLICA or is not specified. If schedulingStrategy is DAEMON then this is not required.
    */
  var desiredCount: js.UndefOr[BoxedInteger] = js.undefined
  /**
    * Specifies whether to enable Amazon ECS managed tags for the tasks within the service. For more information, see Tagging Your Amazon ECS Resources in the Amazon Elastic Container Service Developer Guide.
    */
  var enableECSManagedTags: js.UndefOr[Boolean] = js.undefined
  /**
    * The period of time, in seconds, that the Amazon ECS service scheduler should ignore unhealthy Elastic Load Balancing target health checks after a task has first started. This is only valid if your service is configured to use a load balancer. If your service's tasks take a while to start and respond to Elastic Load Balancing health checks, you can specify a health check grace period of up to 2,147,483,647 seconds. During that time, the ECS service scheduler ignores health check status. This grace period can prevent the ECS service scheduler from marking tasks as unhealthy and stopping them before they have time to come up.
    */
  var healthCheckGracePeriodSeconds: js.UndefOr[BoxedInteger] = js.undefined
  /**
    * The launch type on which to run your service. For more information, see Amazon ECS Launch Types in the Amazon Elastic Container Service Developer Guide.
    */
  var launchType: js.UndefOr[LaunchType] = js.undefined
  /**
    * A load balancer object representing the load balancers to use with your service. For more information, see Service Load Balancing in the Amazon Elastic Container Service Developer Guide. If the service is using the rolling update (ECS) deployment controller and using either an Application Load Balancer or Network Load Balancer, you can specify multiple target groups to attach to the service. The service-linked role is required for services that make use of multiple target groups. For more information, see Using Service-Linked Roles for Amazon ECS in the Amazon Elastic Container Service Developer Guide. If the service is using the CODE_DEPLOY deployment controller, the service is required to use either an Application Load Balancer or Network Load Balancer. When creating an AWS CodeDeploy deployment group, you specify two target groups (referred to as a targetGroupPair). During a deployment, AWS CodeDeploy determines which task set in your service has the status PRIMARY and associates one target group with it, and then associates the other target group with the replacement task set. The load balancer can also have up to two listeners: a required listener for production traffic and an optional listener that allows you perform validation tests with Lambda functions before routing production traffic to it. After you create a service using the ECS deployment controller, the load balancer name or target group ARN, container name, and container port specified in the service definition are immutable. If you are using the CODE_DEPLOY deployment controller, these values can be changed when updating the service. For Application Load Balancers and Network Load Balancers, this object must contain the load balancer target group ARN, the container name (as it appears in a container definition), and the container port to access from the load balancer. When a task from this service is placed on a container instance, the container instance and port combination is registered as a target in the target group specified here. For Classic Load Balancers, this object must contain the load balancer name, the container name (as it appears in a container definition), and the container port to access from the load balancer. When a task from this service is placed on a container instance, the container instance is registered with the load balancer specified here. Services with tasks that use the awsvpc network mode (for example, those with the Fargate launch type) only support Application Load Balancers and Network Load Balancers. Classic Load Balancers are not supported. Also, when you create any target groups for these services, you must choose ip as the target type, not instance, because tasks that use the awsvpc network mode are associated with an elastic network interface, not an Amazon EC2 instance.
    */
  var loadBalancers: js.UndefOr[LoadBalancers] = js.undefined
  /**
    * The network configuration for the service. This parameter is required for task definitions that use the awsvpc network mode to receive their own elastic network interface, and it is not supported for other network modes. For more information, see Task Networking in the Amazon Elastic Container Service Developer Guide.
    */
  var networkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined
  /**
    * An array of placement constraint objects to use for tasks in your service. You can specify a maximum of 10 constraints per task (this limit includes constraints in the task definition and those specified at runtime). 
    */
  var placementConstraints: js.UndefOr[PlacementConstraints] = js.undefined
  /**
    * The placement strategy objects to use for tasks in your service. You can specify a maximum of five strategy rules per service.
    */
  var placementStrategy: js.UndefOr[PlacementStrategies] = js.undefined
  /**
    * The platform version that your tasks in the service are running on. A platform version is specified only for tasks using the Fargate launch type. If one isn't specified, the LATEST platform version is used by default. For more information, see AWS Fargate Platform Versions in the Amazon Elastic Container Service Developer Guide.
    */
  var platformVersion: js.UndefOr[String] = js.undefined
  /**
    * Specifies whether to propagate the tags from the task definition or the service to the tasks in the service. If no value is specified, the tags are not propagated. Tags can only be propagated to the tasks within the service during service creation. To add tags to a task after service creation, use the TagResource API action.
    */
  var propagateTags: js.UndefOr[PropagateTags] = js.undefined
  /**
    * The name or full Amazon Resource Name (ARN) of the IAM role that allows Amazon ECS to make calls to your load balancer on your behalf. This parameter is only permitted if you are using a load balancer with your service and your task definition does not use the awsvpc network mode. If you specify the role parameter, you must also specify a load balancer object with the loadBalancers parameter.  If your account has already created the Amazon ECS service-linked role, that role is used by default for your service unless you specify a role here. The service-linked role is required if your task definition uses the awsvpc network mode or if the service is configured to use service discovery, an external deployment controller, or multiple target groups in which case you should not specify a role here. For more information, see Using Service-Linked Roles for Amazon ECS in the Amazon Elastic Container Service Developer Guide.  If your specified role has a path other than /, then you must either specify the full role ARN (this is recommended) or prefix the role name with the path. For example, if a role with the name bar has a path of /foo/ then you would specify /foo/bar as the role name. For more information, see Friendly Names and Paths in the IAM User Guide.
    */
  var role: js.UndefOr[String] = js.undefined
  /**
    * The scheduling strategy to use for the service. For more information, see Services. There are two service scheduler strategies available:    REPLICA-The replica scheduling strategy places and maintains the desired number of tasks across your cluster. By default, the service scheduler spreads tasks across Availability Zones. You can use task placement strategies and constraints to customize task placement decisions. This scheduler strategy is required if the service is using the CODE_DEPLOY or EXTERNAL deployment controller types.    DAEMON-The daemon scheduling strategy deploys exactly one task on each active container instance that meets all of the task placement constraints that you specify in your cluster. When you're using this strategy, you don't need to specify a desired number of tasks, a task placement strategy, or use Service Auto Scaling policies.  Tasks using the Fargate launch type or the CODE_DEPLOY or EXTERNAL deployment controller types don't support the DAEMON scheduling strategy.   
    */
  var schedulingStrategy: js.UndefOr[SchedulingStrategy] = js.undefined
  /**
    * The name of your service. Up to 255 letters (uppercase and lowercase), numbers, and hyphens are allowed. Service names must be unique within a cluster, but you can have similarly named services in multiple clusters within a Region or across multiple Regions.
    */
  var serviceName: String
  /**
    * The details of the service discovery registries to assign to this service. For more information, see Service Discovery.  Service discovery is supported for Fargate tasks if you are using platform version v1.1.0 or later. For more information, see AWS Fargate Platform Versions. 
    */
  var serviceRegistries: js.UndefOr[ServiceRegistries] = js.undefined
  /**
    * The metadata that you apply to the service to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. When a service is deleted, the tags are deleted as well. The following basic restrictions apply to tags:   Maximum number of tags per resource - 50   For each resource, each tag key must be unique, and each tag key can have only one value.   Maximum key length - 128 Unicode characters in UTF-8   Maximum value length - 256 Unicode characters in UTF-8   If your tagging schema is used across multiple services and resources, remember that other services may have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : / @.   Tag keys and values are case-sensitive.   Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for either keys or values as it is reserved for AWS use. You cannot edit or delete tag keys or values with this prefix. Tags with this prefix do not count against your tags per resource limit.  
    */
  var tags: js.UndefOr[Tags] = js.undefined
  /**
    * The family and revision (family:revision) or full ARN of the task definition to run in your service. If a revision is not specified, the latest ACTIVE revision is used. A task definition must be specified if the service is using the ECS deployment controller.
    */
  var taskDefinition: js.UndefOr[String] = js.undefined
}

object CreateServiceRequest {
  @scala.inline
  def apply(
    serviceName: String,
    clientToken: String = null,
    cluster: String = null,
    deploymentConfiguration: DeploymentConfiguration = null,
    deploymentController: DeploymentController = null,
    desiredCount: js.UndefOr[BoxedInteger] = js.undefined,
    enableECSManagedTags: js.UndefOr[Boolean] = js.undefined,
    healthCheckGracePeriodSeconds: js.UndefOr[BoxedInteger] = js.undefined,
    launchType: LaunchType = null,
    loadBalancers: LoadBalancers = null,
    networkConfiguration: NetworkConfiguration = null,
    placementConstraints: PlacementConstraints = null,
    placementStrategy: PlacementStrategies = null,
    platformVersion: String = null,
    propagateTags: PropagateTags = null,
    role: String = null,
    schedulingStrategy: SchedulingStrategy = null,
    serviceRegistries: ServiceRegistries = null,
    tags: Tags = null,
    taskDefinition: String = null
  ): CreateServiceRequest = {
    val __obj = js.Dynamic.literal(serviceName = serviceName)
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken)
    if (cluster != null) __obj.updateDynamic("cluster")(cluster)
    if (deploymentConfiguration != null) __obj.updateDynamic("deploymentConfiguration")(deploymentConfiguration)
    if (deploymentController != null) __obj.updateDynamic("deploymentController")(deploymentController)
    if (!js.isUndefined(desiredCount)) __obj.updateDynamic("desiredCount")(desiredCount)
    if (!js.isUndefined(enableECSManagedTags)) __obj.updateDynamic("enableECSManagedTags")(enableECSManagedTags)
    if (!js.isUndefined(healthCheckGracePeriodSeconds)) __obj.updateDynamic("healthCheckGracePeriodSeconds")(healthCheckGracePeriodSeconds)
    if (launchType != null) __obj.updateDynamic("launchType")(launchType.asInstanceOf[js.Any])
    if (loadBalancers != null) __obj.updateDynamic("loadBalancers")(loadBalancers)
    if (networkConfiguration != null) __obj.updateDynamic("networkConfiguration")(networkConfiguration)
    if (placementConstraints != null) __obj.updateDynamic("placementConstraints")(placementConstraints)
    if (placementStrategy != null) __obj.updateDynamic("placementStrategy")(placementStrategy)
    if (platformVersion != null) __obj.updateDynamic("platformVersion")(platformVersion)
    if (propagateTags != null) __obj.updateDynamic("propagateTags")(propagateTags.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role)
    if (schedulingStrategy != null) __obj.updateDynamic("schedulingStrategy")(schedulingStrategy.asInstanceOf[js.Any])
    if (serviceRegistries != null) __obj.updateDynamic("serviceRegistries")(serviceRegistries)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (taskDefinition != null) __obj.updateDynamic("taskDefinition")(taskDefinition)
    __obj.asInstanceOf[CreateServiceRequest]
  }
}

