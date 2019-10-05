package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cluster extends js.Object {
  /**
    * The number of services that are running on the cluster in an ACTIVE state. You can view these services with ListServices.
    */
  var activeServicesCount: js.UndefOr[Integer] = js.undefined
  /**
    * The Amazon Resource Name (ARN) that identifies the cluster. The ARN contains the arn:aws:ecs namespace, followed by the Region of the cluster, the AWS account ID of the cluster owner, the cluster namespace, and then the cluster name. For example, arn:aws:ecs:region:012345678910:cluster/test.
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
    * The settings for the cluster. This parameter indicates whether CloudWatch Container Insights is enabled or disabled for a cluster.
    */
  var settings: js.UndefOr[ClusterSettings] = js.undefined
  /**
    * Additional information about your clusters that are separated by launch type, including:   runningEC2TasksCount   RunningFargateTasksCount   pendingEC2TasksCount   pendingFargateTasksCount   activeEC2ServiceCount   activeFargateServiceCount   drainingEC2ServiceCount   drainingFargateServiceCount  
    */
  var statistics: js.UndefOr[Statistics] = js.undefined
  /**
    * The status of the cluster. The valid values are ACTIVE or INACTIVE. ACTIVE indicates that you can register container instances with the cluster and the associated instances can accept tasks.
    */
  var status: js.UndefOr[String] = js.undefined
  /**
    * The metadata that you apply to the cluster to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. The following basic restrictions apply to tags:   Maximum number of tags per resource - 50   For each resource, each tag key must be unique, and each tag key can have only one value.   Maximum key length - 128 Unicode characters in UTF-8   Maximum value length - 256 Unicode characters in UTF-8   If your tagging schema is used across multiple services and resources, remember that other services may have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : / @.   Tag keys and values are case-sensitive.   Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for either keys or values as it is reserved for AWS use. You cannot edit or delete tag keys or values with this prefix. Tags with this prefix do not count against your tags per resource limit.  
    */
  var tags: js.UndefOr[Tags] = js.undefined
}

object Cluster {
  @scala.inline
  def apply(
    activeServicesCount: Int | scala.Double = null,
    clusterArn: String = null,
    clusterName: String = null,
    pendingTasksCount: Int | scala.Double = null,
    registeredContainerInstancesCount: Int | scala.Double = null,
    runningTasksCount: Int | scala.Double = null,
    settings: ClusterSettings = null,
    statistics: Statistics = null,
    status: String = null,
    tags: Tags = null
  ): Cluster = {
    val __obj = js.Dynamic.literal()
    if (activeServicesCount != null) __obj.updateDynamic("activeServicesCount")(activeServicesCount.asInstanceOf[js.Any])
    if (clusterArn != null) __obj.updateDynamic("clusterArn")(clusterArn)
    if (clusterName != null) __obj.updateDynamic("clusterName")(clusterName)
    if (pendingTasksCount != null) __obj.updateDynamic("pendingTasksCount")(pendingTasksCount.asInstanceOf[js.Any])
    if (registeredContainerInstancesCount != null) __obj.updateDynamic("registeredContainerInstancesCount")(registeredContainerInstancesCount.asInstanceOf[js.Any])
    if (runningTasksCount != null) __obj.updateDynamic("runningTasksCount")(runningTasksCount.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings)
    if (statistics != null) __obj.updateDynamic("statistics")(statistics)
    if (status != null) __obj.updateDynamic("status")(status)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[Cluster]
  }
}

