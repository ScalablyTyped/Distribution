package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchSearchCompleteEventResults extends StObject {
  
  var results: js.Array[SearchResult]
  
  var source: Any
  
  var sourceIndex: Double
}
object SearchSearchCompleteEventResults {
  
  inline def apply(results: js.Array[SearchResult], source: Any, sourceIndex: Double): SearchSearchCompleteEventResults = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSearchCompleteEventResults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchSearchCompleteEventResults] (val x: Self) extends AnyVal {
    
    inline def setResults(value: js.Array[SearchResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: SearchResult*): Self = StObject.set(x, "results", js.Array(value*))
    
    inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceIndex(value: Double): Self = StObject.set(x, "sourceIndex", value.asInstanceOf[js.Any])
  }
}
