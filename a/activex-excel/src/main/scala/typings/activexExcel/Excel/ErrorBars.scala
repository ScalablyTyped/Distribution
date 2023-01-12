package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorBars extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  val Border: typings.activexExcel.Excel.Border
  
  def ClearFormats(): Any
  
  val Creator: XlCreator
  
  def Delete(): Any
  
  var EndStyle: XlEndStyleCap
  
  /* private */ @JSName("Excel.ErrorBars_typekey")
  var ExcelDotErrorBars_typekey: ErrorBars
  
  val Format: ChartFormat
  
  val Name: String
  
  val Parent: Any
  
  def Select(): Any
}
object ErrorBars {
  
  inline def apply(
    Application: Application,
    Border: Border,
    ClearFormats: () => Any,
    Creator: XlCreator,
    Delete: () => Any,
    EndStyle: XlEndStyleCap,
    ExcelDotErrorBars_typekey: ErrorBars,
    Format: ChartFormat,
    Name: String,
    Parent: Any,
    Select: () => Any
  ): ErrorBars = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], ClearFormats = js.Any.fromFunction0(ClearFormats), Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), EndStyle = EndStyle.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("Excel.ErrorBars_typekey")(ExcelDotErrorBars_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorBars]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorBars] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBorder(value: Border): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    inline def setClearFormats(value: () => Any): Self = StObject.set(x, "ClearFormats", js.Any.fromFunction0(value))
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Any): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setEndStyle(value: XlEndStyleCap): Self = StObject.set(x, "EndStyle", value.asInstanceOf[js.Any])
    
    inline def setExcelDotErrorBars_typekey(value: ErrorBars): Self = StObject.set(x, "Excel.ErrorBars_typekey", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: ChartFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: () => Any): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
  }
}
