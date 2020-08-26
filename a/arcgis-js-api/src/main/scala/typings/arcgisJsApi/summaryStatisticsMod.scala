package typings.arcgisJsApi

import org.scalablytyped.runtime.TopLevel
import typings.arcgisJsApi.esri.SummaryStatisticsResult
import typings.arcgisJsApi.esri.summaryStatisticsSummaryStatisticsParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/smartMapping/statistics/summaryStatistics", JSImport.Namespace)
@js.native
object summaryStatisticsMod
  extends TopLevel[
      js.Function1[
        /* params */ summaryStatisticsSummaryStatisticsParams, 
        js.Promise[SummaryStatisticsResult]
      ]
    ]

