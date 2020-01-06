package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartMonitoringScheduleRequest extends js.Object {
  /**
    * The name of the schedule to start.
    */
  var MonitoringScheduleName: typings.awsDashSdk.clientsSagemakerMod.MonitoringScheduleName = js.native
}

object StartMonitoringScheduleRequest {
  @scala.inline
  def apply(MonitoringScheduleName: MonitoringScheduleName): StartMonitoringScheduleRequest = {
    val __obj = js.Dynamic.literal(MonitoringScheduleName = MonitoringScheduleName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StartMonitoringScheduleRequest]
  }
}

