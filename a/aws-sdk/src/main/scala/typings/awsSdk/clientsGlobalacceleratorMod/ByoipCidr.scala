package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ByoipCidr extends StObject {
  
  /**
    * The address range, in CIDR notation.
    */
  var Cidr: js.UndefOr[GenericString] = js.undefined
  
  /**
    * A history of status changes for an IP address range that you bring to Global Accelerator through bring your own IP address (BYOIP).
    */
  var Events: js.UndefOr[ByoipCidrEvents] = js.undefined
  
  /**
    * The state of the address pool.
    */
  var State: js.UndefOr[ByoipCidrState] = js.undefined
}
object ByoipCidr {
  
  inline def apply(): ByoipCidr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ByoipCidr]
  }
  
  extension [Self <: ByoipCidr](x: Self) {
    
    inline def setCidr(value: GenericString): Self = StObject.set(x, "Cidr", value.asInstanceOf[js.Any])
    
    inline def setCidrUndefined: Self = StObject.set(x, "Cidr", js.undefined)
    
    inline def setEvents(value: ByoipCidrEvents): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "Events", js.undefined)
    
    inline def setEventsVarargs(value: ByoipCidrEvent*): Self = StObject.set(x, "Events", js.Array(value*))
    
    inline def setState(value: ByoipCidrState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
