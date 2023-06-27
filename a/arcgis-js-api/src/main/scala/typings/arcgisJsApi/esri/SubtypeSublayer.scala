package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`subtype-sublayer`
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
trait SubtypeSublayer
  extends StObject
     with Accessor
     with Loadable
     with Identifiable {
  
  def addAttachment(feature: Graphic, attachment: FormData): js.Promise[FeatureEditResult] = js.native
  /**
  		 * Adds an attachment to a feature.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#addAttachment)
  		 */
  def addAttachment(feature: Graphic, attachment: HTMLFormElement): js.Promise[FeatureEditResult] = js.native
  
  /**
  		 * Describes the layer's supported capabilities.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#capabilities)
  		 */
  val capabilities: Capabilities = js.native
  
  /**
  		 * Creates a popup template for the layer, populated with all the fields of the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#createPopupTemplate)
  		 */
  def createPopupTemplate(): PopupTemplate = js.native
  def createPopupTemplate(options: CreatePopupTemplateOptions): PopupTemplate = js.native
  
  /**
  		 * Deletes attachments from a feature.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#deleteAttachments)
  		 */
  def deleteAttachments(feature: Graphic, attachmentIds: js.Array[Double]): js.Promise[FeatureEditResult] = js.native
  
  /**
  		 * Determines if the layer is editable.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#editingEnabled)
  		 */
  var editingEnabled: Boolean = js.native
  
  /**
  		 * Indicates whether the layer is editable taking in to consideration privileges of the currently signed-in user and whether the parent subtype group layer is editable or not.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#effectiveEditingEnabled)
  		 */
  val effectiveEditingEnabled: Boolean = js.native
  
  /**
  		 * An array of fields in the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#fields)
  		 */
  val fields: js.Array[Field] = js.native
  
  /**
  		 * The [template](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html) used in an associated layer's [FeatureForm](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#formTemplate)
  		 */
  var formTemplate: FormTemplate = js.native
  
  /**
  		 * The geometry type of features in the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#geometryType)
  		 */
  val geometryType: point | multipoint | polyline | polygon | multipatch | mesh = js.native
  
  /**
  		 * Returns the [Field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html) instance for a field name (case-insensitive).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#getField)
  		 */
  def getField(fieldName: String): Field = js.native
  
  /**
  		 * Returns the [Domain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html) associated with the given field name.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#getFieldDomain)
  		 */
  def getFieldDomain(fieldName: String): Domain = js.native
  
  /**
  		 * The unique ID assigned to the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#id)
  		 */
  val id: String = js.native
  
  /**
  		 * The label definition for this layer, specified as an array of [LabelClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#labelingInfo)
  		 */
  var labelingInfo: js.Array[LabelClass] = js.native
  
  /**
  		 * Indicates whether to display labels for this layer.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#labelsVisible)
  		 */
  var labelsVisible: Boolean = js.native
  
  /**
  		 * Indicates whether the layer will be included in the legend.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#legendEnabled)
  		 */
  var legendEnabled: Boolean = js.native
  
  /**
  		 * The maximum scale (most zoomed in) at which the layer is visible in the view.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#maxScale)
  		 */
  var maxScale: Double = js.native
  
  /**
  		 * The minimum scale (most zoomed out) at which the layer is visible in the view.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#minScale)
  		 */
  var minScale: Double = js.native
  
  /**
  		 * The name of an `oid` [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#fields) containing a unique value or identifier for each feature in the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#objectIdField)
  		 */
  val objectIdField: String = js.native
  
  /**
  		 * The opacity of the layer.
  		 *
  		 * @default 1
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#opacity)
  		 */
  var opacity: Double = js.native
  
  /**
  		 * The [SubtypeGroupLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html) to which the sublayer belongs.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#parent)
  		 */
  var parent: SubtypeGroupLayer = js.native
  
  /**
  		 * Indicates whether to display popups when features in the layer are clicked.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#popupEnabled)
  		 */
  var popupEnabled: Boolean = js.native
  
  /**
  		 * The popup template for the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#popupTemplate)
  		 */
  var popupTemplate: PopupTemplate = js.native
  
  /**
  		 * Query information about attachments associated with features.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#queryAttachments)
  		 */
  def queryAttachments(attachmentQuery: AttachmentQuery): js.Promise[Any] = js.native
  def queryAttachments(attachmentQuery: AttachmentQueryProperties): js.Promise[Any] = js.native
  def queryAttachments(attachmentQuery: AttachmentQueryProperties, options: SubtypeSublayerQueryAttachmentsOptions): js.Promise[Any] = js.native
  def queryAttachments(attachmentQuery: AttachmentQuery, options: SubtypeSublayerQueryAttachmentsOptions): js.Promise[Any] = js.native
  
  /**
  		 * The renderer assigned to the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#renderer)
  		 */
  var renderer: Renderer = js.native
  
  /**
  		 * The spatial reference of the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#spatialReference)
  		 */
  var spatialReference: SpatialReference = js.native
  
  /**
  		 * The unique identifier representing the [SubtypeSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html) created from the [SubtypeGroupLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html).
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#subtypeCode)
  		 */
  var subtypeCode: Double = js.native
  
  /**
  		 * An array of feature templates defined in the feature layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#templates)
  		 */
  var templates: js.Array[FeatureTemplate] = js.native
  
  /**
  		 * The title of the layer used to identify it in places such as the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#title)
  		 */
  var title: String = js.native
  
  val `type`: `subtype-sublayer` = js.native
  
  def updateAttachment(feature: Graphic, attachmentId: Double, attachment: FormData): js.Promise[FeatureEditResult] = js.native
  /**
  		 * Updates an existing attachment for a feature.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#updateAttachment)
  		 */
  def updateAttachment(feature: Graphic, attachmentId: Double, attachment: HTMLFormElement): js.Promise[FeatureEditResult] = js.native
  
  /**
  		 * Indicates if the layer is visible in the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html).
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#visible)
  		 */
  var visible: Boolean = js.native
}
