package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Application")
@js.native
class Application protected () extends js.Object {
  @JSName("ActiveCell")
  val ActiveCell_Original: Range = js.native
  val ActiveChart: Chart = js.native
  val ActiveDialog: DialogSheet = js.native
  val ActiveEncryptionSession: scala.Double = js.native
  val ActiveMenuBar: MenuBar = js.native
  var ActivePrinter: java.lang.String = js.native
  val ActiveProtectedViewWindow: ProtectedViewWindow = js.native
  val ActiveSheet: Sheet = js.native
  val ActiveWindow: Window = js.native
  val ActiveWorkbook: Workbook = js.native
  @JSName("AddIns2")
  val AddIns2_Original: AddIns2 = js.native
  @JSName("AddIns")
  val AddIns_Original: AddIns = js.native
  var AlertBeforeOverwriting: scala.Boolean = js.native
  var AltStartupPath: java.lang.String = js.native
  var AlwaysUseClearType: scala.Boolean = js.native
  val AnswerWizard: activexDashOfficeLib.OfficeNs.AnswerWizard = js.native
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  val ArbitraryXMLSupportAvailable: scala.Boolean = js.native
  var AskToUpdateLinks: scala.Boolean = js.native
  val Assistance: activexDashOfficeLib.OfficeNs.IAssistance = js.native
  val Assistant: activexDashOfficeLib.OfficeNs.Assistant = js.native
  val AutoCorrect: activexDashExcelLib.ExcelNs.AutoCorrect = js.native
  var AutoFormatAsYouTypeReplaceHyperlinks: scala.Boolean = js.native
  var AutoPercentEntry: scala.Boolean = js.native
  val AutoRecover: activexDashExcelLib.ExcelNs.AutoRecover = js.native
  var AutomationSecurity: activexDashOfficeLib.OfficeNs.MsoAutomationSecurity = js.native
  val Build: scala.Double = js.native
  @JSName("COMAddIns")
  val COMAddIns_Original: activexDashOfficeLib.OfficeNs.COMAddIns = js.native
  var CalculateBeforeSave: scala.Boolean = js.native
  var Calculation: XlCalculation = js.native
  var CalculationInterruptKey: XlCalculationInterruptKey = js.native
  val CalculationState: XlCalculationState = js.native
  val CalculationVersion: scala.Double = js.native
  val CanPlaySounds: scala.Boolean = js.native
  val CanRecordSounds: scala.Boolean = js.native
  var Caption: java.lang.String = js.native
  var CellDragAndDrop: scala.Boolean = js.native
  @JSName("Cells")
  val Cells_Original: Range = js.native
  @JSName("Charts")
  val Charts_Original: Sheets[Chart] = js.native
  @JSName("ClipboardFormats")
  var ClipboardFormats_Original: stdLib.SafeArray[XlClipboardFormat] with (js.Function1[/* Index */ scala.Double, XlClipboardFormat]) = js.native
  var ClusterConnector: java.lang.String = js.native
  var ColorButtons: scala.Boolean = js.native
  @JSName("Columns")
  val Columns_Original: Range = js.native
  @JSName("CommandBars")
  val CommandBars_Original: activexDashOfficeLib.OfficeNs.CommandBars = js.native
  var CommandUnderlines: XlCommandUnderlines = js.native
  var ConstrainNumeric: scala.Boolean = js.native
  var ControlCharacters: scala.Boolean = js.native
  var CopyObjectsWithCells: scala.Boolean = js.native
  val Creator: XlCreator = js.native
  var Cursor: XlMousePointer = js.native
  var CursorMovement: scala.Double = js.native
  val CustomListCount: scala.Double = js.native
  var CutCopyMode: XlCutCopyMode = js.native
  val DDEAppReturnCode: scala.Double = js.native
  var DataEntryMode: scala.Double = js.native
  var DecimalSeparator: java.lang.String = js.native
  var DefaultFilePath: java.lang.String = js.native
  var DefaultSaveFormat: XlFileFormat = js.native
  var DefaultSheetDirection: scala.Double = js.native
  val DefaultWebOptions: activexDashExcelLib.ExcelNs.DefaultWebOptions = js.native
  var DeferAsyncQueries: scala.Boolean = js.native
  @JSName("DialogSheets")
  val DialogSheets_Original: Sheets[DialogSheet] = js.native
  @JSName("Dialogs")
  val Dialogs_Original: Dialogs = js.native
  var DisplayAlerts: scala.Boolean = js.native
  var DisplayClipboardWindow: scala.Boolean = js.native
  var DisplayCommentIndicator: XlCommentDisplayMode = js.native
  var DisplayDocumentActionTaskPane: scala.Boolean = js.native
  var DisplayDocumentInformationPanel: scala.Boolean = js.native
  var DisplayExcel4Menus: scala.Boolean = js.native
  var DisplayFormulaAutoComplete: scala.Boolean = js.native
  var DisplayFormulaBar: scala.Boolean = js.native
  var DisplayFullScreen: scala.Boolean = js.native
  var DisplayFunctionToolTips: scala.Boolean = js.native
  var DisplayInfoWindow: scala.Boolean = js.native
  var DisplayInsertOptions: scala.Boolean = js.native
  var DisplayNoteIndicator: scala.Boolean = js.native
  var DisplayPasteOptions: scala.Boolean = js.native
  var DisplayRecentFiles: scala.Boolean = js.native
  var DisplayScrollBars: scala.Boolean = js.native
  var DisplayStatusBar: scala.Boolean = js.native
  val Dummy101: js.Any = js.native
  var Dummy22: scala.Boolean = js.native
  var Dummy23: scala.Boolean = js.native
  var EditDirectlyInCell: scala.Boolean = js.native
  var EnableAnimations: scala.Boolean = js.native
  var EnableAutoComplete: scala.Boolean = js.native
  var EnableCancelKey: XlEnableCancelKey = js.native
  var EnableEvents: scala.Boolean = js.native
  var EnableLargeOperationAlert: scala.Boolean = js.native
  var EnableLivePreview: scala.Boolean = js.native
  var EnableSound: scala.Boolean = js.native
  var EnableTipWizard: scala.Boolean = js.native
  val ErrorCheckingOptions: activexDashExcelLib.ExcelNs.ErrorCheckingOptions = js.native
  var `Excel.Application_typekey`: Application = js.native
  @JSName("Excel4IntlMacroSheets")
  val Excel4IntlMacroSheets_Original: Sheets[Sheet] = js.native
  @JSName("Excel4MacroSheets")
  val Excel4MacroSheets_Original: Sheets[Sheet] = js.native
  var ExtendList: scala.Boolean = js.native
  var FeatureInstall: activexDashOfficeLib.OfficeNs.MsoFeatureInstall = js.native
  @JSName("FileExportConverters")
  val FileExportConverters_Original: FileExportConverters = js.native
  val FileFind: activexDashOfficeLib.OfficeNs.IFind = js.native
  val FileSearch: activexDashOfficeLib.OfficeNs.FileSearch = js.native
  var FileValidation: activexDashOfficeLib.OfficeNs.MsoFileValidationMode = js.native
  var FileValidationPivot: XlFileValidationPivotMode = js.native
  var FindFormat: CellFormat = js.native
  var FixedDecimal: scala.Boolean = js.native
  var FixedDecimalPlaces: scala.Double = js.native
  var FormulaBarHeight: scala.Double = js.native
  var GenerateGetPivotData: scala.Boolean = js.native
  var GenerateTableRefs: XlGenerateTableRefs = js.native
  var Height: scala.Double = js.native
  var HighQualityModeForGraphics: scala.Boolean = js.native
  val Hinstance: scala.Double = js.native
  val HinstancePtr: scala.Double = js.native
  val Hwnd: scala.Double = js.native
  var IgnoreRemoteRequests: scala.Boolean = js.native
  var Interactive: scala.Boolean = js.native
  @JSName("International")
  var International_Original: stdLib.SafeArray[_] with (js.Function1[/* Index */ js.Any, InternationalResult[_]]) = js.native
  val IsSandboxed: scala.Boolean = js.native
  var Iteration: scala.Boolean = js.native
  val LanguageSettings: activexDashOfficeLib.OfficeNs.LanguageSettings = js.native
  var LargeButtons: scala.Boolean = js.native
  var LargeOperationCellThousandCount: scala.Double = js.native
  var Left: scala.Double = js.native
  val LibraryPath: java.lang.String = js.native
  val MailSession: java.lang.String | scala.Null = js.native
  val MailSystem: XlMailSystem = js.native
  var MapPaperSize: scala.Boolean = js.native
  val MathCoprocessorAvailable: scala.Boolean = js.native
  var MaxChange: scala.Double = js.native
  var MaxIterations: scala.Double = js.native
  var MeasurementUnit: scala.Double = js.native
  val MemoryFree: scala.Double = js.native
  val MemoryTotal: scala.Double = js.native
  val MemoryUsed: scala.Double = js.native
  @JSName("MenuBars")
  val MenuBars_Original: MenuBars = js.native
  @JSName("Modules")
  val Modules_Original: Modules = js.native
  val MouseAvailable: scala.Boolean = js.native
  var MoveAfterReturn: scala.Boolean = js.native
  var MoveAfterReturnDirection: XlDirection = js.native
  val MultiThreadedCalculation: activexDashExcelLib.ExcelNs.MultiThreadedCalculation = js.native
  val Name: java.lang.String = js.native
  @JSName("Names")
  val Names_Original: Names = js.native
  val NetworkTemplatesPath: java.lang.String = js.native
  val NewWorkbook: activexDashOfficeLib.OfficeNs.NewFile = js.native
  @JSName("ODBCErrors")
  val ODBCErrors_Original: ODBCErrors = js.native
  var ODBCTimeout: scala.Double = js.native
  @JSName("OLEDBErrors")
  val OLEDBErrors_Original: OLEDBErrors = js.native
  var OnCalculate: java.lang.String = js.native
  var OnData: java.lang.String = js.native
  var OnDoubleClick: java.lang.String = js.native
  var OnEntry: java.lang.String = js.native
  var OnSheetActivate: java.lang.String = js.native
  var OnSheetDeactivate: java.lang.String = js.native
  var OnWindow: java.lang.String = js.native
  val OperatingSystem: java.lang.String = js.native
  val OrganizationName: java.lang.String = js.native
  val Parent: Application = js.native
  val Path: java.lang.String = js.native
  val PathSeparator: java.lang.String = js.native
  var PivotTableSelection: scala.Boolean = js.native
  var PrintCommunication: scala.Boolean = js.native
  val ProductCode: java.lang.String = js.native
  var PromptForSummaryInfo: scala.Boolean = js.native
  @JSName("ProtectedViewWindows")
  val ProtectedViewWindows_Original: ProtectedViewWindows = js.native
  val Quitting: scala.Boolean = js.native
  val RTD: activexDashExcelLib.ExcelNs.RTD = js.native
  val Ready: scala.Boolean = js.native
  @JSName("RecentFiles")
  val RecentFiles_Original: RecentFiles = js.native
  val RecordRelative: scala.Boolean = js.native
  var ReferenceStyle: XlReferenceStyle = js.native
  var ReplaceFormat: CellFormat = js.native
  var RollZoom: scala.Boolean = js.native
  @JSName("Rows")
  val Rows_Original: Range = js.native
  var SaveISO8601Dates: scala.Boolean = js.native
  var ScreenUpdating: scala.Boolean = js.native
  val Selection: js.Any = js.native
  var SheetsInNewWorkbook: scala.Double = js.native
  @JSName("Sheets")
  val Sheets_Original: Sheets[Sheet] = js.native
  var ShowChartTipNames: scala.Boolean = js.native
  var ShowChartTipValues: scala.Boolean = js.native
  var ShowDevTools: scala.Boolean = js.native
  var ShowMenuFloaties: scala.Boolean = js.native
  var ShowSelectionFloaties: scala.Boolean = js.native
  var ShowStartupDialog: scala.Boolean = js.native
  var ShowToolTips: scala.Boolean = js.native
  var ShowWindowsInTaskbar: scala.Boolean = js.native
  @JSName("SmartArtColors")
  val SmartArtColors_Original: activexDashOfficeLib.OfficeNs.SmartArtColors = js.native
  @JSName("SmartArtLayouts")
  val SmartArtLayouts_Original: activexDashOfficeLib.OfficeNs.SmartArtLayouts = js.native
  @JSName("SmartArtQuickStyles")
  val SmartArtQuickStyles_Original: activexDashOfficeLib.OfficeNs.SmartArtQuickStyles = js.native
  @JSName("SmartTagRecognizers")
  val SmartTagRecognizers_Original: SmartTagRecognizers = js.native
  val Speech: activexDashExcelLib.ExcelNs.Speech = js.native
  val SpellingOptions: activexDashExcelLib.ExcelNs.SpellingOptions = js.native
  var StandardFont: java.lang.String = js.native
  var StandardFontSize: scala.Double = js.native
  val StartupPath: java.lang.String = js.native
  /**
    * Get or set the text of the status bar
    *
    * Returns `false` if Microsoft Excel has control of the status bar.
    *
    * To restore the default status bar text, set the property to False ; this works even if the status bar is hidden.
    */
  var StatusBar: java.lang.String | activexDashExcelLib.activexDashExcelLibNumbers.`false` = js.native
  val TemplatesPath: java.lang.String = js.native
  @JSName("ThisCell")
  val ThisCell_Original: Range = js.native
  val ThisWorkbook: Workbook = js.native
  var ThousandsSeparator: java.lang.String = js.native
  @JSName("Toolbars")
  val Toolbars_Original: Toolbars = js.native
  var Top: scala.Double = js.native
  var TransitionMenuKey: java.lang.String = js.native
  var TransitionMenuKeyAction: scala.Double = js.native
  var TransitionNavigKeys: scala.Boolean = js.native
  var UILanguage: scala.Double = js.native
  val UsableHeight: scala.Double = js.native
  val UsableWidth: scala.Double = js.native
  var UseClusterConnector: scala.Boolean = js.native
  var UseSystemSeparators: scala.Boolean = js.native
  @JSName("UsedObjects")
  val UsedObjects_Original: UsedObjects = js.native
  var UserControl: scala.Boolean = js.native
  val UserLibraryPath: java.lang.String = js.native
  var UserName: java.lang.String = js.native
  val VBE: activexDashVbideLib.VBIDENs.VBE = js.native
  val Value: java.lang.String = js.native
  val Version: java.lang.String = js.native
  var Visible: scala.Boolean = js.native
  var WarnOnFunctionNameConflict: scala.Boolean = js.native
  @JSName("Watches")
  val Watches_Original: Watches = js.native
  var Width: scala.Double = js.native
  var WindowState: XlWindowState = js.native
  val WindowsForPens: scala.Boolean = js.native
  @JSName("Windows")
  val Windows_Original: Windows = js.native
  @JSName("Workbooks")
  val Workbooks_Original: Workbooks = js.native
  val WorksheetFunction: activexDashExcelLib.ExcelNs.WorksheetFunction = js.native
  @JSName("Worksheets")
  val Worksheets_Original: Sheets[Worksheet] = js.native
  val _Default: java.lang.String = js.native
  def ActivateMicrosoftApp(Index: XlMSApplication): scala.Unit = js.native
  def ActiveCell(Address: java.lang.String): Range = js.native
  def ActiveCell(RowIndex: scala.Double): Range = js.native
  def ActiveCell(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def AddChartAutoFormat(Chart: js.Any, Name: java.lang.String): scala.Unit = js.native
  def AddChartAutoFormat(Chart: js.Any, Name: java.lang.String, Description: js.Any): scala.Unit = js.native
  def AddCustomList(ListArray: Range): scala.Unit = js.native
  def AddCustomList(ListArray: Range, ByRow: scala.Boolean): scala.Unit = js.native
  def AddCustomList(ListArray: stdLib.SafeArray[java.lang.String]): scala.Unit = js.native
  def AddCustomList(ListArray: stdLib.SafeArray[java.lang.String], ByRow: scala.Boolean): scala.Unit = js.native
  def AddIns(Index: java.lang.String): AddIn = js.native
  def AddIns(Index: scala.Double): AddIn = js.native
  def AddIns2(Index: java.lang.String): AddIn = js.native
  def AddIns2(Index: scala.Double): AddIn = js.native
  def COMAddIns(Index: java.lang.String): activexDashOfficeLib.OfficeNs.COMAddIn = js.native
  def COMAddIns(Index: scala.Double): activexDashOfficeLib.OfficeNs.COMAddIn = js.native
  def Calculate(): scala.Unit = js.native
  def CalculateFull(): scala.Unit = js.native
  def CalculateFullRebuild(): scala.Unit = js.native
  def CalculateUntilAsyncQueriesDone(): scala.Unit = js.native
  def Caller(): Range | java.lang.String | Error = js.native
  def Caller(Index: scala.Double): Range | java.lang.String | Error = js.native
  def Cells(Address: java.lang.String): Range = js.native
  def Cells(RowIndex: scala.Double): Range = js.native
  def Cells(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def CentimetersToPoints(Centimeters: scala.Double): scala.Double = js.native
  def Charts(Indexes: stdLib.SafeArray[java.lang.String | scala.Double]): Sheets[Chart] = js.native
  def Charts(Index: java.lang.String): Chart = js.native
  def Charts(Index: scala.Double): Chart = js.native
  def CheckAbort(): scala.Unit = js.native
  def CheckAbort(KeepAbort: scala.Boolean): scala.Unit = js.native
  def CheckSpelling(Word: java.lang.String): scala.Boolean = js.native
  def CheckSpelling(Word: java.lang.String, CustomDictionary: java.lang.String): scala.Boolean = js.native
  def CheckSpelling(Word: java.lang.String, CustomDictionary: java.lang.String, IgnoreUppercase: scala.Boolean): scala.Boolean = js.native
  def ClipboardFormats(Index: scala.Double): XlClipboardFormat = js.native
  def Columns(Address: java.lang.String): Range = js.native
  def Columns(RowIndex: scala.Double): Range = js.native
  def Columns(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def CommandBars(Index: java.lang.String): activexDashOfficeLib.OfficeNs.CommandBar = js.native
  def CommandBars(Index: scala.Double): activexDashOfficeLib.OfficeNs.CommandBar = js.native
  def ConvertFormula(Formula: java.lang.String, FromReferenceStyle: XlReferenceStyle): java.lang.String = js.native
  def ConvertFormula(
    Formula: java.lang.String,
    FromReferenceStyle: XlReferenceStyle,
    ToReferenceStyle: XlReferenceStyle
  ): java.lang.String = js.native
  def ConvertFormula(
    Formula: java.lang.String,
    FromReferenceStyle: XlReferenceStyle,
    ToReferenceStyle: XlReferenceStyle,
    ToAbsolute: XlReferenceType
  ): java.lang.String = js.native
  def ConvertFormula(
    Formula: java.lang.String,
    FromReferenceStyle: XlReferenceStyle,
    ToReferenceStyle: XlReferenceStyle,
    ToAbsolute: XlReferenceType,
    RelativeTo: Range
  ): java.lang.String = js.native
  def DDEExecute(Channel: scala.Double, String: java.lang.String): scala.Unit = js.native
  def DDEInitiate(App: java.lang.String, Topic: java.lang.String): scala.Double = js.native
  def DDEPoke(Channel: scala.Double, Item: js.Any, Data: js.Any): scala.Unit = js.native
  def DDERequest(Channel: scala.Double, Item: java.lang.String): js.Any = js.native
  def DDETerminate(Channel: scala.Double): scala.Unit = js.native
  def DeleteChartAutoFormat(Name: java.lang.String): scala.Unit = js.native
  def DeleteCustomList(ListNum: scala.Double): scala.Unit = js.native
  def DialogSheets(Indexes: stdLib.SafeArray[java.lang.String | scala.Double]): Sheets[DialogSheet] = js.native
  def DialogSheets(Index: java.lang.String): DialogSheet = js.native
  def DialogSheets(Index: scala.Double): DialogSheet = js.native
  def Dialogs(Index: XlBuiltInDialog): Dialog = js.native
  def DisplayXMLSourcePane(): scala.Unit = js.native
  def DisplayXMLSourcePane(XmlMap: XmlMap): scala.Unit = js.native
  def DoubleClick(): scala.Unit = js.native
  def Dummy1(): js.Any = js.native
  def Dummy1(Arg1: js.Any): js.Any = js.native
  def Dummy1(Arg1: js.Any, Arg2: js.Any): js.Any = js.native
  def Dummy1(Arg1: js.Any, Arg2: js.Any, Arg3: js.Any): js.Any = js.native
  def Dummy1(Arg1: js.Any, Arg2: js.Any, Arg3: js.Any, Arg4: js.Any): js.Any = js.native
  def Dummy10(): scala.Boolean = js.native
  def Dummy10(arg: js.Any): scala.Boolean = js.native
  def Dummy11(): scala.Unit = js.native
  def Dummy12(p1: PivotTable, p2: PivotTable): scala.Unit = js.native
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
  def Dummy14(): scala.Unit = js.native
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
  def Dummy20(grfCompareFunctions: scala.Double): js.Any = js.native
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
  def Evaluate(Name: java.lang.String): js.Any = js.native
  def Excel4IntlMacroSheets(Indexes: stdLib.SafeArray[java.lang.String | scala.Double]): Sheets[Sheet] = js.native
  def Excel4IntlMacroSheets(Index: java.lang.String): Sheet = js.native
  def Excel4IntlMacroSheets(Index: scala.Double): Sheet = js.native
  def Excel4MacroSheets(Indexes: stdLib.SafeArray[java.lang.String | scala.Double]): Sheets[Sheet] = js.native
  def Excel4MacroSheets(Index: java.lang.String): Sheet = js.native
  def Excel4MacroSheets(Index: scala.Double): Sheet = js.native
  def ExecuteExcel4Macro(String: java.lang.String): js.Any = js.native
  def FileConverters(): stdLib.SafeArray[_] = js.native
  def FileConverters(Index1: java.lang.String): stdLib.SafeArray[_] = js.native
  def FileConverters(Index1: java.lang.String, Index2: java.lang.String): stdLib.SafeArray[_] = js.native
  def FileDialog(fileDialogType: activexDashOfficeLib.OfficeNs.MsoFileDialogType): activexDashOfficeLib.OfficeNs.FileDialog = js.native
  def FileExportConverters(Index: scala.Double): FileExportConverter = js.native
  def FindFile(): scala.Boolean = js.native
  def GetCustomListContents(ListNum: scala.Double): stdLib.SafeArray[java.lang.String] = js.native
  def GetCustomListNum(ListArray: stdLib.SafeArray[java.lang.String]): scala.Double = js.native
  /** @param ButtonText Macintosh only */
  def GetOpenFilename(): java.lang.String = js.native
  def GetOpenFilename(FileFilter: java.lang.String): java.lang.String = js.native
  def GetOpenFilename(FileFilter: java.lang.String, FilterIndex: scala.Double): java.lang.String = js.native
  def GetOpenFilename(FileFilter: java.lang.String, FilterIndex: scala.Double, Title: java.lang.String): java.lang.String = js.native
  def GetOpenFilename(
    FileFilter: java.lang.String,
    FilterIndex: scala.Double,
    Title: java.lang.String,
    ButtonText: scala.Null,
    MultiSelect: activexDashExcelLib.activexDashExcelLibNumbers.`false`
  ): java.lang.String = js.native
  /** @param ButtonText Macintosh only */
  def GetOpenFilename(
    FileFilter: java.lang.String,
    FilterIndex: scala.Double,
    Title: java.lang.String,
    ButtonText: scala.Null,
    MultiSelect: activexDashExcelLib.activexDashExcelLibNumbers.`true`
  ): stdLib.SafeArray[java.lang.String] = js.native
  def GetOpenFilename(
    FileFilter: java.lang.String,
    FilterIndex: scala.Double,
    Title: scala.Null,
    ButtonText: scala.Null,
    MultiSelect: activexDashExcelLib.activexDashExcelLibNumbers.`true`
  ): stdLib.SafeArray[java.lang.String] = js.native
  def GetOpenFilename(
    FileFilter: java.lang.String,
    FilterIndex: scala.Null,
    Title: java.lang.String,
    ButtonText: scala.Null,
    MultiSelect: activexDashExcelLib.activexDashExcelLibNumbers.`true`
  ): stdLib.SafeArray[java.lang.String] = js.native
  def GetOpenFilename(
    FileFilter: java.lang.String,
    FilterIndex: scala.Null,
    Title: scala.Null,
    ButtonText: scala.Null,
    MultiSelect: activexDashExcelLib.activexDashExcelLibNumbers.`true`
  ): stdLib.SafeArray[java.lang.String] = js.native
  def GetOpenFilename(
    FileFilter: scala.Null,
    FilterIndex: scala.Double,
    Title: java.lang.String,
    ButtonText: scala.Null,
    MultiSelect: activexDashExcelLib.activexDashExcelLibNumbers.`true`
  ): stdLib.SafeArray[java.lang.String] = js.native
  def GetOpenFilename(
    FileFilter: scala.Null,
    FilterIndex: scala.Double,
    Title: scala.Null,
    ButtonText: scala.Null,
    MultiSelect: activexDashExcelLib.activexDashExcelLibNumbers.`true`
  ): stdLib.SafeArray[java.lang.String] = js.native
  def GetOpenFilename(
    FileFilter: scala.Null,
    FilterIndex: scala.Null,
    Title: java.lang.String,
    ButtonText: scala.Null,
    MultiSelect: activexDashExcelLib.activexDashExcelLibNumbers.`true`
  ): stdLib.SafeArray[java.lang.String] = js.native
  def GetOpenFilename(
    FileFilter: scala.Null,
    FilterIndex: scala.Null,
    Title: scala.Null,
    ButtonText: scala.Null,
    MultiSelect: activexDashExcelLib.activexDashExcelLibNumbers.`true`
  ): stdLib.SafeArray[java.lang.String] = js.native
  def GetPhonetic(): java.lang.String = js.native
  def GetPhonetic(Text: java.lang.String): java.lang.String = js.native
  /** @param ButtonText Macintosh only */
  def GetSaveAsFilename(): java.lang.String = js.native
  def GetSaveAsFilename(InitialFilename: java.lang.String): java.lang.String = js.native
  def GetSaveAsFilename(InitialFilename: java.lang.String, FileFilter: java.lang.String): java.lang.String = js.native
  def GetSaveAsFilename(InitialFilename: java.lang.String, FileFilter: java.lang.String, FilterIndex: scala.Double): java.lang.String = js.native
  def GetSaveAsFilename(
    InitialFilename: java.lang.String,
    FileFilter: java.lang.String,
    FilterIndex: scala.Double,
    Title: java.lang.String
  ): java.lang.String = js.native
  def Goto(): scala.Unit = js.native
  def Goto(Reference: Range): scala.Unit = js.native
  def Goto(Reference: Range, Scroll: scala.Boolean): scala.Unit = js.native
  def Goto(Reference: java.lang.String): scala.Unit = js.native
  def Goto(Reference: java.lang.String, Scroll: scala.Boolean): scala.Unit = js.native
  def Help(): scala.Unit = js.native
  def Help(HelpFile: java.lang.String): scala.Unit = js.native
  def Help(HelpFile: java.lang.String, HelpContextID: scala.Double): scala.Unit = js.native
  def InchesToPoints(Inches: scala.Double): scala.Double = js.native
  def InputBox(
    Prompt: java.lang.String,
    Title: js.UndefOr[java.lang.String],
    Default: js.UndefOr[java.lang.String],
    Left: js.UndefOr[scala.Double],
    Top: js.UndefOr[scala.Double],
    HelpFile: js.UndefOr[java.lang.String],
    HelpContextID: js.UndefOr[scala.Double],
    Type: js.UndefOr[InputBoxReturnType]
  ): java.lang.String | scala.Double | scala.Boolean | Range | Error | stdLib.SafeArray[java.lang.String] | stdLib.SafeArray[scala.Double] | stdLib.SafeArray[scala.Boolean] = js.native
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
    Macro: js.UndefOr[java.lang.String],
    Description: js.UndefOr[java.lang.String],
    HasMenu: js.UndefOr[js.UndefOr[scala.Nothing]],
    MenuText: js.UndefOr[js.UndefOr[scala.Nothing]],
    HasShortcutKey: js.UndefOr[scala.Boolean],
    ShortcutKey: js.UndefOr[java.lang.String],
    Category: js.UndefOr[FunctionCategory | java.lang.String],
    StatusBar: js.UndefOr[java.lang.String],
    HelpContextID: js.UndefOr[scala.Double],
    HelpFile: js.UndefOr[java.lang.String],
    ArgumentDescriptions: js.UndefOr[stdLib.SafeArray[java.lang.String]]
  ): scala.Unit = js.native
  def MailLogoff(): scala.Unit = js.native
  def MailLogon(): scala.Unit = js.native
  def MailLogon(Name: java.lang.String): scala.Unit = js.native
  def MailLogon(Name: java.lang.String, Password: java.lang.String): scala.Unit = js.native
  def MailLogon(Name: java.lang.String, Password: java.lang.String, DownloadNewMail: scala.Boolean): scala.Unit = js.native
  def MenuBars(Index: js.Any): MenuBar = js.native
  def Modules(Index: js.Any): js.Any = js.native
  def Names(Index: java.lang.String): Name = js.native
  def Names(Index: js.UndefOr[scala.Nothing], IndexLocal: java.lang.String): Name = js.native
  def Names(
    Index: js.UndefOr[scala.Nothing],
    IndexLocal: js.UndefOr[scala.Nothing],
    RefersTo: java.lang.String
  ): Name = js.native
  def Names(Index: scala.Double): Name = js.native
  def NextLetter(): Workbook = js.native
  def ODBCErrors(Index: scala.Double): ODBCError = js.native
  def OLEDBErrors(Index: scala.Double): OLEDBError = js.native
  def OnKey(Key: java.lang.String): scala.Unit = js.native
  def OnKey(Key: java.lang.String, Procedure: java.lang.String): scala.Unit = js.native
  def OnRepeat(Text: java.lang.String, Procedure: java.lang.String): scala.Unit = js.native
  def OnTime(EarliestTime: js.Any, Procedure: java.lang.String): scala.Unit = js.native
  def OnTime(EarliestTime: js.Any, Procedure: java.lang.String, LatestTime: js.Any): scala.Unit = js.native
  def OnTime(EarliestTime: js.Any, Procedure: java.lang.String, LatestTime: js.Any, Schedule: scala.Boolean): scala.Unit = js.native
  def OnUndo(Text: java.lang.String, Procedure: java.lang.String): scala.Unit = js.native
  def PreviousSelections(Index: activexDashExcelLib.activexDashExcelLibNumbers.`1`): Range | scala.Null = js.native
  def PreviousSelections(Index: activexDashExcelLib.activexDashExcelLibNumbers.`2`): Range | scala.Null = js.native
  def PreviousSelections(Index: activexDashExcelLib.activexDashExcelLibNumbers.`3`): Range | scala.Null = js.native
  def PreviousSelections(Index: activexDashExcelLib.activexDashExcelLibNumbers.`4`): Range | scala.Null = js.native
  def ProtectedViewWindows(Index: java.lang.String): ProtectedViewWindow = js.native
  def ProtectedViewWindows(Index: scala.Double): ProtectedViewWindow = js.native
  def Quit(): scala.Unit = js.native
  def Range(Cell1: Range): activexDashExcelLib.ExcelNs.Range = js.native
  def Range(Cell1: Range, Cell2: Range): activexDashExcelLib.ExcelNs.Range = js.native
  def Range(Cell1: Range, Cell2: java.lang.String): activexDashExcelLib.ExcelNs.Range = js.native
  def Range(Cell1: java.lang.String): activexDashExcelLib.ExcelNs.Range = js.native
  def Range(Cell1: java.lang.String, Cell2: Range): activexDashExcelLib.ExcelNs.Range = js.native
  def Range(Cell1: java.lang.String, Cell2: java.lang.String): activexDashExcelLib.ExcelNs.Range = js.native
  def RecentFiles(Index: scala.Double): RecentFile = js.native
  def RecordMacro(BasicCode: java.lang.String): scala.Unit = js.native
  /** This overload prevents recording */
  @JSName("RecordMacro")
  def RecordMacro_(
    BasicCode: activexDashExcelLib.activexDashExcelLibStrings.Empty,
    XlmCode: activexDashExcelLib.activexDashExcelLibStrings.Empty
  ): scala.Unit = js.native
  def RegisterXLL(Filename: java.lang.String): scala.Boolean = js.native
  def RegisteredFunctions(): stdLib.SafeArray[_] | scala.Null = js.native
  def RegisteredFunctions(Index1: java.lang.String): stdLib.SafeArray[_] | scala.Null = js.native
  def RegisteredFunctions(Index1: java.lang.String, Index2: java.lang.String): stdLib.SafeArray[_] | scala.Null = js.native
  def RegisteredFunctions(Index1: js.UndefOr[scala.Nothing], Index2: java.lang.String): stdLib.SafeArray[_] | scala.Null = js.native
  def Repeat(): scala.Unit = js.native
  def ResetTipWizard(): scala.Unit = js.native
  def Rows(Address: java.lang.String): Range = js.native
  def Rows(RowIndex: scala.Double): Range = js.native
  def Rows(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def Run(
    Macro: js.UndefOr[scala.Double | Range | java.lang.String],
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
  def Save(): scala.Unit = js.native
  def Save(Filename: js.Any): scala.Unit = js.native
  /** @deprecated */
  def SaveWorkspace(): scala.Unit = js.native
  def SaveWorkspace(Filename: js.Any): scala.Unit = js.native
  def SendKeys(Keys: java.lang.String): scala.Unit = js.native
  def SendKeys(Keys: java.lang.String, Wait: scala.Boolean): scala.Unit = js.native
  def SetDefaultChart(): scala.Unit = js.native
  def SetDefaultChart(FormatName: js.Any): scala.Unit = js.native
  def SetDefaultChart(FormatName: js.Any, Gallery: js.Any): scala.Unit = js.native
  def SharePointVersion(bstrUrl: java.lang.String): scala.Double = js.native
  def Sheets(Indexes: stdLib.SafeArray[java.lang.String | scala.Double]): activexDashExcelLib.ExcelNs.Sheets[activexDashExcelLib.ExcelNs.Sheet] = js.native
  def Sheets(Index: java.lang.String): Sheet = js.native
  def Sheets(Index: scala.Double): Sheet = js.native
  def ShortcutMenus(Index: scala.Double): Menu = js.native
  def SmartArtColors(Index: java.lang.String): activexDashOfficeLib.OfficeNs.SmartArtColor = js.native
  def SmartArtColors(Index: scala.Double): activexDashOfficeLib.OfficeNs.SmartArtColor = js.native
  def SmartArtLayouts(Index: java.lang.String): activexDashOfficeLib.OfficeNs.SmartArtLayout = js.native
  def SmartArtLayouts(Index: scala.Double): activexDashOfficeLib.OfficeNs.SmartArtLayout = js.native
  def SmartArtQuickStyles(Index: java.lang.String): activexDashOfficeLib.OfficeNs.SmartArtQuickStyle = js.native
  def SmartArtQuickStyles(Index: scala.Double): activexDashOfficeLib.OfficeNs.SmartArtQuickStyle = js.native
  def SmartTagRecognizers(Index: js.Any): SmartTagRecognizer = js.native
  def Support(Object: js.Any, ID: scala.Double): js.Any = js.native
  def Support(Object: js.Any, ID: scala.Double, arg: js.Any): js.Any = js.native
  def ThisCell(Address: java.lang.String): Range = js.native
  def ThisCell(RowIndex: scala.Double): Range = js.native
  def ThisCell(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def Toolbars(Index: js.Any): Toolbar = js.native
  def Undo(): scala.Unit = js.native
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
  def UsedObjects(Index: java.lang.String): js.Any = js.native
  def UsedObjects(Index: scala.Double): js.Any = js.native
  /**
    * @param Volatile [Volatile=true]
    */
  def Volatile(): scala.Unit = js.native
  def Volatile(Volatile: scala.Boolean): scala.Unit = js.native
  def Wait(Time: js.Any): scala.Boolean = js.native
  def Watches(Index: java.lang.String): Watch = js.native
  def Watches(Index: scala.Double): Watch = js.native
  def Windows(Index: java.lang.String): Window = js.native
  def Windows(Index: scala.Double): Window = js.native
  def Workbooks(Index: java.lang.String): Workbook = js.native
  def Workbooks(Index: scala.Double): Workbook = js.native
  def Worksheets(Indexes: stdLib.SafeArray[java.lang.String | scala.Double]): Sheets[Worksheet] = js.native
  def Worksheets(Index: java.lang.String): Worksheet = js.native
  def Worksheets(Index: scala.Double): Worksheet = js.native
  def _Evaluate(Name: js.Any): js.Any = js.native
  def _FindFile(): scala.Unit = js.native
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
  ): scala.Unit = js.native
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
  def _Wait(Time: js.Any): scala.Unit = js.native
}

