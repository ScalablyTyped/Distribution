package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitorInstancesResult extends js.Object {
  /**
    * The monitoring information.
    */
  var InstanceMonitorings: js.UndefOr[InstanceMonitoringList] = js.native
}

object MonitorInstancesResult {
  @scala.inline
  def apply(InstanceMonitorings: InstanceMonitoringList = null): MonitorInstancesResult = {
    val __obj = js.Dynamic.literal()
    if (InstanceMonitorings != null) __obj.updateDynamic("InstanceMonitorings")(InstanceMonitorings.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitorInstancesResult]
  }
}

