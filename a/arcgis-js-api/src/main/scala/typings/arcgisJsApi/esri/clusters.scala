package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This object contains a helper method for generating default labels to be set on a layer's [cluster configuration](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#labelingInfo). The default label is based on the layer's renderer. In most cases the default label configuration will be the total number of features in the cluster. This value will be rounded and formatted (e.g. instead of `2385`, the cluster label will display `2.4k`). In some cases, such as renderers with a [SizeVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html), the default label will display the average value of the attribute represented by the size variable.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-labels-clusters.html)
  */
@js.native
trait clusters extends js.Object {
  /**
    * Generates default [labelingInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#labelingInfo) schemes to be set on a FeatureLayer's [featureReduction](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#featureReduction) configuration. Returns one or more suggested LabelClasses for a given layer based on its renderer. It also returns a suggested [clusterMinSize](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#clusterMinSize) to ensure labels fit inside clusters.  If a renderer has a non-scale dependent [SizeVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html), then the average value of the field or expression used to determine the cluster size will be suggested as the default label value. In all other scenarios, the suggested label will display the cluster count in the center of the label.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-labels-clusters.html#getLabelSchemes)
    *
    * @param params See the table below for details of each parameter that may be passed to this function.
    * @param params.layer The point layer that has or will have clustering enabled.
    * @param params.renderer The renderer to set on the input layer when clustering is enabled. Specify this parameter if the layer's renderer does not match the renderer that will be used when clustering is enabled. This cannot be a [HeatmapRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html).
    * @param params.view The view where the input layer will be rendered.
    *
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

