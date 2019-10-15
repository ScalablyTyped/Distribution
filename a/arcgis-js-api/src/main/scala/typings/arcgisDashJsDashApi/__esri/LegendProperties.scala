package typings.arcgisDashJsDashApi.__esri

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendProperties extends WidgetProperties {
  /**
    * Collection of [ActiveLayerInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html) objects used by the legend view to display data in the legend. The legend widget watches this property to hide or display the layer's legend when an [ActiveLayerInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html) is removed from or added to this collection.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#activeLayerInfos)
    */
  var activeLayerInfos: js.UndefOr[CollectionProperties[ActiveLayerInfoProperties]] = js.undefined
  /**
    * Indicates whether to show the [Basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html) layers in the Legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#basemapLegendVisible)
    *
    * @default false
    */
  var basemapLegendVisible: js.UndefOr[Boolean] = js.undefined
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.undefined
  /**
    * Specifies a subset of the layers to display in the legend. If this property is not set, all layers in the map will display in the legend. Objects in this array are defined with the properties listed below.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#layerInfos)
    */
  var layerInfos: js.UndefOr[js.Array[LegendLayerInfos]] = js.undefined
  /**
    * Determines whether to respect the properties of the layers in the map that control the legend's visibility (`minScale`, `maxScale`, `legendEnabled`). By default, a layer's legend elements **will not render** in the legend given the following conditions:
    *   * The layer's [legendEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#legendEnabled) property is set to `false`.
    *   * If the view's scale is outside the visibility range defined by the layer's [minScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#minScale) and [maxScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#maxScale) properties.
    *
    *
    * When the `respectLayerVisibility` property of the legend is set to `false`, the legend elements for each layer in the map will always display, thus disregarding the `minScale`, `maxScale`, and `legendEnabled` properties for each layer in the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#respectLayerVisibility)
    *
    * @default true
    */
  var respectLayerVisibility: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates the style of the legend. The style determines the legend's layout and behavior. You can either specify a string or an object to indicate the style. The known string values are the same values listed in the table within the `type` property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#style)
    *
    * @default classic
    */
  var style: js.UndefOr[String | LegendStyle] = js.undefined
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [LegendViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-LegendViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#viewModel)
    */
  var viewModel: js.UndefOr[LegendViewModelProperties] = js.undefined
}

object LegendProperties {
  @scala.inline
  def apply(
    activeLayerInfos: CollectionProperties[ActiveLayerInfoProperties] = null,
    basemapLegendVisible: js.UndefOr[Boolean] = js.undefined,
    container: String | HTMLElement = null,
    destroyed: js.UndefOr[Boolean] = js.undefined,
    iconClass: String = null,
    id: String = null,
    label: String = null,
    layerInfos: js.Array[LegendLayerInfos] = null,
    respectLayerVisibility: js.UndefOr[Boolean] = js.undefined,
    style: String | LegendStyle = null,
    view: MapViewProperties | SceneViewProperties = null,
    viewModel: LegendViewModelProperties = null
  ): LegendProperties = {
    val __obj = js.Dynamic.literal()
    if (activeLayerInfos != null) __obj.updateDynamic("activeLayerInfos")(activeLayerInfos.asInstanceOf[js.Any])
    if (!js.isUndefined(basemapLegendVisible)) __obj.updateDynamic("basemapLegendVisible")(basemapLegendVisible)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyed)) __obj.updateDynamic("destroyed")(destroyed)
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass)
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (layerInfos != null) __obj.updateDynamic("layerInfos")(layerInfos)
    if (!js.isUndefined(respectLayerVisibility)) __obj.updateDynamic("respectLayerVisibility")(respectLayerVisibility)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (viewModel != null) __obj.updateDynamic("viewModel")(viewModel)
    __obj.asInstanceOf[LegendProperties]
  }
}

