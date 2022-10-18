package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpGatewayRoutePathRewrite extends StObject {
  
  /**
    * The exact path to rewrite.
    */
  var exact: js.UndefOr[HttpPathExact] = js.undefined
}
object HttpGatewayRoutePathRewrite {
  
  inline def apply(): HttpGatewayRoutePathRewrite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpGatewayRoutePathRewrite]
  }
  
  extension [Self <: HttpGatewayRoutePathRewrite](x: Self) {
    
    inline def setExact(value: HttpPathExact): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
  }
}
