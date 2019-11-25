package typings.activexDashExcel

import typings.activexDashExcel.Excel.Application
import typings.activexDashExcel.Excel.Chart
import typings.activexDashExcel.Excel.Worksheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObjectNameMap extends js.Object {
  var `Excel.Application`: Application
  var `Excel.Chart`: Chart
  var `Excel.Sheet`: Worksheet
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(`Excel.Application`: Application, `Excel.Chart`: Chart, `Excel.Sheet`: Worksheet): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Excel.Application")(`Excel.Application`.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Chart")(`Excel.Chart`.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Sheet")(`Excel.Sheet`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
}

