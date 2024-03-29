package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartFleetActionsInput extends StObject {
  
  /**
    * List of actions to restart on the fleet.
    */
  var Actions: FleetActionList
  
  /**
    * A unique identifier for the fleet to restart actions on. You can use either the fleet ID or ARN value.
    */
  var FleetId: FleetIdOrArn
  
  /**
    * The fleet location to restart fleet actions for. Specify a location in the form of an Amazon Web Services Region code, such as us-west-2.
    */
  var Location: js.UndefOr[LocationStringModel] = js.undefined
}
object StartFleetActionsInput {
  
  inline def apply(Actions: FleetActionList, FleetId: FleetIdOrArn): StartFleetActionsInput = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], FleetId = FleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartFleetActionsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartFleetActionsInput] (val x: Self) extends AnyVal {
    
    inline def setActions(value: FleetActionList): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: FleetAction*): Self = StObject.set(x, "Actions", js.Array(value*))
    
    inline def setFleetId(value: FleetIdOrArn): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: LocationStringModel): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
  }
}
