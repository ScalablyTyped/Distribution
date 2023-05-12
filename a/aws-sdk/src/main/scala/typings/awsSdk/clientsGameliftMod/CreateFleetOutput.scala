package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFleetOutput extends StObject {
  
  /**
    * The properties for the new fleet, including the current status. All fleets are placed in NEW status on creation. 
    */
  var FleetAttributes: js.UndefOr[typings.awsSdk.clientsGameliftMod.FleetAttributes] = js.undefined
  
  /**
    * The fleet's locations and life-cycle status of each location. For new fleets, the status of all locations is set to NEW. During fleet creation, Amazon GameLift updates each location status as instances are deployed there and prepared for game hosting. This list includes an entry for the fleet's home Region. For fleets with no remote locations, only one entry, representing the home Region, is returned.
    */
  var LocationStates: js.UndefOr[LocationStateList] = js.undefined
}
object CreateFleetOutput {
  
  inline def apply(): CreateFleetOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFleetOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateFleetOutput] (val x: Self) extends AnyVal {
    
    inline def setFleetAttributes(value: FleetAttributes): Self = StObject.set(x, "FleetAttributes", value.asInstanceOf[js.Any])
    
    inline def setFleetAttributesUndefined: Self = StObject.set(x, "FleetAttributes", js.undefined)
    
    inline def setLocationStates(value: LocationStateList): Self = StObject.set(x, "LocationStates", value.asInstanceOf[js.Any])
    
    inline def setLocationStatesUndefined: Self = StObject.set(x, "LocationStates", js.undefined)
    
    inline def setLocationStatesVarargs(value: LocationState*): Self = StObject.set(x, "LocationStates", js.Array(value*))
  }
}
