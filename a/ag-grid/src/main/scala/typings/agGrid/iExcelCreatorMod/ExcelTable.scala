package typings.agGrid.iExcelCreatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExcelTable extends js.Object {
  var columns: js.Array[ExcelColumn] = js.native
  var rows: js.Array[ExcelRow] = js.native
}

object ExcelTable {
  @scala.inline
  def apply(columns: js.Array[ExcelColumn], rows: js.Array[ExcelRow]): ExcelTable = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcelTable]
  }
  @scala.inline
  implicit class ExcelTableOps[Self <: ExcelTable] (val x: Self) extends AnyVal {
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
    def setColumnsVarargs(value: ExcelColumn*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[ExcelColumn]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowsVarargs(value: ExcelRow*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[ExcelRow]): Self = this.set("rows", value.asInstanceOf[js.Any])
  }
  
}

