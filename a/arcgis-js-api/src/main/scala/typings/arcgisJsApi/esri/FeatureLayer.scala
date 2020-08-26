package typings.arcgisJsApi.esri

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
    * Configures the method for reducing the number of point features in the view. By default this property is `null`, which indicates the layer view should draw every feature.  There are two types of feature reduction: `selection` and `cluster`.
    *   * [Selection](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionSelection.html) only applies to points in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) and involves thinning overlapping features so no features intersect on screen. This has been available since version 4.4.
    *   * [Cluster](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html) spatially groups points in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) into _clusters_. The size of each cluster is proportional to the number of features within the cluster. This has been available since version 4.14.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#featureReduction)
    */
  var featureReduction: FeatureReductionCluster | FeatureReductionSelection = js.native
  /**
    * An array of fields in the layer. Each field represents an attribute that may contain a value for each feature in the layer. For example, a field named `POP_2015`, stores information about total population as a numeric value for each feature; this value represents the total number of people living within the geographic bounds of the feature.  When creating a FeatureLayer from [client-side features](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#client-side), this property should be set in the constructor along with the [source](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#source) property. The `objectId` field also must be set either in this array or in the [objectIdField](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#objectIdField) property.
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
    * The associated [template](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html) used in an associated layer's [FeatureForm](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html).   The [formTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html) is where you configure how the form should display. Properties, i.e. `title`, `description`, `fieldConfigs`, etc, set directly within the [FeatureForm](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html) take precedence over any similar properties set within the `formTemplate`. This will change in a future release as the preferred way to set the form's properties is via it's [template](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#formTemplate).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#formTemplate)
    */
  var formTemplate: FormTemplate = js.native
  /**
    * The version of the geodatabase of the feature service data. Read the [Overview of versioning](https://desktop.arcgis.com/en/arcmap/latest/manage-data/geodatabases/an-overview-of-versioning.htm) topic for more details about this capability.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#gdbVersion)
    */
  var gdbVersion: String = js.native
  /**
    * The geometry type of features in the layer. All features must be of the same type. This property is read-only when the layer is created from a [url](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#url).  When creating a FeatureLayer from [client-side features](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#client-side), this property is inferred by the geometryType of the features provided in the layer's [source](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#source) property. If the layer's [source](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#source) is an empty array at the time of initialization, this property must be set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#geometryType)
    */
  var geometryType: point | multipoint | polyline | polygon | multipatch | mesh = js.native
  /**
    * Indicates whether the client-side features in the layer have `M` (measurement) values. Use the `supportsM` property in the FeatureLayer's [capabilities.data](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) object to verify if `M` values are supported on [feature service](https://developers.arcgis.com/rest/services-reference/feature-service.htm) features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#hasM)
    *
    * @default undefined
    */
  var hasM: Boolean = js.native
  /**
    * Indicates whether the client-side features in the layer have `Z` (elevation) values. Refer to [elevationInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#elevationInfo) for details regarding placement and rendering of features with z-values in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Use the `supportsZ` property in the FeatureLayer's [capabilities.data](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) object to verify if `Z` values are supported on [feature service](https://developers.arcgis.com/rest/services-reference/feature-service.htm) features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#hasZ)
    *
    * @default undefined
    */
  var hasZ: Boolean = js.native
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
    * The label definition for this layer, specified as an array of [LabelClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html). Use this property to specify labeling properties for the layer such as label expression, placement, and size.  Multiple Label classes with different `where` clauses can be used to define several labels with varying styles on the same feature. Likewise, multiple label classes may be used to label different types of features (for example blue labels for lakes and green labels for parks).  See the [Labeling guide page](https://developers.arcgis.com/javascript/latest/guide/labeling/index.html) for more information and known limitations.
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
    * The name of an `oid` [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#fields) containing a unique value or identifier for each feature in the layer. This property is required when constructing a FeatureLayer from a collection of [client-side features](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#client-side). If not specified, it will be inferred from the [fields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#fields) array.
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
  val relationships: js.Array[Relationship_] = js.native
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
    * When `true`, indicates that z-values will always be returned. When `false`, indicates that z-values will never be returned. The layer view determines whether to include z-values in feature queries when the property value is `undefined`.
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
    * The service definition expression limits the features available for display and query. You can define additional filters on the layer in addition to the service definition expression by setting layer's [definitionExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#definitionExpression). For example, if the service definition expression is set to display data where `"STATE_NAME = 'California'"` you could use `definitionExpression` to only display a subset of the features in California, for example using `"COUNTY='San Diego'"`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#serviceDefinitionExpression)
    */
  val serviceDefinitionExpression: String = js.native
  /**
    * A collection of [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) objects used to create a FeatureLayer. The geometry of each feature all must have a matching [geometryType](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#geometryType). This property must be set when creating a FeatureLayer from [client-side features](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#client-side). When creating a FeatureLayer from client-side features, the `objectId` field must be set either in the [fields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#fields) array or via [objectIdField](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#objectIdField).  The [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#spatialReference) and [geometryType](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#geometryType) properties are determined based on the features provided to this property. If the `source` is an empty array at the time of layer initialization, then [geometryType](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#geometryType) must be set.  Use [applyEdits()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits) method to add, remove, and update features from a client-side feature layer at runtime. Once `applyEdits()` resolves successfully, use [queryFeatures()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#queryFeatures) to return updated features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#source)
    */
  var source: Collection[Graphic] = js.native
  /**
    * The [feature service's metadata JSON](https://developers.arcgis.com/rest/services-reference/layer-feature-service-.htm) exposed by the ArcGIS REST API. While most commonly used [properties](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#properties-summary) are exposed on the FeatureLayer class directly, this property gives access to all information returned by the feature service. This property is useful if working in an application built using an older version of the API which requires access to feature service properties from a more recent version.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#sourceJSON)
    */
  var sourceJSON: js.Any = js.native
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
  var typeIdField: String = js.native
  /**
    * For [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) the type is `feature`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#type)
    */
  @JSName("type")
  val type_FeatureLayer: feature = js.native
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
  def addAttachment(feature: Graphic, attachment: FormData): js.Promise[FeatureEditResult] = js.native
  /**
    * Adds an attachment to a feature. This operation is available only if the layer's [capabilities.data.supportsAttachment](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#addAttachment)
    *
    * @param feature Feature to which the attachment is to be added.
    * @param attachment HTML form that contains a file upload field pointing to the file to be added as an attachment.
    *
    */
  def addAttachment(feature: Graphic, attachment: HTMLFormElement): js.Promise[FeatureEditResult] = js.native
  /**
    * Applies edits to features in a layer. New features can be created and existing features can be updated or deleted. Feature geometries and/or attributes may be modified. Only applicable to layers in a [feature service](https://developers.arcgis.com/rest/services-reference/feature-service.htm) and client-side features set through the layer's [source](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#source).  If client-side features are added, removed or updated at runtime using [applyEdits()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits) then use [queryFeatures()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#queryFeatures) to return updated features.
    * > When apply edits to a service with z-values and no [vertical coordinate system](https://pro.arcgis.com/en/pro-app/help/mapping/properties/vertical-coordinate-systems.htm) information, the z-values will automatically be converted to match the [outSpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#outSpatialReference) units. Example: The service has a horizontal spatial reference using `feet` units and the apply edits is made with `outSpatialReference` based on `meter` units, then [applyEdits()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits) automatically converts the values from `meter` to `feet` units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits)
    *
    * @param edits Object containing features and attachments to be added, updated or deleted.
    * @param edits.addFeatures An array or a [collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of features to be added. Values of non nullable fields must be provided when adding new features. Date fields must have [numeric](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getTime) values representing universal time.
    * @param edits.updateFeatures An array or a [collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of features to be updated. Each feature must have valid [objectId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#objectIdField). Values of non nullable fields must be provided when updating features. Date fields must have [numeric](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getTime) values representing universal time.
    * @param edits.deleteFeatures An array or a [collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of features, or an array of objects with `objectId` or `globalId` of each feature to be deleted. When an array or collection of features is passed, each feature must have a valid [objectId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#objectIdField). When an array of objects is used, each object must have a valid value set for `objectId` or `globalId` property.
    * @param edits.addAttachments An array of attachments to be added. Applies only when the `options.globalIdUsed` parameter is set to `true`. User must provide [globalId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#AttachmentEdit)s for all attachments to be added.
    * @param edits.updateAttachments An array of attachments to be updated. Applies only when the `options.globalIdUsed` parameter is set to `true`. User must provide [globalId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#AttachmentEdit)s for all attachments to be updated.
    * @param edits.deleteAttachments An array of [globalId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#AttachmentEdit)s for attachments to be deleted. Applies only when the `options.globalIdUsed` parameter is set to `true`.
    * @param options Additional edit options to specify when editing features or attachments.
    * @param options.gdbVersion The geodatabase version to apply the edits. This parameter applies only if the [capabilities.data.isVersioned](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) property of the layer is `true`. If the gdbVersion parameter is not specified, edits are made to the published map’s version.
    * @param options.rollbackOnFailureEnabled Indicates whether the edits should be applied only if all submitted edits succeed. If `false`, the server will apply the edits that succeed even if some of the submitted edits fail. If `true`, the server will apply the edits only if all edits succeed. The layer's [capabilities.editing.supportsRollbackOnFailure](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) property must be `true` if using this parameter. If `supportsRollbackOnFailure` is `false` for a layer, then `rollbackOnFailureEnabled` will always be true, regardless of how the parameter is set.
    * @param options.globalIdUsed Indicates whether the edits can be applied using globalIds of features or attachments. This parameter applies only if the layer's [capabilities.editing.supportsGlobalId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) property is `true`. When `false`, globalIds submitted with the features are ignored and the service assigns new globalIds to the new features. When `true`, the globalIds must be submitted with the new features. When updating existing features, if the `globalIdUsed` is `false`, the objectIds of the features to be updated must be provided. If the `globalIdUsed` is `true`, globalIds of features to be updated must be provided. When deleting existing features, set this property to `false` as deletes operation only accepts `objectIds` at the current version of the API.  When adding, updating or deleting attachments, `globalIdUsed` parameter must be set to `true` and the attachment globalId must be set. For new attachments, the user must provide globalIds. In order for an attachment to be updated or deleted, clients must include its globalId.  Attachments are not supported in an edit payload when `globalIdUsed` is `false`.
    *
    */
  def applyEdits(edits: FeatureLayerApplyEditsEdits): js.Promise[_] = js.native
  def applyEdits(edits: FeatureLayerApplyEditsEdits, options: FeatureLayerApplyEditsOptions): js.Promise[_] = js.native
  /**
    * Creates a popup template for the layer, populated with all the fields of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#createPopupTemplate)
    *
    * @param options Options for creating the popup template.
    *
    */
  def createPopupTemplate(): PopupTemplate = js.native
  def createPopupTemplate(options: CreatePopupTemplateOptions): PopupTemplate = js.native
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
  def deleteAttachments(feature: Graphic, attachmentIds: js.Array[Double]): js.Promise[FeatureEditResult] = js.native
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
  def queryAttachments(attachmentQuery: AttachmentQuery): js.Promise[_] = js.native
  def queryAttachments(attachmentQuery: AttachmentQueryProperties): js.Promise[_] = js.native
  def queryAttachments(attachmentQuery: AttachmentQueryProperties, options: FeatureLayerQueryAttachmentsOptions): js.Promise[_] = js.native
  def queryAttachments(attachmentQuery: AttachmentQuery, options: FeatureLayerQueryAttachmentsOptions): js.Promise[_] = js.native
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
  def queryExtent(): js.Promise[_] = js.native
  def queryExtent(query: js.UndefOr[scala.Nothing], options: FeatureLayerQueryExtentOptions): js.Promise[_] = js.native
  def queryExtent(query: Query): js.Promise[_] = js.native
  def queryExtent(query: QueryProperties): js.Promise[_] = js.native
  def queryExtent(query: QueryProperties, options: FeatureLayerQueryExtentOptions): js.Promise[_] = js.native
  def queryExtent(query: Query, options: FeatureLayerQueryExtentOptions): js.Promise[_] = js.native
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
  def queryFeatureCount(): js.Promise[Double] = js.native
  def queryFeatureCount(query: js.UndefOr[scala.Nothing], options: FeatureLayerQueryFeatureCountOptions): js.Promise[Double] = js.native
  def queryFeatureCount(query: Query): js.Promise[Double] = js.native
  def queryFeatureCount(query: QueryProperties): js.Promise[Double] = js.native
  def queryFeatureCount(query: QueryProperties, options: FeatureLayerQueryFeatureCountOptions): js.Promise[Double] = js.native
  def queryFeatureCount(query: Query, options: FeatureLayerQueryFeatureCountOptions): js.Promise[Double] = js.native
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against the feature service and returns a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html), which can be accessed using the `.then()` method once the promise resolves. A [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html) contains an array of [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) features. See the [querying](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#querying) section for more information on how to query features from a layer.
    * > To query features/graphics available to or visible in the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) on the client rather than making a server-side query, you must use the [FeatureLayerView.queryFeatures()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#queryFeatures) method.
    * > When querying a service with z-values and no [vertical coordinate system](https://pro.arcgis.com/en/pro-app/help/mapping/properties/vertical-coordinate-systems.htm) information, the z-values will automatically be converted to match the [outSpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#outSpatialReference) units. Example: The service has a horizontal spatial reference using `feet` units and the query is made with `outSpatialReference` based on `meter` units, then [queryFeatures()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#queryFeatures) automatically converts the values from `feet` to `meter` units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#queryFeatures)
    *
    * @param query Specifies the attributes and spatial filter of the query. If no parameters are specified, then all features satisfying the layer's configuration/filters are returned.
    * @param options An object with the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def queryFeatures(): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: js.UndefOr[scala.Nothing], options: FeatureLayerQueryFeaturesOptions): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: Query): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: QueryProperties): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: QueryProperties, options: FeatureLayerQueryFeaturesOptions): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: Query, options: FeatureLayerQueryFeaturesOptions): js.Promise[FeatureSet] = js.native
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
  def queryObjectIds(): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: js.UndefOr[scala.Nothing], options: FeatureLayerQueryObjectIdsOptions): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: Query): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: QueryProperties): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: QueryProperties, options: FeatureLayerQueryObjectIdsOptions): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: Query, options: FeatureLayerQueryObjectIdsOptions): js.Promise[js.Array[Double]] = js.native
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
  def queryRelatedFeatures(relationshipQuery: RelationshipQuery): js.Promise[_] = js.native
  def queryRelatedFeatures(relationshipQuery: RelationshipQueryProperties): js.Promise[_] = js.native
  def queryRelatedFeatures(relationshipQuery: RelationshipQueryProperties, options: FeatureLayerQueryRelatedFeaturesOptions): js.Promise[_] = js.native
  def queryRelatedFeatures(relationshipQuery: RelationshipQuery, options: FeatureLayerQueryRelatedFeaturesOptions): js.Promise[_] = js.native
  def updateAttachment(feature: Graphic, attachmentId: Double, attachment: FormData): js.Promise[FeatureEditResult] = js.native
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
  def updateAttachment(feature: Graphic, attachmentId: Double, attachment: HTMLFormElement): js.Promise[FeatureEditResult] = js.native
}

