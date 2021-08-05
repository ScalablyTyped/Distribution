package typings.activexExcel.Excel

import typings.activexAdodb.ADODB.Connection
import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OLEDBConnection extends StObject {
  
  val ADOConnection: Connection = js.native
  
  var AlwaysUseConnectionFile: Boolean = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  var BackgroundQuery: Boolean = js.native
  
  def CalculatedMembers(Index: String): CalculatedMember = js.native
  def CalculatedMembers(Index: Double): CalculatedMember = js.native
  @JSName("CalculatedMembers")
  val CalculatedMembers_Original: CalculatedMembers = js.native
  
  def CancelRefresh(): Unit = js.native
  
  var CommandText: String = js.native
  
  var CommandType: XlCmdType = js.native
  
  var Connection: String = js.native
  
  val Creator: XlCreator = js.native
  
  var EnableRefresh: Boolean = js.native
  
  /* private */ @JSName("Excel.OLEDBConnection_typekey")
  var ExcelDotOLEDBConnection_typekey: OLEDBConnection = js.native
  
  val IsConnected: Boolean = js.native
  
  var LocalConnection: String = js.native
  
  var LocaleID: Double = js.native
  
  var MaintainConnection: Boolean = js.native
  
  def MakeConnection(): Unit = js.native
  
  var MaxDrillthroughRecords: Double = js.native
  
  val OLAP: Boolean = js.native
  
  val Parent: js.Any = js.native
  
  def Reconnect(): Unit = js.native
  
  def Refresh(): Unit = js.native
  
  val RefreshDate: VarDate = js.native
  
  var RefreshOnFileOpen: Boolean = js.native
  
  var RefreshPeriod: Double = js.native
  
  val Refreshing: Boolean = js.native
  
  var RetrieveInOfficeUILang: Boolean = js.native
  
  var RobustConnect: XlRobustConnect = js.native
  
  def SaveAsODC(ODCFileName: String): Unit = js.native
  def SaveAsODC(ODCFileName: String, Description: String): Unit = js.native
  def SaveAsODC(ODCFileName: String, Description: String, Keywords: String): Unit = js.native
  def SaveAsODC(ODCFileName: String, Description: Unit, Keywords: String): Unit = js.native
  
  var SavePassword: Boolean = js.native
  
  var ServerCredentialsMethod: XlCredentialsMethod = js.native
  
  var ServerFillColor: Boolean = js.native
  
  var ServerFontStyle: Boolean = js.native
  
  var ServerNumberFormat: Boolean = js.native
  
  var ServerSSOApplicationID: String = js.native
  
  var ServerTextColor: Boolean = js.native
  
  var SourceConnectionFile: String = js.native
  
  var SourceDataFile: String = js.native
  
  var UseLocalConnection: Boolean = js.native
}
