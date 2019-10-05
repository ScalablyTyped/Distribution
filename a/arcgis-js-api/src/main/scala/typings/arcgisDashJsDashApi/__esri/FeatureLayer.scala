package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.IHandle
import typings.arcgisDashJsDashApi.IPromise
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`layerview-create-error`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`layerview-create`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`layerview-destroy`
import typings.std.Date
import typings.std.FormData
import typings.std.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureLayer
  extends Layer
     with PortalLayer
     with ScaleRangeLayer
     with RefreshableLayer
     with TemporalLayer {
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
    * The SQL where clause used to filter features on the client. Only the features that satisfy the definition expression are displayed in the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html). Setting a definition expression is useful when the dataset is large and you don't want to bring all features to the client for analysis. Definition expressions may be set when a layer is constructed prior to it loading in the view or after it has been added to the map. If the definition expression is set after the layer has been added to the map, the view will automatically refresh itself to display the features that satisfy the new definition expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#definitionExpression)
    */
  var definitionExpression: String = js.native
  /**
    * The name of the layer's primary display field. The value of this property matches the name of one of the fields of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#displayField)
    */
  var displayField: String = js.native
  /**
    * An object that allows you to create a dynamic layer with data either from map service sublayers or data from a registered workspace. See [DynamicMapLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicMapLayer) for creating dynamic layers from map service layers for on the fly rendering, labeling, and filtering (definition expressions). To create dynamic layers from other sources in registered workspaces such as tables and table joins, see [DynamicDataLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicDataLayer).  If you already have a [Sublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html) instance, you can call the [createFeatureLayer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#createFeatureLayer) method on the Sublayer to construct the layer for you.  This only applies to map services with [dynamic layers](https://enterprise.arcgis.com/en/server/latest/publish-services/linux/about-dynamic-layers.htm) enabled. Therefore, the [url](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#url) of the FeatureLayer instance must point to a map service url ending with `/dynamicLayer`.
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
    * Specifies how features are placed on the vertical axis (z). This property may only be used in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). See the [ElevationInfo sample](https://developers.arcgis.com/javascript/latest/sample-code/scene-elevationinfo/index.html) for an example of how this property may be used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#elevationInfo)
    */
  var elevationInfo: FeatureLayerElevationInfo = js.native
  /**
    * Configures the method for decluttering overlapping features in the view. If this property is not set (or set to `null`), every feature is drawn individually.  Currently this property is only supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) for point features with non-draped [Icons](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html) or [Text](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html) symbol layers.  ![declutter](https://developers.arcgis.com/javascript/assets/img/samples/city-points-declutter.gif)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#featureReduction)
    */
  var featureReduction: FeatureLayerFeatureReduction = js.native
  /**
    * An array of fields in the layer. Each field represents an attribute that may contain a value for each feature in the layer. For example, a field named `POP_2015`, stores information about total population as a numeric value for each feature; this value represents the total number of people living within the geographic bounds of the feature.  This property must be set in the constructor when creating a FeatureLayer from client-side [features](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html). To create FeatureLayers from client-side features you must also set the [source](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#source), [objectIdField](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#objectIdField), [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#spatialReference), [geometryType](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#geometryType), [renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#renderer), and [type](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#type) properties.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#fields)
    */
  var fields: js.Array[Field] = js.native
  /**
    * A convenient property that can be used to make case-insensitive lookups for a field by name. It can also provide a list of the [date fields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FieldsIndex.html#dateFields) in a layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#fieldsIndex)
    */
  val fieldsIndex: FieldsIndex = js.native
  /**
    * The version of the geodatabase of the feature service data. Read the [Overview of versioning](https://desktop.arcgis.com/en/arcmap/latest/manage-data/geodatabases/an-overview-of-versioning.htm) topic for more details about this capability.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#gdbVersion)
    */
  val gdbVersion: String = js.native
  /**
    * The geometry type of features in the layer. All features must be of the same type. This property is read-only when the layer is created from a [url](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#url).  When creating a FeatureLayer from client-side features, this property is inferred by the geometryType of the features provided in the layer's [source](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#source) property.  **Possible Values:** point | multipoint | polyline | polygon | multipatch | mesh
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#geometryType)
    */
  var geometryType: String = js.native
  /**
    * Indicates whether the client-side features in the layer have `M` (measurement) values. Use the `supportsM` property in the FeatureLayer's [capabilities.data](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) object to verify if `M` values are supported on [feature service](https://developers.arcgis.com/rest/services-reference/feature-service.htm) features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#hasM)
    *
    * @default undefined
    */
  val hasM: Boolean = js.native
  /**
    * Indicates whether the client-side features in the layer have `Z` (elevation) values. Refer to [elevationInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#elevationInfo) for details regarding placement and rendering of features with z-values in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Use the `supportsZ` property in the FeatureLayer's [capabilities.data](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) object to verify if `Z` values are supported on [feature service](https://developers.arcgis.com/rest/services-reference/feature-service.htm) features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#hasZ)
    *
    * @default undefined
    */
  val hasZ: Boolean = js.native
  /**
    * The historic moment to query. If historicMoment is not specified, the query will apply to the current features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#historicMoment)
    */
  var historicMoment: Date = js.native
  /**
    * Returns `true` if the layer is loaded from a non-spatial table in a service. Non-spatial table does not have a spatial column that represents geographic features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#isTable)
    *
    * @default false
    */
  var isTable: Boolean = js.native
  /**
    * The label definition for this layer, specified as an array of [LabelClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html). Use this property to specify labeling properties for the layer such as label expression, placement, and size.  Multiple Label classes with different `where` clauses can be used to define several labels with varying styles on the same feature. Likewise, multiple label classes may be used to label different types of features (for example blue labels for lakes and green labels for parks).
    * > **Known Limitations**
    *   * Currently only one [LabelClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html) is supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#labelingInfo)
    */
  var labelingInfo: js.Array[LabelClass] = js.native
  /**
    * Indicates whether to display labels for this layer. If `true`, labels will appear as defined in the [labelingInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#labelingInfo) property.
    * > **Known Limitations**
    *   * Currently 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) only support one [LabelClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html) per feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#labelsVisible)
    *
    * @default true
    */
  var labelsVisible: Boolean = js.native
  /**
    * The layer ID, or layer index, of a Feature Service layer. This is particularly useful when loading a single FeatureLayer with the [portalItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#portalItem) property from a service containing multiple layers. You can specify this value in one of two scenarios:
    *   * When loading the layer via the [portalItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#portalItem) property.
    *   * When pointing the layer [url](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#url) directly to the Feature Service.
    *
    *
    * If a layerId is not specified in either of the above scenarios, then the first layer in the service (`layerId = 0`) is selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#layerId)
    */
  var layerId: Double = js.native
  /**
    * Indicates whether the layer will be included in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#legendEnabled)
    *
    * @default true
    */
  var legendEnabled: Boolean = js.native
  /**
    * The name of an `oid` [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#fields) containing a unique value or identifier for each feature in the layer. This is required when constructing a FeatureLayer from a collection of client-side [features](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#objectIdField)
    */
  var objectIdField: String = js.native
  /**
    * An array of field names from the service to include with each feature. To fetch the values from all fields in the layer, use `["*"]`. Fields specified in `outFields` will be requested alongside with required fields for [rendering](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#renderer), [labeling](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#labelingInfo) and setting the [elevation info](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#elevationInfo) for the layer. The required fields and `outFields` are used to populate [FeatureLayerView.availableFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#availableFields). Set this property to include the fields that will be used for client-side [queries](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#queryFeatures) if the fields are not part of required fields used for rendering.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#outFields)
    *
    * @default null
    */
  var outFields: js.Array[String] = js.native
  /**
    * Indicates whether to display popups when features in the layer are clicked. The layer needs to have a [popupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#popupTemplate) to define what information should be displayed in the popup. Alternatively, a default popup template may be automatically used if [Popup.defaultPopupTemplateEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#defaultPopupTemplateEnabled) is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#popupEnabled)
    *
    * @default true
    */
  var popupEnabled: Boolean = js.native
  /**
    * The popup template for the layer. When set on the layer, the `popupTemplate` allows users to access attributes and display their values in the [view's popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#popup) when a feature is selected using text and/or charts. See the [PopupTemplate sample](https://developers.arcgis.com/javascript/latest/sample-code/intro-popuptemplate/index.html) for an example of how [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) interacts with a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).  A default popup template is automatically used if no `popupTemplate` has been defined when [Popup.defaultPopupTemplateEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#defaultPopupTemplateEnabled) is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#popupTemplate)
    */
  var popupTemplate: PopupTemplate = js.native
  /**
    * Array of [relationships](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html) set up for the layer. Each object in the array describes the layer's [relationship](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html) with another layer or table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#relationships)
    */
  val relationships: js.Array[Relationship] = js.native
  /**
    * The renderer assigned to the layer. The renderer defines how to visualize each feature in the layer. Depending on the renderer type, features may be visualized with the same symbol, or with varying symbols based on the values of provided attribute fields or functions.  However, when creating a FeatureLayer from client-side features, this property must be specified in the layer's constructor along with the [source](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#source), [fields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#fields), [objectIdField](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#objectIdField) properties.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#renderer)
    */
  var renderer: Renderer = js.native
  /**
    * When `true`, indicates that M values will be returned. When `false`, indicates that M values will never be returned. The layer view determines whether to include M values in feature queries when the property value is `undefined`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#returnM)
    *
    * @default undefined
    */
  var returnM: Boolean = js.native
  /**
    * When `true`, indicates that Z values will always be returned. When `false`, indicates that Z values will never be returned. The layer view determines whether to include Z values in feature queries when the property value is `undefined`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#returnZ)
    *
    * @default undefined
    */
  var returnZ: Boolean = js.native
  /**
    * Apply perspective scaling to screen-size point symbols in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). When `true`, screen sized objects such as [icons](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html), [labels](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html) or [callouts](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-Callout3D.html) integrate better in the 3D scene by applying a certain perspective projection to the sizing of features. This only applies when using a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).  `layer.screenSizePerspectiveEnabled = true`  ![screen-size-perspective](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-screenSize-perspective.png)  `layer.screenSizePerspectiveEnabled = false`  ![no-screen-size-perspective](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-no-screenSize-perspective.png)
    * > **Known Limitations**  Screen size perspective is currently not optimized for situations where the camera is very near the ground, or for scenes with point features located far from the ground surface. In these cases it may be better to turn off screen size perspective. As screen size perspective changes the size based on distance to the camera, it should be set to false when using {@link module:esri/renderers/Renderer#SizeVisualVariable size visual variables}.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#screenSizePerspectiveEnabled)
    *
    * @default true
    */
  var screenSizePerspectiveEnabled: Boolean = js.native
  /**
    * A collection of [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) objects used to create a FeatureLayer. The geometry of each feature all must have a matching [geometryType](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#geometryType). This property should only be used when creating a FeatureLayer from client-side features. When creating a FeatureLayer from client-side features, the [fields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#fields), [objectIdField](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#objectIdField), [renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#renderer), and [type](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#type) properties must also be set.  Use [applyEdits()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits) method to add, remove, and update features from a layer at runtime. Once `applyEdits()` resolves successfully, use [queryFeatures()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#queryFeatures) to return updated features.  The [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#spatialReference) and [geometryType](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#geometryType) properties are determined based on the features provided to this property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#source)
    */
  var source: Collection[Graphic] = js.native
  /**
    * The spatial reference of the layer. When creating the layer from a [url](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#url), the spatial reference is read from the service.  When creating a FeatureLayer from client-side features, this property is inferred from the geometries of the features provided in the [source](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#source) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#spatialReference)
    */
  var spatialReference: SpatialReference = js.native
  /**
    * An array of feature templates defined in the feature layer. See [ArcGIS Pro subtypes document](https://pro.arcgis.com/en/pro-app/help/data/geodatabases/overview/an-overview-of-subtypes.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#templates)
    */
  var templates: js.Array[FeatureTemplate] = js.native
  /**
    * The name of the field holding the type ID or subtypes for the features. See [ArcGIS Pro subtypes document](https://pro.arcgis.com/en/pro-app/help/data/geodatabases/overview/an-overview-of-subtypes.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#typeIdField)
    */
  val typeIdField: String = js.native
  /**
    * An array of subtypes defined in the feature service exposed by ArcGIS REST API. Each item includes information about the type, such as the type ID, name, and definition expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#types)
    */
  var types: js.Array[FeatureType] = js.native
  /**
    * The URL of the REST endpoint of the layer, non-spatial table or service. The URL may either point to a resource on ArcGIS Enterprise or ArcGIS Online.  If the url points directly to a service, then the layer must be specified in the [layerId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#layerId) property. If no [layerId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#layerId) is given, then the first layer in the service will be loaded.
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
  def addAttachment(feature: Graphic, attachment: FormData): IPromise[FeatureEditResult] = js.native
  /**
    * Adds an attachment to a feature. This operation is available only if the layer's [capabilities.data.supportsAttachment](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#addAttachment)
    *
    * @param feature Feature to which the attachment is to be added.
    * @param attachment HTML form that contains a file upload field pointing to the file to be added as an attachment.
    *
    */
  def addAttachment(feature: Graphic, attachment: HTMLFormElement): IPromise[FeatureEditResult] = js.native
  /**
    * Applies edits to features in a layer. New features can be created and existing features can be updated or deleted. Feature geometries and/or attributes may be modified. Only applicable to layers in a [feature service](https://developers.arcgis.com/rest/services-reference/feature-service.htm) and client-side features set through the layer's [source](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#source).  If client-side features are added, removed or updated at runtime using [applyEdits()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits) then use [queryFeatures()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#queryFeatures) to return updated features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits)
    *
    * @param edits Object containing features to be added, updated or deleted.
    * @param edits.addFeatures Array of features to be added. Values of non nullable fields must be provided when adding new features. Date fields must have [numeric](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getTime) values representing universal time.
    * @param edits.updateFeatures Array of features to be updated. Each feature must have valid [objectId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#objectIdField). Values of non nullable fields must be provided when updating features. Date fields must have [numeric](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getTime) values representing universal time.
    * @param edits.deleteFeatures An array of features or objects to be deleted. When an array of features is passed, each feature must have a valid [objectId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#objectIdField). When an array of objects is used, each object must have a valid `objectId` property.
    *
    */
  def applyEdits(edits: FeatureLayerApplyEditsEdits): IPromise[_] = js.native
  /**
    * Creates a popup template for the layer, populated with all the fields of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#createPopupTemplate)
    *
    * @param options Options for creating the popup template.
    * @param options.maximumFields The maximum number of fields to include in the popup template.
    * @param options.ignoreFieldTypes Field types to ignore when creating the popup. By default the `geometry`, `blob`, `raster`, `guid` and `xml` field types are ignored.
    *
    */
  def createPopupTemplate(): PopupTemplate = js.native
  def createPopupTemplate(options: FeatureLayerCreatePopupTemplateOptions): PopupTemplate = js.native
  /**
    * Creates query parameter object that can be used to fetch features that satisfy the layer's configurations such as [definitionExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#definitionExpression), [gdbVersion](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#gdbVersion), and [historicMoment](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#historicMoment). It will return `Z` and `M` values based on the layer's [data capabilities](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities). It sets the query parameter's [outFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#outFields) property to `["*"]`. The results will include geometries of features and values for all [available fields](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#availableFields) for [client-side queries](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#queryFeatures) or all fields in the layer for [server side queries](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#queryFeatures).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#createQuery)
    *
    *
    */
  def createQuery(): Query = js.native
  /**
    * Deletes attachments from a feature. This operation is available only if the layer's [capabilities.data.supportsAttachment](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#deleteAttachments)
    *
    * @param feature Feature containing attachments to be deleted.
    * @param attachmentIds Ids of the attachments to be deleted.
    *
    */
  def deleteAttachments(feature: Graphic, attachmentIds: js.Array[Double]): IPromise[FeatureEditResult] = js.native
  /**
    * Returns a [FeatureType](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureType.html) describing the feature's type. This is applicable if the layer containing the feature has a [typeIdField](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#typeIdField).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#getFeatureType)
    *
    * @param feature A feature from this layer.
    *
    */
  def getFeatureType(feature: Graphic): FeatureType = js.native
  /**
    * Returns the [Field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html) instance for a field name (case-insensitive).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#getField)
    *
    * @param fieldName Name of the field.
    *
    */
  def getField(fieldName: String): Field = js.native
  /**
    * Returns the [Domain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html) associated with the given field name. The domain can be either a [CodedValueDomain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-CodedValueDomain.html) or [RangeDomain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RangeDomain.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#getFieldDomain)
    *
    * @param fieldName Name of the field.
    * @param options An object specifying additional options. See the object specification table below for the required properties of this object.
    * @param options.feature The feature to which the [Domain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html) is assigned.
    *
    */
  def getFieldDomain(fieldName: String): Domain = js.native
  def getFieldDomain(fieldName: String, options: FeatureLayerGetFieldDomainOptions): Domain = js.native
  @JSName("on")
  def on_layerviewcreate(name: `layerview-create`, eventHandler: FeatureLayerLayerviewCreateEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewcreateerror(name: `layerview-create-error`, eventHandler: FeatureLayerLayerviewCreateErrorEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewdestroy(name: `layerview-destroy`, eventHandler: FeatureLayerLayerviewDestroyEventHandler): IHandle = js.native
  /**
    * Query information about attachments associated with features. It will return an error if the layer's [capabilities.data.supportsAttachment](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) property is `false`. Attachments for multiple features can be queried if the layer's [capabilities.operations.supportsQueryAttachments](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) is `true`.
    * > **Known Limitations**  When the layer's [capabilities.operations.supportsQueryAttachments](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) property is `false`, [AttachmentQuery.objectIds](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html#objectIds) property only accepts a single `objectId`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#queryAttachments)
    *
    * @param attachmentQuery Specifies the attachment parameters for query.
    * @param options An object with the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def queryAttachments(attachmentQuery: AttachmentQuery): IPromise[_] = js.native
  def queryAttachments(attachmentQuery: AttachmentQueryProperties): IPromise[_] = js.native
  def queryAttachments(attachmentQuery: AttachmentQueryProperties, options: FeatureLayerQueryAttachmentsOptions): IPromise[_] = js.native
  def queryAttachments(attachmentQuery: AttachmentQuery, options: FeatureLayerQueryAttachmentsOptions): IPromise[_] = js.native
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against the feature service and returns the [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of features that satisfy the query. If no parameters are specified, then the extent and count of all features satisfying the layer's configuration/filters are returned. This is valid only for [hosted feature services](http://doc.arcgis.com/en/arcgis-online/share-maps/hosted-web-layers.htm) on [arcgis.com](http://arcgis.com) and for ArcGIS Server 10.3.1 and later.
    * > To query for the extent of features/graphics available to or visible in the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) on the client rather than making a server-side query, you must use the [FeatureLayerView.queryExtent()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#queryExtent) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#queryExtent)
    *
    * @param query Specifies the attributes and spatial filter of the query. If no parameters are specified, then the extent and count of all features satisfying the layer's configuration/filters are returned.
    * @param options An object with the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def queryExtent(): IPromise[_] = js.native
  def queryExtent(query: Query): IPromise[_] = js.native
  def queryExtent(query: QueryProperties): IPromise[_] = js.native
  def queryExtent(query: QueryProperties, options: FeatureLayerQueryExtentOptions): IPromise[_] = js.native
  def queryExtent(query: Query, options: FeatureLayerQueryExtentOptions): IPromise[_] = js.native
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against the feature service and returns the number of features that satisfy the query. If no parameters are specified, the total number of features satisfying the layer's configuration/filters is returned.
    * > To query for the count of features/graphics available to or visible in the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) on the client rather than making a server-side query, you must use the [FeatureLayerView.queryFeatureCount()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#queryFeatureCount) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#queryFeatureCount)
    *
    * @param query Specifies the attributes and spatial filter of the query. If no parameters are specified, the total number of features satisfying the layer's configuration/filters is returned.
    * @param options An object with the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def queryFeatureCount(): IPromise[Double] = js.native
  def queryFeatureCount(query: Query): IPromise[Double] = js.native
  def queryFeatureCount(query: QueryProperties): IPromise[Double] = js.native
  def queryFeatureCount(query: QueryProperties, options: FeatureLayerQueryFeatureCountOptions): IPromise[Double] = js.native
  def queryFeatureCount(query: Query, options: FeatureLayerQueryFeatureCountOptions): IPromise[Double] = js.native
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against the feature service and returns a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html), which can be accessed using the `.then()` method once the promise resolves. A [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html) contains an array of [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) features, which can be added to the [view's graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#graphics). This array will not be populated if zero results are found.
    * > To query features/graphics available to or visible in the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) on the client rather than making a server-side query, you must use the [FeatureLayerView.queryFeatures()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#queryFeatures) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#queryFeatures)
    *
    * @param query Specifies the attributes and spatial filter of the query. If no parameters are specified, then all features satisfying the layer's configuration/filters are returned.
    * @param options An object with the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def queryFeatures(): IPromise[FeatureSet] = js.native
  def queryFeatures(query: Query): IPromise[FeatureSet] = js.native
  def queryFeatures(query: QueryProperties): IPromise[FeatureSet] = js.native
  def queryFeatures(query: QueryProperties, options: FeatureLayerQueryFeaturesOptions): IPromise[FeatureSet] = js.native
  def queryFeatures(query: Query, options: FeatureLayerQueryFeaturesOptions): IPromise[FeatureSet] = js.native
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against the feature service and returns an array of Object IDs for features that satisfy the input query. If no parameters are specified, then the Object IDs of all features satisfying the layer's configuration/filters are returned.
    * > To query for ObjectIDs of features/graphics available to or visible in the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) on the client rather than making a server-side query, you must use the [FeatureLayerView.queryObjectIds()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#queryObjectIds) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#queryObjectIds)
    *
    * @param query Specifies the attributes and spatial filter of the query. If no parameters are specified, then the Object IDs of all features satisfying the layer's configuration/filters are returned.
    * @param options An object with the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def queryObjectIds(): IPromise[js.Array[Double]] = js.native
  def queryObjectIds(query: Query): IPromise[js.Array[Double]] = js.native
  def queryObjectIds(query: QueryProperties): IPromise[js.Array[Double]] = js.native
  def queryObjectIds(query: QueryProperties, options: FeatureLayerQueryObjectIdsOptions): IPromise[js.Array[Double]] = js.native
  def queryObjectIds(query: Query, options: FeatureLayerQueryObjectIdsOptions): IPromise[js.Array[Double]] = js.native
  /**
    * Executes a [RelationshipQuery](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html) against the feature service and returns [FeatureSets](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html) grouped by source layer or table objectIds.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#queryRelatedFeatures)
    *
    * @param relationshipQuery Specifies relationship parameters for querying related features or records from a layer or a table.
    * @param options An object with the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def queryRelatedFeatures(relationshipQuery: RelationshipQuery): IPromise[_] = js.native
  def queryRelatedFeatures(relationshipQuery: RelationshipQueryProperties): IPromise[_] = js.native
  def queryRelatedFeatures(relationshipQuery: RelationshipQueryProperties, options: FeatureLayerQueryRelatedFeaturesOptions): IPromise[_] = js.native
  def queryRelatedFeatures(relationshipQuery: RelationshipQuery, options: FeatureLayerQueryRelatedFeaturesOptions): IPromise[_] = js.native
  def updateAttachment(feature: Graphic, attachmentId: Double, attachment: FormData): IPromise[FeatureEditResult] = js.native
  /**
    * Updates an existing attachment for a feature. This operation is available only if the layer's [capabilities.data.supportsAttachment](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#updateAttachment)
    *
    * @param feature The feature containing the attachment to be updated.
    * @param attachmentId Id of the attachment to be updated.
    * @param attachment HTML form that contains a file upload field pointing to the file to be added as an attachment.
    *
    */
  def updateAttachment(feature: Graphic, attachmentId: Double, attachment: HTMLFormElement): IPromise[FeatureEditResult] = js.native
}

@JSGlobal("__esri.FeatureLayer")
@js.native
object FeatureLayer extends TopLevel[FeatureLayerConstructor]

