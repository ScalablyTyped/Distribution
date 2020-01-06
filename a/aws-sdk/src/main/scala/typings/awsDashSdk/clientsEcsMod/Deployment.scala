package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deployment extends js.Object {
  /**
    * The capacity provider strategy that the deployment is using.
    */
  var capacityProviderStrategy: js.UndefOr[CapacityProviderStrategy] = js.native
  /**
    * The Unix timestamp for when the service deployment was created.
    */
  var createdAt: js.UndefOr[Timestamp] = js.native
  /**
    * The most recent desired count of tasks that was specified for the service to deploy or maintain.
    */
  var desiredCount: js.UndefOr[Integer] = js.native
  /**
    * The ID of the deployment.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The launch type the tasks in the service are using. For more information, see Amazon ECS Launch Types in the Amazon Elastic Container Service Developer Guide.
    */
  var launchType: js.UndefOr[LaunchType] = js.native
  /**
    * The VPC subnet and security group configuration for tasks that receive their own elastic network interface by using the awsvpc networking mode.
    */
  var networkConfiguration: js.UndefOr[NetworkConfiguration] = js.native
  /**
    * The number of tasks in the deployment that are in the PENDING status.
    */
  var pendingCount: js.UndefOr[Integer] = js.native
  /**
    * The platform version on which your tasks in the service are running. A platform version is only specified for tasks using the Fargate launch type. If one is not specified, the LATEST platform version is used by default. For more information, see AWS Fargate Platform Versions in the Amazon Elastic Container Service Developer Guide.
    */
  var platformVersion: js.UndefOr[String] = js.native
  /**
    * The number of tasks in the deployment that are in the RUNNING status.
    */
  var runningCount: js.UndefOr[Integer] = js.native
  /**
    * The status of the deployment. The following describes each state:  PRIMARY  The most recent deployment of a service.  ACTIVE  A service deployment that still has running tasks, but are in the process of being replaced with a new PRIMARY deployment.  INACTIVE  A deployment that has been completely replaced.  
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The most recent task definition that was specified for the tasks in the service to use.
    */
  var taskDefinition: js.UndefOr[String] = js.native
  /**
    * The Unix timestamp for when the service deployment was last updated.
    */
  var updatedAt: js.UndefOr[Timestamp] = js.native
}

object Deployment {
  @scala.inline
  def apply(
    capacityProviderStrategy: CapacityProviderStrategy = null,
    createdAt: Timestamp = null,
    desiredCount: Int | scala.Double = null,
    id: String = null,
    launchType: LaunchType = null,
    networkConfiguration: NetworkConfiguration = null,
    pendingCount: Int | scala.Double = null,
    platformVersion: String = null,
    runningCount: Int | scala.Double = null,
    status: String = null,
    taskDefinition: String = null,
    updatedAt: Timestamp = null
  ): Deployment = {
    val __obj = js.Dynamic.literal()
    if (capacityProviderStrategy != null) __obj.updateDynamic("capacityProviderStrategy")(capacityProviderStrategy.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (desiredCount != null) __obj.updateDynamic("desiredCount")(desiredCount.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (launchType != null) __obj.updateDynamic("launchType")(launchType.asInstanceOf[js.Any])
    if (networkConfiguration != null) __obj.updateDynamic("networkConfiguration")(networkConfiguration.asInstanceOf[js.Any])
    if (pendingCount != null) __obj.updateDynamic("pendingCount")(pendingCount.asInstanceOf[js.Any])
    if (platformVersion != null) __obj.updateDynamic("platformVersion")(platformVersion.asInstanceOf[js.Any])
    if (runningCount != null) __obj.updateDynamic("runningCount")(runningCount.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (taskDefinition != null) __obj.updateDynamic("taskDefinition")(taskDefinition.asInstanceOf[js.Any])
    if (updatedAt != null) __obj.updateDynamic("updatedAt")(updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deployment]
  }
}

