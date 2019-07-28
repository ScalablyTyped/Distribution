package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceMarketOptionsRequest extends js.Object {
  /**
    * The market type.
    */
  var MarketType: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.MarketType] = js.undefined
  /**
    * The options for Spot Instances.
    */
  var SpotOptions: js.UndefOr[SpotMarketOptions] = js.undefined
}

object InstanceMarketOptionsRequest {
  @scala.inline
  def apply(MarketType: MarketType = null, SpotOptions: SpotMarketOptions = null): InstanceMarketOptionsRequest = {
    val __obj = js.Dynamic.literal()
    if (MarketType != null) __obj.updateDynamic("MarketType")(MarketType.asInstanceOf[js.Any])
    if (SpotOptions != null) __obj.updateDynamic("SpotOptions")(SpotOptions)
    __obj.asInstanceOf[InstanceMarketOptionsRequest]
  }
}

