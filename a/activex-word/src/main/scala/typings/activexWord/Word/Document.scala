package typings.activexWord.Word

import typings.activexOffice.Office.CommandBar
import typings.activexOffice.Office.CommandBars
import typings.activexOffice.Office.CustomXMLNode
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
import typings.activexOffice.Office.MsoEnvelope
import typings.activexOffice.Office.OfficeTheme
import typings.activexOffice.Office.Permission
import typings.activexOffice.Office.PolicyItem
import typings.activexOffice.Office.Script
import typings.activexOffice.Office.Scripts
import typings.activexOffice.Office.ServerPolicy
import typings.activexOffice.Office.Signature
import typings.activexOffice.Office.SignatureSet
import typings.activexOffice.Office.UserPermission
import typings.activexOffice.Office.WorkflowTasks
import typings.activexOffice.Office.WorkflowTemplates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Document extends StObject {
  
  def AcceptAllRevisions(): Unit = js.native
  
  def AcceptAllRevisionsShown(): Unit = js.native
  
  def Activate(): Unit = js.native
  
  val ActiveTheme: String = js.native
  
  val ActiveThemeDisplayName: String = js.native
  
  val ActiveWindow: Window = js.native
  
  def ActiveWritingStyle(LanguageID: Any): String = js.native
  
  def AddDocumentWorkspaceHeader(RichFormat: Boolean, Url: String, Title: String, Description: String, ID: String): Unit = js.native
  
  def AddMeetingWorkspaceHeader(SkipIfAbsent: Boolean, Url: String, Title: String, Description: String, ID: String): Unit = js.native
  
  def AddToFavorites(): Unit = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  def ApplyDocumentTheme(FileName: String): Unit = js.native
  
  def ApplyQuickStyleSet(Name: String): Unit = js.native
  
  def ApplyQuickStyleSet2(Style: Any): Unit = js.native
  
  def ApplyTheme(Name: String): Unit = js.native
  
  var AttachedTemplate: Template = js.native
  
  def AutoFormat(): Unit = js.native
  
  var AutoFormatOverride: Boolean = js.native
  
  var AutoHyphenation: Boolean = js.native
  
  def AutoSummarize(): Range = js.native
  def AutoSummarize(Length: Any): Range = js.native
  def AutoSummarize(Length: Any, Mode: Any): Range = js.native
  def AutoSummarize(Length: Any, Mode: Any, UpdateProperties: Any): Range = js.native
  def AutoSummarize(Length: Any, Mode: Unit, UpdateProperties: Any): Range = js.native
  def AutoSummarize(Length: Unit, Mode: Any): Range = js.native
  def AutoSummarize(Length: Unit, Mode: Any, UpdateProperties: Any): Range = js.native
  def AutoSummarize(Length: Unit, Mode: Unit, UpdateProperties: Any): Range = js.native
  
  var Background: Shape = js.native
  
  val Bibliography: typings.activexWord.Word.Bibliography = js.native
  
  val Bookmarks: typings.activexWord.Word.Bookmarks = js.native
  
  def BuiltInDocumentProperties(index: String): DocumentProperty[typings.activexWord.Word.Application] = js.native
  def BuiltInDocumentProperties(index: Double): DocumentProperty[typings.activexWord.Word.Application] = js.native
  @JSName("BuiltInDocumentProperties")
  val BuiltInDocumentProperties_Original: DocumentProperties[typings.activexWord.Word.Application] = js.native
  
  def CanCheckin(): Boolean = js.native
  
  val Characters: typings.activexWord.Word.Characters = js.native
  
  def CheckConsistency(): Unit = js.native
  
  def CheckGrammar(): Unit = js.native
  
  /**
    * @param boolean [SaveChanges=true]
    * @param boolean [MakePublic=false]
    */
  def CheckIn(): Unit = js.native
  def CheckIn(SaveChanges: Boolean): Unit = js.native
  def CheckIn(SaveChanges: Boolean, Comments: Any): Unit = js.native
  def CheckIn(SaveChanges: Boolean, Comments: Any, MakePublic: Boolean): Unit = js.native
  def CheckIn(SaveChanges: Boolean, Comments: Unit, MakePublic: Boolean): Unit = js.native
  def CheckIn(SaveChanges: Unit, Comments: Any): Unit = js.native
  def CheckIn(SaveChanges: Unit, Comments: Any, MakePublic: Boolean): Unit = js.native
  def CheckIn(SaveChanges: Unit, Comments: Unit, MakePublic: Boolean): Unit = js.native
  
  /**
    * @param boolean [SaveChanges=true]
    * @param boolean [MakePublic=false]
    */
  def CheckInWithVersion(): Unit = js.native
  def CheckInWithVersion(SaveChanges: Boolean): Unit = js.native
  def CheckInWithVersion(SaveChanges: Boolean, Comments: Any): Unit = js.native
  def CheckInWithVersion(SaveChanges: Boolean, Comments: Any, MakePublic: Boolean): Unit = js.native
  def CheckInWithVersion(SaveChanges: Boolean, Comments: Any, MakePublic: Boolean, VersionType: Any): Unit = js.native
  def CheckInWithVersion(SaveChanges: Boolean, Comments: Any, MakePublic: Unit, VersionType: Any): Unit = js.native
  def CheckInWithVersion(SaveChanges: Boolean, Comments: Unit, MakePublic: Boolean): Unit = js.native
  def CheckInWithVersion(SaveChanges: Boolean, Comments: Unit, MakePublic: Boolean, VersionType: Any): Unit = js.native
  def CheckInWithVersion(SaveChanges: Boolean, Comments: Unit, MakePublic: Unit, VersionType: Any): Unit = js.native
  def CheckInWithVersion(SaveChanges: Unit, Comments: Any): Unit = js.native
  def CheckInWithVersion(SaveChanges: Unit, Comments: Any, MakePublic: Boolean): Unit = js.native
  def CheckInWithVersion(SaveChanges: Unit, Comments: Any, MakePublic: Boolean, VersionType: Any): Unit = js.native
  def CheckInWithVersion(SaveChanges: Unit, Comments: Any, MakePublic: Unit, VersionType: Any): Unit = js.native
  def CheckInWithVersion(SaveChanges: Unit, Comments: Unit, MakePublic: Boolean): Unit = js.native
  def CheckInWithVersion(SaveChanges: Unit, Comments: Unit, MakePublic: Boolean, VersionType: Any): Unit = js.native
  def CheckInWithVersion(SaveChanges: Unit, Comments: Unit, MakePublic: Unit, VersionType: Any): Unit = js.native
  
  def CheckNewSmartTags(): Unit = js.native
  
  def CheckSpelling(
    CustomDictionary: js.UndefOr[Any],
    IgnoreUppercase: js.UndefOr[Any],
    AlwaysSuggest: js.UndefOr[Any],
    CustomDictionary2: js.UndefOr[Any],
    CustomDictionary3: js.UndefOr[Any],
    CustomDictionary4: js.UndefOr[Any],
    CustomDictionary5: js.UndefOr[Any],
    CustomDictionary6: js.UndefOr[Any],
    CustomDictionary7: js.UndefOr[Any],
    CustomDictionary8: js.UndefOr[Any],
    CustomDictionary9: js.UndefOr[Any],
    CustomDictionary10: js.UndefOr[Any]
  ): Unit = js.native
  
  val ChildNodeSuggestions: XMLChildNodeSuggestions = js.native
  
  var ClickAndTypeParagraphStyle: Any = js.native
  
  def Close(): Unit = js.native
  def Close(SaveChanges: Any): Unit = js.native
  def Close(SaveChanges: Any, OriginalFormat: Any): Unit = js.native
  def Close(SaveChanges: Any, OriginalFormat: Any, RouteDocument: Any): Unit = js.native
  def Close(SaveChanges: Any, OriginalFormat: Unit, RouteDocument: Any): Unit = js.native
  def Close(SaveChanges: Unit, OriginalFormat: Any): Unit = js.native
  def Close(SaveChanges: Unit, OriginalFormat: Any, RouteDocument: Any): Unit = js.native
  def Close(SaveChanges: Unit, OriginalFormat: Unit, RouteDocument: Any): Unit = js.native
  
  def ClosePrintPreview(): Unit = js.native
  
  val CoAuthoring: typings.activexWord.Word.CoAuthoring = js.native
  
  val CodeName: String = js.native
  
  def CommandBars(Index: String): CommandBar = js.native
  def CommandBars(Index: Double): CommandBar = js.native
  @JSName("CommandBars")
  val CommandBars_Original: CommandBars = js.native
  
  val Comments: typings.activexWord.Word.Comments = js.native
  
  def Compare(
    Name: String,
    AuthorName: js.UndefOr[Any],
    CompareTarget: js.UndefOr[Any],
    DetectFormatChanges: js.UndefOr[Any],
    IgnoreAllComparisonWarnings: js.UndefOr[Any],
    AddToRecentFiles: js.UndefOr[Any],
    RemovePersonalInformation: js.UndefOr[Any],
    RemoveDateAndTime: js.UndefOr[Any]
  ): Unit = js.native
  
  def Compare2000(Name: String): Unit = js.native
  
  def Compare2002(Name: String): Unit = js.native
  def Compare2002(Name: String, AuthorName: Any): Unit = js.native
  def Compare2002(Name: String, AuthorName: Any, CompareTarget: Any): Unit = js.native
  def Compare2002(Name: String, AuthorName: Any, CompareTarget: Any, DetectFormatChanges: Any): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: Any,
    CompareTarget: Any,
    DetectFormatChanges: Any,
    IgnoreAllComparisonWarnings: Any
  ): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: Any,
    CompareTarget: Any,
    DetectFormatChanges: Any,
    IgnoreAllComparisonWarnings: Any,
    AddToRecentFiles: Any
  ): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: Any,
    CompareTarget: Any,
    DetectFormatChanges: Any,
    IgnoreAllComparisonWarnings: Unit,
    AddToRecentFiles: Any
  ): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: Any,
    CompareTarget: Any,
    DetectFormatChanges: Unit,
    IgnoreAllComparisonWarnings: Any
  ): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: Any,
    CompareTarget: Any,
    DetectFormatChanges: Unit,
    IgnoreAllComparisonWarnings: Any,
    AddToRecentFiles: Any
  ): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: Any,
    CompareTarget: Any,
    DetectFormatChanges: Unit,
    IgnoreAllComparisonWarnings: Unit,
    AddToRecentFiles: Any
  ): Unit = js.native
  def Compare2002(Name: String, AuthorName: Any, CompareTarget: Unit, DetectFormatChanges: Any): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: Any,
    CompareTarget: Unit,
    DetectFormatChanges: Any,
    IgnoreAllComparisonWarnings: Any
  ): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: Any,
    CompareTarget: Unit,
    DetectFormatChanges: Any,
    IgnoreAllComparisonWarnings: Any,
    AddToRecentFiles: Any
  ): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: Any,
    CompareTarget: Unit,
    DetectFormatChanges: Any,
    IgnoreAllComparisonWarnings: Unit,
    AddToRecentFiles: Any
  ): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: Any,
    CompareTarget: Unit,
    DetectFormatChanges: Unit,
    IgnoreAllComparisonWarnings: Any
  ): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: Any,
    CompareTarget: Unit,
    DetectFormatChanges: Unit,
    IgnoreAllComparisonWarnings: Any,
    AddToRecentFiles: Any
  ): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: Any,
    CompareTarget: Unit,
    DetectFormatChanges: Unit,
    IgnoreAllComparisonWarnings: Unit,
    AddToRecentFiles: Any
  ): Unit = js.native
  def Compare2002(Name: String, AuthorName: Unit, CompareTarget: Any): Unit = js.native
  def Compare2002(Name: String, AuthorName: Unit, CompareTarget: Any, DetectFormatChanges: Any): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: Unit,
    CompareTarget: Any,
    DetectFormatChanges: Any,
    IgnoreAllComparisonWarnings: Any
  ): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: Unit,
    CompareTarget: Any,
    DetectFormatChanges: Any,
    IgnoreAllComparisonWarnings: Any,
    AddToRecentFiles: Any
  ): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: Unit,
    CompareTarget: Any,
    DetectFormatChanges: Any,
    IgnoreAllComparisonWarnings: Unit,
    AddToRecentFiles: Any
  ): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: Unit,
    CompareTarget: Any,
    DetectFormatChanges: Unit,
    IgnoreAllComparisonWarnings: Any
  ): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: Unit,
    CompareTarget: Any,
    DetectFormatChanges: Unit,
    IgnoreAllComparisonWarnings: Any,
    AddToRecentFiles: Any
  ): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: Unit,
    CompareTarget: Any,
    DetectFormatChanges: Unit,
    IgnoreAllComparisonWarnings: Unit,
    AddToRecentFiles: Any
  ): Unit = js.native
  def Compare2002(Name: String, AuthorName: Unit, CompareTarget: Unit, DetectFormatChanges: Any): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: Unit,
    CompareTarget: Unit,
    DetectFormatChanges: Any,
    IgnoreAllComparisonWarnings: Any
  ): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: Unit,
    CompareTarget: Unit,
    DetectFormatChanges: Any,
    IgnoreAllComparisonWarnings: Any,
    AddToRecentFiles: Any
  ): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: Unit,
    CompareTarget: Unit,
    DetectFormatChanges: Any,
    IgnoreAllComparisonWarnings: Unit,
    AddToRecentFiles: Any
  ): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: Unit,
    CompareTarget: Unit,
    DetectFormatChanges: Unit,
    IgnoreAllComparisonWarnings: Any
  ): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: Unit,
    CompareTarget: Unit,
    DetectFormatChanges: Unit,
    IgnoreAllComparisonWarnings: Any,
    AddToRecentFiles: Any
  ): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: Unit,
    CompareTarget: Unit,
    DetectFormatChanges: Unit,
    IgnoreAllComparisonWarnings: Unit,
    AddToRecentFiles: Any
  ): Unit = js.native
  
  def Compatibility(Type: WdCompatibility): Boolean = js.native
  
  val CompatibilityMode: Double = js.native
  
  def ComputeStatistics(Statistic: WdStatistic): Double = js.native
  def ComputeStatistics(Statistic: WdStatistic, IncludeFootnotesAndEndnotes: Any): Double = js.native
  
  var ConsecutiveHyphensLimit: Double = js.native
  
  val Container: Any = js.native
  
  val Content: Range = js.native
  
  val ContentControls: typings.activexWord.Word.ContentControls = js.native
  
  def ContentTypeProperties(Index: String): MetaProperty = js.native
  def ContentTypeProperties(Index: Double): MetaProperty = js.native
  @JSName("ContentTypeProperties")
  val ContentTypeProperties_Original: MetaProperties = js.native
  
  def Convert(): Unit = js.native
  
  def ConvertAutoHyphens(): Unit = js.native
  
  def ConvertNumbersToText(): Unit = js.native
  def ConvertNumbersToText(NumberType: Any): Unit = js.native
  
  def ConvertVietDoc(CodePageOrigin: Double): Unit = js.native
  
  def CopyStylesFromTemplate(Template: String): Unit = js.native
  
  def CountNumberedItems(): Double = js.native
  def CountNumberedItems(NumberType: Any): Double = js.native
  def CountNumberedItems(NumberType: Any, Level: Any): Double = js.native
  def CountNumberedItems(NumberType: Unit, Level: Any): Double = js.native
  
  def CreateLetterContent(
    DateFormat: String,
    IncludeHeaderFooter: Boolean,
    PageDesign: String,
    LetterStyle: WdLetterStyle,
    Letterhead: Boolean,
    LetterheadLocation: WdLetterheadLocation,
    LetterheadSize: Double,
    RecipientName: String,
    RecipientAddress: String,
    Salutation: String,
    SalutationType: WdSalutationType,
    RecipientReference: String,
    MailingInstructions: String,
    AttentionLine: String,
    Subject: String,
    CCList: String,
    ReturnAddress: String,
    SenderName: String,
    Closing: String,
    SenderCompany: String,
    SenderJobTitle: String,
    SenderInitials: String,
    EnclosureNumber: Double,
    InfoBlock: js.UndefOr[Any],
    RecipientCode: js.UndefOr[Any],
    RecipientGender: js.UndefOr[Any],
    ReturnAddressShortForm: js.UndefOr[Any],
    SenderCity: js.UndefOr[Any],
    SenderCode: js.UndefOr[Any],
    SenderGender: js.UndefOr[Any],
    SenderReference: js.UndefOr[Any]
  ): LetterContent = js.native
  
  val Creator: Double = js.native
  
  val CurrentRsid: Double = js.native
  
  def CustomDocumentProperties(index: String): DocumentProperty[typings.activexWord.Word.Application] = js.native
  def CustomDocumentProperties(index: Double): DocumentProperty[typings.activexWord.Word.Application] = js.native
  @JSName("CustomDocumentProperties")
  val CustomDocumentProperties_Original: DocumentProperties[typings.activexWord.Word.Application] = js.native
  
  def CustomXMLParts(Index: String): CustomXMLPart = js.native
  def CustomXMLParts(Index: Double): CustomXMLPart = js.native
  @JSName("CustomXMLParts")
  val CustomXMLParts_Original: CustomXMLParts = js.native
  
  def DataForm(): Unit = js.native
  
  var DefaultTabStop: Double = js.native
  
  val DefaultTableStyle: Any = js.native
  
  var DefaultTargetFrame: String = js.native
  
  def DeleteAllComments(): Unit = js.native
  
  def DeleteAllCommentsShown(): Unit = js.native
  
  def DeleteAllEditableRanges(): Unit = js.native
  def DeleteAllEditableRanges(EditorID: Any): Unit = js.native
  
  def DeleteAllInkAnnotations(): Unit = js.native
  
  def DetectLanguage(): Unit = js.native
  
  var DisableFeatures: Boolean = js.native
  
  var DisableFeaturesIntroducedAfter: WdDisableFeaturesIntroducedAfter = js.native
  
  var DoNotEmbedSystemFonts: Boolean = js.native
  
  val DocID: Double = js.native
  
  def DocumentInspectors(Index: Double): DocumentInspector = js.native
  @JSName("DocumentInspectors")
  val DocumentInspectors_Original: DocumentInspectors = js.native
  
  def DocumentLibraryVersions(lIndex: Double): DocumentLibraryVersion = js.native
  @JSName("DocumentLibraryVersions")
  val DocumentLibraryVersions_Original: DocumentLibraryVersions = js.native
  
  val DocumentTheme: OfficeTheme = js.native
  
  def DowngradeDocument(): Unit = js.native
  
  val Dummy1: Unit = js.native
  
  def Dummy2(): Unit = js.native
  
  val Dummy3: Unit = js.native
  
  def Dummy4(): Unit = js.native
  
  def EditionOptions(Type: WdEditionType, Option: WdEditionOption, Name: String): Unit = js.native
  def EditionOptions(Type: WdEditionType, Option: WdEditionOption, Name: String, Format: Any): Unit = js.native
  
  val Email: typings.activexWord.Word.Email = js.native
  
  var EmbedLinguisticData: Boolean = js.native
  
  var EmbedSmartTags: Boolean = js.native
  
  var EmbedTrueTypeFonts: Boolean = js.native
  
  var EncryptionProvider: String = js.native
  
  def EndReview(): Unit = js.native
  
  val Endnotes: typings.activexWord.Word.Endnotes = js.native
  
  var EnforceStyle: Boolean = js.native
  
  val Envelope: typings.activexWord.Word.Envelope = js.native
  
  /**
    * @param boolean [OpenAfterExport=false]
    * @param Word.WdExportOptimizeFor [OptimizeFor=0]
    * @param Word.WdExportRange [Range=0]
    * @param number [From=1]
    * @param number [To=1]
    * @param Word.WdExportItem [Item=0]
    * @param boolean [IncludeDocProps=false]
    * @param boolean [KeepIRM=true]
    * @param Word.WdExportCreateBookmarks [CreateBookmarks=0]
    * @param boolean [DocStructureTags=true]
    * @param boolean [BitmapMissingFonts=true]
    * @param boolean [UseISO19005_1=false]
    */
  def ExportAsFixedFormat(
    OutputFileName: String,
    ExportFormat: WdExportFormat,
    OpenAfterExport: js.UndefOr[Boolean],
    OptimizeFor: js.UndefOr[WdExportOptimizeFor],
    Range: js.UndefOr[WdExportRange],
    From: js.UndefOr[Double],
    To: js.UndefOr[Double],
    Item: js.UndefOr[WdExportItem],
    IncludeDocProps: js.UndefOr[Boolean],
    KeepIRM: js.UndefOr[Boolean],
    CreateBookmarks: js.UndefOr[WdExportCreateBookmarks],
    DocStructureTags: js.UndefOr[Boolean],
    BitmapMissingFonts: js.UndefOr[Boolean],
    UseISO19005_1: js.UndefOr[Boolean],
    FixedFormatExtClassPtr: js.UndefOr[Any]
  ): Unit = js.native
  
  var FarEastLineBreakLanguage: WdFarEastLineBreakLanguageID = js.native
  
  var FarEastLineBreakLevel: WdFarEastLineBreakLevel = js.native
  
  val Fields: typings.activexWord.Word.Fields = js.native
  
  var Final: Boolean = js.native
  
  def FitToPages(): Unit = js.native
  
  def FollowHyperlink(
    Address: js.UndefOr[Any],
    SubAddress: js.UndefOr[Any],
    NewWindow: js.UndefOr[Any],
    AddHistory: js.UndefOr[Any],
    ExtraInfo: js.UndefOr[Any],
    Method: js.UndefOr[Any],
    HeaderInfo: js.UndefOr[Any]
  ): Unit = js.native
  
  val Footnotes: typings.activexWord.Word.Footnotes = js.native
  
  val FormFields: typings.activexWord.Word.FormFields = js.native
  
  var FormattingShowClear: Boolean = js.native
  
  var FormattingShowFilter: WdShowFilter = js.native
  
  var FormattingShowFont: Boolean = js.native
  
  var FormattingShowNextLevel: Boolean = js.native
  
  var FormattingShowNumbering: Boolean = js.native
  
  var FormattingShowParagraph: Boolean = js.native
  
  var FormattingShowUserStyleName: Boolean = js.native
  
  val FormsDesign: Boolean = js.native
  
  def ForwardMailer(): Unit = js.native
  
  val Frames: typings.activexWord.Word.Frames = js.native
  
  val Frameset: typings.activexWord.Word.Frameset = js.native
  
  def FreezeLayout(): Unit = js.native
  
  val FullName: String = js.native
  
  def GetCrossReferenceItems(ReferenceType: Any): Any = js.native
  
  def GetLetterContent(): LetterContent = js.native
  
  def GetWorkflowTasks(): WorkflowTasks = js.native
  
  def GetWorkflowTemplates(): WorkflowTemplates = js.native
  
  def GoTo(): Range = js.native
  def GoTo(What: Any): Range = js.native
  def GoTo(What: Any, Which: Any): Range = js.native
  def GoTo(What: Any, Which: Any, Count: Any): Range = js.native
  def GoTo(What: Any, Which: Any, Count: Any, Name: Any): Range = js.native
  def GoTo(What: Any, Which: Any, Count: Unit, Name: Any): Range = js.native
  def GoTo(What: Any, Which: Unit, Count: Any): Range = js.native
  def GoTo(What: Any, Which: Unit, Count: Any, Name: Any): Range = js.native
  def GoTo(What: Any, Which: Unit, Count: Unit, Name: Any): Range = js.native
  def GoTo(What: Unit, Which: Any): Range = js.native
  def GoTo(What: Unit, Which: Any, Count: Any): Range = js.native
  def GoTo(What: Unit, Which: Any, Count: Any, Name: Any): Range = js.native
  def GoTo(What: Unit, Which: Any, Count: Unit, Name: Any): Range = js.native
  def GoTo(What: Unit, Which: Unit, Count: Any): Range = js.native
  def GoTo(What: Unit, Which: Unit, Count: Any, Name: Any): Range = js.native
  def GoTo(What: Unit, Which: Unit, Count: Unit, Name: Any): Range = js.native
  
  var GrammarChecked: Boolean = js.native
  
  val GrammaticalErrors: ProofreadingErrors = js.native
  
  var GridDistanceHorizontal: Double = js.native
  
  var GridDistanceVertical: Double = js.native
  
  var GridOriginFromMargin: Boolean = js.native
  
  var GridOriginHorizontal: Double = js.native
  
  var GridOriginVertical: Double = js.native
  
  var GridSpaceBetweenHorizontalLines: Double = js.native
  
  var GridSpaceBetweenVerticalLines: Double = js.native
  
  val HTMLDivisions: typings.activexWord.Word.HTMLDivisions = js.native
  
  val HTMLProject: typings.activexOffice.Office.HTMLProject = js.native
  
  var HasMailer: Boolean = js.native
  
  val HasPassword: Boolean = js.native
  
  var HasRoutingSlip: Boolean = js.native
  
  val HasVBProject: Boolean = js.native
  
  val Hyperlinks: typings.activexWord.Word.Hyperlinks = js.native
  
  var HyphenateCaps: Boolean = js.native
  
  var HyphenationZone: Double = js.native
  
  val Indexes: typings.activexWord.Word.Indexes = js.native
  
  val InlineShapes: typings.activexWord.Word.InlineShapes = js.native
  
  val IsMasterDocument: Boolean = js.native
  
  val IsSubdocument: Boolean = js.native
  
  var JustificationMode: WdJustificationMode = js.native
  
  var KerningByAlgorithm: Boolean = js.native
  
  var Kind: WdDocumentKind = js.native
  
  var LanguageDetected: Boolean = js.native
  
  val ListParagraphs: typings.activexWord.Word.ListParagraphs = js.native
  
  val ListTemplates: typings.activexWord.Word.ListTemplates = js.native
  
  val Lists: typings.activexWord.Word.Lists = js.native
  
  var LockQuickStyleSet: Boolean = js.native
  
  def LockServerFile(): Unit = js.native
  
  var LockTheme: Boolean = js.native
  
  val MailEnvelope: MsoEnvelope = js.native
  
  val MailMerge: typings.activexWord.Word.MailMerge = js.native
  
  val Mailer: typings.activexWord.Word.Mailer = js.native
  
  def MakeCompatibilityDefault(): Unit = js.native
  
  def ManualHyphenation(): Unit = js.native
  
  def Merge(FileName: String): Unit = js.native
  def Merge(FileName: String, MergeTarget: Any): Unit = js.native
  def Merge(FileName: String, MergeTarget: Any, DetectFormatChanges: Any): Unit = js.native
  def Merge(FileName: String, MergeTarget: Any, DetectFormatChanges: Any, UseFormattingFrom: Any): Unit = js.native
  def Merge(
    FileName: String,
    MergeTarget: Any,
    DetectFormatChanges: Any,
    UseFormattingFrom: Any,
    AddToRecentFiles: Any
  ): Unit = js.native
  def Merge(
    FileName: String,
    MergeTarget: Any,
    DetectFormatChanges: Any,
    UseFormattingFrom: Unit,
    AddToRecentFiles: Any
  ): Unit = js.native
  def Merge(FileName: String, MergeTarget: Any, DetectFormatChanges: Unit, UseFormattingFrom: Any): Unit = js.native
  def Merge(
    FileName: String,
    MergeTarget: Any,
    DetectFormatChanges: Unit,
    UseFormattingFrom: Any,
    AddToRecentFiles: Any
  ): Unit = js.native
  def Merge(
    FileName: String,
    MergeTarget: Any,
    DetectFormatChanges: Unit,
    UseFormattingFrom: Unit,
    AddToRecentFiles: Any
  ): Unit = js.native
  def Merge(FileName: String, MergeTarget: Unit, DetectFormatChanges: Any): Unit = js.native
  def Merge(FileName: String, MergeTarget: Unit, DetectFormatChanges: Any, UseFormattingFrom: Any): Unit = js.native
  def Merge(
    FileName: String,
    MergeTarget: Unit,
    DetectFormatChanges: Any,
    UseFormattingFrom: Any,
    AddToRecentFiles: Any
  ): Unit = js.native
  def Merge(
    FileName: String,
    MergeTarget: Unit,
    DetectFormatChanges: Any,
    UseFormattingFrom: Unit,
    AddToRecentFiles: Any
  ): Unit = js.native
  def Merge(FileName: String, MergeTarget: Unit, DetectFormatChanges: Unit, UseFormattingFrom: Any): Unit = js.native
  def Merge(
    FileName: String,
    MergeTarget: Unit,
    DetectFormatChanges: Unit,
    UseFormattingFrom: Any,
    AddToRecentFiles: Any
  ): Unit = js.native
  def Merge(
    FileName: String,
    MergeTarget: Unit,
    DetectFormatChanges: Unit,
    UseFormattingFrom: Unit,
    AddToRecentFiles: Any
  ): Unit = js.native
  
  def Merge2000(FileName: String): Unit = js.native
  
  val Name: String = js.native
  
  var NoLineBreakAfter: String = js.native
  
  var NoLineBreakBefore: String = js.native
  
  var OMathBreakBin: WdOMathBreakBin = js.native
  
  var OMathBreakSub: WdOMathBreakSub = js.native
  
  var OMathFontName: String = js.native
  
  var OMathIntSubSupLim: Boolean = js.native
  
  var OMathJc: WdOMathJc = js.native
  
  var OMathLeftMargin: Double = js.native
  
  var OMathNarySupSubLim: Boolean = js.native
  
  var OMathRightMargin: Double = js.native
  
  var OMathSmallFrac: Boolean = js.native
  
  var OMathWrap: Double = js.native
  
  val OMaths: typings.activexWord.Word.OMaths = js.native
  
  val OpenEncoding: MsoEncoding = js.native
  
  var OptimizeForWord97: Boolean = js.native
  
  val OriginalDocumentTitle: String = js.native
  
  var PageSetup: typings.activexWord.Word.PageSetup = js.native
  
  val Paragraphs: typings.activexWord.Word.Paragraphs = js.native
  
  val Parent: Any = js.native
  
  val Password: String = js.native
  
  val PasswordEncryptionAlgorithm: String = js.native
  
  val PasswordEncryptionFileProperties: Boolean = js.native
  
  val PasswordEncryptionKeyLength: Double = js.native
  
  val PasswordEncryptionProvider: String = js.native
  
  val Path: String = js.native
  
  def Permission(Index: Any): UserPermission = js.native
  @JSName("Permission")
  val Permission_Original: Permission = js.native
  
  def Post(): Unit = js.native
  
  def PresentIt(): Unit = js.native
  
  var PrintFormsData: Boolean = js.native
  
  var PrintFractionalWidths: Boolean = js.native
  
  def PrintOut(
    Background: js.UndefOr[Any],
    Append: js.UndefOr[Any],
    Range: js.UndefOr[Any],
    OutputFileName: js.UndefOr[Any],
    From: js.UndefOr[Any],
    To: js.UndefOr[Any],
    Item: js.UndefOr[Any],
    Copies: js.UndefOr[Any],
    Pages: js.UndefOr[Any],
    PageType: js.UndefOr[Any],
    PrintToFile: js.UndefOr[Any],
    Collate: js.UndefOr[Any],
    ActivePrinterMacGX: js.UndefOr[Any],
    ManualDuplexPrint: js.UndefOr[Any],
    PrintZoomColumn: js.UndefOr[Any],
    PrintZoomRow: js.UndefOr[Any],
    PrintZoomPaperWidth: js.UndefOr[Any],
    PrintZoomPaperHeight: js.UndefOr[Any]
  ): Unit = js.native
  
  def PrintOut2000(
    Background: js.UndefOr[Any],
    Append: js.UndefOr[Any],
    Range: js.UndefOr[Any],
    OutputFileName: js.UndefOr[Any],
    From: js.UndefOr[Any],
    To: js.UndefOr[Any],
    Item: js.UndefOr[Any],
    Copies: js.UndefOr[Any],
    Pages: js.UndefOr[Any],
    PageType: js.UndefOr[Any],
    PrintToFile: js.UndefOr[Any],
    Collate: js.UndefOr[Any],
    ActivePrinterMacGX: js.UndefOr[Any],
    ManualDuplexPrint: js.UndefOr[Any],
    PrintZoomColumn: js.UndefOr[Any],
    PrintZoomRow: js.UndefOr[Any],
    PrintZoomPaperWidth: js.UndefOr[Any],
    PrintZoomPaperHeight: js.UndefOr[Any]
  ): Unit = js.native
  
  def PrintOutOld(
    Background: js.UndefOr[Any],
    Append: js.UndefOr[Any],
    Range: js.UndefOr[Any],
    OutputFileName: js.UndefOr[Any],
    From: js.UndefOr[Any],
    To: js.UndefOr[Any],
    Item: js.UndefOr[Any],
    Copies: js.UndefOr[Any],
    Pages: js.UndefOr[Any],
    PageType: js.UndefOr[Any],
    PrintToFile: js.UndefOr[Any],
    Collate: js.UndefOr[Any],
    ActivePrinterMacGX: js.UndefOr[Any],
    ManualDuplexPrint: js.UndefOr[Any]
  ): Unit = js.native
  
  var PrintPostScriptOverText: Boolean = js.native
  
  def PrintPreview(): Unit = js.native
  
  var PrintRevisions: Boolean = js.native
  
  def Protect(Type: WdProtectionType): Unit = js.native
  def Protect(Type: WdProtectionType, NoReset: Any): Unit = js.native
  def Protect(Type: WdProtectionType, NoReset: Any, Password: Any): Unit = js.native
  def Protect(Type: WdProtectionType, NoReset: Any, Password: Any, UseIRM: Any): Unit = js.native
  def Protect(Type: WdProtectionType, NoReset: Any, Password: Any, UseIRM: Any, EnforceStyleLock: Any): Unit = js.native
  def Protect(Type: WdProtectionType, NoReset: Any, Password: Any, UseIRM: Unit, EnforceStyleLock: Any): Unit = js.native
  def Protect(Type: WdProtectionType, NoReset: Any, Password: Unit, UseIRM: Any): Unit = js.native
  def Protect(Type: WdProtectionType, NoReset: Any, Password: Unit, UseIRM: Any, EnforceStyleLock: Any): Unit = js.native
  def Protect(Type: WdProtectionType, NoReset: Any, Password: Unit, UseIRM: Unit, EnforceStyleLock: Any): Unit = js.native
  def Protect(Type: WdProtectionType, NoReset: Unit, Password: Any): Unit = js.native
  def Protect(Type: WdProtectionType, NoReset: Unit, Password: Any, UseIRM: Any): Unit = js.native
  def Protect(Type: WdProtectionType, NoReset: Unit, Password: Any, UseIRM: Any, EnforceStyleLock: Any): Unit = js.native
  def Protect(Type: WdProtectionType, NoReset: Unit, Password: Any, UseIRM: Unit, EnforceStyleLock: Any): Unit = js.native
  def Protect(Type: WdProtectionType, NoReset: Unit, Password: Unit, UseIRM: Any): Unit = js.native
  def Protect(Type: WdProtectionType, NoReset: Unit, Password: Unit, UseIRM: Any, EnforceStyleLock: Any): Unit = js.native
  def Protect(Type: WdProtectionType, NoReset: Unit, Password: Unit, UseIRM: Unit, EnforceStyleLock: Any): Unit = js.native
  
  def Protect2002(Type: WdProtectionType): Unit = js.native
  def Protect2002(Type: WdProtectionType, NoReset: Any): Unit = js.native
  def Protect2002(Type: WdProtectionType, NoReset: Any, Password: Any): Unit = js.native
  def Protect2002(Type: WdProtectionType, NoReset: Unit, Password: Any): Unit = js.native
  
  val ProtectionType: WdProtectionType = js.native
  
  def Range(): typings.activexWord.Word.Range = js.native
  def Range(Start: Double): typings.activexWord.Word.Range = js.native
  def Range(Start: Double, End: Double): typings.activexWord.Word.Range = js.native
  def Range(Start: Unit, End: Double): typings.activexWord.Word.Range = js.native
  
  val ReadOnly: Boolean = js.native
  
  var ReadOnlyRecommended: Boolean = js.native
  
  val ReadabilityStatistics: typings.activexWord.Word.ReadabilityStatistics = js.native
  
  var ReadingLayoutSizeX: Double = js.native
  
  var ReadingLayoutSizeY: Double = js.native
  
  var ReadingModeLayoutFrozen: Boolean = js.native
  
  def RecheckSmartTags(): Unit = js.native
  
  def Redo(): Boolean = js.native
  def Redo(Times: Any): Boolean = js.native
  
  def RejectAllRevisions(): Unit = js.native
  
  def RejectAllRevisionsShown(): Unit = js.native
  
  def Reload(): Unit = js.native
  
  def ReloadAs(Encoding: MsoEncoding): Unit = js.native
  
  var RemoveDateAndTime: Boolean = js.native
  
  def RemoveDocumentInformation(RemoveDocInfoType: WdRemoveDocInfoType): Unit = js.native
  
  def RemoveDocumentWorkspaceHeader(ID: String): Unit = js.native
  
  def RemoveLockedStyles(): Unit = js.native
  
  def RemoveNumbers(): Unit = js.native
  def RemoveNumbers(NumberType: Any): Unit = js.native
  
  var RemovePersonalInformation: Boolean = js.native
  
  def RemoveSmartTags(): Unit = js.native
  
  def RemoveTheme(): Unit = js.native
  
  def Repaginate(): Unit = js.native
  
  def Reply(): Unit = js.native
  
  def ReplyAll(): Unit = js.native
  
  def ReplyWithChanges(): Unit = js.native
  def ReplyWithChanges(ShowMessage: Any): Unit = js.native
  
  val Research: typings.activexWord.Word.Research = js.native
  
  def ResetFormFields(): Unit = js.native
  
  val RevisedDocumentTitle: String = js.native
  
  val Revisions: typings.activexWord.Word.Revisions = js.native
  
  def Route(): Unit = js.native
  
  val Routed: Boolean = js.native
  
  val RoutingSlip: typings.activexWord.Word.RoutingSlip = js.native
  
  def RunAutoMacro(Which: WdAutoMacros): Unit = js.native
  
  def RunLetterWizard(): Unit = js.native
  def RunLetterWizard(LetterContent: Any): Unit = js.native
  def RunLetterWizard(LetterContent: Any, WizardMode: Any): Unit = js.native
  def RunLetterWizard(LetterContent: Unit, WizardMode: Any): Unit = js.native
  
  def Save(): Unit = js.native
  
  def SaveAs(
    FileName: js.UndefOr[Any],
    FileFormat: js.UndefOr[Any],
    LockComments: js.UndefOr[Any],
    Password: js.UndefOr[Any],
    AddToRecentFiles: js.UndefOr[Any],
    WritePassword: js.UndefOr[Any],
    ReadOnlyRecommended: js.UndefOr[Any],
    EmbedTrueTypeFonts: js.UndefOr[Any],
    SaveNativePictureFormat: js.UndefOr[Any],
    SaveFormsData: js.UndefOr[Any],
    SaveAsAOCELetter: js.UndefOr[Any],
    Encoding: js.UndefOr[Any],
    InsertLineBreaks: js.UndefOr[Any],
    AllowSubstitutions: js.UndefOr[Any],
    LineEnding: js.UndefOr[Any],
    AddBiDiMarks: js.UndefOr[Any]
  ): Unit = js.native
  
  def SaveAs2(
    FileName: js.UndefOr[Any],
    FileFormat: js.UndefOr[Any],
    LockComments: js.UndefOr[Any],
    Password: js.UndefOr[Any],
    AddToRecentFiles: js.UndefOr[Any],
    WritePassword: js.UndefOr[Any],
    ReadOnlyRecommended: js.UndefOr[Any],
    EmbedTrueTypeFonts: js.UndefOr[Any],
    SaveNativePictureFormat: js.UndefOr[Any],
    SaveFormsData: js.UndefOr[Any],
    SaveAsAOCELetter: js.UndefOr[Any],
    Encoding: js.UndefOr[Any],
    InsertLineBreaks: js.UndefOr[Any],
    AllowSubstitutions: js.UndefOr[Any],
    LineEnding: js.UndefOr[Any],
    AddBiDiMarks: js.UndefOr[Any],
    CompatibilityMode: js.UndefOr[Any]
  ): Unit = js.native
  
  def SaveAs2000(
    FileName: js.UndefOr[Any],
    FileFormat: js.UndefOr[Any],
    LockComments: js.UndefOr[Any],
    Password: js.UndefOr[Any],
    AddToRecentFiles: js.UndefOr[Any],
    WritePassword: js.UndefOr[Any],
    ReadOnlyRecommended: js.UndefOr[Any],
    EmbedTrueTypeFonts: js.UndefOr[Any],
    SaveNativePictureFormat: js.UndefOr[Any],
    SaveFormsData: js.UndefOr[Any],
    SaveAsAOCELetter: js.UndefOr[Any]
  ): Unit = js.native
  
  def SaveAsQuickStyleSet(FileName: String): Unit = js.native
  
  var SaveEncoding: MsoEncoding = js.native
  
  val SaveFormat: Double = js.native
  
  var SaveFormsData: Boolean = js.native
  
  var SaveSubsetFonts: Boolean = js.native
  
  var Saved: Boolean = js.native
  
  def Scripts(Index: Any): Script = js.native
  @JSName("Scripts")
  val Scripts_Original: Scripts = js.native
  
  val Sections: typings.activexWord.Word.Sections = js.native
  
  def Select(): Unit = js.native
  
  def SelectAllEditableRanges(): Unit = js.native
  def SelectAllEditableRanges(EditorID: Any): Unit = js.native
  
  def SelectContentControlsByTag(Tag: String): typings.activexWord.Word.ContentControls = js.native
  
  def SelectContentControlsByTitle(Title: String): typings.activexWord.Word.ContentControls = js.native
  
  def SelectLinkedControls(Node: CustomXMLNode): typings.activexWord.Word.ContentControls = js.native
  
  /**
    * @param string [PrefixMapping='']
    * @param boolean [FastSearchSkippingTextNodes=true]
    */
  def SelectNodes(XPath: String): typings.activexWord.Word.XMLNodes = js.native
  def SelectNodes(XPath: String, PrefixMapping: String): typings.activexWord.Word.XMLNodes = js.native
  def SelectNodes(XPath: String, PrefixMapping: String, FastSearchSkippingTextNodes: Boolean): typings.activexWord.Word.XMLNodes = js.native
  def SelectNodes(XPath: String, PrefixMapping: Unit, FastSearchSkippingTextNodes: Boolean): typings.activexWord.Word.XMLNodes = js.native
  
  /**
    * @param string [PrefixMapping='']
    * @param boolean [FastSearchSkippingTextNodes=true]
    */
  def SelectSingleNode(XPath: String): XMLNode = js.native
  def SelectSingleNode(XPath: String, PrefixMapping: String): XMLNode = js.native
  def SelectSingleNode(XPath: String, PrefixMapping: String, FastSearchSkippingTextNodes: Boolean): XMLNode = js.native
  def SelectSingleNode(XPath: String, PrefixMapping: Unit, FastSearchSkippingTextNodes: Boolean): XMLNode = js.native
  
  /** @param Office.CustomXMLPart [Stream=0] */
  def SelectUnlinkedControls(): typings.activexWord.Word.ContentControls = js.native
  def SelectUnlinkedControls(Stream: CustomXMLPart): typings.activexWord.Word.ContentControls = js.native
  
  def SendFax(Address: String): Unit = js.native
  def SendFax(Address: String, Subject: Any): Unit = js.native
  
  def SendFaxOverInternet(): Unit = js.native
  def SendFaxOverInternet(Recipients: Any): Unit = js.native
  def SendFaxOverInternet(Recipients: Any, Subject: Any): Unit = js.native
  def SendFaxOverInternet(Recipients: Any, Subject: Any, ShowMessage: Any): Unit = js.native
  def SendFaxOverInternet(Recipients: Any, Subject: Unit, ShowMessage: Any): Unit = js.native
  def SendFaxOverInternet(Recipients: Unit, Subject: Any): Unit = js.native
  def SendFaxOverInternet(Recipients: Unit, Subject: Any, ShowMessage: Any): Unit = js.native
  def SendFaxOverInternet(Recipients: Unit, Subject: Unit, ShowMessage: Any): Unit = js.native
  
  def SendForReview(): Unit = js.native
  def SendForReview(Recipients: Any): Unit = js.native
  def SendForReview(Recipients: Any, Subject: Any): Unit = js.native
  def SendForReview(Recipients: Any, Subject: Any, ShowMessage: Any): Unit = js.native
  def SendForReview(Recipients: Any, Subject: Any, ShowMessage: Any, IncludeAttachment: Any): Unit = js.native
  def SendForReview(Recipients: Any, Subject: Any, ShowMessage: Unit, IncludeAttachment: Any): Unit = js.native
  def SendForReview(Recipients: Any, Subject: Unit, ShowMessage: Any): Unit = js.native
  def SendForReview(Recipients: Any, Subject: Unit, ShowMessage: Any, IncludeAttachment: Any): Unit = js.native
  def SendForReview(Recipients: Any, Subject: Unit, ShowMessage: Unit, IncludeAttachment: Any): Unit = js.native
  def SendForReview(Recipients: Unit, Subject: Any): Unit = js.native
  def SendForReview(Recipients: Unit, Subject: Any, ShowMessage: Any): Unit = js.native
  def SendForReview(Recipients: Unit, Subject: Any, ShowMessage: Any, IncludeAttachment: Any): Unit = js.native
  def SendForReview(Recipients: Unit, Subject: Any, ShowMessage: Unit, IncludeAttachment: Any): Unit = js.native
  def SendForReview(Recipients: Unit, Subject: Unit, ShowMessage: Any): Unit = js.native
  def SendForReview(Recipients: Unit, Subject: Unit, ShowMessage: Any, IncludeAttachment: Any): Unit = js.native
  def SendForReview(Recipients: Unit, Subject: Unit, ShowMessage: Unit, IncludeAttachment: Any): Unit = js.native
  
  def SendMail(): Unit = js.native
  
  def SendMailer(): Unit = js.native
  def SendMailer(FileFormat: Any): Unit = js.native
  def SendMailer(FileFormat: Any, Priority: Any): Unit = js.native
  def SendMailer(FileFormat: Unit, Priority: Any): Unit = js.native
  
  val Sentences: typings.activexWord.Word.Sentences = js.native
  
  def ServerPolicy(Index: String): PolicyItem = js.native
  def ServerPolicy(Index: Double): PolicyItem = js.native
  @JSName("ServerPolicy")
  val ServerPolicy_Original: ServerPolicy = js.native
  
  def SetCompatibilityMode(Mode: Double): Unit = js.native
  
  def SetDefaultTableStyle(Style: Any, SetInTemplate: Boolean): Unit = js.native
  
  def SetLetterContent(LetterContent: Any): Unit = js.native
  
  def SetPasswordEncryptionOptions(
    PasswordEncryptionProvider: String,
    PasswordEncryptionAlgorithm: String,
    PasswordEncryptionKeyLength: Double
  ): Unit = js.native
  def SetPasswordEncryptionOptions(
    PasswordEncryptionProvider: String,
    PasswordEncryptionAlgorithm: String,
    PasswordEncryptionKeyLength: Double,
    PasswordEncryptionFileProperties: Any
  ): Unit = js.native
  
  val Shapes: typings.activexWord.Word.Shapes = js.native
  
  val SharedWorkspace: typings.activexOffice.Office.SharedWorkspace = js.native
  
  var ShowGrammaticalErrors: Boolean = js.native
  
  var ShowRevisions: Boolean = js.native
  
  var ShowSpellingErrors: Boolean = js.native
  
  var ShowSummary: Boolean = js.native
  
  def Signatures(iSig: Double): Signature = js.native
  @JSName("Signatures")
  val Signatures_Original: SignatureSet = js.native
  
  val SmartDocument: typings.activexOffice.Office.SmartDocument = js.native
  
  val SmartTags: typings.activexWord.Word.SmartTags = js.native
  
  var SmartTagsAsXMLProps: Boolean = js.native
  
  var SnapToGrid: Boolean = js.native
  
  var SnapToShapes: Boolean = js.native
  
  var SpellingChecked: Boolean = js.native
  
  val SpellingErrors: ProofreadingErrors = js.native
  
  val StoryRanges: typings.activexWord.Word.StoryRanges = js.native
  
  val StyleSheets: typings.activexWord.Word.StyleSheets = js.native
  
  var StyleSortMethod: WdStyleSort = js.native
  
  val Styles: typings.activexWord.Word.Styles = js.native
  
  val Subdocuments: typings.activexWord.Word.Subdocuments = js.native
  
  var SummaryLength: Double = js.native
  
  var SummaryViewMode: WdSummaryMode = js.native
  
  val Sync: typings.activexOffice.Office.Sync = js.native
  
  val Tables: typings.activexWord.Word.Tables = js.native
  
  val TablesOfAuthorities: typings.activexWord.Word.TablesOfAuthorities = js.native
  
  val TablesOfAuthoritiesCategories: typings.activexWord.Word.TablesOfAuthoritiesCategories = js.native
  
  val TablesOfContents: typings.activexWord.Word.TablesOfContents = js.native
  
  val TablesOfFigures: typings.activexWord.Word.TablesOfFigures = js.native
  
  var TextEncoding: MsoEncoding = js.native
  
  var TextLineEnding: WdLineEndingType = js.native
  
  def ToggleFormsDesign(): Unit = js.native
  
  var TrackFormatting: Boolean = js.native
  
  var TrackMoves: Boolean = js.native
  
  var TrackRevisions: Boolean = js.native
  
  /** @param boolean [DataOnly=true] */
  def TransformDocument(Path: String): Unit = js.native
  def TransformDocument(Path: String, DataOnly: Boolean): Unit = js.native
  
  val Type: WdDocumentType = js.native
  
  def Undo(): Boolean = js.native
  def Undo(Times: Any): Boolean = js.native
  
  def UndoClear(): Unit = js.native
  
  def UnfreezeLayout(): Unit = js.native
  
  def Unprotect(): Unit = js.native
  def Unprotect(Password: Any): Unit = js.native
  
  def UpdateStyles(): Unit = js.native
  
  var UpdateStylesOnOpen: Boolean = js.native
  
  def UpdateSummaryProperties(): Unit = js.native
  
  var UseMathDefaults: Boolean = js.native
  
  var UserControl: Boolean = js.native
  
  val VBASigned: Boolean = js.native
  
  val VBProject: typings.activexVbide.VBIDE.VBProject = js.native
  
  val Variables: typings.activexWord.Word.Variables = js.native
  
  val Versions: typings.activexWord.Word.Versions = js.native
  
  def ViewCode(): Unit = js.native
  
  def ViewPropertyBrowser(): Unit = js.native
  
  val WebOptions: typings.activexWord.Word.WebOptions = js.native
  
  def WebPagePreview(): Unit = js.native
  
  val Windows: typings.activexWord.Word.Windows = js.native
  
  /* private */ @JSName("Word.Document_typekey")
  var WordDotDocument_typekey: Document = js.native
  
  val WordOpenXML: String = js.native
  
  val Words: typings.activexWord.Word.Words = js.native
  
  val WritePassword: String = js.native
  
  val WriteReserved: Boolean = js.native
  
  var XMLHideNamespaces: Boolean = js.native
  
  val XMLNodes: typings.activexWord.Word.XMLNodes = js.native
  
  var XMLSaveDataOnly: Boolean = js.native
  
  var XMLSaveThroughXSLT: String = js.native
  
  val XMLSchemaReferences: typings.activexWord.Word.XMLSchemaReferences = js.native
  
  val XMLSchemaViolations: typings.activexWord.Word.XMLNodes = js.native
  
  var XMLShowAdvancedErrors: Boolean = js.native
  
  var XMLUseXSLTWhenSaving: Boolean = js.native
  
  var _CodeName: String = js.native
  
  def sblt(s: String): Unit = js.native
}
