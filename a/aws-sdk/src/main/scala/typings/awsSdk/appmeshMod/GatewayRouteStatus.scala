package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GatewayRouteStatus extends StObject {
  
  /**
    * The current status for the gateway route.
    */
  var status: GatewayRouteStatusCode = js.native
}
object GatewayRouteStatus {
  
  @scala.inline
  def apply(status: GatewayRouteStatusCode): GatewayRouteStatus = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayRouteStatus]
  }
  
  @scala.inline
  implicit class GatewayRouteStatusMutableBuilder[Self <: GatewayRouteStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: GatewayRouteStatusCode): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
