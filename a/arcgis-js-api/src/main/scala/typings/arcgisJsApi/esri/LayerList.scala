package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`trigger-action`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayerList
  extends StObject
     with Widget_ {
  
  /**
  		 * The widget's default CSS icon class.
  		 *
  		 * @deprecated since 4.27. Use {@link module:esri/widgets/LayerList#icon icon} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#iconClass)
  		 */
  var iconClass: String = js.native
  
  /**
  		 * A function that executes each time a [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html) is created.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#listItemCreatedFunction)
  		 */
  def listItemCreatedFunction(event: Any): scala.Unit = js.native
  /**
  		 * A function that executes each time a [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html) is created.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#listItemCreatedFunction)
  		 */
  @JSName("listItemCreatedFunction")
  var listItemCreatedFunction_Original: LayerListListItemCreatedHandler = js.native
  
  /**
  		 * Indicates whether more than one list item may be selected by the user at a single time.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#multipleSelectionEnabled)
  		 */
  var multipleSelectionEnabled: Boolean = js.native
  
  @JSName("on")
  def on_triggeraction(name: `trigger-action`, eventHandler: LayerListTriggerActionEventHandler): IHandle = js.native
  
  /**
  		 * A collection of [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html)s representing operational layers.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#operationalItems)
  		 */
  val operationalItems: Collection[ListItem] = js.native
  
  /**
  		 * A collection of selected [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html)s representing operational layers selected by the user.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#selectedItems)
  		 */
  var selectedItems: Collection[ListItem] = js.native
  
  /**
  		 * Indicates whether list items may be selected by the user.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#selectionEnabled)
  		 */
  var selectionEnabled: Boolean = js.native
  
  /**
  		 * Triggers the [trigger-action](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#event-trigger-action) event and executes the given [action](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html) or [action toggle](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionToggle.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#triggerAction)
  		 */
  def triggerAction(action: ActionButton, item: ListItem): scala.Unit = js.native
  def triggerAction(action: ActionToggle, item: ListItem): scala.Unit = js.native
  
  /**
  		 * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#view)
  		 */
  var view: MapView | SceneView = js.native
  
  /**
  		 * The view model for this widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#viewModel)
  		 */
  var viewModel: LayerListViewModel = js.native
  
  /**
  		 * The visible elements that are displayed within the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#visibleElements)
  		 */
  var visibleElements: LayerListVisibleElements = js.native
}
