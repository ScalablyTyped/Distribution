package typings
package agDashGridLib.distLibInterfacesIExcelCreatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcelWorksheet extends js.Object {
  var name: java.lang.String
  var table: ExcelTable
}

object ExcelWorksheet {
  @scala.inline
  def apply(name: java.lang.String, table: ExcelTable): ExcelWorksheet = {
    val __obj = js.Dynamic.literal(name = name, table = table)
  
    __obj.asInstanceOf[ExcelWorksheet]
  }
}

