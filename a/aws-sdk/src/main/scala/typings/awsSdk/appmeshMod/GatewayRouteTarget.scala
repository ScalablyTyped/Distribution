package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GatewayRouteTarget extends StObject {
  
  /**
    * An object that represents a virtual service gateway route target.
    */
  var virtualService: GatewayRouteVirtualService = js.native
}
object GatewayRouteTarget {
  
  @scala.inline
  def apply(virtualService: GatewayRouteVirtualService): GatewayRouteTarget = {
    val __obj = js.Dynamic.literal(virtualService = virtualService.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayRouteTarget]
  }
  
  @scala.inline
  implicit class GatewayRouteTargetMutableBuilder[Self <: GatewayRouteTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVirtualService(value: GatewayRouteVirtualService): Self = StObject.set(x, "virtualService", value.asInstanceOf[js.Any])
  }
}
