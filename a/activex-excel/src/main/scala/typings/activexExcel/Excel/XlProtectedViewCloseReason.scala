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
trait XlProtectedViewCloseReason extends js.Object

object XlProtectedViewCloseReason {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def xlProtectedViewCloseEdit: `1` = this.cast(1)
  @scala.inline
  def xlProtectedViewCloseForced: `2` = this.cast(2)
  @scala.inline
  def xlProtectedViewCloseNormal: `0` = this.cast(0)
}

