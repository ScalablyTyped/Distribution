package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`search-clear`
import typings.arcgisJsApi.arcgisJsApiStrings.`search-complete`
import typings.arcgisJsApi.arcgisJsApiStrings.`search-start`
import typings.arcgisJsApi.arcgisJsApiStrings.`select-result`
import typings.arcgisJsApi.arcgisJsApiStrings.`suggest-complete`
import typings.arcgisJsApi.arcgisJsApiStrings.`suggest-start`
import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.loading
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import typings.arcgisJsApi.arcgisJsApiStrings.searching
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchViewModel
  extends StObject
     with Accessor
     with Evented
     with GoTo {
  
  /**
    * The [source](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#sources) object currently selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#activeSource)
    */
  val activeSource: LayerSearchSource | LocatorSearchSource = js.native
  
  /**
    * The selected source's index.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#activeSourceIndex)
    */
  var activeSourceIndex: Double = js.native
  
  /**
    * String value used as a hint for input text when searching on multiple sources.
    *
    * @default "Find address or place"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#allPlaceholder)
    */
  var allPlaceholder: String = js.native
  
  /**
    * The combined collection of [defaultSources](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#defaultSources) and [sources](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#sources).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#allSources)
    */
  val allSources: Collection[LayerSearchSource | LocatorSearchSource] = js.native
  
  /**
    * Indicates whether to automatically select and zoom to the first geocoded result.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#autoSelect)
    */
  var autoSelect: Boolean = js.native
  
  /**
    * Clears the current value, search results, suggest results, graphic, and graphics layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#clear)
    */
  def clear(): scala.Unit = js.native
  
  /**
    * A read-only property that is a [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of [LayerSearchSource](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html) and/or [LocatorSearchSource](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#defaultSources)
    */
  val defaultSources: Collection[LayerSearchSource | LocatorSearchSource] = js.native
  
  /**
    * The default [symbol(s)](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol.html) for the search result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#defaultSymbols)
    */
  var defaultSymbols: SearchViewModelDefaultSymbols = js.native
  
  /**
    * Indicates whether or not to include [defaultSources](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#defaultSources) in the Search UI.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#includeDefaultSources)
    */
  var includeDefaultSources: Boolean | js.Function = js.native
  
  /**
    * Indicates whether location services are enabled within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#locationEnabled)
    */
  var locationEnabled: Boolean = js.native
  
  /**
    * The maximum character length of the search text.
    *
    * @default 128
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#maxInputLength)
    */
  var maxInputLength: Double = js.native
  
  /**
    * The maximum number of results returned by the widget if not specified by the source.
    *
    * @default 6
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#maxResults)
    */
  var maxResults: Double = js.native
  
  /**
    * The maximum number of suggestions returned by the widget if not specified by the source.
    *
    * @default 6
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#maxSuggestions)
    */
  var maxSuggestions: Double = js.native
  
  /**
    * The minimum number of characters needed for the search if not specified by the source.
    *
    * @default 1
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#minSuggestCharacters)
    */
  var minSuggestCharacters: Double = js.native
  
  @JSName("on")
  def on_searchclear(name: `search-clear`, eventHandler: SearchViewModelSearchClearEventHandler): IHandle = js.native
  @JSName("on")
  def on_searchcomplete(name: `search-complete`, eventHandler: SearchViewModelSearchCompleteEventHandler): IHandle = js.native
  @JSName("on")
  def on_searchstart(name: `search-start`, eventHandler: SearchViewModelSearchStartEventHandler): IHandle = js.native
  @JSName("on")
  def on_selectresult(name: `select-result`, eventHandler: SearchViewModelSelectResultEventHandler): IHandle = js.native
  @JSName("on")
  def on_suggestcomplete(name: `suggest-complete`, eventHandler: SearchViewModelSuggestCompleteEventHandler): IHandle = js.native
  @JSName("on")
  def on_suggeststart(name: `suggest-start`, eventHandler: SearchViewModelSuggestStartEventHandler): IHandle = js.native
  
  /**
    * The placeholder used by the [activeSource](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#activeSource).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#placeholder)
    */
  val placeholder: String = js.native
  
  /**
    * Indicates whether to display the [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) on feature click.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#popupEnabled)
    */
  var popupEnabled: Boolean = js.native
  
  /**
    * A customized [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) for the selected feature.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#popupTemplate)
    */
  var popupTemplate: PopupTemplate = js.native
  
  /**
    * It is possible to search a specified portal instance's [locator services](https://enterprise.arcgis.com/en/portal/latest/administer/windows/configure-portal-to-geocode-addresses.htm) Use this property to set this [ArcGIS Portal](https://enterprise.arcgis.com/en/portal/) instance to search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#portal)
    */
  var portal: Portal = js.native
  
  /**
    * The graphic used to highlight the resulting feature or location.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#resultGraphic)
    */
  val resultGraphic: Graphic = js.native
  
  /**
    * Indicates if the [resultGraphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#resultGraphic) will display at the location of the selected feature.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#resultGraphicEnabled)
    */
  var resultGraphicEnabled: Boolean = js.native
  
  /**
    * An array of current results from the search.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#results)
    */
  val results: js.Array[Any] = js.native
  
  /**
    * Depending on the sources specified, `search()` queries the feature layer(s) and/or performs address matching using any specified [Locator(s)](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-locator.html) and returns the applicable results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#search)
    */
  def search(): js.Promise[SearchViewModelSearchResponse] = js.native
  def search(searchTerm: String): js.Promise[SearchViewModelSearchResponse] = js.native
  def search(searchTerm: js.Array[js.Array[Double]]): js.Promise[SearchViewModelSearchResponse] = js.native
  def search(searchTerm: Geometry_): js.Promise[SearchViewModelSearchResponse] = js.native
  def search(searchTerm: SearchViewModelSuggestResult): js.Promise[SearchViewModelSearchResponse] = js.native
  
  /**
    * Indicates whether to display the option to search all sources.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#searchAllEnabled)
    */
  var searchAllEnabled: Boolean = js.native
  
  /**
    * Returns search results near your current location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#searchNearby)
    */
  def searchNearby(): js.Promise[SearchViewModelSearchResponse] = js.native
  
  /**
    * The value of the search box input text string.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#searchTerm)
    */
  var searchTerm: String = js.native
  
  /**
    * The result selected from a search.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#selectedResult)
    */
  val selectedResult: Any = js.native
  
  /**
    * The selected SuggestResult.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#selectedSuggestion)
    */
  val selectedSuggestion: Geometry_ | SearchViewModelSuggestResult = js.native
  
  /**
    * The Search widget may be used to search features in a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) or [table](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-SearchTable.html), or geocode locations with a [locator](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-locator.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#sources)
    */
  var sources: Collection[LayerSearchSource | LocatorSearchSource] = js.native
  
  /**
    * The current state of the widget.
    *
    * @default ready
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#state)
    */
  val state: ready | disabled | searching | loading = js.native
  
  /**
    * Performs a suggest() request on the active Locator.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#suggest)
    */
  def suggest(): js.Promise[SearchViewModelSuggestResponse] = js.native
  def suggest(value: String): js.Promise[SearchViewModelSuggestResponse] = js.native
  
  /**
    * The millisecond delay after keyup and before making a [suggest](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#suggest) network request.
    *
    * @default 350
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#suggestionDelay)
    */
  var suggestionDelay: Double = js.native
  
  /**
    * An array of results from the [suggest method](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#suggest).
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#suggestions)
    */
  val suggestions: js.Array[SearchViewModelSuggestResult] = js.native
  
  /**
    * Enable suggestions for the widget.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#suggestionsEnabled)
    */
  var suggestionsEnabled: Boolean = js.native
  
  /**
    * Indicates whether the `View` or `Portal` is loading resources prior to use.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#updating)
    */
  val updating: Boolean = js.native
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#view)
    */
  var view: MapView | SceneView = js.native
}
