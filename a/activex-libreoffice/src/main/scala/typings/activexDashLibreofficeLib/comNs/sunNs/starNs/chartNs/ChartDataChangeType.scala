package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the type of change that was applied to the data. */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
*/
trait ChartDataChangeType extends js.Object

object ChartDataChangeType {
  /** Major changes were applied to the data. */
  @scala.inline
  def ALL: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  /** The column given in the {@link ChartDataChangeEvent} , was deleted. */
  @scala.inline
  def COLUMN_DELETED: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4` = this.cast(4)
  /** The column given in the {@link ChartDataChangeEvent} , was inserted. */
  @scala.inline
  def COLUMN_INSERTED: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  /** The range of columns and rows, given in the {@link ChartDataChangeEvent} , has changed. */
  @scala.inline
  def DATA_RANGE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /** The row given in the {@link ChartDataChangeEvent} , was deleted. */
  @scala.inline
  def ROW_DELETED: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5` = this.cast(5)
  /** The row given in the {@link ChartDataChangeEvent} , was inserted. */
  @scala.inline
  def ROW_INSERTED: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

