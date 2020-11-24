package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GatewayRouteVirtualService extends js.Object {
  
  /**
    * The name of the virtual service that traffic is routed to.
    */
  var virtualServiceName: ResourceName = js.native
}
object GatewayRouteVirtualService {
  
  @scala.inline
  def apply(virtualServiceName: ResourceName): GatewayRouteVirtualService = {
    val __obj = js.Dynamic.literal(virtualServiceName = virtualServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayRouteVirtualService]
  }
  
  @scala.inline
  implicit class GatewayRouteVirtualServiceOps[Self <: GatewayRouteVirtualService] (val x: Self) extends AnyVal {
    
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
    def setVirtualServiceName(value: ResourceName): Self = this.set("virtualServiceName", value.asInstanceOf[js.Any])
  }
}
