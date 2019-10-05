package typings.activexDashExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.ListRow")
@js.native
class ListRow protected () extends js.Object {
  val Application: typings.activexDashExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  var `Excel.ListRow_typekey`: ListRow = js.native
  val Index: Double = js.native
  val InvalidData: Boolean = js.native
  val Parent: js.Any = js.native
  @JSName("Range")
  val Range_Original: Range = js.native
  def Delete(): Unit = js.native
  def Range(Address: String): typings.activexDashExcel.Excel.Range = js.native
  def Range(RowIndex: Double): typings.activexDashExcel.Excel.Range = js.native
  def Range(RowIndex: Double, ColumnIndex: Double): typings.activexDashExcel.Excel.Range = js.native
}

