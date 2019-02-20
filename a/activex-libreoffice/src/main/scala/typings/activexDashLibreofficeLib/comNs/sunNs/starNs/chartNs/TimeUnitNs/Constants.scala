package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.TimeUnitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.chart.TimeUnit.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait DAY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.TimeUnitNs.Constants
  
  @js.native
  sealed trait MONTH
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.TimeUnitNs.Constants
  
  @js.native
  sealed trait YEAR
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.TimeUnitNs.Constants
  
  /* 0 */ val DAY: DAY with scala.Double = js.native
  /* 1 */ val MONTH: MONTH with scala.Double = js.native
  /* 2 */ val YEAR: YEAR with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.TimeUnitNs.Constants with scala.Double
  ] = js.native
}

