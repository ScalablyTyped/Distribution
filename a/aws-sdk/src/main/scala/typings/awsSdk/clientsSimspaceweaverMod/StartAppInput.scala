package typings.awsSdk.clientsSimspaceweaverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartAppInput extends StObject {
  
  /**
    * A value that you provide to ensure that repeated calls to this API operation using the same parameters complete only once. A ClientToken is also known as an idempotency token. A ClientToken expires after 24 hours.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsSimspaceweaverMod.ClientToken] = js.undefined
  
  /**
    * The description of the app.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsSimspaceweaverMod.Description] = js.undefined
  
  /**
    * The name of the domain of the app.
    */
  var Domain: SimSpaceWeaverResourceName
  
  var LaunchOverrides: js.UndefOr[typings.awsSdk.clientsSimspaceweaverMod.LaunchOverrides] = js.undefined
  
  /**
    * The name of the app.
    */
  var Name: SimSpaceWeaverResourceName
  
  /**
    * The name of the simulation of the app.
    */
  var Simulation: SimSpaceWeaverResourceName
}
object StartAppInput {
  
  inline def apply(
    Domain: SimSpaceWeaverResourceName,
    Name: SimSpaceWeaverResourceName,
    Simulation: SimSpaceWeaverResourceName
  ): StartAppInput = {
    val __obj = js.Dynamic.literal(Domain = Domain.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Simulation = Simulation.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartAppInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartAppInput] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDomain(value: SimSpaceWeaverResourceName): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setLaunchOverrides(value: LaunchOverrides): Self = StObject.set(x, "LaunchOverrides", value.asInstanceOf[js.Any])
    
    inline def setLaunchOverridesUndefined: Self = StObject.set(x, "LaunchOverrides", js.undefined)
    
    inline def setName(value: SimSpaceWeaverResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSimulation(value: SimSpaceWeaverResourceName): Self = StObject.set(x, "Simulation", value.asInstanceOf[js.Any])
  }
}
