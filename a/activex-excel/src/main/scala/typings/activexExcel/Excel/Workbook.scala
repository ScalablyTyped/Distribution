package typings.activexExcel.Excel

import typings.activexExcel.activexExcelBooleans.`true`
import typings.activexExcel.activexExcelNumbers.`2`
import typings.activexExcel.activexExcelStrings.Everyone
import typings.activexExcel.activexExcelStrings.`Everyone but me`
import typings.activexOffice.Office.ByteArray
import typings.activexOffice.Office.CommandBar
import typings.activexOffice.Office.CommandBars
import typings.activexOffice.Office.CustomXMLPart
import typings.activexOffice.Office.CustomXMLParts
import typings.activexOffice.Office.DocumentInspector
import typings.activexOffice.Office.DocumentInspectors
import typings.activexOffice.Office.DocumentLibraryVersion
import typings.activexOffice.Office.DocumentLibraryVersions
import typings.activexOffice.Office.DocumentProperties
import typings.activexOffice.Office.DocumentProperty
import typings.activexOffice.Office.MetaProperties
import typings.activexOffice.Office.MetaProperty
import typings.activexOffice.Office.MsoEncoding
import typings.activexOffice.Office.MsoExtraInfoMethod
import typings.activexOffice.Office.OfficeTheme
import typings.activexOffice.Office.Permission
import typings.activexOffice.Office.PolicyItem
import typings.activexOffice.Office.ServerPolicy
import typings.activexOffice.Office.Signature
import typings.activexOffice.Office.SignatureSet
import typings.activexOffice.Office.UserPermission
import typings.activexOffice.Office.WorkflowTasks
import typings.activexOffice.Office.WorkflowTemplates
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Workbook extends js.Object {
  
  def AcceptAllChanges(): Unit = js.native
  def AcceptAllChanges(When: js.UndefOr[scala.Nothing], Who: js.UndefOr[scala.Nothing], Where: js.Any): Unit = js.native
  def AcceptAllChanges(When: js.UndefOr[scala.Nothing], Who: js.Any): Unit = js.native
  def AcceptAllChanges(When: js.UndefOr[scala.Nothing], Who: js.Any, Where: js.Any): Unit = js.native
  def AcceptAllChanges(When: js.Any): Unit = js.native
  def AcceptAllChanges(When: js.Any, Who: js.UndefOr[scala.Nothing], Where: js.Any): Unit = js.native
  def AcceptAllChanges(When: js.Any, Who: js.Any): Unit = js.native
  def AcceptAllChanges(When: js.Any, Who: js.Any, Where: js.Any): Unit = js.native
  
  var AcceptLabelsInFormulas: Boolean = js.native
  
  var AccuracyVersion: Double = js.native
  
  def Activate(): Unit = js.native
  
  val ActiveChart: Chart = js.native
  
  val ActiveSheet: Sheet = js.native
  
  val ActiveSlicer: Slicer = js.native
  
  def AddToFavorites(): Unit = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  def ApplyTheme(Filename: String): Unit = js.native
  
  var Author: String = js.native
  
  var AutoUpdateFrequency: Double = js.native
  
  var AutoUpdateSaveChanges: Boolean = js.native
  
  def BreakLink(Name: String, Type: XlLinkType): Unit = js.native
  
  def BuiltinDocumentProperties(index: String): DocumentProperty[typings.activexExcel.Excel.Application] = js.native
  def BuiltinDocumentProperties(index: Double): DocumentProperty[typings.activexExcel.Excel.Application] = js.native
  @JSName("BuiltinDocumentProperties")
  val BuiltinDocumentProperties_Original: DocumentProperties[typings.activexExcel.Excel.Application] = js.native
  
  val CalculationVersion: Double = js.native
  
  def CanCheckIn(): Boolean = js.native
  
  def ChangeFileAccess(Mode: XlFileAccess): Unit = js.native
  @JSName("ChangeFileAccess")
  def ChangeFileAccess_2(Mode: `2`): Unit = js.native
  @JSName("ChangeFileAccess")
  def ChangeFileAccess_2(Mode: `2`, WritePassword: js.UndefOr[scala.Nothing], Notify: Boolean): Unit = js.native
  @JSName("ChangeFileAccess")
  def ChangeFileAccess_2(Mode: `2`, WritePassword: String): Unit = js.native
  @JSName("ChangeFileAccess")
  def ChangeFileAccess_2(Mode: `2`, WritePassword: String, Notify: Boolean): Unit = js.native
  
  var ChangeHistoryDuration: Double = js.native
  
  /** @param Type [Type=1] */
  def ChangeLink(Name: String, NewName: String): Unit = js.native
  def ChangeLink(Name: String, NewName: String, Type: XlLinkType): Unit = js.native
  
  def Charts(Indexes: SafeArray[String | Double]): Sheets[Chart] = js.native
  def Charts(Index: String): Chart = js.native
  def Charts(Index: Double): Chart = js.native
  @JSName("Charts")
  val Charts_Original: Sheets[Chart] = js.native
  
  var CheckCompatibility: Boolean = js.native
  
  def CheckIn(): Unit = js.native
  def CheckIn(SaveChanges: js.Any): Unit = js.native
  
  def CheckInWithVersion(): Unit = js.native
  def CheckInWithVersion(
    SaveChanges: js.UndefOr[scala.Nothing],
    Comments: js.UndefOr[scala.Nothing],
    MakePublic: js.UndefOr[scala.Nothing],
    VersionType: js.Any
  ): Unit = js.native
  def CheckInWithVersion(SaveChanges: js.UndefOr[scala.Nothing], Comments: js.UndefOr[scala.Nothing], MakePublic: js.Any): Unit = js.native
  def CheckInWithVersion(
    SaveChanges: js.UndefOr[scala.Nothing],
    Comments: js.UndefOr[scala.Nothing],
    MakePublic: js.Any,
    VersionType: js.Any
  ): Unit = js.native
  def CheckInWithVersion(SaveChanges: js.UndefOr[scala.Nothing], Comments: js.Any): Unit = js.native
  def CheckInWithVersion(
    SaveChanges: js.UndefOr[scala.Nothing],
    Comments: js.Any,
    MakePublic: js.UndefOr[scala.Nothing],
    VersionType: js.Any
  ): Unit = js.native
  def CheckInWithVersion(SaveChanges: js.UndefOr[scala.Nothing], Comments: js.Any, MakePublic: js.Any): Unit = js.native
  def CheckInWithVersion(SaveChanges: js.UndefOr[scala.Nothing], Comments: js.Any, MakePublic: js.Any, VersionType: js.Any): Unit = js.native
  def CheckInWithVersion(SaveChanges: Boolean): Unit = js.native
  def CheckInWithVersion(
    SaveChanges: Boolean,
    Comments: js.UndefOr[scala.Nothing],
    MakePublic: js.UndefOr[scala.Nothing],
    VersionType: js.Any
  ): Unit = js.native
  def CheckInWithVersion(SaveChanges: Boolean, Comments: js.UndefOr[scala.Nothing], MakePublic: js.Any): Unit = js.native
  def CheckInWithVersion(SaveChanges: Boolean, Comments: js.UndefOr[scala.Nothing], MakePublic: js.Any, VersionType: js.Any): Unit = js.native
  def CheckInWithVersion(SaveChanges: Boolean, Comments: js.Any): Unit = js.native
  def CheckInWithVersion(SaveChanges: Boolean, Comments: js.Any, MakePublic: js.UndefOr[scala.Nothing], VersionType: js.Any): Unit = js.native
  def CheckInWithVersion(SaveChanges: Boolean, Comments: js.Any, MakePublic: js.Any): Unit = js.native
  def CheckInWithVersion(SaveChanges: Boolean, Comments: js.Any, MakePublic: js.Any, VersionType: js.Any): Unit = js.native
  
  @JSName("CheckIn")
  def CheckIn_true(SaveChanges: `true`): Unit = js.native
  @JSName("CheckIn")
  def CheckIn_true(SaveChanges: `true`, Comments: js.UndefOr[scala.Nothing], MakePublic: Boolean): Unit = js.native
  @JSName("CheckIn")
  def CheckIn_true(SaveChanges: `true`, Comments: String): Unit = js.native
  @JSName("CheckIn")
  def CheckIn_true(SaveChanges: `true`, Comments: String, MakePublic: Boolean): Unit = js.native
  
  def Close(): Unit = js.native
  def Close(
    SaveChanges: js.UndefOr[scala.Nothing],
    Filename: js.UndefOr[scala.Nothing],
    RouteWorkbook: Boolean
  ): Unit = js.native
  def Close(SaveChanges: Boolean): Unit = js.native
  def Close(SaveChanges: Boolean, Filename: js.UndefOr[scala.Nothing], RouteWorkbook: Boolean): Unit = js.native
  @JSName("Close")
  def Close_true(SaveChanges: `true`): Unit = js.native
  @JSName("Close")
  def Close_true(SaveChanges: `true`, Filename: js.UndefOr[scala.Nothing], RouteWorkbook: Boolean): Unit = js.native
  @JSName("Close")
  def Close_true(SaveChanges: `true`, Filename: String): Unit = js.native
  @JSName("Close")
  def Close_true(SaveChanges: `true`, Filename: String, RouteWorkbook: Boolean): Unit = js.native
  
  val CodeName: String = js.native
  
  def Colors(Index: Double): Double = js.native
  @JSName("Colors")
  var Colors_Original: SafeArray[Double] with (js.Function1[/* Index */ Double, Double]) = js.native
  
  def CommandBars(Index: String): CommandBar = js.native
  def CommandBars(Index: Double): CommandBar = js.native
  @JSName("CommandBars")
  val CommandBars_Original: CommandBars = js.native
  
  var Comments: String = js.native
  
  var ConflictResolution: XlSaveConflictResolution = js.native
  
  def Connections(Index: Double): WorkbookConnection = js.native
  
  val ConnectionsDisabled: Boolean = js.native
  
  @JSName("Connections")
  val Connections_Original: Connections = js.native
  
  val Container: js.Any = js.native
  
  def ContentTypeProperties(Index: String): MetaProperty = js.native
  def ContentTypeProperties(Index: Double): MetaProperty = js.native
  @JSName("ContentTypeProperties")
  val ContentTypeProperties_Original: MetaProperties = js.native
  
  val CreateBackup: Boolean = js.native
  
  val Creator: XlCreator = js.native
  
  def CustomDocumentProperties(index: String): DocumentProperty[typings.activexExcel.Excel.Application] = js.native
  def CustomDocumentProperties(index: Double): DocumentProperty[typings.activexExcel.Excel.Application] = js.native
  @JSName("CustomDocumentProperties")
  val CustomDocumentProperties_Original: DocumentProperties[typings.activexExcel.Excel.Application] = js.native
  
  def CustomViews(ViewName: String): CustomView = js.native
  def CustomViews(ViewName: Double): CustomView = js.native
  @JSName("CustomViews")
  val CustomViews_Original: CustomViews = js.native
  
  def CustomXMLParts(Index: String): CustomXMLPart = js.native
  def CustomXMLParts(Index: Double): CustomXMLPart = js.native
  @JSName("CustomXMLParts")
  val CustomXMLParts_Original: CustomXMLParts = js.native
  
  var Date1904: Boolean = js.native
  
  var DefaultPivotTableStyle: js.Any = js.native
  
  var DefaultSlicerStyle: js.Any = js.native
  
  var DefaultTableStyle: js.Any = js.native
  
  def DeleteNumberFormat(NumberFormat: String): Unit = js.native
  
  def DialogSheets(Indexes: SafeArray[String | Double]): Sheets[DialogSheet] = js.native
  def DialogSheets(Index: String): DialogSheet = js.native
  def DialogSheets(Index: Double): DialogSheet = js.native
  @JSName("DialogSheets")
  val DialogSheets_Original: Sheets[DialogSheet] = js.native
  
  var DisplayDrawingObjects: XlDisplayDrawingObjects = js.native
  
  var DisplayInkComments: Boolean = js.native
  
  var DoNotPromptForConvert: Boolean = js.native
  
  def DocumentInspectors(Index: Double): DocumentInspector = js.native
  @JSName("DocumentInspectors")
  val DocumentInspectors_Original: DocumentInspectors = js.native
  
  def DocumentLibraryVersions(lIndex: Double): DocumentLibraryVersion = js.native
  @JSName("DocumentLibraryVersions")
  val DocumentLibraryVersions_Original: DocumentLibraryVersions = js.native
  
  def Dummy16(): Unit = js.native
  
  def Dummy17(calcid: Double): Unit = js.native
  
  def Dummy26(): Unit = js.native
  
  def Dummy27(): Unit = js.native
  
  var EnableAutoRecover: Boolean = js.native
  
  def EnableConnections(): Unit = js.native
  
  var EncryptionProvider: String = js.native
  
  def EndReview(): Unit = js.native
  
  var EnvelopeVisible: Boolean = js.native
  
  def Excel4IntlMacroSheets(Indexes: SafeArray[String | Double]): Sheets[Sheet] = js.native
  def Excel4IntlMacroSheets(Index: String): Sheet = js.native
  def Excel4IntlMacroSheets(Index: Double): Sheet = js.native
  @JSName("Excel4IntlMacroSheets")
  val Excel4IntlMacroSheets_Original: Sheets[Sheet] = js.native
  
  def Excel4MacroSheets(Indexes: SafeArray[String | Double]): Sheets[Sheet] = js.native
  def Excel4MacroSheets(Index: String): Sheet = js.native
  def Excel4MacroSheets(Index: Double): Sheet = js.native
  @JSName("Excel4MacroSheets")
  val Excel4MacroSheets_Original: Sheets[Sheet] = js.native
  
  val Excel8CompatibilityMode: Boolean = js.native
  
  @JSName("Excel.Workbook_typekey")
  var ExcelDotWorkbook_typekey: Workbook = js.native
  
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
  
  val FileFormat: XlFileFormat = js.native
  
  var Final: Boolean = js.native
  
  def FollowHyperlink(Address: String): Unit = js.native
  def FollowHyperlink(
    Address: String,
    SubAddress: js.UndefOr[scala.Nothing],
    NewWindow: js.UndefOr[scala.Nothing],
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: js.UndefOr[scala.Nothing],
    Method: js.UndefOr[scala.Nothing],
    HeaderInfo: String
  ): Unit = js.native
  def FollowHyperlink(
    Address: String,
    SubAddress: js.UndefOr[scala.Nothing],
    NewWindow: js.UndefOr[scala.Nothing],
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: js.UndefOr[scala.Nothing],
    Method: MsoExtraInfoMethod
  ): Unit = js.native
  def FollowHyperlink(
    Address: String,
    SubAddress: js.UndefOr[scala.Nothing],
    NewWindow: js.UndefOr[scala.Nothing],
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: js.UndefOr[scala.Nothing],
    Method: MsoExtraInfoMethod,
    HeaderInfo: String
  ): Unit = js.native
  def FollowHyperlink(
    Address: String,
    SubAddress: js.UndefOr[scala.Nothing],
    NewWindow: js.UndefOr[scala.Nothing],
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: String
  ): Unit = js.native
  def FollowHyperlink(
    Address: String,
    SubAddress: js.UndefOr[scala.Nothing],
    NewWindow: js.UndefOr[scala.Nothing],
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: String,
    Method: js.UndefOr[scala.Nothing],
    HeaderInfo: String
  ): Unit = js.native
  def FollowHyperlink(
    Address: String,
    SubAddress: js.UndefOr[scala.Nothing],
    NewWindow: js.UndefOr[scala.Nothing],
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: String,
    Method: MsoExtraInfoMethod
  ): Unit = js.native
  def FollowHyperlink(
    Address: String,
    SubAddress: js.UndefOr[scala.Nothing],
    NewWindow: js.UndefOr[scala.Nothing],
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: String,
    Method: MsoExtraInfoMethod,
    HeaderInfo: String
  ): Unit = js.native
  def FollowHyperlink(
    Address: String,
    SubAddress: js.UndefOr[scala.Nothing],
    NewWindow: js.UndefOr[scala.Nothing],
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: ByteArray
  ): Unit = js.native
  def FollowHyperlink(
    Address: String,
    SubAddress: js.UndefOr[scala.Nothing],
    NewWindow: js.UndefOr[scala.Nothing],
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: ByteArray,
    Method: js.UndefOr[scala.Nothing],
    HeaderInfo: String
  ): Unit = js.native
  def FollowHyperlink(
    Address: String,
    SubAddress: js.UndefOr[scala.Nothing],
    NewWindow: js.UndefOr[scala.Nothing],
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: ByteArray,
    Method: MsoExtraInfoMethod
  ): Unit = js.native
  def FollowHyperlink(
    Address: String,
    SubAddress: js.UndefOr[scala.Nothing],
    NewWindow: js.UndefOr[scala.Nothing],
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: ByteArray,
    Method: MsoExtraInfoMethod,
    HeaderInfo: String
  ): Unit = js.native
  def FollowHyperlink(Address: String, SubAddress: js.UndefOr[scala.Nothing], NewWindow: Boolean): Unit = js.native
  def FollowHyperlink(
    Address: String,
    SubAddress: js.UndefOr[scala.Nothing],
    NewWindow: Boolean,
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: js.UndefOr[scala.Nothing],
    Method: js.UndefOr[scala.Nothing],
    HeaderInfo: String
  ): Unit = js.native
  def FollowHyperlink(
    Address: String,
    SubAddress: js.UndefOr[scala.Nothing],
    NewWindow: Boolean,
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: js.UndefOr[scala.Nothing],
    Method: MsoExtraInfoMethod
  ): Unit = js.native
  def FollowHyperlink(
    Address: String,
    SubAddress: js.UndefOr[scala.Nothing],
    NewWindow: Boolean,
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: js.UndefOr[scala.Nothing],
    Method: MsoExtraInfoMethod,
    HeaderInfo: String
  ): Unit = js.native
  def FollowHyperlink(
    Address: String,
    SubAddress: js.UndefOr[scala.Nothing],
    NewWindow: Boolean,
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: String
  ): Unit = js.native
  def FollowHyperlink(
    Address: String,
    SubAddress: js.UndefOr[scala.Nothing],
    NewWindow: Boolean,
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: String,
    Method: js.UndefOr[scala.Nothing],
    HeaderInfo: String
  ): Unit = js.native
  def FollowHyperlink(
    Address: String,
    SubAddress: js.UndefOr[scala.Nothing],
    NewWindow: Boolean,
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: String,
    Method: MsoExtraInfoMethod
  ): Unit = js.native
  def FollowHyperlink(
    Address: String,
    SubAddress: js.UndefOr[scala.Nothing],
    NewWindow: Boolean,
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: String,
    Method: MsoExtraInfoMethod,
    HeaderInfo: String
  ): Unit = js.native
  def FollowHyperlink(
    Address: String,
    SubAddress: js.UndefOr[scala.Nothing],
    NewWindow: Boolean,
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: ByteArray
  ): Unit = js.native
  def FollowHyperlink(
    Address: String,
    SubAddress: js.UndefOr[scala.Nothing],
    NewWindow: Boolean,
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: ByteArray,
    Method: js.UndefOr[scala.Nothing],
    HeaderInfo: String
  ): Unit = js.native
  def FollowHyperlink(
    Address: String,
    SubAddress: js.UndefOr[scala.Nothing],
    NewWindow: Boolean,
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: ByteArray,
    Method: MsoExtraInfoMethod
  ): Unit = js.native
  def FollowHyperlink(
    Address: String,
    SubAddress: js.UndefOr[scala.Nothing],
    NewWindow: Boolean,
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: ByteArray,
    Method: MsoExtraInfoMethod,
    HeaderInfo: String
  ): Unit = js.native
  def FollowHyperlink(Address: String, SubAddress: String): Unit = js.native
  def FollowHyperlink(
    Address: String,
    SubAddress: String,
    NewWindow: js.UndefOr[scala.Nothing],
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: js.UndefOr[scala.Nothing],
    Method: js.UndefOr[scala.Nothing],
    HeaderInfo: String
  ): Unit = js.native
  def FollowHyperlink(
    Address: String,
    SubAddress: String,
    NewWindow: js.UndefOr[scala.Nothing],
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: js.UndefOr[scala.Nothing],
    Method: MsoExtraInfoMethod
  ): Unit = js.native
  def FollowHyperlink(
    Address: String,
    SubAddress: String,
    NewWindow: js.UndefOr[scala.Nothing],
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: js.UndefOr[scala.Nothing],
    Method: MsoExtraInfoMethod,
    HeaderInfo: String
  ): Unit = js.native
  def FollowHyperlink(
    Address: String,
    SubAddress: String,
    NewWindow: js.UndefOr[scala.Nothing],
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: String
  ): Unit = js.native
  def FollowHyperlink(
    Address: String,
    SubAddress: String,
    NewWindow: js.UndefOr[scala.Nothing],
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: String,
    Method: js.UndefOr[scala.Nothing],
    HeaderInfo: String
  ): Unit = js.native
  def FollowHyperlink(
    Address: String,
    SubAddress: String,
    NewWindow: js.UndefOr[scala.Nothing],
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: String,
    Method: MsoExtraInfoMethod
  ): Unit = js.native
  def FollowHyperlink(
    Address: String,
    SubAddress: String,
    NewWindow: js.UndefOr[scala.Nothing],
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: String,
    Method: MsoExtraInfoMethod,
    HeaderInfo: String
  ): Unit = js.native
  def FollowHyperlink(
    Address: String,
    SubAddress: String,
    NewWindow: js.UndefOr[scala.Nothing],
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: ByteArray
  ): Unit = js.native
  def FollowHyperlink(
    Address: String,
    SubAddress: String,
    NewWindow: js.UndefOr[scala.Nothing],
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: ByteArray,
    Method: js.UndefOr[scala.Nothing],
    HeaderInfo: String
  ): Unit = js.native
  def FollowHyperlink(
    Address: String,
    SubAddress: String,
    NewWindow: js.UndefOr[scala.Nothing],
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: ByteArray,
    Method: MsoExtraInfoMethod
  ): Unit = js.native
  def FollowHyperlink(
    Address: String,
    SubAddress: String,
    NewWindow: js.UndefOr[scala.Nothing],
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: ByteArray,
    Method: MsoExtraInfoMethod,
    HeaderInfo: String
  ): Unit = js.native
  def FollowHyperlink(Address: String, SubAddress: String, NewWindow: Boolean): Unit = js.native
  def FollowHyperlink(
    Address: String,
    SubAddress: String,
    NewWindow: Boolean,
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: js.UndefOr[scala.Nothing],
    Method: js.UndefOr[scala.Nothing],
    HeaderInfo: String
  ): Unit = js.native
  def FollowHyperlink(
    Address: String,
    SubAddress: String,
    NewWindow: Boolean,
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: js.UndefOr[scala.Nothing],
    Method: MsoExtraInfoMethod
  ): Unit = js.native
  def FollowHyperlink(
    Address: String,
    SubAddress: String,
    NewWindow: Boolean,
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: js.UndefOr[scala.Nothing],
    Method: MsoExtraInfoMethod,
    HeaderInfo: String
  ): Unit = js.native
  def FollowHyperlink(
    Address: String,
    SubAddress: String,
    NewWindow: Boolean,
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: String
  ): Unit = js.native
  def FollowHyperlink(
    Address: String,
    SubAddress: String,
    NewWindow: Boolean,
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: String,
    Method: js.UndefOr[scala.Nothing],
    HeaderInfo: String
  ): Unit = js.native
  def FollowHyperlink(
    Address: String,
    SubAddress: String,
    NewWindow: Boolean,
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: String,
    Method: MsoExtraInfoMethod
  ): Unit = js.native
  def FollowHyperlink(
    Address: String,
    SubAddress: String,
    NewWindow: Boolean,
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: String,
    Method: MsoExtraInfoMethod,
    HeaderInfo: String
  ): Unit = js.native
  def FollowHyperlink(
    Address: String,
    SubAddress: String,
    NewWindow: Boolean,
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: ByteArray
  ): Unit = js.native
  def FollowHyperlink(
    Address: String,
    SubAddress: String,
    NewWindow: Boolean,
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: ByteArray,
    Method: js.UndefOr[scala.Nothing],
    HeaderInfo: String
  ): Unit = js.native
  def FollowHyperlink(
    Address: String,
    SubAddress: String,
    NewWindow: Boolean,
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: ByteArray,
    Method: MsoExtraInfoMethod
  ): Unit = js.native
  def FollowHyperlink(
    Address: String,
    SubAddress: String,
    NewWindow: Boolean,
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: ByteArray,
    Method: MsoExtraInfoMethod,
    HeaderInfo: String
  ): Unit = js.native
  
  var ForceFullCalculation: Boolean = js.native
  
  def ForwardMailer(): Unit = js.native
  
  val FullName: String = js.native
  
  val FullNameURLEncoded: String = js.native
  
  def GetWorkflowTasks(): WorkflowTasks = js.native
  
  def GetWorkflowTemplates(): WorkflowTemplates = js.native
  
  val HTMLProject: typings.activexOffice.Office.HTMLProject = js.native
  
  var HasMailer: Boolean = js.native
  
  val HasPassword: Boolean = js.native
  
  var HasRoutingSlip: Boolean = js.native
  
  val HasVBProject: Boolean = js.native
  
  var HighlightChangesOnScreen: Boolean = js.native
  
  def HighlightChangesOptions(): Unit = js.native
  def HighlightChangesOptions(When: js.UndefOr[scala.Nothing], Who: js.UndefOr[scala.Nothing], Where: String): Unit = js.native
  def HighlightChangesOptions(When: js.UndefOr[scala.Nothing], Who: String): Unit = js.native
  def HighlightChangesOptions(When: js.UndefOr[scala.Nothing], Who: String, Where: String): Unit = js.native
  def HighlightChangesOptions(When: XlHighlightChangesTime): Unit = js.native
  def HighlightChangesOptions(When: XlHighlightChangesTime, Who: js.UndefOr[scala.Nothing], Where: String): Unit = js.native
  def HighlightChangesOptions(When: XlHighlightChangesTime, Who: String): Unit = js.native
  def HighlightChangesOptions(When: XlHighlightChangesTime, Who: String, Where: String): Unit = js.native
  @JSName("HighlightChangesOptions")
  def HighlightChangesOptions_Everyone(When: js.UndefOr[scala.Nothing], Who: Everyone): Unit = js.native
  @JSName("HighlightChangesOptions")
  def HighlightChangesOptions_Everyone(When: js.UndefOr[scala.Nothing], Who: Everyone, Where: String): Unit = js.native
  @JSName("HighlightChangesOptions")
  def HighlightChangesOptions_Everyone(When: XlHighlightChangesTime, Who: Everyone): Unit = js.native
  @JSName("HighlightChangesOptions")
  def HighlightChangesOptions_Everyone(When: XlHighlightChangesTime, Who: Everyone, Where: String): Unit = js.native
  @JSName("HighlightChangesOptions")
  def HighlightChangesOptions_Everyonebutme(When: js.UndefOr[scala.Nothing], Who: `Everyone but me`): Unit = js.native
  @JSName("HighlightChangesOptions")
  def HighlightChangesOptions_Everyonebutme(When: js.UndefOr[scala.Nothing], Who: `Everyone but me`, Where: String): Unit = js.native
  @JSName("HighlightChangesOptions")
  def HighlightChangesOptions_Everyonebutme(When: XlHighlightChangesTime, Who: `Everyone but me`): Unit = js.native
  @JSName("HighlightChangesOptions")
  def HighlightChangesOptions_Everyonebutme(When: XlHighlightChangesTime, Who: `Everyone but me`, Where: String): Unit = js.native
  
  def IconSets(Index: Double): IconSet = js.native
  @JSName("IconSets")
  val IconSets_Original: IconSets = js.native
  
  var InactiveListBorderVisible: Boolean = js.native
  
  var IsAddin: Boolean = js.native
  
  val IsInplace: Boolean = js.native
  
  var KeepChangeHistory: Boolean = js.native
  
  var Keywords: String = js.native
  
  def LinkInfo(Name: String, LinkInfo: XlLinkInfo): js.Any = js.native
  def LinkInfo(Name: String, LinkInfo: XlLinkInfo, Type: js.UndefOr[scala.Nothing], EditionRef: String): js.Any = js.native
  def LinkInfo(Name: String, LinkInfo: XlLinkInfo, Type: XlLinkInfoType): js.Any = js.native
  def LinkInfo(Name: String, LinkInfo: XlLinkInfo, Type: XlLinkInfoType, EditionRef: String): js.Any = js.native
  
  def LinkSources(): SafeArray[String] = js.native
  def LinkSources(Type: XlLink): SafeArray[String] = js.native
  
  var ListChangesOnNewSheet: Boolean = js.native
  
  def LockServerFile(): Unit = js.native
  
  val Mailer: typings.activexExcel.Excel.Mailer = js.native
  
  def MergeWorkbook(Filename: String): Unit = js.native
  
  def Modules(Indexes: SafeArray[String | Double]): Sheets[Sheet] = js.native
  def Modules(Index: String): Sheet = js.native
  def Modules(Index: Double): Sheet = js.native
  @JSName("Modules")
  val Modules_Original: Sheets[Sheet] = js.native
  
  val MultiUserEditing: Boolean = js.native
  
  val Name: String = js.native
  
  def Names(Index: js.UndefOr[scala.Nothing], IndexLocal: js.UndefOr[scala.Nothing], RefersTo: String): typings.activexExcel.Excel.Name = js.native
  def Names(Index: js.UndefOr[scala.Nothing], IndexLocal: String): typings.activexExcel.Excel.Name = js.native
  def Names(Index: String): typings.activexExcel.Excel.Name = js.native
  def Names(Index: Double): typings.activexExcel.Excel.Name = js.native
  @JSName("Names")
  val Names_Original: Names = js.native
  
  def NewWindow(): Window = js.native
  
  var OnSave: String = js.native
  
  var OnSheetActivate: String = js.native
  
  var OnSheetDeactivate: String = js.native
  
  def OpenLinks(Name: String): Unit = js.native
  def OpenLinks(Name: String, ReadOnly: js.UndefOr[scala.Nothing], Type: XlLink): Unit = js.native
  def OpenLinks(Name: String, ReadOnly: Boolean): Unit = js.native
  def OpenLinks(Name: String, ReadOnly: Boolean, Type: XlLink): Unit = js.native
  
  val Parent: js.Any = js.native
  
  var Password: String = js.native
  
  val PasswordEncryptionAlgorithm: String = js.native
  
  val PasswordEncryptionFileProperties: Boolean = js.native
  
  val PasswordEncryptionKeyLength: Double = js.native
  
  val PasswordEncryptionProvider: String = js.native
  
  val Path: String = js.native
  
  def Permission(Index: js.Any): UserPermission = js.native
  @JSName("Permission")
  val Permission_Original: Permission = js.native
  
  var PersonalViewListSettings: Boolean = js.native
  
  var PersonalViewPrintSettings: Boolean = js.native
  
  def PivotCaches(): typings.activexExcel.Excel.PivotCaches = js.native
  
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
  
  var PrecisionAsDisplayed: Boolean = js.native
  
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
  
  def Protect(): Unit = js.native
  def Protect(Password: js.UndefOr[scala.Nothing], Structure: js.UndefOr[scala.Nothing], Windows: Boolean): Unit = js.native
  def Protect(Password: js.UndefOr[scala.Nothing], Structure: Boolean): Unit = js.native
  def Protect(Password: js.UndefOr[scala.Nothing], Structure: Boolean, Windows: Boolean): Unit = js.native
  def Protect(Password: String): Unit = js.native
  def Protect(Password: String, Structure: js.UndefOr[scala.Nothing], Windows: Boolean): Unit = js.native
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
  
  val ProtectStructure: Boolean = js.native
  
  val ProtectWindows: Boolean = js.native
  
  def PublishObjects(Index: String): PublishObject = js.native
  def PublishObjects(Index: Double): PublishObject = js.native
  @JSName("PublishObjects")
  val PublishObjects_Original: PublishObjects = js.native
  
  def PurgeChangeHistoryNow(Days: Double): Unit = js.native
  def PurgeChangeHistoryNow(Days: Double, SharingPassword: String): Unit = js.native
  
  val ReadOnly: Boolean = js.native
  
  var ReadOnlyRecommended: Boolean = js.native
  
  def RecheckSmartTags(): Unit = js.native
  
  def RefreshAll(): Unit = js.native
  
  def RejectAllChanges(): Unit = js.native
  def RejectAllChanges(When: js.UndefOr[scala.Nothing], Who: js.UndefOr[scala.Nothing], Where: js.Any): Unit = js.native
  def RejectAllChanges(When: js.UndefOr[scala.Nothing], Who: js.Any): Unit = js.native
  def RejectAllChanges(When: js.UndefOr[scala.Nothing], Who: js.Any, Where: js.Any): Unit = js.native
  def RejectAllChanges(When: js.Any): Unit = js.native
  def RejectAllChanges(When: js.Any, Who: js.UndefOr[scala.Nothing], Where: js.Any): Unit = js.native
  def RejectAllChanges(When: js.Any, Who: js.Any): Unit = js.native
  def RejectAllChanges(When: js.Any, Who: js.Any, Where: js.Any): Unit = js.native
  
  def ReloadAs(Encoding: MsoEncoding): Unit = js.native
  
  def RemoveDocumentInformation(RemoveDocInfoType: XlRemoveDocInfoType): Unit = js.native
  
  var RemovePersonalInformation: Boolean = js.native
  
  def RemoveUser(Index: Double): Unit = js.native
  
  def Reply(): Unit = js.native
  
  def ReplyAll(): Unit = js.native
  
  def ReplyWithChanges(): Unit = js.native
  def ReplyWithChanges(ShowMessage: Boolean): Unit = js.native
  
  val Research: typings.activexExcel.Excel.Research = js.native
  
  def ResetColors(): Unit = js.native
  
  val RevisionNumber: Double = js.native
  
  def Route(): Unit = js.native
  
  val Routed: Boolean = js.native
  
  val RoutingSlip: typings.activexExcel.Excel.RoutingSlip = js.native
  
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
  
  var SaveLinkValues: Boolean = js.native
  
  var Saved: Boolean = js.native
  
  def SendFaxOverInternet(): Unit = js.native
  def SendFaxOverInternet(Recipients: js.UndefOr[scala.Nothing], Subject: js.UndefOr[scala.Nothing], ShowMessage: Boolean): Unit = js.native
  def SendFaxOverInternet(Recipients: js.UndefOr[scala.Nothing], Subject: String): Unit = js.native
  def SendFaxOverInternet(Recipients: js.UndefOr[scala.Nothing], Subject: String, ShowMessage: Boolean): Unit = js.native
  def SendFaxOverInternet(Recipients: String): Unit = js.native
  def SendFaxOverInternet(Recipients: String, Subject: js.UndefOr[scala.Nothing], ShowMessage: Boolean): Unit = js.native
  def SendFaxOverInternet(Recipients: String, Subject: String): Unit = js.native
  def SendFaxOverInternet(Recipients: String, Subject: String, ShowMessage: Boolean): Unit = js.native
  
  def SendForReview(): Unit = js.native
  def SendForReview(
    Recipients: js.UndefOr[scala.Nothing],
    Subject: js.UndefOr[scala.Nothing],
    ShowMessage: js.UndefOr[scala.Nothing],
    IncludeAttachment: Boolean
  ): Unit = js.native
  def SendForReview(Recipients: js.UndefOr[scala.Nothing], Subject: js.UndefOr[scala.Nothing], ShowMessage: Boolean): Unit = js.native
  def SendForReview(
    Recipients: js.UndefOr[scala.Nothing],
    Subject: js.UndefOr[scala.Nothing],
    ShowMessage: Boolean,
    IncludeAttachment: Boolean
  ): Unit = js.native
  def SendForReview(Recipients: js.UndefOr[scala.Nothing], Subject: String): Unit = js.native
  def SendForReview(
    Recipients: js.UndefOr[scala.Nothing],
    Subject: String,
    ShowMessage: js.UndefOr[scala.Nothing],
    IncludeAttachment: Boolean
  ): Unit = js.native
  def SendForReview(Recipients: js.UndefOr[scala.Nothing], Subject: String, ShowMessage: Boolean): Unit = js.native
  def SendForReview(
    Recipients: js.UndefOr[scala.Nothing],
    Subject: String,
    ShowMessage: Boolean,
    IncludeAttachment: Boolean
  ): Unit = js.native
  def SendForReview(Recipients: String): Unit = js.native
  def SendForReview(
    Recipients: String,
    Subject: js.UndefOr[scala.Nothing],
    ShowMessage: js.UndefOr[scala.Nothing],
    IncludeAttachment: Boolean
  ): Unit = js.native
  def SendForReview(Recipients: String, Subject: js.UndefOr[scala.Nothing], ShowMessage: Boolean): Unit = js.native
  def SendForReview(
    Recipients: String,
    Subject: js.UndefOr[scala.Nothing],
    ShowMessage: Boolean,
    IncludeAttachment: Boolean
  ): Unit = js.native
  def SendForReview(Recipients: String, Subject: String): Unit = js.native
  def SendForReview(
    Recipients: String,
    Subject: String,
    ShowMessage: js.UndefOr[scala.Nothing],
    IncludeAttachment: Boolean
  ): Unit = js.native
  def SendForReview(Recipients: String, Subject: String, ShowMessage: Boolean): Unit = js.native
  def SendForReview(Recipients: String, Subject: String, ShowMessage: Boolean, IncludeAttachment: Boolean): Unit = js.native
  
  def SendMail(Recipients: String): Unit = js.native
  def SendMail(Recipients: String, Subject: js.UndefOr[scala.Nothing], ReturnReceipt: Boolean): Unit = js.native
  def SendMail(Recipients: String, Subject: String): Unit = js.native
  def SendMail(Recipients: String, Subject: String, ReturnReceipt: Boolean): Unit = js.native
  def SendMail(Recipients: SafeArray[String]): Unit = js.native
  def SendMail(Recipients: SafeArray[String], Subject: js.UndefOr[scala.Nothing], ReturnReceipt: Boolean): Unit = js.native
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
  @JSName("ServerPolicy")
  val ServerPolicy_Original: ServerPolicy = js.native
  
  def ServerViewableItems(Index: Double): js.Any = js.native
  @JSName("ServerViewableItems")
  val ServerViewableItems_Original: ServerViewableItems = js.native
  
  def SetLinkOnData(Name: String): Unit = js.native
  def SetLinkOnData(Name: String, Procedure: String): Unit = js.native
  
  def SetPasswordEncryptionOptions(): Unit = js.native
  def SetPasswordEncryptionOptions(
    PasswordEncryptionProvider: js.UndefOr[scala.Nothing],
    PasswordEncryptionAlgorithm: js.UndefOr[scala.Nothing],
    PasswordEncryptionKeyLength: js.UndefOr[scala.Nothing],
    PasswordEncryptionFileProperties: Boolean
  ): Unit = js.native
  def SetPasswordEncryptionOptions(
    PasswordEncryptionProvider: js.UndefOr[scala.Nothing],
    PasswordEncryptionAlgorithm: js.UndefOr[scala.Nothing],
    PasswordEncryptionKeyLength: Double
  ): Unit = js.native
  def SetPasswordEncryptionOptions(
    PasswordEncryptionProvider: js.UndefOr[scala.Nothing],
    PasswordEncryptionAlgorithm: js.UndefOr[scala.Nothing],
    PasswordEncryptionKeyLength: Double,
    PasswordEncryptionFileProperties: Boolean
  ): Unit = js.native
  def SetPasswordEncryptionOptions(PasswordEncryptionProvider: js.UndefOr[scala.Nothing], PasswordEncryptionAlgorithm: String): Unit = js.native
  def SetPasswordEncryptionOptions(
    PasswordEncryptionProvider: js.UndefOr[scala.Nothing],
    PasswordEncryptionAlgorithm: String,
    PasswordEncryptionKeyLength: js.UndefOr[scala.Nothing],
    PasswordEncryptionFileProperties: Boolean
  ): Unit = js.native
  def SetPasswordEncryptionOptions(
    PasswordEncryptionProvider: js.UndefOr[scala.Nothing],
    PasswordEncryptionAlgorithm: String,
    PasswordEncryptionKeyLength: Double
  ): Unit = js.native
  def SetPasswordEncryptionOptions(
    PasswordEncryptionProvider: js.UndefOr[scala.Nothing],
    PasswordEncryptionAlgorithm: String,
    PasswordEncryptionKeyLength: Double,
    PasswordEncryptionFileProperties: Boolean
  ): Unit = js.native
  def SetPasswordEncryptionOptions(PasswordEncryptionProvider: String): Unit = js.native
  def SetPasswordEncryptionOptions(
    PasswordEncryptionProvider: String,
    PasswordEncryptionAlgorithm: js.UndefOr[scala.Nothing],
    PasswordEncryptionKeyLength: js.UndefOr[scala.Nothing],
    PasswordEncryptionFileProperties: Boolean
  ): Unit = js.native
  def SetPasswordEncryptionOptions(
    PasswordEncryptionProvider: String,
    PasswordEncryptionAlgorithm: js.UndefOr[scala.Nothing],
    PasswordEncryptionKeyLength: Double
  ): Unit = js.native
  def SetPasswordEncryptionOptions(
    PasswordEncryptionProvider: String,
    PasswordEncryptionAlgorithm: js.UndefOr[scala.Nothing],
    PasswordEncryptionKeyLength: Double,
    PasswordEncryptionFileProperties: Boolean
  ): Unit = js.native
  def SetPasswordEncryptionOptions(PasswordEncryptionProvider: String, PasswordEncryptionAlgorithm: String): Unit = js.native
  def SetPasswordEncryptionOptions(
    PasswordEncryptionProvider: String,
    PasswordEncryptionAlgorithm: String,
    PasswordEncryptionKeyLength: js.UndefOr[scala.Nothing],
    PasswordEncryptionFileProperties: Boolean
  ): Unit = js.native
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
  
  val SharedWorkspace: typings.activexOffice.Office.SharedWorkspace = js.native
  
  def Sheets(Indexes: SafeArray[String | Double]): typings.activexExcel.Excel.Sheets[Sheet] = js.native
  def Sheets(Index: String): Sheet = js.native
  def Sheets(Index: Double): Sheet = js.native
  @JSName("Sheets")
  val Sheets_Original: Sheets[Sheet] = js.native
  
  var ShowConflictHistory: Boolean = js.native
  
  var ShowPivotChartActiveFields: Boolean = js.native
  
  var ShowPivotTableFieldList: Boolean = js.native
  
  def Signatures(iSig: Double): Signature = js.native
  @JSName("Signatures")
  val Signatures_Original: SignatureSet = js.native
  
  def SlicerCaches(Index: String): SlicerCache = js.native
  def SlicerCaches(Index: Double): SlicerCache = js.native
  @JSName("SlicerCaches")
  val SlicerCaches_Original: SlicerCaches = js.native
  
  val SmartDocument: typings.activexOffice.Office.SmartDocument = js.native
  
  val SmartTagOptions: typings.activexExcel.Excel.SmartTagOptions = js.native
  
  def Styles(Index: js.Any): Style = js.native
  @JSName("Styles")
  val Styles_Original: Styles = js.native
  
  var Subject: String = js.native
  
  val Sync: typings.activexOffice.Office.Sync = js.native
  
  def TableStyles(Index: String): TableStyle = js.native
  def TableStyles(Index: Double): TableStyle = js.native
  @JSName("TableStyles")
  val TableStyles_Original: TableStyles = js.native
  
  var TemplateRemoveExtData: Boolean = js.native
  
  val Theme: OfficeTheme = js.native
  
  var Title: String = js.native
  
  def ToggleFormsDesign(): Unit = js.native
  
  def Unprotect(): Unit = js.native
  def Unprotect(Password: String): Unit = js.native
  
  def UnprotectSharing(): Unit = js.native
  def UnprotectSharing(SharingPassword: String): Unit = js.native
  
  def UpdateFromFile(): Unit = js.native
  
  def UpdateLink(): Unit = js.native
  def UpdateLink(Name: js.UndefOr[scala.Nothing], Type: XlLinkType): Unit = js.native
  def UpdateLink(Name: String): Unit = js.native
  def UpdateLink(Name: String, Type: XlLinkType): Unit = js.native
  
  var UpdateLinks: XlUpdateLinks = js.native
  
  var UpdateRemoteReferences: Boolean = js.native
  
  var UserControl: Boolean = js.native
  
  val UserStatus: SafeArray[_] = js.native
  
  val VBASigned: Boolean = js.native
  
  val VBProject: typings.activexVbide.VBIDE.VBProject = js.native
  
  val WebOptions: typings.activexExcel.Excel.WebOptions = js.native
  
  def WebPagePreview(): Unit = js.native
  
  def Windows(Index: String): Window = js.native
  def Windows(Index: Double): Window = js.native
  @JSName("Windows")
  val Windows_Original: Windows = js.native
  
  def Worksheets(Indexes: SafeArray[String | Double]): Sheets[Worksheet] = js.native
  def Worksheets(Index: String): Worksheet = js.native
  def Worksheets(Index: Double): Worksheet = js.native
  @JSName("Worksheets")
  val Worksheets_Original: Sheets[Worksheet] = js.native
  
  var WritePassword: String = js.native
  
  val WriteReserved: Boolean = js.native
  
  val WriteReservedBy: String = js.native
  
  def XmlImport(Url: String, ImportMap: XmlMap): XlXmlImportResult = js.native
  def XmlImport(Url: String, ImportMap: XmlMap, Overwrite: js.UndefOr[scala.Nothing], Destination: js.Any): XlXmlImportResult = js.native
  def XmlImport(Url: String, ImportMap: XmlMap, Overwrite: Boolean): XlXmlImportResult = js.native
  def XmlImport(Url: String, ImportMap: XmlMap, Overwrite: Boolean, Destination: js.Any): XlXmlImportResult = js.native
  
  def XmlImportXml(Data: String, ImportMap: XmlMap): XlXmlImportResult = js.native
  def XmlImportXml(Data: String, ImportMap: XmlMap, Overwrite: js.UndefOr[scala.Nothing], Destination: js.Any): XlXmlImportResult = js.native
  def XmlImportXml(Data: String, ImportMap: XmlMap, Overwrite: Boolean): XlXmlImportResult = js.native
  def XmlImportXml(Data: String, ImportMap: XmlMap, Overwrite: Boolean, Destination: js.Any): XlXmlImportResult = js.native
  
  def XmlMaps(Index: String): XmlMap = js.native
  def XmlMaps(Index: Double): XmlMap = js.native
  @JSName("XmlMaps")
  val XmlMaps_Original: XmlMaps = js.native
  
  def XmlNamespaces(Index: String): XmlNamespace = js.native
  def XmlNamespaces(Index: Double): XmlNamespace = js.native
  @JSName("XmlNamespaces")
  val XmlNamespaces_Original: XmlNamespaces = js.native
  
  var _CodeName: String = js.native
  
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
  def _Protect(Password: js.UndefOr[scala.Nothing], Structure: js.UndefOr[scala.Nothing], Windows: js.Any): Unit = js.native
  def _Protect(Password: js.UndefOr[scala.Nothing], Structure: js.Any): Unit = js.native
  def _Protect(Password: js.UndefOr[scala.Nothing], Structure: js.Any, Windows: js.Any): Unit = js.native
  def _Protect(Password: js.Any): Unit = js.native
  def _Protect(Password: js.Any, Structure: js.UndefOr[scala.Nothing], Windows: js.Any): Unit = js.native
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
  
  val _ReadOnlyRecommended: Boolean = js.native
  
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
