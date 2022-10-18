package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFleetsForVehicleResponse extends StObject {
  
  /**
    *  A list of fleet IDs that the vehicle is associated with. 
    */
  var fleets: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.fleets] = js.undefined
  
  /**
    *  The token to retrieve the next set of results, or null if there are no more results. 
    */
  var nextToken: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.nextToken] = js.undefined
}
object ListFleetsForVehicleResponse {
  
  inline def apply(): ListFleetsForVehicleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFleetsForVehicleResponse]
  }
  
  extension [Self <: ListFleetsForVehicleResponse](x: Self) {
    
    inline def setFleets(value: fleets): Self = StObject.set(x, "fleets", value.asInstanceOf[js.Any])
    
    inline def setFleetsUndefined: Self = StObject.set(x, "fleets", js.undefined)
    
    inline def setFleetsVarargs(value: fleetId*): Self = StObject.set(x, "fleets", js.Array(value*))
    
    inline def setNextToken(value: nextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
