package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchSuggestCompleteEvent extends StObject {
  
  var activeSourceIndex: Double
  
  var errors: js.Array[Error]
  
  var numResults: Double
  
  var results: js.Array[SearchSuggestCompleteEventResults]
  
  var searchTerm: String
}
object SearchSuggestCompleteEvent {
  
  @scala.inline
  def apply(
    activeSourceIndex: Double,
    errors: js.Array[Error],
    numResults: Double,
    results: js.Array[SearchSuggestCompleteEventResults],
    searchTerm: String
  ): SearchSuggestCompleteEvent = {
    val __obj = js.Dynamic.literal(activeSourceIndex = activeSourceIndex.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], numResults = numResults.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], searchTerm = searchTerm.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSuggestCompleteEvent]
  }
  
  @scala.inline
  implicit class SearchSuggestCompleteEventMutableBuilder[Self <: SearchSuggestCompleteEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveSourceIndex(value: Double): Self = StObject.set(x, "activeSourceIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrors(value: js.Array[Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: Error*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setNumResults(value: Double): Self = StObject.set(x, "numResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResults(value: js.Array[SearchSuggestCompleteEventResults]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsVarargs(value: SearchSuggestCompleteEventResults*): Self = StObject.set(x, "results", js.Array(value :_*))
    
    @scala.inline
    def setSearchTerm(value: String): Self = StObject.set(x, "searchTerm", value.asInstanceOf[js.Any])
  }
}
