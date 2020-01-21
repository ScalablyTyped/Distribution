package typings.activexExcel.Excel

import typings.activexExcel.activexExcelNumbers.`1`
import typings.activexExcel.activexExcelNumbers.`2`
import typings.activexExcel.activexExcelNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexExcel.activexExcelNumbers.`1`
  - typings.activexExcel.activexExcelNumbers.`3`
  - typings.activexExcel.activexExcelNumbers.`2`
*/
trait XlPlatform extends js.Object

object XlPlatform {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def xlMSDOS: `3` = this.cast(3)
  @scala.inline
  def xlMacintosh: `1` = this.cast(1)
  @scala.inline
  def xlWindows: `2` = this.cast(2)
}

