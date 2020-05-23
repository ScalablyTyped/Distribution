package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItem extends js.Object {
  /**
    * Whether the actional panel is open in the LayerList.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#actionsOpen)
    *
    * @default false
    */
  var actionsOpen: Boolean
  /**
    * A nested 2-dimensional collection of actions that could be triggered on the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#actionsSections)
    */
  var actionsSections: Collection[Collection[ActionButton | ActionToggle]]
  /**
    * When a layer contains sublayers, this property is a Collection of ListItem objects belonging to the given layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#children)
    */
  var children: Collection[ListItem]
  /**
    * The Error object returned if an error occurred.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#error)
    */
  val error: Error
  /**
    * The layer associated with the triggered action.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#layer)
    *
    * @default null
    */
  var layer: Layer
  /**
    * The [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) displaying data for the associated [layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#layer).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#layerView)
    */
  val layerView: LayerView
  /**
    * Whether the layer is open in the LayerList.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#open)
    *
    * @default false
    */
  var open: Boolean
  /**
    * Allows you to display custom content for each ListItem in the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) widget.  A common scenario for using ListItemPanel is to display a [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widget within each list item. The `legend` keyword can be used in the [content](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html#content) property of the panel to display a legend for each layer in the LayerList.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#panel)
    */
  var panel: ListItemPanel
  /**
    * The parent of this item
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#parent)
    *
    * @default null
    */
  var parent: ListItem
  /**
    * The title of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#title)
    */
  var title: String
  /**
    * Value is `true` when the layer is updating; for example, if it is in the process of fetching data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#updating)
    *
    * @default false
    */
  val updating: Boolean
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#view)
    */
  var view: MapView | SceneView
  /**
    * Indicates how to manage the visibility of the children layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#visibilityMode)
    */
  val visibilityMode: String
  /**
    * Indicates if the ListItem is visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#visible)
    *
    * @default true
    */
  var visible: Boolean
  /**
    * Whether the layer is visible at the current scale or not.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#visibleAtCurrentScale)
    *
    * @default true
    */
  val visibleAtCurrentScale: Boolean
}

object ListItem {
  @scala.inline
  def apply(
    actionsOpen: Boolean,
    actionsSections: Collection[Collection[ActionButton | ActionToggle]],
    children: Collection[ListItem],
    error: Error,
    layer: Layer,
    layerView: LayerView,
    open: Boolean,
    panel: ListItemPanel,
    parent: ListItem,
    title: String,
    updating: Boolean,
    view: MapView | SceneView,
    visibilityMode: String,
    visible: Boolean,
    visibleAtCurrentScale: Boolean
  ): ListItem = {
    val __obj = js.Dynamic.literal(actionsOpen = actionsOpen.asInstanceOf[js.Any], actionsSections = actionsSections.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], layerView = layerView.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updating = updating.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], visibilityMode = visibilityMode.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], visibleAtCurrentScale = visibleAtCurrentScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItem]
  }
}

