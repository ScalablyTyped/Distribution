package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GatewayRouteSpec extends StObject {
  
  /**
    * An object that represents the specification of a gRPC gateway route.
    */
  var grpcRoute: js.UndefOr[GrpcGatewayRoute] = js.undefined
  
  /**
    * An object that represents the specification of an HTTP/2 gateway route.
    */
  var http2Route: js.UndefOr[HttpGatewayRoute] = js.undefined
  
  /**
    * An object that represents the specification of an HTTP gateway route.
    */
  var httpRoute: js.UndefOr[HttpGatewayRoute] = js.undefined
}
object GatewayRouteSpec {
  
  inline def apply(): GatewayRouteSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GatewayRouteSpec]
  }
  
  extension [Self <: GatewayRouteSpec](x: Self) {
    
    inline def setGrpcRoute(value: GrpcGatewayRoute): Self = StObject.set(x, "grpcRoute", value.asInstanceOf[js.Any])
    
    inline def setGrpcRouteUndefined: Self = StObject.set(x, "grpcRoute", js.undefined)
    
    inline def setHttp2Route(value: HttpGatewayRoute): Self = StObject.set(x, "http2Route", value.asInstanceOf[js.Any])
    
    inline def setHttp2RouteUndefined: Self = StObject.set(x, "http2Route", js.undefined)
    
    inline def setHttpRoute(value: HttpGatewayRoute): Self = StObject.set(x, "httpRoute", value.asInstanceOf[js.Any])
    
    inline def setHttpRouteUndefined: Self = StObject.set(x, "httpRoute", js.undefined)
  }
}
