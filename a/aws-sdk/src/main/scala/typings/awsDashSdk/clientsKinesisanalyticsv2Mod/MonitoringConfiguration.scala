package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitoringConfiguration extends js.Object {
  /**
    * Describes whether to use the default CloudWatch logging configuration for an application. You must set this property to CUSTOM in order to set the LogLevel or MetricsLevel parameters.
    */
  var ConfigurationType: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ConfigurationType = js.native
  /**
    * Describes the verbosity of the CloudWatch Logs for an application.
    */
  var LogLevel: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.LogLevel] = js.native
  /**
    * Describes the granularity of the CloudWatch Logs for an application.
    */
  var MetricsLevel: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.MetricsLevel] = js.native
}

object MonitoringConfiguration {
  @scala.inline
  def apply(ConfigurationType: ConfigurationType, LogLevel: LogLevel = null, MetricsLevel: MetricsLevel = null): MonitoringConfiguration = {
    val __obj = js.Dynamic.literal(ConfigurationType = ConfigurationType.asInstanceOf[js.Any])
    if (LogLevel != null) __obj.updateDynamic("LogLevel")(LogLevel.asInstanceOf[js.Any])
    if (MetricsLevel != null) __obj.updateDynamic("MetricsLevel")(MetricsLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringConfiguration]
  }
}

