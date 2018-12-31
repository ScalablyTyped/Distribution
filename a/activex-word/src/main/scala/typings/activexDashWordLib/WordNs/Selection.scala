package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Selection")
@js.native
class Selection protected () extends js.Object {
  val Active: scala.Boolean = js.native
  val Application: Application = js.native
  val BookmarkID: scala.Double = js.native
  val Bookmarks: Bookmarks = js.native
  var Borders: Borders = js.native
  val Cells: Cells = js.native
  val Characters: Characters = js.native
  val ChildShapeRange: ShapeRange = js.native
  var ColumnSelectMode: scala.Boolean = js.native
  val Columns: Columns = js.native
  val Comments: Comments = js.native
  val ContentControls: ContentControls = js.native
  val Creator: scala.Double = js.native
  val Document: Document = js.native
  val Editors: Editors = js.native
  var End: scala.Double = js.native
  val EndnoteOptions: EndnoteOptions = js.native
  val Endnotes: Endnotes = js.native
  val EnhMetaFileBits: js.Any = js.native
  var ExtendMode: scala.Boolean = js.native
  val Fields: Fields = js.native
  val Find: Find[Selection] = js.native
  var FitTextWidth: scala.Double = js.native
  var Flags: WdSelectionFlags = js.native
  var Font: Font = js.native
  val FootnoteOptions: FootnoteOptions = js.native
  val Footnotes: Footnotes = js.native
  val FormFields: FormFields = js.native
  var FormattedText: Range = js.native
  val Frames: Frames = js.native
  val HTMLDivisions: HTMLDivisions = js.native
  val HasChildShapeRange: scala.Boolean = js.native
  val HeaderFooter: HeaderFooter = js.native
  val Hyperlinks: Hyperlinks = js.native
  val IPAtEndOfLine: scala.Boolean = js.native
  val InlineShapes: InlineShapes = js.native
  val IsEndOfRowMark: scala.Boolean = js.native
  var LanguageDetected: scala.Boolean = js.native
  var LanguageID: WdLanguageID = js.native
  var LanguageIDFarEast: WdLanguageID = js.native
  var LanguageIDOther: WdLanguageID = js.native
  var NoProofing: scala.Double = js.native
  val OMaths: OMaths = js.native
  var Orientation: WdTextOrientation = js.native
  var PageSetup: PageSetup = js.native
  var ParagraphFormat: ParagraphFormat = js.native
  val Paragraphs: Paragraphs = js.native
  val Parent: js.Any = js.native
  val ParentContentControl: ContentControl = js.native
  val PreviousBookmarkID: scala.Double = js.native
  val Range: Range = js.native
  val Rows: Rows = js.native
  val Sections: Sections = js.native
  val Sentences: Sentences = js.native
  val Shading: Shading = js.native
  val ShapeRange: ShapeRange = js.native
  val SmartTags: SmartTags = js.native
  var Start: scala.Double = js.native
  var StartIsActive: scala.Boolean = js.native
  val StoryLength: scala.Double = js.native
  val StoryType: WdStoryType = js.native
  var Style: js.Any = js.native
  val Tables: Tables = js.native
  var Text: java.lang.String = js.native
  val TopLevelTables: Tables = js.native
  val Type: WdSelectionType = js.native
  var `Word.Selection_typekey`: Selection = js.native
  val WordOpenXML: java.lang.String = js.native
  val Words: Words = js.native
  val XMLNodes: XMLNodes = js.native
  val XMLParentNode: XMLNode = js.native
  def BoldRun(): scala.Unit = js.native
  def Calculate(): scala.Double = js.native
  def ClearCharacterAllFormatting(): scala.Unit = js.native
  def ClearCharacterDirectFormatting(): scala.Unit = js.native
  def ClearCharacterStyle(): scala.Unit = js.native
  def ClearFormatting(): scala.Unit = js.native
  def ClearParagraphAllFormatting(): scala.Unit = js.native
  def ClearParagraphDirectFormatting(): scala.Unit = js.native
  def ClearParagraphStyle(): scala.Unit = js.native
  /** @param WdCollapseDirection [Direction=wdCollapseStart] */
  def Collapse(): scala.Unit = js.native
  def Collapse(Direction: WdCollapseDirection): scala.Unit = js.native
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
  def Copy(): scala.Unit = js.native
  def CopyAsPicture(): scala.Unit = js.native
  def CopyFormat(): scala.Unit = js.native
  def CreateAutoTextEntry(Name: java.lang.String, StyleName: java.lang.String): AutoTextEntry = js.native
  def CreateTextbox(): scala.Unit = js.native
  def Cut(): scala.Unit = js.native
  def Delete(): scala.Double = js.native
  def Delete(Unit: WdUnits): scala.Double = js.native
  def Delete(Unit: WdUnits, Count: scala.Double): scala.Double = js.native
  def DetectLanguage(): scala.Unit = js.native
  def EndKey(): scala.Double = js.native
  def EndKey(Unit: js.Any): scala.Double = js.native
  def EndKey(Unit: js.Any, Extend: js.Any): scala.Double = js.native
  def EndOf(): scala.Double = js.native
  def EndOf(Unit: js.Any): scala.Double = js.native
  def EndOf(Unit: js.Any, Extend: js.Any): scala.Double = js.native
  def EscapeKey(): scala.Unit = js.native
  def Expand(): scala.Double = js.native
  def Expand(Unit: js.Any): scala.Double = js.native
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
    OutputFileName: java.lang.String,
    ExportFormat: WdExportFormat,
    OpenAfterExport: js.UndefOr[scala.Boolean],
    OptimizeFor: js.UndefOr[WdExportOptimizeFor],
    ExportCurrentPage: js.UndefOr[scala.Boolean],
    Item: js.UndefOr[WdExportItem],
    IncludeDocProps: js.UndefOr[scala.Boolean],
    KeepIRM: js.UndefOr[scala.Boolean],
    CreateBookmarks: js.UndefOr[WdExportCreateBookmarks],
    DocStructureTags: js.UndefOr[scala.Boolean],
    BitmapMissingFonts: js.UndefOr[scala.Boolean],
    UseISO19005_1: js.UndefOr[scala.Boolean],
    FixedFormatExtClassPtr: js.UndefOr[js.Any]
  ): scala.Unit = js.native
  def Extend(): scala.Unit = js.native
  def Extend(Character: js.Any): scala.Unit = js.native
  def GoTo(): Range = js.native
  def GoTo(What: js.Any): Range = js.native
  def GoTo(What: js.Any, Which: js.Any): Range = js.native
  def GoTo(What: js.Any, Which: js.Any, Count: js.Any): Range = js.native
  def GoTo(What: js.Any, Which: js.Any, Count: js.Any, Name: js.Any): Range = js.native
  def GoToEditableRange(): Range = js.native
  def GoToEditableRange(EditorID: js.Any): Range = js.native
  def GoToNext(What: WdGoToItem): Range = js.native
  def GoToPrevious(What: WdGoToItem): Range = js.native
  def HomeKey(): scala.Double = js.native
  def HomeKey(Unit: js.Any): scala.Double = js.native
  def HomeKey(Unit: js.Any, Extend: js.Any): scala.Double = js.native
  def InRange(Range: Range): scala.Boolean = js.native
  def InStory(Range: Range): scala.Boolean = js.native
  def Information(Type: WdInformation): js.Any = js.native
  def InsertAfter(Text: java.lang.String): scala.Unit = js.native
  def InsertBefore(Text: java.lang.String): scala.Unit = js.native
  def InsertBreak(): scala.Unit = js.native
  def InsertBreak(Type: js.Any): scala.Unit = js.native
  def InsertCaption(Label: js.Any): scala.Unit = js.native
  def InsertCaption(Label: js.Any, Title: js.Any): scala.Unit = js.native
  def InsertCaption(Label: js.Any, Title: js.Any, TitleAutoText: js.Any): scala.Unit = js.native
  def InsertCaption(Label: js.Any, Title: js.Any, TitleAutoText: js.Any, Position: js.Any): scala.Unit = js.native
  def InsertCaption(Label: js.Any, Title: js.Any, TitleAutoText: js.Any, Position: js.Any, ExcludeLabel: js.Any): scala.Unit = js.native
  def InsertCaptionXP(Label: js.Any): scala.Unit = js.native
  def InsertCaptionXP(Label: js.Any, Title: js.Any): scala.Unit = js.native
  def InsertCaptionXP(Label: js.Any, Title: js.Any, TitleAutoText: js.Any): scala.Unit = js.native
  def InsertCaptionXP(Label: js.Any, Title: js.Any, TitleAutoText: js.Any, Position: js.Any): scala.Unit = js.native
  def InsertCells(): scala.Unit = js.native
  def InsertCells(ShiftCells: js.Any): scala.Unit = js.native
  def InsertColumns(): scala.Unit = js.native
  def InsertColumnsRight(): scala.Unit = js.native
  def InsertCrossReference(ReferenceType: js.Any, ReferenceKind: WdReferenceKind, ReferenceItem: js.Any): scala.Unit = js.native
  def InsertCrossReference(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: js.Any
  ): scala.Unit = js.native
  def InsertCrossReference(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: js.Any,
    IncludePosition: js.Any
  ): scala.Unit = js.native
  def InsertCrossReference(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: js.Any,
    IncludePosition: js.Any,
    SeparateNumbers: js.Any
  ): scala.Unit = js.native
  def InsertCrossReference(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: js.Any,
    IncludePosition: js.Any,
    SeparateNumbers: js.Any,
    SeparatorString: js.Any
  ): scala.Unit = js.native
  def InsertCrossReference_2002(ReferenceType: js.Any, ReferenceKind: WdReferenceKind, ReferenceItem: js.Any): scala.Unit = js.native
  def InsertCrossReference_2002(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: js.Any
  ): scala.Unit = js.native
  def InsertCrossReference_2002(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: js.Any,
    IncludePosition: js.Any
  ): scala.Unit = js.native
  def InsertDateTime(): scala.Unit = js.native
  def InsertDateTime(DateTimeFormat: js.Any): scala.Unit = js.native
  def InsertDateTime(DateTimeFormat: js.Any, InsertAsField: js.Any): scala.Unit = js.native
  def InsertDateTime(DateTimeFormat: js.Any, InsertAsField: js.Any, InsertAsFullWidth: js.Any): scala.Unit = js.native
  def InsertDateTime(DateTimeFormat: js.Any, InsertAsField: js.Any, InsertAsFullWidth: js.Any, DateLanguage: js.Any): scala.Unit = js.native
  def InsertDateTime(
    DateTimeFormat: js.Any,
    InsertAsField: js.Any,
    InsertAsFullWidth: js.Any,
    DateLanguage: js.Any,
    CalendarType: js.Any
  ): scala.Unit = js.native
  def InsertDateTimeOld(): scala.Unit = js.native
  def InsertDateTimeOld(DateTimeFormat: js.Any): scala.Unit = js.native
  def InsertDateTimeOld(DateTimeFormat: js.Any, InsertAsField: js.Any): scala.Unit = js.native
  def InsertDateTimeOld(DateTimeFormat: js.Any, InsertAsField: js.Any, InsertAsFullWidth: js.Any): scala.Unit = js.native
  def InsertFile(FileName: java.lang.String): scala.Unit = js.native
  def InsertFile(FileName: java.lang.String, Range: js.Any): scala.Unit = js.native
  def InsertFile(FileName: java.lang.String, Range: js.Any, ConfirmConversions: js.Any): scala.Unit = js.native
  def InsertFile(FileName: java.lang.String, Range: js.Any, ConfirmConversions: js.Any, Link: js.Any): scala.Unit = js.native
  def InsertFile(
    FileName: java.lang.String,
    Range: js.Any,
    ConfirmConversions: js.Any,
    Link: js.Any,
    Attachment: js.Any
  ): scala.Unit = js.native
  def InsertFormula(): scala.Unit = js.native
  def InsertFormula(Formula: js.Any): scala.Unit = js.native
  def InsertFormula(Formula: js.Any, NumberFormat: js.Any): scala.Unit = js.native
  def InsertNewPage(): scala.Unit = js.native
  def InsertParagraph(): scala.Unit = js.native
  def InsertParagraphAfter(): scala.Unit = js.native
  def InsertParagraphBefore(): scala.Unit = js.native
  def InsertRows(): scala.Unit = js.native
  def InsertRows(NumRows: js.Any): scala.Unit = js.native
  def InsertRowsAbove(): scala.Unit = js.native
  def InsertRowsAbove(NumRows: js.Any): scala.Unit = js.native
  def InsertRowsBelow(): scala.Unit = js.native
  def InsertRowsBelow(NumRows: js.Any): scala.Unit = js.native
  def InsertStyleSeparator(): scala.Unit = js.native
  def InsertSymbol(CharacterNumber: scala.Double): scala.Unit = js.native
  def InsertSymbol(CharacterNumber: scala.Double, Font: js.Any): scala.Unit = js.native
  def InsertSymbol(CharacterNumber: scala.Double, Font: js.Any, Unicode: js.Any): scala.Unit = js.native
  def InsertSymbol(CharacterNumber: scala.Double, Font: js.Any, Unicode: js.Any, Bias: js.Any): scala.Unit = js.native
  def InsertXML(XML: java.lang.String): scala.Unit = js.native
  def InsertXML(XML: java.lang.String, Transform: js.Any): scala.Unit = js.native
  def IsEqual(Range: Range): scala.Boolean = js.native
  def ItalicRun(): scala.Unit = js.native
  def LtrPara(): scala.Unit = js.native
  def LtrRun(): scala.Unit = js.native
  def Move(): scala.Double = js.native
  def Move(Unit: WdUnits): scala.Double = js.native
  def Move(Unit: WdUnits, Count: scala.Double): scala.Double = js.native
  def MoveDown(): scala.Double = js.native
  def MoveDown(Unit: WdUnits): scala.Double = js.native
  def MoveDown(Unit: WdUnits, Count: scala.Double): scala.Double = js.native
  def MoveEnd(): scala.Double = js.native
  def MoveEnd(Unit: WdUnits): scala.Double = js.native
  def MoveEnd(Unit: WdUnits, Count: scala.Double): scala.Double = js.native
  def MoveEndUntil(Cset: js.Any): scala.Double = js.native
  def MoveEndUntil(Cset: js.Any, Count: js.Any): scala.Double = js.native
  def MoveEndWhile(Cset: js.Any): scala.Double = js.native
  def MoveEndWhile(Cset: js.Any, Count: js.Any): scala.Double = js.native
  def MoveLeft(): scala.Double = js.native
  def MoveLeft(Unit: WdUnits): scala.Double = js.native
  def MoveLeft(Unit: WdUnits, Count: scala.Double): scala.Double = js.native
  def MoveRight(): scala.Double = js.native
  def MoveRight(Unit: WdUnits): scala.Double = js.native
  def MoveRight(Unit: WdUnits, Count: scala.Double): scala.Double = js.native
  def MoveStart(): scala.Double = js.native
  def MoveStart(Unit: WdUnits): scala.Double = js.native
  def MoveStart(Unit: WdUnits, Count: scala.Double): scala.Double = js.native
  def MoveStartUntil(Cset: js.Any): scala.Double = js.native
  def MoveStartUntil(Cset: js.Any, Count: js.Any): scala.Double = js.native
  def MoveStartWhile(Cset: js.Any): scala.Double = js.native
  def MoveStartWhile(Cset: js.Any, Count: js.Any): scala.Double = js.native
  def MoveUntil(Cset: js.Any): scala.Double = js.native
  def MoveUntil(Cset: js.Any, Count: js.Any): scala.Double = js.native
  def MoveUp(): scala.Double = js.native
  def MoveUp(Unit: WdUnits): scala.Double = js.native
  def MoveUp(Unit: WdUnits, Count: scala.Double): scala.Double = js.native
  def MoveWhile(Cset: js.Any): scala.Double = js.native
  def MoveWhile(Cset: js.Any, Count: js.Any): scala.Double = js.native
  def Next(): Range = js.native
  def Next(Unit: WdUnits): Range = js.native
  def Next(Unit: WdUnits, Count: scala.Double): Range = js.native
  def NextField(): Field = js.native
  def NextRevision(): Revision = js.native
  def NextRevision(Wrap: js.Any): Revision = js.native
  def NextSubdocument(): scala.Unit = js.native
  def Paste(): scala.Unit = js.native
  def PasteAndFormat(Type: WdRecoveryType): scala.Unit = js.native
  def PasteAppendTable(): scala.Unit = js.native
  def PasteAsNestedTable(): scala.Unit = js.native
  def PasteExcelTable(LinkedToExcel: scala.Boolean, WordFormatting: scala.Boolean, RTF: scala.Boolean): scala.Unit = js.native
  def PasteFormat(): scala.Unit = js.native
  def PasteSpecial(
    IconIndex: js.UndefOr[js.Any],
    Link: js.UndefOr[js.Any],
    Placement: js.UndefOr[js.Any],
    DisplayAsIcon: js.UndefOr[js.Any],
    DataType: js.UndefOr[js.Any],
    IconFileName: js.UndefOr[js.Any],
    IconLabel: js.UndefOr[js.Any]
  ): scala.Unit = js.native
  def Previous(): Range = js.native
  def Previous(Unit: js.Any): Range = js.native
  def Previous(Unit: js.Any, Count: js.Any): Range = js.native
  def PreviousField(): Field = js.native
  def PreviousRevision(): Revision = js.native
  def PreviousRevision(Wrap: js.Any): Revision = js.native
  def PreviousSubdocument(): scala.Unit = js.native
  def ReadingModeGrowFont(): scala.Unit = js.native
  def ReadingModeShrinkFont(): scala.Unit = js.native
  def RtlPara(): scala.Unit = js.native
  def RtlRun(): scala.Unit = js.native
  def Select(): scala.Unit = js.native
  def SelectCell(): scala.Unit = js.native
  def SelectColumn(): scala.Unit = js.native
  def SelectCurrentAlignment(): scala.Unit = js.native
  def SelectCurrentColor(): scala.Unit = js.native
  def SelectCurrentFont(): scala.Unit = js.native
  def SelectCurrentIndent(): scala.Unit = js.native
  def SelectCurrentSpacing(): scala.Unit = js.native
  def SelectCurrentTabs(): scala.Unit = js.native
  def SelectRow(): scala.Unit = js.native
  def SetRange(Start: scala.Double, End: scala.Double): scala.Unit = js.native
  def Shrink(): scala.Unit = js.native
  def ShrinkDiscontiguousSelection(): scala.Unit = js.native
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
    LanguageID: js.UndefOr[js.Any],
    SubFieldNumber: js.UndefOr[js.Any],
    SubFieldNumber2: js.UndefOr[js.Any],
    SubFieldNumber3: js.UndefOr[js.Any]
  ): scala.Unit = js.native
  def Sort2000(
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
  ): scala.Unit = js.native
  def SortAscending(): scala.Unit = js.native
  def SortDescending(): scala.Unit = js.native
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
  ): scala.Unit = js.native
  def SplitTable(): scala.Unit = js.native
  def StartOf(): scala.Double = js.native
  def StartOf(Unit: js.Any): scala.Double = js.native
  def StartOf(Unit: js.Any, Extend: js.Any): scala.Double = js.native
  def ToggleCharacterCode(): scala.Unit = js.native
  def TypeBackspace(): scala.Unit = js.native
  def TypeParagraph(): scala.Unit = js.native
  def TypeText(Text: java.lang.String): scala.Unit = js.native
  def WholeStory(): scala.Unit = js.native
  /** @param boolean [DataOnly=false] */
  def XML(): java.lang.String = js.native
  def XML(DataOnly: scala.Boolean): java.lang.String = js.native
}

