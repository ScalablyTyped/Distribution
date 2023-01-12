package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFleetLocationsOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that is assigned to a GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions. Format is arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912. 
    */
  var FleetArn: js.UndefOr[typings.awsSdk.clientsGameliftMod.FleetArn] = js.undefined
  
  /**
    * A unique identifier for the fleet that was updated with new locations.
    */
  var FleetId: js.UndefOr[FleetIdOrArn] = js.undefined
  
  /**
    * The remote locations that are being added to the fleet, and the life-cycle status of each location. For new locations, the status is set to NEW. During location creation, GameLift updates each location's status as instances are deployed there and prepared for game hosting. This list does not include the fleet home Region or any remote locations that were already added to the fleet.
    */
  var LocationStates: js.UndefOr[LocationStateList] = js.undefined
}
object CreateFleetLocationsOutput {
  
  inline def apply(): CreateFleetLocationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFleetLocationsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateFleetLocationsOutput] (val x: Self) extends AnyVal {
    
    inline def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
    
    inline def setFleetArnUndefined: Self = StObject.set(x, "FleetArn", js.undefined)
    
    inline def setFleetId(value: FleetIdOrArn): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    inline def setFleetIdUndefined: Self = StObject.set(x, "FleetId", js.undefined)
    
    inline def setLocationStates(value: LocationStateList): Self = StObject.set(x, "LocationStates", value.asInstanceOf[js.Any])
    
    inline def setLocationStatesUndefined: Self = StObject.set(x, "LocationStates", js.undefined)
    
    inline def setLocationStatesVarargs(value: LocationState*): Self = StObject.set(x, "LocationStates", js.Array(value*))
  }
}
