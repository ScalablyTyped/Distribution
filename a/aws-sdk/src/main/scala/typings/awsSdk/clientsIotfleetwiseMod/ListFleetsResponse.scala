package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFleetsResponse extends StObject {
  
  /**
    *  A list of information for each fleet. 
    */
  var fleetSummaries: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.fleetSummaries] = js.undefined
  
  /**
    *  The token to retrieve the next set of results, or null if there are no more results. 
    */
  var nextToken: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.nextToken] = js.undefined
}
object ListFleetsResponse {
  
  inline def apply(): ListFleetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFleetsResponse]
  }
  
  extension [Self <: ListFleetsResponse](x: Self) {
    
    inline def setFleetSummaries(value: fleetSummaries): Self = StObject.set(x, "fleetSummaries", value.asInstanceOf[js.Any])
    
    inline def setFleetSummariesUndefined: Self = StObject.set(x, "fleetSummaries", js.undefined)
    
    inline def setFleetSummariesVarargs(value: FleetSummary*): Self = StObject.set(x, "fleetSummaries", js.Array(value*))
    
    inline def setNextToken(value: nextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
