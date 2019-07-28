package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonitoringConfiguration extends js.Object {
  /**
    * Describes whether to use the default CloudWatch logging configuration for an application.
    */
  var ConfigurationType: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ConfigurationType
  /**
    * Describes the verbosity of the CloudWatch Logs for an application.
    */
  var LogLevel: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.LogLevel] = js.undefined
  /**
    * Describes the granularity of the CloudWatch Logs for an application.
    */
  var MetricsLevel: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.MetricsLevel] = js.undefined
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

