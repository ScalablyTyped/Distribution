package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpRouteMatch extends js.Object {
  /**
    * Specifies the path to match requests with. This parameter must always start with
    /, which by itself matches all requests to the virtual service name. You
    can also match for path-based routing of requests. For example, if your virtual service
    name is my-service.local and you want the route to match requests to
    my-service.local/metrics, your prefix should be
    /metrics.
    */
  var prefix: String
}

object HttpRouteMatch {
  @scala.inline
  def apply(prefix: String): HttpRouteMatch = {
    val __obj = js.Dynamic.literal(prefix = prefix)
  
    __obj.asInstanceOf[HttpRouteMatch]
  }
}

