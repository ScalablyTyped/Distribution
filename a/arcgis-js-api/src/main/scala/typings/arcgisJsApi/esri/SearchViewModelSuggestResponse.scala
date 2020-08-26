package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchViewModelSuggestResponse extends Object {
  /**
    * The index of the source from which suggestions are obtained. This value is `-1` when all sources are selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#SuggestResponse)
    */
  var activeSourceIndex: Double = js.native
  /**
    * An array of error objects returned from the suggest results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#SuggestResponse)
    */
  var errors: js.Array[Error] = js.native
  /**
    * The number of suggest results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#SuggestResponse)
    */
  var numResults: Double = js.native
  /**
    * An array of objects representing the results of suggest. See object specification table below for more information about the result object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#SuggestResponse)
    */
  var results: js.Array[SearchViewModelSuggestResponseResults] = js.native
  /**
    * The search expression used for the suggest.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#SuggestResponse)
    */
  var searchTerm: String = js.native
}

object SearchViewModelSuggestResponse {
  @scala.inline
  def apply(
    activeSourceIndex: Double,
    constructor: js.Function,
    errors: js.Array[Error],
    hasOwnProperty: PropertyKey => Boolean,
    numResults: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    results: js.Array[SearchViewModelSuggestResponseResults],
    searchTerm: String
  ): SearchViewModelSuggestResponse = {
    val __obj = js.Dynamic.literal(activeSourceIndex = activeSourceIndex.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), numResults = numResults.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), results = results.asInstanceOf[js.Any], searchTerm = searchTerm.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchViewModelSuggestResponse]
  }
  @scala.inline
  implicit class SearchViewModelSuggestResponseOps[Self <: SearchViewModelSuggestResponse] (val x: Self) extends AnyVal {
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
    def setActiveSourceIndex(value: Double): Self = this.set("activeSourceIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorsVarargs(value: Error*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[Error]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumResults(value: Double): Self = this.set("numResults", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultsVarargs(value: SearchViewModelSuggestResponseResults*): Self = this.set("results", js.Array(value :_*))
    @scala.inline
    def setResults(value: js.Array[SearchViewModelSuggestResponseResults]): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchTerm(value: String): Self = this.set("searchTerm", value.asInstanceOf[js.Any])
  }
  
}

