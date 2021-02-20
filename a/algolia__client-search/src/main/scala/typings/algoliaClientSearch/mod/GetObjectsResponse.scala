package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetObjectsResponse[TObject] extends StObject {
  
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
  implicit class GetObjectsResponseMutableBuilder[Self <: GetObjectsResponse[_], TObject] (val x: Self with GetObjectsResponse[TObject]) extends AnyVal {
    
    @scala.inline
    def setResults(value: js.Array[(TObject with ObjectWithObjectID) | Null]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsVarargs(value: ((TObject with ObjectWithObjectID) | Null)*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
