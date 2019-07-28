package typings.agDashGrid.distLibInterfacesIExcelCreatorMod

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
    val __obj = js.Dynamic.literal(color = color, lineStyle = lineStyle, weight = weight)
  
    __obj.asInstanceOf[ExcelBorder]
  }
}

