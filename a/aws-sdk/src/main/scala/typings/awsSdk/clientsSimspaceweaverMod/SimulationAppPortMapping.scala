package typings.awsSdk.clientsSimspaceweaverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimulationAppPortMapping extends StObject {
  
  /**
    * The TCP/UDP port number of the running app. SimSpace Weaver dynamically assigns this port number when the app starts. SimSpace Weaver maps the Declared port to the Actual port. Clients connect to the app using the app's IP address and the Actual port number.
    */
  var Actual: js.UndefOr[PortNumber] = js.undefined
  
  /**
    * The TCP/UDP port number of the app, declared in the simulation schema. SimSpace Weaver maps the Declared port to the Actual port. The source code for the app should bind to the Declared port.
    */
  var Declared: js.UndefOr[PortNumber] = js.undefined
}
object SimulationAppPortMapping {
  
  inline def apply(): SimulationAppPortMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimulationAppPortMapping]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SimulationAppPortMapping] (val x: Self) extends AnyVal {
    
    inline def setActual(value: PortNumber): Self = StObject.set(x, "Actual", value.asInstanceOf[js.Any])
    
    inline def setActualUndefined: Self = StObject.set(x, "Actual", js.undefined)
    
    inline def setDeclared(value: PortNumber): Self = StObject.set(x, "Declared", value.asInstanceOf[js.Any])
    
    inline def setDeclaredUndefined: Self = StObject.set(x, "Declared", js.undefined)
  }
}
