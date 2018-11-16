package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Legend")
@js.native
class Legend protected () extends js.Object {
  val Application: Application = js.native
  var AutoScaleFont: js.Any = js.native
  val Border: Border = js.native
  val Creator: XlCreator = js.native
  var `Excel.Legend_typekey`: Legend = js.native
  val Fill: ChartFillFormat = js.native
  val Font: Font = js.native
  val Format: ChartFormat = js.native
  var Height: scala.Double = js.native
  var IncludeInLayout: scala.Boolean = js.native
  val Interior: Interior = js.native
  var Left: scala.Double = js.native
  @JSName("LegendEntries")
  var LegendEntries_Original: LegendEntries with (js.Function1[/* Index */ scala.Double, LegendEntry]) = js.native
  val Name: java.lang.String = js.native
  val Parent: js.Any = js.native
  var Position: XlLegendPosition = js.native
  var Shadow: scala.Boolean = js.native
  var Top: scala.Double = js.native
  var Width: scala.Double = js.native
  def Clear(): js.Any = js.native
  def Delete(): js.Any = js.native
  def LegendEntries(Index: scala.Double): LegendEntry = js.native
  def Select(): js.Any = js.native
}

