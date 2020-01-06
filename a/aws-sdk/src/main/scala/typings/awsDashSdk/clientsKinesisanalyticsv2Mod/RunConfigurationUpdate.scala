package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunConfigurationUpdate extends js.Object {
  /**
    * Describes updates to the restore behavior of a restarting application.
    */
  var ApplicationRestoreConfiguration: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ApplicationRestoreConfiguration] = js.native
  /**
    * Describes the starting parameters for an Apache Flink-based Kinesis Data Analytics application.
    */
  var FlinkRunConfiguration: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.FlinkRunConfiguration] = js.native
}

object RunConfigurationUpdate {
  @scala.inline
  def apply(
    ApplicationRestoreConfiguration: ApplicationRestoreConfiguration = null,
    FlinkRunConfiguration: FlinkRunConfiguration = null
  ): RunConfigurationUpdate = {
    val __obj = js.Dynamic.literal()
    if (ApplicationRestoreConfiguration != null) __obj.updateDynamic("ApplicationRestoreConfiguration")(ApplicationRestoreConfiguration.asInstanceOf[js.Any])
    if (FlinkRunConfiguration != null) __obj.updateDynamic("FlinkRunConfiguration")(FlinkRunConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunConfigurationUpdate]
  }
}

