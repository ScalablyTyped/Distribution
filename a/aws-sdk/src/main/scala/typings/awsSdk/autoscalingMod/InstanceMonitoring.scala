package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceMonitoring extends js.Object {
  /**
    * If true, detailed monitoring is enabled. Otherwise, basic monitoring is enabled.
    */
  var Enabled: js.UndefOr[MonitoringEnabled] = js.native
}

object InstanceMonitoring {
  @scala.inline
  def apply(Enabled: js.UndefOr[MonitoringEnabled] = js.undefined): InstanceMonitoring = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceMonitoring]
  }
}

