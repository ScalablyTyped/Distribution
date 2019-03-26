package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

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
  var actionsOpen: scala.Boolean
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
  var open: scala.Boolean
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
  var title: java.lang.String
  /**
    * Value is `true` when the layer is updating; for example, if it is in the process of fetching data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#updating)
    *
    * @default false
    */
  val updating: scala.Boolean
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
  val visibilityMode: java.lang.String
  /**
    * Indicates if the ListItem is visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#visible)
    *
    * @default true
    */
  var visible: scala.Boolean
  /**
    * Whether the layer is visible at the current scale or not.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#visibleAtCurrentScale)
    *
    * @default true
    */
  val visibleAtCurrentScale: scala.Boolean
}

@JSGlobal("__esri.ListItem")
@js.native
class ListItemCls () extends ListItem {
  /**
    * Whether the actional panel is open in the LayerList.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#actionsOpen)
    *
    * @default false
    */
  /* CompleteClass */
  override var actionsOpen: scala.Boolean = js.native
  /**
    * A nested 2-dimensional collection of actions that could be triggered on the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#actionsSections)
    */
  /* CompleteClass */
  override var actionsSections: Collection[Collection[ActionButton | ActionToggle]] = js.native
  /**
    * When a layer contains sublayers, this property is a Collection of ListItem objects belonging to the given layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#children)
    */
  /* CompleteClass */
  override var children: Collection[ListItem] = js.native
  /**
    * The Error object returned if an error occurred.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#error)
    */
  /* CompleteClass */
  override val error: Error = js.native
  /**
    * The layer associated with the triggered action.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#layer)
    *
    * @default null
    */
  /* CompleteClass */
  override var layer: Layer = js.native
  /**
    * The [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) displaying data for the associated [layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#layer).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#layerView)
    */
  /* CompleteClass */
  override val layerView: LayerView = js.native
  /**
    * Whether the layer is open in the LayerList.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#open)
    *
    * @default false
    */
  /* CompleteClass */
  override var open: scala.Boolean = js.native
  /**
    * Allows you to display custom content for each ListItem in the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) widget.  A common scenario for using ListItemPanel is to display a [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widget within each list item. The `legend` keyword can be used in the [content](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html#content) property of the panel to display a legend for each layer in the LayerList.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#panel)
    */
  /* CompleteClass */
  override var panel: ListItemPanel = js.native
  /**
    * The parent of this item
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#parent)
    *
    * @default null
    */
  /* CompleteClass */
  override var parent: ListItem = js.native
  /**
    * The title of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#title)
    */
  /* CompleteClass */
  override var title: java.lang.String = js.native
  /**
    * Value is `true` when the layer is updating; for example, if it is in the process of fetching data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#updating)
    *
    * @default false
    */
  /* CompleteClass */
  override val updating: scala.Boolean = js.native
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#view)
    */
  /* CompleteClass */
  override var view: MapView | SceneView = js.native
  /**
    * Indicates how to manage the visibility of the children layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#visibilityMode)
    */
  /* CompleteClass */
  override val visibilityMode: java.lang.String = js.native
  /**
    * Indicates if the ListItem is visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#visible)
    *
    * @default true
    */
  /* CompleteClass */
  override var visible: scala.Boolean = js.native
  /**
    * Whether the layer is visible at the current scale or not.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#visibleAtCurrentScale)
    *
    * @default true
    */
  /* CompleteClass */
  override val visibleAtCurrentScale: scala.Boolean = js.native
}

object ListItem {
  @scala.inline
  def apply(
    actionsOpen: scala.Boolean,
    actionsSections: Collection[Collection[ActionButton | ActionToggle]],
    children: Collection[ListItem],
    clone: () => ListItem,
    error: Error,
    layer: Layer,
    layerView: LayerView,
    open: scala.Boolean,
    panel: ListItemPanel,
    parent: ListItem,
    title: java.lang.String,
    updating: scala.Boolean,
    view: MapView | SceneView,
    visibilityMode: java.lang.String,
    visible: scala.Boolean,
    visibleAtCurrentScale: scala.Boolean
  ): ListItem = {
    val __obj = js.Dynamic.literal(actionsOpen = actionsOpen, actionsSections = actionsSections, children = children, clone = js.Any.fromFunction0(clone), error = error, layer = layer, layerView = layerView, open = open, panel = panel, parent = parent, title = title, updating = updating, view = view.asInstanceOf[js.Any], visibilityMode = visibilityMode, visible = visible, visibleAtCurrentScale = visibleAtCurrentScale)
  
    __obj.asInstanceOf[ListItem]
  }
}

