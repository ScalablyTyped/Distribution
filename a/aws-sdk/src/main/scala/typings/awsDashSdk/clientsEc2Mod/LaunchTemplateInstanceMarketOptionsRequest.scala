package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateInstanceMarketOptionsRequest extends js.Object {
  /**
    * The market type.
    */
  var MarketType: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.MarketType] = js.undefined
  /**
    * The options for Spot Instances.
    */
  var SpotOptions: js.UndefOr[LaunchTemplateSpotMarketOptionsRequest] = js.undefined
}

object LaunchTemplateInstanceMarketOptionsRequest {
  @scala.inline
  def apply(MarketType: MarketType = null, SpotOptions: LaunchTemplateSpotMarketOptionsRequest = null): LaunchTemplateInstanceMarketOptionsRequest = {
    val __obj = js.Dynamic.literal()
    if (MarketType != null) __obj.updateDynamic("MarketType")(MarketType.asInstanceOf[js.Any])
    if (SpotOptions != null) __obj.updateDynamic("SpotOptions")(SpotOptions)
    __obj.asInstanceOf[LaunchTemplateInstanceMarketOptionsRequest]
  }
}

