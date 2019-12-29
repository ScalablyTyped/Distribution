package typings.activexDashExcel.Excel

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.QueryTable")
@js.native
class QueryTable protected () extends js.Object {
  var AdjustColumnWidth: Boolean = js.native
  val Application: typings.activexDashExcel.Excel.Application = js.native
  var BackgroundQuery: Boolean = js.native
  var CommandText: String = js.native
  var CommandType: XlCmdType = js.native
  var Connection: String = js.native
  val Creator: XlCreator = js.native
  @JSName("Destination")
  val Destination_Original: Range = js.native
  var EditWebPage: String = js.native
  var EnableEditing: Boolean = js.native
  var EnableRefresh: Boolean = js.native
  @JSName("Excel.QueryTable_typekey")
  var ExcelDotQueryTable_typekey: QueryTable = js.native
  val FetchedRowOverflow: Boolean = js.native
  var FieldNames: Boolean = js.native
  var FillAdjacentFormulas: Boolean = js.native
  var HasAutoFormat: Boolean = js.native
  val ListObject: typings.activexDashExcel.Excel.ListObject = js.native
  var MaintainConnection: Boolean = js.native
  var Name: String = js.native
  @JSName("Parameters")
  val Parameters_Original: Parameters = js.native
  val Parent: js.Any = js.native
  var PostText: String = js.native
  var PreserveColumnInfo: Boolean = js.native
  var PreserveFormatting: Boolean = js.native
  val QueryType: XlQueryType = js.native
  var Recordset: typings.activexDashDao.DAO.Recordset | typings.activexDashAdodb.ADODB.Recordset = js.native
  var RefreshOnFileOpen: Boolean = js.native
  var RefreshPeriod: Double = js.native
  var RefreshStyle: XlCellInsertionMode = js.native
  val Refreshing: Boolean = js.native
  @JSName("ResultRange")
  val ResultRange_Original: Range = js.native
  var RobustConnect: XlRobustConnect = js.native
  var RowNumbers: Boolean = js.native
  var SaveData: Boolean = js.native
  var SavePassword: Boolean = js.native
  val Sort: typings.activexDashExcel.Excel.Sort = js.native
  var SourceConnectionFile: String = js.native
  var SourceDataFile: String = js.native
  var Sql: js.Any = js.native
  var TablesOnlyFromHTML: Boolean = js.native
  var TextFileColumnDataTypes: SafeArray[XlColumnDataType] = js.native
  var TextFileCommaDelimiter: Boolean = js.native
  var TextFileConsecutiveDelimiter: Boolean = js.native
  var TextFileDecimalSeparator: String = js.native
  var TextFileFixedColumnWidths: SafeArray[Double] = js.native
  var TextFileOtherDelimiter: String = js.native
  var TextFileParseType: XlTextParsingType = js.native
  var TextFilePlatform: Double = js.native
  var TextFilePromptOnRefresh: Boolean = js.native
  var TextFileSemicolonDelimiter: Boolean = js.native
  var TextFileSpaceDelimiter: Boolean = js.native
  var TextFileStartRow: Double = js.native
  var TextFileTabDelimiter: Boolean = js.native
  var TextFileTextQualifier: XlTextQualifier = js.native
  var TextFileThousandsSeparator: String = js.native
  var TextFileTrailingMinusNumbers: Boolean = js.native
  var TextFileVisualLayout: XlTextVisualLayoutType = js.native
  var WebConsecutiveDelimitersAsOne: Boolean = js.native
  var WebDisableDateRecognition: Boolean = js.native
  var WebDisableRedirections: Boolean = js.native
  var WebFormatting: XlWebFormatting = js.native
  var WebPreFormattedTextToColumns: Boolean = js.native
  var WebSelectionType: XlWebSelectionType = js.native
  var WebSingleBlockTextImport: Boolean = js.native
  var WebTables: String = js.native
  val WorkbookConnection: typings.activexDashExcel.Excel.WorkbookConnection = js.native
  def CancelRefresh(): Unit = js.native
  def Delete(): Unit = js.native
  def Destination(Address: String): Range = js.native
  def Destination(RowIndex: Double): Range = js.native
  def Destination(RowIndex: Double, ColumnIndex: Double): Range = js.native
  def Parameters(Index: String): Parameter = js.native
  def Parameters(Index: Double): Parameter = js.native
  def Refresh(): Boolean = js.native
  def Refresh(BackgroundQuery: Boolean): Boolean = js.native
  def ResetTimer(): Unit = js.native
  def ResultRange(Address: String): Range = js.native
  def ResultRange(RowIndex: Double): Range = js.native
  def ResultRange(RowIndex: Double, ColumnIndex: Double): Range = js.native
  def SaveAsODC(ODCFileName: String): Unit = js.native
  def SaveAsODC(ODCFileName: String, Description: String): Unit = js.native
  def SaveAsODC(ODCFileName: String, Description: String, Keywords: String): Unit = js.native
}

