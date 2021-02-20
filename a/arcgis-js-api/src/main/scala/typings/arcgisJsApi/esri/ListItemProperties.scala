package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListItemProperties extends StObject {
  
  /**
    * Whether the actions panel is open in the LayerList.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#actionsOpen)
    */
  var actionsOpen: js.UndefOr[Boolean] = js.native
  
  /**
    * A nested 2-dimensional collection of actions that could be triggered on the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#actionsSections)
    */
  var actionsSections: js.UndefOr[
    (CollectionProperties[CollectionProperties[ActionButtonProperties | ActionToggleProperties]]) | js.Array[js.Array[_]]
  ] = js.native
  
  /**
    * When a layer contains sublayers, this property is a Collection of ListItem objects belonging to the given layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#children)
    */
  var children: js.UndefOr[CollectionProperties[ListItemProperties]] = js.native
  
  /**
    * Indicates if the children of a list item (or sublayers in a GroupLayer) can be sorted or moved/reordered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#childrenSortable)
    */
  var childrenSortable: js.UndefOr[Boolean] = js.native
  
  /**
    * The layer associated with the triggered action.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#layer)
    */
  var layer: js.UndefOr[LayerProperties] = js.native
  
  /**
    * Whether the layer is open in the LayerList.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#open)
    */
  var open: js.UndefOr[Boolean] = js.native
  
  /**
    * Allows you to display custom content for each ListItem in the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#panel)
    */
  var panel: js.UndefOr[ListItemPanel] = js.native
  
  /**
    * The parent of this item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#parent)
    */
  var parent: js.UndefOr[ListItemProperties] = js.native
  
  /**
    * Indicates if the list item (or layer in the map) can be sorted or moved/reordered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#sortable)
    */
  var sortable: js.UndefOr[Boolean] = js.native
  
  /**
    * The title of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#title)
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
  
  /**
    * Indicates if the ListItem is visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#visible)
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object ListItemProperties {
  
  @scala.inline
  def apply(): ListItemProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemProperties]
  }
  
  @scala.inline
  implicit class ListItemPropertiesMutableBuilder[Self <: ListItemProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionsOpen(value: Boolean): Self = StObject.set(x, "actionsOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsOpenUndefined: Self = StObject.set(x, "actionsOpen", js.undefined)
    
    @scala.inline
    def setActionsSections(
      value: (CollectionProperties[CollectionProperties[ActionButtonProperties | ActionToggleProperties]]) | js.Array[js.Array[_]]
    ): Self = StObject.set(x, "actionsSections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsSectionsUndefined: Self = StObject.set(x, "actionsSections", js.undefined)
    
    @scala.inline
    def setActionsSectionsVarargs(
      value: (js.Array[js.Any] | (CollectionProperties[ActionButtonProperties | ActionToggleProperties]))*
    ): Self = StObject.set(x, "actionsSections", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: CollectionProperties[ListItemProperties]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenSortable(value: Boolean): Self = StObject.set(x, "childrenSortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenSortableUndefined: Self = StObject.set(x, "childrenSortable", js.undefined)
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: ListItemProperties*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setLayer(value: LayerProperties): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    @scala.inline
    def setPanel(value: ListItemPanel): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanelUndefined: Self = StObject.set(x, "panel", js.undefined)
    
    @scala.inline
    def setParent(value: ListItemProperties): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
