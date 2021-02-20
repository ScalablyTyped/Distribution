package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SummaryStatisticsResult
import typings.arcgisJsApi.esri.summaryStatisticsForAgeSummaryStatisticsForAgeParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object summaryStatisticsForAgeMod extends Shortcut {
  
  @JSImport("esri/smartMapping/statistics/summaryStatisticsForAge", JSImport.Namespace)
  @js.native
  val ^ : js.Function1[
    /* params */ summaryStatisticsForAgeSummaryStatisticsForAgeParams, 
    js.Promise[SummaryStatisticsResult]
  ] = js.native
  
  type _To = js.Function1[
    /* params */ summaryStatisticsForAgeSummaryStatisticsForAgeParams, 
    js.Promise[SummaryStatisticsResult]
  ]
  
  /* This means you don't have to write `^`, but can instead just say `summaryStatisticsForAgeMod.foo` */
  override def _to: js.Function1[
    /* params */ summaryStatisticsForAgeSummaryStatisticsForAgeParams, 
    js.Promise[SummaryStatisticsResult]
  ] = ^
}
