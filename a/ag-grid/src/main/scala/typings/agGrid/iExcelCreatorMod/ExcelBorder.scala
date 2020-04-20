package typings.agGrid.iExcelCreatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcelBorder extends js.Object {
  var color: String
  var lineStyle: String
  var weight: Double
}

object ExcelBorder {
  @scala.inline
  def apply(color: String, lineStyle: String, weight: Double): ExcelBorder = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], lineStyle = lineStyle.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcelBorder]
  }
}

