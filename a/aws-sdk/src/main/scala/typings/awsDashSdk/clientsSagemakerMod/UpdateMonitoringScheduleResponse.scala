package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMonitoringScheduleResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the monitoring schedule.
    */
  var MonitoringScheduleArn: typings.awsDashSdk.clientsSagemakerMod.MonitoringScheduleArn = js.native
}

object UpdateMonitoringScheduleResponse {
  @scala.inline
  def apply(MonitoringScheduleArn: MonitoringScheduleArn): UpdateMonitoringScheduleResponse = {
    val __obj = js.Dynamic.literal(MonitoringScheduleArn = MonitoringScheduleArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateMonitoringScheduleResponse]
  }
}

