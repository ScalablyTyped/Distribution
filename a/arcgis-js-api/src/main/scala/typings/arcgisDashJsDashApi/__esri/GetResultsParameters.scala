package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResultsParameters extends Object {
  /**
    * The key field used to find the result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#GetResultsParameters)
    */
  var exactMatch: js.UndefOr[Boolean] = js.undefined
  /**
    * The location value used by the Search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#GetResultsParameters)
    */
  var location: js.UndefOr[Point] = js.undefined
  /**
    * Indicates the maximum number of search results to return.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#GetResultsParameters)
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  /**
    * Indicates the index of the search source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#GetResultsParameters)
    */
  var sourceIndex: js.UndefOr[Double] = js.undefined
  /**
    * Indicates the Spatial Refeference defined by the source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#GetResultsParameters)
    */
  var spatialReference: js.UndefOr[SpatialReference] = js.undefined
  /**
    * Indicates the Suggest Result that triggered the search for a result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#GetResultsParameters)
    */
  var suggestResult: js.UndefOr[SuggestResult] = js.undefined
  /**
    * Indicates the view provided to the Search Widget using the source.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[MapView | SceneView] = js.undefined
}

object GetResultsParameters {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    exactMatch: js.UndefOr[Boolean] = js.undefined,
    location: Point = null,
    maxResults: Int | Double = null,
    sourceIndex: Int | Double = null,
    spatialReference: SpatialReference = null,
    suggestResult: SuggestResult = null,
    view: MapView | SceneView = null
  ): GetResultsParameters = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (!js.isUndefined(exactMatch)) __obj.updateDynamic("exactMatch")(exactMatch)
    if (location != null) __obj.updateDynamic("location")(location)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (sourceIndex != null) __obj.updateDynamic("sourceIndex")(sourceIndex.asInstanceOf[js.Any])
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference)
    if (suggestResult != null) __obj.updateDynamic("suggestResult")(suggestResult)
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResultsParameters]
  }
}

