package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`hide-children`
import typings.arcgisJsApi.arcgisJsApiStrings.hide
import typings.arcgisJsApi.arcgisJsApiStrings.show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sublayer
  extends StObject
     with Accessor
     with Loadable {
  
  /**
    * A convenient method for creating a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) instance based on the Sublayer's configuration, including [dynamic sources](https://enterprise.arcgis.com/en/server/latest/publish-services/linux/about-dynamic-layers.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#createFeatureLayer)
    */
  def createFeatureLayer(): js.Promise[FeatureLayer] = js.native
  
  /**
    * Creates a popup template for the sublayer, populated with all the fields of the sublayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#createPopupTemplate)
    */
  def createPopupTemplate(): PopupTemplate = js.native
  def createPopupTemplate(options: CreatePopupTemplateOptions): PopupTemplate = js.native
  
  /**
    * Creates a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) object with default values representing the layer's state, including filters (definition expression) on the layer's features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#createQuery)
    */
  def createQuery(): Query = js.native
  
  /**
    * A SQL where clause used to filter features in the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#definitionExpression)
    */
  var definitionExpression: String = js.native
  
  /**
    * An array of fields in the Sublayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#fields)
    */
  val fields: js.Array[Field] = js.native
  
  /**
    * A convenient property that can be used to make case-insensitive lookups for a [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#field) by name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#fieldsIndex)
    */
  val fieldsIndex: FieldsIndex = js.native
  
  /**
    * The full extent of the Sublayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#fullExtent)
    */
  val fullExtent: Extent = js.native
  
  /**
    * Returns a [FeatureType](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureType.html) describing the feature's type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#getFeatureType)
    */
  def getFeatureType(feature: Graphic): FeatureType = js.native
  
  /**
    * Returns the [Domain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html) associated with the given field name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#getFieldDomain)
    */
  def getFieldDomain(fieldName: String): Domain = js.native
  def getFieldDomain(fieldName: String, options: SublayerGetFieldDomainOptions): Domain = js.native
  
  /**
    * The sublayer's layer ID.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#id)
    */
  var id: Double = js.native
  
  /**
    * The label definition for this layer, specified as an array of [LabelClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html) objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#labelingInfo)
    */
  var labelingInfo: js.Array[LabelClass] = js.native
  
  /**
    * Indicates if labels for the sublayer will be visible in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#labelsVisible)
    */
  var labelsVisible: Boolean = js.native
  
  /**
    * The [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html) or [TileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html) to which the sublayer belongs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#layer)
    */
  var layer: MapImageLayer | TileLayer = js.native
  
  /**
    * Indicates whether the layer will be included in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#legendEnabled)
    */
  var legendEnabled: Boolean = js.native
  
  /**
    * Indicates how the layer should display in the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#listMode)
    */
  var listMode: show | hide | `hide-children` = js.native
  
  /**
    * The maximum scale (most zoomed in) at which the layer is visible in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#maxScale)
    */
  var maxScale: Double = js.native
  
  /**
    * The minimum scale (most zoomed out) at which the layer is visible in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#minScale)
    */
  var minScale: Double = js.native
  
  /**
    * The name of an `oid` [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#fields) containing a unique value or identifier for each feature in the Sublayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#objectIdField)
    */
  val objectIdField: String = js.native
  
  /**
    * The level of opacity to set on the sublayer on a scale from 0.0 - 1.0 where `0` is fully transparent and `1.0` is fully opaque.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#opacity)
    */
  var opacity: Double = js.native
  
  /**
    * Indicates whether to display popups when features in the layer are clicked.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#popupEnabled)
    */
  var popupEnabled: Boolean = js.native
  
  /**
    * The popup template for the sublayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#popupTemplate)
    */
  var popupTemplate: PopupTemplate = js.native
  
  /**
    * Executes a [query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-QueryTask.html) against features in the sublayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#queryFeatures)
    */
  def queryFeatures(): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: Unit, options: SublayerQueryFeaturesOptions): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: Query): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: QueryProperties): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: QueryProperties, options: SublayerQueryFeaturesOptions): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: Query, options: SublayerQueryFeaturesOptions): js.Promise[FeatureSet] = js.native
  
  /**
    * The renderer to apply to the sublayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#renderer)
    */
  var renderer: Renderer = js.native
  
  /**
    * An object that allows you to create a dynamic layer with data either from the map service sublayers or data from a registered workspace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#source)
    */
  var source: DynamicMapLayer | DynamicDataLayer = js.native
  
  /**
    * The [map service's metadata JSON](https://developers.arcgis.com/rest/services-reference/map-service.htm) exposed by the ArcGIS REST API.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#sourceJSON)
    */
  var sourceJSON: js.Any = js.native
  
  /**
    * If a sublayer contains sublayers, this property is a [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of [Sublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html) objects belonging to the given sublayer with sublayers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#sublayers)
    */
  var sublayers: Collection[Sublayer] = js.native
  
  /**
    * The title of the sublayer used to identify it in places such as the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) and [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widgets.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#title)
    */
  var title: String = js.native
  
  /**
    * Serialize the sublayer for usage in /export.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#toExportImageJSON)
    */
  def toExportImageJSON(): Unit = js.native
  
  /**
    * The name of the field holding the type ID or subtypes for the features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#typeIdField)
    */
  val typeIdField: String = js.native
  
  /**
    * An array of subtypes defined in the feature service exposed by ArcGIS REST API.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#types)
    */
  val types: js.Array[FeatureType] = js.native
  
  /**
    * The URL to the REST endpoint of the sublayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#url)
    */
  var url: String = js.native
  
  /**
    * Indicates if the layer is visible in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#visible)
    */
  var visible: Boolean = js.native
}
