package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchViewModelSearchResponseResults extends StObject {
  
  /**
    * An array of search results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#SearchResponse)
    */
  var results: js.Array[SearchViewModelSearchResult]
  
  /**
    * The [source](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#sources) of the selected result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#SearchResponse)
    */
  var source: Any
  
  /**
    * The index of the currently selected source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#SearchResponse)
    */
  var sourceIndex: Double
}
object SearchViewModelSearchResponseResults {
  
  inline def apply(results: js.Array[SearchViewModelSearchResult], source: Any, sourceIndex: Double): SearchViewModelSearchResponseResults = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchViewModelSearchResponseResults]
  }
  
  extension [Self <: SearchViewModelSearchResponseResults](x: Self) {
    
    inline def setResults(value: js.Array[SearchViewModelSearchResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: SearchViewModelSearchResult*): Self = StObject.set(x, "results", js.Array(value*))
    
    inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceIndex(value: Double): Self = StObject.set(x, "sourceIndex", value.asInstanceOf[js.Any])
  }
}
