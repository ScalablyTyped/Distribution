package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.none
import typings.arcgisJsApi.arcgisJsApiStrings.source
import typings.arcgisJsApi.arcgisJsApiStrings.suggestion
import typings.arcgisJsApi.arcgisJsApiStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait widgetsSearchProperties
  extends StObject
     with WidgetProperties
     with GoToProperties {
  
  /**
    * The current active menu of the Search widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#activeMenu)
    */
  var activeMenu: js.UndefOr[none | suggestion | source | warning] = js.undefined
  
  /**
    * The selected source's index.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#activeSourceIndex)
    */
  var activeSourceIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * String value used as a hint for input text when searching on multiple sources.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#allPlaceholder)
    */
  var allPlaceholder: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether to automatically select and zoom to the first geocoded result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#autoSelect)
    */
  var autoSelect: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When true, the widget is visually withdrawn and cannot be interacted with.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#disabled)
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether or not to include [defaultSources](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#defaultSources) in the Search UI.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#includeDefaultSources)
    */
  var includeDefaultSources: js.UndefOr[Boolean | js.Function] = js.undefined
  
  /**
    * Enables location services within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#locationEnabled)
    */
  var locationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum number of results returned by the widget if not specified by the source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#maxResults)
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum number of suggestions returned by the widget if not specified by the source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#maxSuggestions)
    */
  var maxSuggestions: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum number of characters needed for the search if not specified by the source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#minSuggestCharacters)
    */
  var minSuggestCharacters: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates whether to display the [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) on feature click.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#popupEnabled)
    */
  var popupEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A customized [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) for the selected feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#popupTemplate)
    */
  var popupTemplate: js.UndefOr[PopupTemplateProperties] = js.undefined
  
  /**
    * It is possible to search a specified portal instance's [locator services](http://enterprise.arcgis.com/en/portal/latest/administer/windows/configure-portal-to-geocode-addresses.htm) Use this property to set this [ArcGIS Portal](https://enterprise.arcgis.com/en/portal/) instance to search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#portal)
    */
  var portal: js.UndefOr[PortalProperties] = js.undefined
  
  /**
    * Indicates if the [resultGraphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#resultGraphic) will display at the location of the selected feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#resultGraphicEnabled)
    */
  var resultGraphicEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to display the option to search all sources.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#searchAllEnabled)
    */
  var searchAllEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The value of the search box input text string.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#searchTerm)
    */
  var searchTerm: js.UndefOr[String] = js.undefined
  
  /**
    * The Search widget may be used to search features in a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) or geocode locations with a [Locator](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#sources)
    */
  var sources: js.UndefOr[CollectionProperties[SearchSourceProperties]] = js.undefined
  
  /**
    * Enable suggestions for the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#suggestionsEnabled)
    */
  var suggestionsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#viewModel)
    */
  var viewModel: js.UndefOr[SearchViewModelProperties] = js.undefined
}
object widgetsSearchProperties {
  
  inline def apply(): widgetsSearchProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[widgetsSearchProperties]
  }
  
  extension [Self <: widgetsSearchProperties](x: Self) {
    
    inline def setActiveMenu(value: none | suggestion | source | warning): Self = StObject.set(x, "activeMenu", value.asInstanceOf[js.Any])
    
    inline def setActiveMenuUndefined: Self = StObject.set(x, "activeMenu", js.undefined)
    
    inline def setActiveSourceIndex(value: Double): Self = StObject.set(x, "activeSourceIndex", value.asInstanceOf[js.Any])
    
    inline def setActiveSourceIndexUndefined: Self = StObject.set(x, "activeSourceIndex", js.undefined)
    
    inline def setAllPlaceholder(value: String): Self = StObject.set(x, "allPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setAllPlaceholderUndefined: Self = StObject.set(x, "allPlaceholder", js.undefined)
    
    inline def setAutoSelect(value: Boolean): Self = StObject.set(x, "autoSelect", value.asInstanceOf[js.Any])
    
    inline def setAutoSelectUndefined: Self = StObject.set(x, "autoSelect", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    inline def setIncludeDefaultSources(value: Boolean | js.Function): Self = StObject.set(x, "includeDefaultSources", value.asInstanceOf[js.Any])
    
    inline def setIncludeDefaultSourcesUndefined: Self = StObject.set(x, "includeDefaultSources", js.undefined)
    
    inline def setLocationEnabled(value: Boolean): Self = StObject.set(x, "locationEnabled", value.asInstanceOf[js.Any])
    
    inline def setLocationEnabledUndefined: Self = StObject.set(x, "locationEnabled", js.undefined)
    
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
    
    inline def setSources(value: CollectionProperties[SearchSourceProperties]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: SearchSourceProperties*): Self = StObject.set(x, "sources", js.Array(value :_*))
    
    inline def setSuggestionsEnabled(value: Boolean): Self = StObject.set(x, "suggestionsEnabled", value.asInstanceOf[js.Any])
    
    inline def setSuggestionsEnabledUndefined: Self = StObject.set(x, "suggestionsEnabled", js.undefined)
    
    inline def setView(value: MapViewProperties | SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewModel(value: SearchViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
