package typings.awsSdk.clientsSimspaceweaverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimulationClock extends StObject {
  
  /**
    * The current status of the simulation clock.
    */
  var Status: js.UndefOr[ClockStatus] = js.undefined
  
  /**
    * The desired status of the simulation clock.
    */
  var TargetStatus: js.UndefOr[ClockTargetStatus] = js.undefined
}
object SimulationClock {
  
  inline def apply(): SimulationClock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimulationClock]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SimulationClock] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: ClockStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTargetStatus(value: ClockTargetStatus): Self = StObject.set(x, "TargetStatus", value.asInstanceOf[js.Any])
    
    inline def setTargetStatusUndefined: Self = StObject.set(x, "TargetStatus", js.undefined)
  }
}
