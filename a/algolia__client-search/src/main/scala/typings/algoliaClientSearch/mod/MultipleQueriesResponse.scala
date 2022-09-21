package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultipleQueriesResponse[TObject] extends StObject {
  
  /**
    * The list of results.
    */
  var results: js.Array[SearchResponse[TObject]]
}
object MultipleQueriesResponse {
  
  inline def apply[TObject](results: js.Array[SearchResponse[TObject]]): MultipleQueriesResponse[TObject] = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleQueriesResponse[TObject]]
  }
  
  extension [Self <: MultipleQueriesResponse[?], TObject](x: Self & MultipleQueriesResponse[TObject]) {
    
    inline def setResults(value: js.Array[SearchResponse[TObject]]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: SearchResponse[TObject]*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
