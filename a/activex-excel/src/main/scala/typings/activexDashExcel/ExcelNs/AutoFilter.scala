package typings.activexDashExcel.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.AutoFilter")
@js.native
class AutoFilter protected () extends js.Object {
  val Application: typings.activexDashExcel.ExcelNs.Application = js.native
  val Creator: XlCreator = js.native
  var `Excel.AutoFilter_typekey`: AutoFilter = js.native
  val FilterMode: Boolean = js.native
  @JSName("Filters")
  val Filters_Original: Filters = js.native
  val Parent: js.Any = js.native
  @JSName("Range")
  val Range_Original: Range = js.native
  val Sort: typings.activexDashExcel.ExcelNs.Sort = js.native
  def ApplyFilter(): Unit = js.native
  def Filters(Index: Double): Filter = js.native
  def Range(Address: String): typings.activexDashExcel.ExcelNs.Range = js.native
  def Range(RowIndex: Double): typings.activexDashExcel.ExcelNs.Range = js.native
  def Range(RowIndex: Double, ColumnIndex: Double): typings.activexDashExcel.ExcelNs.Range = js.native
  def ShowAllData(): Unit = js.native
}

