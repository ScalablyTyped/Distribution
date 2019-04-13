package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduledInstancesMonitoring extends js.Object {
  /**
    * Indicates whether monitoring is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
}

object ScheduledInstancesMonitoring {
  @scala.inline
  def apply(Enabled: js.UndefOr[Boolean] = js.undefined): ScheduledInstancesMonitoring = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    __obj.asInstanceOf[ScheduledInstancesMonitoring]
  }
}

