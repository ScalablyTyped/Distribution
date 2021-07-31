package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultipleGetObjectsResponse[TObject] extends StObject {
  
  /**
    * The list of objects.
    */
  var results: js.Array[TObject & ObjectWithObjectID]
}
object MultipleGetObjectsResponse {
  
  @scala.inline
  def apply[TObject](results: js.Array[TObject & ObjectWithObjectID]): MultipleGetObjectsResponse[TObject] = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleGetObjectsResponse[TObject]]
  }
  
  @scala.inline
  implicit class MultipleGetObjectsResponseMutableBuilder[Self <: MultipleGetObjectsResponse[?], TObject] (val x: Self & MultipleGetObjectsResponse[TObject]) extends AnyVal {
    
    @scala.inline
    def setResults(value: js.Array[TObject & ObjectWithObjectID]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsVarargs(value: (TObject & ObjectWithObjectID)*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
