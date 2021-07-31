package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`building-component`
import typings.arcgisJsApi.arcgisJsApiStrings.hide
import typings.arcgisJsApi.arcgisJsApiStrings.show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildingComponentSublayer
  extends StObject
     with BuildingSublayer
     with Loadable {
  
  /**
    * Creates a default popup template for the layer, populated with all the fields of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#createPopupTemplate)
    */
  def createPopupTemplate(): PopupTemplate = js.native
  def createPopupTemplate(options: CreatePopupTemplateOptions): PopupTemplate = js.native
  
  /**
    * Creates a query object that can be used to fetch features that satisfy the component sublayer's current [definition expression](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#definitionExpression).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#createQuery)
    */
  def createQuery(): Query = js.native
  
  /**
    * The SQL where clause used to filter features on the client.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#definitionExpression)
    */
  var definitionExpression: String = js.native
  
  /**
    * Returns the [Field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html) instance for a field name (case-insensitive).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#getField)
    */
  def getField(fieldName: String): Field = js.native
  
  /**
    * Returns the [Domain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html) associated with the given field name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#getFieldDomain)
    */
  def getFieldDomain(fieldName: String): Domain = js.native
  
  /**
    * Gets field usage information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#getFieldUsageInfo)
    */
  def getFieldUsageInfo(fieldName: String): js.Any = js.native
  
  /**
    * Indicates how the layer should display in the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#listMode)
    */
  var listMode: show | hide = js.native
  
  /**
    * An array of field names from the service to include with each feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#outFields)
    */
  var outFields: js.Array[String] = js.native
  
  /**
    * Indicates whether to display popups when features in the layer are clicked.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#popupEnabled)
    */
  var popupEnabled: Boolean = js.native
  
  /**
    * The popup template for the sublayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#popupTemplate)
    */
  var popupTemplate: PopupTemplate = js.native
  
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against the associated feature service and returns the 2D [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of features that satisfy the query.
    *
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against the associated feature service and returns the 2D [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of features that satisfy the query. At the moment the 3D Extent can be returned by using [BuildingComponentSublayerView.queryExtent()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-BuildingComponentSublayerView.html#queryExtent), but this will return the 3D extent only for features currently in the view. The query succeeds only if the BuildingSceneLayer has an associated feature layer. If an associated feature layer is not available, then an error with the name `buildingscenelayer:query-not-available` is thrown. Read more about queries in the Querying section of the BuildingSceneLayer class description.[Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#queryExtent)
    */
  def queryExtent(): js.Promise[js.Any] = js.native
  def queryExtent(query: Unit, options: BuildingComponentSublayerQueryExtentOptions): js.Promise[js.Any] = js.native
  def queryExtent(query: Query): js.Promise[js.Any] = js.native
  def queryExtent(query: QueryProperties): js.Promise[js.Any] = js.native
  def queryExtent(query: QueryProperties, options: BuildingComponentSublayerQueryExtentOptions): js.Promise[js.Any] = js.native
  def queryExtent(query: Query, options: BuildingComponentSublayerQueryExtentOptions): js.Promise[js.Any] = js.native
  
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against the associated feature service and returns the number of features that satisfy the query.
    *
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against the associated feature service and returns the number of features that satisfy the query. The query succeeds only if the layer's `supportsLayerQuery` capability is enabled. Use the [getFieldUsageInfo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#getFieldUsageInfo) method to check if the layer supports queries. If querying is not enabled, then an error with the name `buildingscenelayer:query-not-available` is thrown. Read more about queries in the Querying section of the BuildingSceneLayer class description.[Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#queryFeatureCount)
    */
  def queryFeatureCount(): js.Promise[Double] = js.native
  def queryFeatureCount(query: Unit, options: BuildingComponentSublayerQueryFeatureCountOptions): js.Promise[Double] = js.native
  def queryFeatureCount(query: Query): js.Promise[Double] = js.native
  def queryFeatureCount(query: QueryProperties): js.Promise[Double] = js.native
  def queryFeatureCount(query: QueryProperties, options: BuildingComponentSublayerQueryFeatureCountOptions): js.Promise[Double] = js.native
  def queryFeatureCount(query: Query, options: BuildingComponentSublayerQueryFeatureCountOptions): js.Promise[Double] = js.native
  
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against the associated feature service and returns a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html).
    *
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against the associated feature service and returns a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html). The query succeeds only if the layer's `supportsLayerQuery` capability is enabled. Use the [getFieldUsageInfo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#getFieldUsageInfo) method to check if the layer supports queries. If querying is not enabled, then an error with the name `buildingscenelayer:query-not-available` is thrown. Read more about queries in the Querying section of the BuildingSceneLayer class description.[Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#queryFeatures)
    */
  def queryFeatures(): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: Unit, options: BuildingComponentSublayerQueryFeaturesOptions): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: Query): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: QueryProperties): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: QueryProperties, options: BuildingComponentSublayerQueryFeaturesOptions): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: Query, options: BuildingComponentSublayerQueryFeaturesOptions): js.Promise[FeatureSet] = js.native
  
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against the associated feature service and returns an array of ObjectIDs of the features that satisfy the input query.
    *
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against the associated feature service and returns an array of ObjectIDs of the features that satisfy the input query. The query succeeds only if the layer's `supportsLayerQuery` capability is enabled. Use the [getFieldUsageInfo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#getFieldUsageInfo) method to check if the layer supports queries. If querying is not enabled, then an error with the name `buildingscenelayer:query-not-available` is thrown. Read more about queries in the Querying section of the SceneLayer class description.[Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#queryObjectIds)
    */
  def queryObjectIds(): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: Unit, options: BuildingComponentSublayerQueryObjectIdsOptions): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: Query): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: QueryProperties): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: QueryProperties, options: BuildingComponentSublayerQueryObjectIdsOptions): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: Query, options: BuildingComponentSublayerQueryObjectIdsOptions): js.Promise[js.Array[Double]] = js.native
  
  /**
    * The renderer assigned to the sublayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#renderer)
    */
  var renderer: Renderer = js.native
  
  val `type`: `building-component` = js.native
}
