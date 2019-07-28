package typings.activexDashExcel.ExcelNs

import typings.activexDashExcel.activexDashExcelNumbers.`1`
import typings.activexDashExcel.activexDashExcelNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.FormatCondition")
@js.native
class FormatCondition protected () extends js.Object {
  val Application: typings.activexDashExcel.ExcelNs.Application = js.native
  @JSName("AppliesTo")
  val AppliesTo_Original: Range = js.native
  @JSName("Borders")
  val Borders_Original: Borders = js.native
  val Creator: XlCreator = js.native
  var DateOperator: XlTimePeriods = js.native
  var `Excel.FormatCondition_typekey`: FormatCondition = js.native
  val Font: typings.activexDashExcel.ExcelNs.Font = js.native
  val Formula1: String = js.native
  val Formula2: String = js.native
  val Interior: typings.activexDashExcel.ExcelNs.Interior = js.native
  var NumberFormat: String = js.native
  val Operator: Double = js.native
  val PTCondition: Boolean = js.native
  val Parent: js.Any = js.native
  var Priority: Double = js.native
  var ScopeType: XlPivotConditionScope = js.native
  var StopIfTrue: Boolean = js.native
  var Text: String = js.native
  var TextOperator: XlContainsOperator = js.native
  val Type: Double = js.native
  def AppliesTo(Address: String): Range = js.native
  def AppliesTo(RowIndex: Double): Range = js.native
  def AppliesTo(RowIndex: Double, ColumnIndex: Double): Range = js.native
  def Borders(Index: XlBordersIndex): Border = js.native
  def Delete(): Unit = js.native
  def Modify(Type: XlFormatConditionType): Unit = js.native
  def Modify(Type: XlFormatConditionType, Operator: XlFormatConditionOperator): Unit = js.native
  def Modify(Type: XlFormatConditionType, Operator: XlFormatConditionOperator, Formula1: String): Unit = js.native
  def Modify(
    Type: XlFormatConditionType,
    Operator: XlFormatConditionOperator,
    Formula1: String,
    Formula2: String
  ): Unit = js.native
  def Modify(
    Type: XlFormatConditionType,
    Operator: XlFormatConditionOperator,
    Formula1: String,
    Formula2: String,
    String: js.Any
  ): Unit = js.native
  def Modify(
    Type: XlFormatConditionType,
    Operator: XlFormatConditionOperator,
    Formula1: String,
    Formula2: String,
    String: js.Any,
    Operator2: js.Any
  ): Unit = js.native
  def ModifyAppliesToRange(Range: Range): Unit = js.native
  @JSName("Modify")
  def Modify_1(Type: XlFormatConditionType, Operator: `1`, Formula1: String, Formula2: String): Unit = js.native
  @JSName("Modify")
  def Modify_2(Type: XlFormatConditionType, Operator: `2`, Formula1: String, Formula2: String): Unit = js.native
  @JSName("Modify")
  def Modify_2(Type: `2`, Operator: js.UndefOr[scala.Nothing], Formula1: String): Unit = js.native
  def SetFirstPriority(): Unit = js.native
  def SetLastPriority(): Unit = js.native
  def _Modify(Type: XlFormatConditionType): Unit = js.native
  def _Modify(Type: XlFormatConditionType, Operator: js.Any): Unit = js.native
  def _Modify(Type: XlFormatConditionType, Operator: js.Any, Formula1: js.Any): Unit = js.native
  def _Modify(Type: XlFormatConditionType, Operator: js.Any, Formula1: js.Any, Formula2: js.Any): Unit = js.native
}

