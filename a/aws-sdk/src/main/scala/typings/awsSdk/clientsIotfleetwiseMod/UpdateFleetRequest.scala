package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFleetRequest extends StObject {
  
  /**
    *  An updated description of the fleet. 
    */
  var description: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.description] = js.undefined
  
  /**
    *  The ID of the fleet to update. 
    */
  var fleetId: typings.awsSdk.clientsIotfleetwiseMod.fleetId
}
object UpdateFleetRequest {
  
  inline def apply(fleetId: fleetId): UpdateFleetRequest = {
    val __obj = js.Dynamic.literal(fleetId = fleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFleetRequest]
  }
  
  extension [Self <: UpdateFleetRequest](x: Self) {
    
    inline def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFleetId(value: fleetId): Self = StObject.set(x, "fleetId", value.asInstanceOf[js.Any])
  }
}
