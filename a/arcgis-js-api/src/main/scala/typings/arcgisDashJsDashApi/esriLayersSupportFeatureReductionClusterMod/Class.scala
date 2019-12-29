package typings.arcgisDashJsDashApi.esriLayersSupportFeatureReductionClusterMod

import typings.arcgisDashJsDashApi.__esri.FeatureReductionCluster
import typings.arcgisDashJsDashApi.__esri.FeatureReductionClusterProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/layers/support/FeatureReductionCluster", JSImport.Namespace)
@js.native
/**
  * This class configures clustering as a means of reducing and summarizing point features in a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html), or [GeoJSONLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html). This feature reduction method spatially groups points into _clusters_ based on an area of influence, or [clusterRadius](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#clusterRadius). The size of each cluster is proportional to the number of features within the cluster.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html)
  */
class Class () extends FeatureReductionCluster {
  def this(properties: FeatureReductionClusterProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#using-fromjson) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

