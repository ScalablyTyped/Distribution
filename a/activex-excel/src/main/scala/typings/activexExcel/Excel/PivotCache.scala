package typings.activexExcel.Excel

import typings.activexAdodb.ADODB.Connection
import typings.activexAdodb.ADODB.Field
import typings.activexAdodb.ADODB.Recordset
import typings.std.SafeArray
import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotCache extends StObject {
  
  val ADOConnection: Connection = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  var BackgroundQuery: Boolean = js.native
  
  var CommandText: String = js.native
  
  var CommandType: XlCmdType = js.native
  
  var Connection: String = js.native
  
  def CreatePivotTable(TableDestination: Range): PivotTable = js.native
  def CreatePivotTable(TableDestination: Range, TableName: String): PivotTable = js.native
  def CreatePivotTable(TableDestination: Range, TableName: String, ReadData: Boolean): PivotTable = js.native
  def CreatePivotTable(TableDestination: Range, TableName: String, ReadData: Boolean, DefaultVersion: js.Any): PivotTable = js.native
  def CreatePivotTable(TableDestination: Range, TableName: String, ReadData: Unit, DefaultVersion: js.Any): PivotTable = js.native
  def CreatePivotTable(TableDestination: Range, TableName: Unit, ReadData: Boolean): PivotTable = js.native
  def CreatePivotTable(TableDestination: Range, TableName: Unit, ReadData: Boolean, DefaultVersion: js.Any): PivotTable = js.native
  def CreatePivotTable(TableDestination: Range, TableName: Unit, ReadData: Unit, DefaultVersion: js.Any): PivotTable = js.native
  
  val Creator: XlCreator = js.native
  
  var EnableRefresh: Boolean = js.native
  
  /* private */ @JSName("Excel.PivotCache_typekey")
  var ExcelDotPivotCache_typekey: PivotCache = js.native
  
  val Index: Double = js.native
  
  val IsConnected: Boolean = js.native
  
  var LocalConnection: String = js.native
  
  var MaintainConnection: Boolean = js.native
  
  def MakeConnection(): Unit = js.native
  
  val MemoryUsed: Double = js.native
  
  var MissingItemsLimit: XlPivotTableMissingItems = js.native
  
  val OLAP: Boolean = js.native
  
  var OptimizeCache: Boolean = js.native
  
  val Parent: js.Any = js.native
  
  val QueryType: XlQueryType = js.native
  
  val RecordCount: Double = js.native
  
  def Recordset(FieldIndex: String): Field = js.native
  def Recordset(FieldIndex: Double): Field = js.native
  @JSName("Recordset")
  var Recordset_Original: Recordset = js.native
  
  def Refresh(): Unit = js.native
  
  val RefreshDate: VarDate = js.native
  
  val RefreshName: String = js.native
  
  var RefreshOnFileOpen: Boolean = js.native
  
  var RefreshPeriod: Double = js.native
  
  def ResetTimer(): Unit = js.native
  
  var RobustConnect: XlRobustConnect = js.native
  
  def SaveAsODC(ODCFileName: String): Unit = js.native
  def SaveAsODC(ODCFileName: String, Description: String): Unit = js.native
  def SaveAsODC(ODCFileName: String, Description: String, Keywords: String): Unit = js.native
  def SaveAsODC(ODCFileName: String, Description: Unit, Keywords: String): Unit = js.native
  
  var SavePassword: Boolean = js.native
  
  var SourceConnectionFile: String = js.native
  
  var SourceData: String | SafeArray[String] | PivotTable = js.native
  
  val SourceDataFile: String = js.native
  
  val SourceType: XlPivotTableSourceType = js.native
  
  var Sql: js.Any = js.native
  
  var UpgradeOnRefresh: Boolean = js.native
  
  var UseLocalConnection: Boolean = js.native
  
  val Version: XlPivotTableVersionList = js.native
  
  val WorkbookConnection: typings.activexExcel.Excel.WorkbookConnection = js.native
}
