package typings
package activexDashExcelLib.ExcelNs

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
  var AllocationWeightExpression: java.lang.String = js.native
  var AllowMultipleFilters: scala.Boolean = js.native
  var AlternativeText: java.lang.String = js.native
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  var CacheIndex: scala.Double = js.native
  var CalculatedMembersInFilters: scala.Boolean = js.native
  @JSName("CalculatedMembers")
  val CalculatedMembers_Original: CalculatedMembers = js.native
  @JSName("ChangeList")
  val ChangeList_Original: PivotTableChangeList = js.native
  @JSName("ColumnFields")
  var ColumnFields_Original: PivotFieldsResult = js.native
  var ColumnGrand: scala.Boolean = js.native
  @JSName("ColumnRange")
  val ColumnRange_Original: Range = js.native
  var CompactLayoutColumnHeader: java.lang.String = js.native
  var CompactLayoutRowHeader: java.lang.String = js.native
  var CompactRowIndent: scala.Double = js.native
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
  var DisplayContextTooltips: scala.Boolean = js.native
  var DisplayEmptyColumn: scala.Boolean = js.native
  var DisplayEmptyRow: scala.Boolean = js.native
  var DisplayErrorString: scala.Boolean = js.native
  var DisplayFieldCaptions: scala.Boolean = js.native
  var DisplayImmediateItems: scala.Boolean = js.native
  var DisplayMemberPropertyTooltips: scala.Boolean = js.native
  var DisplayNullString: scala.Boolean = js.native
  var EnableDataValueEditing: scala.Boolean = js.native
  var EnableDrilldown: scala.Boolean = js.native
  var EnableFieldDialog: scala.Boolean = js.native
  var EnableFieldList: scala.Boolean = js.native
  var EnableWizard: scala.Boolean = js.native
  var EnableWriteback: scala.Boolean = js.native
  var ErrorString: java.lang.String = js.native
  var `Excel.PivotTable_typekey`: PivotTable = js.native
  var FieldListSortAscending: scala.Boolean = js.native
  var GrandTotalName: java.lang.String = js.native
  var HasAutoFormat: scala.Boolean = js.native
  @JSName("HiddenFields")
  var HiddenFields_Original: PivotFieldsResult = js.native
  var InGridDropZones: scala.Boolean = js.native
  var InnerDetail: java.lang.String = js.native
  var LayoutRowDefault: XlLayoutRowType = js.native
  var Location: java.lang.String = js.native
  val MDX: java.lang.String = js.native
  var ManualUpdate: scala.Boolean = js.native
  var MergeLabels: scala.Boolean = js.native
  var Name: java.lang.String = js.native
  var NullString: java.lang.String = js.native
  var PageFieldOrder: scala.Double = js.native
  var PageFieldStyle: java.lang.String = js.native
  var PageFieldWrapCount: scala.Double = js.native
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
  var PivotSelection: java.lang.String = js.native
  var PivotSelectionStandard: java.lang.String = js.native
  var PreserveFormatting: scala.Boolean = js.native
  var PrintDrillIndicators: scala.Boolean = js.native
  var PrintTitles: scala.Boolean = js.native
  val RefreshDate: stdLib.VarDate = js.native
  val RefreshName: java.lang.String = js.native
  var RepeatItemsOnEachPrintedPage: scala.Boolean = js.native
  @JSName("RowFields")
  var RowFields_Original: PivotFieldsResult = js.native
  var RowGrand: scala.Boolean = js.native
  @JSName("RowRange")
  val RowRange_Original: Range = js.native
  var SaveData: scala.Boolean = js.native
  var SelectionMode: XlPTSelectionMode = js.native
  var ShowCellBackgroundFromOLAP: scala.Boolean = js.native
  var ShowDrillIndicators: scala.Boolean = js.native
  var ShowPageMultipleItemLabel: scala.Boolean = js.native
  var ShowTableStyleColumnHeaders: scala.Boolean = js.native
  var ShowTableStyleColumnStripes: scala.Boolean = js.native
  var ShowTableStyleLastColumn: scala.Boolean = js.native
  var ShowTableStyleRowHeaders: scala.Boolean = js.native
  var ShowTableStyleRowStripes: scala.Boolean = js.native
  var ShowValuesRow: scala.Boolean = js.native
  @JSName("Slicers")
  val Slicers_Original: Slicers = js.native
  var SmallGrid: scala.Boolean = js.native
  var SortUsingCustomLists: scala.Boolean = js.native
  var SourceData: js.Any = js.native
  var SubtotalHiddenPageItems: scala.Boolean = js.native
  var Summary: java.lang.String = js.native
  @JSName("TableRange1")
  val TableRange1_Original: Range = js.native
  @JSName("TableRange2")
  val TableRange2_Original: Range = js.native
  var TableStyle: java.lang.String = js.native
  var TableStyle2: js.Any = js.native
  var Tag: java.lang.String = js.native
  var TotalsAnnotation: scala.Boolean = js.native
  var VacatedStyle: java.lang.String = js.native
  var Value: java.lang.String = js.native
  val Version: XlPivotTableVersionList = js.native
  var ViewCalculatedMembers: scala.Boolean = js.native
  @JSName("VisibleFields")
  var VisibleFields_Original: PivotFieldsResult = js.native
  var VisualTotals: scala.Boolean = js.native
  var VisualTotalsForSets: scala.Boolean = js.native
  var _Default: java.lang.String = js.native
  def ActiveFilters(Index: scala.Double): PivotFilter = js.native
  def AddDataField(Field: js.Any): PivotField = js.native
  def AddDataField(Field: js.Any, Caption: js.Any): PivotField = js.native
  def AddDataField(Field: js.Any, Caption: js.Any, Function: js.Any): PivotField = js.native
  def AddFields(): js.Any = js.native
  def AddFields(RowFields: java.lang.String): js.Any = js.native
  def AddFields(RowFields: java.lang.String, ColumnFields: java.lang.String): js.Any = js.native
  def AddFields(RowFields: java.lang.String, ColumnFields: java.lang.String, PageFields: java.lang.String): js.Any = js.native
  def AddFields(
    RowFields: java.lang.String,
    ColumnFields: java.lang.String,
    PageFields: java.lang.String,
    AddToTable: scala.Boolean
  ): js.Any = js.native
  def AddFields(
    RowFields: java.lang.String,
    ColumnFields: java.lang.String,
    PageFields: stdLib.SafeArray[java.lang.String]
  ): js.Any = js.native
  def AddFields(
    RowFields: java.lang.String,
    ColumnFields: java.lang.String,
    PageFields: stdLib.SafeArray[java.lang.String],
    AddToTable: scala.Boolean
  ): js.Any = js.native
  def AddFields(RowFields: java.lang.String, ColumnFields: stdLib.SafeArray[java.lang.String]): js.Any = js.native
  def AddFields(
    RowFields: java.lang.String,
    ColumnFields: stdLib.SafeArray[java.lang.String],
    PageFields: java.lang.String
  ): js.Any = js.native
  def AddFields(
    RowFields: java.lang.String,
    ColumnFields: stdLib.SafeArray[java.lang.String],
    PageFields: java.lang.String,
    AddToTable: scala.Boolean
  ): js.Any = js.native
  def AddFields(
    RowFields: java.lang.String,
    ColumnFields: stdLib.SafeArray[java.lang.String],
    PageFields: stdLib.SafeArray[java.lang.String]
  ): js.Any = js.native
  def AddFields(
    RowFields: java.lang.String,
    ColumnFields: stdLib.SafeArray[java.lang.String],
    PageFields: stdLib.SafeArray[java.lang.String],
    AddToTable: scala.Boolean
  ): js.Any = js.native
  def AddFields(RowFields: stdLib.SafeArray[java.lang.String]): js.Any = js.native
  def AddFields(RowFields: stdLib.SafeArray[java.lang.String], ColumnFields: java.lang.String): js.Any = js.native
  def AddFields(
    RowFields: stdLib.SafeArray[java.lang.String],
    ColumnFields: java.lang.String,
    PageFields: java.lang.String
  ): js.Any = js.native
  def AddFields(
    RowFields: stdLib.SafeArray[java.lang.String],
    ColumnFields: java.lang.String,
    PageFields: java.lang.String,
    AddToTable: scala.Boolean
  ): js.Any = js.native
  def AddFields(
    RowFields: stdLib.SafeArray[java.lang.String],
    ColumnFields: java.lang.String,
    PageFields: stdLib.SafeArray[java.lang.String]
  ): js.Any = js.native
  def AddFields(
    RowFields: stdLib.SafeArray[java.lang.String],
    ColumnFields: java.lang.String,
    PageFields: stdLib.SafeArray[java.lang.String],
    AddToTable: scala.Boolean
  ): js.Any = js.native
  def AddFields(RowFields: stdLib.SafeArray[java.lang.String], ColumnFields: stdLib.SafeArray[java.lang.String]): js.Any = js.native
  def AddFields(
    RowFields: stdLib.SafeArray[java.lang.String],
    ColumnFields: stdLib.SafeArray[java.lang.String],
    PageFields: java.lang.String
  ): js.Any = js.native
  def AddFields(
    RowFields: stdLib.SafeArray[java.lang.String],
    ColumnFields: stdLib.SafeArray[java.lang.String],
    PageFields: java.lang.String,
    AddToTable: scala.Boolean
  ): js.Any = js.native
  def AddFields(
    RowFields: stdLib.SafeArray[java.lang.String],
    ColumnFields: stdLib.SafeArray[java.lang.String],
    PageFields: stdLib.SafeArray[java.lang.String]
  ): js.Any = js.native
  def AddFields(
    RowFields: stdLib.SafeArray[java.lang.String],
    ColumnFields: stdLib.SafeArray[java.lang.String],
    PageFields: stdLib.SafeArray[java.lang.String],
    AddToTable: scala.Boolean
  ): js.Any = js.native
  def AllocateChanges(): scala.Unit = js.native
  def CalculatedFields(): activexDashExcelLib.ExcelNs.CalculatedFields = js.native
  def CalculatedMembers(Index: java.lang.String): CalculatedMember = js.native
  def CalculatedMembers(Index: scala.Double): CalculatedMember = js.native
  def ChangeConnection(conn: WorkbookConnection): scala.Unit = js.native
  def ChangeList(Index: java.lang.String): ValueChange = js.native
  def ChangeList(Index: scala.Double): ValueChange = js.native
  def ChangePivotCache(PivotCache: java.lang.String): scala.Unit = js.native
  def ClearAllFilters(): scala.Unit = js.native
  def ClearTable(): scala.Unit = js.native
  def ColumnFields(Indexes: stdLib.SafeArray[scala.Double | java.lang.String]): PivotFields = js.native
  def ColumnFields(Index: java.lang.String): PivotField = js.native
  def ColumnFields(Index: scala.Double): PivotField = js.native
  def ColumnRange(Address: java.lang.String): Range = js.native
  def ColumnRange(RowIndex: scala.Double): Range = js.native
  def ColumnRange(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def CommitChanges(): scala.Unit = js.native
  def ConvertToFormulas(ConvertFilters: scala.Boolean): scala.Unit = js.native
  def CreateCubeFile(File: java.lang.String): java.lang.String = js.native
  def CreateCubeFile(File: java.lang.String, Measures: stdLib.SafeArray[java.lang.String]): java.lang.String = js.native
  def CreateCubeFile(
    File: java.lang.String,
    Measures: stdLib.SafeArray[java.lang.String],
    Levels: stdLib.SafeArray[java.lang.String]
  ): java.lang.String = js.native
  def CreateCubeFile(
    File: java.lang.String,
    Measures: stdLib.SafeArray[java.lang.String],
    Levels: stdLib.SafeArray[java.lang.String],
    Members: stdLib.SafeArray[stdLib.SafeArray[java.lang.String]]
  ): java.lang.String = js.native
  def CreateCubeFile(
    File: java.lang.String,
    Measures: stdLib.SafeArray[java.lang.String],
    Levels: stdLib.SafeArray[java.lang.String],
    Members: stdLib.SafeArray[stdLib.SafeArray[java.lang.String]],
    Properties: scala.Boolean
  ): java.lang.String = js.native
  def CubeFields(Index: java.lang.String): CubeField = js.native
  def CubeFields(Index: scala.Double): CubeField = js.native
  def DataBodyRange(Address: java.lang.String): Range = js.native
  def DataBodyRange(RowIndex: scala.Double): Range = js.native
  def DataBodyRange(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def DataFields(Indexes: stdLib.SafeArray[scala.Double | java.lang.String]): PivotFields = js.native
  def DataFields(Index: java.lang.String): PivotField = js.native
  def DataFields(Index: scala.Double): PivotField = js.native
  def DataLabelRange(Address: java.lang.String): Range = js.native
  def DataLabelRange(RowIndex: scala.Double): Range = js.native
  def DataLabelRange(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def DiscardChanges(): scala.Unit = js.native
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
  def Format(Format: XlPivotFormatType): scala.Unit = js.native
  def GetData(Name: java.lang.String): scala.Double = js.native
  def GetPivotData(
    DataField: js.UndefOr[java.lang.String],
    Field1: js.UndefOr[java.lang.String],
    Item1: js.UndefOr[java.lang.String],
    Field2: js.UndefOr[java.lang.String],
    Item2: js.UndefOr[java.lang.String],
    Field3: js.UndefOr[java.lang.String],
    Item3: js.UndefOr[java.lang.String],
    Field4: js.UndefOr[java.lang.String],
    Item4: js.UndefOr[java.lang.String],
    Field5: js.UndefOr[java.lang.String],
    Item5: js.UndefOr[java.lang.String],
    Field6: js.UndefOr[java.lang.String],
    Item6: js.UndefOr[java.lang.String],
    Field7: js.UndefOr[java.lang.String],
    Item7: js.UndefOr[java.lang.String],
    Field8: js.UndefOr[java.lang.String],
    Item8: js.UndefOr[java.lang.String],
    Field9: js.UndefOr[java.lang.String],
    Item9: js.UndefOr[java.lang.String],
    Field10: js.UndefOr[java.lang.String],
    Item10: js.UndefOr[java.lang.String],
    Field11: js.UndefOr[java.lang.String],
    Item11: js.UndefOr[java.lang.String],
    Field12: js.UndefOr[java.lang.String],
    Item12: js.UndefOr[java.lang.String],
    Field13: js.UndefOr[java.lang.String],
    Item13: js.UndefOr[java.lang.String],
    Field14: js.UndefOr[java.lang.String],
    Item14: js.UndefOr[java.lang.String]
  ): Range = js.native
  def HiddenFields(Indexes: stdLib.SafeArray[scala.Double | java.lang.String]): PivotFields = js.native
  def HiddenFields(Index: java.lang.String): PivotField = js.native
  def HiddenFields(Index: scala.Double): PivotField = js.native
  def ListFormulas(): scala.Unit = js.native
  def PageFields(Indexes: stdLib.SafeArray[scala.Double | java.lang.String]): PivotFields = js.native
  def PageFields(Index: java.lang.String): PivotField = js.native
  def PageFields(Index: scala.Double): PivotField = js.native
  def PageRange(Address: java.lang.String): Range = js.native
  def PageRange(RowIndex: scala.Double): Range = js.native
  def PageRange(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def PageRangeCells(Address: java.lang.String): Range = js.native
  def PageRangeCells(RowIndex: scala.Double): Range = js.native
  def PageRangeCells(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def PivotCache(): activexDashExcelLib.ExcelNs.PivotCache = js.native
  def PivotFields(Indexes: stdLib.SafeArray[scala.Double | java.lang.String]): activexDashExcelLib.ExcelNs.PivotFields = js.native
  def PivotFields(Index: java.lang.String): PivotField = js.native
  def PivotFields(Index: scala.Double): PivotField = js.native
  def PivotFormulas(Index: java.lang.String): PivotFormula = js.native
  def PivotFormulas(Index: scala.Double): PivotFormula = js.native
  /** @param Mode [Mode=0] */
  def PivotSelect(Name: java.lang.String): scala.Unit = js.native
  def PivotSelect(Name: java.lang.String, Mode: XlPTSelectionMode): scala.Unit = js.native
  def PivotSelect(Name: java.lang.String, Mode: XlPTSelectionMode, UseStandardName: scala.Boolean): scala.Unit = js.native
  def PivotTableWizard(): scala.Unit = js.native
  def PivotTableWizard[TSourceType](
    SourceType: TSourceType,
    SourceData: PivotTableWizardSourceData[TSourceType],
    TableDestination: js.UndefOr[Range],
    TableName: js.UndefOr[java.lang.String],
    RowGrand: js.UndefOr[scala.Boolean],
    ColumnGrand: js.UndefOr[scala.Boolean],
    SaveData: js.UndefOr[scala.Boolean],
    HasAutoFormat: js.UndefOr[scala.Boolean],
    AutoPage: js.UndefOr[PivotTableWizardAutoPage[TSourceType]],
    Reserved: js.UndefOr[scala.Nothing],
    BackgroundQuery: js.UndefOr[scala.Boolean],
    OptimizeCache: js.UndefOr[scala.Boolean],
    PageFieldOrder: js.UndefOr[XlOrder],
    PageFieldWrapCount: js.UndefOr[scala.Double],
    ReadData: js.UndefOr[scala.Boolean],
    Connection: js.UndefOr[java.lang.String]
  ): scala.Unit = js.native
  def RefreshDataSourceValues(): scala.Unit = js.native
  def RefreshTable(): scala.Boolean = js.native
  def RepeatAllLabels(Repeat: XlPivotFieldRepeatLabels): scala.Unit = js.native
  def RowAxisLayout(RowLayout: XlLayoutRowType): scala.Unit = js.native
  def RowFields(Indexes: stdLib.SafeArray[scala.Double | java.lang.String]): PivotFields = js.native
  def RowFields(Index: java.lang.String): PivotField = js.native
  def RowFields(Index: scala.Double): PivotField = js.native
  def RowRange(Address: java.lang.String): Range = js.native
  def RowRange(RowIndex: scala.Double): Range = js.native
  def RowRange(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def ShowPages(): js.Any = js.native
  def ShowPages(PageField: java.lang.String): js.Any = js.native
  def Slicers(Index: java.lang.String): Slicer = js.native
  def Slicers(Index: scala.Double): Slicer = js.native
  def SubtotalLocation(Location: XlSubtototalLocationType): scala.Unit = js.native
  def TableRange1(Address: java.lang.String): Range = js.native
  def TableRange1(RowIndex: scala.Double): Range = js.native
  def TableRange1(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def TableRange2(Address: java.lang.String): Range = js.native
  def TableRange2(RowIndex: scala.Double): Range = js.native
  def TableRange2(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def Update(): scala.Unit = js.native
  def VisibleFields(Indexes: stdLib.SafeArray[scala.Double | java.lang.String]): PivotFields = js.native
  def VisibleFields(Index: java.lang.String): PivotField = js.native
  def VisibleFields(Index: scala.Double): PivotField = js.native
  /** @param Mode [Mode=0] */
  def _PivotSelect(Name: java.lang.String): scala.Unit = js.native
  def _PivotSelect(Name: java.lang.String, Mode: XlPTSelectionMode): scala.Unit = js.native
}

