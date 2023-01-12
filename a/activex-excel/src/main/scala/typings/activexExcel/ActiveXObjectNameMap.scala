package typings.activexExcel

import typings.activexExcel.Excel.Application
import typings.activexExcel.Excel.Chart
import typings.activexExcel.Excel.Worksheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveXObjectNameMap extends StObject {
  
  @JSName("Excel.Application")
  var ExcelDotApplication: Application
  
  @JSName("Excel.Chart")
  var ExcelDotChart: Chart
  
  @JSName("Excel.Sheet")
  var ExcelDotSheet: Worksheet
}
object ActiveXObjectNameMap {
  
  inline def apply(ExcelDotApplication: Application, ExcelDotChart: Chart, ExcelDotSheet: Worksheet): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Excel.Application")(ExcelDotApplication.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Chart")(ExcelDotChart.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Sheet")(ExcelDotSheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActiveXObjectNameMap] (val x: Self) extends AnyVal {
    
    inline def setExcelDotApplication(value: Application): Self = StObject.set(x, "Excel.Application", value.asInstanceOf[js.Any])
    
    inline def setExcelDotChart(value: Chart): Self = StObject.set(x, "Excel.Chart", value.asInstanceOf[js.Any])
    
    inline def setExcelDotSheet(value: Worksheet): Self = StObject.set(x, "Excel.Sheet", value.asInstanceOf[js.Any])
  }
}
