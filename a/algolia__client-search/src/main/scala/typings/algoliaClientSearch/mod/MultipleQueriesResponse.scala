package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultipleQueriesResponse[TObject] extends StObject {
  
  /**
    * The list of results.
    */
  var results: js.Array[SearchResponse[TObject]] = js.native
}
object MultipleQueriesResponse {
  
  @scala.inline
  def apply[TObject](results: js.Array[SearchResponse[TObject]]): MultipleQueriesResponse[TObject] = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleQueriesResponse[TObject]]
  }
  
  @scala.inline
  implicit class MultipleQueriesResponseMutableBuilder[Self <: MultipleQueriesResponse[_], TObject] (val x: Self with MultipleQueriesResponse[TObject]) extends AnyVal {
    
    @scala.inline
    def setResults(value: js.Array[SearchResponse[TObject]]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsVarargs(value: SearchResponse[TObject]*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
