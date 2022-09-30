package typings.activexWord.Word

import typings.activexOffice.Office.Script
import typings.activexOffice.Office.Scripts
import typings.activexWord.activexWordInts.`9999998`
import typings.activexWord.activexWordInts.`9999999`
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
  
  val CharacterStyle: Any = js.native
  
  var CharacterWidth: WdCharacterWidth = js.native
  
  val Characters: typings.activexWord.Word.Characters = js.native
  
  def CheckGrammar(): Unit = js.native
  
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
  def ConvertHangulAndHanja(ConversionsMode: Any): Unit = js.native
  def ConvertHangulAndHanja(ConversionsMode: Any, FastConversion: Any): Unit = js.native
  def ConvertHangulAndHanja(ConversionsMode: Any, FastConversion: Any, CheckHangulEnding: Any): Unit = js.native
  def ConvertHangulAndHanja(ConversionsMode: Any, FastConversion: Any, CheckHangulEnding: Any, EnableRecentOrdering: Any): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: Any,
    FastConversion: Any,
    CheckHangulEnding: Any,
    EnableRecentOrdering: Any,
    CustomDictionary: Any
  ): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: Any,
    FastConversion: Any,
    CheckHangulEnding: Any,
    EnableRecentOrdering: Unit,
    CustomDictionary: Any
  ): Unit = js.native
  def ConvertHangulAndHanja(ConversionsMode: Any, FastConversion: Any, CheckHangulEnding: Unit, EnableRecentOrdering: Any): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: Any,
    FastConversion: Any,
    CheckHangulEnding: Unit,
    EnableRecentOrdering: Any,
    CustomDictionary: Any
  ): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: Any,
    FastConversion: Any,
    CheckHangulEnding: Unit,
    EnableRecentOrdering: Unit,
    CustomDictionary: Any
  ): Unit = js.native
  def ConvertHangulAndHanja(ConversionsMode: Any, FastConversion: Unit, CheckHangulEnding: Any): Unit = js.native
  def ConvertHangulAndHanja(ConversionsMode: Any, FastConversion: Unit, CheckHangulEnding: Any, EnableRecentOrdering: Any): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: Any,
    FastConversion: Unit,
    CheckHangulEnding: Any,
    EnableRecentOrdering: Any,
    CustomDictionary: Any
  ): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: Any,
    FastConversion: Unit,
    CheckHangulEnding: Any,
    EnableRecentOrdering: Unit,
    CustomDictionary: Any
  ): Unit = js.native
  def ConvertHangulAndHanja(ConversionsMode: Any, FastConversion: Unit, CheckHangulEnding: Unit, EnableRecentOrdering: Any): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: Any,
    FastConversion: Unit,
    CheckHangulEnding: Unit,
    EnableRecentOrdering: Any,
    CustomDictionary: Any
  ): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: Any,
    FastConversion: Unit,
    CheckHangulEnding: Unit,
    EnableRecentOrdering: Unit,
    CustomDictionary: Any
  ): Unit = js.native
  def ConvertHangulAndHanja(ConversionsMode: Unit, FastConversion: Any): Unit = js.native
  def ConvertHangulAndHanja(ConversionsMode: Unit, FastConversion: Any, CheckHangulEnding: Any): Unit = js.native
  def ConvertHangulAndHanja(ConversionsMode: Unit, FastConversion: Any, CheckHangulEnding: Any, EnableRecentOrdering: Any): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: Unit,
    FastConversion: Any,
    CheckHangulEnding: Any,
    EnableRecentOrdering: Any,
    CustomDictionary: Any
  ): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: Unit,
    FastConversion: Any,
    CheckHangulEnding: Any,
    EnableRecentOrdering: Unit,
    CustomDictionary: Any
  ): Unit = js.native
  def ConvertHangulAndHanja(ConversionsMode: Unit, FastConversion: Any, CheckHangulEnding: Unit, EnableRecentOrdering: Any): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: Unit,
    FastConversion: Any,
    CheckHangulEnding: Unit,
    EnableRecentOrdering: Any,
    CustomDictionary: Any
  ): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: Unit,
    FastConversion: Any,
    CheckHangulEnding: Unit,
    EnableRecentOrdering: Unit,
    CustomDictionary: Any
  ): Unit = js.native
  def ConvertHangulAndHanja(ConversionsMode: Unit, FastConversion: Unit, CheckHangulEnding: Any): Unit = js.native
  def ConvertHangulAndHanja(ConversionsMode: Unit, FastConversion: Unit, CheckHangulEnding: Any, EnableRecentOrdering: Any): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: Unit,
    FastConversion: Unit,
    CheckHangulEnding: Any,
    EnableRecentOrdering: Any,
    CustomDictionary: Any
  ): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: Unit,
    FastConversion: Unit,
    CheckHangulEnding: Any,
    EnableRecentOrdering: Unit,
    CustomDictionary: Any
  ): Unit = js.native
  def ConvertHangulAndHanja(ConversionsMode: Unit, FastConversion: Unit, CheckHangulEnding: Unit, EnableRecentOrdering: Any): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: Unit,
    FastConversion: Unit,
    CheckHangulEnding: Unit,
    EnableRecentOrdering: Any,
    CustomDictionary: Any
  ): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: Unit,
    FastConversion: Unit,
    CheckHangulEnding: Unit,
    EnableRecentOrdering: Unit,
    CustomDictionary: Any
  ): Unit = js.native
  
  def ConvertToTable(
    Separator: js.UndefOr[Any],
    NumRows: js.UndefOr[Any],
    NumColumns: js.UndefOr[Any],
    InitialColumnWidth: js.UndefOr[Any],
    Format: js.UndefOr[Any],
    ApplyBorders: js.UndefOr[Any],
    ApplyShading: js.UndefOr[Any],
    ApplyFont: js.UndefOr[Any],
    ApplyColor: js.UndefOr[Any],
    ApplyHeadingRows: js.UndefOr[Any],
    ApplyLastRow: js.UndefOr[Any],
    ApplyFirstColumn: js.UndefOr[Any],
    ApplyLastColumn: js.UndefOr[Any],
    AutoFit: js.UndefOr[Any],
    AutoFitBehavior: js.UndefOr[Any],
    DefaultTableBehavior: js.UndefOr[Any]
  ): Table = js.native
  
  def ConvertToTableOld(
    Separator: js.UndefOr[Any],
    NumRows: js.UndefOr[Any],
    NumColumns: js.UndefOr[Any],
    InitialColumnWidth: js.UndefOr[Any],
    Format: js.UndefOr[Any],
    ApplyBorders: js.UndefOr[Any],
    ApplyShading: js.UndefOr[Any],
    ApplyFont: js.UndefOr[Any],
    ApplyColor: js.UndefOr[Any],
    ApplyHeadingRows: js.UndefOr[Any],
    ApplyLastRow: js.UndefOr[Any],
    ApplyFirstColumn: js.UndefOr[Any],
    ApplyLastColumn: js.UndefOr[Any],
    AutoFit: js.UndefOr[Any]
  ): Table = js.native
  
  def Copy(): Unit = js.native
  
  def CopyAsPicture(): Unit = js.native
  
  def CreatePublisher(): Unit = js.native
  def CreatePublisher(Edition: Any): Unit = js.native
  def CreatePublisher(Edition: Any, ContainsPICT: Any): Unit = js.native
  def CreatePublisher(Edition: Any, ContainsPICT: Any, ContainsRTF: Any): Unit = js.native
  def CreatePublisher(Edition: Any, ContainsPICT: Any, ContainsRTF: Any, ContainsText: Any): Unit = js.native
  def CreatePublisher(Edition: Any, ContainsPICT: Any, ContainsRTF: Unit, ContainsText: Any): Unit = js.native
  def CreatePublisher(Edition: Any, ContainsPICT: Unit, ContainsRTF: Any): Unit = js.native
  def CreatePublisher(Edition: Any, ContainsPICT: Unit, ContainsRTF: Any, ContainsText: Any): Unit = js.native
  def CreatePublisher(Edition: Any, ContainsPICT: Unit, ContainsRTF: Unit, ContainsText: Any): Unit = js.native
  def CreatePublisher(Edition: Unit, ContainsPICT: Any): Unit = js.native
  def CreatePublisher(Edition: Unit, ContainsPICT: Any, ContainsRTF: Any): Unit = js.native
  def CreatePublisher(Edition: Unit, ContainsPICT: Any, ContainsRTF: Any, ContainsText: Any): Unit = js.native
  def CreatePublisher(Edition: Unit, ContainsPICT: Any, ContainsRTF: Unit, ContainsText: Any): Unit = js.native
  def CreatePublisher(Edition: Unit, ContainsPICT: Unit, ContainsRTF: Any): Unit = js.native
  def CreatePublisher(Edition: Unit, ContainsPICT: Unit, ContainsRTF: Any, ContainsText: Any): Unit = js.native
  def CreatePublisher(Edition: Unit, ContainsPICT: Unit, ContainsRTF: Unit, ContainsText: Any): Unit = js.native
  
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
  def EndOf(Unit: Any): Double = js.native
  def EndOf(Unit: Any, Extend: Any): Double = js.native
  def EndOf(Unit: Unit, Extend: Any): Double = js.native
  
  val EndnoteOptions: typings.activexWord.Word.EndnoteOptions = js.native
  
  val Endnotes: typings.activexWord.Word.Endnotes = js.native
  
  val EnhMetaFileBits: Any = js.native
  
  def Expand(): Double = js.native
  def Expand(Unit: Any): Double = js.native
  
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
    FixedFormatExtClassPtr: js.UndefOr[Any]
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
    CustomDictionary: js.UndefOr[Any],
    IgnoreUppercase: js.UndefOr[Any],
    MainDictionary: js.UndefOr[Any],
    SuggestionMode: js.UndefOr[Any],
    CustomDictionary2: js.UndefOr[Any],
    CustomDictionary3: js.UndefOr[Any],
    CustomDictionary4: js.UndefOr[Any],
    CustomDictionary5: js.UndefOr[Any],
    CustomDictionary6: js.UndefOr[Any],
    CustomDictionary7: js.UndefOr[Any],
    CustomDictionary8: js.UndefOr[Any],
    CustomDictionary9: js.UndefOr[Any],
    CustomDictionary10: js.UndefOr[Any]
  ): SpellingSuggestions = js.native
  
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
  
  def GoToEditableRange(): Range = js.native
  def GoToEditableRange(EditorID: Any): Range = js.native
  
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
  
  def Information(Type: WdInformation): Any = js.native
  
  val InlineShapes: typings.activexWord.Word.InlineShapes = js.native
  
  def InsertAfter(Text: String): Unit = js.native
  
  /** @param number [RelativeTo=0] */
  def InsertAlignmentTab(Alignment: Double): Unit = js.native
  def InsertAlignmentTab(Alignment: Double, RelativeTo: Double): Unit = js.native
  
  def InsertAutoText(): Unit = js.native
  
  def InsertBefore(Text: String): Unit = js.native
  
  def InsertBreak(): Unit = js.native
  def InsertBreak(Type: Any): Unit = js.native
  
  def InsertCaption(Label: Any): Unit = js.native
  def InsertCaption(Label: Any, Title: Any): Unit = js.native
  def InsertCaption(Label: Any, Title: Any, TitleAutoText: Any): Unit = js.native
  def InsertCaption(Label: Any, Title: Any, TitleAutoText: Any, Position: Any): Unit = js.native
  def InsertCaption(Label: Any, Title: Any, TitleAutoText: Any, Position: Any, ExcludeLabel: Any): Unit = js.native
  def InsertCaption(Label: Any, Title: Any, TitleAutoText: Any, Position: Unit, ExcludeLabel: Any): Unit = js.native
  def InsertCaption(Label: Any, Title: Any, TitleAutoText: Unit, Position: Any): Unit = js.native
  def InsertCaption(Label: Any, Title: Any, TitleAutoText: Unit, Position: Any, ExcludeLabel: Any): Unit = js.native
  def InsertCaption(Label: Any, Title: Any, TitleAutoText: Unit, Position: Unit, ExcludeLabel: Any): Unit = js.native
  def InsertCaption(Label: Any, Title: Unit, TitleAutoText: Any): Unit = js.native
  def InsertCaption(Label: Any, Title: Unit, TitleAutoText: Any, Position: Any): Unit = js.native
  def InsertCaption(Label: Any, Title: Unit, TitleAutoText: Any, Position: Any, ExcludeLabel: Any): Unit = js.native
  def InsertCaption(Label: Any, Title: Unit, TitleAutoText: Any, Position: Unit, ExcludeLabel: Any): Unit = js.native
  def InsertCaption(Label: Any, Title: Unit, TitleAutoText: Unit, Position: Any): Unit = js.native
  def InsertCaption(Label: Any, Title: Unit, TitleAutoText: Unit, Position: Any, ExcludeLabel: Any): Unit = js.native
  def InsertCaption(Label: Any, Title: Unit, TitleAutoText: Unit, Position: Unit, ExcludeLabel: Any): Unit = js.native
  
  def InsertCaptionXP(Label: Any): Unit = js.native
  def InsertCaptionXP(Label: Any, Title: Any): Unit = js.native
  def InsertCaptionXP(Label: Any, Title: Any, TitleAutoText: Any): Unit = js.native
  def InsertCaptionXP(Label: Any, Title: Any, TitleAutoText: Any, Position: Any): Unit = js.native
  def InsertCaptionXP(Label: Any, Title: Any, TitleAutoText: Unit, Position: Any): Unit = js.native
  def InsertCaptionXP(Label: Any, Title: Unit, TitleAutoText: Any): Unit = js.native
  def InsertCaptionXP(Label: Any, Title: Unit, TitleAutoText: Any, Position: Any): Unit = js.native
  def InsertCaptionXP(Label: Any, Title: Unit, TitleAutoText: Unit, Position: Any): Unit = js.native
  
  def InsertCrossReference(ReferenceType: Any, ReferenceKind: WdReferenceKind, ReferenceItem: Any): Unit = js.native
  def InsertCrossReference(ReferenceType: Any, ReferenceKind: WdReferenceKind, ReferenceItem: Any, InsertAsHyperlink: Any): Unit = js.native
  def InsertCrossReference(
    ReferenceType: Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: Any,
    InsertAsHyperlink: Any,
    IncludePosition: Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: Any,
    InsertAsHyperlink: Any,
    IncludePosition: Any,
    SeparateNumbers: Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: Any,
    InsertAsHyperlink: Any,
    IncludePosition: Any,
    SeparateNumbers: Any,
    SeparatorString: Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: Any,
    InsertAsHyperlink: Any,
    IncludePosition: Any,
    SeparateNumbers: Unit,
    SeparatorString: Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: Any,
    InsertAsHyperlink: Any,
    IncludePosition: Unit,
    SeparateNumbers: Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: Any,
    InsertAsHyperlink: Any,
    IncludePosition: Unit,
    SeparateNumbers: Any,
    SeparatorString: Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: Any,
    InsertAsHyperlink: Any,
    IncludePosition: Unit,
    SeparateNumbers: Unit,
    SeparatorString: Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: Any,
    InsertAsHyperlink: Unit,
    IncludePosition: Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: Any,
    InsertAsHyperlink: Unit,
    IncludePosition: Any,
    SeparateNumbers: Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: Any,
    InsertAsHyperlink: Unit,
    IncludePosition: Any,
    SeparateNumbers: Any,
    SeparatorString: Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: Any,
    InsertAsHyperlink: Unit,
    IncludePosition: Any,
    SeparateNumbers: Unit,
    SeparatorString: Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: Any,
    InsertAsHyperlink: Unit,
    IncludePosition: Unit,
    SeparateNumbers: Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: Any,
    InsertAsHyperlink: Unit,
    IncludePosition: Unit,
    SeparateNumbers: Any,
    SeparatorString: Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: Any,
    InsertAsHyperlink: Unit,
    IncludePosition: Unit,
    SeparateNumbers: Unit,
    SeparatorString: Any
  ): Unit = js.native
  
  def InsertCrossReference_2002(ReferenceType: Any, ReferenceKind: WdReferenceKind, ReferenceItem: Any): Unit = js.native
  def InsertCrossReference_2002(ReferenceType: Any, ReferenceKind: WdReferenceKind, ReferenceItem: Any, InsertAsHyperlink: Any): Unit = js.native
  def InsertCrossReference_2002(
    ReferenceType: Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: Any,
    InsertAsHyperlink: Any,
    IncludePosition: Any
  ): Unit = js.native
  def InsertCrossReference_2002(
    ReferenceType: Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: Any,
    InsertAsHyperlink: Unit,
    IncludePosition: Any
  ): Unit = js.native
  
  def InsertDatabase(
    Format: js.UndefOr[Any],
    Style: js.UndefOr[Any],
    LinkToSource: js.UndefOr[Any],
    Connection: js.UndefOr[Any],
    SQLStatement: js.UndefOr[Any],
    SQLStatement1: js.UndefOr[Any],
    PasswordDocument: js.UndefOr[Any],
    PasswordTemplate: js.UndefOr[Any],
    WritePasswordDocument: js.UndefOr[Any],
    WritePasswordTemplate: js.UndefOr[Any],
    DataSource: js.UndefOr[Any],
    From: js.UndefOr[Any],
    To: js.UndefOr[Any],
    IncludeFields: js.UndefOr[Any]
  ): Unit = js.native
  
  def InsertDateTime(): Unit = js.native
  def InsertDateTime(DateTimeFormat: Any): Unit = js.native
  def InsertDateTime(DateTimeFormat: Any, InsertAsField: Any): Unit = js.native
  def InsertDateTime(DateTimeFormat: Any, InsertAsField: Any, InsertAsFullWidth: Any): Unit = js.native
  def InsertDateTime(DateTimeFormat: Any, InsertAsField: Any, InsertAsFullWidth: Any, DateLanguage: Any): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: Any,
    InsertAsField: Any,
    InsertAsFullWidth: Any,
    DateLanguage: Any,
    CalendarType: Any
  ): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: Any,
    InsertAsField: Any,
    InsertAsFullWidth: Any,
    DateLanguage: Unit,
    CalendarType: Any
  ): Unit = js.native
  def InsertDateTime(DateTimeFormat: Any, InsertAsField: Any, InsertAsFullWidth: Unit, DateLanguage: Any): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: Any,
    InsertAsField: Any,
    InsertAsFullWidth: Unit,
    DateLanguage: Any,
    CalendarType: Any
  ): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: Any,
    InsertAsField: Any,
    InsertAsFullWidth: Unit,
    DateLanguage: Unit,
    CalendarType: Any
  ): Unit = js.native
  def InsertDateTime(DateTimeFormat: Any, InsertAsField: Unit, InsertAsFullWidth: Any): Unit = js.native
  def InsertDateTime(DateTimeFormat: Any, InsertAsField: Unit, InsertAsFullWidth: Any, DateLanguage: Any): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: Any,
    InsertAsField: Unit,
    InsertAsFullWidth: Any,
    DateLanguage: Any,
    CalendarType: Any
  ): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: Any,
    InsertAsField: Unit,
    InsertAsFullWidth: Any,
    DateLanguage: Unit,
    CalendarType: Any
  ): Unit = js.native
  def InsertDateTime(DateTimeFormat: Any, InsertAsField: Unit, InsertAsFullWidth: Unit, DateLanguage: Any): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: Any,
    InsertAsField: Unit,
    InsertAsFullWidth: Unit,
    DateLanguage: Any,
    CalendarType: Any
  ): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: Any,
    InsertAsField: Unit,
    InsertAsFullWidth: Unit,
    DateLanguage: Unit,
    CalendarType: Any
  ): Unit = js.native
  def InsertDateTime(DateTimeFormat: Unit, InsertAsField: Any): Unit = js.native
  def InsertDateTime(DateTimeFormat: Unit, InsertAsField: Any, InsertAsFullWidth: Any): Unit = js.native
  def InsertDateTime(DateTimeFormat: Unit, InsertAsField: Any, InsertAsFullWidth: Any, DateLanguage: Any): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: Unit,
    InsertAsField: Any,
    InsertAsFullWidth: Any,
    DateLanguage: Any,
    CalendarType: Any
  ): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: Unit,
    InsertAsField: Any,
    InsertAsFullWidth: Any,
    DateLanguage: Unit,
    CalendarType: Any
  ): Unit = js.native
  def InsertDateTime(DateTimeFormat: Unit, InsertAsField: Any, InsertAsFullWidth: Unit, DateLanguage: Any): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: Unit,
    InsertAsField: Any,
    InsertAsFullWidth: Unit,
    DateLanguage: Any,
    CalendarType: Any
  ): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: Unit,
    InsertAsField: Any,
    InsertAsFullWidth: Unit,
    DateLanguage: Unit,
    CalendarType: Any
  ): Unit = js.native
  def InsertDateTime(DateTimeFormat: Unit, InsertAsField: Unit, InsertAsFullWidth: Any): Unit = js.native
  def InsertDateTime(DateTimeFormat: Unit, InsertAsField: Unit, InsertAsFullWidth: Any, DateLanguage: Any): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: Unit,
    InsertAsField: Unit,
    InsertAsFullWidth: Any,
    DateLanguage: Any,
    CalendarType: Any
  ): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: Unit,
    InsertAsField: Unit,
    InsertAsFullWidth: Any,
    DateLanguage: Unit,
    CalendarType: Any
  ): Unit = js.native
  def InsertDateTime(DateTimeFormat: Unit, InsertAsField: Unit, InsertAsFullWidth: Unit, DateLanguage: Any): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: Unit,
    InsertAsField: Unit,
    InsertAsFullWidth: Unit,
    DateLanguage: Any,
    CalendarType: Any
  ): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: Unit,
    InsertAsField: Unit,
    InsertAsFullWidth: Unit,
    DateLanguage: Unit,
    CalendarType: Any
  ): Unit = js.native
  
  def InsertDateTimeOld(): Unit = js.native
  def InsertDateTimeOld(DateTimeFormat: Any): Unit = js.native
  def InsertDateTimeOld(DateTimeFormat: Any, InsertAsField: Any): Unit = js.native
  def InsertDateTimeOld(DateTimeFormat: Any, InsertAsField: Any, InsertAsFullWidth: Any): Unit = js.native
  def InsertDateTimeOld(DateTimeFormat: Any, InsertAsField: Unit, InsertAsFullWidth: Any): Unit = js.native
  def InsertDateTimeOld(DateTimeFormat: Unit, InsertAsField: Any): Unit = js.native
  def InsertDateTimeOld(DateTimeFormat: Unit, InsertAsField: Any, InsertAsFullWidth: Any): Unit = js.native
  def InsertDateTimeOld(DateTimeFormat: Unit, InsertAsField: Unit, InsertAsFullWidth: Any): Unit = js.native
  
  def InsertFile(FileName: String): Unit = js.native
  def InsertFile(FileName: String, Range: Any): Unit = js.native
  def InsertFile(FileName: String, Range: Any, ConfirmConversions: Any): Unit = js.native
  def InsertFile(FileName: String, Range: Any, ConfirmConversions: Any, Link: Any): Unit = js.native
  def InsertFile(FileName: String, Range: Any, ConfirmConversions: Any, Link: Any, Attachment: Any): Unit = js.native
  def InsertFile(FileName: String, Range: Any, ConfirmConversions: Any, Link: Unit, Attachment: Any): Unit = js.native
  def InsertFile(FileName: String, Range: Any, ConfirmConversions: Unit, Link: Any): Unit = js.native
  def InsertFile(FileName: String, Range: Any, ConfirmConversions: Unit, Link: Any, Attachment: Any): Unit = js.native
  def InsertFile(FileName: String, Range: Any, ConfirmConversions: Unit, Link: Unit, Attachment: Any): Unit = js.native
  def InsertFile(FileName: String, Range: Unit, ConfirmConversions: Any): Unit = js.native
  def InsertFile(FileName: String, Range: Unit, ConfirmConversions: Any, Link: Any): Unit = js.native
  def InsertFile(FileName: String, Range: Unit, ConfirmConversions: Any, Link: Any, Attachment: Any): Unit = js.native
  def InsertFile(FileName: String, Range: Unit, ConfirmConversions: Any, Link: Unit, Attachment: Any): Unit = js.native
  def InsertFile(FileName: String, Range: Unit, ConfirmConversions: Unit, Link: Any): Unit = js.native
  def InsertFile(FileName: String, Range: Unit, ConfirmConversions: Unit, Link: Any, Attachment: Any): Unit = js.native
  def InsertFile(FileName: String, Range: Unit, ConfirmConversions: Unit, Link: Unit, Attachment: Any): Unit = js.native
  
  def InsertParagraph(): Unit = js.native
  
  def InsertParagraphAfter(): Unit = js.native
  
  def InsertParagraphBefore(): Unit = js.native
  
  def InsertSymbol(CharacterNumber: Double): Unit = js.native
  def InsertSymbol(CharacterNumber: Double, Font: Any): Unit = js.native
  def InsertSymbol(CharacterNumber: Double, Font: Any, Unicode: Any): Unit = js.native
  def InsertSymbol(CharacterNumber: Double, Font: Any, Unicode: Any, Bias: Any): Unit = js.native
  def InsertSymbol(CharacterNumber: Double, Font: Any, Unicode: Unit, Bias: Any): Unit = js.native
  def InsertSymbol(CharacterNumber: Double, Font: Unit, Unicode: Any): Unit = js.native
  def InsertSymbol(CharacterNumber: Double, Font: Unit, Unicode: Any, Bias: Any): Unit = js.native
  def InsertSymbol(CharacterNumber: Double, Font: Unit, Unicode: Unit, Bias: Any): Unit = js.native
  
  def InsertXML(XML: String): Unit = js.native
  def InsertXML(XML: String, Transform: Any): Unit = js.native
  
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
  
  val ListStyle: Any = js.native
  
  val Locks: CoAuthLocks = js.native
  
  def LookupNameProperties(): Unit = js.native
  
  def ModifyEnclosure(Style: Any): Unit = js.native
  def ModifyEnclosure(Style: Any, Symbol: Any): Unit = js.native
  def ModifyEnclosure(Style: Any, Symbol: Any, EnclosedText: Any): Unit = js.native
  def ModifyEnclosure(Style: Any, Symbol: Unit, EnclosedText: Any): Unit = js.native
  
  def Move(): Double = js.native
  def Move(Unit: Unit, Count: Double): Double = js.native
  def Move(Unit: WdUnits): Double = js.native
  def Move(Unit: WdUnits, Count: Double): Double = js.native
  
  def MoveEnd(): Double = js.native
  def MoveEnd(Unit: Unit, Count: Double): Double = js.native
  def MoveEnd(Unit: WdUnits): Double = js.native
  def MoveEnd(Unit: WdUnits, Count: Double): Double = js.native
  
  def MoveEndUntil(Cset: Any): Double = js.native
  def MoveEndUntil(Cset: Any, Count: Any): Double = js.native
  
  def MoveEndWhile(Cset: Any): Double = js.native
  def MoveEndWhile(Cset: Any, Count: Any): Double = js.native
  
  def MoveStart(): Double = js.native
  def MoveStart(Unit: Unit, Count: Double): Double = js.native
  def MoveStart(Unit: WdUnits): Double = js.native
  def MoveStart(Unit: WdUnits, Count: Double): Double = js.native
  
  def MoveStartUntil(Cset: Any): Double = js.native
  def MoveStartUntil(Cset: Any, Count: Any): Double = js.native
  
  def MoveStartWhile(Cset: Any): Double = js.native
  def MoveStartWhile(Cset: Any, Count: Any): Double = js.native
  
  def MoveUntil(Cset: Any): Double = js.native
  def MoveUntil(Cset: Any, Count: Any): Double = js.native
  
  def MoveWhile(Cset: Any): Double = js.native
  def MoveWhile(Cset: Any, Count: Any): Double = js.native
  
  def Next(): Range = js.native
  def Next(Unit: Any): Range = js.native
  def Next(Unit: Any, Count: Any): Range = js.native
  def Next(Unit: Unit, Count: Any): Range = js.native
  
  val NextStoryRange: Range = js.native
  
  def NextSubdocument(): Unit = js.native
  
  var NoProofing: Double = js.native
  
  val OMaths: typings.activexWord.Word.OMaths = js.native
  
  var Orientation: WdTextOrientation = js.native
  
  var PageSetup: typings.activexWord.Word.PageSetup = js.native
  
  var ParagraphFormat: typings.activexWord.Word.ParagraphFormat = js.native
  
  val ParagraphStyle: Any = js.native
  
  val Paragraphs: typings.activexWord.Word.Paragraphs = js.native
  
  val Parent: Any = js.native
  
  val ParentContentControl: ContentControl = js.native
  
  def Paste(): Unit = js.native
  
  def PasteAndFormat(Type: WdRecoveryType): Unit = js.native
  
  def PasteAppendTable(): Unit = js.native
  
  def PasteAsNestedTable(): Unit = js.native
  
  def PasteExcelTable(LinkedToExcel: Boolean, WordFormatting: Boolean, RTF: Boolean): Unit = js.native
  
  def PasteSpecial(
    IconIndex: js.UndefOr[Any],
    Link: js.UndefOr[Any],
    Placement: js.UndefOr[Any],
    DisplayAsIcon: js.UndefOr[Any],
    DataType: js.UndefOr[Any],
    IconFileName: js.UndefOr[Any],
    IconLabel: js.UndefOr[Any]
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
  def Previous(Unit: Any): Range = js.native
  def Previous(Unit: Any, Count: Any): Range = js.native
  def Previous(Unit: Unit, Count: Any): Range = js.native
  
  val PreviousBookmarkID: Double = js.native
  
  def PreviousSubdocument(): Unit = js.native
  
  val ReadabilityStatistics: typings.activexWord.Word.ReadabilityStatistics = js.native
  
  def Relocate(Direction: Double): Unit = js.native
  
  val Revisions: typings.activexWord.Word.Revisions = js.native
  
  val Rows: typings.activexWord.Word.Rows = js.native
  
  def Scripts(Index: Any): Script = js.native
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
    ExcludeHeader: js.UndefOr[Any],
    FieldNumber: js.UndefOr[Any],
    SortFieldType: js.UndefOr[Any],
    SortOrder: js.UndefOr[Any],
    FieldNumber2: js.UndefOr[Any],
    SortFieldType2: js.UndefOr[Any],
    SortOrder2: js.UndefOr[Any],
    FieldNumber3: js.UndefOr[Any],
    SortFieldType3: js.UndefOr[Any],
    SortOrder3: js.UndefOr[Any],
    SortColumn: js.UndefOr[Any],
    Separator: js.UndefOr[Any],
    CaseSensitive: js.UndefOr[Any],
    BidiSort: js.UndefOr[Any],
    IgnoreThe: js.UndefOr[Any],
    IgnoreKashida: js.UndefOr[Any],
    IgnoreDiacritics: js.UndefOr[Any],
    IgnoreHe: js.UndefOr[Any],
    LanguageID: js.UndefOr[Any]
  ): Unit = js.native
  
  def SortAscending(): Unit = js.native
  
  def SortDescending(): Unit = js.native
  
  def SortOld(
    ExcludeHeader: js.UndefOr[Any],
    FieldNumber: js.UndefOr[Any],
    SortFieldType: js.UndefOr[Any],
    SortOrder: js.UndefOr[Any],
    FieldNumber2: js.UndefOr[Any],
    SortFieldType2: js.UndefOr[Any],
    SortOrder2: js.UndefOr[Any],
    FieldNumber3: js.UndefOr[Any],
    SortFieldType3: js.UndefOr[Any],
    SortOrder3: js.UndefOr[Any],
    SortColumn: js.UndefOr[Any],
    Separator: js.UndefOr[Any],
    CaseSensitive: js.UndefOr[Any],
    LanguageID: js.UndefOr[Any]
  ): Unit = js.native
  
  var SpellingChecked: Boolean = js.native
  
  val SpellingErrors: ProofreadingErrors = js.native
  
  var Start: Double = js.native
  
  def StartOf(): Double = js.native
  def StartOf(Unit: Any): Double = js.native
  def StartOf(Unit: Any, Extend: Any): Double = js.native
  def StartOf(Unit: Unit, Extend: Any): Double = js.native
  
  val StoryLength: Double = js.native
  
  val StoryType: WdStoryType = js.native
  
  var Style: Any = js.native
  
  val Subdocuments: typings.activexWord.Word.Subdocuments = js.native
  
  def SubscribeTo(Edition: String): Unit = js.native
  def SubscribeTo(Edition: String, Format: Any): Unit = js.native
  
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
  
  val TableStyle: Any = js.native
  
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
