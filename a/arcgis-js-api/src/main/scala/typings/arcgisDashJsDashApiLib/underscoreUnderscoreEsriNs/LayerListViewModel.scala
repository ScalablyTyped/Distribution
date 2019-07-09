package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

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
    * The view model's state.  **Possible Values:** loading | disabled
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-LayerListViewModel.html#state)
    *
    * @default disabled
    */
  val state: java.lang.String = js.native
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-LayerListViewModel.html#view)
    */
  var view: MapView | SceneView = js.native
  /**
    * Triggers the [trigger-action](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-LayerListViewModel.html#event-trigger-action) event and executes the given [action](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html) or [action toggle](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionToggle.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-LayerListViewModel.html#triggerAction)
    *
    * @param action The action to execute.
    * @param item An item associated with the action.
    *
    */
  def triggerAction(action: ActionButton, item: ListItem): scala.Unit = js.native
  def triggerAction(action: ActionToggle, item: ListItem): scala.Unit = js.native
}

@JSGlobal("__esri.LayerListViewModel")
@js.native
class LayerListViewModelCls () extends LayerListViewModel {
  def this(properties: LayerListViewModelProperties) = this()
}

