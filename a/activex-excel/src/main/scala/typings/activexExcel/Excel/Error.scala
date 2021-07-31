package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  val Creator: XlCreator
  
  @JSName("Excel.Error_typekey")
  var ExcelDotError_typekey: Error
  
  var Ignore: Boolean
  
  val Parent: js.Any
  
  val Value: Boolean
}
object Error {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    ExcelDotError_typekey: Error,
    Ignore: Boolean,
    Parent: js.Any,
    Value: Boolean
  ): Error = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Ignore = Ignore.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Error_typekey")(ExcelDotError_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  @scala.inline
  implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotError_typekey(value: Error): Self = StObject.set(x, "Excel.Error_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnore(value: Boolean): Self = StObject.set(x, "Ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Boolean): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
