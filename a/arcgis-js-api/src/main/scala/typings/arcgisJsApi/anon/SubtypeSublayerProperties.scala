package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.`subtype-sublayer`
import typings.arcgisJsApi.esri.FeatureTemplateProperties
import typings.arcgisJsApi.esri.FormTemplateProperties
import typings.arcgisJsApi.esri.LabelClassProperties
import typings.arcgisJsApi.esri.PopupTemplateProperties
import typings.arcgisJsApi.esri.RendererProperties
import typings.arcgisJsApi.esri.SpatialReferenceProperties
import typings.arcgisJsApi.esri.SubtypeGroupLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.SubtypeSublayerProperties & {  type :'subtype-sublayer'} */
trait SubtypeSublayerProperties extends StObject {
  
  /**
  		 * Determines if the layer is editable.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#editingEnabled)
  		 */
  var editingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The [template](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html) used in an associated layer's [FeatureForm](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#formTemplate)
  		 */
  var formTemplate: js.UndefOr[FormTemplateProperties] = js.undefined
  
  /**
  		 * The label definition for this layer, specified as an array of [LabelClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#labelingInfo)
  		 */
  var labelingInfo: js.UndefOr[js.Array[LabelClassProperties]] = js.undefined
  
  /**
  		 * Indicates whether to display labels for this layer.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#labelsVisible)
  		 */
  var labelsVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates whether the layer will be included in the legend.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#legendEnabled)
  		 */
  var legendEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The maximum scale (most zoomed in) at which the layer is visible in the view.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#maxScale)
  		 */
  var maxScale: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The minimum scale (most zoomed out) at which the layer is visible in the view.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#minScale)
  		 */
  var minScale: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The opacity of the layer.
  		 *
  		 * @default 1
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#opacity)
  		 */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The [SubtypeGroupLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html) to which the sublayer belongs.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#parent)
  		 */
  var parent: js.UndefOr[SubtypeGroupLayerProperties] = js.undefined
  
  /**
  		 * Indicates whether to display popups when features in the layer are clicked.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#popupEnabled)
  		 */
  var popupEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The popup template for the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#popupTemplate)
  		 */
  var popupTemplate: js.UndefOr[PopupTemplateProperties] = js.undefined
  
  /**
  		 * The renderer assigned to the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#renderer)
  		 */
  var renderer: js.UndefOr[RendererProperties] = js.undefined
  
  /**
  		 * The spatial reference of the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#spatialReference)
  		 */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  
  /**
  		 * The unique identifier representing the [SubtypeSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html) created from the [SubtypeGroupLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html).
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#subtypeCode)
  		 */
  var subtypeCode: js.UndefOr[Double] = js.undefined
  
  /**
  		 * An array of feature templates defined in the feature layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#templates)
  		 */
  var templates: js.UndefOr[js.Array[FeatureTemplateProperties]] = js.undefined
  
  /**
  		 * The title of the layer used to identify it in places such as the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#title)
  		 */
  var title: js.UndefOr[String] = js.undefined
  
  var `type`: `subtype-sublayer`
  
  /**
  		 * Indicates if the layer is visible in the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html).
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html#visible)
  		 */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object SubtypeSublayerProperties {
  
  inline def apply(): SubtypeSublayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("subtype-sublayer")
    __obj.asInstanceOf[SubtypeSublayerProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubtypeSublayerProperties] (val x: Self) extends AnyVal {
    
    inline def setEditingEnabled(value: Boolean): Self = StObject.set(x, "editingEnabled", value.asInstanceOf[js.Any])
    
    inline def setEditingEnabledUndefined: Self = StObject.set(x, "editingEnabled", js.undefined)
    
    inline def setFormTemplate(value: FormTemplateProperties): Self = StObject.set(x, "formTemplate", value.asInstanceOf[js.Any])
    
    inline def setFormTemplateUndefined: Self = StObject.set(x, "formTemplate", js.undefined)
    
    inline def setLabelingInfo(value: js.Array[LabelClassProperties]): Self = StObject.set(x, "labelingInfo", value.asInstanceOf[js.Any])
    
    inline def setLabelingInfoUndefined: Self = StObject.set(x, "labelingInfo", js.undefined)
    
    inline def setLabelingInfoVarargs(value: LabelClassProperties*): Self = StObject.set(x, "labelingInfo", js.Array(value*))
    
    inline def setLabelsVisible(value: Boolean): Self = StObject.set(x, "labelsVisible", value.asInstanceOf[js.Any])
    
    inline def setLabelsVisibleUndefined: Self = StObject.set(x, "labelsVisible", js.undefined)
    
    inline def setLegendEnabled(value: Boolean): Self = StObject.set(x, "legendEnabled", value.asInstanceOf[js.Any])
    
    inline def setLegendEnabledUndefined: Self = StObject.set(x, "legendEnabled", js.undefined)
    
    inline def setMaxScale(value: Double): Self = StObject.set(x, "maxScale", value.asInstanceOf[js.Any])
    
    inline def setMaxScaleUndefined: Self = StObject.set(x, "maxScale", js.undefined)
    
    inline def setMinScale(value: Double): Self = StObject.set(x, "minScale", value.asInstanceOf[js.Any])
    
    inline def setMinScaleUndefined: Self = StObject.set(x, "minScale", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setParent(value: SubtypeGroupLayerProperties): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setPopupEnabled(value: Boolean): Self = StObject.set(x, "popupEnabled", value.asInstanceOf[js.Any])
    
    inline def setPopupEnabledUndefined: Self = StObject.set(x, "popupEnabled", js.undefined)
    
    inline def setPopupTemplate(value: PopupTemplateProperties): Self = StObject.set(x, "popupTemplate", value.asInstanceOf[js.Any])
    
    inline def setPopupTemplateUndefined: Self = StObject.set(x, "popupTemplate", js.undefined)
    
    inline def setRenderer(value: RendererProperties): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    inline def setSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    inline def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
    
    inline def setSubtypeCode(value: Double): Self = StObject.set(x, "subtypeCode", value.asInstanceOf[js.Any])
    
    inline def setSubtypeCodeUndefined: Self = StObject.set(x, "subtypeCode", js.undefined)
    
    inline def setTemplates(value: js.Array[FeatureTemplateProperties]): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    
    inline def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
    
    inline def setTemplatesVarargs(value: FeatureTemplateProperties*): Self = StObject.set(x, "templates", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: `subtype-sublayer`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
