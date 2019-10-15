package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasemapLayerListViewModel extends Accessor {
  /**
    * A collection of [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html)s representing the [baseLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html#baseLayers).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList-BasemapLayerListViewModel.html#baseItems)
    */
  var baseItems: Collection[ListItem] = js.native
  /**
    * Specifies a function that accesses each [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html). Each list item can be modified according to its modifiable properties. Actions can be added to list items using the [actionsSections](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#actionsSections) property of the ListItem.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList-BasemapLayerListViewModel.html#baseListItemCreatedFunction)
    */
  var baseListItemCreatedFunction: js.Function = js.native
  /**
    * The current basemap's title.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList-BasemapLayerListViewModel.html#basemapTitle)
    */
  var basemapTitle: String = js.native
  /**
    * A collection of [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html)s representing the [referenceLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html#referenceLayers).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList-BasemapLayerListViewModel.html#referenceItems)
    */
  var referenceItems: Collection[ListItem] = js.native
  /**
    * Specifies a function that accesses each [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html) representing reference layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList-BasemapLayerListViewModel.html#referenceListItemCreatedFunction)
    */
  var referenceListItemCreatedFunction: js.Function = js.native
  /**
    * The view model's state.  **Possible Values:** ready | loading | disabled
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList-BasemapLayerListViewModel.html#state)
    *
    * @default disabled
    */
  val state: String = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList-BasemapLayerListViewModel.html#view)
    */
  var view: MapView | SceneView = js.native
  /**
    * Triggers the [trigger-action](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList-BasemapLayerListViewModel.html#event-trigger-action) event and executes the given [action](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html) or [action toggle](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionToggle.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList-BasemapLayerListViewModel.html#triggerAction)
    *
    * @param action The action to execute.
    * @param item An item associated with the action.
    *
    */
  def triggerAction(action: ActionButton, item: ListItem): Unit = js.native
  def triggerAction(action: ActionToggle, item: ListItem): Unit = js.native
}

@JSGlobal("__esri.BasemapLayerListViewModel")
@js.native
object BasemapLayerListViewModel extends TopLevel[BasemapLayerListViewModelConstructor]

