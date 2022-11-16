package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.MapViewPropertiestype2d
import typings.arcgisJsApi.anon.SceneViewPropertiestype3d
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchViewModelProperties
  extends StObject
     with GoToProperties {
  
  /**
    * The selected source's index.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#activeSourceIndex)
    */
  var activeSourceIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * String value used as a hint for input text when searching on multiple sources.
    *
    * @default "Find address or place"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#allPlaceholder)
    */
  var allPlaceholder: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether to automatically select and zoom to the first geocoded result.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#autoSelect)
    */
  var autoSelect: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The default [symbol(s)](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol.html) for the search result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#defaultSymbols)
    */
  var defaultSymbols: js.UndefOr[SearchViewModelDefaultSymbols] = js.undefined
  
  /**
    * Indicates whether or not to include [defaultSources](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#defaultSources) in the Search UI.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#includeDefaultSources)
    */
  var includeDefaultSources: js.UndefOr[Boolean | js.Function] = js.undefined
  
  /**
    * Indicates whether location services are enabled within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#locationEnabled)
    */
  var locationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum character length of the search text.
    *
    * @default 128
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#maxInputLength)
    */
  var maxInputLength: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum number of results returned by the widget if not specified by the source.
    *
    * @default 6
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#maxResults)
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum number of suggestions returned by the widget if not specified by the source.
    *
    * @default 6
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#maxSuggestions)
    */
  var maxSuggestions: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum number of characters needed for the search if not specified by the source.
    *
    * @default 1
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#minSuggestCharacters)
    */
  var minSuggestCharacters: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates whether to display the [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) on feature click.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#popupEnabled)
    */
  var popupEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A customized [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) for the selected feature.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#popupTemplate)
    */
  var popupTemplate: js.UndefOr[PopupTemplateProperties] = js.undefined
  
  /**
    * It is possible to search a specified portal instance's [locator services](https://enterprise.arcgis.com/en/portal/latest/administer/windows/configure-portal-to-geocode-addresses.htm) Use this property to set this [ArcGIS Portal](https://enterprise.arcgis.com/en/portal/) instance to search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#portal)
    */
  var portal: js.UndefOr[PortalProperties] = js.undefined
  
  /**
    * Indicates if the [resultGraphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#resultGraphic) will display at the location of the selected feature.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#resultGraphicEnabled)
    */
  var resultGraphicEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to display the option to search all sources.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#searchAllEnabled)
    */
  var searchAllEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The value of the search box input text string.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#searchTerm)
    */
  var searchTerm: js.UndefOr[String] = js.undefined
  
  /**
    * The Search widget may be used to search features in a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) or [table](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-SearchTable.html), or geocode locations with a [locator](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-locator.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#sources)
    */
  var sources: js.UndefOr[
    CollectionProperties[LayerSearchSourceProperties | LocatorSearchSourceProperties]
  ] = js.undefined
  
  /**
    * The millisecond delay after keyup and before making a [suggest](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#suggest) network request.
    *
    * @default 350
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#suggestionDelay)
    */
  var suggestionDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * Enable suggestions for the widget.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#suggestionsEnabled)
    */
  var suggestionsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#view)
    */
  var view: js.UndefOr[MapViewPropertiestype2d | SceneViewPropertiestype3d] = js.undefined
}
object SearchViewModelProperties {
  
