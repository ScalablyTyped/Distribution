package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.IMsoChartTitle")
@js.native
class IMsoChartTitle protected () extends js.Object {
  val Application: js.Any = js.native
  var AutoScaleFont: js.Any = js.native
  val Border: IMsoBorder = js.native
  var Caption: String = js.native
  val Creator: Double = js.native
  val Fill: ChartFillFormat = js.native
  val Font: ChartFont = js.native
  val Format: IMsoChartFormat = js.native
  var Formula: String = js.native
  var FormulaLocal: String = js.native
  var FormulaR1C1: String = js.native
  var FormulaR1C1Local: String = js.native
  val Height: Double = js.native
  var HorizontalAlignment: js.Any = js.native
  var IncludeInLayout: Boolean = js.native
  val Interior: IMsoInterior = js.native
  var Left: Double = js.native
  val Name: String = js.native
  @JSName("Office.IMsoChartTitle_typekey")
  var OfficeDotIMsoChartTitle_typekey: IMsoChartTitle = js.native
  var Orientation: js.Any = js.native
  val Parent: js.Any = js.native
  var Position: XlChartElementPosition = js.native
  var ReadingOrder: Double = js.native
  var Shadow: Boolean = js.native
  var Text: String = js.native
  var Top: Double = js.native
  var VerticalAlignment: js.Any = js.native
  val Width: Double = js.native
  def Characters(): IMsoCharacters = js.native
  def Characters(Start: js.Any): IMsoCharacters = js.native
  def Characters(Start: js.Any, Length: js.Any): IMsoCharacters = js.native
  def Delete(): js.Any = js.native
  def Select(): js.Any = js.native
}

