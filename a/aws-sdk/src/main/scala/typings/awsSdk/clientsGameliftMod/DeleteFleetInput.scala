package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFleetInput extends StObject {
  
  /**
    * A unique identifier for the fleet to be deleted. You can use either the fleet ID or ARN value.
    */
  var FleetId: FleetIdOrArn
}
object DeleteFleetInput {
  
  inline def apply(FleetId: FleetIdOrArn): DeleteFleetInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFleetInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteFleetInput] (val x: Self) extends AnyVal {
    
    inline def setFleetId(value: FleetIdOrArn): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
  }
}
