package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplatesMonitoringRequest extends js.Object {
  /**
    * Specify true to enable detailed monitoring. Otherwise, basic monitoring is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
}

object LaunchTemplatesMonitoringRequest {
  @scala.inline
  def apply(Enabled: js.UndefOr[Boolean] = js.undefined): LaunchTemplatesMonitoringRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    __obj.asInstanceOf[LaunchTemplatesMonitoringRequest]
  }
}

