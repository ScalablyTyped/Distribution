package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.PivotItem")
@js.native
class PivotItem protected () extends js.Object {
  val Application: Application = js.native
  var Caption: java.lang.String = js.native
  @JSName("ChildItems")
  var ChildItems_Original: PivotItemsResult = js.native
  val Creator: XlCreator = js.native
  @JSName("DataRange")
  val DataRange_Original: Range = js.native
  var DrilledDown: scala.Boolean = js.native
  var `Excel.PivotItem_typekey`: PivotItem = js.native
  var Formula: java.lang.String = js.native
  val IsCalculated: scala.Boolean = js.native
  @JSName("LabelRange")
  val LabelRange_Original: Range = js.native
  var Name: java.lang.String = js.native
  val Parent: PivotField = js.native
  val ParentItem: PivotItem = js.native
  val ParentShowDetail: scala.Boolean = js.native
  var Position: scala.Double = js.native
  val RecordCount: scala.Double = js.native
  var ShowDetail: scala.Boolean = js.native
  val SourceName: js.Any = js.native
  val SourceNameStandard: java.lang.String = js.native
  var StandardFormula: java.lang.String = js.native
  var Value: java.lang.String = js.native
  var Visible: scala.Boolean = js.native
  var _Default: java.lang.String = js.native
  def ChildItems(Indexes: activexDashInteropLib.SafeArray[scala.Double | java.lang.String]): PivotItems = js.native
  def ChildItems(Index: java.lang.String): PivotItem = js.native
  def ChildItems(Index: scala.Double): PivotItem = js.native
  def DataRange(Address: java.lang.String): Range = js.native
  def DataRange(RowIndex: scala.Double): Range = js.native
  def DataRange(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def Delete(): scala.Unit = js.native
  def DrillTo(Field: java.lang.String): scala.Unit = js.native
  def LabelRange(Address: java.lang.String): Range = js.native
  def LabelRange(RowIndex: scala.Double): Range = js.native
  def LabelRange(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
}

