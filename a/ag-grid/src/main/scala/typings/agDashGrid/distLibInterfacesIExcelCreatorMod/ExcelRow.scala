package typings.agDashGrid.distLibInterfacesIExcelCreatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcelRow extends js.Object {
  var cells: js.Array[ExcelCell]
}

object ExcelRow {
  @scala.inline
  def apply(cells: js.Array[ExcelCell]): ExcelRow = {
    val __obj = js.Dynamic.literal(cells = cells)
  
    __obj.asInstanceOf[ExcelRow]
  }
}

