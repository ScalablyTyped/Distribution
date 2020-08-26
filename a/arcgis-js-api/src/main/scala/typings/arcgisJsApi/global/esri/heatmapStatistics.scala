package typings.arcgisJsApi.global.esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisJsApi.esri.HeatmapStatisticsResult
import typings.arcgisJsApi.esri.heatmapStatisticsHeatmapStatisticsParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.heatmapStatistics")
@js.native
object heatmapStatistics
  extends TopLevel[
      js.Function1[
        /* params */ heatmapStatisticsHeatmapStatisticsParams, 
        js.Promise[HeatmapStatisticsResult]
      ]
    ]

