package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteSpec extends js.Object {
  
  /**
    * An object that represents the specification of a gRPC route.
    */
  var grpcRoute: js.UndefOr[GrpcRoute] = js.native
  
  /**
    * An object that represents the specification of an HTTP/2 route.
    */
  var http2Route: js.UndefOr[HttpRoute] = js.native
  
  /**
    * An object that represents the specification of an HTTP route.
    */
  var httpRoute: js.UndefOr[HttpRoute] = js.native
  
  /**
    * The priority for the route. Routes are matched based on the specified value, where 0 is the highest priority.
    */
  var priority: js.UndefOr[RoutePriority] = js.native
  
  /**
    * An object that represents the specification of a TCP route.
    */
  var tcpRoute: js.UndefOr[TcpRoute] = js.native
}
object RouteSpec {
  
  @scala.inline
  def apply(): RouteSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteSpec]
  }
  
  @scala.inline
  implicit class RouteSpecOps[Self <: RouteSpec] (val x: Self) extends AnyVal {
    
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
    def setGrpcRoute(value: GrpcRoute): Self = this.set("grpcRoute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrpcRoute: Self = this.set("grpcRoute", js.undefined)
    
    @scala.inline
    def setHttp2Route(value: HttpRoute): Self = this.set("http2Route", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttp2Route: Self = this.set("http2Route", js.undefined)
    
    @scala.inline
    def setHttpRoute(value: HttpRoute): Self = this.set("httpRoute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpRoute: Self = this.set("httpRoute", js.undefined)
    
    @scala.inline
    def setPriority(value: RoutePriority): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setTcpRoute(value: TcpRoute): Self = this.set("tcpRoute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTcpRoute: Self = this.set("tcpRoute", js.undefined)
  }
}
