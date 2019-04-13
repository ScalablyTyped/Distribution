package typings
package awsDashSdkLib.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cluster extends js.Object {
  /**
    * The number of services that are running on the cluster in an ACTIVE state. You can view these services with ListServices.
    */
  var activeServicesCount: js.UndefOr[Integer] = js.undefined
  /**
    * The Amazon Resource Name (ARN) that identifies the cluster. The ARN contains the arn:aws:ecs namespace, followed by the Region of the cluster, the AWS account ID of the cluster owner, the cluster namespace, and then the cluster name. For example, arn:aws:ecs:region:012345678910:cluster/test ..
    */
  var clusterArn: js.UndefOr[String] = js.undefined
  /**
    * A user-generated string that you use to identify your cluster.
    */
  var clusterName: js.UndefOr[String] = js.undefined
  /**
    * The number of tasks in the cluster that are in the PENDING state.
    */
  var pendingTasksCount: js.UndefOr[Integer] = js.undefined
  /**
    * The number of container instances registered into the cluster. This includes container instances in both ACTIVE and DRAINING status.
    */
  var registeredContainerInstancesCount: js.UndefOr[Integer] = js.undefined
  /**
    * The number of tasks in the cluster that are in the RUNNING state.
    */
  var runningTasksCount: js.UndefOr[Integer] = js.undefined
  /**
    * Additional information about your clusters that are separated by launch type, including:   runningEC2TasksCount   RunningFargateTasksCount   pendingEC2TasksCount   pendingFargateTasksCount   activeEC2ServiceCount   activeFargateServiceCount   drainingEC2ServiceCount   drainingFargateServiceCount  
    */
  var statistics: js.UndefOr[Statistics] = js.undefined
  /**
    * The status of the cluster. The valid values are ACTIVE or INACTIVE. ACTIVE indicates that you can register container instances with the cluster and the associated instances can accept tasks.
    */
  var status: js.UndefOr[String] = js.undefined
  /**
    * The metadata that you apply to the cluster to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}

object Cluster {
  @scala.inline
  def apply(
    activeServicesCount: js.UndefOr[Integer] = js.undefined,
    clusterArn: String = null,
    clusterName: String = null,
    pendingTasksCount: js.UndefOr[Integer] = js.undefined,
    registeredContainerInstancesCount: js.UndefOr[Integer] = js.undefined,
    runningTasksCount: js.UndefOr[Integer] = js.undefined,
    statistics: Statistics = null,
    status: String = null,
    tags: Tags = null
  ): Cluster = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activeServicesCount)) __obj.updateDynamic("activeServicesCount")(activeServicesCount)
    if (clusterArn != null) __obj.updateDynamic("clusterArn")(clusterArn)
    if (clusterName != null) __obj.updateDynamic("clusterName")(clusterName)
    if (!js.isUndefined(pendingTasksCount)) __obj.updateDynamic("pendingTasksCount")(pendingTasksCount)
    if (!js.isUndefined(registeredContainerInstancesCount)) __obj.updateDynamic("registeredContainerInstancesCount")(registeredContainerInstancesCount)
    if (!js.isUndefined(runningTasksCount)) __obj.updateDynamic("runningTasksCount")(runningTasksCount)
    if (statistics != null) __obj.updateDynamic("statistics")(statistics)
    if (status != null) __obj.updateDynamic("status")(status)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[Cluster]
  }
}

