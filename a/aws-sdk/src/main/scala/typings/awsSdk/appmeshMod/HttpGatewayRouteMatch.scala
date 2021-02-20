package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpGatewayRouteMatch extends StObject {
  
  /**
    * Specifies the path to match requests with. This parameter must always start with /, which by itself matches all requests to the virtual service name. You can also match for path-based routing of requests. For example, if your virtual service name is my-service.local and you want the route to match requests to my-service.local/metrics, your prefix should be /metrics.
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
  implicit class HttpGatewayRouteMatchMutableBuilder[Self <: HttpGatewayRouteMatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
  }
}
