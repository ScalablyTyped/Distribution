package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`knowledge-graph-sublayer`
import typings.arcgisJsApi.arcgisJsApiStrings.entity
import typings.arcgisJsApi.arcgisJsApiStrings.multipoint
import typings.arcgisJsApi.arcgisJsApiStrings.point
import typings.arcgisJsApi.arcgisJsApiStrings.polygon
import typings.arcgisJsApi.arcgisJsApiStrings.polyline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnowledgeGraphSublayer
  extends StObject
     with Layer
     with BlendLayer
     with FeatureReductionLayer {
  
  /**
  		 * Describes the layer's supported capabilities.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#capabilities)
  		 */
  val capabilities: KnowledgeGraphSublayerCapabilities = js.native
  
  /**
  		 * Creates a popup template for the layer, populated with all the fields of the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#createPopupTemplate)
  		 */
  def createPopupTemplate(): PopupTemplate = js.native
  def createPopupTemplate(options: CreatePopupTemplateOptions): PopupTemplate = js.native
  
  /**
  		 * The definition of the default popup template for the sublayer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#defaultPopupTemplate)
  		 */
  val defaultPopupTemplate: PopupTemplate = js.native
  
  /**
  		 * The SQL where clause used to filter features on the client.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#definitionExpression)
  		 */
  var definitionExpression: String = js.native
  
  /**
  		 * The name of the sublayer's primary display field.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#displayField)
  		 */
  var displayField: String = js.native
  
  /**
  		 * Specifies how features are placed on the vertical axis (z).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#elevationInfo)
  		 */
  var elevationInfo: KnowledgeGraphSublayerElevationInfo = js.native
  
  /**
  		 * The name of the geometry field for the sublayer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#geometryFieldName)
  		 */
  var geometryFieldName: String = js.native
  
  /**
  		 * The geometry type of features in the sublayer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#geometryType)
  		 */
  var geometryType: point | multipoint | polyline | polygon = js.native
  
  /**
  		 * Returns the [Field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html) instance for a field name (case-insensitive).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#getField)
  		 */
  def getField(fieldName: String): Field = js.native
  
  /**
  		 * Returns the [Domain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html) associated with the given field name.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#getFieldDomain)
  		 */
  def getFieldDomain(fieldName: String): Domain = js.native
  def getFieldDomain(fieldName: String, options: KnowledgeGraphSublayerGetFieldDomainOptions): Domain = js.native
  
  /**
  		 * Specifies whether the sublayer represents an [entity type](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-EntityType.html) or [relationship type](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-RelationshipType.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#graphType)
  		 */
  var graphType: entity | typings.arcgisJsApi.arcgisJsApiStrings.relationship = js.native
  
  /**
  		 * Indicates whether the features in the sublayer have `M` (measurement) values.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#hasM)
  		 */
  var hasM: Boolean = js.native
  
  /**
  		 * Indicates whether the features in the layer have `Z` (elevation) values.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#hasZ)
  		 */
  var hasZ: Boolean = js.native
  
  /**
  		 * The label definition for this sublayer, specified as an array of [label classes](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#labelingInfo)
  		 */
  var labelingInfo: js.Array[LabelClass] = js.native
  
  /**
  		 * Indicates whether to display labels for this sublayer.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#labelsVisible)
  		 */
  var labelsVisible: Boolean = js.native
  
  /**
  		 * The name of an `oid` containing a unique value or identifier for each feature in the sublayer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#objectIdField)
  		 */
  var objectIdField: String = js.native
  
  /**
  		 * Outlines the [type](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphObjectType.html) definition for the named type represented by the sublayer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#objectType)
  		 */
  var objectType: GraphObjectType = js.native
  
  /**
  		 * The [KnowledgeGraphLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KnowledgeGraphLayer.html) of which this is a sublayer for a specific entity or relationship type.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#parentCompositeLayer)
  		 */
  var parentCompositeLayer: KnowledgeGraphLayer = js.native
  
  /**
  		 * The popup template for the sublayer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#popupTemplate)
  		 */
  var popupTemplate: PopupTemplate = js.native
  
  /**
  		 * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) against the knowledge graph service and returns the [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of features that satisfy the query.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#queryExtent)
  		 */
  def queryExtent(): js.Promise[Any] = js.native
  def queryExtent(query: scala.Unit, options: KnowledgeGraphSublayerQueryExtentOptions): js.Promise[Any] = js.native
  def queryExtent(query: QueryProperties): js.Promise[Any] = js.native
  def queryExtent(query: QueryProperties, options: KnowledgeGraphSublayerQueryExtentOptions): js.Promise[Any] = js.native
  def queryExtent(query: Query_): js.Promise[Any] = js.native
  def queryExtent(query: Query_, options: KnowledgeGraphSublayerQueryExtentOptions): js.Promise[Any] = js.native
  
  /**
  		 * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) against the [knowledge graph service](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraphService.html) and returns the number of features that satisfy the query.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#queryFeatureCount)
  		 */
  def queryFeatureCount(): js.Promise[Double] = js.native
  def queryFeatureCount(query: scala.Unit, options: KnowledgeGraphSublayerQueryFeatureCountOptions): js.Promise[Double] = js.native
  def queryFeatureCount(query: QueryProperties): js.Promise[Double] = js.native
  def queryFeatureCount(query: QueryProperties, options: KnowledgeGraphSublayerQueryFeatureCountOptions): js.Promise[Double] = js.native
  def queryFeatureCount(query: Query_): js.Promise[Double] = js.native
  def queryFeatureCount(query: Query_, options: KnowledgeGraphSublayerQueryFeatureCountOptions): js.Promise[Double] = js.native
  
  /**
  		 * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) against the feature service and returns a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FeatureSet.html), which can be accessed using the `.then()` method once the promise resolves.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#queryFeatures)
  		 */
  def queryFeatures(): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: scala.Unit, options: KnowledgeGraphSublayerQueryFeaturesOptions): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: QueryProperties): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: QueryProperties, options: KnowledgeGraphSublayerQueryFeaturesOptions): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: Query_): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: Query_, options: KnowledgeGraphSublayerQueryFeaturesOptions): js.Promise[FeatureSet] = js.native
  
  /**
  		 * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) against the knowledge graph service and returns an array of Object IDs for features that satisfy the input query.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#queryObjectIds)
  		 */
  def queryObjectIds(): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: scala.Unit, options: KnowledgeGraphSublayerQueryObjectIdsOptions): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: QueryProperties): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: QueryProperties, options: KnowledgeGraphSublayerQueryObjectIdsOptions): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: Query_): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: Query_, options: KnowledgeGraphSublayerQueryObjectIdsOptions): js.Promise[js.Array[Double]] = js.native
  
  /**
  		 * The renderer assigned to the sublayer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#renderer)
  		 */
  var renderer: Renderer = js.native
  
  @JSName("type")
  val type_KnowledgeGraphSublayer: `knowledge-graph-sublayer` = js.native
}
