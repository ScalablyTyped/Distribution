package typings.agDashGrid.distLibInterfacesIExcelCreatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcelInterior extends js.Object {
  var color: String
  var pattern: String
  var patternColor: String
}

object ExcelInterior {
  @scala.inline
  def apply(color: String, pattern: String, patternColor: String): ExcelInterior = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], patternColor = patternColor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExcelInterior]
  }
}

