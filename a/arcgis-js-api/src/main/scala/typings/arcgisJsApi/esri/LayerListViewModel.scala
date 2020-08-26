package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`trigger-action`
import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.loading
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerListViewModel extends Accessor {
  /**
    * Specifies a function that accesses each [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html). Each list item can be modified according to its modifiable propeties. Actions can be added to list items using the [actionsSections](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#actionsSections) property of the ListItem.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-LayerListViewModel.html#listItemCreatedFunction)
    */
  var listItemCreatedFunction: js.Function = js.native
  /**
    * A collection of [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html)s representing operational layers. To hide layers from the LayerList widget, set the [listMode](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#listMode) property on the layer(s) to `hide`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-LayerListViewModel.html#operationalItems)
    */
  val operationalItems: Collection[ListItem] = js.native
  /**
    * The view model's state.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-LayerListViewModel.html#state)
    *
    * @default disabled
    */
  val state: loading | disabled = js.native
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-LayerListViewModel.html#view)
    */
  var view: MapView | SceneView = js.native
  /**
    * Moves a list item from one position to another in the LayerList widget. This allows the user to reorder the operational layers in a map or even reorganize sublayers of [GroupLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html). You cannot move a GroupLayer as a sublayer to another GroupLayer. You also cannot move MapImageLayer sublayers outside of a MapImageLayer.  For the purposes of the documentation below, an item (or list item) refers to a layer in a map. A parent item refers to a GroupLayer or MapImageLayer, and a child item refers to a sublayer of a GroupLayer or MapImageLayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-LayerListViewModel.html#moveListItem)
    *
    * @param targetItem The list item (or layer) to move.
    * @param fromParentItem If the `targetItem` is a child of a parent list item and you want to move it out of the parentItem, then use this parameter to indicate the parent item to move from.
    * @param toParentItem The parent list item to move the `targetItem` to if moving it as a child to another parent item.
    * @param newIndex The new index to move the `targetItem` to. If moving the item as a child to a parent item, then specify the index of the item within that parent.
    *
    */
  def moveListItem(targetItem: ListItem, fromParentItem: ListItem, toParentItem: ListItem, newIndex: Double): Unit = js.native
  @JSName("on")
  def on_triggeraction(name: `trigger-action`, eventHandler: LayerListViewModelTriggerActionEventHandler): IHandle = js.native
  /**
    * Triggers the [trigger-action](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-LayerListViewModel.html#event-trigger-action) event and executes the given [action](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html) or [action toggle](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionToggle.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-LayerListViewModel.html#triggerAction)
    *
    * @param action The action to execute.
    * @param item An item associated with the action.
    *
    */
  def triggerAction(action: ActionButton, item: ListItem): Unit = js.native
  def triggerAction(action: ActionToggle, item: ListItem): Unit = js.native
}

