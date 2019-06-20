package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies the position of the axis labels with respect to the axis on the scale of the crossing axis. */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
*/
trait ChartAxisLabelPosition extends js.Object

object ChartAxisLabelPosition {
  /**
    * The labels are placed adjacent to the axis. When the axis itself is placed at the minimum or maximum of the scale ( that is when the property
    * CrossoverPosition equals ChartAxisPosition_MINIMUM or ChartAxisPosition_MAXIMUM) the labels are placed outside the coordinate system. Otherwise the
    * labels are placed adjacent to the axis on that side that belongs to the lower values on the crossing axis. E.g. when the ChartAxisLabelPosition is set
    * to NEAR_AXIS for an y axis the labels are placed adjacent to the y axis on that side that belongs to the lower x values.
    */
  @scala.inline
  def NEAR_AXIS: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  /** The labels are placed adjacent to the axis on the opposite side as for NEAR_AXIS. */
  @scala.inline
  def NEAR_AXIS_OTHER_SIDE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /**
    * The labels are placed outside the coordinate region on that side where the crossing axis has its maximum value. E.g. when this is set for an y axis
    * the labels are placed outside the diagram on that side where to the x axis has its maximum value.
    */
  @scala.inline
  def OUTSIDE_END: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  /**
    * The labels are placed outside the coordinate region on that side where the crossing axis has its minimum value. E.g. when this is set for an y axis
    * the labels are placed outside the diagram on that side where to the x axis has its minimum value.
    */
  @scala.inline
  def OUTSIDE_START: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

