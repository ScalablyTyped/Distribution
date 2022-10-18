package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchPlaceIndexForSuggestionsResponse extends StObject {
  
  /**
    * A list of place suggestions that best match the search text.
    */
  var Results: SearchForSuggestionsResultList
  
  /**
    * Contains a summary of the request. Echoes the input values for BiasPosition, FilterBBox, FilterCountries, Language, MaxResults, and Text. Also includes the DataSource of the place index. 
    */
  var Summary: SearchPlaceIndexForSuggestionsSummary
}
object SearchPlaceIndexForSuggestionsResponse {
  
  inline def apply(Results: SearchForSuggestionsResultList, Summary: SearchPlaceIndexForSuggestionsSummary): SearchPlaceIndexForSuggestionsResponse = {
    val __obj = js.Dynamic.literal(Results = Results.asInstanceOf[js.Any], Summary = Summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPlaceIndexForSuggestionsResponse]
  }
  
  extension [Self <: SearchPlaceIndexForSuggestionsResponse](x: Self) {
    
    inline def setResults(value: SearchForSuggestionsResultList): Self = StObject.set(x, "Results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: SearchForSuggestionsResult*): Self = StObject.set(x, "Results", js.Array(value*))
    
    inline def setSummary(value: SearchPlaceIndexForSuggestionsSummary): Self = StObject.set(x, "Summary", value.asInstanceOf[js.Any])
  }
}
