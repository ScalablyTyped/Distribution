package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SceneLayer
  extends Layer
     with SceneService
     with PortalLayer
     with ScaleRangeLayer {
  /**
    * The SQL where clause used to filter features on the client. Only the features that satisfy the definition expression are displayed in the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html). Setting a definition expression is useful when only a subset of the data in the layer should be displayed.  Setting the definition expression of a layer automatically updates all layer views.  If the definition expression is set after the layer has been added to the map, the view will automatically refresh itself to display the features that satisfy the new definition expression.  Important to note is that the initial loading time of the features remains unchanged, even if they are filtered. This happens because, as opposed to Feature Layers, feature filtering is done client-side. As a result all features need to be downloaded always for filter evaluation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#definitionExpression)
    */
  var definitionExpression: java.lang.String = js.native
  /**
    * Specifies how graphics are placed on the vertical axis (z). See the [ElevationInfo sample](https://developers.arcgis.com/javascript/latest/sample-code/scene-elevationinfo/index.html) for an example of how this property may be used.  This property only affects 3D Object [SceneLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html) when using the `absolute-height` mode. [SceneLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html) with [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometries support all the elevation modes listed below.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#elevationInfo)
    */
  var elevationInfo: SceneLayerElevationInfo = js.native
  /**
    * Configures the method for decluttering overlapping features in the view. If this property is not set (or set to `null`), every feature is drawn individually.  This property is only supported for point scene layers with non-draped [Icon](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html) or [Text](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html) symbol layers.  [![declutter](https://developers.arcgis.com/javascript/assets/img/samples/city-points-declutter.gif)](https://developers.arcgis.com/javascript/latest/sample-code/visualization-point-styles/index.html)
    * > **Known Limitation**  When applying featureReduction on a point SceneLayer layer updates are slow. This will be addressed in upcoming releases.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#featureReduction)
    */
  var featureReduction: SceneLayerFeatureReduction = js.native
  /**
    * An array of fields accessible in the layer. Depending on the scene service, fields may have limited support for certain capabilities. Use [getFieldUsageInfo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#getFieldUsageInfo) to query the contexts (rendering, labeling, popups or querying) for which a particular field may be used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#fields)
    */
  val fields: js.Array[Field] = js.native
  /**
    * A convenient property that can be used to make case-insensitive lookups for a field by name. It can also provide a list of the [date fields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FieldsIndex.html#dateFields) in a layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#fieldsIndex)
    */
  val fieldsIndex: FieldsIndex = js.native
  /**
    * The geometry type of features in the layer.  **Possible Values:** point | mesh
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#geometryType)
    */
  var geometryType: java.lang.String = js.native
  /**
    * The label definition for this layer, specified as an array of [LabelClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html). Use this property to specify labeling properties for the layer such as label expression, placement, and size.
    * > **Known Limitations**  This property is only relevant to SceneLayers with [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometries. This property has no effect on SceneLayers with other geometry types.  Each point can have only one label. Multiple [Label classes](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html) with different [where](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#where) clauses can be used to have different label styles on different features that belong to the same layer (for example blue labels for lakes and green labels for parks).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#labelingInfo)
    */
  var labelingInfo: js.Array[LabelClass] = js.native
  /**
    * Indicates whether to display labels for this layer. If `true`, labels will appear as defined in the [labelingInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#labelingInfo) property.  This property is only relevant to SceneLayers with [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometries. This property has no effect on SceneLayers with other geometry types.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#labelsVisible)
    *
    * @default true
    */
  var labelsVisible: scala.Boolean = js.native
  /**
    * Indicates whether the layer will be included in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#legendEnabled)
    *
    * @default true
    */
  var legendEnabled: scala.Boolean = js.native
  /**
    * The name of the field containing each graphic's Object ID. If this is not explicitly specified, this is automatically derived from the [fields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#fields) of the service by taking the first field of type `oid`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#objectIdField)
    */
  var objectIdField: java.lang.String = js.native
  /**
    * An array of field names from the service to include with each feature. To fetch the values from all fields in the layer, use `["*"]`. Fields specified in `outFields` will be requested alongside with required fields for [rendering](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#renderer), [labeling](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#labelingInfo) and setting the [elevation info](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#elevationInfo) for the layer. The required fields and `outFields` are used to populate [SceneLayerView.availableFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#availableFields). Set this property to include the fields that will be used for client-side [queries](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#queryFeatures) if the fields are not part of required fields used for rendering.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#outFields)
    *
    * @default null
    */
  var outFields: js.Array[java.lang.String] = js.native
  /**
    * Indicates whether to display popups when features in the layer are clicked. The layer needs to have a [popupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#popupTemplate) to define what information should be displayed in the popup. Alternatively, a default popup template may be automatically used if [Popup.defaultPopupTemplateEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#defaultPopupTemplateEnabled) is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#popupEnabled)
    *
    * @default true
    */
  var popupEnabled: scala.Boolean = js.native
  /**
    * The popup template for the layer. When set on the layer, the `popupTemplate` allows users to access attributes and display their values in the [view's popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#popup) when a feature is selected using text and/or charts. See the [PopupTemplate sample](https://developers.arcgis.com/javascript/latest/sample-code/intro-popuptemplate/index.html) for an example of how [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) interacts with a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html). Setting a [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) on this layer type is done in the same way as a FeatureLayer.  A default popup template is automatically used if no `popupTemplate` has been defined when [Popup.defaultPopupTemplateEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#defaultPopupTemplateEnabled) is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#popupTemplate)
    */
  var popupTemplate: PopupTemplate = js.native
  /**
    * The renderer assigned to the layer. The renderer defines how to visualize each feature in the layer. Depending on the renderer type, features may be visualized with the same symbol, or with varying symbols based on the values of provided attribute fields or functions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#renderer)
    */
  var renderer: Renderer = js.native
  /**
    * Apply perspective scaling to screen-size point symbols in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). When `true`, screen sized objects such as [icons](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html), [labels](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html) or [callouts](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-Callout3D.html) integrate better in the 3D scene by applying a certain perspective projection to the sizing of features. This only applies when using a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).  `layer.screenSizePerspectiveEnabled = true`  ![screen-size-perspective](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-screenSize-perspective.png)  `layer.screenSizePerspectiveEnabled = false`  ![no-screen-size-perspective](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-no-screenSize-perspective.png)
    * > **Known Limitations**  Screen size perspective is currently not optimized for situations where the camera is very near the ground, or for scenes with point features located far from the ground surface. In these cases it may be better to turn off screen size perspective. As screen size perspective changes the size based on distance to the camera, it should be set to false when using {@link module:esri/renderers/Renderer#SizeVisualVariable size visual variables}.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#screenSizePerspectiveEnabled)
    *
    * @default true
    */
  var screenSizePerspectiveEnabled: scala.Boolean = js.native
  /**
    * Creates a default popup template for the layer, populated with all the fields of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#createPopupTemplate)
    *
    * @param options Options for creating the popup template.
    * @param options.maximumFields The maximum number of fields to include in the popup template.
    * @param options.ignoreFieldTypes Field types to ignore when creating the popup. By default the `geometry`, `blob`, `raster`, `guid` and `xml` field types are ignored.
    *
    */
  def createPopupTemplate(): PopupTemplate = js.native
  def createPopupTemplate(options: SceneLayerCreatePopupTemplateOptions): PopupTemplate = js.native
  /**
    * Creates a query object that can be used to fetch features that satisfy the layer's current definition expression. The query should only be used on the layer and not on the layer view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#createQuery)
    *
    *
    */
  def createQuery(): Query = js.native
  /**
    * Returns the [Field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html) instance for a field name (case-insensitive).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#getField)
    *
    * @param fieldName Name of the field.
    *
    */
  def getField(fieldName: java.lang.String): Field = js.native
  /**
    * Returns the [Domain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html) associated with the given field name. The domain can be either a [CodedValueDomain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-CodedValueDomain.html) or [RangeDomain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RangeDomain.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#getFieldDomain)
    *
    * @param fieldName Name of the field.
    *
    */
  def getFieldDomain(fieldName: java.lang.String): Domain = js.native
  /**
    * Gets field usage information. The usage of a field depends on whether it is stored as part of the scene service cache. The returned object contains the following usage information:
    *
    * Property              | Type    | Description
    * ----------------------|---------|------------
    * supportsRenderer      | boolean | Indicates that a field can be used in a renderer (e.g. in visual variables), [see renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#renderer).
    * supportsLabelingInfo  | boolean | Indicates that a field can be used for labeling, [see labelingInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#labelingInfo).
    * supportsPopupTemplate | boolean | Indicates that a field can be used in a popup template, [see popupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#popupTemplate).
    * supportsLayerQuery    | boolean | Indicates that a field can be used in layer queries, [see queryFeatures()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#queryFeatures).
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#getFieldUsageInfo)
    *
    * @param fieldName The name of the field to get usage info for.
    *
    */
  def getFieldUsageInfo(fieldName: java.lang.String): js.Any = js.native
  @JSName("on")
  def on_layerviewcreate(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`layerview-create`,
    eventHandler: SceneLayerLayerviewCreateEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_layerviewcreateerror(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`layerview-create-error`,
    eventHandler: SceneLayerLayerviewCreateErrorEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_layerviewdestroy(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`layerview-destroy`,
    eventHandler: SceneLayerLayerviewDestroyEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against the service and returns the 2D [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of features that satisfy the query. At the moment the 3D Extent can be returned by using [SceneLayerView.queryExtent()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#queryExtent), but this will return the 3D extent only for features currently in the view. The query succeeds only if the layer's `supportsLayerQuery` capability is enabled. Use the [getFieldUsageInfo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#getFieldUsageInfo) method to check if the layer supports queries. If querying is not enabled, then an error with the name `scenelayer:query-not-available` is thrown. Read more about queries in the [Querying](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#querying) section of the class description above.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#queryExtent)
    *
    * @param query Specifies the query parameters.
    * @param options An object with the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def queryExtent(): arcgisDashJsDashApiLib.IPromise[_] = js.native
  def queryExtent(query: Query): arcgisDashJsDashApiLib.IPromise[_] = js.native
  def queryExtent(query: QueryProperties): arcgisDashJsDashApiLib.IPromise[_] = js.native
  def queryExtent(query: QueryProperties, options: SceneLayerQueryExtentOptions): arcgisDashJsDashApiLib.IPromise[_] = js.native
  def queryExtent(query: Query, options: SceneLayerQueryExtentOptions): arcgisDashJsDashApiLib.IPromise[_] = js.native
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against the feature service and returns the number of the features that satisfy the query. The query succeeds only if the layer's `supportsLayerQuery` capability is enabled. Use the [getFieldUsageInfo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#getFieldUsageInfo) method to check if the layer supports queries. If querying is not enabled, then an error with the name `scenelayer:query-not-available` is thrown. Read more about queries in the [Querying](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#querying) section of the class description above.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#queryFeatureCount)
    *
    * @param query Specifies the query parameters.
    * @param options An object with the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def queryFeatureCount(): arcgisDashJsDashApiLib.IPromise[scala.Double] = js.native
  def queryFeatureCount(query: Query): arcgisDashJsDashApiLib.IPromise[scala.Double] = js.native
  def queryFeatureCount(query: QueryProperties): arcgisDashJsDashApiLib.IPromise[scala.Double] = js.native
  def queryFeatureCount(query: QueryProperties, options: SceneLayerQueryFeatureCountOptions): arcgisDashJsDashApiLib.IPromise[scala.Double] = js.native
  def queryFeatureCount(query: Query, options: SceneLayerQueryFeatureCountOptions): arcgisDashJsDashApiLib.IPromise[scala.Double] = js.native
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against the service and returns a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html). The query succeeds only if the layer's `supportsLayerQuery` capability is enabled. Use the [getFieldUsageInfo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#getFieldUsageInfo) method to check if the layer supports queries. If querying is not enabled, then an error with the name `scenelayer:query-not-available` is thrown. Read more about queries in the [Querying](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#querying) section of the class description above.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#queryFeatures)
    *
    * @param query Specifies the query parameters.
    * @param options An object with the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def queryFeatures(): arcgisDashJsDashApiLib.IPromise[FeatureSet] = js.native
  def queryFeatures(query: Query): arcgisDashJsDashApiLib.IPromise[FeatureSet] = js.native
  def queryFeatures(query: QueryProperties): arcgisDashJsDashApiLib.IPromise[FeatureSet] = js.native
  def queryFeatures(query: QueryProperties, options: SceneLayerQueryFeaturesOptions): arcgisDashJsDashApiLib.IPromise[FeatureSet] = js.native
  def queryFeatures(query: Query, options: SceneLayerQueryFeaturesOptions): arcgisDashJsDashApiLib.IPromise[FeatureSet] = js.native
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against the service and returns an array of the ObjectIDs of features that satisfy the input query. The query succeeds only if the layer's `supportsLayerQuery` capability is enabled. Use the [getFieldUsageInfo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#getFieldUsageInfo) method to check if the layer supports queries. If querying is not enabled, then an error with the name `scenelayer:query-not-available` is thrown. Read more about queries in the [Querying](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#querying) section of the class description above.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#queryObjectIds)
    *
    * @param query Specifies the query parameters.
    * @param options An object with the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def queryObjectIds(): arcgisDashJsDashApiLib.IPromise[js.Array[scala.Double]] = js.native
  def queryObjectIds(query: Query): arcgisDashJsDashApiLib.IPromise[js.Array[scala.Double]] = js.native
  def queryObjectIds(query: QueryProperties): arcgisDashJsDashApiLib.IPromise[js.Array[scala.Double]] = js.native
  def queryObjectIds(query: QueryProperties, options: SceneLayerQueryObjectIdsOptions): arcgisDashJsDashApiLib.IPromise[js.Array[scala.Double]] = js.native
  def queryObjectIds(query: Query, options: SceneLayerQueryObjectIdsOptions): arcgisDashJsDashApiLib.IPromise[js.Array[scala.Double]] = js.native
}

@JSGlobal("__esri.SceneLayer")
@js.native
/**
  * The SceneLayer is a layer type designed for on-demand streaming and displaying large amounts of data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). SceneLayers support two geometry types: [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) and 3D Objects (e.g. Buildings).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html)
  */
class SceneLayerCls () extends SceneLayer {
  def this(properties: SceneLayerProperties) = this()
  /**
    * The copyright text as defined by the scene service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#copyright)
    */
  /* CompleteClass */
  override var copyright: java.lang.String = js.native
  /**
    * The layer ID, or layer index, of a Scene Service layer. This is particularly useful when loading a single layer with the [portalItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#portalItem) property from a service containing multiple layers. You can specify this value in one of two scenarios:
    *   * When loading the layer via the [portalItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#portalItem) property.
    *   * When pointing the layer [url](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#url) directly to the Scene Service.
    *
    *
    * If a layerId is not specified in either of the above scenarios, then the first layer in the service (`layerId = 0`) is selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#layerId)
    */
  /* CompleteClass */
  override var layerId: scala.Double = js.native
  /**
    * The maximum scale (most zoomed in) at which the layer is visible in the view. If the map is zoomed in beyond this scale, the layer will not be visible. A value of `0` means the layer does not have a maximum scale. The maxScale value should always be smaller than the [minScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#minScale) value, and greater than or equal to the service specification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#maxScale)
    *
    * @default 0
    */
  /* CompleteClass */
  override var maxScale: scala.Double = js.native
  /**
    * The minimum scale (most zoomed out) at which the layer is visible in the view. If the map is zoomed out beyond this scale, the layer will not be visible. A value of `0` means the layer does not have a minimum scale. The minScale value should always be larger than the [maxScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#maxScale) value, and lesser than or equal to the service specification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#minScale)
    *
    * @default 0
    */
  /* CompleteClass */
  override var minScale: scala.Double = js.native
  /**
    * The portal item from which the layer is loaded. If the portal item references a Feature Service or Scene Service, then you can specify a single layer to load with the [layerId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PortalLayer.html#layerId) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PortalLayer.html#portalItem)
    */
  /* CompleteClass */
  override var portalItem: PortalItem = js.native
  /**
    * The spatial reference of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#spatialReference)
    */
  /* CompleteClass */
  override var spatialReference: SpatialReference = js.native
  /**
    * The URL of the REST endpoint of the layer or scene service. The URL may either point to a resource on ArcGIS Enterprise or ArcGIS Online.  The layer may be specified using the [layerId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#layerId) property when the url points directly to a service and not a specific layer. If [layerId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#layerId) is not specified, then it will default to the first layer in the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#url)
    */
  /* CompleteClass */
  override var url: java.lang.String = js.native
  /**
    * The version of the scene service specification used for this service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#version)
    */
  /* CompleteClass */
  override val version: SceneServiceVersion = js.native
}

