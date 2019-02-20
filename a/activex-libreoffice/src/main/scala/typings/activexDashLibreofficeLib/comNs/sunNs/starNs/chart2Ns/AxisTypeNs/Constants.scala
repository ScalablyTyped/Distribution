package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.AxisTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.chart2.AxisType.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait CATEGORY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.AxisTypeNs.Constants
  
  @js.native
  sealed trait DATE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.AxisTypeNs.Constants
  
  @js.native
  sealed trait PERCENT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.AxisTypeNs.Constants
  
  @js.native
  sealed trait REALNUMBER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.AxisTypeNs.Constants
  
  @js.native
  sealed trait SERIES
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.AxisTypeNs.Constants
  
  /* 2 */ val CATEGORY: CATEGORY with scala.Double = js.native
  /* 4 */ val DATE: DATE with scala.Double = js.native
  /* 1 */ val PERCENT: PERCENT with scala.Double = js.native
  /* 0 */ val REALNUMBER: REALNUMBER with scala.Double = js.native
  /* 3 */ val SERIES: SERIES with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.AxisTypeNs.Constants with scala.Double
  ] = js.native
}

