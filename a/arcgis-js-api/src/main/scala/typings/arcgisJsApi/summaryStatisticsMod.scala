package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SummaryStatisticsResult
import typings.arcgisJsApi.esri.summaryStatisticsSummaryStatisticsParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object summaryStatisticsMod extends Shortcut {
  
  @JSImport("esri/smartMapping/statistics/summaryStatistics", JSImport.Namespace)
  @js.native
  val ^ : js.Function1[
    /* params */ summaryStatisticsSummaryStatisticsParams, 
    js.Promise[SummaryStatisticsResult]
  ] = js.native
  
  type _To = js.Function1[
    /* params */ summaryStatisticsSummaryStatisticsParams, 
    js.Promise[SummaryStatisticsResult]
  ]
  
  /* This means you don't have to write `^`, but can instead just say `summaryStatisticsMod.foo` */
  override def _to: js.Function1[
    /* params */ summaryStatisticsSummaryStatisticsParams, 
    js.Promise[SummaryStatisticsResult]
  ] = ^
}
