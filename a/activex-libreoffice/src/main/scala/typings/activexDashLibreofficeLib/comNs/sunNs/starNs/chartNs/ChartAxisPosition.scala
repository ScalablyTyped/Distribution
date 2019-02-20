package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartAxisPosition extends js.Object

/**
  * Specifies the position of the axis on the scale of the crossing axis. When the property is set at a x-axis it indicates a position on the scale of the
  * primary y-axis. When the property is set at a y-axis it indicates a position on the scale of the primary x-axis.
  */
@JSGlobal("com.sun.star.chart.ChartAxisPosition")
@js.native
object ChartAxisPosition extends js.Object {
  /** Cross the other axes at their maximum scale value. */
  @js.native
  sealed trait END
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartAxisPosition
  
  /** Cross the other axes at their minimum scale value. */
  @js.native
  sealed trait START
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartAxisPosition
  
  /** Cross the other axes at the value specified in the property CrossoverValue. */
  @js.native
  sealed trait VALUE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartAxisPosition
  
  /** Cross the other axes at zero. If zero is not contained in the current scale the value is used which is nearest to zero. */
  @js.native
  sealed trait ZERO
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartAxisPosition
  
  /* 2 */ val END: END with scala.Double = js.native
  /* 1 */ val START: START with scala.Double = js.native
  /* 3 */ val VALUE: VALUE with scala.Double = js.native
  /* 0 */ val ZERO: ZERO with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartAxisPosition with scala.Double
  ] = js.native
}

