package typings.awsSdk.appmeshMod

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
  
  extension [Self <: GrpcGatewayRouteRewrite](x: Self) {
    
    inline def setHostname(value: GatewayRouteHostnameRewrite): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
  }
}
