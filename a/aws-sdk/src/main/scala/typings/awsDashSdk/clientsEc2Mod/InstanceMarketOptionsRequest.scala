package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceMarketOptionsRequest extends js.Object {
  /**
    * The market type.
    */
  var MarketType: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.MarketType] = js.native
  /**
    * The options for Spot Instances.
    */
  var SpotOptions: js.UndefOr[SpotMarketOptions] = js.native
}

object InstanceMarketOptionsRequest {
  @scala.inline
  def apply(MarketType: MarketType = null, SpotOptions: SpotMarketOptions = null): InstanceMarketOptionsRequest = {
    val __obj = js.Dynamic.literal()
    if (MarketType != null) __obj.updateDynamic("MarketType")(MarketType.asInstanceOf[js.Any])
    if (SpotOptions != null) __obj.updateDynamic("SpotOptions")(SpotOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceMarketOptionsRequest]
  }
}

