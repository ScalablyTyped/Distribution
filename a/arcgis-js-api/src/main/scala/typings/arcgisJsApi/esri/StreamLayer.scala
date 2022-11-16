package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.multipoint
import typings.arcgisJsApi.arcgisJsApiStrings.point
import typings.arcgisJsApi.arcgisJsApiStrings.polygon
import typings.arcgisJsApi.arcgisJsApiStrings.polyline
import typings.arcgisJsApi.arcgisJsApiStrings.stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamLayer
  extends StObject
     with Layer
     with ScaleRangeLayer
     with TemporalLayer
     with BlendLayer
     with FeatureEffectLayer
     with FeatureReductionLayer {
  
  /**
    * Establishes a connection to a web socket that satisfy the specified connection parameters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#connect)
    */
  def connect(): js.Promise[StreamConnection] = js.native
  def connect(parameters: ConnectionParameters): js.Promise[StreamConnection] = js.native
  
  /**
    * Copyright information for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#copyright)
    */
  var copyright: String = js.native
  
  /**
    * Creates a [ConnectionParameters](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#ConnectionParameters) object that can be used to establish a connection to a web socket that satisfies the layer's configuration.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#createConnectionParameters)
    */
  def createConnectionParameters(): ConnectionParameters = js.native
  
  /**
    * Creates a popup template for the layer, populated with all the fields of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#createPopupTemplate)
    */
  def createPopupTemplate(): PopupTemplate = js.native
  def createPopupTemplate(options: CreatePopupTemplateOptions): PopupTemplate = js.native
  
  /**
    * A list of custom parameters appended to the URL of all resources fetched by the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#customParameters)
    */
  var customParameters: Any = js.native
  
  /**
    * The SQL where clause used to filter features based on their attributes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#definitionExpression)
    */
  var definitionExpression: String = js.native
  
  /**
    * The name of the layer's primary display field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#displayField)
    */
  var displayField: String = js.native
  
  /**
    * Specifies how features are placed on the vertical axis (z).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#elevationInfo)
    */
  var elevationInfo: StreamLayerElevationInfo = js.native
  
  /**
    * An array of fields in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#fields)
    */
  var fields: js.Array[Field] = js.native
  
  /**
    * A convenient property that can be used to make case-insensitive lookups for a field by name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#fieldsIndex)
    */
  val fieldsIndex: FieldsIndex = js.native
  
  /**
    * An [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) object used to filter features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#geometryDefinition)
    */
  var geometryDefinition: Extent = js.native
  
  /**
    * The geometry type of features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#geometryType)
    */
  var geometryType: point | polygon | polyline | multipoint = js.native
  
  /**
    * Returns the [Field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html) instance for a field name (case-insensitive).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#getField)
    */
  def getField(fieldName: String): Field = js.native
  
  /**
    * Returns the [Domain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html) associated with the given field name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#getFieldDomain)
    */
  def getFieldDomain(fieldName: String): Domain = js.native
  def getFieldDomain(fieldName: String, options: StreamLayerGetFieldDomainOptions): Domain = js.native
  
  /**
    * The label definition for this layer, specified as an array of [LabelClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#labelingInfo)
    */
  var labelingInfo: js.Array[LabelClass] = js.native
  
  /**
    * Indicates whether to display labels for this layer.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#labelsVisible)
    */
  var labelsVisible: Boolean = js.native
  
  /**
    * Indicates whether the layer will be included in the legend.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#legendEnabled)
    */
  var legendEnabled: Boolean = js.native
  
  /**
    * The maximum number of attempts to reconnect.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#maxReconnectionAttempts)
    */
  var maxReconnectionAttempts: Double = js.native
  
  /**
    * The maximum time to wait in seconds between attempts to reconnect.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#maxReconnectionInterval)
    */
  var maxReconnectionInterval: Double = js.native
  
  /**
    * The name of an `oid` [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#fields) containing a unique value or identifier for each feature in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#objectIdField)
    */
  var objectIdField: String = js.native
  
  /**
    * Indicates whether to display popups when features in the layer are clicked.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#popupEnabled)
    */
  var popupEnabled: Boolean = js.native
  
  /**
    * The popup template for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#popupTemplate)
    */
  var popupTemplate: PopupTemplate = js.native
  
  /**
    * Options for purging stale features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#purgeOptions)
    */
  var purgeOptions: StreamLayerPurgeOptions = js.native
  
  /**
    * The renderer assigned to the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#renderer)
    */
  var renderer: Renderer = js.native
  
  /**
    * Apply perspective scaling to screen-size point symbols in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#screenSizePerspectiveEnabled)
    */
  var screenSizePerspectiveEnabled: Boolean = js.native
  
  /**
    * The [stream service's metadata JSON](https://developers.arcgis.com/rest/services-reference/stream-service.htm) exposed by the ArcGIS REST API.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#sourceJSON)
    */
  var sourceJSON: Any = js.native
  
  /**
    * The spatial reference of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#spatialReference)
    */
  var spatialReference: SpatialReference = js.native
  
  /**
    * For [StreamLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html) the type is `stream`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#type)
    */
  @JSName("type")
  val type_StreamLayer: stream = js.native
  
  /**
    * The minimum rate (ms) at which to poll for updates over the websocket connection.
    *
    * @default 300
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#updateInterval)
    */
  var updateInterval: Double = js.native
  
  /**
    * The URL of the stream service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#url)
    */
  var url: String = js.native
  
  /**
    * The URL of a websocket connection.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#webSocketUrl)
    */
  var webSocketUrl: String = js.native
}
