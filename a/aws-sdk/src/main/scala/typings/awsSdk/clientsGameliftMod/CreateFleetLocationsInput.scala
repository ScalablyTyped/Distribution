package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFleetLocationsInput extends StObject {
  
  /**
    * A unique identifier for the fleet to add locations to. You can use either the fleet ID or ARN value.
    */
  var FleetId: FleetIdOrArn
  
  /**
    * A list of locations to deploy additional instances to and manage as part of the fleet. You can add any GameLift-supported Amazon Web Services Region as a remote location, in the form of an Amazon Web Services Region code such as us-west-2. 
    */
  var Locations: LocationConfigurationList
}
object CreateFleetLocationsInput {
  
  inline def apply(FleetId: FleetIdOrArn, Locations: LocationConfigurationList): CreateFleetLocationsInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any], Locations = Locations.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFleetLocationsInput]
  }
  
  extension [Self <: CreateFleetLocationsInput](x: Self) {
    
    inline def setFleetId(value: FleetIdOrArn): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    inline def setLocations(value: LocationConfigurationList): Self = StObject.set(x, "Locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsVarargs(value: LocationConfiguration*): Self = StObject.set(x, "Locations", js.Array(value*))
  }
}
