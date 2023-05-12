package typings.awsSdk.clientsSimspaceweaverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAppOutput extends StObject {
  
  /**
    * The description of the app.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsSimspaceweaverMod.Description] = js.undefined
  
  /**
    * The name of the domain of the app.
    */
  var Domain: js.UndefOr[SimSpaceWeaverResourceName] = js.undefined
  
  /**
    * Information about the network endpoint for the custom app. You can use the endpoint to connect to the custom app.
    */
  var EndpointInfo: js.UndefOr[SimulationAppEndpointInfo] = js.undefined
  
  var LaunchOverrides: js.UndefOr[typings.awsSdk.clientsSimspaceweaverMod.LaunchOverrides] = js.undefined
  
  /**
    * The name of the app.
    */
  var Name: js.UndefOr[SimSpaceWeaverLongResourceName] = js.undefined
  
  /**
    * The name of the simulation of the app.
    */
  var Simulation: js.UndefOr[SimSpaceWeaverResourceName] = js.undefined
  
  /**
    * The current lifecycle state of the custom app.
    */
  var Status: js.UndefOr[SimulationAppStatus] = js.undefined
  
  /**
    * The desired lifecycle state of the custom app.
    */
  var TargetStatus: js.UndefOr[SimulationAppTargetStatus] = js.undefined
}
object DescribeAppOutput {
  
  inline def apply(): DescribeAppOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAppOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAppOutput] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDomain(value: SimSpaceWeaverResourceName): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    inline def setEndpointInfo(value: SimulationAppEndpointInfo): Self = StObject.set(x, "EndpointInfo", value.asInstanceOf[js.Any])
    
    inline def setEndpointInfoUndefined: Self = StObject.set(x, "EndpointInfo", js.undefined)
    
    inline def setLaunchOverrides(value: LaunchOverrides): Self = StObject.set(x, "LaunchOverrides", value.asInstanceOf[js.Any])
    
    inline def setLaunchOverridesUndefined: Self = StObject.set(x, "LaunchOverrides", js.undefined)
    
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
