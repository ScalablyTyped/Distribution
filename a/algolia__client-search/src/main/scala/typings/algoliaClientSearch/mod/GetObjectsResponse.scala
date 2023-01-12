package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetObjectsResponse[TObject] extends StObject {
  
  /**
    * The list of results.
    */
  var results: js.Array[(TObject & ObjectWithObjectID) | Null]
}
object GetObjectsResponse {
  
  inline def apply[TObject](results: js.Array[(TObject & ObjectWithObjectID) | Null]): GetObjectsResponse[TObject] = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectsResponse[TObject]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetObjectsResponse[?], TObject] (val x: Self & GetObjectsResponse[TObject]) extends AnyVal {
    
    inline def setResults(value: js.Array[(TObject & ObjectWithObjectID) | Null]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: ((TObject & ObjectWithObjectID) | Null)*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
