package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVehiclesInFleetResponse extends StObject {
  
  /**
    *  The token to retrieve the next set of results, or null if there are no more results. 
    */
  var nextToken: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.nextToken] = js.undefined
  
  /**
    *  A list of vehicles associated with the fleet. 
    */
  var vehicles: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.vehicles] = js.undefined
}
object ListVehiclesInFleetResponse {
  
  inline def apply(): ListVehiclesInFleetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVehiclesInFleetResponse]
  }
  
  extension [Self <: ListVehiclesInFleetResponse](x: Self) {
    
    inline def setNextToken(value: nextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setVehicles(value: vehicles): Self = StObject.set(x, "vehicles", value.asInstanceOf[js.Any])
    
    inline def setVehiclesUndefined: Self = StObject.set(x, "vehicles", js.undefined)
    
    inline def setVehiclesVarargs(value: vehicleName*): Self = StObject.set(x, "vehicles", js.Array(value*))
  }
}
