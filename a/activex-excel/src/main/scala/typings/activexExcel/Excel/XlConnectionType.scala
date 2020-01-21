package typings.activexExcel.Excel

import typings.activexExcel.activexExcelNumbers.`1`
import typings.activexExcel.activexExcelNumbers.`2`
import typings.activexExcel.activexExcelNumbers.`3`
import typings.activexExcel.activexExcelNumbers.`4`
import typings.activexExcel.activexExcelNumbers.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexExcel.activexExcelNumbers.`2`
  - typings.activexExcel.activexExcelNumbers.`1`
  - typings.activexExcel.activexExcelNumbers.`4`
  - typings.activexExcel.activexExcelNumbers.`5`
  - typings.activexExcel.activexExcelNumbers.`3`
*/
trait XlConnectionType extends js.Object

object XlConnectionType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def xlConnectionTypeODBC: `2` = this.cast(2)
  @scala.inline
  def xlConnectionTypeOLEDB: `1` = this.cast(1)
  @scala.inline
  def xlConnectionTypeTEXT: `4` = this.cast(4)
  @scala.inline
  def xlConnectionTypeWEB: `5` = this.cast(5)
  @scala.inline
  def xlConnectionTypeXMLMAP: `3` = this.cast(3)
}

