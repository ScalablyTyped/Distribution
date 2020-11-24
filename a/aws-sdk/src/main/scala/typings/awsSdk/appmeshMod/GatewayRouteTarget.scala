package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GatewayRouteTarget extends js.Object {
  
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
  implicit class GatewayRouteTargetOps[Self <: GatewayRouteTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setVirtualService(value: GatewayRouteVirtualService): Self = this.set("virtualService", value.asInstanceOf[js.Any])
  }
}
