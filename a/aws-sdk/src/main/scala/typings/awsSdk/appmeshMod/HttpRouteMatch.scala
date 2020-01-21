package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpRouteMatch extends js.Object {
  /**
    * An object that represents the client request headers to match on.
    */
  var headers: js.UndefOr[HttpRouteHeaders] = js.native
  /**
    * The client request method to match on. Specify only one.
    */
  var method: js.UndefOr[HttpMethod] = js.native
  /**
    * Specifies the path to match requests with. This parameter must always start with
    /, which by itself matches all requests to the virtual service name. You
    can also match for path-based routing of requests. For example, if your virtual service
    name is my-service.local and you want the route to match requests to
    my-service.local/metrics, your prefix should be
    /metrics.
    */
  var prefix: String = js.native
  /**
    * The client request scheme to match on. Specify only one.
    */
  var scheme: js.UndefOr[HttpScheme] = js.native
}

object HttpRouteMatch {
  @scala.inline
  def apply(
    prefix: String,
    headers: HttpRouteHeaders = null,
    method: HttpMethod = null,
    scheme: HttpScheme = null
  ): HttpRouteMatch = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpRouteMatch]
  }
}

