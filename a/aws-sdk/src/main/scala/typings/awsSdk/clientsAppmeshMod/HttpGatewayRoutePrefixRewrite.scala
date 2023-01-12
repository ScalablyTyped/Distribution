package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpGatewayRoutePrefixRewrite extends StObject {
  
  /**
    * The default prefix used to replace the incoming route prefix when rewritten.
    */
  var defaultPrefix: js.UndefOr[DefaultGatewayRouteRewrite] = js.undefined
  
  /**
    * The value used to replace the incoming route prefix when rewritten.
    */
  var value: js.UndefOr[HttpGatewayRoutePrefix] = js.undefined
}
object HttpGatewayRoutePrefixRewrite {
  
  inline def apply(): HttpGatewayRoutePrefixRewrite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpGatewayRoutePrefixRewrite]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HttpGatewayRoutePrefixRewrite] (val x: Self) extends AnyVal {
    
    inline def setDefaultPrefix(value: DefaultGatewayRouteRewrite): Self = StObject.set(x, "defaultPrefix", value.asInstanceOf[js.Any])
    
    inline def setDefaultPrefixUndefined: Self = StObject.set(x, "defaultPrefix", js.undefined)
    
    inline def setValue(value: HttpGatewayRoutePrefix): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
