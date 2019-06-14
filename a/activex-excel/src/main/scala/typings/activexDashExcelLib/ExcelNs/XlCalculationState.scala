package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - activexDashExcelLib.activexDashExcelLibNumbers.`1`
  - activexDashExcelLib.activexDashExcelLibNumbers.`0`
  - activexDashExcelLib.activexDashExcelLibNumbers.`2`
*/
trait XlCalculationState extends js.Object

object XlCalculationState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def xlCalculating: activexDashExcelLib.activexDashExcelLibNumbers.`1` = this.cast(1)
  @scala.inline
  def xlDone: activexDashExcelLib.activexDashExcelLibNumbers.`0` = this.cast(0)
  @scala.inline
  def xlPending: activexDashExcelLib.activexDashExcelLibNumbers.`2` = this.cast(2)
}

