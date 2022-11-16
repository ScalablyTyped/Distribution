package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`trigger-action`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableList
  extends StObject
     with Widget_ {
  
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList.html#iconClass)
    */
  var iconClass: String = js.native
  
  /**
    * Specifies a function that accesses each [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-ListItem.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList.html#listItemCreatedFunction)
    */
  def listItemCreatedFunction(event: Any): scala.Unit = js.native
  /**
    * Specifies a function that accesses each [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-ListItem.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList.html#listItemCreatedFunction)
    */
  @JSName("listItemCreatedFunction")
  var listItemCreatedFunction_Original: TableListListItemCreatedHandler = js.native
  
  /**
    * A reference to a [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) containing the tables.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList.html#map)
    */
  var map: Map | WebMap = js.native
  
  /**
    * Indicates whether more than one [list item](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-ListItem.html) can be selected by a user at a single time.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList.html#multipleSelectionEnabled)
    */
  var multipleSelectionEnabled: Boolean = js.native
  
  @JSName("on")
  def on_triggeraction(name: `trigger-action`, eventHandler: TableListTriggerActionEventHandler): IHandle = js.native
  
  /**
    * A collection of selected [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-ListItem.html)s representing table list items selected by the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList.html#selectedItems)
    */
  var selectedItems: Collection[TableListListItem] = js.native
  
  /**
    * Indicates whether [list items](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-ListItem.html) may be selected by the user.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList.html#selectionEnabled)
    */
  var selectionEnabled: Boolean = js.native
  
  /**
    * The collection of table [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-ListItem.html)s displayed within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList.html#tableItems)
    */
  val tableItems: Collection[TableListListItem] = js.native
  
  /**
    * Triggers the [trigger-action](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList.html#event-trigger-action) event and executes the given [action](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html) or [action toggle](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionToggle.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList.html#triggerAction)
    */
  def triggerAction(action: ActionButton, item: TableListListItem): scala.Unit = js.native
  def triggerAction(action: ActionToggle, item: TableListListItem): scala.Unit = js.native
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList.html#viewModel)
    */
  var viewModel: TableListViewModel = js.native
  
  /**
    * The visible elements that are displayed within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList.html#visibleElements)
    */
  var visibleElements: TableListVisibleElements = js.native
}
