package typings.activexDashExcel

import typings.activexDashExcel.Excel.Application
import typings.activexDashExcel.Excel.Chart
import typings.activexDashExcel.Excel.Worksheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObjectNameMap extends js.Object {
  @JSName("Excel.Application")
  var ExcelDotApplication: Application
  @JSName("Excel.Chart")
  var ExcelDotChart: Chart
  @JSName("Excel.Sheet")
  var ExcelDotSheet: Worksheet
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(ExcelDotApplication: Application, ExcelDotChart: Chart, ExcelDotSheet: Worksheet): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Excel.Application")(ExcelDotApplication.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Chart")(ExcelDotChart.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Sheet")(ExcelDotSheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
}

