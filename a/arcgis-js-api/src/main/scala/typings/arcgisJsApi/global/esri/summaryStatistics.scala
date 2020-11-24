package typings.arcgisJsApi.global.esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisJsApi.esri.SummaryStatisticsResult
import typings.arcgisJsApi.esri.summaryStatisticsSummaryStatisticsParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.summaryStatistics")
@js.native
object summaryStatistics
  extends TopLevel[
      js.Function1[
        /* params */ summaryStatisticsSummaryStatisticsParams, 
        js.Promise[SummaryStatisticsResult]
      ]
    ]
