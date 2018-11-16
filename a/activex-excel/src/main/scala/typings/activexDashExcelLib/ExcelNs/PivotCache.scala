package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.PivotCache")
@js.native
class PivotCache protected () extends js.Object {
  val ADOConnection: activexDashAdodbLib.ADODBNs.Connection = js.native
  val Application: Application = js.native
  var BackgroundQuery: scala.Boolean = js.native
  var CommandText: java.lang.String = js.native
  var CommandType: XlCmdType = js.native
  var Connection: java.lang.String = js.native
  val Creator: XlCreator = js.native
  var EnableRefresh: scala.Boolean = js.native
  var `Excel.PivotCache_typekey`: PivotCache = js.native
  val Index: scala.Double = js.native
  val IsConnected: scala.Boolean = js.native
  var LocalConnection: java.lang.String = js.native
  var MaintainConnection: scala.Boolean = js.native
  val MemoryUsed: scala.Double = js.native
  var MissingItemsLimit: XlPivotTableMissingItems = js.native
  val OLAP: scala.Boolean = js.native
  var OptimizeCache: scala.Boolean = js.native
  val Parent: js.Any = js.native
  val QueryType: XlQueryType = js.native
  val RecordCount: scala.Double = js.native
  @JSName("Recordset")
  var Recordset_Original: activexDashAdodbLib.ADODBNs.Recordset = js.native
  val RefreshDate: activexDashInteropLib.VarDate = js.native
  val RefreshName: java.lang.String = js.native
  var RefreshOnFileOpen: scala.Boolean = js.native
  var RefreshPeriod: scala.Double = js.native
  var RobustConnect: XlRobustConnect = js.native
  var SavePassword: scala.Boolean = js.native
  var SourceConnectionFile: java.lang.String = js.native
  var SourceData: java.lang.String | activexDashInteropLib.SafeArray[java.lang.String] | PivotTable = js.native
  val SourceDataFile: java.lang.String = js.native
  val SourceType: XlPivotTableSourceType = js.native
  var Sql: js.Any = js.native
  var UpgradeOnRefresh: scala.Boolean = js.native
  var UseLocalConnection: scala.Boolean = js.native
  val Version: XlPivotTableVersionList = js.native
  val WorkbookConnection: WorkbookConnection = js.native
  def CreatePivotTable(TableDestination: Range): PivotTable = js.native
  def CreatePivotTable(TableDestination: Range, TableName: java.lang.String): PivotTable = js.native
  def CreatePivotTable(TableDestination: Range, TableName: java.lang.String, ReadData: scala.Boolean): PivotTable = js.native
  def CreatePivotTable(
    TableDestination: Range,
    TableName: java.lang.String,
    ReadData: scala.Boolean,
    DefaultVersion: js.Any
  ): PivotTable = js.native
  def MakeConnection(): scala.Unit = js.native
  def Recordset(FieldIndex: java.lang.String): activexDashAdodbLib.ADODBNs.Field = js.native
  def Recordset(FieldIndex: scala.Double): activexDashAdodbLib.ADODBNs.Field = js.native
  def Refresh(): scala.Unit = js.native
  def ResetTimer(): scala.Unit = js.native
  def SaveAsODC(ODCFileName: java.lang.String): scala.Unit = js.native
  def SaveAsODC(ODCFileName: java.lang.String, Description: java.lang.String): scala.Unit = js.native
  def SaveAsODC(ODCFileName: java.lang.String, Description: java.lang.String, Keywords: java.lang.String): scala.Unit = js.native
}

