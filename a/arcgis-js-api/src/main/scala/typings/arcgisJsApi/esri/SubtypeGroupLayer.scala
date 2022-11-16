package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`subtype-group`
import typings.arcgisJsApi.arcgisJsApiStrings.edits
import typings.arcgisJsApi.arcgisJsApiStrings.mesh
import typings.arcgisJsApi.arcgisJsApiStrings.multipatch
import typings.arcgisJsApi.arcgisJsApiStrings.multipoint
import typings.arcgisJsApi.arcgisJsApiStrings.point
import typings.arcgisJsApi.arcgisJsApiStrings.polygon
import typings.arcgisJsApi.arcgisJsApiStrings.polyline
import typings.arcgisJsApi.arcgisJsApiStrings.refresh
import typings.std.FormData
import typings.std.HTMLFormElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.arcgisJsApi.esri.FeatureLayerBase because var conflicts: fullExtent. Inlined copyright, definitionExpression, displayField, editFieldsInfo, editingInfo, elevationInfo, floorInfo, gdbVersion, geometryFieldsInfo, geometryType, hasM, hasZ, historicMoment, isTable, layerId, objectIdField, returnM, returnZ, serviceDefinitionExpression, sourceJSON, spatialReference, url, version */ @js.native
trait SubtypeGroupLayer
  extends StObject
     with Layer
     with PortalLayer
     with ScaleRangeLayer
     with RefreshableLayer
     with TemporalLayer
     with BlendLayer
     with CustomParametersMixin {
  
  def addAttachment(feature: Graphic, attachment: FormData): js.Promise[SubtypeGroupLayerFeatureEditResult] = js.native
  /**
    * Adds an attachment to a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#addAttachment)
    */
  def addAttachment(feature: Graphic, attachment: HTMLFormElement): js.Promise[SubtypeGroupLayerFeatureEditResult] = js.native
  
  /**
    * Applies edits to features in a layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#applyEdits)
    */
  def applyEdits(edits: SubtypeGroupLayerApplyEditsEdits): js.Promise[Any] = js.native
  def applyEdits(edits: SubtypeGroupLayerApplyEditsEdits, options: SubtypeGroupLayerApplyEditsOptions): js.Promise[Any] = js.native
  
  /**
    * Describes the layer's supported capabilities.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#capabilities)
    */
  val capabilities: SubtypeGroupLayerCapabilities = js.native
  
  /**
    * Copyright information for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#copyright)
    */
  var copyright: String = js.native
  
  /**
    * Creates query parameter object that can be used to fetch features that satisfy the layer's configurations such as [definitionExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#definitionExpression), [gdbVersion](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#gdbVersion), and [historicMoment](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#historicMoment).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#createQuery)
    */
  def createQuery(): Query_ = js.native
  
  /**
    * This property is set by the service publisher and indicates that dates should be considered without the local timezone.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#datesInUnknownTimezone)
    */
  val datesInUnknownTimezone: Boolean = js.native
  
  /**
    * The SQL where clause used to filter features on the client.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#definitionExpression)
    */
  var definitionExpression: String = js.native
  
  /**
    * Deletes attachments from a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#deleteAttachments)
    */
  def deleteAttachments(feature: Graphic, attachmentIds: js.Array[Double]): js.Promise[SubtypeGroupLayerFeatureEditResult] = js.native
  
  /**
    * The name of the layer's primary display field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#displayField)
    */
  var displayField: String = js.native
  
  /**
    * The editor tracking fields, which record who adds or edits the data through the feature service and when edits are made.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#editFieldsInfo)
    */
  val editFieldsInfo: EditFieldsInfo = js.native
  
  /**
    * Determines if the layer is editable.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#editingEnabled)
    */
  var editingEnabled: Boolean = js.native
  
  /**
    * The editor tracking fields, which record who adds or edits the data through the feature service and when edits are made.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#editingInfo)
    */
  val editingInfo: EditFieldsInfo = js.native
  
  /**
    * Specifies how features are placed on the vertical axis (z).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#elevationInfo)
    */
  var elevationInfo: FeatureLayerBaseElevationInfo = js.native
  
  /**
    * An array of fields in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#fields)
    */
  var fields: js.Array[Field] = js.native
  
  /**
    * A convenient property that can be used to make case-insensitive lookups for a field by name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#fieldsIndex)
    */
  val fieldsIndex: FieldsIndex = js.native
  
  /**
    * When a feature layer is configured as floor-aware, it has a floorInfo property defined.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#floorInfo)
    */
  var floorInfo: LayerFloorInfo = js.native
  
  /**
    * The version of the geodatabase of the feature service data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#gdbVersion)
    */
  var gdbVersion: String = js.native
  
  /**
    * Provides information on the system maintained area and length fields along with their respective units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#geometryFieldsInfo)
    */
  val geometryFieldsInfo: GeometryFieldsInfo = js.native
  
  /**
    * The geometry type of features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#geometryType)
    */
  var geometryType: point | multipoint | polyline | polygon | multipatch | mesh = js.native
  
  /**
    * Returns the [Field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html) instance for a field name (case-insensitive).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#getField)
    */
  def getField(fieldName: String): Field = js.native
  
  /**
    * Returns the [Domain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html) associated with the given field name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#getFieldDomain)
    */
  def getFieldDomain(fieldName: String): Domain = js.native
  def getFieldDomain(fieldName: String, options: SubtypeGroupLayerGetFieldDomainOptions): Domain = js.native
  
  /**
    * Indicates whether the client-side features in the layer have `M` (measurement) values.
    *
    * @default undefined
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#hasM)
    */
  var hasM: Boolean = js.native
  
  /**
    * Indicates whether the client-side features in the layer have `Z` (elevation) values.
    *
    * @default undefined
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#hasZ)
    */
  var hasZ: Boolean = js.native
  
  /**
    * The historic moment to query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#historicMoment)
    */
  var historicMoment: js.Date = js.native
  
  /**
    * Returns `true` if the layer is loaded from a non-spatial table in a service.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#isTable)
    */
  val isTable: Boolean = js.native
  
  /**
    * The layer ID, or layer index, of a Feature Service layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#layerId)
    */
  var layerId: Double = js.native
  
  /**
    * The name of an `oid` [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#fields) containing a unique value or identifier for each feature in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#objectIdField)
    */
  var objectIdField: String = js.native
  
  @JSName("on")
  def on_edits(name: edits, eventHandler: SubtypeGroupLayerEditsEventHandler): IHandle = js.native
  @JSName("on")
  def on_refresh(name: refresh, eventHandler: SubtypeGroupLayerRefreshEventHandler): IHandle = js.native
  
  /**
    * An array of field names from the service to include with each feature.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#outFields)
    */
  var outFields: js.Array[String] = js.native
  
  /**
    * Query information about attachments associated with features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#queryAttachments)
    */
  def queryAttachments(attachmentQuery: AttachmentQuery): js.Promise[Any] = js.native
  def queryAttachments(attachmentQuery: AttachmentQueryProperties): js.Promise[Any] = js.native
  def queryAttachments(attachmentQuery: AttachmentQueryProperties, options: SubtypeGroupLayerQueryAttachmentsOptions): js.Promise[Any] = js.native
  def queryAttachments(attachmentQuery: AttachmentQuery, options: SubtypeGroupLayerQueryAttachmentsOptions): js.Promise[Any] = js.native
  
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) against the feature service and returns the [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of features that satisfy the query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#queryExtent)
    */
  def queryExtent(): js.Promise[Any] = js.native
  def queryExtent(query: scala.Unit, options: SubtypeGroupLayerQueryExtentOptions): js.Promise[Any] = js.native
  def queryExtent(query: QueryProperties): js.Promise[Any] = js.native
  def queryExtent(query: QueryProperties, options: SubtypeGroupLayerQueryExtentOptions): js.Promise[Any] = js.native
  def queryExtent(query: Query_): js.Promise[Any] = js.native
  def queryExtent(query: Query_, options: SubtypeGroupLayerQueryExtentOptions): js.Promise[Any] = js.native
  
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) against the feature service and returns the number of features that satisfy the query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#queryFeatureCount)
    */
  def queryFeatureCount(): js.Promise[Double] = js.native
  def queryFeatureCount(query: scala.Unit, options: SubtypeGroupLayerQueryFeatureCountOptions): js.Promise[Double] = js.native
  def queryFeatureCount(query: QueryProperties): js.Promise[Double] = js.native
  def queryFeatureCount(query: QueryProperties, options: SubtypeGroupLayerQueryFeatureCountOptions): js.Promise[Double] = js.native
  def queryFeatureCount(query: Query_): js.Promise[Double] = js.native
  def queryFeatureCount(query: Query_, options: SubtypeGroupLayerQueryFeatureCountOptions): js.Promise[Double] = js.native
  
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) against the feature service and returns a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FeatureSet.html), which can be accessed using the `.then()` method once the promise resolves.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#queryFeatures)
    */
  def queryFeatures(): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: scala.Unit, options: SubtypeGroupLayerQueryFeaturesOptions): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: QueryProperties): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: QueryProperties, options: SubtypeGroupLayerQueryFeaturesOptions): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: Query_): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: Query_, options: SubtypeGroupLayerQueryFeaturesOptions): js.Promise[FeatureSet] = js.native
  
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) against the feature service and returns an array of Object IDs for features that satisfy the input query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#queryObjectIds)
    */
  def queryObjectIds(): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: scala.Unit, options: SubtypeGroupLayerQueryObjectIdsOptions): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: QueryProperties): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: QueryProperties, options: SubtypeGroupLayerQueryObjectIdsOptions): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: Query_): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: Query_, options: SubtypeGroupLayerQueryObjectIdsOptions): js.Promise[js.Array[Double]] = js.native
  
  /**
    * Executes a [RelationshipQuery](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RelationshipQuery.html) against the feature service and returns [FeatureSets](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FeatureSet.html) grouped by source layer or table objectIds.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#queryRelatedFeatures)
    */
  def queryRelatedFeatures(relationshipQuery: RelationshipQuery): js.Promise[Any] = js.native
  def queryRelatedFeatures(relationshipQuery: RelationshipQueryProperties): js.Promise[Any] = js.native
  def queryRelatedFeatures(
    relationshipQuery: RelationshipQueryProperties,
    options: SubtypeGroupLayerQueryRelatedFeaturesOptions
  ): js.Promise[Any] = js.native
  def queryRelatedFeatures(relationshipQuery: RelationshipQuery, options: SubtypeGroupLayerQueryRelatedFeaturesOptions): js.Promise[Any] = js.native
  
  /**
    * Executes a [RelationshipQuery](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RelationshipQuery.html) against the feature service and when resolved, it returns an `object` containing key value pairs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#queryRelatedFeaturesCount)
    */
  def queryRelatedFeaturesCount(relationshipQuery: RelationshipQuery): js.Promise[Any] = js.native
  def queryRelatedFeaturesCount(relationshipQuery: RelationshipQueryProperties): js.Promise[Any] = js.native
  def queryRelatedFeaturesCount(
    relationshipQuery: RelationshipQueryProperties,
    options: SubtypeGroupLayerQueryRelatedFeaturesCountOptions
  ): js.Promise[Any] = js.native
  def queryRelatedFeaturesCount(relationshipQuery: RelationshipQuery, options: SubtypeGroupLayerQueryRelatedFeaturesCountOptions): js.Promise[Any] = js.native
  
  /**
    * Array of [relationships](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html) set up for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#relationships)
    */
  val relationships: js.Array[Relationship_] = js.native
  
  /**
    * When `true`, indicates that M values will be returned.
    *
    * @default undefined
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#returnM)
    */
  var returnM: Boolean = js.native
  
  /**
    * When `true`, indicates that z-values will always be returned.
    *
    * @default undefined
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#returnZ)
    */
  var returnZ: Boolean = js.native
  
  /**
    * The service definition expression limits the features available for display and query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#serviceDefinitionExpression)
    */
  val serviceDefinitionExpression: String = js.native
  
  /**
    * The [feature service's metadata JSON](https://developers.arcgis.com/rest/services-reference/layer-feature-service-.htm) exposed by the ArcGIS REST API.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#sourceJSON)
    */
  var sourceJSON: Any = js.native
  
  /**
    * The spatial reference of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#spatialReference)
    */
  var spatialReference: SpatialReference = js.native
  
  /**
    * A [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of [SubtypeSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html) objects that allow you to alter the properties of one or more sublayers of the SubtypeGroupLayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#sublayers)
    */
  var sublayers: Collection[SubtypeSublayer] = js.native
  
  /**
    * The name of the SubtypeGroupLayer's subtype field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#subtypeField)
    */
  var subtypeField: String = js.native
  
  @JSName("type")
  val type_SubtypeGroupLayer: `subtype-group` = js.native
  
  def updateAttachment(feature: Graphic, attachmentId: Double, attachment: FormData): js.Promise[SubtypeGroupLayerFeatureEditResult] = js.native
  /**
    * Updates an existing attachment for a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#updateAttachment)
    */
  def updateAttachment(feature: Graphic, attachmentId: Double, attachment: HTMLFormElement): js.Promise[SubtypeGroupLayerFeatureEditResult] = js.native
  
  /**
    * The absolute URL of the REST endpoint of the layer, non-spatial table or service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#url)
    */
  var url: String = js.native
  
  /**
    * The version of ArcGIS Server in which the layer is published.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#version)
    */
  val version: Double = js.native
}
