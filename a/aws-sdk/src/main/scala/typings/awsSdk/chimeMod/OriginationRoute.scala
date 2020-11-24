package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginationRoute extends js.Object {
  
  /**
    * The FQDN or IP address to contact for origination traffic.
    */
  var Host: js.UndefOr[String] = js.native
  
  /**
    * The designated origination route port. Defaults to 5060.
    */
  var Port: js.UndefOr[typings.awsSdk.chimeMod.Port] = js.native
  
  /**
    * The priority associated with the host, with 1 being the highest priority. Higher priority hosts are attempted first.
    */
  var Priority: js.UndefOr[OriginationRoutePriority] = js.native
  
  /**
    * The protocol to use for the origination route. Encryption-enabled Amazon Chime Voice Connectors use TCP protocol by default.
    */
  var Protocol: js.UndefOr[OriginationRouteProtocol] = js.native
  
  /**
    * The weight associated with the host. If hosts are equal in priority, calls are distributed among them based on their relative weight.
    */
  var Weight: js.UndefOr[OriginationRouteWeight] = js.native
}
object OriginationRoute {
  
  @scala.inline
  def apply(): OriginationRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OriginationRoute]
  }
  
  @scala.inline
  implicit class OriginationRouteOps[Self <: OriginationRoute] (val x: Self) extends AnyVal {
    
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
    def setHost(value: String): Self = this.set("Host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("Host", js.undefined)
    
    @scala.inline
    def setPort(value: Port): Self = this.set("Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
    
    @scala.inline
    def setPriority(value: OriginationRoutePriority): Self = this.set("Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("Priority", js.undefined)
    
    @scala.inline
    def setProtocol(value: OriginationRouteProtocol): Self = this.set("Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("Protocol", js.undefined)
    
    @scala.inline
    def setWeight(value: OriginationRouteWeight): Self = this.set("Weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeight: Self = this.set("Weight", js.undefined)
  }
}
