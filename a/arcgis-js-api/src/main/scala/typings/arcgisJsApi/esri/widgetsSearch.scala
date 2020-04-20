package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
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
import scala.scalajs.js.annotation._

@js.native
trait widgetsSearch
  extends Widget_
     with GoTo {
  /**
    * The current active menu of the Search widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#activeMenu)
    *
    * @default none
    */
  var activeMenu: none | suggestion | source | warning = js.native
  /**
    * The [source](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#sources) object currently selected. Can be either a [LayerSearchSource](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html) or a [LocatorSearchSource](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#activeSource)
    *
    * @default null
    */
  val activeSource: LayerSearchSource | LocatorSearchSource = js.native
  /**
    * The selected source's index. This value is `-1` when all sources are selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#activeSourceIndex)
    *
    * @default 0
    */
  var activeSourceIndex: Double = js.native
  /**
    * String value used as a hint for input text when searching on multiple sources. See the image below to view the location and style of this text in the context of the widget.  ![search-allPlaceholder](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/search-allplaceholder.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#allPlaceholder)
    *
    * @default "Find address or place"
    */
  var allPlaceholder: String = js.native
  /**
    * The combined collection of [defaultSources](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#defaultSources) and [sources](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#sources). The [defaultSources](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#defaultSources) displays first in the Search UI.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#allSources)
    */
  val allSources: Collection[LayerSearchSource | LocatorSearchSource] = js.native
  /**
    * Indicates whether to automatically select and zoom to the first geocoded result. If `false`, the [findAddressCandidates](https://developers.arcgis.com/rest/geocode/api-reference/geocoding-find-address-candidates.htm) operation will still geocode the input string, but the top result will not be selected. To work with the geocoded results, you can set up a [search-complete](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#event-search-complete) event handler and get the results through the event object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#autoSelect)
    *
    * @default true
    */
  var autoSelect: Boolean = js.native
  /**
    * A read-only property that is a [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of [LayerSearchSource](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html) and/or [LocatorSearchSource](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html). This property may contain [ArcGIS Portal](https://enterprise.arcgis.com/en/portal/) [locators](http://enterprise.arcgis.com/en/server/latest/publish-services/windows/geocode-services.htm) and any web map or web scene [configurable search sources](http://doc.arcgis.com/en/arcgis-online/create-maps/configure-feature-search.htm).  This property is used to populate the Search UI if the [sources](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#sources) property is not set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#defaultSources)
    */
  val defaultSources: Collection[LayerSearchSource | LocatorSearchSource] = js.native
  /**
    * When true, the widget is visually withdrawn and cannot be interacted with.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#disabled)
    *
    * @default false
    */
  var disabled: Boolean = js.native
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#iconClass)
    */
  var iconClass: String = js.native
  /**
    * Indicates whether or not to include [defaultSources](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#defaultSources) in the Search UI. This can be a boolean value or a function that returns an array of Search [sources](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#sources).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#includeDefaultSources)
    *
    * @default true
    */
  var includeDefaultSources: Boolean | js.Function = js.native
  /**
    * Enables location services within the widget.  ![locationEnabled](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/search-locationEnabled.png)
    * > The use of this property is only supported on secure origins. To use it, switch your application to a secure origin, such as HTTPS. Note that localhost is considered "potentially secure" and can be used for easy testing in browsers that supports [Window.isSecureContext](https://developer.mozilla.org/en-US/docs/Web/API/Window/isSecureContext#Browser_compatibility) (currently Chrome and Firefox).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#locationEnabled)
    *
    * @default true
    */
  var locationEnabled: Boolean = js.native
  /**
    * The maximum number of results returned by the widget if not specified by the source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#maxResults)
    *
    * @default 6
    */
  var maxResults: Double = js.native
  /**
    * The maximum number of suggestions returned by the widget if not specified by the source.  If working with the default [ArcGIS Online Geocoding service](https://developers.arcgis.com/rest/geocode/api-reference/overview-world-geocoding-service.htm), the default remains at `5`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#maxSuggestions)
    *
    * @default 6
    */
  var maxSuggestions: Double = js.native
  /**
    * The minimum number of characters needed for the search if not specified by the source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#minSuggestCharacters)
    *
    * @default 1
    */
  var minSuggestCharacters: Double = js.native
  /**
    * Indicates whether to display the [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) on feature click. The graphic can be clicked to display a [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#popupEnabled)
    *
    * @default true
    */
  var popupEnabled: Boolean = js.native
  /**
    * A customized [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) for the selected feature. Note that any [templates](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) defined on [allSources](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#allSources) take precedence over those defined directly on the template.
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
    * A graphic will be placed in the View's [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#graphics) for [layer views](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) that do not support the `highlight` method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#resultGraphic)
    */
  val resultGraphic: Graphic = js.native
  /**
    * Indicates if the [resultGraphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#resultGraphic) will display at the location of the selected feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#resultGraphicEnabled)
    *
    * @default true
    */
  var resultGraphicEnabled: Boolean = js.native
  /**
    * An array of objects, each containing a [SearchResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#SearchResult) from the search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#results)
    */
  val results: js.Array[_] = js.native
  /**
    * Indicates whether to display the option to search all sources. When `true`, the "All" option is displayed by default:  ![search-searchAllEnabled-true](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/search-enablesearchingall-true.png)  When `false`, no option to search all sources at once is available:  ![search-searchAllEnabled-false](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/search-enablesearchingall-false.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#searchAllEnabled)
    *
    * @default true
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
    * The Search widget may be used to search features in a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) or geocode locations with a [Locator](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html). The `sources` property defines the sources from which to search for the [view](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#view) specified by the Search widget instance. There are two types of sources:
    *   * [LayerSearchSource](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html)
    *   * [LocatorSearchSource](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html)
    *
    *
    * Any combination of these sources may be used together in the same instance of the Search widget.
    * > Feature layers created from client-side graphics are not supported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#sources)
    */
  var sources: Collection[SearchSource] = js.native
  /**
    * An array of results from the [suggest method](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#suggest).  This is available if working with a 10.3 or greater geocoding service that has [suggest capability loaded](https://developers.arcgis.com/rest/geocode/api-reference/geocoding-suggest.htm) or a 10.3 or greater feature layer that supports pagination, i.e. `supportsPagination = true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#suggestions)
    */
  val suggestions: js.Array[SuggestResult] = js.native
  /**
    * Enable suggestions for the widget.  This is only available if working with a 10.3 or greater geocoding service that has [suggest capability loaded](https://developers.arcgis.com/rest/geocode/api-reference/geocoding-suggest.htm) or a 10.3 or greater feature layer that supports pagination, i.e. `supportsPagination = true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#suggestionsEnabled)
    *
    * @default true
    */
  var suggestionsEnabled: Boolean = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#view)
    */
  var view: MapView | SceneView = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [SearchViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#viewModel)
    */
  var viewModel: SearchViewModel = js.native
  /**
    * Unfocuses the widget's text input.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#blur)
    *
    *
    */
  def blur(): Unit = js.native
  /**
    * Clears the current searchTerm, search results, suggest results, graphic, and graphics layer. It also hides any open menus.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#clear)
    *
    *
    */
  def clear(): Unit = js.native
  /**
    * Brings focus to the widget's text input.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#focus)
    *
    *
    */
  def focus(): Unit = js.native
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
    * Depending on the sources specified, search() queries the feature layer(s) and/or performs address matching using any specified [Locator(s)](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html) and returns any applicable results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#search)
    *
    * @param searchTerm This searchTerm can be a string, geometry, suggest candidate object, or an array of [longitude,latitude] coordinate pairs. If a geometry is supplied, then it will reverse geocode (locator) or findAddressCandidates with geometry instead of text.
    *
    */
  def search(): js.Promise[SearchResponse] = js.native
  def search(searchTerm: String): js.Promise[SearchResponse] = js.native
  def search(searchTerm: js.Array[js.Array[Double]]): js.Promise[SearchResponse] = js.native
  def search(searchTerm: Geometry_): js.Promise[SearchResponse] = js.native
  def search(searchTerm: SuggestResult): js.Promise[SearchResponse] = js.native
  /**
    * Performs a suggest() request on the active Locator. It also uses the current value of the widget or one that is passed in.  Suggestions are available if working with a 10.3 or greater geocoding service that has [suggest capability loaded](https://developers.arcgis.com/rest/geocode/api-reference/geocoding-suggest.htm) or a 10.3 or greater feature layer that supports pagination, i.e. `supportsPagination = true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#suggest)
    *
    * @param value The string value used to suggest() on an active Locator or feature layer. If nothing is passed in, takes the current value of the widget.
    *
    */
  def suggest(): js.Promise[SuggestResponse] = js.native
  def suggest(value: String): js.Promise[SuggestResponse] = js.native
}

@JSGlobal("__esri.widgetsSearch")
@js.native
object widgetsSearch extends TopLevel[widgetsSearchConstructor]

