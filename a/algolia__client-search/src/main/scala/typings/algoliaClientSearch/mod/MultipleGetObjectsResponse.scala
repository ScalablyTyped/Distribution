package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultipleGetObjectsResponse[TObject] extends js.Object {
  
  /**
    * The list of objects.
    */
  var results: js.Array[TObject with ObjectWithObjectID] = js.native
}
object MultipleGetObjectsResponse {
  
  @scala.inline
  def apply[TObject](results: js.Array[TObject with ObjectWithObjectID]): MultipleGetObjectsResponse[TObject] = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleGetObjectsResponse[TObject]]
  }
  
  @scala.inline
  implicit class MultipleGetObjectsResponseOps[Self <: MultipleGetObjectsResponse[_], TObject] (val x: Self with MultipleGetObjectsResponse[TObject]) extends AnyVal {
    
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
    def setResultsVarargs(value: (TObject with ObjectWithObjectID)*): Self = this.set("results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[TObject with ObjectWithObjectID]): Self = this.set("results", value.asInstanceOf[js.Any])
  }
}
