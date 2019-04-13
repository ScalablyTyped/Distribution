package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonitorInstancesResult extends js.Object {
  /**
    * The monitoring information.
    */
  var InstanceMonitorings: js.UndefOr[InstanceMonitoringList] = js.undefined
}

object MonitorInstancesResult {
  @scala.inline
  def apply(InstanceMonitorings: InstanceMonitoringList = null): MonitorInstancesResult = {
    val __obj = js.Dynamic.literal()
    if (InstanceMonitorings != null) __obj.updateDynamic("InstanceMonitorings")(InstanceMonitorings)
    __obj.asInstanceOf[MonitorInstancesResult]
  }
}

