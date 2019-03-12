package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Document")
@js.native
class Document protected () extends js.Object {
  val ActiveTheme: java.lang.String = js.native
  val ActiveThemeDisplayName: java.lang.String = js.native
  val ActiveWindow: Window = js.native
  val Application: activexDashWordLib.WordNs.Application = js.native
  var AttachedTemplate: Template = js.native
  var AutoFormatOverride: scala.Boolean = js.native
  var AutoHyphenation: scala.Boolean = js.native
  var Background: Shape = js.native
  val Bibliography: activexDashWordLib.WordNs.Bibliography = js.native
  val Bookmarks: activexDashWordLib.WordNs.Bookmarks = js.native
  @JSName("BuiltInDocumentProperties")
  val BuiltInDocumentProperties_Original: activexDashOfficeLib.OfficeNs.DocumentProperties[Application] = js.native
  val Characters: activexDashWordLib.WordNs.Characters = js.native
  val ChildNodeSuggestions: XMLChildNodeSuggestions = js.native
  var ClickAndTypeParagraphStyle: js.Any = js.native
  val CoAuthoring: activexDashWordLib.WordNs.CoAuthoring = js.native
  val CodeName: java.lang.String = js.native
  @JSName("CommandBars")
  val CommandBars_Original: activexDashOfficeLib.OfficeNs.CommandBars = js.native
  val Comments: activexDashWordLib.WordNs.Comments = js.native
  val CompatibilityMode: scala.Double = js.native
  var ConsecutiveHyphensLimit: scala.Double = js.native
  val Container: js.Any = js.native
  val Content: Range = js.native
  val ContentControls: activexDashWordLib.WordNs.ContentControls = js.native
  @JSName("ContentTypeProperties")
  val ContentTypeProperties_Original: activexDashOfficeLib.OfficeNs.MetaProperties = js.native
  val Creator: scala.Double = js.native
  val CurrentRsid: scala.Double = js.native
  @JSName("CustomDocumentProperties")
  val CustomDocumentProperties_Original: activexDashOfficeLib.OfficeNs.DocumentProperties[Application] = js.native
  @JSName("CustomXMLParts")
  val CustomXMLParts_Original: activexDashOfficeLib.OfficeNs.CustomXMLParts = js.native
  var DefaultTabStop: scala.Double = js.native
  val DefaultTableStyle: js.Any = js.native
  var DefaultTargetFrame: java.lang.String = js.native
  var DisableFeatures: scala.Boolean = js.native
  var DisableFeaturesIntroducedAfter: WdDisableFeaturesIntroducedAfter = js.native
  var DoNotEmbedSystemFonts: scala.Boolean = js.native
  val DocID: scala.Double = js.native
  @JSName("DocumentInspectors")
  val DocumentInspectors_Original: activexDashOfficeLib.OfficeNs.DocumentInspectors = js.native
  @JSName("DocumentLibraryVersions")
  val DocumentLibraryVersions_Original: activexDashOfficeLib.OfficeNs.DocumentLibraryVersions = js.native
  val DocumentTheme: activexDashOfficeLib.OfficeNs.OfficeTheme = js.native
  val Dummy1: js.UndefOr[scala.Nothing] = js.native
  val Dummy3: js.UndefOr[scala.Nothing] = js.native
  val Email: activexDashWordLib.WordNs.Email = js.native
  var EmbedLinguisticData: scala.Boolean = js.native
  var EmbedSmartTags: scala.Boolean = js.native
  var EmbedTrueTypeFonts: scala.Boolean = js.native
  var EncryptionProvider: java.lang.String = js.native
  val Endnotes: activexDashWordLib.WordNs.Endnotes = js.native
  var EnforceStyle: scala.Boolean = js.native
  val Envelope: activexDashWordLib.WordNs.Envelope = js.native
  var FarEastLineBreakLanguage: WdFarEastLineBreakLanguageID = js.native
  var FarEastLineBreakLevel: WdFarEastLineBreakLevel = js.native
  val Fields: activexDashWordLib.WordNs.Fields = js.native
  var Final: scala.Boolean = js.native
  val Footnotes: activexDashWordLib.WordNs.Footnotes = js.native
  val FormFields: activexDashWordLib.WordNs.FormFields = js.native
  var FormattingShowClear: scala.Boolean = js.native
  var FormattingShowFilter: WdShowFilter = js.native
  var FormattingShowFont: scala.Boolean = js.native
  var FormattingShowNextLevel: scala.Boolean = js.native
  var FormattingShowNumbering: scala.Boolean = js.native
  var FormattingShowParagraph: scala.Boolean = js.native
  var FormattingShowUserStyleName: scala.Boolean = js.native
  val FormsDesign: scala.Boolean = js.native
  val Frames: activexDashWordLib.WordNs.Frames = js.native
  val Frameset: activexDashWordLib.WordNs.Frameset = js.native
  val FullName: java.lang.String = js.native
  var GrammarChecked: scala.Boolean = js.native
  val GrammaticalErrors: ProofreadingErrors = js.native
  var GridDistanceHorizontal: scala.Double = js.native
  var GridDistanceVertical: scala.Double = js.native
  var GridOriginFromMargin: scala.Boolean = js.native
  var GridOriginHorizontal: scala.Double = js.native
  var GridOriginVertical: scala.Double = js.native
  var GridSpaceBetweenHorizontalLines: scala.Double = js.native
  var GridSpaceBetweenVerticalLines: scala.Double = js.native
  val HTMLDivisions: activexDashWordLib.WordNs.HTMLDivisions = js.native
  val HTMLProject: activexDashOfficeLib.OfficeNs.HTMLProject = js.native
  var HasMailer: scala.Boolean = js.native
  val HasPassword: scala.Boolean = js.native
  var HasRoutingSlip: scala.Boolean = js.native
  val HasVBProject: scala.Boolean = js.native
  val Hyperlinks: activexDashWordLib.WordNs.Hyperlinks = js.native
  var HyphenateCaps: scala.Boolean = js.native
  var HyphenationZone: scala.Double = js.native
  val Indexes: activexDashWordLib.WordNs.Indexes = js.native
  val InlineShapes: activexDashWordLib.WordNs.InlineShapes = js.native
  val IsMasterDocument: scala.Boolean = js.native
  val IsSubdocument: scala.Boolean = js.native
  var JustificationMode: WdJustificationMode = js.native
  var KerningByAlgorithm: scala.Boolean = js.native
  var Kind: WdDocumentKind = js.native
  var LanguageDetected: scala.Boolean = js.native
  val ListParagraphs: activexDashWordLib.WordNs.ListParagraphs = js.native
  val ListTemplates: activexDashWordLib.WordNs.ListTemplates = js.native
  val Lists: activexDashWordLib.WordNs.Lists = js.native
  var LockQuickStyleSet: scala.Boolean = js.native
  var LockTheme: scala.Boolean = js.native
  val MailEnvelope: activexDashOfficeLib.OfficeNs.MsoEnvelope = js.native
  val MailMerge: activexDashWordLib.WordNs.MailMerge = js.native
  val Mailer: activexDashWordLib.WordNs.Mailer = js.native
  val Name: java.lang.String = js.native
  var NoLineBreakAfter: java.lang.String = js.native
  var NoLineBreakBefore: java.lang.String = js.native
  var OMathBreakBin: WdOMathBreakBin = js.native
  var OMathBreakSub: WdOMathBreakSub = js.native
  var OMathFontName: java.lang.String = js.native
  var OMathIntSubSupLim: scala.Boolean = js.native
  var OMathJc: WdOMathJc = js.native
  var OMathLeftMargin: scala.Double = js.native
  var OMathNarySupSubLim: scala.Boolean = js.native
  var OMathRightMargin: scala.Double = js.native
  var OMathSmallFrac: scala.Boolean = js.native
  var OMathWrap: scala.Double = js.native
  val OMaths: activexDashWordLib.WordNs.OMaths = js.native
  val OpenEncoding: activexDashOfficeLib.OfficeNs.MsoEncoding = js.native
  var OptimizeForWord97: scala.Boolean = js.native
  val OriginalDocumentTitle: java.lang.String = js.native
  var PageSetup: activexDashWordLib.WordNs.PageSetup = js.native
  val Paragraphs: activexDashWordLib.WordNs.Paragraphs = js.native
  val Parent: js.Any = js.native
  val Password: java.lang.String = js.native
  val PasswordEncryptionAlgorithm: java.lang.String = js.native
  val PasswordEncryptionFileProperties: scala.Boolean = js.native
  val PasswordEncryptionKeyLength: scala.Double = js.native
  val PasswordEncryptionProvider: java.lang.String = js.native
  val Path: java.lang.String = js.native
  @JSName("Permission")
  val Permission_Original: activexDashOfficeLib.OfficeNs.Permission = js.native
  var PrintFormsData: scala.Boolean = js.native
  var PrintFractionalWidths: scala.Boolean = js.native
  var PrintPostScriptOverText: scala.Boolean = js.native
  var PrintRevisions: scala.Boolean = js.native
  val ProtectionType: WdProtectionType = js.native
  val ReadOnly: scala.Boolean = js.native
  var ReadOnlyRecommended: scala.Boolean = js.native
  val ReadabilityStatistics: activexDashWordLib.WordNs.ReadabilityStatistics = js.native
  var ReadingLayoutSizeX: scala.Double = js.native
  var ReadingLayoutSizeY: scala.Double = js.native
  var ReadingModeLayoutFrozen: scala.Boolean = js.native
  var RemoveDateAndTime: scala.Boolean = js.native
  var RemovePersonalInformation: scala.Boolean = js.native
  val Research: activexDashWordLib.WordNs.Research = js.native
  val RevisedDocumentTitle: java.lang.String = js.native
  val Revisions: activexDashWordLib.WordNs.Revisions = js.native
  val Routed: scala.Boolean = js.native
  val RoutingSlip: activexDashWordLib.WordNs.RoutingSlip = js.native
  var SaveEncoding: activexDashOfficeLib.OfficeNs.MsoEncoding = js.native
  val SaveFormat: scala.Double = js.native
  var SaveFormsData: scala.Boolean = js.native
  var SaveSubsetFonts: scala.Boolean = js.native
  var Saved: scala.Boolean = js.native
  @JSName("Scripts")
  val Scripts_Original: activexDashOfficeLib.OfficeNs.Scripts = js.native
  val Sections: activexDashWordLib.WordNs.Sections = js.native
  val Sentences: activexDashWordLib.WordNs.Sentences = js.native
  @JSName("ServerPolicy")
  val ServerPolicy_Original: activexDashOfficeLib.OfficeNs.ServerPolicy = js.native
  val Shapes: activexDashWordLib.WordNs.Shapes = js.native
  val SharedWorkspace: activexDashOfficeLib.OfficeNs.SharedWorkspace = js.native
  var ShowGrammaticalErrors: scala.Boolean = js.native
  var ShowRevisions: scala.Boolean = js.native
  var ShowSpellingErrors: scala.Boolean = js.native
  var ShowSummary: scala.Boolean = js.native
  @JSName("Signatures")
  val Signatures_Original: activexDashOfficeLib.OfficeNs.SignatureSet = js.native
  val SmartDocument: activexDashOfficeLib.OfficeNs.SmartDocument = js.native
  val SmartTags: activexDashWordLib.WordNs.SmartTags = js.native
  var SmartTagsAsXMLProps: scala.Boolean = js.native
  var SnapToGrid: scala.Boolean = js.native
  var SnapToShapes: scala.Boolean = js.native
  var SpellingChecked: scala.Boolean = js.native
  val SpellingErrors: ProofreadingErrors = js.native
  val StoryRanges: activexDashWordLib.WordNs.StoryRanges = js.native
  val StyleSheets: activexDashWordLib.WordNs.StyleSheets = js.native
  var StyleSortMethod: WdStyleSort = js.native
  val Styles: activexDashWordLib.WordNs.Styles = js.native
  val Subdocuments: activexDashWordLib.WordNs.Subdocuments = js.native
  var SummaryLength: scala.Double = js.native
  var SummaryViewMode: WdSummaryMode = js.native
  val Sync: activexDashOfficeLib.OfficeNs.Sync = js.native
  val Tables: activexDashWordLib.WordNs.Tables = js.native
  val TablesOfAuthorities: activexDashWordLib.WordNs.TablesOfAuthorities = js.native
  val TablesOfAuthoritiesCategories: activexDashWordLib.WordNs.TablesOfAuthoritiesCategories = js.native
  val TablesOfContents: activexDashWordLib.WordNs.TablesOfContents = js.native
  val TablesOfFigures: activexDashWordLib.WordNs.TablesOfFigures = js.native
  var TextEncoding: activexDashOfficeLib.OfficeNs.MsoEncoding = js.native
  var TextLineEnding: WdLineEndingType = js.native
  var TrackFormatting: scala.Boolean = js.native
  var TrackMoves: scala.Boolean = js.native
  var TrackRevisions: scala.Boolean = js.native
  val Type: WdDocumentType = js.native
  var UpdateStylesOnOpen: scala.Boolean = js.native
  var UseMathDefaults: scala.Boolean = js.native
  var UserControl: scala.Boolean = js.native
  val VBASigned: scala.Boolean = js.native
  val VBProject: activexDashVbideLib.VBIDENs.VBProject = js.native
  val Variables: activexDashWordLib.WordNs.Variables = js.native
  val Versions: activexDashWordLib.WordNs.Versions = js.native
  val WebOptions: activexDashWordLib.WordNs.WebOptions = js.native
  val Windows: activexDashWordLib.WordNs.Windows = js.native
  var `Word.Document_typekey`: Document = js.native
  val WordOpenXML: java.lang.String = js.native
  val Words: activexDashWordLib.WordNs.Words = js.native
  val WritePassword: java.lang.String = js.native
  val WriteReserved: scala.Boolean = js.native
  var XMLHideNamespaces: scala.Boolean = js.native
  val XMLNodes: activexDashWordLib.WordNs.XMLNodes = js.native
  var XMLSaveDataOnly: scala.Boolean = js.native
  var XMLSaveThroughXSLT: java.lang.String = js.native
  val XMLSchemaReferences: activexDashWordLib.WordNs.XMLSchemaReferences = js.native
  val XMLSchemaViolations: XMLNodes = js.native
  var XMLShowAdvancedErrors: scala.Boolean = js.native
  var XMLUseXSLTWhenSaving: scala.Boolean = js.native
  var _CodeName: java.lang.String = js.native
  def AcceptAllRevisions(): scala.Unit = js.native
  def AcceptAllRevisionsShown(): scala.Unit = js.native
  def Activate(): scala.Unit = js.native
  def ActiveWritingStyle(LanguageID: js.Any): java.lang.String = js.native
  def AddDocumentWorkspaceHeader(
    RichFormat: scala.Boolean,
    Url: java.lang.String,
    Title: java.lang.String,
    Description: java.lang.String,
    ID: java.lang.String
  ): scala.Unit = js.native
  def AddMeetingWorkspaceHeader(
    SkipIfAbsent: scala.Boolean,
    Url: java.lang.String,
    Title: java.lang.String,
    Description: java.lang.String,
    ID: java.lang.String
  ): scala.Unit = js.native
  def AddToFavorites(): scala.Unit = js.native
  def ApplyDocumentTheme(FileName: java.lang.String): scala.Unit = js.native
  def ApplyQuickStyleSet(Name: java.lang.String): scala.Unit = js.native
  def ApplyQuickStyleSet2(Style: js.Any): scala.Unit = js.native
  def ApplyTheme(Name: java.lang.String): scala.Unit = js.native
  def AutoFormat(): scala.Unit = js.native
  def AutoSummarize(): Range = js.native
  def AutoSummarize(Length: js.Any): Range = js.native
  def AutoSummarize(Length: js.Any, Mode: js.Any): Range = js.native
  def AutoSummarize(Length: js.Any, Mode: js.Any, UpdateProperties: js.Any): Range = js.native
  def BuiltInDocumentProperties(index: java.lang.String): activexDashOfficeLib.OfficeNs.DocumentProperty[Application] = js.native
  def BuiltInDocumentProperties(index: scala.Double): activexDashOfficeLib.OfficeNs.DocumentProperty[Application] = js.native
  def CanCheckin(): scala.Boolean = js.native
  def CheckConsistency(): scala.Unit = js.native
  def CheckGrammar(): scala.Unit = js.native
  /**
    * @param boolean [SaveChanges=true]
    * @param boolean [MakePublic=false]
    */
  def CheckIn(): scala.Unit = js.native
  def CheckIn(SaveChanges: scala.Boolean): scala.Unit = js.native
  def CheckIn(SaveChanges: scala.Boolean, Comments: js.Any): scala.Unit = js.native
  def CheckIn(SaveChanges: scala.Boolean, Comments: js.Any, MakePublic: scala.Boolean): scala.Unit = js.native
  /**
    * @param boolean [SaveChanges=true]
    * @param boolean [MakePublic=false]
    */
  def CheckInWithVersion(): scala.Unit = js.native
  def CheckInWithVersion(SaveChanges: scala.Boolean): scala.Unit = js.native
  def CheckInWithVersion(SaveChanges: scala.Boolean, Comments: js.Any): scala.Unit = js.native
  def CheckInWithVersion(SaveChanges: scala.Boolean, Comments: js.Any, MakePublic: scala.Boolean): scala.Unit = js.native
  def CheckInWithVersion(SaveChanges: scala.Boolean, Comments: js.Any, MakePublic: scala.Boolean, VersionType: js.Any): scala.Unit = js.native
  def CheckNewSmartTags(): scala.Unit = js.native
  def CheckSpelling(
    CustomDictionary: js.UndefOr[js.Any],
    IgnoreUppercase: js.UndefOr[js.Any],
    AlwaysSuggest: js.UndefOr[js.Any],
    CustomDictionary2: js.UndefOr[js.Any],
    CustomDictionary3: js.UndefOr[js.Any],
    CustomDictionary4: js.UndefOr[js.Any],
    CustomDictionary5: js.UndefOr[js.Any],
    CustomDictionary6: js.UndefOr[js.Any],
    CustomDictionary7: js.UndefOr[js.Any],
    CustomDictionary8: js.UndefOr[js.Any],
    CustomDictionary9: js.UndefOr[js.Any],
    CustomDictionary10: js.UndefOr[js.Any]
  ): scala.Unit = js.native
  def Close(): scala.Unit = js.native
  def Close(SaveChanges: js.Any): scala.Unit = js.native
  def Close(SaveChanges: js.Any, OriginalFormat: js.Any): scala.Unit = js.native
  def Close(SaveChanges: js.Any, OriginalFormat: js.Any, RouteDocument: js.Any): scala.Unit = js.native
  def ClosePrintPreview(): scala.Unit = js.native
  def CommandBars(Index: java.lang.String): activexDashOfficeLib.OfficeNs.CommandBar = js.native
  def CommandBars(Index: scala.Double): activexDashOfficeLib.OfficeNs.CommandBar = js.native
  def Compare(
    Name: java.lang.String,
    AuthorName: js.UndefOr[js.Any],
    CompareTarget: js.UndefOr[js.Any],
    DetectFormatChanges: js.UndefOr[js.Any],
    IgnoreAllComparisonWarnings: js.UndefOr[js.Any],
    AddToRecentFiles: js.UndefOr[js.Any],
    RemovePersonalInformation: js.UndefOr[js.Any],
    RemoveDateAndTime: js.UndefOr[js.Any]
  ): scala.Unit = js.native
  def Compare2000(Name: java.lang.String): scala.Unit = js.native
  def Compare2002(Name: java.lang.String): scala.Unit = js.native
  def Compare2002(Name: java.lang.String, AuthorName: js.Any): scala.Unit = js.native
  def Compare2002(Name: java.lang.String, AuthorName: js.Any, CompareTarget: js.Any): scala.Unit = js.native
  def Compare2002(Name: java.lang.String, AuthorName: js.Any, CompareTarget: js.Any, DetectFormatChanges: js.Any): scala.Unit = js.native
  def Compare2002(
    Name: java.lang.String,
    AuthorName: js.Any,
    CompareTarget: js.Any,
    DetectFormatChanges: js.Any,
    IgnoreAllComparisonWarnings: js.Any
  ): scala.Unit = js.native
  def Compare2002(
    Name: java.lang.String,
    AuthorName: js.Any,
    CompareTarget: js.Any,
    DetectFormatChanges: js.Any,
    IgnoreAllComparisonWarnings: js.Any,
    AddToRecentFiles: js.Any
  ): scala.Unit = js.native
  def Compatibility(Type: WdCompatibility): scala.Boolean = js.native
  def ComputeStatistics(Statistic: WdStatistic): scala.Double = js.native
  def ComputeStatistics(Statistic: WdStatistic, IncludeFootnotesAndEndnotes: js.Any): scala.Double = js.native
  def ContentTypeProperties(Index: java.lang.String): activexDashOfficeLib.OfficeNs.MetaProperty = js.native
  def ContentTypeProperties(Index: scala.Double): activexDashOfficeLib.OfficeNs.MetaProperty = js.native
  def Convert(): scala.Unit = js.native
  def ConvertAutoHyphens(): scala.Unit = js.native
  def ConvertNumbersToText(): scala.Unit = js.native
  def ConvertNumbersToText(NumberType: js.Any): scala.Unit = js.native
  def ConvertVietDoc(CodePageOrigin: scala.Double): scala.Unit = js.native
  def CopyStylesFromTemplate(Template: java.lang.String): scala.Unit = js.native
  def CountNumberedItems(): scala.Double = js.native
  def CountNumberedItems(NumberType: js.Any): scala.Double = js.native
  def CountNumberedItems(NumberType: js.Any, Level: js.Any): scala.Double = js.native
  def CreateLetterContent(
    DateFormat: java.lang.String,
    IncludeHeaderFooter: scala.Boolean,
    PageDesign: java.lang.String,
    LetterStyle: WdLetterStyle,
    Letterhead: scala.Boolean,
    LetterheadLocation: WdLetterheadLocation,
    LetterheadSize: scala.Double,
    RecipientName: java.lang.String,
    RecipientAddress: java.lang.String,
    Salutation: java.lang.String,
    SalutationType: WdSalutationType,
    RecipientReference: java.lang.String,
    MailingInstructions: java.lang.String,
    AttentionLine: java.lang.String,
    Subject: java.lang.String,
    CCList: java.lang.String,
    ReturnAddress: java.lang.String,
    SenderName: java.lang.String,
    Closing: java.lang.String,
    SenderCompany: java.lang.String,
    SenderJobTitle: java.lang.String,
    SenderInitials: java.lang.String,
    EnclosureNumber: scala.Double,
    InfoBlock: js.UndefOr[js.Any],
    RecipientCode: js.UndefOr[js.Any],
    RecipientGender: js.UndefOr[js.Any],
    ReturnAddressShortForm: js.UndefOr[js.Any],
    SenderCity: js.UndefOr[js.Any],
    SenderCode: js.UndefOr[js.Any],
    SenderGender: js.UndefOr[js.Any],
    SenderReference: js.UndefOr[js.Any]
  ): LetterContent = js.native
  def CustomDocumentProperties(index: java.lang.String): activexDashOfficeLib.OfficeNs.DocumentProperty[Application] = js.native
  def CustomDocumentProperties(index: scala.Double): activexDashOfficeLib.OfficeNs.DocumentProperty[Application] = js.native
  def CustomXMLParts(Index: java.lang.String): activexDashOfficeLib.OfficeNs.CustomXMLPart = js.native
  def CustomXMLParts(Index: scala.Double): activexDashOfficeLib.OfficeNs.CustomXMLPart = js.native
  def DataForm(): scala.Unit = js.native
  def DeleteAllComments(): scala.Unit = js.native
  def DeleteAllCommentsShown(): scala.Unit = js.native
  def DeleteAllEditableRanges(): scala.Unit = js.native
  def DeleteAllEditableRanges(EditorID: js.Any): scala.Unit = js.native
  def DeleteAllInkAnnotations(): scala.Unit = js.native
  def DetectLanguage(): scala.Unit = js.native
  def DocumentInspectors(Index: scala.Double): activexDashOfficeLib.OfficeNs.DocumentInspector = js.native
  def DocumentLibraryVersions(lIndex: scala.Double): activexDashOfficeLib.OfficeNs.DocumentLibraryVersion = js.native
  def DowngradeDocument(): scala.Unit = js.native
  def Dummy2(): scala.Unit = js.native
  def Dummy4(): scala.Unit = js.native
  def EditionOptions(Type: WdEditionType, Option: WdEditionOption, Name: java.lang.String): scala.Unit = js.native
  def EditionOptions(Type: WdEditionType, Option: WdEditionOption, Name: java.lang.String, Format: js.Any): scala.Unit = js.native
  def EndReview(): scala.Unit = js.native
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
    OutputFileName: java.lang.String,
    ExportFormat: WdExportFormat,
    OpenAfterExport: js.UndefOr[scala.Boolean],
    OptimizeFor: js.UndefOr[WdExportOptimizeFor],
    Range: js.UndefOr[WdExportRange],
    From: js.UndefOr[scala.Double],
    To: js.UndefOr[scala.Double],
    Item: js.UndefOr[WdExportItem],
    IncludeDocProps: js.UndefOr[scala.Boolean],
    KeepIRM: js.UndefOr[scala.Boolean],
    CreateBookmarks: js.UndefOr[WdExportCreateBookmarks],
    DocStructureTags: js.UndefOr[scala.Boolean],
    BitmapMissingFonts: js.UndefOr[scala.Boolean],
    UseISO19005_1: js.UndefOr[scala.Boolean],
    FixedFormatExtClassPtr: js.UndefOr[js.Any]
  ): scala.Unit = js.native
  def FitToPages(): scala.Unit = js.native
  def FollowHyperlink(
    Address: js.UndefOr[js.Any],
    SubAddress: js.UndefOr[js.Any],
    NewWindow: js.UndefOr[js.Any],
    AddHistory: js.UndefOr[js.Any],
    ExtraInfo: js.UndefOr[js.Any],
    Method: js.UndefOr[js.Any],
    HeaderInfo: js.UndefOr[js.Any]
  ): scala.Unit = js.native
  def ForwardMailer(): scala.Unit = js.native
  def FreezeLayout(): scala.Unit = js.native
  def GetCrossReferenceItems(ReferenceType: js.Any): js.Any = js.native
  def GetLetterContent(): LetterContent = js.native
  def GetWorkflowTasks(): activexDashOfficeLib.OfficeNs.WorkflowTasks = js.native
  def GetWorkflowTemplates(): activexDashOfficeLib.OfficeNs.WorkflowTemplates = js.native
  def GoTo(): Range = js.native
  def GoTo(What: js.Any): Range = js.native
  def GoTo(What: js.Any, Which: js.Any): Range = js.native
  def GoTo(What: js.Any, Which: js.Any, Count: js.Any): Range = js.native
  def GoTo(What: js.Any, Which: js.Any, Count: js.Any, Name: js.Any): Range = js.native
  def LockServerFile(): scala.Unit = js.native
  def MakeCompatibilityDefault(): scala.Unit = js.native
  def ManualHyphenation(): scala.Unit = js.native
  def Merge(FileName: java.lang.String): scala.Unit = js.native
  def Merge(FileName: java.lang.String, MergeTarget: js.Any): scala.Unit = js.native
  def Merge(FileName: java.lang.String, MergeTarget: js.Any, DetectFormatChanges: js.Any): scala.Unit = js.native
  def Merge(
    FileName: java.lang.String,
    MergeTarget: js.Any,
    DetectFormatChanges: js.Any,
    UseFormattingFrom: js.Any
  ): scala.Unit = js.native
  def Merge(
    FileName: java.lang.String,
    MergeTarget: js.Any,
    DetectFormatChanges: js.Any,
    UseFormattingFrom: js.Any,
    AddToRecentFiles: js.Any
  ): scala.Unit = js.native
  def Merge2000(FileName: java.lang.String): scala.Unit = js.native
  def Permission(Index: js.Any): activexDashOfficeLib.OfficeNs.UserPermission = js.native
  def Post(): scala.Unit = js.native
  def PresentIt(): scala.Unit = js.native
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
    ActivePrinterMacGX: js.UndefOr[js.Any],
    ManualDuplexPrint: js.UndefOr[js.Any],
    PrintZoomColumn: js.UndefOr[js.Any],
    PrintZoomRow: js.UndefOr[js.Any],
    PrintZoomPaperWidth: js.UndefOr[js.Any],
    PrintZoomPaperHeight: js.UndefOr[js.Any]
  ): scala.Unit = js.native
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
    ActivePrinterMacGX: js.UndefOr[js.Any],
    ManualDuplexPrint: js.UndefOr[js.Any],
    PrintZoomColumn: js.UndefOr[js.Any],
    PrintZoomRow: js.UndefOr[js.Any],
    PrintZoomPaperWidth: js.UndefOr[js.Any],
    PrintZoomPaperHeight: js.UndefOr[js.Any]
  ): scala.Unit = js.native
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
    ActivePrinterMacGX: js.UndefOr[js.Any],
    ManualDuplexPrint: js.UndefOr[js.Any]
  ): scala.Unit = js.native
  def PrintPreview(): scala.Unit = js.native
  def Protect(Type: WdProtectionType): scala.Unit = js.native
  def Protect(Type: WdProtectionType, NoReset: js.Any): scala.Unit = js.native
  def Protect(Type: WdProtectionType, NoReset: js.Any, Password: js.Any): scala.Unit = js.native
  def Protect(Type: WdProtectionType, NoReset: js.Any, Password: js.Any, UseIRM: js.Any): scala.Unit = js.native
  def Protect(
    Type: WdProtectionType,
    NoReset: js.Any,
    Password: js.Any,
    UseIRM: js.Any,
    EnforceStyleLock: js.Any
  ): scala.Unit = js.native
  def Protect2002(Type: WdProtectionType): scala.Unit = js.native
  def Protect2002(Type: WdProtectionType, NoReset: js.Any): scala.Unit = js.native
  def Protect2002(Type: WdProtectionType, NoReset: js.Any, Password: js.Any): scala.Unit = js.native
  def Range(): activexDashWordLib.WordNs.Range = js.native
  def Range(Start: scala.Double): activexDashWordLib.WordNs.Range = js.native
  def Range(Start: scala.Double, End: scala.Double): activexDashWordLib.WordNs.Range = js.native
  def RecheckSmartTags(): scala.Unit = js.native
  def Redo(): scala.Boolean = js.native
  def Redo(Times: js.Any): scala.Boolean = js.native
  def RejectAllRevisions(): scala.Unit = js.native
  def RejectAllRevisionsShown(): scala.Unit = js.native
  def Reload(): scala.Unit = js.native
  def ReloadAs(Encoding: activexDashOfficeLib.OfficeNs.MsoEncoding): scala.Unit = js.native
  def RemoveDocumentInformation(RemoveDocInfoType: WdRemoveDocInfoType): scala.Unit = js.native
  def RemoveDocumentWorkspaceHeader(ID: java.lang.String): scala.Unit = js.native
  def RemoveLockedStyles(): scala.Unit = js.native
  def RemoveNumbers(): scala.Unit = js.native
  def RemoveNumbers(NumberType: js.Any): scala.Unit = js.native
  def RemoveSmartTags(): scala.Unit = js.native
  def RemoveTheme(): scala.Unit = js.native
  def Repaginate(): scala.Unit = js.native
  def Reply(): scala.Unit = js.native
  def ReplyAll(): scala.Unit = js.native
  def ReplyWithChanges(): scala.Unit = js.native
  def ReplyWithChanges(ShowMessage: js.Any): scala.Unit = js.native
  def ResetFormFields(): scala.Unit = js.native
  def Route(): scala.Unit = js.native
  def RunAutoMacro(Which: WdAutoMacros): scala.Unit = js.native
  def RunLetterWizard(): scala.Unit = js.native
  def RunLetterWizard(LetterContent: js.Any): scala.Unit = js.native
  def RunLetterWizard(LetterContent: js.Any, WizardMode: js.Any): scala.Unit = js.native
  def Save(): scala.Unit = js.native
  def SaveAs(
    FileName: js.UndefOr[js.Any],
    FileFormat: js.UndefOr[js.Any],
    LockComments: js.UndefOr[js.Any],
    Password: js.UndefOr[js.Any],
    AddToRecentFiles: js.UndefOr[js.Any],
    WritePassword: js.UndefOr[js.Any],
    ReadOnlyRecommended: js.UndefOr[js.Any],
    EmbedTrueTypeFonts: js.UndefOr[js.Any],
    SaveNativePictureFormat: js.UndefOr[js.Any],
    SaveFormsData: js.UndefOr[js.Any],
    SaveAsAOCELetter: js.UndefOr[js.Any],
    Encoding: js.UndefOr[js.Any],
    InsertLineBreaks: js.UndefOr[js.Any],
    AllowSubstitutions: js.UndefOr[js.Any],
    LineEnding: js.UndefOr[js.Any],
    AddBiDiMarks: js.UndefOr[js.Any]
  ): scala.Unit = js.native
  def SaveAs2(
    FileName: js.UndefOr[js.Any],
    FileFormat: js.UndefOr[js.Any],
    LockComments: js.UndefOr[js.Any],
    Password: js.UndefOr[js.Any],
    AddToRecentFiles: js.UndefOr[js.Any],
    WritePassword: js.UndefOr[js.Any],
    ReadOnlyRecommended: js.UndefOr[js.Any],
    EmbedTrueTypeFonts: js.UndefOr[js.Any],
    SaveNativePictureFormat: js.UndefOr[js.Any],
    SaveFormsData: js.UndefOr[js.Any],
    SaveAsAOCELetter: js.UndefOr[js.Any],
    Encoding: js.UndefOr[js.Any],
    InsertLineBreaks: js.UndefOr[js.Any],
    AllowSubstitutions: js.UndefOr[js.Any],
    LineEnding: js.UndefOr[js.Any],
    AddBiDiMarks: js.UndefOr[js.Any],
    CompatibilityMode: js.UndefOr[js.Any]
  ): scala.Unit = js.native
  def SaveAs2000(
    FileName: js.UndefOr[js.Any],
    FileFormat: js.UndefOr[js.Any],
    LockComments: js.UndefOr[js.Any],
    Password: js.UndefOr[js.Any],
    AddToRecentFiles: js.UndefOr[js.Any],
    WritePassword: js.UndefOr[js.Any],
    ReadOnlyRecommended: js.UndefOr[js.Any],
    EmbedTrueTypeFonts: js.UndefOr[js.Any],
    SaveNativePictureFormat: js.UndefOr[js.Any],
    SaveFormsData: js.UndefOr[js.Any],
    SaveAsAOCELetter: js.UndefOr[js.Any]
  ): scala.Unit = js.native
  def SaveAsQuickStyleSet(FileName: java.lang.String): scala.Unit = js.native
  def Scripts(Index: js.Any): activexDashOfficeLib.OfficeNs.Script = js.native
  def Select(): scala.Unit = js.native
  def SelectAllEditableRanges(): scala.Unit = js.native
  def SelectAllEditableRanges(EditorID: js.Any): scala.Unit = js.native
  def SelectContentControlsByTag(Tag: java.lang.String): ContentControls = js.native
  def SelectContentControlsByTitle(Title: java.lang.String): ContentControls = js.native
  def SelectLinkedControls(Node: activexDashOfficeLib.OfficeNs.CustomXMLNode): ContentControls = js.native
  /**
    * @param string [PrefixMapping='']
    * @param boolean [FastSearchSkippingTextNodes=true]
    */
  def SelectNodes(XPath: java.lang.String): XMLNodes = js.native
  def SelectNodes(XPath: java.lang.String, PrefixMapping: java.lang.String): XMLNodes = js.native
  def SelectNodes(
    XPath: java.lang.String,
    PrefixMapping: java.lang.String,
    FastSearchSkippingTextNodes: scala.Boolean
  ): XMLNodes = js.native
  /**
    * @param string [PrefixMapping='']
    * @param boolean [FastSearchSkippingTextNodes=true]
    */
  def SelectSingleNode(XPath: java.lang.String): XMLNode = js.native
  def SelectSingleNode(XPath: java.lang.String, PrefixMapping: java.lang.String): XMLNode = js.native
  def SelectSingleNode(
    XPath: java.lang.String,
    PrefixMapping: java.lang.String,
    FastSearchSkippingTextNodes: scala.Boolean
  ): XMLNode = js.native
  /** @param Office.CustomXMLPart [Stream=0] */
  def SelectUnlinkedControls(): ContentControls = js.native
  def SelectUnlinkedControls(Stream: activexDashOfficeLib.OfficeNs.CustomXMLPart): ContentControls = js.native
  def SendFax(Address: java.lang.String): scala.Unit = js.native
  def SendFax(Address: java.lang.String, Subject: js.Any): scala.Unit = js.native
  def SendFaxOverInternet(): scala.Unit = js.native
  def SendFaxOverInternet(Recipients: js.Any): scala.Unit = js.native
  def SendFaxOverInternet(Recipients: js.Any, Subject: js.Any): scala.Unit = js.native
  def SendFaxOverInternet(Recipients: js.Any, Subject: js.Any, ShowMessage: js.Any): scala.Unit = js.native
  def SendForReview(): scala.Unit = js.native
  def SendForReview(Recipients: js.Any): scala.Unit = js.native
  def SendForReview(Recipients: js.Any, Subject: js.Any): scala.Unit = js.native
  def SendForReview(Recipients: js.Any, Subject: js.Any, ShowMessage: js.Any): scala.Unit = js.native
  def SendForReview(Recipients: js.Any, Subject: js.Any, ShowMessage: js.Any, IncludeAttachment: js.Any): scala.Unit = js.native
  def SendMail(): scala.Unit = js.native
  def SendMailer(): scala.Unit = js.native
  def SendMailer(FileFormat: js.Any): scala.Unit = js.native
  def SendMailer(FileFormat: js.Any, Priority: js.Any): scala.Unit = js.native
  def ServerPolicy(Index: java.lang.String): activexDashOfficeLib.OfficeNs.PolicyItem = js.native
  def ServerPolicy(Index: scala.Double): activexDashOfficeLib.OfficeNs.PolicyItem = js.native
  def SetCompatibilityMode(Mode: scala.Double): scala.Unit = js.native
  def SetDefaultTableStyle(Style: js.Any, SetInTemplate: scala.Boolean): scala.Unit = js.native
  def SetLetterContent(LetterContent: js.Any): scala.Unit = js.native
  def SetPasswordEncryptionOptions(
    PasswordEncryptionProvider: java.lang.String,
    PasswordEncryptionAlgorithm: java.lang.String,
    PasswordEncryptionKeyLength: scala.Double
  ): scala.Unit = js.native
  def SetPasswordEncryptionOptions(
    PasswordEncryptionProvider: java.lang.String,
    PasswordEncryptionAlgorithm: java.lang.String,
    PasswordEncryptionKeyLength: scala.Double,
    PasswordEncryptionFileProperties: js.Any
  ): scala.Unit = js.native
  def Signatures(iSig: scala.Double): activexDashOfficeLib.OfficeNs.Signature = js.native
  def ToggleFormsDesign(): scala.Unit = js.native
  /** @param boolean [DataOnly=true] */
  def TransformDocument(Path: java.lang.String): scala.Unit = js.native
  def TransformDocument(Path: java.lang.String, DataOnly: scala.Boolean): scala.Unit = js.native
  def Undo(): scala.Boolean = js.native
  def Undo(Times: js.Any): scala.Boolean = js.native
  def UndoClear(): scala.Unit = js.native
  def UnfreezeLayout(): scala.Unit = js.native
  def Unprotect(): scala.Unit = js.native
  def Unprotect(Password: js.Any): scala.Unit = js.native
  def UpdateStyles(): scala.Unit = js.native
  def UpdateSummaryProperties(): scala.Unit = js.native
  def ViewCode(): scala.Unit = js.native
  def ViewPropertyBrowser(): scala.Unit = js.native
  def WebPagePreview(): scala.Unit = js.native
  def sblt(s: java.lang.String): scala.Unit = js.native
}

