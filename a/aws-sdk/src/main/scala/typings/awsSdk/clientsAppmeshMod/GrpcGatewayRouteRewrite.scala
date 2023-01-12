package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrpcGatewayRouteRewrite extends StObject {
  
  /**
    * The host name of the gateway route to rewrite.
    */
  var hostname: js.UndefOr[GatewayRouteHostnameRewrite] = js.undefined
}
object GrpcGatewayRouteRewrite {
  
  inline def apply(): GrpcGatewayRouteRewrite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrpcGatewayRouteRewrite]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GrpcGatewayRouteRewrite] (val x: Self) extends AnyVal {
    
    inline def setHostname(value: GatewayRouteHostnameRewrite): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
  }
}
