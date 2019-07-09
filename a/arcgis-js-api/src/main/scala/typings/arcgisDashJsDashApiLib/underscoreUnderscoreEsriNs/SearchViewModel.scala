package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchViewModel
  extends Accessor
     with Evented
     with GoTo {
  /**
    * The [source](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#sources) object currently selected. Can be either a [feature layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) or a [locator task](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#activeSource)
    */
  val activeSource: LayerSearchSource | LocatorSearchSource = js.native
  /**
    * The selected source's index. This value is `-1` when all sources are selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#activeSourceIndex)
    *
    * @default 0
    */
  var activeSourceIndex: scala.Double = js.native
  /**
    * String value used as a hint for input text when searching on multiple sources. See the image below to view the location and style of this text in the context of the widget.  ![search-allPlaceholder](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/search-allplaceholder.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#allPlaceholder)
    *
    * @default "Find address or place"
    */
  var allPlaceholder: java.lang.String = js.native
  /**
    * The combined collection of [defaultSources](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#defaultSources) and [sources](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#sources). The [defaultSources](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#defaultSources) displays first in the Search UI.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#allSources)
    */
  val allSources: Collection[LayerSearchSource | LocatorSearchSource] = js.native
  /**
    * Indicates whether to automatically select and zoom to the first geocoded result. If `false`, the [findAddressCandidates](https://developers.arcgis.com/rest/geocode/api-reference/geocoding-find-address-candidates.htm) operation will still geocode the input string, but the top result will not be selected. To work with the geocoded results, you can set up a [search-complete](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#event-search-complete) event handler and get the results through the event object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#autoSelect)
    *
    * @default true
    */
  var autoSelect: scala.Boolean = js.native
  /**
    * A read-only property that is a [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of [LayerSearchSource](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html) and/or [LocatorSearchSource](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html). This property may contain [ArcGIS Portal](https://enterprise.arcgis.com/en/portal/) [locators](http://enterprise.arcgis.com/en/server/latest/publish-services/windows/geocode-services.htm) and any web map or web scene [configurable search sources](http://doc.arcgis.com/en/arcgis-online/create-maps/configure-feature-search.htm).  This property is used to populate the Search UI if the [sources](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#sources) property is not set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#defaultSources)
    */
  val defaultSources: Collection[LayerSearchSource | LocatorSearchSource] = js.native
  /**
    * The default [symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol.html) for the search result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#defaultSymbol)
    *
    * @default PictureMarkerSymbol
    */
  var defaultSymbol: Symbol = js.native
  /**
    * Indicates whether or not to include [defaultSources](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#defaultSources) in the Search UI. This can be a boolean value or a function that returns an array of Search [sources](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#sources).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#includeDefaultSources)
    *
    * @default true
    */
  var includeDefaultSources: scala.Boolean | js.Function = js.native
  /**
    * Indicates whether location services are enabled within the widget.  ![locationEnabled](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/search-locationEnabled.png)
    * > The use of this property is only supported on secure origins. To use it, switch your application to a secure origin, such as HTTPS. Note that localhost is considered "potentially secure" and can be used for easy testing in browsers that supports [Window.isSecureContext](https://developer.mozilla.org/en-US/docs/Web/API/Window/isSecureContext#Browser_compatibility) (currently Chrome and Firefox).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#locationEnabled)
    */
  var locationEnabled: scala.Boolean = js.native
  /**
    * The maximum character length of the search text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#maxInputLength)
    *
    * @default 128
    */
  var maxInputLength: scala.Double = js.native
  /**
    * The maximum number of results returned by the widget if not specified by the source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#maxResults)
    *
    * @default 6
    */
  var maxResults: scala.Double = js.native
  /**
    * The maximum number of suggestions returned by the widget if not specified by the source.  If working with the default [ArcGIS Online Geocoding service](https://developers.arcgis.com/rest/geocode/api-reference/overview-world-geocoding-service.htm), the default remains at `5`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#maxSuggestions)
    *
    * @default 6
    */
  var maxSuggestions: scala.Double = js.native
  /**
    * The minimum number of characters needed for the search if not specified by the source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#minSuggestCharacters)
    *
    * @default 1
    */
  var minSuggestCharacters: scala.Double = js.native
  /**
    * The placeholder used by the [activeSource](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#activeSource).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#placeholder)
    */
  val placeholder: java.lang.String = js.native
  /**
    * Indicates whether to display the [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) on feature click. The graphic can be clicked to display a [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#popupEnabled)
    *
    * @default true
    */
  var popupEnabled: scala.Boolean = js.native
  /**
    * A customized [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) for the selected feature. Note that any [templates](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) defined on [allSources](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#allSources) take precedence over those defined directly on the template.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#popupTemplate)
    *
    * @default null
    */
  var popupTemplate: PopupTemplate = js.native
  /**
    * It is possible to search a specified portal instance's [locator services](http://enterprise.arcgis.com/en/portal/latest/administer/windows/configure-portal-to-geocode-addresses.htm) Use this property to set this [ArcGIS Portal](https://enterprise.arcgis.com/en/portal/) instance to search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#portal)
    */
  var portal: Portal = js.native
  /**
    * The graphic used to highlight the resulting feature or location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#resultGraphic)
    *
    * @default null
    */
  val resultGraphic: Graphic = js.native
  /**
    * Indicates if the [resultGraphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#resultGraphic) will display at the location of the selected feature.
    * A graphic will be placed in the View's [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#graphics) for [layer views](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) that do not support the `highlight` method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#resultGraphicEnabled)
    *
    * @default true
    */
  var resultGraphicEnabled: scala.Boolean = js.native
  /**
    * An array of current results from the search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#results)
    *
    * @default null
    */
  val results: js.Array[_] = js.native
  /**
    * Indicates whether to display the option to search all sources. When `true`, the "All" option is displayed by default:  ![search-searchAllEnabled-true](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/search-enablesearchingall-true.png)  When `false`, no option to search all sources at once is available:  ![search-searchAllEnabled-true-false](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/search-enablesearchingall-false.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#searchAllEnabled)
    *
    * @default true
    */
  var searchAllEnabled: scala.Boolean = js.native
  /**
    * The value of the search box input text string.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#searchTerm)
    */
  var searchTerm: java.lang.String = js.native
  /**
    * The result selected from a search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#selectedResult)
    *
    * @default null
    */
  val selectedResult: js.Any = js.native
  /**
    * The selected SuggestResult.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#selectedSuggestion)
    *
    * @default null
    */
  val selectedSuggestion: Geometry | SearchViewModelSuggestResult = js.native
  /**
    * The Search widget may be used to search features in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) or geocode locations with a [Locator](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html). The `sources` property defines the sources from which to search for the [view](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#view) specified by the Search widget instance. There are two types of sources:
    *   * [LayerSearchSource](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html)
    *   * [LocatorSearchSource](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html)
    *
    *
    * Any combination of these sources may be used together in the same instance of the Search widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#sources)
    */
  var sources: Collection[LayerSearchSource | LocatorSearchSource] = js.native
  /**
    * The current state of the widget. This property was removed from [Search](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html) and should now be accessed within the [SearchViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html).  **Possible Values:** ready | disabled | searching | loading
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#state)
    *
    * @default ready
    */
  val state: java.lang.String = js.native
  /**
    * The millisecond delay after keyup and before making a [suggest](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#suggest) network request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#suggestionDelay)
    *
    * @default 150
    */
  var suggestionDelay: scala.Double = js.native
  /**
    * An array of results from the [suggest method](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#suggest).  This is available if working with a 10.3 or greater geocoding service that has [suggest capability loaded](https://developers.arcgis.com/rest/geocode/api-reference/geocoding-suggest.htm) or a 10.3 or greater feature layer that supports pagination, i.e. `supportsPagination = true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#suggestions)
    *
    * @default null
    */
  val suggestions: js.Array[SearchViewModelSuggestResult] = js.native
  /**
    * Enable suggestions for the widget.  This is only available if working with a 10.3 or greater geocoding service that has [suggest capability loaded] (https://developers.arcgis.com/rest/geocode/api-reference/geocoding-suggest.htm) or a 10.3 or greater feature layer that supports pagination, i.e. `supportsPagination = true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#suggestionsEnabled)
    *
    * @default true
    */
  var suggestionsEnabled: scala.Boolean = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#view)
    *
    * @default null
    */
  var view: MapView | SceneView = js.native
  /**
    * Clears the current value, search results, suggest results, graphic, and graphics layer. It also hides any open menus.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#clear)
    *
    *
    */
  def clear(): scala.Unit = js.native
  @JSName("on")
  def on_searchclear(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`search-clear`,
    eventHandler: SearchViewModelSearchClearEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_searchcomplete(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`search-complete`,
    eventHandler: SearchViewModelSearchCompleteEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_searchstart(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`search-start`,
    eventHandler: SearchViewModelSearchStartEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_selectresult(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`select-result`,
    eventHandler: SearchViewModelSelectResultEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_suggestcomplete(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`suggest-complete`,
    eventHandler: SearchViewModelSuggestCompleteEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_suggeststart(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`suggest-start`,
    eventHandler: SearchViewModelSuggestStartEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  /**
    * Depending on the sources specified, `search()` queries the feature layer(s) and/or performs address matching using any specified [Locator(s)](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html) and returns the applicable results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#search)
    *
    * @param searchTerm This searchTerm can be a string, geometry, suggest candidate object, or an array of [latitude,longitude]. If a geometry is supplied, then it will reverse geocode (locator) or findAddressCandidates with geometry instead of text (featurelayer).
    *
    */
  def search(): arcgisDashJsDashApiLib.IPromise[SearchViewModelSearchResponse] = js.native
  def search(searchTerm: Geometry): arcgisDashJsDashApiLib.IPromise[SearchViewModelSearchResponse] = js.native
  def search(searchTerm: SearchViewModelSuggestResult): arcgisDashJsDashApiLib.IPromise[SearchViewModelSearchResponse] = js.native
  def search(searchTerm: java.lang.String): arcgisDashJsDashApiLib.IPromise[SearchViewModelSearchResponse] = js.native
  def search(searchTerm: js.Array[js.Array[scala.Double]]): arcgisDashJsDashApiLib.IPromise[SearchViewModelSearchResponse] = js.native
  /**
    * Returns search results near your current location. It checks whether [locationEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#locationEnabled) is `true`. If so, and your browser supports [geolocation](https://developer.mozilla.org/en-US/docs/Web/API/Geolocation/Using_geolocation), it will return search results nearby your current location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#searchNearby)
    *
    *
    */
  def searchNearby(): arcgisDashJsDashApiLib.IPromise[SearchViewModelSearchResponse] = js.native
  /**
    * Performs a suggest() request on the active Locator. It also uses the current value of the widget or one that is passed in.  Suggestions are available if working with a 10.3 or greater geocoding service that has [suggest capability loaded](https://developers.arcgis.com/rest/geocode/api-reference/geocoding-suggest.htm) or a 10.3 or greater feature layer that supports pagination, i.e.`supportsPagination = true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#suggest)
    *
    * @param value The string value used to suggest() on an active Locator or feature layer. If nothing is passed in, takes the current value of the widget.
    *
    */
  def suggest(): arcgisDashJsDashApiLib.IPromise[SearchViewModelSuggestResponse] = js.native
  def suggest(value: java.lang.String): arcgisDashJsDashApiLib.IPromise[SearchViewModelSuggestResponse] = js.native
}

@JSGlobal("__esri.SearchViewModel")
@js.native
class SearchViewModelCls () extends SearchViewModel {
  def this(properties: SearchViewModelProperties) = this()
}

