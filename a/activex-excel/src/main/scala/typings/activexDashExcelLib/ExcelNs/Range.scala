package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Range extends js.Object {
  var AddIndent: scala.Boolean = js.native
  val AllowEdit: scala.Boolean = js.native
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  @JSName("Areas")
  val Areas_Original: Areas = js.native
  @JSName("Borders")
  val Borders_Original: Borders = js.native
  @JSName("Cells")
  val Cells_Original: Range = js.native
  val Column: scala.Double = js.native
  var ColumnWidth: scala.Double | scala.Null = js.native
  @JSName("Columns")
  val Columns_Original: Range = js.native
  val Comment: activexDashExcelLib.ExcelNs.Comment = js.native
  val Count: scala.Double = js.native
  val CountLarge: scala.Double = js.native
  val Creator: XlCreator = js.native
  @JSName("CurrentArray")
  val CurrentArray_Original: Range = js.native
  @JSName("CurrentRegion")
  val CurrentRegion_Original: Range = js.native
  @JSName("Dependents")
  val Dependents_Original: Range = js.native
  @JSName("DirectDependents")
  val DirectDependents_Original: Range = js.native
  @JSName("DirectPrecedents")
  val DirectPrecedents_Original: Range = js.native
  val DisplayFormat: activexDashExcelLib.ExcelNs.DisplayFormat = js.native
  @JSName("EntireColumn")
  val EntireColumn_Original: Range = js.native
  @JSName("EntireRow")
  val EntireRow_Original: Range = js.native
  @JSName("Errors")
  val Errors_Original: Errors = js.native
  val Font: activexDashExcelLib.ExcelNs.Font = js.native
  @JSName("FormatConditions")
  val FormatConditions_Original: FormatConditions = js.native
  var Formula: java.lang.String | stdLib.SafeArray[java.lang.String] = js.native
  var FormulaArray: java.lang.String | stdLib.SafeArray[java.lang.String] | scala.Null = js.native
  var FormulaHidden: scala.Boolean | scala.Null = js.native
  var FormulaLabel: XlFormulaLabel = js.native
  var FormulaLocal: java.lang.String | stdLib.SafeArray[java.lang.String] = js.native
  var FormulaR1C1: java.lang.String | stdLib.SafeArray[java.lang.String] = js.native
  var FormulaR1C1Local: java.lang.String | stdLib.SafeArray[java.lang.String] = js.native
  val HasArray: scala.Boolean = js.native
  val HasFormula: scala.Boolean | scala.Null = js.native
  var Height: scala.Double = js.native
  var Hidden: scala.Boolean = js.native
  var HorizontalAlignment: HorizontalAlignments = js.native
  @JSName("Hyperlinks")
  val Hyperlinks_Original: Hyperlinks = js.native
  var ID: java.lang.String = js.native
  var IndentLevel: activexDashExcelLib.activexDashExcelLibNumbers.`0` | activexDashExcelLib.activexDashExcelLibNumbers.`1` | activexDashExcelLib.activexDashExcelLibNumbers.`2` | activexDashExcelLib.activexDashExcelLibNumbers.`3` | activexDashExcelLib.activexDashExcelLibNumbers.`4` | activexDashExcelLib.activexDashExcelLibNumbers.`5` | activexDashExcelLib.activexDashExcelLibNumbers.`6` | activexDashExcelLib.activexDashExcelLibNumbers.`7` | activexDashExcelLib.activexDashExcelLibNumbers.`8` | activexDashExcelLib.activexDashExcelLibNumbers.`9` | activexDashExcelLib.activexDashExcelLibNumbers.`10` | activexDashExcelLib.activexDashExcelLibNumbers.`11` | activexDashExcelLib.activexDashExcelLibNumbers.`12` | activexDashExcelLib.activexDashExcelLibNumbers.`13` | activexDashExcelLib.activexDashExcelLibNumbers.`14` | activexDashExcelLib.activexDashExcelLibNumbers.`15` = js.native
  val Interior: activexDashExcelLib.ExcelNs.Interior = js.native
  val Left: scala.Double = js.native
  val ListHeaderRows: scala.Double = js.native
  val ListObject: activexDashExcelLib.ExcelNs.ListObject = js.native
  val LocationInTable: XlLocationInTable = js.native
  var Locked: scala.Boolean | scala.Null = js.native
  val MDX: java.lang.String = js.native
  @JSName("MergeArea")
  val MergeArea_Original: Range = js.native
  var MergeCells: scala.Boolean = js.native
  var Name: java.lang.String | Name = js.native
  @JSName("Next")
  val Next_Original: Range = js.native
  var NumberFormat: java.lang.String | scala.Null = js.native
  var NumberFormatLocal: java.lang.String | scala.Null = js.native
  var Orientation: scala.Double | XlOrientation = js.native
  var OutlineLevel: scala.Double = js.native
  var PageBreak: scala.Double = js.native
  val Parent: js.Any = js.native
  val Phonetic: activexDashExcelLib.ExcelNs.Phonetic = js.native
  @JSName("Phonetics")
  val Phonetics_Original: Phonetics = js.native
  val PivotCell: activexDashExcelLib.ExcelNs.PivotCell = js.native
  val PivotField: activexDashExcelLib.ExcelNs.PivotField = js.native
  val PivotItem: activexDashExcelLib.ExcelNs.PivotItem = js.native
  val PivotTable: activexDashExcelLib.ExcelNs.PivotTable = js.native
  @JSName("Precedents")
  val Precedents_Original: Range = js.native
  val PrefixCharacter: activexDashExcelLib.activexDashExcelLibStrings._quote | activexDashExcelLib.activexDashExcelLibStrings.BACKSLASH | activexDashExcelLib.activexDashExcelLibStrings.`_backtick^_backtick` | activexDashExcelLib.activexDashExcelLibStrings.BACKSLASHBACKSLASH | activexDashExcelLib.activexDashExcelLibStrings.Empty = js.native
  @JSName("Previous")
  val Previous_Original: Range = js.native
  val QueryTable: activexDashExcelLib.ExcelNs.QueryTable = js.native
  var ReadingOrder: scala.Double = js.native
  val Row: scala.Double = js.native
  var RowHeight: scala.Double | scala.Null = js.native
  @JSName("Rows")
  val Rows_Original: Range = js.native
  @JSName("ServerActions")
  val ServerActions_Original: Actions = js.native
  var ShowDetail: js.Any = js.native
  var ShrinkToFit: scala.Boolean | scala.Null = js.native
  @JSName("SmartTags")
  val SmartTags_Original: SmartTags = js.native
  val SoundNote: activexDashExcelLib.ExcelNs.SoundNote = js.native
  @JSName("SparklineGroups")
  val SparklineGroups_Original: SparklineGroups = js.native
  var Style: activexDashExcelLib.ExcelNs.Style = js.native
  val Summary: scala.Boolean = js.native
  val Text: java.lang.String = js.native
  val Top: scala.Double = js.native
  var UseStandardHeight: scala.Boolean | scala.Null = js.native
  var UseStandardWidth: scala.Boolean | scala.Null = js.native
  val Validation: activexDashExcelLib.ExcelNs.Validation = js.native
  var Value2: js.Any = js.native
  // tslint:disable-next-line: ban-types
  @JSName("Value")
  var Value_Original: (stdLib.Exclude[_, js.Function]) with (js.Function1[/* RangeValueDataType */ js.UndefOr[XlRangeValueDataType], _]) = js.native
  var VerticalAlignment: VerticalAlignments = js.native
  val Width: scala.Double = js.native
  val Worksheet: activexDashExcelLib.ExcelNs.Worksheet = js.native
  var WrapText: scala.Boolean | scala.Null = js.native
  val XPath: activexDashExcelLib.ExcelNs.XPath = js.native
  def apply(Address: java.lang.String): Range = js.native
  def apply(RowIndex: scala.Double): Range = js.native
  def apply(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def Activate(): js.Any = js.native
  def AddComment(): Comment = js.native
  def AddComment(Text: java.lang.String): Comment = js.native
  /** @param ReferenceStyle [ReferenceStyle=1] */
  def Address(): java.lang.String = js.native
  def Address(RowAbsolute: scala.Boolean): java.lang.String = js.native
  def Address(RowAbsolute: scala.Boolean, ColumnAbsolute: scala.Boolean): java.lang.String = js.native
  def Address(RowAbsolute: scala.Boolean, ColumnAbsolute: scala.Boolean, ReferenceStyle: XlReferenceStyle): java.lang.String = js.native
  def Address(
    RowAbsolute: scala.Boolean,
    ColumnAbsolute: scala.Boolean,
    ReferenceStyle: XlReferenceStyle,
    External: scala.Boolean
  ): java.lang.String = js.native
  def Address(
    RowAbsolute: scala.Boolean,
    ColumnAbsolute: scala.Boolean,
    ReferenceStyle: XlReferenceStyle,
    External: scala.Boolean,
    RelativeTo: Range
  ): java.lang.String = js.native
  /** @param ReferenceStyle [ReferenceStyle=1] */
  def AddressLocal(): java.lang.String = js.native
  def AddressLocal(RowAbsolute: scala.Boolean): java.lang.String = js.native
  def AddressLocal(RowAbsolute: scala.Boolean, ColumnAbsolute: scala.Boolean): java.lang.String = js.native
  def AddressLocal(RowAbsolute: scala.Boolean, ColumnAbsolute: scala.Boolean, ReferenceStyle: XlReferenceStyle): java.lang.String = js.native
  def AddressLocal(
    RowAbsolute: scala.Boolean,
    ColumnAbsolute: scala.Boolean,
    ReferenceStyle: XlReferenceStyle,
    External: scala.Boolean
  ): java.lang.String = js.native
  def AddressLocal(
    RowAbsolute: scala.Boolean,
    ColumnAbsolute: scala.Boolean,
    ReferenceStyle: XlReferenceStyle,
    External: scala.Boolean,
    RelativeTo: Range
  ): java.lang.String = js.native
  def AdvancedFilter(Action: XlFilterAction): js.Any = js.native
  def AdvancedFilter(Action: XlFilterAction, CriteriaRange: Range): js.Any = js.native
  def AdvancedFilter(Action: XlFilterAction, CriteriaRange: Range, CopyToRange: Range): js.Any = js.native
  def AdvancedFilter(Action: XlFilterAction, CriteriaRange: Range, CopyToRange: Range, Unique: scala.Boolean): js.Any = js.native
  def AdvancedFilter(
    Action: XlFilterAction,
    CriteriaRange: Range,
    CopyToRange: js.UndefOr[scala.Nothing],
    Unique: scala.Boolean
  ): js.Any = js.native
  def AllocateChanges(): scala.Unit = js.native
  /** @param Order [Order=1] */
  def ApplyNames(
    Names: js.UndefOr[stdLib.SafeArray[java.lang.String]],
    IgnoreRelativeAbsolute: js.UndefOr[scala.Boolean],
    UseRowColumnNames: js.UndefOr[scala.Boolean],
    OmitColumn: js.UndefOr[scala.Boolean],
    OmitRow: js.UndefOr[scala.Boolean],
    Order: js.UndefOr[XlApplyNamesOrder],
    AppendLast: js.UndefOr[scala.Boolean]
  ): js.Any = js.native
  def ApplyOutlineStyles(): js.Any = js.native
  def Areas(Index: scala.Double): Range = js.native
  def AutoComplete(String: java.lang.String): java.lang.String = js.native
  /** @param Type [Type=0] */
  def AutoFill(Destination: Range): js.Any = js.native
  def AutoFill(Destination: Range, Type: XlAutoFillType): js.Any = js.native
  /** @param Operator [Operator=1] */
  def AutoFilter(Field: scala.Double, Criteria1: java.lang.String): js.Any = js.native
  def AutoFilter(Field: scala.Double, Criteria1: java.lang.String, Operator: XlAutoFilterOperator): js.Any = js.native
  def AutoFilter(
    Field: scala.Double,
    Criteria1: java.lang.String,
    Operator: XlAutoFilterOperator,
    Criteria2: java.lang.String
  ): js.Any = js.native
  def AutoFilter(
    Field: scala.Double,
    Criteria1: java.lang.String,
    Operator: XlAutoFilterOperator,
    Criteria2: java.lang.String,
    VisibleDropDown: scala.Boolean
  ): js.Any = js.native
  def AutoFit(): js.Any = js.native
  /** @param Format [Format=1] */
  def AutoFormat(
    Format: js.UndefOr[XlRangeAutoFormat],
    Number: js.UndefOr[js.Any],
    Font: js.UndefOr[js.Any],
    Alignment: js.UndefOr[js.Any],
    Border: js.UndefOr[js.Any],
    Pattern: js.UndefOr[js.Any],
    Width: js.UndefOr[js.Any]
  ): js.Any = js.native
  def AutoOutline(): js.Any = js.native
  /**
    * @param Weight [Weight=2]
    * @param ColorIndex [ColorIndex=-4105]
    */
  def BorderAround(): js.Any = js.native
  def BorderAround(LineStyle: XlLineStyle): js.Any = js.native
  def BorderAround(LineStyle: XlLineStyle, Weight: XlBorderWeight): js.Any = js.native
  def BorderAround(LineStyle: XlLineStyle, Weight: XlBorderWeight, ColorIndex: XlColorIndex): js.Any = js.native
  def BorderAround(LineStyle: XlLineStyle, Weight: XlBorderWeight, ColorIndex: XlColorIndex, Color: scala.Double): js.Any = js.native
  def BorderAround(
    LineStyle: XlLineStyle,
    Weight: XlBorderWeight,
    ColorIndex: XlColorIndex,
    Color: scala.Double,
    ThemeColor: XlThemeColor
  ): js.Any = js.native
  def BorderAround(
    LineStyle: XlLineStyle,
    Weight: XlBorderWeight,
    ColorIndex: XlColorIndex,
    Color: scala.Double,
    ThemeColor: scala.Double
  ): js.Any = js.native
  def Borders(Index: XlBordersIndex): Border = js.native
  def Calculate(): js.Any = js.native
  def CalculateRowMajorOrder(): js.Any = js.native
  def Cells(Address: java.lang.String): Range = js.native
  def Cells(RowIndex: scala.Double): Range = js.native
  def Cells(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def Characters(): activexDashExcelLib.ExcelNs.Characters = js.native
  def Characters(Start: scala.Double): activexDashExcelLib.ExcelNs.Characters = js.native
  def Characters(Start: scala.Double, Length: scala.Double): activexDashExcelLib.ExcelNs.Characters = js.native
  def CheckSpelling(): js.Any = js.native
  def CheckSpelling(CustomDictionary: java.lang.String): js.Any = js.native
  def CheckSpelling(CustomDictionary: java.lang.String, IgnoreUppercase: scala.Boolean): js.Any = js.native
  def CheckSpelling(CustomDictionary: java.lang.String, IgnoreUppercase: scala.Boolean, AlwaysSuggest: scala.Boolean): js.Any = js.native
  def CheckSpelling(
    CustomDictionary: java.lang.String,
    IgnoreUppercase: scala.Boolean,
    AlwaysSuggest: scala.Boolean,
    SpellLang: activexDashOfficeLib.OfficeNs.MsoLanguageID
  ): js.Any = js.native
  def Clear(): js.Any = js.native
  def ClearComments(): scala.Unit = js.native
  def ClearContents(): js.Any = js.native
  def ClearFormats(): js.Any = js.native
  def ClearHyperlinks(): scala.Unit = js.native
  def ClearNotes(): js.Any = js.native
  def ClearOutline(): js.Any = js.native
  def ColumnDifferences(Comparison: Range): Range = js.native
  def Columns(Address: java.lang.String): Range = js.native
  def Columns(RowIndex: scala.Double): Range = js.native
  def Columns(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def Consolidate(): js.Any = js.native
  def Consolidate(Sources: stdLib.SafeArray[java.lang.String]): js.Any = js.native
  def Consolidate(Sources: stdLib.SafeArray[java.lang.String], Function: XlConsolidationFunction): js.Any = js.native
  def Consolidate(
    Sources: stdLib.SafeArray[java.lang.String],
    Function: XlConsolidationFunction,
    TopRow: scala.Boolean
  ): js.Any = js.native
  def Consolidate(
    Sources: stdLib.SafeArray[java.lang.String],
    Function: XlConsolidationFunction,
    TopRow: scala.Boolean,
    LeftColumn: scala.Boolean
  ): js.Any = js.native
  def Consolidate(
    Sources: stdLib.SafeArray[java.lang.String],
    Function: XlConsolidationFunction,
    TopRow: scala.Boolean,
    LeftColumn: scala.Boolean,
    CreateLinks: scala.Boolean
  ): js.Any = js.native
  def Copy(): js.Any = js.native
  def Copy(Destination: Range): js.Any = js.native
  def CopyFromRecordset(Data: activexDashAdodbLib.ADODBNs.Recordset): scala.Double = js.native
  def CopyFromRecordset(Data: activexDashAdodbLib.ADODBNs.Recordset, MaxRows: scala.Double): scala.Double = js.native
  def CopyFromRecordset(Data: activexDashAdodbLib.ADODBNs.Recordset, MaxRows: scala.Double, MaxColumns: scala.Double): scala.Double = js.native
  def CopyFromRecordset(Data: activexDashDaoLib.DAONs.Recordset): scala.Double = js.native
  def CopyFromRecordset(Data: activexDashDaoLib.DAONs.Recordset, MaxRows: scala.Double): scala.Double = js.native
  def CopyFromRecordset(Data: activexDashDaoLib.DAONs.Recordset, MaxRows: scala.Double, MaxColumns: scala.Double): scala.Double = js.native
  /**
    * @param Appearance [Appearance=1]
    * @param Format [Format=-4147]
    */
  def CopyPicture(): js.Any = js.native
  def CopyPicture(Appearance: XlPictureAppearance): js.Any = js.native
  def CopyPicture(Appearance: XlPictureAppearance, Format: XlCopyPictureFormat): js.Any = js.native
  def CreateNames(): js.Any = js.native
  def CreateNames(Top: scala.Boolean): js.Any = js.native
  def CreateNames(Top: scala.Boolean, Left: scala.Boolean): js.Any = js.native
  def CreateNames(Top: scala.Boolean, Left: scala.Boolean, Bottom: scala.Boolean): js.Any = js.native
  def CreateNames(Top: scala.Boolean, Left: scala.Boolean, Bottom: scala.Boolean, Right: scala.Boolean): js.Any = js.native
  /** @param Appearance [Appearance=1] */
  def CreatePublisher(Edition: js.Any): js.Any = js.native
  def CreatePublisher(Edition: js.Any, Appearance: XlPictureAppearance): js.Any = js.native
  def CreatePublisher(Edition: js.Any, Appearance: XlPictureAppearance, ContainsPICT: js.Any): js.Any = js.native
  def CreatePublisher(Edition: js.Any, Appearance: XlPictureAppearance, ContainsPICT: js.Any, ContainsBIFF: js.Any): js.Any = js.native
  def CreatePublisher(
    Edition: js.Any,
    Appearance: XlPictureAppearance,
    ContainsPICT: js.Any,
    ContainsBIFF: js.Any,
    ContainsRTF: js.Any
  ): js.Any = js.native
  def CreatePublisher(
    Edition: js.Any,
    Appearance: XlPictureAppearance,
    ContainsPICT: js.Any,
    ContainsBIFF: js.Any,
    ContainsRTF: js.Any,
    ContainsVALU: js.Any
  ): js.Any = js.native
  def CurrentArray(Address: java.lang.String): Range = js.native
  def CurrentArray(RowIndex: scala.Double): Range = js.native
  def CurrentArray(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def CurrentRegion(Address: java.lang.String): Range = js.native
  def CurrentRegion(RowIndex: scala.Double): Range = js.native
  def CurrentRegion(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def Cut(): js.Any = js.native
  def Cut(Destination: Range): js.Any = js.native
  /**
    * @param Type [Type=-4132]
    * @param Date [Date=1]
    * @param Step [Step=1]
    */
  def DataSeries(Rowcol: XlRowCol): js.Any = js.native
  def DataSeries(Rowcol: XlRowCol, Type: XlDataSeriesType): js.Any = js.native
  def DataSeries(Rowcol: XlRowCol, Type: XlDataSeriesType, Date: XlDataSeriesDate): js.Any = js.native
  def DataSeries(Rowcol: XlRowCol, Type: XlDataSeriesType, Date: XlDataSeriesDate, Step: scala.Double): js.Any = js.native
  def DataSeries(
    Rowcol: XlRowCol,
    Type: XlDataSeriesType,
    Date: XlDataSeriesDate,
    Step: scala.Double,
    Stop: scala.Double
  ): js.Any = js.native
  def DataSeries(
    Rowcol: XlRowCol,
    Type: XlDataSeriesType,
    Date: XlDataSeriesDate,
    Step: scala.Double,
    Stop: scala.Double,
    Trend: scala.Boolean
  ): js.Any = js.native
  def Delete(): js.Any = js.native
  def Delete(Shift: XlDeleteShiftDirection): js.Any = js.native
  def Dependents(Address: java.lang.String): Range = js.native
  def Dependents(RowIndex: scala.Double): Range = js.native
  def Dependents(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def DialogBox(): scala.Double | activexDashExcelLib.activexDashExcelLibNumbers.`false` = js.native
  def DirectDependents(Address: java.lang.String): Range = js.native
  def DirectDependents(RowIndex: scala.Double): Range = js.native
  def DirectDependents(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def DirectPrecedents(Address: java.lang.String): Range = js.native
  def DirectPrecedents(RowIndex: scala.Double): Range = js.native
  def DirectPrecedents(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def Dirty(): scala.Unit = js.native
  def DiscardChanges(): scala.Unit = js.native
  /**
    * @param Appearance [Appearance=1]
    * @param ChartSize [ChartSize=1]
    */
  def EditionOptions(Type: XlEditionType, Option: XlEditionOptionsOption, Name: js.Any, Reference: js.Any): js.Any = js.native
  def EditionOptions(
    Type: XlEditionType,
    Option: XlEditionOptionsOption,
    Name: js.Any,
    Reference: js.Any,
    Appearance: XlPictureAppearance
  ): js.Any = js.native
  def EditionOptions(
    Type: XlEditionType,
    Option: XlEditionOptionsOption,
    Name: js.Any,
    Reference: js.Any,
    Appearance: XlPictureAppearance,
    ChartSize: XlPictureAppearance
  ): js.Any = js.native
  def EditionOptions(
    Type: XlEditionType,
    Option: XlEditionOptionsOption,
    Name: js.Any,
    Reference: js.Any,
    Appearance: XlPictureAppearance,
    ChartSize: XlPictureAppearance,
    Format: js.Any
  ): js.Any = js.native
  def End(Direction: XlDirection): Range = js.native
  def EntireColumn(Address: java.lang.String): Range = js.native
  def EntireColumn(RowIndex: scala.Double): Range = js.native
  def EntireColumn(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def EntireRow(Address: java.lang.String): Range = js.native
  def EntireRow(RowIndex: scala.Double): Range = js.native
  def EntireRow(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def Errors(Index: XlErrorChecks): Error = js.native
  def Errors(Index: scala.Double): Error = js.native
  def ExportAsFixedFormat(
    Type: XlFixedFormatType,
    Filename: js.UndefOr[java.lang.String],
    Quality: js.UndefOr[XlFixedFormatQuality],
    IncludeDocProperties: js.UndefOr[scala.Boolean],
    IgnorePrintAreas: js.UndefOr[scala.Boolean],
    From: js.UndefOr[scala.Double],
    To: js.UndefOr[scala.Double],
    OpenAfterPublish: js.UndefOr[scala.Boolean],
    FixedFormatExtClassPtr: js.UndefOr[js.Any]
  ): scala.Unit = js.native
  def FillDown(): js.Any = js.native
  def FillLeft(): js.Any = js.native
  def FillRight(): js.Any = js.native
  def FillUp(): js.Any = js.native
  /** @param SearchDirection [SearchDirection=1] */
  def Find(
    What: js.Any,
    After: js.UndefOr[js.Any],
    LookIn: js.UndefOr[XlFindLookIn],
    LookAt: js.UndefOr[XlLookAt],
    SearchOrder: js.UndefOr[XlSearchOrder],
    SearchDirection: js.UndefOr[XlSearchDirection],
    MatchCase: js.UndefOr[scala.Boolean],
    MatchByte: js.UndefOr[scala.Boolean],
    SearchFormat: js.UndefOr[js.Any]
  ): Range = js.native
  def FindNext(): Range = js.native
  def FindNext(After: js.Any): Range = js.native
  def FindPrevious(): Range = js.native
  def FindPrevious(After: js.Any): Range = js.native
  def FormatConditions(Index: java.lang.String): FormatCondition = js.native
  def FormatConditions(Index: scala.Double): FormatCondition = js.native
  def FunctionWizard(): js.Any = js.native
  def GoalSeek(Goal: js.Any, ChangingCell: Range): scala.Boolean = js.native
  def Group(): js.Any = js.native
  def Group(Start: js.Any): js.Any = js.native
  def Group(Start: js.Any, End: js.Any): js.Any = js.native
  def Group(Start: js.Any, End: js.Any, By: scala.Double): js.Any = js.native
  def Group(Start: js.Any, End: js.Any, By: scala.Double, Periods: stdLib.SafeArray[scala.Boolean]): js.Any = js.native
  def Hyperlinks(Index: java.lang.String): Hyperlink = js.native
  def Hyperlinks(Index: scala.Double): Hyperlink = js.native
  def Insert(): js.Any = js.native
  def Insert(Shift: XlInsertShiftDirection): js.Any = js.native
  def Insert(Shift: XlInsertShiftDirection, CopyOrigin: js.Any): js.Any = js.native
  def InsertIndent(InsertAmount: scala.Double): scala.Unit = js.native
  def Item(Address: java.lang.String): Range = js.native
  def Item(RowIndex: scala.Double): Range = js.native
  def Item(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def Justify(): js.Any = js.native
  def ListNames(): js.Any = js.native
  def Merge(): scala.Unit = js.native
  def Merge(Across: scala.Boolean): scala.Unit = js.native
  def MergeArea(Address: java.lang.String): Range = js.native
  def MergeArea(RowIndex: scala.Double): Range = js.native
  def MergeArea(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def NavigateArrow(): js.Any = js.native
  def NavigateArrow(TowardPrecedent: scala.Boolean): js.Any = js.native
  def NavigateArrow(TowardPrecedent: scala.Boolean, ArrowNumber: scala.Double): js.Any = js.native
  def NavigateArrow(TowardPrecedent: scala.Boolean, ArrowNumber: scala.Double, LinkNumber: scala.Double): js.Any = js.native
  def Next(Address: java.lang.String): Range = js.native
  def Next(RowIndex: scala.Double): Range = js.native
  def Next(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def NoteText(): java.lang.String = js.native
  def NoteText(Text: java.lang.String): java.lang.String = js.native
  def NoteText(Text: java.lang.String, Start: scala.Double): java.lang.String = js.native
  def NoteText(Text: java.lang.String, Start: scala.Double, Length: scala.Double): java.lang.String = js.native
  def Offset(): Range = js.native
  def Offset(RowOffset: scala.Double): Range = js.native
  def Offset(RowOffset: scala.Double, ColumnOffset: scala.Double): Range = js.native
  def Parse(): js.Any = js.native
  def Parse(ParseLine: java.lang.String): js.Any = js.native
  def Parse(ParseLine: java.lang.String, Destination: Range): js.Any = js.native
  /**
    * @param Paste [Paste=-4104]
    * @param Operation [Operation=-4142]
    */
  def PasteSpecial(): js.Any = js.native
  def PasteSpecial(Paste: XlPasteType): js.Any = js.native
  def PasteSpecial(Paste: XlPasteType, Operation: XlPasteSpecialOperation): js.Any = js.native
  def PasteSpecial(Paste: XlPasteType, Operation: XlPasteSpecialOperation, SkipBlanks: scala.Boolean): js.Any = js.native
  def PasteSpecial(
    Paste: XlPasteType,
    Operation: XlPasteSpecialOperation,
    SkipBlanks: scala.Boolean,
    Transpose: scala.Boolean
  ): js.Any = js.native
  def Phonetics(Index: scala.Double): Phonetic = js.native
  def Precedents(Address: java.lang.String): Range = js.native
  def Precedents(RowIndex: scala.Double): Range = js.native
  def Precedents(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def Previous(Address: java.lang.String): Range = js.native
  def Previous(RowIndex: scala.Double): Range = js.native
  def Previous(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def PrintOut[T /* <: js.UndefOr[scala.Boolean] */](
    From: js.UndefOr[scala.Double],
    To: js.UndefOr[scala.Double],
    Copies: js.UndefOr[scala.Double],
    Preview: js.UndefOr[scala.Boolean],
    ActivePrinter: js.UndefOr[java.lang.String],
    PrintToFile: js.UndefOr[T],
    Collate: js.UndefOr[scala.Boolean],
    PrToFileName: js.UndefOr[PrintToFileName[T]]
  ): js.Any = js.native
  def PrintPreview(): js.Any = js.native
  def PrintPreview(EnableChanges: scala.Boolean): js.Any = js.native
  def Range(Cell1: Range): activexDashExcelLib.ExcelNs.Range = js.native
  def Range(Cell1: Range, Cell2: Range): activexDashExcelLib.ExcelNs.Range = js.native
  def Range(Cell1: Range, Cell2: java.lang.String): activexDashExcelLib.ExcelNs.Range = js.native
  def Range(Cell1: java.lang.String): activexDashExcelLib.ExcelNs.Range = js.native
  def Range(Cell1: java.lang.String, Cell2: Range): activexDashExcelLib.ExcelNs.Range = js.native
  def Range(Cell1: java.lang.String, Cell2: java.lang.String): activexDashExcelLib.ExcelNs.Range = js.native
  /** @param Header [Header=2] */
  def RemoveDuplicates(Columns: stdLib.SafeArray[scala.Double]): scala.Unit = js.native
  def RemoveDuplicates(Columns: stdLib.SafeArray[scala.Double], Header: XlYesNoGuess): scala.Unit = js.native
  def RemoveSubtotal(): js.Any = js.native
  def Replace(
    What: java.lang.String,
    Replacement: java.lang.String,
    LookAt: js.UndefOr[XlLookAt],
    SearchOrder: js.UndefOr[XlSearchOrder],
    MatchCase: js.UndefOr[scala.Boolean],
    MatchByte: js.UndefOr[scala.Boolean],
    SearchFormat: js.UndefOr[scala.Boolean],
    ReplaceFormat: js.UndefOr[scala.Boolean]
  ): scala.Boolean = js.native
  def Resize(): Range = js.native
  def Resize(RowSize: scala.Double): Range = js.native
  def Resize(RowSize: scala.Double, ColumnSize: scala.Double): Range = js.native
  def RowDifferences(Comparison: Range): Range = js.native
  def Rows(Address: java.lang.String): Range = js.native
  def Rows(RowIndex: scala.Double): Range = js.native
  def Rows(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def Run(
    Arg1: js.UndefOr[js.Any],
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
  def Select(): js.Any = js.native
  def ServerActions(Index: java.lang.String): Action = js.native
  def ServerActions(Index: scala.Double): Action = js.native
  def SetPhonetic(): scala.Unit = js.native
  def Show(): js.Any = js.native
  def ShowDependents(): js.Any = js.native
  def ShowDependents(Remove: scala.Boolean): js.Any = js.native
  def ShowErrors(): js.Any = js.native
  def ShowPrecedents(): js.Any = js.native
  def ShowPrecedents(Remove: scala.Boolean): js.Any = js.native
  def SmartTags(Index: js.Any): SmartTag = js.native
  def Sort(
    Key1: Range,
    Order1: js.UndefOr[XlSortOrder],
    Key2: js.UndefOr[js.Any],
    Type: js.UndefOr[js.Any],
    Order2: js.UndefOr[XlSortOrder],
    Key3: js.UndefOr[js.Any],
    Order3: js.UndefOr[XlSortOrder],
    Header: js.UndefOr[XlYesNoGuess],
    OrderCustom: js.UndefOr[scala.Double],
    MatchCase: js.UndefOr[scala.Boolean],
    Orientation: js.UndefOr[XlSortOrientation],
    SortMethod: js.UndefOr[XlSortMethod],
    DataOption1: js.UndefOr[XlSortDataOption],
    DataOption2: js.UndefOr[XlSortDataOption],
    DataOption3: js.UndefOr[XlSortDataOption]
  ): js.Any = js.native
  /**
    * @param Order1 [Order1=1]
    * @param Order2 [Order2=1]
    * @param Order3 [Order3=1]
    * @param Header [Header=2]
    * @param Orientation [Orientation=2]
    * @param SortMethod [SortMethod=1]
    * @param DataOption1 [DataOption1=0]
    * @param DataOption2 [DataOption2=0]
    * @param DataOption3 [DataOption3=0]
    */
  def Sort(
    Key1: java.lang.String,
    Order1: js.UndefOr[XlSortOrder],
    Key2: js.UndefOr[js.Any],
    Type: js.UndefOr[js.Any],
    Order2: js.UndefOr[XlSortOrder],
    Key3: js.UndefOr[js.Any],
    Order3: js.UndefOr[XlSortOrder],
    Header: js.UndefOr[XlYesNoGuess],
    OrderCustom: js.UndefOr[scala.Double],
    MatchCase: js.UndefOr[scala.Boolean],
    Orientation: js.UndefOr[XlSortOrientation],
    SortMethod: js.UndefOr[XlSortMethod],
    DataOption1: js.UndefOr[XlSortDataOption],
    DataOption2: js.UndefOr[XlSortDataOption],
    DataOption3: js.UndefOr[XlSortDataOption]
  ): js.Any = js.native
  /**
    * @param SortMethod [SortMethod=1]
    * @param Order1 [Order1=1]
    * @param Order2 [Order2=1]
    * @param Order3 [Order3=1]
    * @param Header [Header=2]
    * @param Orientation [Orientation=2]
    * @param DataOption1 [DataOption1=0]
    * @param DataOption2 [DataOption2=0]
    * @param DataOption3 [DataOption3=0]
    */
  def SortSpecial(
    SortMethod: js.UndefOr[XlSortMethod],
    Key1: js.UndefOr[Range | java.lang.String],
    Order1: js.UndefOr[XlSortOrder],
    Type: js.UndefOr[js.Any],
    Key2: js.UndefOr[Range | java.lang.String],
    Order2: js.UndefOr[XlSortOrder],
    Key3: js.UndefOr[Range | java.lang.String],
    Order3: js.UndefOr[XlSortOrder],
    Header: js.UndefOr[XlYesNoGuess],
    OrderCustom: js.UndefOr[scala.Double],
    MatchCase: js.UndefOr[scala.Boolean],
    Orientation: js.UndefOr[XlSortOrientation],
    DataOption1: js.UndefOr[XlSortDataOption],
    DataOption2: js.UndefOr[XlSortDataOption],
    DataOption3: js.UndefOr[XlSortDataOption]
  ): js.Any = js.native
  def SparklineGroups(Index: scala.Double): SparklineGroup = js.native
  def Speak(): scala.Unit = js.native
  def Speak(SpeakDirection: XlSpeakDirection): scala.Unit = js.native
  def Speak(SpeakDirection: XlSpeakDirection, SpeakFormulas: scala.Boolean): scala.Unit = js.native
  def SpecialCells(Type: XlCellType): Range = js.native
  def SpecialCells(Type: XlCellType, Value: XlSpecialCellsValue): Range = js.native
  /** @param Format [Format=-4158] */
  def SubscribeTo(Edition: java.lang.String): js.Any = js.native
  def SubscribeTo(Edition: java.lang.String, Format: XlSubscribeToFormat): js.Any = js.native
  /** @param SummaryBelowData [SummaryBelowData=1] */
  def Subtotal(
    GroupBy: scala.Double,
    Function: XlConsolidationFunction,
    TotalList: stdLib.SafeArray[scala.Double],
    Replace: scala.Boolean,
    PageBreaks: scala.Boolean
  ): js.Any = js.native
  def Subtotal(
    GroupBy: scala.Double,
    Function: XlConsolidationFunction,
    TotalList: stdLib.SafeArray[scala.Double],
    Replace: scala.Boolean,
    PageBreaks: scala.Boolean,
    SummaryBelowData: XlSummaryRow
  ): js.Any = js.native
  def Table(): js.Any = js.native
  def Table(RowInput: Range): js.Any = js.native
  def Table(RowInput: Range, ColumnInput: Range): js.Any = js.native
  /**
    * @param DataType [DataType=1]
    * @param TextQualifier [TextQualifier=1]
    */
  def TextToColumns(
    Destination: Range,
    DataType: js.UndefOr[XlTextParsingType],
    TextQualifier: js.UndefOr[XlTextQualifier],
    ConsecutiveDelimiter: js.UndefOr[scala.Boolean],
    Tab: js.UndefOr[scala.Boolean],
    Semicolon: js.UndefOr[scala.Boolean],
    Comma: js.UndefOr[scala.Boolean],
    Space: js.UndefOr[scala.Boolean],
    Other: js.UndefOr[scala.Boolean],
    OtherChar: js.UndefOr[java.lang.String],
    FieldInfo: js.UndefOr[stdLib.SafeArray[_]],
    DecimalSeparator: js.UndefOr[java.lang.String],
    ThousandsSeparator: js.UndefOr[java.lang.String],
    TrailingMinusNumbers: js.UndefOr[js.Any]
  ): js.Any = js.native
  def UnMerge(): scala.Unit = js.native
  def Ungroup(): js.Any = js.native
  // tslint:disable-next-line: ban-types
  def Value(): js.Any = js.native
  def Value(RangeValueDataType: XlRangeValueDataType): js.Any = js.native
  /**
    * @param Weight [Weight=2]
    * @param ColorIndex [ColorIndex=-4105]
    */
  def _BorderAround(LineStyle: js.Any): js.Any = js.native
  def _BorderAround(LineStyle: js.Any, Weight: XlBorderWeight): js.Any = js.native
  def _BorderAround(LineStyle: js.Any, Weight: XlBorderWeight, ColorIndex: XlColorIndex): js.Any = js.native
  def _BorderAround(LineStyle: js.Any, Weight: XlBorderWeight, ColorIndex: XlColorIndex, Color: js.Any): js.Any = js.native
  def _Default(): js.Any = js.native
  def _Default(RowIndex: js.Any): js.Any = js.native
  def _Default(RowIndex: js.Any, ColumnIndex: js.Any): js.Any = js.native
  /**
    * @param Paste [Paste=-4104]
    * @param Operation [Operation=-4142]
    */
  def _PasteSpecial(): js.Any = js.native
  def _PasteSpecial(Paste: XlPasteType): js.Any = js.native
  def _PasteSpecial(Paste: XlPasteType, Operation: XlPasteSpecialOperation): js.Any = js.native
  def _PasteSpecial(Paste: XlPasteType, Operation: XlPasteSpecialOperation, SkipBlanks: js.Any): js.Any = js.native
  def _PasteSpecial(Paste: XlPasteType, Operation: XlPasteSpecialOperation, SkipBlanks: js.Any, Transpose: js.Any): js.Any = js.native
  def _PrintOut(
    From: js.UndefOr[js.Any],
    To: js.UndefOr[js.Any],
    Copies: js.UndefOr[js.Any],
    Preview: js.UndefOr[js.Any],
    ActivePrinter: js.UndefOr[js.Any],
    PrintToFile: js.UndefOr[js.Any],
    Collate: js.UndefOr[js.Any],
    PrToFileName: js.UndefOr[js.Any]
  ): js.Any = js.native
  def __PrintOut(
    From: js.UndefOr[js.Any],
    To: js.UndefOr[js.Any],
    Copies: js.UndefOr[js.Any],
    Preview: js.UndefOr[js.Any],
    ActivePrinter: js.UndefOr[js.Any],
    PrintToFile: js.UndefOr[js.Any],
    Collate: js.UndefOr[js.Any]
  ): js.Any = js.native
}

