package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateVehicleResponse extends StObject {
  
  /**
    * A list of information about errors returned while updating a batch of vehicles, or, if there aren't any errors, an empty list.
    */
  var errors: js.UndefOr[updateVehicleErrors] = js.undefined
  
  /**
    *  A list of information about the batch of updated vehicles.   This list contains only unique IDs for the vehicles that were updated. 
    */
  var vehicles: js.UndefOr[updateVehicleResponseItems] = js.undefined
}
object BatchUpdateVehicleResponse {
  
  inline def apply(): BatchUpdateVehicleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateVehicleResponse]
  }
  
  extension [Self <: BatchUpdateVehicleResponse](x: Self) {
    
    inline def setErrors(value: updateVehicleErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: UpdateVehicleError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setVehicles(value: updateVehicleResponseItems): Self = StObject.set(x, "vehicles", value.asInstanceOf[js.Any])
    
    inline def setVehiclesUndefined: Self = StObject.set(x, "vehicles", js.undefined)
    
    inline def setVehiclesVarargs(value: UpdateVehicleResponseItem*): Self = StObject.set(x, "vehicles", js.Array(value*))
  }
}
