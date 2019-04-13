package typings
package awsDashSdkLib.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskSet extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the cluster that the service that hosts the task set exists in.
    */
  var clusterArn: js.UndefOr[String] = js.undefined
  /**
    * The computed desired count for the task set. This is calculated by multiplying the service's desiredCount by the task set's scale percentage. The result is always rounded up. For example, if the computed desired count is 1.2, it rounds up to 2 tasks.
    */
  var computedDesiredCount: js.UndefOr[Integer] = js.undefined
  /**
    * The Unix timestamp for when the task set was created.
    */
  var createdAt: js.UndefOr[Timestamp] = js.undefined
  /**
    * The external ID associated with the task set. If a task set is created by an AWS CodeDeploy deployment, the externalId parameter contains the AWS CodeDeploy deployment ID. If a task set is created for an external deployment and is associated with a service discovery registry, the externalId parameter contains the ECS_TASK_SET_EXTERNAL_ID AWS Cloud Map attribute.
    */
  var externalId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the task set.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The launch type the tasks in the task set are using. For more information, see Amazon ECS Launch Types in the Amazon Elastic Container Service Developer Guide.
    */
  var launchType: js.UndefOr[LaunchType] = js.undefined
  /**
    * Details on a load balancer that is used with a task set.
    */
  var loadBalancers: js.UndefOr[LoadBalancers] = js.undefined
  /**
    * The network configuration for the task set.
    */
  var networkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined
  /**
    * The number of tasks in the task set that are in the PENDING status during a deployment. A task in the PENDING state is preparing to enter the RUNNING state. A task set enters the PENDING status when it launches for the first time or when it is restarted after being in the STOPPED state.
    */
  var pendingCount: js.UndefOr[Integer] = js.undefined
  /**
    * The platform version on which the tasks in the task set are running. A platform version is only specified for tasks using the Fargate launch type. If one is not specified, the LATEST platform version is used by default. For more information, see AWS Fargate Platform Versions in the Amazon Elastic Container Service Developer Guide.
    */
  var platformVersion: js.UndefOr[String] = js.undefined
  /**
    * The number of tasks in the task set that are in the RUNNING status during a deployment. A task in the RUNNING state is running and ready for use.
    */
  var runningCount: js.UndefOr[Integer] = js.undefined
  /**
    * A floating-point percentage of the desired number of tasks to place and keep running in the task set.
    */
  var scale: js.UndefOr[Scale] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the service the task set exists in.
    */
  var serviceArn: js.UndefOr[String] = js.undefined
  /**
    * The details of the service discovery registries to assign to this task set. For more information, see Service Discovery.
    */
  var serviceRegistries: js.UndefOr[ServiceRegistries] = js.undefined
  /**
    * The stability status, which indicates whether the task set has reached a steady state. If the following conditions are met, the task set will be in STEADY_STATE:   The task runningCount is equal to the computedDesiredCount.   The pendingCount is 0.   There are no tasks running on container instances in the DRAINING status.   All tasks are reporting a healthy status from the load balancers, service discovery, and container health checks.   If any of those conditions are not met, the stability status returns STABILIZING.
    */
  var stabilityStatus: js.UndefOr[StabilityStatus] = js.undefined
  /**
    * The Unix timestamp for when the task set stability status was retrieved.
    */
  var stabilityStatusAt: js.UndefOr[Timestamp] = js.undefined
  /**
    * The tag specified when a task set is started. If the task set is created by an AWS CodeDeploy deployment, the startedBy parameter is CODE_DEPLOY. For a task set created for an external deployment, the startedBy field isn't used.
    */
  var startedBy: js.UndefOr[String] = js.undefined
  /**
    * The status of the task set. The following describes each state:  PRIMARY  The task set is serving production traffic.  ACTIVE  The task set is not serving production traffic.  DRAINING  The tasks in the task set are being stopped and their corresponding targets are being deregistered from their target group.  
    */
  var status: js.UndefOr[String] = js.undefined
  /**
    * The task definition the task set is using.
    */
  var taskDefinition: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the task set.
    */
  var taskSetArn: js.UndefOr[String] = js.undefined
  /**
    * The Unix timestamp for when the task set was last updated.
    */
  var updatedAt: js.UndefOr[Timestamp] = js.undefined
}

object TaskSet {
  @scala.inline
  def apply(
    clusterArn: String = null,
    computedDesiredCount: js.UndefOr[Integer] = js.undefined,
    createdAt: Timestamp = null,
    externalId: String = null,
    id: String = null,
    launchType: LaunchType = null,
    loadBalancers: LoadBalancers = null,
    networkConfiguration: NetworkConfiguration = null,
    pendingCount: js.UndefOr[Integer] = js.undefined,
    platformVersion: String = null,
    runningCount: js.UndefOr[Integer] = js.undefined,
    scale: Scale = null,
    serviceArn: String = null,
    serviceRegistries: ServiceRegistries = null,
    stabilityStatus: StabilityStatus = null,
    stabilityStatusAt: Timestamp = null,
    startedBy: String = null,
    status: String = null,
    taskDefinition: String = null,
    taskSetArn: String = null,
    updatedAt: Timestamp = null
  ): TaskSet = {
    val __obj = js.Dynamic.literal()
    if (clusterArn != null) __obj.updateDynamic("clusterArn")(clusterArn)
    if (!js.isUndefined(computedDesiredCount)) __obj.updateDynamic("computedDesiredCount")(computedDesiredCount)
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (externalId != null) __obj.updateDynamic("externalId")(externalId)
    if (id != null) __obj.updateDynamic("id")(id)
    if (launchType != null) __obj.updateDynamic("launchType")(launchType.asInstanceOf[js.Any])
    if (loadBalancers != null) __obj.updateDynamic("loadBalancers")(loadBalancers)
    if (networkConfiguration != null) __obj.updateDynamic("networkConfiguration")(networkConfiguration)
    if (!js.isUndefined(pendingCount)) __obj.updateDynamic("pendingCount")(pendingCount)
    if (platformVersion != null) __obj.updateDynamic("platformVersion")(platformVersion)
    if (!js.isUndefined(runningCount)) __obj.updateDynamic("runningCount")(runningCount)
    if (scale != null) __obj.updateDynamic("scale")(scale)
    if (serviceArn != null) __obj.updateDynamic("serviceArn")(serviceArn)
    if (serviceRegistries != null) __obj.updateDynamic("serviceRegistries")(serviceRegistries)
    if (stabilityStatus != null) __obj.updateDynamic("stabilityStatus")(stabilityStatus.asInstanceOf[js.Any])
    if (stabilityStatusAt != null) __obj.updateDynamic("stabilityStatusAt")(stabilityStatusAt)
    if (startedBy != null) __obj.updateDynamic("startedBy")(startedBy)
    if (status != null) __obj.updateDynamic("status")(status)
    if (taskDefinition != null) __obj.updateDynamic("taskDefinition")(taskDefinition)
    if (taskSetArn != null) __obj.updateDynamic("taskSetArn")(taskSetArn)
    if (updatedAt != null) __obj.updateDynamic("updatedAt")(updatedAt)
    __obj.asInstanceOf[TaskSet]
  }
}

