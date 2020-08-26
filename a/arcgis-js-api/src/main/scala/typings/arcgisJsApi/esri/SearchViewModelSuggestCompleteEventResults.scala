package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchViewModelSuggestCompleteEventResults extends Object {
  var results: js.Array[SearchViewModelSuggestResult] = js.native
  var source: js.Any = js.native
  var sourceIndex: Double = js.native
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
  implicit class SearchViewModelSuggestCompleteEventResultsOps[Self <: SearchViewModelSuggestCompleteEventResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResultsVarargs(value: SearchViewModelSuggestResult*): Self = this.set("results", js.Array(value :_*))
    @scala.inline
    def setResults(value: js.Array[SearchViewModelSuggestResult]): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: js.Any): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceIndex(value: Double): Self = this.set("sourceIndex", value.asInstanceOf[js.Any])
  }
  
}

