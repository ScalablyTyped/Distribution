package typings.activexExcel.Excel

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotField extends js.Object {
  
  def AddPageItem(Item: String): Unit = js.native
  def AddPageItem(Item: String, ClearList: Boolean): Unit = js.native
  
  val AllItemsVisible: Boolean = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  def AutoShow(Type: Double, Range: Double, Count: Double, Field: String): Unit = js.native
  
  val AutoShowCount: Double = js.native
  
  val AutoShowField: String = js.native
  
  val AutoShowRange: Double = js.native
  
  val AutoShowType: Double = js.native
  
  def AutoSort(Order: Double, Field: String): Unit = js.native
  def AutoSort(Order: Double, Field: String, PivotLine: js.UndefOr[scala.Nothing], CustomSubtotal: js.Any): Unit = js.native
  def AutoSort(Order: Double, Field: String, PivotLine: js.Any): Unit = js.native
  def AutoSort(Order: Double, Field: String, PivotLine: js.Any, CustomSubtotal: js.Any): Unit = js.native
  
  val AutoSortCustomSubtotal: Double = js.native
  
  val AutoSortField: String = js.native
  
  val AutoSortOrder: Double = js.native
  
  val AutoSortPivotLine: PivotLine = js.native
  
  var BaseField: js.Any = js.native
  
  var BaseItem: js.Any = js.native
  
  def CalculatedItems(): typings.activexExcel.Excel.CalculatedItems = js.native
  
  var Calculation: XlPivotFieldCalculation = js.native
  
  var Caption: String = js.native
  
  val ChildField: PivotField = js.native
  
  def ChildItems(Indexes: SafeArray[Double | String]): PivotItems = js.native
  def ChildItems(Index: String): PivotItem = js.native
  def ChildItems(Index: Double): PivotItem = js.native
  
  def ClearAllFilters(): Unit = js.native
  
  def ClearLabelFilters(): Unit = js.native
  
  def ClearManualFilter(): Unit = js.native
  
  def ClearValueFilters(): Unit = js.native
  
  val Creator: XlCreator = js.native
  
  val CubeField: typings.activexExcel.Excel.CubeField = js.native
  
  var CurrentPage: PivotItem = js.native
  
  var CurrentPageList: SafeArray[String] = js.native
  
  var CurrentPageName: String = js.native
  
  def DataRange(Address: String): Range = js.native
  def DataRange(RowIndex: Double): Range = js.native
  def DataRange(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("DataRange")
  val DataRange_Original: Range = js.native
  
  val DataType: XlPivotFieldDataType = js.native
  
  var DatabaseSort: Boolean = js.native
  
  def Delete(): Unit = js.native
  
  val DisplayAsCaption: Boolean = js.native
  
  var DisplayAsTooltip: Boolean = js.native
  
  var DisplayInReport: Boolean = js.native
  
  var DragToColumn: Boolean = js.native
  
  var DragToData: Boolean = js.native
  
  var DragToHide: Boolean = js.native
  
  var DragToPage: Boolean = js.native
  
  var DragToRow: Boolean = js.native
  
  def DrillTo(Field: String): Unit = js.native
  
  var DrilledDown: Boolean = js.native
  
  var EnableItemSelection: Boolean = js.native
  
  var EnableMultiplePageItems: Boolean = js.native
  
  @JSName("Excel.PivotField_typekey")
  var ExcelDotPivotField_typekey: PivotField = js.native
  
  var Formula: String = js.native
  
  var Function: XlConsolidationFunction = js.native
  
  val GroupLevel: Double = js.native
  
  var Hidden: Boolean = js.native
  
  def HiddenItems(Indexes: SafeArray[Double | String]): PivotItems = js.native
  def HiddenItems(Index: String): PivotItem = js.native
  def HiddenItems(Index: Double): PivotItem = js.native
  
  var HiddenItemsList: SafeArray[String] = js.native
  
  var IncludeNewItemsInFilter: Boolean = js.native
  
  val IsCalculated: Boolean = js.native
  
  val IsMemberProperty: Boolean = js.native
  
  def LabelRange(Address: String): Range = js.native
  def LabelRange(RowIndex: Double): Range = js.native
  def LabelRange(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("LabelRange")
  val LabelRange_Original: Range = js.native
  
  var LayoutBlankLine: Boolean = js.native
  
  var LayoutCompactRow: Boolean = js.native
  
  var LayoutForm: XlLayoutFormType = js.native
  
  var LayoutPageBreak: Boolean = js.native
  
  var LayoutSubtotalLocation: XlSubtototalLocationType = js.native
  
  var MemberPropertyCaption: String = js.native
  
  val MemoryUsed: Double = js.native
  
  var Name: String = js.native
  
  var NumberFormat: String = js.native
  
  var Orientation: XlPivotFieldOrientation = js.native
  
  val Parent: js.Any = js.native
  
  val ParentField: PivotField = js.native
  
  def ParentItems(Indexes: SafeArray[Double | String]): PivotItems = js.native
  def ParentItems(Index: String): PivotItem = js.native
  def ParentItems(Index: Double): PivotItem = js.native
  
  def PivotFilters(Index: Double): PivotFilter = js.native
  @JSName("PivotFilters")
  val PivotFilters_Original: PivotFilters = js.native
  
  def PivotItems(Indexes: SafeArray[Double | String]): typings.activexExcel.Excel.PivotItems = js.native
  def PivotItems(Index: String): PivotItem = js.native
  def PivotItems(Index: Double): PivotItem = js.native
  
  var Position: js.Any = js.native
  
  var PropertyOrder: Double = js.native
  
  val PropertyParentField: PivotField = js.native
  
  var RepeatLabels: Boolean = js.native
  
  var ServerBased: Boolean = js.native
  
  var ShowAllItems: Boolean = js.native
  
  var ShowDetail: Boolean = js.native
  
  val ShowingInAxis: Boolean = js.native
  
  val SourceCaption: String = js.native
  
  val SourceName: String = js.native
  
  var StandardFormula: String = js.native
  
  var SubtotalName: String = js.native
  
  def Subtotals(Index: PivotFieldSubtotal): Boolean = js.native
  
  val TotalLevels: Double = js.native
  
  var UseMemberPropertyAsCaption: Boolean = js.native
  
  var Value: String = js.native
  
  def VisibleItems(Indexes: SafeArray[Double | String]): PivotItems = js.native
  def VisibleItems(Index: String): PivotItem = js.native
  def VisibleItems(Index: Double): PivotItem = js.native
  
  var VisibleItemsList: SafeArray[String] = js.native
  
  def _AutoSort(Order: Double, Field: String): Unit = js.native
  
  var _Default: String = js.native
}
