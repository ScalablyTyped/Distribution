package typings.activexExcel

import typings.activexExcel.Excel.Workbook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSaveAsUI extends js.Object {
  var Cancel: Boolean
  val SaveAsUI: Boolean
  val Wb: Workbook
}

object AnonSaveAsUI {
  @scala.inline
  def apply(Cancel: Boolean, SaveAsUI: Boolean, Wb: Workbook): AnonSaveAsUI = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], SaveAsUI = SaveAsUI.asInstanceOf[js.Any], Wb = Wb.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSaveAsUI]
  }
}

