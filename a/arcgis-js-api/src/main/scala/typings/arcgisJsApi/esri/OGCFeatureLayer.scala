package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`ogc-feature`
import typings.arcgisJsApi.arcgisJsApiStrings.multipoint
import typings.arcgisJsApi.arcgisJsApiStrings.point
import typings.arcgisJsApi.arcgisJsApiStrings.polygon
import typings.arcgisJsApi.arcgisJsApiStrings.polyline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OGCFeatureLayer
  extends Layer
     with ScaleRangeLayer
     with RefreshableLayer {
  /**
    * The unique identifier of the collection on the server. Identifiers can be discovered by browsing the html representation of the OGC API Feature [landing page](https://docs.opengeospatial.org/is/17-069r3/17-069r3.html#_api_landing_page).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#collectionId)
    */
  var collectionId: String = js.native
  /**
    * Copyright information for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#copyright)
    */
  var copyright: String = js.native
  /**
    * Description of the features in the collection.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#description)
    */
  val description: String = js.native
  /**
    * The name of the layer's primary display field. The value of this property matches the name of one of the fields of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#displayField)
    */
  var displayField: String = js.native
  /**
    * Specifies how graphics are placed on the vertical axis (z). This property may only be used in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). See the [ElevationInfo sample](https://developers.arcgis.com/javascript/latest/sample-code/scene-elevationinfo/index.html) for an example of how this property may be used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#elevationInfo)
    */
  var elevationInfo: OGCFeatureLayerElevationInfo = js.native
  /**
    * Configures the method for reducing the number of point features in the view. By default this property is `null`, which indicates the layer view should draw every feature.  There are two types of feature reduction: `selection` and `cluster`.
    *   * [Selection](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionSelection.html) only applies to points in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) and involves thinning overlapping features so no features intersect on screen.
    *   * [FeatureReductionCluster](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html) spatially groups points in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) into _clusters_. The size of each cluster is proportional to the number of features within the cluster.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#featureReduction)
    */
  var featureReduction: FeatureReductionCluster | FeatureReductionSelection = js.native
  /**
    * An array of fields in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#fields)
    */
  var fields: js.Array[Field] = js.native
  /**
    * A convenient property that can be used to make case-insensitive lookups for a field by name. It can also provide a list of the [date fields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FieldsIndex.html#dateFields) in a layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#fieldsIndex)
    */
  val fieldsIndex: FieldsIndex = js.native
  /**
    * The geometry type of features in the layer. All features must be of the same type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#geometryType)
    */
  var geometryType: point | polygon | polyline | multipoint = js.native
  /**
    * The label definition for this layer, specified as an array of [LabelClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html). Use this property to specify labeling properties for the layer such as label expression, placement, and size.  Multiple Label classes with different `where` clauses can be used to define several labels with varying styles on the same feature. Likewise, multiple label classes may be used to label different types of features (for example blue labels for lakes and green labels for parks).
    * > **Known Limitations**
    *   * Currently only one [LabelClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html) is supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#labelingInfo)
    */
  var labelingInfo: js.Array[LabelClass] = js.native
  /**
    * Indicates whether to display labels for this layer. If `true`, labels will appear as defined in the [labelingInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#labelingInfo) property.
    * > **Known Limitations**
    *   * Currently 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) only support one [LabelClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html) per feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#labelsVisible)
    *
    * @default true
    */
  var labelsVisible: Boolean = js.native
  /**
    * Indicates whether the layer will be included in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#legendEnabled)
    *
    * @default true
    */
  var legendEnabled: Boolean = js.native
  /**
    * The url query string in the format request json content from the server.  The `mediaType` property is only used for metadata requests like the land page, collections, and collections metadata. By default this is “application/json”, But some servers only support “json”.  When the client is requesting spatial data (as GeoJSON), it will always use the the “application/geo+json” format string.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#mediaType)
    *
    * @default "application/json"
    */
  var mediaType: String = js.native
  /**
    * The OGCFeatureLayer requires that each feature be uniquely identified with an object id. By default, the OGCFeatureLayer will use the GeoJSON feature id for object ids.  The name of the object id field will be `OBJECTID`.  The layer will not load if the GeoJSON feature id is missing. If the GeoJSON feature id is not numeric then some capabilities of the layer, such as popups, will not be available.  If GeoJSON feature id is missing or non-numeric then you can specify an existing property (if any) to be the object id field with the `objectIdField` property. In the example below, the ids for country collection below are as follows `"countries50m.1"` and `"countries50m.2"`. In this case, we want to specify the `objectIdField` as `WOE_ID`, because it is a reference to the numeric ["where on Earth id"](https://en.wikipedia.org/wiki/WOEID) for each country.  Lastly, if there is not a default object id in the GeoJSON and the `objectIdField` is not specified, then an `ObjectID` field will be generated for each feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#objectIdField)
    *
    * @default null
    */
  var objectIdField: String = js.native
  /**
    * Indicates whether to display popups when features in the layer are clicked. The layer needs to have a [popupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#popupTemplate) to define what information should be displayed in the popup. Alternatively, a default popup template may be automatically used if [Popup.defaultPopupTemplateEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#defaultPopupTemplateEnabled) is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#popupEnabled)
    *
    * @default true
    */
  var popupEnabled: Boolean = js.native
  /**
    * The popup template for the layer. When set on the layer, the `popupTemplate` allows users to access attributes and display their values in the [view's popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#popup) when a feature is selected using text and/or charts. See the [PopupTemplate sample](https://developers.arcgis.com/javascript/latest/sample-code/intro-popuptemplate/index.html) for an example of how [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) interacts with a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).  A default popup template is automatically used if no `popupTemplate` has been defined when [Popup.defaultPopupTemplateEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#defaultPopupTemplateEnabled) is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#popupTemplate)
    */
  var popupTemplate: PopupTemplate = js.native
  /**
    * The renderer assigned to the layer. The renderer defines how to visualize each feature in the layer. Depending on the renderer type, features may be visualized with the same symbol, or with varying symbols based on the values of provided attribute fields or functions. If not specified, a default renderer will be generated based on the geometry type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#renderer)
    */
  var renderer: Renderer = js.native
  /**
    * The spatial reference of the layer. OGC API Feature services only support WGS84.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#spatialReference)
    *
    * @default SpatialReference.WGS84
    */
  val spatialReference: SpatialReference = js.native
  @JSName("type")
  val type_OGCFeatureLayer: `ogc-feature` = js.native
  /**
    * The URL to the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#url)
    */
  var url: String = js.native
  /**
    * Creates a popup template for the layer, populated with all the fields of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#createPopupTemplate)
    *
    * @param options Options for creating the popup template.
    *
    */
  def createPopupTemplate(): PopupTemplate = js.native
  def createPopupTemplate(options: CreatePopupTemplateOptions): PopupTemplate = js.native
  /**
    * Returns the [Field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html) instance for a field name (case-insensitive).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#getField)
    *
    * @param fieldName Name of the field.
    *
    */
  def getField(fieldName: String): Field = js.native
}

