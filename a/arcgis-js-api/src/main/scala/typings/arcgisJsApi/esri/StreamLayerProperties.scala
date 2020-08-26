package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.multipoint
import typings.arcgisJsApi.arcgisJsApiStrings.point
import typings.arcgisJsApi.arcgisJsApiStrings.polygon
import typings.arcgisJsApi.arcgisJsApiStrings.polyline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamLayerProperties
  extends LayerProperties
     with ScaleRangeLayerProperties
     with TemporalLayerProperties {
  /**
    * Copyright information for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#copyright)
    */
  var copyright: js.UndefOr[String] = js.native
  /**
    * The SQL where clause used to filter features based on their attributes. Only the features that satisfy the definition expression are displayed in the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html). Setting a definition expression is useful when the dataset is large and you don't want to bring all features to the client for analysis. Definition expressions may be set when a layer is constructed prior to it loading in the view or after it has been added to the map. If the definition expression is set after the layer has been added to the map, the view will automatically refresh itself to display the features that satisfy the new definition expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#definitionExpression)
    */
  var definitionExpression: js.UndefOr[String] = js.native
  /**
    * The name of the layer's primary display field. The value of this property matches the name of one of the fields of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#displayField)
    */
  var displayField: js.UndefOr[String] = js.native
  /**
    * Specifies how graphics are placed on the vertical axis (z). This property may only be used in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). See the [ElevationInfo sample](https://developers.arcgis.com/javascript/latest/sample-code/scene-elevationinfo/index.html) for an example of how this property may be used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#elevationInfo)
    */
  var elevationInfo: js.UndefOr[StreamLayerElevationInfo] = js.native
  /**
    * Configures the method for reducing the number of point features in the view. By default this property is `null`, which indicates the layer view should draw every feature.  StreamLayer supports one type feature reduction: `selection`. [Selection](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionSelection.html) only applies to points in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) and involves thinning overlapping features so no features intersect on screen.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#featureReduction)
    */
  var featureReduction: js.UndefOr[FeatureReductionSelectionProperties] = js.native
  /**
    * An array of fields in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#fields)
    */
  var fields: js.UndefOr[js.Array[FieldProperties]] = js.native
  /**
    * An [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) object used to filter features. Only features that intersect the extent object are displayed in the view. For example, the `geometryDefinition` can be set to a city boundary extent to display features only intersect this extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#geometryDefinition)
    */
  var geometryDefinition: js.UndefOr[ExtentProperties] = js.native
  /**
    * The geometry type of features in the layer. All features must be of the same type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#geometryType)
    */
  var geometryType: js.UndefOr[point | polygon | polyline | multipoint] = js.native
  /**
    * The label definition for this layer, specified as an array of [LabelClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html). Use this property to specify labeling properties for the layer such as label expression, placement, and size.  Multiple Label classes with different `where` clauses can be used to define several labels with varying styles on the same feature. Likewise, multiple label classes may be used to label different types of features (for example blue labels for boats and green labels for trucks).
    * > **Known Limitations**
    *   * Currently only one [LabelClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html) is supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#labelingInfo)
    */
  var labelingInfo: js.UndefOr[js.Array[LabelClassProperties]] = js.native
  /**
    * Indicates whether to display labels for this layer. If `true`, labels will appear as defined in the [labelingInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#labelingInfo) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#labelsVisible)
    *
    * @default true
    */
  var labelsVisible: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the layer will be included in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#legendEnabled)
    *
    * @default true
    */
  var legendEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Maximum number of features to show per [trackId](https://enterprise.arcgis.com/en/geoevent/latest/get-started/essential-geoevent-server-vocabulary.htm#ESRI_SECTION1_F45BBCE9ADFA4E57AF38DD225921EFCD). If `trackId` is not configured on the GeoEvent Service, the `maximumTrackPoints` property will have no effect and an error will be logged in the console.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#maximumTrackPoints)
    *
    * @default 1
    */
  var maximumTrackPoints: js.UndefOr[Double] = js.native
  /**
    * The name of an `oid` [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#fields) containing a unique value or identifier for each feature in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#objectIdField)
    */
  var objectIdField: js.UndefOr[String] = js.native
  /**
    * Indicates whether to display popups when features in the layer are clicked. The layer needs to have a [popupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#popupTemplate) to define what information should be displayed in the popup. Alternatively, a default popup template may be automatically used if [Popup.defaultPopupTemplateEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#defaultPopupTemplateEnabled) is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#popupEnabled)
    *
    * @default true
    */
  var popupEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The popup template for the layer. When set on the layer, the `popupTemplate` allows users to access attributes and display their values in the [view's popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#popup) when a feature is selected using text and/or charts. See the [PopupTemplate sample](https://developers.arcgis.com/javascript/latest/sample-code/intro-popuptemplate/index.html) for an example of how [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) interacts with a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).  A default popup template is automatically used if no `popupTemplate` has been defined when [Popup.defaultPopupTemplateEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#defaultPopupTemplateEnabled) is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#popupTemplate)
    */
  var popupTemplate: js.UndefOr[PopupTemplateProperties] = js.native
  /**
    * Options for purging stale features. The purge options controls how much data is removed from [StreamLayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-StreamLayerView.html) and how often.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#purgeOptions)
    */
  var purgeOptions: js.UndefOr[StreamLayerPurgeOptions] = js.native
  /**
    * The renderer assigned to the layer. The renderer defines how to visualize each feature in the layer. Depending on the renderer type, features may be visualized with the same symbol, or with varying symbols based on the values of provided attribute fields or functions. If not specified, a default renderer will be generated based on the geometry type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#renderer)
    */
  var renderer: js.UndefOr[RendererProperties] = js.native
  /**
    * Apply perspective scaling to screen-size point symbols in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). When `true`, screen sized objects such as [icons](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html), [labels](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html) or [callouts](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-Callout3D.html) integrate better in the 3D scene by applying a certain perspective projection to the sizing of features. This only applies when using a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).  `layer.screenSizePerspectiveEnabled = true`  ![screen-size-perspective](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-screenSize-perspective.png)  `layer.screenSizePerspectiveEnabled = false`  ![no-screen-size-perspective](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-no-screenSize-perspective.png)
    * > **Known Limitations**  Screen size perspective is currently not optimized for situations where the camera is very near the ground, or for scenes with point features located far from the ground surface. In these cases it may be better to turn off screen size perspective. As screen size perspective changes the size based on distance to the camera, it should be set to false when using {@link module:esri/renderers/Renderer#SizeVisualVariable size visual variables}.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#screenSizePerspectiveEnabled)
    *
    * @default true
    */
  var screenSizePerspectiveEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The [stream service's metadata JSON](https://developers.arcgis.com/rest/services-reference/stream-service.htm) exposed by the ArcGIS REST API. While most commonly used [properties](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#properties-summary) are exposed on the StreamLayer class directly, this property gives access to all information returned by the stream service. This property is useful if working in an application built using an older version of the API which requires access to stream service properties from a more recent version.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#sourceJSON)
    */
  var sourceJSON: js.UndefOr[js.Any] = js.native
  /**
    * The spatial reference of the layer. When creating the layer from a [url](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#url), the spatial reference is read from the service.  When creating a StreamLayer from client-side features, this property is inferred from the geometries of the features provided in the [source](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#source) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#spatialReference)
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.native
  /**
    * The URL of the stream service. This is set in the `url` parameter of the [constructor](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#constructors-summary).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#url)
    */
  var url: js.UndefOr[String] = js.native
}

object StreamLayerProperties {
  @scala.inline
  def apply(): StreamLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamLayerProperties]
  }
  @scala.inline
  implicit class StreamLayerPropertiesOps[Self <: StreamLayerProperties] (val x: Self) extends AnyVal {
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
    def setElevationInfo(value: StreamLayerElevationInfo): Self = this.set("elevationInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElevationInfo: Self = this.set("elevationInfo", js.undefined)
    @scala.inline
    def setFeatureReduction(value: FeatureReductionSelectionProperties): Self = this.set("featureReduction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureReduction: Self = this.set("featureReduction", js.undefined)
    @scala.inline
    def setFieldsVarargs(value: FieldProperties*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[FieldProperties]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setGeometryDefinition(value: ExtentProperties): Self = this.set("geometryDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeometryDefinition: Self = this.set("geometryDefinition", js.undefined)
    @scala.inline
    def setGeometryType(value: point | polygon | polyline | multipoint): Self = this.set("geometryType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeometryType: Self = this.set("geometryType", js.undefined)
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
    def setLegendEnabled(value: Boolean): Self = this.set("legendEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegendEnabled: Self = this.set("legendEnabled", js.undefined)
    @scala.inline
    def setMaximumTrackPoints(value: Double): Self = this.set("maximumTrackPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumTrackPoints: Self = this.set("maximumTrackPoints", js.undefined)
    @scala.inline
    def setObjectIdField(value: String): Self = this.set("objectIdField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectIdField: Self = this.set("objectIdField", js.undefined)
    @scala.inline
    def setPopupEnabled(value: Boolean): Self = this.set("popupEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupEnabled: Self = this.set("popupEnabled", js.undefined)
    @scala.inline
    def setPopupTemplate(value: PopupTemplateProperties): Self = this.set("popupTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupTemplate: Self = this.set("popupTemplate", js.undefined)
    @scala.inline
    def setPurgeOptions(value: StreamLayerPurgeOptions): Self = this.set("purgeOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePurgeOptions: Self = this.set("purgeOptions", js.undefined)
    @scala.inline
    def setRenderer(value: RendererProperties): Self = this.set("renderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    @scala.inline
    def setScreenSizePerspectiveEnabled(value: Boolean): Self = this.set("screenSizePerspectiveEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenSizePerspectiveEnabled: Self = this.set("screenSizePerspectiveEnabled", js.undefined)
    @scala.inline
    def setSourceJSON(value: js.Any): Self = this.set("sourceJSON", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceJSON: Self = this.set("sourceJSON", js.undefined)
    @scala.inline
    def setSpatialReference(value: SpatialReferenceProperties): Self = this.set("spatialReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpatialReference: Self = this.set("spatialReference", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

