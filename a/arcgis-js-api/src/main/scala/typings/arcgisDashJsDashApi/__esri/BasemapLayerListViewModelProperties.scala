package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasemapLayerListViewModelProperties extends js.Object {
  /**
    * A collection of [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html)s representing the [baseLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html#baseLayers).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList-BasemapLayerListViewModel.html#baseItems)
    */
  var baseItems: js.UndefOr[CollectionProperties[ListItem]] = js.undefined
  /**
    * Specifies a function that accesses each [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html). Each list item can be modified according to its modifiable properties. Actions can be added to list items using the [actionsSections](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#actionsSections) property of the ListItem.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList-BasemapLayerListViewModel.html#baseListItemCreatedFunction)
    */
  var baseListItemCreatedFunction: js.UndefOr[js.Function] = js.undefined
  /**
    * The current basemap's title.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList-BasemapLayerListViewModel.html#basemapTitle)
    */
  var basemapTitle: js.UndefOr[String] = js.undefined
  /**
    * A collection of [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html)s representing the [referenceLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html#referenceLayers).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList-BasemapLayerListViewModel.html#referenceItems)
    */
  var referenceItems: js.UndefOr[CollectionProperties[ListItem]] = js.undefined
  /**
    * Specifies a function that accesses each [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html) representing reference layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList-BasemapLayerListViewModel.html#referenceListItemCreatedFunction)
    */
  var referenceListItemCreatedFunction: js.UndefOr[js.Function] = js.undefined
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList-BasemapLayerListViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
}

object BasemapLayerListViewModelProperties {
  @scala.inline
  def apply(
    baseItems: CollectionProperties[ListItem] = null,
    baseListItemCreatedFunction: js.Function = null,
    basemapTitle: String = null,
    referenceItems: CollectionProperties[ListItem] = null,
    referenceListItemCreatedFunction: js.Function = null,
    view: MapViewProperties | SceneViewProperties = null
  ): BasemapLayerListViewModelProperties = {
    val __obj = js.Dynamic.literal()
    if (baseItems != null) __obj.updateDynamic("baseItems")(baseItems.asInstanceOf[js.Any])
    if (baseListItemCreatedFunction != null) __obj.updateDynamic("baseListItemCreatedFunction")(baseListItemCreatedFunction)
    if (basemapTitle != null) __obj.updateDynamic("basemapTitle")(basemapTitle)
    if (referenceItems != null) __obj.updateDynamic("referenceItems")(referenceItems.asInstanceOf[js.Any])
    if (referenceListItemCreatedFunction != null) __obj.updateDynamic("referenceListItemCreatedFunction")(referenceListItemCreatedFunction)
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasemapLayerListViewModelProperties]
  }
}

