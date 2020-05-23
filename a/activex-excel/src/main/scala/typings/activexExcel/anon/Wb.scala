package typings.activexExcel.anon

import typings.activexExcel.Excel.Workbook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Wb extends js.Object {
  val Wb: Workbook
}

object Wb {
  @scala.inline
  def apply(Wb: Workbook): Wb = {
    val __obj = js.Dynamic.literal(Wb = Wb.asInstanceOf[js.Any])
    __obj.asInstanceOf[Wb]
  }
}

