package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartAxisTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.chart.ChartAxisType.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait AUTOMATIC
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartAxisTypeNs.Constants
  
  @js.native
  sealed trait CATEGORY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartAxisTypeNs.Constants
  
  @js.native
  sealed trait DATE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartAxisTypeNs.Constants
  
  /* 0 */ val AUTOMATIC: AUTOMATIC with scala.Double = js.native
  /* 1 */ val CATEGORY: CATEGORY with scala.Double = js.native
  /* 2 */ val DATE: DATE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartAxisTypeNs.Constants with scala.Double
  ] = js.native
}

