package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.IconSetCondition")
@js.native
class IconSetCondition protected () extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  @JSName("AppliesTo")
  val AppliesTo_Original: Range = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.IconSetCondition_typekey")
  var ExcelDotIconSetCondition_typekey: IconSetCondition = js.native
  var Formula: String = js.native
  @JSName("IconCriteria")
  val IconCriteria_Original: IconCriteria = js.native
  @JSName("IconSet")
  var IconSet_Original: IconSets = js.native
  val PTCondition: Boolean = js.native
  val Parent: js.Any = js.native
  var PercentileValues: Boolean = js.native
  var Priority: Double = js.native
  var ReverseOrder: Boolean = js.native
  var ScopeType: XlPivotConditionScope = js.native
  var ShowIconOnly: Boolean = js.native
  val StopIfTrue: Boolean = js.native
  val Type: Double = js.native
  def AppliesTo(Address: String): Range = js.native
  def AppliesTo(RowIndex: Double): Range = js.native
  def AppliesTo(RowIndex: Double, ColumnIndex: Double): Range = js.native
  def Delete(): Unit = js.native
  def IconCriteria(Index: Double): IconCriterion = js.native
  def IconSet(Index: Double): typings.activexExcel.Excel.IconSet = js.native
  def ModifyAppliesToRange(Range: Range): Unit = js.native
  def SetFirstPriority(): Unit = js.native
  def SetLastPriority(): Unit = js.native
}

