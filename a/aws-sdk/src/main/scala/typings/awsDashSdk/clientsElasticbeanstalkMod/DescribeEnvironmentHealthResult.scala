package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEnvironmentHealthResult extends js.Object {
  /**
    * Application request metrics for the environment.
    */
  var ApplicationMetrics: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.ApplicationMetrics] = js.native
  /**
    * Descriptions of the data that contributed to the environment's current health status.
    */
  var Causes: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.Causes] = js.native
  /**
    * The health color of the environment.
    */
  var Color: js.UndefOr[String] = js.native
  /**
    * The environment's name.
    */
  var EnvironmentName: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.EnvironmentName] = js.native
  /**
    * The health status of the environment. For example, Ok.
    */
  var HealthStatus: js.UndefOr[String] = js.native
  /**
    * Summary health information for the instances in the environment.
    */
  var InstancesHealth: js.UndefOr[InstanceHealthSummary] = js.native
  /**
    * The date and time that the health information was retrieved.
    */
  var RefreshedAt: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.RefreshedAt] = js.native
  /**
    * The environment's operational status. Ready, Launching, Updating, Terminating, or Terminated.
    */
  var Status: js.UndefOr[EnvironmentHealth] = js.native
}

object DescribeEnvironmentHealthResult {
  @scala.inline
  def apply(
    ApplicationMetrics: ApplicationMetrics = null,
    Causes: Causes = null,
    Color: String = null,
    EnvironmentName: EnvironmentName = null,
    HealthStatus: String = null,
    InstancesHealth: InstanceHealthSummary = null,
    RefreshedAt: RefreshedAt = null,
    Status: EnvironmentHealth = null
  ): DescribeEnvironmentHealthResult = {
    val __obj = js.Dynamic.literal()
    if (ApplicationMetrics != null) __obj.updateDynamic("ApplicationMetrics")(ApplicationMetrics.asInstanceOf[js.Any])
    if (Causes != null) __obj.updateDynamic("Causes")(Causes.asInstanceOf[js.Any])
    if (Color != null) __obj.updateDynamic("Color")(Color.asInstanceOf[js.Any])
    if (EnvironmentName != null) __obj.updateDynamic("EnvironmentName")(EnvironmentName.asInstanceOf[js.Any])
    if (HealthStatus != null) __obj.updateDynamic("HealthStatus")(HealthStatus.asInstanceOf[js.Any])
    if (InstancesHealth != null) __obj.updateDynamic("InstancesHealth")(InstancesHealth.asInstanceOf[js.Any])
    if (RefreshedAt != null) __obj.updateDynamic("RefreshedAt")(RefreshedAt.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEnvironmentHealthResult]
  }
}

