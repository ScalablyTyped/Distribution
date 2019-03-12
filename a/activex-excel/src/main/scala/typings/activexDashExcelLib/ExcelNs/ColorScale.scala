package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.ColorScale")
@js.native
class ColorScale protected () extends js.Object {
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  @JSName("AppliesTo")
  val AppliesTo_Original: Range = js.native
  @JSName("ColorScaleCriteria")
  val ColorScaleCriteria_Original: ColorScaleCriteria = js.native
  val Creator: XlCreator = js.native
  var `Excel.ColorScale_typekey`: ColorScale = js.native
  var Formula: java.lang.String = js.native
  val PTCondition: scala.Boolean = js.native
  val Parent: js.Any = js.native
  var Priority: scala.Double = js.native
  var ScopeType: XlPivotConditionScope = js.native
  val StopIfTrue: scala.Boolean = js.native
  val Type: scala.Double = js.native
  def AppliesTo(Address: java.lang.String): Range = js.native
  def AppliesTo(RowIndex: scala.Double): Range = js.native
  def AppliesTo(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def ColorScaleCriteria(Index: scala.Double): ColorScaleCriterion = js.native
  def Delete(): scala.Unit = js.native
  def ModifyAppliesToRange(Range: Range): scala.Unit = js.native
  def SetFirstPriority(): scala.Unit = js.native
  def SetLastPriority(): scala.Unit = js.native
}

