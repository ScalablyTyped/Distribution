package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListItemProperties extends js.Object {
  
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
  implicit class ListItemPropertiesOps[Self <: ListItemProperties] (val x: Self) extends AnyVal {
    
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
    def setActionsOpen(value: Boolean): Self = this.set("actionsOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionsOpen: Self = this.set("actionsOpen", js.undefined)
    
    @scala.inline
    def setActionsSectionsVarargs(
      value: (js.Array[js.Any] | (CollectionProperties[ActionButtonProperties | ActionToggleProperties]))*
    ): Self = this.set("actionsSections", js.Array(value :_*))
    
    @scala.inline
    def setActionsSections(
      value: (CollectionProperties[CollectionProperties[ActionButtonProperties | ActionToggleProperties]]) | js.Array[js.Array[_]]
    ): Self = this.set("actionsSections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionsSections: Self = this.set("actionsSections", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: ListItemProperties*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: CollectionProperties[ListItemProperties]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setChildrenSortable(value: Boolean): Self = this.set("childrenSortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildrenSortable: Self = this.set("childrenSortable", js.undefined)
    
    @scala.inline
    def setLayer(value: LayerProperties): Self = this.set("layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayer: Self = this.set("layer", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setPanel(value: ListItemPanel): Self = this.set("panel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePanel: Self = this.set("panel", js.undefined)
    
    @scala.inline
    def setParent(value: ListItemProperties): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setSortable(value: Boolean): Self = this.set("sortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortable: Self = this.set("sortable", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
