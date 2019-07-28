package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateServiceRequest extends js.Object {
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that your service is running on. If you do not specify a cluster, the default cluster is assumed.
    */
  var cluster: js.UndefOr[String] = js.undefined
  /**
    * Optional deployment parameters that control how many tasks run during the deployment and the ordering of stopping and starting tasks.
    */
  var deploymentConfiguration: js.UndefOr[DeploymentConfiguration] = js.undefined
  /**
    * The number of instantiations of the task to place and keep running in your service.
    */
  var desiredCount: js.UndefOr[BoxedInteger] = js.undefined
  /**
    * Whether to force a new deployment of the service. Deployments are not forced by default. You can use this option to trigger a new deployment with no service definition changes. For example, you can update a service's tasks to use a newer Docker image with the same image/tag combination (my_image:latest) or to roll Fargate tasks onto a newer platform version.
    */
  var forceNewDeployment: js.UndefOr[Boolean] = js.undefined
  /**
    * The period of time, in seconds, that the Amazon ECS service scheduler should ignore unhealthy Elastic Load Balancing target health checks after a task has first started. This is only valid if your service is configured to use a load balancer. If your service's tasks take a while to start and respond to Elastic Load Balancing health checks, you can specify a health check grace period of up to 1,800 seconds. During that time, the ECS service scheduler ignores the Elastic Load Balancing health check status. This grace period can prevent the ECS service scheduler from marking tasks as unhealthy and stopping them before they have time to come up.
    */
  var healthCheckGracePeriodSeconds: js.UndefOr[BoxedInteger] = js.undefined
  /**
    * The network configuration for the service. This parameter is required for task definitions that use the awsvpc network mode to receive their own elastic network interface, and it is not supported for other network modes. For more information, see Task Networking in the Amazon Elastic Container Service Developer Guide.  Updating a service to add a subnet to a list of existing subnets does not trigger a service deployment. For example, if your network configuration change is to keep the existing subnets and simply add another subnet to the network configuration, this does not trigger a new service deployment. 
    */
  var networkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined
  /**
    * The platform version on which your tasks in the service are running. A platform version is only specified for tasks using the Fargate launch type. If one is not specified, the LATEST platform version is used by default. For more information, see AWS Fargate Platform Versions in the Amazon Elastic Container Service Developer Guide.
    */
  var platformVersion: js.UndefOr[String] = js.undefined
  /**
    * The name of the service to update.
    */
  var service: String
  /**
    * The family and revision (family:revision) or full ARN of the task definition to run in your service. If a revision is not specified, the latest ACTIVE revision is used. If you modify the task definition with UpdateService, Amazon ECS spawns a task with the new version of the task definition and then stops an old task after the new version is running.
    */
  var taskDefinition: js.UndefOr[String] = js.undefined
}

object UpdateServiceRequest {
  @scala.inline
  def apply(
    service: String,
    cluster: String = null,
    deploymentConfiguration: DeploymentConfiguration = null,
    desiredCount: js.UndefOr[BoxedInteger] = js.undefined,
    forceNewDeployment: js.UndefOr[Boolean] = js.undefined,
    healthCheckGracePeriodSeconds: js.UndefOr[BoxedInteger] = js.undefined,
    networkConfiguration: NetworkConfiguration = null,
    platformVersion: String = null,
    taskDefinition: String = null
  ): UpdateServiceRequest = {
    val __obj = js.Dynamic.literal(service = service)
    if (cluster != null) __obj.updateDynamic("cluster")(cluster)
    if (deploymentConfiguration != null) __obj.updateDynamic("deploymentConfiguration")(deploymentConfiguration)
    if (!js.isUndefined(desiredCount)) __obj.updateDynamic("desiredCount")(desiredCount)
    if (!js.isUndefined(forceNewDeployment)) __obj.updateDynamic("forceNewDeployment")(forceNewDeployment)
    if (!js.isUndefined(healthCheckGracePeriodSeconds)) __obj.updateDynamic("healthCheckGracePeriodSeconds")(healthCheckGracePeriodSeconds)
    if (networkConfiguration != null) __obj.updateDynamic("networkConfiguration")(networkConfiguration)
    if (platformVersion != null) __obj.updateDynamic("platformVersion")(platformVersion)
    if (taskDefinition != null) __obj.updateDynamic("taskDefinition")(taskDefinition)
    __obj.asInstanceOf[UpdateServiceRequest]
  }
}

