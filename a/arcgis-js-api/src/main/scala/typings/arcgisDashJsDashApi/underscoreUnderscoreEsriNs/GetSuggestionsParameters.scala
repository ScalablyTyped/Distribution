package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSuggestionsParameters extends Object {
  /**
    * Indicates the maximum number of suggestions to return for the widget's input.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#GetSuggestionsParameters)
    */
  var maxSuggestions: js.UndefOr[Double] = js.undefined
  /**
    * Indicates the index of the search source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#GetSuggestionsParameters)
    */
  var sourceIndex: js.UndefOr[Double] = js.undefined
  /**
    * Indicates the Spatial Refeference defined by the source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#GetSuggestionsParameters)
    */
  var spatialReference: js.UndefOr[SpatialReference] = js.undefined
  /**
    * Indicates search term used to find a suggestion.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#GetSuggestionsParameters)
    */
  var suggestTerm: js.UndefOr[String] = js.undefined
  /**
    * Indicates the view provided to the Search Widget using the source.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[MapView | SceneView] = js.undefined
}

object GetSuggestionsParameters {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    maxSuggestions: Int | Double = null,
    sourceIndex: Int | Double = null,
    spatialReference: SpatialReference = null,
    suggestTerm: String = null,
    view: MapView | SceneView = null
  ): GetSuggestionsParameters = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (maxSuggestions != null) __obj.updateDynamic("maxSuggestions")(maxSuggestions.asInstanceOf[js.Any])
    if (sourceIndex != null) __obj.updateDynamic("sourceIndex")(sourceIndex.asInstanceOf[js.Any])
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference)
    if (suggestTerm != null) __obj.updateDynamic("suggestTerm")(suggestTerm)
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSuggestionsParameters]
  }
}

