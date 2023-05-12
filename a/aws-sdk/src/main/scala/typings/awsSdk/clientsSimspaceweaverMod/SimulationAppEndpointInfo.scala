package typings.awsSdk.clientsSimspaceweaverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimulationAppEndpointInfo extends StObject {
  
  /**
    * The IP address of the app. SimSpace Weaver dynamically assigns this IP address when the app starts.
    */
  var Address: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The inbound TCP/UDP port numbers of the app. The combination of an IP address and a port number form a network endpoint.
    */
  var IngressPortMappings: js.UndefOr[AppPortMappings] = js.undefined
}
object SimulationAppEndpointInfo {
  
  inline def apply(): SimulationAppEndpointInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimulationAppEndpointInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SimulationAppEndpointInfo] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: NonEmptyString): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
    
    inline def setIngressPortMappings(value: AppPortMappings): Self = StObject.set(x, "IngressPortMappings", value.asInstanceOf[js.Any])
    
    inline def setIngressPortMappingsUndefined: Self = StObject.set(x, "IngressPortMappings", js.undefined)
    
    inline def setIngressPortMappingsVarargs(value: SimulationAppPortMapping*): Self = StObject.set(x, "IngressPortMappings", js.Array(value*))
  }
}
