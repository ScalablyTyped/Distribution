package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpGatewayRouteRewrite extends StObject {
  
  /**
    * The host name to rewrite.
    */
  var hostname: js.UndefOr[GatewayRouteHostnameRewrite] = js.undefined
  
  /**
    * The path to rewrite.
    */
  var path: js.UndefOr[HttpGatewayRoutePathRewrite] = js.undefined
  
  /**
    * The specified beginning characters to rewrite.
    */
  var prefix: js.UndefOr[HttpGatewayRoutePrefixRewrite] = js.undefined
}
object HttpGatewayRouteRewrite {
  
  inline def apply(): HttpGatewayRouteRewrite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpGatewayRouteRewrite]
  }
  
  extension [Self <: HttpGatewayRouteRewrite](x: Self) {
    
    inline def setHostname(value: GatewayRouteHostnameRewrite): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setPath(value: HttpGatewayRoutePathRewrite): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPrefix(value: HttpGatewayRoutePrefixRewrite): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
