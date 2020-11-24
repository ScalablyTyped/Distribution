package typings.activexExcel

import typings.activexExcel.Excel.Application
import typings.activexExcel.Excel.Chart
import typings.activexExcel.Excel.Worksheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObjectNameMap extends js.Object {
  
  @JSName("Excel.Application")
  var ExcelDotApplication: Application = js.native
  
  @JSName("Excel.Chart")
  var ExcelDotChart: Chart = js.native
  
  @JSName("Excel.Sheet")
  var ExcelDotSheet: Worksheet = js.native
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
  
  @scala.inline
  implicit class ActiveXObjectNameMapOps[Self <: ActiveXObjectNameMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExcelDotApplication(value: Application): Self = this.set("Excel.Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotChart(value: Chart): Self = this.set("Excel.Chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotSheet(value: Worksheet): Self = this.set("Excel.Sheet", value.asInstanceOf[js.Any])
  }
}
