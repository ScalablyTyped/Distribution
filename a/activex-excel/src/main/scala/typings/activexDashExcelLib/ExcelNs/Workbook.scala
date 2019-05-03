package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Workbook")
@js.native
class Workbook protected () extends js.Object {
  var AcceptLabelsInFormulas: scala.Boolean = js.native
  var AccuracyVersion: scala.Double = js.native
  val ActiveChart: Chart = js.native
  val ActiveSheet: Sheet = js.native
  val ActiveSlicer: Slicer = js.native
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  var Author: java.lang.String = js.native
  var AutoUpdateFrequency: scala.Double = js.native
  var AutoUpdateSaveChanges: scala.Boolean = js.native
  @JSName("BuiltinDocumentProperties")
  val BuiltinDocumentProperties_Original: activexDashOfficeLib.OfficeNs.DocumentProperties[Application] = js.native
  val CalculationVersion: scala.Double = js.native
  var ChangeHistoryDuration: scala.Double = js.native
  @JSName("Charts")
  val Charts_Original: Sheets[Chart] = js.native
  var CheckCompatibility: scala.Boolean = js.native
  val CodeName: java.lang.String = js.native
  @JSName("Colors")
  var Colors_Original: stdLib.SafeArray[scala.Double] with (js.Function1[/* Index */ scala.Double, scala.Double]) = js.native
  @JSName("CommandBars")
  val CommandBars_Original: activexDashOfficeLib.OfficeNs.CommandBars = js.native
  var Comments: java.lang.String = js.native
  var ConflictResolution: XlSaveConflictResolution = js.native
  val ConnectionsDisabled: scala.Boolean = js.native
  @JSName("Connections")
  val Connections_Original: Connections = js.native
  val Container: js.Any = js.native
  @JSName("ContentTypeProperties")
  val ContentTypeProperties_Original: activexDashOfficeLib.OfficeNs.MetaProperties = js.native
  val CreateBackup: scala.Boolean = js.native
  val Creator: XlCreator = js.native
  @JSName("CustomDocumentProperties")
  val CustomDocumentProperties_Original: activexDashOfficeLib.OfficeNs.DocumentProperties[Application] = js.native
  @JSName("CustomViews")
  val CustomViews_Original: CustomViews = js.native
  @JSName("CustomXMLParts")
  val CustomXMLParts_Original: activexDashOfficeLib.OfficeNs.CustomXMLParts = js.native
  var Date1904: scala.Boolean = js.native
  var DefaultPivotTableStyle: js.Any = js.native
  var DefaultSlicerStyle: js.Any = js.native
  var DefaultTableStyle: js.Any = js.native
  @JSName("DialogSheets")
  val DialogSheets_Original: Sheets[DialogSheet] = js.native
  var DisplayDrawingObjects: XlDisplayDrawingObjects = js.native
  var DisplayInkComments: scala.Boolean = js.native
  var DoNotPromptForConvert: scala.Boolean = js.native
  @JSName("DocumentInspectors")
  val DocumentInspectors_Original: activexDashOfficeLib.OfficeNs.DocumentInspectors = js.native
  @JSName("DocumentLibraryVersions")
  val DocumentLibraryVersions_Original: activexDashOfficeLib.OfficeNs.DocumentLibraryVersions = js.native
  var EnableAutoRecover: scala.Boolean = js.native
  var EncryptionProvider: java.lang.String = js.native
  var EnvelopeVisible: scala.Boolean = js.native
  var `Excel.Workbook_typekey`: Workbook = js.native
  @JSName("Excel4IntlMacroSheets")
  val Excel4IntlMacroSheets_Original: Sheets[Sheet] = js.native
  @JSName("Excel4MacroSheets")
  val Excel4MacroSheets_Original: Sheets[Sheet] = js.native
  val Excel8CompatibilityMode: scala.Boolean = js.native
  val FileFormat: XlFileFormat = js.native
  var Final: scala.Boolean = js.native
  var ForceFullCalculation: scala.Boolean = js.native
  val FullName: java.lang.String = js.native
  val FullNameURLEncoded: java.lang.String = js.native
  val HTMLProject: activexDashOfficeLib.OfficeNs.HTMLProject = js.native
  var HasMailer: scala.Boolean = js.native
  val HasPassword: scala.Boolean = js.native
  var HasRoutingSlip: scala.Boolean = js.native
  val HasVBProject: scala.Boolean = js.native
  var HighlightChangesOnScreen: scala.Boolean = js.native
  @JSName("IconSets")
  val IconSets_Original: IconSets = js.native
  var InactiveListBorderVisible: scala.Boolean = js.native
  var IsAddin: scala.Boolean = js.native
  val IsInplace: scala.Boolean = js.native
  var KeepChangeHistory: scala.Boolean = js.native
  var Keywords: java.lang.String = js.native
  var ListChangesOnNewSheet: scala.Boolean = js.native
  val Mailer: activexDashExcelLib.ExcelNs.Mailer = js.native
  @JSName("Modules")
  val Modules_Original: Sheets[Sheet] = js.native
  val MultiUserEditing: scala.Boolean = js.native
  val Name: java.lang.String = js.native
  @JSName("Names")
  val Names_Original: Names = js.native
  var OnSave: java.lang.String = js.native
  var OnSheetActivate: java.lang.String = js.native
  var OnSheetDeactivate: java.lang.String = js.native
  val Parent: js.Any = js.native
  var Password: java.lang.String = js.native
  val PasswordEncryptionAlgorithm: java.lang.String = js.native
  val PasswordEncryptionFileProperties: scala.Boolean = js.native
  val PasswordEncryptionKeyLength: scala.Double = js.native
  val PasswordEncryptionProvider: java.lang.String = js.native
  val Path: java.lang.String = js.native
  @JSName("Permission")
  val Permission_Original: activexDashOfficeLib.OfficeNs.Permission = js.native
  var PersonalViewListSettings: scala.Boolean = js.native
  var PersonalViewPrintSettings: scala.Boolean = js.native
  var PrecisionAsDisplayed: scala.Boolean = js.native
  val ProtectStructure: scala.Boolean = js.native
  val ProtectWindows: scala.Boolean = js.native
  @JSName("PublishObjects")
  val PublishObjects_Original: PublishObjects = js.native
  val ReadOnly: scala.Boolean = js.native
  var ReadOnlyRecommended: scala.Boolean = js.native
  var RemovePersonalInformation: scala.Boolean = js.native
  val Research: activexDashExcelLib.ExcelNs.Research = js.native
  val RevisionNumber: scala.Double = js.native
  val Routed: scala.Boolean = js.native
  val RoutingSlip: activexDashExcelLib.ExcelNs.RoutingSlip = js.native
  var SaveLinkValues: scala.Boolean = js.native
  var Saved: scala.Boolean = js.native
  @JSName("ServerPolicy")
  val ServerPolicy_Original: activexDashOfficeLib.OfficeNs.ServerPolicy = js.native
  @JSName("ServerViewableItems")
  val ServerViewableItems_Original: ServerViewableItems = js.native
  val SharedWorkspace: activexDashOfficeLib.OfficeNs.SharedWorkspace = js.native
  @JSName("Sheets")
  val Sheets_Original: Sheets[Sheet] = js.native
  var ShowConflictHistory: scala.Boolean = js.native
  var ShowPivotChartActiveFields: scala.Boolean = js.native
  var ShowPivotTableFieldList: scala.Boolean = js.native
  @JSName("Signatures")
  val Signatures_Original: activexDashOfficeLib.OfficeNs.SignatureSet = js.native
  @JSName("SlicerCaches")
  val SlicerCaches_Original: SlicerCaches = js.native
  val SmartDocument: activexDashOfficeLib.OfficeNs.SmartDocument = js.native
  val SmartTagOptions: activexDashExcelLib.ExcelNs.SmartTagOptions = js.native
  @JSName("Styles")
  val Styles_Original: Styles = js.native
  var Subject: java.lang.String = js.native
  val Sync: activexDashOfficeLib.OfficeNs.Sync = js.native
  @JSName("TableStyles")
  val TableStyles_Original: TableStyles = js.native
  var TemplateRemoveExtData: scala.Boolean = js.native
  val Theme: activexDashOfficeLib.OfficeNs.OfficeTheme = js.native
  var Title: java.lang.String = js.native
  var UpdateLinks: XlUpdateLinks = js.native
  var UpdateRemoteReferences: scala.Boolean = js.native
  var UserControl: scala.Boolean = js.native
  val UserStatus: stdLib.SafeArray[_] = js.native
  val VBASigned: scala.Boolean = js.native
  val VBProject: activexDashVbideLib.VBIDENs.VBProject = js.native
  val WebOptions: activexDashExcelLib.ExcelNs.WebOptions = js.native
  @JSName("Windows")
  val Windows_Original: Windows = js.native
  @JSName("Worksheets")
  val Worksheets_Original: Sheets[Worksheet] = js.native
  var WritePassword: java.lang.String = js.native
  val WriteReserved: scala.Boolean = js.native
  val WriteReservedBy: java.lang.String = js.native
  @JSName("XmlMaps")
  val XmlMaps_Original: XmlMaps = js.native
  @JSName("XmlNamespaces")
  val XmlNamespaces_Original: XmlNamespaces = js.native
  var _CodeName: java.lang.String = js.native
  val _ReadOnlyRecommended: scala.Boolean = js.native
  def AcceptAllChanges(): scala.Unit = js.native
  def AcceptAllChanges(When: js.Any): scala.Unit = js.native
  def AcceptAllChanges(When: js.Any, Who: js.Any): scala.Unit = js.native
  def AcceptAllChanges(When: js.Any, Who: js.Any, Where: js.Any): scala.Unit = js.native
  def Activate(): scala.Unit = js.native
  def AddToFavorites(): scala.Unit = js.native
  def ApplyTheme(Filename: java.lang.String): scala.Unit = js.native
  def BreakLink(Name: java.lang.String, Type: XlLinkType): scala.Unit = js.native
  def BuiltinDocumentProperties(index: java.lang.String): activexDashOfficeLib.OfficeNs.DocumentProperty[Application] = js.native
  def BuiltinDocumentProperties(index: scala.Double): activexDashOfficeLib.OfficeNs.DocumentProperty[Application] = js.native
  def CanCheckIn(): scala.Boolean = js.native
  def ChangeFileAccess(Mode: XlFileAccess): scala.Unit = js.native
  def ChangeFileAccess(Mode: XlFileAccess, WritePassword: java.lang.String): scala.Unit = js.native
  def ChangeFileAccess(Mode: XlFileAccess, WritePassword: java.lang.String, Notify: scala.Boolean): scala.Unit = js.native
  /** @param Type [Type=1] */
  def ChangeLink(Name: java.lang.String, NewName: java.lang.String): scala.Unit = js.native
  def ChangeLink(Name: java.lang.String, NewName: java.lang.String, Type: XlLinkType): scala.Unit = js.native
  def Charts(Indexes: stdLib.SafeArray[java.lang.String | scala.Double]): Sheets[Chart] = js.native
  def Charts(Index: java.lang.String): Chart = js.native
  def Charts(Index: scala.Double): Chart = js.native
  def CheckIn(): scala.Unit = js.native
  def CheckIn(SaveChanges: activexDashExcelLib.activexDashExcelLibNumbers.`true`): scala.Unit = js.native
  def CheckIn(SaveChanges: activexDashExcelLib.activexDashExcelLibNumbers.`true`, Comments: java.lang.String): scala.Unit = js.native
  def CheckIn(
    SaveChanges: activexDashExcelLib.activexDashExcelLibNumbers.`true`,
    Comments: java.lang.String,
    MakePublic: scala.Boolean
  ): scala.Unit = js.native
  def CheckIn(SaveChanges: js.Any): scala.Unit = js.native
  def CheckInWithVersion(): scala.Unit = js.native
  def CheckInWithVersion(SaveChanges: scala.Boolean): scala.Unit = js.native
  def CheckInWithVersion(SaveChanges: scala.Boolean, Comments: js.Any): scala.Unit = js.native
  def CheckInWithVersion(SaveChanges: scala.Boolean, Comments: js.Any, MakePublic: js.Any): scala.Unit = js.native
  def CheckInWithVersion(SaveChanges: scala.Boolean, Comments: js.Any, MakePublic: js.Any, VersionType: js.Any): scala.Unit = js.native
  def Close(): scala.Unit = js.native
  def Close(SaveChanges: activexDashExcelLib.activexDashExcelLibNumbers.`true`): scala.Unit = js.native
  def Close(SaveChanges: activexDashExcelLib.activexDashExcelLibNumbers.`true`, Filename: java.lang.String): scala.Unit = js.native
  def Close(
    SaveChanges: activexDashExcelLib.activexDashExcelLibNumbers.`true`,
    Filename: java.lang.String,
    RouteWorkbook: scala.Boolean
  ): scala.Unit = js.native
  def Close(SaveChanges: scala.Boolean): scala.Unit = js.native
  def Close(SaveChanges: scala.Boolean, Filename: js.UndefOr[scala.Nothing], RouteWorkbook: scala.Boolean): scala.Unit = js.native
  def Colors(Index: scala.Double): scala.Double = js.native
  def CommandBars(Index: java.lang.String): activexDashOfficeLib.OfficeNs.CommandBar = js.native
  def CommandBars(Index: scala.Double): activexDashOfficeLib.OfficeNs.CommandBar = js.native
  def Connections(Index: scala.Double): WorkbookConnection = js.native
  def ContentTypeProperties(Index: java.lang.String): activexDashOfficeLib.OfficeNs.MetaProperty = js.native
  def ContentTypeProperties(Index: scala.Double): activexDashOfficeLib.OfficeNs.MetaProperty = js.native
  def CustomDocumentProperties(index: java.lang.String): activexDashOfficeLib.OfficeNs.DocumentProperty[Application] = js.native
  def CustomDocumentProperties(index: scala.Double): activexDashOfficeLib.OfficeNs.DocumentProperty[Application] = js.native
  def CustomViews(ViewName: java.lang.String): CustomView = js.native
  def CustomViews(ViewName: scala.Double): CustomView = js.native
  def CustomXMLParts(Index: java.lang.String): activexDashOfficeLib.OfficeNs.CustomXMLPart = js.native
  def CustomXMLParts(Index: scala.Double): activexDashOfficeLib.OfficeNs.CustomXMLPart = js.native
  def DeleteNumberFormat(NumberFormat: java.lang.String): scala.Unit = js.native
  def DialogSheets(Indexes: stdLib.SafeArray[java.lang.String | scala.Double]): Sheets[DialogSheet] = js.native
  def DialogSheets(Index: java.lang.String): DialogSheet = js.native
  def DialogSheets(Index: scala.Double): DialogSheet = js.native
  def DocumentInspectors(Index: scala.Double): activexDashOfficeLib.OfficeNs.DocumentInspector = js.native
  def DocumentLibraryVersions(lIndex: scala.Double): activexDashOfficeLib.OfficeNs.DocumentLibraryVersion = js.native
  def Dummy16(): scala.Unit = js.native
  def Dummy17(calcid: scala.Double): scala.Unit = js.native
  def Dummy26(): scala.Unit = js.native
  def Dummy27(): scala.Unit = js.native
  def EnableConnections(): scala.Unit = js.native
  def EndReview(): scala.Unit = js.native
  def Excel4IntlMacroSheets(Indexes: stdLib.SafeArray[java.lang.String | scala.Double]): Sheets[Sheet] = js.native
  def Excel4IntlMacroSheets(Index: java.lang.String): Sheet = js.native
  def Excel4IntlMacroSheets(Index: scala.Double): Sheet = js.native
  def Excel4MacroSheets(Indexes: stdLib.SafeArray[java.lang.String | scala.Double]): Sheets[Sheet] = js.native
  def Excel4MacroSheets(Index: java.lang.String): Sheet = js.native
  def Excel4MacroSheets(Index: scala.Double): Sheet = js.native
  def ExclusiveAccess(): scala.Boolean = js.native
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
  def FollowHyperlink(
    Address: java.lang.String,
    SubAddress: js.UndefOr[java.lang.String],
    NewWindow: js.UndefOr[scala.Boolean],
    AddHistory: js.UndefOr[js.UndefOr[scala.Nothing]],
    ExtraInfo: js.UndefOr[activexDashOfficeLib.OfficeNs.ByteArray | java.lang.String],
    Method: js.UndefOr[activexDashOfficeLib.OfficeNs.MsoExtraInfoMethod],
    HeaderInfo: js.UndefOr[java.lang.String]
  ): scala.Unit = js.native
  def ForwardMailer(): scala.Unit = js.native
  def GetWorkflowTasks(): activexDashOfficeLib.OfficeNs.WorkflowTasks = js.native
  def GetWorkflowTemplates(): activexDashOfficeLib.OfficeNs.WorkflowTemplates = js.native
  def HighlightChangesOptions(): scala.Unit = js.native
  def HighlightChangesOptions(When: XlHighlightChangesTime): scala.Unit = js.native
  def HighlightChangesOptions(When: XlHighlightChangesTime, Who: java.lang.String): scala.Unit = js.native
  def HighlightChangesOptions(When: XlHighlightChangesTime, Who: java.lang.String, Where: java.lang.String): scala.Unit = js.native
  @JSName("HighlightChangesOptions")
  def HighlightChangesOptions_Everyone(When: XlHighlightChangesTime, Who: activexDashExcelLib.activexDashExcelLibStrings.Everyone): scala.Unit = js.native
  @JSName("HighlightChangesOptions")
  def HighlightChangesOptions_Everyone(
    When: XlHighlightChangesTime,
    Who: activexDashExcelLib.activexDashExcelLibStrings.Everyone,
    Where: java.lang.String
  ): scala.Unit = js.native
  @JSName("HighlightChangesOptions")
  def `HighlightChangesOptions_Everyone but me`(
    When: XlHighlightChangesTime,
    Who: activexDashExcelLib.activexDashExcelLibStrings.`Everyone but me`
  ): scala.Unit = js.native
  @JSName("HighlightChangesOptions")
  def `HighlightChangesOptions_Everyone but me`(
    When: XlHighlightChangesTime,
    Who: activexDashExcelLib.activexDashExcelLibStrings.`Everyone but me`,
    Where: java.lang.String
  ): scala.Unit = js.native
  def IconSets(Index: scala.Double): IconSet = js.native
  def LinkInfo(Name: java.lang.String, LinkInfo: XlLinkInfo): js.Any = js.native
  def LinkInfo(Name: java.lang.String, LinkInfo: XlLinkInfo, Type: XlLinkInfoType): js.Any = js.native
  def LinkInfo(Name: java.lang.String, LinkInfo: XlLinkInfo, Type: XlLinkInfoType, EditionRef: java.lang.String): js.Any = js.native
  def LinkSources(): stdLib.SafeArray[java.lang.String] = js.native
  def LinkSources(Type: XlLink): stdLib.SafeArray[java.lang.String] = js.native
  def LockServerFile(): scala.Unit = js.native
  def MergeWorkbook(Filename: java.lang.String): scala.Unit = js.native
  def Modules(Indexes: stdLib.SafeArray[java.lang.String | scala.Double]): Sheets[Sheet] = js.native
  def Modules(Index: java.lang.String): Sheet = js.native
  def Modules(Index: scala.Double): Sheet = js.native
  def Names(Index: java.lang.String): Name = js.native
  def Names(Index: js.UndefOr[scala.Nothing], IndexLocal: java.lang.String): Name = js.native
  def Names(
    Index: js.UndefOr[scala.Nothing],
    IndexLocal: js.UndefOr[scala.Nothing],
    RefersTo: java.lang.String
  ): Name = js.native
  def Names(Index: scala.Double): Name = js.native
  def NewWindow(): Window = js.native
  def OpenLinks(Name: java.lang.String): scala.Unit = js.native
  def OpenLinks(Name: java.lang.String, ReadOnly: scala.Boolean): scala.Unit = js.native
  def OpenLinks(Name: java.lang.String, ReadOnly: scala.Boolean, Type: XlLink): scala.Unit = js.native
  def Permission(Index: js.Any): activexDashOfficeLib.OfficeNs.UserPermission = js.native
  def PivotCaches(): activexDashExcelLib.ExcelNs.PivotCaches = js.native
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
  def Post(): scala.Unit = js.native
  def PrintOut(
    From: js.UndefOr[scala.Double],
    To: js.UndefOr[scala.Double],
    Copies: js.UndefOr[scala.Double],
    Preview: js.UndefOr[scala.Boolean],
    ActivePrinter: js.UndefOr[java.lang.String],
    PrintToFile: js.UndefOr[scala.Boolean | js.UndefOr[scala.Nothing]],
    Collate: js.UndefOr[scala.Boolean],
    PrToFileName: js.UndefOr[PrintToFileName[scala.Boolean | js.UndefOr[scala.Nothing]]],
    IgnorePrintAreas: js.UndefOr[scala.Boolean]
  ): scala.Unit = js.native
  def PrintPreview(): scala.Unit = js.native
  def PrintPreview(EnableChanges: scala.Boolean): scala.Unit = js.native
  def Protect(): scala.Unit = js.native
  def Protect(Password: java.lang.String): scala.Unit = js.native
  def Protect(Password: java.lang.String, Structure: scala.Boolean): scala.Unit = js.native
  def Protect(Password: java.lang.String, Structure: scala.Boolean, Windows: scala.Boolean): scala.Unit = js.native
  def ProtectSharing(
    Filename: js.UndefOr[java.lang.String],
    Password: js.UndefOr[java.lang.String],
    WriteResPassword: js.UndefOr[java.lang.String],
    ReadOnlyRecommended: js.UndefOr[scala.Boolean],
    CreateBackup: js.UndefOr[scala.Boolean],
    SharingPassword: js.UndefOr[java.lang.String],
    FileFormat: js.UndefOr[js.Any]
  ): scala.Unit = js.native
  def PublishObjects(Index: java.lang.String): PublishObject = js.native
  def PublishObjects(Index: scala.Double): PublishObject = js.native
  def PurgeChangeHistoryNow(Days: scala.Double): scala.Unit = js.native
  def PurgeChangeHistoryNow(Days: scala.Double, SharingPassword: java.lang.String): scala.Unit = js.native
  def RecheckSmartTags(): scala.Unit = js.native
  def RefreshAll(): scala.Unit = js.native
  def RejectAllChanges(): scala.Unit = js.native
  def RejectAllChanges(When: js.Any): scala.Unit = js.native
  def RejectAllChanges(When: js.Any, Who: js.Any): scala.Unit = js.native
  def RejectAllChanges(When: js.Any, Who: js.Any, Where: js.Any): scala.Unit = js.native
  def ReloadAs(Encoding: activexDashOfficeLib.OfficeNs.MsoEncoding): scala.Unit = js.native
  def RemoveDocumentInformation(RemoveDocInfoType: XlRemoveDocInfoType): scala.Unit = js.native
  def RemoveUser(Index: scala.Double): scala.Unit = js.native
  def Reply(): scala.Unit = js.native
  def ReplyAll(): scala.Unit = js.native
  def ReplyWithChanges(): scala.Unit = js.native
  def ReplyWithChanges(ShowMessage: scala.Boolean): scala.Unit = js.native
  def ResetColors(): scala.Unit = js.native
  def Route(): scala.Unit = js.native
  def RunAutoMacros(Which: XlRunAutoMacro): scala.Unit = js.native
  def Save(): scala.Unit = js.native
  /** @param AccessMode [AccessMode=1] */
  def SaveAs(
    Filename: java.lang.String,
    FileFormat: js.UndefOr[XlFileFormat],
    Password: js.UndefOr[java.lang.String],
    WriteResPassword: js.UndefOr[java.lang.String],
    ReadOnlyRecommended: js.UndefOr[scala.Boolean],
    CreateBackup: js.UndefOr[scala.Boolean],
    AccessMode: js.UndefOr[XlSaveAsAccessMode],
    ConflictResolution: js.UndefOr[XlSaveConflictResolution],
    AddToMru: js.UndefOr[scala.Boolean],
    TextCodepage: js.UndefOr[js.Any],
    TextVisualLayout: js.UndefOr[js.Any]
  ): scala.Unit = js.native
  def SaveAsXMLData(Filename: java.lang.String, Map: XmlMap): scala.Unit = js.native
  def SaveCopyAs(Filename: java.lang.String): scala.Unit = js.native
  def SendFaxOverInternet(): scala.Unit = js.native
  def SendFaxOverInternet(Recipients: java.lang.String): scala.Unit = js.native
  def SendFaxOverInternet(Recipients: java.lang.String, Subject: java.lang.String): scala.Unit = js.native
  def SendFaxOverInternet(Recipients: java.lang.String, Subject: java.lang.String, ShowMessage: scala.Boolean): scala.Unit = js.native
  def SendForReview(): scala.Unit = js.native
  def SendForReview(Recipients: java.lang.String): scala.Unit = js.native
  def SendForReview(Recipients: java.lang.String, Subject: java.lang.String): scala.Unit = js.native
  def SendForReview(Recipients: java.lang.String, Subject: java.lang.String, ShowMessage: scala.Boolean): scala.Unit = js.native
  def SendForReview(
    Recipients: java.lang.String,
    Subject: java.lang.String,
    ShowMessage: scala.Boolean,
    IncludeAttachment: scala.Boolean
  ): scala.Unit = js.native
  def SendMail(Recipients: java.lang.String): scala.Unit = js.native
  def SendMail(Recipients: java.lang.String, Subject: java.lang.String): scala.Unit = js.native
  def SendMail(Recipients: java.lang.String, Subject: java.lang.String, ReturnReceipt: scala.Boolean): scala.Unit = js.native
  def SendMail(Recipients: stdLib.SafeArray[java.lang.String]): scala.Unit = js.native
  def SendMail(Recipients: stdLib.SafeArray[java.lang.String], Subject: java.lang.String): scala.Unit = js.native
  def SendMail(
    Recipients: stdLib.SafeArray[java.lang.String],
    Subject: java.lang.String,
    ReturnReceipt: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Macintosh only
    *
    * @param Priority [Priority=-4143]
    */
  def SendMailer(FileFormat: js.Any): scala.Unit = js.native
  def SendMailer(FileFormat: js.Any, Priority: XlPriority): scala.Unit = js.native
  def ServerPolicy(Index: java.lang.String): activexDashOfficeLib.OfficeNs.PolicyItem = js.native
  def ServerPolicy(Index: scala.Double): activexDashOfficeLib.OfficeNs.PolicyItem = js.native
  def ServerViewableItems(Index: scala.Double): js.Any = js.native
  def SetLinkOnData(Name: java.lang.String): scala.Unit = js.native
  def SetLinkOnData(Name: java.lang.String, Procedure: java.lang.String): scala.Unit = js.native
  def SetPasswordEncryptionOptions(): scala.Unit = js.native
  def SetPasswordEncryptionOptions(PasswordEncryptionProvider: java.lang.String): scala.Unit = js.native
  def SetPasswordEncryptionOptions(PasswordEncryptionProvider: java.lang.String, PasswordEncryptionAlgorithm: java.lang.String): scala.Unit = js.native
  def SetPasswordEncryptionOptions(
    PasswordEncryptionProvider: java.lang.String,
    PasswordEncryptionAlgorithm: java.lang.String,
    PasswordEncryptionKeyLength: scala.Double
  ): scala.Unit = js.native
  def SetPasswordEncryptionOptions(
    PasswordEncryptionProvider: java.lang.String,
    PasswordEncryptionAlgorithm: java.lang.String,
    PasswordEncryptionKeyLength: scala.Double,
    PasswordEncryptionFileProperties: scala.Boolean
  ): scala.Unit = js.native
  def Sheets(Indexes: stdLib.SafeArray[java.lang.String | scala.Double]): activexDashExcelLib.ExcelNs.Sheets[activexDashExcelLib.ExcelNs.Sheet] = js.native
  def Sheets(Index: java.lang.String): Sheet = js.native
  def Sheets(Index: scala.Double): Sheet = js.native
  def Signatures(iSig: scala.Double): activexDashOfficeLib.OfficeNs.Signature = js.native
  def SlicerCaches(Index: java.lang.String): SlicerCache = js.native
  def SlicerCaches(Index: scala.Double): SlicerCache = js.native
  def Styles(Index: js.Any): Style = js.native
  def TableStyles(Index: java.lang.String): TableStyle = js.native
  def TableStyles(Index: scala.Double): TableStyle = js.native
  def ToggleFormsDesign(): scala.Unit = js.native
  def Unprotect(): scala.Unit = js.native
  def Unprotect(Password: java.lang.String): scala.Unit = js.native
  def UnprotectSharing(): scala.Unit = js.native
  def UnprotectSharing(SharingPassword: java.lang.String): scala.Unit = js.native
  def UpdateFromFile(): scala.Unit = js.native
  def UpdateLink(): scala.Unit = js.native
  def UpdateLink(Name: java.lang.String): scala.Unit = js.native
  def UpdateLink(Name: java.lang.String, Type: XlLinkType): scala.Unit = js.native
  def WebPagePreview(): scala.Unit = js.native
  def Windows(Index: java.lang.String): Window = js.native
  def Windows(Index: scala.Double): Window = js.native
  def Worksheets(Indexes: stdLib.SafeArray[java.lang.String | scala.Double]): Sheets[Worksheet] = js.native
  def Worksheets(Index: java.lang.String): Worksheet = js.native
  def Worksheets(Index: scala.Double): Worksheet = js.native
  def XmlImport(Url: java.lang.String, ImportMap: XmlMap): XlXmlImportResult = js.native
  def XmlImport(Url: java.lang.String, ImportMap: XmlMap, Overwrite: scala.Boolean): XlXmlImportResult = js.native
  def XmlImport(Url: java.lang.String, ImportMap: XmlMap, Overwrite: scala.Boolean, Destination: js.Any): XlXmlImportResult = js.native
  def XmlImportXml(Data: java.lang.String, ImportMap: XmlMap): XlXmlImportResult = js.native
  def XmlImportXml(Data: java.lang.String, ImportMap: XmlMap, Overwrite: scala.Boolean): XlXmlImportResult = js.native
  def XmlImportXml(Data: java.lang.String, ImportMap: XmlMap, Overwrite: scala.Boolean, Destination: js.Any): XlXmlImportResult = js.native
  def XmlMaps(Index: java.lang.String): XmlMap = js.native
  def XmlMaps(Index: scala.Double): XmlMap = js.native
  def XmlNamespaces(Index: java.lang.String): XmlNamespace = js.native
  def XmlNamespaces(Index: scala.Double): XmlNamespace = js.native
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
  def _Protect(Password: js.Any, Structure: js.Any): scala.Unit = js.native
  def _Protect(Password: js.Any, Structure: js.Any, Windows: js.Any): scala.Unit = js.native
  def _ProtectSharing(
    Filename: js.UndefOr[js.Any],
    Password: js.UndefOr[js.Any],
    WriteResPassword: js.UndefOr[js.Any],
    ReadOnlyRecommended: js.UndefOr[js.Any],
    CreateBackup: js.UndefOr[js.Any],
    SharingPassword: js.UndefOr[js.Any]
  ): scala.Unit = js.native
  /** @param AccessMode [AccessMode=1] */
  def _SaveAs(
    Filename: java.lang.String,
    FileFormat: js.UndefOr[XlFileFormat],
    Password: js.UndefOr[java.lang.String],
    WriteResPassword: js.UndefOr[java.lang.String],
    ReadOnlyRecommended: js.UndefOr[scala.Boolean],
    CreateBackup: js.UndefOr[scala.Boolean],
    AccessMode: js.UndefOr[XlSaveAsAccessMode],
    ConflictResolution: js.UndefOr[XlSaveConflictResolution],
    AddToMru: js.UndefOr[scala.Boolean],
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
  def sblt(s: java.lang.String): scala.Unit = js.native
}

