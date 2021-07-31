package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchViewModelSuggestCompleteEventResults
  extends StObject
     with Object {
  
  var results: js.Array[SearchViewModelSuggestResult]
  
  var source: js.Any
  
  var sourceIndex: Double
}
object SearchViewModelSuggestCompleteEventResults {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    results: js.Array[SearchViewModelSuggestResult],
    source: js.Any,
    sourceIndex: Double
  ): SearchViewModelSuggestCompleteEventResults = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), results = results.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchViewModelSuggestCompleteEventResults]
  }
  
  @scala.inline
  implicit class SearchViewModelSuggestCompleteEventResultsMutableBuilder[Self <: SearchViewModelSuggestCompleteEventResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResults(value: js.Array[SearchViewModelSuggestResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsVarargs(value: SearchViewModelSuggestResult*): Self = StObject.set(x, "results", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIndex(value: Double): Self = StObject.set(x, "sourceIndex", value.asInstanceOf[js.Any])
  }
}
