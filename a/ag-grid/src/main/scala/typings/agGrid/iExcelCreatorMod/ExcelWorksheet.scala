package typings.agGrid.iExcelCreatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExcelWorksheet extends js.Object {
  var name: String = js.native
  var table: ExcelTable = js.native
}

object ExcelWorksheet {
  @scala.inline
  def apply(name: String, table: ExcelTable): ExcelWorksheet = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcelWorksheet]
  }
  @scala.inline
  implicit class ExcelWorksheetOps[Self <: ExcelWorksheet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTable(value: ExcelTable): Self = this.set("table", value.asInstanceOf[js.Any])
  }
  
}

