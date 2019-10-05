package typings.activexDashWord.Word

import typings.activexDashOffice.Office.COMAddIn
import typings.activexDashOffice.Office.COMAddIns
import typings.activexDashOffice.Office.CommandBar
import typings.activexDashOffice.Office.CommandBars
import typings.activexDashOffice.Office.IAssistance
import typings.activexDashOffice.Office.MsoAutomationSecurity
import typings.activexDashOffice.Office.MsoFeatureInstall
import typings.activexDashOffice.Office.MsoFileDialogType
import typings.activexDashOffice.Office.MsoFileValidationMode
import typings.activexDashOffice.Office.MsoLanguageID
import typings.activexDashOffice.Office.NewFile
import typings.activexDashOffice.Office.SmartArtColor
import typings.activexDashOffice.Office.SmartArtColors
import typings.activexDashOffice.Office.SmartArtLayout
import typings.activexDashOffice.Office.SmartArtLayouts
import typings.activexDashOffice.Office.SmartArtQuickStyle
import typings.activexDashOffice.Office.SmartArtQuickStyles
import typings.activexDashWord.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Application")
@js.native
class Application protected () extends js.Object {
  val ActiveDocument: Document = js.native
  val ActiveEncryptionSession: Double = js.native
  var ActivePrinter: String = js.native
  val ActiveProtectedViewWindow: ProtectedViewWindow = js.native
  val ActiveWindow: Window = js.native
  val AddIns: typings.activexDashWord.Word.AddIns = js.native
  val AnswerWizard: typings.activexDashOffice.Office.AnswerWizard = js.native
  val Application: typings.activexDashWord.Word.Application = js.native
  val ArbitraryXMLSupportAvailable: Boolean = js.native
  val Assistance: IAssistance = js.native
  val Assistant: typings.activexDashOffice.Office.Assistant = js.native
  val AutoCaptions: typings.activexDashWord.Word.AutoCaptions = js.native
  val AutoCorrect: typings.activexDashWord.Word.AutoCorrect = js.native
  val AutoCorrectEmail: typings.activexDashWord.Word.AutoCorrect = js.native
  var AutomationSecurity: MsoAutomationSecurity = js.native
  val BackgroundPrintingStatus: Double = js.native
  val BackgroundSavingStatus: Double = js.native
  val Bibliography: typings.activexDashWord.Word.Bibliography = js.native
  var BrowseExtraFileTypes: String = js.native
  val Browser: typings.activexDashWord.Word.Browser = js.native
  val Build: String = js.native
  val BuildFeatureCrew: String = js.native
  val BuildFull: String = js.native
  @JSName("COMAddIns")
  val COMAddIns_Original: COMAddIns = js.native
  val CapsLock: Boolean = js.native
  var Caption: String = js.native
  val CaptionLabels: typings.activexDashWord.Word.CaptionLabels = js.native
  var CheckLanguage: Boolean = js.native
  @JSName("CommandBars")
  val CommandBars_Original: CommandBars = js.native
  val Creator: Double = js.native
  val CustomDictionaries: Dictionaries = js.native
  var CustomizationContext: js.Any = js.native
  var DefaultLegalBlackline: Boolean = js.native
  var DefaultSaveFormat: String = js.native
  var DefaultTableSeparator: String = js.native
  val Dialogs: typings.activexDashWord.Word.Dialogs = js.native
  var DisplayAlerts: WdAlertLevel = js.native
  var DisplayAutoCompleteTips: Boolean = js.native
  var DisplayDocumentInformationPanel: Boolean = js.native
  var DisplayRecentFiles: Boolean = js.native
  var DisplayScreenTips: Boolean = js.native
  var DisplayScrollBars: Boolean = js.native
  var DisplayStatusBar: Boolean = js.native
  val Documents: typings.activexDashWord.Word.Documents = js.native
  var DontResetInsertionPointProperties: Boolean = js.native
  val Dummy1: Boolean = js.native
  val EmailOptions: typings.activexDashWord.Word.EmailOptions = js.native
  var EmailTemplate: String = js.native
  var EnableCancelKey: WdEnableCancelKey = js.native
  var FeatureInstall: MsoFeatureInstall = js.native
  val FileConverters: typings.activexDashWord.Word.FileConverters = js.native
  val FileSearch: typings.activexDashOffice.Office.FileSearch = js.native
  var FileValidation: MsoFileValidationMode = js.native
  val FocusInMailHeader: Boolean = js.native
  val FontNames: typings.activexDashWord.Word.FontNames = js.native
  val HangulHanjaDictionaries: HangulHanjaConversionDictionaries = js.native
  var Height: Double = js.native
  val IsSandboxed: Boolean = js.native
  val KeyBindings: typings.activexDashWord.Word.KeyBindings = js.native
  val LandscapeFontNames: typings.activexDashWord.Word.FontNames = js.native
  val Language: MsoLanguageID = js.native
  val LanguageSettings: typings.activexDashOffice.Office.LanguageSettings = js.native
  val Languages: typings.activexDashWord.Word.Languages = js.native
  var Left: Double = js.native
  val ListGalleries: typings.activexDashWord.Word.ListGalleries = js.native
  val MAPIAvailable: Boolean = js.native
  val MacroContainer: js.Any = js.native
  val MailMessage: typings.activexDashWord.Word.MailMessage = js.native
  val MailSystem: WdMailSystem = js.native
  val MailingLabel: typings.activexDashWord.Word.MailingLabel = js.native
  val MathCoprocessorAvailable: Boolean = js.native
  val MouseAvailable: Boolean = js.native
  val Name: String = js.native
  val NewDocument: NewFile = js.native
  val NormalTemplate: Template = js.native
  val NumLock: Boolean = js.native
  val OMathAutoCorrect: typings.activexDashWord.Word.OMathAutoCorrect = js.native
  var OpenAttachmentsInFullScreen: Boolean = js.native
  val Options: typings.activexDashWord.Word.Options = js.native
  val Parent: js.Any = js.native
  val Path: String = js.native
  val PathSeparator: String = js.native
  val PickerDialog: typings.activexDashOffice.Office.PickerDialog = js.native
  val PortraitFontNames: typings.activexDashWord.Word.FontNames = js.native
  var PrintPreview: Boolean = js.native
  val ProtectedViewWindows: typings.activexDashWord.Word.ProtectedViewWindows = js.native
  val RecentFiles: typings.activexDashWord.Word.RecentFiles = js.native
  var RestrictLinkedStyles: Boolean = js.native
  var ScreenUpdating: Boolean = js.native
  val Selection: typings.activexDashWord.Word.Selection = js.native
  var ShowStartupDialog: Boolean = js.native
  var ShowStylePreviews: Boolean = js.native
  var ShowVisualBasicEditor: Boolean = js.native
  var ShowWindowsInTaskbar: Boolean = js.native
  @JSName("SmartArtColors")
  val SmartArtColors_Original: SmartArtColors = js.native
  @JSName("SmartArtLayouts")
  val SmartArtLayouts_Original: SmartArtLayouts = js.native
  @JSName("SmartArtQuickStyles")
  val SmartArtQuickStyles_Original: SmartArtQuickStyles = js.native
  val SmartTagRecognizers: typings.activexDashWord.Word.SmartTagRecognizers = js.native
  val SmartTagTypes: typings.activexDashWord.Word.SmartTagTypes = js.native
  val SpecialMode: Boolean = js.native
  var StartupPath: String = js.native
  var StatusBar: String = js.native
  val System: typings.activexDashWord.Word.System = js.native
  val TaskPanes: typings.activexDashWord.Word.TaskPanes = js.native
  val Tasks: typings.activexDashWord.Word.Tasks = js.native
  val Templates: typings.activexDashWord.Word.Templates = js.native
  var Top: Double = js.native
  val UndoRecord: typings.activexDashWord.Word.UndoRecord = js.native
  val UsableHeight: Double = js.native
  val UsableWidth: Double = js.native
  var UserAddress: String = js.native
  val UserControl: Boolean = js.native
  var UserInitials: String = js.native
  var UserName: String = js.native
  val VBE: typings.activexDashVbide.VBIDE.VBE = js.native
  val Version: String = js.native
  var Visible: Boolean = js.native
  var Width: Double = js.native
  var WindowState: WdWindowState = js.native
  val Windows: typings.activexDashWord.Word.Windows = js.native
  var `Word.Application_typekey`: typings.activexDashWord.Word.Application = js.native
  val WordBasic: js.Any = js.native
  val XMLNamespaces: typings.activexDashWord.Word.XMLNamespaces = js.native
  def Activate(): Unit = js.native
  def AddAddress(TagID: SafeArray[String], Value: SafeArray[String]): Unit = js.native
  def AutomaticChange(): Unit = js.native
  def BuildKeyCode(Arg1: WdKey): Double = js.native
  def BuildKeyCode(Arg1: WdKey, Arg2: js.Any): Double = js.native
  def BuildKeyCode(Arg1: WdKey, Arg2: js.Any, Arg3: js.Any): Double = js.native
  def BuildKeyCode(Arg1: WdKey, Arg2: js.Any, Arg3: js.Any, Arg4: js.Any): Double = js.native
  def COMAddIns(Index: String): COMAddIn = js.native
  def COMAddIns(Index: Double): COMAddIn = js.native
  def CentimetersToPoints(Centimeters: Double): Double = js.native
  def ChangeFileOpenDirectory(Path: String): Unit = js.native
  def CheckGrammar(String: String): Boolean = js.native
  def CheckSpelling(
    Word: String,
    CustomDictionary: js.UndefOr[js.Any],
    IgnoreUppercase: js.UndefOr[js.Any],
    MainDictionary: js.UndefOr[js.Any],
    CustomDictionary2: js.UndefOr[js.Any],
    CustomDictionary3: js.UndefOr[js.Any],
    CustomDictionary4: js.UndefOr[js.Any],
    CustomDictionary5: js.UndefOr[js.Any],
    CustomDictionary6: js.UndefOr[js.Any],
    CustomDictionary7: js.UndefOr[js.Any],
    CustomDictionary8: js.UndefOr[js.Any],
    CustomDictionary9: js.UndefOr[js.Any],
    CustomDictionary10: js.UndefOr[js.Any]
  ): Boolean = js.native
  def CleanString(String: String): String = js.native
  def CommandBars(Index: String): CommandBar = js.native
  def CommandBars(Index: Double): CommandBar = js.native
  /**
    * @param Word.WdCompareDestination [Destination=2]
    * @param Word.WdGranularity [Granularity=1]
    * @param boolean [CompareFormatting=true]
    * @param boolean [CompareCaseChanges=true]
    * @param boolean [CompareWhitespace=true]
    * @param boolean [CompareTables=true]
    * @param boolean [CompareHeaders=true]
    * @param boolean [CompareFootnotes=true]
    * @param boolean [CompareTextboxes=true]
    * @param boolean [CompareFields=true]
    * @param boolean [CompareComments=true]
    * @param boolean [CompareMoves=true]
    * @param string [RevisedAuthor='']
    * @param boolean [IgnoreAllComparisonWarnings=false]
    */
  def CompareDocuments(
    OriginalDocument: Document,
    RevisedDocument: Document,
    Destination: js.UndefOr[WdCompareDestination],
    Granularity: js.UndefOr[WdGranularity],
    CompareFormatting: js.UndefOr[Boolean],
    CompareCaseChanges: js.UndefOr[Boolean],
    CompareWhitespace: js.UndefOr[Boolean],
    CompareTables: js.UndefOr[Boolean],
    CompareHeaders: js.UndefOr[Boolean],
    CompareFootnotes: js.UndefOr[Boolean],
    CompareTextboxes: js.UndefOr[Boolean],
    CompareFields: js.UndefOr[Boolean],
    CompareComments: js.UndefOr[Boolean],
    CompareMoves: js.UndefOr[Boolean],
    RevisedAuthor: js.UndefOr[String],
    IgnoreAllComparisonWarnings: js.UndefOr[Boolean]
  ): Document = js.native
  def DDEExecute(Channel: Double, Command: String): Unit = js.native
  def DDEInitiate(App: String, Topic: String): Double = js.native
  def DDEPoke(Channel: Double, Item: String, Data: String): Unit = js.native
  def DDERequest(Channel: Double, Item: String): String = js.native
  def DDETerminate(Channel: Double): Unit = js.native
  def DDETerminateAll(): Unit = js.native
  def DefaultWebOptions(): typings.activexDashWord.Word.DefaultWebOptions = js.native
  def DiscussionSupport(Range: js.Any, cid: js.Any, piCSE: js.Any): Unit = js.native
  def Dummy2(): Boolean = js.native
  def Dummy4(): Unit = js.native
  def FileDialog(FileDialogType: MsoFileDialogType): typings.activexDashOffice.Office.FileDialog = js.native
  def FindKey(KeyCode: Double): KeyBinding = js.native
  def FindKey(KeyCode: Double, KeyCode2: js.Any): KeyBinding = js.native
  def GetAddress(
    Name: js.UndefOr[js.Any],
    AddressProperties: js.UndefOr[js.Any],
    UseAutoText: js.UndefOr[js.Any],
    DisplaySelectDialog: js.UndefOr[js.Any],
    SelectDialog: js.UndefOr[js.Any],
    CheckNamesDialog: js.UndefOr[js.Any],
    RecentAddressesChoice: js.UndefOr[js.Any],
    UpdateRecentAddresses: js.UndefOr[js.Any]
  ): String = js.native
  def GetDefaultTheme(DocumentType: WdDocumentMedium): String = js.native
  def GetSpellingSuggestions(
    Word: String,
    CustomDictionary: js.UndefOr[js.Any],
    IgnoreUppercase: js.UndefOr[js.Any],
    MainDictionary: js.UndefOr[js.Any],
    SuggestionMode: js.UndefOr[js.Any],
    CustomDictionary2: js.UndefOr[js.Any],
    CustomDictionary3: js.UndefOr[js.Any],
    CustomDictionary4: js.UndefOr[js.Any],
    CustomDictionary5: js.UndefOr[js.Any],
    CustomDictionary6: js.UndefOr[js.Any],
    CustomDictionary7: js.UndefOr[js.Any],
    CustomDictionary8: js.UndefOr[js.Any],
    CustomDictionary9: js.UndefOr[js.Any],
    CustomDictionary10: js.UndefOr[js.Any]
  ): SpellingSuggestions = js.native
  def GoBack(): Unit = js.native
  def GoForward(): Unit = js.native
  def Help(HelpType: js.Any): Unit = js.native
  def HelpTool(): Unit = js.native
  def InchesToPoints(Inches: Double): Double = js.native
  def International(Index: WdInternationalIndex): js.Any = js.native
  def IsObjectValid(Object: js.Any): Boolean = js.native
  def KeyString(KeyCode: Double): String = js.native
  def KeyString(KeyCode: Double, KeyCode2: js.Any): String = js.native
  /** @param number [LangId=0] */
  def Keyboard(): Double = js.native
  def Keyboard(LangId: Double): Double = js.native
  def KeyboardBidi(): Unit = js.native
  def KeyboardLatin(): Unit = js.native
  def KeysBoundTo(KeyCategory: WdKeyCategory, Command: String): typings.activexDashWord.Word.KeysBoundTo = js.native
  def KeysBoundTo(KeyCategory: WdKeyCategory, Command: String, CommandParameter: js.Any): typings.activexDashWord.Word.KeysBoundTo = js.native
  def LinesToPoints(Lines: Double): Double = js.native
  def ListCommands(ListAllCommands: Boolean): Unit = js.native
  def LoadMasterList(FileName: String): Unit = js.native
  def LookupNameProperties(Name: String): Unit = js.native
  /**
    * @param Word.WdCompareDestination [Destination=2]
    * @param Word.WdGranularity [Granularity=1]
    * @param boolean [CompareFormatting=true]
    * @param boolean [CompareCaseChanges=true]
    * @param boolean [CompareWhitespace=true]
    * @param boolean [CompareTables=true]
    * @param boolean [CompareHeaders=true]
    * @param boolean [CompareFootnotes=true]
    * @param boolean [CompareTextboxes=true]
    * @param boolean [CompareFields=true]
    * @param boolean [CompareComments=true]
    * @param boolean [CompareMoves=true]
    * @param string [OriginalAuthor='']
    * @param string [RevisedAuthor='']
    * @param Word.WdMergeFormatFrom [FormatFrom=2]
    */
  def MergeDocuments(
    OriginalDocument: Document,
    RevisedDocument: Document,
    Destination: js.UndefOr[WdCompareDestination],
    Granularity: js.UndefOr[WdGranularity],
    CompareFormatting: js.UndefOr[Boolean],
    CompareCaseChanges: js.UndefOr[Boolean],
    CompareWhitespace: js.UndefOr[Boolean],
    CompareTables: js.UndefOr[Boolean],
    CompareHeaders: js.UndefOr[Boolean],
    CompareFootnotes: js.UndefOr[Boolean],
    CompareTextboxes: js.UndefOr[Boolean],
    CompareFields: js.UndefOr[Boolean],
    CompareComments: js.UndefOr[Boolean],
    CompareMoves: js.UndefOr[Boolean],
    OriginalAuthor: js.UndefOr[String],
    RevisedAuthor: js.UndefOr[String],
    FormatFrom: js.UndefOr[WdMergeFormatFrom]
  ): Document = js.native
  def MillimetersToPoints(Millimeters: Double): Double = js.native
  def MountVolume(Zone: String, Server: String, Volume: String): Double = js.native
  def MountVolume(Zone: String, Server: String, Volume: String, User: js.Any): Double = js.native
  def MountVolume(Zone: String, Server: String, Volume: String, User: js.Any, UserPassword: js.Any): Double = js.native
  def MountVolume(
    Zone: String,
    Server: String,
    Volume: String,
    User: js.Any,
    UserPassword: js.Any,
    VolumePassword: js.Any
  ): Double = js.native
  def Move(Left: Double, Top: Double): Unit = js.native
  def NewWindow(): Window = js.native
  def NextLetter(): Unit = js.native
  def OnTime(When: js.Any, Name: String): Unit = js.native
  def OnTime(When: js.Any, Name: String, Tolerance: js.Any): Unit = js.native
  def OrganizerCopy(Source: String, Destination: String, Name: String, Object: WdOrganizerObject): Unit = js.native
  def OrganizerDelete(Source: String, Name: String, Object: WdOrganizerObject): Unit = js.native
  def OrganizerRename(Source: String, Name: String, NewName: String, Object: WdOrganizerObject): Unit = js.native
  def PicasToPoints(Picas: Double): Double = js.native
  def PixelsToPoints(Pixels: Double): Double = js.native
  def PixelsToPoints(Pixels: Double, fVertical: js.Any): Double = js.native
  def PointsToCentimeters(Points: Double): Double = js.native
  def PointsToInches(Points: Double): Double = js.native
  def PointsToLines(Points: Double): Double = js.native
  def PointsToMillimeters(Points: Double): Double = js.native
  def PointsToPicas(Points: Double): Double = js.native
  def PointsToPixels(Points: Double): Double = js.native
  def PointsToPixels(Points: Double, fVertical: js.Any): Double = js.native
  def PrintOut(
    Background: js.UndefOr[js.Any],
    Append: js.UndefOr[js.Any],
    Range: js.UndefOr[js.Any],
    OutputFileName: js.UndefOr[js.Any],
    From: js.UndefOr[js.Any],
    To: js.UndefOr[js.Any],
    Item: js.UndefOr[js.Any],
    Copies: js.UndefOr[js.Any],
    Pages: js.UndefOr[js.Any],
    PageType: js.UndefOr[js.Any],
    PrintToFile: js.UndefOr[js.Any],
    Collate: js.UndefOr[js.Any],
    FileName: js.UndefOr[js.Any],
    ActivePrinterMacGX: js.UndefOr[js.Any],
    ManualDuplexPrint: js.UndefOr[js.Any],
    PrintZoomColumn: js.UndefOr[js.Any],
    PrintZoomRow: js.UndefOr[js.Any],
    PrintZoomPaperWidth: js.UndefOr[js.Any],
    PrintZoomPaperHeight: js.UndefOr[js.Any]
  ): Unit = js.native
  def PrintOut2000(
    Background: js.UndefOr[js.Any],
    Append: js.UndefOr[js.Any],
    Range: js.UndefOr[js.Any],
    OutputFileName: js.UndefOr[js.Any],
    From: js.UndefOr[js.Any],
    To: js.UndefOr[js.Any],
    Item: js.UndefOr[js.Any],
    Copies: js.UndefOr[js.Any],
    Pages: js.UndefOr[js.Any],
    PageType: js.UndefOr[js.Any],
    PrintToFile: js.UndefOr[js.Any],
    Collate: js.UndefOr[js.Any],
    FileName: js.UndefOr[js.Any],
    ActivePrinterMacGX: js.UndefOr[js.Any],
    ManualDuplexPrint: js.UndefOr[js.Any],
    PrintZoomColumn: js.UndefOr[js.Any],
    PrintZoomRow: js.UndefOr[js.Any],
    PrintZoomPaperWidth: js.UndefOr[js.Any],
    PrintZoomPaperHeight: js.UndefOr[js.Any]
  ): Unit = js.native
  def PrintOutOld(
    Background: js.UndefOr[js.Any],
    Append: js.UndefOr[js.Any],
    Range: js.UndefOr[js.Any],
    OutputFileName: js.UndefOr[js.Any],
    From: js.UndefOr[js.Any],
    To: js.UndefOr[js.Any],
    Item: js.UndefOr[js.Any],
    Copies: js.UndefOr[js.Any],
    Pages: js.UndefOr[js.Any],
    PageType: js.UndefOr[js.Any],
    PrintToFile: js.UndefOr[js.Any],
    Collate: js.UndefOr[js.Any],
    FileName: js.UndefOr[js.Any],
    ActivePrinterMacGX: js.UndefOr[js.Any],
    ManualDuplexPrint: js.UndefOr[js.Any]
  ): Unit = js.native
  def ProductCode(): String = js.native
  def PutFocusInMailHeader(): Unit = js.native
  def Quit(): Unit = js.native
  def Quit(SaveChanges: js.Any): Unit = js.native
  def Quit(SaveChanges: js.Any, OriginalFormat: js.Any): Unit = js.native
  def Quit(SaveChanges: js.Any, OriginalFormat: js.Any, RouteDocument: js.Any): Unit = js.native
  def Repeat(): Boolean = js.native
  def Repeat(Times: js.Any): Boolean = js.native
  def ResetIgnoreAll(): Unit = js.native
  def Resize(Width: Double, Height: Double): Unit = js.native
  def Run(
    MacroName: String,
    varg1: js.UndefOr[js.Any],
    varg2: js.UndefOr[js.Any],
    varg3: js.UndefOr[js.Any],
    varg4: js.UndefOr[js.Any],
    varg5: js.UndefOr[js.Any],
    varg6: js.UndefOr[js.Any],
    varg7: js.UndefOr[js.Any],
    varg8: js.UndefOr[js.Any],
    varg9: js.UndefOr[js.Any],
    varg10: js.UndefOr[js.Any],
    varg11: js.UndefOr[js.Any],
    varg12: js.UndefOr[js.Any],
    varg13: js.UndefOr[js.Any],
    varg14: js.UndefOr[js.Any],
    varg15: js.UndefOr[js.Any],
    varg16: js.UndefOr[js.Any],
    varg17: js.UndefOr[js.Any],
    varg18: js.UndefOr[js.Any],
    varg19: js.UndefOr[js.Any],
    varg20: js.UndefOr[js.Any],
    varg21: js.UndefOr[js.Any],
    varg22: js.UndefOr[js.Any],
    varg23: js.UndefOr[js.Any],
    varg24: js.UndefOr[js.Any],
    varg25: js.UndefOr[js.Any],
    varg26: js.UndefOr[js.Any],
    varg27: js.UndefOr[js.Any],
    varg28: js.UndefOr[js.Any],
    varg29: js.UndefOr[js.Any],
    varg30: js.UndefOr[js.Any]
  ): js.Any = js.native
  def RunOld(MacroName: String): Unit = js.native
  def ScreenRefresh(): Unit = js.native
  def SendFax(): Unit = js.native
  def SetDefaultTheme(Name: String, DocumentType: WdDocumentMedium): Unit = js.native
  def ShowClipboard(): Unit = js.native
  def ShowMe(): Unit = js.native
  def SmartArtColors(Index: String): SmartArtColor = js.native
  def SmartArtColors(Index: Double): SmartArtColor = js.native
  def SmartArtLayouts(Index: String): SmartArtLayout = js.native
  def SmartArtLayouts(Index: Double): SmartArtLayout = js.native
  def SmartArtQuickStyles(Index: String): SmartArtQuickStyle = js.native
  def SmartArtQuickStyles(Index: Double): SmartArtQuickStyle = js.native
  def SubstituteFont(UnavailableFont: String, SubstituteFont: String): Unit = js.native
  def SynonymInfo(Word: String): typings.activexDashWord.Word.SynonymInfo = js.native
  def SynonymInfo(Word: String, LanguageID: js.Any): typings.activexDashWord.Word.SynonymInfo = js.native
  def ThreeWayMerge(LocalDocument: Document, ServerDocument: Document, BaseDocument: Document, FavorSource: Boolean): Unit = js.native
  def ToggleKeyboard(): Unit = js.native
}

