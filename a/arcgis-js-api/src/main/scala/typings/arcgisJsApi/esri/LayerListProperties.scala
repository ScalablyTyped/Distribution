package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerListProperties
  extends StObject
     with WidgetProperties {
  
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a function that accesses each [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#listItemCreatedFunction)
    */
  var listItemCreatedFunction: js.UndefOr[LayerListListItemCreatedHandler] = js.undefined
  
  /**
    * Indicates whether more than one list item may be selected by the user at a single time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#multipleSelectionEnabled)
    */
  var multipleSelectionEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A collection of selected [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html)s representing operational layers selected by the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#selectedItems)
    */
  var selectedItems: js.UndefOr[CollectionProperties[ListItemProperties]] = js.undefined
  
  /**
    * Indicates whether list items may be selected by the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#selectionEnabled)
    */
  var selectionEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Option for enabling status indicators, which indicate whether or not each layer is loading resources.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#statusIndicatorsVisible)
    */
  var statusIndicatorsVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#viewModel)
    */
  var viewModel: js.UndefOr[LayerListViewModelProperties] = js.undefined
  
  /**
    * The visible elements that are displayed within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#visibleElements)
    */
  var visibleElements: js.UndefOr[LayerListVisibleElements] = js.undefined
}
object LayerListProperties {
  
  @scala.inline
  def apply(): LayerListProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerListProperties]
  }
  
  @scala.inline
  implicit class LayerListPropertiesMutableBuilder[Self <: LayerListProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    @scala.inline
    def setListItemCreatedFunction(value: /* event */ js.Any => Unit): Self = StObject.set(x, "listItemCreatedFunction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setListItemCreatedFunctionUndefined: Self = StObject.set(x, "listItemCreatedFunction", js.undefined)
    
    @scala.inline
    def setMultipleSelectionEnabled(value: Boolean): Self = StObject.set(x, "multipleSelectionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleSelectionEnabledUndefined: Self = StObject.set(x, "multipleSelectionEnabled", js.undefined)
    
    @scala.inline
    def setSelectedItems(value: CollectionProperties[ListItemProperties]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
    
    @scala.inline
    def setSelectedItemsVarargs(value: ListItemProperties*): Self = StObject.set(x, "selectedItems", js.Array(value :_*))
    
    @scala.inline
    def setSelectionEnabled(value: Boolean): Self = StObject.set(x, "selectionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionEnabledUndefined: Self = StObject.set(x, "selectionEnabled", js.undefined)
    
    @scala.inline
    def setStatusIndicatorsVisible(value: Boolean): Self = StObject.set(x, "statusIndicatorsVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusIndicatorsVisibleUndefined: Self = StObject.set(x, "statusIndicatorsVisible", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModel(value: LayerListViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    @scala.inline
    def setVisibleElements(value: LayerListVisibleElements): Self = StObject.set(x, "visibleElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleElementsUndefined: Self = StObject.set(x, "visibleElements", js.undefined)
  }
}
