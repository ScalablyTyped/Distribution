package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`trigger-action`
import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.loading
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayerListViewModel
  extends StObject
     with Accessor {
  
  /**
  		 * Whether to provide an indication if a layer is being published in the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html).
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-LayerListViewModel.html#checkPublishStatusEnabled)
  		 */
  var checkPublishStatusEnabled: Boolean = js.native
  
  /**
  		 * Specifies a function that accesses each [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-LayerListViewModel.html#listItemCreatedFunction)
  		 */
  def listItemCreatedFunction(event: Any): scala.Unit = js.native
  /**
  		 * Specifies a function that accesses each [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-LayerListViewModel.html#listItemCreatedFunction)
  		 */
  @JSName("listItemCreatedFunction")
  var listItemCreatedFunction_Original: LayerListListItemCreatedHandler = js.native
  
  /**
  		 * Moves a list item from one position to another in the LayerList widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-LayerListViewModel.html#moveListItem)
  		 */
  def moveListItem(targetItem: ListItem, fromParentItem: ListItem, toParentItem: ListItem, newIndex: Double): scala.Unit = js.native
  
  @JSName("on")
  def on_triggeraction(name: `trigger-action`, eventHandler: LayerListViewModelTriggerActionEventHandler): IHandle = js.native
  
  /**
  		 * A collection of [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html)s representing operational layers.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-LayerListViewModel.html#operationalItems)
  		 */
  val operationalItems: Collection[ListItem] = js.native
  
  /**
  		 * The view model's state.
  		 *
  		 * @default disabled
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-LayerListViewModel.html#state)
  		 */
  val state: loading | ready | disabled = js.native
  
  /**
  		 * Triggers the [trigger-action](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-LayerListViewModel.html#event-trigger-action) event and executes the given [action](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html) or [action toggle](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionToggle.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-LayerListViewModel.html#triggerAction)
  		 */
  def triggerAction(action: ActionButton, item: ListItem): scala.Unit = js.native
  def triggerAction(action: ActionToggle, item: ListItem): scala.Unit = js.native
  
  /**
  		 * The view from which the widget will operate.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-LayerListViewModel.html#view)
  		 */
  var view: MapView | SceneView = js.native
}
