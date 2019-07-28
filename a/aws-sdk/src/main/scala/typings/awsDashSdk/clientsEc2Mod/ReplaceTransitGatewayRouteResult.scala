package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceTransitGatewayRouteResult extends js.Object {
  /**
    * Information about the modified route.
    */
  var Route: js.UndefOr[TransitGatewayRoute] = js.undefined
}

object ReplaceTransitGatewayRouteResult {
  @scala.inline
  def apply(Route: TransitGatewayRoute = null): ReplaceTransitGatewayRouteResult = {
    val __obj = js.Dynamic.literal()
    if (Route != null) __obj.updateDynamic("Route")(Route)
    __obj.asInstanceOf[ReplaceTransitGatewayRouteResult]
  }
}

