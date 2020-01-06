package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTransitGatewayRouteResult extends js.Object {
  /**
    * Information about the route.
    */
  var Route: js.UndefOr[TransitGatewayRoute] = js.native
}

object DeleteTransitGatewayRouteResult {
  @scala.inline
  def apply(Route: TransitGatewayRoute = null): DeleteTransitGatewayRouteResult = {
    val __obj = js.Dynamic.literal()
    if (Route != null) __obj.updateDynamic("Route")(Route.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTransitGatewayRouteResult]
  }
}

