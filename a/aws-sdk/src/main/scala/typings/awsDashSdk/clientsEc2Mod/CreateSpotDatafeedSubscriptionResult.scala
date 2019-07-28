package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSpotDatafeedSubscriptionResult extends js.Object {
  /**
    * The Spot Instance data feed subscription.
    */
  var SpotDatafeedSubscription: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.SpotDatafeedSubscription] = js.undefined
}

object CreateSpotDatafeedSubscriptionResult {
  @scala.inline
  def apply(SpotDatafeedSubscription: SpotDatafeedSubscription = null): CreateSpotDatafeedSubscriptionResult = {
    val __obj = js.Dynamic.literal()
    if (SpotDatafeedSubscription != null) __obj.updateDynamic("SpotDatafeedSubscription")(SpotDatafeedSubscription)
    __obj.asInstanceOf[CreateSpotDatafeedSubscriptionResult]
  }
}

