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
  def apply(prefix: String): HttpRouteMatch = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpRouteMatch]
  }
  @scala.inline
  implicit class HttpRouteMatchOps[Self <: HttpRouteMatch] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setHeadersVarargs(value: HttpRouteHeader*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeaders(value: HttpRouteHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setMethod(value: HttpMethod): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setScheme(value: HttpScheme): Self = this.set("scheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheme: Self = this.set("scheme", js.undefined)
  }
  
}

