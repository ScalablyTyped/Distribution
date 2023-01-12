package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GatewayRouteHostnameRewrite extends StObject {
  
  /**
    * The default target host name to write to.
    */
  var defaultTargetHostname: js.UndefOr[DefaultGatewayRouteRewrite] = js.undefined
}
object GatewayRouteHostnameRewrite {
  
  inline def apply(): GatewayRouteHostnameRewrite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GatewayRouteHostnameRewrite]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GatewayRouteHostnameRewrite] (val x: Self) extends AnyVal {
    
    inline def setDefaultTargetHostname(value: DefaultGatewayRouteRewrite): Self = StObject.set(x, "defaultTargetHostname", value.asInstanceOf[js.Any])
    
    inline def setDefaultTargetHostnameUndefined: Self = StObject.set(x, "defaultTargetHostname", js.undefined)
  }
}
