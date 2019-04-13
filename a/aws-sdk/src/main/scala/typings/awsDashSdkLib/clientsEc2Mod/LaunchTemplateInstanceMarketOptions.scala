package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateInstanceMarketOptions extends js.Object {
  /**
    * The market type.
    */
  var MarketType: js.UndefOr[MarketType] = js.undefined
  /**
    * The options for Spot Instances.
    */
  var SpotOptions: js.UndefOr[LaunchTemplateSpotMarketOptions] = js.undefined
}

object LaunchTemplateInstanceMarketOptions {
  @scala.inline
  def apply(MarketType: MarketType = null, SpotOptions: LaunchTemplateSpotMarketOptions = null): LaunchTemplateInstanceMarketOptions = {
    val __obj = js.Dynamic.literal()
    if (MarketType != null) __obj.updateDynamic("MarketType")(MarketType.asInstanceOf[js.Any])
    if (SpotOptions != null) __obj.updateDynamic("SpotOptions")(SpotOptions)
    __obj.asInstanceOf[LaunchTemplateInstanceMarketOptions]
  }
}

