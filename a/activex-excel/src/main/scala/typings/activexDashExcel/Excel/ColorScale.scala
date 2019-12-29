package typings.activexDashExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.ColorScale")
@js.native
class ColorScale protected () extends js.Object {
  val Application: typings.activexDashExcel.Excel.Application = js.native
  @JSName("AppliesTo")
  val AppliesTo_Original: Range = js.native
  @JSName("ColorScaleCriteria")
  val ColorScaleCriteria_Original: ColorScaleCriteria = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.ColorScale_typekey")
  var ExcelDotColorScale_typekey: ColorScale = js.native
  var Formula: String = js.native
  val PTCondition: Boolean = js.native
  val Parent: js.Any = js.native
  var Priority: Double = js.native
  var ScopeType: XlPivotConditionScope = js.native
  val StopIfTrue: Boolean = js.native
  val Type: Double = js.native
  def AppliesTo(Address: String): Range = js.native
  def AppliesTo(RowIndex: Double): Range = js.native
  def AppliesTo(RowIndex: Double, ColumnIndex: Double): Range = js.native
  def ColorScaleCriteria(Index: Double): ColorScaleCriterion = js.native
  def Delete(): Unit = js.native
  def ModifyAppliesToRange(Range: Range): Unit = js.native
  def SetFirstPriority(): Unit = js.native
  def SetLastPriority(): Unit = js.native
}

