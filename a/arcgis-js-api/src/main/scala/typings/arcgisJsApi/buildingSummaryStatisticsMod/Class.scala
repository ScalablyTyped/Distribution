package typings.arcgisJsApi.buildingSummaryStatisticsMod

import typings.arcgisJsApi.esri.BuildingSummaryStatistics
import typings.arcgisJsApi.esri.BuildingSummaryStatisticsProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/layers/support/BuildingSummaryStatistics", JSImport.Namespace)
@js.native
/**
  * Contains statistics about the fields in all sublayers of a [BuildingSceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html). The statistics contain the most frequent values in that layer, minimum and maximum values in case they are numeric and the sublayers where the field is available.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingSummaryStatistics.html)
  */
class Class () extends BuildingSummaryStatistics {
  def this(properties: BuildingSummaryStatisticsProperties) = this()
}

