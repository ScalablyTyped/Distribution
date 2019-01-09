package typings
package activexDashExcelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AddressColumnIndexRowIndex extends js.Object {
  val Sh: activexDashExcelLib.ExcelNs.Worksheet = js.native
  val TargetPivotTable: activexDashExcelLib.ExcelNs.PivotTable = js.native
  @JSName("TargetRange")
  val TargetRange_Original: activexDashExcelLib.ExcelNs.Range = js.native
  def TargetRange(Address: java.lang.String): activexDashExcelLib.ExcelNs.Range = js.native
  def TargetRange(RowIndex: scala.Double): activexDashExcelLib.ExcelNs.Range = js.native
  def TargetRange(RowIndex: scala.Double, ColumnIndex: scala.Double): activexDashExcelLib.ExcelNs.Range = js.native
}

