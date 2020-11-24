package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualNodeSpec extends js.Object {
  
  /**
    * A reference to an object that represents the defaults for backends.
    */
  var backendDefaults: js.UndefOr[BackendDefaults] = js.native
  
  /**
    * The backends that the virtual node is expected to send outbound traffic to.
    */
  var backends: js.UndefOr[Backends] = js.native
  
  /**
    * The listener that the virtual node is expected to receive inbound traffic from. You can specify one listener.
    */
  var listeners: js.UndefOr[Listeners] = js.native
  
  /**
    * The inbound and outbound access logging information for the virtual node.
    */
  var logging: js.UndefOr[Logging] = js.native
  
  /**
    * The service discovery information for the virtual node. If your virtual node does not expect ingress traffic, you can omit this parameter. If you specify a listener, then you must specify service discovery information.
    */
  var serviceDiscovery: js.UndefOr[ServiceDiscovery] = js.native
}
object VirtualNodeSpec {
  
  @scala.inline
  def apply(): VirtualNodeSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualNodeSpec]
  }
  
  @scala.inline
  implicit class VirtualNodeSpecOps[Self <: VirtualNodeSpec] (val x: Self) extends AnyVal {
    
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
    def setBackendDefaults(value: BackendDefaults): Self = this.set("backendDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackendDefaults: Self = this.set("backendDefaults", js.undefined)
    
    @scala.inline
    def setBackendsVarargs(value: Backend*): Self = this.set("backends", js.Array(value :_*))
    
    @scala.inline
    def setBackends(value: Backends): Self = this.set("backends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackends: Self = this.set("backends", js.undefined)
    
    @scala.inline
    def setListenersVarargs(value: Listener*): Self = this.set("listeners", js.Array(value :_*))
    
    @scala.inline
    def setListeners(value: Listeners): Self = this.set("listeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListeners: Self = this.set("listeners", js.undefined)
    
    @scala.inline
    def setLogging(value: Logging): Self = this.set("logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogging: Self = this.set("logging", js.undefined)
    
    @scala.inline
    def setServiceDiscovery(value: ServiceDiscovery): Self = this.set("serviceDiscovery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceDiscovery: Self = this.set("serviceDiscovery", js.undefined)
  }
}
