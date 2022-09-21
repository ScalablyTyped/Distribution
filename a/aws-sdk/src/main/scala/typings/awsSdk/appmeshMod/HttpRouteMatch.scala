package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpRouteMatch extends StObject {
  
  /**
    * The client request headers to match on.
    */
  var headers: js.UndefOr[HttpRouteHeaders] = js.undefined
  
  /**
    * The client request method to match on. Specify only one.
    */
  var method: js.UndefOr[HttpMethod] = js.undefined
  
  /**
    * The client request path to match on.
    */
  var path: js.UndefOr[HttpPathMatch] = js.undefined
  
  /**
    * The port number to match on.
    */
  var port: js.UndefOr[ListenerPort] = js.undefined
  
  /**
    * Specifies the path to match requests with. This parameter must always start with /, which by itself matches all requests to the virtual service name. You can also match for path-based routing of requests. For example, if your virtual service name is my-service.local and you want the route to match requests to my-service.local/metrics, your prefix should be /metrics.
    */
  var prefix: js.UndefOr[String] = js.undefined
  
  /**
    * The client request query parameters to match on.
    */
  var queryParameters: js.UndefOr[HttpQueryParameters] = js.undefined
  
  /**
    * The client request scheme to match on. Specify only one. Applicable only for HTTP2 routes.
    */
  var scheme: js.UndefOr[HttpScheme] = js.undefined
}
object HttpRouteMatch {
  
  inline def apply(): HttpRouteMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpRouteMatch]
  }
  
  extension [Self <: HttpRouteMatch](x: Self) {
    
    inline def setHeaders(value: HttpRouteHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: HttpRouteHeader*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setMethod(value: HttpMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setPath(value: HttpPathMatch): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPort(value: ListenerPort): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setQueryParameters(value: HttpQueryParameters): Self = StObject.set(x, "queryParameters", value.asInstanceOf[js.Any])
    
    inline def setQueryParametersUndefined: Self = StObject.set(x, "queryParameters", js.undefined)
    
    inline def setQueryParametersVarargs(value: HttpQueryParameter*): Self = StObject.set(x, "queryParameters", js.Array(value*))
    
    inline def setScheme(value: HttpScheme): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
  }
}
