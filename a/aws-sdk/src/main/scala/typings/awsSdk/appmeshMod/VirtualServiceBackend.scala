package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualServiceBackend extends js.Object {
  
  /**
    * A reference to an object that represents the client policy for a backend.
    */
  var clientPolicy: js.UndefOr[ClientPolicy] = js.native
  
  /**
    * The name of the virtual service that is acting as a virtual node backend.
    */
  var virtualServiceName: ServiceName = js.native
}
object VirtualServiceBackend {
  
  @scala.inline
  def apply(virtualServiceName: ServiceName): VirtualServiceBackend = {
    val __obj = js.Dynamic.literal(virtualServiceName = virtualServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualServiceBackend]
  }
  
  @scala.inline
  implicit class VirtualServiceBackendOps[Self <: VirtualServiceBackend] (val x: Self) extends AnyVal {
    
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
    def setVirtualServiceName(value: ServiceName): Self = this.set("virtualServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientPolicy(value: ClientPolicy): Self = this.set("clientPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientPolicy: Self = this.set("clientPolicy", js.undefined)
  }
}
