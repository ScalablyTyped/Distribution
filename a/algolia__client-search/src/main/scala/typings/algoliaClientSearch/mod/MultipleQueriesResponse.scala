package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultipleQueriesResponse[TObject] extends js.Object {
  
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
  implicit class MultipleQueriesResponseOps[Self <: MultipleQueriesResponse[_], TObject] (val x: Self with MultipleQueriesResponse[TObject]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setResultsVarargs(value: SearchResponse[TObject]*): Self = this.set("results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[SearchResponse[TObject]]): Self = this.set("results", value.asInstanceOf[js.Any])
  }
}
