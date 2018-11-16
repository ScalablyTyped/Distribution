package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.SortField")
@js.native
class SortField protected () extends js.Object {
  val Application: Application = js.native
  val Creator: XlCreator = js.native
  var CustomOrder: js.Any = js.native
  var DataOption: XlSortDataOption = js.native
  var `Excel.SortField_typekey`: SortField = js.native
  @JSName("Key")
  val Key_Original: Range = js.native
  var Order: XlSortOrder = js.native
  val Parent: js.Any = js.native
  var Priority: scala.Double = js.native
  var SortOn: XlSortOn = js.native
  val SortOnValue: js.Any = js.native
  def Delete(): scala.Unit = js.native
  def Key(Address: java.lang.String): Range = js.native
  def Key(RowIndex: scala.Double): Range = js.native
  def Key(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def ModifyKey(Key: Range): scala.Unit = js.native
  def SetIcon(Icon: Icon): scala.Unit = js.native
}

