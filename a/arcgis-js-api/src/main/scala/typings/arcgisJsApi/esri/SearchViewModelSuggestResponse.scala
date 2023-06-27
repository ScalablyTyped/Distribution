package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchViewModelSuggestResponse extends StObject {
  
  /**
  		 * The index of the source from which suggestions are obtained.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#SuggestResponse)
  		 */
  var activeSourceIndex: Double
  
  /**
  		 * An array of error objects returned from the suggest results.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#SuggestResponse)
  		 */
  var errors: js.Array[Error]
  
  /**
  		 * The number of suggest results.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#SuggestResponse)
  		 */
  var numResults: Double
  
  /**
  		 * An array of objects representing the results of suggest.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#SuggestResponse)
  		 */
  var results: js.Array[SearchViewModelSuggestResponseResults]
  
  /**
  		 * The search expression used for the suggest.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#SuggestResponse)
  		 */
  var searchTerm: String
}
object SearchViewModelSuggestResponse {
  
  inline def apply(
    activeSourceIndex: Double,
    errors: js.Array[Error],
    numResults: Double,
    results: js.Array[SearchViewModelSuggestResponseResults],
    searchTerm: String
  ): SearchViewModelSuggestResponse = {
    val __obj = js.Dynamic.literal(activeSourceIndex = activeSourceIndex.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], numResults = numResults.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], searchTerm = searchTerm.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchViewModelSuggestResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchViewModelSuggestResponse] (val x: Self) extends AnyVal {
    
    inline def setActiveSourceIndex(value: Double): Self = StObject.set(x, "activeSourceIndex", value.asInstanceOf[js.Any])
    
    inline def setErrors(value: js.Array[Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: Error*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setNumResults(value: Double): Self = StObject.set(x, "numResults", value.asInstanceOf[js.Any])
    
    inline def setResults(value: js.Array[SearchViewModelSuggestResponseResults]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: SearchViewModelSuggestResponseResults*): Self = StObject.set(x, "results", js.Array(value*))
    
    inline def setSearchTerm(value: String): Self = StObject.set(x, "searchTerm", value.asInstanceOf[js.Any])
  }
}
