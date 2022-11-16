package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.edits
import typings.arcgisJsApi.arcgisJsApiStrings.geojson
import typings.arcgisJsApi.arcgisJsApiStrings.multipoint
import typings.arcgisJsApi.arcgisJsApiStrings.point
import typings.arcgisJsApi.arcgisJsApiStrings.polygon
import typings.arcgisJsApi.arcgisJsApiStrings.polyline
import typings.arcgisJsApi.arcgisJsApiStrings.refresh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoJSONLayer
  extends StObject
     with Layer
     with BlendLayer
     with OrderedLayer
     with ScaleRangeLayer
     with FeatureEffectLayer
     with FeatureReductionLayer {
  
  /**
    * Applies edits to features in a layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#applyEdits)
    */
  def applyEdits(edits: GeoJSONLayerApplyEditsEdits): js.Promise[Any] = js.native
  
  /**
    * Describes the layer's supported capabilities.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  val capabilities: GeoJSONLayerCapabilities = js.native
  
  /**
    * Copyright information for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#copyright)
    */
  var copyright: String = js.native
  
  /**
    * Creates a popup template for the layer, populated with all the fields of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#createPopupTemplate)
    */
  def createPopupTemplate(): PopupTemplate = js.native
  def createPopupTemplate(options: CreatePopupTemplateOptions): PopupTemplate = js.native
  
  /**
    * Creates query parameter object that can be used to fetch features that satisfy the layer's configurations such as [definitionExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#definitionExpression).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#createQuery)
    */
  def createQuery(): Query_ = js.native
  
  /**
    * A list of custom parameters appended to the URL of all resources fetched by the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#customParameters)
    */
  var customParameters: Any = js.native
  
  /**
    * The SQL where clause used to filter features on the client.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#definitionExpression)
    */
  var definitionExpression: String = js.native
  
  /**
    * The name of the layer's primary display field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#displayField)
    */
  var displayField: String = js.native
  
  /**
    * Indicates if the layer is editable.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#editingEnabled)
    */
  var editingEnabled: Boolean = js.native
  
  /**
    * Specifies how features are placed on the vertical axis (z).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#elevationInfo)
    */
  var elevationInfo: GeoJSONLayerElevationInfo = js.native
  
  /**
    * An array of fields in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#fields)
    */
  var fields: js.Array[Field] = js.native
  
  /**
    * A convenient property that can be used to make case-insensitive lookups for a field by name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#fieldsIndex)
    */
  val fieldsIndex: FieldsIndex = js.native
  
  /**
    * The geometry type of features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#geometryType)
    */
  var geometryType: point | polygon | polyline | multipoint = js.native
  
  /**
    * Returns the [Field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html) instance for a field name (case-insensitive).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#getField)
    */
  def getField(fieldName: String): Field = js.native
  
  /**
    * Returns the Domain associated with the given field name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#getFieldDomain)
    */
  def getFieldDomain(fieldName: String): Domain = js.native
  def getFieldDomain(fieldName: String, options: GeoJSONLayerGetFieldDomainOptions): Domain = js.native
  
  /**
    * Indicates whether the client-side features in the layer have `Z` (elevation) values.
    *
    * @default undefined
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#hasZ)
    */
  val hasZ: Boolean = js.native
  
  /**
    * Returns `true` if the layer is loaded from a non-spatial table in a service.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#isTable)
    */
  val isTable: Boolean = js.native
  
  /**
    * The label definition for this layer, specified as an array of [LabelClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#labelingInfo)
    */
  var labelingInfo: js.Array[LabelClass] = js.native
  
  /**
    * Indicates whether to display labels for this layer.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#labelsVisible)
    */
  var labelsVisible: Boolean = js.native
  
  /**
    * Indicates whether the layer will be included in the legend.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#legendEnabled)
    */
  var legendEnabled: Boolean = js.native
  
  /**
    * The name of a [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#fields) containing a unique value or identifier for each feature in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#objectIdField)
    */
  var objectIdField: String = js.native
  
  @JSName("on")
  def on_edits(name: edits, eventHandler: GeoJSONLayerEditsEventHandler): IHandle = js.native
  @JSName("on")
  def on_refresh(name: refresh, eventHandler: GeoJSONLayerRefreshEventHandler): IHandle = js.native
  
  /**
    * An array of field names from the geoJSON file to include with each feature.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#outFields)
    */
  var outFields: js.Array[String] = js.native
  
  /**
    * Indicates whether to display popups when features in the layer are clicked.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#popupEnabled)
    */
  var popupEnabled: Boolean = js.native
  
  /**
    * The popup template for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#popupTemplate)
    */
  var popupTemplate: PopupTemplate = js.native
  
  /**
    * The portal item referencing the geojson file from which the GeoJSONLayer is loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#portalItem)
    */
  var portalItem: PortalItem = js.native
  
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) against the layer and returns the [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of features that satisfy the query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#queryExtent)
    */
  def queryExtent(): js.Promise[Any] = js.native
  def queryExtent(query: scala.Unit, options: GeoJSONLayerQueryExtentOptions): js.Promise[Any] = js.native
  def queryExtent(query: QueryProperties): js.Promise[Any] = js.native
  def queryExtent(query: QueryProperties, options: GeoJSONLayerQueryExtentOptions): js.Promise[Any] = js.native
  def queryExtent(query: Query_): js.Promise[Any] = js.native
  def queryExtent(query: Query_, options: GeoJSONLayerQueryExtentOptions): js.Promise[Any] = js.native
  
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) against the layer and returns the number of features that satisfy the query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#queryFeatureCount)
    */
  def queryFeatureCount(): js.Promise[Double] = js.native
  def queryFeatureCount(query: scala.Unit, options: GeoJSONLayerQueryFeatureCountOptions): js.Promise[Double] = js.native
  def queryFeatureCount(query: QueryProperties): js.Promise[Double] = js.native
  def queryFeatureCount(query: QueryProperties, options: GeoJSONLayerQueryFeatureCountOptions): js.Promise[Double] = js.native
  def queryFeatureCount(query: Query_): js.Promise[Double] = js.native
  def queryFeatureCount(query: Query_, options: GeoJSONLayerQueryFeatureCountOptions): js.Promise[Double] = js.native
  
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) against the layer and returns a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FeatureSet.html), which can be accessed using the `.then()` method once the promise resolves.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#queryFeatures)
    */
  def queryFeatures(): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: scala.Unit, options: GeoJSONLayerQueryFeaturesOptions): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: QueryProperties): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: QueryProperties, options: GeoJSONLayerQueryFeaturesOptions): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: Query_): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: Query_, options: GeoJSONLayerQueryFeaturesOptions): js.Promise[FeatureSet] = js.native
  
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) against the layer and returns an array of Object IDs for features that satisfy the input query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#queryObjectIds)
    */
  def queryObjectIds(): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: scala.Unit, options: GeoJSONLayerQueryObjectIdsOptions): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: QueryProperties): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: QueryProperties, options: GeoJSONLayerQueryObjectIdsOptions): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: Query_): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: Query_, options: GeoJSONLayerQueryObjectIdsOptions): js.Promise[js.Array[Double]] = js.native
  
  /**
    * Fetches all the data for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#refresh)
    */
  def refresh(): scala.Unit = js.native
  
  /**
    * Refresh interval of the layer in minutes.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#refreshInterval)
    */
  var refreshInterval: Double = js.native
  
  /**
    * The renderer assigned to the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#renderer)
    */
  var renderer: Renderer = js.native
  
  /**
    * Apply perspective scaling to screen-size point symbols in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#screenSizePerspectiveEnabled)
    */
  var screenSizePerspectiveEnabled: Boolean = js.native
  
  /**
    * The spatial reference of the layer.
    *
    * @default SpatialReference.WGS84
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#spatialReference)
    */
  var spatialReference: SpatialReference = js.native
  
  /**
    * An array of feature templates defined in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#templates)
    */
  var templates: js.Array[FeatureTemplate] = js.native
  
  /**
    * The layer's time extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#timeExtent)
    */
  var timeExtent: TimeExtent = js.native
  
  /**
    * TimeInfo provides information such as date fields that store [start](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#startField) and [end](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#endField) time for each feature and the [fullTimeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#fullTimeExtent) for the layer.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#timeInfo)
    */
  var timeInfo: TimeInfo = js.native
  
  /**
    * A temporary offset of the time data based on a certain [TimeInterval](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html).
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#timeOffset)
    */
  var timeOffset: TimeInterval = js.native
  
  @JSName("type")
  val type_GeoJSONLayer: geojson = js.native
  
  /**
    * The URL of the GeoJSON file.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#url)
    */
  var url: String = js.native
  
  /**
    * Determines if the layer will update its temporal data based on the view's [timeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#timeExtent).
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#useViewTime)
    */
  var useViewTime: Boolean = js.native
}
