package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNodeSpec extends StObject {
  
  /**
    * A reference to an object that represents the defaults for backends.
    */
  var backendDefaults: js.UndefOr[BackendDefaults] = js.undefined
  
  /**
    * The backends that the virtual node is expected to send outbound traffic to.
    */
  var backends: js.UndefOr[Backends] = js.undefined
  
  /**
    * The listener that the virtual node is expected to receive inbound traffic from. You can specify one listener.
    */
  var listeners: js.UndefOr[Listeners] = js.undefined
  
  /**
    * The inbound and outbound access logging information for the virtual node.
    */
  var logging: js.UndefOr[Logging] = js.undefined
  
  /**
    * The service discovery information for the virtual node. If your virtual node does not expect ingress traffic, you can omit this parameter. If you specify a listener, then you must specify service discovery information.
    */
  var serviceDiscovery: js.UndefOr[ServiceDiscovery] = js.undefined
}
object VirtualNodeSpec {
  
  inline def apply(): VirtualNodeSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualNodeSpec]
  }
  
  extension [Self <: VirtualNodeSpec](x: Self) {
    
    inline def setBackendDefaults(value: BackendDefaults): Self = StObject.set(x, "backendDefaults", value.asInstanceOf[js.Any])
    
    inline def setBackendDefaultsUndefined: Self = StObject.set(x, "backendDefaults", js.undefined)
    
    inline def setBackends(value: Backends): Self = StObject.set(x, "backends", value.asInstanceOf[js.Any])
    
    inline def setBackendsUndefined: Self = StObject.set(x, "backends", js.undefined)
    
    inline def setBackendsVarargs(value: Backend*): Self = StObject.set(x, "backends", js.Array(value :_*))
    
    inline def setListeners(value: Listeners): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
    
    inline def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
    
    inline def setListenersVarargs(value: Listener*): Self = StObject.set(x, "listeners", js.Array(value :_*))
    
    inline def setLogging(value: Logging): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    inline def setServiceDiscovery(value: ServiceDiscovery): Self = StObject.set(x, "serviceDiscovery", value.asInstanceOf[js.Any])
    
    inline def setServiceDiscoveryUndefined: Self = StObject.set(x, "serviceDiscovery", js.undefined)
  }
}
