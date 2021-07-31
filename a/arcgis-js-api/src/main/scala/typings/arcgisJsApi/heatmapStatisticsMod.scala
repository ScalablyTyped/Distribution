package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.HeatmapStatisticsResult
import typings.arcgisJsApi.esri.heatmapStatisticsHeatmapStatisticsParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object heatmapStatisticsMod extends Shortcut {
  
  @JSImport("esri/smartMapping/statistics/heatmapStatistics", JSImport.Namespace)
  @js.native
  val ^ : js.Function1[
    /* params */ heatmapStatisticsHeatmapStatisticsParams, 
    js.Promise[HeatmapStatisticsResult]
  ] = js.native
  
  type _To = js.Function1[
    /* params */ heatmapStatisticsHeatmapStatisticsParams, 
    js.Promise[HeatmapStatisticsResult]
  ]
  
  /* This means you don't have to write `^`, but can instead just say `heatmapStatisticsMod.foo` */
  override def _to: js.Function1[
    /* params */ heatmapStatisticsHeatmapStatisticsParams, 
    js.Promise[HeatmapStatisticsResult]
  ] = ^
}
