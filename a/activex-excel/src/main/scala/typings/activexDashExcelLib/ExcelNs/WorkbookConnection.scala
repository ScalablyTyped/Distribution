package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.WorkbookConnection")
@js.native
class WorkbookConnection protected () extends js.Object {
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  val Creator: XlCreator = js.native
  var Description: java.lang.String = js.native
  var `Excel.WorkbookConnection_typekey`: WorkbookConnection = js.native
  var Name: java.lang.String = js.native
  val ODBCConnection: activexDashExcelLib.ExcelNs.ODBCConnection = js.native
  val OLEDBConnection: activexDashExcelLib.ExcelNs.OLEDBConnection = js.native
  val Parent: js.Any = js.native
  @JSName("Ranges")
  val Ranges_Original: Ranges = js.native
  val Type: XlConnectionType = js.native
  var _Default: java.lang.String = js.native
  def Delete(): scala.Unit = js.native
  def Ranges(Index: js.Any): Range = js.native
  def Refresh(): scala.Unit = js.native
}

