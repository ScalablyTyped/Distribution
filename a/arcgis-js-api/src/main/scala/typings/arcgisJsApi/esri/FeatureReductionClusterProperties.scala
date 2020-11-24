package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.cluster
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureReductionClusterProperties extends js.Object {
  
  /**
    * Defines the symbol size of the largest cluster in points (or pixels if specified).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#clusterMaxSize)
    */
  var clusterMaxSize: js.UndefOr[Double | String] = js.native
  
  /**
    * Defines the symbol size of the smallest cluster in points (or pixels if specified).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#clusterMinSize)
    */
  var clusterMinSize: js.UndefOr[Double | String] = js.native
  
  /**
    * Defines the radius in points (or pixels if specified) of each area in which multiple points will be grouped and visualized as a single cluster.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#clusterRadius)
    */
  var clusterRadius: js.UndefOr[Double | String] = js.native
  
  /**
    * Defines labels for clusters as an array of [LabelClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#labelingInfo)
    */
  var labelingInfo: js.UndefOr[js.Array[LabelClassProperties]] = js.native
  
  /**
    * Indicates whether to display labels for the clusters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#labelsVisible)
    */
  var labelsVisible: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether to display the cluster popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#popupEnabled)
    */
  var popupEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) to apply to clustered graphics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#popupTemplate)
    */
  var popupTemplate: js.UndefOr[PopupTemplateProperties] = js.native
  
  /**
    * The feature reduction type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#type)
    */
  var `type`: js.UndefOr[cluster] = js.native
}
object FeatureReductionClusterProperties {
  
  @scala.inline
  def apply(): FeatureReductionClusterProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureReductionClusterProperties]
  }
  
  @scala.inline
  implicit class FeatureReductionClusterPropertiesOps[Self <: FeatureReductionClusterProperties] (val x: Self) extends AnyVal {
    
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
    def setClusterMaxSize(value: Double | String): Self = this.set("clusterMaxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterMaxSize: Self = this.set("clusterMaxSize", js.undefined)
    
    @scala.inline
    def setClusterMinSize(value: Double | String): Self = this.set("clusterMinSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterMinSize: Self = this.set("clusterMinSize", js.undefined)
    
    @scala.inline
    def setClusterRadius(value: Double | String): Self = this.set("clusterRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterRadius: Self = this.set("clusterRadius", js.undefined)
    
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
    def setPopupEnabled(value: Boolean): Self = this.set("popupEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupEnabled: Self = this.set("popupEnabled", js.undefined)
    
    @scala.inline
    def setPopupTemplate(value: PopupTemplateProperties): Self = this.set("popupTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupTemplate: Self = this.set("popupTemplate", js.undefined)
    
    @scala.inline
    def setType(value: cluster): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
