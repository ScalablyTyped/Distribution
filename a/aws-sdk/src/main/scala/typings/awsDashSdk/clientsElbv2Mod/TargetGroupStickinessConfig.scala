package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetGroupStickinessConfig extends js.Object {
  /**
    * The time period, in seconds, during which requests from a client should be routed to the same target group. The range is 1-604800 seconds (7 days).
    */
  var DurationSeconds: js.UndefOr[TargetGroupStickinessDurationSeconds] = js.native
  /**
    * Indicates whether target group stickiness is enabled.
    */
  var Enabled: js.UndefOr[TargetGroupStickinessEnabled] = js.native
}

object TargetGroupStickinessConfig {
  @scala.inline
  def apply(DurationSeconds: Int | Double = null, Enabled: js.UndefOr[Boolean] = js.undefined): TargetGroupStickinessConfig = {
    val __obj = js.Dynamic.literal()
    if (DurationSeconds != null) __obj.updateDynamic("DurationSeconds")(DurationSeconds.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetGroupStickinessConfig]
  }
}

