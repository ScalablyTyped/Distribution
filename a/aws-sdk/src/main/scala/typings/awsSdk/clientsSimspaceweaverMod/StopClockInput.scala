package typings.awsSdk.clientsSimspaceweaverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopClockInput extends StObject {
  
  /**
    * The name of the simulation.
    */
  var Simulation: SimSpaceWeaverResourceName
}
object StopClockInput {
  
  inline def apply(Simulation: SimSpaceWeaverResourceName): StopClockInput = {
    val __obj = js.Dynamic.literal(Simulation = Simulation.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopClockInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopClockInput] (val x: Self) extends AnyVal {
    
    inline def setSimulation(value: SimSpaceWeaverResourceName): Self = StObject.set(x, "Simulation", value.asInstanceOf[js.Any])
  }
}
