package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEnvironmentHealthResult extends js.Object {
  /**
    * Application request metrics for the environment.
    */
  var ApplicationMetrics: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.ApplicationMetrics] = js.undefined
  /**
    * Descriptions of the data that contributed to the environment's current health status.
    */
  var Causes: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.Causes] = js.undefined
  /**
    * The health color of the environment.
    */
  var Color: js.UndefOr[String] = js.undefined
  /**
    * The environment's name.
    */
  var EnvironmentName: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.EnvironmentName] = js.undefined
  /**
    * The health status of the environment. For example, Ok.
    */
  var HealthStatus: js.UndefOr[String] = js.undefined
  /**
    * Summary health information for the instances in the environment.
    */
  var InstancesHealth: js.UndefOr[InstanceHealthSummary] = js.undefined
  /**
    * The date and time that the health information was retrieved.
    */
  var RefreshedAt: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.RefreshedAt] = js.undefined
  /**
    * The environment's operational status. Ready, Launching, Updating, Terminating, or Terminated.
    */
  var Status: js.UndefOr[EnvironmentHealth] = js.undefined
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
    if (ApplicationMetrics != null) __obj.updateDynamic("ApplicationMetrics")(ApplicationMetrics)
    if (Causes != null) __obj.updateDynamic("Causes")(Causes)
    if (Color != null) __obj.updateDynamic("Color")(Color)
    if (EnvironmentName != null) __obj.updateDynamic("EnvironmentName")(EnvironmentName)
    if (HealthStatus != null) __obj.updateDynamic("HealthStatus")(HealthStatus)
    if (InstancesHealth != null) __obj.updateDynamic("InstancesHealth")(InstancesHealth)
    if (RefreshedAt != null) __obj.updateDynamic("RefreshedAt")(RefreshedAt)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEnvironmentHealthResult]
  }
}

