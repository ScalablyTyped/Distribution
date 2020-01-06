package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalingAction extends js.Object {
  /**
    * Not available for instance groups. Instance groups use the market type specified for the group.
    */
  var Market: js.UndefOr[MarketType] = js.native
  /**
    * The type of adjustment the automatic scaling activity makes when triggered, and the periodicity of the adjustment.
    */
  var SimpleScalingPolicyConfiguration: typings.awsDashSdk.clientsEmrMod.SimpleScalingPolicyConfiguration = js.native
}

object ScalingAction {
  @scala.inline
  def apply(SimpleScalingPolicyConfiguration: SimpleScalingPolicyConfiguration, Market: MarketType = null): ScalingAction = {
    val __obj = js.Dynamic.literal(SimpleScalingPolicyConfiguration = SimpleScalingPolicyConfiguration.asInstanceOf[js.Any])
    if (Market != null) __obj.updateDynamic("Market")(Market.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingAction]
  }
}

