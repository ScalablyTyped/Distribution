package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Worksheet")
@js.native
class Worksheet protected () extends js.Object {
  val Application: Application = js.native
  val AutoFilter: AutoFilter = js.native
  var AutoFilterMode: scala.Boolean = js.native
  @JSName("Cells")
  val Cells_Original: Range = js.native
  @JSName("CircularReference")
  val CircularReference_Original: Range = js.native
  val CodeName: java.lang.String = js.native
  @JSName("Columns")
  val Columns_Original: Range = js.native
  @JSName("Comments")
  val Comments_Original: Comments = js.native
  val ConsolidationFunction: XlConsolidationFunction = js.native
  val ConsolidationOptions: activexDashInteropLib.SafeArray[scala.Boolean] = js.native
  val ConsolidationSources: js.UndefOr[activexDashInteropLib.SafeArray[java.lang.String]] = js.native
  val Creator: XlCreator = js.native
  @JSName("CustomProperties")
  val CustomProperties_Original: CustomProperties = js.native
  var DisplayAutomaticPageBreaks: scala.Boolean = js.native
  var DisplayPageBreaks: scala.Boolean = js.native
  var DisplayRightToLeft: scala.Boolean = js.native
  var EnableAutoFilter: scala.Boolean = js.native
  var EnableCalculation: scala.Boolean = js.native
  var EnableFormatConditionsCalculation: scala.Boolean = js.native
  var EnableOutlining: scala.Boolean = js.native
  var EnablePivotTable: scala.Boolean = js.native
  var EnableSelection: XlEnableSelection = js.native
  var `Excel.Worksheet_typekey`: Worksheet = js.native
  val FilterMode: scala.Boolean = js.native
  @JSName("HPageBreaks")
  val HPageBreaks_Original: HPageBreaks = js.native
  @JSName("Hyperlinks")
  val Hyperlinks_Original: Hyperlinks = js.native
  val Index: scala.Double = js.native
  @JSName("ListObjects")
  val ListObjects_Original: ListObjects = js.native
  val MailEnvelope: activexDashOfficeLib.OfficeNs.MsoEnvelope = js.native
  var Name: java.lang.String = js.native
  @JSName("Names")
  val Names_Original: Names = js.native
  val Next: Worksheet = js.native
  var OnCalculate: java.lang.String = js.native
  var OnData: java.lang.String = js.native
  var OnDoubleClick: java.lang.String = js.native
  var OnEntry: java.lang.String = js.native
  var OnSheetActivate: java.lang.String = js.native
  var OnSheetDeactivate: java.lang.String = js.native
  val Outline: Outline = js.native
  val PageSetup: PageSetup = js.native
  val Parent: js.Any = js.native
  val Previous: Worksheet = js.native
  val PrintedCommentPages: scala.Double = js.native
  val ProtectContents: scala.Boolean = js.native
  val ProtectDrawingObjects: scala.Boolean = js.native
  val ProtectScenarios: scala.Boolean = js.native
  val Protection: Protection = js.native
  val ProtectionMode: scala.Boolean = js.native
  @JSName("QueryTables")
  val QueryTables_Original: QueryTables = js.native
  @JSName("Rows")
  val Rows_Original: Range = js.native
  @JSName("Scripts")
  val Scripts_Original: activexDashOfficeLib.OfficeNs.Scripts = js.native
  var ScrollArea: java.lang.String = js.native
  @JSName("Shapes")
  val Shapes_Original: Shapes = js.native
  @JSName("SmartTags")
  val SmartTags_Original: SmartTags = js.native
  val Sort: Sort = js.native
  val StandardHeight: scala.Double = js.native
  var StandardWidth: scala.Double = js.native
  val Tab: Tab = js.native
  var TransitionExpEval: scala.Boolean = js.native
  var TransitionFormEntry: scala.Boolean = js.native
  val Type: XlSheetType = js.native
  @JSName("UsedRange")
  val UsedRange_Original: Range = js.native
  @JSName("VPageBreaks")
  val VPageBreaks_Original: VPageBreaks = js.native
  var Visible: XlSheetVisibility = js.native
  var _CodeName: java.lang.String = js.native
  var _DisplayRightToLeft: scala.Double = js.native
  def Activate(): scala.Unit = js.native
  def Arcs(): js.Any = js.native
  def Arcs(Index: js.Any): js.Any = js.native
  def Buttons(): js.Any = js.native
  def Buttons(Index: js.Any): js.Any = js.native
  def Calculate(): scala.Unit = js.native
  def Cells(Address: java.lang.String): Range = js.native
  def Cells(RowIndex: scala.Double): Range = js.native
  def Cells(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def ChartObjects(): ChartObjects = js.native
  def ChartObjects(Index: activexDashInteropLib.SafeArray[java.lang.String | scala.Double]): ChartObjects = js.native
  def ChartObjects(Index: java.lang.String): ChartObject = js.native
  def ChartObjects(Index: scala.Double): ChartObject = js.native
  def CheckBoxes(): js.Any = js.native
  def CheckBoxes(Index: js.Any): js.Any = js.native
  def CheckSpelling(): scala.Unit = js.native
  def CheckSpelling(CustomDictionary: java.lang.String): scala.Unit = js.native
  def CheckSpelling(CustomDictionary: java.lang.String, IgnoreUppercase: scala.Boolean): scala.Unit = js.native
  def CheckSpelling(CustomDictionary: java.lang.String, IgnoreUppercase: scala.Boolean, AlwaysSuggest: scala.Boolean): scala.Unit = js.native
  def CheckSpelling(
    CustomDictionary: java.lang.String,
    IgnoreUppercase: scala.Boolean,
    AlwaysSuggest: scala.Boolean,
    SpellLang: activexDashOfficeLib.OfficeNs.MsoLanguageID
  ): scala.Unit = js.native
  def CircleInvalid(): scala.Unit = js.native
  def CircularReference(Address: java.lang.String): Range = js.native
  def CircularReference(RowIndex: scala.Double): Range = js.native
  def CircularReference(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def ClearArrows(): scala.Unit = js.native
  def ClearCircles(): scala.Unit = js.native
  def Columns(Address: java.lang.String): Range = js.native
  def Columns(RowIndex: scala.Double): Range = js.native
  def Columns(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def Comments(Index: scala.Double): Comment = js.native
  def Copy(): scala.Unit = js.native
  def Copy(Before: Sheet): scala.Unit = js.native
  def Copy(Before: js.UndefOr[scala.Nothing], After: Sheet): scala.Unit = js.native
  def CustomProperties(Index: java.lang.String): CustomProperty = js.native
  def CustomProperties(Index: scala.Double): CustomProperty = js.native
  def Delete(): scala.Unit = js.native
  def DrawingObjects(): js.Any = js.native
  def DrawingObjects(Index: js.Any): js.Any = js.native
  def Drawings(): js.Any = js.native
  def Drawings(Index: js.Any): js.Any = js.native
  def DropDowns(): js.Any = js.native
  def DropDowns(Index: js.Any): js.Any = js.native
  def Evaluate(Name: java.lang.String): js.Any = js.native
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
  def GroupBoxes(): js.Any = js.native
  def GroupBoxes(Index: js.Any): js.Any = js.native
  def GroupObjects(): js.Any = js.native
  def GroupObjects(Index: js.Any): js.Any = js.native
  def HPageBreaks(Index: scala.Double): HPageBreak = js.native
  def Hyperlinks(Index: java.lang.String): Hyperlink = js.native
  def Hyperlinks(Index: scala.Double): Hyperlink = js.native
  def Labels(): js.Any = js.native
  def Labels(Index: js.Any): js.Any = js.native
  def Lines(): js.Any = js.native
  def Lines(Index: js.Any): js.Any = js.native
  def ListBoxes(): js.Any = js.native
  def ListBoxes(Index: js.Any): js.Any = js.native
  def ListObjects(Index: java.lang.String): ListObject = js.native
  def ListObjects(Index: scala.Double): ListObject = js.native
  def Move(): scala.Unit = js.native
  def Move(Before: Sheet): scala.Unit = js.native
  def Move(Before: Sheet, After: Sheet): scala.Unit = js.native
  def Names(Index: java.lang.String): Name = js.native
  def Names(Index: js.UndefOr[scala.Nothing], IndexLocal: java.lang.String): Name = js.native
  def Names(
    Index: js.UndefOr[scala.Nothing],
    IndexLocal: js.UndefOr[scala.Nothing],
    RefersTo: java.lang.String
  ): Name = js.native
  def Names(Index: scala.Double): Name = js.native
  def OLEObjects(): OLEObjects = js.native
  def OLEObjects(Index: java.lang.String): OLEObject = js.native
  def OLEObjects(Index: scala.Double): OLEObject = js.native
  def OptionButtons(): js.Any = js.native
  def OptionButtons(Index: js.Any): js.Any = js.native
  def Ovals(): js.Any = js.native
  def Ovals(Index: js.Any): js.Any = js.native
  def Paste(): scala.Unit = js.native
  def Paste(Destination: Range): scala.Unit = js.native
  def Paste(Destination: Range, Link: scala.Boolean): scala.Unit = js.native
  def PasteSpecial(
    Format: java.lang.String,
    Link: js.UndefOr[scala.Nothing],
    DisplayAsIcon: activexDashExcelLib.activexDashExcelLibNumbers.`true`
  ): scala.Unit = js.native
  def PasteSpecial(
    Format: java.lang.String,
    Link: js.UndefOr[scala.Nothing],
    DisplayAsIcon: activexDashExcelLib.activexDashExcelLibNumbers.`true`,
    IconFileName: java.lang.String
  ): scala.Unit = js.native
  def PasteSpecial(
    Format: java.lang.String,
    Link: js.UndefOr[scala.Nothing],
    DisplayAsIcon: activexDashExcelLib.activexDashExcelLibNumbers.`true`,
    IconFileName: java.lang.String,
    IconIndex: scala.Double
  ): scala.Unit = js.native
  def PasteSpecial(
    Format: java.lang.String,
    Link: js.UndefOr[scala.Nothing],
    DisplayAsIcon: activexDashExcelLib.activexDashExcelLibNumbers.`true`,
    IconFileName: java.lang.String,
    IconIndex: scala.Double,
    IconLabel: java.lang.String
  ): scala.Unit = js.native
  def PasteSpecial(
    Format: java.lang.String,
    Link: js.UndefOr[scala.Nothing],
    DisplayAsIcon: activexDashExcelLib.activexDashExcelLibNumbers.`true`,
    IconFileName: java.lang.String,
    IconIndex: scala.Double,
    IconLabel: java.lang.String,
    NoHTMLFormatting: scala.Boolean
  ): scala.Unit = js.native
  def PasteSpecial(
    Format: java.lang.String,
    Link: scala.Boolean,
    DisplayAsIcon: activexDashExcelLib.activexDashExcelLibNumbers.`true`
  ): scala.Unit = js.native
  def PasteSpecial(
    Format: java.lang.String,
    Link: scala.Boolean,
    DisplayAsIcon: activexDashExcelLib.activexDashExcelLibNumbers.`true`,
    IconFileName: java.lang.String
  ): scala.Unit = js.native
  def PasteSpecial(
    Format: java.lang.String,
    Link: scala.Boolean,
    DisplayAsIcon: activexDashExcelLib.activexDashExcelLibNumbers.`true`,
    IconFileName: java.lang.String,
    IconIndex: scala.Double
  ): scala.Unit = js.native
  def PasteSpecial(
    Format: java.lang.String,
    Link: scala.Boolean,
    DisplayAsIcon: activexDashExcelLib.activexDashExcelLibNumbers.`true`,
    IconFileName: java.lang.String,
    IconIndex: scala.Double,
    IconLabel: java.lang.String
  ): scala.Unit = js.native
  def PasteSpecial(
    Format: java.lang.String,
    Link: scala.Boolean,
    DisplayAsIcon: activexDashExcelLib.activexDashExcelLibNumbers.`true`,
    IconFileName: java.lang.String,
    IconIndex: scala.Double,
    IconLabel: java.lang.String,
    NoHTMLFormatting: scala.Boolean
  ): scala.Unit = js.native
  def PasteSpecial(
    Format: js.UndefOr[scala.Nothing],
    Link: js.UndefOr[scala.Nothing],
    DisplayAsIcon: activexDashExcelLib.activexDashExcelLibNumbers.`true`
  ): scala.Unit = js.native
  def PasteSpecial(
    Format: js.UndefOr[scala.Nothing],
    Link: js.UndefOr[scala.Nothing],
    DisplayAsIcon: activexDashExcelLib.activexDashExcelLibNumbers.`true`,
    IconFileName: java.lang.String
  ): scala.Unit = js.native
  def PasteSpecial(
    Format: js.UndefOr[scala.Nothing],
    Link: js.UndefOr[scala.Nothing],
    DisplayAsIcon: activexDashExcelLib.activexDashExcelLibNumbers.`true`,
    IconFileName: java.lang.String,
    IconIndex: scala.Double
  ): scala.Unit = js.native
  def PasteSpecial(
    Format: js.UndefOr[scala.Nothing],
    Link: js.UndefOr[scala.Nothing],
    DisplayAsIcon: activexDashExcelLib.activexDashExcelLibNumbers.`true`,
    IconFileName: java.lang.String,
    IconIndex: scala.Double,
    IconLabel: java.lang.String
  ): scala.Unit = js.native
  def PasteSpecial(
    Format: js.UndefOr[scala.Nothing],
    Link: js.UndefOr[scala.Nothing],
    DisplayAsIcon: activexDashExcelLib.activexDashExcelLibNumbers.`true`,
    IconFileName: java.lang.String,
    IconIndex: scala.Double,
    IconLabel: java.lang.String,
    NoHTMLFormatting: scala.Boolean
  ): scala.Unit = js.native
  def PasteSpecial(
    Format: js.UndefOr[java.lang.String],
    Link: js.UndefOr[scala.Boolean],
    DisplayAsIcon: js.UndefOr[scala.Boolean],
    IconFileName: js.UndefOr[js.UndefOr[scala.Nothing]],
    IconIndex: js.UndefOr[js.UndefOr[scala.Nothing]],
    IconLabel: js.UndefOr[js.UndefOr[scala.Nothing]],
    NoHTMLFormatting: js.UndefOr[scala.Boolean]
  ): scala.Unit = js.native
  def PasteSpecial(
    Format: js.UndefOr[scala.Nothing],
    Link: scala.Boolean,
    DisplayAsIcon: activexDashExcelLib.activexDashExcelLibNumbers.`true`
  ): scala.Unit = js.native
  def PasteSpecial(
    Format: js.UndefOr[scala.Nothing],
    Link: scala.Boolean,
    DisplayAsIcon: activexDashExcelLib.activexDashExcelLibNumbers.`true`,
    IconFileName: java.lang.String
  ): scala.Unit = js.native
  def PasteSpecial(
    Format: js.UndefOr[scala.Nothing],
    Link: scala.Boolean,
    DisplayAsIcon: activexDashExcelLib.activexDashExcelLibNumbers.`true`,
    IconFileName: java.lang.String,
    IconIndex: scala.Double
  ): scala.Unit = js.native
  def PasteSpecial(
    Format: js.UndefOr[scala.Nothing],
    Link: scala.Boolean,
    DisplayAsIcon: activexDashExcelLib.activexDashExcelLibNumbers.`true`,
    IconFileName: java.lang.String,
    IconIndex: scala.Double,
    IconLabel: java.lang.String
  ): scala.Unit = js.native
  def PasteSpecial(
    Format: js.UndefOr[scala.Nothing],
    Link: scala.Boolean,
    DisplayAsIcon: activexDashExcelLib.activexDashExcelLibNumbers.`true`,
    IconFileName: java.lang.String,
    IconIndex: scala.Double,
    IconLabel: java.lang.String,
    NoHTMLFormatting: scala.Boolean
  ): scala.Unit = js.native
  def Pictures(): js.Any = js.native
  def Pictures(Index: js.Any): js.Any = js.native
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
    Reserved: js.UndefOr[js.UndefOr[scala.Nothing]],
    BackgroundQuery: js.UndefOr[scala.Boolean],
    OptimizeCache: js.UndefOr[scala.Boolean],
    PageFieldOrder: js.UndefOr[XlOrder],
    PageFieldWrapCount: js.UndefOr[scala.Double],
    ReadData: js.UndefOr[scala.Boolean],
    Connection: js.UndefOr[java.lang.String]
  ): scala.Unit = js.native
  def PivotTables(): js.Any = js.native
  def PivotTables(Index: js.Any): js.Any = js.native
  def PrintOut[T /* <: js.UndefOr[scala.Boolean] */](
    From: js.UndefOr[scala.Double],
    To: js.UndefOr[scala.Double],
    Copies: js.UndefOr[scala.Double],
    Preview: js.UndefOr[scala.Boolean],
    ActivePrinter: js.UndefOr[java.lang.String],
    PrintToFile: js.UndefOr[T],
    Collate: js.UndefOr[scala.Boolean],
    PrToFileName: js.UndefOr[PrintToFileName[T]],
    IgnorePrintAreas: js.UndefOr[scala.Boolean]
  ): scala.Unit = js.native
  def PrintPreview(): scala.Unit = js.native
  def PrintPreview(EnableChanges: scala.Boolean): scala.Unit = js.native
  def Protect(
    Password: js.UndefOr[java.lang.String],
    DrawingObjects: js.UndefOr[scala.Boolean],
    Contents: js.UndefOr[scala.Boolean],
    Scenarios: js.UndefOr[scala.Boolean],
    UserInterfaceOnly: js.UndefOr[scala.Boolean],
    AllowFormattingCells: js.UndefOr[scala.Boolean],
    AllowFormattingColumns: js.UndefOr[scala.Boolean],
    AllowFormattingRows: js.UndefOr[scala.Boolean],
    AllowInsertingColumns: js.UndefOr[scala.Boolean],
    AllowInsertingRows: js.UndefOr[scala.Boolean],
    AllowInsertingHyperlinks: js.UndefOr[scala.Boolean],
    AllowDeletingColumns: js.UndefOr[scala.Boolean],
    AllowDeletingRows: js.UndefOr[scala.Boolean],
    AllowSorting: js.UndefOr[scala.Boolean],
    AllowFiltering: js.UndefOr[scala.Boolean],
    AllowUsingPivotTables: js.UndefOr[scala.Boolean]
  ): scala.Unit = js.native
  def QueryTables(Index: java.lang.String): QueryTable = js.native
  def QueryTables(Index: scala.Double): QueryTable = js.native
  def Range(Cell1: Range): Range = js.native
  def Range(Cell1: Range, Cell2: Range): Range = js.native
  def Range(Cell1: Range, Cell2: java.lang.String): Range = js.native
  def Range(Cell1: java.lang.String): Range = js.native
  def Range(Cell1: java.lang.String, Cell2: Range): Range = js.native
  def Range(Cell1: java.lang.String, Cell2: java.lang.String): Range = js.native
  def Rectangles(): js.Any = js.native
  def Rectangles(Index: js.Any): js.Any = js.native
  def ResetAllPageBreaks(): scala.Unit = js.native
  def Rows(Address: java.lang.String): Range = js.native
  def Rows(RowIndex: scala.Double): Range = js.native
  def Rows(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def SaveAs(
    Filename: java.lang.String,
    FileFormat: js.UndefOr[XlFileFormat],
    Password: js.UndefOr[java.lang.String],
    WriteResPassword: js.UndefOr[java.lang.String],
    ReadOnlyRecommended: js.UndefOr[scala.Boolean],
    CreateBackup: js.UndefOr[scala.Boolean],
    AddToMru: js.UndefOr[scala.Boolean],
    TextCodepage: js.UndefOr[js.Any],
    TextVisualLayout: js.UndefOr[js.Any],
    Local: js.UndefOr[scala.Boolean]
  ): scala.Unit = js.native
  def Scenarios(): Scenarios = js.native
  def Scenarios(Index: activexDashInteropLib.SafeArray[scala.Double | java.lang.String]): Scenarios = js.native
  def Scenarios(Index: java.lang.String): Scenario = js.native
  def Scenarios(Index: scala.Double): Scenario = js.native
  def Scripts(Index: js.Any): activexDashOfficeLib.OfficeNs.Script = js.native
  def ScrollBars(): js.Any = js.native
  def ScrollBars(Index: js.Any): js.Any = js.native
  def Select(): scala.Unit = js.native
  def Select(Replace: scala.Boolean): scala.Unit = js.native
  def SetBackgroundPicture(Filename: java.lang.String): scala.Unit = js.native
  def Shapes(Index: java.lang.String): Shape = js.native
  def Shapes(Index: scala.Double): Shape = js.native
  def ShowAllData(): scala.Unit = js.native
  def ShowDataForm(): scala.Unit = js.native
  def SmartTags(Index: js.Any): SmartTag = js.native
  def Spinners(): js.Any = js.native
  def Spinners(Index: js.Any): js.Any = js.native
  def TextBoxes(): js.Any = js.native
  def TextBoxes(Index: js.Any): js.Any = js.native
  def Unprotect(): scala.Unit = js.native
  def Unprotect(Password: java.lang.String): scala.Unit = js.native
  def UsedRange(Address: java.lang.String): Range = js.native
  def UsedRange(RowIndex: scala.Double): Range = js.native
  def UsedRange(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def VPageBreaks(Index: scala.Double): VPageBreak = js.native
  def XmlDataQuery(XPath: java.lang.String): Range | scala.Null = js.native
  def XmlDataQuery(XPath: java.lang.String, SelectionNamespaces: java.lang.String): Range | scala.Null = js.native
  def XmlDataQuery(XPath: java.lang.String, SelectionNamespaces: java.lang.String, Map: XmlMap): Range | scala.Null = js.native
  def XmlMapQuery(XPath: java.lang.String): Range = js.native
  def XmlMapQuery(XPath: java.lang.String, SelectionNamespaces: java.lang.String): Range = js.native
  def XmlMapQuery(XPath: java.lang.String, SelectionNamespaces: java.lang.String, Map: XmlMap): Range = js.native
  def _CheckSpelling(
    CustomDictionary: js.UndefOr[js.Any],
    IgnoreUppercase: js.UndefOr[js.Any],
    AlwaysSuggest: js.UndefOr[js.Any],
    SpellLang: js.UndefOr[js.Any],
    IgnoreFinalYaa: js.UndefOr[js.Any],
    SpellScript: js.UndefOr[js.Any]
  ): scala.Unit = js.native
  def _Evaluate(Name: js.Any): js.Any = js.native
  def _PasteSpecial(
    Format: js.UndefOr[js.Any],
    Link: js.UndefOr[js.Any],
    DisplayAsIcon: js.UndefOr[js.Any],
    IconFileName: js.UndefOr[js.Any],
    IconIndex: js.UndefOr[js.Any],
    IconLabel: js.UndefOr[js.Any]
  ): scala.Unit = js.native
  def _PrintOut(
    From: js.UndefOr[js.Any],
    To: js.UndefOr[js.Any],
    Copies: js.UndefOr[js.Any],
    Preview: js.UndefOr[js.Any],
    ActivePrinter: js.UndefOr[js.Any],
    PrintToFile: js.UndefOr[js.Any],
    Collate: js.UndefOr[js.Any],
    PrToFileName: js.UndefOr[js.Any]
  ): scala.Unit = js.native
  def _Protect(): scala.Unit = js.native
  def _Protect(Password: js.Any): scala.Unit = js.native
  def _Protect(Password: js.Any, DrawingObjects: js.Any): scala.Unit = js.native
  def _Protect(Password: js.Any, DrawingObjects: js.Any, Contents: js.Any): scala.Unit = js.native
  def _Protect(Password: js.Any, DrawingObjects: js.Any, Contents: js.Any, Scenarios: js.Any): scala.Unit = js.native
  def _Protect(
    Password: js.Any,
    DrawingObjects: js.Any,
    Contents: js.Any,
    Scenarios: js.Any,
    UserInterfaceOnly: js.Any
  ): scala.Unit = js.native
  def _SaveAs(
    Filename: java.lang.String,
    FileFormat: js.UndefOr[js.Any],
    Password: js.UndefOr[js.Any],
    WriteResPassword: js.UndefOr[js.Any],
    ReadOnlyRecommended: js.UndefOr[js.Any],
    CreateBackup: js.UndefOr[js.Any],
    AddToMru: js.UndefOr[js.Any],
    TextCodepage: js.UndefOr[js.Any],
    TextVisualLayout: js.UndefOr[js.Any]
  ): scala.Unit = js.native
  def __PrintOut(
    From: js.UndefOr[js.Any],
    To: js.UndefOr[js.Any],
    Copies: js.UndefOr[js.Any],
    Preview: js.UndefOr[js.Any],
    ActivePrinter: js.UndefOr[js.Any],
    PrintToFile: js.UndefOr[js.Any],
    Collate: js.UndefOr[js.Any]
  ): scala.Unit = js.native
}

