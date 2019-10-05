package typings.activexDashExcel.Excel

import typings.activexDashOffice.Office.MsoEnvelope
import typings.activexDashOffice.Office.Script
import typings.activexDashOffice.Office.Scripts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.activexDashExcel.Excel.AddSheetResult because Already inherited */ @JSGlobal("Excel.DialogSheet")
@js.native
class DialogSheet protected () extends Sheet {
  val Application: typings.activexDashExcel.Excel.Application = js.native
  val AutoFilter: typings.activexDashExcel.Excel.AutoFilter = js.native
  val CodeName: String = js.native
  @JSName("Comments")
  val Comments_Original: Comments = js.native
  val Creator: XlCreator = js.native
  @JSName("CustomProperties")
  val CustomProperties_Original: CustomProperties = js.native
  var DefaultButton: js.Any = js.native
  val DialogFrame: typings.activexDashExcel.Excel.DialogFrame = js.native
  var DisplayAutomaticPageBreaks: Boolean = js.native
  var DisplayPageBreaks: Boolean = js.native
  var DisplayRightToLeft: Boolean = js.native
  var EnableAutoFilter: Boolean = js.native
  var EnableCalculation: Boolean = js.native
  var EnableFormatConditionsCalculation: Boolean = js.native
  var EnableOutlining: Boolean = js.native
  var EnablePivotTable: Boolean = js.native
  var EnableSelection: XlEnableSelection = js.native
  var `Excel.DialogSheet_typekey`: DialogSheet = js.native
  var Focus: js.Any = js.native
  @JSName("HPageBreaks")
  val HPageBreaks_Original: HPageBreaks = js.native
  @JSName("Hyperlinks")
  val Hyperlinks_Original: Hyperlinks = js.native
  val Index: Double = js.native
  val MailEnvelope: MsoEnvelope = js.native
  var Name: String = js.native
  @JSName("Names")
  val Names_Original: Names = js.native
  val Next: js.Any = js.native
  var OnDoubleClick: String = js.native
  var OnSheetActivate: String = js.native
  var OnSheetDeactivate: String = js.native
  val PageSetup: typings.activexDashExcel.Excel.PageSetup = js.native
  val Parent: js.Any = js.native
  val Previous: js.Any = js.native
  val PrintedCommentPages: Double = js.native
  val ProtectContents: Boolean = js.native
  val ProtectDrawingObjects: Boolean = js.native
  val ProtectScenarios: Boolean = js.native
  val Protection: typings.activexDashExcel.Excel.Protection = js.native
  val ProtectionMode: Boolean = js.native
  @JSName("QueryTables")
  val QueryTables_Original: QueryTables = js.native
  @JSName("Scripts")
  val Scripts_Original: Scripts = js.native
  var ScrollArea: String = js.native
  @JSName("Shapes")
  val Shapes_Original: Shapes = js.native
  @JSName("SmartTags")
  val SmartTags_Original: SmartTags = js.native
  val Sort: typings.activexDashExcel.Excel.Sort = js.native
  val Tab: typings.activexDashExcel.Excel.Tab = js.native
  @JSName("VPageBreaks")
  val VPageBreaks_Original: VPageBreaks = js.native
  var Visible: XlSheetVisibility = js.native
  var _CodeName: String = js.native
  var _DisplayRightToLeft: Double = js.native
  def Activate(): Unit = js.native
  def Arcs(): js.Any = js.native
  def Arcs(Index: js.Any): js.Any = js.native
  def Buttons(): js.Any = js.native
  def Buttons(Index: js.Any): js.Any = js.native
  def ChartObjects(): js.Any = js.native
  def ChartObjects(Index: js.Any): js.Any = js.native
  def CheckBoxes(): js.Any = js.native
  def CheckBoxes(Index: js.Any): js.Any = js.native
  def CheckSpelling(): Unit = js.native
  def CheckSpelling(CustomDictionary: js.Any): Unit = js.native
  def CheckSpelling(CustomDictionary: js.Any, IgnoreUppercase: js.Any): Unit = js.native
  def CheckSpelling(CustomDictionary: js.Any, IgnoreUppercase: js.Any, AlwaysSuggest: js.Any): Unit = js.native
  def CheckSpelling(CustomDictionary: js.Any, IgnoreUppercase: js.Any, AlwaysSuggest: js.Any, SpellLang: js.Any): Unit = js.native
  def CircleInvalid(): Unit = js.native
  def ClearCircles(): Unit = js.native
  def Comments(Index: Double): Comment = js.native
  def Copy(): Unit = js.native
  def Copy(Before: js.UndefOr[scala.Nothing], After: Sheet): Unit = js.native
  def Copy(Before: Sheet): Unit = js.native
  def CustomProperties(Index: String): CustomProperty = js.native
  def CustomProperties(Index: Double): CustomProperty = js.native
  def Delete(): Unit = js.native
  def DrawingObjects(): js.Any = js.native
  def DrawingObjects(Index: js.Any): js.Any = js.native
  def Drawings(): js.Any = js.native
  def Drawings(Index: js.Any): js.Any = js.native
  def DropDowns(): js.Any = js.native
  def DropDowns(Index: js.Any): js.Any = js.native
  def EditBoxes(): js.Any = js.native
  def EditBoxes(Index: js.Any): js.Any = js.native
  def Evaluate(Name: js.Any): js.Any = js.native
  def ExportAsFixedFormat(
    Type: XlFixedFormatType,
    Filename: js.UndefOr[js.Any],
    Quality: js.UndefOr[js.Any],
    IncludeDocProperties: js.UndefOr[js.Any],
    IgnorePrintAreas: js.UndefOr[js.Any],
    From: js.UndefOr[js.Any],
    To: js.UndefOr[js.Any],
    OpenAfterPublish: js.UndefOr[js.Any],
    FixedFormatExtClassPtr: js.UndefOr[js.Any]
  ): Unit = js.native
  def GroupBoxes(): js.Any = js.native
  def GroupBoxes(Index: js.Any): js.Any = js.native
  def GroupObjects(): js.Any = js.native
  def GroupObjects(Index: js.Any): js.Any = js.native
  def HPageBreaks(Index: Double): HPageBreak = js.native
  def Hide(): Boolean = js.native
  def Hide(Cancel: js.Any): Boolean = js.native
  def Hyperlinks(Index: String): Hyperlink = js.native
  def Hyperlinks(Index: Double): Hyperlink = js.native
  def Labels(): js.Any = js.native
  def Labels(Index: js.Any): js.Any = js.native
  def Lines(): js.Any = js.native
  def Lines(Index: js.Any): js.Any = js.native
  def ListBoxes(): js.Any = js.native
  def ListBoxes(Index: js.Any): js.Any = js.native
  def Move(): Unit = js.native
  def Move(Before: Sheet): Unit = js.native
  def Move(Before: Sheet, After: Sheet): Unit = js.native
  def Names(Index: js.UndefOr[scala.Nothing], IndexLocal: js.UndefOr[scala.Nothing], RefersTo: String): Name = js.native
  def Names(Index: js.UndefOr[scala.Nothing], IndexLocal: String): Name = js.native
  def Names(Index: String): Name = js.native
  def Names(Index: Double): Name = js.native
  def OLEObjects(): js.Any = js.native
  def OLEObjects(Index: js.Any): js.Any = js.native
  def OptionButtons(): js.Any = js.native
  def OptionButtons(Index: js.Any): js.Any = js.native
  def Ovals(): js.Any = js.native
  def Ovals(Index: js.Any): js.Any = js.native
  def Paste(): Unit = js.native
  def Paste(Destination: js.Any): Unit = js.native
  def Paste(Destination: js.Any, Link: js.Any): Unit = js.native
  def PasteSpecial(
    Format: js.UndefOr[js.Any],
    Link: js.UndefOr[js.Any],
    DisplayAsIcon: js.UndefOr[js.Any],
    IconFileName: js.UndefOr[js.Any],
    IconIndex: js.UndefOr[js.Any],
    IconLabel: js.UndefOr[js.Any],
    NoHTMLFormatting: js.UndefOr[js.Any]
  ): Unit = js.native
  def Pictures(): js.Any = js.native
  def Pictures(Index: js.Any): js.Any = js.native
  def PrintOut(
    From: js.UndefOr[Double],
    To: js.UndefOr[Double],
    Copies: js.UndefOr[Double],
    Preview: js.UndefOr[Boolean],
    ActivePrinter: js.UndefOr[String],
    PrintToFile: js.UndefOr[Boolean],
    Collate: js.UndefOr[Boolean],
    PrToFileName: js.UndefOr[PrintToFileName[js.UndefOr[Boolean]]]
  ): js.Any = js.native
  def PrintPreview(): Unit = js.native
  def PrintPreview(EnableChanges: js.Any): Unit = js.native
  def Protect(
    Password: js.UndefOr[js.Any],
    DrawingObjects: js.UndefOr[js.Any],
    Contents: js.UndefOr[js.Any],
    Scenarios: js.UndefOr[js.Any],
    UserInterfaceOnly: js.UndefOr[js.Any],
    AllowFormattingCells: js.UndefOr[js.Any],
    AllowFormattingColumns: js.UndefOr[js.Any],
    AllowFormattingRows: js.UndefOr[js.Any],
    AllowInsertingColumns: js.UndefOr[js.Any],
    AllowInsertingRows: js.UndefOr[js.Any],
    AllowInsertingHyperlinks: js.UndefOr[js.Any],
    AllowDeletingColumns: js.UndefOr[js.Any],
    AllowDeletingRows: js.UndefOr[js.Any],
    AllowSorting: js.UndefOr[js.Any],
    AllowFiltering: js.UndefOr[js.Any],
    AllowUsingPivotTables: js.UndefOr[js.Any]
  ): Unit = js.native
  def QueryTables(Index: String): QueryTable = js.native
  def QueryTables(Index: Double): QueryTable = js.native
  def Rectangles(): js.Any = js.native
  def Rectangles(Index: js.Any): js.Any = js.native
  def ResetAllPageBreaks(): Unit = js.native
  def SaveAs(
    Filename: String,
    FileFormat: js.UndefOr[js.Any],
    Password: js.UndefOr[js.Any],
    WriteResPassword: js.UndefOr[js.Any],
    ReadOnlyRecommended: js.UndefOr[js.Any],
    CreateBackup: js.UndefOr[js.Any],
    AddToMru: js.UndefOr[js.Any],
    TextCodepage: js.UndefOr[js.Any],
    TextVisualLayout: js.UndefOr[js.Any],
    Local: js.UndefOr[js.Any]
  ): Unit = js.native
  def Scripts(Index: js.Any): Script = js.native
  def ScrollBars(): js.Any = js.native
  def ScrollBars(Index: js.Any): js.Any = js.native
  def Select(): Unit = js.native
  def Select(Replace: js.Any): Unit = js.native
  def Shapes(Index: String): Shape = js.native
  def Shapes(Index: Double): Shape = js.native
  def Show(): Boolean = js.native
  def SmartTags(Index: js.Any): SmartTag = js.native
  def Spinners(): js.Any = js.native
  def Spinners(Index: js.Any): js.Any = js.native
  def TextBoxes(): js.Any = js.native
  def TextBoxes(Index: js.Any): js.Any = js.native
  def Unprotect(): Unit = js.native
  def Unprotect(Password: js.Any): Unit = js.native
  def VPageBreaks(Index: Double): VPageBreak = js.native
  def _CheckSpelling(
    CustomDictionary: js.UndefOr[js.Any],
    IgnoreUppercase: js.UndefOr[js.Any],
    AlwaysSuggest: js.UndefOr[js.Any],
    SpellLang: js.UndefOr[js.Any],
    IgnoreFinalYaa: js.UndefOr[js.Any],
    SpellScript: js.UndefOr[js.Any]
  ): Unit = js.native
  def _Evaluate(Name: js.Any): js.Any = js.native
  def _PasteSpecial(
    Format: js.UndefOr[js.Any],
    Link: js.UndefOr[js.Any],
    DisplayAsIcon: js.UndefOr[js.Any],
    IconFileName: js.UndefOr[js.Any],
    IconIndex: js.UndefOr[js.Any],
    IconLabel: js.UndefOr[js.Any]
  ): Unit = js.native
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
  def _Protect(Password: js.Any, DrawingObjects: js.Any): Unit = js.native
  def _Protect(Password: js.Any, DrawingObjects: js.Any, Contents: js.Any): Unit = js.native
  def _Protect(Password: js.Any, DrawingObjects: js.Any, Contents: js.Any, Scenarios: js.Any): Unit = js.native
  def _Protect(
    Password: js.Any,
    DrawingObjects: js.Any,
    Contents: js.Any,
    Scenarios: js.Any,
    UserInterfaceOnly: js.Any
  ): Unit = js.native
  def _SaveAs(
    Filename: String,
    FileFormat: js.UndefOr[js.Any],
    Password: js.UndefOr[js.Any],
    WriteResPassword: js.UndefOr[js.Any],
    ReadOnlyRecommended: js.UndefOr[js.Any],
    CreateBackup: js.UndefOr[js.Any],
    AddToMru: js.UndefOr[js.Any],
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
}

