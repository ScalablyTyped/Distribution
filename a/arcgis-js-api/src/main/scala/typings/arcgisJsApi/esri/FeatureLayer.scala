package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.edits
import typings.arcgisJsApi.arcgisJsApiStrings.feature
import typings.arcgisJsApi.arcgisJsApiStrings.mesh
import typings.arcgisJsApi.arcgisJsApiStrings.multipatch
import typings.arcgisJsApi.arcgisJsApiStrings.multipoint
import typings.arcgisJsApi.arcgisJsApiStrings.point
import typings.arcgisJsApi.arcgisJsApiStrings.polygon
import typings.arcgisJsApi.arcgisJsApiStrings.polyline
import typings.std.Date
import typings.std.FormData
import typings.std.HTMLFormElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureLayer
  extends StObject
     with Layer
     with PortalLayer
     with ScaleRangeLayer
     with RefreshableLayer
     with TemporalLayer
     with BlendLayer {
  
  def addAttachment(feature: Graphic, attachment: FormData): js.Promise[FeatureEditResult] = js.native
  /**
    * Adds an attachment to a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#addAttachment)
    */
  def addAttachment(feature: Graphic, attachment: HTMLFormElement): js.Promise[FeatureEditResult] = js.native
  
  /**
    * Applies edits to features in a layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits)
    */
  def applyEdits(edits: FeatureLayerApplyEditsEdits): js.Promise[js.Any] = js.native
  def applyEdits(edits: FeatureLayerApplyEditsEdits, options: FeatureLayerApplyEditsOptions): js.Promise[js.Any] = js.native
  
  /**
    * Describes the layer's supported capabilities.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  val capabilities: FeatureLayerCapabilities = js.native
  
  /**
    * Copyright information for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#copyright)
    */
  var copyright: String = js.native
  
  /**
    * Creates a popup template for the layer, populated with all the fields of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#createPopupTemplate)
    */
  def createPopupTemplate(): PopupTemplate = js.native
  def createPopupTemplate(options: CreatePopupTemplateOptions): PopupTemplate = js.native
  
  /**
    * Creates query parameter object that can be used to fetch features that satisfy the layer's configurations such as [definitionExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#definitionExpression), [gdbVersion](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#gdbVersion), and [historicMoment](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#historicMoment).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#createQuery)
    */
  def createQuery(): Query = js.native
  
  /**
    * The SQL where clause used to filter features on the client.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#definitionExpression)
    */
  var definitionExpression: String = js.native
  
  /**
    * Deletes attachments from a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#deleteAttachments)
    */
  def deleteAttachments(feature: Graphic, attachmentIds: js.Array[Double]): js.Promise[FeatureEditResult] = js.native
  
  /**
    * The name of the layer's primary display field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#displayField)
    */
  var displayField: String = js.native
  
  /**
    * An object that allows you to create a dynamic layer with data either from map service sublayers or data from a registered workspace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#dynamicDataSource)
    */
  var dynamicDataSource: DynamicMapLayer | DynamicDataLayer = js.native
  
  /**
    * The editor tracking fields, which record who adds or edits the data through the feature service and when edits are made.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#editFieldsInfo)
    */
  val editFieldsInfo: EditFieldsInfo = js.native
  
  /**
    * If present, this value specifies information about editing.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#editingInfo)
    */
  val editingInfo: EditingInfo = js.native
  
  /**
    * Specifies how features are placed on the vertical axis (z).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#elevationInfo)
    */
  var elevationInfo: FeatureLayerElevationInfo = js.native
  
  /**
    * Configures the method for reducing the number of point features in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#featureReduction)
    */
  var featureReduction: FeatureReductionCluster | FeatureReductionSelection = js.native
  
  /**
    * An array of fields in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#fields)
    */
  var fields: js.Array[Field] = js.native
  
  /**
    * A convenient property that can be used to make case-insensitive lookups for a field by name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#fieldsIndex)
    */
  val fieldsIndex: FieldsIndex = js.native
  
  /**
    * The associated [template](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html) used in an associated layer's [FeatureForm](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#formTemplate)
    */
  var formTemplate: FormTemplate = js.native
  
  /**
    * The version of the geodatabase of the feature service data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#gdbVersion)
    */
  var gdbVersion: String = js.native
  
  /**
    * The geometry type of features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#geometryType)
    */
  var geometryType: point | multipoint | polyline | polygon | multipatch | mesh = js.native
  
  /**
    * Returns a [FeatureType](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureType.html) describing the feature's type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#getFeatureType)
    */
  def getFeatureType(feature: Graphic): FeatureType = js.native
  
  /**
    * Returns the [Field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html) instance for a field name (case-insensitive).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#getField)
    */
  def getField(fieldName: String): Field = js.native
  
  /**
    * Returns the [Domain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html) associated with the given field name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#getFieldDomain)
    */
  def getFieldDomain(fieldName: String): Domain = js.native
  def getFieldDomain(fieldName: String, options: FeatureLayerGetFieldDomainOptions): Domain = js.native
  
  /**
    * Indicates whether the client-side features in the layer have `M` (measurement) values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#hasM)
    */
  var hasM: Boolean = js.native
  
  /**
    * Indicates whether the client-side features in the layer have `Z` (elevation) values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#hasZ)
    */
  var hasZ: Boolean = js.native
  
  /**
    * The historic moment to query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#historicMoment)
    */
  var historicMoment: Date = js.native
  
  /**
    * Returns `true` if the layer is loaded from a non-spatial table in a service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#isTable)
    */
  val isTable: Boolean = js.native
  
  /**
    * The label definition for this layer, specified as an array of [LabelClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#labelingInfo)
    */
  var labelingInfo: js.Array[LabelClass] = js.native
  
  /**
    * Indicates whether to display labels for this layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#labelsVisible)
    */
  var labelsVisible: Boolean = js.native
  
  /**
    * The layer ID, or layer index, of a Feature Service layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#layerId)
    */
  var layerId: Double = js.native
  
  /**
    * Indicates whether the layer will be included in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#legendEnabled)
    */
  var legendEnabled: Boolean = js.native
  
  /**
    * The name of an `oid` [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#fields) containing a unique value or identifier for each feature in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#objectIdField)
    */
  var objectIdField: String = js.native
  
  @JSName("on")
  def on_edits(name: edits, eventHandler: FeatureLayerEditsEventHandler): IHandle = js.native
  
  /**
    * An array of field names from the service to include with each feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#outFields)
    */
  var outFields: js.Array[String] = js.native
  
  /**
    * Indicates whether to display popups when features in the layer are clicked.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#popupEnabled)
    */
  var popupEnabled: Boolean = js.native
  
  /**
    * The popup template for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#popupTemplate)
    */
  var popupTemplate: PopupTemplate = js.native
  
  /**
    * Query information about attachments associated with features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#queryAttachments)
    */
  def queryAttachments(attachmentQuery: AttachmentQuery): js.Promise[js.Any] = js.native
  def queryAttachments(attachmentQuery: AttachmentQueryProperties): js.Promise[js.Any] = js.native
  def queryAttachments(attachmentQuery: AttachmentQueryProperties, options: FeatureLayerQueryAttachmentsOptions): js.Promise[js.Any] = js.native
  def queryAttachments(attachmentQuery: AttachmentQuery, options: FeatureLayerQueryAttachmentsOptions): js.Promise[js.Any] = js.native
  
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against the feature service and returns the [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of features that satisfy the query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#queryExtent)
    */
  def queryExtent(): js.Promise[js.Any] = js.native
  def queryExtent(query: Unit, options: FeatureLayerQueryExtentOptions): js.Promise[js.Any] = js.native
  def queryExtent(query: Query): js.Promise[js.Any] = js.native
  def queryExtent(query: QueryProperties): js.Promise[js.Any] = js.native
  def queryExtent(query: QueryProperties, options: FeatureLayerQueryExtentOptions): js.Promise[js.Any] = js.native
  def queryExtent(query: Query, options: FeatureLayerQueryExtentOptions): js.Promise[js.Any] = js.native
  
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against the feature service and returns the number of features that satisfy the query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#queryFeatureCount)
    */
  def queryFeatureCount(): js.Promise[Double] = js.native
  def queryFeatureCount(query: Unit, options: FeatureLayerQueryFeatureCountOptions): js.Promise[Double] = js.native
  def queryFeatureCount(query: Query): js.Promise[Double] = js.native
  def queryFeatureCount(query: QueryProperties): js.Promise[Double] = js.native
  def queryFeatureCount(query: QueryProperties, options: FeatureLayerQueryFeatureCountOptions): js.Promise[Double] = js.native
  def queryFeatureCount(query: Query, options: FeatureLayerQueryFeatureCountOptions): js.Promise[Double] = js.native
  
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against the feature service and returns a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html), which can be accessed using the `.then()` method once the promise resolves.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#queryFeatures)
    */
  def queryFeatures(): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: Unit, options: FeatureLayerQueryFeaturesOptions): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: Query): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: QueryProperties): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: QueryProperties, options: FeatureLayerQueryFeaturesOptions): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: Query, options: FeatureLayerQueryFeaturesOptions): js.Promise[FeatureSet] = js.native
  
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against the feature service and returns an array of Object IDs for features that satisfy the input query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#queryObjectIds)
    */
  def queryObjectIds(): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: Unit, options: FeatureLayerQueryObjectIdsOptions): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: Query): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: QueryProperties): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: QueryProperties, options: FeatureLayerQueryObjectIdsOptions): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: Query, options: FeatureLayerQueryObjectIdsOptions): js.Promise[js.Array[Double]] = js.native
  
  /**
    * Executes a [RelationshipQuery](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html) against the feature service and returns [FeatureSets](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html) grouped by source layer or table objectIds.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#queryRelatedFeatures)
    */
  def queryRelatedFeatures(relationshipQuery: RelationshipQuery): js.Promise[js.Any] = js.native
  def queryRelatedFeatures(relationshipQuery: RelationshipQueryProperties): js.Promise[js.Any] = js.native
  def queryRelatedFeatures(relationshipQuery: RelationshipQueryProperties, options: FeatureLayerQueryRelatedFeaturesOptions): js.Promise[js.Any] = js.native
  def queryRelatedFeatures(relationshipQuery: RelationshipQuery, options: FeatureLayerQueryRelatedFeaturesOptions): js.Promise[js.Any] = js.native
  
  /**
    * Executes a [RelationshipQuery](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html) against the feature service and when resolved, it returns an `object` containing key value pairs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#queryRelatedFeaturesCount)
    */
  def queryRelatedFeaturesCount(relationshipQuery: RelationshipQuery): js.Promise[js.Any] = js.native
  def queryRelatedFeaturesCount(relationshipQuery: RelationshipQueryProperties): js.Promise[js.Any] = js.native
  def queryRelatedFeaturesCount(
    relationshipQuery: RelationshipQueryProperties,
    options: FeatureLayerQueryRelatedFeaturesCountOptions
  ): js.Promise[js.Any] = js.native
  def queryRelatedFeaturesCount(relationshipQuery: RelationshipQuery, options: FeatureLayerQueryRelatedFeaturesCountOptions): js.Promise[js.Any] = js.native
  
  /**
    * Array of [relationships](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html) set up for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#relationships)
    */
  val relationships: js.Array[Relationship_] = js.native
  
  /**
    * The renderer assigned to the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#renderer)
    */
  var renderer: Renderer = js.native
  
  /**
    * When `true`, indicates that M values will be returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#returnM)
    */
  var returnM: Boolean = js.native
  
  /**
    * When `true`, indicates that z-values will always be returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#returnZ)
    */
  var returnZ: Boolean = js.native
  
  /**
    * Apply perspective scaling to screen-size point symbols in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#screenSizePerspectiveEnabled)
    */
  var screenSizePerspectiveEnabled: Boolean = js.native
  
  /**
    * The service definition expression limits the features available for display and query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#serviceDefinitionExpression)
    */
  val serviceDefinitionExpression: String = js.native
  
  /**
    * A collection of [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) objects used to create a FeatureLayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#source)
    */
  var source: Collection[Graphic] = js.native
  
  /**
    * The [feature service's metadata JSON](https://developers.arcgis.com/rest/services-reference/layer-feature-service-.htm) exposed by the ArcGIS REST API.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#sourceJSON)
    */
  var sourceJSON: js.Any = js.native
  
  /**
    * The spatial reference of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#spatialReference)
    */
  var spatialReference: SpatialReference = js.native
  
  /**
    * An array of feature templates defined in the feature layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#templates)
    */
  var templates: js.Array[FeatureTemplate] = js.native
  
  /**
    * The name of the field holding the type ID or subtypes for the features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#typeIdField)
    */
  var typeIdField: String = js.native
  
  /**
    * For [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) the type is `feature`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#type)
    */
  @JSName("type")
  val type_FeatureLayer: feature = js.native
  
  /**
    * An array of subtypes defined in the feature service exposed by ArcGIS REST API.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#types)
    */
  var types: js.Array[FeatureType] = js.native
  
  def updateAttachment(feature: Graphic, attachmentId: Double, attachment: FormData): js.Promise[FeatureEditResult] = js.native
  /**
    * Updates an existing attachment for a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#updateAttachment)
    */
  def updateAttachment(feature: Graphic, attachmentId: Double, attachment: HTMLFormElement): js.Promise[FeatureEditResult] = js.native
  
  /**
    * The URL of the REST endpoint of the layer, non-spatial table or service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#url)
    */
  var url: String = js.native
  
  /**
    * The version of ArcGIS Server in which the layer is published.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#version)
    */
  val version: Double = js.native
}
