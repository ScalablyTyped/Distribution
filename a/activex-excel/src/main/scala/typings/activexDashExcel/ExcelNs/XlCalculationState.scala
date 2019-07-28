package typings.activexDashExcel.ExcelNs

import typings.activexDashExcel.activexDashExcelNumbers.`0`
import typings.activexDashExcel.activexDashExcelNumbers.`1`
import typings.activexDashExcel.activexDashExcelNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexDashExcel.activexDashExcelNumbers.`1`
  - typings.activexDashExcel.activexDashExcelNumbers.`0`
  - typings.activexDashExcel.activexDashExcelNumbers.`2`
*/
trait XlCalculationState extends js.Object

object XlCalculationState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def xlCalculating: `1` = this.cast(1)
  @scala.inline
  def xlDone: `0` = this.cast(0)
  @scala.inline
  def xlPending: `2` = this.cast(2)
}

