package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Legend")
@js.native
class Legend protected () extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  var AutoScaleFont: js.Any = js.native
  val Border: ChartBorder = js.native
  val Creator: Double = js.native
  val Fill: ChartFillFormat = js.native
  val Font: ChartFont = js.native
  val Format: ChartFormat = js.native
  var Height: Double = js.native
  var IncludeInLayout: Boolean = js.native
  val Interior: typings.activexPowerpoint.PowerPoint.Interior = js.native
  var Left: Double = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  var Position: XlLegendPosition = js.native
  @JSName("PowerPoint.Legend_typekey")
  var PowerPointDotLegend_typekey: Legend = js.native
  var Shadow: Boolean = js.native
  var Top: Double = js.native
  var Width: Double = js.native
  def Clear(): js.Any = js.native
  def Delete(): js.Any = js.native
  def LegendEntries(): js.Any = js.native
  def LegendEntries(Index: js.Any): js.Any = js.native
  def Select(): js.Any = js.native
}

