package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuggestResponseResults extends StObject {
  
  /**
    * An array of suggest results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#SuggestResponse)
    */
  var results: js.Array[SuggestResult]
  
  /**
    * The [source](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#sources) of the selected result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#SuggestResponse)
    */
  var source: Any
  
  /**
    * The index of the currently selected source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#SuggestResponse)
    */
  var sourceIndex: Double
}
object SuggestResponseResults {
  
  inline def apply(results: js.Array[SuggestResult], source: Any, sourceIndex: Double): SuggestResponseResults = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestResponseResults]
  }
  
  extension [Self <: SuggestResponseResults](x: Self) {
    
    inline def setResults(value: js.Array[SuggestResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: SuggestResult*): Self = StObject.set(x, "results", js.Array(value*))
    
    inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceIndex(value: Double): Self = StObject.set(x, "sourceIndex", value.asInstanceOf[js.Any])
  }
}
