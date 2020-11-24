package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.mesh
import typings.arcgisJsApi.arcgisJsApiStrings.point
import typings.arcgisJsApi.arcgisJsApiStrings.scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SceneLayer
  extends Layer
     with SceneService
     with PortalLayer
     with ScaleRangeLayer {
  
  /**
    * Creates a default popup template for the layer, populated with all the fields of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#createPopupTemplate)
    */
  def createPopupTemplate(): PopupTemplate = js.native
  def createPopupTemplate(options: CreatePopupTemplateOptions): PopupTemplate = js.native
  
  /**
    * Creates a query object that can be used to fetch features that satisfy the layer's current definition expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#createQuery)
    */
  def createQuery(): Query = js.native
  
  /**
    * The SQL where clause used to filter features on the client.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#definitionExpression)
    */
  var definitionExpression: String = js.native
  
  /**
    * Specifies how graphics are placed on the vertical axis (z).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#elevationInfo)
    */
  var elevationInfo: SceneLayerElevationInfo = js.native
  
  /**
    * Configures the method for decluttering overlapping features in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#featureReduction)
    */
  var featureReduction: FeatureReductionSelection = js.native
  
  /**
    * An array of fields accessible in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#fields)
    */
  val fields: js.Array[Field] = js.native
  
  /**
    * A convenient property that can be used to make case-insensitive lookups for a field by name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#fieldsIndex)
    */
  val fieldsIndex: FieldsIndex = js.native
  
  /**
    * The geometry type of features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#geometryType)
    */
  var geometryType: point | mesh = js.native
  
  /**
    * Returns the [Field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html) instance for a field name (case-insensitive).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#getField)
    */
  def getField(fieldName: String): Field = js.native
  
  /**
    * Returns the [Domain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html) associated with the given field name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#getFieldDomain)
    */
  def getFieldDomain(fieldName: String): Domain = js.native
  
  /**
    * Gets field usage information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#getFieldUsageInfo)
    */
  def getFieldUsageInfo(fieldName: String): js.Any = js.native
  
  /**
    * The label definition for this layer, specified as an array of [LabelClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#labelingInfo)
    */
  var labelingInfo: js.Array[LabelClass] = js.native
  
  /**
    * Indicates whether to display labels for this layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#labelsVisible)
    */
  var labelsVisible: Boolean = js.native
  
  /**
    * Indicates whether the layer will be included in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#legendEnabled)
    */
  var legendEnabled: Boolean = js.native
  
  /**
    * The name of the field containing each graphic's Object ID.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#objectIdField)
    */
  var objectIdField: String = js.native
  
  /**
    * An array of field names from the service to include with each feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#outFields)
    */
  var outFields: js.Array[String] = js.native
  
  /**
    * Indicates whether to display popups when features in the layer are clicked.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#popupEnabled)
    */
  var popupEnabled: Boolean = js.native
  
  /**
    * The popup template for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#popupTemplate)
    */
  var popupTemplate: PopupTemplate = js.native
  
  /**
    * Queries cached statistics from the service for a given field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#queryCachedStatistics)
    */
  def queryCachedStatistics(fieldName: String): js.Any = js.native
  def queryCachedStatistics(fieldName: String, options: SceneLayerQueryCachedStatisticsOptions): js.Any = js.native
  
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against the associated feature service and returns the 2D [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of features that satisfy the query.
    *
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against the associated feature service and returns the 2D [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of features that satisfy the query. At the moment the 3D Extent can be returned by using [SceneLayerView.queryExtent()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#queryExtent), but this will return the 3D extent only for features currently in the view. The query succeeds only if the SceneLayer has an associated feature layer. If an associated feature layer is not available, then an error with the name `scenelayer:query-not-available` is thrown. Read more about queries in the [Querying](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#querying) section of the class description above.[Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#queryExtent)
    */
  def queryExtent(): js.Promise[_] = js.native
  def queryExtent(query: js.UndefOr[scala.Nothing], options: SceneLayerQueryExtentOptions): js.Promise[_] = js.native
  def queryExtent(query: Query): js.Promise[_] = js.native
  def queryExtent(query: QueryProperties): js.Promise[_] = js.native
  def queryExtent(query: QueryProperties, options: SceneLayerQueryExtentOptions): js.Promise[_] = js.native
  def queryExtent(query: Query, options: SceneLayerQueryExtentOptions): js.Promise[_] = js.native
  
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against the associated feature service and returns the number of features that satisfy the query.
    *
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against the associated feature service and returns the number of features that satisfy the query. The query succeeds only if the layer's `supportsLayerQuery` capability is enabled. Use the [getFieldUsageInfo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#getFieldUsageInfo) method to check if the layer supports queries. If querying is not enabled, then an error with the name `scenelayer:query-not-available` is thrown. Read more about queries in the [Querying](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#querying) section of the class description above.[Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#queryFeatureCount)
    */
  def queryFeatureCount(): js.Promise[Double] = js.native
  def queryFeatureCount(query: js.UndefOr[scala.Nothing], options: SceneLayerQueryFeatureCountOptions): js.Promise[Double] = js.native
  def queryFeatureCount(query: Query): js.Promise[Double] = js.native
  def queryFeatureCount(query: QueryProperties): js.Promise[Double] = js.native
  def queryFeatureCount(query: QueryProperties, options: SceneLayerQueryFeatureCountOptions): js.Promise[Double] = js.native
  def queryFeatureCount(query: Query, options: SceneLayerQueryFeatureCountOptions): js.Promise[Double] = js.native
  
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against the associated feature service and returns a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html).
    *
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against the associated feature service and returns a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html). The query succeeds only if the layer's `supportsLayerQuery` capability is enabled. Use the [getFieldUsageInfo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#getFieldUsageInfo) method to check if the layer supports queries. If querying is not enabled, then an error with the name `scenelayer:query-not-available` is thrown. Read more about queries in the [Querying](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#querying) section of the class description above.[Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#queryFeatures)
    */
  def queryFeatures(): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: js.UndefOr[scala.Nothing], options: SceneLayerQueryFeaturesOptions): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: Query): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: QueryProperties): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: QueryProperties, options: SceneLayerQueryFeaturesOptions): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: Query, options: SceneLayerQueryFeaturesOptions): js.Promise[FeatureSet] = js.native
  
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against the associated feature service and returns an array of ObjectIDs of the features that satisfy the input query.
    *
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against the associated feature service and returns an array of ObjectIDs of the features that satisfy the input query. The query succeeds only if the layer's `supportsLayerQuery` capability is enabled. Use the [getFieldUsageInfo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#getFieldUsageInfo) method to check if the layer supports queries. If querying is not enabled, then an error with the name `scenelayer:query-not-available` is thrown. Read more about queries in the [Querying](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#querying) section of the class description above.[Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#queryObjectIds)
    */
  def queryObjectIds(): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: js.UndefOr[scala.Nothing], options: SceneLayerQueryObjectIdsOptions): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: Query): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: QueryProperties): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: QueryProperties, options: SceneLayerQueryObjectIdsOptions): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: Query, options: SceneLayerQueryObjectIdsOptions): js.Promise[js.Array[Double]] = js.native
  
  /**
    * The renderer assigned to the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#renderer)
    */
  var renderer: Renderer = js.native
  
  /**
    * Apply perspective scaling to screen-size point symbols in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#screenSizePerspectiveEnabled)
    */
  var screenSizePerspectiveEnabled: Boolean = js.native
  
  @JSName("type")
  val type_SceneLayer: scene = js.native
}
