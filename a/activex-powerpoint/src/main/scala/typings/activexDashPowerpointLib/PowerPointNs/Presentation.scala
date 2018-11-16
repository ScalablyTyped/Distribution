package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Presentation")
@js.native
class Presentation protected () extends js.Object {
  val Application: Application = js.native
  val Broadcast: Broadcast = js.native
  val BuiltInDocumentProperties: js.Any = js.native
  val Coauthoring: Coauthoring = js.native
  val ColorSchemes: ColorSchemes = js.native
  @JSName("CommandBars")
  val CommandBars_Original: activexDashOfficeLib.OfficeNs.CommandBars = js.native
  val Container: js.Any = js.native
  @JSName("ContentTypeProperties")
  val ContentTypeProperties_Original: activexDashOfficeLib.OfficeNs.MetaProperties = js.native
  val CreateVideoStatus: PpMediaTaskStatus = js.native
  val CustomDocumentProperties: js.Any = js.native
  @JSName("CustomXMLParts")
  val CustomXMLParts_Original: activexDashOfficeLib.OfficeNs.CustomXMLParts = js.native
  val CustomerData: CustomerData = js.native
  var DefaultLanguageID: activexDashOfficeLib.OfficeNs.MsoLanguageID = js.native
  val DefaultShape: Shape = js.native
  val Designs: Designs = js.native
  var DisplayComments: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  @JSName("DocumentInspectors")
  val DocumentInspectors_Original: activexDashOfficeLib.OfficeNs.DocumentInspectors = js.native
  @JSName("DocumentLibraryVersions")
  val DocumentLibraryVersions_Original: activexDashOfficeLib.OfficeNs.DocumentLibraryVersions = js.native
  var EncryptionProvider: java.lang.String = js.native
  var EnvelopeVisible: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val ExtraColors: ExtraColors = js.native
  var FarEastLineBreakLanguage: activexDashOfficeLib.OfficeNs.MsoFarEastLineBreakLanguageID = js.native
  var FarEastLineBreakLevel: PpFarEastLineBreakLevel = js.native
  var Final: scala.Boolean = js.native
  val Fonts: Fonts = js.native
  val FullName: java.lang.String = js.native
  var GridDistance: scala.Double = js.native
  val HTMLProject: activexDashOfficeLib.OfficeNs.HTMLProject = js.native
  val HandoutMaster: Master = js.native
  val HasHandoutMaster: scala.Boolean = js.native
  val HasNotesMaster: scala.Boolean = js.native
  val HasRevisionInfo: PpRevisionInfo = js.native
  val HasSections: scala.Boolean = js.native
  val HasTitleMaster: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val HasVBProject: scala.Boolean = js.native
  val InMergeMode: scala.Boolean = js.native
  var LayoutDirection: PpDirection = js.native
  val Name: java.lang.String = js.native
  var NoLineBreakAfter: java.lang.String = js.native
  var NoLineBreakBefore: java.lang.String = js.native
  val NotesMaster: Master = js.native
  val PageSetup: PageSetup = js.native
  val Parent: js.Any = js.native
  var Password: java.lang.String = js.native
  val PasswordEncryptionAlgorithm: java.lang.String = js.native
  val PasswordEncryptionFileProperties: scala.Boolean = js.native
  val PasswordEncryptionKeyLength: scala.Double = js.native
  val PasswordEncryptionProvider: java.lang.String = js.native
  val Path: java.lang.String = js.native
  @JSName("Permission")
  val Permission_Original: activexDashOfficeLib.OfficeNs.Permission = js.native
  var `PowerPoint.Presentation_typekey`: Presentation = js.native
  val PrintOptions: PrintOptions = js.native
  val PublishObjects: PublishObjects = js.native
  val ReadOnly: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  var RemovePersonalInformation: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val Research: Research = js.native
  var Saved: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val SectionCount: scala.Double = js.native
  val SectionProperties: SectionProperties = js.native
  @JSName("ServerPolicy")
  val ServerPolicy_Original: activexDashOfficeLib.OfficeNs.ServerPolicy = js.native
  val SharedWorkspace: activexDashOfficeLib.OfficeNs.SharedWorkspace = js.native
  @JSName("Signatures")
  val Signatures_Original: activexDashOfficeLib.OfficeNs.SignatureSet = js.native
  val SlideMaster: Master = js.native
  val SlideShowSettings: SlideShowSettings = js.native
  val SlideShowWindow: SlideShowWindow = js.native
  val Slides: Slides = js.native
  var SnapToGrid: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val Sync: activexDashOfficeLib.OfficeNs.Sync = js.native
  val Tags: Tags = js.native
  val TemplateName: java.lang.String = js.native
  val TitleMaster: Master = js.native
  val VBASigned: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val VBProject: activexDashVbideLib.VBIDENs.VBProject = js.native
  val WebOptions: WebOptions = js.native
  val Windows: DocumentWindows = js.native
  var WritePassword: java.lang.String = js.native
  def AcceptAll(): scala.Unit = js.native
  /** @param string [FileName=''] */
  def AddBaseline(): scala.Unit = js.native
  /** @param string [FileName=''] */
  def AddBaseline(FileName: java.lang.String): scala.Unit = js.native
  def AddTitleMaster(): Master = js.native
  def AddToFavorites(): scala.Unit = js.native
  def ApplyTemplate(FileName: java.lang.String): scala.Unit = js.native
  def ApplyTheme(themeName: java.lang.String): scala.Unit = js.native
  def CanCheckIn(): scala.Boolean = js.native
  /** @param boolean [SaveChanges=true] */
  def CheckIn(): scala.Unit = js.native
  /** @param boolean [SaveChanges=true] */
  def CheckIn(SaveChanges: scala.Boolean): scala.Unit = js.native
  /** @param boolean [SaveChanges=true] */
  def CheckIn(SaveChanges: scala.Boolean, Comments: js.Any): scala.Unit = js.native
  /** @param boolean [SaveChanges=true] */
  def CheckIn(SaveChanges: scala.Boolean, Comments: js.Any, MakePublic: js.Any): scala.Unit = js.native
  /** @param boolean [SaveChanges=true] */
  def CheckInWithVersion(): scala.Unit = js.native
  /** @param boolean [SaveChanges=true] */
  def CheckInWithVersion(SaveChanges: scala.Boolean): scala.Unit = js.native
  /** @param boolean [SaveChanges=true] */
  def CheckInWithVersion(SaveChanges: scala.Boolean, Comments: js.Any): scala.Unit = js.native
  /** @param boolean [SaveChanges=true] */
  def CheckInWithVersion(SaveChanges: scala.Boolean, Comments: js.Any, MakePublic: js.Any): scala.Unit = js.native
  /** @param boolean [SaveChanges=true] */
  def CheckInWithVersion(SaveChanges: scala.Boolean, Comments: js.Any, MakePublic: js.Any, VersionType: js.Any): scala.Unit = js.native
  def Close(): scala.Unit = js.native
  def CommandBars(Index: java.lang.String): activexDashOfficeLib.OfficeNs.CommandBar = js.native
  def CommandBars(Index: scala.Double): activexDashOfficeLib.OfficeNs.CommandBar = js.native
  def ContentTypeProperties(Index: java.lang.String): activexDashOfficeLib.OfficeNs.MetaProperty = js.native
  def ContentTypeProperties(Index: scala.Double): activexDashOfficeLib.OfficeNs.MetaProperty = js.native
  def Convert(): scala.Unit = js.native
  def Convert2(FileName: java.lang.String): scala.Unit = js.native
  /**
           * @param boolean [UseTimingsAndNarrations=true]
           * @param number [DefaultSlideDuration=5]
           * @param number [VertResolution=720]
           * @param number [FramesPerSecond=30]
           * @param number [Quality=85]
           */
  def CreateVideo(FileName: java.lang.String): scala.Unit = js.native
  /**
           * @param boolean [UseTimingsAndNarrations=true]
           * @param number [DefaultSlideDuration=5]
           * @param number [VertResolution=720]
           * @param number [FramesPerSecond=30]
           * @param number [Quality=85]
           */
  def CreateVideo(FileName: java.lang.String, UseTimingsAndNarrations: scala.Boolean): scala.Unit = js.native
  /**
           * @param boolean [UseTimingsAndNarrations=true]
           * @param number [DefaultSlideDuration=5]
           * @param number [VertResolution=720]
           * @param number [FramesPerSecond=30]
           * @param number [Quality=85]
           */
  def CreateVideo(
    FileName: java.lang.String,
    UseTimingsAndNarrations: scala.Boolean,
    DefaultSlideDuration: scala.Double
  ): scala.Unit = js.native
  /**
           * @param boolean [UseTimingsAndNarrations=true]
           * @param number [DefaultSlideDuration=5]
           * @param number [VertResolution=720]
           * @param number [FramesPerSecond=30]
           * @param number [Quality=85]
           */
  def CreateVideo(
    FileName: java.lang.String,
    UseTimingsAndNarrations: scala.Boolean,
    DefaultSlideDuration: scala.Double,
    VertResolution: scala.Double
  ): scala.Unit = js.native
  /**
           * @param boolean [UseTimingsAndNarrations=true]
           * @param number [DefaultSlideDuration=5]
           * @param number [VertResolution=720]
           * @param number [FramesPerSecond=30]
           * @param number [Quality=85]
           */
  def CreateVideo(
    FileName: java.lang.String,
    UseTimingsAndNarrations: scala.Boolean,
    DefaultSlideDuration: scala.Double,
    VertResolution: scala.Double,
    FramesPerSecond: scala.Double
  ): scala.Unit = js.native
  /**
           * @param boolean [UseTimingsAndNarrations=true]
           * @param number [DefaultSlideDuration=5]
           * @param number [VertResolution=720]
           * @param number [FramesPerSecond=30]
           * @param number [Quality=85]
           */
  def CreateVideo(
    FileName: java.lang.String,
    UseTimingsAndNarrations: scala.Boolean,
    DefaultSlideDuration: scala.Double,
    VertResolution: scala.Double,
    FramesPerSecond: scala.Double,
    Quality: scala.Double
  ): scala.Unit = js.native
  def CustomXMLParts(Index: java.lang.String): activexDashOfficeLib.OfficeNs.CustomXMLPart = js.native
  def CustomXMLParts(Index: scala.Double): activexDashOfficeLib.OfficeNs.CustomXMLPart = js.native
  def DeleteSection(Index: scala.Double): scala.Unit = js.native
  def DisableSections(): scala.Unit = js.native
  def DocumentInspectors(Index: scala.Double): activexDashOfficeLib.OfficeNs.DocumentInspector = js.native
  def DocumentLibraryVersions(lIndex: scala.Double): activexDashOfficeLib.OfficeNs.DocumentLibraryVersion = js.native
  def EndReview(): scala.Unit = js.native
  def EnsureAllMediaUpgraded(): scala.Unit = js.native
  /**
           * @param number [ScaleWidth=0]
           * @param number [ScaleHeight=0]
           */
  def Export(Path: java.lang.String, FilterName: java.lang.String): scala.Unit = js.native
  /**
           * @param number [ScaleWidth=0]
           * @param number [ScaleHeight=0]
           */
  def Export(Path: java.lang.String, FilterName: java.lang.String, ScaleWidth: scala.Double): scala.Unit = js.native
  /**
           * @param number [ScaleWidth=0]
           * @param number [ScaleHeight=0]
           */
  def Export(
    Path: java.lang.String,
    FilterName: java.lang.String,
    ScaleWidth: scala.Double,
    ScaleHeight: scala.Double
  ): scala.Unit = js.native
  /**
           * @param PowerPoint.PpFixedFormatIntent [Intent=1]
           * @param Office.MsoTriState [FrameSlides=0]
           * @param PowerPoint.PpPrintHandoutOrder [HandoutOrder=1]
           * @param PowerPoint.PpPrintOutputType [OutputType=1]
           * @param Office.MsoTriState [PrintHiddenSlides=0]
           * @param PowerPoint.PrintRange [PrintRange=0]
           * @param PowerPoint.PpPrintRangeType [RangeType=1]
           * @param string [SlideShowName='']
           * @param boolean [IncludeDocProperties=false]
           * @param boolean [KeepIRMSettings=true]
           * @param boolean [DocStructureTags=true]
           * @param boolean [BitmapMissingFonts=true]
           * @param boolean [UseISO19005_1=false]
           */
  def ExportAsFixedFormat(
    Path: java.lang.String,
    FixedFormatType: PpFixedFormatType,
    Intent: js.UndefOr[PpFixedFormatIntent],
    FrameSlides: js.UndefOr[activexDashOfficeLib.OfficeNs.MsoTriState],
    HandoutOrder: js.UndefOr[PpPrintHandoutOrder],
    OutputType: js.UndefOr[PpPrintOutputType],
    PrintHiddenSlides: js.UndefOr[activexDashOfficeLib.OfficeNs.MsoTriState],
    PrintRange: js.UndefOr[PrintRange],
    RangeType: js.UndefOr[PpPrintRangeType],
    SlideShowName: js.UndefOr[java.lang.String],
    IncludeDocProperties: js.UndefOr[scala.Boolean],
    KeepIRMSettings: js.UndefOr[scala.Boolean],
    DocStructureTags: js.UndefOr[scala.Boolean],
    BitmapMissingFonts: js.UndefOr[scala.Boolean],
    UseISO19005_1: js.UndefOr[scala.Boolean],
    ExternalExporter: js.UndefOr[js.Any]
  ): scala.Unit = js.native
  /**
           * @param string [SubAddress='']
           * @param boolean [NewWindow=false]
           * @param boolean [AddHistory=true]
           * @param string [ExtraInfo='']
           * @param Office.MsoExtraInfoMethod [Method=0]
           * @param string [HeaderInfo='']
           */
  def FollowHyperlink(
    Address: java.lang.String,
    SubAddress: js.UndefOr[java.lang.String],
    NewWindow: js.UndefOr[scala.Boolean],
    AddHistory: js.UndefOr[scala.Boolean],
    ExtraInfo: js.UndefOr[java.lang.String],
    Method: js.UndefOr[activexDashOfficeLib.OfficeNs.MsoExtraInfoMethod],
    HeaderInfo: js.UndefOr[java.lang.String]
  ): scala.Unit = js.native
  def GetWorkflowTasks(): activexDashOfficeLib.OfficeNs.WorkflowTasks = js.native
  def GetWorkflowTemplates(): activexDashOfficeLib.OfficeNs.WorkflowTemplates = js.native
  def LockServerFile(): scala.Unit = js.native
  def MakeIntoTemplate(IsDesignTemplate: activexDashOfficeLib.OfficeNs.MsoTriState): scala.Unit = js.native
  def Merge(Path: java.lang.String): scala.Unit = js.native
  def MergeWithBaseline(withPresentation: java.lang.String, baselinePresentation: java.lang.String): scala.Unit = js.native
  def NewSectionAfter(
    Index: scala.Double,
    AfterSlide: scala.Boolean,
    sectionTitle: java.lang.String,
    newSectionIndex: scala.Double
  ): scala.Unit = js.native
  def NewWindow(): DocumentWindow = js.native
  def Permission(Index: js.Any): activexDashOfficeLib.OfficeNs.UserPermission = js.native
  /**
           * @param number [From=-1]
           * @param number [To=-1]
           * @param string [PrintToFile='']
           * @param number [Copies=0]
           * @param Office.MsoTriState [Collate=-99]
           */
  def PrintOut(): scala.Unit = js.native
  /**
           * @param number [From=-1]
           * @param number [To=-1]
           * @param string [PrintToFile='']
           * @param number [Copies=0]
           * @param Office.MsoTriState [Collate=-99]
           */
  def PrintOut(From: scala.Double): scala.Unit = js.native
  /**
           * @param number [From=-1]
           * @param number [To=-1]
           * @param string [PrintToFile='']
           * @param number [Copies=0]
           * @param Office.MsoTriState [Collate=-99]
           */
  def PrintOut(From: scala.Double, To: scala.Double): scala.Unit = js.native
  /**
           * @param number [From=-1]
           * @param number [To=-1]
           * @param string [PrintToFile='']
           * @param number [Copies=0]
           * @param Office.MsoTriState [Collate=-99]
           */
  def PrintOut(From: scala.Double, To: scala.Double, PrintToFile: java.lang.String): scala.Unit = js.native
  /**
           * @param number [From=-1]
           * @param number [To=-1]
           * @param string [PrintToFile='']
           * @param number [Copies=0]
           * @param Office.MsoTriState [Collate=-99]
           */
  def PrintOut(From: scala.Double, To: scala.Double, PrintToFile: java.lang.String, Copies: scala.Double): scala.Unit = js.native
  /**
           * @param number [From=-1]
           * @param number [To=-1]
           * @param string [PrintToFile='']
           * @param number [Copies=0]
           * @param Office.MsoTriState [Collate=-99]
           */
  def PrintOut(
    From: scala.Double,
    To: scala.Double,
    PrintToFile: java.lang.String,
    Copies: scala.Double,
    Collate: activexDashOfficeLib.OfficeNs.MsoTriState
  ): scala.Unit = js.native
  /**
           * @param boolean [Overwrite=false]
           * @param boolean [UseSlideOrder=false]
           */
  def PublishSlides(SlideLibraryUrl: java.lang.String): scala.Unit = js.native
  /**
           * @param boolean [Overwrite=false]
           * @param boolean [UseSlideOrder=false]
           */
  def PublishSlides(SlideLibraryUrl: java.lang.String, Overwrite: scala.Boolean): scala.Unit = js.native
  /**
           * @param boolean [Overwrite=false]
           * @param boolean [UseSlideOrder=false]
           */
  def PublishSlides(SlideLibraryUrl: java.lang.String, Overwrite: scala.Boolean, UseSlideOrder: scala.Boolean): scala.Unit = js.native
  def RejectAll(): scala.Unit = js.native
  def ReloadAs(cp: activexDashOfficeLib.OfficeNs.MsoEncoding): scala.Unit = js.native
  def RemoveBaseline(): scala.Unit = js.native
  def RemoveDocumentInformation(Type: PpRemoveDocInfoType): scala.Unit = js.native
  /** @param boolean [ShowMessage=true] */
  def ReplyWithChanges(): scala.Unit = js.native
  /** @param boolean [ShowMessage=true] */
  def ReplyWithChanges(ShowMessage: scala.Boolean): scala.Unit = js.native
  def Save(): scala.Unit = js.native
  /**
           * @param PowerPoint.PpSaveAsFileType [FileFormat=11]
           * @param Office.MsoTriState [EmbedTrueTypeFonts=-2]
           */
  def SaveAs(FileName: java.lang.String): scala.Unit = js.native
  /**
           * @param PowerPoint.PpSaveAsFileType [FileFormat=11]
           * @param Office.MsoTriState [EmbedTrueTypeFonts=-2]
           */
  def SaveAs(FileName: java.lang.String, FileFormat: PpSaveAsFileType): scala.Unit = js.native
  /**
           * @param PowerPoint.PpSaveAsFileType [FileFormat=11]
           * @param Office.MsoTriState [EmbedTrueTypeFonts=-2]
           */
  def SaveAs(
    FileName: java.lang.String,
    FileFormat: PpSaveAsFileType,
    EmbedTrueTypeFonts: activexDashOfficeLib.OfficeNs.MsoTriState
  ): scala.Unit = js.native
  /**
           * @param PowerPoint.PpSaveAsFileType [FileFormat=11]
           * @param Office.MsoTriState [EmbedTrueTypeFonts=-2]
           */
  def SaveCopyAs(FileName: java.lang.String): scala.Unit = js.native
  /**
           * @param PowerPoint.PpSaveAsFileType [FileFormat=11]
           * @param Office.MsoTriState [EmbedTrueTypeFonts=-2]
           */
  def SaveCopyAs(FileName: java.lang.String, FileFormat: PpSaveAsFileType): scala.Unit = js.native
  /**
           * @param PowerPoint.PpSaveAsFileType [FileFormat=11]
           * @param Office.MsoTriState [EmbedTrueTypeFonts=-2]
           */
  def SaveCopyAs(
    FileName: java.lang.String,
    FileFormat: PpSaveAsFileType,
    EmbedTrueTypeFonts: activexDashOfficeLib.OfficeNs.MsoTriState
  ): scala.Unit = js.native
  /**
           * @param string [Recipients='']
           * @param string [Subject='']
           * @param boolean [ShowMessage=false]
           */
  def SendFaxOverInternet(): scala.Unit = js.native
  /**
           * @param string [Recipients='']
           * @param string [Subject='']
           * @param boolean [ShowMessage=false]
           */
  def SendFaxOverInternet(Recipients: java.lang.String): scala.Unit = js.native
  /**
           * @param string [Recipients='']
           * @param string [Subject='']
           * @param boolean [ShowMessage=false]
           */
  def SendFaxOverInternet(Recipients: java.lang.String, Subject: java.lang.String): scala.Unit = js.native
  /**
           * @param string [Recipients='']
           * @param string [Subject='']
           * @param boolean [ShowMessage=false]
           */
  def SendFaxOverInternet(Recipients: java.lang.String, Subject: java.lang.String, ShowMessage: scala.Boolean): scala.Unit = js.native
  /**
           * @param string [Recipients='']
           * @param string [Subject='']
           * @param boolean [ShowMessage=true]
           */
  def SendForReview(): scala.Unit = js.native
  /**
           * @param string [Recipients='']
           * @param string [Subject='']
           * @param boolean [ShowMessage=true]
           */
  def SendForReview(Recipients: java.lang.String): scala.Unit = js.native
  /**
           * @param string [Recipients='']
           * @param string [Subject='']
           * @param boolean [ShowMessage=true]
           */
  def SendForReview(Recipients: java.lang.String, Subject: java.lang.String): scala.Unit = js.native
  /**
           * @param string [Recipients='']
           * @param string [Subject='']
           * @param boolean [ShowMessage=true]
           */
  def SendForReview(Recipients: java.lang.String, Subject: java.lang.String, ShowMessage: scala.Boolean): scala.Unit = js.native
  /**
           * @param string [Recipients='']
           * @param string [Subject='']
           * @param boolean [ShowMessage=true]
           */
  def SendForReview(
    Recipients: java.lang.String,
    Subject: java.lang.String,
    ShowMessage: scala.Boolean,
    IncludeAttachment: js.Any
  ): scala.Unit = js.native
  def ServerPolicy(Index: java.lang.String): activexDashOfficeLib.OfficeNs.PolicyItem = js.native
  def ServerPolicy(Index: scala.Double): activexDashOfficeLib.OfficeNs.PolicyItem = js.native
  def SetPasswordEncryptionOptions(
    PasswordEncryptionProvider: java.lang.String,
    PasswordEncryptionAlgorithm: java.lang.String,
    PasswordEncryptionKeyLength: scala.Double,
    PasswordEncryptionFileProperties: scala.Boolean
  ): scala.Unit = js.native
  def SetUndoText(Text: java.lang.String): scala.Unit = js.native
  def Signatures(iSig: scala.Double): activexDashOfficeLib.OfficeNs.Signature = js.native
  def UpdateLinks(): scala.Unit = js.native
  def WebPagePreview(): scala.Unit = js.native
  def sblt(s: java.lang.String): scala.Unit = js.native
  def sectionTitle(Index: scala.Double): java.lang.String = js.native
}

