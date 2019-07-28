package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplatesMonitoring extends js.Object {
  /**
    * Indicates whether detailed monitoring is enabled. Otherwise, basic monitoring is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
}

object LaunchTemplatesMonitoring {
  @scala.inline
  def apply(Enabled: js.UndefOr[Boolean] = js.undefined): LaunchTemplatesMonitoring = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    __obj.asInstanceOf[LaunchTemplatesMonitoring]
  }
}

