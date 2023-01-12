package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.cluster
import typings.arcgisJsApi.esri.AggregateFieldProperties
import typings.arcgisJsApi.esri.LabelClassProperties
import typings.arcgisJsApi.esri.MarkerSymbolProperties
import typings.arcgisJsApi.esri.PopupTemplateProperties
import typings.arcgisJsApi.esri.RendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.FeatureReductionClusterProperties & {  type :'cluster'} */
trait FeatureReductionClusterPr extends StObject {
  
  /**
    * Defines the symbol size of the largest cluster in points (or pixels if specified).
    *
    * @default 37.5
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#clusterMaxSize)
    */
  var clusterMaxSize: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Defines the symbol size of the smallest cluster in points (or pixels if specified).
    *
    * @default 9
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#clusterMinSize)
    */
  var clusterMinSize: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Defines the radius in points (or pixels if specified) of the area in which multiple points will be grouped and visualized as a single cluster.
    *
    * @default 60
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#clusterRadius)
    */
  var clusterRadius: js.UndefOr[Double | String] = js.undefined
  
  /**
    * An array of aggregate fields that summarize layer [fields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#fields) from features contained within each cluster.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#fields)
    */
  var fields: js.UndefOr[js.Array[AggregateFieldProperties]] = js.undefined
  
  /**
    * Defines labels for clusters as an array of [LabelClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#labelingInfo)
    */
  var labelingInfo: js.UndefOr[js.Array[LabelClassProperties]] = js.undefined
  
  /**
    * Indicates whether to display labels for the clusters.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#labelsVisible)
    */
  var labelsVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to display the cluster popup.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#popupEnabled)
    */
  var popupEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) to apply to clustered graphics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#popupTemplate)
    */
  var popupTemplate: js.UndefOr[PopupTemplateProperties] = js.undefined
  
  /**
    * The renderer used to override the default style of the clusters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#renderer)
    */
  var renderer: js.UndefOr[RendererProperties] = js.undefined
  
  /**
    * A symbol used to override the default cluster style.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#symbol)
    */
  var symbol: js.UndefOr[MarkerSymbolProperties | CIMSymbolPropertiestypeci | WebStyleSymbolPropertiest] = js.undefined
  
  /**
    * The feature reduction type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#type)
    */
  var `type`: js.UndefOr[cluster] = js.undefined
}
object FeatureReductionClusterPr {
  
  inline def apply(): FeatureReductionClusterPr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureReductionClusterPr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureReductionClusterPr] (val x: Self) extends AnyVal {
    
    inline def setClusterMaxSize(value: Double | String): Self = StObject.set(x, "clusterMaxSize", value.asInstanceOf[js.Any])
    
    inline def setClusterMaxSizeUndefined: Self = StObject.set(x, "clusterMaxSize", js.undefined)
    
    inline def setClusterMinSize(value: Double | String): Self = StObject.set(x, "clusterMinSize", value.asInstanceOf[js.Any])
    
    inline def setClusterMinSizeUndefined: Self = StObject.set(x, "clusterMinSize", js.undefined)
    
    inline def setClusterRadius(value: Double | String): Self = StObject.set(x, "clusterRadius", value.asInstanceOf[js.Any])
    
    inline def setClusterRadiusUndefined: Self = StObject.set(x, "clusterRadius", js.undefined)
    
    inline def setFields(value: js.Array[AggregateFieldProperties]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: AggregateFieldProperties*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setLabelingInfo(value: js.Array[LabelClassProperties]): Self = StObject.set(x, "labelingInfo", value.asInstanceOf[js.Any])
    
    inline def setLabelingInfoUndefined: Self = StObject.set(x, "labelingInfo", js.undefined)
    
    inline def setLabelingInfoVarargs(value: LabelClassProperties*): Self = StObject.set(x, "labelingInfo", js.Array(value*))
    
    inline def setLabelsVisible(value: Boolean): Self = StObject.set(x, "labelsVisible", value.asInstanceOf[js.Any])
    
    inline def setLabelsVisibleUndefined: Self = StObject.set(x, "labelsVisible", js.undefined)
    
    inline def setPopupEnabled(value: Boolean): Self = StObject.set(x, "popupEnabled", value.asInstanceOf[js.Any])
    
    inline def setPopupEnabledUndefined: Self = StObject.set(x, "popupEnabled", js.undefined)
    
    inline def setPopupTemplate(value: PopupTemplateProperties): Self = StObject.set(x, "popupTemplate", value.asInstanceOf[js.Any])
    
    inline def setPopupTemplateUndefined: Self = StObject.set(x, "popupTemplate", js.undefined)
    
    inline def setRenderer(value: RendererProperties): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    inline def setSymbol(value: MarkerSymbolProperties | CIMSymbolPropertiestypeci | WebStyleSymbolPropertiest): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    inline def setType(value: cluster): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
