package typings
package agDashGridLib.distLibInterfacesIExcelCreatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcelBorder extends js.Object {
  var color: java.lang.String
  var lineStyle: java.lang.String
  var weight: scala.Double
}

object ExcelBorder {
  @scala.inline
  def apply(color: java.lang.String, lineStyle: java.lang.String, weight: scala.Double): ExcelBorder = {
    val __obj = js.Dynamic.literal(color = color, lineStyle = lineStyle, weight = weight)
  
    __obj.asInstanceOf[ExcelBorder]
  }
}

