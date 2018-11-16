package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.ODBCConnection")
@js.native
class ODBCConnection protected () extends js.Object {
  var AlwaysUseConnectionFile: scala.Boolean = js.native
  val Application: Application = js.native
  var BackgroundQuery: scala.Boolean = js.native
  var CommandText: java.lang.String = js.native
  var CommandType: XlCmdType = js.native
  var Connection: java.lang.String = js.native
  val Creator: XlCreator = js.native
  var EnableRefresh: scala.Boolean = js.native
  var `Excel.ODBCConnection_typekey`: ODBCConnection = js.native
  val Parent: js.Any = js.native
  val RefreshDate: activexDashInteropLib.VarDate = js.native
  var RefreshOnFileOpen: scala.Boolean = js.native
  var RefreshPeriod: scala.Double = js.native
  val Refreshing: scala.Boolean = js.native
  var RobustConnect: XlRobustConnect = js.native
  var SavePassword: scala.Boolean = js.native
  var ServerCredentialsMethod: XlCredentialsMethod = js.native
  var ServerSSOApplicationID: java.lang.String = js.native
  var SourceConnectionFile: java.lang.String = js.native
  var SourceData: java.lang.String | activexDashInteropLib.SafeArray[java.lang.String] | PivotTable = js.native
  var SourceDataFile: java.lang.String = js.native
  def CancelRefresh(): scala.Unit = js.native
  def Refresh(): scala.Unit = js.native
  def SaveAsODC(ODCFileName: java.lang.String): scala.Unit = js.native
  def SaveAsODC(ODCFileName: java.lang.String, Description: java.lang.String): scala.Unit = js.native
  def SaveAsODC(ODCFileName: java.lang.String, Description: java.lang.String, Keywords: java.lang.String): scala.Unit = js.native
}

