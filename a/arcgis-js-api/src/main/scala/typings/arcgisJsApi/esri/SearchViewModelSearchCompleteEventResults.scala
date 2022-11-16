package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchViewModelSearchCompleteEventResults extends StObject {
  
  var results: js.Array[SearchResult]
  
  var source: js.Array[Any]
  
  var sourceIndex: Double
}
object SearchViewModelSearchCompleteEventResults {
  
  inline def apply(results: js.Array[SearchResult], source: js.Array[Any], sourceIndex: Double): SearchViewModelSearchCompleteEventResults = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchViewModelSearchCompleteEventResults]
  }
  
  extension [Self <: SearchViewModelSearchCompleteEventResults](x: Self) {
    
    inline def setResults(value: js.Array[SearchResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: SearchResult*): Self = StObject.set(x, "results", js.Array(value*))
    
    inline def setSource(value: js.Array[Any]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceIndex(value: Double): Self = StObject.set(x, "sourceIndex", value.asInstanceOf[js.Any])
    
    inline def setSourceVarargs(value: Any*): Self = StObject.set(x, "source", js.Array(value*))
  }
}
