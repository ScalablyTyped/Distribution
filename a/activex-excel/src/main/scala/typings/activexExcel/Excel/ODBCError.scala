package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ODBCError extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  val Creator: XlCreator
  val ErrorString: String
  @JSName("Excel.ODBCError_typekey")
  var ExcelDotODBCError_typekey: ODBCError
  val Parent: js.Any
  val SqlState: String
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
}

