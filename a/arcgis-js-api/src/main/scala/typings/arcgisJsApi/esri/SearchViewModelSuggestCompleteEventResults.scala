package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchViewModelSuggestCompleteEventResults extends StObject {
  
  var results: js.Array[SearchViewModelSuggestResult]
  
  var source: Any
  
  var sourceIndex: Double
}
object SearchViewModelSuggestCompleteEventResults {
  
  inline def apply(results: js.Array[SearchViewModelSuggestResult], source: Any, sourceIndex: Double): SearchViewModelSuggestCompleteEventResults = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchViewModelSuggestCompleteEventResults]
  }
  
  extension [Self <: SearchViewModelSuggestCompleteEventResults](x: Self) {
    
    inline def setResults(value: js.Array[SearchViewModelSuggestResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: SearchViewModelSuggestResult*): Self = StObject.set(x, "results", js.Array(value*))
    
    inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceIndex(value: Double): Self = StObject.set(x, "sourceIndex", value.asInstanceOf[js.Any])
  }
}
