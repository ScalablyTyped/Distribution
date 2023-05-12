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
import typings.arcgisJsApi.arcgisJsApiStrings.refresh
import typings.std.FormData
import typings.std.HTMLFormElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.arcgisJsApi.esri.FeatureLayerBase because var conflicts: fullExtent, title. Inlined capabilities, copyright, datesInUnknownTimezone, definitionExpression, displayField, editFieldsInfo, editingInfo, effectiveCapabilities, effectiveEditingEnabled, elevationInfo, fieldsIndex, floorInfo, gdbVersion, geometryFieldsInfo, geometryType, hasM, hasZ, historicMoment, isTable, layerId, objectIdField, relationships, returnM, returnZ, serviceDefinitionExpression, sourceJSON, spatialReference, url, version, addAttachment, addAttachment, applyEdits, applyEdits, deleteAttachments, getField, getFieldDomain, getFieldDomain, queryAttachments, queryAttachments, queryAttachments, queryAttachments, queryRelatedFeatures, queryRelatedFeatures, queryRelatedFeatures, queryRelatedFeatures, queryRelatedFeaturesCount, queryRelatedFeaturesCount, queryRelatedFeaturesCount, queryRelatedFeaturesCount, updateAttachment, updateAttachment */ @js.native
trait FeatureLayer
  extends StObject
     with Layer
     with OrderedLayer
     with PortalLayer
     with ScaleRangeLayer
     with TemporalLayer
     with BlendLayer
     with CustomParametersMixin
     with APIKeyMixin
     with FeatureEffectLayer
     with FeatureReductionLayer
     with PublishableLayer
     with _ProfileVariableInstanceType {
  
  def addAttachment(feature: Graphic, attachment: FormData): js.Promise[FeatureEditResult] = js.native
  /**
    * Adds an attachment to a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#addAttachment)
    */
  def addAttachment(feature: Graphic, attachment: HTMLFormElement): js.Promise[FeatureEditResult] = js.native
  
  /**
    * Applies edits to features in a layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#applyEdits)
    */
  def applyEdits(edits: FeatureLayerBaseApplyEditsEdits): js.Promise[EditsResult] = js.native
  def applyEdits(edits: FeatureLayerBaseApplyEditsEdits, options: FeatureLayerBaseApplyEditsOptions): js.Promise[EditsResult] = js.native
  
  /**
    * Describes the layer's supported capabilities.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#capabilities)
    */
  val capabilities: Capabilities = js.native
  
  /**
    * Copyright information for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#copyright)
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
  def createQuery(): Query_ = js.native
  
  /**
    * This property is set by the service publisher and indicates that dates should be considered without the local timezone.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#datesInUnknownTimezone)
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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#deleteAttachments)
    */
  def deleteAttachments(feature: Graphic, attachmentIds: js.Array[Double]): js.Promise[js.Array[FeatureEditResult]] = js.native
  
  /**
    * The name of the layer's primary display field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#displayField)
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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#editFieldsInfo)
    */
  val editFieldsInfo: EditFieldsInfo = js.native
  
  /**
    * Determines if the layer is editable.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#editingEnabled)
    */
  var editingEnabled: Boolean = js.native
  
  /**
    * The editor tracking fields, which record who adds or edits the data through the feature service and when edits are made.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#editingInfo)
    */
  val editingInfo: EditFieldsInfo = js.native
  
  /**
    * Describes effective capabilities of the layer taking in to consideration privileges of the currently signed-in user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#effectiveCapabilities)
    */
  val effectiveCapabilities: Capabilities = js.native
  
  /**
    * Indicates whether the layer is editable taking in to consideration privileges of the currently signed-in user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#effectiveEditingEnabled)
    */
  val effectiveEditingEnabled: Boolean = js.native
  
  /**
    * Specifies how features are placed on the vertical axis (z).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#elevationInfo)
    */
  var elevationInfo: FeatureLayerBaseElevationInfo = js.native
  
  /**
    * An array of fields in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#fields)
    */
  var fields: js.Array[Field] = js.native
  
  /**
    * A convenient property that can be used to make case-insensitive lookups for a field by name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#fieldsIndex)
    */
  val fieldsIndex: FieldsIndex = js.native
  
  /**
    * When a feature layer is configured as floor-aware, it has a floorInfo property defined.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#floorInfo)
    */
  var floorInfo: LayerFloorInfo = js.native
  
  /**
    * The [template](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html) used in an associated layer's [FeatureForm](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#formTemplate)
    */
  var formTemplate: FormTemplate = js.native
  
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
    * Returns a [FeatureType](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureType.html) describing the feature's type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#getFeatureType)
    */
  def getFeatureType(feature: Graphic): FeatureType = js.native
  
  /**
    * Returns the [Field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html) instance for a field name (case-insensitive).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#getField)
    */
  def getField(fieldName: String): Field = js.native
  
  /**
    * Returns the [Domain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html) associated with the given field name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#getFieldDomain)
    */
  def getFieldDomain(fieldName: String): Domain = js.native
  def getFieldDomain(fieldName: String, options: FeatureLayerBaseGetFieldDomainOptions): Domain = js.native
  
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
    * The label definition for this layer, specified as an array of [LabelClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#labelingInfo)
    */
  var labelingInfo: js.Array[LabelClass] = js.native
  
  /**
    * Indicates whether to display labels for this layer.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#labelsVisible)
    */
  var labelsVisible: Boolean = js.native
  
  /**
    * The layer ID, or layer index, of a Feature Service layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#layerId)
    */
  var layerId: Double = js.native
  
  /**
    * Indicates whether the layer will be included in the legend.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#legendEnabled)
    */
  var legendEnabled: Boolean = js.native
  
  /**
    * The name of an `oid` [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#fields) containing a unique value or identifier for each feature in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#objectIdField)
    */
  var objectIdField: String = js.native
  
  @JSName("on")
  def on_edits(name: edits, eventHandler: FeatureLayerEditsEventHandler): IHandle = js.native
  @JSName("on")
  def on_refresh(name: refresh, eventHandler: FeatureLayerRefreshEventHandler): IHandle = js.native
  
  /**
    * An array of field names from the service to include with each feature.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#outFields)
    */
  var outFields: js.Array[String] = js.native
  
  /**
    * Indicates whether to display popups when features in the layer are clicked.
    *
    * @default true
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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#queryAttachments)
    */
  def queryAttachments(attachmentQuery: AttachmentQuery): js.Promise[Any] = js.native
  def queryAttachments(attachmentQuery: AttachmentQueryProperties): js.Promise[Any] = js.native
  def queryAttachments(attachmentQuery: AttachmentQueryProperties, options: FeatureLayerBaseQueryAttachmentsOptions): js.Promise[Any] = js.native
  def queryAttachments(attachmentQuery: AttachmentQuery, options: FeatureLayerBaseQueryAttachmentsOptions): js.Promise[Any] = js.native
  
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) against the feature service and returns the [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of features that satisfy the query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#queryExtent)
    */
  def queryExtent(): js.Promise[Any] = js.native
  def queryExtent(query: scala.Unit, options: FeatureLayerQueryExtentOptions): js.Promise[Any] = js.native
  def queryExtent(query: QueryProperties): js.Promise[Any] = js.native
  def queryExtent(query: QueryProperties, options: FeatureLayerQueryExtentOptions): js.Promise[Any] = js.native
  def queryExtent(query: Query_): js.Promise[Any] = js.native
  def queryExtent(query: Query_, options: FeatureLayerQueryExtentOptions): js.Promise[Any] = js.native
  
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) against the feature service and returns the number of features that satisfy the query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#queryFeatureCount)
    */
  def queryFeatureCount(): js.Promise[Double] = js.native
  def queryFeatureCount(query: scala.Unit, options: FeatureLayerQueryFeatureCountOptions): js.Promise[Double] = js.native
  def queryFeatureCount(query: QueryProperties): js.Promise[Double] = js.native
  def queryFeatureCount(query: QueryProperties, options: FeatureLayerQueryFeatureCountOptions): js.Promise[Double] = js.native
  def queryFeatureCount(query: Query_): js.Promise[Double] = js.native
  def queryFeatureCount(query: Query_, options: FeatureLayerQueryFeatureCountOptions): js.Promise[Double] = js.native
  
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) against the feature service and returns a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FeatureSet.html), which can be accessed using the `.then()` method once the promise resolves.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#queryFeatures)
    */
  def queryFeatures(): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: scala.Unit, options: FeatureLayerQueryFeaturesOptions): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: QueryProperties): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: QueryProperties, options: FeatureLayerQueryFeaturesOptions): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: Query_): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: Query_, options: FeatureLayerQueryFeaturesOptions): js.Promise[FeatureSet] = js.native
  
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) against the feature service and returns an array of Object IDs for features that satisfy the input query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#queryObjectIds)
    */
  def queryObjectIds(): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: scala.Unit, options: FeatureLayerQueryObjectIdsOptions): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: QueryProperties): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: QueryProperties, options: FeatureLayerQueryObjectIdsOptions): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: Query_): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: Query_, options: FeatureLayerQueryObjectIdsOptions): js.Promise[js.Array[Double]] = js.native
  
  /**
    * Executes a [RelationshipQuery](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RelationshipQuery.html) against the feature service and returns [FeatureSets](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FeatureSet.html) grouped by source layer or table objectIds.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#queryRelatedFeatures)
    */
  def queryRelatedFeatures(relationshipQuery: RelationshipQuery): js.Promise[Any] = js.native
  def queryRelatedFeatures(relationshipQuery: RelationshipQueryProperties): js.Promise[Any] = js.native
  def queryRelatedFeatures(
    relationshipQuery: RelationshipQueryProperties,
    options: FeatureLayerBaseQueryRelatedFeaturesOptions
  ): js.Promise[Any] = js.native
  def queryRelatedFeatures(relationshipQuery: RelationshipQuery, options: FeatureLayerBaseQueryRelatedFeaturesOptions): js.Promise[Any] = js.native
  
  /**
    * Executes a [RelationshipQuery](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RelationshipQuery.html) against the feature service and when resolved, it returns an `object` containing key value pairs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#queryRelatedFeaturesCount)
    */
  def queryRelatedFeaturesCount(relationshipQuery: RelationshipQuery): js.Promise[Any] = js.native
  def queryRelatedFeaturesCount(relationshipQuery: RelationshipQueryProperties): js.Promise[Any] = js.native
  def queryRelatedFeaturesCount(
    relationshipQuery: RelationshipQueryProperties,
    options: FeatureLayerBaseQueryRelatedFeaturesCountOptions
  ): js.Promise[Any] = js.native
  def queryRelatedFeaturesCount(relationshipQuery: RelationshipQuery, options: FeatureLayerBaseQueryRelatedFeaturesCountOptions): js.Promise[Any] = js.native
  
  /**
    * Executes a [TopFeaturesQuery](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html) against a feature service and returns the count of features or records that satisfy the query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#queryTopFeatureCount)
    */
  def queryTopFeatureCount(topFeaturesQuery: TopFeaturesQuery): js.Promise[Double] = js.native
  def queryTopFeatureCount(topFeaturesQuery: TopFeaturesQueryProperties): js.Promise[Double] = js.native
  def queryTopFeatureCount(topFeaturesQuery: TopFeaturesQueryProperties, options: FeatureLayerQueryTopFeatureCountOptions): js.Promise[Double] = js.native
  def queryTopFeatureCount(topFeaturesQuery: TopFeaturesQuery, options: FeatureLayerQueryTopFeatureCountOptions): js.Promise[Double] = js.native
  
  /**
    * Executes a [TopFeaturesQuery](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html) against a feature service and returns a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FeatureSet.html) once the promise resolves.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#queryTopFeatures)
    */
  def queryTopFeatures(topFeaturesQuery: TopFeaturesQuery): js.Promise[FeatureSet] = js.native
  def queryTopFeatures(topFeaturesQuery: TopFeaturesQueryProperties): js.Promise[FeatureSet] = js.native
  def queryTopFeatures(topFeaturesQuery: TopFeaturesQueryProperties, options: FeatureLayerQueryTopFeaturesOptions): js.Promise[FeatureSet] = js.native
  def queryTopFeatures(topFeaturesQuery: TopFeaturesQuery, options: FeatureLayerQueryTopFeaturesOptions): js.Promise[FeatureSet] = js.native
  
  /**
    * Executes a [TopFeaturesQuery](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html) against a feature service and returns the [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of features that satisfy the query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#queryTopFeaturesExtent)
    */
  def queryTopFeaturesExtent(topFeaturesQuery: TopFeaturesQuery): js.Promise[Any] = js.native
  def queryTopFeaturesExtent(topFeaturesQuery: TopFeaturesQueryProperties): js.Promise[Any] = js.native
  def queryTopFeaturesExtent(topFeaturesQuery: TopFeaturesQueryProperties, options: FeatureLayerQueryTopFeaturesExtentOptions): js.Promise[Any] = js.native
  def queryTopFeaturesExtent(topFeaturesQuery: TopFeaturesQuery, options: FeatureLayerQueryTopFeaturesExtentOptions): js.Promise[Any] = js.native
  
  /**
    * Executes a [TopFeaturesQuery](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html) against a feature service and returns an array of Object IDs of features that satisfy the query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#queryTopObjectIds)
    */
  def queryTopObjectIds(topFeaturesQuery: TopFeaturesQuery): js.Promise[js.Array[Double]] = js.native
  def queryTopObjectIds(topFeaturesQuery: TopFeaturesQueryProperties): js.Promise[js.Array[Double]] = js.native
  def queryTopObjectIds(topFeaturesQuery: TopFeaturesQueryProperties, options: FeatureLayerQueryTopObjectIdsOptions): js.Promise[js.Array[Double]] = js.native
  def queryTopObjectIds(topFeaturesQuery: TopFeaturesQuery, options: FeatureLayerQueryTopObjectIdsOptions): js.Promise[js.Array[Double]] = js.native
  
  /**
    * Fetches all the data for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#refresh)
    */
  def refresh(): scala.Unit = js.native
  
  /**
    * Refresh interval of the layer in minutes.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#refreshInterval)
    */
  var refreshInterval: Double = js.native
  
  /**
    * Array of [relationships](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html) set up for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#relationships)
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
    * Saves the layer to its existing portal item in the [Portal](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html) authenticated within the user's current session.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#save)
    */
  def save(): js.Promise[PortalItem] = js.native
  def save(options: FeatureLayerSaveOptions): js.Promise[PortalItem] = js.native
  
  /**
    * Saves the layer to a new portal item in the [Portal](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html) authenticated within the user's current session.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#saveAs)
    */
  def saveAs(portalItem: PortalItem): js.Promise[PortalItem] = js.native
  def saveAs(portalItem: PortalItemProperties): js.Promise[PortalItem] = js.native
  def saveAs(portalItem: PortalItemProperties, options: FeatureLayerSaveAsOptions): js.Promise[PortalItem] = js.native
  def saveAs(portalItem: PortalItem, options: FeatureLayerSaveAsOptions): js.Promise[PortalItem] = js.native
  
  /**
    * Apply perspective scaling to screen-size point symbols in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#screenSizePerspectiveEnabled)
    */
  var screenSizePerspectiveEnabled: Boolean = js.native
  
  /**
    * The service definition expression limits the features available for display and query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#serviceDefinitionExpression)
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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#updateAttachment)
    */
  def updateAttachment(feature: Graphic, attachmentId: Double, attachment: HTMLFormElement): js.Promise[FeatureEditResult] = js.native
  
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
