package typings.activexExcel.Excel

import typings.activexExcel.activexExcelNumbers.`1`
import typings.activexExcel.activexExcelNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexExcel.activexExcelNumbers.`2`
  - typings.activexExcel.activexExcelNumbers.`1`
*/
trait XlSaveAction extends js.Object

object XlSaveAction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def xlDoNotSaveChanges: `2` = this.cast(2)
  @scala.inline
  def xlSaveChanges: `1` = this.cast(1)
}

