package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmonitorInstancesResult extends js.Object {
  /**
    * The monitoring information.
    */
  var InstanceMonitorings: js.UndefOr[InstanceMonitoringList] = js.undefined
}

object UnmonitorInstancesResult {
  @scala.inline
  def apply(InstanceMonitorings: InstanceMonitoringList = null): UnmonitorInstancesResult = {
    val __obj = js.Dynamic.literal()
    if (InstanceMonitorings != null) __obj.updateDynamic("InstanceMonitorings")(InstanceMonitorings)
    __obj.asInstanceOf[UnmonitorInstancesResult]
  }
}

