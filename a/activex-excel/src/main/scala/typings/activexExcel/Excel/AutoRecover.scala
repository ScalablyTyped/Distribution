package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoRecover extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  val Creator: XlCreator
  
  var Enabled: Boolean
  
  /* private */ @JSName("Excel.AutoRecover_typekey")
  var ExcelDotAutoRecover_typekey: AutoRecover
  
  val Parent: js.Any
  
  var Path: String
  
  var Time: Double
}
object AutoRecover {
  
  inline def apply(
    Application: Application,
    Creator: XlCreator,
    Enabled: Boolean,
    ExcelDotAutoRecover_typekey: AutoRecover,
    Parent: js.Any,
    Path: String,
    Time: Double
  ): AutoRecover = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.AutoRecover_typekey")(ExcelDotAutoRecover_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoRecover]
  }
  
  extension [Self <: AutoRecover](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setExcelDotAutoRecover_typekey(value: AutoRecover): Self = StObject.set(x, "Excel.AutoRecover_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Double): Self = StObject.set(x, "Time", value.asInstanceOf[js.Any])
  }
}
