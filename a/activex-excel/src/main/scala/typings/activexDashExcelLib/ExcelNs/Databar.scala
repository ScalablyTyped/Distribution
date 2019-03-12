package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Databar")
@js.native
class Databar protected () extends js.Object {
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  @JSName("AppliesTo")
  val AppliesTo_Original: Range = js.native
  val AxisColor: FormatColor = js.native
  var AxisPosition: XlDataBarAxisPosition = js.native
  val BarBorder: DataBarBorder = js.native
  val BarColor: FormatColor = js.native
  var BarFillType: XlDataBarFillType = js.native
  val Creator: XlCreator = js.native
  var Direction: scala.Double = js.native
  var `Excel.Databar_typekey`: Databar = js.native
  var Formula: java.lang.String = js.native
  val MaxPoint: ConditionValue = js.native
  val MinPoint: ConditionValue = js.native
  val NegativeBarFormat: activexDashExcelLib.ExcelNs.NegativeBarFormat = js.native
  val PTCondition: scala.Boolean = js.native
  val Parent: js.Any = js.native
  var PercentMax: scala.Double = js.native
  var PercentMin: scala.Double = js.native
  var Priority: scala.Double = js.native
  var ScopeType: XlPivotConditionScope = js.native
  var ShowValue: scala.Boolean = js.native
  val StopIfTrue: scala.Boolean = js.native
  val Type: scala.Double = js.native
  def AppliesTo(Address: java.lang.String): Range = js.native
  def AppliesTo(RowIndex: scala.Double): Range = js.native
  def AppliesTo(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def Delete(): scala.Unit = js.native
  def ModifyAppliesToRange(Range: Range): scala.Unit = js.native
  def SetFirstPriority(): scala.Unit = js.native
  def SetLastPriority(): scala.Unit = js.native
}

