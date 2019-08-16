package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteSpec extends js.Object {
  /**
    * The HTTP routing information for the route.
    */
  var httpRoute: js.UndefOr[HttpRoute] = js.undefined
  /**
    * The priority for the route. Routes are matched based on the specified value, where 0 is
    the highest priority.
    */
  var priority: js.UndefOr[RoutePriority] = js.undefined
  /**
    * The TCP routing information for the route.
    */
  var tcpRoute: js.UndefOr[TcpRoute] = js.undefined
}

object RouteSpec {
  @scala.inline
  def apply(
    httpRoute: HttpRoute = null,
    priority: js.UndefOr[RoutePriority] = js.undefined,
    tcpRoute: TcpRoute = null
  ): RouteSpec = {
    val __obj = js.Dynamic.literal()
    if (httpRoute != null) __obj.updateDynamic("httpRoute")(httpRoute)
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority)
    if (tcpRoute != null) __obj.updateDynamic("tcpRoute")(tcpRoute)
    __obj.asInstanceOf[RouteSpec]
  }
}

