package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFleetRequest extends StObject {
  
  /**
    *  The ID of the fleet to delete. 
    */
  var fleetId: typings.awsSdk.clientsIotfleetwiseMod.fleetId
}
object DeleteFleetRequest {
  
  inline def apply(fleetId: fleetId): DeleteFleetRequest = {
    val __obj = js.Dynamic.literal(fleetId = fleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFleetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteFleetRequest] (val x: Self) extends AnyVal {
    
    inline def setFleetId(value: fleetId): Self = StObject.set(x, "fleetId", value.asInstanceOf[js.Any])
  }
}
