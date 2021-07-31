package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteSpec extends StObject {
  
  /**
    * An object that represents the specification of a gRPC route.
    */
  var grpcRoute: js.UndefOr[GrpcRoute] = js.undefined
  
  /**
    * An object that represents the specification of an HTTP/2 route.
    */
  var http2Route: js.UndefOr[HttpRoute] = js.undefined
  
  /**
    * An object that represents the specification of an HTTP route.
    */
  var httpRoute: js.UndefOr[HttpRoute] = js.undefined
  
  /**
    * The priority for the route. Routes are matched based on the specified value, where 0 is the highest priority.
    */
  var priority: js.UndefOr[RoutePriority] = js.undefined
  
  /**
    * An object that represents the specification of a TCP route.
    */
  var tcpRoute: js.UndefOr[TcpRoute] = js.undefined
}
object RouteSpec {
  
  @scala.inline
  def apply(): RouteSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteSpec]
  }
  
  @scala.inline
  implicit class RouteSpecMutableBuilder[Self <: RouteSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrpcRoute(value: GrpcRoute): Self = StObject.set(x, "grpcRoute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrpcRouteUndefined: Self = StObject.set(x, "grpcRoute", js.undefined)
    
    @scala.inline
    def setHttp2Route(value: HttpRoute): Self = StObject.set(x, "http2Route", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttp2RouteUndefined: Self = StObject.set(x, "http2Route", js.undefined)
    
    @scala.inline
    def setHttpRoute(value: HttpRoute): Self = StObject.set(x, "httpRoute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpRouteUndefined: Self = StObject.set(x, "httpRoute", js.undefined)
    
    @scala.inline
    def setPriority(value: RoutePriority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setTcpRoute(value: TcpRoute): Self = StObject.set(x, "tcpRoute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTcpRouteUndefined: Self = StObject.set(x, "tcpRoute", js.undefined)
  }
}
