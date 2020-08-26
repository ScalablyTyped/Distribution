package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpGatewayRouteMatch extends js.Object {
  /**
    * Specifies the path to match requests with. This parameter must always start with
    /, which by itself matches all requests to the virtual service name. You
    can also match for path-based routing of requests. For example, if your virtual service
    name is my-service.local and you want the route to match requests to
    my-service.local/metrics, your prefix should be
    /metrics.
    */
  var prefix: String = js.native
}

object HttpGatewayRouteMatch {
  @scala.inline
  def apply(prefix: String): HttpGatewayRouteMatch = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpGatewayRouteMatch]
  }
  @scala.inline
  implicit class HttpGatewayRouteMatchOps[Self <: HttpGatewayRouteMatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
  }
  
}

