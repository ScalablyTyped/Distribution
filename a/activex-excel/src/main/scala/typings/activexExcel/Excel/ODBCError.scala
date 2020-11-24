package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ODBCError extends js.Object {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Creator: XlCreator = js.native
  
  val ErrorString: String = js.native
  
  @JSName("Excel.ODBCError_typekey")
  var ExcelDotODBCError_typekey: ODBCError = js.native
  
  val Parent: js.Any = js.native
  
  val SqlState: String = js.native
}
object ODBCError {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    ErrorString: String,
    ExcelDotODBCError_typekey: ODBCError,
    Parent: js.Any,
    SqlState: String
  ): ODBCError = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], ErrorString = ErrorString.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SqlState = SqlState.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.ODBCError_typekey")(ExcelDotODBCError_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ODBCError]
  }
  
  @scala.inline
  implicit class ODBCErrorOps[Self <: ODBCError] (val x: Self) extends AnyVal {
    
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
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorString(value: String): Self = this.set("ErrorString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotODBCError_typekey(value: ODBCError): Self = this.set("Excel.ODBCError_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlState(value: String): Self = this.set("SqlState", value.asInstanceOf[js.Any])
  }
}
