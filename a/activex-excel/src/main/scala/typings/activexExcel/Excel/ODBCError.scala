package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ODBCError extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  val Creator: XlCreator
  
  val ErrorString: String
  
  /* private */ @JSName("Excel.ODBCError_typekey")
  var ExcelDotODBCError_typekey: ODBCError
  
  val Parent: Any
  
  val SqlState: String
}
object ODBCError {
  
  inline def apply(
    Application: Application,
    Creator: XlCreator,
    ErrorString: String,
    ExcelDotODBCError_typekey: ODBCError,
    Parent: Any,
    SqlState: String
  ): ODBCError = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], ErrorString = ErrorString.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SqlState = SqlState.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.ODBCError_typekey")(ExcelDotODBCError_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ODBCError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ODBCError] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setErrorString(value: String): Self = StObject.set(x, "ErrorString", value.asInstanceOf[js.Any])
    
    inline def setExcelDotODBCError_typekey(value: ODBCError): Self = StObject.set(x, "Excel.ODBCError_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSqlState(value: String): Self = StObject.set(x, "SqlState", value.asInstanceOf[js.Any])
  }
}
