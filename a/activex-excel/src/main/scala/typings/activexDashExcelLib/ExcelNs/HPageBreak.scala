package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.HPageBreak")
@js.native
class HPageBreak protected () extends js.Object {
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  val Creator: XlCreator = js.native
  var `Excel.HPageBreak_typekey`: HPageBreak = js.native
  val Extent: XlPageBreakExtent = js.native
  @JSName("Location")
  var Location_Original: Range = js.native
  val Parent: Worksheet = js.native
  var Type: XlPageBreak = js.native
  def Delete(): scala.Unit = js.native
  def DragOff(Direction: XlDirection, RegionIndex: scala.Double): scala.Unit = js.native
  def Location(Address: java.lang.String): Range = js.native
  def Location(RowIndex: scala.Double): Range = js.native
  def Location(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
}

