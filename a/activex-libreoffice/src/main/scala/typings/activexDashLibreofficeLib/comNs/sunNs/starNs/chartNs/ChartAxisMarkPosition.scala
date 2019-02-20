package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartAxisMarkPosition extends js.Object

/** Specifies the position of the axis interval marks. */
@JSGlobal("com.sun.star.chart.ChartAxisMarkPosition")
@js.native
object ChartAxisMarkPosition extends js.Object {
  /**
    * The interval marks are drawn at the axis line. This makes a difference to "AT_LABELS" only when the labels are not placed near the axis (
    * @see ChartAxisLabelPosition).
    */
  @js.native
  sealed trait AT_AXIS
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartAxisMarkPosition
  
  /** The interval marks are drawn besides the axis labels. */
  @js.native
  sealed trait AT_LABELS
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartAxisMarkPosition
  
  /**
    * Interval marks are drawn at the axis line and also besides the axis labels. This makes a difference to "AT_LABELS" only when the labels are not placed
    * near the axis (
    * @see ChartAxisLabelPosition).
    */
  @js.native
  sealed trait AT_LABELS_AND_AXIS
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartAxisMarkPosition
  
  /* 1 */ val AT_AXIS: AT_AXIS with scala.Double = js.native
  /* 0 */ val AT_LABELS: AT_LABELS with scala.Double = js.native
  /* 2 */ val AT_LABELS_AND_AXIS: AT_LABELS_AND_AXIS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartAxisMarkPosition with scala.Double
  ] = js.native
}

