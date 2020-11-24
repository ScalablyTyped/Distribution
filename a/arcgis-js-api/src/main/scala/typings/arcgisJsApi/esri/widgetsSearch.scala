package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`search-blur`
import typings.arcgisJsApi.arcgisJsApiStrings.`search-clear`
import typings.arcgisJsApi.arcgisJsApiStrings.`search-complete`
import typings.arcgisJsApi.arcgisJsApiStrings.`search-focus`
import typings.arcgisJsApi.arcgisJsApiStrings.`search-start`
import typings.arcgisJsApi.arcgisJsApiStrings.`select-result`
import typings.arcgisJsApi.arcgisJsApiStrings.`suggest-complete`
import typings.arcgisJsApi.arcgisJsApiStrings.`suggest-start`
import typings.arcgisJsApi.arcgisJsApiStrings.none
import typings.arcgisJsApi.arcgisJsApiStrings.source
import typings.arcgisJsApi.arcgisJsApiStrings.suggestion
import typings.arcgisJsApi.arcgisJsApiStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait widgetsSearch
  extends Widget_
     with GoTo {
  
  /**
    * The current active menu of the Search widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#activeMenu)
    */
  var activeMenu: none | suggestion | source | warning = js.native
  
  /**
    * The [source](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#sources) object currently selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#activeSource)
    */
  val activeSource: LayerSearchSource | LocatorSearchSource = js.native
  
  /**
    * The selected source's index.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#activeSourceIndex)
    */
  var activeSourceIndex: Double = js.native
  
  /**
    * String value used as a hint for input text when searching on multiple sources.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#allPlaceholder)
    */
  var allPlaceholder: String = js.native
  
  /**
    * The combined collection of [defaultSources](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#defaultSources) and [sources](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#sources).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#allSources)
    */
  val allSources: Collection[LayerSearchSource | LocatorSearchSource] = js.native
  
  /**
    * Indicates whether to automatically select and zoom to the first geocoded result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#autoSelect)
    */
  var autoSelect: Boolean = js.native
  
  /**
    * Unfocuses the widget's text input.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#blur)
    */
  def blur(): Unit = js.native
  
  /**
    * Clears the current searchTerm, search results, suggest results, graphic, and graphics layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#clear)
    */
  def clear(): Unit = js.native
  
  /**
    * A read-only property that is a [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of [LayerSearchSource](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html) and/or [LocatorSearchSource](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#defaultSources)
    */
  val defaultSources: Collection[LayerSearchSource | LocatorSearchSource] = js.native
  
  /**
    * When true, the widget is visually withdrawn and cannot be interacted with.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#disabled)
    */
  var disabled: Boolean = js.native
  
  /**
    * Brings focus to the widget's text input.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#focus)
    */
  def focus(): Unit = js.native
  
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#iconClass)
    */
  var iconClass: String = js.native
  
  /**
    * Indicates whether or not to include [defaultSources](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#defaultSources) in the Search UI.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#includeDefaultSources)
    */
  var includeDefaultSources: Boolean | js.Function = js.native
  
  /**
    * Enables location services within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#locationEnabled)
    */
  var locationEnabled: Boolean = js.native
  
  /**
    * The maximum number of results returned by the widget if not specified by the source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#maxResults)
    */
  var maxResults: Double = js.native
  
  /**
    * The maximum number of suggestions returned by the widget if not specified by the source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#maxSuggestions)
    */
  var maxSuggestions: Double = js.native
  
  /**
    * The minimum number of characters needed for the search if not specified by the source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#minSuggestCharacters)
    */
  var minSuggestCharacters: Double = js.native
  
  @JSName("on")
  def on_searchblur(name: `search-blur`, eventHandler: SearchSearchBlurEventHandler): IHandle = js.native
  @JSName("on")
  def on_searchclear(name: `search-clear`, eventHandler: SearchSearchClearEventHandler): IHandle = js.native
  @JSName("on")
  def on_searchcomplete(name: `search-complete`, eventHandler: SearchSearchCompleteEventHandler): IHandle = js.native
  @JSName("on")
  def on_searchfocus(name: `search-focus`, eventHandler: SearchSearchFocusEventHandler): IHandle = js.native
  @JSName("on")
  def on_searchstart(name: `search-start`, eventHandler: SearchSearchStartEventHandler): IHandle = js.native
  @JSName("on")
  def on_selectresult(name: `select-result`, eventHandler: SearchSelectResultEventHandler): IHandle = js.native
  @JSName("on")
  def on_suggestcomplete(name: `suggest-complete`, eventHandler: SearchSuggestCompleteEventHandler): IHandle = js.native
  @JSName("on")
  def on_suggeststart(name: `suggest-start`, eventHandler: SearchSuggestStartEventHandler): IHandle = js.native
  
  /**
    * Indicates whether to display the [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) on feature click.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#popupEnabled)
    */
  var popupEnabled: Boolean = js.native
  
  /**
    * A customized [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) for the selected feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#popupTemplate)
    */
  var popupTemplate: PopupTemplate = js.native
  
  /**
    * It is possible to search a specified portal instance's [locator services](http://enterprise.arcgis.com/en/portal/latest/administer/windows/configure-portal-to-geocode-addresses.htm) Use this property to set this [ArcGIS Portal](https://enterprise.arcgis.com/en/portal/) instance to search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#portal)
    */
  var portal: Portal = js.native
  
  /**
    * The graphic used to highlight the resulting feature or location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#resultGraphic)
    */
  val resultGraphic: Graphic = js.native
  
  /**
    * Indicates if the [resultGraphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#resultGraphic) will display at the location of the selected feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#resultGraphicEnabled)
    */
  var resultGraphicEnabled: Boolean = js.native
  
  /**
    * An array of objects, each containing a [SearchResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#SearchResult) from the search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#results)
    */
  val results: js.Array[_] = js.native
  
  /**
    * Depending on the sources specified, search() queries the feature layer(s) and/or performs address matching using any specified [Locator(s)](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html) and returns any applicable results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#search)
    */
  def search(): js.Promise[SearchResponse] = js.native
  def search(searchTerm: String): js.Promise[SearchResponse] = js.native
  def search(searchTerm: js.Array[js.Array[Double]]): js.Promise[SearchResponse] = js.native
  def search(searchTerm: Geometry_): js.Promise[SearchResponse] = js.native
  def search(searchTerm: SuggestResult): js.Promise[SearchResponse] = js.native
  
  /**
    * Indicates whether to display the option to search all sources.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#searchAllEnabled)
    */
  var searchAllEnabled: Boolean = js.native
  
  /**
    * The value of the search box input text string.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#searchTerm)
    */
  var searchTerm: String = js.native
  
  /**
    * The result selected from a search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#selectedResult)
    */
  val selectedResult: SearchResult = js.native
  
  /**
    * The Search widget may be used to search features in a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) or geocode locations with a [Locator](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#sources)
    */
  var sources: Collection[SearchSource] = js.native
  
  /**
    * Performs a suggest() request on the active Locator.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#suggest)
    */
  def suggest(): js.Promise[SuggestResponse] = js.native
  def suggest(value: String): js.Promise[SuggestResponse] = js.native
  
  /**
    * An array of results from the [suggest method](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#suggest).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#suggestions)
    */
  val suggestions: js.Array[SuggestResult] = js.native
  
  /**
    * Enable suggestions for the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#suggestionsEnabled)
    */
  var suggestionsEnabled: Boolean = js.native
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#view)
    */
  var view: MapView | SceneView = js.native
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#viewModel)
    */
  var viewModel: SearchViewModel = js.native
}
