package typings.arcgisJsApi

import org.scalablytyped.runtime.TopLevel
import typings.arcgisJsApi.esri.HeatmapStatisticsResult
import typings.arcgisJsApi.esri.heatmapStatisticsHeatmapStatisticsParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/smartMapping/statistics/heatmapStatistics", JSImport.Namespace)
@js.native
object heatmapStatisticsMod
  extends TopLevel[
      js.Function1[
        /* params */ heatmapStatisticsHeatmapStatisticsParams, 
        js.Promise[HeatmapStatisticsResult]
      ]
    ]

