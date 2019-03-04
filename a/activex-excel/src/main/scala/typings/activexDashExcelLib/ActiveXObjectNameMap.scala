package typings
package activexDashExcelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObjectNameMap extends js.Object {
  var `Excel.Application`: activexDashExcelLib.ExcelNs.Application
  var `Excel.Chart`: activexDashExcelLib.ExcelNs.Chart
  var `Excel.Sheet`: activexDashExcelLib.ExcelNs.Worksheet
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(
    `Excel.Application`: activexDashExcelLib.ExcelNs.Application,
    `Excel.Chart`: activexDashExcelLib.ExcelNs.Chart,
    `Excel.Sheet`: activexDashExcelLib.ExcelNs.Worksheet
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Excel.Application")(`Excel.Application`)
    __obj.updateDynamic("Excel.Chart")(`Excel.Chart`)
    __obj.updateDynamic("Excel.Sheet")(`Excel.Sheet`)
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
}

