package typings.agDashGrid.distLibInterfacesIExcelCreatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcelTable extends js.Object {
  var columns: js.Array[ExcelColumn]
  var rows: js.Array[ExcelRow]
}

object ExcelTable {
  @scala.inline
  def apply(columns: js.Array[ExcelColumn], rows: js.Array[ExcelRow]): ExcelTable = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExcelTable]
  }
}

