package typings.awsSdk.clientsSimspaceweaverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartAppOutput extends StObject {
  
  /**
    * The name of the domain of the app.
    */
  var Domain: js.UndefOr[SimSpaceWeaverResourceName] = js.undefined
  
  /**
    * The name of the app.
    */
  var Name: js.UndefOr[SimSpaceWeaverResourceName] = js.undefined
  
  /**
    * The name of the simulation of the app.
    */
  var Simulation: js.UndefOr[SimSpaceWeaverResourceName] = js.undefined
}
object StartAppOutput {
  
  inline def apply(): StartAppOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartAppOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartAppOutput] (val x: Self) extends AnyVal {
    
    inline def setDomain(value: SimSpaceWeaverResourceName): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    inline def setName(value: SimSpaceWeaverResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSimulation(value: SimSpaceWeaverResourceName): Self = StObject.set(x, "Simulation", value.asInstanceOf[js.Any])
    
    inline def setSimulationUndefined: Self = StObject.set(x, "Simulation", js.undefined)
  }
}
