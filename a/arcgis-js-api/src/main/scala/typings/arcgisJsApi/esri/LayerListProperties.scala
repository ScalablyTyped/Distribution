package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.MapViewPropertiestype2d
import typings.arcgisJsApi.anon.SceneViewPropertiestype3d
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerListProperties
  extends StObject
     with WidgetProperties {
  
  /**
  		 * The widget's default CSS icon class.
  		 *
  		 * @deprecated since 4.27. Use {@link module:esri/widgets/LayerList#icon icon} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#iconClass)
  		 */
  var iconClass: js.UndefOr[String] = js.undefined
  
  /**
  		 * A function that executes each time a [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html) is created.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#listItemCreatedFunction)
  		 */
  var listItemCreatedFunction: js.UndefOr[LayerListListItemCreatedHandler] = js.undefined
  
  /**
  		 * Indicates whether more than one list item may be selected by the user at a single time.
  		 *
  		 * @default false
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
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#selectionEnabled)
  		 */
  var selectionEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#view)
  		 */
  var view: js.UndefOr[MapViewPropertiestype2d | SceneViewPropertiestype3d] = js.undefined
  
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
  
  inline def apply(): LayerListProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerListProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LayerListProperties] (val x: Self) extends AnyVal {
    
    inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    inline def setListItemCreatedFunction(value: /* event */ Any => scala.Unit): Self = StObject.set(x, "listItemCreatedFunction", js.Any.fromFunction1(value))
    
    inline def setListItemCreatedFunctionUndefined: Self = StObject.set(x, "listItemCreatedFunction", js.undefined)
    
    inline def setMultipleSelectionEnabled(value: Boolean): Self = StObject.set(x, "multipleSelectionEnabled", value.asInstanceOf[js.Any])
    
    inline def setMultipleSelectionEnabledUndefined: Self = StObject.set(x, "multipleSelectionEnabled", js.undefined)
    
    inline def setSelectedItems(value: CollectionProperties[ListItemProperties]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
    
    inline def setSelectedItemsVarargs(value: ListItemProperties*): Self = StObject.set(x, "selectedItems", js.Array(value*))
    
    inline def setSelectionEnabled(value: Boolean): Self = StObject.set(x, "selectionEnabled", value.asInstanceOf[js.Any])
    
    inline def setSelectionEnabledUndefined: Self = StObject.set(x, "selectionEnabled", js.undefined)
    
    inline def setView(value: MapViewPropertiestype2d | SceneViewPropertiestype3d): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewModel(value: LayerListViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setVisibleElements(value: LayerListVisibleElements): Self = StObject.set(x, "visibleElements", value.asInstanceOf[js.Any])
    
    inline def setVisibleElementsUndefined: Self = StObject.set(x, "visibleElements", js.undefined)
  }
}
