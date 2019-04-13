package typings
package awsDashSdkLib.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalingAction extends js.Object {
  /**
    * Not available for instance groups. Instance groups use the market type specified for the group.
    */
  var Market: js.UndefOr[MarketType] = js.undefined
  /**
    * The type of adjustment the automatic scaling activity makes when triggered, and the periodicity of the adjustment.
    */
  var SimpleScalingPolicyConfiguration: awsDashSdkLib.clientsEmrMod.SimpleScalingPolicyConfiguration
}

object ScalingAction {
  @scala.inline
  def apply(SimpleScalingPolicyConfiguration: SimpleScalingPolicyConfiguration, Market: MarketType = null): ScalingAction = {
    val __obj = js.Dynamic.literal(SimpleScalingPolicyConfiguration = SimpleScalingPolicyConfiguration)
    if (Market != null) __obj.updateDynamic("Market")(Market.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingAction]
  }
}

