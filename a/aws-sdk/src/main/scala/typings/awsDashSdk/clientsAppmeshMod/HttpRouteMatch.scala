package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpRouteMatch extends js.Object {
  /**
    * The client request headers to match on.
    */
  var headers: js.UndefOr[HttpRouteHeaders] = js.undefined
  /**
    * The client request header method to match on.
    */
  var method: js.UndefOr[HttpMethod] = js.undefined
  /**
    * Specifies the path to match requests with. This parameter must always start with
    /, which by itself matches all requests to the virtual service name. You
    can also match for path-based routing of requests. For example, if your virtual service
    name is my-service.local and you want the route to match requests to
    my-service.local/metrics, your prefix should be
    /metrics.
    */
  var prefix: String
  /**
    * The client request scheme to match on.
    */
  var scheme: js.UndefOr[HttpScheme] = js.undefined
}

object HttpRouteMatch {
  @scala.inline
  def apply(
    prefix: String,
    headers: HttpRouteHeaders = null,
    method: HttpMethod = null,
    scheme: HttpScheme = null
  ): HttpRouteMatch = {
    val __obj = js.Dynamic.literal(prefix = prefix)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpRouteMatch]
  }
}

