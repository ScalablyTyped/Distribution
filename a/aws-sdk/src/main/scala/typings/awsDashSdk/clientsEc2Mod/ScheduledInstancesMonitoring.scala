package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduledInstancesMonitoring extends js.Object {
  /**
    * Indicates whether monitoring is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
}

object ScheduledInstancesMonitoring {
  @scala.inline
  def apply(Enabled: js.UndefOr[scala.Boolean] = js.undefined): ScheduledInstancesMonitoring = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledInstancesMonitoring]
  }
}

