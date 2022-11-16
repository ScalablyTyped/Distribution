package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.connected
import typings.arcgisJsApi.arcgisJsApiStrings.disconnected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListItem
  extends StObject
     with Accessor
     with Identifiable {
  
  /**
    * Whether the actions panel is open in the LayerList.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#actionsOpen)
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
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#childrenSortable)
    */
  var childrenSortable: Boolean = js.native
  
  /**
    * Only valid when the list item represents a [StreamLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#connectionStatus)
    */
  val connectionStatus: connected | disconnected = js.native
  
  /**
    * The Error object returned if an error occurred.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#error)
    */
  val error: Error = js.native
  
  /**
    * When `true`, hides the layer from the LayerList instance.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#hidden)
    */
  var hidden: Boolean = js.native
  
  /**
    * The layer associated with the triggered action.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#layer)
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
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#open)
    */
  var open: Boolean = js.native
  
  /**
    * Allows you to display custom content for each ListItem in the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#panel)
    */
  var panel: ListItemPanel = js.native
  
  /**
    * The parent of this item
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#parent)
    */
  var parent: ListItem = js.native
  
  /**
    * Value is `true` when the [layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#layer) is being published.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#publishing)
    */
  val publishing: Boolean = js.native
  
  /**
    * Indicates if the list item (or layer in the map) can be sorted or moved/reordered.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#sortable)
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
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#updating)
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
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#visible)
    */
  var visible: Boolean = js.native
  
  /**
    * Whether the layer is visible at the current scale or not.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#visibleAtCurrentScale)
    */
  val visibleAtCurrentScale: Boolean = js.native
}
