package typings.activexDashExcel.Excel

import typings.activexDashExcel.activexDashExcelNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.UniqueValues")
@js.native
class UniqueValues protected () extends js.Object {
  val Application: typings.activexDashExcel.Excel.Application = js.native
  @JSName("AppliesTo")
  val AppliesTo_Original: Range = js.native
  @JSName("Borders")
  val Borders_Original: Borders = js.native
  val Creator: XlCreator = js.native
  var DupeUnique: XlDupeUnique = js.native
  @JSName("Excel.UniqueValues_typekey")
  var ExcelDotUniqueValues_typekey: UniqueValues = js.native
  val Font: typings.activexDashExcel.Excel.Font = js.native
  val Interior: typings.activexDashExcel.Excel.Interior = js.native
  var NumberFormat: String = js.native
  val PTCondition: Boolean = js.native
  val Parent: js.Any = js.native
  var Priority: Double = js.native
  var ScopeType: XlPivotConditionScope = js.native
  var StopIfTrue: Boolean = js.native
  val Type: `8` = js.native
  def AppliesTo(Address: String): Range = js.native
  def AppliesTo(RowIndex: Double): Range = js.native
  def AppliesTo(RowIndex: Double, ColumnIndex: Double): Range = js.native
  def Borders(Index: XlBordersIndex): Border = js.native
  def Delete(): Unit = js.native
  def ModifyAppliesToRange(Range: Range): Unit = js.native
  def SetFirstPriority(): Unit = js.native
  def SetLastPriority(): Unit = js.native
}

