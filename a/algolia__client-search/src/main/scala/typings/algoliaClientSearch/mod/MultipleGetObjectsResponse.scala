package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultipleGetObjectsResponse[TObject] extends StObject {
  
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
  implicit class MultipleGetObjectsResponseMutableBuilder[Self <: MultipleGetObjectsResponse[_], TObject] (val x: Self with MultipleGetObjectsResponse[TObject]) extends AnyVal {
    
    @scala.inline
    def setResults(value: js.Array[TObject with ObjectWithObjectID]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsVarargs(value: (TObject with ObjectWithObjectID)*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
