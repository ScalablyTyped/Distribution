package typings.activexDashExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.WorkbookConnection")
@js.native
class WorkbookConnection protected () extends js.Object {
  val Application: typings.activexDashExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  var Description: String = js.native
  @JSName("Excel.WorkbookConnection_typekey")
  var ExcelDotWorkbookConnection_typekey: WorkbookConnection = js.native
  var Name: String = js.native
  val ODBCConnection: typings.activexDashExcel.Excel.ODBCConnection = js.native
  val OLEDBConnection: typings.activexDashExcel.Excel.OLEDBConnection = js.native
  val Parent: js.Any = js.native
  @JSName("Ranges")
  val Ranges_Original: Ranges = js.native
  val Type: XlConnectionType = js.native
  var _Default: String = js.native
  def Delete(): Unit = js.native
  def Ranges(Index: js.Any): Range = js.native
  def Refresh(): Unit = js.native
}

