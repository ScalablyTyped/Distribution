package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Sparkline")
@js.native
class Sparkline protected () extends js.Object {
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  val Creator: XlCreator = js.native
  var `Excel.Sparkline_typekey`: Sparkline = js.native
  @JSName("Location")
  var Location_Original: Range = js.native
  val Parent: js.Any = js.native
  var SourceData: java.lang.String = js.native
  def Location(Address: java.lang.String): Range = js.native
  def Location(RowIndex: scala.Double): Range = js.native
  def Location(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def ModifyLocation(Range: Range): scala.Unit = js.native
  def ModifySourceData(Formula: java.lang.String): scala.Unit = js.native
}

