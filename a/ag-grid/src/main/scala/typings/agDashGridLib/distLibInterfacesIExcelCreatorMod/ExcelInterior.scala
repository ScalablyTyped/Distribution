package typings
package agDashGridLib.distLibInterfacesIExcelCreatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcelInterior extends js.Object {
  var color: java.lang.String
  var pattern: java.lang.String
  var patternColor: java.lang.String
}

object ExcelInterior {
  @scala.inline
  def apply(color: java.lang.String, pattern: java.lang.String, patternColor: java.lang.String): ExcelInterior = {
    val __obj = js.Dynamic.literal(color = color, pattern = pattern, patternColor = patternColor)
  
    __obj.asInstanceOf[ExcelInterior]
  }
}

