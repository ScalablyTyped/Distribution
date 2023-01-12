package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpGatewayRouteMatch extends StObject {
  
  /**
    * The client request headers to match on.
    */
  var headers: js.UndefOr[HttpGatewayRouteHeaders] = js.undefined
  
  /**
    * The host name to match on.
    */
  var hostname: js.UndefOr[GatewayRouteHostnameMatch] = js.undefined
  
  /**
    * The method to match on.
    */
  var method: js.UndefOr[HttpMethod] = js.undefined
  
  /**
    * The path to match on.
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
    * The query parameter to match on.
    */
  var queryParameters: js.UndefOr[HttpQueryParameters] = js.undefined
}
object HttpGatewayRouteMatch {
  
  inline def apply(): HttpGatewayRouteMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpGatewayRouteMatch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HttpGatewayRouteMatch] (val x: Self) extends AnyVal {
    
    inline def setHeaders(value: HttpGatewayRouteHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: HttpGatewayRouteHeader*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setHostname(value: GatewayRouteHostnameMatch): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
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
  }
}
