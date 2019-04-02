package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSuggestionsParameters
  extends stdLib.Object {
  /**
    * Indicates the maximum number of suggestions to return for the widget's input.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#GetSuggestionsParameters)
    */
  var maxSuggestions: js.UndefOr[scala.Double] = js.undefined
  /**
    * Indicates the index of the search source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#GetSuggestionsParameters)
    */
  var sourceIndex: js.UndefOr[scala.Double] = js.undefined
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
  var suggestTerm: js.UndefOr[java.lang.String] = js.undefined
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
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    maxSuggestions: scala.Int | scala.Double = null,
    sourceIndex: scala.Int | scala.Double = null,
    spatialReference: SpatialReference = null,
    suggestTerm: java.lang.String = null,
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

