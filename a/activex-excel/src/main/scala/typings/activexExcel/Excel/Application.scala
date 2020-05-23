package typings.activexExcel.Excel

import typings.activexExcel.activexExcelBooleans.`false`
import typings.activexExcel.activexExcelBooleans.`true`
import typings.activexExcel.activexExcelNumbers.`1`
import typings.activexExcel.activexExcelNumbers.`2`
import typings.activexExcel.activexExcelNumbers.`3`
import typings.activexExcel.activexExcelNumbers.`4`
import typings.activexExcel.activexExcelStrings._empty
import typings.activexOffice.Office.COMAddIn
import typings.activexOffice.Office.COMAddIns
import typings.activexOffice.Office.CommandBar
import typings.activexOffice.Office.CommandBars
import typings.activexOffice.Office.IAssistance
import typings.activexOffice.Office.IFind
import typings.activexOffice.Office.MsoAutomationSecurity
import typings.activexOffice.Office.MsoFeatureInstall
import typings.activexOffice.Office.MsoFileDialogType
import typings.activexOffice.Office.MsoFileValidationMode
import typings.activexOffice.Office.NewFile
import typings.activexOffice.Office.SmartArtColor
import typings.activexOffice.Office.SmartArtColors
import typings.activexOffice.Office.SmartArtLayout
import typings.activexOffice.Office.SmartArtLayouts
import typings.activexOffice.Office.SmartArtQuickStyle
import typings.activexOffice.Office.SmartArtQuickStyles
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Application extends js.Object {
  @JSName("ActiveCell")
  val ActiveCell_Original: Range = js.native
  val ActiveChart: Chart = js.native
  val ActiveDialog: DialogSheet = js.native
  val ActiveEncryptionSession: Double = js.native
  val ActiveMenuBar: MenuBar = js.native
  var ActivePrinter: String = js.native
  val ActiveProtectedViewWindow: ProtectedViewWindow = js.native
  val ActiveSheet: Sheet = js.native
  val ActiveWindow: Window = js.native
  val ActiveWorkbook: Workbook = js.native
  @JSName("AddIns2")
  val AddIns2_Original: AddIns2 = js.native
  @JSName("AddIns")
  val AddIns_Original: AddIns = js.native
  var AlertBeforeOverwriting: Boolean = js.native
  var AltStartupPath: String = js.native
  var AlwaysUseClearType: Boolean = js.native
  val AnswerWizard: typings.activexOffice.Office.AnswerWizard = js.native
  val Application: typings.activexExcel.Excel.Application = js.native
  val ArbitraryXMLSupportAvailable: Boolean = js.native
  var AskToUpdateLinks: Boolean = js.native
  val Assistance: IAssistance = js.native
  val Assistant: typings.activexOffice.Office.Assistant = js.native
  val AutoCorrect: typings.activexExcel.Excel.AutoCorrect = js.native
  var AutoFormatAsYouTypeReplaceHyperlinks: Boolean = js.native
  var AutoPercentEntry: Boolean = js.native
  val AutoRecover: typings.activexExcel.Excel.AutoRecover = js.native
  var AutomationSecurity: MsoAutomationSecurity = js.native
  val Build: Double = js.native
  @JSName("COMAddIns")
  val COMAddIns_Original: COMAddIns = js.native
  var CalculateBeforeSave: Boolean = js.native
  var Calculation: XlCalculation = js.native
  var CalculationInterruptKey: XlCalculationInterruptKey = js.native
  val CalculationState: XlCalculationState = js.native
  val CalculationVersion: Double = js.native
  val CanPlaySounds: Boolean = js.native
  val CanRecordSounds: Boolean = js.native
  var Caption: String = js.native
  var CellDragAndDrop: Boolean = js.native
  @JSName("Cells")
  val Cells_Original: Range = js.native
  @JSName("Charts")
  val Charts_Original: Sheets[Chart] = js.native
  @JSName("ClipboardFormats")
  var ClipboardFormats_Original: SafeArray[XlClipboardFormat] with (js.Function1[/* Index */ Double, XlClipboardFormat]) = js.native
  var ClusterConnector: String = js.native
  var ColorButtons: Boolean = js.native
  @JSName("Columns")
  val Columns_Original: Range = js.native
  @JSName("CommandBars")
  val CommandBars_Original: CommandBars = js.native
  var CommandUnderlines: XlCommandUnderlines = js.native
  var ConstrainNumeric: Boolean = js.native
  var ControlCharacters: Boolean = js.native
  var CopyObjectsWithCells: Boolean = js.native
  val Creator: XlCreator = js.native
  var Cursor: XlMousePointer = js.native
  var CursorMovement: Double = js.native
  val CustomListCount: Double = js.native
  var CutCopyMode: XlCutCopyMode = js.native
  val DDEAppReturnCode: Double = js.native
  var DataEntryMode: Double = js.native
  var DecimalSeparator: String = js.native
  var DefaultFilePath: String = js.native
  var DefaultSaveFormat: XlFileFormat = js.native
  var DefaultSheetDirection: Double = js.native
  val DefaultWebOptions: typings.activexExcel.Excel.DefaultWebOptions = js.native
  var DeferAsyncQueries: Boolean = js.native
  @JSName("DialogSheets")
  val DialogSheets_Original: Sheets[DialogSheet] = js.native
  @JSName("Dialogs")
  val Dialogs_Original: Dialogs = js.native
  var DisplayAlerts: Boolean = js.native
  var DisplayClipboardWindow: Boolean = js.native
  var DisplayCommentIndicator: XlCommentDisplayMode = js.native
  var DisplayDocumentActionTaskPane: Boolean = js.native
  var DisplayDocumentInformationPanel: Boolean = js.native
  var DisplayExcel4Menus: Boolean = js.native
  var DisplayFormulaAutoComplete: Boolean = js.native
  var DisplayFormulaBar: Boolean = js.native
  var DisplayFullScreen: Boolean = js.native
  var DisplayFunctionToolTips: Boolean = js.native
  var DisplayInfoWindow: Boolean = js.native
  var DisplayInsertOptions: Boolean = js.native
  var DisplayNoteIndicator: Boolean = js.native
  var DisplayPasteOptions: Boolean = js.native
  var DisplayRecentFiles: Boolean = js.native
  var DisplayScrollBars: Boolean = js.native
  var DisplayStatusBar: Boolean = js.native
  val Dummy101: js.Any = js.native
  var Dummy22: Boolean = js.native
  var Dummy23: Boolean = js.native
  var EditDirectlyInCell: Boolean = js.native
  var EnableAnimations: Boolean = js.native
  var EnableAutoComplete: Boolean = js.native
  var EnableCancelKey: XlEnableCancelKey = js.native
  var EnableEvents: Boolean = js.native
  var EnableLargeOperationAlert: Boolean = js.native
  var EnableLivePreview: Boolean = js.native
  var EnableSound: Boolean = js.native
  var EnableTipWizard: Boolean = js.native
  val ErrorCheckingOptions: typings.activexExcel.Excel.ErrorCheckingOptions = js.native
  @JSName("Excel4IntlMacroSheets")
  val Excel4IntlMacroSheets_Original: Sheets[Sheet] = js.native
  @JSName("Excel4MacroSheets")
  val Excel4MacroSheets_Original: Sheets[Sheet] = js.native
  @JSName("Excel.Application_typekey")
  var ExcelDotApplication_typekey: typings.activexExcel.Excel.Application = js.native
  var ExtendList: Boolean = js.native
  var FeatureInstall: MsoFeatureInstall = js.native
  @JSName("FileExportConverters")
  val FileExportConverters_Original: FileExportConverters = js.native
  val FileFind: IFind = js.native
  val FileSearch: typings.activexOffice.Office.FileSearch = js.native
  var FileValidation: MsoFileValidationMode = js.native
  var FileValidationPivot: XlFileValidationPivotMode = js.native
  var FindFormat: CellFormat = js.native
  var FixedDecimal: Boolean = js.native
  var FixedDecimalPlaces: Double = js.native
  var FormulaBarHeight: Double = js.native
  var GenerateGetPivotData: Boolean = js.native
  var GenerateTableRefs: XlGenerateTableRefs = js.native
  var Height: Double = js.native
  var HighQualityModeForGraphics: Boolean = js.native
  val Hinstance: Double = js.native
  val HinstancePtr: Double = js.native
  val Hwnd: Double = js.native
  var IgnoreRemoteRequests: Boolean = js.native
  var Interactive: Boolean = js.native
  @JSName("International")
  var International_Original: SafeArray[_] with (js.Function1[/* Index */ js.Any, InternationalResult[_]]) = js.native
  val IsSandboxed: Boolean = js.native
  var Iteration: Boolean = js.native
  val LanguageSettings: typings.activexOffice.Office.LanguageSettings = js.native
  var LargeButtons: Boolean = js.native
  var LargeOperationCellThousandCount: Double = js.native
  var Left: Double = js.native
  val LibraryPath: String = js.native
  val MailSession: String | Null = js.native
  val MailSystem: XlMailSystem = js.native
  var MapPaperSize: Boolean = js.native
  val MathCoprocessorAvailable: Boolean = js.native
  var MaxChange: Double = js.native
  var MaxIterations: Double = js.native
  var MeasurementUnit: Double = js.native
  val MemoryFree: Double = js.native
  val MemoryTotal: Double = js.native
  val MemoryUsed: Double = js.native
  @JSName("MenuBars")
  val MenuBars_Original: MenuBars = js.native
  @JSName("Modules")
  val Modules_Original: Modules = js.native
  val MouseAvailable: Boolean = js.native
  var MoveAfterReturn: Boolean = js.native
  var MoveAfterReturnDirection: XlDirection = js.native
  val MultiThreadedCalculation: typings.activexExcel.Excel.MultiThreadedCalculation = js.native
  val Name: String = js.native
  @JSName("Names")
  val Names_Original: Names = js.native
  val NetworkTemplatesPath: String = js.native
  val NewWorkbook: NewFile = js.native
  @JSName("ODBCErrors")
  val ODBCErrors_Original: ODBCErrors = js.native
  var ODBCTimeout: Double = js.native
  @JSName("OLEDBErrors")
  val OLEDBErrors_Original: OLEDBErrors = js.native
  var OnCalculate: String = js.native
  var OnData: String = js.native
  var OnDoubleClick: String = js.native
  var OnEntry: String = js.native
  var OnSheetActivate: String = js.native
  var OnSheetDeactivate: String = js.native
  var OnWindow: String = js.native
  val OperatingSystem: String = js.native
  val OrganizationName: String = js.native
  val Parent: typings.activexExcel.Excel.Application = js.native
  val Path: String = js.native
  val PathSeparator: String = js.native
  var PivotTableSelection: Boolean = js.native
  var PrintCommunication: Boolean = js.native
  val ProductCode: String = js.native
  var PromptForSummaryInfo: Boolean = js.native
  @JSName("ProtectedViewWindows")
  val ProtectedViewWindows_Original: ProtectedViewWindows = js.native
  val Quitting: Boolean = js.native
  val RTD: typings.activexExcel.Excel.RTD = js.native
  val Ready: Boolean = js.native
  @JSName("RecentFiles")
  val RecentFiles_Original: RecentFiles = js.native
  val RecordRelative: Boolean = js.native
  var ReferenceStyle: XlReferenceStyle = js.native
  var ReplaceFormat: CellFormat = js.native
  var RollZoom: Boolean = js.native
  @JSName("Rows")
  val Rows_Original: Range = js.native
  var SaveISO8601Dates: Boolean = js.native
  var ScreenUpdating: Boolean = js.native
  val Selection: js.Any = js.native
  var SheetsInNewWorkbook: Double = js.native
  @JSName("Sheets")
  val Sheets_Original: Sheets[Sheet] = js.native
  var ShowChartTipNames: Boolean = js.native
  var ShowChartTipValues: Boolean = js.native
  var ShowDevTools: Boolean = js.native
  var ShowMenuFloaties: Boolean = js.native
  var ShowSelectionFloaties: Boolean = js.native
  var ShowStartupDialog: Boolean = js.native
  var ShowToolTips: Boolean = js.native
  var ShowWindowsInTaskbar: Boolean = js.native
  @JSName("SmartArtColors")
  val SmartArtColors_Original: SmartArtColors = js.native
  @JSName("SmartArtLayouts")
  val SmartArtLayouts_Original: SmartArtLayouts = js.native
  @JSName("SmartArtQuickStyles")
  val SmartArtQuickStyles_Original: SmartArtQuickStyles = js.native
  @JSName("SmartTagRecognizers")
  val SmartTagRecognizers_Original: SmartTagRecognizers = js.native
  val Speech: typings.activexExcel.Excel.Speech = js.native
  val SpellingOptions: typings.activexExcel.Excel.SpellingOptions = js.native
  var StandardFont: String = js.native
  var StandardFontSize: Double = js.native
  val StartupPath: String = js.native
  /**
    * Get or set the text of the status bar
    *
    * Returns `false` if Microsoft Excel has control of the status bar.
    *
    * To restore the default status bar text, set the property to False ; this works even if the status bar is hidden.
    */
  var StatusBar: String | `false` = js.native
  val TemplatesPath: String = js.native
  @JSName("ThisCell")
  val ThisCell_Original: Range = js.native
  val ThisWorkbook: Workbook = js.native
  var ThousandsSeparator: String = js.native
  @JSName("Toolbars")
  val Toolbars_Original: Toolbars = js.native
  var Top: Double = js.native
  var TransitionMenuKey: String = js.native
  var TransitionMenuKeyAction: Double = js.native
  var TransitionNavigKeys: Boolean = js.native
  var UILanguage: Double = js.native
  val UsableHeight: Double = js.native
  val UsableWidth: Double = js.native
  var UseClusterConnector: Boolean = js.native
  var UseSystemSeparators: Boolean = js.native
  @JSName("UsedObjects")
  val UsedObjects_Original: UsedObjects = js.native
  var UserControl: Boolean = js.native
  val UserLibraryPath: String = js.native
  var UserName: String = js.native
  val VBE: typings.activexVbide.VBIDE.VBE = js.native
  val Value: String = js.native
  val Version: String = js.native
  var Visible: Boolean = js.native
  var WarnOnFunctionNameConflict: Boolean = js.native
  @JSName("Watches")
  val Watches_Original: Watches = js.native
  var Width: Double = js.native
  var WindowState: XlWindowState = js.native
  val WindowsForPens: Boolean = js.native
  @JSName("Windows")
  val Windows_Original: Windows = js.native
  @JSName("Workbooks")
  val Workbooks_Original: Workbooks = js.native
  val WorksheetFunction: typings.activexExcel.Excel.WorksheetFunction = js.native
  @JSName("Worksheets")
  val Worksheets_Original: Sheets[Worksheet] = js.native
  val _Default: String = js.native
  def ActivateMicrosoftApp(Index: XlMSApplication): Unit = js.native
  def ActiveCell(Address: String): Range = js.native
  def ActiveCell(RowIndex: Double): Range = js.native
  def ActiveCell(RowIndex: Double, ColumnIndex: Double): Range = js.native
  def AddChartAutoFormat(Chart: js.Any, Name: String): Unit = js.native
  def AddChartAutoFormat(Chart: js.Any, Name: String, Description: js.Any): Unit = js.native
  def AddCustomList(ListArray: Range): Unit = js.native
  def AddCustomList(ListArray: Range, ByRow: Boolean): Unit = js.native
  def AddCustomList(ListArray: SafeArray[String]): Unit = js.native
  def AddCustomList(ListArray: SafeArray[String], ByRow: Boolean): Unit = js.native
  def AddIns(Index: String): AddIn = js.native
  def AddIns(Index: Double): AddIn = js.native
  def AddIns2(Index: String): AddIn = js.native
  def AddIns2(Index: Double): AddIn = js.native
  def COMAddIns(Index: String): COMAddIn = js.native
  def COMAddIns(Index: Double): COMAddIn = js.native
  def Calculate(): Unit = js.native
  def CalculateFull(): Unit = js.native
  def CalculateFullRebuild(): Unit = js.native
  def CalculateUntilAsyncQueriesDone(): Unit = js.native
  def Caller(): Range | String | Error = js.native
  def Caller(Index: Double): Range | String | Error = js.native
  def Cells(Address: String): Range = js.native
  def Cells(RowIndex: Double): Range = js.native
  def Cells(RowIndex: Double, ColumnIndex: Double): Range = js.native
  def CentimetersToPoints(Centimeters: Double): Double = js.native
  def Charts(Indexes: SafeArray[String | Double]): Sheets[Chart] = js.native
  def Charts(Index: String): Chart = js.native
  def Charts(Index: Double): Chart = js.native
  def CheckAbort(): Unit = js.native
  def CheckAbort(KeepAbort: Boolean): Unit = js.native
  def CheckSpelling(Word: String): Boolean = js.native
  def CheckSpelling(Word: String, CustomDictionary: String): Boolean = js.native
  def CheckSpelling(Word: String, CustomDictionary: String, IgnoreUppercase: Boolean): Boolean = js.native
  def ClipboardFormats(Index: Double): XlClipboardFormat = js.native
  def Columns(Address: String): Range = js.native
  def Columns(RowIndex: Double): Range = js.native
  def Columns(RowIndex: Double, ColumnIndex: Double): Range = js.native
  def CommandBars(Index: String): CommandBar = js.native
  def CommandBars(Index: Double): CommandBar = js.native
  def ConvertFormula(Formula: String, FromReferenceStyle: XlReferenceStyle): String = js.native
  def ConvertFormula(Formula: String, FromReferenceStyle: XlReferenceStyle, ToReferenceStyle: XlReferenceStyle): String = js.native
  def ConvertFormula(
    Formula: String,
    FromReferenceStyle: XlReferenceStyle,
    ToReferenceStyle: XlReferenceStyle,
    ToAbsolute: XlReferenceType
  ): String = js.native
  def ConvertFormula(
    Formula: String,
    FromReferenceStyle: XlReferenceStyle,
    ToReferenceStyle: XlReferenceStyle,
    ToAbsolute: XlReferenceType,
    RelativeTo: Range
  ): String = js.native
  def DDEExecute(Channel: Double, String: String): Unit = js.native
  def DDEInitiate(App: String, Topic: String): Double = js.native
  def DDEPoke(Channel: Double, Item: js.Any, Data: js.Any): Unit = js.native
  def DDERequest(Channel: Double, Item: String): js.Any = js.native
  def DDETerminate(Channel: Double): Unit = js.native
  def DeleteChartAutoFormat(Name: String): Unit = js.native
  def DeleteCustomList(ListNum: Double): Unit = js.native
  def DialogSheets(Indexes: SafeArray[String | Double]): Sheets[DialogSheet] = js.native
  def DialogSheets(Index: String): DialogSheet = js.native
  def DialogSheets(Index: Double): DialogSheet = js.native
  def Dialogs(Index: XlBuiltInDialog): Dialog = js.native
  def DisplayXMLSourcePane(): Unit = js.native
  def DisplayXMLSourcePane(XmlMap: XmlMap): Unit = js.native
  def DoubleClick(): Unit = js.native
  def Dummy1(): js.Any = js.native
  def Dummy1(Arg1: js.Any): js.Any = js.native
  def Dummy1(Arg1: js.Any, Arg2: js.Any): js.Any = js.native
  def Dummy1(Arg1: js.Any, Arg2: js.Any, Arg3: js.Any): js.Any = js.native
  def Dummy1(Arg1: js.Any, Arg2: js.Any, Arg3: js.Any, Arg4: js.Any): js.Any = js.native
  def Dummy10(): Boolean = js.native
  def Dummy10(arg: js.Any): Boolean = js.native
  def Dummy11(): Unit = js.native
  def Dummy12(p1: PivotTable, p2: PivotTable): Unit = js.native
  def Dummy13(
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
  def Dummy14(): Unit = js.native
  def Dummy2(
    Arg1: js.UndefOr[js.Any],
    Arg2: js.UndefOr[js.Any],
    Arg3: js.UndefOr[js.Any],
    Arg4: js.UndefOr[js.Any],
    Arg5: js.UndefOr[js.Any],
    Arg6: js.UndefOr[js.Any],
    Arg7: js.UndefOr[js.Any],
    Arg8: js.UndefOr[js.Any]
  ): js.Any = js.native
  def Dummy20(grfCompareFunctions: Double): js.Any = js.native
  def Dummy3(): js.Any = js.native
  def Dummy4(
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
    Arg15: js.UndefOr[js.Any]
  ): js.Any = js.native
  def Dummy5(
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
    Arg13: js.UndefOr[js.Any]
  ): js.Any = js.native
  def Dummy6(): js.Any = js.native
  def Dummy7(): js.Any = js.native
  def Dummy8(): js.Any = js.native
  def Dummy8(Arg1: js.Any): js.Any = js.native
  def Dummy9(): js.Any = js.native
  def Evaluate(Name: String): js.Any = js.native
  def Excel4IntlMacroSheets(Indexes: SafeArray[String | Double]): Sheets[Sheet] = js.native
  def Excel4IntlMacroSheets(Index: String): Sheet = js.native
  def Excel4IntlMacroSheets(Index: Double): Sheet = js.native
  def Excel4MacroSheets(Indexes: SafeArray[String | Double]): Sheets[Sheet] = js.native
  def Excel4MacroSheets(Index: String): Sheet = js.native
  def Excel4MacroSheets(Index: Double): Sheet = js.native
  def ExecuteExcel4Macro(String: String): js.Any = js.native
  def FileConverters(): SafeArray[_] = js.native
  def FileConverters(Index1: String): SafeArray[_] = js.native
  def FileConverters(Index1: String, Index2: String): SafeArray[_] = js.native
  def FileDialog(fileDialogType: MsoFileDialogType): typings.activexOffice.Office.FileDialog = js.native
  def FileExportConverters(Index: Double): FileExportConverter = js.native
  def FindFile(): Boolean = js.native
  def GetCustomListContents(ListNum: Double): SafeArray[String] = js.native
  def GetCustomListNum(ListArray: SafeArray[String]): Double = js.native
  /** @param ButtonText Macintosh only */
  def GetOpenFilename(): String = js.native
  def GetOpenFilename(FileFilter: String): String = js.native
  def GetOpenFilename(FileFilter: String, FilterIndex: Double): String = js.native
  def GetOpenFilename(FileFilter: String, FilterIndex: Double, Title: String): String = js.native
  @JSName("GetOpenFilename")
  def GetOpenFilename_false(FileFilter: String, FilterIndex: Double, Title: String, ButtonText: Null, MultiSelect: `false`): String = js.native
  /** @param ButtonText Macintosh only */
  @JSName("GetOpenFilename")
  def GetOpenFilename_true(FileFilter: String, FilterIndex: Double, Title: String, ButtonText: Null, MultiSelect: `true`): SafeArray[String] = js.native
  @JSName("GetOpenFilename")
  def GetOpenFilename_true(FileFilter: String, FilterIndex: Double, Title: Null, ButtonText: Null, MultiSelect: `true`): SafeArray[String] = js.native
  @JSName("GetOpenFilename")
  def GetOpenFilename_true(FileFilter: String, FilterIndex: Null, Title: String, ButtonText: Null, MultiSelect: `true`): SafeArray[String] = js.native
  @JSName("GetOpenFilename")
  def GetOpenFilename_true(FileFilter: String, FilterIndex: Null, Title: Null, ButtonText: Null, MultiSelect: `true`): SafeArray[String] = js.native
  @JSName("GetOpenFilename")
  def GetOpenFilename_true(FileFilter: Null, FilterIndex: Double, Title: String, ButtonText: Null, MultiSelect: `true`): SafeArray[String] = js.native
  @JSName("GetOpenFilename")
  def GetOpenFilename_true(FileFilter: Null, FilterIndex: Double, Title: Null, ButtonText: Null, MultiSelect: `true`): SafeArray[String] = js.native
  @JSName("GetOpenFilename")
  def GetOpenFilename_true(FileFilter: Null, FilterIndex: Null, Title: String, ButtonText: Null, MultiSelect: `true`): SafeArray[String] = js.native
  @JSName("GetOpenFilename")
  def GetOpenFilename_true(FileFilter: Null, FilterIndex: Null, Title: Null, ButtonText: Null, MultiSelect: `true`): SafeArray[String] = js.native
  def GetPhonetic(): String = js.native
  def GetPhonetic(Text: String): String = js.native
  /** @param ButtonText Macintosh only */
  def GetSaveAsFilename(): String = js.native
  def GetSaveAsFilename(InitialFilename: String): String = js.native
  def GetSaveAsFilename(InitialFilename: String, FileFilter: String): String = js.native
  def GetSaveAsFilename(InitialFilename: String, FileFilter: String, FilterIndex: Double): String = js.native
  def GetSaveAsFilename(InitialFilename: String, FileFilter: String, FilterIndex: Double, Title: String): String = js.native
  def Goto(): Unit = js.native
  def Goto(Reference: String): Unit = js.native
  def Goto(Reference: String, Scroll: Boolean): Unit = js.native
  def Goto(Reference: Range): Unit = js.native
  def Goto(Reference: Range, Scroll: Boolean): Unit = js.native
  def Help(): Unit = js.native
  def Help(HelpFile: String): Unit = js.native
  def Help(HelpFile: String, HelpContextID: Double): Unit = js.native
  def InchesToPoints(Inches: Double): Double = js.native
  def InputBox(
    Prompt: String,
    Title: js.UndefOr[String],
    Default: js.UndefOr[String],
    Left: js.UndefOr[Double],
    Top: js.UndefOr[Double],
    HelpFile: js.UndefOr[String],
    HelpContextID: js.UndefOr[Double],
    Type: js.UndefOr[InputBoxReturnType]
  ): String | Double | Boolean | Range | Error | (SafeArray[Boolean | Double | String]) = js.native
  def International[T](Index: T): InternationalResult[T] = js.native
  def Intersect(
    Arg1: Range,
    Arg2: Range,
    Arg3: js.UndefOr[Range],
    Arg4: js.UndefOr[Range],
    Arg5: js.UndefOr[Range],
    Arg6: js.UndefOr[Range],
    Arg7: js.UndefOr[Range],
    Arg8: js.UndefOr[Range],
    Arg9: js.UndefOr[Range],
    Arg10: js.UndefOr[Range],
    Arg11: js.UndefOr[Range],
    Arg12: js.UndefOr[Range],
    Arg13: js.UndefOr[Range],
    Arg14: js.UndefOr[Range],
    Arg15: js.UndefOr[Range],
    Arg16: js.UndefOr[Range],
    Arg17: js.UndefOr[Range],
    Arg18: js.UndefOr[Range],
    Arg19: js.UndefOr[Range],
    Arg20: js.UndefOr[Range],
    Arg21: js.UndefOr[Range],
    Arg22: js.UndefOr[Range],
    Arg23: js.UndefOr[Range],
    Arg24: js.UndefOr[Range],
    Arg25: js.UndefOr[Range],
    Arg26: js.UndefOr[Range],
    Arg27: js.UndefOr[Range],
    Arg28: js.UndefOr[Range],
    Arg29: js.UndefOr[Range],
    Arg30: js.UndefOr[Range]
  ): Range = js.native
  def MacroOptions(
    Macro: js.UndefOr[String],
    Description: js.UndefOr[String],
    HasMenu: js.UndefOr[scala.Nothing],
    MenuText: js.UndefOr[scala.Nothing],
    HasShortcutKey: js.UndefOr[Boolean],
    ShortcutKey: js.UndefOr[String],
    Category: js.UndefOr[FunctionCategory | String],
    StatusBar: js.UndefOr[String],
    HelpContextID: js.UndefOr[Double],
    HelpFile: js.UndefOr[String],
    ArgumentDescriptions: js.UndefOr[SafeArray[String]]
  ): Unit = js.native
  def MailLogoff(): Unit = js.native
  def MailLogon(): Unit = js.native
  def MailLogon(Name: String): Unit = js.native
  def MailLogon(Name: String, Password: String): Unit = js.native
  def MailLogon(Name: String, Password: String, DownloadNewMail: Boolean): Unit = js.native
  def MenuBars(Index: js.Any): MenuBar = js.native
  def Modules(Index: js.Any): js.Any = js.native
  def Names(Index: js.UndefOr[scala.Nothing], IndexLocal: js.UndefOr[scala.Nothing], RefersTo: String): typings.activexExcel.Excel.Name = js.native
  def Names(Index: js.UndefOr[scala.Nothing], IndexLocal: String): typings.activexExcel.Excel.Name = js.native
  def Names(Index: String): typings.activexExcel.Excel.Name = js.native
  def Names(Index: Double): typings.activexExcel.Excel.Name = js.native
  def NextLetter(): Workbook = js.native
  def ODBCErrors(Index: Double): ODBCError = js.native
  def OLEDBErrors(Index: Double): OLEDBError = js.native
  def OnKey(Key: String): Unit = js.native
  def OnKey(Key: String, Procedure: String): Unit = js.native
  def OnRepeat(Text: String, Procedure: String): Unit = js.native
  def OnTime(EarliestTime: js.Any, Procedure: String): Unit = js.native
  def OnTime(EarliestTime: js.Any, Procedure: String, LatestTime: js.Any): Unit = js.native
  def OnTime(EarliestTime: js.Any, Procedure: String, LatestTime: js.Any, Schedule: Boolean): Unit = js.native
  def OnUndo(Text: String, Procedure: String): Unit = js.native
  @JSName("PreviousSelections")
  def PreviousSelections_1(Index: `1`): Range | Null = js.native
  @JSName("PreviousSelections")
  def PreviousSelections_2(Index: `2`): Range | Null = js.native
  @JSName("PreviousSelections")
  def PreviousSelections_3(Index: `3`): Range | Null = js.native
  @JSName("PreviousSelections")
  def PreviousSelections_4(Index: `4`): Range | Null = js.native
  def ProtectedViewWindows(Index: String): ProtectedViewWindow = js.native
  def ProtectedViewWindows(Index: Double): ProtectedViewWindow = js.native
  def Quit(): Unit = js.native
  def Range(Cell1: String): typings.activexExcel.Excel.Range = js.native
  def Range(Cell1: String, Cell2: String): typings.activexExcel.Excel.Range = js.native
  def Range(Cell1: String, Cell2: typings.activexExcel.Excel.Range): typings.activexExcel.Excel.Range = js.native
  def Range(Cell1: typings.activexExcel.Excel.Range): typings.activexExcel.Excel.Range = js.native
  def Range(Cell1: typings.activexExcel.Excel.Range, Cell2: String): typings.activexExcel.Excel.Range = js.native
  def Range(Cell1: typings.activexExcel.Excel.Range, Cell2: typings.activexExcel.Excel.Range): typings.activexExcel.Excel.Range = js.native
  def RecentFiles(Index: Double): RecentFile = js.native
  def RecordMacro(BasicCode: String): Unit = js.native
  /** This overload prevents recording */
  def RecordMacro(BasicCode: _empty, XlmCode: _empty): Unit = js.native
  def RegisterXLL(Filename: String): Boolean = js.native
  def RegisteredFunctions(): SafeArray[_] | Null = js.native
  def RegisteredFunctions(Index1: String): SafeArray[_] | Null = js.native
  def RegisteredFunctions(Index1: String, Index2: String): SafeArray[_] | Null = js.native
  def Repeat(): Unit = js.native
  def ResetTipWizard(): Unit = js.native
  def Rows(Address: String): Range = js.native
  def Rows(RowIndex: Double): Range = js.native
  def Rows(RowIndex: Double, ColumnIndex: Double): Range = js.native
  def Run(
    Macro: js.UndefOr[Double | Range | String],
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
  def Save(): Unit = js.native
  def Save(Filename: js.Any): Unit = js.native
  /** @deprecated */
  def SaveWorkspace(): Unit = js.native
  def SaveWorkspace(Filename: js.Any): Unit = js.native
  def SendKeys(Keys: String): Unit = js.native
  def SendKeys(Keys: String, Wait: Boolean): Unit = js.native
  def SetDefaultChart(): Unit = js.native
  def SetDefaultChart(FormatName: js.Any): Unit = js.native
  def SetDefaultChart(FormatName: js.Any, Gallery: js.Any): Unit = js.native
  def SharePointVersion(bstrUrl: String): Double = js.native
  def Sheets(Indexes: SafeArray[String | Double]): typings.activexExcel.Excel.Sheets[Sheet] = js.native
  def Sheets(Index: String): Sheet = js.native
  def Sheets(Index: Double): Sheet = js.native
  def ShortcutMenus(Index: Double): Menu = js.native
  def SmartArtColors(Index: String): SmartArtColor = js.native
  def SmartArtColors(Index: Double): SmartArtColor = js.native
  def SmartArtLayouts(Index: String): SmartArtLayout = js.native
  def SmartArtLayouts(Index: Double): SmartArtLayout = js.native
  def SmartArtQuickStyles(Index: String): SmartArtQuickStyle = js.native
  def SmartArtQuickStyles(Index: Double): SmartArtQuickStyle = js.native
  def SmartTagRecognizers(Index: js.Any): SmartTagRecognizer = js.native
  def Support(Object: js.Any, ID: Double): js.Any = js.native
  def Support(Object: js.Any, ID: Double, arg: js.Any): js.Any = js.native
  def ThisCell(Address: String): Range = js.native
  def ThisCell(RowIndex: Double): Range = js.native
  def ThisCell(RowIndex: Double, ColumnIndex: Double): Range = js.native
  def Toolbars(Index: js.Any): Toolbar = js.native
  def Undo(): Unit = js.native
  def Union(
    Arg1: Range,
    Arg2: Range,
    Arg3: js.UndefOr[Range],
    Arg4: js.UndefOr[Range],
    Arg5: js.UndefOr[Range],
    Arg6: js.UndefOr[Range],
    Arg7: js.UndefOr[Range],
    Arg8: js.UndefOr[Range],
    Arg9: js.UndefOr[Range],
    Arg10: js.UndefOr[Range],
    Arg11: js.UndefOr[Range],
    Arg12: js.UndefOr[Range],
    Arg13: js.UndefOr[Range],
    Arg14: js.UndefOr[Range],
    Arg15: js.UndefOr[Range],
    Arg16: js.UndefOr[Range],
    Arg17: js.UndefOr[Range],
    Arg18: js.UndefOr[Range],
    Arg19: js.UndefOr[Range],
    Arg20: js.UndefOr[Range],
    Arg21: js.UndefOr[Range],
    Arg22: js.UndefOr[Range],
    Arg23: js.UndefOr[Range],
    Arg24: js.UndefOr[Range],
    Arg25: js.UndefOr[Range],
    Arg26: js.UndefOr[Range],
    Arg27: js.UndefOr[Range],
    Arg28: js.UndefOr[Range],
    Arg29: js.UndefOr[Range],
    Arg30: js.UndefOr[Range]
  ): Range = js.native
  def UsedObjects(Index: String): js.Any = js.native
  def UsedObjects(Index: Double): js.Any = js.native
  /**
    * @param Volatile [Volatile=true]
    */
  def Volatile(): Unit = js.native
  def Volatile(Volatile: Boolean): Unit = js.native
  def Wait(Time: js.Any): Boolean = js.native
  def Watches(Index: String): Watch = js.native
  def Watches(Index: Double): Watch = js.native
  def Windows(Index: String): Window = js.native
  def Windows(Index: Double): Window = js.native
  def Workbooks(Index: String): Workbook = js.native
  def Workbooks(Index: Double): Workbook = js.native
  def Worksheets(Indexes: SafeArray[String | Double]): Sheets[Worksheet] = js.native
  def Worksheets(Index: String): Worksheet = js.native
  def Worksheets(Index: Double): Worksheet = js.native
  def _Evaluate(Name: js.Any): js.Any = js.native
  def _FindFile(): Unit = js.native
  def _MacroOptions(
    Macro: js.UndefOr[js.Any],
    Description: js.UndefOr[js.Any],
    HasMenu: js.UndefOr[js.Any],
    MenuText: js.UndefOr[js.Any],
    HasShortcutKey: js.UndefOr[js.Any],
    ShortcutKey: js.UndefOr[js.Any],
    Category: js.UndefOr[js.Any],
    StatusBar: js.UndefOr[js.Any],
    HelpContextID: js.UndefOr[js.Any],
    HelpFile: js.UndefOr[js.Any]
  ): Unit = js.native
  def _Run2(
    Macro: js.UndefOr[js.Any],
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
  def _WSFunction(
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
  def _Wait(Time: js.Any): Unit = js.native
}

