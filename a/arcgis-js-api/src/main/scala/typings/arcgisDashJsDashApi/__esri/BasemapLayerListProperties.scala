package typings.arcgisDashJsDashApi.__esri

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasemapLayerListProperties extends WidgetProperties {
  /**
    * A collection of [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html)s representing the [baseLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html#baseLayers).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html#baseItems)
    */
  var baseItems: js.UndefOr[CollectionProperties[ListItem]] = js.undefined
  /**
    * Specifies a function that accesses each [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html) representing a base layer. Each list item's modifiable properties can be updated within. Actions can be added to list items using the [actionsSections](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#actionsSections) property of the ListItem.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html#baseListItemCreatedFunction)
    */
  var baseListItemCreatedFunction: js.UndefOr[js.Function] = js.undefined
  /**
    * The current basemap's title.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html#basemapTitle)
    */
  var basemapTitle: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether the basemap’s title, layer order and layer grouping can be edited by the user. Any edits made will only be shown locally and will not be saved.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html#editingEnabled)
    *
    * @default false
    */
  var editingEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.undefined
  /**
    * A collection of [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html)s representing the [referenceLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html#referenceLayers).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html#referenceItems)
    */
  var referenceItems: js.UndefOr[CollectionProperties[ListItem]] = js.undefined
  /**
    * Specifies a function that accesses each [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html) representing a reference layer. Each list item's modifiable properties can be updated within. Actions can be added to list items using the [actionsSections](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#actionsSections) property of the ListItem.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html#referenceListItemCreatedFunction)
    */
  var referenceListItemCreatedFunction: js.UndefOr[js.Function] = js.undefined
  /**
    * Option for enabling status indicators, which indicate whether or not each layer is loading resources.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html#statusIndicatorsVisible)
    *
    * @default true
    */
  var statusIndicatorsVisible: js.UndefOr[Boolean] = js.undefined
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [BasemapLayerListViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList-BasemapLayerListViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html#viewModel)
    */
  var viewModel: js.UndefOr[BasemapLayerListViewModelProperties] = js.undefined
}

object BasemapLayerListProperties {
  @scala.inline
  def apply(
    baseItems: CollectionProperties[ListItem] = null,
    baseListItemCreatedFunction: js.Function = null,
    basemapTitle: String = null,
    container: String | HTMLElement = null,
    destroyed: js.UndefOr[Boolean] = js.undefined,
    editingEnabled: js.UndefOr[Boolean] = js.undefined,
    iconClass: String = null,
    id: String = null,
    label: String = null,
    referenceItems: CollectionProperties[ListItem] = null,
    referenceListItemCreatedFunction: js.Function = null,
    statusIndicatorsVisible: js.UndefOr[Boolean] = js.undefined,
    view: MapViewProperties | SceneViewProperties = null,
    viewModel: BasemapLayerListViewModelProperties = null
  ): BasemapLayerListProperties = {
    val __obj = js.Dynamic.literal()
    if (baseItems != null) __obj.updateDynamic("baseItems")(baseItems.asInstanceOf[js.Any])
    if (baseListItemCreatedFunction != null) __obj.updateDynamic("baseListItemCreatedFunction")(baseListItemCreatedFunction)
    if (basemapTitle != null) __obj.updateDynamic("basemapTitle")(basemapTitle)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyed)) __obj.updateDynamic("destroyed")(destroyed)
    if (!js.isUndefined(editingEnabled)) __obj.updateDynamic("editingEnabled")(editingEnabled)
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass)
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (referenceItems != null) __obj.updateDynamic("referenceItems")(referenceItems.asInstanceOf[js.Any])
    if (referenceListItemCreatedFunction != null) __obj.updateDynamic("referenceListItemCreatedFunction")(referenceListItemCreatedFunction)
    if (!js.isUndefined(statusIndicatorsVisible)) __obj.updateDynamic("statusIndicatorsVisible")(statusIndicatorsVisible)
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (viewModel != null) __obj.updateDynamic("viewModel")(viewModel)
    __obj.asInstanceOf[BasemapLayerListProperties]
  }
}

