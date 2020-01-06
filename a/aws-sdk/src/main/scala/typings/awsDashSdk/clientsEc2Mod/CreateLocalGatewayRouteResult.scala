package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLocalGatewayRouteResult extends js.Object {
  /**
    * Information about the route.
    */
  var Route: js.UndefOr[LocalGatewayRoute] = js.native
}

object CreateLocalGatewayRouteResult {
  @scala.inline
  def apply(Route: LocalGatewayRoute = null): CreateLocalGatewayRouteResult = {
    val __obj = js.Dynamic.literal()
    if (Route != null) __obj.updateDynamic("Route")(Route.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLocalGatewayRouteResult]
  }
}

