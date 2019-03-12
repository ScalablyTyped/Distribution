package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchViewModelSuggestResponse
  extends stdLib.Object {
  /**
    * The index of the source from which suggestions are obtained. This value is `-1` when all sources are selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#SuggestResponse)
    */
  var activeSourceIndex: scala.Double
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
  var numResults: scala.Double
  /**
    * An array of objects representing the results of suggest. See object specification table below for more information about the result object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#SuggestResponse)
    */
  var results: js.Array[SearchViewModelSuggestResponseResults]
  /**
    * The search expression used for the suggest.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#SuggestResponse)
    */
  var searchTerm: java.lang.String
}

object SearchViewModelSuggestResponse {
  @scala.inline
  def apply(
    activeSourceIndex: scala.Double,
    constructor: js.Function,
    errors: js.Array[Error],
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    numResults: scala.Double,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    results: js.Array[SearchViewModelSuggestResponseResults],
    searchTerm: java.lang.String
  ): SearchViewModelSuggestResponse = {
    val __obj = js.Dynamic.literal(activeSourceIndex = activeSourceIndex, constructor = constructor, errors = errors, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), numResults = numResults, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), results = results, searchTerm = searchTerm)
  
    __obj.asInstanceOf[SearchViewModelSuggestResponse]
  }
}

