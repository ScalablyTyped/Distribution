package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceMonitoring extends js.Object {
  /**
    * If true, detailed monitoring is enabled. Otherwise, basic monitoring is enabled.
    */
  var Enabled: js.UndefOr[MonitoringEnabled] = js.undefined
}

object InstanceMonitoring {
  @scala.inline
  def apply(Enabled: js.UndefOr[MonitoringEnabled] = js.undefined): InstanceMonitoring = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    __obj.asInstanceOf[InstanceMonitoring]
  }
}

