package typings.awsSdk.clientsSimspaceweaverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimulationAppMetadata extends StObject {
  
  /**
    * The domain of the app. For more information about domains, see Key concepts: Domains in the SimSpace Weaver User Guide.
    */
  var Domain: js.UndefOr[SimSpaceWeaverResourceName] = js.undefined
  
  /**
    * The name of the app.
    */
  var Name: js.UndefOr[SimSpaceWeaverLongResourceName] = js.undefined
  
  /**
    * The name of the simulation of the app.
    */
  var Simulation: js.UndefOr[SimSpaceWeaverResourceName] = js.undefined
  
  /**
    * The current status of the app.
    */
  var Status: js.UndefOr[SimulationAppStatus] = js.undefined
  
  /**
    * The desired status of the app.
    */
  var TargetStatus: js.UndefOr[SimulationAppTargetStatus] = js.undefined
}
object SimulationAppMetadata {
  
  inline def apply(): SimulationAppMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimulationAppMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SimulationAppMetadata] (val x: Self) extends AnyVal {
    
    inline def setDomain(value: SimSpaceWeaverResourceName): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    inline def setName(value: SimSpaceWeaverLongResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSimulation(value: SimSpaceWeaverResourceName): Self = StObject.set(x, "Simulation", value.asInstanceOf[js.Any])
    
    inline def setSimulationUndefined: Self = StObject.set(x, "Simulation", js.undefined)
    
    inline def setStatus(value: SimulationAppStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTargetStatus(value: SimulationAppTargetStatus): Self = StObject.set(x, "TargetStatus", value.asInstanceOf[js.Any])
    
    inline def setTargetStatusUndefined: Self = StObject.set(x, "TargetStatus", js.undefined)
  }
}
