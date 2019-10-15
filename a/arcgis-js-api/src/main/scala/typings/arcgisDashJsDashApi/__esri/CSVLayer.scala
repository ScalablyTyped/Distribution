package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.IPromise
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.csv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSVLayer
  extends Layer
     with PortalLayer
     with ScaleRangeLayer
     with TemporalLayer {
  /**
    * Describes the layer's supported capabilities.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  val capabilities: CSVLayerCapabilities = js.native
  /**
    * Copyright information for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#copyright)
    */
  var copyright: String = js.native
  /**
    * The SQL where clause used to filter features on the client. Only the features that satisfy the definition expression are displayed in the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html). Setting a definition expression is useful when the dataset is large and you don't want to bring all features to the client for analysis. Definition expressions may be set when a layer is constructed prior to it loading in the view or after it has been added to the map. If the definition expression is set after the layer has been added to the map, the view will automatically refresh itself to display the features that satisfy the new definition expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#definitionExpression)
    */
  var definitionExpression: String = js.native
  /**
    * The column delimiter. See the table below for possible values.
    *
    * | Value  | Description|
    * | --- | --- |
    * | `,`    | comma |
    * | ` `    | space |
    * | `;`    | semicolon |
    * | `|`    | pipe |
    * | `\t`     | tab-delimited |
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#delimiter)
    */
  var delimiter: String = js.native
  /**
    * The name of the layer's primary display field. The value of this property matches the name of one of the fields of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#displayField)
    */
  var displayField: String = js.native
  /**
    * Specifies how graphics are placed on the vertical axis (z). This property may only be used in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). See the [ElevationInfo sample](https://developers.arcgis.com/javascript/latest/sample-code/scene-elevationinfo/index.html) for an example of how this property may be used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#elevationInfo)
    */
  var elevationInfo: CSVLayerElevationInfo = js.native
  /**
    * Configures the method for decluttering overlapping features in the view. If this property is not set (or set to `null`), every feature is drawn individually.  Currently this property is only supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) for point features with non-draped [Icons](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html) or [Text](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html) symbol layers.  ![declutter](https://developers.arcgis.com/javascript/assets/img/samples/city-points-declutter.gif)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#featureReduction)
    */
  var featureReduction: CSVLayerFeatureReduction = js.native
  /**
    * An array of fields in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#fields)
    */
  var fields: js.Array[Field] = js.native
  /**
    * A convenient property that can be used to make case-insensitive lookups for a field by name. It can also provide a list of the [date fields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FieldsIndex.html#dateFields) in a layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#fieldsIndex)
    */
  val fieldsIndex: FieldsIndex = js.native
  /**
    * The label definition for this layer, specified as an array of [LabelClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html). Use this property to specify labeling properties for the layer.  Multiple Label classes with different `where` clauses can be used to define several labels with varying styles on the same feature. Likewise, multiple label classes may be used to label different types of features (for example blue labels for lakes and green labels for parks).
    * > **Known Limitations**  Currently only one [LabelClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html) is supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#labelingInfo)
    */
  var labelingInfo: js.Array[LabelClass] = js.native
  /**
    * Indicates whether to display labels for this layer. If `true`, labels will appear as defined in the [labelingInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#labelingInfo) property.
    * > **Known Limitations**
    *   * Currently only one [LabelClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html) is supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#labelsVisible)
    *
    * @default true
    */
  var labelsVisible: Boolean = js.native
  /**
    * The latitude field name. If not specified, the API will look for following field names in the CSV source: "lat", "latitude", "y", "ycenter", "latitude83", "latdecdeg", "POINT-Y".
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#latitudeField)
    */
  var latitudeField: String = js.native
  /**
    * The longitude field name. If not specified, the API will look for following field names in the CSV source: "lon", "lng", "long", "longitude", "x", "xcenter", "longitude83", "longdecdeg", "POINT-X".
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#longitudeField)
    */
  var longitudeField: String = js.native
  /**
    * The name of an `oid` [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#fields) containing a unique value or identifier for each feature in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#objectIdField)
    */
  var objectIdField: String = js.native
  /**
    * An array of field names to include in the CSVLayer. If not specified, the layer will include all fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#outFields)
    */
  var outFields: js.Array[String] = js.native
  /**
    * Indicates whether to display popups when features in the layer are clicked. The layer needs to have a [popupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#popupTemplate) to define what information should be displayed in the popup. Alternatively, a default popup template may be automatically used if [Popup.defaultPopupTemplateEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#defaultPopupTemplateEnabled) is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#popupEnabled)
    *
    * @default true
    */
  var popupEnabled: Boolean = js.native
  /**
    * The popup template for the layer. When set on the layer, the `popupTemplate` allows users to access attributes and display their values in the [view's popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#popup) when a feature is selected using text and/or charts. See the [PopupTemplate sample](https://developers.arcgis.com/javascript/latest/sample-code/intro-popuptemplate/index.html) for an example of how [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) interacts with a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).  A default popup template is automatically used if no `popupTemplate` has been defined when [Popup.defaultPopupTemplateEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#defaultPopupTemplateEnabled) is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#popupTemplate)
    */
  var popupTemplate: PopupTemplate = js.native
  /**
    * The renderer assigned to the layer. The renderer defines how to visualize each feature in the layer. Depending on the renderer type, features may be visualized with the same symbol, or with varying symbols based on the values of provided attribute fields or functions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#renderer)
    */
  var renderer: Renderer = js.native
  /**
    * Apply perspective scaling to screen-size point symbols in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). When `true`, screen sized objects such as [icons](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html), [labels](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html) or [callouts](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-Callout3D.html) integrate better in the 3D scene by applying a certain perspective projection to the sizing of features. This only applies when using a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).  `layer.screenSizePerspectiveEnabled = true`  ![screen-size-perspective](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-screenSize-perspective.png)  `layer.screenSizePerspectiveEnabled = false`  ![no-screen-size-perspective](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-no-screenSize-perspective.png)
    * > **Known Limitations**  Screen size perspective is currently not optimized for situations where the camera is very near the ground, or for scenes with point features located far from the ground surface. In these cases it may be better to turn off screen size perspective. As screen size perspective changes the size based on distance to the camera, it should be set to false when using {@link module:esri/renderers/Renderer#SizeVisualVariable size visual variables}.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#screenSizePerspectiveEnabled)
    *
    * @default true
    */
  var screenSizePerspectiveEnabled: Boolean = js.native
  /**
    * The spatial reference of the layer. The default value is WGS84. This property can be set explicitly to project the longitude and latitude coordinates when the layer parses the CSV file. While not required, explicitly setting the spatial reference of the layer will improve the performance when projecting to a spatial reference other than the one used by the coordinates in the raw data.
    * > **Known Limitations**  The browser must support [WebAssembly](https://caniuse.com/#feat=wasm) if a spatial reference other than WGS84 or Web Mercator is specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#spatialReference)
    *
    * @default SpatialReference.WGS84
    */
  var spatialReference: SpatialReference = js.native
  @JSName("type")
  val type_CSVLayer: csv = js.native
  /**
    * The URL of the CSV file.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#url)
    */
  var url: String = js.native
  /**
    * Creates a popup template for the layer, populated with all the fields of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#createPopupTemplate)
    *
    * @param options Options for creating the popup template.
    * @param options.maximumFields The maximum number of fields to include in the popup template.
    * @param options.ignoreFieldTypes Field types to ignore when creating the popup. By default the `geometry`, `blob`, `raster`, `guid` and `xml` field types are ignored.
    *
    */
  def createPopupTemplate(): PopupTemplate = js.native
  def createPopupTemplate(options: CSVLayerCreatePopupTemplateOptions): PopupTemplate = js.native
  /**
    * Creates query parameters that can be used to fetch features that satisfy the layer's current filters, and definitions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#createQuery)
    *
    *
    */
  def createQuery(): Query = js.native
  /**
    * Returns the [Field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html) instance for a field name (case-insensitive).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#getField)
    *
    * @param fieldName Name of the field.
    *
    */
  def getField(fieldName: String): Field = js.native
  /**
    * Returns the [Domain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html) associated with the given field name. The domain can be either a [CodedValueDomain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-CodedValueDomain.html) or [RangeDomain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RangeDomain.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#getFieldDomain)
    *
    * @param fieldName Name of the field.
    * @param options An object specifying additional options. See the object specification table below for the required properties of this object.
    * @param options.feature The feature to which the [Domain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html) is assigned.
    *
    */
  def getFieldDomain(fieldName: String): Domain = js.native
  def getFieldDomain(fieldName: String, options: CSVLayerGetFieldDomainOptions): Domain = js.native
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against the CSV data and returns the [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of features that satisfy the query. If no parameters are specified, then the extent and count of all features satisfying the layer's configuration/filters are returned.
    * > **Known Limitations**
    *   * Spatial queries have the same limitations as those listed in the [projection engine](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-projection.html) documentation.
    *   * Spatial queries are currently not supported if the layer view has any of the following [SpatialReferences](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html):
    *   * GDM 2000 (4742) – Malaysia
    *   * Gusterberg (Ferro) (8042) – Austria/Czech Republic
    *   * ISN2016 (8086) - Iceland
    *   * SVY21 (4757) - Singapore
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#queryExtent)
    *
    * @param query Specifies the attributes and spatial filter of the query. When no parameters are passed to this method, all features in the client are returned. To only return features visible in the view, set the `geometry` parameter in the query object to the view's extent.
    * @param options An object with the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def queryExtent(): IPromise[_] = js.native
  def queryExtent(query: Query): IPromise[_] = js.native
  def queryExtent(query: QueryProperties): IPromise[_] = js.native
  def queryExtent(query: QueryProperties, options: CSVLayerQueryExtentOptions): IPromise[_] = js.native
  def queryExtent(query: Query, options: CSVLayerQueryExtentOptions): IPromise[_] = js.native
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against the CSV data and returns the number of features that satisfy the query. If no parameters are specified, then the total number of features satisfying the layer's configuration/filters is returned.
    * > **Known Limitations**
    *   * Spatial queries have the same limitations as those listed in the [projection engine](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-projection.html) documentation.
    *   * Spatial queries are currently not supported if the layer view has any of the following [SpatialReferences](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html):
    *   * GDM 2000 (4742) – Malaysia
    *   * Gusterberg (Ferro) (8042) – Austria/Czech Republic
    *   * ISN2016 (8086) - Iceland
    *   * SVY21 (4757) - Singapore
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#queryFeatureCount)
    *
    * @param query Specifies the attributes and spatial filter of the query. When no parameters are passed to this method, all features in the client are returned. To only return features visible in the view, set the `geometry` parameter in the query object to the view's extent.
    * @param options An object with the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def queryFeatureCount(): IPromise[Double] = js.native
  def queryFeatureCount(query: Query): IPromise[Double] = js.native
  def queryFeatureCount(query: QueryProperties): IPromise[Double] = js.native
  def queryFeatureCount(query: QueryProperties, options: CSVLayerQueryFeatureCountOptions): IPromise[Double] = js.native
  def queryFeatureCount(query: Query, options: CSVLayerQueryFeatureCountOptions): IPromise[Double] = js.native
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against the CSV data and returns a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html), which can be accessed using the `.then()` method once the promise resolves. A [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html) contains an array of [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) features, which can be added to the [view's graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#graphics). This array will not be populated if zero results are found.
    * > **Known Limitations**
    *   * Attribute values used in attribute queries executed against layer views are case sensitive.
    *   * Spatial queries have the same limitations as those listed in the [projection engine](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-projection.html) documentation.
    *   * Spatial queries are not currently supported if the layer view has any of the following [SpatialReferences](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html):
    *   * GDM 2000 (4742) – Malaysia
    *   * Gusterberg (Ferro) (8042) – Austria/Czech Republic
    *   * ISN2016 (8086) - Iceland
    *   * SVY21 (4757) - Singapore
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#queryFeatures)
    *
    * @param query Specifies the attributes and spatial filter of the query. When no parameters are passed to this method, all features in the client are returned. To only return features visible in the view, set the `geometry` parameter in the query object to the view's extent.
    * @param options An object with the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def queryFeatures(): IPromise[FeatureSet] = js.native
  def queryFeatures(query: Query): IPromise[FeatureSet] = js.native
  def queryFeatures(query: QueryProperties): IPromise[FeatureSet] = js.native
  def queryFeatures(query: QueryProperties, options: CSVLayerQueryFeaturesOptions): IPromise[FeatureSet] = js.native
  def queryFeatures(query: Query, options: CSVLayerQueryFeaturesOptions): IPromise[FeatureSet] = js.native
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against the CSV data and returns an array of Object IDs for features that satisfy the input query. If no parameters are specified, then the Object IDs of all features satisfying the layer's configuration/filters are returned.
    * > **Known Limitations**
    *   * Spatial queries have the same limitations as those listed in the [projection engine](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-projection.html) documentation.
    *   * Spatial queries are currently not supported if the layer view has any of the following [SpatialReferences](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html):
    *   * GDM 2000 (4742) – Malaysia
    *   * Gusterberg (Ferro) (8042) – Austria/Czech Republic
    *   * ISN2016 (8086) - Iceland
    *   * SVY21 (4757) - Singapore
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#queryObjectIds)
    *
    * @param query Specifies the attributes and spatial filter of the query. When no parameters are passed to this method, all features in the client are returned. To only return features visible in the view, set the `geometry` parameter in the query object to the view's extent.
    * @param options An object with the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def queryObjectIds(): IPromise[js.Array[Double]] = js.native
  def queryObjectIds(query: Query): IPromise[js.Array[Double]] = js.native
  def queryObjectIds(query: QueryProperties): IPromise[js.Array[Double]] = js.native
  def queryObjectIds(query: QueryProperties, options: CSVLayerQueryObjectIdsOptions): IPromise[js.Array[Double]] = js.native
  def queryObjectIds(query: Query, options: CSVLayerQueryObjectIdsOptions): IPromise[js.Array[Double]] = js.native
}

@JSGlobal("__esri.CSVLayer")
@js.native
object CSVLayer extends TopLevel[CSVLayerConstructor]

