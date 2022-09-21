package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object containing the response from an autocomplete request.
  */
trait SearchAutocompleteResponse extends StObject {
  
  /**
    * The query string used to perform the autocomplete request.
    */
  var query: String
  
  /**
    * The results from an autocomplete request.
    */
  var results: js.Array[SearchAutocompleteResult]
}
object SearchAutocompleteResponse {
  
  inline def apply(query: String, results: js.Array[SearchAutocompleteResult]): SearchAutocompleteResponse = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchAutocompleteResponse]
  }
  
  extension [Self <: SearchAutocompleteResponse](x: Self) {
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setResults(value: js.Array[SearchAutocompleteResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: SearchAutocompleteResult*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
