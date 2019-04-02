package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sublayer extends Accessor {
  /**
    * A SQL where clause used to filter features in the image. Only the features that satisfy the definition expression are displayed in the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html). Definition expressions may be set when a sublayer is constructed prior to it loading in the view or after it has been added to the MapImageLayer. To see if you can use this property, check the `supportsSublayerDefinitionExpression` property of [MapImageLayer.capabilities](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#capabilities).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#definitionExpression)
    */
  var definitionExpression: java.lang.String = js.native
  /**
    * The sublayer's layer ID. When a [source](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#source) is not defined on the layer, this value represents the id of the sublayer defined by the map service. If creating a [DynamicDataLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicDataLayer) or a [MapDataLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#MapDataLayer) and adding it to the [source](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#source) property of the sublayer, the value of this property can be anything set by the developer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#id)
    */
  var id: scala.Double = js.native
  /**
    * The label definition for this layer, specified as an array of [LabelClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html) objects. Use this property to specify labeling properties for the layer such as label expression, placement, and size.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#labelingInfo)
    */
  var labelingInfo: js.Array[LabelClass] = js.native
  /**
    * Indicates if labels for the sublayer will be visible in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#labelsVisible)
    *
    * @default true
    */
  var labelsVisible: scala.Boolean = js.native
  /**
    * The [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html) or [TileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html) to which the sublayer belongs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#layer)
    */
  var layer: MapImageLayer | TileLayer = js.native
  /**
    * Indicates whether the layer will be included in the legend. When `false`, the layer will be excluded from the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#legendEnabled)
    *
    * @default true
    */
  var legendEnabled: scala.Boolean = js.native
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
  var listMode: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.show | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.hide | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`hide-children` = js.native
  /**
    * The maximum scale (most zoomed in) at which the layer is visible in the view. If the map is zoomed in beyond this scale, the layer will not be visible. A value of `0` means the layer does not have a maximum scale. The maxScale value should always be smaller than the [minScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#minScale) value, and greater than or equal to the service specification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#maxScale)
    */
  var maxScale: scala.Double = js.native
  /**
    * The minimum scale (most zoomed out) at which the layer is visible in the view. If the map is zoomed out beyond this scale, the layer will not be visible. A value of `0` means the layer does not have a minimum scale. The minScale value should always be larger than the [maxScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#maxScale) value, and lesser than or equal to the service specification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#minScale)
    */
  var minScale: scala.Double = js.native
  /**
    * The level of opacity to set on the sublayer on a scale from 0.0 - 1.0 where `0` is fully transparent and `1.0` is fully opaque. If the [MapImageLayer.opacity](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#opacity) is set, the actual opacity value of the sublayer will be the value of [MapImageLayer.opacity](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#opacity) multiplied by the sublayer's opacity.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#opacity)
    */
  var opacity: scala.Double = js.native
  /**
    * Indicates whether to display popups when features in the layer are clicked.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#popupEnabled)
    *
    * @default true
    */
  var popupEnabled: scala.Boolean = js.native
  /**
    * The popup template for the sublayer. When set, the `popupTemplate` allows users to access attributes and display their values in the [view's popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#popup) when the user clicks the image.  Sublayers with a [RasterDataSource](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#RasterDataSource) cannot be queried and therefore do not support [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).
    * > **Known Limitations**
    *   * [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expressions are not supported in PopupTemplates set on MapImageLayer sublayers or TileLayer sublayers unless they reference ArcGIS Enterprise 10.6 map services (or later) created from ArcGIS Pro.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#popupTemplate)
    */
  var popupTemplate: PopupTemplate = js.native
  /**
    * The renderer to apply to the sublayer. This value overrides the renderer read from the map service. To see if you can use this property, check the `supportsDynamicLayers` property of [MapImageLayer.capabilities](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#capabilities).
    * > **Known Limitations**
    *   * [3D symbols](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3D.html) are not currently supported in renderers set on sublayers.
    *   * [Visual variables](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-SimpleRenderer.html#visualVariables) and [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expressions are not supported in renderers set on MapImageLayer sublayers unless they reference ArcGIS Enterprise 10.6 map services (or later) created from ArcGIS Pro.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#renderer)
    */
  var renderer: Renderer = js.native
  /**
    * An object that allows you to create a dynamic layer with data either from the map service sublayers or data from a registered workspace. See [DynamicMapLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicMapLayer) for creating dynamic layers from map service layers for on the fly rendering, labeling, and filtering (definition expressions). To create dynamic layers from other sources in registered workspaces such as tables and table joins, see [DynamicDataLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicDataLayer).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#source)
    */
  var source: DynamicMapLayer | DynamicDataLayer = js.native
  /**
    * If a sublayer contains sublayers, this property is a [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of [Sublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html) objects belonging to the given sublayer with sublayers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#sublayers)
    */
  var sublayers: Collection[Sublayer] = js.native
  /**
    * The title of the sublayer used to identify it in places such as the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) and [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widgets. This value can be defined in the map service or programmatically by the developer. It can also be useful for finding a specific sublayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#title)
    */
  var title: java.lang.String = js.native
  /**
    * The URL to the REST endpoint of the sublayer. This allows you to view the schema of fields and query tables located in registered workspaces.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#url)
    */
  val url: java.lang.String = js.native
  /**
    * Indicates if the layer is visible in the view. To see if you can use this property, check the `supportsSublayerVisibility` property of [MapImageLayer.capabilities](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#capabilities).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#visible)
    */
  var visible: scala.Boolean = js.native
  /**
    * A convenient method for creating a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) instance based on the Sublayer's configuration, including [dynamic sources](https://enterprise.arcgis.com/en/server/latest/publish-services/linux/about-dynamic-layers.htm). This allows you to take advantage of FeatureLayer capabilities not supported in Sublayer, such as the [Smart Mapping creator functions](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#createFeatureLayer)
    *
    *
    */
  def createFeatureLayer(): arcgisDashJsDashApiLib.IPromise[FeatureLayer] = js.native
  /**
    * Creates a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) object with default values representing the layer's state, including filters (definition expression) on the layer's features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#createQuery)
    *
    *
    */
  def createQuery(): Query = js.native
  /**
    * Executes a [query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-QueryTask.html) against features in the sublayer. To see if you can use this property, check the `supportsQuery` property of [MapImageLayer.capabilities](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#capabilities).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#queryFeatures)
    *
    * @param params Specifies the attributes and spatial filter of the query. If no parameters are specified, then all features satisfying the layer's configuration/filters are returned.
    *
    */
  def queryFeatures(): arcgisDashJsDashApiLib.IPromise[FeatureSet] = js.native
  def queryFeatures(params: Query): arcgisDashJsDashApiLib.IPromise[FeatureSet] = js.native
  def queryFeatures(params: QueryProperties): arcgisDashJsDashApiLib.IPromise[FeatureSet] = js.native
}

@JSGlobal("__esri.Sublayer")
@js.native
/**
  * Represents a sublayer in a [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html) or a [TileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html). MapImageLayer allows you to display, query, and analyze layers from data defined in a [map service](http://server.arcgis.com/en/server/latest/publish-services/windows/what-is-a-map-service.htm). Map services contain sublayers with properties such as [renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#renderer), [labelingInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#labelingInfo), and [definitionExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#definitionExpression), and others that are defined on the server. The properties of each MapImageLayer sublayer on the map service may be dynamically changed by the user or developer. The properties of each TileLayer sublayer are read-only, and cannot be modified.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html)
  */
class SublayerCls () extends Sublayer {
  def this(properties: SublayerProperties) = this()
}

