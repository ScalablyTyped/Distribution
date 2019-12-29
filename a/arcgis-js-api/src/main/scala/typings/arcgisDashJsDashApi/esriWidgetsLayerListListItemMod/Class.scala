package typings.arcgisDashJsDashApi.esriWidgetsLayerListListItemMod

import typings.arcgisDashJsDashApi.__esri.ActionButton
import typings.arcgisDashJsDashApi.__esri.ActionToggle
import typings.arcgisDashJsDashApi.__esri.Collection
import typings.arcgisDashJsDashApi.__esri.Error
import typings.arcgisDashJsDashApi.__esri.Layer
import typings.arcgisDashJsDashApi.__esri.LayerView
import typings.arcgisDashJsDashApi.__esri.ListItem
import typings.arcgisDashJsDashApi.__esri.ListItemPanel
import typings.arcgisDashJsDashApi.__esri.MapView
import typings.arcgisDashJsDashApi.__esri.SceneView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/widgets/LayerList/ListItem", JSImport.Namespace)
@js.native
/**
  * The ListItem class represents one of the [operationalItems](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-LayerListViewModel.html#operationalItems) in the [LayerListViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-LayerListViewModel.html). In the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) widget UI, the list item represents a layer displayed in the view. It provides access to the associated layer's properties, allows the developer to configure actions related to the layer, and allows the developer to add content to the item related to the layer.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html)
  */
class Class () extends ListItem {
  /**
    * Whether the actional panel is open in the LayerList.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#actionsOpen)
    *
    * @default false
    */
  /* CompleteClass */
  override var actionsOpen: Boolean = js.native
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
  override var open: Boolean = js.native
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
  override var title: String = js.native
  /**
    * Value is `true` when the layer is updating; for example, if it is in the process of fetching data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#updating)
    *
    * @default false
    */
  /* CompleteClass */
  override val updating: Boolean = js.native
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
  override val visibilityMode: String = js.native
  /**
    * Indicates if the ListItem is visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#visible)
    *
    * @default true
    */
  /* CompleteClass */
  override var visible: Boolean = js.native
  /**
    * Whether the layer is visible at the current scale or not.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#visibleAtCurrentScale)
    *
    * @default true
    */
  /* CompleteClass */
  override val visibleAtCurrentScale: Boolean = js.native
}

