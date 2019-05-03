package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- activexDashExcelLib.ExcelNs.AddSheetResult because Already inherited */ @JSGlobal("Excel.DialogSheet")
@js.native
class DialogSheet protected () extends Sheet {
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  val AutoFilter: activexDashExcelLib.ExcelNs.AutoFilter = js.native
  val CodeName: java.lang.String = js.native
  @JSName("Comments")
  val Comments_Original: Comments = js.native
  val Creator: XlCreator = js.native
  @JSName("CustomProperties")
  val CustomProperties_Original: CustomProperties = js.native
  var DefaultButton: js.Any = js.native
  val DialogFrame: activexDashExcelLib.ExcelNs.DialogFrame = js.native
  var DisplayAutomaticPageBreaks: scala.Boolean = js.native
  var DisplayPageBreaks: scala.Boolean = js.native
  var DisplayRightToLeft: scala.Boolean = js.native
  var EnableAutoFilter: scala.Boolean = js.native
  var EnableCalculation: scala.Boolean = js.native
  var EnableFormatConditionsCalculation: scala.Boolean = js.native
  var EnableOutlining: scala.Boolean = js.native
  var EnablePivotTable: scala.Boolean = js.native
  var EnableSelection: XlEnableSelection = js.native
  var `Excel.DialogSheet_typekey`: DialogSheet = js.native
  var Focus: js.Any = js.native
  @JSName("HPageBreaks")
  val HPageBreaks_Original: HPageBreaks = js.native
  @JSName("Hyperlinks")
  val Hyperlinks_Original: Hyperlinks = js.native
  val Index: scala.Double = js.native
  val MailEnvelope: activexDashOfficeLib.OfficeNs.MsoEnvelope = js.native
  var Name: java.lang.String = js.native
  @JSName("Names")
  val Names_Original: Names = js.native
  val Next: js.Any = js.native
  var OnDoubleClick: java.lang.String = js.native
  var OnSheetActivate: java.lang.String = js.native
  var OnSheetDeactivate: java.lang.String = js.native
  val PageSetup: activexDashExcelLib.ExcelNs.PageSetup = js.native
  val Parent: js.Any = js.native
  val Previous: js.Any = js.native
  val PrintedCommentPages: scala.Double = js.native
  val ProtectContents: scala.Boolean = js.native
  val ProtectDrawingObjects: scala.Boolean = js.native
  val ProtectScenarios: scala.Boolean = js.native
  val Protection: activexDashExcelLib.ExcelNs.Protection = js.native
  val ProtectionMode: scala.Boolean = js.native
  @JSName("QueryTables")
  val QueryTables_Original: QueryTables = js.native
  @JSName("Scripts")
  val Scripts_Original: activexDashOfficeLib.OfficeNs.Scripts = js.native
  var ScrollArea: java.lang.String = js.native
  @JSName("Shapes")
  val Shapes_Original: Shapes = js.native
  @JSName("SmartTags")
  val SmartTags_Original: SmartTags = js.native
  val Sort: activexDashExcelLib.ExcelNs.Sort = js.native
  val Tab: activexDashExcelLib.ExcelNs.Tab = js.native
  @JSName("VPageBreaks")
  val VPageBreaks_Original: VPageBreaks = js.native
  var Visible: XlSheetVisibility = js.native
  var _CodeName: java.lang.String = js.native
  var _DisplayRightToLeft: scala.Double = js.native
  def Activate(): scala.Unit = js.native
  def Arcs(): js.Any = js.native
  def Arcs(Index: js.Any): js.Any = js.native
  def Buttons(): js.Any = js.native
  def Buttons(Index: js.Any): js.Any = js.native
  def ChartObjects(): js.Any = js.native
  def ChartObjects(Index: js.Any): js.Any = js.native
  def CheckBoxes(): js.Any = js.native
  def CheckBoxes(Index: js.Any): js.Any = js.native
  def CheckSpelling(): scala.Unit = js.native
  def CheckSpelling(CustomDictionary: js.Any): scala.Unit = js.native
  def CheckSpelling(CustomDictionary: js.Any, IgnoreUppercase: js.Any): scala.Unit = js.native
  def CheckSpelling(CustomDictionary: js.Any, IgnoreUppercase: js.Any, AlwaysSuggest: js.Any): scala.Unit = js.native
  def CheckSpelling(CustomDictionary: js.Any, IgnoreUppercase: js.Any, AlwaysSuggest: js.Any, SpellLang: js.Any): scala.Unit = js.native
  def CircleInvalid(): scala.Unit = js.native
  def ClearCircles(): scala.Unit = js.native
  def Comments(Index: scala.Double): Comment = js.native
  def Copy(): scala.Unit = js.native
  def Copy(Before: Sheet): scala.Unit = js.native
  def Copy(Before: js.UndefOr[scala.Nothing], After: Sheet): scala.Unit = js.native
  def CustomProperties(Index: java.lang.String): CustomProperty = js.native
  def CustomProperties(Index: scala.Double): CustomProperty = js.native
  def Delete(): scala.Unit = js.native
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
  ): scala.Unit = js.native
  def GroupBoxes(): js.Any = js.native
  def GroupBoxes(Index: js.Any): js.Any = js.native
  def GroupObjects(): js.Any = js.native
  def GroupObjects(Index: js.Any): js.Any = js.native
  def HPageBreaks(Index: scala.Double): HPageBreak = js.native
  def Hide(): scala.Boolean = js.native
  def Hide(Cancel: js.Any): scala.Boolean = js.native
  def Hyperlinks(Index: java.lang.String): Hyperlink = js.native
  def Hyperlinks(Index: scala.Double): Hyperlink = js.native
  def Labels(): js.Any = js.native
  def Labels(Index: js.Any): js.Any = js.native
  def Lines(): js.Any = js.native
  def Lines(Index: js.Any): js.Any = js.native
  def ListBoxes(): js.Any = js.native
  def ListBoxes(Index: js.Any): js.Any = js.native
  def Move(): scala.Unit = js.native
  def Move(Before: Sheet): scala.Unit = js.native
  def Move(Before: Sheet, After: Sheet): scala.Unit = js.native
  def Names(Index: java.lang.String): Name = js.native
  def Names(Index: js.UndefOr[scala.Nothing], IndexLocal: java.lang.String): Name = js.native
  def Names(
    Index: js.UndefOr[scala.Nothing],
    IndexLocal: js.UndefOr[scala.Nothing],
    RefersTo: java.lang.String
  ): Name = js.native
  def Names(Index: scala.Double): Name = js.native
  def OLEObjects(): js.Any = js.native
  def OLEObjects(Index: js.Any): js.Any = js.native
  def OptionButtons(): js.Any = js.native
  def OptionButtons(Index: js.Any): js.Any = js.native
  def Ovals(): js.Any = js.native
  def Ovals(Index: js.Any): js.Any = js.native
  def Paste(): scala.Unit = js.native
  def Paste(Destination: js.Any): scala.Unit = js.native
  def Paste(Destination: js.Any, Link: js.Any): scala.Unit = js.native
  def PasteSpecial(
    Format: js.UndefOr[js.Any],
    Link: js.UndefOr[js.Any],
    DisplayAsIcon: js.UndefOr[js.Any],
    IconFileName: js.UndefOr[js.Any],
    IconIndex: js.UndefOr[js.Any],
    IconLabel: js.UndefOr[js.Any],
    NoHTMLFormatting: js.UndefOr[js.Any]
  ): scala.Unit = js.native
  def Pictures(): js.Any = js.native
  def Pictures(Index: js.Any): js.Any = js.native
  def PrintOut(
    From: js.UndefOr[scala.Double],
    To: js.UndefOr[scala.Double],
    Copies: js.UndefOr[scala.Double],
    Preview: js.UndefOr[scala.Boolean],
    ActivePrinter: js.UndefOr[java.lang.String],
    PrintToFile: js.UndefOr[scala.Boolean | js.UndefOr[scala.Nothing]],
    Collate: js.UndefOr[scala.Boolean],
    PrToFileName: js.UndefOr[PrintToFileName[scala.Boolean | js.UndefOr[scala.Nothing]]]
  ): js.Any = js.native
  def PrintPreview(): scala.Unit = js.native
  def PrintPreview(EnableChanges: js.Any): scala.Unit = js.native
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
  ): scala.Unit = js.native
  def QueryTables(Index: java.lang.String): QueryTable = js.native
  def QueryTables(Index: scala.Double): QueryTable = js.native
  def Rectangles(): js.Any = js.native
  def Rectangles(Index: js.Any): js.Any = js.native
  def ResetAllPageBreaks(): scala.Unit = js.native
  def SaveAs(
    Filename: java.lang.String,
    FileFormat: js.UndefOr[js.Any],
    Password: js.UndefOr[js.Any],
    WriteResPassword: js.UndefOr[js.Any],
    ReadOnlyRecommended: js.UndefOr[js.Any],
    CreateBackup: js.UndefOr[js.Any],
    AddToMru: js.UndefOr[js.Any],
    TextCodepage: js.UndefOr[js.Any],
    TextVisualLayout: js.UndefOr[js.Any],
    Local: js.UndefOr[js.Any]
  ): scala.Unit = js.native
  def Scripts(Index: js.Any): activexDashOfficeLib.OfficeNs.Script = js.native
  def ScrollBars(): js.Any = js.native
  def ScrollBars(Index: js.Any): js.Any = js.native
  def Select(): scala.Unit = js.native
  def Select(Replace: js.Any): scala.Unit = js.native
  def Shapes(Index: java.lang.String): Shape = js.native
  def Shapes(Index: scala.Double): Shape = js.native
  def Show(): scala.Boolean = js.native
  def SmartTags(Index: js.Any): SmartTag = js.native
  def Spinners(): js.Any = js.native
  def Spinners(Index: js.Any): js.Any = js.native
  def TextBoxes(): js.Any = js.native
  def TextBoxes(Index: js.Any): js.Any = js.native
  def Unprotect(): scala.Unit = js.native
  def Unprotect(Password: js.Any): scala.Unit = js.native
  def VPageBreaks(Index: scala.Double): VPageBreak = js.native
  def _CheckSpelling(
    CustomDictionary: js.UndefOr[js.Any],
    IgnoreUppercase: js.UndefOr[js.Any],
    AlwaysSuggest: js.UndefOr[js.Any],
    SpellLang: js.UndefOr[js.Any],
    IgnoreFinalYaa: js.UndefOr[js.Any],
    SpellScript: js.UndefOr[js.Any]
  ): scala.Unit = js.native
  def _Evaluate(Name: js.Any): js.Any = js.native
  def _PasteSpecial(
    Format: js.UndefOr[js.Any],
    Link: js.UndefOr[js.Any],
    DisplayAsIcon: js.UndefOr[js.Any],
    IconFileName: js.UndefOr[js.Any],
    IconIndex: js.UndefOr[js.Any],
    IconLabel: js.UndefOr[js.Any]
  ): scala.Unit = js.native
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
  def _Protect(Password: js.Any, DrawingObjects: js.Any): scala.Unit = js.native
  def _Protect(Password: js.Any, DrawingObjects: js.Any, Contents: js.Any): scala.Unit = js.native
  def _Protect(Password: js.Any, DrawingObjects: js.Any, Contents: js.Any, Scenarios: js.Any): scala.Unit = js.native
  def _Protect(
    Password: js.Any,
    DrawingObjects: js.Any,
    Contents: js.Any,
    Scenarios: js.Any,
    UserInterfaceOnly: js.Any
  ): scala.Unit = js.native
  def _SaveAs(
    Filename: java.lang.String,
    FileFormat: js.UndefOr[js.Any],
    Password: js.UndefOr[js.Any],
    WriteResPassword: js.UndefOr[js.Any],
    ReadOnlyRecommended: js.UndefOr[js.Any],
    CreateBackup: js.UndefOr[js.Any],
    AddToMru: js.UndefOr[js.Any],
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
}

