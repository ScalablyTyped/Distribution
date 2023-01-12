package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiThreadedCalculation extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  val Creator: XlCreator
  
  var Enabled: Boolean
  
  /* private */ @JSName("Excel.MultiThreadedCalculation_typekey")
  var ExcelDotMultiThreadedCalculation_typekey: MultiThreadedCalculation
  
  val Parent: Any
  
  var ThreadCount: Double
  
  var ThreadMode: XlThreadMode
}
object MultiThreadedCalculation {
  
  inline def apply(
    Application: Application,
    Creator: XlCreator,
    Enabled: Boolean,
    ExcelDotMultiThreadedCalculation_typekey: MultiThreadedCalculation,
    Parent: Any,
    ThreadCount: Double,
    ThreadMode: XlThreadMode
  ): MultiThreadedCalculation = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ThreadCount = ThreadCount.asInstanceOf[js.Any], ThreadMode = ThreadMode.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.MultiThreadedCalculation_typekey")(ExcelDotMultiThreadedCalculation_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiThreadedCalculation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultiThreadedCalculation] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setExcelDotMultiThreadedCalculation_typekey(value: MultiThreadedCalculation): Self = StObject.set(x, "Excel.MultiThreadedCalculation_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setThreadCount(value: Double): Self = StObject.set(x, "ThreadCount", value.asInstanceOf[js.Any])
    
    inline def setThreadMode(value: XlThreadMode): Self = StObject.set(x, "ThreadMode", value.asInstanceOf[js.Any])
  }
}
