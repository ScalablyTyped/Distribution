package typings.activexDashExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.AboveAverage")
@js.native
class AboveAverage protected () extends js.Object {
  var AboveBelow: XlAboveBelow = js.native
  val Application: typings.activexDashExcel.Excel.Application = js.native
  @JSName("AppliesTo")
  val AppliesTo_Original: Range = js.native
  @JSName("Borders")
  val Borders_Original: Borders = js.native
  var CalcFor: XlCalcFor = js.native
  val Creator: XlCreator = js.native
  var `Excel.AboveAverage_typekey`: AboveAverage = js.native
  val Font: typings.activexDashExcel.Excel.Font = js.native
  val Interior: typings.activexDashExcel.Excel.Interior = js.native
  var NumStdDev: Double = js.native
  var NumberFormat: String = js.native
  val PTCondition: Boolean = js.native
  val Parent: js.Any = js.native
  var Priority: Double = js.native
  var ScopeType: XlPivotConditionScope = js.native
  var StopIfTrue: Boolean = js.native
  val Type: Double = js.native
  def AppliesTo(Address: String): Range = js.native
  def AppliesTo(RowIndex: Double): Range = js.native
  def AppliesTo(RowIndex: Double, ColumnIndex: Double): Range = js.native
  def Borders(Index: XlBordersIndex): Border = js.native
  def Delete(): Unit = js.native
  def ModifyAppliesToRange(Range: Range): Unit = js.native
  def SetFirstPriority(): Unit = js.native
  def SetLastPriority(): Unit = js.native
}

