package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.FormatCondition")
@js.native
class FormatCondition protected () extends js.Object {
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  @JSName("AppliesTo")
  val AppliesTo_Original: Range = js.native
  @JSName("Borders")
  val Borders_Original: Borders = js.native
  val Creator: XlCreator = js.native
  var DateOperator: XlTimePeriods = js.native
  var `Excel.FormatCondition_typekey`: FormatCondition = js.native
  val Font: activexDashExcelLib.ExcelNs.Font = js.native
  val Formula1: java.lang.String = js.native
  val Formula2: java.lang.String = js.native
  val Interior: activexDashExcelLib.ExcelNs.Interior = js.native
  var NumberFormat: java.lang.String = js.native
  val Operator: scala.Double = js.native
  val PTCondition: scala.Boolean = js.native
  val Parent: js.Any = js.native
  var Priority: scala.Double = js.native
  var ScopeType: XlPivotConditionScope = js.native
  var StopIfTrue: scala.Boolean = js.native
  var Text: java.lang.String = js.native
  var TextOperator: XlContainsOperator = js.native
  val Type: scala.Double = js.native
  def AppliesTo(Address: java.lang.String): Range = js.native
  def AppliesTo(RowIndex: scala.Double): Range = js.native
  def AppliesTo(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def Borders(Index: XlBordersIndex): Border = js.native
  def Delete(): scala.Unit = js.native
  def Modify(Type: XlFormatConditionType): scala.Unit = js.native
  def Modify(Type: XlFormatConditionType, Operator: XlFormatConditionOperator): scala.Unit = js.native
  def Modify(Type: XlFormatConditionType, Operator: XlFormatConditionOperator, Formula1: java.lang.String): scala.Unit = js.native
  def Modify(
    Type: XlFormatConditionType,
    Operator: XlFormatConditionOperator,
    Formula1: java.lang.String,
    Formula2: java.lang.String
  ): scala.Unit = js.native
  def Modify(
    Type: XlFormatConditionType,
    Operator: XlFormatConditionOperator,
    Formula1: java.lang.String,
    Formula2: java.lang.String,
    String: js.Any
  ): scala.Unit = js.native
  def Modify(
    Type: XlFormatConditionType,
    Operator: XlFormatConditionOperator,
    Formula1: java.lang.String,
    Formula2: java.lang.String,
    String: js.Any,
    Operator2: js.Any
  ): scala.Unit = js.native
  def Modify(Type: XlFormatConditionType, Operator: js.UndefOr[scala.Nothing], Formula1: java.lang.String): scala.Unit = js.native
  def ModifyAppliesToRange(Range: Range): scala.Unit = js.native
  def SetFirstPriority(): scala.Unit = js.native
  def SetLastPriority(): scala.Unit = js.native
  def _Modify(Type: XlFormatConditionType): scala.Unit = js.native
  def _Modify(Type: XlFormatConditionType, Operator: js.Any): scala.Unit = js.native
  def _Modify(Type: XlFormatConditionType, Operator: js.Any, Formula1: js.Any): scala.Unit = js.native
  def _Modify(Type: XlFormatConditionType, Operator: js.Any, Formula1: js.Any, Formula2: js.Any): scala.Unit = js.native
}

