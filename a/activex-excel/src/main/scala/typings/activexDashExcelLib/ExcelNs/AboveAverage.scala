package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.AboveAverage")
@js.native
class AboveAverage protected () extends js.Object {
  var AboveBelow: XlAboveBelow = js.native
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  @JSName("AppliesTo")
  val AppliesTo_Original: Range = js.native
  @JSName("Borders")
  val Borders_Original: Borders = js.native
  var CalcFor: XlCalcFor = js.native
  val Creator: XlCreator = js.native
  var `Excel.AboveAverage_typekey`: AboveAverage = js.native
  val Font: activexDashExcelLib.ExcelNs.Font = js.native
  val Interior: activexDashExcelLib.ExcelNs.Interior = js.native
  var NumStdDev: scala.Double = js.native
  var NumberFormat: java.lang.String = js.native
  val PTCondition: scala.Boolean = js.native
  val Parent: js.Any = js.native
  var Priority: scala.Double = js.native
  var ScopeType: XlPivotConditionScope = js.native
  var StopIfTrue: scala.Boolean = js.native
  val Type: scala.Double = js.native
  def AppliesTo(Address: java.lang.String): Range = js.native
  def AppliesTo(RowIndex: scala.Double): Range = js.native
  def AppliesTo(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def Borders(Index: XlBordersIndex): Border = js.native
  def Delete(): scala.Unit = js.native
  def ModifyAppliesToRange(Range: Range): scala.Unit = js.native
  def SetFirstPriority(): scala.Unit = js.native
  def SetLastPriority(): scala.Unit = js.native
}

