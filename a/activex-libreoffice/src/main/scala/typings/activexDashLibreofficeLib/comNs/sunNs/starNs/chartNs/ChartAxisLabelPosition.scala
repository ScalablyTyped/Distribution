package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartAxisLabelPosition extends js.Object

/** Specifies the position of the axis labels with respect to the axis on the scale of the crossing axis. */
@JSGlobal("com.sun.star.chart.ChartAxisLabelPosition")
@js.native
object ChartAxisLabelPosition extends js.Object {
  /**
    * The labels are placed adjacent to the axis. When the axis itself is placed at the minimum or maximum of the scale ( that is when the property
    * CrossoverPosition equals ChartAxisPosition_MINIMUM or ChartAxisPosition_MAXIMUM) the labels are placed outside the coordinate system. Otherwise the
    * labels are placed adjacent to the axis on that side that belongs to the lower values on the crossing axis. E.g. when the ChartAxisLabelPosition is set
    * to NEAR_AXIS for an y axis the labels are placed adjacent to the y axis on that side that belongs to the lower x values.
    */
  @js.native
  sealed trait NEAR_AXIS
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartAxisLabelPosition
  
  /** The labels are placed adjacent to the axis on the opposite side as for NEAR_AXIS. */
  @js.native
  sealed trait NEAR_AXIS_OTHER_SIDE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartAxisLabelPosition
  
  /**
    * The labels are placed outside the coordinate region on that side where the crossing axis has its maximum value. E.g. when this is set for an y axis
    * the labels are placed outside the diagram on that side where to the x axis has its maximum value.
    */
  @js.native
  sealed trait OUTSIDE_END
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartAxisLabelPosition
  
  /**
    * The labels are placed outside the coordinate region on that side where the crossing axis has its minimum value. E.g. when this is set for an y axis
    * the labels are placed outside the diagram on that side where to the x axis has its minimum value.
    */
  @js.native
  sealed trait OUTSIDE_START
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartAxisLabelPosition
  
  /* 0 */ val NEAR_AXIS: NEAR_AXIS with scala.Double = js.native
  /* 1 */ val NEAR_AXIS_OTHER_SIDE: NEAR_AXIS_OTHER_SIDE with scala.Double = js.native
  /* 3 */ val OUTSIDE_END: OUTSIDE_END with scala.Double = js.native
  /* 2 */ val OUTSIDE_START: OUTSIDE_START with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartAxisLabelPosition with scala.Double
  ] = js.native
}

