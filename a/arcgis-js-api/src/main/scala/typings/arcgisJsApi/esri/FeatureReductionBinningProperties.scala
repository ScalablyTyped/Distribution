package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.binning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureReductionBinningProperties extends StObject {
  
  /**
  		 * An array of aggregate fields that summarize layer [fields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#fields) from features contained within each bin.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionBinning.html#fields)
  		 */
  var fields: js.UndefOr[js.Array[AggregateFieldProperties]] = js.undefined
  
  /**
  		 * The fixed geohash level used to create bins.
  		 *
  		 * @default 3
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionBinning.html#fixedBinLevel)
  		 */
  var fixedBinLevel: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Defines labels for bins as an array of [LabelClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionBinning.html#labelingInfo)
  		 */
  var labelingInfo: js.UndefOr[js.Array[LabelClassProperties]] = js.undefined
  
  /**
  		 * Indicates whether to display labels for the bins.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionBinning.html#labelsVisible)
  		 */
  var labelsVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Defines the maximum [view scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#scale) at which binning is enabled.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionBinning.html#maxScale)
  		 */
  var maxScale: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Indicates whether to display a popup when a user clicks or touches a bin.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionBinning.html#popupEnabled)
  		 */
  var popupEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) to apply to bins.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionBinning.html#popupTemplate)
  		 */
  var popupTemplate: js.UndefOr[PopupTemplateProperties] = js.undefined
  
  /**
  		 * The renderer used to style the bins.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionBinning.html#renderer)
  		 */
  var renderer: js.UndefOr[RendererProperties] = js.undefined
  
  /**
  		 * The feature reduction type.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionBinning.html#type)
  		 */
  var `type`: js.UndefOr[binning] = js.undefined
}
object FeatureReductionBinningProperties {
  
  inline def apply(): FeatureReductionBinningProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureReductionBinningProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureReductionBinningProperties] (val x: Self) extends AnyVal {
    
    inline def setFields(value: js.Array[AggregateFieldProperties]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: AggregateFieldProperties*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setFixedBinLevel(value: Double): Self = StObject.set(x, "fixedBinLevel", value.asInstanceOf[js.Any])
    
    inline def setFixedBinLevelUndefined: Self = StObject.set(x, "fixedBinLevel", js.undefined)
    
    inline def setLabelingInfo(value: js.Array[LabelClassProperties]): Self = StObject.set(x, "labelingInfo", value.asInstanceOf[js.Any])
    
    inline def setLabelingInfoUndefined: Self = StObject.set(x, "labelingInfo", js.undefined)
    
    inline def setLabelingInfoVarargs(value: LabelClassProperties*): Self = StObject.set(x, "labelingInfo", js.Array(value*))
    
    inline def setLabelsVisible(value: Boolean): Self = StObject.set(x, "labelsVisible", value.asInstanceOf[js.Any])
    
    inline def setLabelsVisibleUndefined: Self = StObject.set(x, "labelsVisible", js.undefined)
    
    inline def setMaxScale(value: Double): Self = StObject.set(x, "maxScale", value.asInstanceOf[js.Any])
    
    inline def setMaxScaleUndefined: Self = StObject.set(x, "maxScale", js.undefined)
    
    inline def setPopupEnabled(value: Boolean): Self = StObject.set(x, "popupEnabled", value.asInstanceOf[js.Any])
    
    inline def setPopupEnabledUndefined: Self = StObject.set(x, "popupEnabled", js.undefined)
    
    inline def setPopupTemplate(value: PopupTemplateProperties): Self = StObject.set(x, "popupTemplate", value.asInstanceOf[js.Any])
    
    inline def setPopupTemplateUndefined: Self = StObject.set(x, "popupTemplate", js.undefined)
    
    inline def setRenderer(value: RendererProperties): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    inline def setType(value: binning): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
