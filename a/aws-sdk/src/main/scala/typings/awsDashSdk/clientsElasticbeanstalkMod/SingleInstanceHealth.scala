package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingleInstanceHealth extends js.Object {
  /**
    * Request metrics from your application.
    */
  var ApplicationMetrics: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.ApplicationMetrics] = js.undefined
  /**
    * The availability zone in which the instance runs.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * Represents the causes, which provide more information about the current health status.
    */
  var Causes: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.Causes] = js.undefined
  /**
    * Represents the color indicator that gives you information about the health of the EC2 instance. For more information, see Health Colors and Statuses.
    */
  var Color: js.UndefOr[String] = js.undefined
  /**
    * Information about the most recent deployment to an instance.
    */
  var Deployment: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.Deployment] = js.undefined
  /**
    * Returns the health status of the specified instance. For more information, see Health Colors and Statuses.
    */
  var HealthStatus: js.UndefOr[String] = js.undefined
  /**
    * The ID of the Amazon EC2 instance.
    */
  var InstanceId: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.InstanceId] = js.undefined
  /**
    * The instance's type.
    */
  var InstanceType: js.UndefOr[String] = js.undefined
  /**
    * The time at which the EC2 instance was launched.
    */
  var LaunchedAt: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.LaunchedAt] = js.undefined
  /**
    * Operating system metrics from the instance.
    */
  var System: js.UndefOr[SystemStatus] = js.undefined
}

object SingleInstanceHealth {
  @scala.inline
  def apply(
    ApplicationMetrics: ApplicationMetrics = null,
    AvailabilityZone: String = null,
    Causes: Causes = null,
    Color: String = null,
    Deployment: Deployment = null,
    HealthStatus: String = null,
    InstanceId: InstanceId = null,
    InstanceType: String = null,
    LaunchedAt: LaunchedAt = null,
    System: SystemStatus = null
  ): SingleInstanceHealth = {
    val __obj = js.Dynamic.literal()
    if (ApplicationMetrics != null) __obj.updateDynamic("ApplicationMetrics")(ApplicationMetrics)
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (Causes != null) __obj.updateDynamic("Causes")(Causes)
    if (Color != null) __obj.updateDynamic("Color")(Color)
    if (Deployment != null) __obj.updateDynamic("Deployment")(Deployment)
    if (HealthStatus != null) __obj.updateDynamic("HealthStatus")(HealthStatus)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType)
    if (LaunchedAt != null) __obj.updateDynamic("LaunchedAt")(LaunchedAt)
    if (System != null) __obj.updateDynamic("System")(System)
    __obj.asInstanceOf[SingleInstanceHealth]
  }
}

