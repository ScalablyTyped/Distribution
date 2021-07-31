package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasemapLayerListProperties
  extends StObject
     with WidgetProperties {
  
  /**
    * Specifies a function that accesses each [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html) representing a base layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html#baseListItemCreatedFunction)
    */
  var baseListItemCreatedFunction: js.UndefOr[ListItemCreatedHandler] = js.undefined
  
  /**
    * The current basemap's title.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html#basemapTitle)
    */
  var basemapTitle: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the basemap’s title, layer order and layer grouping can be edited by the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html#editingEnabled)
    */
  var editingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether more than one list item may be selected by the user at a single time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html#multipleSelectionEnabled)
    */
  var multipleSelectionEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a function that accesses each [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html) representing a reference layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html#referenceListItemCreatedFunction)
    */
  var referenceListItemCreatedFunction: js.UndefOr[ListItemCreatedHandler] = js.undefined
  
  /**
    * A collection of selected [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html)s representing basemap layers selected by the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html#selectedItems)
    */
  var selectedItems: js.UndefOr[CollectionProperties[ListItemProperties]] = js.undefined
  
  /**
    * Option for enabling status indicators, which indicate whether or not each layer is loading resources.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html#statusIndicatorsVisible)
    */
  var statusIndicatorsVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html#viewModel)
    */
  var viewModel: js.UndefOr[BasemapLayerListViewModelProperties] = js.undefined
  
  /**
    * The visible elements that are displayed within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html#visibleElements)
    */
  var visibleElements: js.UndefOr[VisibleElements] = js.undefined
}
object BasemapLayerListProperties {
  
  @scala.inline
  def apply(): BasemapLayerListProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasemapLayerListProperties]
  }
  
  @scala.inline
  implicit class BasemapLayerListPropertiesMutableBuilder[Self <: BasemapLayerListProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseListItemCreatedFunction(value: /* event */ js.Any => Unit): Self = StObject.set(x, "baseListItemCreatedFunction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBaseListItemCreatedFunctionUndefined: Self = StObject.set(x, "baseListItemCreatedFunction", js.undefined)
    
    @scala.inline
    def setBasemapTitle(value: String): Self = StObject.set(x, "basemapTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasemapTitleUndefined: Self = StObject.set(x, "basemapTitle", js.undefined)
    
    @scala.inline
    def setEditingEnabled(value: Boolean): Self = StObject.set(x, "editingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditingEnabledUndefined: Self = StObject.set(x, "editingEnabled", js.undefined)
    
    @scala.inline
    def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    @scala.inline
    def setMultipleSelectionEnabled(value: Boolean): Self = StObject.set(x, "multipleSelectionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleSelectionEnabledUndefined: Self = StObject.set(x, "multipleSelectionEnabled", js.undefined)
    
    @scala.inline
    def setReferenceListItemCreatedFunction(value: /* event */ js.Any => Unit): Self = StObject.set(x, "referenceListItemCreatedFunction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReferenceListItemCreatedFunctionUndefined: Self = StObject.set(x, "referenceListItemCreatedFunction", js.undefined)
    
    @scala.inline
    def setSelectedItems(value: CollectionProperties[ListItemProperties]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
    
    @scala.inline
    def setSelectedItemsVarargs(value: ListItemProperties*): Self = StObject.set(x, "selectedItems", js.Array(value :_*))
    
    @scala.inline
    def setStatusIndicatorsVisible(value: Boolean): Self = StObject.set(x, "statusIndicatorsVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusIndicatorsVisibleUndefined: Self = StObject.set(x, "statusIndicatorsVisible", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModel(value: BasemapLayerListViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    @scala.inline
    def setVisibleElements(value: VisibleElements): Self = StObject.set(x, "visibleElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleElementsUndefined: Self = StObject.set(x, "visibleElements", js.undefined)
  }
}
