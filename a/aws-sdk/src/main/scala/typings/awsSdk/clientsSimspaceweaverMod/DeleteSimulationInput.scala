package typings.awsSdk.clientsSimspaceweaverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSimulationInput extends StObject {
  
  /**
    * The name of the simulation.
    */
  var Simulation: SimSpaceWeaverResourceName
}
object DeleteSimulationInput {
  
  inline def apply(Simulation: SimSpaceWeaverResourceName): DeleteSimulationInput = {
    val __obj = js.Dynamic.literal(Simulation = Simulation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSimulationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteSimulationInput] (val x: Self) extends AnyVal {
    
    inline def setSimulation(value: SimSpaceWeaverResourceName): Self = StObject.set(x, "Simulation", value.asInstanceOf[js.Any])
  }
}
