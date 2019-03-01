package typings
package activexDashExcelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelSaveAsUI extends js.Object {
  var Cancel: scala.Boolean
  val SaveAsUI: scala.Boolean
  val Wb: activexDashExcelLib.ExcelNs.Workbook
}

object Anon_CancelSaveAsUI {
  @scala.inline
  def apply(Cancel: scala.Boolean, SaveAsUI: scala.Boolean, Wb: activexDashExcelLib.ExcelNs.Workbook): Anon_CancelSaveAsUI = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Cancel")(Cancel)
    __obj.updateDynamic("SaveAsUI")(SaveAsUI)
    __obj.updateDynamic("Wb")(Wb)
    __obj.asInstanceOf[Anon_CancelSaveAsUI]
  }
}

