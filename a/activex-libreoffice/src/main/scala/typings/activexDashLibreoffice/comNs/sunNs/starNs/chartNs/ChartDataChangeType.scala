package typings.activexDashLibreoffice.comNs.sunNs.starNs.chartNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the type of change that was applied to the data. */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`5`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
*/
trait ChartDataChangeType extends js.Object

object ChartDataChangeType {
  /** Major changes were applied to the data. */
  @scala.inline
  def ALL: `0` = this.cast(0)
  /** The column given in the {@link ChartDataChangeEvent} , was deleted. */
  @scala.inline
  def COLUMN_DELETED: `4` = this.cast(4)
  /** The column given in the {@link ChartDataChangeEvent} , was inserted. */
  @scala.inline
  def COLUMN_INSERTED: `2` = this.cast(2)
  /** The range of columns and rows, given in the {@link ChartDataChangeEvent} , has changed. */
  @scala.inline
  def DATA_RANGE: `1` = this.cast(1)
  /** The row given in the {@link ChartDataChangeEvent} , was deleted. */
  @scala.inline
  def ROW_DELETED: `5` = this.cast(5)
  /** The row given in the {@link ChartDataChangeEvent} , was inserted. */
  @scala.inline
  def ROW_INSERTED: `3` = this.cast(3)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

