package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualNodeSpec extends StObject {
  
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
  implicit class VirtualNodeSpecMutableBuilder[Self <: VirtualNodeSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackendDefaults(value: BackendDefaults): Self = StObject.set(x, "backendDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackendDefaultsUndefined: Self = StObject.set(x, "backendDefaults", js.undefined)
    
    @scala.inline
    def setBackends(value: Backends): Self = StObject.set(x, "backends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackendsUndefined: Self = StObject.set(x, "backends", js.undefined)
    
    @scala.inline
    def setBackendsVarargs(value: Backend*): Self = StObject.set(x, "backends", js.Array(value :_*))
    
    @scala.inline
    def setListeners(value: Listeners): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
    
    @scala.inline
    def setListenersVarargs(value: Listener*): Self = StObject.set(x, "listeners", js.Array(value :_*))
    
    @scala.inline
    def setLogging(value: Logging): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    @scala.inline
    def setServiceDiscovery(value: ServiceDiscovery): Self = StObject.set(x, "serviceDiscovery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceDiscoveryUndefined: Self = StObject.set(x, "serviceDiscovery", js.undefined)
  }
}
