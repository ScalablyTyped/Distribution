package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.mesh
import typings.arcgisJsApi.arcgisJsApiStrings.point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SceneLayerProperties
  extends LayerProperties
     with SceneServiceProperties
     with PortalLayerProperties
     with ScaleRangeLayerProperties {
  /**
    * The SQL where clause used to filter features on the client. Only the features that satisfy the definition expression are displayed in the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html). Setting a definition expression is useful when only a subset of the data in the layer should be displayed.  Setting the definition expression of a layer automatically updates all layer views.  If the definition expression is set after the layer has been added to the map, the view will automatically refresh itself to display the features that satisfy the new definition expression.  Important to note is that the initial loading time of the features remains unchanged, even if they are filtered. This happens because, as opposed to Feature Layers, feature filtering is done client-side. As a result all features need to be downloaded always for filter evaluation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#definitionExpression)
    */
  var definitionExpression: js.UndefOr[String] = js.native
  /**
    * Specifies how graphics are placed on the vertical axis (z). See the [ElevationInfo sample](https://developers.arcgis.com/javascript/latest/sample-code/scene-elevationinfo/index.html) for an example of how this property may be used.  This property only affects 3D Object [SceneLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html) when using the `absolute-height` mode. [SceneLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html) with [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometries support all the elevation modes listed below.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#elevationInfo)
    */
  var elevationInfo: js.UndefOr[SceneLayerElevationInfo] = js.native
  /**
    * Configures the method for decluttering overlapping features in the view. If this property is not set (or set to `null`), every feature is drawn individually.  This property is only supported for point scene layers with non-draped [Icon](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html) or [Text](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html) symbol layers.  [![declutter](https://developers.arcgis.com/javascript/assets/img/samples/city-points-declutter.gif)](https://developers.arcgis.com/javascript/latest/sample-code/visualization-point-styles/index.html)
    * > **Known Limitation**  When applying featureReduction on a point SceneLayer layer updates are slow. This will be addressed in upcoming releases.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#featureReduction)
    */
  var featureReduction: js.UndefOr[FeatureReductionSelectionProperties] = js.native
  /**
    * The geometry type of features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#geometryType)
    */
  var geometryType: js.UndefOr[point | mesh] = js.native
  /**
    * The label definition for this layer, specified as an array of [LabelClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html). Use this property to specify labeling properties for the layer such as label expression, placement, and size.
    * > **Known Limitations**  Each feature can have only one label. Multiple [Label classes](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html) with different [where](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#where) clauses can be used to have different label styles on different features that belong to the same layer (for example blue labels for lakes and green labels for parks).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#labelingInfo)
    */
  var labelingInfo: js.UndefOr[js.Array[LabelClassProperties]] = js.native
  /**
    * Indicates whether to display labels for this layer. If `true`, labels will appear as defined in the [labelingInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#labelingInfo) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#labelsVisible)
    *
    * @default true
    */
  var labelsVisible: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the layer will be included in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#legendEnabled)
    *
    * @default true
    */
  var legendEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The name of the field containing each graphic's Object ID. If this is not explicitly specified, this is automatically derived from the [fields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#fields) of the service by taking the first field of type `oid`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#objectIdField)
    */
  var objectIdField: js.UndefOr[String] = js.native
  /**
    * An array of field names from the service to include with each feature. To fetch the values from all fields in the layer, use `["*"]`. Fields specified in `outFields` will be requested alongside with required fields for [rendering](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#renderer), [labeling](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#labelingInfo) and setting the [elevation info](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#elevationInfo) for the layer. The required fields and `outFields` are used to populate [SceneLayerView.availableFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#availableFields). Set this property to include the fields that will be used for client-side [queries](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#queryFeatures) if the fields are not part of required fields used for rendering.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#outFields)
    *
    * @default null
    */
  var outFields: js.UndefOr[js.Array[String]] = js.native
  /**
    * Indicates whether to display popups when features in the layer are clicked. The layer needs to have a [popupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#popupTemplate) to define what information should be displayed in the popup. Alternatively, a default popup template may be automatically used if [Popup.defaultPopupTemplateEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#defaultPopupTemplateEnabled) is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#popupEnabled)
    *
    * @default true
    */
  var popupEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The popup template for the layer. When set on the layer, the `popupTemplate` allows users to access attributes and display their values in the [view's popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#popup) when a feature is selected using text and/or charts. See the [PopupTemplate sample](https://developers.arcgis.com/javascript/latest/sample-code/intro-popuptemplate/index.html) for an example of how [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) interacts with a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html). Setting a [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) on this layer type is done in the same way as a FeatureLayer.  A default popup template is automatically used if no `popupTemplate` has been defined when [Popup.defaultPopupTemplateEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#defaultPopupTemplateEnabled) is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#popupTemplate)
    */
  var popupTemplate: js.UndefOr[PopupTemplateProperties] = js.native
  /**
    * The renderer assigned to the layer. The renderer defines how to visualize each feature in the layer. Depending on the renderer type, features may be visualized with the same symbol, or with varying symbols based on the values of provided attribute fields or functions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#renderer)
    */
  var renderer: js.UndefOr[RendererProperties] = js.native
  /**
    * Apply perspective scaling to screen-size point symbols in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). When `true`, screen sized objects such as [icons](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html), [labels](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html) or [callouts](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-Callout3D.html) integrate better in the 3D scene by applying a certain perspective projection to the sizing of features. This only applies when using a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).  `layer.screenSizePerspectiveEnabled = true`  ![screen-size-perspective](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-screenSize-perspective.png)  `layer.screenSizePerspectiveEnabled = false`  ![no-screen-size-perspective](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-no-screenSize-perspective.png)
    * > **Known Limitations**  Screen size perspective is currently not optimized for situations where the camera is very near the ground, or for scenes with point features located far from the ground surface. In these cases it may be better to turn off screen size perspective. As screen size perspective changes the size based on distance to the camera, it should be set to false when using {@link module:esri/renderers/Renderer#SizeVisualVariable size visual variables}.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#screenSizePerspectiveEnabled)
    *
    * @default true
    */
  var screenSizePerspectiveEnabled: js.UndefOr[Boolean] = js.native
}

object SceneLayerProperties {
  @scala.inline
  def apply(): SceneLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SceneLayerProperties]
  }
  @scala.inline
  implicit class SceneLayerPropertiesOps[Self <: SceneLayerProperties] (val x: Self) extends AnyVal {
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
    def setDefinitionExpression(value: String): Self = this.set("definitionExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefinitionExpression: Self = this.set("definitionExpression", js.undefined)
    @scala.inline
    def setElevationInfo(value: SceneLayerElevationInfo): Self = this.set("elevationInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElevationInfo: Self = this.set("elevationInfo", js.undefined)
    @scala.inline
    def setFeatureReduction(value: FeatureReductionSelectionProperties): Self = this.set("featureReduction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureReduction: Self = this.set("featureReduction", js.undefined)
    @scala.inline
    def setGeometryType(value: point | mesh): Self = this.set("geometryType", value.asInstanceOf[js.Any])
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
    def setScreenSizePerspectiveEnabled(value: Boolean): Self = this.set("screenSizePerspectiveEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenSizePerspectiveEnabled: Self = this.set("screenSizePerspectiveEnabled", js.undefined)
  }
  
}

