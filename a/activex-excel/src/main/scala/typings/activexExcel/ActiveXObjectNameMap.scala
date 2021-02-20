package typings.activexExcel

import typings.activexExcel.Excel.Application
import typings.activexExcel.Excel.Chart
import typings.activexExcel.Excel.Worksheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObjectNameMap extends StObject {
  
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
  implicit class ActiveXObjectNameMapMutableBuilder[Self <: ActiveXObjectNameMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcelDotApplication(value: Application): Self = StObject.set(x, "Excel.Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotChart(value: Chart): Self = StObject.set(x, "Excel.Chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotSheet(value: Worksheet): Self = StObject.set(x, "Excel.Sheet", value.asInstanceOf[js.Any])
  }
}
