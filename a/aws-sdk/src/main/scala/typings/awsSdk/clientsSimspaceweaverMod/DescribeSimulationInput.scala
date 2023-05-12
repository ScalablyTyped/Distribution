package typings.awsSdk.clientsSimspaceweaverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSimulationInput extends StObject {
  
  /**
    * The name of the simulation.
    */
  var Simulation: SimSpaceWeaverResourceName
}
object DescribeSimulationInput {
  
  inline def apply(Simulation: SimSpaceWeaverResourceName): DescribeSimulationInput = {
    val __obj = js.Dynamic.literal(Simulation = Simulation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSimulationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeSimulationInput] (val x: Self) extends AnyVal {
    
    inline def setSimulation(value: SimSpaceWeaverResourceName): Self = StObject.set(x, "Simulation", value.asInstanceOf[js.Any])
  }
}
