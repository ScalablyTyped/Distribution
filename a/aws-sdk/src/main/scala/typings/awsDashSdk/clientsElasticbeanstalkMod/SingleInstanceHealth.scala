package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingleInstanceHealth extends js.Object {
  /**
    * Request metrics from your application.
    */
  var ApplicationMetrics: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.ApplicationMetrics] = js.native
  /**
    * The availability zone in which the instance runs.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * Represents the causes, which provide more information about the current health status.
    */
  var Causes: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.Causes] = js.native
  /**
    * Represents the color indicator that gives you information about the health of the EC2 instance. For more information, see Health Colors and Statuses.
    */
  var Color: js.UndefOr[String] = js.native
  /**
    * Information about the most recent deployment to an instance.
    */
  var Deployment: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.Deployment] = js.native
  /**
    * Returns the health status of the specified instance. For more information, see Health Colors and Statuses.
    */
  var HealthStatus: js.UndefOr[String] = js.native
  /**
    * The ID of the Amazon EC2 instance.
    */
  var InstanceId: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.InstanceId] = js.native
  /**
    * The instance's type.
    */
  var InstanceType: js.UndefOr[String] = js.native
  /**
    * The time at which the EC2 instance was launched.
    */
  var LaunchedAt: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.LaunchedAt] = js.native
  /**
    * Operating system metrics from the instance.
    */
  var System: js.UndefOr[SystemStatus] = js.native
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
    if (ApplicationMetrics != null) __obj.updateDynamic("ApplicationMetrics")(ApplicationMetrics.asInstanceOf[js.Any])
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone.asInstanceOf[js.Any])
    if (Causes != null) __obj.updateDynamic("Causes")(Causes.asInstanceOf[js.Any])
    if (Color != null) __obj.updateDynamic("Color")(Color.asInstanceOf[js.Any])
    if (Deployment != null) __obj.updateDynamic("Deployment")(Deployment.asInstanceOf[js.Any])
    if (HealthStatus != null) __obj.updateDynamic("HealthStatus")(HealthStatus.asInstanceOf[js.Any])
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (LaunchedAt != null) __obj.updateDynamic("LaunchedAt")(LaunchedAt.asInstanceOf[js.Any])
    if (System != null) __obj.updateDynamic("System")(System.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleInstanceHealth]
  }
}

