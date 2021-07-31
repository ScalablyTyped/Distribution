package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorBars extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  val Border: typings.activexExcel.Excel.Border
  
  def ClearFormats(): js.Any
  
  val Creator: XlCreator
  
  def Delete(): js.Any
  
  var EndStyle: XlEndStyleCap
  
  @JSName("Excel.ErrorBars_typekey")
  var ExcelDotErrorBars_typekey: ErrorBars
  
  val Format: ChartFormat
  
  val Name: String
  
  val Parent: js.Any
  
  def Select(): js.Any
}
object ErrorBars {
  
  @scala.inline
  def apply(
    Application: Application,
    Border: Border,
    ClearFormats: () => js.Any,
    Creator: XlCreator,
    Delete: () => js.Any,
    EndStyle: XlEndStyleCap,
    ExcelDotErrorBars_typekey: ErrorBars,
    Format: ChartFormat,
    Name: String,
    Parent: js.Any,
    Select: () => js.Any
  ): ErrorBars = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], ClearFormats = js.Any.fromFunction0(ClearFormats), Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), EndStyle = EndStyle.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("Excel.ErrorBars_typekey")(ExcelDotErrorBars_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorBars]
  }
  
  @scala.inline
  implicit class ErrorBarsMutableBuilder[Self <: ErrorBars] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorder(value: Border): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearFormats(value: () => js.Any): Self = StObject.set(x, "ClearFormats", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => js.Any): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEndStyle(value: XlEndStyleCap): Self = StObject.set(x, "EndStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotErrorBars_typekey(value: ErrorBars): Self = StObject.set(x, "Excel.ErrorBars_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: ChartFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: () => js.Any): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
  }
}
