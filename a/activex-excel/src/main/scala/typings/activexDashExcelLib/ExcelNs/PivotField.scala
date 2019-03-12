package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.PivotField")
@js.native
class PivotField protected () extends js.Object {
  val AllItemsVisible: scala.Boolean = js.native
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  val AutoShowCount: scala.Double = js.native
  val AutoShowField: java.lang.String = js.native
  val AutoShowRange: scala.Double = js.native
  val AutoShowType: scala.Double = js.native
  val AutoSortCustomSubtotal: scala.Double = js.native
  val AutoSortField: java.lang.String = js.native
  val AutoSortOrder: scala.Double = js.native
  val AutoSortPivotLine: PivotLine = js.native
  var BaseField: js.Any = js.native
  var BaseItem: js.Any = js.native
  var Calculation: XlPivotFieldCalculation = js.native
  var Caption: java.lang.String = js.native
  val ChildField: PivotField = js.native
  val Creator: XlCreator = js.native
  val CubeField: activexDashExcelLib.ExcelNs.CubeField = js.native
  var CurrentPage: PivotItem = js.native
  var CurrentPageList: stdLib.SafeArray[java.lang.String] = js.native
  var CurrentPageName: java.lang.String = js.native
  @JSName("DataRange")
  val DataRange_Original: Range = js.native
  val DataType: XlPivotFieldDataType = js.native
  var DatabaseSort: scala.Boolean = js.native
  val DisplayAsCaption: scala.Boolean = js.native
  var DisplayAsTooltip: scala.Boolean = js.native
  var DisplayInReport: scala.Boolean = js.native
  var DragToColumn: scala.Boolean = js.native
  var DragToData: scala.Boolean = js.native
  var DragToHide: scala.Boolean = js.native
  var DragToPage: scala.Boolean = js.native
  var DragToRow: scala.Boolean = js.native
  var DrilledDown: scala.Boolean = js.native
  var EnableItemSelection: scala.Boolean = js.native
  var EnableMultiplePageItems: scala.Boolean = js.native
  var `Excel.PivotField_typekey`: PivotField = js.native
  var Formula: java.lang.String = js.native
  var Function: XlConsolidationFunction = js.native
  val GroupLevel: scala.Double = js.native
  var Hidden: scala.Boolean = js.native
  var HiddenItemsList: stdLib.SafeArray[java.lang.String] = js.native
  var IncludeNewItemsInFilter: scala.Boolean = js.native
  val IsCalculated: scala.Boolean = js.native
  val IsMemberProperty: scala.Boolean = js.native
  @JSName("LabelRange")
  val LabelRange_Original: Range = js.native
  var LayoutBlankLine: scala.Boolean = js.native
  var LayoutCompactRow: scala.Boolean = js.native
  var LayoutForm: XlLayoutFormType = js.native
  var LayoutPageBreak: scala.Boolean = js.native
  var LayoutSubtotalLocation: XlSubtototalLocationType = js.native
  var MemberPropertyCaption: java.lang.String = js.native
  val MemoryUsed: scala.Double = js.native
  var Name: java.lang.String = js.native
  var NumberFormat: java.lang.String = js.native
  var Orientation: XlPivotFieldOrientation = js.native
  val Parent: js.Any = js.native
  val ParentField: PivotField = js.native
  @JSName("PivotFilters")
  val PivotFilters_Original: PivotFilters = js.native
  var Position: js.Any = js.native
  var PropertyOrder: scala.Double = js.native
  val PropertyParentField: PivotField = js.native
  var RepeatLabels: scala.Boolean = js.native
  var ServerBased: scala.Boolean = js.native
  var ShowAllItems: scala.Boolean = js.native
  var ShowDetail: scala.Boolean = js.native
  val ShowingInAxis: scala.Boolean = js.native
  val SourceCaption: java.lang.String = js.native
  val SourceName: java.lang.String = js.native
  var StandardFormula: java.lang.String = js.native
  var SubtotalName: java.lang.String = js.native
  val TotalLevels: scala.Double = js.native
  var UseMemberPropertyAsCaption: scala.Boolean = js.native
  var Value: java.lang.String = js.native
  var VisibleItemsList: stdLib.SafeArray[java.lang.String] = js.native
  var _Default: java.lang.String = js.native
  def AddPageItem(Item: java.lang.String): scala.Unit = js.native
  def AddPageItem(Item: java.lang.String, ClearList: scala.Boolean): scala.Unit = js.native
  def AutoShow(Type: scala.Double, Range: scala.Double, Count: scala.Double, Field: java.lang.String): scala.Unit = js.native
  def AutoSort(Order: scala.Double, Field: java.lang.String): scala.Unit = js.native
  def AutoSort(Order: scala.Double, Field: java.lang.String, PivotLine: js.Any): scala.Unit = js.native
  def AutoSort(Order: scala.Double, Field: java.lang.String, PivotLine: js.Any, CustomSubtotal: js.Any): scala.Unit = js.native
  def CalculatedItems(): activexDashExcelLib.ExcelNs.CalculatedItems = js.native
  def ChildItems(Indexes: stdLib.SafeArray[scala.Double | java.lang.String]): PivotItems = js.native
  def ChildItems(Index: java.lang.String): PivotItem = js.native
  def ChildItems(Index: scala.Double): PivotItem = js.native
  def ClearAllFilters(): scala.Unit = js.native
  def ClearLabelFilters(): scala.Unit = js.native
  def ClearManualFilter(): scala.Unit = js.native
  def ClearValueFilters(): scala.Unit = js.native
  def DataRange(Address: java.lang.String): Range = js.native
  def DataRange(RowIndex: scala.Double): Range = js.native
  def DataRange(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def Delete(): scala.Unit = js.native
  def DrillTo(Field: java.lang.String): scala.Unit = js.native
  def HiddenItems(Indexes: stdLib.SafeArray[scala.Double | java.lang.String]): PivotItems = js.native
  def HiddenItems(Index: java.lang.String): PivotItem = js.native
  def HiddenItems(Index: scala.Double): PivotItem = js.native
  def LabelRange(Address: java.lang.String): Range = js.native
  def LabelRange(RowIndex: scala.Double): Range = js.native
  def LabelRange(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def ParentItems(Indexes: stdLib.SafeArray[scala.Double | java.lang.String]): PivotItems = js.native
  def ParentItems(Index: java.lang.String): PivotItem = js.native
  def ParentItems(Index: scala.Double): PivotItem = js.native
  def PivotFilters(Index: scala.Double): PivotFilter = js.native
  def PivotItems(Indexes: stdLib.SafeArray[scala.Double | java.lang.String]): activexDashExcelLib.ExcelNs.PivotItems = js.native
  def PivotItems(Index: java.lang.String): PivotItem = js.native
  def PivotItems(Index: scala.Double): PivotItem = js.native
  def Subtotals(Index: PivotFieldSubtotal): scala.Boolean = js.native
  def VisibleItems(Indexes: stdLib.SafeArray[scala.Double | java.lang.String]): PivotItems = js.native
  def VisibleItems(Index: java.lang.String): PivotItem = js.native
  def VisibleItems(Index: scala.Double): PivotItem = js.native
  def _AutoSort(Order: scala.Double, Field: java.lang.String): scala.Unit = js.native
}

