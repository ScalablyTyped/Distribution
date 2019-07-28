package typings.activexDashExcel.ExcelNs

import typings.std.SafeArray
import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.PivotTable")
@js.native
class PivotTable protected () extends js.Object {
  @JSName("ActiveFilters")
  val ActiveFilters_Original: PivotFilters = js.native
  var Allocation: XlAllocation = js.native
  var AllocationMethod: XlAllocationMethod = js.native
  var AllocationValue: XlAllocationValue = js.native
  var AllocationWeightExpression: String = js.native
  var AllowMultipleFilters: Boolean = js.native
  var AlternativeText: String = js.native
  val Application: typings.activexDashExcel.ExcelNs.Application = js.native
  var CacheIndex: Double = js.native
  var CalculatedMembersInFilters: Boolean = js.native
  @JSName("CalculatedMembers")
  val CalculatedMembers_Original: CalculatedMembers = js.native
  @JSName("ChangeList")
  val ChangeList_Original: PivotTableChangeList = js.native
  @JSName("ColumnFields")
  var ColumnFields_Original: PivotFieldsResult = js.native
  var ColumnGrand: Boolean = js.native
  @JSName("ColumnRange")
  val ColumnRange_Original: Range = js.native
  var CompactLayoutColumnHeader: String = js.native
  var CompactLayoutRowHeader: String = js.native
  var CompactRowIndent: Double = js.native
  val Creator: XlCreator = js.native
  @JSName("CubeFields")
  val CubeFields_Original: CubeFields = js.native
  @JSName("DataBodyRange")
  val DataBodyRange_Original: Range = js.native
  @JSName("DataFields")
  var DataFields_Original: PivotFieldsResult = js.native
  @JSName("DataLabelRange")
  val DataLabelRange_Original: Range = js.native
  val DataPivotField: PivotField = js.native
  var DisplayContextTooltips: Boolean = js.native
  var DisplayEmptyColumn: Boolean = js.native
  var DisplayEmptyRow: Boolean = js.native
  var DisplayErrorString: Boolean = js.native
  var DisplayFieldCaptions: Boolean = js.native
  var DisplayImmediateItems: Boolean = js.native
  var DisplayMemberPropertyTooltips: Boolean = js.native
  var DisplayNullString: Boolean = js.native
  var EnableDataValueEditing: Boolean = js.native
  var EnableDrilldown: Boolean = js.native
  var EnableFieldDialog: Boolean = js.native
  var EnableFieldList: Boolean = js.native
  var EnableWizard: Boolean = js.native
  var EnableWriteback: Boolean = js.native
  var ErrorString: String = js.native
  var `Excel.PivotTable_typekey`: PivotTable = js.native
  var FieldListSortAscending: Boolean = js.native
  var GrandTotalName: String = js.native
  var HasAutoFormat: Boolean = js.native
  @JSName("HiddenFields")
  var HiddenFields_Original: PivotFieldsResult = js.native
  var InGridDropZones: Boolean = js.native
  var InnerDetail: String = js.native
  var LayoutRowDefault: XlLayoutRowType = js.native
  var Location: String = js.native
  val MDX: String = js.native
  var ManualUpdate: Boolean = js.native
  var MergeLabels: Boolean = js.native
  var Name: String = js.native
  var NullString: String = js.native
  var PageFieldOrder: Double = js.native
  var PageFieldStyle: String = js.native
  var PageFieldWrapCount: Double = js.native
  @JSName("PageFields")
  var PageFields_Original: PivotFieldsResult = js.native
  @JSName("PageRangeCells")
  val PageRangeCells_Original: Range = js.native
  @JSName("PageRange")
  val PageRange_Original: Range = js.native
  val Parent: js.Any = js.native
  val PivotColumnAxis: PivotAxis = js.native
  @JSName("PivotFields")
  var PivotFields_Original: PivotFieldsResult = js.native
  @JSName("PivotFormulas")
  val PivotFormulas_Original: PivotFormulas = js.native
  val PivotRowAxis: PivotAxis = js.native
  var PivotSelection: String = js.native
  var PivotSelectionStandard: String = js.native
  var PreserveFormatting: Boolean = js.native
  var PrintDrillIndicators: Boolean = js.native
  var PrintTitles: Boolean = js.native
  val RefreshDate: VarDate = js.native
  val RefreshName: String = js.native
  var RepeatItemsOnEachPrintedPage: Boolean = js.native
  @JSName("RowFields")
  var RowFields_Original: PivotFieldsResult = js.native
  var RowGrand: Boolean = js.native
  @JSName("RowRange")
  val RowRange_Original: Range = js.native
  var SaveData: Boolean = js.native
  var SelectionMode: XlPTSelectionMode = js.native
  var ShowCellBackgroundFromOLAP: Boolean = js.native
  var ShowDrillIndicators: Boolean = js.native
  var ShowPageMultipleItemLabel: Boolean = js.native
  var ShowTableStyleColumnHeaders: Boolean = js.native
  var ShowTableStyleColumnStripes: Boolean = js.native
  var ShowTableStyleLastColumn: Boolean = js.native
  var ShowTableStyleRowHeaders: Boolean = js.native
  var ShowTableStyleRowStripes: Boolean = js.native
  var ShowValuesRow: Boolean = js.native
  @JSName("Slicers")
  val Slicers_Original: Slicers = js.native
  var SmallGrid: Boolean = js.native
  var SortUsingCustomLists: Boolean = js.native
  var SourceData: js.Any = js.native
  var SubtotalHiddenPageItems: Boolean = js.native
  var Summary: String = js.native
  @JSName("TableRange1")
  val TableRange1_Original: Range = js.native
  @JSName("TableRange2")
  val TableRange2_Original: Range = js.native
  var TableStyle: String = js.native
  var TableStyle2: js.Any = js.native
  var Tag: String = js.native
  var TotalsAnnotation: Boolean = js.native
  var VacatedStyle: String = js.native
  var Value: String = js.native
  val Version: XlPivotTableVersionList = js.native
  var ViewCalculatedMembers: Boolean = js.native
  @JSName("VisibleFields")
  var VisibleFields_Original: PivotFieldsResult = js.native
  var VisualTotals: Boolean = js.native
  var VisualTotalsForSets: Boolean = js.native
  var _Default: String = js.native
  def ActiveFilters(Index: Double): PivotFilter = js.native
  def AddDataField(Field: js.Any): PivotField = js.native
  def AddDataField(Field: js.Any, Caption: js.Any): PivotField = js.native
  def AddDataField(Field: js.Any, Caption: js.Any, Function: js.Any): PivotField = js.native
  def AddFields(): js.Any = js.native
  def AddFields(RowFields: String): js.Any = js.native
  def AddFields(RowFields: String, ColumnFields: String): js.Any = js.native
  def AddFields(RowFields: String, ColumnFields: String, PageFields: String): js.Any = js.native
  def AddFields(RowFields: String, ColumnFields: String, PageFields: String, AddToTable: Boolean): js.Any = js.native
  def AddFields(RowFields: String, ColumnFields: String, PageFields: SafeArray[String]): js.Any = js.native
  def AddFields(RowFields: String, ColumnFields: String, PageFields: SafeArray[String], AddToTable: Boolean): js.Any = js.native
  def AddFields(RowFields: String, ColumnFields: SafeArray[String]): js.Any = js.native
  def AddFields(RowFields: String, ColumnFields: SafeArray[String], PageFields: String): js.Any = js.native
  def AddFields(RowFields: String, ColumnFields: SafeArray[String], PageFields: String, AddToTable: Boolean): js.Any = js.native
  def AddFields(RowFields: String, ColumnFields: SafeArray[String], PageFields: SafeArray[String]): js.Any = js.native
  def AddFields(
    RowFields: String,
    ColumnFields: SafeArray[String],
    PageFields: SafeArray[String],
    AddToTable: Boolean
  ): js.Any = js.native
  def AddFields(RowFields: SafeArray[String]): js.Any = js.native
  def AddFields(RowFields: SafeArray[String], ColumnFields: String): js.Any = js.native
  def AddFields(RowFields: SafeArray[String], ColumnFields: String, PageFields: String): js.Any = js.native
  def AddFields(RowFields: SafeArray[String], ColumnFields: String, PageFields: String, AddToTable: Boolean): js.Any = js.native
  def AddFields(RowFields: SafeArray[String], ColumnFields: String, PageFields: SafeArray[String]): js.Any = js.native
  def AddFields(
    RowFields: SafeArray[String],
    ColumnFields: String,
    PageFields: SafeArray[String],
    AddToTable: Boolean
  ): js.Any = js.native
  def AddFields(RowFields: SafeArray[String], ColumnFields: SafeArray[String]): js.Any = js.native
  def AddFields(RowFields: SafeArray[String], ColumnFields: SafeArray[String], PageFields: String): js.Any = js.native
  def AddFields(
    RowFields: SafeArray[String],
    ColumnFields: SafeArray[String],
    PageFields: String,
    AddToTable: Boolean
  ): js.Any = js.native
  def AddFields(RowFields: SafeArray[String], ColumnFields: SafeArray[String], PageFields: SafeArray[String]): js.Any = js.native
  def AddFields(
    RowFields: SafeArray[String],
    ColumnFields: SafeArray[String],
    PageFields: SafeArray[String],
    AddToTable: Boolean
  ): js.Any = js.native
  def AllocateChanges(): Unit = js.native
  def CalculatedFields(): typings.activexDashExcel.ExcelNs.CalculatedFields = js.native
  def CalculatedMembers(Index: String): CalculatedMember = js.native
  def CalculatedMembers(Index: Double): CalculatedMember = js.native
  def ChangeConnection(conn: WorkbookConnection): Unit = js.native
  def ChangeList(Index: String): ValueChange = js.native
  def ChangeList(Index: Double): ValueChange = js.native
  def ChangePivotCache(PivotCache: String): Unit = js.native
  def ClearAllFilters(): Unit = js.native
  def ClearTable(): Unit = js.native
  def ColumnFields(Indexes: SafeArray[Double | String]): PivotFields = js.native
  def ColumnFields(Index: String): PivotField = js.native
  def ColumnFields(Index: Double): PivotField = js.native
  def ColumnRange(Address: String): Range = js.native
  def ColumnRange(RowIndex: Double): Range = js.native
  def ColumnRange(RowIndex: Double, ColumnIndex: Double): Range = js.native
  def CommitChanges(): Unit = js.native
  def ConvertToFormulas(ConvertFilters: Boolean): Unit = js.native
  def CreateCubeFile(File: String): String = js.native
  def CreateCubeFile(File: String, Measures: SafeArray[String]): String = js.native
  def CreateCubeFile(File: String, Measures: SafeArray[String], Levels: SafeArray[String]): String = js.native
  def CreateCubeFile(
    File: String,
    Measures: SafeArray[String],
    Levels: SafeArray[String],
    Members: SafeArray[SafeArray[String]]
  ): String = js.native
  def CreateCubeFile(
    File: String,
    Measures: SafeArray[String],
    Levels: SafeArray[String],
    Members: SafeArray[SafeArray[String]],
    Properties: Boolean
  ): String = js.native
  def CubeFields(Index: String): CubeField = js.native
  def CubeFields(Index: Double): CubeField = js.native
  def DataBodyRange(Address: String): Range = js.native
  def DataBodyRange(RowIndex: Double): Range = js.native
  def DataBodyRange(RowIndex: Double, ColumnIndex: Double): Range = js.native
  def DataFields(Indexes: SafeArray[Double | String]): PivotFields = js.native
  def DataFields(Index: String): PivotField = js.native
  def DataFields(Index: Double): PivotField = js.native
  def DataLabelRange(Address: String): Range = js.native
  def DataLabelRange(RowIndex: Double): Range = js.native
  def DataLabelRange(RowIndex: Double, ColumnIndex: Double): Range = js.native
  def DiscardChanges(): Unit = js.native
  def Dummy15(
    Arg1: js.Any,
    Arg2: js.UndefOr[js.Any],
    Arg3: js.UndefOr[js.Any],
    Arg4: js.UndefOr[js.Any],
    Arg5: js.UndefOr[js.Any],
    Arg6: js.UndefOr[js.Any],
    Arg7: js.UndefOr[js.Any],
    Arg8: js.UndefOr[js.Any],
    Arg9: js.UndefOr[js.Any],
    Arg10: js.UndefOr[js.Any],
    Arg11: js.UndefOr[js.Any],
    Arg12: js.UndefOr[js.Any],
    Arg13: js.UndefOr[js.Any],
    Arg14: js.UndefOr[js.Any],
    Arg15: js.UndefOr[js.Any],
    Arg16: js.UndefOr[js.Any],
    Arg17: js.UndefOr[js.Any],
    Arg18: js.UndefOr[js.Any],
    Arg19: js.UndefOr[js.Any],
    Arg20: js.UndefOr[js.Any],
    Arg21: js.UndefOr[js.Any],
    Arg22: js.UndefOr[js.Any],
    Arg23: js.UndefOr[js.Any],
    Arg24: js.UndefOr[js.Any],
    Arg25: js.UndefOr[js.Any],
    Arg26: js.UndefOr[js.Any],
    Arg27: js.UndefOr[js.Any],
    Arg28: js.UndefOr[js.Any],
    Arg29: js.UndefOr[js.Any],
    Arg30: js.UndefOr[js.Any]
  ): js.Any = js.native
  def Format(Format: XlPivotFormatType): Unit = js.native
  def GetData(Name: String): Double = js.native
  def GetPivotData(
    DataField: js.UndefOr[String],
    Field1: js.UndefOr[String],
    Item1: js.UndefOr[String],
    Field2: js.UndefOr[String],
    Item2: js.UndefOr[String],
    Field3: js.UndefOr[String],
    Item3: js.UndefOr[String],
    Field4: js.UndefOr[String],
    Item4: js.UndefOr[String],
    Field5: js.UndefOr[String],
    Item5: js.UndefOr[String],
    Field6: js.UndefOr[String],
    Item6: js.UndefOr[String],
    Field7: js.UndefOr[String],
    Item7: js.UndefOr[String],
    Field8: js.UndefOr[String],
    Item8: js.UndefOr[String],
    Field9: js.UndefOr[String],
    Item9: js.UndefOr[String],
    Field10: js.UndefOr[String],
    Item10: js.UndefOr[String],
    Field11: js.UndefOr[String],
    Item11: js.UndefOr[String],
    Field12: js.UndefOr[String],
    Item12: js.UndefOr[String],
    Field13: js.UndefOr[String],
    Item13: js.UndefOr[String],
    Field14: js.UndefOr[String],
    Item14: js.UndefOr[String]
  ): Range = js.native
  def HiddenFields(Indexes: SafeArray[Double | String]): PivotFields = js.native
  def HiddenFields(Index: String): PivotField = js.native
  def HiddenFields(Index: Double): PivotField = js.native
  def ListFormulas(): Unit = js.native
  def PageFields(Indexes: SafeArray[Double | String]): PivotFields = js.native
  def PageFields(Index: String): PivotField = js.native
  def PageFields(Index: Double): PivotField = js.native
  def PageRange(Address: String): Range = js.native
  def PageRange(RowIndex: Double): Range = js.native
  def PageRange(RowIndex: Double, ColumnIndex: Double): Range = js.native
  def PageRangeCells(Address: String): Range = js.native
  def PageRangeCells(RowIndex: Double): Range = js.native
  def PageRangeCells(RowIndex: Double, ColumnIndex: Double): Range = js.native
  def PivotCache(): typings.activexDashExcel.ExcelNs.PivotCache = js.native
  def PivotFields(Indexes: SafeArray[Double | String]): typings.activexDashExcel.ExcelNs.PivotFields = js.native
  def PivotFields(Index: String): PivotField = js.native
  def PivotFields(Index: Double): PivotField = js.native
  def PivotFormulas(Index: String): PivotFormula = js.native
  def PivotFormulas(Index: Double): PivotFormula = js.native
  /** @param Mode [Mode=0] */
  def PivotSelect(Name: String): Unit = js.native
  def PivotSelect(Name: String, Mode: XlPTSelectionMode): Unit = js.native
  def PivotSelect(Name: String, Mode: XlPTSelectionMode, UseStandardName: Boolean): Unit = js.native
  def PivotTableWizard(): Unit = js.native
  def PivotTableWizard[TSourceType](
    SourceType: TSourceType,
    SourceData: PivotTableWizardSourceData[TSourceType],
    TableDestination: js.UndefOr[Range],
    TableName: js.UndefOr[String],
    RowGrand: js.UndefOr[Boolean],
    ColumnGrand: js.UndefOr[Boolean],
    SaveData: js.UndefOr[Boolean],
    HasAutoFormat: js.UndefOr[Boolean],
    AutoPage: js.UndefOr[PivotTableWizardAutoPage[TSourceType]],
    Reserved: js.UndefOr[scala.Nothing],
    BackgroundQuery: js.UndefOr[Boolean],
    OptimizeCache: js.UndefOr[Boolean],
    PageFieldOrder: js.UndefOr[XlOrder],
    PageFieldWrapCount: js.UndefOr[Double],
    ReadData: js.UndefOr[Boolean],
    Connection: js.UndefOr[String]
  ): Unit = js.native
  def RefreshDataSourceValues(): Unit = js.native
  def RefreshTable(): Boolean = js.native
  def RepeatAllLabels(Repeat: XlPivotFieldRepeatLabels): Unit = js.native
  def RowAxisLayout(RowLayout: XlLayoutRowType): Unit = js.native
  def RowFields(Indexes: SafeArray[Double | String]): PivotFields = js.native
  def RowFields(Index: String): PivotField = js.native
  def RowFields(Index: Double): PivotField = js.native
  def RowRange(Address: String): Range = js.native
  def RowRange(RowIndex: Double): Range = js.native
  def RowRange(RowIndex: Double, ColumnIndex: Double): Range = js.native
  def ShowPages(): js.Any = js.native
  def ShowPages(PageField: String): js.Any = js.native
  def Slicers(Index: String): Slicer = js.native
  def Slicers(Index: Double): Slicer = js.native
  def SubtotalLocation(Location: XlSubtototalLocationType): Unit = js.native
  def TableRange1(Address: String): Range = js.native
  def TableRange1(RowIndex: Double): Range = js.native
  def TableRange1(RowIndex: Double, ColumnIndex: Double): Range = js.native
  def TableRange2(Address: String): Range = js.native
  def TableRange2(RowIndex: Double): Range = js.native
  def TableRange2(RowIndex: Double, ColumnIndex: Double): Range = js.native
  def Update(): Unit = js.native
  def VisibleFields(Indexes: SafeArray[Double | String]): PivotFields = js.native
  def VisibleFields(Index: String): PivotField = js.native
  def VisibleFields(Index: Double): PivotField = js.native
  /** @param Mode [Mode=0] */
  def _PivotSelect(Name: String): Unit = js.native
  def _PivotSelect(Name: String, Mode: XlPTSelectionMode): Unit = js.native
}

