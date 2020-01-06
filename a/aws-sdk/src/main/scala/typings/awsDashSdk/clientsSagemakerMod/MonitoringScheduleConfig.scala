package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitoringScheduleConfig extends js.Object {
  /**
    * Defines the monitoring job.
    */
  var MonitoringJobDefinition: typings.awsDashSdk.clientsSagemakerMod.MonitoringJobDefinition = js.native
  /**
    * Configures the monitoring schedule.
    */
  var ScheduleConfig: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.ScheduleConfig] = js.native
}

object MonitoringScheduleConfig {
  @scala.inline
  def apply(MonitoringJobDefinition: MonitoringJobDefinition, ScheduleConfig: ScheduleConfig = null): MonitoringScheduleConfig = {
    val __obj = js.Dynamic.literal(MonitoringJobDefinition = MonitoringJobDefinition.asInstanceOf[js.Any])
    if (ScheduleConfig != null) __obj.updateDynamic("ScheduleConfig")(ScheduleConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringScheduleConfig]
  }
}

