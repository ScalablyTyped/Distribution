package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.none
import typings.arcgisJsApi.arcgisJsApiStrings.source
import typings.arcgisJsApi.arcgisJsApiStrings.suggestion
import typings.arcgisJsApi.arcgisJsApiStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait widgetsSearchProperties
  extends WidgetProperties
     with GoToProperties {
  
  /**
    * The current active menu of the Search widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#activeMenu)
    */
  var activeMenu: js.UndefOr[none | suggestion | source | warning] = js.native
  
  /**
    * The selected source's index.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#activeSourceIndex)
    */
  var activeSourceIndex: js.UndefOr[Double] = js.native
  
  /**
    * String value used as a hint for input text when searching on multiple sources.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#allPlaceholder)
    */
  var allPlaceholder: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether to automatically select and zoom to the first geocoded result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#autoSelect)
    */
  var autoSelect: js.UndefOr[Boolean] = js.native
  
  /**
    * When true, the widget is visually withdrawn and cannot be interacted with.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#disabled)
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether or not to include [defaultSources](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#defaultSources) in the Search UI.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#includeDefaultSources)
    */
  var includeDefaultSources: js.UndefOr[Boolean | js.Function] = js.native
  
  /**
    * Enables location services within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#locationEnabled)
    */
  var locationEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The maximum number of results returned by the widget if not specified by the source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#maxResults)
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /**
    * The maximum number of suggestions returned by the widget if not specified by the source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#maxSuggestions)
    */
  var maxSuggestions: js.UndefOr[Double] = js.native
  
  /**
    * The minimum number of characters needed for the search if not specified by the source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#minSuggestCharacters)
    */
  var minSuggestCharacters: js.UndefOr[Double] = js.native
  
  /**
    * Indicates whether to display the [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) on feature click.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#popupEnabled)
    */
  var popupEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * A customized [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) for the selected feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#popupTemplate)
    */
  var popupTemplate: js.UndefOr[PopupTemplateProperties] = js.native
  
  /**
    * It is possible to search a specified portal instance's [locator services](http://enterprise.arcgis.com/en/portal/latest/administer/windows/configure-portal-to-geocode-addresses.htm) Use this property to set this [ArcGIS Portal](https://enterprise.arcgis.com/en/portal/) instance to search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#portal)
    */
  var portal: js.UndefOr[PortalProperties] = js.native
  
  /**
    * Indicates if the [resultGraphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#resultGraphic) will display at the location of the selected feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#resultGraphicEnabled)
    */
  var resultGraphicEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether to display the option to search all sources.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#searchAllEnabled)
    */
  var searchAllEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The value of the search box input text string.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#searchTerm)
    */
  var searchTerm: js.UndefOr[String] = js.native
  
  /**
    * The Search widget may be used to search features in a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) or geocode locations with a [Locator](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#sources)
    */
  var sources: js.UndefOr[CollectionProperties[SearchSourceProperties]] = js.native
  
  /**
    * Enable suggestions for the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#suggestionsEnabled)
    */
  var suggestionsEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#viewModel)
    */
  var viewModel: js.UndefOr[SearchViewModelProperties] = js.native
}
object widgetsSearchProperties {
  
  @scala.inline
  def apply(): widgetsSearchProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[widgetsSearchProperties]
  }
  
  @scala.inline
  implicit class widgetsSearchPropertiesOps[Self <: widgetsSearchProperties] (val x: Self) extends AnyVal {
    
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
    def setActiveMenu(value: none | suggestion | source | warning): Self = this.set("activeMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveMenu: Self = this.set("activeMenu", js.undefined)
    
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setIconClass(value: String): Self = this.set("iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconClass: Self = this.set("iconClass", js.undefined)
    
    @scala.inline
    def setIncludeDefaultSources(value: Boolean | js.Function): Self = this.set("includeDefaultSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeDefaultSources: Self = this.set("includeDefaultSources", js.undefined)
    
    @scala.inline
    def setLocationEnabled(value: Boolean): Self = this.set("locationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationEnabled: Self = this.set("locationEnabled", js.undefined)
    
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
    def setSourcesVarargs(value: SearchSourceProperties*): Self = this.set("sources", js.Array(value :_*))
    
    @scala.inline
    def setSources(value: CollectionProperties[SearchSourceProperties]): Self = this.set("sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSources: Self = this.set("sources", js.undefined)
    
    @scala.inline
    def setSuggestionsEnabled(value: Boolean): Self = this.set("suggestionsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestionsEnabled: Self = this.set("suggestionsEnabled", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    
    @scala.inline
    def setViewModel(value: SearchViewModelProperties): Self = this.set("viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewModel: Self = this.set("viewModel", js.undefined)
  }
}
