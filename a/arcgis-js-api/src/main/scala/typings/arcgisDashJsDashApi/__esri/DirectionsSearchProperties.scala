package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionsSearchProperties extends Object {
  /**
    * Number index indicating the current selected source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var activeSourceIndex: js.UndefOr[Double] = js.undefined
  /**
    * String value used as a hint for input text when searching on multiple sources.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var allPlaceholder: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether to automatically navigate to the selected result once selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var autoNavigate: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether to automatically select and zoom to the first geocoded result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var autoSelect: js.UndefOr[Boolean] = js.undefined
  /**
    * Define the type of location, either `"street"` or `"rooftop"`. The default value will be `"street"` for any locator source that does not define a locationType.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var locationType: js.UndefOr[String] = js.undefined
  /**
    * Indicates the maximum number of search results to return.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  /**
    * Indicates the maximum number of suggestions to return for the widget's input.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var maxSuggestions: js.UndefOr[Double] = js.undefined
  /**
    * Indicates the minimum number of characters required before querying for a suggestion.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var minSuggestCharacters: js.UndefOr[Double] = js.undefined
  /**
    * Indicates whether to display a [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) when a selected result is clicked.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var popupEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether to show the [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) when a result is selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var popupOpenOnSelect: js.UndefOr[Boolean] = js.undefined
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
  var resultGraphicEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether to display the option to search all sources.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var searchAllEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The value of the search box input text string.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var searchTerm: js.UndefOr[String] = js.undefined
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
  var suggestionsEnabled: js.UndefOr[Boolean] = js.undefined
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
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    activeSourceIndex: Int | Double = null,
    allPlaceholder: String = null,
    autoNavigate: js.UndefOr[Boolean] = js.undefined,
    autoSelect: js.UndefOr[Boolean] = js.undefined,
    locationType: String = null,
    maxResults: Int | Double = null,
    maxSuggestions: Int | Double = null,
    minSuggestCharacters: Int | Double = null,
    popupEnabled: js.UndefOr[Boolean] = js.undefined,
    popupOpenOnSelect: js.UndefOr[Boolean] = js.undefined,
    popupTemplate: PopupTemplate = null,
    resultGraphicEnabled: js.UndefOr[Boolean] = js.undefined,
    searchAllEnabled: js.UndefOr[Boolean] = js.undefined,
    searchTerm: String = null,
    sources: Collection[LayerSearchSource | LocatorSearchSource] = null,
    suggestionsEnabled: js.UndefOr[Boolean] = js.undefined,
    view: MapView | SceneView = null,
    viewModel: SearchViewModel = null
  ): DirectionsSearchProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (activeSourceIndex != null) __obj.updateDynamic("activeSourceIndex")(activeSourceIndex.asInstanceOf[js.Any])
    if (allPlaceholder != null) __obj.updateDynamic("allPlaceholder")(allPlaceholder.asInstanceOf[js.Any])
    if (!js.isUndefined(autoNavigate)) __obj.updateDynamic("autoNavigate")(autoNavigate.asInstanceOf[js.Any])
    if (!js.isUndefined(autoSelect)) __obj.updateDynamic("autoSelect")(autoSelect.asInstanceOf[js.Any])
    if (locationType != null) __obj.updateDynamic("locationType")(locationType.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (maxSuggestions != null) __obj.updateDynamic("maxSuggestions")(maxSuggestions.asInstanceOf[js.Any])
    if (minSuggestCharacters != null) __obj.updateDynamic("minSuggestCharacters")(minSuggestCharacters.asInstanceOf[js.Any])
    if (!js.isUndefined(popupEnabled)) __obj.updateDynamic("popupEnabled")(popupEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(popupOpenOnSelect)) __obj.updateDynamic("popupOpenOnSelect")(popupOpenOnSelect.asInstanceOf[js.Any])
    if (popupTemplate != null) __obj.updateDynamic("popupTemplate")(popupTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(resultGraphicEnabled)) __obj.updateDynamic("resultGraphicEnabled")(resultGraphicEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(searchAllEnabled)) __obj.updateDynamic("searchAllEnabled")(searchAllEnabled.asInstanceOf[js.Any])
    if (searchTerm != null) __obj.updateDynamic("searchTerm")(searchTerm.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources.asInstanceOf[js.Any])
    if (!js.isUndefined(suggestionsEnabled)) __obj.updateDynamic("suggestionsEnabled")(suggestionsEnabled.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (viewModel != null) __obj.updateDynamic("viewModel")(viewModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsSearchProperties]
  }
}

