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
    * The TCP routing information for the route.
    */
  var tcpRoute: js.UndefOr[TcpRoute] = js.undefined
}

object RouteSpec {
  @scala.inline
  def apply(httpRoute: HttpRoute = null, tcpRoute: TcpRoute = null): RouteSpec = {
    val __obj = js.Dynamic.literal()
    if (httpRoute != null) __obj.updateDynamic("httpRoute")(httpRoute)
    if (tcpRoute != null) __obj.updateDynamic("tcpRoute")(tcpRoute)
    __obj.asInstanceOf[RouteSpec]
  }
}

