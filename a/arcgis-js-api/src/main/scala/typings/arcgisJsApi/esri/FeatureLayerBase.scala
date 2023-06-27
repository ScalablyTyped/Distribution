package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.mesh
import typings.arcgisJsApi.arcgisJsApiStrings.multipatch
import typings.arcgisJsApi.arcgisJsApiStrings.multipoint
import typings.arcgisJsApi.arcgisJsApiStrings.point
import typings.arcgisJsApi.arcgisJsApiStrings.polygon
import typings.arcgisJsApi.arcgisJsApiStrings.polyline
import typings.std.FormData
import typings.std.HTMLFormElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureLayerBase extends StObject {
  
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
  		 * The editor tracking fields, which record who adds or edits the data through the feature service and when edits are made.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#editFieldsInfo)
  		 */
  val editFieldsInfo: EditFieldsInfo = js.native
  
  /**
  		 * Specifies information about editing.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#editingInfo)
  		 */
  val editingInfo: EditingInfo = js.native
  
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
  		 * The full extent of the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#fullExtent)
  		 */
  var fullExtent: Extent = js.native
  
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
  		 * Array of [relationships](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html) set up for the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#relationships)
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
  		 * The title of the layer used to identify it in places such as the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) and [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) widgets.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#title)
  		 */
  var title: String = js.native
  
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
