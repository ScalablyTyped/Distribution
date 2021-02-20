package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object containing the response from an autocomplete request.
  */
@js.native
trait SearchAutocompleteResponse extends StObject {
  
  /**
    * The query string used to perform the autocomplete request.
    */
  var query: String = js.native
  
  /**
    * The results from an autocomplete request.
    */
  var results: js.Array[SearchAutocompleteResult] = js.native
}
object SearchAutocompleteResponse {
  
  @scala.inline
  def apply(query: String, results: js.Array[SearchAutocompleteResult]): SearchAutocompleteResponse = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchAutocompleteResponse]
  }
  
  @scala.inline
  implicit class SearchAutocompleteResponseMutableBuilder[Self <: SearchAutocompleteResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResults(value: js.Array[SearchAutocompleteResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsVarargs(value: SearchAutocompleteResult*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
