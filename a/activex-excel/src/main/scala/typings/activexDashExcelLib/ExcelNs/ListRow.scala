package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.ListRow")
@js.native
class ListRow protected () extends js.Object {
  val Application: Application = js.native
  val Creator: XlCreator = js.native
  var `Excel.ListRow_typekey`: ListRow = js.native
  val Index: scala.Double = js.native
  val InvalidData: scala.Boolean = js.native
  val Parent: js.Any = js.native
  @JSName("Range")
  val Range_Original: Range = js.native
  def Delete(): scala.Unit = js.native
  def Range(Address: java.lang.String): Range = js.native
  def Range(RowIndex: scala.Double): Range = js.native
  def Range(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
}

