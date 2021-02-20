package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchViewModelSearchCompleteEventResults extends Object {
  
  var results: js.Array[SearchResult] = js.native
  
  var source: js.Array[_] = js.native
  
  var sourceIndex: Double = js.native
}
object SearchViewModelSearchCompleteEventResults {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    results: js.Array[SearchResult],
    source: js.Array[_],
    sourceIndex: Double
  ): SearchViewModelSearchCompleteEventResults = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), results = results.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchViewModelSearchCompleteEventResults]
  }
  
  @scala.inline
  implicit class SearchViewModelSearchCompleteEventResultsMutableBuilder[Self <: SearchViewModelSearchCompleteEventResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResults(value: js.Array[SearchResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsVarargs(value: SearchResult*): Self = StObject.set(x, "results", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: js.Array[_]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIndex(value: Double): Self = StObject.set(x, "sourceIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceVarargs(value: js.Any*): Self = StObject.set(x, "source", js.Array(value :_*))
  }
}
