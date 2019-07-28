package typings.activexDashExcel.ExcelNs

import typings.activexDashExcel.activexDashExcelNumbers.`2`
import typings.activexDashExcel.activexDashExcelNumbers.`true`
import typings.activexDashExcel.activexDashExcelStrings.Everyone
import typings.activexDashExcel.activexDashExcelStrings.`Everyone but me`
import typings.activexDashOffice.OfficeNs.ByteArray
import typings.activexDashOffice.OfficeNs.CommandBar
import typings.activexDashOffice.OfficeNs.CommandBars
import typings.activexDashOffice.OfficeNs.CustomXMLPart
import typings.activexDashOffice.OfficeNs.CustomXMLParts
import typings.activexDashOffice.OfficeNs.DocumentInspector
import typings.activexDashOffice.OfficeNs.DocumentInspectors
import typings.activexDashOffice.OfficeNs.DocumentLibraryVersion
import typings.activexDashOffice.OfficeNs.DocumentLibraryVersions
import typings.activexDashOffice.OfficeNs.DocumentProperties
import typings.activexDashOffice.OfficeNs.DocumentProperty
import typings.activexDashOffice.OfficeNs.MetaProperties
import typings.activexDashOffice.OfficeNs.MetaProperty
import typings.activexDashOffice.OfficeNs.MsoEncoding
import typings.activexDashOffice.OfficeNs.MsoExtraInfoMethod
import typings.activexDashOffice.OfficeNs.OfficeTheme
import typings.activexDashOffice.OfficeNs.Permission
import typings.activexDashOffice.OfficeNs.PolicyItem
import typings.activexDashOffice.OfficeNs.ServerPolicy
import typings.activexDashOffice.OfficeNs.Signature
import typings.activexDashOffice.OfficeNs.SignatureSet
import typings.activexDashOffice.OfficeNs.UserPermission
import typings.activexDashOffice.OfficeNs.WorkflowTasks
import typings.activexDashOffice.OfficeNs.WorkflowTemplates
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Workbook")
@js.native
class Workbook protected () extends js.Object {
  var AcceptLabelsInFormulas: Boolean = js.native
  var AccuracyVersion: Double = js.native
  val ActiveChart: Chart = js.native
  val ActiveSheet: Sheet = js.native
  val ActiveSlicer: Slicer = js.native
  val Application: typings.activexDashExcel.ExcelNs.Application = js.native
  var Author: String = js.native
  var AutoUpdateFrequency: Double = js.native
  var AutoUpdateSaveChanges: Boolean = js.native
  @JSName("BuiltinDocumentProperties")
  val BuiltinDocumentProperties_Original: DocumentProperties[typings.activexDashExcel.ExcelNs.Application] = js.native
  val CalculationVersion: Double = js.native
  var ChangeHistoryDuration: Double = js.native
  @JSName("Charts")
  val Charts_Original: Sheets[Chart] = js.native
  var CheckCompatibility: Boolean = js.native
  val CodeName: String = js.native
  @JSName("Colors")
  var Colors_Original: SafeArray[Double] with (js.Function1[/* Index */ Double, Double]) = js.native
  @JSName("CommandBars")
  val CommandBars_Original: CommandBars = js.native
  var Comments: String = js.native
  var ConflictResolution: XlSaveConflictResolution = js.native
  val ConnectionsDisabled: Boolean = js.native
  @JSName("Connections")
  val Connections_Original: Connections = js.native
  val Container: js.Any = js.native
  @JSName("ContentTypeProperties")
  val ContentTypeProperties_Original: MetaProperties = js.native
  val CreateBackup: Boolean = js.native
  val Creator: XlCreator = js.native
  @JSName("CustomDocumentProperties")
  val CustomDocumentProperties_Original: DocumentProperties[typings.activexDashExcel.ExcelNs.Application] = js.native
  @JSName("CustomViews")
  val CustomViews_Original: CustomViews = js.native
  @JSName("CustomXMLParts")
  val CustomXMLParts_Original: CustomXMLParts = js.native
  var Date1904: Boolean = js.native
  var DefaultPivotTableStyle: js.Any = js.native
  var DefaultSlicerStyle: js.Any = js.native
  var DefaultTableStyle: js.Any = js.native
  @JSName("DialogSheets")
  val DialogSheets_Original: Sheets[DialogSheet] = js.native
  var DisplayDrawingObjects: XlDisplayDrawingObjects = js.native
  var DisplayInkComments: Boolean = js.native
  var DoNotPromptForConvert: Boolean = js.native
  @JSName("DocumentInspectors")
  val DocumentInspectors_Original: DocumentInspectors = js.native
  @JSName("DocumentLibraryVersions")
  val DocumentLibraryVersions_Original: DocumentLibraryVersions = js.native
  var EnableAutoRecover: Boolean = js.native
  var EncryptionProvider: String = js.native
  var EnvelopeVisible: Boolean = js.native
  var `Excel.Workbook_typekey`: Workbook = js.native
  @JSName("Excel4IntlMacroSheets")
  val Excel4IntlMacroSheets_Original: Sheets[Sheet] = js.native
  @JSName("Excel4MacroSheets")
  val Excel4MacroSheets_Original: Sheets[Sheet] = js.native
  val Excel8CompatibilityMode: Boolean = js.native
  val FileFormat: XlFileFormat = js.native
  var Final: Boolean = js.native
  var ForceFullCalculation: Boolean = js.native
  val FullName: String = js.native
  val FullNameURLEncoded: String = js.native
  val HTMLProject: typings.activexDashOffice.OfficeNs.HTMLProject = js.native
  var HasMailer: Boolean = js.native
  val HasPassword: Boolean = js.native
  var HasRoutingSlip: Boolean = js.native
  val HasVBProject: Boolean = js.native
  var HighlightChangesOnScreen: Boolean = js.native
  @JSName("IconSets")
  val IconSets_Original: IconSets = js.native
  var InactiveListBorderVisible: Boolean = js.native
  var IsAddin: Boolean = js.native
  val IsInplace: Boolean = js.native
  var KeepChangeHistory: Boolean = js.native
  var Keywords: String = js.native
  var ListChangesOnNewSheet: Boolean = js.native
  val Mailer: typings.activexDashExcel.ExcelNs.Mailer = js.native
  @JSName("Modules")
  val Modules_Original: Sheets[Sheet] = js.native
  val MultiUserEditing: Boolean = js.native
  val Name: String = js.native
  @JSName("Names")
  val Names_Original: Names = js.native
  var OnSave: String = js.native
  var OnSheetActivate: String = js.native
  var OnSheetDeactivate: String = js.native
  val Parent: js.Any = js.native
  var Password: String = js.native
  val PasswordEncryptionAlgorithm: String = js.native
  val PasswordEncryptionFileProperties: Boolean = js.native
  val PasswordEncryptionKeyLength: Double = js.native
  val PasswordEncryptionProvider: String = js.native
  val Path: String = js.native
  @JSName("Permission")
  val Permission_Original: Permission = js.native
  var PersonalViewListSettings: Boolean = js.native
  var PersonalViewPrintSettings: Boolean = js.native
  var PrecisionAsDisplayed: Boolean = js.native
  val ProtectStructure: Boolean = js.native
  val ProtectWindows: Boolean = js.native
  @JSName("PublishObjects")
  val PublishObjects_Original: PublishObjects = js.native
  val ReadOnly: Boolean = js.native
  var ReadOnlyRecommended: Boolean = js.native
  var RemovePersonalInformation: Boolean = js.native
  val Research: typings.activexDashExcel.ExcelNs.Research = js.native
  val RevisionNumber: Double = js.native
  val Routed: Boolean = js.native
  val RoutingSlip: typings.activexDashExcel.ExcelNs.RoutingSlip = js.native
  var SaveLinkValues: Boolean = js.native
  var Saved: Boolean = js.native
  @JSName("ServerPolicy")
  val ServerPolicy_Original: ServerPolicy = js.native
  @JSName("ServerViewableItems")
  val ServerViewableItems_Original: ServerViewableItems = js.native
  val SharedWorkspace: typings.activexDashOffice.OfficeNs.SharedWorkspace = js.native
  @JSName("Sheets")
  val Sheets_Original: Sheets[Sheet] = js.native
  var ShowConflictHistory: Boolean = js.native
  var ShowPivotChartActiveFields: Boolean = js.native
  var ShowPivotTableFieldList: Boolean = js.native
  @JSName("Signatures")
  val Signatures_Original: SignatureSet = js.native
  @JSName("SlicerCaches")
  val SlicerCaches_Original: SlicerCaches = js.native
  val SmartDocument: typings.activexDashOffice.OfficeNs.SmartDocument = js.native
  val SmartTagOptions: typings.activexDashExcel.ExcelNs.SmartTagOptions = js.native
  @JSName("Styles")
  val Styles_Original: Styles = js.native
  var Subject: String = js.native
  val Sync: typings.activexDashOffice.OfficeNs.Sync = js.native
  @JSName("TableStyles")
  val TableStyles_Original: TableStyles = js.native
  var TemplateRemoveExtData: Boolean = js.native
  val Theme: OfficeTheme = js.native
  var Title: String = js.native
  var UpdateLinks: XlUpdateLinks = js.native
  var UpdateRemoteReferences: Boolean = js.native
  var UserControl: Boolean = js.native
  val UserStatus: SafeArray[_] = js.native
  val VBASigned: Boolean = js.native
  val VBProject: typings.activexDashVbide.VBIDENs.VBProject = js.native
  val WebOptions: typings.activexDashExcel.ExcelNs.WebOptions = js.native
  @JSName("Windows")
  val Windows_Original: Windows = js.native
  @JSName("Worksheets")
  val Worksheets_Original: Sheets[Worksheet] = js.native
  var WritePassword: String = js.native
  val WriteReserved: Boolean = js.native
  val WriteReservedBy: String = js.native
  @JSName("XmlMaps")
  val XmlMaps_Original: XmlMaps = js.native
  @JSName("XmlNamespaces")
  val XmlNamespaces_Original: XmlNamespaces = js.native
  var _CodeName: String = js.native
  val _ReadOnlyRecommended: Boolean = js.native
  def AcceptAllChanges(): Unit = js.native
  def AcceptAllChanges(When: js.Any): Unit = js.native
  def AcceptAllChanges(When: js.Any, Who: js.Any): Unit = js.native
  def AcceptAllChanges(When: js.Any, Who: js.Any, Where: js.Any): Unit = js.native
  def Activate(): Unit = js.native
  def AddToFavorites(): Unit = js.native
  def ApplyTheme(Filename: String): Unit = js.native
  def BreakLink(Name: String, Type: XlLinkType): Unit = js.native
  def BuiltinDocumentProperties(index: String): DocumentProperty[typings.activexDashExcel.ExcelNs.Application] = js.native
  def BuiltinDocumentProperties(index: Double): DocumentProperty[typings.activexDashExcel.ExcelNs.Application] = js.native
  def CanCheckIn(): Boolean = js.native
  def ChangeFileAccess(Mode: XlFileAccess): Unit = js.native
  @JSName("ChangeFileAccess")
  def ChangeFileAccess_2(Mode: `2`): Unit = js.native
  @JSName("ChangeFileAccess")
  def ChangeFileAccess_2(Mode: `2`, WritePassword: String): Unit = js.native
  @JSName("ChangeFileAccess")
  def ChangeFileAccess_2(Mode: `2`, WritePassword: String, Notify: Boolean): Unit = js.native
  /** @param Type [Type=1] */
  def ChangeLink(Name: String, NewName: String): Unit = js.native
  def ChangeLink(Name: String, NewName: String, Type: XlLinkType): Unit = js.native
  def Charts(Indexes: SafeArray[String | Double]): Sheets[Chart] = js.native
  def Charts(Index: String): Chart = js.native
  def Charts(Index: Double): Chart = js.native
  def CheckIn(): Unit = js.native
  def CheckIn(SaveChanges: js.Any): Unit = js.native
  def CheckInWithVersion(): Unit = js.native
  def CheckInWithVersion(SaveChanges: Boolean): Unit = js.native
  def CheckInWithVersion(SaveChanges: Boolean, Comments: js.Any): Unit = js.native
  def CheckInWithVersion(SaveChanges: Boolean, Comments: js.Any, MakePublic: js.Any): Unit = js.native
  def CheckInWithVersion(SaveChanges: Boolean, Comments: js.Any, MakePublic: js.Any, VersionType: js.Any): Unit = js.native
  @JSName("CheckIn")
  def CheckIn_true(SaveChanges: `true`): Unit = js.native
  @JSName("CheckIn")
  def CheckIn_true(SaveChanges: `true`, Comments: String): Unit = js.native
  @JSName("CheckIn")
  def CheckIn_true(SaveChanges: `true`, Comments: String, MakePublic: Boolean): Unit = js.native
  def Close(): Unit = js.native
  def Close(SaveChanges: Boolean): Unit = js.native
  def Close(SaveChanges: Boolean, Filename: js.UndefOr[scala.Nothing], RouteWorkbook: Boolean): Unit = js.native
  @JSName("Close")
  def Close_true(SaveChanges: `true`): Unit = js.native
  @JSName("Close")
  def Close_true(SaveChanges: `true`, Filename: String): Unit = js.native
  @JSName("Close")
  def Close_true(SaveChanges: `true`, Filename: String, RouteWorkbook: Boolean): Unit = js.native
  def Colors(Index: Double): Double = js.native
  def CommandBars(Index: String): CommandBar = js.native
  def CommandBars(Index: Double): CommandBar = js.native
  def Connections(Index: Double): WorkbookConnection = js.native
  def ContentTypeProperties(Index: String): MetaProperty = js.native
  def ContentTypeProperties(Index: Double): MetaProperty = js.native
  def CustomDocumentProperties(index: String): DocumentProperty[typings.activexDashExcel.ExcelNs.Application] = js.native
  def CustomDocumentProperties(index: Double): DocumentProperty[typings.activexDashExcel.ExcelNs.Application] = js.native
  def CustomViews(ViewName: String): CustomView = js.native
  def CustomViews(ViewName: Double): CustomView = js.native
  def CustomXMLParts(Index: String): CustomXMLPart = js.native
  def CustomXMLParts(Index: Double): CustomXMLPart = js.native
  def DeleteNumberFormat(NumberFormat: String): Unit = js.native
  def DialogSheets(Indexes: SafeArray[String | Double]): Sheets[DialogSheet] = js.native
  def DialogSheets(Index: String): DialogSheet = js.native
  def DialogSheets(Index: Double): DialogSheet = js.native
  def DocumentInspectors(Index: Double): DocumentInspector = js.native
  def DocumentLibraryVersions(lIndex: Double): DocumentLibraryVersion = js.native
  def Dummy16(): Unit = js.native
  def Dummy17(calcid: Double): Unit = js.native
  def Dummy26(): Unit = js.native
  def Dummy27(): Unit = js.native
  def EnableConnections(): Unit = js.native
  def EndReview(): Unit = js.native
  def Excel4IntlMacroSheets(Indexes: SafeArray[String | Double]): Sheets[Sheet] = js.native
  def Excel4IntlMacroSheets(Index: String): Sheet = js.native
  def Excel4IntlMacroSheets(Index: Double): Sheet = js.native
  def Excel4MacroSheets(Indexes: SafeArray[String | Double]): Sheets[Sheet] = js.native
  def Excel4MacroSheets(Index: String): Sheet = js.native
  def Excel4MacroSheets(Index: Double): Sheet = js.native
  def ExclusiveAccess(): Boolean = js.native
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
  def FollowHyperlink(
    Address: String,
    SubAddress: js.UndefOr[String],
    NewWindow: js.UndefOr[Boolean],
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: js.UndefOr[ByteArray | String],
    Method: js.UndefOr[MsoExtraInfoMethod],
    HeaderInfo: js.UndefOr[String]
  ): Unit = js.native
  def ForwardMailer(): Unit = js.native
  def GetWorkflowTasks(): WorkflowTasks = js.native
  def GetWorkflowTemplates(): WorkflowTemplates = js.native
  def HighlightChangesOptions(): Unit = js.native
  def HighlightChangesOptions(When: XlHighlightChangesTime): Unit = js.native
  def HighlightChangesOptions(When: XlHighlightChangesTime, Who: String): Unit = js.native
  def HighlightChangesOptions(When: XlHighlightChangesTime, Who: String, Where: String): Unit = js.native
  @JSName("HighlightChangesOptions")
  def HighlightChangesOptions_Everyone(When: XlHighlightChangesTime, Who: Everyone): Unit = js.native
  @JSName("HighlightChangesOptions")
  def HighlightChangesOptions_Everyone(When: XlHighlightChangesTime, Who: Everyone, Where: String): Unit = js.native
  @JSName("HighlightChangesOptions")
  def HighlightChangesOptions_Everyonebutme(When: XlHighlightChangesTime, Who: `Everyone but me`): Unit = js.native
  @JSName("HighlightChangesOptions")
  def HighlightChangesOptions_Everyonebutme(When: XlHighlightChangesTime, Who: `Everyone but me`, Where: String): Unit = js.native
  def IconSets(Index: Double): IconSet = js.native
  def LinkInfo(Name: String, LinkInfo: XlLinkInfo): js.Any = js.native
  def LinkInfo(Name: String, LinkInfo: XlLinkInfo, Type: XlLinkInfoType): js.Any = js.native
  def LinkInfo(Name: String, LinkInfo: XlLinkInfo, Type: XlLinkInfoType, EditionRef: String): js.Any = js.native
  def LinkSources(): SafeArray[String] = js.native
  def LinkSources(Type: XlLink): SafeArray[String] = js.native
  def LockServerFile(): Unit = js.native
  def MergeWorkbook(Filename: String): Unit = js.native
  def Modules(Indexes: SafeArray[String | Double]): Sheets[Sheet] = js.native
  def Modules(Index: String): Sheet = js.native
  def Modules(Index: Double): Sheet = js.native
  def Names(Index: js.UndefOr[scala.Nothing], IndexLocal: js.UndefOr[scala.Nothing], RefersTo: String): typings.activexDashExcel.ExcelNs.Name = js.native
  def Names(Index: js.UndefOr[scala.Nothing], IndexLocal: String): typings.activexDashExcel.ExcelNs.Name = js.native
  def Names(Index: String): typings.activexDashExcel.ExcelNs.Name = js.native
  def Names(Index: Double): typings.activexDashExcel.ExcelNs.Name = js.native
  def NewWindow(): Window = js.native
  def OpenLinks(Name: String): Unit = js.native
  def OpenLinks(Name: String, ReadOnly: Boolean): Unit = js.native
  def OpenLinks(Name: String, ReadOnly: Boolean, Type: XlLink): Unit = js.native
  def Permission(Index: js.Any): UserPermission = js.native
  def PivotCaches(): typings.activexDashExcel.ExcelNs.PivotCaches = js.native
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
  def Post(): Unit = js.native
  def PrintOut(
    From: js.UndefOr[Double],
    To: js.UndefOr[Double],
    Copies: js.UndefOr[Double],
    Preview: js.UndefOr[Boolean],
    ActivePrinter: js.UndefOr[String],
    PrintToFile: js.UndefOr[Boolean],
    Collate: js.UndefOr[Boolean],
    PrToFileName: js.UndefOr[PrintToFileName[js.UndefOr[Boolean]]],
    IgnorePrintAreas: js.UndefOr[Boolean]
  ): Unit = js.native
  def PrintPreview(): Unit = js.native
  def PrintPreview(EnableChanges: Boolean): Unit = js.native
  def Protect(): Unit = js.native
  def Protect(Password: String): Unit = js.native
  def Protect(Password: String, Structure: Boolean): Unit = js.native
  def Protect(Password: String, Structure: Boolean, Windows: Boolean): Unit = js.native
  def ProtectSharing(
    Filename: js.UndefOr[String],
    Password: js.UndefOr[String],
    WriteResPassword: js.UndefOr[String],
    ReadOnlyRecommended: js.UndefOr[Boolean],
    CreateBackup: js.UndefOr[Boolean],
    SharingPassword: js.UndefOr[String],
    FileFormat: js.UndefOr[js.Any]
  ): Unit = js.native
  def PublishObjects(Index: String): PublishObject = js.native
  def PublishObjects(Index: Double): PublishObject = js.native
  def PurgeChangeHistoryNow(Days: Double): Unit = js.native
  def PurgeChangeHistoryNow(Days: Double, SharingPassword: String): Unit = js.native
  def RecheckSmartTags(): Unit = js.native
  def RefreshAll(): Unit = js.native
  def RejectAllChanges(): Unit = js.native
  def RejectAllChanges(When: js.Any): Unit = js.native
  def RejectAllChanges(When: js.Any, Who: js.Any): Unit = js.native
  def RejectAllChanges(When: js.Any, Who: js.Any, Where: js.Any): Unit = js.native
  def ReloadAs(Encoding: MsoEncoding): Unit = js.native
  def RemoveDocumentInformation(RemoveDocInfoType: XlRemoveDocInfoType): Unit = js.native
  def RemoveUser(Index: Double): Unit = js.native
  def Reply(): Unit = js.native
  def ReplyAll(): Unit = js.native
  def ReplyWithChanges(): Unit = js.native
  def ReplyWithChanges(ShowMessage: Boolean): Unit = js.native
  def ResetColors(): Unit = js.native
  def Route(): Unit = js.native
  def RunAutoMacros(Which: XlRunAutoMacro): Unit = js.native
  def Save(): Unit = js.native
  /** @param AccessMode [AccessMode=1] */
  def SaveAs(
    Filename: String,
    FileFormat: js.UndefOr[XlFileFormat],
    Password: js.UndefOr[String],
    WriteResPassword: js.UndefOr[String],
    ReadOnlyRecommended: js.UndefOr[Boolean],
    CreateBackup: js.UndefOr[Boolean],
    AccessMode: js.UndefOr[XlSaveAsAccessMode],
    ConflictResolution: js.UndefOr[XlSaveConflictResolution],
    AddToMru: js.UndefOr[Boolean],
    TextCodepage: js.UndefOr[js.Any],
    TextVisualLayout: js.UndefOr[js.Any]
  ): Unit = js.native
  def SaveAsXMLData(Filename: String, Map: XmlMap): Unit = js.native
  def SaveCopyAs(Filename: String): Unit = js.native
  def SendFaxOverInternet(): Unit = js.native
  def SendFaxOverInternet(Recipients: String): Unit = js.native
  def SendFaxOverInternet(Recipients: String, Subject: String): Unit = js.native
  def SendFaxOverInternet(Recipients: String, Subject: String, ShowMessage: Boolean): Unit = js.native
  def SendForReview(): Unit = js.native
  def SendForReview(Recipients: String): Unit = js.native
  def SendForReview(Recipients: String, Subject: String): Unit = js.native
  def SendForReview(Recipients: String, Subject: String, ShowMessage: Boolean): Unit = js.native
  def SendForReview(Recipients: String, Subject: String, ShowMessage: Boolean, IncludeAttachment: Boolean): Unit = js.native
  def SendMail(Recipients: String): Unit = js.native
  def SendMail(Recipients: String, Subject: String): Unit = js.native
  def SendMail(Recipients: String, Subject: String, ReturnReceipt: Boolean): Unit = js.native
  def SendMail(Recipients: SafeArray[String]): Unit = js.native
  def SendMail(Recipients: SafeArray[String], Subject: String): Unit = js.native
  def SendMail(Recipients: SafeArray[String], Subject: String, ReturnReceipt: Boolean): Unit = js.native
  /**
    * Macintosh only
    *
    * @param Priority [Priority=-4143]
    */
  def SendMailer(FileFormat: js.Any): Unit = js.native
  def SendMailer(FileFormat: js.Any, Priority: XlPriority): Unit = js.native
  def ServerPolicy(Index: String): PolicyItem = js.native
  def ServerPolicy(Index: Double): PolicyItem = js.native
  def ServerViewableItems(Index: Double): js.Any = js.native
  def SetLinkOnData(Name: String): Unit = js.native
  def SetLinkOnData(Name: String, Procedure: String): Unit = js.native
  def SetPasswordEncryptionOptions(): Unit = js.native
  def SetPasswordEncryptionOptions(PasswordEncryptionProvider: String): Unit = js.native
  def SetPasswordEncryptionOptions(PasswordEncryptionProvider: String, PasswordEncryptionAlgorithm: String): Unit = js.native
  def SetPasswordEncryptionOptions(
    PasswordEncryptionProvider: String,
    PasswordEncryptionAlgorithm: String,
    PasswordEncryptionKeyLength: Double
  ): Unit = js.native
  def SetPasswordEncryptionOptions(
    PasswordEncryptionProvider: String,
    PasswordEncryptionAlgorithm: String,
    PasswordEncryptionKeyLength: Double,
    PasswordEncryptionFileProperties: Boolean
  ): Unit = js.native
  def Sheets(Indexes: SafeArray[String | Double]): typings.activexDashExcel.ExcelNs.Sheets[Sheet] = js.native
  def Sheets(Index: String): Sheet = js.native
  def Sheets(Index: Double): Sheet = js.native
  def Signatures(iSig: Double): Signature = js.native
  def SlicerCaches(Index: String): SlicerCache = js.native
  def SlicerCaches(Index: Double): SlicerCache = js.native
  def Styles(Index: js.Any): Style = js.native
  def TableStyles(Index: String): TableStyle = js.native
  def TableStyles(Index: Double): TableStyle = js.native
  def ToggleFormsDesign(): Unit = js.native
  def Unprotect(): Unit = js.native
  def Unprotect(Password: String): Unit = js.native
  def UnprotectSharing(): Unit = js.native
  def UnprotectSharing(SharingPassword: String): Unit = js.native
  def UpdateFromFile(): Unit = js.native
  def UpdateLink(): Unit = js.native
  def UpdateLink(Name: String): Unit = js.native
  def UpdateLink(Name: String, Type: XlLinkType): Unit = js.native
  def WebPagePreview(): Unit = js.native
  def Windows(Index: String): Window = js.native
  def Windows(Index: Double): Window = js.native
  def Worksheets(Indexes: SafeArray[String | Double]): Sheets[Worksheet] = js.native
  def Worksheets(Index: String): Worksheet = js.native
  def Worksheets(Index: Double): Worksheet = js.native
  def XmlImport(Url: String, ImportMap: XmlMap): XlXmlImportResult = js.native
  def XmlImport(Url: String, ImportMap: XmlMap, Overwrite: Boolean): XlXmlImportResult = js.native
  def XmlImport(Url: String, ImportMap: XmlMap, Overwrite: Boolean, Destination: js.Any): XlXmlImportResult = js.native
  def XmlImportXml(Data: String, ImportMap: XmlMap): XlXmlImportResult = js.native
  def XmlImportXml(Data: String, ImportMap: XmlMap, Overwrite: Boolean): XlXmlImportResult = js.native
  def XmlImportXml(Data: String, ImportMap: XmlMap, Overwrite: Boolean, Destination: js.Any): XlXmlImportResult = js.native
  def XmlMaps(Index: String): XmlMap = js.native
  def XmlMaps(Index: Double): XmlMap = js.native
  def XmlNamespaces(Index: String): XmlNamespace = js.native
  def XmlNamespaces(Index: Double): XmlNamespace = js.native
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
  def _Protect(Password: js.Any): Unit = js.native
  def _Protect(Password: js.Any, Structure: js.Any): Unit = js.native
  def _Protect(Password: js.Any, Structure: js.Any, Windows: js.Any): Unit = js.native
  def _ProtectSharing(
    Filename: js.UndefOr[js.Any],
    Password: js.UndefOr[js.Any],
    WriteResPassword: js.UndefOr[js.Any],
    ReadOnlyRecommended: js.UndefOr[js.Any],
    CreateBackup: js.UndefOr[js.Any],
    SharingPassword: js.UndefOr[js.Any]
  ): Unit = js.native
  /** @param AccessMode [AccessMode=1] */
  def _SaveAs(
    Filename: String,
    FileFormat: js.UndefOr[XlFileFormat],
    Password: js.UndefOr[String],
    WriteResPassword: js.UndefOr[String],
    ReadOnlyRecommended: js.UndefOr[Boolean],
    CreateBackup: js.UndefOr[Boolean],
    AccessMode: js.UndefOr[XlSaveAsAccessMode],
    ConflictResolution: js.UndefOr[XlSaveConflictResolution],
    AddToMru: js.UndefOr[Boolean],
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
  def sblt(s: String): Unit = js.native
}

