package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.AutoFilter")
@js.native
class AutoFilter protected () extends js.Object {
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  val Creator: XlCreator = js.native
  var `Excel.AutoFilter_typekey`: AutoFilter = js.native
  val FilterMode: scala.Boolean = js.native
  @JSName("Filters")
  val Filters_Original: Filters = js.native
  val Parent: js.Any = js.native
  @JSName("Range")
  val Range_Original: Range = js.native
  val Sort: activexDashExcelLib.ExcelNs.Sort = js.native
  def ApplyFilter(): scala.Unit = js.native
  def Filters(Index: scala.Double): Filter = js.native
  def Range(Address: java.lang.String): activexDashExcelLib.ExcelNs.Range = js.native
  def Range(RowIndex: scala.Double): activexDashExcelLib.ExcelNs.Range = js.native
  def Range(RowIndex: scala.Double, ColumnIndex: scala.Double): activexDashExcelLib.ExcelNs.Range = js.native
  def ShowAllData(): scala.Unit = js.native
}

