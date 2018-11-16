package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpChartUnitEffect extends js.Object

@JSGlobal("PowerPoint.PpChartUnitEffect")
@js.native
object PpChartUnitEffect extends js.Object {
  @js.native
  sealed trait ppAnimateByCategory
    extends activexDashPowerpointLib.PowerPointNs.PpChartUnitEffect
  
  @js.native
  sealed trait ppAnimateByCategoryElements
    extends activexDashPowerpointLib.PowerPointNs.PpChartUnitEffect
  
  @js.native
  sealed trait ppAnimateBySeries
    extends activexDashPowerpointLib.PowerPointNs.PpChartUnitEffect
  
  @js.native
  sealed trait ppAnimateBySeriesElements
    extends activexDashPowerpointLib.PowerPointNs.PpChartUnitEffect
  
  @js.native
  sealed trait ppAnimateChartAllAtOnce
    extends activexDashPowerpointLib.PowerPointNs.PpChartUnitEffect
  
  @js.native
  sealed trait ppAnimateChartMixed
    extends activexDashPowerpointLib.PowerPointNs.PpChartUnitEffect
  
  /* 2 */ val ppAnimateByCategory: ppAnimateByCategory with scala.Double = js.native
  /* 4 */ val ppAnimateByCategoryElements: ppAnimateByCategoryElements with scala.Double = js.native
  /* 1 */ val ppAnimateBySeries: ppAnimateBySeries with scala.Double = js.native
  /* 3 */ val ppAnimateBySeriesElements: ppAnimateBySeriesElements with scala.Double = js.native
  /* 5 */ val ppAnimateChartAllAtOnce: ppAnimateChartAllAtOnce with scala.Double = js.native
  /* -2 */ val ppAnimateChartMixed: ppAnimateChartMixed with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpChartUnitEffect with scala.Double] = js.native
}

