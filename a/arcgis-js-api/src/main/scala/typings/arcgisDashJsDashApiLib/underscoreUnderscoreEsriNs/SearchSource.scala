package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchSource extends JSONSupport {
  /**
    * Indicates whether to automatically navigate to the selected result once selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#autoNavigate)
    *
    * @default true
    */
  var autoNavigate: scala.Boolean
  /**
    * This property replaces the now deprecated `searchQueryParams`, `suggestQueryParams`, and `searchExtent` properties. Please see the object specification table below for details.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#filter)
    */
  var filter: SearchSourceFilter
  /**
    * Indicates the maximum number of search results to return.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#maxResults)
    *
    * @default 6
    */
  var maxResults: scala.Double
  /**
    * Indicates the maximum number of suggestions to return for the widget's input.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#maxSuggestions)
    *
    * @default 6
    */
  var maxSuggestions: scala.Double
  /**
    * Indicates the minimum number of characters required before querying for a suggestion.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#minSuggestCharacters)
    *
    * @default 1
    */
  var minSuggestCharacters: scala.Double
  /**
    * Specifies the fields returned with the search results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#outFields)
    */
  var outFields: js.Array[java.lang.String]
  /**
    * Used as a hint for the source input text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#placeholder)
    */
  var placeholder: java.lang.String
  /**
    * Indicates whether to display a [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) when a selected result is clicked.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#popupEnabled)
    */
  var popupEnabled: scala.Boolean
  /**
    * The popup template used to display search results. If no popup is needed, set the source's popupTemplate to `null`.
    * > This property should be set in instances where there is no existing [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) configured. For example, [feature sources](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-FeatureLayerSearchSource.html) will default to any existing [popupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#popupTemplate) configured on the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#popupTemplate)
    */
  var popupTemplate: PopupTemplate
  /**
    * Specify this to prefix the user's input of the search text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#prefix)
    */
  var prefix: java.lang.String
  /**
    * Indicates whether to show a graphic on the map for the selected source using the [resultSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#resultSymbol).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#resultGraphicEnabled)
    */
  var resultGraphicEnabled: scala.Boolean
  /**
    * The symbol used to display the result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#resultSymbol)
    */
  var resultSymbol: Symbol
  /**
    * Specify this to add a suffix to the user's input for the search value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#suffix)
    */
  var suffix: java.lang.String
  /**
    * Indicates whether to display suggestions as the user enters input text in the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#suggestionsEnabled)
    *
    * @default true
    */
  var suggestionsEnabled: scala.Boolean
  /**
    * Indicates whether to constrain the search results to the view's extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#withinViewEnabled)
    *
    * @default false
    */
  var withinViewEnabled: scala.Boolean
  /**
    * The set zoom scale for the resulting search result. This scale is automatically honored.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#zoomScale)
    */
  var zoomScale: scala.Double
}

object SearchSource {
  @scala.inline
  def apply(
    autoNavigate: scala.Boolean,
    filter: SearchSourceFilter,
    maxResults: scala.Double,
    maxSuggestions: scala.Double,
    minSuggestCharacters: scala.Double,
    outFields: js.Array[java.lang.String],
    placeholder: java.lang.String,
    popupEnabled: scala.Boolean,
    popupTemplate: PopupTemplate,
    prefix: java.lang.String,
    resultGraphicEnabled: scala.Boolean,
    resultSymbol: Symbol,
    suffix: java.lang.String,
    suggestionsEnabled: scala.Boolean,
    toJSON: js.Function0[js.Any],
    withinViewEnabled: scala.Boolean,
    zoomScale: scala.Double
  ): SearchSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autoNavigate")(autoNavigate)
    __obj.updateDynamic("filter")(filter)
    __obj.updateDynamic("maxResults")(maxResults)
    __obj.updateDynamic("maxSuggestions")(maxSuggestions)
    __obj.updateDynamic("minSuggestCharacters")(minSuggestCharacters)
    __obj.updateDynamic("outFields")(outFields)
    __obj.updateDynamic("placeholder")(placeholder)
    __obj.updateDynamic("popupEnabled")(popupEnabled)
    __obj.updateDynamic("popupTemplate")(popupTemplate)
    __obj.updateDynamic("prefix")(prefix)
    __obj.updateDynamic("resultGraphicEnabled")(resultGraphicEnabled)
    __obj.updateDynamic("resultSymbol")(resultSymbol)
    __obj.updateDynamic("suffix")(suffix)
    __obj.updateDynamic("suggestionsEnabled")(suggestionsEnabled)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.updateDynamic("withinViewEnabled")(withinViewEnabled)
    __obj.updateDynamic("zoomScale")(zoomScale)
    __obj.asInstanceOf[SearchSource]
  }
}

