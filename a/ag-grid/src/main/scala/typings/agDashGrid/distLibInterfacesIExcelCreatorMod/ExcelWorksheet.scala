package typings.agDashGrid.distLibInterfacesIExcelCreatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcelWorksheet extends js.Object {
  var name: String
  var table: ExcelTable
}

object ExcelWorksheet {
  @scala.inline
  def apply(name: String, table: ExcelTable): ExcelWorksheet = {
    val __obj = js.Dynamic.literal(name = name, table = table)
  
    __obj.asInstanceOf[ExcelWorksheet]
  }
}

