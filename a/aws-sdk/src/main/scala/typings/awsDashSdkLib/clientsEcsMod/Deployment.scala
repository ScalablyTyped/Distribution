package typings
package awsDashSdkLib.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deployment extends js.Object {
  /**
    * The Unix timestamp for when the service deployment was created.
    */
  var createdAt: js.UndefOr[Timestamp] = js.undefined
  /**
    * The most recent desired count of tasks that was specified for the service to deploy or maintain.
    */
  var desiredCount: js.UndefOr[Integer] = js.undefined
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
    * The platform version on which your tasks in the service are running. A platform version is only specified for tasks using the Fargate launch type. If one is not specified, the LATEST platform version is used by default. For more information, see AWS Fargate Platform Versions in the Amazon Elastic Container Service Developer Guide.
    */
  var platformVersion: js.UndefOr[String] = js.undefined
  /**
    * The number of tasks in the deployment that are in the RUNNING status.
    */
  var runningCount: js.UndefOr[Integer] = js.undefined
  /**
    * The status of the deployment. The following describes each state:  PRIMARY  The most recent deployment of a service.  ACTIVE  A service deployment that still has running tasks, but are in the process of being replaced with a new PRIMARY deployment.  INACTIVE  A deployment that has been completely replaced.  
    */
  var status: js.UndefOr[String] = js.undefined
  /**
    * The most recent task definition that was specified for the tasks in the service to use.
    */
  var taskDefinition: js.UndefOr[String] = js.undefined
  /**
    * The Unix timestamp for when the service deployment was last updated.
    */
  var updatedAt: js.UndefOr[Timestamp] = js.undefined
}

object Deployment {
  @scala.inline
  def apply(
    createdAt: Timestamp = null,
    desiredCount: js.UndefOr[Integer] = js.undefined,
    id: String = null,
    launchType: LaunchType = null,
    networkConfiguration: NetworkConfiguration = null,
    pendingCount: js.UndefOr[Integer] = js.undefined,
    platformVersion: String = null,
    runningCount: js.UndefOr[Integer] = js.undefined,
    status: String = null,
    taskDefinition: String = null,
    updatedAt: Timestamp = null
  ): Deployment = {
    val __obj = js.Dynamic.literal()
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (!js.isUndefined(desiredCount)) __obj.updateDynamic("desiredCount")(desiredCount)
    if (id != null) __obj.updateDynamic("id")(id)
    if (launchType != null) __obj.updateDynamic("launchType")(launchType.asInstanceOf[js.Any])
    if (networkConfiguration != null) __obj.updateDynamic("networkConfiguration")(networkConfiguration)
    if (!js.isUndefined(pendingCount)) __obj.updateDynamic("pendingCount")(pendingCount)
    if (platformVersion != null) __obj.updateDynamic("platformVersion")(platformVersion)
    if (!js.isUndefined(runningCount)) __obj.updateDynamic("runningCount")(runningCount)
    if (status != null) __obj.updateDynamic("status")(status)
    if (taskDefinition != null) __obj.updateDynamic("taskDefinition")(taskDefinition)
    if (updatedAt != null) __obj.updateDynamic("updatedAt")(updatedAt)
    __obj.asInstanceOf[Deployment]
  }
}