  inline def apply(): SearchViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchViewModelProperties]
  }
  
  extension [Self <: SearchViewModelProperties](x: Self) {
    
    inline def setActiveSourceIndex(value: Double): Self = StObject.set(x, "activeSourceIndex", value.asInstanceOf[js.Any])
    
    inline def setActiveSourceIndexUndefined: Self = StObject.set(x, "activeSourceIndex", js.undefined)
    
    inline def setAllPlaceholder(value: String): Self = StObject.set(x, "allPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setAllPlaceholderUndefined: Self = StObject.set(x, "allPlaceholder", js.undefined)
    
    inline def setAutoSelect(value: Boolean): Self = StObject.set(x, "autoSelect", value.asInstanceOf[js.Any])
    
    inline def setAutoSelectUndefined: Self = StObject.set(x, "autoSelect", js.undefined)
    
    inline def setDefaultSymbols(value: SearchViewModelDefaultSymbols): Self = StObject.set(x, "defaultSymbols", value.asInstanceOf[js.Any])
    
    inline def setDefaultSymbolsUndefined: Self = StObject.set(x, "defaultSymbols", js.undefined)
    
    inline def setIncludeDefaultSources(value: Boolean | js.Function): Self = StObject.set(x, "includeDefaultSources", value.asInstanceOf[js.Any])
    
    inline def setIncludeDefaultSourcesUndefined: Self = StObject.set(x, "includeDefaultSources", js.undefined)
    
    inline def setLocationEnabled(value: Boolean): Self = StObject.set(x, "locationEnabled", value.asInstanceOf[js.Any])
    
    inline def setLocationEnabledUndefined: Self = StObject.set(x, "locationEnabled", js.undefined)
    
    inline def setMaxInputLength(value: Double): Self = StObject.set(x, "maxInputLength", value.asInstanceOf[js.Any])
    
    inline def setMaxInputLengthUndefined: Self = StObject.set(x, "maxInputLength", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setMaxSuggestions(value: Double): Self = StObject.set(x, "maxSuggestions", value.asInstanceOf[js.Any])
    
    inline def setMaxSuggestionsUndefined: Self = StObject.set(x, "maxSuggestions", js.undefined)
    
    inline def setMinSuggestCharacters(value: Double): Self = StObject.set(x, "minSuggestCharacters", value.asInstanceOf[js.Any])
    
    inline def setMinSuggestCharactersUndefined: Self = StObject.set(x, "minSuggestCharacters", js.undefined)
    
    inline def setPopupEnabled(value: Boolean): Self = StObject.set(x, "popupEnabled", value.asInstanceOf[js.Any])
    
    inline def setPopupEnabledUndefined: Self = StObject.set(x, "popupEnabled", js.undefined)
    
    inline def setPopupTemplate(value: PopupTemplateProperties): Self = StObject.set(x, "popupTemplate", value.asInstanceOf[js.Any])
    
    inline def setPopupTemplateUndefined: Self = StObject.set(x, "popupTemplate", js.undefined)
    
    inline def setPortal(value: PortalProperties): Self = StObject.set(x, "portal", value.asInstanceOf[js.Any])
    
    inline def setPortalUndefined: Self = StObject.set(x, "portal", js.undefined)
    
    inline def setResultGraphicEnabled(value: Boolean): Self = StObject.set(x, "resultGraphicEnabled", value.asInstanceOf[js.Any])
    
    inline def setResultGraphicEnabledUndefined: Self = StObject.set(x, "resultGraphicEnabled", js.undefined)
    
    inline def setSearchAllEnabled(value: Boolean): Self = StObject.set(x, "searchAllEnabled", value.asInstanceOf[js.Any])
    
    inline def setSearchAllEnabledUndefined: Self = StObject.set(x, "searchAllEnabled", js.undefined)
    
    inline def setSearchTerm(value: String): Self = StObject.set(x, "searchTerm", value.asInstanceOf[js.Any])
    
    inline def setSearchTermUndefined: Self = StObject.set(x, "searchTerm", js.undefined)
    
    inline def setSources(value: CollectionProperties[LayerSearchSourceProperties | LocatorSearchSourceProperties]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: (LayerSearchSourceProperties | LocatorSearchSourceProperties)*): Self = StObject.set(x, "sources", js.Array(value*))
    
    inline def setSuggestionDelay(value: Double): Self = StObject.set(x, "suggestionDelay", value.asInstanceOf[js.Any])
    
    inline def setSuggestionDelayUndefined: Self = StObject.set(x, "suggestionDelay", js.undefined)
    
    inline def setSuggestionsEnabled(value: Boolean): Self = StObject.set(x, "suggestionsEnabled", value.asInstanceOf[js.Any])
    
    inline def setSuggestionsEnabledUndefined: Self = StObject.set(x, "suggestionsEnabled", js.undefined)
    
    inline def setView(value: MapViewPropertiestype2d | SceneViewPropertiestype3d): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
