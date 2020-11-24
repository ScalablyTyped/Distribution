package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object contains a helper method for generating default labels to be set on a layer's [cluster configuration](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#labelingInfo).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-labels-clusters.html)
  */
@js.native
trait clusters extends js.Object {
  
  /**
    * Generates default [labelingInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#labelingInfo) schemes to be set on a FeatureLayer's [featureReduction](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#featureReduction) configuration.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-labels-clusters.html#getLabelSchemes)
    */
  def getLabelSchemes(params: clustersGetLabelSchemesParams): js.Promise[Schemes] = js.native
}
object clusters {
  
  @scala.inline
  def apply(getLabelSchemes: clustersGetLabelSchemesParams => js.Promise[Schemes]): clusters = {
    val __obj = js.Dynamic.literal(getLabelSchemes = js.Any.fromFunction1(getLabelSchemes))
    __obj.asInstanceOf[clusters]
  }
  
  @scala.inline
  implicit class clustersOps[Self <: clusters] (val x: Self) extends AnyVal {
    
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
    def setGetLabelSchemes(value: clustersGetLabelSchemesParams => js.Promise[Schemes]): Self = this.set("getLabelSchemes", js.Any.fromFunction1(value))
  }
}
