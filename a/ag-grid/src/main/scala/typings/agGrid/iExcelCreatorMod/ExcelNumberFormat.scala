package typings.agGrid.iExcelCreatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcelNumberFormat extends js.Object {
  var format: String
}

object ExcelNumberFormat {
  @scala.inline
  def apply(format: String): ExcelNumberFormat = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcelNumberFormat]
  }
}

