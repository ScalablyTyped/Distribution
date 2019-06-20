package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the position of the axis on the scale of the crossing axis. When the property is set at a x-axis it indicates a position on the scale of the
  * primary y-axis. When the property is set at a y-axis it indicates a position on the scale of the primary x-axis.
  */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
*/
trait ChartAxisPosition extends js.Object

object ChartAxisPosition {
  /** Cross the other axes at their maximum scale value. */
  @scala.inline
  def END: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  /** Cross the other axes at their minimum scale value. */
  @scala.inline
  def START: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /** Cross the other axes at the value specified in the property CrossoverValue. */
  @scala.inline
  def VALUE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  /** Cross the other axes at zero. If zero is not contained in the current scale the value is used which is nearest to zero. */
  @scala.inline
  def ZERO: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

