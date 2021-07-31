package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuggestResponseResults
  extends StObject
     with Object {
  
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
  var source: js.Any
  
  /**
    * The index of the currently selected source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#SuggestResponse)
    */
  var sourceIndex: Double
}
object SuggestResponseResults {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    results: js.Array[SuggestResult],
    source: js.Any,
    sourceIndex: Double
  ): SuggestResponseResults = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), results = results.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestResponseResults]
  }
  
  @scala.inline
  implicit class SuggestResponseResultsMutableBuilder[Self <: SuggestResponseResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResults(value: js.Array[SuggestResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsVarargs(value: SuggestResult*): Self = StObject.set(x, "results", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIndex(value: Double): Self = StObject.set(x, "sourceIndex", value.asInstanceOf[js.Any])
  }
}
