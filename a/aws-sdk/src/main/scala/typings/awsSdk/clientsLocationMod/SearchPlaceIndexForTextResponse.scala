package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchPlaceIndexForTextResponse extends StObject {
  
  /**
    * A list of Places matching the input text. Each result contains additional information about the specific point of interest.  Not all response properties are included with all responses. Some properties may only be returned by specific data partners.
    */
  var Results: SearchForTextResultList
  
  /**
    * Contains a summary of the request. Echoes the input values for BiasPosition, FilterBBox, FilterCountries, Language, MaxResults, and Text. Also includes the DataSource of the place index and the bounding box, ResultBBox, which surrounds the search results. 
    */
  var Summary: SearchPlaceIndexForTextSummary
}
object SearchPlaceIndexForTextResponse {
  
  inline def apply(Results: SearchForTextResultList, Summary: SearchPlaceIndexForTextSummary): SearchPlaceIndexForTextResponse = {
    val __obj = js.Dynamic.literal(Results = Results.asInstanceOf[js.Any], Summary = Summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPlaceIndexForTextResponse]
  }
  
  extension [Self <: SearchPlaceIndexForTextResponse](x: Self) {
    
    inline def setResults(value: SearchForTextResultList): Self = StObject.set(x, "Results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: SearchForTextResult*): Self = StObject.set(x, "Results", js.Array(value*))
    
    inline def setSummary(value: SearchPlaceIndexForTextSummary): Self = StObject.set(x, "Summary", value.asInstanceOf[js.Any])
  }
}
