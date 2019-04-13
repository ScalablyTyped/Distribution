package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTransitGatewayRouteResult extends js.Object {
  /**
    * Information about the route.
    */
  var Route: js.UndefOr[TransitGatewayRoute] = js.undefined
}

object CreateTransitGatewayRouteResult {
  @scala.inline
  def apply(Route: TransitGatewayRoute = null): CreateTransitGatewayRouteResult = {
    val __obj = js.Dynamic.literal()
    if (Route != null) __obj.updateDynamic("Route")(Route)
    __obj.asInstanceOf[CreateTransitGatewayRouteResult]
  }
}

