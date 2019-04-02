package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionsSearchProperties
  extends stdLib.Object {
  /**
    * Number index indicating the current selected source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var activeSourceIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * String value used as a hint for input text when searching on multiple sources.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var allPlaceholder: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates whether to automatically navigate to the selected result once selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var autoNavigate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates whether to automatically select and zoom to the first geocoded result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var autoSelect: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates the maximum number of search results to return.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /**
    * Indicates the maximum number of suggestions to return for the widget's input.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var maxSuggestions: js.UndefOr[scala.Double] = js.undefined
  /**
    * Indicates the minimum number of characters required before querying for a suggestion.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var minSuggestCharacters: js.UndefOr[scala.Double] = js.undefined
  /**
    * Indicates whether to display a [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) when a selected result is clicked.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var popupEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates whether to show the [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) when a result is selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var popupOpenOnSelect: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A customized PopupTemplate for the selected feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var popupTemplate: js.UndefOr[PopupTemplate] = js.undefined
  /**
    * Indicates whether to show a graphic on the map for the selected source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var resultGraphicEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates whether to display the option to search all sources.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var searchAllEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The value of the search box input text string.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var searchTerm: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies the sources to search in the [view](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#view).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var sources: js.UndefOr[Collection[LayerSearchSource | LocatorSearchSource]] = js.undefined
  /**
    * Indicates whether to display suggestions as the user enters input text in the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var suggestionsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The view of the widget.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[MapView | SceneView] = js.undefined
  /**
    * The Search widget's view model.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var viewModel: js.UndefOr[SearchViewModel] = js.undefined
}

object DirectionsSearchProperties {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    activeSourceIndex: scala.Int | scala.Double = null,
    allPlaceholder: java.lang.String = null,
    autoNavigate: js.UndefOr[scala.Boolean] = js.undefined,
    autoSelect: js.UndefOr[scala.Boolean] = js.undefined,
    maxResults: scala.Int | scala.Double = null,
    maxSuggestions: scala.Int | scala.Double = null,
    minSuggestCharacters: scala.Int | scala.Double = null,
    popupEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    popupOpenOnSelect: js.UndefOr[scala.Boolean] = js.undefined,
    popupTemplate: PopupTemplate = null,
    resultGraphicEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    searchAllEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    searchTerm: java.lang.String = null,
    sources: Collection[LayerSearchSource | LocatorSearchSource] = null,
    suggestionsEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    view: MapView | SceneView = null,
    viewModel: SearchViewModel = null
  ): DirectionsSearchProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (activeSourceIndex != null) __obj.updateDynamic("activeSourceIndex")(activeSourceIndex.asInstanceOf[js.Any])
    if (allPlaceholder != null) __obj.updateDynamic("allPlaceholder")(allPlaceholder)
    if (!js.isUndefined(autoNavigate)) __obj.updateDynamic("autoNavigate")(autoNavigate)
    if (!js.isUndefined(autoSelect)) __obj.updateDynamic("autoSelect")(autoSelect)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (maxSuggestions != null) __obj.updateDynamic("maxSuggestions")(maxSuggestions.asInstanceOf[js.Any])
    if (minSuggestCharacters != null) __obj.updateDynamic("minSuggestCharacters")(minSuggestCharacters.asInstanceOf[js.Any])
    if (!js.isUndefined(popupEnabled)) __obj.updateDynamic("popupEnabled")(popupEnabled)
    if (!js.isUndefined(popupOpenOnSelect)) __obj.updateDynamic("popupOpenOnSelect")(popupOpenOnSelect)
    if (popupTemplate != null) __obj.updateDynamic("popupTemplate")(popupTemplate)
    if (!js.isUndefined(resultGraphicEnabled)) __obj.updateDynamic("resultGraphicEnabled")(resultGraphicEnabled)
    if (!js.isUndefined(searchAllEnabled)) __obj.updateDynamic("searchAllEnabled")(searchAllEnabled)
    if (searchTerm != null) __obj.updateDynamic("searchTerm")(searchTerm)
    if (sources != null) __obj.updateDynamic("sources")(sources)
    if (!js.isUndefined(suggestionsEnabled)) __obj.updateDynamic("suggestionsEnabled")(suggestionsEnabled)
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (viewModel != null) __obj.updateDynamic("viewModel")(viewModel)
    __obj.asInstanceOf[DirectionsSearchProperties]
  }
}

