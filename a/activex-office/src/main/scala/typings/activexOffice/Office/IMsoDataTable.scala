package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.IMsoDataTable")
@js.native
class IMsoDataTable protected () extends js.Object {
  val Application: js.Any = js.native
  var AutoScaleFont: js.Any = js.native
  val Border: IMsoBorder = js.native
  val Creator: Double = js.native
  val Font: ChartFont = js.native
  val Format: IMsoChartFormat = js.native
  var HasBorderHorizontal: Boolean = js.native
  var HasBorderOutline: Boolean = js.native
  var HasBorderVertical: Boolean = js.native
  @JSName("Office.IMsoDataTable_typekey")
  var OfficeDotIMsoDataTable_typekey: IMsoDataTable = js.native
  val Parent: js.Any = js.native
  var ShowLegendKey: Boolean = js.native
  def Delete(): Unit = js.native
  def Select(): Unit = js.native
}

