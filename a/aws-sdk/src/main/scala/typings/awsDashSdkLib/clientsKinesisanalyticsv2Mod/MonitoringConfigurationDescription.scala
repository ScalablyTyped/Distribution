package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonitoringConfigurationDescription extends js.Object {
  /**
    * Describes whether to use the default CloudWatch logging configuration for an application.
    */
  var ConfigurationType: js.UndefOr[ConfigurationType] = js.undefined
  /**
    * Describes the verbosity of the CloudWatch Logs for an application.
    */
  var LogLevel: js.UndefOr[LogLevel] = js.undefined
  /**
    * Describes the granularity of the CloudWatch Logs for an application.
    */
  var MetricsLevel: js.UndefOr[MetricsLevel] = js.undefined
}

object MonitoringConfigurationDescription {
  @scala.inline
  def apply(
    ConfigurationType: ConfigurationType = null,
    LogLevel: LogLevel = null,
    MetricsLevel: MetricsLevel = null
  ): MonitoringConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    if (ConfigurationType != null) __obj.updateDynamic("ConfigurationType")(ConfigurationType.asInstanceOf[js.Any])
    if (LogLevel != null) __obj.updateDynamic("LogLevel")(LogLevel.asInstanceOf[js.Any])
    if (MetricsLevel != null) __obj.updateDynamic("MetricsLevel")(MetricsLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringConfigurationDescription]
  }
}

