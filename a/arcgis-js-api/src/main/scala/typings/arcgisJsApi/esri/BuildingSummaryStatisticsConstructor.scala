package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildingSummaryStatisticsConstructor
  extends /**
  * Contains statistics about the fields in all sublayers of a [BuildingSceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html). The statistics contain the most frequent values in that layer, minimum and maximum values in case they are numeric and the sublayers where the field is available.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingSummaryStatistics.html)
  */
Instantiable0[BuildingSummaryStatistics]
     with Instantiable1[/* properties */ BuildingSummaryStatisticsProperties, BuildingSummaryStatistics] {
  def fromJSON(json: js.Any): BuildingSummaryStatistics = js.native
}

