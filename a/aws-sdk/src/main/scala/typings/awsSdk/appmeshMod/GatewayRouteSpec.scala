package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GatewayRouteSpec extends js.Object {
  /**
    * An object that represents the specification of a gRPC gateway route.
    */
  var grpcRoute: js.UndefOr[GrpcGatewayRoute] = js.native
  /**
    * An object that represents the specification of an HTTP/2 gateway route.
    */
  var http2Route: js.UndefOr[HttpGatewayRoute] = js.native
  /**
    * An object that represents the specification of an HTTP gateway route.
    */
  var httpRoute: js.UndefOr[HttpGatewayRoute] = js.native
}

object GatewayRouteSpec {
  @scala.inline
  def apply(): GatewayRouteSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GatewayRouteSpec]
  }
  @scala.inline
  implicit class GatewayRouteSpecOps[Self <: GatewayRouteSpec] (val x: Self) extends AnyVal {
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
    def setGrpcRoute(value: GrpcGatewayRoute): Self = this.set("grpcRoute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrpcRoute: Self = this.set("grpcRoute", js.undefined)
    @scala.inline
    def setHttp2Route(value: HttpGatewayRoute): Self = this.set("http2Route", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttp2Route: Self = this.set("http2Route", js.undefined)
    @scala.inline
    def setHttpRoute(value: HttpGatewayRoute): Self = this.set("httpRoute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpRoute: Self = this.set("httpRoute", js.undefined)
  }
  
}

