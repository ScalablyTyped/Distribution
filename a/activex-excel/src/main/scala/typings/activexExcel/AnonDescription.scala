package typings.activexExcel

import typings.activexExcel.Excel.Workbook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescription extends js.Object {
  val Description: String
  val Sheet: String
  val Success: Boolean
  val Wb: Workbook
}

object AnonDescription {
  @scala.inline
  def apply(Description: String, Sheet: String, Success: Boolean, Wb: Workbook): AnonDescription = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Sheet = Sheet.asInstanceOf[js.Any], Success = Success.asInstanceOf[js.Any], Wb = Wb.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescription]
  }
}

