package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.MissingValueTreatmentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.chart.MissingValueTreatment.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait CONTINUE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.MissingValueTreatmentNs.Constants
  
  @js.native
  sealed trait LEAVE_GAP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.MissingValueTreatmentNs.Constants
  
  @js.native
  sealed trait USE_ZERO
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.MissingValueTreatmentNs.Constants
  
  /* 2 */ val CONTINUE: CONTINUE with scala.Double = js.native
  /* 0 */ val LEAVE_GAP: LEAVE_GAP with scala.Double = js.native
  /* 1 */ val USE_ZERO: USE_ZERO with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.MissingValueTreatmentNs.Constants with scala.Double
  ] = js.native
}

