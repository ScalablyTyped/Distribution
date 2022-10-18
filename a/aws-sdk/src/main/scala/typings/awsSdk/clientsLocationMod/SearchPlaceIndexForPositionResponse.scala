package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchPlaceIndexForPositionResponse extends StObject {
  
  /**
    * Returns a list of Places closest to the specified position. Each result contains additional information about the Places returned.
    */
  var Results: SearchForPositionResultList
  
  /**
    * Contains a summary of the request. Echoes the input values for Position, Language, MaxResults, and the DataSource of the place index. 
    */
  var Summary: SearchPlaceIndexForPositionSummary
}
object SearchPlaceIndexForPositionResponse {
  
  inline def apply(Results: SearchForPositionResultList, Summary: SearchPlaceIndexForPositionSummary): SearchPlaceIndexForPositionResponse = {
    val __obj = js.Dynamic.literal(Results = Results.asInstanceOf[js.Any], Summary = Summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPlaceIndexForPositionResponse]
  }
  
  extension [Self <: SearchPlaceIndexForPositionResponse](x: Self) {
    
    inline def setResults(value: SearchForPositionResultList): Self = StObject.set(x, "Results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: SearchForPositionResult*): Self = StObject.set(x, "Results", js.Array(value*))
    
    inline def setSummary(value: SearchPlaceIndexForPositionSummary): Self = StObject.set(x, "Summary", value.asInstanceOf[js.Any])
  }
}
