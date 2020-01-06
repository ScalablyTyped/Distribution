package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteSpec extends js.Object {
  /**
    * An object that represents the specification of a GRPC route.
    */
  var grpcRoute: js.UndefOr[GrpcRoute] = js.native
  /**
    * An object that represents the specification of an HTTP2 route.
    */
  var http2Route: js.UndefOr[HttpRoute] = js.native
  /**
    * An object that represents the specification of an HTTP route.
    */
  var httpRoute: js.UndefOr[HttpRoute] = js.native
  /**
    * The priority for the route. Routes are matched based on the specified value, where 0 is
    the highest priority.
    */
  var priority: js.UndefOr[RoutePriority] = js.native
  /**
    * An object that represents the specification of a TCP route.
    */
  var tcpRoute: js.UndefOr[TcpRoute] = js.native
}

object RouteSpec {
  @scala.inline
  def apply(
    grpcRoute: GrpcRoute = null,
    http2Route: HttpRoute = null,
    httpRoute: HttpRoute = null,
    priority: Int | Double = null,
    tcpRoute: TcpRoute = null
  ): RouteSpec = {
    val __obj = js.Dynamic.literal()
    if (grpcRoute != null) __obj.updateDynamic("grpcRoute")(grpcRoute.asInstanceOf[js.Any])
    if (http2Route != null) __obj.updateDynamic("http2Route")(http2Route.asInstanceOf[js.Any])
    if (httpRoute != null) __obj.updateDynamic("httpRoute")(httpRoute.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (tcpRoute != null) __obj.updateDynamic("tcpRoute")(tcpRoute.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpec]
  }
}

