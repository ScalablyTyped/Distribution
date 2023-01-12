package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchSuggestCompleteEventResults extends StObject {
  
  var results: js.Array[SuggestResult]
  
  var source: Any
  
  var sourceIndex: Double
}
object SearchSuggestCompleteEventResults {
  
  inline def apply(results: js.Array[SuggestResult], source: Any, sourceIndex: Double): SearchSuggestCompleteEventResults = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSuggestCompleteEventResults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchSuggestCompleteEventResults] (val x: Self) extends AnyVal {
    
    inline def setResults(value: js.Array[SuggestResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: SuggestResult*): Self = StObject.set(x, "results", js.Array(value*))
    
    inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceIndex(value: Double): Self = StObject.set(x, "sourceIndex", value.asInstanceOf[js.Any])
  }
}
