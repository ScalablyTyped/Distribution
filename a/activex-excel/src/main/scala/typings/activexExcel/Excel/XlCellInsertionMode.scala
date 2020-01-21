package typings.activexExcel.Excel

import typings.activexExcel.activexExcelNumbers.`0`
import typings.activexExcel.activexExcelNumbers.`1`
import typings.activexExcel.activexExcelNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexExcel.activexExcelNumbers.`1`
  - typings.activexExcel.activexExcelNumbers.`2`
  - typings.activexExcel.activexExcelNumbers.`0`
*/
trait XlCellInsertionMode extends js.Object

object XlCellInsertionMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def xlInsertDeleteCells: `1` = this.cast(1)
  @scala.inline
  def xlInsertEntireRows: `2` = this.cast(2)
  @scala.inline
  def xlOverwriteCells: `0` = this.cast(0)
}

