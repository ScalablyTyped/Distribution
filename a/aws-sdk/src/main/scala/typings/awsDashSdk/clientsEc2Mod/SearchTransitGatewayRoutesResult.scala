package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchTransitGatewayRoutesResult extends js.Object {
  /**
    * Indicates whether there are additional routes available.
    */
  var AdditionalRoutesAvailable: js.UndefOr[Boolean] = js.undefined
  /**
    * Information about the routes.
    */
  var Routes: js.UndefOr[TransitGatewayRouteList] = js.undefined
}

object SearchTransitGatewayRoutesResult {
  @scala.inline
  def apply(
    AdditionalRoutesAvailable: js.UndefOr[Boolean] = js.undefined,
    Routes: TransitGatewayRouteList = null
  ): SearchTransitGatewayRoutesResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AdditionalRoutesAvailable)) __obj.updateDynamic("AdditionalRoutesAvailable")(AdditionalRoutesAvailable)
    if (Routes != null) __obj.updateDynamic("Routes")(Routes)
    __obj.asInstanceOf[SearchTransitGatewayRoutesResult]
  }
}

