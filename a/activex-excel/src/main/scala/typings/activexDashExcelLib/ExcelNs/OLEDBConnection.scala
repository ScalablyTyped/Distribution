package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.OLEDBConnection")
@js.native
class OLEDBConnection protected () extends js.Object {
  val ADOConnection: activexDashAdodbLib.ADODBNs.Connection = js.native
  var AlwaysUseConnectionFile: scala.Boolean = js.native
  val Application: Application = js.native
  var BackgroundQuery: scala.Boolean = js.native
  @JSName("CalculatedMembers")
  val CalculatedMembers_Original: CalculatedMembers = js.native
  var CommandText: java.lang.String = js.native
  var CommandType: XlCmdType = js.native
  var Connection: java.lang.String = js.native
  val Creator: XlCreator = js.native
  var EnableRefresh: scala.Boolean = js.native
  var `Excel.OLEDBConnection_typekey`: OLEDBConnection = js.native
  val IsConnected: scala.Boolean = js.native
  var LocalConnection: java.lang.String = js.native
  var LocaleID: scala.Double = js.native
  var MaintainConnection: scala.Boolean = js.native
  var MaxDrillthroughRecords: scala.Double = js.native
  val OLAP: scala.Boolean = js.native
  val Parent: js.Any = js.native
  val RefreshDate: activexDashInteropLib.VarDate = js.native
  var RefreshOnFileOpen: scala.Boolean = js.native
  var RefreshPeriod: scala.Double = js.native
  val Refreshing: scala.Boolean = js.native
  var RetrieveInOfficeUILang: scala.Boolean = js.native
  var RobustConnect: XlRobustConnect = js.native
  var SavePassword: scala.Boolean = js.native
  var ServerCredentialsMethod: XlCredentialsMethod = js.native
  var ServerFillColor: scala.Boolean = js.native
  var ServerFontStyle: scala.Boolean = js.native
  var ServerNumberFormat: scala.Boolean = js.native
  var ServerSSOApplicationID: java.lang.String = js.native
  var ServerTextColor: scala.Boolean = js.native
  var SourceConnectionFile: java.lang.String = js.native
  var SourceDataFile: java.lang.String = js.native
  var UseLocalConnection: scala.Boolean = js.native
  def CalculatedMembers(Index: java.lang.String): CalculatedMember = js.native
  def CalculatedMembers(Index: scala.Double): CalculatedMember = js.native
  def CancelRefresh(): scala.Unit = js.native
  def MakeConnection(): scala.Unit = js.native
  def Reconnect(): scala.Unit = js.native
  def Refresh(): scala.Unit = js.native
  def SaveAsODC(ODCFileName: java.lang.String): scala.Unit = js.native
  def SaveAsODC(ODCFileName: java.lang.String, Description: java.lang.String): scala.Unit = js.native
  def SaveAsODC(ODCFileName: java.lang.String, Description: java.lang.String, Keywords: java.lang.String): scala.Unit = js.native
}

