package typings.awsSdk.clientsSimspaceweaverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveSimulationState extends StObject {
  
  /**
    * A list of simulation clocks.  At this time, a simulation has only one clock. 
    */
  var Clocks: js.UndefOr[SimulationClockList] = js.undefined
  
  /**
    * A list of domains for the simulation. For more information about domains, see Key concepts: Domains in the SimSpace Weaver User Guide.
    */
  var Domains: js.UndefOr[DomainList] = js.undefined
}
object LiveSimulationState {
  
  inline def apply(): LiveSimulationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveSimulationState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LiveSimulationState] (val x: Self) extends AnyVal {
    
    inline def setClocks(value: SimulationClockList): Self = StObject.set(x, "Clocks", value.asInstanceOf[js.Any])
    
    inline def setClocksUndefined: Self = StObject.set(x, "Clocks", js.undefined)
    
    inline def setClocksVarargs(value: SimulationClock*): Self = StObject.set(x, "Clocks", js.Array(value*))
    
    inline def setDomains(value: DomainList): Self = StObject.set(x, "Domains", value.asInstanceOf[js.Any])
    
    inline def setDomainsUndefined: Self = StObject.set(x, "Domains", js.undefined)
    
    inline def setDomainsVarargs(value: Domain*): Self = StObject.set(x, "Domains", js.Array(value*))
  }
}
