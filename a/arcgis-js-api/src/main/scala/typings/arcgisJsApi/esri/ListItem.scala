package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItem extends js.Object {
  /**
    * Whether the actions panel is open in the LayerList.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#actionsOpen)
    *
    * @default false
    */
  var actionsOpen: Boolean = js.native
  /**
    * A nested 2-dimensional collection of actions that could be triggered on the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#actionsSections)
    */
  var actionsSections: Collection[Collection[ActionButton | ActionToggle]] = js.native
  /**
    * When a layer contains sublayers, this property is a Collection of ListItem objects belonging to the given layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#children)
    */
  var children: Collection[ListItem] = js.native
  /**
    * Indicates if the children of a list item (or sublayers in a GroupLayer) can be sorted or moved/reordered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#childrenSortable)
    *
    * @default true
    */
  var childrenSortable: Boolean = js.native
  /**
    * The Error object returned if an error occurred.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#error)
    */
  val error: Error = js.native
  /**
    * The layer associated with the triggered action.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#layer)
    *
    * @default null
    */
  var layer: Layer = js.native
  /**
    * The [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) displaying data for the associated [layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#layer).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#layerView)
    */
  val layerView: LayerView = js.native
  /**
    * Whether the layer is open in the LayerList.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#open)
    *
    * @default false
    */
  var open: Boolean = js.native
  /**
    * Allows you to display custom content for each ListItem in the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) widget.  A common scenario for using ListItemPanel is to display a [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widget within each list item. The `legend` keyword can be used in the [content](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html#content) property of the panel to display a legend for each layer in the LayerList.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#panel)
    */
  var panel: ListItemPanel = js.native
  /**
    * The parent of this item
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#parent)
    *
    * @default null
    */
  var parent: ListItem = js.native
  /**
    * Indicates if the list item (or layer in the map) can be sorted or moved/reordered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#sortable)
    *
    * @default true
    */
  var sortable: Boolean = js.native
  /**
    * The title of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#title)
    */
  var title: String = js.native
  /**
    * Value is `true` when the layer is updating; for example, if it is in the process of fetching data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#updating)
    *
    * @default false
    */
  val updating: Boolean = js.native
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#view)
    */
  var view: MapView | SceneView = js.native
  /**
    * Indicates how to manage the visibility of the children layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#visibilityMode)
    */
  val visibilityMode: String = js.native
  /**
    * Indicates if the ListItem is visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#visible)
    *
    * @default true
    */
  var visible: Boolean = js.native
  /**
    * Whether the layer is visible at the current scale or not.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#visibleAtCurrentScale)
    *
    * @default true
    */
  val visibleAtCurrentScale: Boolean = js.native
}

object ListItem {
  @scala.inline
  def apply(
    actionsOpen: Boolean,
    actionsSections: Collection[Collection[ActionButton | ActionToggle]],
    children: Collection[ListItem],
    childrenSortable: Boolean,
    error: Error,
    layer: Layer,
    layerView: LayerView,
    open: Boolean,
    panel: ListItemPanel,
    parent: ListItem,
    sortable: Boolean,
    title: String,
    updating: Boolean,
    view: MapView | SceneView,
    visibilityMode: String,
    visible: Boolean,
    visibleAtCurrentScale: Boolean
  ): ListItem = {
    val __obj = js.Dynamic.literal(actionsOpen = actionsOpen.asInstanceOf[js.Any], actionsSections = actionsSections.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], childrenSortable = childrenSortable.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], layerView = layerView.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], sortable = sortable.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updating = updating.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], visibilityMode = visibilityMode.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], visibleAtCurrentScale = visibleAtCurrentScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItem]
  }
  @scala.inline
  implicit class ListItemOps[Self <: ListItem] (val x: Self) extends AnyVal {
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
    def setActionsSections(value: Collection[Collection[ActionButton | ActionToggle]]): Self = this.set("actionsSections", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: Collection[ListItem]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildrenSortable(value: Boolean): Self = this.set("childrenSortable", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: Error): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayer(value: Layer): Self = this.set("layer", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayerView(value: LayerView): Self = this.set("layerView", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def setPanel(value: ListItemPanel): Self = this.set("panel", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: ListItem): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSortable(value: Boolean): Self = this.set("sortable", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdating(value: Boolean): Self = this.set("updating", value.asInstanceOf[js.Any])
    @scala.inline
    def setView(value: MapView | SceneView): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisibilityMode(value: String): Self = this.set("visibilityMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisibleAtCurrentScale(value: Boolean): Self = this.set("visibleAtCurrentScale", value.asInstanceOf[js.Any])
  }
  
}

