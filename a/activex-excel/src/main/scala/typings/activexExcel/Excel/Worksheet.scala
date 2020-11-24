package typings.activexExcel.Excel

import typings.activexExcel.activexExcelBooleans.`true`
import typings.activexOffice.Office.MsoEnvelope
import typings.activexOffice.Office.MsoLanguageID
import typings.activexOffice.Office.Script
import typings.activexOffice.Office.Scripts
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.activexExcel.Excel.AddSheetResult because Already inherited */ @js.native
trait Worksheet extends Sheet {
  
  def Activate(): Unit = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  def Arcs(): js.Any = js.native
  def Arcs(Index: js.Any): js.Any = js.native
  
  val AutoFilter: typings.activexExcel.Excel.AutoFilter = js.native
  
  var AutoFilterMode: Boolean = js.native
  
  def Buttons(): js.Any = js.native
  def Buttons(Index: js.Any): js.Any = js.native
  
  def Calculate(): Unit = js.native
  
  def Cells(Address: String): Range = js.native
  def Cells(RowIndex: Double): Range = js.native
  def Cells(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("Cells")
  val Cells_Original: Range = js.native
  
  def ChartObjects(): typings.activexExcel.Excel.ChartObjects = js.native
  def ChartObjects(Index: String): ChartObject = js.native
  def ChartObjects(Index: Double): ChartObject = js.native
  def ChartObjects(Index: SafeArray[String | Double]): typings.activexExcel.Excel.ChartObjects = js.native
  
  def CheckBoxes(): js.Any = js.native
  def CheckBoxes(Index: js.Any): js.Any = js.native
  
  def CheckSpelling(): Unit = js.native
  def CheckSpelling(
    CustomDictionary: js.UndefOr[scala.Nothing],
    IgnoreUppercase: js.UndefOr[scala.Nothing],
    AlwaysSuggest: js.UndefOr[scala.Nothing],
    SpellLang: MsoLanguageID
  ): Unit = js.native
  def CheckSpelling(
    CustomDictionary: js.UndefOr[scala.Nothing],
    IgnoreUppercase: js.UndefOr[scala.Nothing],
    AlwaysSuggest: Boolean
  ): Unit = js.native
  def CheckSpelling(
    CustomDictionary: js.UndefOr[scala.Nothing],
    IgnoreUppercase: js.UndefOr[scala.Nothing],
    AlwaysSuggest: Boolean,
    SpellLang: MsoLanguageID
  ): Unit = js.native
  def CheckSpelling(CustomDictionary: js.UndefOr[scala.Nothing], IgnoreUppercase: Boolean): Unit = js.native
  def CheckSpelling(
    CustomDictionary: js.UndefOr[scala.Nothing],
    IgnoreUppercase: Boolean,
    AlwaysSuggest: js.UndefOr[scala.Nothing],
    SpellLang: MsoLanguageID
  ): Unit = js.native
  def CheckSpelling(CustomDictionary: js.UndefOr[scala.Nothing], IgnoreUppercase: Boolean, AlwaysSuggest: Boolean): Unit = js.native
  def CheckSpelling(
    CustomDictionary: js.UndefOr[scala.Nothing],
    IgnoreUppercase: Boolean,
    AlwaysSuggest: Boolean,
    SpellLang: MsoLanguageID
  ): Unit = js.native
  def CheckSpelling(CustomDictionary: String): Unit = js.native
  def CheckSpelling(
    CustomDictionary: String,
    IgnoreUppercase: js.UndefOr[scala.Nothing],
    AlwaysSuggest: js.UndefOr[scala.Nothing],
    SpellLang: MsoLanguageID
  ): Unit = js.native
  def CheckSpelling(CustomDictionary: String, IgnoreUppercase: js.UndefOr[scala.Nothing], AlwaysSuggest: Boolean): Unit = js.native
  def CheckSpelling(
    CustomDictionary: String,
    IgnoreUppercase: js.UndefOr[scala.Nothing],
    AlwaysSuggest: Boolean,
    SpellLang: MsoLanguageID
  ): Unit = js.native
  def CheckSpelling(CustomDictionary: String, IgnoreUppercase: Boolean): Unit = js.native
  def CheckSpelling(
    CustomDictionary: String,
    IgnoreUppercase: Boolean,
    AlwaysSuggest: js.UndefOr[scala.Nothing],
    SpellLang: MsoLanguageID
  ): Unit = js.native
  def CheckSpelling(CustomDictionary: String, IgnoreUppercase: Boolean, AlwaysSuggest: Boolean): Unit = js.native
  def CheckSpelling(
    CustomDictionary: String,
    IgnoreUppercase: Boolean,
    AlwaysSuggest: Boolean,
    SpellLang: MsoLanguageID
  ): Unit = js.native
  
  def CircleInvalid(): Unit = js.native
  
  def CircularReference(Address: String): Range = js.native
  def CircularReference(RowIndex: Double): Range = js.native
  def CircularReference(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("CircularReference")
  val CircularReference_Original: Range = js.native
  
  def ClearArrows(): Unit = js.native
  
  def ClearCircles(): Unit = js.native
  
  val CodeName: String = js.native
  
  def Columns(Address: String): Range = js.native
  def Columns(RowIndex: Double): Range = js.native
  def Columns(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("Columns")
  val Columns_Original: Range = js.native
  
  def Comments(Index: Double): Comment = js.native
  @JSName("Comments")
  val Comments_Original: Comments = js.native
  
  val ConsolidationFunction: XlConsolidationFunction = js.native
  
  val ConsolidationOptions: SafeArray[Boolean] = js.native
  
  val ConsolidationSources: js.UndefOr[SafeArray[String]] = js.native
  
  def Copy(): Unit = js.native
  def Copy(Before: js.UndefOr[scala.Nothing], After: Sheet): Unit = js.native
  def Copy(Before: Sheet): Unit = js.native
  
  val Creator: XlCreator = js.native
  
  def CustomProperties(Index: String): CustomProperty = js.native
  def CustomProperties(Index: Double): CustomProperty = js.native
  @JSName("CustomProperties")
  val CustomProperties_Original: CustomProperties = js.native
  
  def Delete(): Unit = js.native
  
  var DisplayAutomaticPageBreaks: Boolean = js.native
  
  var DisplayPageBreaks: Boolean = js.native
  
  var DisplayRightToLeft: Boolean = js.native
  
  def DrawingObjects(): js.Any = js.native
  def DrawingObjects(Index: js.Any): js.Any = js.native
  
  def Drawings(): js.Any = js.native
  def Drawings(Index: js.Any): js.Any = js.native
  
  def DropDowns(): js.Any = js.native
  def DropDowns(Index: js.Any): js.Any = js.native
  
  var EnableAutoFilter: Boolean = js.native
  
  var EnableCalculation: Boolean = js.native
  
  var EnableFormatConditionsCalculation: Boolean = js.native
  
  var EnableOutlining: Boolean = js.native
  
  var EnablePivotTable: Boolean = js.native
  
  var EnableSelection: XlEnableSelection = js.native
  
  def Evaluate(Name: String): js.Any = js.native
  
  @JSName("Excel.Worksheet_typekey")
  var ExcelDotWorksheet_typekey: Worksheet = js.native
  
  def ExportAsFixedFormat(
    Type: XlFixedFormatType,
    Filename: js.UndefOr[String],
    Quality: js.UndefOr[XlFixedFormatQuality],
    IncludeDocProperties: js.UndefOr[Boolean],
    IgnorePrintAreas: js.UndefOr[Boolean],
    From: js.UndefOr[Double],
    To: js.UndefOr[Double],
    OpenAfterPublish: js.UndefOr[Boolean],
    FixedFormatExtClassPtr: js.UndefOr[js.Any]
  ): Unit = js.native
  
  val FilterMode: Boolean = js.native
  
  def GroupBoxes(): js.Any = js.native
  def GroupBoxes(Index: js.Any): js.Any = js.native
  
  def GroupObjects(): js.Any = js.native
  def GroupObjects(Index: js.Any): js.Any = js.native
  
  def HPageBreaks(Index: Double): HPageBreak = js.native
  @JSName("HPageBreaks")
  val HPageBreaks_Original: HPageBreaks = js.native
  
  def Hyperlinks(Index: String): Hyperlink = js.native
  def Hyperlinks(Index: Double): Hyperlink = js.native
  @JSName("Hyperlinks")
  val Hyperlinks_Original: Hyperlinks = js.native
  
  val Index: Double = js.native
  
  def Labels(): js.Any = js.native
  def Labels(Index: js.Any): js.Any = js.native
  
  def Lines(): js.Any = js.native
  def Lines(Index: js.Any): js.Any = js.native
  
  def ListBoxes(): js.Any = js.native
  def ListBoxes(Index: js.Any): js.Any = js.native
  
  def ListObjects(Index: String): ListObject = js.native
  def ListObjects(Index: Double): ListObject = js.native
  @JSName("ListObjects")
  val ListObjects_Original: ListObjects = js.native
  
  val MailEnvelope: MsoEnvelope = js.native
  
  def Move(): Unit = js.native
  def Move(Before: js.UndefOr[scala.Nothing], After: Sheet): Unit = js.native
  def Move(Before: Sheet): Unit = js.native
  def Move(Before: Sheet, After: Sheet): Unit = js.native
  
  var Name: String = js.native
  
  def Names(Index: js.UndefOr[scala.Nothing], IndexLocal: js.UndefOr[scala.Nothing], RefersTo: String): Name = js.native
  def Names(Index: js.UndefOr[scala.Nothing], IndexLocal: String): Name = js.native
  def Names(Index: String): Name = js.native
  def Names(Index: Double): Name = js.native
  @JSName("Names")
  val Names_Original: Names = js.native
  
  val Next: Worksheet = js.native
  
  def OLEObjects(): typings.activexExcel.Excel.OLEObjects = js.native
  def OLEObjects(Index: String): OLEObject = js.native
  def OLEObjects(Index: Double): OLEObject = js.native
  
  var OnCalculate: String = js.native
  
  var OnData: String = js.native
  
  var OnDoubleClick: String = js.native
  
  var OnEntry: String = js.native
  
  var OnSheetActivate: String = js.native
  
  var OnSheetDeactivate: String = js.native
  
  def OptionButtons(): js.Any = js.native
  def OptionButtons(Index: js.Any): js.Any = js.native
  
  val Outline: typings.activexExcel.Excel.Outline = js.native
  
  def Ovals(): js.Any = js.native
  def Ovals(Index: js.Any): js.Any = js.native
  
  val PageSetup: typings.activexExcel.Excel.PageSetup = js.native
  
  val Parent: js.Any = js.native
  
  def Paste(): Unit = js.native
  def Paste(Destination: js.UndefOr[scala.Nothing], Link: Boolean): Unit = js.native
  def Paste(Destination: Range): Unit = js.native
  def Paste(Destination: Range, Link: Boolean): Unit = js.native
  
  def PasteSpecial(): Unit = js.native
  def PasteSpecial(
    Format: js.UndefOr[scala.Nothing],
    Link: js.UndefOr[scala.Nothing],
    DisplayAsIcon: js.UndefOr[scala.Nothing],
    IconFileName: js.UndefOr[scala.Nothing],
    IconIndex: js.UndefOr[scala.Nothing],
    IconLabel: js.UndefOr[scala.Nothing],
    NoHTMLFormatting: Boolean
  ): Unit = js.native
  def PasteSpecial(Format: js.UndefOr[scala.Nothing], Link: js.UndefOr[scala.Nothing], DisplayAsIcon: Boolean): Unit = js.native
  def PasteSpecial(
    Format: js.UndefOr[scala.Nothing],
    Link: js.UndefOr[scala.Nothing],
    DisplayAsIcon: Boolean,
    IconFileName: js.UndefOr[scala.Nothing],
    IconIndex: js.UndefOr[scala.Nothing],
    IconLabel: js.UndefOr[scala.Nothing],
    NoHTMLFormatting: Boolean
  ): Unit = js.native
  def PasteSpecial(Format: js.UndefOr[scala.Nothing], Link: Boolean): Unit = js.native
  def PasteSpecial(
    Format: js.UndefOr[scala.Nothing],
    Link: Boolean,
    DisplayAsIcon: js.UndefOr[scala.Nothing],
    IconFileName: js.UndefOr[scala.Nothing],
    IconIndex: js.UndefOr[scala.Nothing],
    IconLabel: js.UndefOr[scala.Nothing],
    NoHTMLFormatting: Boolean
  ): Unit = js.native
  def PasteSpecial(Format: js.UndefOr[scala.Nothing], Link: Boolean, DisplayAsIcon: Boolean): Unit = js.native
  def PasteSpecial(
    Format: js.UndefOr[scala.Nothing],
    Link: Boolean,
    DisplayAsIcon: Boolean,
    IconFileName: js.UndefOr[scala.Nothing],
    IconIndex: js.UndefOr[scala.Nothing],
    IconLabel: js.UndefOr[scala.Nothing],
    NoHTMLFormatting: Boolean
  ): Unit = js.native
  def PasteSpecial(Format: String): Unit = js.native
  def PasteSpecial(
    Format: String,
    Link: js.UndefOr[scala.Nothing],
    DisplayAsIcon: js.UndefOr[scala.Nothing],
    IconFileName: js.UndefOr[scala.Nothing],
    IconIndex: js.UndefOr[scala.Nothing],
    IconLabel: js.UndefOr[scala.Nothing],
    NoHTMLFormatting: Boolean
  ): Unit = js.native
  def PasteSpecial(Format: String, Link: js.UndefOr[scala.Nothing], DisplayAsIcon: Boolean): Unit = js.native
  def PasteSpecial(
    Format: String,
    Link: js.UndefOr[scala.Nothing],
    DisplayAsIcon: Boolean,
    IconFileName: js.UndefOr[scala.Nothing],
    IconIndex: js.UndefOr[scala.Nothing],
    IconLabel: js.UndefOr[scala.Nothing],
    NoHTMLFormatting: Boolean
  ): Unit = js.native
  def PasteSpecial(Format: String, Link: Boolean): Unit = js.native
  def PasteSpecial(
    Format: String,
    Link: Boolean,
    DisplayAsIcon: js.UndefOr[scala.Nothing],
    IconFileName: js.UndefOr[scala.Nothing],
    IconIndex: js.UndefOr[scala.Nothing],
    IconLabel: js.UndefOr[scala.Nothing],
    NoHTMLFormatting: Boolean
  ): Unit = js.native
  def PasteSpecial(Format: String, Link: Boolean, DisplayAsIcon: Boolean): Unit = js.native
  def PasteSpecial(
    Format: String,
    Link: Boolean,
    DisplayAsIcon: Boolean,
    IconFileName: js.UndefOr[scala.Nothing],
    IconIndex: js.UndefOr[scala.Nothing],
    IconLabel: js.UndefOr[scala.Nothing],
    NoHTMLFormatting: Boolean
  ): Unit = js.native
  @JSName("PasteSpecial")
  def PasteSpecial_true(
    Format: js.UndefOr[String],
    Link: js.UndefOr[Boolean],
    DisplayAsIcon: `true`,
    IconFileName: js.UndefOr[String],
    IconIndex: js.UndefOr[Double],
    IconLabel: js.UndefOr[String],
    NoHTMLFormatting: js.UndefOr[Boolean]
  ): Unit = js.native
  
  def Pictures(): js.Any = js.native
  def Pictures(Index: js.Any): js.Any = js.native
  
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
  
  def PivotTables(): js.Any = js.native
  def PivotTables(Index: js.Any): js.Any = js.native
  
  val Previous: Worksheet = js.native
  
  def PrintOut[T /* <: js.UndefOr[Boolean] */](
    From: js.UndefOr[Double],
    To: js.UndefOr[Double],
    Copies: js.UndefOr[Double],
    Preview: js.UndefOr[Boolean],
    ActivePrinter: js.UndefOr[String],
    PrintToFile: js.UndefOr[T],
    Collate: js.UndefOr[Boolean],
    PrToFileName: js.UndefOr[PrintToFileName[T]],
    IgnorePrintAreas: js.UndefOr[Boolean]
  ): Unit = js.native
  
  def PrintPreview(): Unit = js.native
  def PrintPreview(EnableChanges: Boolean): Unit = js.native
  
  val PrintedCommentPages: Double = js.native
  
  def Protect(
    Password: js.UndefOr[String],
    DrawingObjects: js.UndefOr[Boolean],
    Contents: js.UndefOr[Boolean],
    Scenarios: js.UndefOr[Boolean],
    UserInterfaceOnly: js.UndefOr[Boolean],
    AllowFormattingCells: js.UndefOr[Boolean],
    AllowFormattingColumns: js.UndefOr[Boolean],
    AllowFormattingRows: js.UndefOr[Boolean],
    AllowInsertingColumns: js.UndefOr[Boolean],
    AllowInsertingRows: js.UndefOr[Boolean],
    AllowInsertingHyperlinks: js.UndefOr[Boolean],
    AllowDeletingColumns: js.UndefOr[Boolean],
    AllowDeletingRows: js.UndefOr[Boolean],
    AllowSorting: js.UndefOr[Boolean],
    AllowFiltering: js.UndefOr[Boolean],
    AllowUsingPivotTables: js.UndefOr[Boolean]
  ): Unit = js.native
  
  val ProtectContents: Boolean = js.native
  
  val ProtectDrawingObjects: Boolean = js.native
  
  val ProtectScenarios: Boolean = js.native
  
  val Protection: typings.activexExcel.Excel.Protection = js.native
  
  val ProtectionMode: Boolean = js.native
  
  def QueryTables(Index: String): QueryTable = js.native
  def QueryTables(Index: Double): QueryTable = js.native
  @JSName("QueryTables")
  val QueryTables_Original: QueryTables = js.native
  
  def Range(Cell1: String): typings.activexExcel.Excel.Range = js.native
  def Range(Cell1: String, Cell2: String): typings.activexExcel.Excel.Range = js.native
  def Range(Cell1: String, Cell2: typings.activexExcel.Excel.Range): typings.activexExcel.Excel.Range = js.native
  def Range(Cell1: typings.activexExcel.Excel.Range): typings.activexExcel.Excel.Range = js.native
  def Range(Cell1: typings.activexExcel.Excel.Range, Cell2: String): typings.activexExcel.Excel.Range = js.native
  def Range(Cell1: typings.activexExcel.Excel.Range, Cell2: typings.activexExcel.Excel.Range): typings.activexExcel.Excel.Range = js.native
  
  def Rectangles(): js.Any = js.native
  def Rectangles(Index: js.Any): js.Any = js.native
  
  def ResetAllPageBreaks(): Unit = js.native
  
  def Rows(Address: String): Range = js.native
  def Rows(RowIndex: Double): Range = js.native
  def Rows(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("Rows")
  val Rows_Original: Range = js.native
  
  def SaveAs(
    Filename: String,
    FileFormat: js.UndefOr[XlFileFormat],
    Password: js.UndefOr[String],
    WriteResPassword: js.UndefOr[String],
    ReadOnlyRecommended: js.UndefOr[Boolean],
    CreateBackup: js.UndefOr[Boolean],
    AddToMru: js.UndefOr[Boolean],
    TextCodepage: js.UndefOr[js.Any],
    TextVisualLayout: js.UndefOr[js.Any],
    Local: js.UndefOr[Boolean]
  ): Unit = js.native
  
  def Scenarios(): typings.activexExcel.Excel.Scenarios = js.native
  def Scenarios(Index: String): Scenario = js.native
  def Scenarios(Index: Double): Scenario = js.native
  def Scenarios(Index: SafeArray[Double | String]): typings.activexExcel.Excel.Scenarios = js.native
  
  def Scripts(Index: js.Any): Script = js.native
  @JSName("Scripts")
  val Scripts_Original: Scripts = js.native
  
  var ScrollArea: String = js.native
  
  def ScrollBars(): js.Any = js.native
  def ScrollBars(Index: js.Any): js.Any = js.native
  
  def Select(): Unit = js.native
  def Select(Replace: Boolean): Unit = js.native
  
  def SetBackgroundPicture(Filename: String): Unit = js.native
  
  def Shapes(Index: String): Shape = js.native
  def Shapes(Index: Double): Shape = js.native
  @JSName("Shapes")
  val Shapes_Original: Shapes = js.native
  
  def ShowAllData(): Unit = js.native
  
  def ShowDataForm(): Unit = js.native
  
  def SmartTags(Index: js.Any): SmartTag = js.native
  @JSName("SmartTags")
  val SmartTags_Original: SmartTags = js.native
  
  val Sort: typings.activexExcel.Excel.Sort = js.native
  
  def Spinners(): js.Any = js.native
  def Spinners(Index: js.Any): js.Any = js.native
  
  val StandardHeight: Double = js.native
  
  var StandardWidth: Double = js.native
  
  val Tab: typings.activexExcel.Excel.Tab = js.native
  
  def TextBoxes(): js.Any = js.native
  def TextBoxes(Index: js.Any): js.Any = js.native
  
  var TransitionExpEval: Boolean = js.native
  
  var TransitionFormEntry: Boolean = js.native
  
  val Type: XlSheetType = js.native
  
  def Unprotect(): Unit = js.native
  def Unprotect(Password: String): Unit = js.native
  
  def UsedRange(Address: String): Range = js.native
  def UsedRange(RowIndex: Double): Range = js.native
  def UsedRange(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("UsedRange")
  val UsedRange_Original: Range = js.native
  
  def VPageBreaks(Index: Double): VPageBreak = js.native
  @JSName("VPageBreaks")
  val VPageBreaks_Original: VPageBreaks = js.native
  
  var Visible: XlSheetVisibility = js.native
  
  def XmlDataQuery(XPath: String): Range | Null = js.native
  def XmlDataQuery(XPath: String, SelectionNamespaces: js.UndefOr[scala.Nothing], Map: XmlMap): Range | Null = js.native
  def XmlDataQuery(XPath: String, SelectionNamespaces: String): Range | Null = js.native
  def XmlDataQuery(XPath: String, SelectionNamespaces: String, Map: XmlMap): Range | Null = js.native
  
  def XmlMapQuery(XPath: String): Range = js.native
  def XmlMapQuery(XPath: String, SelectionNamespaces: js.UndefOr[scala.Nothing], Map: XmlMap): Range = js.native
  def XmlMapQuery(XPath: String, SelectionNamespaces: String): Range = js.native
  def XmlMapQuery(XPath: String, SelectionNamespaces: String, Map: XmlMap): Range = js.native
  
  def _CheckSpelling(
    CustomDictionary: js.UndefOr[js.Any],
    IgnoreUppercase: js.UndefOr[js.Any],
    AlwaysSuggest: js.UndefOr[js.Any],
    SpellLang: js.UndefOr[js.Any],
    IgnoreFinalYaa: js.UndefOr[js.Any],
    SpellScript: js.UndefOr[js.Any]
  ): Unit = js.native
  
  var _CodeName: String = js.native
  
  var _DisplayRightToLeft: Double = js.native
  
  def _Evaluate(Name: js.Any): js.Any = js.native
  
  def _PasteSpecial(
    Format: js.UndefOr[js.Any],
    Link: js.UndefOr[js.Any],
    DisplayAsIcon: js.UndefOr[js.Any],
    IconFileName: js.UndefOr[js.Any],
    IconIndex: js.UndefOr[js.Any],
    IconLabel: js.UndefOr[js.Any]
  ): Unit = js.native
  
  def _PrintOut(
    From: js.UndefOr[js.Any],
    To: js.UndefOr[js.Any],
    Copies: js.UndefOr[js.Any],
    Preview: js.UndefOr[js.Any],
    ActivePrinter: js.UndefOr[js.Any],
    PrintToFile: js.UndefOr[js.Any],
    Collate: js.UndefOr[js.Any],
    PrToFileName: js.UndefOr[js.Any]
  ): Unit = js.native
  
  def _Protect(): Unit = js.native
  def _Protect(
    Password: js.UndefOr[scala.Nothing],
    DrawingObjects: js.UndefOr[scala.Nothing],
    Contents: js.UndefOr[scala.Nothing],
    Scenarios: js.UndefOr[scala.Nothing],
    UserInterfaceOnly: js.Any
  ): Unit = js.native
  def _Protect(
    Password: js.UndefOr[scala.Nothing],
    DrawingObjects: js.UndefOr[scala.Nothing],
    Contents: js.UndefOr[scala.Nothing],
    Scenarios: js.Any
  ): Unit = js.native
  def _Protect(
    Password: js.UndefOr[scala.Nothing],
    DrawingObjects: js.UndefOr[scala.Nothing],
    Contents: js.UndefOr[scala.Nothing],
    Scenarios: js.Any,
    UserInterfaceOnly: js.Any
  ): Unit = js.native
  def _Protect(Password: js.UndefOr[scala.Nothing], DrawingObjects: js.UndefOr[scala.Nothing], Contents: js.Any): Unit = js.native
  def _Protect(
    Password: js.UndefOr[scala.Nothing],
    DrawingObjects: js.UndefOr[scala.Nothing],
    Contents: js.Any,
    Scenarios: js.UndefOr[scala.Nothing],
    UserInterfaceOnly: js.Any
  ): Unit = js.native
  def _Protect(
    Password: js.UndefOr[scala.Nothing],
    DrawingObjects: js.UndefOr[scala.Nothing],
    Contents: js.Any,
    Scenarios: js.Any
  ): Unit = js.native
  def _Protect(
    Password: js.UndefOr[scala.Nothing],
    DrawingObjects: js.UndefOr[scala.Nothing],
    Contents: js.Any,
    Scenarios: js.Any,
    UserInterfaceOnly: js.Any
  ): Unit = js.native
  def _Protect(Password: js.UndefOr[scala.Nothing], DrawingObjects: js.Any): Unit = js.native
  def _Protect(
    Password: js.UndefOr[scala.Nothing],
    DrawingObjects: js.Any,
    Contents: js.UndefOr[scala.Nothing],
    Scenarios: js.UndefOr[scala.Nothing],
    UserInterfaceOnly: js.Any
  ): Unit = js.native
  def _Protect(
    Password: js.UndefOr[scala.Nothing],
    DrawingObjects: js.Any,
    Contents: js.UndefOr[scala.Nothing],
    Scenarios: js.Any
  ): Unit = js.native
  def _Protect(
    Password: js.UndefOr[scala.Nothing],
    DrawingObjects: js.Any,
    Contents: js.UndefOr[scala.Nothing],
    Scenarios: js.Any,
    UserInterfaceOnly: js.Any
  ): Unit = js.native
  def _Protect(Password: js.UndefOr[scala.Nothing], DrawingObjects: js.Any, Contents: js.Any): Unit = js.native
  def _Protect(
    Password: js.UndefOr[scala.Nothing],
    DrawingObjects: js.Any,
    Contents: js.Any,
    Scenarios: js.UndefOr[scala.Nothing],
    UserInterfaceOnly: js.Any
  ): Unit = js.native
  def _Protect(Password: js.UndefOr[scala.Nothing], DrawingObjects: js.Any, Contents: js.Any, Scenarios: js.Any): Unit = js.native
  def _Protect(
    Password: js.UndefOr[scala.Nothing],
    DrawingObjects: js.Any,
    Contents: js.Any,
    Scenarios: js.Any,
    UserInterfaceOnly: js.Any
  ): Unit = js.native
  def _Protect(Password: js.Any): Unit = js.native
  def _Protect(
    Password: js.Any,
    DrawingObjects: js.UndefOr[scala.Nothing],
    Contents: js.UndefOr[scala.Nothing],
    Scenarios: js.UndefOr[scala.Nothing],
    UserInterfaceOnly: js.Any
  ): Unit = js.native
  def _Protect(
    Password: js.Any,
    DrawingObjects: js.UndefOr[scala.Nothing],
    Contents: js.UndefOr[scala.Nothing],
    Scenarios: js.Any
  ): Unit = js.native
  def _Protect(
    Password: js.Any,
    DrawingObjects: js.UndefOr[scala.Nothing],
    Contents: js.UndefOr[scala.Nothing],
    Scenarios: js.Any,
    UserInterfaceOnly: js.Any
  ): Unit = js.native
  def _Protect(Password: js.Any, DrawingObjects: js.UndefOr[scala.Nothing], Contents: js.Any): Unit = js.native
  def _Protect(
    Password: js.Any,
    DrawingObjects: js.UndefOr[scala.Nothing],
    Contents: js.Any,
    Scenarios: js.UndefOr[scala.Nothing],
    UserInterfaceOnly: js.Any
  ): Unit = js.native
  def _Protect(Password: js.Any, DrawingObjects: js.UndefOr[scala.Nothing], Contents: js.Any, Scenarios: js.Any): Unit = js.native
  def _Protect(
    Password: js.Any,
    DrawingObjects: js.UndefOr[scala.Nothing],
    Contents: js.Any,
    Scenarios: js.Any,
    UserInterfaceOnly: js.Any
  ): Unit = js.native
  def _Protect(Password: js.Any, DrawingObjects: js.Any): Unit = js.native
  def _Protect(
    Password: js.Any,
    DrawingObjects: js.Any,
    Contents: js.UndefOr[scala.Nothing],
    Scenarios: js.UndefOr[scala.Nothing],
    UserInterfaceOnly: js.Any
  ): Unit = js.native
  def _Protect(Password: js.Any, DrawingObjects: js.Any, Contents: js.UndefOr[scala.Nothing], Scenarios: js.Any): Unit = js.native
  def _Protect(
    Password: js.Any,
    DrawingObjects: js.Any,
    Contents: js.UndefOr[scala.Nothing],
    Scenarios: js.Any,
    UserInterfaceOnly: js.Any
  ): Unit = js.native
  def _Protect(Password: js.Any, DrawingObjects: js.Any, Contents: js.Any): Unit = js.native
  def _Protect(
    Password: js.Any,
    DrawingObjects: js.Any,
    Contents: js.Any,
    Scenarios: js.UndefOr[scala.Nothing],
    UserInterfaceOnly: js.Any
  ): Unit = js.native
  def _Protect(Password: js.Any, DrawingObjects: js.Any, Contents: js.Any, Scenarios: js.Any): Unit = js.native
  def _Protect(
    Password: js.Any,
    DrawingObjects: js.Any,
    Contents: js.Any,
    Scenarios: js.Any,
    UserInterfaceOnly: js.Any
  ): Unit = js.native
  
  def _SaveAs(
    Filename: String,
    FileFormat: js.UndefOr[js.Any],
    Password: js.UndefOr[js.Any],
    WriteResPassword: js.UndefOr[js.Any],
    ReadOnlyRecommended: js.UndefOr[js.Any],
    CreateBackup: js.UndefOr[js.Any],
    AddToMru: js.UndefOr[js.Any],
    TextCodepage: js.UndefOr[js.Any],
    TextVisualLayout: js.UndefOr[js.Any]
  ): Unit = js.native
  
  def __PrintOut(
    From: js.UndefOr[js.Any],
    To: js.UndefOr[js.Any],
    Copies: js.UndefOr[js.Any],
    Preview: js.UndefOr[js.Any],
    ActivePrinter: js.UndefOr[js.Any],
    PrintToFile: js.UndefOr[js.Any],
    Collate: js.UndefOr[js.Any]
  ): Unit = js.native
}
