package typings.activexExcel.Excel

import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryTable extends StObject {
  
  var AdjustColumnWidth: Boolean = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  var BackgroundQuery: Boolean = js.native
  
  def CancelRefresh(): Unit = js.native
  
  var CommandText: String = js.native
  
  var CommandType: XlCmdType = js.native
  
  var Connection: String = js.native
  
  val Creator: XlCreator = js.native
  
  def Delete(): Unit = js.native
  
  def Destination(Address: String): Range = js.native
  def Destination(RowIndex: Double): Range = js.native
  def Destination(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("Destination")
  val Destination_Original: Range = js.native
  
  var EditWebPage: String = js.native
  
  var EnableEditing: Boolean = js.native
  
  var EnableRefresh: Boolean = js.native
  
  /* private */ @JSName("Excel.QueryTable_typekey")
  var ExcelDotQueryTable_typekey: QueryTable = js.native
  
  val FetchedRowOverflow: Boolean = js.native
  
  var FieldNames: Boolean = js.native
  
  var FillAdjacentFormulas: Boolean = js.native
  
  var HasAutoFormat: Boolean = js.native
  
  val ListObject: typings.activexExcel.Excel.ListObject = js.native
  
  var MaintainConnection: Boolean = js.native
  
  var Name: String = js.native
  
  def Parameters(Index: String): Parameter = js.native
  def Parameters(Index: Double): Parameter = js.native
  @JSName("Parameters")
  val Parameters_Original: Parameters = js.native
  
  val Parent: js.Any = js.native
  
  var PostText: String = js.native
  
  var PreserveColumnInfo: Boolean = js.native
  
  var PreserveFormatting: Boolean = js.native
  
  val QueryType: XlQueryType = js.native
  
  var Recordset: typings.activexDao.DAO.Recordset | typings.activexAdodb.ADODB.Recordset = js.native
  
  def Refresh(): Boolean = js.native
  def Refresh(BackgroundQuery: Boolean): Boolean = js.native
  
  var RefreshOnFileOpen: Boolean = js.native
  
  var RefreshPeriod: Double = js.native
  
  var RefreshStyle: XlCellInsertionMode = js.native
  
  val Refreshing: Boolean = js.native
  
  def ResetTimer(): Unit = js.native
  
  def ResultRange(Address: String): Range = js.native
  def ResultRange(RowIndex: Double): Range = js.native
  def ResultRange(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("ResultRange")
  val ResultRange_Original: Range = js.native
  
  var RobustConnect: XlRobustConnect = js.native
  
  var RowNumbers: Boolean = js.native
  
  def SaveAsODC(ODCFileName: String): Unit = js.native
  def SaveAsODC(ODCFileName: String, Description: String): Unit = js.native
  def SaveAsODC(ODCFileName: String, Description: String, Keywords: String): Unit = js.native
  def SaveAsODC(ODCFileName: String, Description: Unit, Keywords: String): Unit = js.native
  
  var SaveData: Boolean = js.native
  
  var SavePassword: Boolean = js.native
  
  val Sort: typings.activexExcel.Excel.Sort = js.native
  
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
  
  val WorkbookConnection: typings.activexExcel.Excel.WorkbookConnection = js.native
}
