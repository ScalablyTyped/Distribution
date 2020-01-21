package typings.agGrid.iExcelCreatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcelData extends js.Object {
  var `type`: ExcelDataType
  var value: String
}

object ExcelData {
  @scala.inline
  def apply(`type`: ExcelDataType, value: String): ExcelData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcelData]
  }
}

