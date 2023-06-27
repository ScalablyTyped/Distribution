package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultipleQueriesResponse[TObject] extends StObject {
  
  /**
    * The list of results.
    */
  var results: js.Array[SearchResponse[TObject] | SearchForFacetValuesResponse]
}
object MultipleQueriesResponse {
  
  inline def apply[TObject](results: js.Array[SearchResponse[TObject] | SearchForFacetValuesResponse]): MultipleQueriesResponse[TObject] = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleQueriesResponse[TObject]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultipleQueriesResponse[?], TObject] (val x: Self & MultipleQueriesResponse[TObject]) extends AnyVal {
    
    inline def setResults(value: js.Array[SearchResponse[TObject] | SearchForFacetValuesResponse]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: (SearchResponse[TObject] | SearchForFacetValuesResponse)*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
