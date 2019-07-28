package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`hide-children`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.hide
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SublayerProperties extends js.Object {
  /**
    * A SQL where clause used to filter features in the image. Only the features that satisfy the definition expression are displayed in the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html). Definition expressions may be set when a sublayer is constructed prior to it loading in the view or after it has been added to the MapImageLayer. To see if you can use this property, check the `supportsSublayerDefinitionExpression` property of [MapImageLayer.capabilities](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#capabilities).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#definitionExpression)
    */
  var definitionExpression: js.UndefOr[String] = js.undefined
  /**
    * The sublayer's layer ID. When a [source](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#source) is not defined on the layer, this value represents the id of the sublayer defined by the map service. If creating a [DynamicDataLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicDataLayer) or a [MapDataLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#MapDataLayer) and adding it to the [source](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#source) property of the sublayer, the value of this property can be anything set by the developer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#id)
    */
  var id: js.UndefOr[Double] = js.undefined
  /**
    * The label definition for this layer, specified as an array of [LabelClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html) objects. Use this property to specify labeling properties for the layer such as label expression, placement, and size.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#labelingInfo)
    */
  var labelingInfo: js.UndefOr[js.Array[LabelClassProperties]] = js.undefined
  /**
    * Indicates if labels for the sublayer will be visible in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#labelsVisible)
    *
    * @default true
    */
  var labelsVisible: js.UndefOr[Boolean] = js.undefined
  /**
    * The [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html) or [TileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html) to which the sublayer belongs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#layer)
    */
  var layer: js.UndefOr[MapImageLayerProperties | TileLayerProperties] = js.undefined
  /**
    * Indicates whether the layer will be included in the legend. When `false`, the layer will be excluded from the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#legendEnabled)
    *
    * @default true
    */
  var legendEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates how the layer should display in the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) widget. The possible values are listed below.
    *
    * Value | Description
    * ------|------------
    *  show | The layer is visible in the table of contents.
    *  hide | The layer is hidden in the table of contents.
    *  hide-children | Hide the children layers from the table of contents.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#listMode)
    *
    * @default show
    */
  var listMode: js.UndefOr[show | hide | `hide-children`] = js.undefined
  /**
    * The maximum scale (most zoomed in) at which the layer is visible in the view. If the map is zoomed in beyond this scale, the layer will not be visible. A value of `0` means the layer does not have a maximum scale. The maxScale value should always be smaller than the [minScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#minScale) value, and greater than or equal to the service specification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#maxScale)
    */
  var maxScale: js.UndefOr[Double] = js.undefined
  /**
    * The minimum scale (most zoomed out) at which the layer is visible in the view. If the map is zoomed out beyond this scale, the layer will not be visible. A value of `0` means the layer does not have a minimum scale. The minScale value should always be larger than the [maxScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#maxScale) value, and lesser than or equal to the service specification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#minScale)
    */
  var minScale: js.UndefOr[Double] = js.undefined
  /**
    * The level of opacity to set on the sublayer on a scale from 0.0 - 1.0 where `0` is fully transparent and `1.0` is fully opaque. If the [MapImageLayer.opacity](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#opacity) is set, the actual opacity value of the sublayer will be the value of [MapImageLayer.opacity](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#opacity) multiplied by the sublayer's opacity.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#opacity)
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /**
    * Indicates whether to display popups when features in the layer are clicked.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#popupEnabled)
    *
    * @default true
    */
  var popupEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The popup template for the sublayer. When set, the `popupTemplate` allows users to access attributes and display their values in the [view's popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#popup) when the user clicks the image.  Sublayers with a [RasterDataSource](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#RasterDataSource) cannot be queried and therefore do not support [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).
    * > **Known Limitations**
    *   * [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expressions are not supported in PopupTemplates set on MapImageLayer sublayers or TileLayer sublayers unless they reference ArcGIS Enterprise 10.6 map services (or later) created from ArcGIS Pro.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#popupTemplate)
    */
  var popupTemplate: js.UndefOr[PopupTemplateProperties] = js.undefined
  /**
    * The renderer to apply to the sublayer. This value overrides the renderer read from the map service. To see if you can use this property, check the `supportsDynamicLayers` property of [MapImageLayer.capabilities](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#capabilities).
    * > **Known Limitations**
    *   * [3D symbols](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3D.html) are not currently supported in renderers set on sublayers.
    *   * [Visual variables](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-SimpleRenderer.html#visualVariables) and [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expressions are not supported in renderers set on MapImageLayer sublayers unless they reference ArcGIS Enterprise 10.6 map services (or later) created from ArcGIS Pro.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#renderer)
    */
  var renderer: js.UndefOr[RendererProperties] = js.undefined
  /**
    * An object that allows you to create a dynamic layer with data either from the map service sublayers or data from a registered workspace. See [DynamicMapLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicMapLayer) for creating dynamic layers from map service layers for on the fly rendering, labeling, and filtering (definition expressions). To create dynamic layers from other sources in registered workspaces such as tables and table joins, see [DynamicDataLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicDataLayer).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#source)
    */
  var source: js.UndefOr[DynamicMapLayer | DynamicDataLayer] = js.undefined
  /**
    * If a sublayer contains sublayers, this property is a [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of [Sublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html) objects belonging to the given sublayer with sublayers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#sublayers)
    */
  var sublayers: js.UndefOr[CollectionProperties[SublayerProperties]] = js.undefined
  /**
    * The title of the sublayer used to identify it in places such as the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) and [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widgets. This value can be defined in the map service or programmatically by the developer. It can also be useful for finding a specific sublayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#title)
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * Indicates if the layer is visible in the view. To see if you can use this property, check the `supportsSublayerVisibility` property of [MapImageLayer.capabilities](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#capabilities).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#visible)
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object SublayerProperties {
  @scala.inline
  def apply(
    definitionExpression: String = null,
    id: Int | Double = null,
    labelingInfo: js.Array[LabelClassProperties] = null,
    labelsVisible: js.UndefOr[Boolean] = js.undefined,
    layer: MapImageLayerProperties | TileLayerProperties = null,
    legendEnabled: js.UndefOr[Boolean] = js.undefined,
    listMode: show | hide | `hide-children` = null,
    maxScale: Int | Double = null,
    minScale: Int | Double = null,
    opacity: Int | Double = null,
    popupEnabled: js.UndefOr[Boolean] = js.undefined,
    popupTemplate: PopupTemplateProperties = null,
    renderer: RendererProperties = null,
    source: DynamicMapLayer | DynamicDataLayer = null,
    sublayers: CollectionProperties[SublayerProperties] = null,
    title: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): SublayerProperties = {
    val __obj = js.Dynamic.literal()
    if (definitionExpression != null) __obj.updateDynamic("definitionExpression")(definitionExpression)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (labelingInfo != null) __obj.updateDynamic("labelingInfo")(labelingInfo)
    if (!js.isUndefined(labelsVisible)) __obj.updateDynamic("labelsVisible")(labelsVisible)
    if (layer != null) __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    if (!js.isUndefined(legendEnabled)) __obj.updateDynamic("legendEnabled")(legendEnabled)
    if (listMode != null) __obj.updateDynamic("listMode")(listMode.asInstanceOf[js.Any])
    if (maxScale != null) __obj.updateDynamic("maxScale")(maxScale.asInstanceOf[js.Any])
    if (minScale != null) __obj.updateDynamic("minScale")(minScale.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(popupEnabled)) __obj.updateDynamic("popupEnabled")(popupEnabled)
    if (popupTemplate != null) __obj.updateDynamic("popupTemplate")(popupTemplate)
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (sublayers != null) __obj.updateDynamic("sublayers")(sublayers.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[SublayerProperties]
  }
}

