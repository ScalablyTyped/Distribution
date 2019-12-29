package typings.activexDashExcel.Excel

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.PivotItem")
@js.native
class PivotItem protected () extends js.Object {
  val Application: typings.activexDashExcel.Excel.Application = js.native
  var Caption: String = js.native
  @JSName("ChildItems")
  var ChildItems_Original: PivotItemsResult = js.native
  val Creator: XlCreator = js.native
  @JSName("DataRange")
  val DataRange_Original: Range = js.native
  var DrilledDown: Boolean = js.native
  @JSName("Excel.PivotItem_typekey")
  var ExcelDotPivotItem_typekey: PivotItem = js.native
  var Formula: String = js.native
  val IsCalculated: Boolean = js.native
  @JSName("LabelRange")
  val LabelRange_Original: Range = js.native
  var Name: String = js.native
  val Parent: PivotField = js.native
  val ParentItem: PivotItem = js.native
  val ParentShowDetail: Boolean = js.native
  var Position: Double = js.native
  val RecordCount: Double = js.native
  var ShowDetail: Boolean = js.native
  val SourceName: js.Any = js.native
  val SourceNameStandard: String = js.native
  var StandardFormula: String = js.native
  var Value: String = js.native
  var Visible: Boolean = js.native
  var _Default: String = js.native
  def ChildItems(Indexes: SafeArray[Double | String]): PivotItems = js.native
  def ChildItems(Index: String): PivotItem = js.native
  def ChildItems(Index: Double): PivotItem = js.native
  def DataRange(Address: String): Range = js.native
  def DataRange(RowIndex: Double): Range = js.native
  def DataRange(RowIndex: Double, ColumnIndex: Double): Range = js.native
  def Delete(): Unit = js.native
  def DrillTo(Field: String): Unit = js.native
  def LabelRange(Address: String): Range = js.native
  def LabelRange(RowIndex: Double): Range = js.native
  def LabelRange(RowIndex: Double, ColumnIndex: Double): Range = js.native
}

