package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.FeatureReductionClusterProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.FeatureReductionCluster")
@js.native
/**
  * This class configures clustering as a means of reducing and summarizing point features in a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html), [GeoJSONLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html) or [OGCFeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html). This feature reduction method spatially groups points into _clusters_ based on an area of influence, or [clusterRadius](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#clusterRadius). The size of each cluster is proportional to the number of features within the cluster.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html)
  */
class FeatureReductionClusterCls ()
  extends typings.arcgisJsApi.esri.FeatureReductionCluster {
  def this(properties: FeatureReductionClusterProperties) = this()
}

