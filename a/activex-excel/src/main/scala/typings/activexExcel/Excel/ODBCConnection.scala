package typings.activexExcel.Excel

import typings.std.SafeArray
import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ODBCConnection extends StObject {
  
  var AlwaysUseConnectionFile: Boolean = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  var BackgroundQuery: Boolean = js.native
  
  def CancelRefresh(): Unit = js.native
  
  var CommandText: String = js.native
  
  var CommandType: XlCmdType = js.native
  
  var Connection: String = js.native
  
  val Creator: XlCreator = js.native
  
  var EnableRefresh: Boolean = js.native
  
  /* private */ @JSName("Excel.ODBCConnection_typekey")
  var ExcelDotODBCConnection_typekey: ODBCConnection = js.native
  
  val Parent: Any = js.native
  
  def Refresh(): Unit = js.native
  
  val RefreshDate: VarDate = js.native
  
  var RefreshOnFileOpen: Boolean = js.native
  
  var RefreshPeriod: Double = js.native
  
  val Refreshing: Boolean = js.native
  
  var RobustConnect: XlRobustConnect = js.native
  
  def SaveAsODC(ODCFileName: String): Unit = js.native
  def SaveAsODC(ODCFileName: String, Description: String): Unit = js.native
  def SaveAsODC(ODCFileName: String, Description: String, Keywords: String): Unit = js.native
  def SaveAsODC(ODCFileName: String, Description: Unit, Keywords: String): Unit = js.native
  
  var SavePassword: Boolean = js.native
  
  var ServerCredentialsMethod: XlCredentialsMethod = js.native
  
  var ServerSSOApplicationID: String = js.native
  
  var SourceConnectionFile: String = js.native
  
  var SourceData: String | SafeArray[String] | PivotTable = js.native
  
  var SourceDataFile: String = js.native
}
