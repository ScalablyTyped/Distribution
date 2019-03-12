package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.QueryTable")
@js.native
class QueryTable protected () extends js.Object {
  var AdjustColumnWidth: scala.Boolean = js.native
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  var BackgroundQuery: scala.Boolean = js.native
  var CommandText: java.lang.String = js.native
  var CommandType: XlCmdType = js.native
  var Connection: java.lang.String = js.native
  val Creator: XlCreator = js.native
  @JSName("Destination")
  val Destination_Original: Range = js.native
  var EditWebPage: java.lang.String = js.native
  var EnableEditing: scala.Boolean = js.native
  var EnableRefresh: scala.Boolean = js.native
  var `Excel.QueryTable_typekey`: QueryTable = js.native
  val FetchedRowOverflow: scala.Boolean = js.native
  var FieldNames: scala.Boolean = js.native
  var FillAdjacentFormulas: scala.Boolean = js.native
  var HasAutoFormat: scala.Boolean = js.native
  val ListObject: activexDashExcelLib.ExcelNs.ListObject = js.native
  var MaintainConnection: scala.Boolean = js.native
  var Name: java.lang.String = js.native
  @JSName("Parameters")
  val Parameters_Original: Parameters = js.native
  val Parent: js.Any = js.native
  var PostText: java.lang.String = js.native
  var PreserveColumnInfo: scala.Boolean = js.native
  var PreserveFormatting: scala.Boolean = js.native
  val QueryType: XlQueryType = js.native
  var Recordset: activexDashDaoLib.DAONs.Recordset | activexDashAdodbLib.ADODBNs.Recordset = js.native
  var RefreshOnFileOpen: scala.Boolean = js.native
  var RefreshPeriod: scala.Double = js.native
  var RefreshStyle: XlCellInsertionMode = js.native
  val Refreshing: scala.Boolean = js.native
  @JSName("ResultRange")
  val ResultRange_Original: Range = js.native
  var RobustConnect: XlRobustConnect = js.native
  var RowNumbers: scala.Boolean = js.native
  var SaveData: scala.Boolean = js.native
  var SavePassword: scala.Boolean = js.native
  val Sort: activexDashExcelLib.ExcelNs.Sort = js.native
  var SourceConnectionFile: java.lang.String = js.native
  var SourceDataFile: java.lang.String = js.native
  var Sql: js.Any = js.native
  var TablesOnlyFromHTML: scala.Boolean = js.native
  var TextFileColumnDataTypes: stdLib.SafeArray[XlColumnDataType] = js.native
  var TextFileCommaDelimiter: scala.Boolean = js.native
  var TextFileConsecutiveDelimiter: scala.Boolean = js.native
  var TextFileDecimalSeparator: java.lang.String = js.native
  var TextFileFixedColumnWidths: stdLib.SafeArray[scala.Double] = js.native
  var TextFileOtherDelimiter: java.lang.String = js.native
  var TextFileParseType: XlTextParsingType = js.native
  var TextFilePlatform: scala.Double = js.native
  var TextFilePromptOnRefresh: scala.Boolean = js.native
  var TextFileSemicolonDelimiter: scala.Boolean = js.native
  var TextFileSpaceDelimiter: scala.Boolean = js.native
  var TextFileStartRow: scala.Double = js.native
  var TextFileTabDelimiter: scala.Boolean = js.native
  var TextFileTextQualifier: XlTextQualifier = js.native
  var TextFileThousandsSeparator: java.lang.String = js.native
  var TextFileTrailingMinusNumbers: scala.Boolean = js.native
  var TextFileVisualLayout: XlTextVisualLayoutType = js.native
  var WebConsecutiveDelimitersAsOne: scala.Boolean = js.native
  var WebDisableDateRecognition: scala.Boolean = js.native
  var WebDisableRedirections: scala.Boolean = js.native
  var WebFormatting: XlWebFormatting = js.native
  var WebPreFormattedTextToColumns: scala.Boolean = js.native
  var WebSelectionType: XlWebSelectionType = js.native
  var WebSingleBlockTextImport: scala.Boolean = js.native
  var WebTables: java.lang.String = js.native
  val WorkbookConnection: activexDashExcelLib.ExcelNs.WorkbookConnection = js.native
  def CancelRefresh(): scala.Unit = js.native
  def Delete(): scala.Unit = js.native
  def Destination(Address: java.lang.String): Range = js.native
  def Destination(RowIndex: scala.Double): Range = js.native
  def Destination(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def Parameters(Index: java.lang.String): Parameter = js.native
  def Parameters(Index: scala.Double): Parameter = js.native
  def Refresh(): scala.Boolean = js.native
  def Refresh(BackgroundQuery: scala.Boolean): scala.Boolean = js.native
  def ResetTimer(): scala.Unit = js.native
  def ResultRange(Address: java.lang.String): Range = js.native
  def ResultRange(RowIndex: scala.Double): Range = js.native
  def ResultRange(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def SaveAsODC(ODCFileName: java.lang.String): scala.Unit = js.native
  def SaveAsODC(ODCFileName: java.lang.String, Description: java.lang.String): scala.Unit = js.native
  def SaveAsODC(ODCFileName: java.lang.String, Description: java.lang.String, Keywords: java.lang.String): scala.Unit = js.native
}

