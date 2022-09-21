package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.ActionButtonPropertiestyp
import typings.arcgisJsApi.anon.ActionTogglePropertiestyp
import typings.arcgisJsApi.anon.MapViewPropertiestype2d
import typings.arcgisJsApi.anon.SceneViewPropertiestype3d
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListItemProperties extends StObject {
  
  /**
    * Whether the actions panel is open in the LayerList.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#actionsOpen)
    */
  var actionsOpen: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A nested 2-dimensional collection of actions that could be triggered on the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#actionsSections)
    */
  var actionsSections: js.UndefOr[
    (CollectionProperties[CollectionProperties[ActionButtonPropertiestyp | ActionTogglePropertiestyp]]) | js.Array[js.Array[Any]]
  ] = js.undefined
  
  /**
    * When a layer contains sublayers, this property is a Collection of ListItem objects belonging to the given layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#children)
    */
  var children: js.UndefOr[CollectionProperties[ListItemProperties]] = js.undefined
  
  /**
    * Indicates if the children of a list item (or sublayers in a GroupLayer) can be sorted or moved/reordered.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#childrenSortable)
    */
  var childrenSortable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When `true`, hides the layer from the LayerList instance.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#hidden)
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The layer associated with the triggered action.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#layer)
    */
  var layer: js.UndefOr[LayerProperties] = js.undefined
  
  /**
    * Whether the layer is open in the LayerList.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#open)
    */
  var open: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allows you to display custom content for each ListItem in the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#panel)
    */
  var panel: js.UndefOr[ListItemPanel] = js.undefined
  
  /**
    * The parent of this item
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#parent)
    */
  var parent: js.UndefOr[ListItemProperties] = js.undefined
  
  /**
    * Indicates if the list item (or layer in the map) can be sorted or moved/reordered.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#sortable)
    */
  var sortable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The title of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#title)
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#view)
    */
  var view: js.UndefOr[MapViewPropertiestype2d | SceneViewPropertiestype3d] = js.undefined
  
  /**
    * Indicates if the ListItem is visible.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#visible)
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object ListItemProperties {
  
  inline def apply(): ListItemProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemProperties]
  }
  
  extension [Self <: ListItemProperties](x: Self) {
    
    inline def setActionsOpen(value: Boolean): Self = StObject.set(x, "actionsOpen", value.asInstanceOf[js.Any])
    
    inline def setActionsOpenUndefined: Self = StObject.set(x, "actionsOpen", js.undefined)
    
    inline def setActionsSections(
      value: (CollectionProperties[CollectionProperties[ActionButtonPropertiestyp | ActionTogglePropertiestyp]]) | js.Array[js.Array[Any]]
    ): Self = StObject.set(x, "actionsSections", value.asInstanceOf[js.Any])
    
    inline def setActionsSectionsUndefined: Self = StObject.set(x, "actionsSections", js.undefined)
    
    inline def setActionsSectionsVarargs(
      value: (js.Array[Any] | (CollectionProperties[ActionButtonPropertiestyp | ActionTogglePropertiestyp]))*
    ): Self = StObject.set(x, "actionsSections", js.Array(value*))
    
    inline def setChildren(value: CollectionProperties[ListItemProperties]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenSortable(value: Boolean): Self = StObject.set(x, "childrenSortable", value.asInstanceOf[js.Any])
    
    inline def setChildrenSortableUndefined: Self = StObject.set(x, "childrenSortable", js.undefined)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: ListItemProperties*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setLayer(value: LayerProperties): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setPanel(value: ListItemPanel): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
    
    inline def setPanelUndefined: Self = StObject.set(x, "panel", js.undefined)
    
    inline def setParent(value: ListItemProperties): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
    inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setView(value: MapViewPropertiestype2d | SceneViewPropertiestype3d): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
