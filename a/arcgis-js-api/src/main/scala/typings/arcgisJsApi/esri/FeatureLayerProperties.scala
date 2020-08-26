package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.mesh
import typings.arcgisJsApi.arcgisJsApiStrings.multipatch
import typings.arcgisJsApi.arcgisJsApiStrings.multipoint
import typings.arcgisJsApi.arcgisJsApiStrings.point
import typings.arcgisJsApi.arcgisJsApiStrings.polygon
import typings.arcgisJsApi.arcgisJsApiStrings.polyline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureLayerProperties
  extends LayerProperties
     with PortalLayerProperties
     with ScaleRangeLayerProperties
     with RefreshableLayerProperties
     with TemporalLayerProperties {
  /**
    * Copyright information for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#copyright)
    */
  var copyright: js.UndefOr[String] = js.native
  /**
    * The SQL where clause used to filter features on the client. Only the features that satisfy the definition expression are displayed in the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html). Setting a definition expression is useful when the dataset is large and you don't want to bring all features to the client for analysis. Definition expressions may be set when a layer is constructed prior to it loading in the view or after it has been added to the map. If the definition expression is set after the layer has been added to the map, the view will automatically refresh itself to display the features that satisfy the new definition expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#definitionExpression)
    */
  var definitionExpression: js.UndefOr[String] = js.native
  /**
    * The name of the layer's primary display field. The value of this property matches the name of one of the fields of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#displayField)
    */
  var displayField: js.UndefOr[String] = js.native
  /**
    * An object that allows you to create a dynamic layer with data either from map service sublayers or data from a registered workspace. See [DynamicMapLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicMapLayer) for creating dynamic layers from map service layers for on the fly rendering, labeling, and filtering (definition expressions). To create dynamic layers from other sources in registered workspaces such as tables and table joins, see [DynamicDataLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicDataLayer).  If you already have a [Sublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html) instance, you can call the [createFeatureLayer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#createFeatureLayer) method on the Sublayer to construct the layer for you.  This only applies to map services with [dynamic layers](https://enterprise.arcgis.com/en/server/latest/publish-services/linux/about-dynamic-layers.htm) enabled. Therefore, the [url](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#url) of the FeatureLayer instance must point to a map service url ending with `/dynamicLayer`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#dynamicDataSource)
    */
  var dynamicDataSource: js.UndefOr[DynamicMapLayer | DynamicDataLayer] = js.native
  /**
    * Specifies how features are placed on the vertical axis (z). This property may only be used in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). See the [ElevationInfo sample](https://developers.arcgis.com/javascript/latest/sample-code/scene-elevationinfo/index.html) for an example of how this property may be used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#elevationInfo)
    */
  var elevationInfo: js.UndefOr[FeatureLayerElevationInfo] = js.native
  /**
    * Configures the method for reducing the number of point features in the view. By default this property is `null`, which indicates the layer view should draw every feature.  There are two types of feature reduction: `selection` and `cluster`.
    *   * [Selection](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionSelection.html) only applies to points in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) and involves thinning overlapping features so no features intersect on screen. This has been available since version 4.4.
    *   * [Cluster](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html) spatially groups points in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) into _clusters_. The size of each cluster is proportional to the number of features within the cluster. This has been available since version 4.14.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#featureReduction)
    */
  var featureReduction: js.UndefOr[FeatureReductionClusterProperties | FeatureReductionSelectionProperties] = js.native
  /**
    * An array of fields in the layer. Each field represents an attribute that may contain a value for each feature in the layer. For example, a field named `POP_2015`, stores information about total population as a numeric value for each feature; this value represents the total number of people living within the geographic bounds of the feature.  When creating a FeatureLayer from [client-side features](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#client-side), this property should be set in the constructor along with the [source](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#source) property. The `objectId` field also must be set either in this array or in the [objectIdField](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#objectIdField) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#fields)
    */
  var fields: js.UndefOr[js.Array[FieldProperties]] = js.native
  /**
    * The associated [template](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html) used in an associated layer's [FeatureForm](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html).   The [formTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html) is where you configure how the form should display. Properties, i.e. `title`, `description`, `fieldConfigs`, etc, set directly within the [FeatureForm](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html) take precedence over any similar properties set within the `formTemplate`. This will change in a future release as the preferred way to set the form's properties is via it's [template](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#formTemplate).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#formTemplate)
    */
  var formTemplate: js.UndefOr[FormTemplateProperties] = js.native
  /**
    * The version of the geodatabase of the feature service data. Read the [Overview of versioning](https://desktop.arcgis.com/en/arcmap/latest/manage-data/geodatabases/an-overview-of-versioning.htm) topic for more details about this capability.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#gdbVersion)
    */
  var gdbVersion: js.UndefOr[String] = js.native
  /**
    * The geometry type of features in the layer. All features must be of the same type. This property is read-only when the layer is created from a [url](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#url).  When creating a FeatureLayer from [client-side features](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#client-side), this property is inferred by the geometryType of the features provided in the layer's [source](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#source) property. If the layer's [source](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#source) is an empty array at the time of initialization, this property must be set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#geometryType)
    */
  var geometryType: js.UndefOr[point | multipoint | polyline | polygon | multipatch | mesh] = js.native
  /**
    * Indicates whether the client-side features in the layer have `M` (measurement) values. Use the `supportsM` property in the FeatureLayer's [capabilities.data](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) object to verify if `M` values are supported on [feature service](https://developers.arcgis.com/rest/services-reference/feature-service.htm) features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#hasM)
    *
    * @default undefined
    */
  var hasM: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the client-side features in the layer have `Z` (elevation) values. Refer to [elevationInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#elevationInfo) for details regarding placement and rendering of features with z-values in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Use the `supportsZ` property in the FeatureLayer's [capabilities.data](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) object to verify if `Z` values are supported on [feature service](https://developers.arcgis.com/rest/services-reference/feature-service.htm) features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#hasZ)
    *
    * @default undefined
    */
  var hasZ: js.UndefOr[Boolean] = js.native
  /**
    * The historic moment to query. If historicMoment is not specified, the query will apply to the current features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#historicMoment)
    */
  var historicMoment: js.UndefOr[DateProperties] = js.native
  /**
    * Returns `true` if the layer is loaded from a non-spatial table in a service. Non-spatial table does not have a spatial column that represents geographic features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#isTable)
    *
    * @default false
    */
  var isTable: js.UndefOr[Boolean] = js.native
  /**
    * The label definition for this layer, specified as an array of [LabelClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html). Use this property to specify labeling properties for the layer such as label expression, placement, and size.  Multiple Label classes with different `where` clauses can be used to define several labels with varying styles on the same feature. Likewise, multiple label classes may be used to label different types of features (for example blue labels for lakes and green labels for parks).  See the [Labeling guide page](https://developers.arcgis.com/javascript/latest/guide/labeling/index.html) for more information and known limitations.
    * > **Known Limitations**
    *   * Currently only one [LabelClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html) is supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#labelingInfo)
    */
  var labelingInfo: js.UndefOr[js.Array[LabelClassProperties]] = js.native
  /**
    * Indicates whether to display labels for this layer. If `true`, labels will appear as defined in the [labelingInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#labelingInfo) property.
    * > **Known Limitations**
    *   * Currently 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) only support one [LabelClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html) per feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#labelsVisible)
    *
    * @default true
    */
  var labelsVisible: js.UndefOr[Boolean] = js.native
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
  var layerId: js.UndefOr[Double] = js.native
  /**
    * Indicates whether the layer will be included in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#legendEnabled)
    *
    * @default true
    */
  var legendEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The name of an `oid` [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#fields) containing a unique value or identifier for each feature in the layer. This property is required when constructing a FeatureLayer from a collection of [client-side features](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#client-side). If not specified, it will be inferred from the [fields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#fields) array.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#objectIdField)
    */
  var objectIdField: js.UndefOr[String] = js.native
  /**
    * An array of field names from the service to include with each feature. To fetch the values from all fields in the layer, use `["*"]`. Fields specified in `outFields` will be requested alongside with required fields for [rendering](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#renderer), [labeling](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#labelingInfo) and setting the [elevation info](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#elevationInfo) for the layer. The required fields and `outFields` are used to populate [FeatureLayerView.availableFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#availableFields). Set this property to include the fields that will be used for client-side [queries](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#queryFeatures) if the fields are not part of required fields used for rendering.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#outFields)
    *
    * @default null
    */
  var outFields: js.UndefOr[js.Array[String]] = js.native
  /**
    * Indicates whether to display popups when features in the layer are clicked. The layer needs to have a [popupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#popupTemplate) to define what information should be displayed in the popup. Alternatively, a default popup template may be automatically used if [Popup.defaultPopupTemplateEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#defaultPopupTemplateEnabled) is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#popupEnabled)
    *
    * @default true
    */
  var popupEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The popup template for the layer. When set on the layer, the `popupTemplate` allows users to access attributes and display their values in the [view's popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#popup) when a feature is selected using text and/or charts. See the [PopupTemplate sample](https://developers.arcgis.com/javascript/latest/sample-code/intro-popuptemplate/index.html) for an example of how [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) interacts with a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).  A default popup template is automatically used if no `popupTemplate` has been defined when [Popup.defaultPopupTemplateEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#defaultPopupTemplateEnabled) is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#popupTemplate)
    */
  var popupTemplate: js.UndefOr[PopupTemplateProperties] = js.native
  /**
    * The renderer assigned to the layer. The renderer defines how to visualize each feature in the layer. Depending on the renderer type, features may be visualized with the same symbol, or with varying symbols based on the values of provided attribute fields or functions.  However, when creating a FeatureLayer from client-side features, this property must be specified in the layer's constructor along with the [source](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#source), [fields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#fields), [objectIdField](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#objectIdField) properties.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#renderer)
    */
  var renderer: js.UndefOr[RendererProperties] = js.native
  /**
    * When `true`, indicates that M values will be returned. When `false`, indicates that M values will never be returned. The layer view determines whether to include M values in feature queries when the property value is `undefined`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#returnM)
    *
    * @default undefined
    */
  var returnM: js.UndefOr[Boolean] = js.native
  /**
    * When `true`, indicates that z-values will always be returned. When `false`, indicates that z-values will never be returned. The layer view determines whether to include z-values in feature queries when the property value is `undefined`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#returnZ)
    *
    * @default undefined
    */
  var returnZ: js.UndefOr[Boolean] = js.native
  /**
    * Apply perspective scaling to screen-size point symbols in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). When `true`, screen sized objects such as [icons](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html), [labels](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html) or [callouts](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-Callout3D.html) integrate better in the 3D scene by applying a certain perspective projection to the sizing of features. This only applies when using a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).  `layer.screenSizePerspectiveEnabled = true`  ![screen-size-perspective](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-screenSize-perspective.png)  `layer.screenSizePerspectiveEnabled = false`  ![no-screen-size-perspective](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-no-screenSize-perspective.png)
    * > **Known Limitations**  Screen size perspective is currently not optimized for situations where the camera is very near the ground, or for scenes with point features located far from the ground surface. In these cases it may be better to turn off screen size perspective. As screen size perspective changes the size based on distance to the camera, it should be set to false when using {@link module:esri/renderers/Renderer#SizeVisualVariable size visual variables}.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#screenSizePerspectiveEnabled)
    *
    * @default true
    */
  var screenSizePerspectiveEnabled: js.UndefOr[Boolean] = js.native
  /**
    * A collection of [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) objects used to create a FeatureLayer. The geometry of each feature all must have a matching [geometryType](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#geometryType). This property must be set when creating a FeatureLayer from [client-side features](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#client-side). When creating a FeatureLayer from client-side features, the `objectId` field must be set either in the [fields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#fields) array or via [objectIdField](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#objectIdField).  The [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#spatialReference) and [geometryType](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#geometryType) properties are determined based on the features provided to this property. If the `source` is an empty array at the time of layer initialization, then [geometryType](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#geometryType) must be set.  Use [applyEdits()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits) method to add, remove, and update features from a client-side feature layer at runtime. Once `applyEdits()` resolves successfully, use [queryFeatures()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#queryFeatures) to return updated features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#source)
    */
  var source: js.UndefOr[CollectionProperties[GraphicProperties]] = js.native
  /**
    * The [feature service's metadata JSON](https://developers.arcgis.com/rest/services-reference/layer-feature-service-.htm) exposed by the ArcGIS REST API. While most commonly used [properties](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#properties-summary) are exposed on the FeatureLayer class directly, this property gives access to all information returned by the feature service. This property is useful if working in an application built using an older version of the API which requires access to feature service properties from a more recent version.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#sourceJSON)
    */
  var sourceJSON: js.UndefOr[js.Any] = js.native
  /**
    * The spatial reference of the layer. When creating the layer from a [url](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#url), the spatial reference is read from the service.  When creating a FeatureLayer from client-side features, this property is inferred from the geometries of the features provided in the [source](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#source) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#spatialReference)
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.native
  /**
    * An array of feature templates defined in the feature layer. See [ArcGIS Pro subtypes document](https://pro.arcgis.com/en/pro-app/help/data/geodatabases/overview/an-overview-of-subtypes.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#templates)
    */
  var templates: js.UndefOr[js.Array[FeatureTemplateProperties]] = js.native
  /**
    * The name of the field holding the type ID or subtypes for the features. See [ArcGIS Pro subtypes document](https://pro.arcgis.com/en/pro-app/help/data/geodatabases/overview/an-overview-of-subtypes.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#typeIdField)
    */
  var typeIdField: js.UndefOr[String] = js.native
  /**
    * An array of subtypes defined in the feature service exposed by ArcGIS REST API. Each item includes information about the type, such as the type ID, name, and definition expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#types)
    */
  var types: js.UndefOr[js.Array[FeatureTypeProperties]] = js.native
  /**
    * The URL of the REST endpoint of the layer, non-spatial table or service. The URL may either point to a resource on ArcGIS Enterprise or ArcGIS Online.  If the url points directly to a service, then the layer must be specified in the [layerId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#layerId) property. If no [layerId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#layerId) is given, then the first layer in the service will be loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#url)
    */
  var url: js.UndefOr[String] = js.native
}

object FeatureLayerProperties {
  @scala.inline
  def apply(): FeatureLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureLayerProperties]
  }
  @scala.inline
  implicit class FeatureLayerPropertiesOps[Self <: FeatureLayerProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCopyright(value: String): Self = this.set("copyright", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyright: Self = this.set("copyright", js.undefined)
    @scala.inline
    def setDefinitionExpression(value: String): Self = this.set("definitionExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefinitionExpression: Self = this.set("definitionExpression", js.undefined)
    @scala.inline
    def setDisplayField(value: String): Self = this.set("displayField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayField: Self = this.set("displayField", js.undefined)
    @scala.inline
    def setDynamicDataSource(value: DynamicMapLayer | DynamicDataLayer): Self = this.set("dynamicDataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamicDataSource: Self = this.set("dynamicDataSource", js.undefined)
    @scala.inline
    def setElevationInfo(value: FeatureLayerElevationInfo): Self = this.set("elevationInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElevationInfo: Self = this.set("elevationInfo", js.undefined)
    @scala.inline
    def setFeatureReduction(value: FeatureReductionClusterProperties | FeatureReductionSelectionProperties): Self = this.set("featureReduction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureReduction: Self = this.set("featureReduction", js.undefined)
    @scala.inline
    def setFieldsVarargs(value: FieldProperties*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[FieldProperties]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setFormTemplate(value: FormTemplateProperties): Self = this.set("formTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormTemplate: Self = this.set("formTemplate", js.undefined)
    @scala.inline
    def setGdbVersion(value: String): Self = this.set("gdbVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGdbVersion: Self = this.set("gdbVersion", js.undefined)
    @scala.inline
    def setGeometryType(value: point | multipoint | polyline | polygon | multipatch | mesh): Self = this.set("geometryType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeometryType: Self = this.set("geometryType", js.undefined)
    @scala.inline
    def setHasM(value: Boolean): Self = this.set("hasM", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasM: Self = this.set("hasM", js.undefined)
    @scala.inline
    def setHasZ(value: Boolean): Self = this.set("hasZ", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasZ: Self = this.set("hasZ", js.undefined)
    @scala.inline
    def setHistoricMoment(value: DateProperties): Self = this.set("historicMoment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHistoricMoment: Self = this.set("historicMoment", js.undefined)
    @scala.inline
    def setIsTable(value: Boolean): Self = this.set("isTable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsTable: Self = this.set("isTable", js.undefined)
    @scala.inline
    def setLabelingInfoVarargs(value: LabelClassProperties*): Self = this.set("labelingInfo", js.Array(value :_*))
    @scala.inline
    def setLabelingInfo(value: js.Array[LabelClassProperties]): Self = this.set("labelingInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelingInfo: Self = this.set("labelingInfo", js.undefined)
    @scala.inline
    def setLabelsVisible(value: Boolean): Self = this.set("labelsVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelsVisible: Self = this.set("labelsVisible", js.undefined)
    @scala.inline
    def setLayerId(value: Double): Self = this.set("layerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerId: Self = this.set("layerId", js.undefined)
    @scala.inline
    def setLegendEnabled(value: Boolean): Self = this.set("legendEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegendEnabled: Self = this.set("legendEnabled", js.undefined)
    @scala.inline
    def setObjectIdField(value: String): Self = this.set("objectIdField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectIdField: Self = this.set("objectIdField", js.undefined)
    @scala.inline
    def setOutFieldsVarargs(value: String*): Self = this.set("outFields", js.Array(value :_*))
    @scala.inline
    def setOutFields(value: js.Array[String]): Self = this.set("outFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutFields: Self = this.set("outFields", js.undefined)
    @scala.inline
    def setPopupEnabled(value: Boolean): Self = this.set("popupEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupEnabled: Self = this.set("popupEnabled", js.undefined)
    @scala.inline
    def setPopupTemplate(value: PopupTemplateProperties): Self = this.set("popupTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupTemplate: Self = this.set("popupTemplate", js.undefined)
    @scala.inline
    def setRenderer(value: RendererProperties): Self = this.set("renderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    @scala.inline
    def setReturnM(value: Boolean): Self = this.set("returnM", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnM: Self = this.set("returnM", js.undefined)
    @scala.inline
    def setReturnZ(value: Boolean): Self = this.set("returnZ", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnZ: Self = this.set("returnZ", js.undefined)
    @scala.inline
    def setScreenSizePerspectiveEnabled(value: Boolean): Self = this.set("screenSizePerspectiveEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenSizePerspectiveEnabled: Self = this.set("screenSizePerspectiveEnabled", js.undefined)
    @scala.inline
    def setSourceVarargs(value: GraphicProperties*): Self = this.set("source", js.Array(value :_*))
    @scala.inline
    def setSource(value: CollectionProperties[GraphicProperties]): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setSourceJSON(value: js.Any): Self = this.set("sourceJSON", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceJSON: Self = this.set("sourceJSON", js.undefined)
    @scala.inline
    def setSpatialReference(value: SpatialReferenceProperties): Self = this.set("spatialReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpatialReference: Self = this.set("spatialReference", js.undefined)
    @scala.inline
    def setTemplatesVarargs(value: FeatureTemplateProperties*): Self = this.set("templates", js.Array(value :_*))
    @scala.inline
    def setTemplates(value: js.Array[FeatureTemplateProperties]): Self = this.set("templates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplates: Self = this.set("templates", js.undefined)
    @scala.inline
    def setTypeIdField(value: String): Self = this.set("typeIdField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeIdField: Self = this.set("typeIdField", js.undefined)
    @scala.inline
    def setTypesVarargs(value: FeatureTypeProperties*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[FeatureTypeProperties]): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

