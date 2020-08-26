package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchViewModelProperties extends GoToProperties {
  /**
    * The selected source's index. This value is `-1` when all sources are selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#activeSourceIndex)
    *
    * @default 0
    */
  var activeSourceIndex: js.UndefOr[Double] = js.native
  /**
    * String value used as a hint for input text when searching on multiple sources. See the image below to view the location and style of this text in the context of the widget.  ![search-allPlaceholder](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/search-allplaceholder.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#allPlaceholder)
    *
    * @default "Find address or place"
    */
  var allPlaceholder: js.UndefOr[String] = js.native
  /**
    * Indicates whether to automatically select and zoom to the first geocoded result. If `false`, the [findAddressCandidates](https://developers.arcgis.com/rest/geocode/api-reference/geocoding-find-address-candidates.htm) operation will still geocode the input string, but the top result will not be selected. To work with the geocoded results, you can set up a [search-complete](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#event-search-complete) event handler and get the results through the event object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#autoSelect)
    *
    * @default true
    */
  var autoSelect: js.UndefOr[Boolean] = js.native
  /**
    * The default [symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol.html) for the search result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#defaultSymbol)
    *
    * @default PictureMarkerSymbol
    */
  var defaultSymbol: js.UndefOr[SymbolProperties] = js.native
  /**
    * Indicates whether or not to include [defaultSources](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#defaultSources) in the Search UI. This can be a boolean value or a function that returns an array of Search [sources](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#sources).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#includeDefaultSources)
    *
    * @default true
    */
  var includeDefaultSources: js.UndefOr[Boolean | js.Function] = js.native
  /**
    * Indicates whether location services are enabled within the widget.  ![locationEnabled](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/search-locationEnabled.png)
    * > The use of this property is only supported on secure origins. To use it, switch your application to a secure origin, such as HTTPS. Note that localhost is considered "potentially secure" and can be used for easy testing in browsers that supports [Window.isSecureContext](https://developer.mozilla.org/en-US/docs/Web/API/Window/isSecureContext#Browser_compatibility) (currently Chrome and Firefox).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#locationEnabled)
    */
  var locationEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The maximum character length of the search text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#maxInputLength)
    *
    * @default 128
    */
  var maxInputLength: js.UndefOr[Double] = js.native
  /**
    * The maximum number of results returned by the widget if not specified by the source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#maxResults)
    *
    * @default 6
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * The maximum number of suggestions returned by the widget if not specified by the source.  If working with the default [ArcGIS Online Geocoding service](https://developers.arcgis.com/rest/geocode/api-reference/overview-world-geocoding-service.htm), the default remains at `5`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#maxSuggestions)
    *
    * @default 6
    */
  var maxSuggestions: js.UndefOr[Double] = js.native
  /**
    * The minimum number of characters needed for the search if not specified by the source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#minSuggestCharacters)
    *
    * @default 1
    */
  var minSuggestCharacters: js.UndefOr[Double] = js.native
  /**
    * Indicates whether to display the [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) on feature click. The graphic can be clicked to display a [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#popupEnabled)
    *
    * @default true
    */
  var popupEnabled: js.UndefOr[Boolean] = js.native
  /**
    * A customized [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) for the selected feature. Note that any [templates](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) defined on [allSources](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#allSources) take precedence over those defined directly on the template.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#popupTemplate)
    *
    * @default null
    */
  var popupTemplate: js.UndefOr[PopupTemplateProperties] = js.native
  /**
    * It is possible to search a specified portal instance's [locator services](http://enterprise.arcgis.com/en/portal/latest/administer/windows/configure-portal-to-geocode-addresses.htm) Use this property to set this [ArcGIS Portal](https://enterprise.arcgis.com/en/portal/) instance to search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#portal)
    */
  var portal: js.UndefOr[PortalProperties] = js.native
  /**
    * Indicates if the [resultGraphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#resultGraphic) will display at the location of the selected feature.
    * A graphic will be placed in the View's [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#graphics) for [layer views](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) that do not support the `highlight` method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#resultGraphicEnabled)
    *
    * @default true
    */
  var resultGraphicEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether to display the option to search all sources. When `true`, the "All" option is displayed by default:  ![search-searchAllEnabled-true](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/search-enablesearchingall-true.png)  When `false`, no option to search all sources at once is available:  ![search-searchAllEnabled-true-false](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/search-enablesearchingall-false.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#searchAllEnabled)
    *
    * @default true
    */
  var searchAllEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The value of the search box input text string.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#searchTerm)
    */
  var searchTerm: js.UndefOr[String] = js.native
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
  var sources: js.UndefOr[
    CollectionProperties[LayerSearchSourceProperties | LocatorSearchSourceProperties]
  ] = js.native
  /**
    * The millisecond delay after keyup and before making a [suggest](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#suggest) network request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#suggestionDelay)
    *
    * @default 150
    */
  var suggestionDelay: js.UndefOr[Double] = js.native
  /**
    * Enable suggestions for the widget.  This is only available if working with a 10.3 or greater geocoding service that has [suggest capability loaded] (https://developers.arcgis.com/rest/geocode/api-reference/geocoding-suggest.htm) or a 10.3 or greater feature layer that supports pagination, i.e. `supportsPagination = true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#suggestionsEnabled)
    *
    * @default true
    */
  var suggestionsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#view)
    *
    * @default null
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
}

object SearchViewModelProperties {
  @scala.inline
  def apply(): SearchViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchViewModelProperties]
  }
  @scala.inline
  implicit class SearchViewModelPropertiesOps[Self <: SearchViewModelProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActiveSourceIndex(value: Double): Self = this.set("activeSourceIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveSourceIndex: Self = this.set("activeSourceIndex", js.undefined)
    @scala.inline
    def setAllPlaceholder(value: String): Self = this.set("allPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllPlaceholder: Self = this.set("allPlaceholder", js.undefined)
    @scala.inline
    def setAutoSelect(value: Boolean): Self = this.set("autoSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoSelect: Self = this.set("autoSelect", js.undefined)
    @scala.inline
    def setDefaultSymbol(value: SymbolProperties): Self = this.set("defaultSymbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSymbol: Self = this.set("defaultSymbol", js.undefined)
    @scala.inline
    def setIncludeDefaultSources(value: Boolean | js.Function): Self = this.set("includeDefaultSources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeDefaultSources: Self = this.set("includeDefaultSources", js.undefined)
    @scala.inline
    def setLocationEnabled(value: Boolean): Self = this.set("locationEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationEnabled: Self = this.set("locationEnabled", js.undefined)
    @scala.inline
    def setMaxInputLength(value: Double): Self = this.set("maxInputLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxInputLength: Self = this.set("maxInputLength", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setMaxSuggestions(value: Double): Self = this.set("maxSuggestions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSuggestions: Self = this.set("maxSuggestions", js.undefined)
    @scala.inline
    def setMinSuggestCharacters(value: Double): Self = this.set("minSuggestCharacters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinSuggestCharacters: Self = this.set("minSuggestCharacters", js.undefined)
    @scala.inline
    def setPopupEnabled(value: Boolean): Self = this.set("popupEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupEnabled: Self = this.set("popupEnabled", js.undefined)
    @scala.inline
    def setPopupTemplate(value: PopupTemplateProperties): Self = this.set("popupTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupTemplate: Self = this.set("popupTemplate", js.undefined)
    @scala.inline
    def setPortal(value: PortalProperties): Self = this.set("portal", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePortal: Self = this.set("portal", js.undefined)
    @scala.inline
    def setResultGraphicEnabled(value: Boolean): Self = this.set("resultGraphicEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResultGraphicEnabled: Self = this.set("resultGraphicEnabled", js.undefined)
    @scala.inline
    def setSearchAllEnabled(value: Boolean): Self = this.set("searchAllEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchAllEnabled: Self = this.set("searchAllEnabled", js.undefined)
    @scala.inline
    def setSearchTerm(value: String): Self = this.set("searchTerm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchTerm: Self = this.set("searchTerm", js.undefined)
    @scala.inline
    def setSourcesVarargs(value: (LayerSearchSourceProperties | LocatorSearchSourceProperties)*): Self = this.set("sources", js.Array(value :_*))
    @scala.inline
    def setSources(value: CollectionProperties[LayerSearchSourceProperties | LocatorSearchSourceProperties]): Self = this.set("sources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSources: Self = this.set("sources", js.undefined)
    @scala.inline
    def setSuggestionDelay(value: Double): Self = this.set("suggestionDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestionDelay: Self = this.set("suggestionDelay", js.undefined)
    @scala.inline
    def setSuggestionsEnabled(value: Boolean): Self = this.set("suggestionsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestionsEnabled: Self = this.set("suggestionsEnabled", js.undefined)
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
  
}

