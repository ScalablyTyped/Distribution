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
  
  extension [Self <: GetObjectsResponse[?], TObject](x: Self & GetObjectsResponse[TObject]) {
    
    inline def setResults(value: js.Array[(TObject & ObjectWithObjectID) | Null]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: ((TObject & ObjectWithObjectID) | Null)*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
