package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.SortField")
@js.native
class SortField protected () extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  var CustomOrder: js.Any = js.native
  var DataOption: XlSortDataOption = js.native
  @JSName("Excel.SortField_typekey")
  var ExcelDotSortField_typekey: SortField = js.native
  @JSName("Key")
  val Key_Original: Range = js.native
  var Order: XlSortOrder = js.native
  val Parent: js.Any = js.native
  var Priority: Double = js.native
  var SortOn: XlSortOn = js.native
  val SortOnValue: js.Any = js.native
  def Delete(): Unit = js.native
  def Key(Address: String): Range = js.native
  def Key(RowIndex: Double): Range = js.native
  def Key(RowIndex: Double, ColumnIndex: Double): Range = js.native
  def ModifyKey(Key: Range): Unit = js.native
  def SetIcon(Icon: Icon): Unit = js.native
}

