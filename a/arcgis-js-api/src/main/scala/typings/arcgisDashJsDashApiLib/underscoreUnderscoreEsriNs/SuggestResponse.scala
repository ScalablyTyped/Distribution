package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestResponse
  extends stdLib.Object {
  /**
    * The index of the source from which suggestions are obtained. This value is `-1` when all sources are selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#SuggestResponse)
    */
  var activeSourceIndex: scala.Double
  /**
    * An array of error objects returned from the suggest results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#SuggestResponse)
    */
  var errors: js.Array[Error]
  /**
    * The number of suggest results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#SuggestResponse)
    */
  var numResults: scala.Double
  /**
    * An array of objects representing the results of suggest. See object specification table below for more information about the result object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#SuggestResponse)
    */
  var results: js.Array[SuggestResponseResults]
  /**
    * The search expression used for the suggest.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#SuggestResponse)
    */
  var searchTerm: java.lang.String
}

object SuggestResponse {
  @scala.inline
  def apply(
    activeSourceIndex: scala.Double,
    constructor: js.Function,
    errors: js.Array[Error],
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    numResults: scala.Double,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    results: js.Array[SuggestResponseResults],
    searchTerm: java.lang.String
  ): SuggestResponse = {
    val __obj = js.Dynamic.literal(activeSourceIndex = activeSourceIndex, constructor = constructor, errors = errors, hasOwnProperty = hasOwnProperty, numResults = numResults, propertyIsEnumerable = propertyIsEnumerable, results = results, searchTerm = searchTerm)
  
    __obj.asInstanceOf[SuggestResponse]
  }
}

