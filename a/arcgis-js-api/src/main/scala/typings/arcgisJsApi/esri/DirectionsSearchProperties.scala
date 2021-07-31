package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionsSearchProperties
  extends StObject
     with Object {
  
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
    * Define the type of location, either `"street"` or `"rooftop"`.
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
    propertyIsEnumerable: PropertyKey => Boolean
  ): DirectionsSearchProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[DirectionsSearchProperties]
  }
  
  @scala.inline
  implicit class DirectionsSearchPropertiesMutableBuilder[Self <: DirectionsSearchProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveSourceIndex(value: Double): Self = StObject.set(x, "activeSourceIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveSourceIndexUndefined: Self = StObject.set(x, "activeSourceIndex", js.undefined)
    
    @scala.inline
    def setAllPlaceholder(value: String): Self = StObject.set(x, "allPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllPlaceholderUndefined: Self = StObject.set(x, "allPlaceholder", js.undefined)
    
    @scala.inline
    def setAutoNavigate(value: Boolean): Self = StObject.set(x, "autoNavigate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoNavigateUndefined: Self = StObject.set(x, "autoNavigate", js.undefined)
    
    @scala.inline
    def setAutoSelect(value: Boolean): Self = StObject.set(x, "autoSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSelectUndefined: Self = StObject.set(x, "autoSelect", js.undefined)
    
    @scala.inline
    def setLocationType(value: String): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationTypeUndefined: Self = StObject.set(x, "locationType", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setMaxSuggestions(value: Double): Self = StObject.set(x, "maxSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSuggestionsUndefined: Self = StObject.set(x, "maxSuggestions", js.undefined)
    
    @scala.inline
    def setMinSuggestCharacters(value: Double): Self = StObject.set(x, "minSuggestCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSuggestCharactersUndefined: Self = StObject.set(x, "minSuggestCharacters", js.undefined)
    
    @scala.inline
    def setPopupEnabled(value: Boolean): Self = StObject.set(x, "popupEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupEnabledUndefined: Self = StObject.set(x, "popupEnabled", js.undefined)
    
    @scala.inline
    def setPopupOpenOnSelect(value: Boolean): Self = StObject.set(x, "popupOpenOnSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupOpenOnSelectUndefined: Self = StObject.set(x, "popupOpenOnSelect", js.undefined)
    
    @scala.inline
    def setPopupTemplate(value: PopupTemplate): Self = StObject.set(x, "popupTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupTemplateUndefined: Self = StObject.set(x, "popupTemplate", js.undefined)
    
    @scala.inline
    def setResultGraphicEnabled(value: Boolean): Self = StObject.set(x, "resultGraphicEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultGraphicEnabledUndefined: Self = StObject.set(x, "resultGraphicEnabled", js.undefined)
    
    @scala.inline
    def setSearchAllEnabled(value: Boolean): Self = StObject.set(x, "searchAllEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchAllEnabledUndefined: Self = StObject.set(x, "searchAllEnabled", js.undefined)
    
    @scala.inline
    def setSearchTerm(value: String): Self = StObject.set(x, "searchTerm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchTermUndefined: Self = StObject.set(x, "searchTerm", js.undefined)
    
    @scala.inline
    def setSources(value: Collection[LayerSearchSource | LocatorSearchSource]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    @scala.inline
    def setSuggestionsEnabled(value: Boolean): Self = StObject.set(x, "suggestionsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionsEnabledUndefined: Self = StObject.set(x, "suggestionsEnabled", js.undefined)
    
    @scala.inline
    def setView(value: MapView | SceneView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModel(value: SearchViewModel): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
