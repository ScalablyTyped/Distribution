package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This object contains helper methods for generating popup templates to be set on a layer's [FeatureReductionCluster](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#popupTemplate). The suggested popup templates will include summary information about features in the cluster based on the layer's renderer. For example, in a layer visualizing population, the cluster popup template will include the number of features in the cluster and the average population of features in the cluster.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-popup-clusters.html)
  */
@js.native
trait popupClusters extends js.Object {
  /**
    * Returns one or more suggested default [popupTemplates](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) for a given layer's [FeatureReductionCluster](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#popupTemplate) configuration. The cluster popup will contain  information describing features in the cluster, including the number of features in the cluster and summary statistics based on fields and expressions used in the layer's renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-popup-clusters.html#getTemplates)
    *
    * @param params See the table below for details of each parameter that may be passed to this function.
    * @param params.layer The point layer that is or will be clustered.
    * @param params.renderer Specify the renderer to be used on the layer when `featureReduction` is enabled if it will be different than the renderer already set on the layer.
    *
    */
  def getTemplates(params: clustersGetTemplatesParams): js.Promise[Templates_] = js.native
}

object popupClusters {
  @scala.inline
  def apply(getTemplates: clustersGetTemplatesParams => js.Promise[Templates_]): popupClusters = {
    val __obj = js.Dynamic.literal(getTemplates = js.Any.fromFunction1(getTemplates))
    __obj.asInstanceOf[popupClusters]
  }
  @scala.inline
  implicit class popupClustersOps[Self <: popupClusters] (val x: Self) extends AnyVal {
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
    def setGetTemplates(value: clustersGetTemplatesParams => js.Promise[Templates_]): Self = this.set("getTemplates", js.Any.fromFunction1(value))
  }
  
}

