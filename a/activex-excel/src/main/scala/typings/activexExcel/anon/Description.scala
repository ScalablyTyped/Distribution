package typings.activexExcel.anon

import typings.activexExcel.Excel.Workbook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Description extends js.Object {
  val Description: String
  val Sheet: String
  val Success: Boolean
  val Wb: Workbook
}

object Description {
  @scala.inline
  def apply(Description: String, Sheet: String, Success: Boolean, Wb: Workbook): Description = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Sheet = Sheet.asInstanceOf[js.Any], Success = Success.asInstanceOf[js.Any], Wb = Wb.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
}

