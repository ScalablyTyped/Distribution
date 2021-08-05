package typings.activexWord.Word

import typings.activexOffice.Office.Script
import typings.activexOffice.Office.Scripts
import typings.activexWord.activexWordNumbers.`9999998`
import typings.activexWord.activexWordNumbers.`9999999`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Range extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  def AutoFormat(): Unit = js.native
  
  var Bold: Boolean | `9999999` | `9999998` = js.native
  
  var BoldBi: Boolean | `9999999` | `9999998` = js.native
  
  val BookmarkID: Double = js.native
  
  val Bookmarks: typings.activexWord.Word.Bookmarks = js.native
  
  var Borders: typings.activexWord.Word.Borders = js.native
  
  def Calculate(): Double = js.native
  
  val CanEdit: Double = js.native
  
  val CanPaste: Double = js.native
  
  var Case: WdCharacterCase = js.native
  
  val Cells: typings.activexWord.Word.Cells = js.native
  
  val CharacterStyle: js.Any = js.native
  
  var CharacterWidth: WdCharacterWidth = js.native
  
  val Characters: typings.activexWord.Word.Characters = js.native
  
  def CheckGrammar(): Unit = js.native
  
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
  ): Unit = js.native
  
  def CheckSynonyms(): Unit = js.native
  
  /** @param WdCollapseDirection [Direction=wdCollapseStart] */
  def Collapse(): Unit = js.native
  def Collapse(Direction: WdCollapseDirection): Unit = js.native
  
  val Columns: typings.activexWord.Word.Columns = js.native
  
  var CombineCharacters: Boolean = js.native
  
  val Comments: typings.activexWord.Word.Comments = js.native
  
  def ComputeStatistics(Statistic: WdStatistic): Double = js.native
  
  val Conflicts: typings.activexWord.Word.Conflicts = js.native
  
  val ContentControls: typings.activexWord.Word.ContentControls = js.native
  
  def ConvertHangulAndHanja(): Unit = js.native
  def ConvertHangulAndHanja(ConversionsMode: js.Any): Unit = js.native
  def ConvertHangulAndHanja(ConversionsMode: js.Any, FastConversion: js.Any): Unit = js.native
  def ConvertHangulAndHanja(ConversionsMode: js.Any, FastConversion: js.Any, CheckHangulEnding: js.Any): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: js.Any,
    FastConversion: js.Any,
    CheckHangulEnding: js.Any,
    EnableRecentOrdering: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: js.Any,
    FastConversion: js.Any,
    CheckHangulEnding: js.Any,
    EnableRecentOrdering: js.Any,
    CustomDictionary: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: js.Any,
    FastConversion: js.Any,
    CheckHangulEnding: js.Any,
    EnableRecentOrdering: Unit,
    CustomDictionary: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: js.Any,
    FastConversion: js.Any,
    CheckHangulEnding: Unit,
    EnableRecentOrdering: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: js.Any,
    FastConversion: js.Any,
    CheckHangulEnding: Unit,
    EnableRecentOrdering: js.Any,
    CustomDictionary: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: js.Any,
    FastConversion: js.Any,
    CheckHangulEnding: Unit,
    EnableRecentOrdering: Unit,
    CustomDictionary: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(ConversionsMode: js.Any, FastConversion: Unit, CheckHangulEnding: js.Any): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: js.Any,
    FastConversion: Unit,
    CheckHangulEnding: js.Any,
    EnableRecentOrdering: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: js.Any,
    FastConversion: Unit,
    CheckHangulEnding: js.Any,
    EnableRecentOrdering: js.Any,
    CustomDictionary: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: js.Any,
    FastConversion: Unit,
    CheckHangulEnding: js.Any,
    EnableRecentOrdering: Unit,
    CustomDictionary: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: js.Any,
    FastConversion: Unit,
    CheckHangulEnding: Unit,
    EnableRecentOrdering: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: js.Any,
    FastConversion: Unit,
    CheckHangulEnding: Unit,
    EnableRecentOrdering: js.Any,
    CustomDictionary: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: js.Any,
    FastConversion: Unit,
    CheckHangulEnding: Unit,
    EnableRecentOrdering: Unit,
    CustomDictionary: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(ConversionsMode: Unit, FastConversion: js.Any): Unit = js.native
  def ConvertHangulAndHanja(ConversionsMode: Unit, FastConversion: js.Any, CheckHangulEnding: js.Any): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: Unit,
    FastConversion: js.Any,
    CheckHangulEnding: js.Any,
    EnableRecentOrdering: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: Unit,
    FastConversion: js.Any,
    CheckHangulEnding: js.Any,
    EnableRecentOrdering: js.Any,
    CustomDictionary: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: Unit,
    FastConversion: js.Any,
    CheckHangulEnding: js.Any,
    EnableRecentOrdering: Unit,
    CustomDictionary: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: Unit,
    FastConversion: js.Any,
    CheckHangulEnding: Unit,
    EnableRecentOrdering: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: Unit,
    FastConversion: js.Any,
    CheckHangulEnding: Unit,
    EnableRecentOrdering: js.Any,
    CustomDictionary: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: Unit,
    FastConversion: js.Any,
    CheckHangulEnding: Unit,
    EnableRecentOrdering: Unit,
    CustomDictionary: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(ConversionsMode: Unit, FastConversion: Unit, CheckHangulEnding: js.Any): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: Unit,
    FastConversion: Unit,
    CheckHangulEnding: js.Any,
    EnableRecentOrdering: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: Unit,
    FastConversion: Unit,
    CheckHangulEnding: js.Any,
    EnableRecentOrdering: js.Any,
    CustomDictionary: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: Unit,
    FastConversion: Unit,
    CheckHangulEnding: js.Any,
    EnableRecentOrdering: Unit,
    CustomDictionary: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(ConversionsMode: Unit, FastConversion: Unit, CheckHangulEnding: Unit, EnableRecentOrdering: js.Any): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: Unit,
    FastConversion: Unit,
    CheckHangulEnding: Unit,
    EnableRecentOrdering: js.Any,
    CustomDictionary: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: Unit,
    FastConversion: Unit,
    CheckHangulEnding: Unit,
    EnableRecentOrdering: Unit,
    CustomDictionary: js.Any
  ): Unit = js.native
  
  def ConvertToTable(
    Separator: js.UndefOr[js.Any],
    NumRows: js.UndefOr[js.Any],
    NumColumns: js.UndefOr[js.Any],
    InitialColumnWidth: js.UndefOr[js.Any],
    Format: js.UndefOr[js.Any],
    ApplyBorders: js.UndefOr[js.Any],
    ApplyShading: js.UndefOr[js.Any],
    ApplyFont: js.UndefOr[js.Any],
    ApplyColor: js.UndefOr[js.Any],
    ApplyHeadingRows: js.UndefOr[js.Any],
    ApplyLastRow: js.UndefOr[js.Any],
    ApplyFirstColumn: js.UndefOr[js.Any],
    ApplyLastColumn: js.UndefOr[js.Any],
    AutoFit: js.UndefOr[js.Any],
    AutoFitBehavior: js.UndefOr[js.Any],
    DefaultTableBehavior: js.UndefOr[js.Any]
  ): Table = js.native
  
  def ConvertToTableOld(
    Separator: js.UndefOr[js.Any],
    NumRows: js.UndefOr[js.Any],
    NumColumns: js.UndefOr[js.Any],
    InitialColumnWidth: js.UndefOr[js.Any],
    Format: js.UndefOr[js.Any],
    ApplyBorders: js.UndefOr[js.Any],
    ApplyShading: js.UndefOr[js.Any],
    ApplyFont: js.UndefOr[js.Any],
    ApplyColor: js.UndefOr[js.Any],
    ApplyHeadingRows: js.UndefOr[js.Any],
    ApplyLastRow: js.UndefOr[js.Any],
    ApplyFirstColumn: js.UndefOr[js.Any],
    ApplyLastColumn: js.UndefOr[js.Any],
    AutoFit: js.UndefOr[js.Any]
  ): Table = js.native
  
  def Copy(): Unit = js.native
  
  def CopyAsPicture(): Unit = js.native
  
  def CreatePublisher(): Unit = js.native
  def CreatePublisher(Edition: js.Any): Unit = js.native
  def CreatePublisher(Edition: js.Any, ContainsPICT: js.Any): Unit = js.native
  def CreatePublisher(Edition: js.Any, ContainsPICT: js.Any, ContainsRTF: js.Any): Unit = js.native
  def CreatePublisher(Edition: js.Any, ContainsPICT: js.Any, ContainsRTF: js.Any, ContainsText: js.Any): Unit = js.native
  def CreatePublisher(Edition: js.Any, ContainsPICT: js.Any, ContainsRTF: Unit, ContainsText: js.Any): Unit = js.native
  def CreatePublisher(Edition: js.Any, ContainsPICT: Unit, ContainsRTF: js.Any): Unit = js.native
  def CreatePublisher(Edition: js.Any, ContainsPICT: Unit, ContainsRTF: js.Any, ContainsText: js.Any): Unit = js.native
  def CreatePublisher(Edition: js.Any, ContainsPICT: Unit, ContainsRTF: Unit, ContainsText: js.Any): Unit = js.native
  def CreatePublisher(Edition: Unit, ContainsPICT: js.Any): Unit = js.native
  def CreatePublisher(Edition: Unit, ContainsPICT: js.Any, ContainsRTF: js.Any): Unit = js.native
  def CreatePublisher(Edition: Unit, ContainsPICT: js.Any, ContainsRTF: js.Any, ContainsText: js.Any): Unit = js.native
  def CreatePublisher(Edition: Unit, ContainsPICT: js.Any, ContainsRTF: Unit, ContainsText: js.Any): Unit = js.native
  def CreatePublisher(Edition: Unit, ContainsPICT: Unit, ContainsRTF: js.Any): Unit = js.native
  def CreatePublisher(Edition: Unit, ContainsPICT: Unit, ContainsRTF: js.Any, ContainsText: js.Any): Unit = js.native
  def CreatePublisher(Edition: Unit, ContainsPICT: Unit, ContainsRTF: Unit, ContainsText: js.Any): Unit = js.native
  
  val Creator: Double = js.native
  
  def Cut(): Unit = js.native
  
  def Delete(): Double = js.native
  def Delete(Unit: Unit, Count: Double): Double = js.native
  def Delete(Unit: WdUnits): Double = js.native
  def Delete(Unit: WdUnits, Count: Double): Double = js.native
  
  def DetectLanguage(): Unit = js.native
  
  var DisableCharacterSpaceGrid: Boolean = js.native
  
  val Document: typings.activexWord.Word.Document = js.native
  
  val Duplicate: Range = js.native
  
  val Editors: typings.activexWord.Word.Editors = js.native
  
  var EmphasisMark: WdEmphasisMark = js.native
  
  var End: Double = js.native
  
  def EndOf(): Double = js.native
  def EndOf(Unit: js.Any): Double = js.native
  def EndOf(Unit: js.Any, Extend: js.Any): Double = js.native
  def EndOf(Unit: Unit, Extend: js.Any): Double = js.native
  
  val EndnoteOptions: typings.activexWord.Word.EndnoteOptions = js.native
  
  val Endnotes: typings.activexWord.Word.Endnotes = js.native
  
  val EnhMetaFileBits: js.Any = js.native
  
  def Expand(): Double = js.native
  def Expand(Unit: js.Any): Double = js.native
  
  /**
    * @param boolean [OpenAfterExport=false]
    * @param Word.WdExportOptimizeFor [OptimizeFor=0]
    * @param boolean [ExportCurrentPage=false]
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
    ExportCurrentPage: js.UndefOr[Boolean],
    Item: js.UndefOr[WdExportItem],
    IncludeDocProps: js.UndefOr[Boolean],
    KeepIRM: js.UndefOr[Boolean],
    CreateBookmarks: js.UndefOr[WdExportCreateBookmarks],
    DocStructureTags: js.UndefOr[Boolean],
    BitmapMissingFonts: js.UndefOr[Boolean],
    UseISO19005_1: js.UndefOr[Boolean],
    FixedFormatExtClassPtr: js.UndefOr[js.Any]
  ): Unit = js.native
  
  def ExportFragment(FileName: String, Format: WdSaveFormat): Unit = js.native
  
  val Fields: typings.activexWord.Word.Fields = js.native
  
  val Find: typings.activexWord.Word.Find[Range] = js.native
  
  var FitTextWidth: Double = js.native
  
  var Font: typings.activexWord.Word.Font = js.native
  
  val FootnoteOptions: typings.activexWord.Word.FootnoteOptions = js.native
  
  val Footnotes: typings.activexWord.Word.Footnotes = js.native
  
  val FormFields: typings.activexWord.Word.FormFields = js.native
  
  var FormattedText: Range = js.native
  
  val Frames: typings.activexWord.Word.Frames = js.native
  
  def GetSpellingSuggestions(
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
  
  def GoTo(): Range = js.native
  def GoTo(What: js.Any): Range = js.native
  def GoTo(What: js.Any, Which: js.Any): Range = js.native
  def GoTo(What: js.Any, Which: js.Any, Count: js.Any): Range = js.native
  def GoTo(What: js.Any, Which: js.Any, Count: js.Any, Name: js.Any): Range = js.native
  def GoTo(What: js.Any, Which: js.Any, Count: Unit, Name: js.Any): Range = js.native
  def GoTo(What: js.Any, Which: Unit, Count: js.Any): Range = js.native
  def GoTo(What: js.Any, Which: Unit, Count: js.Any, Name: js.Any): Range = js.native
  def GoTo(What: js.Any, Which: Unit, Count: Unit, Name: js.Any): Range = js.native
  def GoTo(What: Unit, Which: js.Any): Range = js.native
  def GoTo(What: Unit, Which: js.Any, Count: js.Any): Range = js.native
  def GoTo(What: Unit, Which: js.Any, Count: js.Any, Name: js.Any): Range = js.native
  def GoTo(What: Unit, Which: js.Any, Count: Unit, Name: js.Any): Range = js.native
  def GoTo(What: Unit, Which: Unit, Count: js.Any): Range = js.native
  def GoTo(What: Unit, Which: Unit, Count: js.Any, Name: js.Any): Range = js.native
  def GoTo(What: Unit, Which: Unit, Count: Unit, Name: js.Any): Range = js.native
  
  def GoToEditableRange(): Range = js.native
  def GoToEditableRange(EditorID: js.Any): Range = js.native
  
  def GoToNext(What: WdGoToItem): Range = js.native
  
  def GoToPrevious(What: WdGoToItem): Range = js.native
  
  var GrammarChecked: Boolean = js.native
  
  val GrammaticalErrors: ProofreadingErrors = js.native
  
  val HTMLDivisions: typings.activexWord.Word.HTMLDivisions = js.native
  
  var HighlightColorIndex: WdColorIndex = js.native
  
  var HorizontalInVertical: WdHorizontalInVerticalType = js.native
  
  val Hyperlinks: typings.activexWord.Word.Hyperlinks = js.native
  
  var ID: String = js.native
  
  /** @param boolean [MatchDestination=false] */
  def ImportFragment(FileName: String): Unit = js.native
  def ImportFragment(FileName: String, MatchDestination: Boolean): Unit = js.native
  
  def InRange(Range: Range): Boolean = js.native
  
  def InStory(Range: Range): Boolean = js.native
  
  def Information(Type: WdInformation): js.Any = js.native
  
  val InlineShapes: typings.activexWord.Word.InlineShapes = js.native
  
  def InsertAfter(Text: String): Unit = js.native
  
  /** @param number [RelativeTo=0] */
  def InsertAlignmentTab(Alignment: Double): Unit = js.native
  def InsertAlignmentTab(Alignment: Double, RelativeTo: Double): Unit = js.native
  
  def InsertAutoText(): Unit = js.native
  
  def InsertBefore(Text: String): Unit = js.native
  
  def InsertBreak(): Unit = js.native
  def InsertBreak(Type: js.Any): Unit = js.native
  
  def InsertCaption(Label: js.Any): Unit = js.native
  def InsertCaption(Label: js.Any, Title: js.Any): Unit = js.native
  def InsertCaption(Label: js.Any, Title: js.Any, TitleAutoText: js.Any): Unit = js.native
  def InsertCaption(Label: js.Any, Title: js.Any, TitleAutoText: js.Any, Position: js.Any): Unit = js.native
  def InsertCaption(Label: js.Any, Title: js.Any, TitleAutoText: js.Any, Position: js.Any, ExcludeLabel: js.Any): Unit = js.native
  def InsertCaption(Label: js.Any, Title: js.Any, TitleAutoText: js.Any, Position: Unit, ExcludeLabel: js.Any): Unit = js.native
  def InsertCaption(Label: js.Any, Title: js.Any, TitleAutoText: Unit, Position: js.Any): Unit = js.native
  def InsertCaption(Label: js.Any, Title: js.Any, TitleAutoText: Unit, Position: js.Any, ExcludeLabel: js.Any): Unit = js.native
  def InsertCaption(Label: js.Any, Title: js.Any, TitleAutoText: Unit, Position: Unit, ExcludeLabel: js.Any): Unit = js.native
  def InsertCaption(Label: js.Any, Title: Unit, TitleAutoText: js.Any): Unit = js.native
  def InsertCaption(Label: js.Any, Title: Unit, TitleAutoText: js.Any, Position: js.Any): Unit = js.native
  def InsertCaption(Label: js.Any, Title: Unit, TitleAutoText: js.Any, Position: js.Any, ExcludeLabel: js.Any): Unit = js.native
  def InsertCaption(Label: js.Any, Title: Unit, TitleAutoText: js.Any, Position: Unit, ExcludeLabel: js.Any): Unit = js.native
  def InsertCaption(Label: js.Any, Title: Unit, TitleAutoText: Unit, Position: js.Any): Unit = js.native
  def InsertCaption(Label: js.Any, Title: Unit, TitleAutoText: Unit, Position: js.Any, ExcludeLabel: js.Any): Unit = js.native
  def InsertCaption(Label: js.Any, Title: Unit, TitleAutoText: Unit, Position: Unit, ExcludeLabel: js.Any): Unit = js.native
  
  def InsertCaptionXP(Label: js.Any): Unit = js.native
  def InsertCaptionXP(Label: js.Any, Title: js.Any): Unit = js.native
  def InsertCaptionXP(Label: js.Any, Title: js.Any, TitleAutoText: js.Any): Unit = js.native
  def InsertCaptionXP(Label: js.Any, Title: js.Any, TitleAutoText: js.Any, Position: js.Any): Unit = js.native
  def InsertCaptionXP(Label: js.Any, Title: js.Any, TitleAutoText: Unit, Position: js.Any): Unit = js.native
  def InsertCaptionXP(Label: js.Any, Title: Unit, TitleAutoText: js.Any): Unit = js.native
  def InsertCaptionXP(Label: js.Any, Title: Unit, TitleAutoText: js.Any, Position: js.Any): Unit = js.native
  def InsertCaptionXP(Label: js.Any, Title: Unit, TitleAutoText: Unit, Position: js.Any): Unit = js.native
  
  def InsertCrossReference(ReferenceType: js.Any, ReferenceKind: WdReferenceKind, ReferenceItem: js.Any): Unit = js.native
  def InsertCrossReference(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: js.Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: js.Any,
    IncludePosition: js.Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: js.Any,
    IncludePosition: js.Any,
    SeparateNumbers: js.Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: js.Any,
    IncludePosition: js.Any,
    SeparateNumbers: js.Any,
    SeparatorString: js.Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: js.Any,
    IncludePosition: js.Any,
    SeparateNumbers: Unit,
    SeparatorString: js.Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: js.Any,
    IncludePosition: Unit,
    SeparateNumbers: js.Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: js.Any,
    IncludePosition: Unit,
    SeparateNumbers: js.Any,
    SeparatorString: js.Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: js.Any,
    IncludePosition: Unit,
    SeparateNumbers: Unit,
    SeparatorString: js.Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: Unit,
    IncludePosition: js.Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: Unit,
    IncludePosition: js.Any,
    SeparateNumbers: js.Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: Unit,
    IncludePosition: js.Any,
    SeparateNumbers: js.Any,
    SeparatorString: js.Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: Unit,
    IncludePosition: js.Any,
    SeparateNumbers: Unit,
    SeparatorString: js.Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: Unit,
    IncludePosition: Unit,
    SeparateNumbers: js.Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: Unit,
    IncludePosition: Unit,
    SeparateNumbers: js.Any,
    SeparatorString: js.Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: Unit,
    IncludePosition: Unit,
    SeparateNumbers: Unit,
    SeparatorString: js.Any
  ): Unit = js.native
  
  def InsertCrossReference_2002(ReferenceType: js.Any, ReferenceKind: WdReferenceKind, ReferenceItem: js.Any): Unit = js.native
  def InsertCrossReference_2002(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: js.Any
  ): Unit = js.native
  def InsertCrossReference_2002(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: js.Any,
    IncludePosition: js.Any
  ): Unit = js.native
  def InsertCrossReference_2002(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: Unit,
    IncludePosition: js.Any
  ): Unit = js.native
  
  def InsertDatabase(
    Format: js.UndefOr[js.Any],
    Style: js.UndefOr[js.Any],
    LinkToSource: js.UndefOr[js.Any],
    Connection: js.UndefOr[js.Any],
    SQLStatement: js.UndefOr[js.Any],
    SQLStatement1: js.UndefOr[js.Any],
    PasswordDocument: js.UndefOr[js.Any],
    PasswordTemplate: js.UndefOr[js.Any],
    WritePasswordDocument: js.UndefOr[js.Any],
    WritePasswordTemplate: js.UndefOr[js.Any],
    DataSource: js.UndefOr[js.Any],
    From: js.UndefOr[js.Any],
    To: js.UndefOr[js.Any],
    IncludeFields: js.UndefOr[js.Any]
  ): Unit = js.native
  
  def InsertDateTime(): Unit = js.native
  def InsertDateTime(DateTimeFormat: js.Any): Unit = js.native
  def InsertDateTime(DateTimeFormat: js.Any, InsertAsField: js.Any): Unit = js.native
  def InsertDateTime(DateTimeFormat: js.Any, InsertAsField: js.Any, InsertAsFullWidth: js.Any): Unit = js.native
  def InsertDateTime(DateTimeFormat: js.Any, InsertAsField: js.Any, InsertAsFullWidth: js.Any, DateLanguage: js.Any): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: js.Any,
    InsertAsField: js.Any,
    InsertAsFullWidth: js.Any,
    DateLanguage: js.Any,
    CalendarType: js.Any
  ): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: js.Any,
    InsertAsField: js.Any,
    InsertAsFullWidth: js.Any,
    DateLanguage: Unit,
    CalendarType: js.Any
  ): Unit = js.native
  def InsertDateTime(DateTimeFormat: js.Any, InsertAsField: js.Any, InsertAsFullWidth: Unit, DateLanguage: js.Any): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: js.Any,
    InsertAsField: js.Any,
    InsertAsFullWidth: Unit,
    DateLanguage: js.Any,
    CalendarType: js.Any
  ): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: js.Any,
    InsertAsField: js.Any,
    InsertAsFullWidth: Unit,
    DateLanguage: Unit,
    CalendarType: js.Any
  ): Unit = js.native
  def InsertDateTime(DateTimeFormat: js.Any, InsertAsField: Unit, InsertAsFullWidth: js.Any): Unit = js.native
  def InsertDateTime(DateTimeFormat: js.Any, InsertAsField: Unit, InsertAsFullWidth: js.Any, DateLanguage: js.Any): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: js.Any,
    InsertAsField: Unit,
    InsertAsFullWidth: js.Any,
    DateLanguage: js.Any,
    CalendarType: js.Any
  ): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: js.Any,
    InsertAsField: Unit,
    InsertAsFullWidth: js.Any,
    DateLanguage: Unit,
    CalendarType: js.Any
  ): Unit = js.native
  def InsertDateTime(DateTimeFormat: js.Any, InsertAsField: Unit, InsertAsFullWidth: Unit, DateLanguage: js.Any): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: js.Any,
    InsertAsField: Unit,
    InsertAsFullWidth: Unit,
    DateLanguage: js.Any,
    CalendarType: js.Any
  ): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: js.Any,
    InsertAsField: Unit,
    InsertAsFullWidth: Unit,
    DateLanguage: Unit,
    CalendarType: js.Any
  ): Unit = js.native
  def InsertDateTime(DateTimeFormat: Unit, InsertAsField: js.Any): Unit = js.native
  def InsertDateTime(DateTimeFormat: Unit, InsertAsField: js.Any, InsertAsFullWidth: js.Any): Unit = js.native
  def InsertDateTime(DateTimeFormat: Unit, InsertAsField: js.Any, InsertAsFullWidth: js.Any, DateLanguage: js.Any): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: Unit,
    InsertAsField: js.Any,
    InsertAsFullWidth: js.Any,
    DateLanguage: js.Any,
    CalendarType: js.Any
  ): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: Unit,
    InsertAsField: js.Any,
    InsertAsFullWidth: js.Any,
    DateLanguage: Unit,
    CalendarType: js.Any
  ): Unit = js.native
  def InsertDateTime(DateTimeFormat: Unit, InsertAsField: js.Any, InsertAsFullWidth: Unit, DateLanguage: js.Any): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: Unit,
    InsertAsField: js.Any,
    InsertAsFullWidth: Unit,
    DateLanguage: js.Any,
    CalendarType: js.Any
  ): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: Unit,
    InsertAsField: js.Any,
    InsertAsFullWidth: Unit,
    DateLanguage: Unit,
    CalendarType: js.Any
  ): Unit = js.native
  def InsertDateTime(DateTimeFormat: Unit, InsertAsField: Unit, InsertAsFullWidth: js.Any): Unit = js.native
  def InsertDateTime(DateTimeFormat: Unit, InsertAsField: Unit, InsertAsFullWidth: js.Any, DateLanguage: js.Any): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: Unit,
    InsertAsField: Unit,
    InsertAsFullWidth: js.Any,
    DateLanguage: js.Any,
    CalendarType: js.Any
  ): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: Unit,
    InsertAsField: Unit,
    InsertAsFullWidth: js.Any,
    DateLanguage: Unit,
    CalendarType: js.Any
  ): Unit = js.native
  def InsertDateTime(DateTimeFormat: Unit, InsertAsField: Unit, InsertAsFullWidth: Unit, DateLanguage: js.Any): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: Unit,
    InsertAsField: Unit,
    InsertAsFullWidth: Unit,
    DateLanguage: js.Any,
    CalendarType: js.Any
  ): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: Unit,
    InsertAsField: Unit,
    InsertAsFullWidth: Unit,
    DateLanguage: Unit,
    CalendarType: js.Any
  ): Unit = js.native
  
  def InsertDateTimeOld(): Unit = js.native
  def InsertDateTimeOld(DateTimeFormat: js.Any): Unit = js.native
  def InsertDateTimeOld(DateTimeFormat: js.Any, InsertAsField: js.Any): Unit = js.native
  def InsertDateTimeOld(DateTimeFormat: js.Any, InsertAsField: js.Any, InsertAsFullWidth: js.Any): Unit = js.native
  def InsertDateTimeOld(DateTimeFormat: js.Any, InsertAsField: Unit, InsertAsFullWidth: js.Any): Unit = js.native
  def InsertDateTimeOld(DateTimeFormat: Unit, InsertAsField: js.Any): Unit = js.native
  def InsertDateTimeOld(DateTimeFormat: Unit, InsertAsField: js.Any, InsertAsFullWidth: js.Any): Unit = js.native
  def InsertDateTimeOld(DateTimeFormat: Unit, InsertAsField: Unit, InsertAsFullWidth: js.Any): Unit = js.native
  
  def InsertFile(FileName: String): Unit = js.native
  def InsertFile(FileName: String, Range: js.Any): Unit = js.native
  def InsertFile(FileName: String, Range: js.Any, ConfirmConversions: js.Any): Unit = js.native
  def InsertFile(FileName: String, Range: js.Any, ConfirmConversions: js.Any, Link: js.Any): Unit = js.native
  def InsertFile(FileName: String, Range: js.Any, ConfirmConversions: js.Any, Link: js.Any, Attachment: js.Any): Unit = js.native
  def InsertFile(FileName: String, Range: js.Any, ConfirmConversions: js.Any, Link: Unit, Attachment: js.Any): Unit = js.native
  def InsertFile(FileName: String, Range: js.Any, ConfirmConversions: Unit, Link: js.Any): Unit = js.native
  def InsertFile(FileName: String, Range: js.Any, ConfirmConversions: Unit, Link: js.Any, Attachment: js.Any): Unit = js.native
  def InsertFile(FileName: String, Range: js.Any, ConfirmConversions: Unit, Link: Unit, Attachment: js.Any): Unit = js.native
  def InsertFile(FileName: String, Range: Unit, ConfirmConversions: js.Any): Unit = js.native
  def InsertFile(FileName: String, Range: Unit, ConfirmConversions: js.Any, Link: js.Any): Unit = js.native
  def InsertFile(FileName: String, Range: Unit, ConfirmConversions: js.Any, Link: js.Any, Attachment: js.Any): Unit = js.native
  def InsertFile(FileName: String, Range: Unit, ConfirmConversions: js.Any, Link: Unit, Attachment: js.Any): Unit = js.native
  def InsertFile(FileName: String, Range: Unit, ConfirmConversions: Unit, Link: js.Any): Unit = js.native
  def InsertFile(FileName: String, Range: Unit, ConfirmConversions: Unit, Link: js.Any, Attachment: js.Any): Unit = js.native
  def InsertFile(FileName: String, Range: Unit, ConfirmConversions: Unit, Link: Unit, Attachment: js.Any): Unit = js.native
  
  def InsertParagraph(): Unit = js.native
  
  def InsertParagraphAfter(): Unit = js.native
  
  def InsertParagraphBefore(): Unit = js.native
  
  def InsertSymbol(CharacterNumber: Double): Unit = js.native
  def InsertSymbol(CharacterNumber: Double, Font: js.Any): Unit = js.native
  def InsertSymbol(CharacterNumber: Double, Font: js.Any, Unicode: js.Any): Unit = js.native
  def InsertSymbol(CharacterNumber: Double, Font: js.Any, Unicode: js.Any, Bias: js.Any): Unit = js.native
  def InsertSymbol(CharacterNumber: Double, Font: js.Any, Unicode: Unit, Bias: js.Any): Unit = js.native
  def InsertSymbol(CharacterNumber: Double, Font: Unit, Unicode: js.Any): Unit = js.native
  def InsertSymbol(CharacterNumber: Double, Font: Unit, Unicode: js.Any, Bias: js.Any): Unit = js.native
  def InsertSymbol(CharacterNumber: Double, Font: Unit, Unicode: Unit, Bias: js.Any): Unit = js.native
  
  def InsertXML(XML: String): Unit = js.native
  def InsertXML(XML: String, Transform: js.Any): Unit = js.native
  
  val IsEndOfRowMark: Boolean = js.native
  
  def IsEqual(Range: Range): Boolean = js.native
  
  var Italic: Boolean | `9999999` | `9999998` = js.native
  
  var ItalicBi: Boolean | `9999999` | `9999998` = js.native
  
  var Kana: WdKana = js.native
  
  var LanguageDetected: Boolean = js.native
  
  var LanguageID: WdLanguageID = js.native
  
  var LanguageIDFarEast: WdLanguageID = js.native
  
  var LanguageIDOther: WdLanguageID = js.native
  
  val ListFormat: typings.activexWord.Word.ListFormat = js.native
  
  val ListParagraphs: typings.activexWord.Word.ListParagraphs = js.native
  
  val ListStyle: js.Any = js.native
  
  val Locks: CoAuthLocks = js.native
  
  def LookupNameProperties(): Unit = js.native
  
  def ModifyEnclosure(Style: js.Any): Unit = js.native
  def ModifyEnclosure(Style: js.Any, Symbol: js.Any): Unit = js.native
  def ModifyEnclosure(Style: js.Any, Symbol: js.Any, EnclosedText: js.Any): Unit = js.native
  def ModifyEnclosure(Style: js.Any, Symbol: Unit, EnclosedText: js.Any): Unit = js.native
  
  def Move(): Double = js.native
  def Move(Unit: Unit, Count: Double): Double = js.native
  def Move(Unit: WdUnits): Double = js.native
  def Move(Unit: WdUnits, Count: Double): Double = js.native
  
  def MoveEnd(): Double = js.native
  def MoveEnd(Unit: Unit, Count: Double): Double = js.native
  def MoveEnd(Unit: WdUnits): Double = js.native
  def MoveEnd(Unit: WdUnits, Count: Double): Double = js.native
  
  def MoveEndUntil(Cset: js.Any): Double = js.native
  def MoveEndUntil(Cset: js.Any, Count: js.Any): Double = js.native
  
  def MoveEndWhile(Cset: js.Any): Double = js.native
  def MoveEndWhile(Cset: js.Any, Count: js.Any): Double = js.native
  
  def MoveStart(): Double = js.native
  def MoveStart(Unit: Unit, Count: Double): Double = js.native
  def MoveStart(Unit: WdUnits): Double = js.native
  def MoveStart(Unit: WdUnits, Count: Double): Double = js.native
  
  def MoveStartUntil(Cset: js.Any): Double = js.native
  def MoveStartUntil(Cset: js.Any, Count: js.Any): Double = js.native
  
  def MoveStartWhile(Cset: js.Any): Double = js.native
  def MoveStartWhile(Cset: js.Any, Count: js.Any): Double = js.native
  
  def MoveUntil(Cset: js.Any): Double = js.native
  def MoveUntil(Cset: js.Any, Count: js.Any): Double = js.native
  
  def MoveWhile(Cset: js.Any): Double = js.native
  def MoveWhile(Cset: js.Any, Count: js.Any): Double = js.native
  
  def Next(): Range = js.native
  def Next(Unit: js.Any): Range = js.native
  def Next(Unit: js.Any, Count: js.Any): Range = js.native
  def Next(Unit: Unit, Count: js.Any): Range = js.native
  
  val NextStoryRange: Range = js.native
  
  def NextSubdocument(): Unit = js.native
  
  var NoProofing: Double = js.native
  
  val OMaths: typings.activexWord.Word.OMaths = js.native
  
  var Orientation: WdTextOrientation = js.native
  
  var PageSetup: typings.activexWord.Word.PageSetup = js.native
  
  var ParagraphFormat: typings.activexWord.Word.ParagraphFormat = js.native
  
  val ParagraphStyle: js.Any = js.native
  
  val Paragraphs: typings.activexWord.Word.Paragraphs = js.native
  
  val Parent: js.Any = js.native
  
  val ParentContentControl: ContentControl = js.native
  
  def Paste(): Unit = js.native
  
  def PasteAndFormat(Type: WdRecoveryType): Unit = js.native
  
  def PasteAppendTable(): Unit = js.native
  
  def PasteAsNestedTable(): Unit = js.native
  
  def PasteExcelTable(LinkedToExcel: Boolean, WordFormatting: Boolean, RTF: Boolean): Unit = js.native
  
  def PasteSpecial(
    IconIndex: js.UndefOr[js.Any],
    Link: js.UndefOr[js.Any],
    Placement: js.UndefOr[js.Any],
    DisplayAsIcon: js.UndefOr[js.Any],
    DataType: js.UndefOr[js.Any],
    IconFileName: js.UndefOr[js.Any],
    IconLabel: js.UndefOr[js.Any]
  ): Unit = js.native
  
  /**
    * @param Word.WdPhoneticGuideAlignmentType [Alignment=-1]
    * @param number [Raise=0]
    * @param number [FontSize=0]
    * @param string [FontName='']
    */
  def PhoneticGuide(Text: String): Unit = js.native
  def PhoneticGuide(Text: String, Alignment: Unit, Raise: Double): Unit = js.native
  def PhoneticGuide(Text: String, Alignment: Unit, Raise: Double, FontSize: Double): Unit = js.native
  def PhoneticGuide(Text: String, Alignment: Unit, Raise: Double, FontSize: Double, FontName: String): Unit = js.native
  def PhoneticGuide(Text: String, Alignment: Unit, Raise: Double, FontSize: Unit, FontName: String): Unit = js.native
  def PhoneticGuide(Text: String, Alignment: Unit, Raise: Unit, FontSize: Double): Unit = js.native
  def PhoneticGuide(Text: String, Alignment: Unit, Raise: Unit, FontSize: Double, FontName: String): Unit = js.native
  def PhoneticGuide(Text: String, Alignment: Unit, Raise: Unit, FontSize: Unit, FontName: String): Unit = js.native
  def PhoneticGuide(Text: String, Alignment: WdPhoneticGuideAlignmentType): Unit = js.native
  def PhoneticGuide(Text: String, Alignment: WdPhoneticGuideAlignmentType, Raise: Double): Unit = js.native
  def PhoneticGuide(Text: String, Alignment: WdPhoneticGuideAlignmentType, Raise: Double, FontSize: Double): Unit = js.native
  def PhoneticGuide(
    Text: String,
    Alignment: WdPhoneticGuideAlignmentType,
    Raise: Double,
    FontSize: Double,
    FontName: String
  ): Unit = js.native
  def PhoneticGuide(
    Text: String,
    Alignment: WdPhoneticGuideAlignmentType,
    Raise: Double,
    FontSize: Unit,
    FontName: String
  ): Unit = js.native
  def PhoneticGuide(Text: String, Alignment: WdPhoneticGuideAlignmentType, Raise: Unit, FontSize: Double): Unit = js.native
  def PhoneticGuide(
    Text: String,
    Alignment: WdPhoneticGuideAlignmentType,
    Raise: Unit,
    FontSize: Double,
    FontName: String
  ): Unit = js.native
  def PhoneticGuide(
    Text: String,
    Alignment: WdPhoneticGuideAlignmentType,
    Raise: Unit,
    FontSize: Unit,
    FontName: String
  ): Unit = js.native
  
  def Previous(): Range = js.native
  def Previous(Unit: js.Any): Range = js.native
  def Previous(Unit: js.Any, Count: js.Any): Range = js.native
  def Previous(Unit: Unit, Count: js.Any): Range = js.native
  
  val PreviousBookmarkID: Double = js.native
  
  def PreviousSubdocument(): Unit = js.native
  
  val ReadabilityStatistics: typings.activexWord.Word.ReadabilityStatistics = js.native
  
  def Relocate(Direction: Double): Unit = js.native
  
  val Revisions: typings.activexWord.Word.Revisions = js.native
  
  val Rows: typings.activexWord.Word.Rows = js.native
  
  def Scripts(Index: js.Any): Script = js.native
  @JSName("Scripts")
  val Scripts_Original: Scripts = js.native
  
  val Sections: typings.activexWord.Word.Sections = js.native
  
  def Select(): Unit = js.native
  
  val Sentences: typings.activexWord.Word.Sentences = js.native
  
  def SetListLevel(Level: Double): Unit = js.native
  
  def SetRange(Start: Double, End: Double): Unit = js.native
  
  val Shading: typings.activexWord.Word.Shading = js.native
  
  val ShapeRange: typings.activexWord.Word.ShapeRange = js.native
  
  var ShowAll: Boolean = js.native
  
  val SmartTags: typings.activexWord.Word.SmartTags = js.native
  
  def Sort(
    ExcludeHeader: js.UndefOr[js.Any],
    FieldNumber: js.UndefOr[js.Any],
    SortFieldType: js.UndefOr[js.Any],
    SortOrder: js.UndefOr[js.Any],
    FieldNumber2: js.UndefOr[js.Any],
    SortFieldType2: js.UndefOr[js.Any],
    SortOrder2: js.UndefOr[js.Any],
    FieldNumber3: js.UndefOr[js.Any],
    SortFieldType3: js.UndefOr[js.Any],
    SortOrder3: js.UndefOr[js.Any],
    SortColumn: js.UndefOr[js.Any],
    Separator: js.UndefOr[js.Any],
    CaseSensitive: js.UndefOr[js.Any],
    BidiSort: js.UndefOr[js.Any],
    IgnoreThe: js.UndefOr[js.Any],
    IgnoreKashida: js.UndefOr[js.Any],
    IgnoreDiacritics: js.UndefOr[js.Any],
    IgnoreHe: js.UndefOr[js.Any],
    LanguageID: js.UndefOr[js.Any]
  ): Unit = js.native
  
  def SortAscending(): Unit = js.native
  
  def SortDescending(): Unit = js.native
  
  def SortOld(
    ExcludeHeader: js.UndefOr[js.Any],
    FieldNumber: js.UndefOr[js.Any],
    SortFieldType: js.UndefOr[js.Any],
    SortOrder: js.UndefOr[js.Any],
    FieldNumber2: js.UndefOr[js.Any],
    SortFieldType2: js.UndefOr[js.Any],
    SortOrder2: js.UndefOr[js.Any],
    FieldNumber3: js.UndefOr[js.Any],
    SortFieldType3: js.UndefOr[js.Any],
    SortOrder3: js.UndefOr[js.Any],
    SortColumn: js.UndefOr[js.Any],
    Separator: js.UndefOr[js.Any],
    CaseSensitive: js.UndefOr[js.Any],
    LanguageID: js.UndefOr[js.Any]
  ): Unit = js.native
  
  var SpellingChecked: Boolean = js.native
  
  val SpellingErrors: ProofreadingErrors = js.native
  
  var Start: Double = js.native
  
  def StartOf(): Double = js.native
  def StartOf(Unit: js.Any): Double = js.native
  def StartOf(Unit: js.Any, Extend: js.Any): Double = js.native
  def StartOf(Unit: Unit, Extend: js.Any): Double = js.native
  
  val StoryLength: Double = js.native
  
  val StoryType: WdStoryType = js.native
  
  var Style: js.Any = js.native
  
  val Subdocuments: typings.activexWord.Word.Subdocuments = js.native
  
  def SubscribeTo(Edition: String): Unit = js.native
  def SubscribeTo(Edition: String, Format: js.Any): Unit = js.native
  
  val SynonymInfo: typings.activexWord.Word.SynonymInfo = js.native
  
  /**
    * @param Word.WdTCSCConverterDirection [WdTCSCConverterDirection=2]
    * @param boolean [CommonTerms=false]
    * @param boolean [UseVariants=false]
    */
  def TCSCConverter(): Unit = js.native
  def TCSCConverter(WdTCSCConverterDirection: Unit, CommonTerms: Boolean): Unit = js.native
  def TCSCConverter(WdTCSCConverterDirection: Unit, CommonTerms: Boolean, UseVariants: Boolean): Unit = js.native
  def TCSCConverter(WdTCSCConverterDirection: Unit, CommonTerms: Unit, UseVariants: Boolean): Unit = js.native
  def TCSCConverter(WdTCSCConverterDirection: WdTCSCConverterDirection): Unit = js.native
  def TCSCConverter(WdTCSCConverterDirection: WdTCSCConverterDirection, CommonTerms: Boolean): Unit = js.native
  def TCSCConverter(WdTCSCConverterDirection: WdTCSCConverterDirection, CommonTerms: Boolean, UseVariants: Boolean): Unit = js.native
  def TCSCConverter(WdTCSCConverterDirection: WdTCSCConverterDirection, CommonTerms: Unit, UseVariants: Boolean): Unit = js.native
  
  val TableStyle: js.Any = js.native
  
  val Tables: typings.activexWord.Word.Tables = js.native
  
  var Text: String = js.native
  
  var TextRetrievalMode: typings.activexWord.Word.TextRetrievalMode = js.native
  
  val TopLevelTables: typings.activexWord.Word.Tables = js.native
  
  var TwoLinesInOne: WdTwoLinesInOneType = js.native
  
  var Underline: WdUnderline = js.native
  
  val Updates: CoAuthUpdates = js.native
  
  def WholeStory(): Unit = js.native
  
  /* private */ @JSName("Word.Range_typekey")
  var WordDotRange_typekey: Range = js.native
  
  val WordOpenXML: String = js.native
  
  val Words: typings.activexWord.Word.Words = js.native
  
  /** @param boolean [DataOnly=false] */
  def XML(): String = js.native
  def XML(DataOnly: Boolean): String = js.native
  
  val XMLNodes: typings.activexWord.Word.XMLNodes = js.native
  
  val XMLParentNode: XMLNode = js.native
}
