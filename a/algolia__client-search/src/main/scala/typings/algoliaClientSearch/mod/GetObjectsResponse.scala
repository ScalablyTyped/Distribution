package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetObjectsResponse[TObject] extends js.Object {
  
  /**
    * The list of results.
    */
  var results: js.Array[(TObject with ObjectWithObjectID) | Null] = js.native
}
object GetObjectsResponse {
  
  @scala.inline
  def apply[TObject](results: js.Array[(TObject with ObjectWithObjectID) | Null]): GetObjectsResponse[TObject] = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectsResponse[TObject]]
  }
  
  @scala.inline
  implicit class GetObjectsResponseOps[Self <: GetObjectsResponse[_], TObject] (val x: Self with GetObjectsResponse[TObject]) extends AnyVal {
    
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
    def setResultsVarargs(value: ((TObject with ObjectWithObjectID) | Null)*): Self = this.set("results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[(TObject with ObjectWithObjectID) | Null]): Self = this.set("results", value.asInstanceOf[js.Any])
  }
}
